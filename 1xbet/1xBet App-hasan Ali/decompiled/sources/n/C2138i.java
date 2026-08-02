package n;

import a.AbstractC0444a;
import android.os.Build;
import android.os.Parcel;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.View;
import com.google.android.gms.internal.ads.C1386of;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.C2023c;
import k4.AbstractC2036a;
import l4.C2061c;
import l4.C2062d;
import m.InterfaceC2075m;
import m.MenuC2070h;
import m.SubMenuC2080r;
import n1.C2175p;
import o3.C2220a;
import o3.C2222c;
import r.AbstractC2339q;
import r.C2338p;
import s.AbstractC2351a;
import u.AbstractC2470q;
import u.C2432C;
import u.InterfaceC2431B;
import w0.AbstractC2540a;
import w2.C2544b;
import w2.C2545c;
import w2.C2548f;
import w2.C2550h;
import w3.AbstractC2552a;
import z0.AbstractC2749f;
import z0.C2731G;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138i implements InterfaceC2075m, InterfaceC2143m, l3.i, u.r {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18248k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f18249l;

    public /* synthetic */ C2138i(int i, Object obj) {
        this.f18248k = i;
        this.f18249l = obj;
    }

    @Override // m.InterfaceC2075m
    public void a(MenuC2070h menuC2070h, boolean z3) {
        if (menuC2070h instanceof SubMenuC2080r) {
            ((SubMenuC2080r) menuC2070h).f17980w.j().c(false);
        }
        InterfaceC2075m interfaceC2075m = ((C2140j) this.f18249l).f18264o;
        if (interfaceC2075m != null) {
            interfaceC2075m.a(menuC2070h, z3);
        }
    }

    public void b(C2731G c2731g) {
        if (!c2731g.I()) {
            AbstractC2540a.b("DepthSortedSet.add called on an unattached node");
        }
        ((z0.w0) this.f18249l).add(c2731g);
    }

    public C2550h c() {
        C2545c f;
        P.W w5 = (P.W) this.f18249l;
        C2548f c2548f = (C2548f) w5.f4414n;
        synchronized (c2548f) {
            w5.c(true);
            f = c2548f.f(((C2544b) w5.f4412l).f20495a);
        }
        if (f != null) {
            return new C2550h(f);
        }
        return null;
    }

    @Override // m.InterfaceC2075m
    public boolean d(MenuC2070h menuC2070h) {
        C2140j c2140j = (C2140j) this.f18249l;
        if (menuC2070h == c2140j.f18262m) {
            return false;
        }
        ((SubMenuC2080r) menuC2070h).f17981x.getClass();
        c2140j.getClass();
        InterfaceC2075m interfaceC2075m = c2140j.f18264o;
        if (interfaceC2075m != null) {
            return interfaceC2075m.d(menuC2070h);
        }
        return false;
    }

    public KeyListener e(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((G.v) ((C2138i) this.f18249l).f18249l).getClass();
        if (keyListener instanceof x1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new x1.e(keyListener);
    }

    @Override // l3.i
    public void f(Object obj, Object obj2) {
        D3.f fVar = (D3.f) obj2;
        C2220a c2220a = (C2220a) ((C2222c) obj).t();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c2220a.f8166m);
        int i = AbstractC2552a.f20529a;
        m3.m mVar = (m3.m) this.f18249l;
        if (mVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            mVar.writeToParcel(obtain, 0);
        }
        try {
            c2220a.f8165l.transact(1, obtain, null, 1);
            obtain.recycle();
            fVar.f946a.f(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public D3.l g(G.v vVar, A0.F f) {
        Object obj;
        long J;
        boolean z3;
        long j5;
        ArrayList arrayList = (ArrayList) vVar.f1749l;
        C2338p c2338p = new C2338p(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            t0.u uVar = (t0.u) arrayList.get(i);
            long j6 = uVar.f19516a;
            C2338p c2338p2 = (C2338p) this.f18249l;
            int b3 = AbstractC2351a.b(c2338p2.f19030l, c2338p2.f19032n, j6);
            if (b3 < 0 || (obj = c2338p2.f19031m[b3]) == AbstractC2339q.f19033a) {
                obj = null;
            }
            t0.t tVar = (t0.t) obj;
            if (tVar == null) {
                long j7 = uVar.f19517b;
                J = uVar.f19519d;
                j5 = j7;
                z3 = false;
            } else {
                J = f.J(tVar.f19514b);
                long j8 = tVar.f19513a;
                z3 = tVar.f19515c;
                j5 = j8;
            }
            long j9 = J;
            ArrayList arrayList2 = uVar.i;
            long j10 = uVar.f19523j;
            long j11 = uVar.f19524k;
            int i5 = i;
            long j12 = uVar.f19516a;
            ArrayList arrayList3 = arrayList;
            int i6 = size;
            c2338p.g(j12, new t0.s(j12, uVar.f19517b, uVar.f19519d, uVar.f19520e, uVar.f, j5, j9, z3, uVar.f19521g, arrayList2, j10, j11));
            long j13 = uVar.f19516a;
            boolean z5 = uVar.f19520e;
            if (z5) {
                c2338p2.g(j13, new t0.t(uVar.f19517b, uVar.f19518c, z5));
            } else {
                c2338p2.i(j13);
            }
            i = i5 + 1;
            arrayList = arrayList3;
            size = i6;
        }
        return new D3.l(c2338p, vVar);
    }

    @Override // u.r
    public InterfaceC2431B get(int i) {
        switch (this.f18248k) {
            case 9:
                return (C2432C) ((ArrayList) this.f18249l).get(i);
            default:
                return (InterfaceC2431B) this.f18249l;
        }
    }

    public boolean h(C2731G c2731g) {
        if (!c2731g.I()) {
            AbstractC2540a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((z0.w0) this.f18249l).remove(c2731g);
    }

    public void i(boolean z3) {
        x1.i iVar = (x1.i) ((G.v) ((C2138i) this.f18249l).f18249l).f1750m;
        if (iVar.f21085m != z3) {
            if (iVar.f21084l != null) {
                v1.k a5 = v1.k.a();
                x1.h hVar = iVar.f21084l;
                a5.getClass();
                AbstractC2036a.o("initCallback cannot be null", hVar);
                ReentrantReadWriteLock reentrantReadWriteLock = a5.f20345a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a5.f20346b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f21085m = z3;
            if (z3) {
                x1.i.a(iVar.f21083k, v1.k.a().c());
            }
        }
    }

    public String toString() {
        switch (this.f18248k) {
            case 15:
                return ((z0.w0) this.f18249l).toString();
            default:
                return super.toString();
        }
    }

    public C2138i(View view) {
        this.f18248k = 4;
        if (Build.VERSION.SDK_INT < 30) {
            this.f18249l = new C2023c(6, view);
            return;
        }
        C2175p c2175p = new C2175p(6, view);
        c2175p.f18447m = view;
        this.f18249l = c2175p;
    }

    public C2138i(AbstractC2144n abstractC2144n, int i) {
        this.f18248k = i;
        switch (i) {
            case 13:
                this.f18249l = new G.v(abstractC2144n);
                break;
            default:
                this.f18249l = new C2138i(abstractC2144n, 13);
                break;
        }
    }

    public C2138i(Runnable runnable) {
        this.f18248k = 3;
        this.f18249l = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C2138i(int i) {
        this.f18248k = i;
        switch (i) {
            case 14:
                kotlin.jvm.internal.l.f("timeUnit", TimeUnit.MINUTES);
                B4.d dVar = B4.d.i;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                kotlin.jvm.internal.l.f("taskRunner", dVar);
                kotlin.jvm.internal.l.f("timeUnit", timeUnit);
                C1386of c1386of = new C1386of();
                c1386of.f14811c = timeUnit.toNanos(5L);
                c1386of.f14809a = dVar.e();
                c1386of.f14810b = new B4.b(c1386of, AbstractC2107A.u(new StringBuilder(), z4.b.f21984g, " ConnectionPool"));
                c1386of.f14812d = new ConcurrentLinkedQueue();
                this.f18249l = c1386of;
                break;
            case 15:
                this.f18249l = new z0.w0(AbstractC2749f.f21814a);
                break;
            default:
                this.f18249l = new C2338p((Object) null);
                break;
        }
    }

    public C2138i(float f, float f5, AbstractC2470q abstractC2470q) {
        this.f18248k = 9;
        C2062d f02 = AbstractC0444a.f0(0, abstractC2470q.b());
        ArrayList arrayList = new ArrayList(X3.o.S(f02, 10));
        Iterator it = f02.iterator();
        while (((C2061c) it).f17856m) {
            arrayList.add(new C2432C(f, f5, abstractC2470q.a(((X3.y) it).a())));
        }
        this.f18249l = arrayList;
    }
}
