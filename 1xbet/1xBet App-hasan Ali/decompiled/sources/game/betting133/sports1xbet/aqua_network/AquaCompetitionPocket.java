package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaCompetitionPocket {
    public static final int $stable = 0;

    @b("logo")
    private final String art_par_work;

    @b("id")
    private final int code_arg;

    @b("round")
    private final String ph_par_ase;

    @b("season")
    private final Integer st_par_amp;

    @b("country")
    private final String territ_par_oryName;

    @b("name")
    private final String ti_par_tle;

    public AquaCompetitionPocket() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AquaCompetitionPocket copy$default(AquaCompetitionPocket aquaCompetitionPocket, int i, String str, String str2, String str3, Integer num, String str4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaCompetitionPocket.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaCompetitionPocket.ti_par_tle;
        }
        if ((i5 & 4) != 0) {
            str2 = aquaCompetitionPocket.territ_par_oryName;
        }
        if ((i5 & 8) != 0) {
            str3 = aquaCompetitionPocket.art_par_work;
        }
        if ((i5 & 16) != 0) {
            num = aquaCompetitionPocket.st_par_amp;
        }
        if ((i5 & 32) != 0) {
            str4 = aquaCompetitionPocket.ph_par_ase;
        }
        Integer num2 = num;
        String str5 = str4;
        return aquaCompetitionPocket.copy(i, str, str2, str3, num2, str5);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.ti_par_tle;
    }

    public final String component3() {
        return this.territ_par_oryName;
    }

    public final String component4() {
        return this.art_par_work;
    }

    public final Integer component5() {
        return this.st_par_amp;
    }

    public final String component6() {
        return this.ph_par_ase;
    }

    public final AquaCompetitionPocket copy(int i, String str, String str2, String str3, Integer num, String str4) {
        return new AquaCompetitionPocket(i, str, str2, str3, num, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaCompetitionPocket)) {
            return false;
        }
        AquaCompetitionPocket aquaCompetitionPocket = (AquaCompetitionPocket) obj;
        return this.code_arg == aquaCompetitionPocket.code_arg && l.a(this.ti_par_tle, aquaCompetitionPocket.ti_par_tle) && l.a(this.territ_par_oryName, aquaCompetitionPocket.territ_par_oryName) && l.a(this.art_par_work, aquaCompetitionPocket.art_par_work) && l.a(this.st_par_amp, aquaCompetitionPocket.st_par_amp) && l.a(this.ph_par_ase, aquaCompetitionPocket.ph_par_ase);
    }

    public final String getArt_par_work() {
        return this.art_par_work;
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getPh_par_ase() {
        return this.ph_par_ase;
    }

    public final Integer getSt_par_amp() {
        return this.st_par_amp;
    }

    public final String getTerrit_par_oryName() {
        return this.territ_par_oryName;
    }

    public final String getTi_par_tle() {
        return this.ti_par_tle;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.ti_par_tle;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.territ_par_oryName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.art_par_work;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.st_par_amp;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.ph_par_ase;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AquaCompetitionPocket(code_arg=" + this.code_arg + ", ti_par_tle=" + this.ti_par_tle + ", territ_par_oryName=" + this.territ_par_oryName + ", art_par_work=" + this.art_par_work + ", st_par_amp=" + this.st_par_amp + ", ph_par_ase=" + this.ph_par_ase + ")";
    }

    public AquaCompetitionPocket(int i, String str, String str2, String str3, Integer num, String str4) {
        this.code_arg = i;
        this.ti_par_tle = str;
        this.territ_par_oryName = str2;
        this.art_par_work = str3;
        this.st_par_amp = num;
        this.ph_par_ase = str4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AquaCompetitionPocket(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Integer r6, java.lang.String r7, int r8, kotlin.jvm.internal.f r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.f):void");
    }
}
