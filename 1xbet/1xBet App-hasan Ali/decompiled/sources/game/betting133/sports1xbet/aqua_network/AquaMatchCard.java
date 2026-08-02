package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaMatchCard {
    public static final int $stable = 0;

    @b("venue")
    private final AquaArenaCard ar_par_ena;

    @b("id")
    private final int code_arg;

    @b("date")
    private final String kick_par_offAt;

    @b("referee")
    private final String offi_par_cial;

    @b("status")
    private final AquaPulseCard pu_par_lse;

    @b("timezone")
    private final String zone_arg;

    public AquaMatchCard() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AquaMatchCard copy$default(AquaMatchCard aquaMatchCard, int i, String str, String str2, String str3, AquaArenaCard aquaArenaCard, AquaPulseCard aquaPulseCard, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = aquaMatchCard.code_arg;
        }
        if ((i5 & 2) != 0) {
            str = aquaMatchCard.kick_par_offAt;
        }
        if ((i5 & 4) != 0) {
            str2 = aquaMatchCard.zone_arg;
        }
        if ((i5 & 8) != 0) {
            str3 = aquaMatchCard.offi_par_cial;
        }
        if ((i5 & 16) != 0) {
            aquaArenaCard = aquaMatchCard.ar_par_ena;
        }
        if ((i5 & 32) != 0) {
            aquaPulseCard = aquaMatchCard.pu_par_lse;
        }
        AquaArenaCard aquaArenaCard2 = aquaArenaCard;
        AquaPulseCard aquaPulseCard2 = aquaPulseCard;
        return aquaMatchCard.copy(i, str, str2, str3, aquaArenaCard2, aquaPulseCard2);
    }

    public final int component1() {
        return this.code_arg;
    }

    public final String component2() {
        return this.kick_par_offAt;
    }

    public final String component3() {
        return this.zone_arg;
    }

    public final String component4() {
        return this.offi_par_cial;
    }

    public final AquaArenaCard component5() {
        return this.ar_par_ena;
    }

    public final AquaPulseCard component6() {
        return this.pu_par_lse;
    }

    public final AquaMatchCard copy(int i, String str, String str2, String str3, AquaArenaCard aquaArenaCard, AquaPulseCard aquaPulseCard) {
        return new AquaMatchCard(i, str, str2, str3, aquaArenaCard, aquaPulseCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaMatchCard)) {
            return false;
        }
        AquaMatchCard aquaMatchCard = (AquaMatchCard) obj;
        return this.code_arg == aquaMatchCard.code_arg && l.a(this.kick_par_offAt, aquaMatchCard.kick_par_offAt) && l.a(this.zone_arg, aquaMatchCard.zone_arg) && l.a(this.offi_par_cial, aquaMatchCard.offi_par_cial) && l.a(this.ar_par_ena, aquaMatchCard.ar_par_ena) && l.a(this.pu_par_lse, aquaMatchCard.pu_par_lse);
    }

    public final AquaArenaCard getAr_par_ena() {
        return this.ar_par_ena;
    }

    public final int getCode_arg() {
        return this.code_arg;
    }

    public final String getKick_par_offAt() {
        return this.kick_par_offAt;
    }

    public final String getOffi_par_cial() {
        return this.offi_par_cial;
    }

    public final AquaPulseCard getPu_par_lse() {
        return this.pu_par_lse;
    }

    public final String getZone_arg() {
        return this.zone_arg;
    }

    public int hashCode() {
        int i = this.code_arg * 31;
        String str = this.kick_par_offAt;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zone_arg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offi_par_cial;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AquaArenaCard aquaArenaCard = this.ar_par_ena;
        int hashCode4 = (hashCode3 + (aquaArenaCard == null ? 0 : aquaArenaCard.hashCode())) * 31;
        AquaPulseCard aquaPulseCard = this.pu_par_lse;
        return hashCode4 + (aquaPulseCard != null ? aquaPulseCard.hashCode() : 0);
    }

    public String toString() {
        return "AquaMatchCard(code_arg=" + this.code_arg + ", kick_par_offAt=" + this.kick_par_offAt + ", zone_arg=" + this.zone_arg + ", offi_par_cial=" + this.offi_par_cial + ", ar_par_ena=" + this.ar_par_ena + ", pu_par_lse=" + this.pu_par_lse + ")";
    }

    public AquaMatchCard(int i, String str, String str2, String str3, AquaArenaCard aquaArenaCard, AquaPulseCard aquaPulseCard) {
        this.code_arg = i;
        this.kick_par_offAt = str;
        this.zone_arg = str2;
        this.offi_par_cial = str3;
        this.ar_par_ena = aquaArenaCard;
        this.pu_par_lse = aquaPulseCard;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AquaMatchCard(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, game.betting133.sports1xbet.aqua_network.AquaArenaCard r6, game.betting133.sports1xbet.aqua_network.AquaPulseCard r7, int r8, kotlin.jvm.internal.f r9) {
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
        throw new UnsupportedOperationException("Method not decompiled: game.betting133.sports1xbet.aqua_network.AquaMatchCard.<init>(int, java.lang.String, java.lang.String, java.lang.String, game.betting133.sports1xbet.aqua_network.AquaArenaCard, game.betting133.sports1xbet.aqua_network.AquaPulseCard, int, kotlin.jvm.internal.f):void");
    }
}
