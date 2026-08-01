package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4598q3 {

    /* renamed from: com.ironsource.q3$a */
    class a implements WorkerManager.WorkEndedListener<C4615r3> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f8488a;

        a(b bVar) {
            this.f8488a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<C4615r3>> list, long j) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<C4615r3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((C4615r3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC4544n3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC4544n3 callableC4544n3 = (CallableC4544n3) failed.callable;
                    arrayList2.add(new C4615r3(callableC4544n3.d(), callableC4544n3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            C4598q3.this.a(arrayList2, arrayList, j);
            this.f8488a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f8488a.onFailure(str2);
        }
    }

    /* renamed from: com.ironsource.q3$b */
    public interface b {
        void a(List<C4615r3> list, long j, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<CallableC4544n3> list, b bVar, long j, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC4544n3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new a(bVar), j, timeUnit);
        } catch (Throwable th) {
            C4491k4.d().a(th);
            String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<C4615r3> list, List<String> list2, long j) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (C4615r3 c4615r3 : list) {
            if (c4615r3.a() != null) {
                IronLog.INTERNAL.verbose(c4615r3.c() + " - success (" + c4615r3.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(c4615r3.c() + " - failed (" + c4615r3.e() + " millis) error: " + c4615r3.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            IronLog.INTERNAL.verbose(it.next() + " reached timeout");
        }
    }
}
