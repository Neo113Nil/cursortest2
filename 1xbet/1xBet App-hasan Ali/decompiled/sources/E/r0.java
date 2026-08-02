package E;

import P.C0302l;
import P.C0315s;
import m4.InterfaceC2102e;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements i4.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f1272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.O f1273m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P0.w f1274n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1275o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f1276p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.q f1277q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0 f1278r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0116v f1279s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Z z3, I.O o5, P0.w wVar, boolean z5, boolean z6, P0.q qVar, G0 g02, C0116v c0116v, int i) {
        super(3);
        this.f1272l = z3;
        this.f1273m = o5;
        this.f1274n = wVar;
        this.f1275o = z5;
        this.f1276p = z6;
        this.f1277q = qVar;
        this.f1278r = g02;
        this.f1279s = c0116v;
        this.f1280t = i;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        ((Number) obj3).intValue();
        c0315s.X(851809892);
        Object M5 = c0315s.M();
        P.Z z3 = C0302l.f4480a;
        if (M5 == z3) {
            M5 = new I.V();
            c0315s.i0(M5);
        }
        I.V v4 = (I.V) M5;
        Object M6 = c0315s.M();
        if (M6 == z3) {
            M6 = new L();
            c0315s.i0(M6);
        }
        Z z5 = this.f1272l;
        I.O o5 = this.f1273m;
        P0.w wVar = this.f1274n;
        P0.q qVar = this.f1277q;
        G0 g02 = this.f1278r;
        p0 p0Var = new p0(z5, o5, wVar, this.f1275o, this.f1276p, v4, qVar, g02, (L) M6, this.f1279s, this.f1280t);
        boolean h3 = c0315s.h(p0Var);
        Object M7 = c0315s.M();
        if (h3 || M7 == z3) {
            q0 q0Var = new q0(1, p0Var, p0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0);
            c0315s.i0(q0Var);
            M7 = q0Var;
        }
        b0.p a5 = androidx.compose.ui.input.key.a.a((i4.c) ((InterfaceC2102e) M7));
        c0315s.q(false);
        return a5;
    }
}
