package game.betting133.sports1xbet.aqua_network;

import G3.b;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaCompetitionBundle {
    public static final int $stable = 8;

    @b("seasons")
    private final List<AquaCampaignCard> camp_par_aigns;

    @b("league")
    private final AquaCompetitionCard compe_par_tition;

    @b("country")
    private final AquaTerritoryCard terr_par_itory;

    public AquaCompetitionBundle() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaCompetitionBundle copy$default(AquaCompetitionBundle aquaCompetitionBundle, AquaCompetitionCard aquaCompetitionCard, AquaTerritoryCard aquaTerritoryCard, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaCompetitionCard = aquaCompetitionBundle.compe_par_tition;
        }
        if ((i & 2) != 0) {
            aquaTerritoryCard = aquaCompetitionBundle.terr_par_itory;
        }
        if ((i & 4) != 0) {
            list = aquaCompetitionBundle.camp_par_aigns;
        }
        return aquaCompetitionBundle.copy(aquaCompetitionCard, aquaTerritoryCard, list);
    }

    public final AquaCompetitionCard component1() {
        return this.compe_par_tition;
    }

    public final AquaTerritoryCard component2() {
        return this.terr_par_itory;
    }

    public final List<AquaCampaignCard> component3() {
        return this.camp_par_aigns;
    }

    public final AquaCompetitionBundle copy(AquaCompetitionCard aquaCompetitionCard, AquaTerritoryCard aquaTerritoryCard, List<AquaCampaignCard> list) {
        return new AquaCompetitionBundle(aquaCompetitionCard, aquaTerritoryCard, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaCompetitionBundle)) {
            return false;
        }
        AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj;
        return l.a(this.compe_par_tition, aquaCompetitionBundle.compe_par_tition) && l.a(this.terr_par_itory, aquaCompetitionBundle.terr_par_itory) && l.a(this.camp_par_aigns, aquaCompetitionBundle.camp_par_aigns);
    }

    public final List<AquaCampaignCard> getCamp_par_aigns() {
        return this.camp_par_aigns;
    }

    public final AquaCompetitionCard getCompe_par_tition() {
        return this.compe_par_tition;
    }

    public final AquaTerritoryCard getTerr_par_itory() {
        return this.terr_par_itory;
    }

    public int hashCode() {
        AquaCompetitionCard aquaCompetitionCard = this.compe_par_tition;
        int hashCode = (aquaCompetitionCard == null ? 0 : aquaCompetitionCard.hashCode()) * 31;
        AquaTerritoryCard aquaTerritoryCard = this.terr_par_itory;
        int hashCode2 = (hashCode + (aquaTerritoryCard == null ? 0 : aquaTerritoryCard.hashCode())) * 31;
        List<AquaCampaignCard> list = this.camp_par_aigns;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AquaCompetitionBundle(compe_par_tition=" + this.compe_par_tition + ", terr_par_itory=" + this.terr_par_itory + ", camp_par_aigns=" + this.camp_par_aigns + ")";
    }

    public AquaCompetitionBundle(AquaCompetitionCard aquaCompetitionCard, AquaTerritoryCard aquaTerritoryCard, List<AquaCampaignCard> list) {
        this.compe_par_tition = aquaCompetitionCard;
        this.terr_par_itory = aquaTerritoryCard;
        this.camp_par_aigns = list;
    }

    public /* synthetic */ AquaCompetitionBundle(AquaCompetitionCard aquaCompetitionCard, AquaTerritoryCard aquaTerritoryCard, List list, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaCompetitionCard, (i & 2) != 0 ? null : aquaTerritoryCard, (i & 4) != 0 ? null : list);
    }
}
