package S3;

import android.content.res.Resources;
import game.betting133.sports1xbet.aqua_network.AquaActorCard;
import game.betting133.sports1xbet.aqua_network.AquaClockCard;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchMoment;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import java.util.Map;
import o4.AbstractC2227e;
import p4.AbstractC2277q;
import u2.AbstractC2490e;

/* renamed from: S3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0416t implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5550k;

    public /* synthetic */ C0416t(int i) {
        this.f5550k = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f5550k) {
            case 0:
                AquaMatchMoment aquaMatchMoment = (AquaMatchMoment) obj;
                kotlin.jvm.internal.l.f("it", aquaMatchMoment);
                AquaClockCard cl_par_ock = aquaMatchMoment.getCl_par_ock();
                Integer min_par_ute = cl_par_ock != null ? cl_par_ock.getMin_par_ute() : null;
                AquaActorCard ac_par_tor = aquaMatchMoment.getAc_par_tor();
                return min_par_ute + "-" + (ac_par_tor != null ? ac_par_tor.getTi_par_tle() : null) + "-" + aquaMatchMoment.getHead_par_line();
            case 1:
                AquaMatchTicket aquaMatchTicket = (AquaMatchTicket) obj;
                kotlin.jvm.internal.l.f("it", aquaMatchTicket);
                AquaMatchCard ma_par_tch = aquaMatchTicket.getMa_par_tch();
                if (ma_par_tch != null) {
                    return Integer.valueOf(ma_par_tch.getCode_arg());
                }
                return 0;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 3:
                AquaPlayerSheet aquaPlayerSheet = (AquaPlayerSheet) obj;
                kotlin.jvm.internal.l.f("it", aquaPlayerSheet);
                AquaPlayerCard ath_par_lete = aquaPlayerSheet.getAth_par_lete();
                if (ath_par_lete != null) {
                    return Integer.valueOf(ath_par_lete.getCode_arg());
                }
                return 0;
            case 4:
                AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj;
                kotlin.jvm.internal.l.f("it", aquaCompetitionBundle);
                AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
                if (compe_par_tition != null) {
                    return Integer.valueOf(compe_par_tition.getCode_arg());
                }
                return 0;
            case 5:
                kotlin.jvm.internal.l.f("it", (String) obj);
                return W3.o.f6046a;
            case 6:
                G1.I i = (G1.I) obj;
                kotlin.jvm.internal.l.f("$this$navigate", i);
                if (AbstractC2227e.H0("appR/navigator/league_spotlight")) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                i.f1867e = "appR/navigator/league_spotlight";
                i.f1866d = -1;
                i.f = false;
                return W3.o.f6046a;
            case 7:
                return new Y.d((Map) obj);
            case 8:
                return obj;
            case 9:
                synchronized (Z.l.f6208c) {
                    ?? r32 = Z.l.i;
                    int size = r32.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((i4.c) r32.get(i5)).c(obj);
                    }
                }
                return W3.o.f6046a;
            case 10:
                C0416t c0416t = Z.l.f6206a;
                return W3.o.f6046a;
            case 11:
                Resources resources = (Resources) obj;
                kotlin.jvm.internal.l.f("resources", resources);
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 12:
                return Boolean.valueOf(obj == null);
            case 13:
                a4.f fVar = (a4.f) obj;
                if (fVar instanceof AbstractC2277q) {
                    return (AbstractC2277q) fVar;
                }
                return null;
            case 14:
                return (AbstractC2490e) obj;
            default:
                return W3.o.f6046a;
        }
    }
}
