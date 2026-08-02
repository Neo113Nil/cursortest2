package S3;

import P.AbstractC0329z;
import P.C0315s;
import P.InterfaceC0289e0;
import P.InterfaceC0314r0;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaDuelCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import game.betting133.sports1xbet.aqua_network.AquaStatBundle;
import game.betting133.sports1xbet.aqua_network.AquaStatCell;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaFixtureInsightUiState;
import i4.InterfaceC2015a;
import java.util.LinkedHashMap;
import java.util.List;
import n.AbstractC2107A;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2716r;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* renamed from: S3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422z implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5569k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5571m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5572n;

    public /* synthetic */ C0422z(InterfaceC2015a interfaceC2015a, Object obj, InterfaceC0289e0 interfaceC0289e0, int i) {
        this.f5569k = i;
        this.f5570l = interfaceC2015a;
        this.f5571m = obj;
        this.f5572n = interfaceC0289e0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        W3.h hVar;
        AquaClubBadge gu_par_est;
        AquaClubBadge host_arg;
        AquaClubBadge gu_par_est2;
        AquaClubBadge host_arg2;
        switch (this.f5569k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    b0.m mVar = b0.m.f7161k;
                    b0.p h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, 8, 0.0f, 13), 14, 0.0f, 2);
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
                    N4.b.v("Statistics", this.f5570l, 5, c0315s, 390, 0);
                    N4.b.t(this.f5571m, c0315s, 0);
                    InterfaceC0289e0 interfaceC0289e0 = this.f5572n;
                    if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getBusy_arg()) {
                        c0315s.X(-61783115);
                        G4.l.n(AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getFaul_par_tText() != null) {
                        c0315s.X(-61780077);
                        String faul_par_tText = ((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText);
                        G4.l.w(faul_par_tText, AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else if (((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getMatch_par_Bundle() == null) {
                        c0315s.X(-61776075);
                        G4.l.n(AbstractC2107A.B(), c0315s, 0);
                        c0315s.q(false);
                    } else {
                        c0315s.X(-1914967679);
                        AquaMatchDigest match_par_Bundle = ((AquaFixtureInsightUiState) interfaceC0289e0.getValue()).getMatch_par_Bundle();
                        kotlin.jvm.internal.l.c(match_par_Bundle);
                        AquaDuelCard duel_arg = match_par_Bundle.getFocus_par_Match().getDuel_arg();
                        Integer valueOf = (duel_arg == null || (host_arg2 = duel_arg.getHost_arg()) == null) ? null : Integer.valueOf(host_arg2.getCode_arg());
                        AquaDuelCard duel_arg2 = match_par_Bundle.getFocus_par_Match().getDuel_arg();
                        Integer valueOf2 = (duel_arg2 == null || (gu_par_est2 = duel_arg2.getGu_par_est()) == null) ? null : Integer.valueOf(gu_par_est2.getCode_arg());
                        float f = 4;
                        AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f));
                        R3.j.f(null, c0315s, 0, 1);
                        AbstractC2701c.b(c0315s, androidx.compose.foundation.layout.c.c(mVar, f));
                        AquaDuelCard duel_arg3 = match_par_Bundle.getFocus_par_Match().getDuel_arg();
                        String ti_par_tle = (duel_arg3 == null || (host_arg = duel_arg3.getHost_arg()) == null) ? null : host_arg.getTi_par_tle();
                        if (ti_par_tle == null) {
                            ti_par_tle = "";
                        }
                        AquaDuelCard duel_arg4 = match_par_Bundle.getFocus_par_Match().getDuel_arg();
                        String ti_par_tle2 = (duel_arg4 == null || (gu_par_est = duel_arg4.getGu_par_est()) == null) ? null : gu_par_est.getTi_par_tle();
                        String str = ti_par_tle2 != null ? ti_par_tle2 : "";
                        List<AquaStatBundle> statS_par_heets = match_par_Bundle.getStatS_par_heets();
                        kotlin.jvm.internal.l.f("bundles", statS_par_heets);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (AquaStatBundle aquaStatBundle : statS_par_heets) {
                            List<AquaStatCell> ce_par_lls = aquaStatBundle.getCe_par_lls();
                            if (ce_par_lls != null) {
                                for (AquaStatCell aquaStatCell : ce_par_lls) {
                                    String head_par_line = aquaStatCell.getHead_par_line();
                                    if (head_par_line != null) {
                                        W3.h hVar2 = (W3.h) linkedHashMap.get(head_par_line);
                                        if (hVar2 == null) {
                                            hVar2 = new W3.h("--", "--");
                                        }
                                        String renderMemeanstricValue = AquaDisplayFormattersKt.renderMemeanstricValue(aquaStatCell.getFig_par_ure());
                                        AquaClubBadge sq_par_uad = aquaStatBundle.getSq_par_uad();
                                        Integer valueOf3 = sq_par_uad != null ? Integer.valueOf(sq_par_uad.getCode_arg()) : null;
                                        if (kotlin.jvm.internal.l.a(valueOf3, valueOf)) {
                                            hVar = new W3.h(renderMemeanstricValue, hVar2.f6037l);
                                        } else {
                                            if (kotlin.jvm.internal.l.a(valueOf3, valueOf2)) {
                                                hVar = new W3.h(hVar2.f6036k, renderMemeanstricValue);
                                            }
                                            linkedHashMap.put(head_par_line, hVar2);
                                        }
                                        hVar2 = hVar;
                                        linkedHashMap.put(head_par_line, hVar2);
                                    }
                                }
                            }
                        }
                        N4.b.J(ti_par_tle, str, linkedHashMap, AbstractC2107A.B(), c0315s, 0);
                        c0315s = c0315s;
                        c0315s.q(false);
                    }
                    c0315s.q(true);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    b0.m mVar2 = b0.m.f7161k;
                    b0.p h4 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.f6868c, 0.0f, 8, 0.0f, 13), 14, 0.0f, 2);
                    C2717s a6 = AbstractC2716r.a(AbstractC2706h.f21535b, b0.c.f7148v, c0315s2, 0);
                    int p6 = AbstractC0329z.p(c0315s2);
                    InterfaceC0314r0 l6 = c0315s2.l();
                    b0.p c6 = b0.a.c(c0315s2, h4);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s2.b0();
                    if (c0315s2.f4530S) {
                        c0315s2.k(c2768z2);
                    } else {
                        c0315s2.l0();
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21833e, a6);
                    AbstractC0329z.y(c0315s2, C2752i.f21832d, l6);
                    C2751h c2751h2 = C2752i.f;
                    if (c0315s2.f4530S || !kotlin.jvm.internal.l.a(c0315s2.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s2, p6, c2751h2);
                    }
                    AbstractC0329z.y(c0315s2, C2752i.f21831c, c6);
                    N4.b.v("Timeline", this.f5570l, 5, c0315s2, 390, 0);
                    N4.b.t(this.f5571m, c0315s2, 0);
                    InterfaceC0289e0 interfaceC0289e02 = this.f5572n;
                    if (((AquaFixtureInsightUiState) interfaceC0289e02.getValue()).getBusy_arg()) {
                        c0315s2.X(1672054151);
                        G4.l.n(AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else if (((AquaFixtureInsightUiState) interfaceC0289e02.getValue()).getFaul_par_tText() != null) {
                        c0315s2.X(1672057189);
                        String faul_par_tText2 = ((AquaFixtureInsightUiState) interfaceC0289e02.getValue()).getFaul_par_tText();
                        kotlin.jvm.internal.l.c(faul_par_tText2);
                        G4.l.w(faul_par_tText2, AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    } else {
                        c0315s2.X(294269252);
                        float f5 = 4;
                        AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, f5));
                        R3.j.f(null, c0315s2, 0, 1);
                        AbstractC2701c.b(c0315s2, androidx.compose.foundation.layout.c.c(mVar2, f5));
                        AquaMatchDigest match_par_Bundle2 = ((AquaFixtureInsightUiState) interfaceC0289e02.getValue()).getMatch_par_Bundle();
                        List<AquaMatchMoment> recent_par_Moments = match_par_Bundle2 != null ? match_par_Bundle2.getRecent_par_Moments() : null;
                        if (recent_par_Moments == null) {
                            recent_par_Moments = X3.v.f6090k;
                        }
                        N4.b.C(recent_par_Moments, AbstractC2107A.B(), c0315s2, 0);
                        c0315s2.q(false);
                    }
                    c0315s2.q(true);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
