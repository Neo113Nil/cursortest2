package game.betting133.sports1xbet.aqua_network;

import G3.b;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaPlayerSheet {
    public static final int $stable = 8;

    @b("player")
    private final AquaPlayerCard ath_par_lete;

    @b("statistics")
    private final List<AquaSeasonLedger> led_par_gers;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaPlayerSheet() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaPlayerSheet copy$default(AquaPlayerSheet aquaPlayerSheet, AquaPlayerCard aquaPlayerCard, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaPlayerCard = aquaPlayerSheet.ath_par_lete;
        }
        if ((i & 2) != 0) {
            list = aquaPlayerSheet.led_par_gers;
        }
        return aquaPlayerSheet.copy(aquaPlayerCard, list);
    }

    public final AquaPlayerCard component1() {
        return this.ath_par_lete;
    }

    public final List<AquaSeasonLedger> component2() {
        return this.led_par_gers;
    }

    public final AquaPlayerSheet copy(AquaPlayerCard aquaPlayerCard, List<AquaSeasonLedger> list) {
        return new AquaPlayerSheet(aquaPlayerCard, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaPlayerSheet)) {
            return false;
        }
        AquaPlayerSheet aquaPlayerSheet = (AquaPlayerSheet) obj;
        return l.a(this.ath_par_lete, aquaPlayerSheet.ath_par_lete) && l.a(this.led_par_gers, aquaPlayerSheet.led_par_gers);
    }

    public final AquaPlayerCard getAth_par_lete() {
        return this.ath_par_lete;
    }

    public final List<AquaSeasonLedger> getLed_par_gers() {
        return this.led_par_gers;
    }

    public int hashCode() {
        AquaPlayerCard aquaPlayerCard = this.ath_par_lete;
        int hashCode = (aquaPlayerCard == null ? 0 : aquaPlayerCard.hashCode()) * 31;
        List<AquaSeasonLedger> list = this.led_par_gers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AquaPlayerSheet(ath_par_lete=" + this.ath_par_lete + ", led_par_gers=" + this.led_par_gers + ")";
    }

    public AquaPlayerSheet(AquaPlayerCard aquaPlayerCard, List<AquaSeasonLedger> list) {
        this.ath_par_lete = aquaPlayerCard;
        this.led_par_gers = list;
    }

    public /* synthetic */ AquaPlayerSheet(AquaPlayerCard aquaPlayerCard, List list, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaPlayerCard, (i & 2) != 0 ? null : list);
    }
}
