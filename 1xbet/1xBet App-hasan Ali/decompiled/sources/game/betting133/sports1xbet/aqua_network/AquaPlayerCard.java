package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class AquaPlayerCard {
    public static final int $stable = 0;

    @b("id")
    private final int code_arg;

    @b("nationality")
    private final String nat_par_ion;

    @b("photo")
    private final String port_par_rait;

    @b("name")
    private final String ti_par_tle;

    @b("age")
    private final Integer ye_par_ars;

    public AquaPlayerCard() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AquaPlayerCard copy$default(AquaPlayerCard aquaPlayerCard, int i, String str, Integer num, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaPlayerCard.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaPlayerCard.ti_par_tle;
        }
        if ((i5 & 4) != 0) {
            num = aquaPlayerCard.ye_par_ars;
        }
        if ((i5 & 8) != 0) {
            str2 = aquaPlayerCard.nat_par_ion;
        }
        if ((i5 & 16) != 0) {
            str3 = aquaPlayerCard.port_par_rait;
        }
        String str4 = str3;
        Integer num2 = num;
        return aquaPlayerCard.copy(i, str, num2, str2, str4);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.ti_par_tle;
    }

    public final Integer component3() {
        return this.ye_par_ars;
    }

    public final String component4() {
        return this.nat_par_ion;
    }

    public final String component5() {
        return this.port_par_rait;
    }

    public final AquaPlayerCard copy(int i, String str, Integer num, String str2, String str3) {
        return new AquaPlayerCard(i, str, num, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaPlayerCard)) {
            return false;
        }
        AquaPlayerCard aquaPlayerCard = (AquaPlayerCard) obj;
        return this.code_arg == aquaPlayerCard.code_arg && l.a(this.ti_par_tle, aquaPlayerCard.ti_par_tle) && l.a(this.ye_par_ars, aquaPlayerCard.ye_par_ars) && l.a(this.nat_par_ion, aquaPlayerCard.nat_par_ion) && l.a(this.port_par_rait, aquaPlayerCard.port_par_rait);
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getNat_par_ion() {
        return this.nat_par_ion;
    }

    public final String getPort_par_rait() {
        return this.port_par_rait;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public final Integer getYe_par_ars() {
        return this.ye_par_ars;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.ti_par_tle;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.ye_par_ars;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nat_par_ion;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.port_par_rait;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = this.code_arg;
        String str = this.ti_par_tle;
        Integer num = this.ye_par_ars;
        String str2 = this.nat_par_ion;
        String str3 = this.port_par_rait;
        StringBuilder sb = new StringBuilder("AquaPlayerCard(code_arg=");
        sb.append(i);
        sb.append(", ti_par_tle=");
        sb.append(str);
        sb.append(", ye_par_ars=");
        sb.append(num);
        sb.append(", nat_par_ion=");
        sb.append(str2);
        sb.append(", port_par_rait=");
        return AbstractC2107A.u(sb, str3, ")");
    }

    public AquaPlayerCard(int i, String str, Integer num, String str2, String str3) {
        this.code_arg = i;
        this.ti_par_tle = str;
        this.ye_par_ars = num;
        this.nat_par_ion = str2;
        this.port_par_rait = str3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AquaPlayerCard(int r2, java.lang.String r3, java.lang.Integer r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.f r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: game.betting133.sports1xbet.aqua_network.AquaPlayerCard.<init>(int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}
