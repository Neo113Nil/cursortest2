package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class AquaMatchMoment {
    public static final int $stable = 0;

    @b("player")
    private final AquaActorCard ac_par_tor;

    @b("time")
    private final AquaClockCard cl_par_ock;

    @b("type")
    private final String head_par_line;

    @b("detail")
    private final String note_arg;

    @b("team")
    private final AquaClubBadge sq_par_uad;

    public AquaMatchMoment() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AquaMatchMoment copy$default(AquaMatchMoment aquaMatchMoment, AquaClockCard aquaClockCard, AquaClubBadge aquaClubBadge, AquaActorCard aquaActorCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaClockCard = aquaMatchMoment.cl_par_ock;
        }
        if ((i & 2) != 0) {
            aquaClubBadge = aquaMatchMoment.sq_par_uad;
        }
        if ((i & 4) != 0) {
            aquaActorCard = aquaMatchMoment.ac_par_tor;
        }
        if ((i & 8) != 0) {
            str = aquaMatchMoment.head_par_line;
        }
        if ((i & 16) != 0) {
            str2 = aquaMatchMoment.note_arg;
        }
        String str3 = str2;
        AquaActorCard aquaActorCard2 = aquaActorCard;
        return aquaMatchMoment.copy(aquaClockCard, aquaClubBadge, aquaActorCard2, str, str3);
    }

    public final AquaClockCard component1() {
        return this.cl_par_ock;
    }

    public final AquaClubBadge component2() {
        return this.sq_par_uad;
    }

    public final AquaActorCard component3() {
        return this.ac_par_tor;
    }

    public final String component4() {
        return this.head_par_line;
    }

    public final String component5() {
        return this.note_arg;
    }

    public final AquaMatchMoment copy(AquaClockCard aquaClockCard, AquaClubBadge aquaClubBadge, AquaActorCard aquaActorCard, String str, String str2) {
        return new AquaMatchMoment(aquaClockCard, aquaClubBadge, aquaActorCard, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaMatchMoment)) {
            return false;
        }
        AquaMatchMoment aquaMatchMoment = (AquaMatchMoment) obj;
        return l.a(this.cl_par_ock, aquaMatchMoment.cl_par_ock) && l.a(this.sq_par_uad, aquaMatchMoment.sq_par_uad) && l.a(this.ac_par_tor, aquaMatchMoment.ac_par_tor) && l.a(this.head_par_line, aquaMatchMoment.head_par_line) && l.a(this.note_arg, aquaMatchMoment.note_arg);
    }

    public final AquaActorCard getAc_par_tor() {
        return this.ac_par_tor;
    }

    public final AquaClockCard getCl_par_ock() {
        return this.cl_par_ock;
    }

    public final String getHead_par_line() {
        return this.head_par_line;
    }

    public final String getNote_arg() {
        return this.note_arg;
    }

    public final AquaClubBadge getSq_par_uad() {
        return this.sq_par_uad;
    }

    public int hashCode() {
        AquaClockCard aquaClockCard = this.cl_par_ock;
        int hashCode = (aquaClockCard == null ? 0 : aquaClockCard.hashCode()) * 31;
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        int hashCode2 = (hashCode + (aquaClubBadge == null ? 0 : aquaClubBadge.hashCode())) * 31;
        AquaActorCard aquaActorCard = this.ac_par_tor;
        int hashCode3 = (hashCode2 + (aquaActorCard == null ? 0 : aquaActorCard.hashCode())) * 31;
        String str = this.head_par_line;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note_arg;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AquaClockCard aquaClockCard = this.cl_par_ock;
        AquaClubBadge aquaClubBadge = this.sq_par_uad;
        AquaActorCard aquaActorCard = this.ac_par_tor;
        String str = this.head_par_line;
        String str2 = this.note_arg;
        StringBuilder sb = new StringBuilder("AquaMatchMoment(cl_par_ock=");
        sb.append(aquaClockCard);
        sb.append(", sq_par_uad=");
        sb.append(aquaClubBadge);
        sb.append(", ac_par_tor=");
        sb.append(aquaActorCard);
        sb.append(", head_par_line=");
        sb.append(str);
        sb.append(", note_arg=");
        return AbstractC2107A.u(sb, str2, ")");
    }

    public AquaMatchMoment(AquaClockCard aquaClockCard, AquaClubBadge aquaClubBadge, AquaActorCard aquaActorCard, String str, String str2) {
        this.cl_par_ock = aquaClockCard;
        this.sq_par_uad = aquaClubBadge;
        this.ac_par_tor = aquaActorCard;
        this.head_par_line = str;
        this.note_arg = str2;
    }

    public /* synthetic */ AquaMatchMoment(AquaClockCard aquaClockCard, AquaClubBadge aquaClubBadge, AquaActorCard aquaActorCard, String str, String str2, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaClockCard, (i & 2) != 0 ? null : aquaClubBadge, (i & 4) != 0 ? null : aquaActorCard, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
