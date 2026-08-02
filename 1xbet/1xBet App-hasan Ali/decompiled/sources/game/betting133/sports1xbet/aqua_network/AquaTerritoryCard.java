package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class AquaTerritoryCard {
    public static final int $stable = 0;

    @b("flag")
    private final String emb_par_lem;

    @b("code")
    private final String iso_arg;

    @b("name")
    private final String ti_par_tle;

    public AquaTerritoryCard() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AquaTerritoryCard copy$default(AquaTerritoryCard aquaTerritoryCard, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aquaTerritoryCard.ti_par_tle;
        }
        if ((i & 2) != 0) {
            str2 = aquaTerritoryCard.iso_arg;
        }
        if ((i & 4) != 0) {
            str3 = aquaTerritoryCard.emb_par_lem;
        }
        return aquaTerritoryCard.copy(str, str2, str3);
    }

    public final String component1() {
        return this.ti_par_tle;
    }

    public final String component2() {
        return this.iso_arg;
    }

    public final String component3() {
        return this.emb_par_lem;
    }

    public final AquaTerritoryCard copy(String str, String str2, String str3) {
        return new AquaTerritoryCard(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaTerritoryCard)) {
            return false;
        }
        AquaTerritoryCard aquaTerritoryCard = (AquaTerritoryCard) obj;
        return l.a(this.ti_par_tle, aquaTerritoryCard.ti_par_tle) && l.a(this.iso_arg, aquaTerritoryCard.iso_arg) && l.a(this.emb_par_lem, aquaTerritoryCard.emb_par_lem);
    }

    public final String getEmb_par_lem() {
        return this.emb_par_lem;
    }

    public final String getIso_arg() {
        return this.iso_arg;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        String str = this.ti_par_tle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iso_arg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emb_par_lem;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.ti_par_tle;
        String str2 = this.iso_arg;
        String str3 = this.emb_par_lem;
        StringBuilder sb = new StringBuilder("AquaTerritoryCard(ti_par_tle=");
        sb.append(str);
        sb.append(", iso_arg=");
        sb.append(str2);
        sb.append(", emb_par_lem=");
        return AbstractC2107A.u(sb, str3, ")");
    }

    public AquaTerritoryCard(String str, String str2, String str3) {
        this.ti_par_tle = str;
        this.iso_arg = str2;
        this.emb_par_lem = str3;
    }

    public /* synthetic */ AquaTerritoryCard(String str, String str2, String str3, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
