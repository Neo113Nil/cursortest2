package S3;

import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureScheduleUiState;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2681E;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class J implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5387k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5388l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5389m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5390n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.c f5391o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5392p;

    public J(int i, InterfaceC2015a interfaceC2015a, Object obj, ArrayList arrayList, i4.c cVar, InterfaceC0289e0 interfaceC0289e0) {
        this.f5387k = i;
        this.f5388l = interfaceC2015a;
        this.f5389m = obj;
        this.f5390n = arrayList;
        this.f5391o = cVar;
        this.f5392p = interfaceC0289e0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        C0315s c0315s = (C0315s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
            c0315s.S();
        } else {
            float f = 8;
            b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, f, 0.0f, 13), 12, 0.0f, 2);
            C2717s a5 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s, 0);
            int p5 = AbstractC0329z.p(c0315s);
            InterfaceC0314r0 l5 = c0315s.l();
            b0.p c5 = b0.a.c(c0315s, h3);
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
            InterfaceC0289e0 interfaceC0289e0 = this.f5392p;
            String titl_par_eLine = ((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getTitl_par_eLine();
            if (AbstractC2227e.H0(titl_par_eLine)) {
                titl_par_eLine = "Schedule";
            }
            String str2 = titl_par_eLine;
            if (((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getSelecte_par_dSeason() > 0) {
                str = "Season " + this.f5387k;
            } else {
                str = null;
            }
            G4.l.L(str2, this.f5388l, str, 3, c0315s, 3072, 0);
            K.c(this.f5389m, c0315s, 0);
            if (((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                c0315s.X(-1690621786);
                G4.l.n(AbstractC2107A.B(), c0315s, 0);
                c0315s.q(false);
            } else if (((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                c0315s.X(-1690618748);
                String faul_par_tText = ((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                kotlin.jvm.internal.l.c(faul_par_tText);
                G4.l.w(faul_par_tText, AbstractC2107A.B(), c0315s, 0);
                c0315s.q(false);
            } else if (((AquaFixtureScheduleUiState) interfaceC0289e0.getValue()).getMatc_par_hRows().isEmpty()) {
                c0315s.X(-1690614720);
                G4.l.k("No matches scheduled.", AbstractC2107A.B(), c0315s, 6);
                c0315s.q(false);
            } else {
                c0315s.X(-869332113);
                C2681E a6 = androidx.compose.foundation.layout.b.a(0.0f, f, 1);
                C2703e c2703e = new C2703e(f);
                b0.p B5 = AbstractC2107A.B();
                c0315s.X(-1690602946);
                ArrayList arrayList = this.f5390n;
                boolean h4 = c0315s.h(arrayList);
                i4.c cVar = this.f5391o;
                boolean f5 = h4 | c0315s.f(cVar);
                Object M5 = c0315s.M();
                if (f5 || M5 == C0302l.f4480a) {
                    M5 = new O3.f(5, arrayList, cVar);
                    c0315s.i0(M5);
                }
                c0315s.q(false);
                G4.d.c(B5, null, a6, c2703e, null, null, false, (i4.c) M5, c0315s, 24960);
                c0315s = c0315s;
                c0315s.q(false);
            }
            c0315s.q(true);
        }
        return W3.o.f6046a;
    }
}
