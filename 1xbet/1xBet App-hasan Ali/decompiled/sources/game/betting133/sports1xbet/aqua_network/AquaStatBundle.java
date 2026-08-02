package game.betting133.sports1xbet.aqua_network;

import G3.b;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaStatBundle {
    public static final int $stable = 8;

    @b("statistics")
    private final List<AquaStatCell> ce_par_lls;

    @b("team")
    private final AquaClubBadge sq_par_uad;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaStatBundle() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AquaStatBundle copy$default(AquaStatBundle aquaStatBundle, AquaClubBadge aquaClubBadge, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubBadge = aquaStatBundle.sq_par_uad;
        }
        if ((i & 2) != 0) {
            list = aquaStatBundle.ce_par_lls;
        }
        return aquaStatBundle.copy(aquaClubBadge, list);
    }

    public final AquaClubBadge component1() {
        return this.sq_par_uad;
    }

    public final List<AquaStatCell> component2() {
        return this.ce_par_lls;
    }

    public final AquaStatBundle copy(AquaClubBadge aquaClubBadge, List<AquaStatCell> list) {
        return new AquaStatBundle(aquaClubBadge, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaStatBundle)) {
            return false;
        }
        AquaStatBundle aquaStatBundle = (AquaStatBundle) obj;
        return l.a(this.sq_par_uad, aquaStatBundle.sq_par_uad) && l.a(this.ce_par_lls, aquaStatBundle.ce_par_lls);
    }

    public final List<AquaStatCell> getCe_par_lls() {
        return this.ce_par_lls;
    }

    public final AquaClubBadge getSq_par_uad() {
        return this.sq_par_uad;
    }

    public int hashCode() {
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        int hashCode = (aquaClubBadge == null ? 0 : aquaClubBadge.hashCode()) * 31;
        List<AquaStatCell> list = this.ce_par_lls;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "AquaStatBundle(sq_par_uad=" + this.sq_par_uad + ", ce_par_lls=" + this.ce_par_lls + ")";
    }

    public AquaStatBundle(AquaClubBadge aquaClubBadge, List<AquaStatCell> list) {
        this.sq_par_uad = aquaClubBadge;
        this.ce_par_lls = list;
    }

    public /* synthetic */ AquaStatBundle(AquaClubBadge aquaClubBadge, List list, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClubBadge, (i & 2) != 0 ? null : list);
    }
}
