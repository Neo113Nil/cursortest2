package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaClockCard {
    public static final int $stable = 0;

    @b("elapsed")
    private final Integer min_par_ute;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaClockCard() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaClockCard copy$default(AquaClockCard aquaClockCard, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aquaClockCard.min_par_ute;
        }
        return aquaClockCard.copy(num);
    }

    public final Integer component1() {
        return this.min_par_ute;
    }

    public final AquaClockCard copy(Integer num) {
        return new AquaClockCard(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AquaClockCard) && l.a(this.min_par_ute, ((AquaClockCard) obj).min_par_ute);
    }

    public final Integer getMin_par_ute() {
        return this.min_par_ute;
    }

    public int hashCode() {
        Integer num = this.min_par_ute;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "AquaClockCard(min_par_ute=" + this.min_par_ute + ")";
    }

    public AquaClockCard(Integer num) {
        this.min_par_ute = num;
    }

    public /* synthetic */ AquaClockCard(Integer num, int i, f fVar) {
        this((i & 1) != 0 ? null : num);
    }
}
