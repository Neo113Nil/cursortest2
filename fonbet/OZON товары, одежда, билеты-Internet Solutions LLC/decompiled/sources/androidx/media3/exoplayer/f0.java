package androidx.media3.exoplayer;

import F3.AbstractC2996a;
import F3.C3013s;
import F3.C3014t;
import F3.C3015u;
import F3.C3016v;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import F3.W;
import android.util.Pair;
import j3.AbstractC7252H;
import j3.C7275q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import m3.InterfaceC8073o;
import t3.AbstractC9735a;
import u3.InterfaceC9927a;

/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final u3.P f43784a;

    /* renamed from: e, reason: collision with root package name */
    private final d f43788e;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9927a f43791h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC8073o f43792i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43794k;

    /* renamed from: l, reason: collision with root package name */
    private p3.z f43795l;

    /* renamed from: j, reason: collision with root package name */
    private F3.W f43793j = new W.a();

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<InterfaceC3017w, c> f43786c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f43787d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f43785b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f43789f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f43790g = new HashSet();

    private final class a implements F3.F, w3.i {

        /* renamed from: a, reason: collision with root package name */
        private final c f43796a;

        public a(c cVar) {
            this.f43796a = cVar;
        }

        private Pair<Integer, InterfaceC3018x.b> c(int i11, InterfaceC3018x.b bVar) {
            InterfaceC3018x.b bVar2;
            c cVar = this.f43796a;
            InterfaceC3018x.b bVar3 = null;
            if (bVar != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= cVar.f43803c.size()) {
                        bVar2 = null;
                        break;
                    }
                    if (((InterfaceC3018x.b) cVar.f43803c.get(i12)).f8754d == bVar.f8754d) {
                        Object obj = cVar.f43802b;
                        int i13 = AbstractC9735a.f99007c;
                        bVar2 = bVar.a(Pair.create(obj, bVar.f8751a));
                        break;
                    }
                    i12++;
                }
                if (bVar2 == null) {
                    return null;
                }
                bVar3 = bVar2;
            }
            return Pair.create(Integer.valueOf(i11 + cVar.f43804d), bVar3);
        }

        @Override // w3.i
        public final void A(int i11, InterfaceC3018x.b bVar, final int i12) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.A(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, i12);
                    }
                });
            }
        }

        @Override // w3.i
        public final void F(int i11, InterfaceC3018x.b bVar) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.F(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second);
                    }
                });
            }
        }

        @Override // F3.F
        public final void H(int i11, InterfaceC3018x.b bVar, final C3016v c3016v) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.Y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.H(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, c3016v);
                    }
                });
            }
        }

        @Override // F3.F
        public final void I(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.I(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, c3013s, c3016v);
                    }
                });
            }
        }

        @Override // F3.F
        public final void M(int i11, InterfaceC3018x.b bVar, final C3016v c3016v) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        int intValue = ((Integer) pair.first).intValue();
                        InterfaceC3018x.b bVar2 = (InterfaceC3018x.b) pair.second;
                        bVar2.getClass();
                        interfaceC9927a.M(intValue, bVar2, c3016v);
                    }
                });
            }
        }

        @Override // w3.i
        public final void P(int i11, InterfaceC3018x.b bVar) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.P(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second);
                    }
                });
            }
        }

        @Override // F3.F
        public final void U(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v, final IOException iOException, final boolean z11) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.U(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, c3013s, c3016v, iOException, z11);
                    }
                });
            }
        }

        @Override // w3.i
        public final void V(int i11, InterfaceC3018x.b bVar) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.V(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second);
                    }
                });
            }
        }

        @Override // F3.F
        public final void X(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.X(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, c3013s, c3016v);
                    }
                });
            }
        }

        @Override // F3.F
        public final void c0(int i11, InterfaceC3018x.b bVar, final C3013s c3013s, final C3016v c3016v, final int i12) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.c0(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, c3013s, c3016v, i12);
                    }
                });
            }
        }

        @Override // w3.i
        public final void q(int i11, InterfaceC3018x.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC3018x.b> c11 = c(i11, bVar);
            if (c11 != null) {
                f0.this.f43792i.i(new Runnable() { // from class: androidx.media3.exoplayer.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC9927a interfaceC9927a;
                        interfaceC9927a = f0.this.f43791h;
                        Pair pair = c11;
                        interfaceC9927a.q(((Integer) pair.first).intValue(), (InterfaceC3018x.b) pair.second, exc);
                    }
                });
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3018x f43798a;

        /* renamed from: b, reason: collision with root package name */
        public final T f43799b;

        /* renamed from: c, reason: collision with root package name */
        public final a f43800c;

        public b(InterfaceC3018x interfaceC3018x, T t2, a aVar) {
            this.f43798a = interfaceC3018x;
            this.f43799b = t2;
            this.f43800c = aVar;
        }
    }

    static final class c implements S {

        /* renamed from: a, reason: collision with root package name */
        public final C3015u f43801a;

        /* renamed from: d, reason: collision with root package name */
        public int f43804d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f43805e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f43803c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f43802b = new Object();

        public c(InterfaceC3018x interfaceC3018x, boolean z11) {
            this.f43801a = new C3015u(interfaceC3018x, z11);
        }

        @Override // androidx.media3.exoplayer.S
        public final AbstractC7252H a() {
            return this.f43801a.l();
        }

        @Override // androidx.media3.exoplayer.S
        public final Object getUid() {
            return this.f43802b;
        }
    }

    public interface d {
    }

    public f0(d dVar, InterfaceC9927a interfaceC9927a, InterfaceC8073o interfaceC8073o, u3.P p11) {
        this.f43784a = p11;
        this.f43788e = dVar;
        this.f43791h = interfaceC9927a;
        this.f43792i = interfaceC8073o;
    }

    private void g() {
        Iterator it = this.f43790g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f43803c.isEmpty()) {
                b bVar = this.f43789f.get(cVar);
                if (bVar != null) {
                    bVar.f43798a.disable(bVar.f43799b);
                }
                it.remove();
            }
        }
    }

    private void k(c cVar) {
        if (cVar.f43805e && cVar.f43803c.isEmpty()) {
            b remove = this.f43789f.remove(cVar);
            remove.getClass();
            T t2 = remove.f43799b;
            InterfaceC3018x interfaceC3018x = remove.f43798a;
            interfaceC3018x.releaseSource(t2);
            a aVar = remove.f43800c;
            interfaceC3018x.removeEventListener(aVar);
            interfaceC3018x.removeDrmEventListener(aVar);
            this.f43790g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [F3.x$c, androidx.media3.exoplayer.T] */
    private void n(c cVar) {
        C3015u c3015u = cVar.f43801a;
        ?? r12 = new InterfaceC3018x.c() { // from class: androidx.media3.exoplayer.T
            @Override // F3.InterfaceC3018x.c
            public final void b(AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H) {
                ((K) f0.this.f43788e).U();
            }
        };
        a aVar = new a(cVar);
        this.f43789f.put(cVar, new b(c3015u, r12, aVar));
        c3015u.addEventListener(m3.N.q(null), aVar);
        c3015u.addDrmEventListener(m3.N.q(null), aVar);
        c3015u.prepareSource(r12, this.f43795l, this.f43784a);
    }

    private void r(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            ArrayList arrayList = this.f43785b;
            c cVar = (c) arrayList.remove(i13);
            this.f43787d.remove(cVar.f43802b);
            int i14 = -cVar.f43801a.l().getWindowCount();
            for (int i15 = i13; i15 < arrayList.size(); i15++) {
                ((c) arrayList.get(i15)).f43804d += i14;
            }
            cVar.f43805e = true;
            if (this.f43794k) {
                k(cVar);
            }
        }
    }

    public final AbstractC7252H d(int i11, List<c> list, F3.W w11) {
        if (!list.isEmpty()) {
            this.f43793j = w11;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                c cVar = list.get(i12 - i11);
                ArrayList arrayList = this.f43785b;
                if (i12 > 0) {
                    c cVar2 = (c) arrayList.get(i12 - 1);
                    cVar.f43804d = cVar2.f43801a.l().getWindowCount() + cVar2.f43804d;
                    cVar.f43805e = false;
                    cVar.f43803c.clear();
                } else {
                    cVar.f43804d = 0;
                    cVar.f43805e = false;
                    cVar.f43803c.clear();
                }
                int windowCount = cVar.f43801a.l().getWindowCount();
                for (int i13 = i12; i13 < arrayList.size(); i13++) {
                    ((c) arrayList.get(i13)).f43804d += windowCount;
                }
                arrayList.add(i12, cVar);
                this.f43787d.put(cVar.f43802b, cVar);
                if (this.f43794k) {
                    n(cVar);
                    if (this.f43786c.isEmpty()) {
                        this.f43790g.add(cVar);
                    } else {
                        b bVar = this.f43789f.get(cVar);
                        if (bVar != null) {
                            bVar.f43798a.disable(bVar.f43799b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public final C3014t e(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        Object obj = bVar.f8751a;
        int i11 = AbstractC9735a.f99007c;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        InterfaceC3018x.b a11 = bVar.a(pair.second);
        c cVar = (c) this.f43787d.get(obj2);
        cVar.getClass();
        this.f43790g.add(cVar);
        b bVar3 = this.f43789f.get(cVar);
        if (bVar3 != null) {
            bVar3.f43798a.enable(bVar3.f43799b);
        }
        cVar.f43803c.add(a11);
        C3014t createPeriod = cVar.f43801a.createPeriod(a11, bVar2, j11);
        this.f43786c.put(createPeriod, cVar);
        g();
        return createPeriod;
    }

    public final AbstractC7252H f() {
        ArrayList arrayList = this.f43785b;
        if (arrayList.isEmpty()) {
            return AbstractC7252H.EMPTY;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c cVar = (c) arrayList.get(i12);
            cVar.f43804d = i11;
            i11 += cVar.f43801a.l().getWindowCount();
        }
        return new i0(arrayList, this.f43793j);
    }

    public final F3.W h() {
        return this.f43793j;
    }

    public final int i() {
        return this.f43785b.size();
    }

    public final boolean j() {
        return this.f43794k;
    }

    public final AbstractC7252H l() {
        G10.a.c(this.f43785b.size() >= 0);
        this.f43793j = null;
        return f();
    }

    public final void m(p3.z zVar) {
        G10.a.h(!this.f43794k);
        this.f43795l = zVar;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f43785b;
            if (i11 >= arrayList.size()) {
                this.f43794k = true;
                return;
            }
            c cVar = (c) arrayList.get(i11);
            n(cVar);
            this.f43790g.add(cVar);
            i11++;
        }
    }

    public final void o() {
        HashMap<c, b> hashMap = this.f43789f;
        for (b bVar : hashMap.values()) {
            try {
                bVar.f43798a.releaseSource(bVar.f43799b);
            } catch (RuntimeException e11) {
                m3.s.d("MediaSourceList", "Failed to release child source.", e11);
            }
            InterfaceC3018x interfaceC3018x = bVar.f43798a;
            a aVar = bVar.f43800c;
            interfaceC3018x.removeEventListener(aVar);
            bVar.f43798a.removeDrmEventListener(aVar);
        }
        hashMap.clear();
        this.f43790g.clear();
        this.f43794k = false;
    }

    public final void p(InterfaceC3017w interfaceC3017w) {
        IdentityHashMap<InterfaceC3017w, c> identityHashMap = this.f43786c;
        c remove = identityHashMap.remove(interfaceC3017w);
        remove.getClass();
        remove.f43801a.releasePeriod(interfaceC3017w);
        remove.f43803c.remove(((C3014t) interfaceC3017w).f8724a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        k(remove);
    }

    public final AbstractC7252H q(int i11, int i12, F3.W w11) {
        G10.a.c(i11 >= 0 && i11 <= i12 && i12 <= this.f43785b.size());
        this.f43793j = w11;
        r(i11, i12);
        return f();
    }

    public final AbstractC7252H s(List<c> list, F3.W w11) {
        ArrayList arrayList = this.f43785b;
        r(0, arrayList.size());
        return d(arrayList.size(), list, w11);
    }

    public final AbstractC7252H t(F3.W w11) {
        int size = this.f43785b.size();
        if (w11.getLength() != size) {
            w11 = w11.d().g(size);
        }
        this.f43793j = w11;
        return f();
    }

    public final AbstractC7252H u(int i11, int i12, List<C7275q> list) {
        ArrayList arrayList = this.f43785b;
        G10.a.c(i11 >= 0 && i11 <= i12 && i12 <= arrayList.size());
        G10.a.c(list.size() == i12 - i11);
        for (int i13 = i11; i13 < i12; i13++) {
            ((c) arrayList.get(i13)).f43801a.updateMediaItem(list.get(i13 - i11));
        }
        return f();
    }
}
