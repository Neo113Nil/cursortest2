package game.betting133.sports1xbet.aqua_network;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaMatchDigest {
    public static final int $stable = 8;
    private final AquaMatchTicket focus_par_Match;
    private final List<AquaMatchMoment> recent_par_Moments;
    private final List<AquaShapeBundle> shape_par_Cards;
    private final List<AquaStatBundle> statS_par_heets;

    public AquaMatchDigest(AquaMatchTicket aquaMatchTicket, List<AquaMatchMoment> list, List<AquaStatBundle> list2, List<AquaShapeBundle> list3) {
        l.f("focus_par_Match", aquaMatchTicket);
        l.f("recent_par_Moments", list);
        l.f("statS_par_heets", list2);
        l.f("shape_par_Cards", list3);
        this.focus_par_Match = aquaMatchTicket;
        this.recent_par_Moments = list;
        this.statS_par_heets = list2;
        this.shape_par_Cards = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaMatchDigest copy$default(AquaMatchDigest aquaMatchDigest, AquaMatchTicket aquaMatchTicket, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaMatchTicket = aquaMatchDigest.focus_par_Match;
        }
        if ((i & 2) != 0) {
            list = aquaMatchDigest.recent_par_Moments;
        }
        if ((i & 4) != 0) {
            list2 = aquaMatchDigest.statS_par_heets;
        }
        if ((i & 8) != 0) {
            list3 = aquaMatchDigest.shape_par_Cards;
        }
        return aquaMatchDigest.copy(aquaMatchTicket, list, list2, list3);
    }

    public final AquaMatchTicket component1() {
        return this.focus_par_Match;
    }

    public final List<AquaMatchMoment> component2() {
        return this.recent_par_Moments;
    }

    public final List<AquaStatBundle> component3() {
        return this.statS_par_heets;
    }

    public final List<AquaShapeBundle> component4() {
        return this.shape_par_Cards;
    }

    public final AquaMatchDigest copy(AquaMatchTicket aquaMatchTicket, List<AquaMatchMoment> list, List<AquaStatBundle> list2, List<AquaShapeBundle> list3) {
        l.f("focus_par_Match", aquaMatchTicket);
        l.f("recent_par_Moments", list);
        l.f("statS_par_heets", list2);
        l.f("shape_par_Cards", list3);
        return new AquaMatchDigest(aquaMatchTicket, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaMatchDigest)) {
            return false;
        }
        AquaMatchDigest aquaMatchDigest = (AquaMatchDigest) obj;
        return l.a(this.focus_par_Match, aquaMatchDigest.focus_par_Match) && l.a(this.recent_par_Moments, aquaMatchDigest.recent_par_Moments) && l.a(this.statS_par_heets, aquaMatchDigest.statS_par_heets) && l.a(this.shape_par_Cards, aquaMatchDigest.shape_par_Cards);
    }

    public final AquaMatchTicket getFocus_par_Match() {
        return this.focus_par_Match;
    }

    public final List<AquaMatchMoment> getRecent_par_Moments() {
        return this.recent_par_Moments;
    }

    public final List<AquaShapeBundle> getShape_par_Cards() {
        return this.shape_par_Cards;
    }

    public final List<AquaStatBundle> getStatS_par_heets() {
        return this.statS_par_heets;
    }

    public int hashCode() {
        return this.shape_par_Cards.hashCode() + ((this.statS_par_heets.hashCode() + ((this.recent_par_Moments.hashCode() + (this.focus_par_Match.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AquaMatchDigest(focus_par_Match=" + this.focus_par_Match + ", recent_par_Moments=" + this.recent_par_Moments + ", statS_par_heets=" + this.statS_par_heets + ", shape_par_Cards=" + this.shape_par_Cards + ")";
    }
}
