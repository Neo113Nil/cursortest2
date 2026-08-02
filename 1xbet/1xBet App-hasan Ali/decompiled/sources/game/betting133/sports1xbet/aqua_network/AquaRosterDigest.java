package game.betting133.sports1xbet.aqua_network;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaRosterDigest {
    public static final int $stable = 8;
    private final AquaClubSheet featur_par_edClub;
    private final List<AquaPlayerSheet> roster_par_Members;

    public AquaRosterDigest(AquaClubSheet aquaClubSheet, List<AquaPlayerSheet> list) {
        l.f("featur_par_edClub", aquaClubSheet);
        l.f("roster_par_Members", list);
        this.featur_par_edClub = aquaClubSheet;
        this.roster_par_Members = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaRosterDigest copy$default(AquaRosterDigest aquaRosterDigest, AquaClubSheet aquaClubSheet, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubSheet = aquaRosterDigest.featur_par_edClub;
        }
        if ((i & 2) != 0) {
            list = aquaRosterDigest.roster_par_Members;
        }
        return aquaRosterDigest.copy(aquaClubSheet, list);
    }

    public final AquaClubSheet component1() {
        return this.featur_par_edClub;
    }

    public final List<AquaPlayerSheet> component2() {
        return this.roster_par_Members;
    }

    public final AquaRosterDigest copy(AquaClubSheet aquaClubSheet, List<AquaPlayerSheet> list) {
        l.f("featur_par_edClub", aquaClubSheet);
        l.f("roster_par_Members", list);
        return new AquaRosterDigest(aquaClubSheet, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaRosterDigest)) {
            return false;
        }
        AquaRosterDigest aquaRosterDigest = (AquaRosterDigest) obj;
        return l.a(this.featur_par_edClub, aquaRosterDigest.featur_par_edClub) && l.a(this.roster_par_Members, aquaRosterDigest.roster_par_Members);
    }

    public final AquaClubSheet getFeatur_par_edClub() {
        return this.featur_par_edClub;
    }

    public final List<AquaPlayerSheet> getRoster_par_Members() {
        return this.roster_par_Members;
    }

    public int hashCode() {
        return this.roster_par_Members.hashCode() + (this.featur_par_edClub.hashCode() * 31);
    }

    public String toString() {
        return "AquaRosterDigest(featur_par_edClub=" + this.featur_par_edClub + ", roster_par_Members=" + this.roster_par_Members + ")";
    }
}
