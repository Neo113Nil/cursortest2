package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaUsageCard {
    public static final int $stable = 0;

    @b("position")
    private final String role_arg;

    @b("appearences")
    private final Integer sh_par_ows;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaUsageCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaUsageCard copy$default(AquaUsageCard aquaUsageCard, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aquaUsageCard.role_arg;
        }
        if ((i & 2) != 0) {
            num = aquaUsageCard.sh_par_ows;
        }
        return aquaUsageCard.copy(str, num);
    }

    public final String component1() {
        return this.role_arg;
    }

    public final Integer component2() {
        return this.sh_par_ows;
    }

    public final AquaUsageCard copy(String str, Integer num) {
        return new AquaUsageCard(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaUsageCard)) {
            return false;
        }
        AquaUsageCard aquaUsageCard = (AquaUsageCard) obj;
        return l.a(this.role_arg, aquaUsageCard.role_arg) && l.a(this.sh_par_ows, aquaUsageCard.sh_par_ows);
    }

    public final String getRole_arg() {
        return this.role_arg;
    }

    public final Integer getSh_par_ows() {
        return this.sh_par_ows;
    }

    public int hashCode() {
        String str = this.role_arg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sh_par_ows;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AquaUsageCard(role_arg=" + this.role_arg + ", sh_par_ows=" + this.sh_par_ows + ")";
    }

    public AquaUsageCard(String str, Integer num) {
        this.role_arg = str;
        this.sh_par_ows = num;
    }

    public /* synthetic */ AquaUsageCard(String str, Integer num, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
