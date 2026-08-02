package E4;

import A1.C0043s0;
import A1.RunnableC0032m0;
import C1.RunnableC0108n;
import F2.C0247p;
import G4.C0272e;
import G4.C0279l;
import G4.RunnableC0275h;
import G4.X;
import android.content.Context;
import b4.C0784d;
import b4.C0787g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import e3.C1023h;
import f4.InterfaceC1090b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import w1.C1726n0;
import w1.F0;
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final D3.j f2229a;

    /* renamed from: b, reason: collision with root package name */
    public final C4.d f2230b;

    /* renamed from: c, reason: collision with root package name */
    public final C4.b f2231c;

    /* renamed from: d, reason: collision with root package name */
    public final L4.f f2232d;

    /* renamed from: e, reason: collision with root package name */
    public final V0 f2233e;

    /* renamed from: f, reason: collision with root package name */
    public P6.b f2234f;

    /* renamed from: g, reason: collision with root package name */
    public C0279l f2235g;

    /* renamed from: h, reason: collision with root package name */
    public C0043s0 f2236h;

    /* renamed from: i, reason: collision with root package name */
    public H f2237i;
    public v2.n j;

    /* renamed from: k, reason: collision with root package name */
    public C1726n0 f2238k;

    /* renamed from: l, reason: collision with root package name */
    public X f2239l;

    public t(Context context, D3.j jVar, C4.d dVar, C4.b bVar, L4.f fVar, K4.k kVar, z zVar) {
        this.f2229a = jVar;
        this.f2230b = dVar;
        this.f2231c = bVar;
        this.f2232d = fVar;
        this.f2233e = new V0(new P2((H4.f) jVar.f1725d));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fVar.a(new p(this, taskCompletionSource, context, zVar, kVar, 0));
        s sVar = new s(this, atomicBoolean, taskCompletionSource, fVar);
        synchronized (dVar) {
            dVar.f1576e = sVar;
            sVar.a(dVar.Z());
        }
        B1.f fVar2 = new B1.f(11);
        synchronized (bVar) {
            bVar.f1569c = fVar2;
        }
    }

    public final void a(Context context, C4.e eVar, z zVar, K4.k kVar) {
        Q0.a.v(1, "FirestoreClient", "Initializing. user=%s", eVar.f1580a);
        D3.j jVar = this.f2229a;
        C4.d dVar = this.f2230b;
        C4.b bVar = this.f2231c;
        L4.f fVar = this.f2232d;
        C1726n0 c1726n0 = new C1726n0(context, fVar, jVar, eVar, dVar, bVar, kVar);
        I4.j jVar2 = zVar.f2249b;
        H4.f fVar2 = (H4.f) jVar.f1725d;
        jVar2.f3679c = new P2(fVar2);
        jVar2.f3678b = new C0247p(fVar, context, jVar, new K4.m(dVar, bVar));
        C0247p c0247p = (C0247p) jVar2.f3678b;
        p3.f.P(c0247p, "grpcCallProvider not initialized yet", new Object[0]);
        jVar2.f3680d = new K4.r(fVar, dVar, bVar, fVar2, kVar, c0247p);
        P2 p22 = (P2) jVar2.f3679c;
        p3.f.P(p22, "remoteSerializer not initialized yet", new Object[0]);
        K4.r rVar = (K4.r) jVar2.f3680d;
        p3.f.P(rVar, "firestoreChannel not initialized yet", new Object[0]);
        jVar2.f3681e = new K4.j(fVar, p22, rVar);
        jVar2.f3682f = new F0(context);
        P6.b c3 = zVar.c(c1726n0);
        zVar.f2250c = c3;
        c3.M();
        P6.b bVar2 = zVar.f2250c;
        p3.f.P(bVar2, "persistence not initialized yet", new Object[0]);
        G4.A a2 = new G4.A();
        a2.f2872b = false;
        zVar.f2251d = new C0279l(bVar2, a2, eVar);
        C1023h c1023h = new C1023h(zVar);
        C0279l d7 = zVar.d();
        K4.j jVar3 = (K4.j) jVar2.f3681e;
        p3.f.P(jVar3, "datastore not initialized yet", new Object[0]);
        F0 f02 = (F0) jVar2.f3682f;
        p3.f.P(f02, "connectivityMonitor not initialized yet", new Object[0]);
        zVar.f2253f = new C0043s0(fVar2, c1023h, d7, jVar3, fVar, f02);
        C0279l d8 = zVar.d();
        C0043s0 c0043s0 = zVar.f2253f;
        p3.f.P(c0043s0, "remoteStore not initialized yet", new Object[0]);
        zVar.f2252e = new H(d8, c0043s0, eVar);
        H e7 = zVar.e();
        v2.n nVar = new v2.n();
        nVar.f17139d = new HashSet();
        nVar.f17136a = 1;
        nVar.f17137b = e7;
        nVar.f17138c = new HashMap();
        e7.f2122m = nVar;
        zVar.f2254g = nVar;
        C0279l c0279l = zVar.f2251d;
        c0279l.f2991a.q().run();
        RunnableC0275h runnableC0275h = new RunnableC0275h(c0279l, 0);
        P6.b bVar3 = c0279l.f2991a;
        bVar3.H(runnableC0275h, "Start IndexManager");
        bVar3.H(new RunnableC0275h(c0279l, 1), "Start MutationQueue");
        zVar.f2253f.e();
        zVar.f2256i = zVar.a(c1726n0);
        zVar.f2255h = zVar.b(c1726n0);
        P6.b bVar4 = zVar.f2250c;
        p3.f.P(bVar4, "persistence not initialized yet", new Object[0]);
        this.f2234f = bVar4;
        this.f2239l = zVar.f2256i;
        this.f2235g = zVar.d();
        C0043s0 c0043s02 = zVar.f2253f;
        p3.f.P(c0043s02, "remoteStore not initialized yet", new Object[0]);
        this.f2236h = c0043s02;
        this.f2237i = zVar.e();
        v2.n nVar2 = zVar.f2254g;
        p3.f.P(nVar2, "eventManager not initialized yet", new Object[0]);
        this.j = nVar2;
        C0272e c0272e = zVar.f2255h;
        X x4 = this.f2239l;
        if (x4 != null) {
            x4.start();
        }
        if (c0272e != null) {
            C1726n0 c1726n02 = c0272e.f2970a;
            this.f2238k = c1726n02;
            c1726n02.start();
        }
    }

    public final D b(C c3, C0174g c0174g, C0169b c0169b) {
        e();
        D d7 = new D(c3, c0174g, c0169b);
        this.f2232d.a(new RunnableC0182o(this, d7, 1));
        return d7;
    }

    public final void c(boolean z4) {
        e();
        this.f2232d.a(new RunnableC0108n(this, z4, 1));
    }

    public final Task d() {
        boolean z4;
        Task a2;
        f4.u uVar;
        C4.d dVar = this.f2230b;
        synchronized (dVar) {
            dVar.f1576e = null;
            InterfaceC1090b interfaceC1090b = dVar.f1575d;
            if (interfaceC1090b != null) {
                C4.c cVar = dVar.f1574c;
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
                CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
                copyOnWriteArrayList.remove(cVar);
                synchronized (firebaseAuth) {
                    if (firebaseAuth.f11871x == null) {
                        Y3.i iVar = firebaseAuth.f11849a;
                        com.google.android.gms.common.internal.D.i(iVar);
                        firebaseAuth.f11871x = new f4.u(iVar);
                    }
                    uVar = firebaseAuth.f11871x;
                }
                uVar.a(copyOnWriteArrayList.size());
            }
        }
        C4.b bVar = this.f2231c;
        synchronized (bVar) {
            bVar.f1569c = null;
            InterfaceC0965b interfaceC0965b = bVar.f1570d;
            if (interfaceC0965b != null) {
                C4.a aVar = bVar.f1572f;
                C0784d c0784d = (C0784d) interfaceC0965b;
                ArrayList arrayList = c0784d.f10133a;
                arrayList.remove(aVar);
                int size = c0784d.f10134b.size() + arrayList.size();
                C0787g c0787g = c0784d.f10136d;
                if (c0787g.f10147b == 0 && size > 0) {
                    c0787g.f10147b = size;
                } else if (c0787g.f10147b > 0 && size == 0) {
                    c0787g.f10146a.getClass();
                }
                c0787g.f10147b = size;
            }
        }
        L4.f fVar = this.f2232d;
        RunnableC0179l runnableC0179l = new RunnableC0179l(this, 0);
        L4.d dVar2 = fVar.f4359a;
        synchronized (dVar2) {
            synchronized (dVar2) {
                z4 = dVar2.f4345b;
            }
            return a2;
        }
        if (z4) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            a2 = taskCompletionSource.getTask();
        } else {
            a2 = dVar2.a(new K4.s(runnableC0179l, 2));
            dVar2.f4345b = true;
        }
        return a2;
    }

    public final void e() {
        boolean z4;
        L4.d dVar = this.f2232d.f4359a;
        synchronized (dVar) {
            z4 = dVar.f4345b;
        }
        if (z4) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public final Task f(List list) {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f2232d.a(new RunnableC0032m0(this, list, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }
}
