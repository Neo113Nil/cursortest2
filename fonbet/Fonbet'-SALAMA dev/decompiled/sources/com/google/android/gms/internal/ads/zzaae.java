package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.ProfileContext;
import io.sentry.TransactionOptions;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzaae extends zzsy implements zzaat {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzE;
    private zzcc zzF;
    private zzcc zzG;
    private int zzH;
    private int zzI;
    private zzaar zzJ;
    private long zzK;
    private long zzL;
    private boolean zzM;
    private boolean zzN;
    private final Context zze;
    private final boolean zzf;
    private final zzabk zzg;
    private final boolean zzh;
    private final zzaau zzi;
    private final zzaas zzj;
    private final long zzk;
    private final PriorityQueue zzl;
    private zzaad zzm;
    private boolean zzn;
    private boolean zzo;
    private zzabo zzp;
    private boolean zzq;
    private List zzr;
    private Surface zzs;
    private zzaah zzt;
    private zzee zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private int zzz;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaae(zzaac zzaacVar) {
        super(2, r2, r3, false, 30.0f);
        zzsm zzsmVar;
        zzta zztaVar;
        Context context;
        Handler handler;
        zzabl zzablVar;
        zzsmVar = zzaacVar.zzd;
        zztaVar = zzaacVar.zzc;
        context = zzaacVar.zza;
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzp = null;
        handler = zzaacVar.zze;
        zzablVar = zzaacVar.zzf;
        this.zzg = new zzabk(handler, zzablVar);
        this.zzf = this.zzp == null;
        this.zzi = new zzaau(applicationContext, this, 0L);
        this.zzj = new zzaas();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzu = zzee.zza;
        this.zzw = 1;
        this.zzx = 0;
        this.zzF = zzcc.zza;
        this.zzI = 0;
        this.zzG = null;
        this.zzH = -1000;
        this.zzK = -9223372036854775807L;
        this.zzL = -9223372036854775807L;
        this.zzl = new PriorityQueue();
        this.zzk = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04c2, code lost:
    
        if (r0.equals("deb") != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x079d, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L516;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzaT(String str) {
        boolean z4;
        boolean z7;
        boolean z8 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzaae.class) {
            if (!zzc) {
                int i7 = zzen.zza;
                char c3 = 28;
                if (i7 <= 28) {
                    String str2 = Build.DEVICE;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z7 = true;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z7 = 3;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z7 = 2;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z7 = 7;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z7 = false;
                                break;
                            }
                            z7 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z7 = 4;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z7 = 6;
                                break;
                            }
                            z7 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z7 = 5;
                                break;
                            }
                            z7 = -1;
                            break;
                        default:
                            z7 = -1;
                            break;
                    }
                    switch (z7) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z8 = true;
                            break;
                    }
                    zzd = z8;
                    zzc = true;
                }
                if (i7 > 27 || !"HWEML".equals(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z4 = 6;
                                break;
                            }
                            z4 = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z4 = 7;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z4 = false;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z4 = true;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z4 = 2;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z4 = 3;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z4 = 4;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z4 = 8;
                                break;
                            }
                            z4 = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z4 = 5;
                                break;
                            }
                            z4 = -1;
                            break;
                        default:
                            z4 = -1;
                            break;
                    }
                    switch (z4) {
                        default:
                            if (i7 <= 26) {
                                String str4 = Build.DEVICE;
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
                                            c3 = 'Y';
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
                                            c3 = 'h';
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
                                            c3 = '[';
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
                                            c3 = 127;
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
                                            c3 = 's';
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
                                            c3 = '$';
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
                                            c3 = '&';
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
                                            c3 = ']';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c3 = 'm';
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
                                            c3 = '*';
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
                                            c3 = ',';
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
                                            c3 = '/';
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
                                            c3 = 'M';
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
                                            c3 = '<';
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
                                            c3 = 'z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c3 = '{';
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
                                            c3 = '}';
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
                                            c3 = ':';
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
                                            c3 = '>';
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
                                            c3 = '=';
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
                                            c3 = 'u';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c3 = 'd';
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
                                        if (str3.hashCode() == -594534941) {
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
                                    case zzbbd.zzt.zzm /* 21 */:
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
                                    case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
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
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            break;
                    }
                    zzd = z8;
                    zzc = true;
                }
                z8 = true;
                zzd = z8;
                zzc = true;
            }
        }
        return zzd;
    }

    public static final boolean zzaU(zzsr zzsrVar) {
        return zzen.zza >= 35 && zzsrVar.zzh;
    }

    private final Surface zzaV(zzsr zzsrVar) {
        if (this.zzp != null) {
            zzcv.zzf(false);
            zzcv.zzb(null);
            throw null;
        }
        Surface surface = this.zzs;
        if (surface != null) {
            return surface;
        }
        if (zzaU(zzsrVar)) {
            return null;
        }
        zzcv.zzf(zzaS(zzsrVar));
        zzaah zzaahVar = this.zzt;
        if (zzaahVar != null) {
            if (zzaahVar.zza != zzsrVar.zzf) {
                zzaY();
            }
        }
        if (this.zzt == null) {
            this.zzt = zzaah.zza(this.zze, zzsrVar.zzf);
        }
        return this.zzt;
    }

    private static List zzaW(Context context, zzta zztaVar, zzz zzzVar, boolean z4, boolean z7) {
        String str = zzzVar.zzo;
        if (str == null) {
            return zzfwh.zzn();
        }
        if (zzen.zza >= 26 && "video/dolby-vision".equals(str) && !zzaab.zza(context)) {
            List zzc2 = zztl.zzc(zztaVar, zzzVar, z4, z7);
            if (!zzc2.isEmpty()) {
                return zzc2;
            }
        }
        return zztl.zze(zztaVar, zzzVar, z4, z7);
    }

    private final void zzaX() {
        zzcc zzccVar = this.zzG;
        if (zzccVar != null) {
            this.zzg.zzt(zzccVar);
        }
    }

    private final void zzaY() {
        zzaah zzaahVar = this.zzt;
        if (zzaahVar != null) {
            zzaahVar.release();
            this.zzt = null;
        }
    }

    private final void zzaZ(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzs == surface) {
            if (surface != null) {
                zzaX();
                Surface surface2 = this.zzs;
                if (surface2 == null || !this.zzv) {
                    return;
                }
                this.zzg.zzq(surface2);
                return;
            }
            return;
        }
        this.zzs = surface;
        if (this.zzp == null) {
            this.zzi.zzm(surface);
        }
        this.zzv = false;
        int zzcT = zzcT();
        zzso zzaz = zzaz();
        if (zzaz != null && this.zzp == null) {
            zzsr zzaB = zzaB();
            zzaB.getClass();
            boolean zzba = zzba(zzaB);
            int i7 = zzen.zza;
            if (!zzba || this.zzn) {
                zzaF();
                zzaC();
            } else {
                Surface zzaV = zzaV(zzaB);
                if (zzaV != null) {
                    zzaz.zzp(zzaV);
                } else {
                    if (zzen.zza < 35) {
                        throw new IllegalStateException();
                    }
                    zzaz.zzi();
                }
            }
        }
        if (surface == null) {
            this.zzG = null;
            zzabo zzaboVar = this.zzp;
            if (zzaboVar != null) {
                ((zzaal) zzaboVar).zza.zzn();
                return;
            }
            return;
        }
        zzaX();
        if (zzcT == 2) {
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzf(true);
            } else {
                this.zzi.zzc(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007e, code lost:
    
        if (r3.equals("video/av01") != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzad(zzsr zzsrVar, zzz zzzVar) {
        int i7 = zzzVar.zzv;
        int i8 = zzzVar.zzw;
        if (i7 != -1 && i8 != -1) {
            String str = zzzVar.zzo;
            str.getClass();
            char c3 = 2;
            if ("video/dolby-vision".equals(str)) {
                int i9 = zztl.zza;
                Pair zza = zzda.zza(zzzVar);
                if (zza != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            int i10 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i7 * i8) * 3) / i10;
                case 4:
                    return Math.max(2097152, ((i7 * i8) * 3) / 4);
                case 5:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !zzsrVar.zzf)))) {
                        int i11 = zzen.zza;
                        return ((((i8 + 15) / 16) * ((i7 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i10 = 8;
                    return ((i7 * i8) * 3) / i10;
            }
        }
        return -1;
    }

    public static int zzae(zzsr zzsrVar, zzz zzzVar) {
        if (zzzVar.zzp == -1) {
            return zzad(zzsrVar, zzzVar);
        }
        int size = zzzVar.zzr.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((byte[]) zzzVar.zzr.get(i8)).length;
        }
        return zzzVar.zzp + i7;
    }

    private final boolean zzba(zzsr zzsrVar) {
        if (this.zzp != null) {
            return true;
        }
        Surface surface = this.zzs;
        return (surface != null && surface.isValid()) || zzaU(zzsrVar) || zzaS(zzsrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzA() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null || !this.zzf) {
            return;
        }
        ((zzaal) zzaboVar).zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzq = false;
            this.zzK = -9223372036854775807L;
            zzaY();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD() {
        zzabo zzaboVar;
        this.zzz = 0;
        this.zzy = zzi().zzb();
        this.zzC = 0L;
        this.zzD = 0;
        zzabo zzaboVar2 = this.zzp;
        if (zzaboVar2 == null) {
            this.zzi.zzg();
        } else {
            zzaboVar = ((zzaal) zzaboVar2).zza.zzg;
            zzaboVar.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE() {
        zzabo zzaboVar;
        if (this.zzz > 0) {
            long zzb2 = zzi().zzb();
            this.zzg.zzn(this.zzz, zzb2 - this.zzy);
            this.zzz = 0;
            this.zzy = zzb2;
        }
        int i7 = this.zzD;
        if (i7 != 0) {
            this.zzg.zzr(this.zzC, i7);
            this.zzC = 0L;
            this.zzD = 0;
        }
        zzabo zzaboVar2 = this.zzp;
        if (zzaboVar2 == null) {
            this.zzi.zzh();
        } else {
            zzaboVar = ((zzaal) zzaboVar2).zza.zzg;
            zzaboVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzF(zzz[] zzzVarArr, long j, long j3, zzuq zzuqVar) {
        super.zzF(zzzVarArr, j, j3, zzuqVar);
        if (this.zzK == -9223372036854775807L) {
            this.zzK = j;
        }
        zzbn zzh = zzh();
        if (zzh.zzo()) {
            this.zzL = -9223372036854775807L;
        } else {
            this.zzL = zzh.zzn(zzuqVar.zza, new zzbl()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public final void zzM(float f7, float f8) {
        super.zzM(f7, f8);
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            ((zzaal) zzaboVar).zza.zzg.zzn(f7);
        } else {
            this.zzi.zzn(f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlm, com.google.android.gms.internal.ads.zzlp
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final void zzV(long j, long j3) {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            try {
                ((zzaal) zzaboVar).zza.zzg.zzl(j, j3);
            } catch (zzabn e7) {
                throw zzcW(e7, e7.zza, false, 7001);
            }
        }
        super.zzV(j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzW() {
        return super.zzW() && this.zzp == null;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzX() {
        boolean zzt;
        boolean zzX = super.zzX();
        zzabo zzaboVar = this.zzp;
        boolean z4 = false;
        if (zzaboVar != null) {
            zzt = ((zzaal) zzaboVar).zza.zzg.zzt(false);
            return zzt;
        }
        if (zzX) {
            z4 = true;
            if (zzaz() == null || this.zzs == null) {
                return true;
            }
        }
        return this.zzi.zzo(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f7, zzz zzzVar, zzz[] zzzVarArr) {
        float f8 = -1.0f;
        for (zzz zzzVar2 : zzzVarArr) {
            float f9 = zzzVar2.zzx;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsq zzaA(Throwable th, zzsr zzsrVar) {
        return new zzzz(th, zzsrVar, this.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaD(long j) {
        super.zzaD(j);
        this.zzB--;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaE(zzhg zzhgVar) {
        this.zzB++;
        int i7 = zzen.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaG() {
        super.zzaG();
        this.zzl.clear();
        this.zzN = false;
        this.zzB = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaM(zzz zzzVar) {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null) {
            return true;
        }
        try {
            zzaaq.zzb(((zzaal) zzaboVar).zza, zzzVar, 0);
            return false;
        } catch (zzabn e7) {
            throw zzcW(e7, zzzVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaN(zzhg zzhgVar) {
        if (!zzQ() && !zzhgVar.zzh() && this.zzL != -9223372036854775807L) {
            if (this.zzL - (zzhgVar.zze - zzav()) > 100000 && !zzhgVar.zzl()) {
                boolean z4 = zzhgVar.zze < zzf();
                if ((z4 || this.zzN) && !zzhgVar.zze() && zzhgVar.zzi()) {
                    zzhgVar.zzb();
                    if (z4) {
                        ((zzsy) this).zza.zzd++;
                    } else if (this.zzN) {
                        this.zzl.add(Long.valueOf(zzhgVar.zze));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzaO(zzsr zzsrVar) {
        return zzba(zzsrVar);
    }

    public final void zzaQ(long j) {
        zzhq zzhqVar = ((zzsy) this).zza;
        zzhqVar.zzk += j;
        zzhqVar.zzl++;
        this.zzC += j;
        this.zzD++;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final boolean zzaR(long j, long j3, long j7, boolean z4, boolean z7) {
        int zzd2;
        long j8 = this.zzk;
        if (j8 != -9223372036854775807L) {
            this.zzN = j < j8;
        }
        if (j >= -500000 || z4 || (zzd2 = zzd(j3)) == 0) {
            return false;
        }
        if (z7) {
            zzhq zzhqVar = ((zzsy) this).zza;
            int i7 = zzhqVar.zzd + zzd2;
            zzhqVar.zzd = i7;
            zzhqVar.zzf += this.zzB;
            zzhqVar.zzd = this.zzl.size() + i7;
        } else {
            ((zzsy) this).zza.zzj++;
            zzao(this.zzl.size() + zzd2, this.zzB);
        }
        zzaI();
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zze(false);
        }
        return true;
    }

    public final boolean zzaS(zzsr zzsrVar) {
        int i7 = zzen.zza;
        if (zzaT(zzsrVar.zza)) {
            return false;
        }
        return !zzsrVar.zzf || zzaah.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzz zzzVar) {
        boolean z4;
        if (!zzay.zzj(zzzVar.zzo)) {
            return 128;
        }
        Context context = this.zze;
        int i7 = 0;
        boolean z7 = zzzVar.zzs != null;
        List zzaW = zzaW(context, zztaVar, zzzVar, z7, false);
        if (z7 && zzaW.isEmpty()) {
            zzaW = zzaW(context, zztaVar, zzzVar, false, false);
        }
        if (zzaW.isEmpty()) {
            return 129;
        }
        if (!zzsy.zzaP(zzzVar)) {
            return 130;
        }
        zzsr zzsrVar = (zzsr) zzaW.get(0);
        boolean zze = zzsrVar.zze(zzzVar);
        if (!zze) {
            for (int i8 = 1; i8 < zzaW.size(); i8++) {
                zzsr zzsrVar2 = (zzsr) zzaW.get(i8);
                if (zzsrVar2.zze(zzzVar)) {
                    zze = true;
                    z4 = false;
                    zzsrVar = zzsrVar2;
                    break;
                }
            }
        }
        z4 = true;
        int i9 = true != zze ? 3 : 4;
        int i10 = true != zzsrVar.zzf(zzzVar) ? 8 : 16;
        int i11 = true != zzsrVar.zzg ? 0 : 64;
        int i12 = true != z4 ? 0 : 128;
        if (zzen.zza >= 26 && "video/dolby-vision".equals(zzzVar.zzo) && !zzaab.zza(context)) {
            i12 = 256;
        }
        if (zze) {
            List zzaW2 = zzaW(context, zztaVar, zzzVar, z7, true);
            if (!zzaW2.isEmpty()) {
                zzsr zzsrVar3 = (zzsr) zztl.zzf(zzaW2, zzzVar).get(0);
                if (zzsrVar3.zze(zzzVar) && zzsrVar3.zzf(zzzVar)) {
                    i7 = 32;
                }
            }
        }
        return i12 | i9 | i10 | i7 | i11;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzab(zzsr zzsrVar, zzz zzzVar, zzz zzzVar2) {
        int i7;
        int i8;
        zzhr zzb2 = zzsrVar.zzb(zzzVar, zzzVar2);
        int i9 = zzb2.zze;
        zzaad zzaadVar = this.zzm;
        zzaadVar.getClass();
        if (zzzVar2.zzv > zzaadVar.zza || zzzVar2.zzw > zzaadVar.zzb) {
            i9 |= 256;
        }
        if (zzae(zzsrVar, zzzVar2) > zzaadVar.zzc) {
            i9 |= 64;
        }
        String str = zzsrVar.zza;
        if (i9 != 0) {
            i8 = i9;
            i7 = 0;
        } else {
            i7 = zzb2.zzd;
            i8 = 0;
        }
        return new zzhr(str, zzzVar, zzzVar2, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzac(zzkh zzkhVar) {
        zzhr zzac = super.zzac(zzkhVar);
        zzz zzzVar = zzkhVar.zza;
        zzzVar.getClass();
        this.zzg.zzp(zzzVar, zzac);
        return zzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzsl zzaf(zzsr zzsrVar, zzz zzzVar, MediaCrypto mediaCrypto, float f7) {
        Point point;
        int i7;
        int i8;
        boolean z4;
        int zzad;
        zzz[] zzT = zzT();
        int length = zzT.length;
        int zzae = zzae(zzsrVar, zzzVar);
        int i9 = zzzVar.zzv;
        int i10 = zzzVar.zzw;
        if (length != 1) {
            boolean z7 = false;
            for (int i11 = 0; i11 < length; i11++) {
                zzz zzzVar2 = zzT[i11];
                if (zzzVar.zzC != null && zzzVar2.zzC == null) {
                    zzx zzb2 = zzzVar2.zzb();
                    zzb2.zzD(zzzVar.zzC);
                    zzzVar2 = zzb2.zzaj();
                }
                if (zzsrVar.zzb(zzzVar, zzzVar2).zzd != 0) {
                    int i12 = zzzVar2.zzv;
                    z7 |= i12 == -1 || zzzVar2.zzw == -1;
                    i9 = Math.max(i9, i12);
                    i10 = Math.max(i10, zzzVar2.zzw);
                    zzae = Math.max(zzae, zzae(zzsrVar, zzzVar2));
                }
            }
            if (z7) {
                zzdq.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
                int i13 = zzzVar.zzw;
                int i14 = zzzVar.zzv;
                boolean z8 = i13 > i14;
                int i15 = z8 ? i13 : i14;
                if (true == z8) {
                    i13 = i14;
                }
                int[] iArr = zzb;
                int i16 = 0;
                while (i16 < 9) {
                    float f8 = i13;
                    float f9 = i15;
                    int i17 = iArr[i16];
                    int[] iArr2 = iArr;
                    float f10 = i17;
                    if (i17 <= i15 || (i7 = (int) ((f8 / f9) * f10)) <= i13) {
                        break;
                    }
                    int i18 = true != z8 ? i17 : i7;
                    if (true != z8) {
                        i17 = i7;
                    }
                    point = zzsrVar.zza(i18, i17);
                    float f11 = zzzVar.zzx;
                    if (point != null) {
                        z4 = z8;
                        i8 = i13;
                        if (zzsrVar.zzg(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i8 = i13;
                        z4 = z8;
                    }
                    i16++;
                    z8 = z4;
                    iArr = iArr2;
                    i13 = i8;
                }
                point = null;
                if (point != null) {
                    i9 = Math.max(i9, point.x);
                    i10 = Math.max(i10, point.y);
                    zzx zzb3 = zzzVar.zzb();
                    zzb3.zzai(i9);
                    zzb3.zzM(i10);
                    zzae = Math.max(zzae, zzad(zzsrVar, zzb3.zzaj()));
                    zzdq.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i9 + "x" + i10);
                }
            }
        } else if (zzae != -1 && (zzad = zzad(zzsrVar, zzzVar)) != -1) {
            zzae = Math.min((int) (zzae * 1.5f), zzad);
        }
        String str = zzsrVar.zzc;
        zzaad zzaadVar = new zzaad(i9, i10, zzae);
        this.zzm = zzaadVar;
        boolean z9 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzzVar.zzv);
        mediaFormat.setInteger("height", zzzVar.zzw);
        zzdt.zzb(mediaFormat, zzzVar.zzr);
        float f12 = zzzVar.zzx;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        zzdt.zza(mediaFormat, "rotation-degrees", zzzVar.zzy);
        zzk zzkVar = zzzVar.zzC;
        if (zzkVar != null) {
            zzdt.zza(mediaFormat, "color-transfer", zzkVar.zzd);
            zzdt.zza(mediaFormat, "color-standard", zzkVar.zzb);
            zzdt.zza(mediaFormat, "color-range", zzkVar.zzc);
            byte[] bArr = zzkVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzzVar.zzo)) {
            int i19 = zztl.zza;
            Pair zza = zzda.zza(zzzVar);
            if (zza != null) {
                zzdt.zza(mediaFormat, ProfileContext.TYPE, ((Integer) zza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzaadVar.zza);
        mediaFormat.setInteger("max-height", zzaadVar.zzb);
        zzdt.zza(mediaFormat, "max-input-size", zzaadVar.zzc);
        int i20 = zzen.zza;
        mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (z9) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (zzen.zza >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzH));
        }
        Surface zzaV = zzaV(zzsrVar);
        if (this.zzp != null && !zzen.zzL(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzsl.zzb(zzsrVar, mediaFormat, zzzVar, zzaV, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzz zzzVar, boolean z4) {
        return zztl.zzf(zzaW(this.zze, zztaVar, zzzVar, false, false), zzzVar);
    }

    public final void zzah(zzso zzsoVar, int i7, long j, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zzsoVar.zzn(i7, j3);
        Trace.endSection();
        ((zzsy) this).zza.zze++;
        this.zzA = 0;
        if (this.zzp == null) {
            zzcc zzccVar = this.zzF;
            if (!zzccVar.equals(zzcc.zza) && !zzccVar.equals(this.zzG)) {
                this.zzG = zzccVar;
                this.zzg.zzt(zzccVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzs) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzv = true;
        }
    }

    public final void zzai(zzso zzsoVar, int i7, long j) {
        Trace.beginSection("skipVideoBuffer");
        zzsoVar.zzo(i7, false);
        Trace.endSection();
        ((zzsy) this).zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhg zzhgVar) {
        if (this.zzo) {
            ByteBuffer byteBuffer = zzhgVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzso zzaz = zzaz();
                        zzaz.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdq.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsl zzslVar, long j, long j3) {
        this.zzg.zzk(str, j, j3);
        this.zzn = zzaT(str);
        zzsr zzaB = zzaB();
        zzaB.getClass();
        boolean z4 = false;
        if (zzen.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzaB.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzh = zzaB.zzh();
            int length = zzh.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (zzh[i7].profile == 16384) {
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        this.zzo = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzg.zzl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzz zzzVar, MediaFormat mediaFormat) {
        zzso zzaz = zzaz();
        if (zzaz != null) {
            zzaz.zzr(this.zzw);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f7 = zzzVar.zzz;
        int i7 = zzzVar.zzy;
        if (i7 == 90 || i7 == 270) {
            f7 = 1.0f / f7;
            int i8 = integer2;
            integer2 = integer;
            integer = i8;
        }
        this.zzF = new zzcc(integer, integer2, f7);
        zzabo zzaboVar = this.zzp;
        if (zzaboVar == null || !this.zzM) {
            this.zzi.zzl(zzzVar.zzx);
        } else {
            zzx zzb2 = zzzVar.zzb();
            zzb2.zzai(integer);
            zzb2.zzM(integer2);
            zzb2.zzZ(f7);
            zzz zzaj = zzb2.zzaj();
            List list = this.zzr;
            if (list == null) {
                list = zzfwh.zzn();
            }
            zzaboVar.zzg(1, zzaj, list);
        }
        this.zzM = false;
    }

    public final void zzao(int i7, int i8) {
        zzhq zzhqVar = ((zzsy) this).zza;
        zzhqVar.zzh += i7;
        int i9 = i7 + i8;
        zzhqVar.zzg += i9;
        this.zzz += i9;
        int i10 = this.zzA + i9;
        this.zzA = i10;
        zzhqVar.zzi = Math.max(i10, zzhqVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zzr();
            this.zzp.zzo(zzaw(), -this.zzK);
        } else {
            this.zzi.zzf();
        }
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaq() {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            zzaboVar.zzr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j, long j3, zzso zzsoVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, zzz zzzVar) {
        zzsoVar.getClass();
        long zzav = j7 - zzav();
        int i10 = 0;
        while (true) {
            Long l7 = (Long) this.zzl.peek();
            if (l7 == null || l7.longValue() >= j7) {
                break;
            }
            this.zzl.poll();
            i10++;
        }
        zzao(i10, 0);
        zzabo zzaboVar = this.zzp;
        boolean z8 = true;
        if (zzaboVar != null) {
            if (!z4) {
                z8 = z7;
            } else if (!z7) {
                zzai(zzsoVar, i7, zzav);
                return true;
            }
            return zzaboVar.zzs(j7 + (-this.zzK), z8, new zzaaa(this, zzsoVar, i7, zzav));
        }
        int zza = this.zzi.zza(j7, j, j3, zzaw(), z7, this.zzj);
        if (zza == 4) {
            return false;
        }
        if (z4 && !z7) {
            zzai(zzsoVar, i7, zzav);
            return true;
        }
        if (this.zzs == null) {
            if (this.zzj.zzc() >= 0 && (this.zzj.zzc() >= TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION || zza == 5)) {
                return false;
            }
            zzai(zzsoVar, i7, zzav);
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (zza == 0) {
            zzah(zzsoVar, i7, zzav, zzi().zzc());
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (zza == 1) {
            zzaas zzaasVar = this.zzj;
            long zzd2 = zzaasVar.zzd();
            long zzc2 = zzaasVar.zzc();
            if (zzd2 == this.zzE) {
                zzai(zzsoVar, i7, zzav);
            } else {
                zzah(zzsoVar, i7, zzav, zzd2);
            }
            zzaQ(zzc2);
            this.zzE = zzd2;
            return true;
        }
        if (zza == 2) {
            Trace.beginSection("dropVideoBuffer");
            zzsoVar.zzo(i7, false);
            Trace.endSection();
            zzao(0, 1);
            zzaQ(this.zzj.zzc());
            return true;
        }
        if (zza != 3) {
            if (zza == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(zza));
        }
        zzai(zzsoVar, i7, zzav);
        zzaQ(this.zzj.zzc());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzau(zzhg zzhgVar) {
        int i7 = zzen.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public final void zzt() {
        zzabo zzaboVar;
        zzabo zzaboVar2 = this.zzp;
        if (zzaboVar2 == null) {
            this.zzi.zzb();
        } else {
            zzaboVar = ((zzaal) zzaboVar2).zza.zzg;
            zzaboVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlh
    public final void zzu(int i7, Object obj) {
        if (i7 == 1) {
            zzaZ(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            zzaar zzaarVar = (zzaar) obj;
            this.zzJ = zzaarVar;
            zzabo zzaboVar = this.zzp;
            if (zzaboVar != null) {
                ((zzaal) zzaboVar).zza.zzg.zzq(zzaarVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.zzI != intValue) {
                this.zzI = intValue;
                return;
            }
            return;
        }
        if (i7 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.zzw = intValue2;
            zzso zzaz = zzaz();
            if (zzaz != null) {
                zzaz.zzr(intValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.zzx = intValue3;
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzm(intValue3);
                return;
            } else {
                this.zzi.zzj(intValue3);
                return;
            }
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.zzr = list;
            zzabo zzaboVar3 = this.zzp;
            if (zzaboVar3 != null) {
                zzaboVar3.zzp(list);
                return;
            }
            return;
        }
        if (i7 == 14) {
            obj.getClass();
            zzee zzeeVar = (zzee) obj;
            if (zzeeVar.zzb() == 0 || zzeeVar.zza() == 0) {
                return;
            }
            this.zzu = zzeeVar;
            zzabo zzaboVar4 = this.zzp;
            if (zzaboVar4 != null) {
                Surface surface = this.zzs;
                zzcv.zzb(surface);
                ((zzaal) zzaboVar4).zza.zzp(surface, zzeeVar);
                return;
            }
            return;
        }
        if (i7 != 16) {
            if (i7 != 17) {
                super.zzu(i7, obj);
                return;
            }
            Surface surface2 = this.zzs;
            zzaZ(null);
            obj.getClass();
            ((zzaae) obj).zzu(1, surface2);
            return;
        }
        obj.getClass();
        this.zzH = ((Integer) obj).intValue();
        zzso zzaz2 = zzaz();
        if (zzaz2 == null || zzen.zza < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.zzH));
        zzaz2.zzq(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzx() {
        zzabo zzaboVar;
        this.zzG = null;
        this.zzL = -9223372036854775807L;
        zzabo zzaboVar2 = this.zzp;
        if (zzaboVar2 != null) {
            zzaboVar = ((zzaal) zzaboVar2).zza.zzg;
            zzaboVar.zzh();
        } else {
            this.zzi.zzd();
        }
        this.zzv = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzm(((zzsy) this).zza);
            this.zzg.zzt(zzcc.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzy(boolean z4, boolean z7) {
        zzabo zzaboVar;
        super.zzy(z4, z7);
        zzn();
        this.zzg.zzo(((zzsy) this).zza);
        if (!this.zzq) {
            if (this.zzr != null && this.zzp == null) {
                zzaak zzaakVar = new zzaak(this.zze, this.zzi);
                zzaakVar.zze(zzi());
                zzaaq zzf = zzaakVar.zzf();
                zzf.zzq(1);
                this.zzp = zzf.zze(0);
            }
            this.zzq = true;
        }
        zzabo zzaboVar2 = this.zzp;
        if (zzaboVar2 == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z7);
            return;
        }
        zzaar zzaarVar = this.zzJ;
        if (zzaarVar != null) {
            ((zzaal) zzaboVar2).zza.zzg.zzq(zzaarVar);
        }
        if (this.zzs != null && !this.zzu.equals(zzee.zza)) {
            zzabo zzaboVar3 = this.zzp;
            ((zzaal) zzaboVar3).zza.zzp(this.zzs, this.zzu);
        }
        this.zzp.zzm(this.zzx);
        ((zzaal) this.zzp).zza.zzg.zzn(zzat());
        List list = this.zzr;
        if (list != null) {
            this.zzp.zzp(list);
        }
        zzaboVar = ((zzaal) this.zzp).zza.zzg;
        zzaboVar.zzi(z7);
        if (zzay() != null) {
            zzaaq zzaaqVar = ((zzaal) this.zzp).zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzz(long j, boolean z4) {
        zzabo zzaboVar = this.zzp;
        if (zzaboVar != null) {
            if (!z4) {
                zzaboVar.zze(true);
            }
            this.zzp.zzo(zzaw(), -this.zzK);
            this.zzM = true;
        }
        super.zzz(j, z4);
        if (this.zzp == null) {
            this.zzi.zzi();
        }
        if (z4) {
            zzabo zzaboVar2 = this.zzp;
            if (zzaboVar2 != null) {
                zzaboVar2.zzf(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzA = 0;
    }
}
