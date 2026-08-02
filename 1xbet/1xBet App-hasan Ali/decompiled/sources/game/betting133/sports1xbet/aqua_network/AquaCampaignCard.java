package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class AquaCampaignCard {
    public static final int $stable = 0;

    @b("current")
    private final boolean act_par_ive;

    @b("year")
    private final int st_par_amp;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaCampaignCard() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ AquaCampaignCard copy$default(AquaCampaignCard aquaCampaignCard, int i, boolean z3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaCampaignCard.st_par_amp;
        }
        if ((i5 & 2) != 0) {
            z3 = aquaCampaignCard.act_par_ive;
        }
        return aquaCampaignCard.copy(i, z3);
    }

    public final int component1() {
        return this.st_par_amp;
    }

    public final boolean component2() {
        return this.act_par_ive;
    }

    public final AquaCampaignCard copy(int i, boolean z3) {
        return new AquaCampaignCard(i, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaCampaignCard)) {
            return false;
        }
        AquaCampaignCard aquaCampaignCard = (AquaCampaignCard) obj;
        return this.st_par_amp == aquaCampaignCard.st_par_amp && this.act_par_ive == aquaCampaignCard.act_par_ive;
    }

    public final boolean getAct_par_ive() {
        return this.act_par_ive;
    }

    public final int getSt_par_amp() {
        return this.st_par_amp;
    }

    public int hashCode() {
        return (this.st_par_amp * 31) + (this.act_par_ive ? 1231 : 1237);
    }

    public String toString() {
        return "AquaCampaignCard(st_par_amp=" + this.st_par_amp + ", act_par_ive=" + this.act_par_ive + ")";
    }

    public AquaCampaignCard(int i, boolean z3) {
        this.st_par_amp = i;
        this.act_par_ive = z3;
    }

    public /* synthetic */ AquaCampaignCard(int i, boolean z3, int i5, f fVar) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? false : z3);
    }
}
