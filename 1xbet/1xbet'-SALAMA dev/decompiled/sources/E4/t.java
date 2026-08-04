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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p042f4.InterfaceC0893b;
import p155w1.C1017n0;
import p155w1.F0;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D3.j f2229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.d f2230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.b f2231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L4.f f2232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V0 f2233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P6.b f2234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0279l f2235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0043s0 f2236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H f2237i;
    public p151v2.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1017n0 f2238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
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
        C1017n0 c1017n0 = new C1017n0(context, fVar, jVar, eVar, dVar, bVar, kVar);
        I4.j jVar2 = zVar.f2249b;
        H4.f fVar2 = (H4.f) jVar.f1725d;
        jVar2.f3679c = new P2(fVar2);
        jVar2.f3678b = new C0247p(fVar, context, jVar, new K4.m(dVar, bVar));
        C0247p c0247p = (C0247p) jVar2.f3678b;
        p113p3.f.P(c0247p, "grpcCallProvider not initialized yet", new Object[0]);
        jVar2.f3680d = new K4.r(fVar, dVar, bVar, fVar2, kVar, c0247p);
        P2 p5 = (P2) jVar2.f3679c;
        p113p3.f.P(p5, "remoteSerializer not initialized yet", new Object[0]);
        K4.r rVar = (K4.r) jVar2.f3680d;
        p113p3.f.P(rVar, "firestoreChannel not initialized yet", new Object[0]);
        jVar2.f3681e = new K4.j(fVar, p5, rVar);
        jVar2.f3682f = new F0(context);
        P6.b bVarC = zVar.c(c1017n0);
        zVar.f2250c = bVarC;
        bVarC.M();
        P6.b bVar2 = zVar.f2250c;
        p113p3.f.P(bVar2, "persistence not initialized yet", new Object[0]);
        G4.A a2 = new G4.A();
        a2.f2872b = false;
        zVar.f2251d = new C0279l(bVar2, a2, eVar);
        p033e3.h hVar = new p033e3.h(zVar);
        C0279l c0279lD = zVar.d();
        K4.j jVar3 = (K4.j) jVar2.f3681e;
        p113p3.f.P(jVar3, "datastore not initialized yet", new Object[0]);
        F0 f7 = (F0) jVar2.f3682f;
        p113p3.f.P(f7, "connectivityMonitor not initialized yet", new Object[0]);
        zVar.f2253f = new C0043s0(fVar2, hVar, c0279lD, jVar3, fVar, f7);
        C0279l c0279lD2 = zVar.d();
        C0043s0 c0043s0 = zVar.f2253f;
        p113p3.f.P(c0043s0, "remoteStore not initialized yet", new Object[0]);
        zVar.f2252e = new H(c0279lD2, c0043s0, eVar);
        H hE = zVar.e();
        p151v2.n nVar = new p151v2.n();
        nVar.f17145d = new HashSet();
        nVar.f17142a = 1;
        nVar.f17143b = hE;
        nVar.f17144c = new HashMap();
        hE.f2122m = nVar;
        zVar.f2254g = nVar;
        C0279l c0279l = zVar.f2251d;
        c0279l.f2991a.q().run();
        RunnableC0275h runnableC0275h = new RunnableC0275h(c0279l, 0);
        P6.b bVar3 = c0279l.f2991a;
        bVar3.H(runnableC0275h, "Start IndexManager");
        bVar3.H(new RunnableC0275h(c0279l, 1), "Start MutationQueue");
        zVar.f2253f.e();
        zVar.f2256i = zVar.a(c1017n0);
        zVar.f2255h = zVar.b(c1017n0);
        P6.b bVar4 = zVar.f2250c;
        p113p3.f.P(bVar4, "persistence not initialized yet", new Object[0]);
        this.f2234f = bVar4;
        this.f2239l = zVar.f2256i;
        this.f2235g = zVar.d();
        C0043s0 c0043s1 = zVar.f2253f;
        p113p3.f.P(c0043s1, "remoteStore not initialized yet", new Object[0]);
        this.f2236h = c0043s1;
        this.f2237i = zVar.e();
        p151v2.n nVar2 = zVar.f2254g;
        p113p3.f.P(nVar2, "eventManager not initialized yet", new Object[0]);
        this.j = nVar2;
        C0272e c0272e = zVar.f2255h;
        X x4 = this.f2239l;
        if (x4 != null) {
            x4.start();
        }
        if (c0272e != null) {
            C1017n0 c1017n1 = c0272e.f2970a;
            this.f2238k = c1017n1;
            c1017n1.start();
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
        Task taskA;
        p042f4.u uVar;
        C4.d dVar = this.f2230b;
        synchronized (dVar) {
            dVar.f1576e = null;
            InterfaceC0893b interfaceC0893b = dVar.f1575d;
            if (interfaceC0893b != null) {
                C4.c cVar = dVar.f1574c;
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
                CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f11851c;
                copyOnWriteArrayList.remove(cVar);
                synchronized (firebaseAuth) {
                    if (firebaseAuth.f11871x == null) {
                        Y3.i iVar = firebaseAuth.f11849a;
                        com.google.android.gms.common.internal.D.i(iVar);
                        firebaseAuth.f11871x = new p042f4.u(iVar);
                    }
                    uVar = firebaseAuth.f11871x;
                }
                uVar.a(copyOnWriteArrayList.size());
            }
        }
        C4.b bVar = this.f2231c;
        synchronized (bVar) {
            bVar.f1569c = null;
            p026d4.b bVar2 = bVar.f1570d;
            if (bVar2 != null) {
                C4.a aVar = bVar.f1572f;
                p014b4.d dVar2 = (p014b4.d) bVar2;
                ArrayList arrayList = dVar2.f10133a;
                arrayList.remove(aVar);
                int size = dVar2.f10134b.size() + arrayList.size();
                p014b4.g gVar = dVar2.f10136d;
                if (gVar.f10147b == 0 && size > 0) {
                    gVar.f10147b = size;
                } else if (gVar.f10147b > 0 && size == 0) {
                    gVar.f10146a.getClass();
                }
                gVar.f10147b = size;
            }
        }
        L4.f fVar = this.f2232d;
        RunnableC0179l runnableC0179l = new RunnableC0179l(this, 0);
        L4.d dVar3 = fVar.f4359a;
        synchronized (dVar3) {
            try {
                synchronized (dVar3) {
                    z4 = dVar3.f4345b;
                }
                return taskA;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            taskA = taskCompletionSource.getTask();
        } else {
            taskA = dVar3.a(new K4.s(runnableC0179l, 2));
            dVar3.f4345b = true;
        }
        return taskA;
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
