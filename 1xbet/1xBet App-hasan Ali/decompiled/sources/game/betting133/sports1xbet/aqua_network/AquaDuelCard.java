package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaDuelCard {
    public static final int $stable = 0;

    @b("away")
    private final AquaClubBadge gu_par_est;

    @b("home")
    private final AquaClubBadge host_arg;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaDuelCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaDuelCard copy$default(AquaDuelCard aquaDuelCard, AquaClubBadge aquaClubBadge, AquaClubBadge aquaClubBadge2, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubBadge = aquaDuelCard.host_arg;
        }
        if ((i & 2) != 0) {
            aquaClubBadge2 = aquaDuelCard.gu_par_est;
        }
        return aquaDuelCard.copy(aquaClubBadge, aquaClubBadge2);
    }

    public final AquaClubBadge component1() {
        return this.host_arg;
    }

    public final AquaClubBadge component2() {
        return this.gu_par_est;
    }

    public final AquaDuelCard copy(AquaClubBadge aquaClubBadge, AquaClubBadge aquaClubBadge2) {
        return new AquaDuelCard(aquaClubBadge, aquaClubBadge2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaDuelCard)) {
            return false;
        }
        AquaDuelCard aquaDuelCard = (AquaDuelCard) obj;
        return l.a(this.host_arg, aquaDuelCard.host_arg) && l.a(this.gu_par_est, aquaDuelCard.gu_par_est);
    }

    public final AquaClubBadge getGu_par_est() {
        return this.gu_par_est;
    }

    public final AquaClubBadge getHost_arg() {
        return this.host_arg;
    }

    public int hashCode() {
        AquaClubBadge aquaClubBadge = this.host_arg;
        int hashCode = (aquaClubBadge == null ? 0 : aquaClubBadge.hashCode()) * 31;
        AquaClubBadge aquaClubBadge2 = this.gu_par_est;
        return hashCode + (aquaClubBadge2 != null ? aquaClubBadge2.hashCode() : 0);
    }

    public String toString() {
        return "AquaDuelCard(host_arg=" + this.host_arg + ", gu_par_est=" + this.gu_par_est + ")";
    }

    public AquaDuelCard(AquaClubBadge aquaClubBadge, AquaClubBadge aquaClubBadge2) {
        this.host_arg = aquaClubBadge;
        this.gu_par_est = aquaClubBadge2;
    }

    public /* synthetic */ AquaDuelCard(AquaClubBadge aquaClubBadge, AquaClubBadge aquaClubBadge2, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClubBadge, (i & 2) != 0 ? null : aquaClubBadge2);
    }
}
