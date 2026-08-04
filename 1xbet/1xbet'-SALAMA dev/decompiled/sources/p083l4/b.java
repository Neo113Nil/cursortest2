package p083l4;

import B1.c;
import Y4.D;
import android.support.v4.media.session.t;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.sentry.TransactionOptions;
import java.util.concurrent.TimeUnit;
import p028d6.k;
import p033e3.h;
import p096n1.e;
import p098n4.AbstractC0930c;
import p098n4.C0940m;
import p098n4.G;
import p158w4.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f14933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14935c;

    public /* synthetic */ b(s sVar, boolean z4, boolean z7) {
        this.f14933a = sVar;
        this.f14934b = z4;
        this.f14935c = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final s sVar = this.f14933a;
        m mVar = sVar.f14997h;
        D.v("Not in disconnected state: %s", mVar == m.f14959a, mVar);
        sVar.f14997h = m.f14960b;
        final long j = sVar.f14984B + 1;
        sVar.f14984B = j;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        t tVar = sVar.f15013y;
        tVar.W(null, "Trying to fetch auth token", new Object[0]);
        h hVar = new h(taskCompletionSource);
        c cVar = sVar.f15010v;
        ((G) cVar.f978b).c(this.f14934b, new k(9, (L4.b) cVar.f979c, hVar));
        final Task task = taskCompletionSource.getTask();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        tVar.W(null, "Trying to fetch app check token", new Object[0]);
        e eVar = new e(taskCompletionSource2, 16);
        c cVar2 = sVar.f15011w;
        ((G) cVar2.f978b).c(this.f14935c, new k(9, (L4.b) cVar2.f979c, eVar));
        final Task task2 = taskCompletionSource2.getTask();
        Task<Void> taskWhenAll = Tasks.whenAll((Task<?>[]) new Task[]{task, task2});
        OnSuccessListener<? super Void> onSuccessListener = new OnSuccessListener() { // from class: l4.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s sVar2 = sVar;
                long j3 = sVar2.f14984B;
                long j7 = j;
                t tVar2 = sVar2.f15013y;
                if (j7 != j3) {
                    tVar2.W(null, "Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                    return;
                }
                m mVar2 = sVar2.f14997h;
                m mVar3 = m.f14960b;
                if (mVar2 != mVar3) {
                    if (mVar2 == m.f14959a) {
                        tVar2.W(null, "Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                        return;
                    }
                    return;
                }
                tVar2.W(null, "Successfully fetched token, opening connection", new Object[0]);
                String str = (String) task.getResult();
                String str2 = (String) task2.getResult();
                m mVar4 = sVar2.f14997h;
                D.v("Trying to open network connection while in the wrong state: %s", mVar4 == mVar3, mVar4);
                if (str == null) {
                    C0940m c0940m = sVar2.f14990a;
                    c0940m.getClass();
                    c0940m.t(AbstractC0930c.f15401c, Boolean.FALSE);
                }
                sVar2.f15005q = str;
                sVar2.f15007s = str2;
                sVar2.f14997h = m.f14961c;
                O1.k kVar = new O1.k(sVar2.f15009u, sVar2.f14991b, sVar2.f14992c, sVar2, sVar2.f14983A, str2);
                sVar2.f14996g = kVar;
                t tVar3 = (t) kVar.f4974e;
                if (tVar3.r0()) {
                    tVar3.W(null, "Opening a connection", new Object[0]);
                }
                y yVar = (y) kVar.f4972c;
                w wVar = yVar.f15026a;
                p158w4.c cVar3 = (p158w4.c) wVar.f11335b;
                try {
                    cVar3.c();
                } catch (p158w4.d e7) {
                    y yVar2 = (y) wVar.f11336c;
                    boolean zR0 = yVar2.j.r0();
                    t tVar4 = yVar2.j;
                    if (zR0) {
                        tVar4.W(e7, "Error connecting", new Object[0]);
                    }
                    cVar3.a();
                    try {
                        f fVar = cVar3.f18064g;
                        if (fVar.f18080g.getState() != Thread.State.NEW) {
                            fVar.f18080g.join();
                        }
                        cVar3.f18067k.join();
                    } catch (InterruptedException e8) {
                        tVar4.a0("Interrupted while shutting down websocket threads", e8);
                    }
                }
                yVar.f15033h = yVar.f15034i.schedule(new v(yVar, 0), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
            }
        };
        L4.b bVar = sVar.f15012x;
        taskWhenAll.addOnSuccessListener(bVar, onSuccessListener).addOnFailureListener(bVar, new OnFailureListener() { // from class: l4.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                s sVar2 = sVar;
                long j3 = sVar2.f14984B;
                long j7 = j;
                t tVar2 = sVar2.f15013y;
                if (j7 != j3) {
                    tVar2.W(null, "Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                    return;
                }
                sVar2.f14997h = m.f14959a;
                tVar2.W(null, "Error fetching token: " + exc, new Object[0]);
                sVar2.q();
            }
        });
    }
}
