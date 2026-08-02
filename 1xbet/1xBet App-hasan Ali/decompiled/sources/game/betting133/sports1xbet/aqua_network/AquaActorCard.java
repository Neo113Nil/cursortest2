package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaActorCard {
    public static final int $stable = 0;

    @b("name")
    private final String ti_par_tle;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaActorCard() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaActorCard copy$default(AquaActorCard aquaActorCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aquaActorCard.ti_par_tle;
        }
        return aquaActorCard.copy(str);
    }

    public final String component1() {
        return this.ti_par_tle;
    }

    public final AquaActorCard copy(String str) {
        return new AquaActorCard(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AquaActorCard) && l.a(this.ti_par_tle, ((AquaActorCard) obj).ti_par_tle);
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        String str = this.ti_par_tle;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return L1.a.n("AquaActorCard(ti_par_tle=", this.ti_par_tle, ")");
    }

    public AquaActorCard(String str) {
        this.ti_par_tle = str;
    }

    public /* synthetic */ AquaActorCard(String str, int i, f fVar) {
        this((i & 1) != 0 ? null : str);
    }
}
