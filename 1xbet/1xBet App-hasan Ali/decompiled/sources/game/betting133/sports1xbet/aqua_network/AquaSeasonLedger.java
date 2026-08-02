package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaSeasonLedger {
    public static final int $stable = 0;

    @b("league")
    private final AquaCompetitionPocket compe_par_tition;

    @b("cards")
    private final AquaDisciplineCard disci_par_pline;

    @b("goals")
    private final AquaFinishingCard fini_par_shing;

    @b("team")
    private final AquaClubBadge sq_par_uad;

    @b("games")
    private final AquaUsageCard us_par_age;

    public AquaSeasonLedger() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AquaSeasonLedger copy$default(AquaSeasonLedger aquaSeasonLedger, AquaClubBadge aquaClubBadge, AquaCompetitionPocket aquaCompetitionPocket, AquaUsageCard aquaUsageCard, AquaFinishingCard aquaFinishingCard, AquaDisciplineCard aquaDisciplineCard, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubBadge = aquaSeasonLedger.sq_par_uad;
        }
        if ((i & 2) != 0) {
            aquaCompetitionPocket = aquaSeasonLedger.compe_par_tition;
        }
        if ((i & 4) != 0) {
            aquaUsageCard = aquaSeasonLedger.us_par_age;
        }
        if ((i & 8) != 0) {
            aquaFinishingCard = aquaSeasonLedger.fini_par_shing;
        }
        if ((i & 16) != 0) {
            aquaDisciplineCard = aquaSeasonLedger.disci_par_pline;
        }
        AquaDisciplineCard aquaDisciplineCard2 = aquaDisciplineCard;
        AquaUsageCard aquaUsageCard2 = aquaUsageCard;
        return aquaSeasonLedger.copy(aquaClubBadge, aquaCompetitionPocket, aquaUsageCard2, aquaFinishingCard, aquaDisciplineCard2);
    }

    public final AquaClubBadge component1() {
        return this.sq_par_uad;
    }

    public final AquaCompetitionPocket component2() {
        return this.compe_par_tition;
    }

    public final AquaUsageCard component3() {
        return this.us_par_age;
    }

    public final AquaFinishingCard component4() {
        return this.fini_par_shing;
    }

    public final AquaDisciplineCard component5() {
        return this.disci_par_pline;
    }

    public final AquaSeasonLedger copy(AquaClubBadge aquaClubBadge, AquaCompetitionPocket aquaCompetitionPocket, AquaUsageCard aquaUsageCard, AquaFinishingCard aquaFinishingCard, AquaDisciplineCard aquaDisciplineCard) {
        return new AquaSeasonLedger(aquaClubBadge, aquaCompetitionPocket, aquaUsageCard, aquaFinishingCard, aquaDisciplineCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaSeasonLedger)) {
            return false;
        }
        AquaSeasonLedger aquaSeasonLedger = (AquaSeasonLedger) obj;
        return l.a(this.sq_par_uad, aquaSeasonLedger.sq_par_uad) && l.a(this.compe_par_tition, aquaSeasonLedger.compe_par_tition) && l.a(this.us_par_age, aquaSeasonLedger.us_par_age) && l.a(this.fini_par_shing, aquaSeasonLedger.fini_par_shing) && l.a(this.disci_par_pline, aquaSeasonLedger.disci_par_pline);
    }

    public final AquaCompetitionPocket getCompe_par_tition() {
        return this.compe_par_tition;
    }

    public final AquaDisciplineCard getDisci_par_pline() {
        return this.disci_par_pline;
    }

    public final AquaFinishingCard getFini_par_shing() {
        return this.fini_par_shing;
    }

    public final AquaClubBadge getSq_par_uad() {
        return this.sq_par_uad;
    }

    public final AquaUsageCard getUs_par_age() {
        return this.us_par_age;
    }

    public int hashCode() {
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        int hashCode = (aquaClubBadge == null ? 0 : aquaClubBadge.hashCode()) * 31;
        AquaCompetitionPocket aquaCompetitionPocket = this.compe_par_tition;
        int hashCode2 = (hashCode + (aquaCompetitionPocket == null ? 0 : aquaCompetitionPocket.hashCode())) * 31;
        AquaUsageCard aquaUsageCard = this.us_par_age;
        int hashCode3 = (hashCode2 + (aquaUsageCard == null ? 0 : aquaUsageCard.hashCode())) * 31;
        AquaFinishingCard aquaFinishingCard = this.fini_par_shing;
        int hashCode4 = (hashCode3 + (aquaFinishingCard == null ? 0 : aquaFinishingCard.hashCode())) * 31;
        AquaDisciplineCard aquaDisciplineCard = this.disci_par_pline;
        return hashCode4 + (aquaDisciplineCard != null ? aquaDisciplineCard.hashCode() : 0);
    }

    public String toString() {
        return "AquaSeasonLedger(sq_par_uad=" + this.sq_par_uad + ", compe_par_tition=" + this.compe_par_tition + ", us_par_age=" + this.us_par_age + ", fini_par_shing=" + this.fini_par_shing + ", disci_par_pline=" + this.disci_par_pline + ")";
    }

    public AquaSeasonLedger(AquaClubBadge aquaClubBadge, AquaCompetitionPocket aquaCompetitionPocket, AquaUsageCard aquaUsageCard, AquaFinishingCard aquaFinishingCard, AquaDisciplineCard aquaDisciplineCard) {
        this.sq_par_uad = aquaClubBadge;
        this.compe_par_tition = aquaCompetitionPocket;
        this.us_par_age = aquaUsageCard;
        this.fini_par_shing = aquaFinishingCard;
        this.disci_par_pline = aquaDisciplineCard;
    }

    public /* synthetic */ AquaSeasonLedger(AquaClubBadge aquaClubBadge, AquaCompetitionPocket aquaCompetitionPocket, AquaUsageCard aquaUsageCard, AquaFinishingCard aquaFinishingCard, AquaDisciplineCard aquaDisciplineCard, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClubBadge, (i & 2) != 0 ? null : aquaCompetitionPocket, (i & 4) != 0 ? null : aquaUsageCard, (i & 8) != 0 ? null : aquaFinishingCard, (i & 16) != 0 ? null : aquaDisciplineCard);
    }
}
