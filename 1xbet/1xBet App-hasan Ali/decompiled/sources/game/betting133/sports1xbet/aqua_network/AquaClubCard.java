package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaClubCard {
    public static final int $stable = 0;

    @b("logo")
    private final String art_par_work;

    @b("founded")
    private final Integer born_arg;

    @b("id")
    private final int code_arg;

    @b("country")
    private final String nat_par_ion;

    @b("name")
    private final String ti_par_tle;

    public AquaClubCard() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AquaClubCard copy$default(AquaClubCard aquaClubCard, int i, String str, String str2, String str3, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaClubCard.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaClubCard.ti_par_tle;
        }
        if ((i5 & 4) != 0) {
            str2 = aquaClubCard.art_par_work;
        }
        if ((i5 & 8) != 0) {
            str3 = aquaClubCard.nat_par_ion;
        }
        if ((i5 & 16) != 0) {
            num = aquaClubCard.born_arg;
        }
        Integer num2 = num;
        String str4 = str2;
        return aquaClubCard.copy(i, str, str4, str3, num2);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.ti_par_tle;
    }

    public final String component3() {
        return this.art_par_work;
    }

    public final String component4() {
        return this.nat_par_ion;
    }

    public final Integer component5() {
        return this.born_arg;
    }

    public final AquaClubCard copy(int i, String str, String str2, String str3, Integer num) {
        return new AquaClubCard(i, str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaClubCard)) {
            return false;
        }
        AquaClubCard aquaClubCard = (AquaClubCard) obj;
        return this.code_arg == aquaClubCard.code_arg && l.a(this.ti_par_tle, aquaClubCard.ti_par_tle) && l.a(this.art_par_work, aquaClubCard.art_par_work) && l.a(this.nat_par_ion, aquaClubCard.nat_par_ion) && l.a(this.born_arg, aquaClubCard.born_arg);
    }

    public final String getArt_par_work() {
        return this.art_par_work;
    }

    public final Integer getBorn_arg() {
        return this.born_arg;
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getNat_par_ion() {
        return this.nat_par_ion;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.ti_par_tle;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.art_par_work;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nat_par_ion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.born_arg;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AquaClubCard(code_arg=" + this.code_arg + ", ti_par_tle=" + this.ti_par_tle + ", art_par_work=" + this.art_par_work + ", nat_par_ion=" + this.nat_par_ion + ", born_arg=" + this.born_arg + ")";
    }

    public AquaClubCard(int i, String str, String str2, String str3, Integer num) {
        this.code_arg = i;
        this.ti_par_tle = str;
        this.art_par_work = str2;
        this.nat_par_ion = str3;
        this.born_arg = num;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AquaClubCard(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Integer r6, int r7, kotlin.jvm.internal.f r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L10
            r4 = r0
        L10:
            r8 = r7 & 8
            if (r8 == 0) goto L15
            r5 = r0
        L15:
            r7 = r7 & 16
            if (r7 == 0) goto L20
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L26
        L20:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L26:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: game.betting133.sports1xbet.aqua_network.AquaClubCard.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.f):void");
    }
}
