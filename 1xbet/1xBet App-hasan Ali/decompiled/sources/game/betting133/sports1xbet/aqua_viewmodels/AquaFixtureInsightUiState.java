package game.betting133.sports1xbet.aqua_viewmodels;

import game.betting133.sports1xbet.aqua_network.AquaMatchDigest;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaFixtureInsightUiState {
    public static final int $stable = 8;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final AquaMatchDigest match_par_Bundle;

    public AquaFixtureInsightUiState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ AquaFixtureInsightUiState copy$default(AquaFixtureInsightUiState aquaFixtureInsightUiState, boolean z3, String str, AquaMatchDigest aquaMatchDigest, int i, Object obj) {
        if ((i & 1) != 0) {
            z3 = aquaFixtureInsightUiState.busy_arg;
        }
        if ((i & 2) != 0) {
            str = aquaFixtureInsightUiState.faul_par_tText;
        }
        if ((i & 4) != 0) {
            aquaMatchDigest = aquaFixtureInsightUiState.match_par_Bundle;
        }
        return aquaFixtureInsightUiState.copy(z3, str, aquaMatchDigest);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final AquaMatchDigest component3() {
        return this.match_par_Bundle;
    }

    public final AquaFixtureInsightUiState copy(boolean z3, String str, AquaMatchDigest aquaMatchDigest) {
        return new AquaFixtureInsightUiState(z3, str, aquaMatchDigest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaFixtureInsightUiState)) {
            return false;
        }
        AquaFixtureInsightUiState aquaFixtureInsightUiState = (AquaFixtureInsightUiState) obj;
        return this.busy_arg == aquaFixtureInsightUiState.busy_arg && l.a(this.faul_par_tText, aquaFixtureInsightUiState.faul_par_tText) && l.a(this.match_par_Bundle, aquaFixtureInsightUiState.match_par_Bundle);
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final AquaMatchDigest getMatch_par_Bundle() {
        return this.match_par_Bundle;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        AquaMatchDigest aquaMatchDigest = this.match_par_Bundle;
        return hashCode + (aquaMatchDigest != null ? aquaMatchDigest.hashCode() : 0);
    }

    public String toString() {
        return "AquaFixtureInsightUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", match_par_Bundle=" + this.match_par_Bundle + ")";
    }

    public AquaFixtureInsightUiState(boolean z3, String str, AquaMatchDigest aquaMatchDigest) {
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.match_par_Bundle = aquaMatchDigest;
    }

    public /* synthetic */ AquaFixtureInsightUiState(boolean z3, String str, AquaMatchDigest aquaMatchDigest, int i, f fVar) {
        this((i & 1) != 0 ? false : z3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : aquaMatchDigest);
    }
}
