package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaClubBadge {
    public static final int $stable = 0;

    @b("logo")
    private final String art_par_work;

    @b("id")
    private final int code_arg;

    @b("name")
    private final String ti_par_tle;

    @b("winner")
    private final Boolean won_arg;

    public AquaClubBadge() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ AquaClubBadge copy$default(AquaClubBadge aquaClubBadge, int i, String str, String str2, Boolean bool, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaClubBadge.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaClubBadge.ti_par_tle;
        }
        if ((i5 & 4) != 0) {
            str2 = aquaClubBadge.art_par_work;
        }
        if ((i5 & 8) != 0) {
            bool = aquaClubBadge.won_arg;
        }
        return aquaClubBadge.copy(i, str, str2, bool);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.ti_par_tle;
    }

    public final String component3() {
        return this.art_par_work;
    }

    public final Boolean component4() {
        return this.won_arg;
    }

    public final AquaClubBadge copy(int i, String str, String str2, Boolean bool) {
        return new AquaClubBadge(i, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaClubBadge)) {
            return false;
        }
        AquaClubBadge aquaClubBadge = (AquaClubBadge) obj;
        return this.code_arg == aquaClubBadge.code_arg && l.a(this.ti_par_tle, aquaClubBadge.ti_par_tle) && l.a(this.art_par_work, aquaClubBadge.art_par_work) && l.a(this.won_arg, aquaClubBadge.won_arg);
    }

    public final String getArt_par_work() {
        return this.art_par_work;
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public final Boolean getWon_arg() {
        return this.won_arg;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.ti_par_tle;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.art_par_work;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.won_arg;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AquaClubBadge(code_arg=" + this.code_arg + ", ti_par_tle=" + this.ti_par_tle + ", art_par_work=" + this.art_par_work + ", won_arg=" + this.won_arg + ")";
    }

    public AquaClubBadge(int i, String str, String str2, Boolean bool) {
        this.code_arg = i;
        this.ti_par_tle = str;
        this.art_par_work = str2;
        this.won_arg = bool;
    }

    public /* synthetic */ AquaClubBadge(int i, String str, String str2, Boolean bool, int i5, f fVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : bool);
    }
}
