package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaClubSheet {
    public static final int $stable = 0;

    @b("venue")
    private final AquaArenaCard ar_par_ena;

    @b("team")
    private final AquaClubCard sq_par_uad;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaClubSheet() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaClubSheet copy$default(AquaClubSheet aquaClubSheet, AquaClubCard aquaClubCard, AquaArenaCard aquaArenaCard, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubCard = aquaClubSheet.sq_par_uad;
        }
        if ((i & 2) != 0) {
            aquaArenaCard = aquaClubSheet.ar_par_ena;
        }
        return aquaClubSheet.copy(aquaClubCard, aquaArenaCard);
    }

    public final AquaClubCard component1() {
        return this.sq_par_uad;
    }

    public final AquaArenaCard component2() {
        return this.ar_par_ena;
    }

    public final AquaClubSheet copy(AquaClubCard aquaClubCard, AquaArenaCard aquaArenaCard) {
        return new AquaClubSheet(aquaClubCard, aquaArenaCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaClubSheet)) {
            return false;
        }
        AquaClubSheet aquaClubSheet = (AquaClubSheet) obj;
        return l.a(this.sq_par_uad, aquaClubSheet.sq_par_uad) && l.a(this.ar_par_ena, aquaClubSheet.ar_par_ena);
    }

    public final AquaArenaCard getAr_par_ena() {
        return this.ar_par_ena;
    }

    public final AquaClubCard getSq_par_uad() {
        return this.sq_par_uad;
    }

    public int hashCode() {
        AquaClubCard aquaClubCard = this.sq_par_uad;
        int hashCode = (aquaClubCard == null ? 0 : aquaClubCard.hashCode()) * 31;
        AquaArenaCard aquaArenaCard = this.ar_par_ena;
        return hashCode + (aquaArenaCard != null ? aquaArenaCard.hashCode() : 0);
    }

    public String toString() {
        return "AquaClubSheet(sq_par_uad=" + this.sq_par_uad + ", ar_par_ena=" + this.ar_par_ena + ")";
    }

    public AquaClubSheet(AquaClubCard aquaClubCard, AquaArenaCard aquaArenaCard) {
        this.sq_par_uad = aquaClubCard;
        this.ar_par_ena = aquaArenaCard;
    }

    public /* synthetic */ AquaClubSheet(AquaClubCard aquaClubCard, AquaArenaCard aquaArenaCard, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClubCard, (i & 2) != 0 ? null : aquaArenaCard);
    }
}
