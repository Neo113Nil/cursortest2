package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaCompetitionCard {
    public static final int $stable = 0;

    @b("logo")
    private final String art_par_work;

    @b("id")
    private final int code_arg;

    @b("type")
    private final String for_par_mat;

    @b("name")
    private final String ti_par_tle;

    public AquaCompetitionCard() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ AquaCompetitionCard copy$default(AquaCompetitionCard aquaCompetitionCard, int i, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaCompetitionCard.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaCompetitionCard.ti_par_tle;
        }
        if ((i5 & 4) != 0) {
            str2 = aquaCompetitionCard.for_par_mat;
        }
        if ((i5 & 8) != 0) {
            str3 = aquaCompetitionCard.art_par_work;
        }
        return aquaCompetitionCard.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.ti_par_tle;
    }

    public final String component3() {
        return this.for_par_mat;
    }

    public final String component4() {
        return this.art_par_work;
    }

    public final AquaCompetitionCard copy(int i, String str, String str2, String str3) {
        return new AquaCompetitionCard(i, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaCompetitionCard)) {
            return false;
        }
        AquaCompetitionCard aquaCompetitionCard = (AquaCompetitionCard) obj;
        return this.code_arg == aquaCompetitionCard.code_arg && l.a(this.ti_par_tle, aquaCompetitionCard.ti_par_tle) && l.a(this.for_par_mat, aquaCompetitionCard.for_par_mat) && l.a(this.art_par_work, aquaCompetitionCard.art_par_work);
    }

    public final String getArt_par_work() {
        return this.art_par_work;
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getFor_par_mat() {
        return this.for_par_mat;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.ti_par_tle;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.for_par_mat;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.art_par_work;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AquaCompetitionCard(code_arg=" + this.code_arg + ", ti_par_tle=" + this.ti_par_tle + ", for_par_mat=" + this.for_par_mat + ", art_par_work=" + this.art_par_work + ")";
    }

    public AquaCompetitionCard(int i, String str, String str2, String str3) {
        this.code_arg = i;
        this.ti_par_tle = str;
        this.for_par_mat = str2;
        this.art_par_work = str3;
    }

    public /* synthetic */ AquaCompetitionCard(int i, String str, String str2, String str3, int i5, f fVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? null : str, (i5 & 4) != 0 ? null : str2, (i5 & 8) != 0 ? null : str3);
    }
}
