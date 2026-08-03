package com.ironsource;

/* renamed from: com.ironsource.t3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3286t3 {

    /* renamed from: com.ironsource.t3$a */
    class a implements com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener<com.ironsource.C3304u3> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3286t3.b f6730a;

        a(com.ironsource.C3286t3.b bVar) {
            this.f6730a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(java.util.List<com.ironsource.environment.workerthread.WorkerResult<com.ironsource.C3304u3>> list, long j) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.ironsource.environment.workerthread.WorkerResult<com.ironsource.C3304u3> workerResult : list) {
                if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Completed) {
                    arrayList2.add((com.ironsource.C3304u3) ((com.ironsource.environment.workerthread.WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Canceled) {
                    arrayList.add(((com.ironsource.CallableC3233q3) ((com.ironsource.environment.workerthread.WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof com.ironsource.environment.workerthread.WorkerResult.Failed) {
                    com.ironsource.environment.workerthread.WorkerResult.Failed failed = (com.ironsource.environment.workerthread.WorkerResult.Failed) workerResult;
                    com.ironsource.CallableC3233q3 callableC3233q3 = (com.ironsource.CallableC3233q3) failed.callable;
                    arrayList2.add(new com.ironsource.C3304u3(callableC3233q3.d(), callableC3233q3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            com.ironsource.C3286t3.this.a(arrayList2, arrayList, j);
            this.f6730a.a(arrayList2, j, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(java.lang.String str) {
            java.lang.String str2 = "failed to collect bidding data, error= " + str;
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(str2);
            this.f6730a.onFailure(str2);
        }
    }

    /* renamed from: com.ironsource.t3$b */
    public interface b {
        void a(java.util.List<com.ironsource.C3304u3> list, long j, java.util.List<java.lang.String> list2);

        void onFailure(java.lang.String str);
    }

    public void a(java.util.List<com.ironsource.CallableC3233q3> list, com.ironsource.C3286t3.b bVar, long j, java.util.concurrent.TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            com.ironsource.environment.workerthread.WorkerManager workerManager = new com.ironsource.environment.workerthread.WorkerManager(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            java.util.Iterator<com.ironsource.CallableC3233q3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j + " millis");
            workerManager.startWork(new com.ironsource.C3286t3.a(bVar), j, timeUnit);
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            java.lang.String str = "Exception - failed to collect bidding data, error= " + th.getMessage();
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.List<com.ironsource.C3304u3> list, java.util.List<java.lang.String> list2, long j) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j + " millis");
        for (com.ironsource.C3304u3 c3304u3 : list) {
            if (c3304u3.a() != null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(c3304u3.c() + " - success (" + c3304u3.e() + " millis)");
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(c3304u3.c() + " - failed (" + c3304u3.e() + " millis) error: " + c3304u3.b());
            }
        }
        for (java.lang.String str : list2) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
