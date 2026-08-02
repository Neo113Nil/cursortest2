package b4;

import Y3.i;
import Y3.j;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d4.InterfaceC0964a;
import d4.InterfaceC0965b;
import e6.C1054c;
import g4.C1140m;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0784d implements InterfaceC0965b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10133a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10134b;

    /* renamed from: c, reason: collision with root package name */
    public final C0785e f10135c;

    /* renamed from: d, reason: collision with root package name */
    public final C0787g f10136d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10137e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f10138f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f10139g;

    /* renamed from: h, reason: collision with root package name */
    public final Task f10140h;

    /* renamed from: i, reason: collision with root package name */
    public final C1054c f10141i;
    public C0781a j;

    public C0784d(i iVar, N4.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        D.i(iVar);
        D.i(bVar);
        this.f10133a = new ArrayList();
        this.f10134b = new ArrayList();
        iVar.b();
        String g3 = iVar.g();
        C0785e c0785e = new C0785e();
        Context context = iVar.f7663a;
        D.i(context);
        D.e(g3);
        c0785e.f10143a = new C1140m(new M4.b(context, 1, "com.google.firebase.appcheck.store." + g3));
        this.f10135c = c0785e;
        iVar.b();
        this.f10136d = new C0787g(context, this, executor2, scheduledExecutorService);
        this.f10137e = executor;
        this.f10138f = executor2;
        this.f10139g = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new K5.a(7, this, taskCompletionSource));
        this.f10140h = taskCompletionSource.getTask();
        this.f10141i = new C1054c(15);
    }

    public final void a(InterfaceC0964a interfaceC0964a) {
        ArrayList arrayList = this.f10133a;
        arrayList.add(interfaceC0964a);
        int size = this.f10134b.size() + arrayList.size();
        C0787g c0787g = this.f10136d;
        if (c0787g.f10147b == 0 && size > 0) {
            c0787g.f10147b = size;
        } else if (c0787g.f10147b > 0 && size == 0) {
            c0787g.f10146a.getClass();
        }
        c0787g.f10147b = size;
        C0781a c0781a = this.j;
        if (c0781a != null) {
            long j = c0781a.f10127b + c0781a.f10128c;
            this.f10141i.getClass();
            if (j - System.currentTimeMillis() > 300000) {
                C0781a c0781a2 = this.j;
                D.i(c0781a2);
                interfaceC0964a.e(new C0782b(c0781a2.f10126a, null));
            }
        }
    }

    public final Task b(final boolean z4) {
        return this.f10140h.continueWithTask(this.f10138f, new Continuation() { // from class: b4.c
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                boolean z7 = z4;
                C0784d c0784d = C0784d.this;
                if (z7) {
                    c0784d.getClass();
                } else {
                    C0781a c0781a = c0784d.j;
                    if (c0781a != null) {
                        long j = c0781a.f10127b + c0781a.f10128c;
                        c0784d.f10141i.getClass();
                        if (j - System.currentTimeMillis() > 300000) {
                            C0781a c0781a2 = c0784d.j;
                            D.i(c0781a2);
                            return Tasks.forResult(new C0782b(c0781a2.f10126a, null));
                        }
                    }
                }
                return Tasks.forResult(new C0782b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new j("No AppCheckProvider installed.")));
            }
        });
    }
}
