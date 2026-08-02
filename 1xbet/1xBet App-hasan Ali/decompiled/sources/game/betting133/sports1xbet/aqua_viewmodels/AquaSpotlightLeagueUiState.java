package game.betting133.sports1xbet.aqua_viewmodels;

import X3.v;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaSpotlightLeagueUiState {
    public static final int $stable = 8;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final List<AquaCompetitionBundle> leagu_par_eRows;

    public AquaSpotlightLeagueUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaSpotlightLeagueUiState copy$default(AquaSpotlightLeagueUiState aquaSpotlightLeagueUiState, boolean z3, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = aquaSpotlightLeagueUiState.busy_arg;
        }
        if ((i & 2) != 0) {
            str = aquaSpotlightLeagueUiState.faul_par_tText;
        }
        if ((i & 4) != 0) {
            list = aquaSpotlightLeagueUiState.leagu_par_eRows;
        }
        return aquaSpotlightLeagueUiState.copy(z3, str, list);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final List<AquaCompetitionBundle> component3() {
        return this.leagu_par_eRows;
    }

    public final AquaSpotlightLeagueUiState copy(boolean z3, String str, List<AquaCompetitionBundle> list) {
        l.f("leagu_par_eRows", list);
        return new AquaSpotlightLeagueUiState(z3, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaSpotlightLeagueUiState)) {
            return false;
        }
        AquaSpotlightLeagueUiState aquaSpotlightLeagueUiState = (AquaSpotlightLeagueUiState) obj;
        return this.busy_arg == aquaSpotlightLeagueUiState.busy_arg && l.a(this.faul_par_tText, aquaSpotlightLeagueUiState.faul_par_tText) && l.a(this.leagu_par_eRows, aquaSpotlightLeagueUiState.leagu_par_eRows);
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final List<AquaCompetitionBundle> getLeagu_par_eRows() {
        return this.leagu_par_eRows;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        return this.leagu_par_eRows.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "AquaSpotlightLeagueUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", leagu_par_eRows=" + this.leagu_par_eRows + ")";
    }

    public AquaSpotlightLeagueUiState(boolean z3, String str, List<AquaCompetitionBundle> list) {
        l.f("leagu_par_eRows", list);
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.leagu_par_eRows = list;
    }

    public /* synthetic */ AquaSpotlightLeagueUiState(boolean z3, String str, List list, int i, f fVar) {
        this((i & 1) != 0 ? false : z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? v.f6090k : list);
    }
}
