package P;

import M.AbstractC0251w;
import M.C0249u;
import S3.AbstractC0412o;
import a.AbstractC0444a;
import game.betting133.sports1xbet.aqua_network.AquaActorCard;
import game.betting133.sports1xbet.aqua_network.AquaArenaCard;
import game.betting133.sports1xbet.aqua_network.AquaClockCard;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaGoalBoard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPhaseBoard;
import java.util.ArrayList;
import k4.AbstractC2036a;
import n.AbstractC2107A;
import o0.C2201e;
import o4.AbstractC2227e;
import r0.AbstractC2346c;
import t3.AbstractC2425d;
import x0.C2623i;
import z.AbstractC2685I;
import z.AbstractC2701c;
import z.AbstractC2706h;
import z.AbstractC2710l;
import z.AbstractC2716r;
import z.C2686J;
import z.C2700b;
import z.C2703e;
import z.C2717s;
import z0.C2751h;
import z0.C2752i;
import z0.C2768z;
import z0.InterfaceC2753j;

/* loaded from: classes.dex */
public final class r implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4512k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4513l;

    public /* synthetic */ r(int i, Object obj) {
        this.f4512k = i;
        this.f4513l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f4  */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v9 */
    @Override // i4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Integer gu_par_est;
        String str;
        String str2;
        String num;
        AquaArenaCard ar_par_ena;
        AquaArenaCard ar_par_ena2;
        ?? r24;
        AquaMatchMoment aquaMatchMoment;
        Integer num2;
        long j5;
        W3.o oVar;
        int p5;
        int p6;
        int p7;
        int p8;
        String head_par_line;
        AquaActorCard ac_par_tor;
        String note_arg;
        String ti_par_tle;
        Integer min_par_ute;
        Integer num3;
        Object obj4;
        Object gu_par_est2;
        i0.E e3 = i0.F.f17222a;
        b0.m mVar = b0.m.f7161k;
        Object obj5 = this.f4513l;
        W3.o oVar2 = W3.o.f6046a;
        switch (this.f4512k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0315s.P(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                c0315s.S();
                return oVar2;
            case 1:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    M.u0.b((String) obj5, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M.v0) c0315s2.j(M.w0.f3580a)).f3577o, c0315s2, 0, 3120, 55294);
                }
                return oVar2;
            case 2:
                C0315s c0315s3 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s3.B()) {
                    c0315s3.S();
                } else {
                    AquaCompetitionPocket aquaCompetitionPocket = (AquaCompetitionPocket) obj5;
                    R3.l.a(aquaCompetitionPocket != null ? aquaCompetitionPocket.getArt_par_work() : null, androidx.compose.foundation.layout.b.f(mVar, 4).c(androidx.compose.foundation.layout.c.f6868c), C2623i.f21001b, null, c0315s3, 3504);
                }
                return oVar2;
            case 3:
                C0315s c0315s4 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s4.B()) {
                    c0315s4.S();
                } else {
                    AquaMatchTicket aquaMatchTicket = (AquaMatchTicket) obj5;
                    AquaGoalBoard bo_par_ard = aquaMatchTicket.getBo_par_ard();
                    if (bo_par_ard == null || (obj3 = bo_par_ard.getHost_arg()) == null) {
                        obj3 = "--";
                    }
                    AquaGoalBoard bo_par_ard2 = aquaMatchTicket.getBo_par_ard();
                    M.u0.b(obj3 + " - " + ((bo_par_ard2 == null || (gu_par_est = bo_par_ard2.getGu_par_est()) == null) ? "--" : gu_par_est), androidx.compose.foundation.layout.b.g(mVar, 20, 12), V3.a.f5975d, AbstractC2036a.H(34), O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s4.j(M.w0.f3580a)).f3567c, c0315s4, 200112, 0, 65488);
                }
                return oVar2;
            case 4:
                C0315s c0315s5 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s5.B()) {
                    c0315s5.S();
                } else {
                    b0.p f = androidx.compose.foundation.layout.b.f(mVar, 16);
                    C2700b c2700b = AbstractC2706h.f21534a;
                    C2717s a5 = AbstractC2716r.a(new C2703e(8), b0.c.f7148v, c0315s5, 6);
                    int p9 = AbstractC0329z.p(c0315s5);
                    InterfaceC0314r0 l5 = c0315s5.l();
                    b0.p c5 = b0.a.c(c0315s5, f);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z = C2752i.f21830b;
                    c0315s5.b0();
                    if (c0315s5.f4530S) {
                        c0315s5.k(c2768z);
                    } else {
                        c0315s5.l0();
                    }
                    C2751h c2751h = C2752i.f21833e;
                    AbstractC0329z.y(c0315s5, c2751h, a5);
                    C2751h c2751h2 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s5, c2751h2, l5);
                    C2751h c2751h3 = C2752i.f;
                    if (c0315s5.f4530S || !kotlin.jvm.internal.l.a(c0315s5.M(), Integer.valueOf(p9))) {
                        AbstractC2107A.y(p9, c0315s5, p9, c2751h3);
                    }
                    C2751h c2751h4 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s5, c2751h4, c5);
                    C2686J r5 = L1.a.r(6, b0.c.f7147u, c0315s5, 54);
                    int p10 = AbstractC0329z.p(c0315s5);
                    InterfaceC0314r0 l6 = c0315s5.l();
                    b0.p c6 = b0.a.c(c0315s5, mVar);
                    c0315s5.b0();
                    if (c0315s5.f4530S) {
                        c0315s5.k(c2768z);
                    } else {
                        c0315s5.l0();
                    }
                    AbstractC0329z.y(c0315s5, c2751h, r5);
                    AbstractC0329z.y(c0315s5, c2751h2, l6);
                    if (c0315s5.f4530S || !kotlin.jvm.internal.l.a(c0315s5.M(), Integer.valueOf(p10))) {
                        AbstractC2107A.y(p10, c0315s5, p10, c2751h3);
                    }
                    AbstractC0329z.y(c0315s5, c2751h4, c6);
                    C2201e M5 = AbstractC0444a.M();
                    long j6 = V3.a.f5975d;
                    R3.j.b(M5, null, j6, 16, c0315s5, 3456);
                    M.u0.b("Match Info", null, j6, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s5.j(M.w0.f3580a)).i, c0315s5, 196998, 0, 65498);
                    c0315s5.q(true);
                    R3.j.f(null, c0315s5, 0, 1);
                    AquaMatchCard aquaMatchCard = (AquaMatchCard) obj5;
                    String d02 = X3.m.d0(X3.l.E0(new String[]{(aquaMatchCard == null || (ar_par_ena2 = aquaMatchCard.getAr_par_ena()) == null) ? null : ar_par_ena2.getTi_par_tle(), (aquaMatchCard == null || (ar_par_ena = aquaMatchCard.getAr_par_ena()) == null) ? null : ar_par_ena.getMunici_par_pality()}), ", ", null, null, null, 62);
                    if (AbstractC2227e.H0(d02)) {
                        d02 = "--";
                    }
                    AbstractC0412o.c("Venue", d02, G4.l.D(), c0315s5, 6);
                    if (aquaMatchCard == null || (str = aquaMatchCard.getOffi_par_cial()) == null) {
                        str = "N/A";
                    }
                    AbstractC0412o.c("Referee", str, AbstractC2425d.w(), c0315s5, 6);
                    if (aquaMatchCard == null || (str2 = aquaMatchCard.getZone_arg()) == null) {
                        str2 = "--";
                    }
                    AbstractC0412o.c("Timezone", str2, AbstractC0444a.N(), c0315s5, 6);
                    AbstractC0412o.c("Fixture ID", (aquaMatchCard == null || (num = Integer.valueOf(aquaMatchCard.getCode_arg()).toString()) == null) ? "--" : num, AbstractC2346c.r(), c0315s5, 6);
                    c0315s5.q(true);
                }
                return oVar2;
            case 5:
                C0315s c0315s6 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s6.B()) {
                    c0315s6.S();
                } else {
                    b0.p f5 = androidx.compose.foundation.layout.b.f(mVar, 16);
                    C2700b c2700b2 = AbstractC2706h.f21534a;
                    C2717s a6 = AbstractC2716r.a(new C2703e(8), b0.c.f7148v, c0315s6, 6);
                    int p11 = AbstractC0329z.p(c0315s6);
                    InterfaceC0314r0 l7 = c0315s6.l();
                    b0.p c7 = b0.a.c(c0315s6, f5);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z2 = C2752i.f21830b;
                    c0315s6.b0();
                    if (c0315s6.f4530S) {
                        c0315s6.k(c2768z2);
                    } else {
                        c0315s6.l0();
                    }
                    C2751h c2751h5 = C2752i.f21833e;
                    AbstractC0329z.y(c0315s6, c2751h5, a6);
                    C2751h c2751h6 = C2752i.f21832d;
                    AbstractC0329z.y(c0315s6, c2751h6, l7);
                    C2751h c2751h7 = C2752i.f;
                    if (c0315s6.f4530S || !kotlin.jvm.internal.l.a(c0315s6.M(), Integer.valueOf(p11))) {
                        AbstractC2107A.y(p11, c0315s6, p11, c2751h7);
                    }
                    C2751h c2751h8 = C2752i.f21831c;
                    AbstractC0329z.y(c0315s6, c2751h8, c7);
                    C2686J r6 = L1.a.r(6, b0.c.f7147u, c0315s6, 54);
                    int p12 = AbstractC0329z.p(c0315s6);
                    InterfaceC0314r0 l8 = c0315s6.l();
                    b0.p c8 = b0.a.c(c0315s6, mVar);
                    c0315s6.b0();
                    if (c0315s6.f4530S) {
                        c0315s6.k(c2768z2);
                    } else {
                        c0315s6.l0();
                    }
                    AbstractC0329z.y(c0315s6, c2751h5, r6);
                    AbstractC0329z.y(c0315s6, c2751h6, l8);
                    if (c0315s6.f4530S || !kotlin.jvm.internal.l.a(c0315s6.M(), Integer.valueOf(p12))) {
                        AbstractC2107A.y(p12, c0315s6, p12, c2751h7);
                    }
                    AbstractC0329z.y(c0315s6, c2751h8, c8);
                    C2201e u5 = AbstractC2346c.u();
                    long j7 = V3.a.f5975d;
                    R3.j.b(u5, null, j7, 16, c0315s6, 3456);
                    M.u0.b("Score Phases", null, j7, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s6.j(M.w0.f3580a)).i, c0315s6, 196998, 0, 65498);
                    c0315s6.q(true);
                    R3.j.f(null, c0315s6, 0, 1);
                    AquaPhaseBoard aquaPhaseBoard = (AquaPhaseBoard) obj5;
                    AbstractC0412o.e("Half-time", aquaPhaseBoard.getInterm_par_ission(), c0315s6, 6);
                    AbstractC0412o.e("Full-time", aquaPhaseBoard.getRegul_par_ation(), c0315s6, 6);
                    AquaGoalBoard ex_par_tra = aquaPhaseBoard.getEx_par_tra();
                    if (ex_par_tra == null || (ex_par_tra.getHost_arg() == null && ex_par_tra.getGu_par_est() == null)) {
                        ex_par_tra = null;
                    }
                    c0315s6.X(371443863);
                    if (ex_par_tra != null) {
                        AbstractC0412o.e("Extra time", ex_par_tra, c0315s6, 6);
                    }
                    c0315s6.q(false);
                    AquaGoalBoard shoo_par_tout = aquaPhaseBoard.getShoo_par_tout();
                    AquaGoalBoard aquaGoalBoard = (shoo_par_tout == null || (shoo_par_tout.getHost_arg() == null && shoo_par_tout.getGu_par_est() == null)) ? null : shoo_par_tout;
                    c0315s6.X(371450486);
                    if (aquaGoalBoard != null) {
                        AbstractC0412o.e("Penalties", aquaGoalBoard, c0315s6, 6);
                    }
                    c0315s6.q(false);
                    c0315s6.q(true);
                }
                return oVar2;
            case 6:
                C0315s c0315s7 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s7.B()) {
                    c0315s7.S();
                } else {
                    AquaClubBadge aquaClubBadge = (AquaClubBadge) obj5;
                    R3.l.a(aquaClubBadge != null ? aquaClubBadge.getArt_par_work() : null, androidx.compose.foundation.a.b(AbstractC0444a.n(androidx.compose.foundation.layout.b.f(mVar, 6).c(androidx.compose.foundation.layout.c.f6868c), D.e.a(4)), V3.a.f5962A, e3), C2623i.f21001b, null, c0315s7, 3120);
                }
                return oVar2;
            case 7:
                C0315s c0315s8 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s8.B()) {
                    c0315s8.S();
                    return oVar2;
                }
                b0.p f6 = androidx.compose.foundation.layout.b.f(mVar, 12);
                b0.g gVar = b0.c.f7147u;
                C2686J a7 = AbstractC2685I.a(AbstractC2706h.f21534a, gVar, c0315s8, 48);
                int p13 = AbstractC0329z.p(c0315s8);
                InterfaceC0314r0 l9 = c0315s8.l();
                b0.p c9 = b0.a.c(c0315s8, f6);
                InterfaceC2753j.f21834j.getClass();
                C2768z c2768z3 = C2752i.f21830b;
                c0315s8.b0();
                if (c0315s8.f4530S) {
                    c0315s8.k(c2768z3);
                } else {
                    c0315s8.l0();
                }
                C2751h c2751h9 = C2752i.f21833e;
                AbstractC0329z.y(c0315s8, c2751h9, a7);
                C2751h c2751h10 = C2752i.f21832d;
                AbstractC0329z.y(c0315s8, c2751h10, l9);
                C2751h c2751h11 = C2752i.f;
                if (c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p13))) {
                    AbstractC2107A.y(p13, c0315s8, p13, c2751h11);
                }
                C2751h c2751h12 = C2752i.f21831c;
                AbstractC0329z.y(c0315s8, c2751h12, c9);
                b0.p n5 = AbstractC0444a.n(androidx.compose.foundation.layout.c.f(mVar, 48), D.e.f920a);
                AquaMatchMoment aquaMatchMoment2 = (AquaMatchMoment) obj5;
                String head_par_line2 = aquaMatchMoment2.getHead_par_line();
                if (head_par_line2 != null) {
                    int hashCode = head_par_line2.hashCode();
                    ?? r242 = "--";
                    if (hashCode != 2092848) {
                        if (hashCode != 2224947) {
                            r24 = r242;
                            if (hashCode == 109788321) {
                                r24 = r242;
                                if (head_par_line2.equals("subst")) {
                                    j5 = i0.p.b(0.18f, V3.a.f5975d);
                                    aquaMatchMoment = aquaMatchMoment2;
                                    oVar = oVar2;
                                    num2 = r242;
                                }
                            }
                        } else {
                            r24 = r242;
                            if (head_par_line2.equals("Goal")) {
                                aquaMatchMoment = aquaMatchMoment2;
                                oVar = oVar2;
                                j5 = i0.p.b(0.25f, V3.a.f5979j);
                                num2 = r242;
                            }
                        }
                        j5 = V3.a.f;
                        num2 = num3;
                    } else {
                        aquaMatchMoment = aquaMatchMoment2;
                        oVar = oVar2;
                        num3 = r242;
                        if (head_par_line2.equals("Card")) {
                            j5 = i0.p.b(0.25f, V3.a.f5978h);
                            num2 = r242;
                        }
                        j5 = V3.a.f;
                        num2 = num3;
                    }
                    b0.p b3 = androidx.compose.foundation.a.b(n5, j5, e3);
                    x0.O e5 = AbstractC2710l.e(b0.c.f7141o, false);
                    p5 = AbstractC0329z.p(c0315s8);
                    InterfaceC0314r0 l10 = c0315s8.l();
                    b0.p c10 = b0.a.c(c0315s8, b3);
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.l0();
                    } else {
                        c0315s8.k(c2768z3);
                    }
                    AbstractC0329z.y(c0315s8, c2751h9, e5);
                    AbstractC0329z.y(c0315s8, c2751h10, l10);
                    if (!c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p5))) {
                        AbstractC2107A.y(p5, c0315s8, p5, c2751h11);
                    }
                    AbstractC0329z.y(c0315s8, c2751h12, c10);
                    b0.f fVar = b0.c.f7149w;
                    C2700b c2700b3 = AbstractC2706h.f21535b;
                    C2717s a8 = AbstractC2716r.a(c2700b3, fVar, c0315s8, 48);
                    p6 = AbstractC0329z.p(c0315s8);
                    InterfaceC0314r0 l11 = c0315s8.l();
                    b0.p c11 = b0.a.c(c0315s8, mVar);
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.l0();
                    } else {
                        c0315s8.k(c2768z3);
                    }
                    AbstractC0329z.y(c0315s8, c2751h9, a8);
                    AbstractC0329z.y(c0315s8, c2751h10, l11);
                    if (!c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p6))) {
                        AbstractC2107A.y(p6, c0315s8, p6, c2751h11);
                    }
                    AbstractC0329z.y(c0315s8, c2751h12, c11);
                    AquaClockCard cl_par_ock = aquaMatchMoment.getCl_par_ock();
                    String str3 = ((cl_par_ock != null || (min_par_ute = cl_par_ock.getMin_par_ute()) == null) ? num2 : min_par_ute) + "'";
                    O0.l lVar = O0.l.f4031q;
                    long j8 = V3.a.f5975d;
                    M.u0.b(str3, null, j8, AbstractC2036a.H(14), lVar, 0L, null, 0L, 0, false, 0, 0, null, c0315s8, 200064, 0, 131026);
                    R3.j.b(AbstractC2036a.y(), null, j8, 10, c0315s8, 3456);
                    c0315s8.q(true);
                    c0315s8.q(true);
                    AbstractC2701c.b(c0315s8, androidx.compose.foundation.layout.c.i(14));
                    b0.p C5 = AbstractC2107A.C(mVar, 1.0f);
                    C2717s a9 = AbstractC2716r.a(c2700b3, b0.c.f7148v, c0315s8, 0);
                    p7 = AbstractC0329z.p(c0315s8);
                    InterfaceC0314r0 l12 = c0315s8.l();
                    b0.p c12 = b0.a.c(c0315s8, C5);
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.l0();
                    } else {
                        c0315s8.k(c2768z3);
                    }
                    AbstractC0329z.y(c0315s8, c2751h9, a9);
                    AbstractC0329z.y(c0315s8, c2751h10, l12);
                    if (!c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p7))) {
                        AbstractC2107A.y(p7, c0315s8, p7, c2751h11);
                    }
                    AbstractC0329z.y(c0315s8, c2751h12, c12);
                    C2686J r7 = L1.a.r(6, gVar, c0315s8, 54);
                    p8 = AbstractC0329z.p(c0315s8);
                    InterfaceC0314r0 l13 = c0315s8.l();
                    b0.p c13 = b0.a.c(c0315s8, mVar);
                    c0315s8.b0();
                    if (c0315s8.f4530S) {
                        c0315s8.l0();
                    } else {
                        c0315s8.k(c2768z3);
                    }
                    AbstractC0329z.y(c0315s8, c2751h9, r7);
                    AbstractC0329z.y(c0315s8, c2751h10, l13);
                    if (!c0315s8.f4530S || !kotlin.jvm.internal.l.a(c0315s8.M(), Integer.valueOf(p8))) {
                        AbstractC2107A.y(p8, c0315s8, p8, c2751h11);
                    }
                    AbstractC0329z.y(c0315s8, c2751h12, c13);
                    head_par_line = aquaMatchMoment.getHead_par_line();
                    if (head_par_line == null) {
                        head_par_line = "";
                    }
                    String P02 = AbstractC2227e.P0(head_par_line, 10);
                    long j9 = V3.a.f;
                    R3.j.g(P02, null, j9, j8, null, c0315s8, 3456, 18);
                    R3.j.c("⚽", null, j9, j8, c0315s8, 3462, 2);
                    c0315s8.q(true);
                    AbstractC2701c.b(c0315s8, androidx.compose.foundation.layout.c.c(mVar, 4));
                    AquaClubBadge sq_par_uad = aquaMatchMoment.getSq_par_uad();
                    String ti_par_tle2 = sq_par_uad == null ? sq_par_uad.getTi_par_tle() : null;
                    String str4 = ti_par_tle2 != null ? "" : ti_par_tle2;
                    e1 e1Var = M.w0.f3580a;
                    M.u0.b(str4, null, ((C0249u) c0315s8.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s8.j(e1Var)).f3577o, c0315s8, 0, 0, 65530);
                    ArrayList arrayList = new ArrayList();
                    ac_par_tor = aquaMatchMoment.getAc_par_tor();
                    if (ac_par_tor != null && (ti_par_tle = ac_par_tor.getTi_par_tle()) != null) {
                        if (ti_par_tle.length() <= 0) {
                            ti_par_tle = null;
                        }
                        if (ti_par_tle != null) {
                            arrayList.add(ti_par_tle);
                        }
                    }
                    note_arg = aquaMatchMoment.getNote_arg();
                    if (note_arg != null) {
                        String str5 = !AbstractC2227e.H0(note_arg) ? note_arg : null;
                        if (str5 != null) {
                            arrayList.add(str5);
                        }
                    }
                    M.u0.b(X3.m.d0(arrayList, " - ", null, null, null, 62), null, 0L, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s8.j(e1Var)).f3573k, c0315s8, 196608, 0, 65502);
                    c0315s8.q(true);
                    R3.j.f(((z0.Z) androidx.compose.foundation.layout.c.i(1)).c(androidx.compose.foundation.layout.c.f6867b), c0315s8, 6, 0);
                    c0315s8.q(true);
                    return oVar;
                }
                r24 = "--";
                aquaMatchMoment = aquaMatchMoment2;
                oVar = oVar2;
                num3 = r24;
                j5 = V3.a.f;
                num2 = num3;
                b0.p b32 = androidx.compose.foundation.a.b(n5, j5, e3);
                x0.O e52 = AbstractC2710l.e(b0.c.f7141o, false);
                p5 = AbstractC0329z.p(c0315s8);
                InterfaceC0314r0 l102 = c0315s8.l();
                b0.p c102 = b0.a.c(c0315s8, b32);
                c0315s8.b0();
                if (c0315s8.f4530S) {
                }
                AbstractC0329z.y(c0315s8, c2751h9, e52);
                AbstractC0329z.y(c0315s8, c2751h10, l102);
                if (!c0315s8.f4530S) {
                }
                AbstractC2107A.y(p5, c0315s8, p5, c2751h11);
                AbstractC0329z.y(c0315s8, c2751h12, c102);
                b0.f fVar2 = b0.c.f7149w;
                C2700b c2700b32 = AbstractC2706h.f21535b;
                C2717s a82 = AbstractC2716r.a(c2700b32, fVar2, c0315s8, 48);
                p6 = AbstractC0329z.p(c0315s8);
                InterfaceC0314r0 l112 = c0315s8.l();
                b0.p c112 = b0.a.c(c0315s8, mVar);
                c0315s8.b0();
                if (c0315s8.f4530S) {
                }
                AbstractC0329z.y(c0315s8, c2751h9, a82);
                AbstractC0329z.y(c0315s8, c2751h10, l112);
                if (!c0315s8.f4530S) {
                }
                AbstractC2107A.y(p6, c0315s8, p6, c2751h11);
                AbstractC0329z.y(c0315s8, c2751h12, c112);
                AquaClockCard cl_par_ock2 = aquaMatchMoment.getCl_par_ock();
                if (cl_par_ock2 != null) {
                }
                String str32 = ((cl_par_ock2 != null || (min_par_ute = cl_par_ock2.getMin_par_ute()) == null) ? num2 : min_par_ute) + "'";
                O0.l lVar2 = O0.l.f4031q;
                long j82 = V3.a.f5975d;
                M.u0.b(str32, null, j82, AbstractC2036a.H(14), lVar2, 0L, null, 0L, 0, false, 0, 0, null, c0315s8, 200064, 0, 131026);
                R3.j.b(AbstractC2036a.y(), null, j82, 10, c0315s8, 3456);
                c0315s8.q(true);
                c0315s8.q(true);
                AbstractC2701c.b(c0315s8, androidx.compose.foundation.layout.c.i(14));
                b0.p C52 = AbstractC2107A.C(mVar, 1.0f);
                C2717s a92 = AbstractC2716r.a(c2700b32, b0.c.f7148v, c0315s8, 0);
                p7 = AbstractC0329z.p(c0315s8);
                InterfaceC0314r0 l122 = c0315s8.l();
                b0.p c122 = b0.a.c(c0315s8, C52);
                c0315s8.b0();
                if (c0315s8.f4530S) {
                }
                AbstractC0329z.y(c0315s8, c2751h9, a92);
                AbstractC0329z.y(c0315s8, c2751h10, l122);
                if (!c0315s8.f4530S) {
                }
                AbstractC2107A.y(p7, c0315s8, p7, c2751h11);
                AbstractC0329z.y(c0315s8, c2751h12, c122);
                C2686J r72 = L1.a.r(6, gVar, c0315s8, 54);
                p8 = AbstractC0329z.p(c0315s8);
                InterfaceC0314r0 l132 = c0315s8.l();
                b0.p c132 = b0.a.c(c0315s8, mVar);
                c0315s8.b0();
                if (c0315s8.f4530S) {
                }
                AbstractC0329z.y(c0315s8, c2751h9, r72);
                AbstractC0329z.y(c0315s8, c2751h10, l132);
                if (!c0315s8.f4530S) {
                }
                AbstractC2107A.y(p8, c0315s8, p8, c2751h11);
                AbstractC0329z.y(c0315s8, c2751h12, c132);
                head_par_line = aquaMatchMoment.getHead_par_line();
                if (head_par_line == null) {
                }
                String P022 = AbstractC2227e.P0(head_par_line, 10);
                long j92 = V3.a.f;
                R3.j.g(P022, null, j92, j82, null, c0315s8, 3456, 18);
                R3.j.c("⚽", null, j92, j82, c0315s8, 3462, 2);
                c0315s8.q(true);
                AbstractC2701c.b(c0315s8, androidx.compose.foundation.layout.c.c(mVar, 4));
                AquaClubBadge sq_par_uad2 = aquaMatchMoment.getSq_par_uad();
                if (sq_par_uad2 == null) {
                }
                if (ti_par_tle2 != null) {
                }
                e1 e1Var2 = M.w0.f3580a;
                M.u0.b(str4, null, ((C0249u) c0315s8.j(AbstractC0251w.f3578a)).f3543s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s8.j(e1Var2)).f3577o, c0315s8, 0, 0, 65530);
                ArrayList arrayList2 = new ArrayList();
                ac_par_tor = aquaMatchMoment.getAc_par_tor();
                if (ac_par_tor != null) {
                    if (ti_par_tle.length() <= 0) {
                    }
                    if (ti_par_tle != null) {
                    }
                }
                note_arg = aquaMatchMoment.getNote_arg();
                if (note_arg != null) {
                }
                M.u0.b(X3.m.d0(arrayList2, " - ", null, null, null, 62), null, 0L, 0L, O0.l.f4030p, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s8.j(e1Var2)).f3573k, c0315s8, 196608, 0, 65502);
                c0315s8.q(true);
                R3.j.f(((z0.Z) androidx.compose.foundation.layout.c.i(1)).c(androidx.compose.foundation.layout.c.f6867b), c0315s8, 6, 0);
                c0315s8.q(true);
                return oVar;
            case 8:
                C0315s c0315s9 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s9.B()) {
                    c0315s9.S();
                } else {
                    Object obj6 = "-";
                    AquaGoalBoard aquaGoalBoard2 = (AquaGoalBoard) obj5;
                    if (aquaGoalBoard2 == null || (obj4 = aquaGoalBoard2.getHost_arg()) == null) {
                        obj4 = "-";
                    }
                    if (aquaGoalBoard2 != null && (gu_par_est2 = aquaGoalBoard2.getGu_par_est()) != null) {
                        obj6 = gu_par_est2;
                    }
                    M.u0.b(obj4 + ":" + obj6, androidx.compose.foundation.layout.b.g(mVar, 14, 8), V3.a.f5975d, 0L, O0.l.f4031q, 0L, null, 0L, 0, false, 0, 0, ((M.v0) c0315s9.j(M.w0.f3580a)).f3571h, c0315s9, 197040, 0, 65496);
                }
                return oVar2;
            case 9:
                C0315s c0315s10 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s10.B()) {
                    c0315s10.S();
                } else {
                    x0.O e6 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p14 = AbstractC0329z.p(c0315s10);
                    InterfaceC0314r0 l14 = c0315s10.l();
                    b0.p c14 = b0.a.c(c0315s10, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z4 = C2752i.f21830b;
                    c0315s10.b0();
                    if (c0315s10.f4530S) {
                        c0315s10.k(c2768z4);
                    } else {
                        c0315s10.l0();
                    }
                    AbstractC0329z.y(c0315s10, C2752i.f21833e, e6);
                    AbstractC0329z.y(c0315s10, C2752i.f21832d, l14);
                    C2751h c2751h13 = C2752i.f;
                    if (c0315s10.f4530S || !kotlin.jvm.internal.l.a(c0315s10.M(), Integer.valueOf(p14))) {
                        AbstractC2107A.y(p14, c0315s10, p14, c2751h13);
                    }
                    AbstractC0329z.y(c0315s10, C2752i.f21831c, c14);
                    AquaCompetitionCard compe_par_tition = ((AquaCompetitionBundle) obj5).getCompe_par_tition();
                    R3.l.a(compe_par_tition != null ? compe_par_tition.getArt_par_work() : null, androidx.compose.foundation.layout.c.f(mVar, 36), C2623i.f21001b, null, c0315s10, 3504);
                    c0315s10.q(true);
                }
                return oVar2;
            default:
                C0315s c0315s11 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s11.B()) {
                    c0315s11.S();
                } else {
                    x0.O e7 = AbstractC2710l.e(b0.c.f7141o, false);
                    int p15 = AbstractC0329z.p(c0315s11);
                    InterfaceC0314r0 l15 = c0315s11.l();
                    b0.p c15 = b0.a.c(c0315s11, mVar);
                    InterfaceC2753j.f21834j.getClass();
                    C2768z c2768z5 = C2752i.f21830b;
                    c0315s11.b0();
                    if (c0315s11.f4530S) {
                        c0315s11.k(c2768z5);
                    } else {
                        c0315s11.l0();
                    }
                    AbstractC0329z.y(c0315s11, C2752i.f21833e, e7);
                    AbstractC0329z.y(c0315s11, C2752i.f21832d, l15);
                    C2751h c2751h14 = C2752i.f;
                    if (c0315s11.f4530S || !kotlin.jvm.internal.l.a(c0315s11.M(), Integer.valueOf(p15))) {
                        AbstractC2107A.y(p15, c0315s11, p15, c2751h14);
                    }
                    AbstractC0329z.y(c0315s11, C2752i.f21831c, c15);
                    AquaCompetitionCard aquaCompetitionCard = (AquaCompetitionCard) obj5;
                    R3.l.a(aquaCompetitionCard != null ? aquaCompetitionCard.getArt_par_work() : null, androidx.compose.foundation.layout.b.f(mVar, 8).c(androidx.compose.foundation.layout.c.f6868c), C2623i.f21001b, null, c0315s11, 3504);
                    c0315s11.q(true);
                }
                return oVar2;
        }
    }
}
