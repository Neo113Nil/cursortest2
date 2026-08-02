package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaPulseCard {
    public static final int $stable = 0;

    @b("short")
    private final String code_arg;

    @b("long")
    private final String det_par_ail;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaPulseCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AquaPulseCard copy$default(AquaPulseCard aquaPulseCard, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aquaPulseCard.code_arg;
        }
        if ((i & 2) != 0) {
            str2 = aquaPulseCard.det_par_ail;
        }
        return aquaPulseCard.copy(str, str2);
    }

    public final String component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.det_par_ail;
    }

    public final AquaPulseCard copy(String str, String str2) {
        return new AquaPulseCard(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaPulseCard)) {
            return false;
        }
        AquaPulseCard aquaPulseCard = (AquaPulseCard) obj;
        return l.a(this.code_arg, aquaPulseCard.code_arg) && l.a(this.det_par_ail, aquaPulseCard.det_par_ail);
    }

    public final String getCode_arg() {
        return this.code_arg;
    }

    public final String getDet_par_ail() {
        return this.det_par_ail;
    }

    public int hashCode() {
        String str = this.code_arg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.det_par_ail;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AquaPulseCard(code_arg=" + this.code_arg + ", det_par_ail=" + this.det_par_ail + ")";
    }

    public AquaPulseCard(String str, String str2) {
        this.code_arg = str;
        this.det_par_ail = str2;
    }

    public /* synthetic */ AquaPulseCard(String str, String str2, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
