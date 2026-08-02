package game.betting133.sports1xbet.aqua_viewmodels;

import L1.a;
import X3.v;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaSeasonChoiceUiState {
    public static final int $stable = 8;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final String leagu_par_eTitle;
    private final List<Integer> season_par_Choices;

    public AquaSeasonChoiceUiState() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaSeasonChoiceUiState copy$default(AquaSeasonChoiceUiState aquaSeasonChoiceUiState, boolean z3, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = aquaSeasonChoiceUiState.busy_arg;
        }
        if ((i & 2) != 0) {
            str = aquaSeasonChoiceUiState.faul_par_tText;
        }
        if ((i & 4) != 0) {
            str2 = aquaSeasonChoiceUiState.leagu_par_eTitle;
        }
        if ((i & 8) != 0) {
            list = aquaSeasonChoiceUiState.season_par_Choices;
        }
        return aquaSeasonChoiceUiState.copy(z3, str, str2, list);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final String component3() {
        return this.leagu_par_eTitle;
    }

    public final List<Integer> component4() {
        return this.season_par_Choices;
    }

    public final AquaSeasonChoiceUiState copy(boolean z3, String str, String str2, List<Integer> list) {
        l.f("leagu_par_eTitle", str2);
        l.f("season_par_Choices", list);
        return new AquaSeasonChoiceUiState(z3, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaSeasonChoiceUiState)) {
            return false;
        }
        AquaSeasonChoiceUiState aquaSeasonChoiceUiState = (AquaSeasonChoiceUiState) obj;
        return this.busy_arg == aquaSeasonChoiceUiState.busy_arg && l.a(this.faul_par_tText, aquaSeasonChoiceUiState.faul_par_tText) && l.a(this.leagu_par_eTitle, aquaSeasonChoiceUiState.leagu_par_eTitle) && l.a(this.season_par_Choices, aquaSeasonChoiceUiState.season_par_Choices);
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final String getLeagu_par_eTitle() {
        return this.leagu_par_eTitle;
    }

    public final List<Integer> getSeason_par_Choices() {
        return this.season_par_Choices;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        return this.season_par_Choices.hashCode() + a.i((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.leagu_par_eTitle);
    }

    public String toString() {
        return "AquaSeasonChoiceUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", leagu_par_eTitle=" + this.leagu_par_eTitle + ", season_par_Choices=" + this.season_par_Choices + ")";
    }

    public AquaSeasonChoiceUiState(boolean z3, String str, String str2, List<Integer> list) {
        l.f("leagu_par_eTitle", str2);
        l.f("season_par_Choices", list);
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.leagu_par_eTitle = str2;
        this.season_par_Choices = list;
    }

    public /* synthetic */ AquaSeasonChoiceUiState(boolean z3, String str, String str2, List list, int i, f fVar) {
        this((i & 1) != 0 ? false : z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? v.f6090k : list);
    }
}
