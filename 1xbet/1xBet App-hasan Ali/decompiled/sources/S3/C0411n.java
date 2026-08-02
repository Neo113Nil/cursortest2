package S3;

import A.C0003c;
import M.p0;
import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0314r0;
import game.betting133.sports1xbet.aqua_network.AquaBenchCard;
import game.betting133.sports1xbet.aqua_network.AquaShapeBundle;
import java.util.List;
import n.AbstractC2107A;
import r3.AbstractC2349a;
import v.AbstractC2527w;
import z.AbstractC2685I;
import z.AbstractC2706h;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411n implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5527k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5529m;

    public /* synthetic */ C0411n(int i, Object obj, Object obj2) {
        this.f5527k = i;
        this.f5528l = obj;
        this.f5529m = obj2;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        AquaBenchCard be_par_nch;
        AquaBenchCard be_par_nch2;
        b0.m mVar = b0.m.f7161k;
        int i = 0;
        W3.o oVar = W3.o.f6046a;
        Object obj4 = this.f5528l;
        Object obj5 = this.f5529m;
        switch (this.f5527k) {
            case 0:
                C0315s c0315s = (C0315s) obj2;
                int intValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue & 17) != 16 || !c0315s.B()) {
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2703e c2703e = new C2703e(8);
                    b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    C2686J a5 = AbstractC2685I.a(c2703e, b0.c.f7146t, c0315s, 6);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, b3);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21833e, a5);
                    AbstractC0329z.y(c0315s, C2752i.f21832d, l5);
                    C2751h c2751h = C2752i.f;
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h);
                    }
                    AbstractC0329z.y(c0315s, C2752i.f21831c, c5);
                    String str = null;
                    AquaShapeBundle aquaShapeBundle = (AquaShapeBundle) obj4;
                    String lay_par_out = aquaShapeBundle != null ? aquaShapeBundle.getLay_par_out() : null;
                    if (lay_par_out == null) {
                        lay_par_out = "";
                    }
                    AbstractC0412o.d(384, V3.a.f5975d, c0315s, AbstractC2107A.C(mVar, 1.0f), "HOME ".concat(lay_par_out), (aquaShapeBundle == null || (be_par_nch2 = aquaShapeBundle.getBe_par_nch()) == null) ? null : be_par_nch2.getTi_par_tle(), AbstractC2349a.D());
                    AquaShapeBundle aquaShapeBundle2 = (AquaShapeBundle) obj5;
                    String lay_par_out2 = aquaShapeBundle2 != null ? aquaShapeBundle2.getLay_par_out() : null;
                    String concat = "AWAY ".concat(lay_par_out2 != null ? lay_par_out2 : "");
                    if (aquaShapeBundle2 != null && (be_par_nch = aquaShapeBundle2.getBe_par_nch()) != null) {
                        str = be_par_nch.getTi_par_tle();
                    }
                    AbstractC0412o.d(384, V3.a.f5978h, c0315s, AbstractC2107A.C(mVar, 1.0f), concat, str, N4.b.y());
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj2;
                int intValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue2 & 17) != 16 || !c0315s2.B()) {
                    p0.a(androidx.compose.foundation.layout.c.b(mVar, 1.0f), R3.j.f5218a, V3.a.f5962A, 0.0f, 10, AbstractC2527w.a(1, i0.p.b(0.4f, V3.a.f5995z)), X.e.d(-185636739, new C0419w(i, (String) obj4, (String) obj5), c0315s2), c0315s2, 14352822, 24);
                    break;
                } else {
                    c0315s2.S();
                    break;
                }
            default:
                C0315s c0315s3 = (C0315s) obj2;
                int intValue3 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
                if ((intValue3 & 17) != 16 || !c0315s3.B()) {
                    K.a((String) obj4, ((List) obj5).size(), c0315s3, 0);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
        }
        return oVar;
    }
}
