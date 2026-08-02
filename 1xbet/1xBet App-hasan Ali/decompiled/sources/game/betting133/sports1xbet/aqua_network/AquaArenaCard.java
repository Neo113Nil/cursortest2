package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaArenaCard {
    public static final int $stable = 0;

    @b("city")
    private final String munici_par_pality;

    @b("name")
    private final String ti_par_tle;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaArenaCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaArenaCard copy$default(AquaArenaCard aquaArenaCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aquaArenaCard.ti_par_tle;
        }
        if ((i & 2) != 0) {
            str2 = aquaArenaCard.munici_par_pality;
        }
        return aquaArenaCard.copy(str, str2);
    }

    public final String component1() {
        return this.ti_par_tle;
    }

    public final String component2() {
        return this.munici_par_pality;
    }

    public final AquaArenaCard copy(String str, String str2) {
        return new AquaArenaCard(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaArenaCard)) {
            return false;
        }
        AquaArenaCard aquaArenaCard = (AquaArenaCard) obj;
        return l.a(this.ti_par_tle, aquaArenaCard.ti_par_tle) && l.a(this.munici_par_pality, aquaArenaCard.munici_par_pality);
    }

    public final String getMunici_par_pality() {
        return this.munici_par_pality;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        String str = this.ti_par_tle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.munici_par_pality;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AquaArenaCard(ti_par_tle=" + this.ti_par_tle + ", munici_par_pality=" + this.munici_par_pality + ")";
    }

    public AquaArenaCard(String str, String str2) {
        this.ti_par_tle = str;
        this.munici_par_pality = str2;
    }

    public /* synthetic */ AquaArenaCard(String str, String str2, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
