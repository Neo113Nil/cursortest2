package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class AquaShapeBundle {
    public static final int $stable = 0;

    @b("coach")
    private final AquaBenchCard be_par_nch;

    @b("formation")
    private final String lay_par_out;

    @b("team")
    private final AquaClubBadge sq_par_uad;

    public AquaShapeBundle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AquaShapeBundle copy$default(AquaShapeBundle aquaShapeBundle, AquaClubBadge aquaClubBadge, AquaBenchCard aquaBenchCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClubBadge = aquaShapeBundle.sq_par_uad;
        }
        if ((i & 2) != 0) {
            aquaBenchCard = aquaShapeBundle.be_par_nch;
        }
        if ((i & 4) != 0) {
            str = aquaShapeBundle.lay_par_out;
        }
        return aquaShapeBundle.copy(aquaClubBadge, aquaBenchCard, str);
    }

    public final AquaClubBadge component1() {
        return this.sq_par_uad;
    }

    public final AquaBenchCard component2() {
        return this.be_par_nch;
    }

    public final String component3() {
        return this.lay_par_out;
    }

    public final AquaShapeBundle copy(AquaClubBadge aquaClubBadge, AquaBenchCard aquaBenchCard, String str) {
        return new AquaShapeBundle(aquaClubBadge, aquaBenchCard, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaShapeBundle)) {
            return false;
        }
        AquaShapeBundle aquaShapeBundle = (AquaShapeBundle) obj;
        return l.a(this.sq_par_uad, aquaShapeBundle.sq_par_uad) && l.a(this.be_par_nch, aquaShapeBundle.be_par_nch) && l.a(this.lay_par_out, aquaShapeBundle.lay_par_out);
    }

    public final AquaBenchCard getBe_par_nch() {
        return this.be_par_nch;
    }

    public final String getLay_par_out() {
        return this.lay_par_out;
    }

    public final AquaClubBadge getSq_par_uad() {
        return this.sq_par_uad;
    }

    public int hashCode() {
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        int hashCode = (aquaClubBadge == null ? 0 : aquaClubBadge.hashCode()) * 31;
        AquaBenchCard aquaBenchCard = this.be_par_nch;
        int hashCode2 = (hashCode + (aquaBenchCard == null ? 0 : aquaBenchCard.hashCode())) * 31;
        String str = this.lay_par_out;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        AquaBenchCard aquaBenchCard = this.be_par_nch;
        String str = this.lay_par_out;
        StringBuilder sb = new StringBuilder("AquaShapeBundle(sq_par_uad=");
        sb.append(aquaClubBadge);
        sb.append(", be_par_nch=");
        sb.append(aquaBenchCard);
        sb.append(", lay_par_out=");
        return AbstractC2107A.u(sb, str, ")");
    }

    public AquaShapeBundle(AquaClubBadge aquaClubBadge, AquaBenchCard aquaBenchCard, String str) {
        this.sq_par_uad = aquaClubBadge;
        this.be_par_nch = aquaBenchCard;
        this.lay_par_out = str;
    }

    public /* synthetic */ AquaShapeBundle(AquaClubBadge aquaClubBadge, AquaBenchCard aquaBenchCard, String str, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClubBadge, (i & 2) != 0 ? null : aquaBenchCard, (i & 4) != 0 ? null : str);
    }
}
