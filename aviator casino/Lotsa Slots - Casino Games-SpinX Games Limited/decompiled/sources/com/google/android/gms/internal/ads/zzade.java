package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzade extends com.google.android.gms.internal.ads.zzvt implements com.google.android.gms.internal.ads.zzadt {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private com.google.android.gms.internal.ads.zznh zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private com.google.android.gms.internal.ads.zzbv zzL;
    private com.google.android.gms.internal.ads.zzbv zzM;
    private int zzN;
    private int zzO;
    private com.google.android.gms.internal.ads.zzadr zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final android.content.Context zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzaeo zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzadu zzi;
    private final com.google.android.gms.internal.ads.zzads zzj;
    private final com.google.android.gms.internal.ads.zzacn zzk;
    private final long zzl;
    private final com.google.android.gms.internal.ads.zzadv zzm;
    private final java.util.PriorityQueue zzn;
    private com.google.android.gms.internal.ads.zzadd zzo;
    private boolean zzp;
    private boolean zzq;
    private com.google.android.gms.internal.ads.zzaeu zzr;
    private boolean zzs;
    private int zzt;
    private java.util.List zzu;
    private android.view.Surface zzv;
    private com.google.android.gms.internal.ads.zzadg zzw;
    private com.google.android.gms.internal.ads.zzeu zzx;
    private boolean zzy;
    private int zzz;

    protected zzade(com.google.android.gms.internal.ads.zzadc zzadcVar) {
        super(zzadcVar.zze().getApplicationContext(), 2, zzadcVar.zzg(), zzadcVar.zzf(), false, 30.0f);
        android.content.Context applicationContext = zzadcVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new com.google.android.gms.internal.ads.zzaeo(zzadcVar.zzh(), zzadcVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new com.google.android.gms.internal.ads.zzadu(applicationContext, this, 0L);
        this.zzj = new com.google.android.gms.internal.ads.zzads();
        this.zzh = "NVIDIA".equals(android.os.Build.MANUFACTURER);
        this.zzx = com.google.android.gms.internal.ads.zzeu.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = com.google.android.gms.internal.ads.zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = -9223372036854775807L;
        this.zzR = -9223372036854775807L;
        this.zzk = new com.google.android.gms.internal.ads.zzacn();
        this.zzn = new java.util.PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new com.google.android.gms.internal.ads.zzadv(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        if (r3.equals("video/av01") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzaw(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        int i = zzvVar.zzw;
        int i2 = zzvVar.zzx;
        if (i != -1 && i2 != -1) {
            java.lang.String str = zzvVar.zzp;
            str.getClass();
            char c = 2;
            if ("video/dolby-vision".equals(str)) {
                android.util.Pair zze = com.google.android.gms.internal.ads.zzdq.zze(zzvVar);
                if (zze != null) {
                    int intValue = ((java.lang.Integer) zze.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i3 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i * i2) * 3) / i3;
                case 4:
                    return java.lang.Math.max(2097152, ((i * i2) * 3) / 4);
                case 5:
                    if (!"BRAVIA 4K 2015".equals(android.os.Build.MODEL) && (!"Amazon".equals(android.os.Build.MANUFACTURER) || (!"KFSOWI".equals(android.os.Build.MODEL) && (!"AFTS".equals(android.os.Build.MODEL) || !zzvmVar.zzf)))) {
                        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i3 = 8;
                    return ((i * i2) * 3) / i3;
            }
        }
        return -1;
    }

    private final void zzbA() {
        com.google.android.gms.internal.ads.zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            zzadgVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"displaySurface"})
    /* renamed from: zzbB, reason: merged with bridge method [inline-methods] */
    public final void zzbo() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbC() {
        com.google.android.gms.internal.ads.zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbm(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        int i = zzvVar.zzq;
        if (i == -1) {
            return zzaw(zzvmVar, zzvVar);
        }
        java.util.List list = zzvVar.zzs;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x04c4, code lost:
    
        if (r1.equals("deb") != false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x07a3, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean zzbq(java.lang.String str) {
        char c;
        char c2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (com.google.android.gms.internal.ads.zzade.class) {
            if (!zzc) {
                char c3 = 28;
                if (android.os.Build.VERSION.SDK_INT <= 28) {
                    java.lang.String str2 = android.os.Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                if (android.os.Build.VERSION.SDK_INT > 27 || !"HWEML".equals(android.os.Build.DEVICE)) {
                    java.lang.String str3 = android.os.Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        default:
                            if (android.os.Build.VERSION.SDK_INT <= 26) {
                                java.lang.String str4 = android.os.Build.DEVICE;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c3 = '6';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c3 = '7';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c3 = '8';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c3 = 'J';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c3 = 22;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c3 = io.ktor.util.date.GMTDateParser.YEAR;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c3 = 'Z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c3 = 'e';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c3 = 'f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c3 = 'g';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c3 = 't';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c3 = 137;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c3 = io.ktor.util.date.GMTDateParser.HOURS;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c3 = '_';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c3 = 130;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c3 = 'a';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c3 = 'b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c3 = 'c';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c3 = '4';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c3 = 'F';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c3 = 'v';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c3 = 'W';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c3 = 'x';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c3 = '\"';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c3 = '~';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c3 = 'X';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c3 = 'w';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c3 = 131;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c3 = 132;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c3 = '3';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c3 = '5';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c3 = 'i';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c3 = 'y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c3 = 138;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c3 = 31;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c3 = 134;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c3 = 'q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c3 = com.google.common.base.Ascii.MAX;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c3 = 129;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c3 = 'T';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c3 = 'I';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c3 = 'O';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c3 = 'P';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c3 = 'V';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c3 = '^';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c3 = 'k';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c3 = io.ktor.util.date.GMTDateParser.SECONDS;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c3 = 139;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c3 = 26;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c3 = 27;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c3 = '1';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c3 = kotlin.text.Typography.dollar;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c3 = '%';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c3 = kotlin.text.Typography.amp;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c3 = '\'';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c3 = '(';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c3 = ')';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c3 = io.ktor.util.date.GMTDateParser.MINUTES;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c3 = 'o';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c3 = 136;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c3 = '2';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c3 = 'K';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c3 = 'U';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c3 = '\\';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c3 = 'S';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c3 = 30;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c3 = io.ktor.util.date.GMTDateParser.ANY;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c3 = '+';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c3 = '-';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c3 = '.';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c3 = kotlinx.io.files.FileSystemKt.UnixPathSeparator;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c3 = '0';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c3 = 'l';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c3 = 'n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c3 = 'p';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c3 = 128;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c3 = 135;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c3 = 'C';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c3 = 'L';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c3 = io.ktor.util.date.GMTDateParser.MONTH;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c3 = 25;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c3 = 'R';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c3 = kotlin.text.Typography.less;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c3 = io.ktor.util.date.GMTDateParser.ZONE;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c3 = '|';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c3 = 'j';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c3 = 'r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c3 = '9';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c3 = ';';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c3 = 'Q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c3 = 'H';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c3 = '`';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c3 = 'N';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c3 = 'G';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c3 = kotlin.text.Typography.greater;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c3 = '#';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c3 = com.ironsource.B5.U;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c3 = 133;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c3 = 23;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c3 = 24;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c3 = 'D';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c3 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c3 = io.ktor.util.date.GMTDateParser.DAY_OF_MONTH;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c3 = 'E';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c3 = 29;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c3 = '?';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c3 = '@';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c3 = ' ';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c3 = '!';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c3 = 'A';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c3 = 'B';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    default:
                                        java.lang.String str5 = android.os.Build.MODEL;
                                        if (str5.hashCode() == -594534941) {
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case MRAID_JS_WRITE_FAILED_VALUE:
                                    case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                    case OMSDK_JS_WRITE_FAILED_VALUE:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case TPAT_RETRY_FAILED_VALUE:
                                    case 138:
                                    case androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                        break;
                                }
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    zzd = z;
                    zzc = true;
                }
                z = true;
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzbr(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        return android.os.Build.VERSION.SDK_INT >= 35 && zzvmVar.zzh;
    }

    private static java.util.List zzbs(android.content.Context context, com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzvx {
        java.lang.String str = zzvVar.zzp;
        if (str == null) {
            return com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        if (android.os.Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !com.google.android.gms.internal.ads.zzadb.zza(context)) {
            java.util.List zzd2 = com.google.android.gms.internal.ads.zzwf.zzd(zzvvVar, zzvVar, z, z2);
            if (!zzd2.isEmpty()) {
                return zzd2;
            }
        }
        return com.google.android.gms.internal.ads.zzwf.zzc(zzvvVar, zzvVar, z, z2);
    }

    private final void zzbt(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        int zze;
        com.google.android.gms.internal.ads.zzbf zzN = zzN();
        if (zzN.zzg() || (zze = zzN.zze(zzxkVar.zza)) == -1) {
            this.zzR = -9223372036854775807L;
        } else {
            this.zzR = zzN.zzd(zze, new com.google.android.gms.internal.ads.zzbd(), false).zzd;
        }
    }

    private final void zzbu(java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
        android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbC();
                android.view.Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int zze = zze();
        com.google.android.gms.internal.ads.zzvj zzaI = zzaI();
        if (zzaI != null && this.zzr == null) {
            com.google.android.gms.internal.ads.zzvm zzaL = zzaL();
            zzaL.getClass();
            if (!zzby(zzaL) || this.zzp) {
                zzaM();
                zzaE();
            } else {
                android.view.Surface zzbz = zzbz(zzaL);
                if (zzbz != null) {
                    zzaI.zzn(zzbz);
                } else {
                    if (android.os.Build.VERSION.SDK_INT < 35) {
                        throw new java.lang.IllegalStateException();
                    }
                    zzaI.zzo();
                }
            }
        }
        if (surface != null) {
            zzbC();
        } else {
            this.zzM = null;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzq();
            }
        }
        if (zze == 2) {
            com.google.android.gms.internal.ads.zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbv(com.google.android.gms.internal.ads.zziv zzivVar) {
        if (zzcW() || zzivVar.zzd() || this.zzR == -9223372036854775807L) {
            return true;
        }
        return this.zzR - (zzivVar.zze - zzbg()) <= androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    private final boolean zzbw(com.google.android.gms.internal.ads.zziv zzivVar) {
        return zzivVar.zze < zzH();
    }

    private final void zzbx(long j, long j2, com.google.android.gms.internal.ads.zzv zzvVar) {
        com.google.android.gms.internal.ads.zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            zzadrVar.zzcS(j, j2, zzvVar, zzaK());
        }
    }

    private final boolean zzby(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        if (this.zzr != null) {
            return true;
        }
        android.view.Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbr(zzvmVar) || zzaC(zzvmVar);
    }

    private final android.view.Surface zzbz(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzk();
        }
        android.view.Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbr(zzvmVar)) {
            return null;
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(zzaC(zzvmVar));
        com.google.android.gms.internal.ads.zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            if (zzadgVar.zza != zzvmVar.zzf) {
                zzbA();
            }
        }
        if (this.zzw == null) {
            this.zzw = com.google.android.gms.internal.ads.zzadg.zzb(this.zze, zzvmVar.zzf);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzA(long j, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null && !z) {
            zzaeuVar.zzg(true);
        }
        if (z2) {
            this.zzG = j;
        }
        super.zzA(j, z, z2);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        if (z) {
            com.google.android.gms.internal.ads.zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzC() {
        if (this.zzC > 0) {
            long zzb2 = zzM().zzb();
            this.zzg.zzd(this.zzC, zzb2 - this.zzB);
            this.zzC = 0;
            this.zzB = zzb2;
        }
        int i = this.zzJ;
        if (i != 0) {
            this.zzg.zze(this.zzI, i);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzb();
        } else {
            this.zzi.zzc();
        }
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzD() {
        this.zzM = null;
        this.zzR = -9223372036854775807L;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            com.google.android.gms.internal.ads.zzaeo zzaeoVar = this.zzg;
            zzaeoVar.zzi(this.zza);
            zzaeoVar.zzf(com.google.android.gms.internal.ads.zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = -9223372036854775807L;
            zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzF() {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzf) {
            return;
        }
        zzaeuVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzG(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        com.google.android.gms.internal.ads.zzxk zzO = zzO();
        if (zzO != null) {
            zzbt(zzO);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final java.lang.String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final boolean zzW(long j) {
        if (zzbf() == -9223372036854775807L || j < this.zzG) {
            return false;
        }
        long zzaY = zzaY();
        return zzaY == -9223372036854775807L || j > zzaY;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final void zzX(float f, float f2) throws com.google.android.gms.internal.ads.zzjk {
        super.zzX(f, f2);
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzm(f);
        } else {
            this.zzi.zzn(f);
        }
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzc(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzna
    public final void zzY() {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            this.zzi.zzh();
            return;
        }
        int i = this.zzt;
        if (i == 0 || i == 1) {
            this.zzt = 0;
        } else {
            zzaeuVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final void zzZ(long j, long j2) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            try {
                zzaeuVar.zzv(j, j2);
            } catch (com.google.android.gms.internal.ads.zzaet e) {
                throw zzP(e, e.zza, false, 7001);
            }
        }
        super.zzZ(j, j2);
    }

    protected final void zzaA(long j) {
        com.google.android.gms.internal.ads.zzjb zzjbVar = this.zza;
        zzjbVar.zzk += j;
        zzjbVar.zzl++;
        this.zzI += j;
        this.zzJ++;
    }

    protected final void zzaB(com.google.android.gms.internal.ads.zzvj zzvjVar, int i, long j, long j2) {
        android.os.Trace.beginSection("releaseOutputBuffer");
        zzvjVar.zzd(i, j2);
        android.os.Trace.endSection();
        this.zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            com.google.android.gms.internal.ads.zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(com.google.android.gms.internal.ads.zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbo();
        }
    }

    protected final boolean zzaC(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        if (zzbq(zzvmVar.zza)) {
            return false;
        }
        return !zzvmVar.zzf || com.google.android.gms.internal.ads.zzadg.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaG(com.google.android.gms.internal.ads.zzvm zzvmVar) {
        return zzby(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaO() {
        com.google.android.gms.internal.ads.zzvm zzaL = zzaL();
        if (this.zzr != null && zzaL != null) {
            java.lang.String str = zzaL.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaP() {
        boolean z;
        com.google.android.gms.internal.ads.zzv zzaJ = zzaJ();
        long j = this.zzR;
        if (j != -9223372036854775807L) {
            if (zzaQ() + j + 1 <= Long.MAX_VALUE - (zzbg() + this.zzR)) {
                z = false;
                return this.zzF == null || this.zzH || (zzaJ != null && zzaJ.zzr > 0) || z || zzbe() != -9223372036854775807L;
            }
        }
        z = true;
        if (this.zzF == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaR() {
        super.zzaR();
        this.zzn.clear();
        this.zzE = 0;
        this.zzT = 0;
        this.zzH = false;
        com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            zzacnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzvl zzaT(java.lang.Throwable th, com.google.android.gms.internal.ads.zzvm zzvmVar) {
        return new com.google.android.gms.internal.ads.zzacy(th, zzvmVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaU(com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || zzaeuVar.zze()) {
            return true;
        }
        try {
            zzaeuVar.zzd(zzvVar);
            return true;
        } catch (com.google.android.gms.internal.ads.zzaet e) {
            throw zzP(e, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaV(com.google.android.gms.internal.ads.zziv zzivVar) throws com.google.android.gms.internal.ads.zzjk {
        java.nio.ByteBuffer byteBuffer;
        com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            com.google.android.gms.internal.ads.zzvm zzaL = zzaL();
            zzaL.getClass();
            if (zzaL.zzb.equals("video/av01") && zzivVar.zzc() && (byteBuffer = zzivVar.zzc) != null) {
                zzacnVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int zzaW = zzaW(zzivVar);
        if (android.os.Build.VERSION.SDK_INT < 34 || (zzaW & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzaW(com.google.android.gms.internal.ads.zziv zzivVar) {
        return (android.os.Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbw(zzivVar) || zzbv(zzivVar)) ? 0 : 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzvt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean zzaX(com.google.android.gms.internal.ads.zziv zzivVar) {
        boolean z;
        java.nio.ByteBuffer byteBuffer;
        boolean z2 = false;
        if (zzbv(zzivVar)) {
            return false;
        }
        boolean zzbw = zzbw(zzivVar);
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            long zzb2 = zzadvVar.zzb(zzivVar.zze);
            if (zzb2 != -9223372036854775807L && zzb2 < this.zzl) {
                z = true;
                if ((zzbw && !z) || zzivVar.zze()) {
                    return false;
                }
                if (zzivVar.zzf()) {
                    com.google.android.gms.internal.ads.zzacn zzacnVar = this.zzk;
                    if (zzacnVar != null) {
                        com.google.android.gms.internal.ads.zzvm zzaL = zzaL();
                        zzaL.getClass();
                        if (zzaL.zzb.equals("video/av01") && (byteBuffer = zzivVar.zzc) != null) {
                            boolean z3 = zzbw || this.zzT <= 0;
                            java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            asReadOnlyBuffer.flip();
                            int zza = zzacnVar.zza(asReadOnlyBuffer, z3);
                            if (zza == 0) {
                                zzivVar.zza();
                            } else if (zza != asReadOnlyBuffer.limit()) {
                                com.google.android.gms.internal.ads.zzadd zzaddVar = this.zzo;
                                zzaddVar.getClass();
                                if (zzaddVar.zzc + zza < asReadOnlyBuffer.capacity() && !zzivVar.zzk()) {
                                    java.nio.ByteBuffer byteBuffer2 = zzivVar.zzc;
                                    byteBuffer2.getClass();
                                    byteBuffer2.position(zza);
                                }
                            }
                        }
                    }
                    if (z2) {
                        if (zzbw) {
                            this.zza.zzd++;
                        } else {
                            this.zzn.add(java.lang.Long.valueOf(zzivVar.zze));
                            this.zzT++;
                        }
                    }
                    return z2;
                }
                zzivVar.zza();
                z2 = true;
                if (z2) {
                }
                return z2;
            }
        }
        z = false;
        if (zzbw) {
        }
        if (zzivVar.zzf()) {
        }
        z2 = true;
        if (z2) {
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaZ(long j) {
        super.zzaZ(j);
        this.zzE--;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzaa() {
        boolean zzba = zzba();
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzh(zzba);
        }
        if (zzba && zzaI() == null) {
            return true;
        }
        return this.zzi.zzi(zzba);
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzab() {
        if (!super.zzab()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        return zzaeuVar == null || zzaeuVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzae(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzvx {
        boolean z;
        java.lang.String str = zzvVar.zzp;
        if (!com.google.android.gms.internal.ads.zzas.zzb(str)) {
            return 128;
        }
        android.content.Context context = this.zze;
        int i = 0;
        boolean z2 = zzvVar.zzt != null;
        java.util.List zzbs = zzbs(context, zzvvVar, zzvVar, z2, false);
        if (z2 && zzbs.isEmpty()) {
            zzbs = zzbs(context, zzvvVar, zzvVar, false, false);
        }
        if (zzbs.isEmpty()) {
            return 129;
        }
        if (!zzbj(zzvVar)) {
            return 130;
        }
        com.google.android.gms.internal.ads.zzvm zzvmVar = (com.google.android.gms.internal.ads.zzvm) zzbs.get(0);
        boolean zzc2 = zzvmVar.zzc(context, zzvVar);
        if (!zzc2) {
            for (int i2 = 1; i2 < zzbs.size(); i2++) {
                com.google.android.gms.internal.ads.zzvm zzvmVar2 = (com.google.android.gms.internal.ads.zzvm) zzbs.get(i2);
                if (zzvmVar2.zzc(context, zzvVar)) {
                    zzvmVar = zzvmVar2;
                    z = false;
                    zzc2 = true;
                    break;
                }
            }
        }
        z = true;
        int i3 = true != zzc2 ? 3 : 4;
        int i4 = true != zzvmVar.zze(zzvVar) ? 8 : 16;
        int i5 = true != zzvmVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (android.os.Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !com.google.android.gms.internal.ads.zzadb.zza(context)) {
            i6 = 256;
        }
        if (zzc2) {
            java.util.List zzbs2 = zzbs(context, zzvvVar, zzvVar, z2, true);
            if (!zzbs2.isEmpty()) {
                com.google.android.gms.internal.ads.zzvm zzvmVar3 = (com.google.android.gms.internal.ads.zzvm) com.google.android.gms.internal.ads.zzwf.zze(context, zzbs2, zzvVar).get(0);
                if (zzvmVar3.zzc(context, zzvVar) && zzvmVar3.zze(zzvVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final java.util.List zzaf(com.google.android.gms.internal.ads.zzvv zzvvVar, com.google.android.gms.internal.ads.zzv zzvVar, boolean z) throws com.google.android.gms.internal.ads.zzvx {
        android.content.Context context = this.zze;
        return com.google.android.gms.internal.ads.zzwf.zze(context, zzbs(context, zzvvVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzvg zzah(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaCrypto mediaCrypto, float f) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzadd zzaddVar;
        android.graphics.Point point;
        int i3;
        boolean z;
        com.google.android.gms.internal.ads.zzv[] zzvVarArr;
        boolean z2;
        android.util.Pair zze;
        int zzaw;
        com.google.android.gms.internal.ads.zzv[] zzJ = zzJ();
        int length = zzJ.length;
        int zzbm = zzbm(zzvmVar, zzvVar);
        int i4 = zzvVar.zzx;
        int i5 = zzvVar.zzw;
        if (length == 1) {
            if (zzbm != -1 && (zzaw = zzaw(zzvmVar, zzvVar)) != -1) {
                zzbm = java.lang.Math.min((int) (zzbm * 1.5f), zzaw);
            }
            zzaddVar = new com.google.android.gms.internal.ads.zzadd(i5, i4, zzbm);
            i = i4;
            i2 = i5;
        } else {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            boolean z3 = false;
            while (i8 < length) {
                com.google.android.gms.internal.ads.zzv zzvVar2 = zzJ[i8];
                com.google.android.gms.internal.ads.zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVar2.zzF == null) {
                    com.google.android.gms.internal.ads.zzt zza = zzvVar2.zza();
                    zza.zzE(zziVar);
                    zzvVar2 = zza.zzO();
                }
                if (zzvmVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    int i9 = zzvVar2.zzw;
                    if (i9 != -1) {
                        zzvVarArr = zzJ;
                        if (zzvVar2.zzx != -1) {
                            z2 = false;
                            z3 |= z2;
                            i7 = java.lang.Math.max(i7, i9);
                            i6 = java.lang.Math.max(i6, zzvVar2.zzx);
                            zzbm = java.lang.Math.max(zzbm, zzbm(zzvmVar, zzvVar2));
                        }
                    } else {
                        zzvVarArr = zzJ;
                    }
                    z2 = true;
                    z3 |= z2;
                    i7 = java.lang.Math.max(i7, i9);
                    i6 = java.lang.Math.max(i6, zzvVar2.zzx);
                    zzbm = java.lang.Math.max(zzbm, zzbm(zzvmVar, zzvVar2));
                } else {
                    zzvVarArr = zzJ;
                }
                i8++;
                zzJ = zzvVarArr;
            }
            if (z3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i7).length() + 44 + java.lang.String.valueOf(i6).length());
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i7);
                sb.append("x");
                sb.append(i6);
                com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecVideoRenderer", sb.toString());
                boolean z4 = i4 > i5;
                int i10 = z4 ? i4 : i5;
                int i11 = true != z4 ? i4 : i5;
                int[] iArr = zzb;
                int i12 = 0;
                while (true) {
                    if (i12 >= 9) {
                        i = i4;
                        i2 = i5;
                        break;
                    }
                    float f2 = i11;
                    i = i4;
                    float f3 = i10;
                    i2 = i5;
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    float f4 = i13;
                    if (i13 <= i10 || (i3 = (int) (f4 * (f2 / f3))) <= i11) {
                        break;
                    }
                    int i14 = true != z4 ? i13 : i3;
                    if (true != z4) {
                        i13 = i3;
                    }
                    point = zzvmVar.zzi(i14, i13);
                    float f5 = zzvVar.zzA;
                    if (point != null) {
                        z = z4;
                        if (zzvmVar.zzg(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        z = z4;
                    }
                    i12++;
                    i4 = i;
                    i5 = i2;
                    iArr = iArr2;
                    z4 = z;
                }
                point = null;
                if (point != null) {
                    i7 = java.lang.Math.max(i7, point.x);
                    i6 = java.lang.Math.max(i6, point.y);
                    com.google.android.gms.internal.ads.zzt zza2 = zzvVar.zza();
                    zza2.zzv(i7);
                    zza2.zzw(i6);
                    zzbm = java.lang.Math.max(zzbm, zzaw(zzvmVar, zza2.zzO()));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i7).length() + 35 + java.lang.String.valueOf(i6).length());
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i7);
                    sb2.append("x");
                    sb2.append(i6);
                    com.google.android.gms.internal.ads.zzeg.zzc("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                i = i4;
                i2 = i5;
            }
            zzaddVar = new com.google.android.gms.internal.ads.zzadd(i7, i6, zzbm);
        }
        java.lang.String str = zzvmVar.zzc;
        this.zzo = zzaddVar;
        boolean z5 = this.zzh;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i2);
        mediaFormat.setInteger("height", i);
        com.google.android.gms.internal.ads.zzej.zza(mediaFormat, zzvVar.zzs);
        float f6 = zzvVar.zzA;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        com.google.android.gms.internal.ads.zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (zze = com.google.android.gms.internal.ads.zzdq.zze(zzvVar)) != null) {
            com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) zze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaddVar.zza);
        mediaFormat.setInteger("max-height", zzaddVar.zzb);
        com.google.android.gms.internal.ads.zzej.zzb(mediaFormat, "max-input-size", zzaddVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.zzN));
        }
        zzbi(mediaFormat);
        android.view.Surface zzbz = zzbz(zzvmVar);
        if (this.zzr != null && !com.google.android.gms.internal.ads.zzfl.zzU(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return com.google.android.gms.internal.ads.zzvg.zzb(zzvmVar, mediaFormat, zzvVar, zzbz, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzjc zzai(com.google.android.gms.internal.ads.zzvm zzvmVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzjc zzf = zzvmVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        com.google.android.gms.internal.ads.zzadd zzaddVar = this.zzo;
        zzaddVar.getClass();
        if (zzvVar2.zzw > zzaddVar.zza || zzvVar2.zzx > zzaddVar.zzb) {
            i3 |= 256;
        }
        if (zzbm(zzvmVar, zzvVar2) > zzaddVar.zzc) {
            i3 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE) {
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                float f2 = zzvVar2.zzA;
                if (f2 != -1.0f && java.lang.Math.abs(f2 - f) > 1.0f && (android.os.Build.VERSION.SDK_INT < 30 || (android.os.Build.VERSION.SDK_INT == 30 && android.os.Build.MODEL.startsWith("MiTV")))) {
                    i3 |= 65536;
                }
            }
        }
        java.lang.String str = zzvmVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzf.zzd;
            i2 = 0;
        }
        return new com.google.android.gms.internal.ads.zzjc(str, zzvVar, zzvVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final float zzak(float f, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv[] zzvVarArr) {
        com.google.android.gms.internal.ads.zzvm zzaL;
        float f2 = -1.0f;
        for (com.google.android.gms.internal.ads.zzv zzvVar2 : zzvVarArr) {
            float f3 = zzvVar2.zzA;
            if (f3 != -1.0f) {
                f2 = java.lang.Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f2 * f;
        if (this.zzF == null || (zzaL = zzaL()) == null) {
            return f4;
        }
        float zzh = zzaL.zzh(zzvVar.zzw, zzvVar.zzx);
        return f4 != -1.0f ? java.lang.Math.max(f4, zzh) : zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzal(java.lang.String str, com.google.android.gms.internal.ads.zzvg zzvgVar, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzp = zzbq(str);
        com.google.android.gms.internal.ads.zzvm zzaL = zzaL();
        zzaL.getClass();
        boolean z = false;
        if (android.os.Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(zzaL.zzb)) {
            android.media.MediaCodecInfo.CodecProfileLevel[] zzb2 = zzaL.zzb();
            int length = zzb2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (zzb2[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzam(java.lang.String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzan(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzeg.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final com.google.android.gms.internal.ads.zzjc zzao(com.google.android.gms.internal.ads.zzlw zzlwVar) throws com.google.android.gms.internal.ads.zzjk {
        com.google.android.gms.internal.ads.zzjc zzao = super.zzao(zzlwVar);
        com.google.android.gms.internal.ads.zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzao);
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        return zzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzap(com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaFormat mediaFormat) {
        com.google.android.gms.internal.ads.zzvj zzaI = zzaI();
        if (zzaI != null) {
            zzaI.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzvVar.zzC;
        int i = zzvVar.zzB;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzL = new com.google.android.gms.internal.ads.zzbv(integer, integer2, f);
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzS) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
            zza.zzv(integer);
            zza.zzw(integer2);
            zza.zzB(f);
            com.google.android.gms.internal.ads.zzv zzO = zza.zzO();
            int i3 = this.zzt;
            java.util.List list = this.zzu;
            if (list == null) {
                list = com.google.android.gms.internal.ads.zzgwm.zzi();
            }
            zzaeuVar.zzs(1, zzO, zzbh(), i3, list);
            this.zzt = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzaq(long j, long j2, long j3, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        int zzR;
        if (this.zzr != null && this.zzf) {
            j2 -= -this.zzQ;
        }
        if (j >= -500000 || z || (zzR = zzR(j2)) == 0) {
            return false;
        }
        this.zzG = j2;
        if (z2) {
            com.google.android.gms.internal.ads.zzjb zzjbVar = this.zza;
            int i = zzjbVar.zzd + zzR;
            zzjbVar.zzd = i;
            zzjbVar.zzf += this.zzE;
            zzjbVar.zzd = i + this.zzn.size();
        } else {
            this.zza.zzj++;
            zzaz(zzR + this.zzn.size(), this.zzE);
        }
        zzaN();
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzar() {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
            long j = this.zzQ;
            if (j == -9223372036854775807L) {
                j = zzbh();
                this.zzQ = j;
            }
            this.zzr.zzo(-j);
        } else {
            this.zzi.zza(2);
        }
        this.zzS = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzat(com.google.android.gms.internal.ads.zziz zzizVar) {
        this.zzg.zzk(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzau() {
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
        } else if (zzbe() != -9223372036854775807L) {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzav(com.google.android.gms.internal.ads.zziv zzivVar) throws com.google.android.gms.internal.ads.zzjk {
        if (this.zzq) {
            java.nio.ByteBuffer byteBuffer = zzivVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        com.google.android.gms.internal.ads.zzvj zzaI = zzaI();
                        zzaI.getClass();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaI.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzax(com.google.android.gms.internal.ads.zzvj zzvjVar, int i, long j) {
        android.os.Trace.beginSection("skipVideoBuffer");
        zzvjVar.zzc(i, false);
        android.os.Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzay(com.google.android.gms.internal.ads.zzvj zzvjVar, int i, long j) {
        android.os.Trace.beginSection("dropVideoBuffer");
        zzvjVar.zzc(i, false);
        android.os.Trace.endSection();
        zzaz(0, 1);
    }

    protected final void zzaz(int i, int i2) {
        com.google.android.gms.internal.ads.zzjb zzjbVar = this.zza;
        zzjbVar.zzh += i;
        int i3 = i + i2;
        zzjbVar.zzg += i3;
        this.zzC += i3;
        int i4 = this.zzD + i3;
        this.zzD = i4;
        zzjbVar.zzi = java.lang.Math.max(i4, zzjbVar.zzi);
    }

    final /* synthetic */ android.view.Surface zzbp() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzjk {
        super.zzy(z, z2);
        zzK();
        this.zzg.zza(this.zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                com.google.android.gms.internal.ads.zzadi zzadiVar = new com.google.android.gms.internal.ads.zzadi(this.zze, this.zzi);
                zzadiVar.zza(true);
                zzadiVar.zzc(-this.zzl);
                zzadiVar.zzb(zzM());
                com.google.android.gms.internal.ads.zzadq zzd2 = zzadiVar.zzd();
                zzd2.zza(1);
                this.zzr = zzd2.zzb(0);
            }
            this.zzs = true;
        }
        int i = !z2 ? 1 : 0;
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            com.google.android.gms.internal.ads.zzadu zzaduVar = this.zzi;
            zzaduVar.zzg(zzM());
            zzaduVar.zza(i);
            return;
        }
        zzaeuVar.zzc(new com.google.android.gms.internal.ads.zzacz(this), com.google.android.gms.internal.ads.zzhcn.zza());
        com.google.android.gms.internal.ads.zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            this.zzr.zzl(zzadrVar);
        }
        if (this.zzv != null && !this.zzx.equals(com.google.android.gms.internal.ads.zzeu.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbb());
        java.util.List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i;
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzz(com.google.android.gms.internal.ads.zzv[] zzvVarArr, long j, long j2, com.google.android.gms.internal.ads.zzxk zzxkVar) throws com.google.android.gms.internal.ads.zzjk {
        super.zzz(zzvVarArr, j, j2, zzxkVar);
        zzbt(zzxkVar);
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzas(long j, long j2, com.google.android.gms.internal.ads.zzvj zzvjVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.gms.internal.ads.zzv zzvVar) throws com.google.android.gms.internal.ads.zzjk {
        zzvjVar.getClass();
        long zzbg = j3 - zzbg();
        int i4 = 0;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.zzn;
            java.lang.Long l = (java.lang.Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            priorityQueue.poll();
            i4++;
        }
        zzaz(i4, 0);
        com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            if (!z || z2) {
                return zzaeuVar.zzu(j3, new com.google.android.gms.internal.ads.zzada(this, zzvjVar, i, zzbg));
            }
            zzax(zzvjVar, i, zzbg);
            return true;
        }
        com.google.android.gms.internal.ads.zzadu zzaduVar = this.zzi;
        long zzbh = zzbh();
        com.google.android.gms.internal.ads.zzads zzadsVar = this.zzj;
        int zzk = zzaduVar.zzk(j3, j, j2, zzbh, z, z2, zzadsVar);
        com.google.android.gms.internal.ads.zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            if (zzk == 5 || zzk == 4) {
                return false;
            }
            zzadvVar.zza(j3, zzadsVar.zza());
        }
        if (zzk == 0) {
            long zzc2 = zzM().zzc();
            zzbx(zzbg, zzc2, zzvVar);
            zzaB(zzvjVar, i, zzbg, zzc2);
            zzaA(zzadsVar.zza());
            return true;
        }
        if (zzk != 1) {
            if (zzk == 2) {
                zzay(zzvjVar, i, zzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (zzk != 3) {
                return false;
            }
            zzax(zzvjVar, i, zzbg);
            zzaA(zzadsVar.zza());
            return true;
        }
        long zzb2 = zzadsVar.zzb();
        long zza = zzadsVar.zza();
        if (zzb2 == this.zzK) {
            zzax(zzvjVar, i, zzbg);
        } else {
            zzbx(zzbg, zzb2, zzvVar);
            zzaB(zzvjVar, i, zzbg, zzb2);
        }
        zzaA(zza);
        this.zzK = zzb2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public final void zzx(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzjk {
        if (i == 1) {
            zzbu(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            com.google.android.gms.internal.ads.zzadr zzadrVar = (com.google.android.gms.internal.ads.zzadr) obj;
            this.zzP = zzadrVar;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzl(zzadrVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((java.lang.Integer) obj).intValue();
            if (this.zzO != intValue) {
                this.zzO = intValue;
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((java.lang.Integer) obj).intValue();
            this.zzz = intValue2;
            com.google.android.gms.internal.ads.zzvj zzaI = zzaI();
            if (zzaI != null) {
                zzaI.zzq(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((java.lang.Integer) obj).intValue();
            this.zzA = intValue3;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzr(intValue3);
                return;
            } else {
                this.zzi.zzm(intValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            java.util.List list = (java.util.List) obj;
            if (list.equals(com.google.android.gms.internal.ads.zzbr.zza)) {
                com.google.android.gms.internal.ads.zzaeu zzaeuVar3 = this.zzr;
                if (zzaeuVar3 == null || !zzaeuVar3.zze()) {
                    return;
                }
                zzaeuVar3.zzf();
                return;
            }
            this.zzu = list;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar4 = this.zzr;
            if (zzaeuVar4 != null) {
                zzaeuVar4.zzn(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            com.google.android.gms.internal.ads.zzeu zzeuVar = (com.google.android.gms.internal.ads.zzeu) obj;
            if (zzeuVar.zza() == 0 || zzeuVar.zzb() == 0) {
                return;
            }
            this.zzx = zzeuVar;
            com.google.android.gms.internal.ads.zzaeu zzaeuVar5 = this.zzr;
            if (zzaeuVar5 != null) {
                android.view.Surface surface = this.zzv;
                surface.getClass();
                zzaeuVar5.zzp(surface, zzeuVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.zzN = ((java.lang.Integer) obj).intValue();
                com.google.android.gms.internal.ads.zzvj zzaI2 = zzaI();
                if (zzaI2 != null && android.os.Build.VERSION.SDK_INT >= 35) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("importance", java.lang.Math.max(0, -this.zzN));
                    zzaI2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                android.view.Surface surface2 = this.zzv;
                zzbu(null);
                obj.getClass();
                ((com.google.android.gms.internal.ads.zzade) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z = this.zzF != null;
                com.google.android.gms.internal.ads.zznh zznhVar = (com.google.android.gms.internal.ads.zznh) obj;
                this.zzF = zznhVar;
                if (z != (zznhVar != null)) {
                    zzbd();
                    break;
                }
                break;
            default:
                super.zzx(i, obj);
                break;
        }
    }
}
