package S3;

import M.p0;
import M.u0;
import M.v0;
import M.w0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import P.e1;
import a.AbstractC0444a;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.ads.Jt;
import game.betting133.sports1xbet.aqua_network.AquaFinishingCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaSeasonLedger;
import game.betting133.sports1xbet.aqua_network.AquaUsageCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogUiState;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2200d;
import o0.C2201e;
import o0.C2202f;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import v.AbstractC2527w;
import v.q0;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419w implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5555k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5556l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5557m;

    public /* synthetic */ C0419w(int i, Object obj, Object obj2) {
        this.f5555k = i;
        this.f5556l = obj;
        this.f5557m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x023e, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0682  */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        DisplayMetrics displayMetrics;
        String str;
        long j5;
        String str2;
        AquaFinishingCard fini_par_shing;
        AquaUsageCard us_par_age;
        AquaFinishingCard fini_par_shing2;
        AquaUsageCard us_par_age2;
        b0.m mVar = b0.m.f7161k;
        W3.o oVar = W3.o.f6046a;
        Object obj3 = this.f5556l;
        Object obj4 = this.f5557m;
        switch (this.f5555k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s.B()) {
                    b0.p f = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.b(mVar, 1.0f), 14);
                    O3.m mVar2 = AbstractC2706h.f21538e;
                    b0.g gVar = b0.c.f7147u;
                    C2686J a5 = AbstractC2685I.a(mVar2, gVar, c0315s, 54);
                    int p5 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l5 = c0315s.l();
                    b0.p c5 = b0.a.c(c0315s, f);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    C2751h c2751h = C2752i.f21833e;
                    AbstractC0329z.y(c0315s, c2751h, a5);
                    C2751h c2751h2 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s, c2751h2, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s, p5, c2751h3);
                    }
                    C2751h c2751h4 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s, c2751h4, c5);
                    float f5 = 4;
                    C2686J r5 = L1.a.r(f5, gVar, c0315s, 54);
                    int p6 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l6 = c0315s.l();
                    b0.p c6 = b0.a.c(c0315s, mVar);
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, c2751h, r5);
                    AbstractC0329z.y(c0315s, c2751h2, l6);
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s, p6, c2751h3);
                    }
                    AbstractC0329z.y(c0315s, c2751h4, c6);
                    C2201e u5 = AbstractC2346c.u();
                    long j6 = V3.a.f5975d;
                    R3.j.b(u5, null, j6, 14, c0315s, 3456);
                    e1 e1Var = w0.f3580a;
                    K0.O o5 = ((v0) c0315s.j(e1Var)).f3575m;
                    O0.l lVar = O0.l.f4030p;
                    u0.b((String) obj3, null, j6, 0L, lVar, 0L, null, 0L, 0, false, 0, 0, o5, c0315s, 196992, 0, 65498);
                    c0315s.q(true);
                    R3.j.g("VS", null, V3.a.f, j6, null, c0315s, 3462, 18);
                    C2686J r6 = L1.a.r(f5, gVar, c0315s, 54);
                    int p7 = AbstractC0329z.p(c0315s);
                    InterfaceC0314r0 l7 = c0315s.l();
                    b0.p c7 = b0.a.c(c0315s, mVar);
                    c0315s.b0();
                    if (c0315s.f4530S) {
                        c0315s.k(c2768z);
                    } else {
                        c0315s.l0();
                    }
                    AbstractC0329z.y(c0315s, c2751h, r6);
                    AbstractC0329z.y(c0315s, c2751h2, l7);
                    if (c0315s.f4530S || !kotlin.jvm.internal.l.a(c0315s.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s, p7, c2751h3);
                    }
                    AbstractC0329z.y(c0315s, c2751h4, c7);
                    K0.O o6 = ((v0) c0315s.j(e1Var)).f3575m;
                    long j7 = V3.a.f5978h;
                    u0.b((String) obj4, null, j7, 0L, lVar, 0L, null, 0L, 0, false, 0, 0, o6, c0315s, 196992, 0, 65498);
                    R3.j.b(N4.b.y(), null, j7, 14, c0315s, 3456);
                    c0315s.q(true);
                    c0315s.q(true);
                    break;
                } else {
                    c0315s.S();
                    break;
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                    break;
                } else {
                    float f6 = 14;
                    b0.p g5 = androidx.compose.foundation.layout.b.g(q0.e(androidx.compose.foundation.layout.c.f6868c, q0.c(c0315s2)), f6, f6);
                    C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p8 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l8 = c0315s2.l();
                    b0.p c8 = b0.a.c(c0315s2, g5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    C2751h c2751h5 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s2, c2751h5, a6);
                    C2751h c2751h6 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s2, c2751h6, l8);
                    C2751h c2751h7 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p8))) {
                        AbstractC2107A.y(p8, c0315s2, p8, c2751h7);
                    }
                    C2751h c2751h8 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s2, c2751h8, c8);
                    AbstractC0444a.P(0, c0315s2);
                    float f7 = 16;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f7));
                    b0.p b3 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    float f8 = 8;
                    C2703e c2703e = new C2703e(f8);
                    b0.g gVar2 = b0.c.f7146t;
                    C2686J a7 = AbstractC2685I.a(c2703e, gVar2, c0315s2, 6);
                    int p9 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l9 = c0315s2.l();
                    b0.p c9 = b0.a.c(c0315s2, b3);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, a7);
                    AbstractC0329z.y(c0315s2, c2751h6, l9);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p9))) {
                        AbstractC2107A.y(p9, c0315s2, p9, c2751h7);
                    }
                    AbstractC0329z.y(c0315s2, c2751h8, c9);
                    C2201e u6 = AbstractC2346c.u();
                    long j8 = V3.a.f5975d;
                    AbstractC0444a.U(3504, j8, c0315s2, AbstractC2107A.C(mVar, 1.0f), "LIVE", "Matches", u6);
                    AbstractC0444a.U(3504, V3.a.f5978h, c0315s2, AbstractC2107A.C(mVar, 1.0f), "12+", "Leagues", AbstractC0444a.M());
                    AbstractC0444a.U(3504, j8, c0315s2, AbstractC2107A.C(mVar, 1.0f), "500+", "Players", G4.d.u());
                    c0315s2.q(true);
                    float f9 = 12;
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f9));
                    R3.j.f(null, c0315s2, 0, 1);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f9));
                    b0.p b5 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    C2686J r7 = L1.a.r(f8, gVar2, c0315s2, 6);
                    int p10 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l10 = c0315s2.l();
                    b0.p c10 = b0.a.c(c0315s2, b5);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, r7);
                    AbstractC0329z.y(c0315s2, c2751h6, l10);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p10))) {
                        AbstractC2107A.y(p10, c0315s2, p10, c2751h7);
                    }
                    AbstractC0329z.y(c0315s2, c2751h8, c10);
                    C2201e c2201e = AbstractC2036a.f17603o;
                    if (c2201e == null) {
                        C2200d c2200d = new C2200d("Filled.TrendingUp", false);
                        int i5 = o0.z.f18603a;
                        i0.M m5 = new i0.M(i0.p.f17289b);
                        C2202f c2202f = new C2202f(0);
                        c2202f.m(16.0f, 6.0f);
                        c2202f.l(2.29f, 2.29f);
                        c2202f.l(-4.88f, 4.88f);
                        c2202f.l(-4.0f, -4.0f);
                        c2202f.k(2.0f, 16.59f);
                        c2202f.k(3.41f, 18.0f);
                        c2202f.l(6.0f, -6.0f);
                        c2202f.l(4.0f, 4.0f);
                        c2202f.l(6.3f, -6.29f);
                        c2202f.k(22.0f, 12.0f);
                        c2202f.q(6.0f);
                        c2202f.e();
                        C2200d.a(c2200d, c2202f.f18548a, m5);
                        c2201e = c2200d.b();
                        AbstractC2036a.f17603o = c2201e;
                    }
                    C2201e c2201e2 = c2201e;
                    long j9 = V3.a.f;
                    R3.j.g("Trending Now", AbstractC2107A.C(mVar, 1.0f), j9, j8, c2201e2, c0315s2, 3462, 0);
                    R3.j.g("Elite Picks", AbstractC2107A.C(mVar, 1.0f), j9, V3.a.f5985p, N4.b.y(), c0315s2, 3462, 0);
                    c0315s2.q(true);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f6));
                    b0.p d5 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.c.b(mVar, 1.0f), false, null, (InterfaceC2015a) obj3, 7);
                    D.d dVar = R3.j.f5218a;
                    float f10 = 10;
                    float f11 = 1;
                    long j10 = V3.a.f5995z;
                    p0.a(d5, dVar, V3.a.f5962A, 4, f10, AbstractC2527w.a(f11, i0.p.b(0.4f, j10)), c0.f5465b, c0315s2, 14377392, 8);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f9));
                    AbstractC0444a.J((Context) obj4, c0315s2, 0);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f6));
                    R3.j.f(null, c0315s2, 0, 1);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f9));
                    b0.p b6 = androidx.compose.foundation.layout.c.b(mVar, 1.0f);
                    C2686J r8 = L1.a.r(f8, gVar2, c0315s2, 6);
                    int p11 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l11 = c0315s2.l();
                    b0.p c11 = b0.a.c(c0315s2, b6);
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, c2751h5, r8);
                    AbstractC0329z.y(c0315s2, c2751h6, l11);
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p11))) {
                        AbstractC2107A.y(p11, c0315s2, p11, c2751h7);
                    }
                    AbstractC0329z.y(c0315s2, c2751h8, c11);
                    p0.a(AbstractC2107A.C(mVar, 1.0f), dVar, i0.p.b(0.5f, j9), 0.0f, f10, AbstractC2527w.a(f11, i0.p.b(0.3f, j10)), c0.f5466c, c0315s2, 14352816, 24);
                    p0.a(AbstractC2107A.C(mVar, 1.0f), dVar, i0.p.b(0.5f, j9), 0.0f, f10, AbstractC2527w.a(f11, i0.p.b(0.3f, j10)), c0.f5467d, c0315s2, 14352816, 24);
                    c0315s2.q(true);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f7));
                    String str3 = AbstractC2349a.f19103m;
                    Context context = (Context) c0315s2.j(AndroidCompositionLocals_androidKt.f6943b);
                    J2.i iVar = J2.i.i;
                    Jt jt = U2.e.f5861b;
                    if (context != null) {
                        if (context.getApplicationContext() != null) {
                            context = context.getApplicationContext();
                        }
                        Resources resources = context.getResources();
                        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && resources.getConfiguration() != null) {
                            i = Math.round(displayMetrics.heightPixels / displayMetrics.density);
                            J2.i iVar2 = i != -1 ? J2.i.f2713k : new J2.i(-1, Math.max(Math.min(Math.round(((-1) / 320.0f) * 50.0f), Math.min(90, Math.round(i * 0.15f))), 50));
                            iVar2.f2717d = true;
                            G4.l.j(str3, iVar2, androidx.compose.foundation.layout.c.b(mVar, 1.0f), c0315s2, 384);
                            AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f6));
                            AbstractC0444a.F(0, c0315s2);
                            c0315s2.q(true);
                            break;
                        }
                    }
                    i = -1;
                    if (i != -1) {
                    }
                    iVar2.f2717d = true;
                    G4.l.j(str3, iVar2, androidx.compose.foundation.layout.c.b(mVar, 1.0f), c0315s2, 384);
                    AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar, f6));
                    AbstractC0444a.F(0, c0315s2);
                    c0315s2.q(true);
                }
                break;
            case 2:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s3.B()) {
                    float f12 = 12;
                    b0.p f13 = androidx.compose.foundation.layout.b.f(mVar, f12);
                    b0.g gVar3 = b0.c.f7147u;
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2686J r9 = L1.a.r(f12, gVar3, c0315s3, 54);
                    int p12 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l12 = c0315s3.l();
                    b0.p c12 = b0.a.c(c0315s3, f13);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z3 = C2752i.f21830b;
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    C2751h c2751h9 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s3, c2751h9, r9);
                    C2751h c2751h10 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s3, c2751h10, l12);
                    C2751h c2751h11 = C2752i.f;
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p12))) {
                        AbstractC2107A.y(p12, c0315s3, p12, c2751h11);
                    }
                    C2751h c2751h12 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s3, c2751h12, c12);
                    D.d dVar2 = D.e.f920a;
                    long j11 = V3.a.f5962A;
                    b0.p f14 = androidx.compose.foundation.layout.c.f(mVar, 56);
                    long j12 = V3.a.f5975d;
                    AquaPlayerCard aquaPlayerCard = (AquaPlayerCard) obj3;
                    p0.a(f14, dVar2, j11, 0.0f, 0.0f, AbstractC2527w.a(1, i0.p.b(0.5f, j12)), X.e.d(1432749202, new C0401d(aquaPlayerCard, 1), c0315s3), c0315s3, 14156166, 56);
                    b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
                    float f15 = 6;
                    C2717s a8 = AbstractC2716r.a(new C2703e(f15), b0.c.f7148v, c0315s3, 6);
                    int p13 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l13 = c0315s3.l();
                    b0.p c13 = b0.a.c(c0315s3, C5);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a8);
                    AbstractC0329z.y(c0315s3, c2751h10, l13);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p13))) {
                        AbstractC2107A.y(p13, c0315s3, p13, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c13);
                    String ti_par_tle = aquaPlayerCard != null ? aquaPlayerCard.getTi_par_tle() : null;
                    if (ti_par_tle == null) {
                        ti_par_tle = "";
                    }
                    u0.b(ti_par_tle, null, 0L, 0L, O0.l.f4030p, 0L, null, 0L, 2, false, 2, 0, ((v0) c0315s3.j(w0.f3580a)).i, c0315s3, 196608, 3120, 55262);
                    C2703e c2703e2 = new C2703e(f15);
                    b0.g gVar4 = b0.c.f7146t;
                    C2686J a9 = AbstractC2685I.a(c2703e2, gVar4, c0315s3, 6);
                    int p14 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l14 = c0315s3.l();
                    b0.p c14 = b0.a.c(c0315s3, mVar);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a9);
                    AbstractC0329z.y(c0315s3, c2751h10, l14);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p14))) {
                        AbstractC2107A.y(p14, c0315s3, p14, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c14);
                    AquaSeasonLedger aquaSeasonLedger = (AquaSeasonLedger) obj4;
                    if (aquaSeasonLedger == null || (us_par_age2 = aquaSeasonLedger.getUs_par_age()) == null || (str = us_par_age2.getRole_arg()) == null || AbstractC2227e.H0(str)) {
                        str = null;
                    }
                    c0315s3.X(616731165);
                    if (str == null) {
                        j5 = j12;
                    } else {
                        j5 = j12;
                        R3.j.c(AbstractC2227e.P0(str, 8), null, V3.a.f, j5, c0315s3, 3456, 2);
                    }
                    c0315s3.q(false);
                    if (aquaPlayerCard != null && (str2 = aquaPlayerCard.getNat_par_ion()) != null) {
                        if (AbstractC2227e.H0(str2)) {
                            str2 = null;
                            break;
                        }
                    }
                    str2 = "Player";
                    R3.j.g(str2, null, V3.a.f, j5, AbstractC2425d.w(), c0315s3, 3456, 2);
                    long j13 = j5;
                    c0315s3.q(true);
                    C2686J a10 = AbstractC2685I.a(new C2703e(f12), gVar4, c0315s3, 6);
                    int p15 = AbstractC0329z.p(c0315s3);
                    InterfaceC0314r0 l15 = c0315s3.l();
                    b0.p c15 = b0.a.c(c0315s3, mVar);
                    c0315s3.b0();
                    if (c0315s3.f4530S) {
                        c0315s3.k(c2768z3);
                    } else {
                        c0315s3.l0();
                    }
                    AbstractC0329z.y(c0315s3, c2751h9, a10);
                    AbstractC0329z.y(c0315s3, c2751h10, l15);
                    if (c0315s3.f4530S || !kotlin.jvm.internal.l.a(c0315s3.M(), Integer.valueOf(p15))) {
                        AbstractC2107A.y(p15, c0315s3, p15, c2751h11);
                    }
                    AbstractC0329z.y(c0315s3, c2751h12, c15);
                    Z.d("Goals", (aquaSeasonLedger == null || (fini_par_shing2 = aquaSeasonLedger.getFini_par_shing()) == null) ? null : fini_par_shing2.getTo_par_tal(), AbstractC2346c.u(), c0315s3, 6);
                    Z.d("Apps", (aquaSeasonLedger == null || (us_par_age = aquaSeasonLedger.getUs_par_age()) == null) ? null : us_par_age.getSh_par_ows(), AbstractC2349a.D(), c0315s3, 6);
                    Z.d("Assists", (aquaSeasonLedger == null || (fini_par_shing = aquaSeasonLedger.getFini_par_shing()) == null) ? null : fini_par_shing.getFe_par_eds(), N4.b.y(), c0315s3, 6);
                    c0315s3.q(true);
                    c0315s3.q(true);
                    M.G.a(G4.d.s(), null, androidx.compose.foundation.layout.c.f(mVar, 22), i0.p.b(0.7f, j13), c0315s3, 3504, 0);
                    c0315s3.q(true);
                    break;
                } else {
                    c0315s3.S();
                    break;
                }
                break;
            default:
                C0315s c0315s4 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !c0315s4.B()) {
                    if (((AquaTournamentCatalogUiState) ((InterfaceC0289e0) obj4).getValue()).getSearc_par_hText().length() > 0) {
                        c0315s4.X(830399414);
                        AquaTournamentCatalogViewModel aquaTournamentCatalogViewModel = (AquaTournamentCatalogViewModel) obj3;
                        boolean h3 = c0315s4.h(aquaTournamentCatalogViewModel);
                        Object M5 = c0315s4.M();
                        if (h3 || M5 == C0302l.f4480a) {
                            M5 = new O3.l(3, aquaTournamentCatalogViewModel);
                            c0315s4.i0(M5);
                        }
                        c0315s4.q(false);
                        M.g0.c((InterfaceC2015a) M5, null, false, null, h0.f5498c, c0315s4, 196608, 30);
                        break;
                    }
                } else {
                    c0315s4.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
