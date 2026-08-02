package L;

import A0.C0040k0;
import P.AbstractC0329z;
import P.C0305m0;
import P.G0;
import P.InterfaceC0289e0;
import android.view.ViewGroup;
import i0.AbstractC1998c;
import i0.InterfaceC2009n;
import java.util.LinkedHashMap;
import k0.C2022b;
import k4.AbstractC2036a;
import v.U;
import z0.C2733I;

/* renamed from: L.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213a implements G0, s, U {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2909k;

    /* renamed from: l, reason: collision with root package name */
    public final A.v f2910l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2911m;

    /* renamed from: n, reason: collision with root package name */
    public final float f2912n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0289e0 f2913o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0289e0 f2914p;

    /* renamed from: q, reason: collision with root package name */
    public final ViewGroup f2915q;

    /* renamed from: r, reason: collision with root package name */
    public r f2916r;

    /* renamed from: s, reason: collision with root package name */
    public final C0305m0 f2917s = AbstractC0329z.t(null);

    /* renamed from: t, reason: collision with root package name */
    public final C0305m0 f2918t = AbstractC0329z.t(Boolean.TRUE);

    /* renamed from: u, reason: collision with root package name */
    public long f2919u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f2920v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final C0040k0 f2921w = new C0040k0(15, this);

    public C0213a(boolean z3, float f, InterfaceC0289e0 interfaceC0289e0, InterfaceC0289e0 interfaceC0289e02, ViewGroup viewGroup) {
        this.f2909k = z3;
        this.f2910l = new A.v(new A.m(4, interfaceC0289e02), z3);
        this.f2911m = z3;
        this.f2912n = f;
        this.f2913o = interfaceC0289e0;
        this.f2914p = interfaceC0289e02;
        this.f2915q = viewGroup;
    }

    @Override // L.s
    public final void Y() {
        this.f2917s.setValue(null);
    }

    @Override // v.U
    public final void b(C2733I c2733i) {
        C2022b c2022b = c2733i.f21647k;
        this.f2919u = c2022b.f17540l.A();
        float f = this.f2912n;
        this.f2920v = Float.isNaN(f) ? AbstractC2036a.U(q.a(c2733i, this.f2911m, c2022b.f17540l.A())) : c2733i.K(f);
        long j5 = ((i0.p) this.f2913o.getValue()).f17295a;
        float f5 = ((h) this.f2914p.getValue()).f2939d;
        c2733i.a();
        this.f2910l.d(c2733i, Float.isNaN(f) ? q.a(c2733i, this.f2909k, c2733i.d()) : c2733i.y(f), j5);
        InterfaceC2009n v4 = c2022b.f17540l.v();
        ((Boolean) this.f2918t.getValue()).booleanValue();
        t tVar = (t) this.f2917s.getValue();
        if (tVar != null) {
            tVar.e(f5, c2022b.f17540l.A(), j5);
            tVar.draw(AbstractC1998c.a(v4));
        }
    }

    @Override // P.G0
    public final void c() {
        r rVar = this.f2916r;
        if (rVar != null) {
            Y();
            G.v vVar = rVar.f2969n;
            t tVar = (t) ((LinkedHashMap) vVar.f1749l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.f1749l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f2968m.add(tVar);
            }
        }
    }

    @Override // P.G0
    public final void e() {
        r rVar = this.f2916r;
        if (rVar != null) {
            Y();
            G.v vVar = rVar.f2969n;
            t tVar = (t) ((LinkedHashMap) vVar.f1749l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.f1749l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f2968m.add(tVar);
            }
        }
    }

    @Override // P.G0
    public final void a() {
    }
}
