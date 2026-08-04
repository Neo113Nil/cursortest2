package A1;

import G4.C0279l;
import K4.AbstractC0315b;
import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.AbstractC0867k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.AbstractC0755a;
import p018c2.C0775v;
import p018c2.C0778y;
import p155w1.C1017n0;
import p155w1.P2;

/* JADX INFO: renamed from: A1.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f559i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f561l;

    public C0043s0(U u4, B1.h hVar, Handler handler, B1.p pVar) {
        this.f553c = pVar;
        this.f557g = u4;
        this.f560k = new p018c2.Z();
        this.f555e = new IdentityHashMap();
        this.f551a = new HashMap();
        this.f554d = new ArrayList();
        p018c2.I i7 = new p018c2.I();
        this.f558h = i7;
        B1.m mVar = new B1.m(2, (char) 0);
        this.f559i = mVar;
        this.f556f = new HashMap();
        this.j = new HashSet();
        hVar.getClass();
        p018c2.H h6 = new p018c2.H();
        h6.f10177a = handler;
        h6.f10178b = hVar;
        i7.f10181c.add(h6);
        E1.d dVar = new E1.d();
        dVar.f1902a = hVar;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
    }

    public R0 a(int i7, ArrayList arrayList, p018c2.Z z4) {
        if (!arrayList.isEmpty()) {
            this.f560k = z4;
            for (int i8 = i7; i8 < arrayList.size() + i7; i8++) {
                C0041r0 c0041r0 = (C0041r0) arrayList.get(i8 - i7);
                ArrayList arrayList2 = (ArrayList) this.f554d;
                if (i8 > 0) {
                    C0041r0 c0041r1 = (C0041r0) arrayList2.get(i8 - 1);
                    c0041r0.f547d = c0041r1.f544a.f10421o.f10399b.o() + c0041r1.f547d;
                    c0041r0.f548e = false;
                    c0041r0.f546c.clear();
                } else {
                    c0041r0.f547d = 0;
                    c0041r0.f548e = false;
                    c0041r0.f546c.clear();
                }
                int iO = c0041r0.f544a.f10421o.f10399b.o();
                for (int i9 = i8; i9 < arrayList2.size(); i9++) {
                    ((C0041r0) arrayList2.get(i9)).f547d += iO;
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
        int iO = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0041r0 c0041r0 = (C0041r0) arrayList.get(i7);
            c0041r0.f547d = iO;
            iO += c0041r0.f544a.f10421o.f10399b.o();
        }
        return new E0(arrayList, (p018c2.Z) this.f560k);
    }

    public void c() {
        K4.G g3 = (K4.G) this.f559i;
        boolean zD = g3.d();
        K4.x xVar = K4.x.f4072a;
        if (zD) {
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
        AbstractC0867k abstractC0867kH = ((C0279l) this.f555e).f2993c.h();
        K4.H h6 = (K4.H) this.j;
        h6.getClass();
        abstractC0867kH.getClass();
        h6.f3988t = abstractC0867kH;
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
            I4.i iVarE = ((C0279l) this.f555e).f2993c.e(i7);
            if (iVarE == null) {
                if (arrayDeque.size() != 0 || !h6.c() || h6.f3997b != null) {
                    break;
                    break;
                    break;
                } else {
                    h6.f3997b = h6.f4001f.b(h6.f4002g, AbstractC0315b.f3993o, h6.f4000e);
                    break;
                }
            }
            p113p3.f.O("addToWritePipeline called when pipeline is full", this.f552b && arrayDeque.size() < 10, new Object[0]);
            arrayDeque.add(iVarE);
            if (h6.c() && h6.f3987s) {
                h6.j(iVarE.f3676d);
            }
            i7 = iVarE.f3673a;
        }
        if (o()) {
            p113p3.f.O("startWriteStream() called when shouldStartWriteStream() is false.", o(), new Object[0]);
            h6.g();
        }
    }

    public void g(G4.Z z4) {
        Integer numValueOf = Integer.valueOf(z4.f2954b);
        HashMap map = this.f551a;
        if (map.containsKey(numValueOf)) {
            return;
        }
        map.put(numValueOf, z4);
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
            AbstractC0755a abstractC0755a = c0040q0.f532a;
            abstractC0755a.m(c0038p0);
            p072k1.g gVar = c0040q0.f534c;
            abstractC0755a.p(gVar);
            abstractC0755a.o(gVar);
            ((HashSet) this.j).remove(c0041r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [A1.p0, c2.E] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void i(C0041r0 c0041r0) {
        C0778y c0778y = c0041r0.f544a;
        ?? r7 = new p018c2.E() { // from class: A1.p0
            @Override // p018c2.E
            public final void a(AbstractC0755a abstractC0755a, R0 r8) {
                ((U) this.f528a.f557g).f275y.c(22);
            }
        };
        p072k1.g gVar = new p072k1.g();
        gVar.f14683d = this;
        gVar.f14681b = (p018c2.I) this.f558h;
        gVar.f14682c = (B1.m) this.f559i;
        gVar.f14680a = c0041r0;
        ((HashMap) this.f556f).put(c0041r0, new C0040q0(c0778y, r7, gVar));
        int i7 = p151v2.t.f17159a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c0778y.getClass();
        p018c2.I i8 = c0778y.f10298c;
        i8.getClass();
        p018c2.H h6 = new p018c2.H();
        h6.f10177a = handler;
        h6.f10178b = gVar;
        i8.f10181c.add(h6);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        B1.m mVar = c0778y.f10299d;
        mVar.getClass();
        E1.d dVar = new E1.d();
        dVar.f1902a = gVar;
        ((CopyOnWriteArrayList) mVar.f1016d).add(dVar);
        c0778y.i(r7, (p146u2.U) this.f561l, (B1.p) this.f553c);
    }

    public void j(p018c2.B b7) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f555e;
        C0041r0 c0041r0 = (C0041r0) identityHashMap.remove(b7);
        c0041r0.getClass();
        c0041r0.f544a.l(b7);
        c0041r0.f546c.remove(((C0775v) b7).f10406a);
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
        p113p3.f.O("Unwatching targets requires an open stream", g3.c(), new Object[0]);
        Y4.E eA = Y4.G.A();
        String str = (String) g3.f3984r.f17515c;
        eA.d();
        Y4.G.w((Y4.G) eA.f12096b, str);
        eA.d();
        Y4.G.y((Y4.G) eA.f12096b, i7);
        g3.i((Y4.G) eA.b());
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    public void m(G4.Z z4) {
        String str;
        ((Q3.o) this.f560k).e(z4.f2954b).f3960a++;
        if (z4.f2959g.isEmpty()) {
            if (z4.f2957e.compareTo(H4.n.f3332b) > 0) {
                z4 = new G4.Z(z4.f2953a, z4.f2954b, z4.f2955c, z4.f2956d, z4.f2957e, z4.f2958f, z4.f2959g, Integer.valueOf(((p033e3.h) this.f554d).a0(z4.f2954b).f14781a.size()));
            }
        } else {
            z4 = new G4.Z(z4.f2953a, z4.f2954b, z4.f2955c, z4.f2956d, z4.f2957e, z4.f2958f, z4.f2959g, Integer.valueOf(((p033e3.h) this.f554d).a0(z4.f2954b).f14781a.size()));
        }
        K4.G g3 = (K4.G) this.f559i;
        p113p3.f.O("Watching queries requires an open stream", g3.c(), new Object[0]);
        Y4.E eA = Y4.G.A();
        P2 p5 = g3.f3984r;
        String str2 = (String) p5.f17515c;
        eA.d();
        Y4.G.w((Y4.G) eA.f12096b, str2);
        Y4.w0 w0VarB = Y4.B0.B();
        E4.I i7 = z4.f2953a;
        if (i7.f()) {
            Y4.x0 x0VarZ = Y4.y0.z();
            String strX = P2.x((H4.f) p5.f17514b, i7.f2126d);
            x0VarZ.d();
            Y4.y0.v((Y4.y0) x0VarZ.f12096b, strX);
            Y4.y0 y0Var = (Y4.y0) x0VarZ.b();
            w0VarB.d();
            Y4.B0.w((Y4.B0) w0VarB.f12096b, y0Var);
        } else {
            Y4.A0 a0W = p5.w(i7);
            w0VarB.d();
            Y4.B0.v((Y4.B0) w0VarB.f12096b, a0W);
        }
        w0VarB.d();
        Y4.B0.z((Y4.B0) w0VarB.f12096b, z4.f2954b);
        AbstractC0867k abstractC0867k = z4.f2959g;
        boolean zIsEmpty = abstractC0867k.isEmpty();
        H4.n nVar = z4.f2957e;
        if (!zIsEmpty || nVar.compareTo(H4.n.f3332b) <= 0) {
            w0VarB.d();
            Y4.B0.x((Y4.B0) w0VarB.f12096b, abstractC0867k);
        } else {
            com.google.protobuf.z0 z0VarY = P2.y(nVar.f3333a);
            w0VarB.d();
            Y4.B0.y((Y4.B0) w0VarB.f12096b, z0VarY);
        }
        Integer num = z4.f2960h;
        if (num != null && (!abstractC0867k.isEmpty() || nVar.compareTo(H4.n.f3332b) > 0)) {
            com.google.protobuf.D dY = com.google.protobuf.E.y();
            int iIntValue = num.intValue();
            dY.d();
            com.google.protobuf.E.v((com.google.protobuf.E) dY.f12096b, iIntValue);
            w0VarB.d();
            Y4.B0.A((Y4.B0) w0VarB.f12096b, (com.google.protobuf.E) dY.b());
        }
        Y4.B0 b7 = (Y4.B0) w0VarB.b();
        eA.d();
        Y4.G.x((Y4.G) eA.f12096b, b7);
        G4.B b8 = z4.f2956d;
        int iOrdinal = b8.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            str = null;
        } else if (iOrdinal == 1) {
            str = "existence-filter-mismatch";
        } else if (iOrdinal == 2) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (iOrdinal != 3) {
                p113p3.f.F("Unrecognized query purpose: %s", b8);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            map = new HashMap(1);
            map.put("goog-listen-tags", str);
        }
        if (map != null) {
            eA.d();
            Y4.G.v((Y4.G) eA.f12096b).putAll(map);
        }
        g3.i((Y4.G) eA.b());
    }

    public boolean n() {
        return (!this.f552b || ((K4.G) this.f559i).d() || this.f551a.isEmpty()) ? false : true;
    }

    public boolean o() {
        return (!this.f552b || ((K4.H) this.j).d() || ((ArrayDeque) this.f561l).isEmpty()) ? false : true;
    }

    public void p() {
        p113p3.f.O("startWatchStream() called when shouldStartWatchStream() is false.", n(), new Object[0]);
        this.f560k = new Q3.o((H4.f) this.f553c, this);
        ((K4.G) this.f559i).g();
        K4.u uVar = (K4.u) this.f558h;
        if (uVar.f4065b == 0) {
            uVar.d(1);
            p113p3.f.O("onlineStateTimer shouldn't be started yet", ((C1017n0) uVar.f4067d) == null, new Object[0]);
            uVar.f4067d = ((L4.f) uVar.f4068e).b(L4.e.f4355f, 10000L, new K0(uVar, 10));
        }
    }

    public void q(int i7) {
        HashMap map = this.f551a;
        p113p3.f.O("stopListening called on target no currently watched: %d", ((G4.Z) map.remove(Integer.valueOf(i7))) != null, Integer.valueOf(i7));
        K4.G g3 = (K4.G) this.f559i;
        if (g3.c()) {
            l(i7);
        }
        if (map.isEmpty()) {
            if (!g3.c()) {
                if (this.f552b) {
                    ((K4.u) this.f558h).e(1);
                }
            } else if (g3.c() && g3.f3997b == null) {
                g3.f3997b = g3.f4001f.b(g3.f4002g, AbstractC0315b.f3993o, g3.f4000e);
            }
        }
    }

    public C0043s0(H4.f fVar, p033e3.h hVar, C0279l c0279l, K4.j jVar, L4.f fVar2, p155w1.F0 f7) {
        this.f552b = false;
        this.f553c = fVar;
        this.f554d = hVar;
        this.f555e = c0279l;
        this.f556f = jVar;
        this.f557g = f7;
        this.f551a = new HashMap();
        this.f561l = new ArrayDeque();
        C0042s c0042s = new C0042s(hVar, 23);
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
        synchronized (((ArrayList) f7.f17382e)) {
            ((ArrayList) f7.f17382e).add(j);
        }
    }
}
