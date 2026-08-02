package game.betting133.sports1xbet.aqua_viewmodels;

import game.betting133.sports1xbet.aqua_network.AquaRosterDigest;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaSquadRosterUiState {
    public static final int $stable = 8;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final AquaRosterDigest roster_par_Bundle;

    public AquaSquadRosterUiState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ AquaSquadRosterUiState copy$default(AquaSquadRosterUiState aquaSquadRosterUiState, boolean z3, String str, AquaRosterDigest aquaRosterDigest, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = aquaSquadRosterUiState.busy_arg;
        }
        if ((i & 2) != 0) {
            str = aquaSquadRosterUiState.faul_par_tText;
        }
        if ((i & 4) != 0) {
            aquaRosterDigest = aquaSquadRosterUiState.roster_par_Bundle;
        }
        return aquaSquadRosterUiState.copy(z3, str, aquaRosterDigest);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final AquaRosterDigest component3() {
        return this.roster_par_Bundle;
    }

    public final AquaSquadRosterUiState copy(boolean z3, String str, AquaRosterDigest aquaRosterDigest) {
        return new AquaSquadRosterUiState(z3, str, aquaRosterDigest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaSquadRosterUiState)) {
            return false;
        }
        AquaSquadRosterUiState aquaSquadRosterUiState = (AquaSquadRosterUiState) obj;
        return this.busy_arg == aquaSquadRosterUiState.busy_arg && l.a(this.faul_par_tText, aquaSquadRosterUiState.faul_par_tText) && l.a(this.roster_par_Bundle, aquaSquadRosterUiState.roster_par_Bundle);
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final AquaRosterDigest getRoster_par_Bundle() {
        return this.roster_par_Bundle;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        AquaRosterDigest aquaRosterDigest = this.roster_par_Bundle;
        return hashCode + (aquaRosterDigest != null ? aquaRosterDigest.hashCode() : 0);
    }

    public String toString() {
        return "AquaSquadRosterUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", roster_par_Bundle=" + this.roster_par_Bundle + ")";
    }

    public AquaSquadRosterUiState(boolean z3, String str, AquaRosterDigest aquaRosterDigest) {
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.roster_par_Bundle = aquaRosterDigest;
    }

    public /* synthetic */ AquaSquadRosterUiState(boolean z3, String str, AquaRosterDigest aquaRosterDigest, int i, f fVar) {
        this((i & 1) != 0 ? false : z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : aquaRosterDigest);
    }
}
