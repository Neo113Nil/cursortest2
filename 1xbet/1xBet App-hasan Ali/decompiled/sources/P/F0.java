package P;

import android.util.Log;
import b4.EnumC0510a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p4.C2268h;
import p4.InterfaceC2266f;
import r.C2316B;
import r.C2321G;
import r.C2322H;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class F0 extends AbstractC0321v {

    /* renamed from: x, reason: collision with root package name */
    public static final s4.M f4288x = s4.C.b(V.b.f5917n);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f4289y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0290f f4290a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4291b;

    /* renamed from: c, reason: collision with root package name */
    public p4.U f4292c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f4293d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4294e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public C2322H f4295g;

    /* renamed from: h, reason: collision with root package name */
    public final R.e f4296h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4297j;

    /* renamed from: k, reason: collision with root package name */
    public final C2321G f4298k;

    /* renamed from: l, reason: collision with root package name */
    public final G.v f4299l;

    /* renamed from: m, reason: collision with root package name */
    public final C2321G f4300m;

    /* renamed from: n, reason: collision with root package name */
    public final C2321G f4301n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4302o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f4303p;

    /* renamed from: q, reason: collision with root package name */
    public C2268h f4304q;

    /* renamed from: r, reason: collision with root package name */
    public A0.J0 f4305r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4306s;

    /* renamed from: t, reason: collision with root package name */
    public final s4.M f4307t;

    /* renamed from: u, reason: collision with root package name */
    public final p4.W f4308u;

    /* renamed from: v, reason: collision with root package name */
    public final a4.h f4309v;

    /* renamed from: w, reason: collision with root package name */
    public final Z f4310w;

    public F0(a4.h hVar) {
        C0290f c0290f = new C0290f(new O3.l(1, this));
        this.f4290a = c0290f;
        this.f4291b = new Object();
        this.f4294e = new ArrayList();
        this.f4295g = new C2322H();
        this.f4296h = new R.e(new C0327y[16]);
        this.i = new ArrayList();
        this.f4297j = new ArrayList();
        this.f4298k = new C2321G();
        this.f4299l = new G.v(8);
        this.f4300m = new C2321G();
        this.f4301n = new C2321G();
        this.f4307t = s4.C.b(EnumC0330z0.f4609m);
        new v3.e(12);
        p4.W w5 = new p4.W((p4.U) hVar.l(p4.r.f18819l));
        w5.p(new O0.e(3, this));
        this.f4308u = w5;
        this.f4309v = hVar.m(c0290f).m(w5);
        this.f4310w = new Z(8);
    }

    public static final void E(ArrayList arrayList, F0 f02, C0327y c0327y) {
        arrayList.clear();
        synchronized (f02.f4291b) {
            Iterator it = f02.f4297j.iterator();
            while (it.hasNext()) {
                AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) it.next();
                abstractC0287d0.getClass();
                if (kotlin.jvm.internal.l.a(null, c0327y)) {
                    arrayList.add(abstractC0287d0);
                    it.remove();
                }
            }
        }
    }

    public static final Object r(F0 f02, E0 e02) {
        C2268h c2268h;
        if (f02.A()) {
            return W3.o.f6046a;
        }
        C2268h c2268h2 = new C2268h(1, AbstractC2346c.v(e02));
        c2268h2.r();
        synchronized (f02.f4291b) {
            if (f02.A()) {
                c2268h = c2268h2;
            } else {
                f02.f4304q = c2268h2;
                c2268h = null;
            }
        }
        if (c2268h != null) {
            c2268h.resumeWith(W3.o.f6046a);
        }
        Object q5 = c2268h2.q();
        return q5 == EnumC0510a.f7289k ? q5 : W3.o.f6046a;
    }

    public static final void s(F0 f02) {
        int i;
        C2316B c2316b;
        synchronized (f02.f4291b) {
            try {
                if (f02.f4298k.j()) {
                    C2316B b3 = R.a.b(f02.f4298k);
                    f02.f4298k.a();
                    G.v vVar = f02.f4299l;
                    ((C2321G) vVar.f1749l).a();
                    ((C2321G) vVar.f1750m).a();
                    f02.f4301n.a();
                    c2316b = new C2316B(b3.f18905b);
                    Object[] objArr = b3.f18904a;
                    int i5 = b3.f18905b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) objArr[i6];
                        c2316b.a(new W3.h(abstractC0287d0, f02.f4300m.g(abstractC0287d0)));
                    }
                    f02.f4300m.a();
                } else {
                    c2316b = r.L.f18954b;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>", c2316b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = c2316b.f18904a;
        int i7 = c2316b.f18905b;
        for (i = 0; i < i7; i++) {
            W3.h hVar = (W3.h) objArr2[i];
        }
    }

    public static final boolean t(F0 f02) {
        boolean z3;
        synchronized (f02.f4291b) {
            z3 = f02.z();
        }
        return z3;
    }

    public static final List u(F0 f02) {
        List B5;
        synchronized (f02.f4291b) {
            B5 = f02.B();
        }
        return B5;
    }

    public static final void v(F0 f02, p4.U u5) {
        synchronized (f02.f4291b) {
            Throwable th = f02.f4293d;
            if (th != null) {
                throw th;
            }
            if (((EnumC0330z0) f02.f4307t.getValue()).compareTo(EnumC0330z0.f4608l) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (f02.f4292c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            f02.f4292c = u5;
            f02.y();
        }
    }

    public static void w(Z.b bVar) {
        try {
            if (bVar.w() instanceof Z.g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bVar.c();
        }
    }

    public final boolean A() {
        boolean z3;
        synchronized (this.f4291b) {
            if (!this.f4295g.h() && this.f4296h.f5108m == 0) {
                z3 = z();
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List B() {
        ?? r02 = this.f;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f4294e;
        List arrayList2 = arrayList.isEmpty() ? X3.v.f6090k : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    public final void C() {
        synchronized (this.f4291b) {
            this.f4306s = true;
        }
    }

    public final void D(C0327y c0327y) {
        synchronized (this.f4291b) {
            ArrayList arrayList = this.f4297j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0287d0) arrayList.get(i)).getClass();
                if (kotlin.jvm.internal.l.a(null, c0327y)) {
                    ArrayList arrayList2 = new ArrayList();
                    E(arrayList2, this, c0327y);
                    while (!arrayList2.isEmpty()) {
                        F(arrayList2, null);
                        E(arrayList2, this, c0327y);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (((W3.h) r10.get(r4)).f6037l == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        if (r8 >= r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        r11 = (W3.h) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        if (r11.f6037l != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
    
        r11 = (P.AbstractC0287d0) r11.f6036k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        r4 = r17.f4291b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        X3.s.U(r3, r17.f4297j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r8 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        if (((W3.h) r11).f6037l == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List F(List list, C2322H c2322h) {
        Z.b D5;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((AbstractC0287d0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C0327y c0327y = (C0327y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0327y.f4584D.f4519F) {
                AbstractC0317t.c("Check failed");
            }
            O0.e eVar = new O0.e(2, c0327y);
            O3.f fVar = new O3.f(2, c0327y, c2322h);
            Z.f k5 = Z.l.k();
            Z.b bVar = k5 instanceof Z.b ? (Z.b) k5 : null;
            if (bVar == null || (D5 = bVar.D(eVar, fVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Z.f j5 = D5.j();
                try {
                    synchronized (this.f4291b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) list2.get(i5);
                                C2321G c2321g = this.f4298k;
                                abstractC0287d0.getClass();
                                Object a5 = R.a.a(c2321g);
                                arrayList.add(new W3.h(abstractC0287d0, a5));
                            }
                            int size3 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    break;
                                }
                                W3.h hVar = (W3.h) arrayList.get(i6);
                                if (hVar.f6037l == null) {
                                    G.v vVar = this.f4299l;
                                    ((AbstractC0287d0) hVar.f6036k).getClass();
                                    if (((C2321G) vVar.f1749l).b(null)) {
                                        ArrayList arrayList2 = new ArrayList(X3.o.S(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i7 = 0;
                                        while (i7 < size4) {
                                            Object obj3 = arrayList.get(i7);
                                            i7++;
                                            W3.h hVar2 = (W3.h) obj3;
                                            if (hVar2.f6037l == null) {
                                                G.v vVar2 = this.f4299l;
                                                ((AbstractC0287d0) hVar2.f6036k).getClass();
                                                C2321G c2321g2 = (C2321G) vVar2.f1749l;
                                                if (c2321g2.i()) {
                                                    ((C2321G) vVar2.f1750m).a();
                                                }
                                            }
                                            arrayList2.add(hVar2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i6++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size5) {
                            break;
                        }
                        if (((W3.h) arrayList.get(i8)).f6037l != null) {
                            break;
                        }
                        i8++;
                    }
                    c0327y.q(arrayList);
                    Z.f.q(j5);
                } catch (Throwable th) {
                    Z.f.q(j5);
                    throw th;
                }
            } finally {
                w(D5);
            }
        }
        return X3.m.m0(hashMap.keySet());
    }

    public final C0327y G(C0327y c0327y, C2322H c2322h) {
        Z.b D5;
        if (c0327y.f4584D.f4519F || c0327y.f4585E == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f4303p;
        if (linkedHashSet == null || !linkedHashSet.contains(c0327y)) {
            O0.e eVar = new O0.e(2, c0327y);
            O3.f fVar = new O3.f(2, c0327y, c2322h);
            Z.f k5 = Z.l.k();
            Z.b bVar = k5 instanceof Z.b ? (Z.b) k5 : null;
            if (bVar == null || (D5 = bVar.D(eVar, fVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Z.f j5 = D5.j();
                if (c2322h != null) {
                    try {
                        if (c2322h.h()) {
                            C0328y0 c0328y0 = new C0328y0(0, c2322h, c0327y);
                            C0315s c0315s = c0327y.f4584D;
                            if (c0315s.f4519F) {
                                AbstractC0317t.c("Preparing a composition while composing is not supported");
                            }
                            c0315s.f4519F = true;
                            try {
                                c0328y0.invoke();
                                c0315s.f4519F = false;
                            } catch (Throwable th) {
                                c0315s.f4519F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        Z.f.q(j5);
                        throw th2;
                    }
                }
                boolean w5 = c0327y.w();
                Z.f.q(j5);
                if (w5) {
                    return c0327y;
                }
            } finally {
                w(D5);
            }
        }
        return null;
    }

    public final void H(Throwable th, C0327y c0327y) {
        if (!((Boolean) f4289y.get()).booleanValue() || (th instanceof C0300k)) {
            synchronized (this.f4291b) {
                A0.J0 j02 = this.f4305r;
                if (j02 != null) {
                    throw ((Throwable) j02.f304k);
                }
                this.f4305r = new A0.J0(th);
            }
            throw th;
        }
        synchronized (this.f4291b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.f4296h.h();
                this.f4295g = new C2322H();
                this.f4297j.clear();
                this.f4298k.a();
                this.f4300m.a();
                this.f4305r = new A0.J0(th);
                if (c0327y != null) {
                    J(c0327y);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I() {
        synchronized (this.f4291b) {
            boolean z3 = true;
            if (this.f4295g.g()) {
                if (this.f4296h.f5108m == 0 && !z() && !this.f4298k.j()) {
                    z3 = false;
                }
                return z3;
            }
            List B5 = B();
            R.h hVar = new R.h(this.f4295g);
            this.f4295g = new C2322H();
            try {
                int size = B5.size();
                for (int i = 0; i < size; i++) {
                    ((C0327y) B5.get(i)).x(hVar);
                    if (((EnumC0330z0) this.f4307t.getValue()).compareTo(EnumC0330z0.f4608l) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4291b) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f4296h.f5108m == 0 && !z() && !this.f4298k.j()) {
                        z3 = false;
                    }
                }
                return z3;
            } catch (Throwable th) {
                synchronized (this.f4291b) {
                    C2322H c2322h = this.f4295g;
                    c2322h.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        c2322h.i(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void J(C0327y c0327y) {
        ArrayList arrayList = this.f4302o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4302o = arrayList;
        }
        if (!arrayList.contains(c0327y)) {
            arrayList.add(c0327y);
        }
        if (this.f4294e.remove(c0327y)) {
            this.f = null;
        }
    }

    public final void K() {
        InterfaceC2266f interfaceC2266f;
        synchronized (this.f4291b) {
            if (this.f4306s) {
                this.f4306s = false;
                interfaceC2266f = y();
            } else {
                interfaceC2266f = null;
            }
        }
        if (interfaceC2266f != null) {
            ((C2268h) interfaceC2266f).resumeWith(W3.o.f6046a);
        }
    }

    @Override // P.AbstractC0321v
    public final void a(C0327y c0327y, i4.e eVar) {
        EnumC0330z0 enumC0330z0;
        boolean contains;
        Z.b D5;
        boolean z3 = c0327y.f4584D.f4519F;
        synchronized (this.f4291b) {
            EnumC0330z0 enumC0330z02 = (EnumC0330z0) this.f4307t.getValue();
            enumC0330z0 = EnumC0330z0.f4608l;
            contains = enumC0330z02.compareTo(enumC0330z0) > 0 ? true ^ B().contains(c0327y) : true;
        }
        try {
            O0.e eVar2 = new O0.e(2, c0327y);
            O3.f fVar = new O3.f(2, c0327y, null);
            Z.f k5 = Z.l.k();
            Z.b bVar = k5 instanceof Z.b ? (Z.b) k5 : null;
            if (bVar == null || (D5 = bVar.D(eVar2, fVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Z.f j5 = D5.j();
                try {
                    c0327y.j(eVar);
                    synchronized (this.f4291b) {
                        if (((EnumC0330z0) this.f4307t.getValue()).compareTo(enumC0330z0) > 0 && !B().contains(c0327y)) {
                            this.f4294e.add(c0327y);
                            this.f = null;
                        }
                    }
                    if (!z3) {
                        Z.l.k().m();
                    }
                    try {
                        D(c0327y);
                        try {
                            c0327y.d();
                            c0327y.f();
                            if (z3) {
                                return;
                            }
                            Z.l.k().m();
                        } catch (Throwable th) {
                            H(th, null);
                        }
                    } catch (Throwable th2) {
                        H(th2, c0327y);
                    }
                } finally {
                    Z.f.q(j5);
                }
            } finally {
                w(D5);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.f4291b) {
                }
            }
            H(th3, c0327y);
        }
    }

    @Override // P.AbstractC0321v
    public final boolean c() {
        return ((Boolean) f4289y.get()).booleanValue();
    }

    @Override // P.AbstractC0321v
    public final boolean d() {
        return false;
    }

    @Override // P.AbstractC0321v
    public final boolean e() {
        return false;
    }

    @Override // P.AbstractC0321v
    public final long f() {
        return 1000;
    }

    @Override // P.AbstractC0321v
    public final InterfaceC0319u g() {
        return null;
    }

    @Override // P.AbstractC0321v
    public final a4.h i() {
        return this.f4309v;
    }

    @Override // P.AbstractC0321v
    public final void j(C0327y c0327y) {
        InterfaceC2266f interfaceC2266f;
        synchronized (this.f4291b) {
            if (this.f4296h.i(c0327y)) {
                interfaceC2266f = null;
            } else {
                this.f4296h.c(c0327y);
                interfaceC2266f = y();
            }
        }
        if (interfaceC2266f != null) {
            ((C2268h) interfaceC2266f).resumeWith(W3.o.f6046a);
        }
    }

    @Override // P.AbstractC0321v
    public final AbstractC0285c0 k(AbstractC0287d0 abstractC0287d0) {
        AbstractC0285c0 abstractC0285c0;
        synchronized (this.f4291b) {
            abstractC0285c0 = (AbstractC0285c0) this.f4300m.k(abstractC0287d0);
        }
        return abstractC0285c0;
    }

    @Override // P.AbstractC0321v
    public final void n(C0327y c0327y) {
        synchronized (this.f4291b) {
            try {
                LinkedHashSet linkedHashSet = this.f4303p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f4303p = linkedHashSet;
                }
                linkedHashSet.add(c0327y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P.AbstractC0321v
    public final void q(C0327y c0327y) {
        synchronized (this.f4291b) {
            if (this.f4294e.remove(c0327y)) {
                this.f = null;
            }
            this.f4296h.k(c0327y);
            this.i.remove(c0327y);
        }
    }

    public final void x() {
        synchronized (this.f4291b) {
            if (((EnumC0330z0) this.f4307t.getValue()).compareTo(EnumC0330z0.f4611o) >= 0) {
                s4.M m5 = this.f4307t;
                EnumC0330z0 enumC0330z0 = EnumC0330z0.f4608l;
                m5.getClass();
                m5.j(null, enumC0330z0);
            }
        }
        this.f4308u.d(null);
    }

    public final InterfaceC2266f y() {
        s4.M m5 = this.f4307t;
        int compareTo = ((EnumC0330z0) m5.getValue()).compareTo(EnumC0330z0.f4608l);
        ArrayList arrayList = this.f4297j;
        ArrayList arrayList2 = this.i;
        R.e eVar = this.f4296h;
        if (compareTo <= 0) {
            for (C0327y c0327y : B()) {
            }
            this.f4294e.clear();
            this.f = X3.v.f6090k;
            this.f4295g = new C2322H();
            eVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f4302o = null;
            C2268h c2268h = this.f4304q;
            if (c2268h != null) {
                c2268h.g(null);
            }
            this.f4304q = null;
            this.f4305r = null;
            return null;
        }
        A0.J0 j02 = this.f4305r;
        EnumC0330z0 enumC0330z0 = EnumC0330z0.f4612p;
        EnumC0330z0 enumC0330z02 = EnumC0330z0.f4609m;
        if (j02 == null) {
            if (this.f4292c == null) {
                this.f4295g = new C2322H();
                eVar.h();
                if (z()) {
                    enumC0330z02 = EnumC0330z0.f4610n;
                }
            } else {
                enumC0330z02 = (eVar.f5108m == 0 && !this.f4295g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !this.f4298k.j()) ? EnumC0330z0.f4611o : enumC0330z0;
            }
        }
        m5.getClass();
        m5.j(null, enumC0330z02);
        if (enumC0330z02 != enumC0330z0) {
            return null;
        }
        C2268h c2268h2 = this.f4304q;
        this.f4304q = null;
        return c2268h2;
    }

    public final boolean z() {
        return !this.f4306s && (this.f4290a.f4465n.get() & 134217727) > 0;
    }

    @Override // P.AbstractC0321v
    public final void l(Set set) {
    }
}
