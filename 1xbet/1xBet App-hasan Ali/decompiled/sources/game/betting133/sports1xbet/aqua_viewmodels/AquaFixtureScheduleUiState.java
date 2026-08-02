package game.betting133.sports1xbet.aqua_viewmodels;

import X3.v;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaSportsDefaults;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class AquaFixtureScheduleUiState {
    public static final int $stable = 8;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final List<AquaMatchTicket> matc_par_hRows;
    private final int selecte_par_dSeason;
    private final String titl_par_eLine;

    public AquaFixtureScheduleUiState() {
        this(null, 0, null, false, null, 31, null);
    }

    public static /* synthetic */ AquaFixtureScheduleUiState copy$default(AquaFixtureScheduleUiState aquaFixtureScheduleUiState, String str, int i, List list, boolean z3, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = aquaFixtureScheduleUiState.titl_par_eLine;
        }
        if ((i5 & 2) != 0) {
            i = aquaFixtureScheduleUiState.selecte_par_dSeason;
        }
        if ((i5 & 4) != 0) {
            list = aquaFixtureScheduleUiState.matc_par_hRows;
        }
        if ((i5 & 8) != 0) {
            z3 = aquaFixtureScheduleUiState.busy_arg;
        }
        if ((i5 & 16) != 0) {
            str2 = aquaFixtureScheduleUiState.faul_par_tText;
        }
        String str3 = str2;
        List list2 = list;
        return aquaFixtureScheduleUiState.copy(str, i, list2, z3, str3);
    }

    public final String component1() {
        return this.titl_par_eLine;
    }

    public final int component2() {
        return this.selecte_par_dSeason;
    }

    public final List<AquaMatchTicket> component3() {
        return this.matc_par_hRows;
    }

    public final boolean component4() {
        return this.busy_arg;
    }

    public final String component5() {
        return this.faul_par_tText;
    }

    public final AquaFixtureScheduleUiState copy(String str, int i, List<AquaMatchTicket> list, boolean z3, String str2) {
        l.f("titl_par_eLine", str);
        l.f("matc_par_hRows", list);
        return new AquaFixtureScheduleUiState(str, i, list, z3, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaFixtureScheduleUiState)) {
            return false;
        }
        AquaFixtureScheduleUiState aquaFixtureScheduleUiState = (AquaFixtureScheduleUiState) obj;
        return l.a(this.titl_par_eLine, aquaFixtureScheduleUiState.titl_par_eLine) && this.selecte_par_dSeason == aquaFixtureScheduleUiState.selecte_par_dSeason && l.a(this.matc_par_hRows, aquaFixtureScheduleUiState.matc_par_hRows) && this.busy_arg == aquaFixtureScheduleUiState.busy_arg && l.a(this.faul_par_tText, aquaFixtureScheduleUiState.faul_par_tText);
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final List<AquaMatchTicket> getMatc_par_hRows() {
        return this.matc_par_hRows;
    }

    public final int getSelecte_par_dSeason() {
        return this.selecte_par_dSeason;
    }

    public final String getTitl_par_eLine() {
        return this.titl_par_eLine;
    }

    public int hashCode() {
        int hashCode = (((this.matc_par_hRows.hashCode() + (((this.titl_par_eLine.hashCode() * 31) + this.selecte_par_dSeason) * 31)) * 31) + (this.busy_arg ? 1231 : 1237)) * 31;
        String str = this.faul_par_tText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.titl_par_eLine;
        int i = this.selecte_par_dSeason;
        List<AquaMatchTicket> list = this.matc_par_hRows;
        boolean z3 = this.busy_arg;
        String str2 = this.faul_par_tText;
        StringBuilder sb = new StringBuilder("AquaFixtureScheduleUiState(titl_par_eLine=");
        sb.append(str);
        sb.append(", selecte_par_dSeason=");
        sb.append(i);
        sb.append(", matc_par_hRows=");
        sb.append(list);
        sb.append(", busy_arg=");
        sb.append(z3);
        sb.append(", faul_par_tText=");
        return AbstractC2107A.u(sb, str2, ")");
    }

    public AquaFixtureScheduleUiState(String str, int i, List<AquaMatchTicket> list, boolean z3, String str2) {
        l.f("titl_par_eLine", str);
        l.f("matc_par_hRows", list);
        this.titl_par_eLine = str;
        this.selecte_par_dSeason = i;
        this.matc_par_hRows = list;
        this.busy_arg = z3;
        this.faul_par_tText = str2;
    }

    public /* synthetic */ AquaFixtureScheduleUiState(String str, int i, List list, boolean z3, String str2, int i5, f fVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? AquaSportsDefaults.INSTANCE.getDefaultS_par_easonYear() : i, (i5 & 4) != 0 ? v.f6090k : list, (i5 & 8) != 0 ? false : z3, (i5 & 16) != 0 ? null : str2);
    }
}
