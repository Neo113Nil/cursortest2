package l4;

import Y4.D;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d6.C0977k;
import e3.C1023h;
import io.sentry.TransactionOptions;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import n1.C1450e;
import n4.AbstractC1469c;
import n4.C1479m;
import n4.G;
import w4.C1777c;
import w4.C1778d;
import w4.C1780f;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1391b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f14927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14929c;

    public /* synthetic */ RunnableC1391b(s sVar, boolean z4, boolean z7) {
        this.f14927a = sVar;
        this.f14928b = z4;
        this.f14929c = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final s sVar = this.f14927a;
        EnumC1402m enumC1402m = sVar.f14991h;
        D.v("Not in disconnected state: %s", enumC1402m == EnumC1402m.f14953a, enumC1402m);
        sVar.f14991h = EnumC1402m.f14954b;
        final long j = sVar.f14978B + 1;
        sVar.f14978B = j;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        android.support.v4.media.session.t tVar = sVar.f15007y;
        tVar.W(null, "Trying to fetch auth token", new Object[0]);
        C1023h c1023h = new C1023h(taskCompletionSource);
        B1.c cVar = sVar.f15004v;
        ((G) cVar.f978b).c(this.f14928b, new C0977k(9, (L4.b) cVar.f979c, c1023h));
        final Task task = taskCompletionSource.getTask();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        tVar.W(null, "Trying to fetch app check token", new Object[0]);
        C1450e c1450e = new C1450e(taskCompletionSource2, 16);
        B1.c cVar2 = sVar.f15005w;
        ((G) cVar2.f978b).c(this.f14929c, new C0977k(9, (L4.b) cVar2.f979c, c1450e));
        final Task task2 = taskCompletionSource2.getTask();
        Task<Void> whenAll = Tasks.whenAll((Task<?>[]) new Task[]{task, task2});
        OnSuccessListener<? super Void> onSuccessListener = new OnSuccessListener() { // from class: l4.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s sVar2 = s.this;
                long j3 = sVar2.f14978B;
                long j7 = j;
                android.support.v4.media.session.t tVar2 = sVar2.f15007y;
                if (j7 != j3) {
                    tVar2.W(null, "Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                    return;
                }
                EnumC1402m enumC1402m2 = sVar2.f14991h;
                EnumC1402m enumC1402m3 = EnumC1402m.f14954b;
                if (enumC1402m2 != enumC1402m3) {
                    if (enumC1402m2 == EnumC1402m.f14953a) {
                        tVar2.W(null, "Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                        return;
                    }
                    return;
                }
                tVar2.W(null, "Successfully fetched token, opening connection", new Object[0]);
                String str = (String) task.getResult();
                String str2 = (String) task2.getResult();
                EnumC1402m enumC1402m4 = sVar2.f14991h;
                D.v("Trying to open network connection while in the wrong state: %s", enumC1402m4 == enumC1402m3, enumC1402m4);
                if (str == null) {
                    C1479m c1479m = sVar2.f14984a;
                    c1479m.getClass();
                    c1479m.t(AbstractC1469c.f15395c, Boolean.FALSE);
                }
                sVar2.f14999q = str;
                sVar2.f15001s = str2;
                sVar2.f14991h = EnumC1402m.f14955c;
                O1.k kVar = new O1.k(sVar2.f15003u, sVar2.f14985b, sVar2.f14986c, sVar2, sVar2.f14977A, str2);
                sVar2.f14990g = kVar;
                android.support.v4.media.session.t tVar3 = (android.support.v4.media.session.t) kVar.f4974e;
                if (tVar3.r0()) {
                    tVar3.W(null, "Opening a connection", new Object[0]);
                }
                y yVar = (y) kVar.f4972c;
                com.google.android.gms.common.internal.w wVar = yVar.f15020a;
                C1777c c1777c = (C1777c) wVar.f11335b;
                try {
                    c1777c.c();
                } catch (C1778d e7) {
                    y yVar2 = (y) wVar.f11336c;
                    boolean r02 = yVar2.j.r0();
                    android.support.v4.media.session.t tVar4 = yVar2.j;
                    if (r02) {
                        tVar4.W(e7, "Error connecting", new Object[0]);
                    }
                    c1777c.a();
                    try {
                        C1780f c1780f = c1777c.f18058g;
                        if (c1780f.f18074g.getState() != Thread.State.NEW) {
                            c1780f.f18074g.join();
                        }
                        c1777c.f18061k.join();
                    } catch (InterruptedException e8) {
                        tVar4.a0("Interrupted while shutting down websocket threads", e8);
                    }
                }
                yVar.f15027h = yVar.f15028i.schedule(new v(yVar, 0), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
            }
        };
        L4.b bVar = sVar.f15006x;
        whenAll.addOnSuccessListener(bVar, onSuccessListener).addOnFailureListener(bVar, new OnFailureListener() { // from class: l4.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                s sVar2 = s.this;
                long j3 = sVar2.f14978B;
                long j7 = j;
                android.support.v4.media.session.t tVar2 = sVar2.f15007y;
                if (j7 != j3) {
                    tVar2.W(null, "Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                    return;
                }
                sVar2.f14991h = EnumC1402m.f14953a;
                tVar2.W(null, "Error fetching token: " + exc, new Object[0]);
                sVar2.q();
            }
        });
    }
}
