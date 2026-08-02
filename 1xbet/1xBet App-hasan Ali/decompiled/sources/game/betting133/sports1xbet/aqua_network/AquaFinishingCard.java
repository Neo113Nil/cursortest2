package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaFinishingCard {
    public static final int $stable = 0;

    @b("assists")
    private final Integer fe_par_eds;

    @b("total")
    private final Integer to_par_tal;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaFinishingCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaFinishingCard copy$default(AquaFinishingCard aquaFinishingCard, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aquaFinishingCard.to_par_tal;
        }
        if ((i & 2) != 0) {
            num2 = aquaFinishingCard.fe_par_eds;
        }
        return aquaFinishingCard.copy(num, num2);
    }

    public final Integer component1() {
        return this.to_par_tal;
    }

    public final Integer component2() {
        return this.fe_par_eds;
    }

    public final AquaFinishingCard copy(Integer num, Integer num2) {
        return new AquaFinishingCard(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaFinishingCard)) {
            return false;
        }
        AquaFinishingCard aquaFinishingCard = (AquaFinishingCard) obj;
        return l.a(this.to_par_tal, aquaFinishingCard.to_par_tal) && l.a(this.fe_par_eds, aquaFinishingCard.fe_par_eds);
    }

    public final Integer getFe_par_eds() {
        return this.fe_par_eds;
    }

    public final Integer getTo_par_tal() {
        return this.to_par_tal;
    }

    public int hashCode() {
        Integer num = this.to_par_tal;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fe_par_eds;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AquaFinishingCard(to_par_tal=" + this.to_par_tal + ", fe_par_eds=" + this.fe_par_eds + ")";
    }

    public AquaFinishingCard(Integer num, Integer num2) {
        this.to_par_tal = num;
        this.fe_par_eds = num2;
    }

    public /* synthetic */ AquaFinishingCard(Integer num, Integer num2, int i, f fVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
