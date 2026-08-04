package p014b4;

import K5.a;
import Y3.i;
import Y3.j;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p026d4.b;
import p036e6.c;
import p048g4.m;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f10135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f10136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f10137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f10138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f10139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Task f10140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f10141i;
    public a j;

    public d(i iVar, N4.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        D.i(iVar);
        D.i(bVar);
        this.f10133a = new ArrayList();
        this.f10134b = new ArrayList();
        iVar.b();
        String strG = iVar.g();
        e eVar = new e();
        Context context = iVar.f7663a;
        D.i(context);
        D.e(strG);
        eVar.f10143a = new m(new M4.b(context, 1, "com.google.firebase.appcheck.store." + strG));
        this.f10135c = eVar;
        iVar.b();
        this.f10136d = new g(context, this, executor2, scheduledExecutorService);
        this.f10137e = executor;
        this.f10138f = executor2;
        this.f10139g = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new a(7, this, taskCompletionSource));
        this.f10140h = taskCompletionSource.getTask();
        this.f10141i = new c(15);
    }

    public final void a(p026d4.a aVar) {
        ArrayList arrayList = this.f10133a;
        arrayList.add(aVar);
        int size = this.f10134b.size() + arrayList.size();
        g gVar = this.f10136d;
        if (gVar.f10147b == 0 && size > 0) {
            gVar.f10147b = size;
        } else if (gVar.f10147b > 0 && size == 0) {
            gVar.f10146a.getClass();
        }
        gVar.f10147b = size;
        a aVar2 = this.j;
        if (aVar2 != null) {
            long j = aVar2.f10127b + aVar2.f10128c;
            this.f10141i.getClass();
            if (j - System.currentTimeMillis() > 300000) {
                a aVar3 = this.j;
                D.i(aVar3);
                aVar.e(new b(aVar3.f10126a, null));
            }
        }
    }

    public final Task b(final boolean z4) {
        return this.f10140h.continueWithTask(this.f10138f, new Continuation() { // from class: b4.c
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                boolean z7 = z4;
                d dVar = this.f10131a;
                if (z7) {
                    dVar.getClass();
                } else {
                    a aVar = dVar.j;
                    if (aVar != null) {
                        long j = aVar.f10127b + aVar.f10128c;
                        dVar.f10141i.getClass();
                        if (j - System.currentTimeMillis() > 300000) {
                            a aVar2 = dVar.j;
                            D.i(aVar2);
                            return Tasks.forResult(new b(aVar2.f10126a, null));
                        }
                    }
                }
                return Tasks.forResult(new b("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new j("No AppCheckProvider installed.")));
            }
        });
    }
}
