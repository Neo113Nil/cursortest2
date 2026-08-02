package game.betting133.sports1xbet.aqua_viewmodels;

import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaAthleteProfileUiState {
    public static final int $stable = 8;
    private final AquaPlayerSheet athlet_par_ePacket;
    private final boolean busy_arg;
    private final String faul_par_tText;

    public AquaAthleteProfileUiState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ AquaAthleteProfileUiState copy$default(AquaAthleteProfileUiState aquaAthleteProfileUiState, boolean z3, String str, AquaPlayerSheet aquaPlayerSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = aquaAthleteProfileUiState.busy_arg;
        }
        if ((i & 2) != 0) {
            str = aquaAthleteProfileUiState.faul_par_tText;
        }
        if ((i & 4) != 0) {
            aquaPlayerSheet = aquaAthleteProfileUiState.athlet_par_ePacket;
        }
        return aquaAthleteProfileUiState.copy(z3, str, aquaPlayerSheet);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final AquaPlayerSheet component3() {
        return this.athlet_par_ePacket;
    }

    public final AquaAthleteProfileUiState copy(boolean z3, String str, AquaPlayerSheet aquaPlayerSheet) {
        return new AquaAthleteProfileUiState(z3, str, aquaPlayerSheet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaAthleteProfileUiState)) {
            return false;
        }
        AquaAthleteProfileUiState aquaAthleteProfileUiState = (AquaAthleteProfileUiState) obj;
        return this.busy_arg == aquaAthleteProfileUiState.busy_arg && l.a(this.faul_par_tText, aquaAthleteProfileUiState.faul_par_tText) && l.a(this.athlet_par_ePacket, aquaAthleteProfileUiState.athlet_par_ePacket);
    }

    public final AquaPlayerSheet getAthlet_par_ePacket() {
        return this.athlet_par_ePacket;
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        AquaPlayerSheet aquaPlayerSheet = this.athlet_par_ePacket;
        return hashCode + (aquaPlayerSheet != null ? aquaPlayerSheet.hashCode() : 0);
    }

    public String toString() {
        return "AquaAthleteProfileUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", athlet_par_ePacket=" + this.athlet_par_ePacket + ")";
    }

    public AquaAthleteProfileUiState(boolean z3, String str, AquaPlayerSheet aquaPlayerSheet) {
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.athlet_par_ePacket = aquaPlayerSheet;
    }

    public /* synthetic */ AquaAthleteProfileUiState(boolean z3, String str, AquaPlayerSheet aquaPlayerSheet, int i, f fVar) {
        this((i & 1) != 0 ? false : z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : aquaPlayerSheet);
    }
}
