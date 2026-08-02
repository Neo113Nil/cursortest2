package p2;

import android.content.Context;
import androidx.work.ListenableWorker;
import j1.AbstractC2017a;
import q2.C2307j;

/* renamed from: p2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2255m implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    public static final String f18717q = f2.m.f("WorkForegroundRunnable");

    /* renamed from: k, reason: collision with root package name */
    public final C2307j f18718k = new C2307j();

    /* renamed from: l, reason: collision with root package name */
    public final Context f18719l;

    /* renamed from: m, reason: collision with root package name */
    public final o2.i f18720m;

    /* renamed from: n, reason: collision with root package name */
    public final ListenableWorker f18721n;

    /* renamed from: o, reason: collision with root package name */
    public final C2256n f18722o;

    /* renamed from: p, reason: collision with root package name */
    public final v3.e f18723p;

    public RunnableC2255m(Context context, o2.i iVar, ListenableWorker listenableWorker, C2256n c2256n, v3.e eVar) {
        this.f18719l = context;
        this.f18720m = iVar;
        this.f18721n = listenableWorker;
        this.f18722o = c2256n;
        this.f18723p = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f18720m.f18647q || AbstractC2017a.a()) {
            this.f18718k.j(null);
            return;
        }
        C2307j c2307j = new C2307j();
        v3.e eVar = this.f18723p;
        ((D3.n) eVar.f20434n).execute(new RunnableC2254l(this, c2307j, 0));
        c2307j.a(new RunnableC2254l(this, c2307j, 1), (D3.n) eVar.f20434n);
    }
}
