package A1;

import G4.C0279l;
import K4.AbstractC0315b;
import android.os.Handler;
import android.os.Looper;
import c2.AbstractC0795a;
import c2.C0815v;
import c2.C0818y;
import c2.InterfaceC0794B;
import com.google.protobuf.AbstractC0911k;
import e3.C1023h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.C1726n0;
import w1.P2;

/* renamed from: A1.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043s0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f551a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f552b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f553c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f554d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f555e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f556f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f557g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f558h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f559i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f560k;

    /* renamed from: l, reason: collision with root package name */
    public Object f561l;

    public C0043s0(U u4, B1.h hVar, Handler handler, B1.p pVar) {
        this.f553c = pVar;
        this.f557g = u4;
        this.f560k = new c2.Z();
        this.f555e = new IdentityHashMap();
        this.f551a = new HashMap();
        this.f554d = new ArrayList();
        c2.I i7 = new c2.I();
        this.f558h = i7;
        B1.m mVar = new B1.m(2, (char) 0);
        this.f559i = mVar;
        this.f556f = new HashMap();
        this.j = new HashSet();
        hVar.getClass();
        c2.H h6 = new c2.H();
        h6.f10177a = handler;
        h6.f10178b = hVar;
        i7.f10181c.add(h6);
        E1.d dVar = new E1.d();
        dVar.f1902a = hVar;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
    }

    public R0 a(int i7, ArrayList arrayList, c2.Z z4) {
        if (!arrayList.isEmpty()) {
            this.f560k = z4;
            for (int i8 = i7; i8 < arrayList.size() + i7; i8++) {
                C0041r0 c0041r0 = (C0041r0) arrayList.get(i8 - i7);
                ArrayList arrayList2 = (ArrayList) this.f554d;
                if (i8 > 0) {
                    C0041r0 c0041r02 = (C0041r0) arrayList2.get(i8 - 1);
                    c0041r0.f547d = c0041r02.f544a.f10421o.f10399b.o() + c0041r02.f547d;
                    c0041r0.f548e = false;
                    c0041r0.f546c.clear();
                } else {
                    c0041r0.f547d = 0;
                    c0041r0.f548e = false;
                    c0041r0.f546c.clear();
                }
                int o7 = c0041r0.f544a.f10421o.f10399b.o();
                for (int i9 = i8; i9 < arrayList2.size(); i9++) {
                    ((C0041r0) arrayList2.get(i9)).f547d += o7;
                }
                arrayList2.add(i8, c0041r0);
                this.f551a.put(c0041r0.f545b, c0041r0);
                if (this.f552b) {
                    i(c0041r0);
                    if (((IdentityHashMap) this.f555e).isEmpty()) {
                        ((HashSet) this.j).add(c0041r0);
                    } else {
                        C0040q0 c0040q0 = (C0040q0) ((HashMap) this.f556f).get(c0041r0);
                        if (c0040q0 != null) {
                            c0040q0.f532a.b(c0040q0.f533b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public R0 b() {
        ArrayList arrayList = (ArrayList) this.f554d;
        if (arrayList.isEmpty()) {
            return R0.f220a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C0041r0 c0041r0 = (C0041r0) arrayList.get(i8);
            c0041r0.f547d = i7;
            i7 += c0041r0.f544a.f10421o.f10399b.o();
        }
        return new E0(arrayList, (c2.Z) this.f560k);
    }

    public void c() {
        K4.G g3 = (K4.G) this.f559i;
        boolean d7 = g3.d();
        K4.x xVar = K4.x.f4072a;
        if (d7) {
            g3.a(xVar, U5.l0.f6536e);
        }
        K4.H h6 = (K4.H) this.j;
        if (h6.d()) {
            h6.a(xVar, U5.l0.f6536e);
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f561l;
        if (!arrayDeque.isEmpty()) {
            Q0.a.v(1, "RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.f560k = null;
    }

    public void d() {
        Iterator it = ((HashSet) this.j).iterator();
        while (it.hasNext()) {
            C0041r0 c0041r0 = (C0041r0) it.next();
            if (c0041r0.f546c.isEmpty()) {
                C0040q0 c0040q0 = (C0040q0) ((HashMap) this.f556f).get(c0041r0);
                if (c0040q0 != null) {
                    c0040q0.f532a.b(c0040q0.f533b);
                }
                it.remove();
            }
        }
    }

    public void e() {
        this.f552b = true;
        AbstractC0911k h6 = ((C0279l) this.f555e).f2993c.h();
        K4.H h7 = (K4.H) this.j;
        h7.getClass();
        h6.getClass();
        h7.f3988t = h6;
        if (n()) {
            p();
        } else {
            ((K4.u) this.f558h).e(1);
        }
        f();
    }

    public void f() {
        K4.H h6;
        ArrayDeque arrayDeque = (ArrayDeque) this.f561l;
        int i7 = arrayDeque.isEmpty() ? -1 : ((I4.i) arrayDeque.getLast()).f3673a;
        while (true) {
            boolean z4 = this.f552b;
            h6 = (K4.H) this.j;
            if (!z4 || arrayDeque.size() >= 10) {
                break;
            }
            I4.i e7 = ((C0279l) this.f555e).f2993c.e(i7);
            if (e7 != null) {
                p3.f.O("addToWritePipeline called when pipeline is full", this.f552b && arrayDeque.size() < 10, new Object[0]);
                arrayDeque.add(e7);
                if (h6.c() && h6.f3987s) {
                    h6.j(e7.f3676d);
                }
                i7 = e7.f3673a;
            } else if (arrayDeque.size() == 0 && h6.c() && h6.f3997b == null) {
                h6.f3997b = h6.f4001f.b(h6.f4002g, AbstractC0315b.f3993o, h6.f4000e);
            }
        }
        if (o()) {
            p3.f.O("startWriteStream() called when shouldStartWriteStream() is false.", o(), new Object[0]);
            h6.g();
        }
    }

    public void g(G4.Z z4) {
        Integer valueOf = Integer.valueOf(z4.f2954b);
        HashMap hashMap = this.f551a;
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, z4);
        if (n()) {
            p();
        } else if (((K4.G) this.f559i).c()) {
            m(z4);
        }
    }

    public void h(C0041r0 c0041r0) {
        if (c0041r0.f548e && c0041r0.f546c.isEmpty()) {
            C0040q0 c0040q0 = (C0040q0) ((HashMap) this.f556f).remove(c0041r0);
            c0040q0.getClass();
            C0038p0 c0038p0 = c0040q0.f533b;
            AbstractC0795a abstractC0795a = c0040q0.f532a;
            abstractC0795a.m(c0038p0);
            k1.g gVar = c0040q0.f534c;
            abstractC0795a.p(gVar);
            abstractC0795a.o(gVar);
            ((HashSet) this.j).remove(c0041r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [A1.p0, c2.E] */
    public void i(C0041r0 c0041r0) {
        C0818y c0818y = c0041r0.f544a;
        ?? r12 = new c2.E() { // from class: A1.p0
            @Override // c2.E
            public final void a(AbstractC0795a abstractC0795a, R0 r02) {
                ((U) C0043s0.this.f557g).f275y.c(22);
            }
        };
        k1.g gVar = new k1.g();
        gVar.f14677d = this;
        gVar.f14675b = (c2.I) this.f558h;
        gVar.f14676c = (B1.m) this.f559i;
        gVar.f14674a = c0041r0;
        ((HashMap) this.f556f).put(c0041r0, new C0040q0(c0818y, r12, gVar));
        int i7 = v2.t.f17153a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0818y.getClass();
        c2.I i8 = c0818y.f10298c;
        i8.getClass();
        c2.H h6 = new c2.H();
        h6.f10177a = handler;
        h6.f10178b = gVar;
        i8.f10181c.add(h6);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        B1.m mVar = c0818y.f10299d;
        mVar.getClass();
        E1.d dVar = new E1.d();
        dVar.f1902a = gVar;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
        c0818y.i(r12, (u2.U) this.f561l, (B1.p) this.f553c);
    }

    public void j(InterfaceC0794B interfaceC0794B) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f555e;
        C0041r0 c0041r0 = (C0041r0) identityHashMap.remove(interfaceC0794B);
        c0041r0.getClass();
        c0041r0.f544a.l(interfaceC0794B);
        c0041r0.f546c.remove(((C0815v) interfaceC0794B).f10406a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        h(c0041r0);
    }

    public void k(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            ArrayList arrayList = (ArrayList) this.f554d;
            C0041r0 c0041r0 = (C0041r0) arrayList.remove(i9);
            this.f551a.remove(c0041r0.f545b);
            int i10 = -c0041r0.f544a.f10421o.f10399b.o();
            for (int i11 = i9; i11 < arrayList.size(); i11++) {
                ((C0041r0) arrayList.get(i11)).f547d += i10;
            }
            c0041r0.f548e = true;
            if (this.f552b) {
                h(c0041r0);
            }
        }
    }

    public void l(int i7) {
        ((Q3.o) this.f560k).e(i7).f3960a++;
        K4.G g3 = (K4.G) this.f559i;
        p3.f.O("Unwatching targets requires an open stream", g3.c(), new Object[0]);
        Y4.E A7 = Y4.G.A();
        String str = (String) g3.f3984r.f17509c;
        A7.d();
        Y4.G.w((Y4.G) A7.f12096b, str);
        A7.d();
        Y4.G.y((Y4.G) A7.f12096b, i7);
        g3.i((Y4.G) A7.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r14.f2957e.compareTo(H4.n.f3332b) > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(G4.Z z4) {
        String str;
        ((Q3.o) this.f560k).e(z4.f2954b).f3960a++;
        if (z4.f2959g.isEmpty()) {
        }
        z4 = new G4.Z(z4.f2953a, z4.f2954b, z4.f2955c, z4.f2956d, z4.f2957e, z4.f2958f, z4.f2959g, Integer.valueOf(((C1023h) this.f554d).a0(z4.f2954b).f14775a.size()));
        K4.G g3 = (K4.G) this.f559i;
        p3.f.O("Watching queries requires an open stream", g3.c(), new Object[0]);
        Y4.E A7 = Y4.G.A();
        P2 p22 = g3.f3984r;
        String str2 = (String) p22.f17509c;
        A7.d();
        Y4.G.w((Y4.G) A7.f12096b, str2);
        Y4.w0 B7 = Y4.B0.B();
        E4.I i7 = z4.f2953a;
        if (i7.f()) {
            Y4.x0 z7 = Y4.y0.z();
            String x4 = P2.x((H4.f) p22.f17508b, i7.f2126d);
            z7.d();
            Y4.y0.v((Y4.y0) z7.f12096b, x4);
            Y4.y0 y0Var = (Y4.y0) z7.b();
            B7.d();
            Y4.B0.w((Y4.B0) B7.f12096b, y0Var);
        } else {
            Y4.A0 w7 = p22.w(i7);
            B7.d();
            Y4.B0.v((Y4.B0) B7.f12096b, w7);
        }
        B7.d();
        Y4.B0.z((Y4.B0) B7.f12096b, z4.f2954b);
        AbstractC0911k abstractC0911k = z4.f2959g;
        boolean isEmpty = abstractC0911k.isEmpty();
        H4.n nVar = z4.f2957e;
        if (!isEmpty || nVar.compareTo(H4.n.f3332b) <= 0) {
            B7.d();
            Y4.B0.x((Y4.B0) B7.f12096b, abstractC0911k);
        } else {
            com.google.protobuf.z0 y4 = P2.y(nVar.f3333a);
            B7.d();
            Y4.B0.y((Y4.B0) B7.f12096b, y4);
        }
        Integer num = z4.f2960h;
        if (num != null && (!abstractC0911k.isEmpty() || nVar.compareTo(H4.n.f3332b) > 0)) {
            com.google.protobuf.D y5 = com.google.protobuf.E.y();
            int intValue = num.intValue();
            y5.d();
            com.google.protobuf.E.v((com.google.protobuf.E) y5.f12096b, intValue);
            B7.d();
            Y4.B0.A((Y4.B0) B7.f12096b, (com.google.protobuf.E) y5.b());
        }
        Y4.B0 b02 = (Y4.B0) B7.b();
        A7.d();
        Y4.G.x((Y4.G) A7.f12096b, b02);
        G4.B b7 = z4.f2956d;
        int ordinal = b7.ordinal();
        HashMap hashMap = null;
        if (ordinal == 0) {
            str = null;
        } else if (ordinal == 1) {
            str = "existence-filter-mismatch";
        } else if (ordinal == 2) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (ordinal != 3) {
                p3.f.F("Unrecognized query purpose: %s", b7);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            hashMap = new HashMap(1);
            hashMap.put("goog-listen-tags", str);
        }
        if (hashMap != null) {
            A7.d();
            Y4.G.v((Y4.G) A7.f12096b).putAll(hashMap);
        }
        g3.i((Y4.G) A7.b());
    }

    public boolean n() {
        return (!this.f552b || ((K4.G) this.f559i).d() || this.f551a.isEmpty()) ? false : true;
    }

    public boolean o() {
        return (!this.f552b || ((K4.H) this.j).d() || ((ArrayDeque) this.f561l).isEmpty()) ? false : true;
    }

    public void p() {
        p3.f.O("startWatchStream() called when shouldStartWatchStream() is false.", n(), new Object[0]);
        this.f560k = new Q3.o((H4.f) this.f553c, this);
        ((K4.G) this.f559i).g();
        K4.u uVar = (K4.u) this.f558h;
        if (uVar.f4065b == 0) {
            uVar.d(1);
            p3.f.O("onlineStateTimer shouldn't be started yet", ((C1726n0) uVar.f4067d) == null, new Object[0]);
            uVar.f4067d = ((L4.f) uVar.f4068e).b(L4.e.f4355f, 10000L, new K0(uVar, 10));
        }
    }

    public void q(int i7) {
        HashMap hashMap = this.f551a;
        p3.f.O("stopListening called on target no currently watched: %d", ((G4.Z) hashMap.remove(Integer.valueOf(i7))) != null, Integer.valueOf(i7));
        K4.G g3 = (K4.G) this.f559i;
        if (g3.c()) {
            l(i7);
        }
        if (hashMap.isEmpty()) {
            if (!g3.c()) {
                if (this.f552b) {
                    ((K4.u) this.f558h).e(1);
                }
            } else if (g3.c() && g3.f3997b == null) {
                g3.f3997b = g3.f4001f.b(g3.f4002g, AbstractC0315b.f3993o, g3.f4000e);
            }
        }
    }

    public C0043s0(H4.f fVar, C1023h c1023h, C0279l c0279l, K4.j jVar, L4.f fVar2, w1.F0 f02) {
        this.f552b = false;
        this.f553c = fVar;
        this.f554d = c1023h;
        this.f555e = c0279l;
        this.f556f = jVar;
        this.f557g = f02;
        this.f551a = new HashMap();
        this.f561l = new ArrayDeque();
        C0042s c0042s = new C0042s(c1023h, 23);
        K4.u uVar = new K4.u();
        uVar.f4068e = fVar2;
        uVar.f4069f = c0042s;
        uVar.f4064a = 1;
        uVar.f4066c = true;
        this.f558h = uVar;
        K4.v vVar = new K4.v(this);
        jVar.getClass();
        this.f559i = new K4.G(jVar.f4026c, jVar.f4025b, jVar.f4024a, vVar);
        K4.w wVar = new K4.w(this);
        this.j = new K4.H(jVar.f4026c, jVar.f4025b, jVar.f4024a, wVar);
        G4.J j = new G4.J(2, this, fVar2);
        synchronized (((ArrayList) f02.f17376e)) {
            ((ArrayList) f02.f17376e).add(j);
        }
    }
}
