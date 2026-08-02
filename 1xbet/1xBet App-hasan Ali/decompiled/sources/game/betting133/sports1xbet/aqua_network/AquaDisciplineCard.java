package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaDisciplineCard {
    public static final int $stable = 0;

    @b("yellow")
    private final Integer cau_par_tion;

    @b("red")
    private final Integer dism_par_issal;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaDisciplineCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaDisciplineCard copy$default(AquaDisciplineCard aquaDisciplineCard, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aquaDisciplineCard.cau_par_tion;
        }
        if ((i & 2) != 0) {
            num2 = aquaDisciplineCard.dism_par_issal;
        }
        return aquaDisciplineCard.copy(num, num2);
    }

    public final Integer component1() {
        return this.cau_par_tion;
    }

    public final Integer component2() {
        return this.dism_par_issal;
    }

    public final AquaDisciplineCard copy(Integer num, Integer num2) {
        return new AquaDisciplineCard(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaDisciplineCard)) {
            return false;
        }
        AquaDisciplineCard aquaDisciplineCard = (AquaDisciplineCard) obj;
        return l.a(this.cau_par_tion, aquaDisciplineCard.cau_par_tion) && l.a(this.dism_par_issal, aquaDisciplineCard.dism_par_issal);
    }

    public final Integer getCau_par_tion() {
        return this.cau_par_tion;
    }

    public final Integer getDism_par_issal() {
        return this.dism_par_issal;
    }

    public int hashCode() {
        Integer num = this.cau_par_tion;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.dism_par_issal;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AquaDisciplineCard(cau_par_tion=" + this.cau_par_tion + ", dism_par_issal=" + this.dism_par_issal + ")";
    }

    public AquaDisciplineCard(Integer num, Integer num2) {
        this.cau_par_tion = num;
        this.dism_par_issal = num2;
    }

    public /* synthetic */ AquaDisciplineCard(Integer num, Integer num2, int i, f fVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
