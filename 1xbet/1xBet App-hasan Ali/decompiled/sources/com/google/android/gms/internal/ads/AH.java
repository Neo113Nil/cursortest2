package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class AH extends RF {

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f7557p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f7558q1;
    public static boolean r1;

    /* renamed from: I0, reason: collision with root package name */
    public final Context f7559I0;

    /* renamed from: J0, reason: collision with root package name */
    public final boolean f7560J0;

    /* renamed from: K0, reason: collision with root package name */
    public final C0709Wb f7561K0;

    /* renamed from: L0, reason: collision with root package name */
    public final boolean f7562L0;

    /* renamed from: M0, reason: collision with root package name */
    public final C1004g f7563M0;

    /* renamed from: N0, reason: collision with root package name */
    public final M4.d f7564N0;

    /* renamed from: O0, reason: collision with root package name */
    public C1586t f7565O0;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f7566P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f7567Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C0825c f7568R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f7569S0;

    /* renamed from: T0, reason: collision with root package name */
    public List f7570T0;

    /* renamed from: U0, reason: collision with root package name */
    public Surface f7571U0;

    /* renamed from: V0, reason: collision with root package name */
    public CH f7572V0;

    /* renamed from: W0, reason: collision with root package name */
    public Bm f7573W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f7574X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f7575Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f7576Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f7577a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f7578b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f7579c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f7580d1;
    public long e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f7581f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f7582g1;
    public C1519re h1;
    public C1519re i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f7583j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f7584k1;

    /* renamed from: l1, reason: collision with root package name */
    public C1019gE f7585l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f7586m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f7587n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f7588o1;

    public AH(Context context, C1685v8 c1685v8, Handler handler, SurfaceHolderCallbackC0974fE surfaceHolderCallbackC0974fE) {
        super(2, c1685v8, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f7559I0 = applicationContext;
        this.f7568R0 = null;
        this.f7561K0 = new C0709Wb(1, handler, surfaceHolderCallbackC0974fE);
        this.f7560J0 = true;
        this.f7563M0 = new C1004g(applicationContext, this);
        this.f7564N0 = new M4.d();
        this.f7562L0 = "NVIDIA".equals(AbstractC1260lo.f14421c);
        this.f7573W0 = Bm.f7876c;
        this.f7575Y0 = 1;
        this.f7576Z0 = 0;
        this.h1 = C1519re.f15321d;
        this.f7584k1 = 0;
        this.i1 = null;
        this.f7583j1 = -1000;
        this.f7586m1 = -9223372036854775807L;
        this.f7587n1 = -9223372036854775807L;
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
    public static final boolean p0(String str) {
        boolean z3;
        boolean z5;
        boolean z6 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (AH.class) {
            if (!f7558q1) {
                int i = AbstractC1260lo.f14419a;
                char c5 = 28;
                if (i <= 28) {
                    String str2 = AbstractC1260lo.f14420b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                z5 = true;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                z5 = 3;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                z5 = 2;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                z5 = 7;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                z5 = false;
                                break;
                            }
                            z5 = -1;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                z5 = 4;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                z5 = 6;
                                break;
                            }
                            z5 = -1;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                z5 = 5;
                                break;
                            }
                            z5 = -1;
                            break;
                        default:
                            z5 = -1;
                            break;
                    }
                    switch (z5) {
                        case false:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                        case true:
                            z6 = true;
                            break;
                    }
                    r1 = z6;
                    f7558q1 = true;
                }
                if (i > 27 || !"HWEML".equals(AbstractC1260lo.f14420b)) {
                    String str3 = AbstractC1260lo.f14422d;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                z3 = 6;
                                break;
                            }
                            z3 = -1;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                z3 = 7;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                z3 = false;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                z3 = true;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                z3 = 2;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                z3 = 3;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                z3 = 4;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                z3 = 8;
                                break;
                            }
                            z3 = -1;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                z3 = 5;
                                break;
                            }
                            z3 = -1;
                            break;
                        default:
                            z3 = -1;
                            break;
                    }
                    switch (z3) {
                        default:
                            if (i <= 26) {
                                String str4 = AbstractC1260lo.f14420b;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c5 = '6';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c5 = '7';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c5 = '8';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c5 = 'J';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c5 = 22;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c5 = 'Y';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c5 = 'Z';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c5 = 'e';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c5 = 'f';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c5 = 'g';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c5 = '\r';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c5 = 't';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c5 = 137;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c5 = 21;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c5 = 'h';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c5 = '_';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c5 = 130;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c5 = 'a';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c5 = 'b';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c5 = 'c';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c5 = '4';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c5 = 18;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c5 = 'F';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c5 = 'v';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c5 = 'W';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c5 = 5;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c5 = 6;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c5 = 'x';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c5 = '\"';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c5 = '~';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c5 = 'X';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c5 = '\t';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c5 = 'w';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c5 = 131;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c5 = 132;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c5 = '[';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c5 = '3';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c5 = '5';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c5 = 'i';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c5 = 'y';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c5 = 17;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c5 = 138;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c5 = 31;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c5 = 134;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c5 = 20;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c5 = 'q';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c5 = 127;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c5 = 129;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c5 = 16;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c5 = 'T';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c5 = 'I';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c5 = 'O';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c5 = 'P';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c5 = 'V';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c5 = '^';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c5 = 'k';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c5 = 's';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c5 = 139;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c5 = 26;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c5 = 27;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c5 = '1';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c5 = 0;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c5 = 1;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c5 = 2;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c5 = '$';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c5 = '%';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c5 = '&';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c5 = '\'';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c5 = '(';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c5 = ')';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c5 = ']';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c5 = 'm';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c5 = 'o';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c5 = 136;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c5 = '2';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c5 = 'K';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c5 = 'U';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c5 = '\\';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c5 = 'S';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c5 = 3;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c5 = 4;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c5 = 15;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c5 = 7;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c5 = 30;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c5 = '*';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c5 = '+';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c5 = ',';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c5 = '-';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c5 = '.';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c5 = '/';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c5 = '0';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c5 = 'l';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c5 = 'n';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c5 = 'p';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c5 = 128;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c5 = 135;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c5 = 'C';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c5 = 'L';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c5 = 'M';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c5 = '\b';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c5 = 25;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c5 = 'R';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c5 = '<';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c5 = 11;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c5 = '\f';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c5 = 'z';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c5 = '{';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c5 = '|';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c5 = '}';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c5 = 'j';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c5 = 'r';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c5 = '9';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c5 = ':';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c5 = ';';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c5 = 'Q';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c5 = '\n';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c5 = 'H';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c5 = '`';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c5 = 'N';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c5 = 'G';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c5 = '>';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c5 = '#';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c5 = '=';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c5 = 133;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c5 = 23;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c5 = 24;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c5 = 'D';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c5 = 'u';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c5 = 'd';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c5 = 'E';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c5 = 19;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c5 = 29;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c5 = '?';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c5 = '@';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c5 = 14;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c5 = ' ';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c5 = '!';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c5 = 'A';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c5 = 'B';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    default:
                                        c5 = 65535;
                                        break;
                                }
                                switch (c5) {
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
                                    case C1639u7.zzm /* 21 */:
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
                    r1 = z6;
                    f7558q1 = true;
                }
                z6 = true;
                r1 = z6;
                f7558q1 = true;
            }
        }
        return r1;
    }

    public static List r0(Context context, C1543s1 c1543s1, C1407p c1407p, boolean z3, boolean z5) {
        List b3;
        String str = c1407p.f14904m;
        if (str == null) {
            return C1761wv.f16184o;
        }
        if (AbstractC1260lo.f14419a >= 26 && "video/dolby-vision".equals(str) && !AbstractC0952et.t(context)) {
            String a5 = YF.a(c1407p);
            if (a5 == null) {
                b3 = C1761wv.f16184o;
            } else {
                c1543s1.getClass();
                b3 = YF.b(a5, z3, z5);
            }
            if (!b3.isEmpty()) {
                return b3;
            }
        }
        return YF.c(c1543s1, c1407p, z3, z5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r3.equals("video/av01") != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s0(NF nf, C1407p c1407p) {
        int i;
        int intValue;
        int i5 = c1407p.f14911t;
        if (i5 != -1 && (i = c1407p.f14912u) != -1) {
            String str = c1407p.f14904m;
            str.getClass();
            char c5 = 2;
            if ("video/dolby-vision".equals(str)) {
                HashMap hashMap = YF.f12311a;
                Pair a5 = AbstractC1120ii.a(c1407p);
                str = (a5 == null || !((intValue = ((Integer) a5.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i6 = 4;
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return ((i5 * i) * 3) / i6;
                case 4:
                    return Math.max(2097152, ((i5 * i) * 3) / 4);
                case 5:
                    String str2 = AbstractC1260lo.f14422d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(AbstractC1260lo.f14421c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nf.f)))) {
                        return ((((i + 15) / 16) * ((i5 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    i6 = 8;
                    return ((i5 * i) * 3) / i6;
            }
        }
        return -1;
    }

    public static int t0(NF nf, C1407p c1407p) {
        if (c1407p.f14905n == -1) {
            return s0(nf, c1407p);
        }
        List list = c1407p.f14907p;
        int size = list.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i += ((byte[]) list.get(i5)).length;
        }
        return c1407p.f14905n + i;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean C(NF nf) {
        Surface surface = this.f7571U0;
        if (surface == null || !surface.isValid()) {
            return (AbstractC1260lo.f14419a >= 35 && nf.f10794h) || v0(nf);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean D(OD od) {
        if (!od.a(67108864) || m() || od.a(536870912)) {
            return false;
        }
        long j5 = this.f7587n1;
        return j5 != -9223372036854775807L && j5 - (od.f10939g - this.f11353C0.f11197c) > 100000 && !od.a(1073741824) && od.f10939g < this.f11410v;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final int J(C1543s1 c1543s1, C1407p c1407p) {
        boolean z3;
        if (!AbstractC1593t6.g(c1407p.f14904m)) {
            return 128;
        }
        int i = 0;
        boolean z5 = c1407p.f14908q != null;
        Context context = this.f7559I0;
        List r02 = r0(context, c1543s1, c1407p, z5, false);
        if (z5 && r02.isEmpty()) {
            r02 = r0(context, c1543s1, c1407p, false, false);
        }
        if (r02.isEmpty()) {
            return 129;
        }
        if (c1407p.f14893I != 0) {
            return 130;
        }
        NF nf = (NF) r02.get(0);
        boolean c5 = nf.c(c1407p);
        if (!c5) {
            for (int i5 = 1; i5 < r02.size(); i5++) {
                NF nf2 = (NF) r02.get(i5);
                if (nf2.c(c1407p)) {
                    c5 = true;
                    z3 = false;
                    nf = nf2;
                    break;
                }
            }
        }
        z3 = true;
        int i6 = true != c5 ? 3 : 4;
        int i7 = true != nf.d(c1407p) ? 8 : 16;
        int i8 = true != nf.f10793g ? 0 : 64;
        int i9 = true != z3 ? 0 : 128;
        if (AbstractC1260lo.f14419a >= 26 && "video/dolby-vision".equals(c1407p.f14904m) && !AbstractC0952et.t(context)) {
            i9 = 256;
        }
        if (c5) {
            List r03 = r0(context, c1543s1, c1407p, z5, true);
            if (!r03.isEmpty()) {
                HashMap hashMap = YF.f12311a;
                ArrayList arrayList = new ArrayList(r03);
                Collections.sort(arrayList, new SF(new Hq(14, c1407p)));
                NF nf3 = (NF) arrayList.get(0);
                if (nf3.c(c1407p) && nf3.d(c1407p)) {
                    i = 32;
                }
            }
        }
        return i6 | i7 | i | i8 | i9;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final TD K(NF nf, C1407p c1407p, C1407p c1407p2) {
        int i;
        int i5;
        TD a5 = nf.a(c1407p, c1407p2);
        C1586t c1586t = this.f7565O0;
        c1586t.getClass();
        int i6 = c1407p2.f14911t;
        int i7 = c1586t.f15621a;
        int i8 = a5.f11635e;
        if (i6 > i7 || c1407p2.f14912u > c1586t.f15622b) {
            i8 |= 256;
        }
        if (t0(nf, c1407p2) > c1586t.f15623c) {
            i8 |= 64;
        }
        if (i8 != 0) {
            i = 0;
            i5 = i8;
        } else {
            i = a5.f11634d;
            i5 = 0;
        }
        return new TD(nf.f10788a, c1407p, c1407p2, i, i5);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final TD L(C1667ur c1667ur) {
        TD L5 = super.L(c1667ur);
        C1407p c1407p = (C1407p) c1667ur.f15914l;
        c1407p.getClass();
        C0709Wb c0709Wb = this.f7561K0;
        Handler handler = (Handler) c0709Wb.f12040l;
        if (handler != null) {
            handler.post(new RunnableC1362o(c0709Wb, c1407p, L5, 0));
        }
        return L5;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final C0375o O(NF nf, C1407p c1407p, float f) {
        int i;
        int i5;
        C1242lE c1242lE;
        Point point;
        int i6;
        int i7;
        int i8;
        int i9;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        char c5;
        int i12;
        int s02;
        C1407p[] c1407pArr = this.f11406t;
        c1407pArr.getClass();
        int length = c1407pArr.length;
        int t02 = t0(nf, c1407p);
        float f5 = c1407p.f14913v;
        C1242lE c1242lE2 = c1407p.f14885A;
        int i13 = c1407p.f14912u;
        int i14 = c1407p.f14911t;
        if (length == 1) {
            if (t02 != -1 && (s02 = s0(nf, c1407p)) != -1) {
                t02 = Math.min((int) (t02 * 1.5f), s02);
            }
            c1242lE = c1242lE2;
            i = i13;
            i5 = i14;
        } else {
            i = i13;
            i5 = i14;
            int i15 = 0;
            boolean z3 = false;
            while (i15 < length) {
                C1407p c1407p2 = c1407pArr[i15];
                C1407p[] c1407pArr2 = c1407pArr;
                if (c1242lE2 != null && c1407p2.f14885A == null) {
                    C1649uH c1649uH = new C1649uH(c1407p2);
                    c1649uH.f15862z = c1242lE2;
                    c1407p2 = new C1407p(c1649uH);
                }
                if (nf.a(c1407p, c1407p2).f11634d != 0) {
                    int i16 = c1407p2.f14912u;
                    i10 = length;
                    int i17 = c1407p2.f14911t;
                    i11 = i15;
                    c5 = 65535;
                    z3 |= i17 == -1 || i16 == -1;
                    i5 = Math.max(i5, i17);
                    i = Math.max(i, i16);
                    t02 = Math.max(t02, t0(nf, c1407p2));
                } else {
                    i10 = length;
                    i11 = i15;
                    c5 = 65535;
                }
                length = i10;
                i15 = i11 + 1;
                c1407pArr = c1407pArr2;
            }
            if (z3) {
                JB.l("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i5 + "x" + i);
                boolean z5 = i13 > i14;
                int i18 = z5 ? i13 : i14;
                int i19 = true == z5 ? i14 : i13;
                int[] iArr = f7557p1;
                c1242lE = c1242lE2;
                int i20 = 0;
                while (true) {
                    Point point2 = null;
                    if (i20 >= 9) {
                        break;
                    }
                    float f6 = i19;
                    int i21 = i20;
                    float f7 = i18;
                    int i22 = iArr[i21];
                    float f8 = i22;
                    if (i22 <= i18 || (i6 = (int) (f8 * (f6 / f7))) <= i19) {
                        break;
                    }
                    if (true != z5) {
                        i7 = i6;
                        i6 = i22;
                    } else {
                        i7 = i6;
                    }
                    int i23 = true == z5 ? i22 : i7;
                    boolean z6 = z5;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = nf.f10791d;
                    if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                        point2 = NF.f(videoCapabilities, i6, i23);
                    }
                    point = point2;
                    if (point != null) {
                        i8 = i18;
                        i9 = i19;
                        if (nf.e(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        i8 = i18;
                        i9 = i19;
                    }
                    i20 = i21 + 1;
                    z5 = z6;
                    i18 = i8;
                    i19 = i9;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i = Math.max(i, point.y);
                    C1649uH c1649uH2 = new C1649uH(c1407p);
                    c1649uH2.f15855s = i5;
                    c1649uH2.f15856t = i;
                    t02 = Math.max(t02, s0(nf, new C1407p(c1649uH2)));
                    JB.l("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i5 + "x" + i);
                }
            } else {
                c1242lE = c1242lE2;
            }
        }
        String str = nf.f10790c;
        this.f7565O0 = new C1586t(i5, i, t02, false);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i14);
        mediaFormat.setInteger("height", i13);
        AbstractC1803xs.w(mediaFormat, c1407p.f14907p);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        AbstractC1803xs.l(mediaFormat, "rotation-degrees", c1407p.f14914w);
        if (c1242lE != null) {
            C1242lE c1242lE3 = c1242lE;
            AbstractC1803xs.l(mediaFormat, "color-transfer", c1242lE3.f14334c);
            AbstractC1803xs.l(mediaFormat, "color-standard", c1242lE3.f14332a);
            AbstractC1803xs.l(mediaFormat, "color-range", c1242lE3.f14333b);
            byte[] bArr = c1242lE3.f14335d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c1407p.f14904m)) {
            HashMap hashMap = YF.f12311a;
            Pair a5 = AbstractC1120ii.a(c1407p);
            if (a5 != null) {
                AbstractC1803xs.l(mediaFormat, "profile", ((Integer) a5.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", i5);
        mediaFormat.setInteger("max-height", i);
        AbstractC1803xs.l(mediaFormat, "max-input-size", t02);
        int i24 = AbstractC1260lo.f14419a;
        if (i24 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (this.f7562L0) {
            mediaFormat.setInteger("no-post-process", 1);
            i12 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i12 = 0;
        }
        if (i24 >= 35) {
            mediaFormat.setInteger("importance", Math.max(i12, -this.f7583j1));
        }
        Surface q02 = q0(nf);
        if (this.f7568R0 != null && !AbstractC1260lo.d(this.f7559I0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new C0375o(nf, mediaFormat, c1407p, q02, (Object) null, 20);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final ArrayList P(C1543s1 c1543s1, C1407p c1407p) {
        List r02 = r0(this.f7559I0, c1543s1, c1407p, false, false);
        HashMap hashMap = YF.f12311a;
        ArrayList arrayList = new ArrayList(r02);
        Collections.sort(arrayList, new SF(new Hq(14, c1407p)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void S(OD od) {
        if (this.f7567Q0) {
            ByteBuffer byteBuffer = od.f10940h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b3 = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b3 == -75 && s2 == 60 && s5 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        KF kf = this.f11368Q;
                        kf.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kf.p(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void T(Exception exc) {
        JB.g("MediaCodecVideoRenderer", "Video codec error", exc);
        C0709Wb c0709Wb = this.f7561K0;
        Handler handler = (Handler) c0709Wb.f12040l;
        if (handler != null) {
            handler.post(new RunnableC1227l(c0709Wb, exc, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void U(long j5, long j6, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0709Wb c0709Wb = this.f7561K0;
        Handler handler = (Handler) c0709Wb.f12040l;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC1227l(c0709Wb, str2, j5, j6));
        } else {
            str2 = str;
        }
        this.f7566P0 = p0(str2);
        NF nf = this.f11375X;
        nf.getClass();
        boolean z3 = false;
        if (AbstractC1260lo.f14419a >= 29 && "video/x-vnd.on2.vp9".equals(nf.f10789b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nf.f10791d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z3 = true;
                    break;
                }
                i++;
            }
        }
        this.f7567Q0 = z3;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void V(String str) {
        C0709Wb c0709Wb = this.f7561K0;
        Handler handler = (Handler) c0709Wb.f12040l;
        if (handler != null) {
            handler.post(new RunnableC1227l(c0709Wb, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void W(C1407p c1407p, MediaFormat mediaFormat) {
        KF kf = this.f11368Q;
        if (kf != null) {
            kf.g(this.f7575Y0);
        }
        mediaFormat.getClass();
        boolean z3 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z3 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z3 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = c1407p.f14915x;
        if (AbstractC1260lo.f14419a >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = c1407p.f14914w;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i5 = integer2;
            integer2 = integer;
            integer = i5;
        }
        this.h1 = new C1519re(f, integer, integer2);
        C0825c c0825c = this.f7568R0;
        if (c0825c == null || !this.f7588o1) {
            C1004g c1004g = this.f7563M0;
            float f5 = c1407p.f14913v;
            C1137j c1137j = c1004g.f13537b;
            c1137j.f = f5;
            C1829yH c1829yH = c1137j.f14028a;
            c1829yH.f16428a.b();
            c1829yH.f16429b.b();
            c1829yH.f16430c = false;
            c1829yH.f16431d = -9223372036854775807L;
            c1829yH.f16432e = 0;
            c1137j.c();
        } else {
            C1649uH c1649uH = new C1649uH(c1407p);
            c1649uH.f15855s = integer;
            c1649uH.f15856t = integer2;
            c1649uH.f15859w = f;
            C1407p c1407p2 = new C1407p(c1649uH);
            AbstractC1668us.a0(false);
            c0825c.f12933c = c1407p2;
            if (c0825c.f12937h) {
                AbstractC1668us.a0(c0825c.f12936g != -9223372036854775807L);
                c0825c.i = true;
                c0825c.f12938j = c0825c.f12936g;
            } else {
                c0825c.a();
                c0825c.f12937h = true;
                c0825c.i = false;
                c0825c.f12938j = -9223372036854775807L;
            }
        }
        this.f7588o1 = false;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void X() {
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            QF qf = this.f11353C0;
            c0825c.h(qf.f11196b, qf.f11197c, -this.f7586m1, this.f11410v);
        } else {
            this.f7563M0.f(2);
        }
        this.f7588o1 = true;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean Z(long j5, long j6, KF kf, ByteBuffer byteBuffer, int i, int i5, int i6, long j7, boolean z3, boolean z5, C1407p c1407p) {
        kf.getClass();
        QF qf = this.f11353C0;
        long j8 = j7 - qf.f11197c;
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            try {
                return c0825c.j(j7 + (-this.f7586m1), z5, j5, j6, new G3(this, kf, i, j8));
            } catch (r e3) {
                throw d0(e3, e3.f15196k, false, 7001);
            }
        }
        int a5 = this.f7563M0.a(j7, j5, j6, qf.f11196b, z5, this.f7564N0);
        if (a5 != 4) {
            if (z3 && !z5) {
                m0(kf, i);
                return true;
            }
            Surface surface = this.f7571U0;
            M4.d dVar = this.f7564N0;
            if (surface == null) {
                if (dVar.f3626a < 30000) {
                    m0(kf, i);
                    o0(dVar.f3626a);
                    return true;
                }
            } else {
                if (a5 == 0) {
                    this.f11400q.getClass();
                    u0(kf, i, System.nanoTime());
                    o0(dVar.f3626a);
                    return true;
                }
                if (a5 == 1) {
                    long j9 = dVar.f3627b;
                    long j10 = dVar.f3626a;
                    if (j9 == this.f7582g1) {
                        m0(kf, i);
                    } else {
                        u0(kf, i, j9);
                    }
                    o0(j10);
                    this.f7582g1 = j9;
                    return true;
                }
                if (a5 == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    kf.m(i);
                    Trace.endSection();
                    n0(0, 1);
                    o0(dVar.f3626a);
                    return true;
                }
                if (a5 == 3) {
                    m0(kf, i);
                    o0(dVar.f3626a);
                    return true;
                }
                if (a5 != 5) {
                    throw new IllegalStateException(String.valueOf(a5));
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void b0() {
        int i = AbstractC1260lo.f14419a;
    }

    @Override // com.google.android.gms.internal.ads.GE
    public final void c(int i, Object obj) {
        Handler handler;
        C1004g c1004g = this.f7563M0;
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f7571U0;
            C0709Wb c0709Wb = this.f7561K0;
            if (surface2 == surface) {
                if (surface != null) {
                    C1519re c1519re = this.i1;
                    if (c1519re != null) {
                        c0709Wb.y(c1519re);
                    }
                    Surface surface3 = this.f7571U0;
                    if (surface3 == null || !this.f7574X0 || (handler = (Handler) c0709Wb.f12040l) == null) {
                        return;
                    }
                    handler.post(new RunnableC1317n(c0709Wb, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f7571U0 = surface;
            if (this.f7568R0 == null) {
                C1137j c1137j = c1004g.f13537b;
                if (c1137j.f14032e != surface) {
                    c1137j.b();
                    c1137j.f14032e = surface;
                    c1137j.d(true);
                }
                c1004g.f(1);
            }
            this.f7574X0 = false;
            int i5 = this.f11402r;
            KF kf = this.f11368Q;
            if (kf != null && this.f7568R0 == null) {
                NF nf = this.f11375X;
                nf.getClass();
                Surface surface4 = this.f7571U0;
                boolean z3 = (surface4 != null && surface4.isValid()) || (AbstractC1260lo.f14419a >= 35 && nf.f10794h) || v0(nf);
                int i6 = AbstractC1260lo.f14419a;
                if (i6 < 23 || !z3 || this.f7566P0) {
                    y();
                    u();
                } else {
                    Surface q02 = q0(nf);
                    if (i6 >= 23 && q02 != null) {
                        kf.n(q02);
                    } else {
                        if (i6 < 35) {
                            throw new IllegalStateException();
                        }
                        kf.e();
                    }
                }
            }
            if (surface == null) {
                this.i1 = null;
                C0825c c0825c = this.f7568R0;
                if (c0825c != null) {
                    C0959f c0959f = c0825c.f12941m;
                    c0959f.getClass();
                    Bm.f7876c.getClass();
                    c0959f.f13401k = null;
                    return;
                }
                return;
            }
            C1519re c1519re2 = this.i1;
            if (c1519re2 != null) {
                c0709Wb.y(c1519re2);
            }
            if (i5 == 2) {
                C0825c c0825c2 = this.f7568R0;
                if (c0825c2 != null) {
                    c0825c2.d(true);
                    return;
                } else {
                    c1004g.i = true;
                    c1004g.f13542h = -9223372036854775807L;
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            C1019gE c1019gE = (C1019gE) obj;
            this.f7585l1 = c1019gE;
            C0825c c0825c3 = this.f7568R0;
            if (c0825c3 != null) {
                c0825c3.f12941m.i = c1019gE;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f7584k1 != intValue) {
                this.f7584k1 = intValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f7583j1 = ((Integer) obj).intValue();
            KF kf2 = this.f11368Q;
            if (kf2 == null || AbstractC1260lo.f14419a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f7583j1));
            kf2.p(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f7575Y0 = intValue2;
            KF kf3 = this.f11368Q;
            if (kf3 != null) {
                kf3.g(intValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f7576Z0 = intValue3;
            C0825c c0825c4 = this.f7568R0;
            if (c0825c4 != null) {
                c0825c4.e(intValue3);
                return;
            }
            C1137j c1137j2 = c1004g.f13537b;
            if (c1137j2.f14035j == intValue3) {
                return;
            }
            c1137j2.f14035j = intValue3;
            c1137j2.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f7570T0 = list;
            C0825c c0825c5 = this.f7568R0;
            if (c0825c5 != null) {
                c0825c5.i(list);
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f11365N = (C1152jE) obj;
                return;
            }
            return;
        }
        obj.getClass();
        Bm bm = (Bm) obj;
        if (bm.f7877a == 0 || bm.f7878b == 0) {
            return;
        }
        this.f7573W0 = bm;
        C0825c c0825c6 = this.f7568R0;
        if (c0825c6 != null) {
            Surface surface5 = this.f7571U0;
            AbstractC1668us.F(surface5);
            c0825c6.f(surface5, bm);
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void d() {
        C0825c c0825c = this.f7568R0;
        if (c0825c == null || !this.f7560J0) {
            return;
        }
        C0959f c0959f = c0825c.f12941m;
        if (c0959f.f13403m == 2) {
            return;
        }
        C1439pn c1439pn = c0959f.f13400j;
        if (c1439pn != null) {
            c1439pn.f15040a.removeCallbacksAndMessages(null);
        }
        c0959f.f13401k = null;
        c0959f.f13403m = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.RF
    public final void e() {
        try {
            try {
                M();
                y();
            } finally {
                this.f11360G0 = null;
            }
        } finally {
            this.f7569S0 = false;
            this.f7586m1 = -9223372036854775807L;
            CH ch = this.f7572V0;
            if (ch != null) {
                ch.release();
                this.f7572V0 = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void f() {
        this.f7578b1 = 0;
        this.f11400q.getClass();
        this.f7577a1 = SystemClock.elapsedRealtime();
        this.e1 = 0L;
        this.f7581f1 = 0;
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            ((C1004g) c0825c.f12941m.f.f9145m).b();
        } else {
            this.f7563M0.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void g() {
        int i = this.f7578b1;
        final C0709Wb c0709Wb = this.f7561K0;
        if (i > 0) {
            this.f11400q.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j5 = elapsedRealtime - this.f7577a1;
            final int i5 = this.f7578b1;
            Handler handler = (Handler) c0709Wb.f12040l;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0709Wb c0709Wb2 = c0709Wb;
                        c0709Wb2.getClass();
                        int i6 = AbstractC1260lo.f14419a;
                        SE se = ((SurfaceHolderCallbackC0974fE) c0709Wb2.f12041m).f13463k.f13883A;
                        OE j6 = se.j((C1603tG) se.f11524d.f14582o);
                        se.i(j6, 1018, new f2.m(j6, i5, j5));
                    }
                });
            }
            this.f7578b1 = 0;
            this.f7577a1 = elapsedRealtime;
        }
        int i6 = this.f7581f1;
        if (i6 != 0) {
            long j6 = this.e1;
            Handler handler2 = (Handler) c0709Wb.f12040l;
            if (handler2 != null) {
                handler2.post(new RunnableC1227l(i6, j6, c0709Wb));
            }
            this.e1 = 0L;
            this.f7581f1 = 0;
        }
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            ((C1004g) c0825c.f12941m.f.f9145m).c();
        } else {
            this.f7563M0.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void i0() {
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            C1004g c1004g = (C1004g) c0825c.f12941m.f.f9145m;
            if (c1004g.f13539d == 0) {
                c1004g.f13539d = 1;
                return;
            }
            return;
        }
        C1004g c1004g2 = this.f7563M0;
        if (c1004g2.f13539d == 0) {
            c1004g2.f13539d = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void j(C1407p[] c1407pArr, long j5, long j6, C1603tG c1603tG) {
        super.j(c1407pArr, j5, j6, c1603tG);
        if (this.f7586m1 == -9223372036854775807L) {
            this.f7586m1 = j5;
        }
        AbstractC0715Xa abstractC0715Xa = this.f11418z;
        if (abstractC0715Xa.o()) {
            this.f7587n1 = -9223372036854775807L;
        } else {
            this.f7587n1 = abstractC0715Xa.n(c1603tG.f15679a, new C1785xa()).f16291d;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void j0() {
        C0709Wb c0709Wb = this.f7561K0;
        this.i1 = null;
        this.f7587n1 = -9223372036854775807L;
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            ((C1004g) c0825c.f12941m.f.f9145m).f(0);
        } else {
            this.f7563M0.f(0);
        }
        this.f7574X0 = false;
        try {
            super.j0();
            SD sd = this.B0;
            c0709Wb.getClass();
            synchronized (sd) {
            }
            Handler handler = (Handler) c0709Wb.f12040l;
            if (handler != null) {
                handler.post(new Kw(2, c0709Wb, sd));
            }
            c0709Wb.y(C1519re.f15321d);
        } catch (Throwable th) {
            c0709Wb.s(this.B0);
            c0709Wb.y(C1519re.f15321d);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void k0(boolean z3, boolean z5) {
        this.B0 = new SD();
        g0();
        SD sd = this.B0;
        C0709Wb c0709Wb = this.f7561K0;
        Handler handler = (Handler) c0709Wb.f12040l;
        if (handler != null) {
            handler.post(new RunnableC1227l(c0709Wb, sd, 3));
        }
        boolean z6 = this.f7569S0;
        C1004g c1004g = this.f7563M0;
        if (!z6) {
            if (this.f7570T0 != null && this.f7568R0 == null) {
                EH eh = new EH(this.f7559I0, c1004g);
                Nm nm = this.f11400q;
                nm.getClass();
                eh.f = nm;
                AbstractC1668us.a0(!eh.f8510g);
                if (eh.f8508d == null) {
                    if (eh.f8507c == null) {
                        eh.f8507c = new C0870d();
                    }
                    eh.f8508d = new C0914e(eh.f8507c);
                }
                C0959f c0959f = new C0959f(eh);
                eh.f8510g = true;
                this.f7568R0 = c0959f.f13393a;
            }
            this.f7569S0 = true;
        }
        C0825c c0825c = this.f7568R0;
        if (c0825c == null) {
            Nm nm2 = this.f11400q;
            nm2.getClass();
            c1004g.f13544k = nm2;
            c1004g.f13539d = z5 ? 1 : 0;
            return;
        }
        Dp dp = new Dp(16, this);
        Ew ew = Ew.f8627k;
        c0825c.f12939k = dp;
        c0825c.f12940l = ew;
        C1019gE c1019gE = this.f7585l1;
        if (c1019gE != null) {
            c0825c.f12941m.i = c1019gE;
        }
        if (this.f7571U0 != null && !this.f7573W0.equals(Bm.f7876c)) {
            this.f7568R0.f(this.f7571U0, this.f7573W0);
        }
        this.f7568R0.e(this.f7576Z0);
        this.f7568R0.g(this.f11366O);
        List list = this.f7570T0;
        if (list != null) {
            this.f7568R0.i(list);
        }
        ((C1004g) this.f7568R0.f12941m.f.f9145m).f13539d = z5 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void l(float f, float f5) {
        super.l(f, f5);
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            c0825c.g(f);
        } else {
            this.f7563M0.d(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void l0(long j5, boolean z3) {
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            c0825c.b(true);
            C0825c c0825c2 = this.f7568R0;
            QF qf = this.f11353C0;
            c0825c2.h(qf.f11196b, qf.f11197c, -this.f7586m1, this.f11410v);
            this.f7588o1 = true;
        }
        super.l0(j5, z3);
        C0825c c0825c3 = this.f7568R0;
        C1004g c1004g = this.f7563M0;
        if (c0825c3 == null) {
            C1137j c1137j = c1004g.f13537b;
            c1137j.f14038m = 0L;
            c1137j.f14041p = -1L;
            c1137j.f14039n = -1L;
            c1004g.f13541g = -9223372036854775807L;
            c1004g.f13540e = -9223372036854775807L;
            c1004g.f(1);
            c1004g.f13542h = -9223372036854775807L;
        }
        if (z3) {
            C0825c c0825c4 = this.f7568R0;
            if (c0825c4 != null) {
                c0825c4.d(false);
            } else {
                c1004g.i = false;
                c1004g.f13542h = -9223372036854775807L;
            }
        }
        this.f7579c1 = 0;
    }

    public final void m0(KF kf, int i) {
        Trace.beginSection("skipVideoBuffer");
        kf.m(i);
        Trace.endSection();
        this.B0.f++;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final String n() {
        return "MediaCodecVideoRenderer";
    }

    public final void n0(int i, int i5) {
        SD sd = this.B0;
        sd.f11517h += i;
        int i6 = i + i5;
        sd.f11516g += i6;
        this.f7578b1 += i6;
        int i7 = this.f7579c1 + i6;
        this.f7579c1 = i7;
        sd.i = Math.max(i7, sd.i);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void o(long j5, long j6) {
        super.o(j5, j6);
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            try {
                C0959f.a(c0825c.f12941m, j5, j6);
            } catch (r e3) {
                throw d0(e3, e3.f15196k, false, 7001);
            }
        }
    }

    public final void o0(long j5) {
        SD sd = this.B0;
        sd.f11519k += j5;
        sd.f11520l++;
        this.e1 += j5;
        this.f7581f1++;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean p() {
        return this.f11419z0 && this.f7568R0 == null;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final boolean q() {
        boolean q5 = super.q();
        C0825c c0825c = this.f7568R0;
        if (c0825c != null) {
            return ((C1004g) c0825c.f12941m.f.f9145m).e(false);
        }
        if (q5 && (this.f11368Q == null || this.f7571U0 == null)) {
            return true;
        }
        return this.f7563M0.e(q5);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface q0(NF nf) {
        boolean z3;
        BH bh;
        boolean z5 = false;
        if (this.f7568R0 != null) {
            AbstractC1668us.a0(false);
            AbstractC1668us.F(null);
            throw null;
        }
        Surface surface = this.f7571U0;
        if (surface != null) {
            return surface;
        }
        if (AbstractC1260lo.f14419a >= 35 && nf.f10794h) {
            return null;
        }
        AbstractC1668us.a0(v0(nf));
        CH ch = this.f7572V0;
        if (ch != null) {
            if (ch.f7990k != nf.f && ch != null) {
                ch.release();
                this.f7572V0 = null;
            }
        }
        if (this.f7572V0 == null) {
            Context context = this.f7559I0;
            boolean z6 = nf.f;
            if (!z6) {
                int i = CH.f7988n;
            } else if (!CH.a(context)) {
                z3 = false;
                AbstractC1668us.a0(z3);
                bh = new BH("ExoPlayer:PlaceholderSurface");
                int i5 = !z6 ? CH.f7988n : 0;
                bh.start();
                Handler handler = new Handler(bh.getLooper(), bh);
                bh.f7809l = handler;
                bh.f7808k = new Mi(handler);
                synchronized (bh) {
                    bh.f7809l.obtainMessage(1, i5, 0).sendToTarget();
                    while (bh.f7812o == null && bh.f7811n == null && bh.f7810m == null) {
                        try {
                            bh.wait();
                        } catch (InterruptedException unused) {
                            z5 = true;
                        }
                    }
                }
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = bh.f7811n;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = bh.f7810m;
                if (error != null) {
                    throw error;
                }
                CH ch2 = bh.f7812o;
                ch2.getClass();
                this.f7572V0 = ch2;
            }
            z3 = true;
            AbstractC1668us.a0(z3);
            bh = new BH("ExoPlayer:PlaceholderSurface");
            if (!z6) {
            }
            bh.start();
            Handler handler2 = new Handler(bh.getLooper(), bh);
            bh.f7809l = handler2;
            bh.f7808k = new Mi(handler2);
            synchronized (bh) {
            }
        }
        return this.f7572V0;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final float s(float f, C1407p[] c1407pArr) {
        float f5 = -1.0f;
        for (C1407p c1407p : c1407pArr) {
            float f6 = c1407p.f14913v;
            if (f6 != -1.0f) {
                f5 = Math.max(f5, f6);
            }
        }
        if (f5 == -1.0f) {
            return -1.0f;
        }
        return f5 * f;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final MF t(IllegalStateException illegalStateException, NF nf) {
        Surface surface = this.f7571U0;
        C1874zH c1874zH = new C1874zH(illegalStateException, nf);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c1874zH;
    }

    public final void u0(KF kf, int i, long j5) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        kf.d(i, j5);
        Trace.endSection();
        this.B0.f11515e++;
        this.f7579c1 = 0;
        if (this.f7568R0 == null) {
            C1519re c1519re = this.h1;
            boolean equals = c1519re.equals(C1519re.f15321d);
            C0709Wb c0709Wb = this.f7561K0;
            if (!equals && !c1519re.equals(this.i1)) {
                this.i1 = c1519re;
                c0709Wb.y(c1519re);
            }
            C1004g c1004g = this.f7563M0;
            int i5 = c1004g.f13539d;
            c1004g.f13539d = 3;
            c1004g.f13544k.getClass();
            c1004g.f = AbstractC1260lo.s(SystemClock.elapsedRealtime());
            if (i5 == 3 || (surface = this.f7571U0) == null) {
                return;
            }
            Handler handler = (Handler) c0709Wb.f12040l;
            if (handler != null) {
                handler.post(new RunnableC1317n(c0709Wb, surface, SystemClock.elapsedRealtime()));
            }
            this.f7574X0 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void v(long j5) {
        super.v(j5);
        this.f7580d1--;
    }

    public final boolean v0(NF nf) {
        if (AbstractC1260lo.f14419a < 23 || p0(nf.f10788a)) {
            return false;
        }
        return !nf.f || CH.a(this.f7559I0);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void w() {
        this.f7580d1++;
        int i = AbstractC1260lo.f14419a;
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void x(C1407p c1407p) {
        C0825c c0825c = this.f7568R0;
        if (c0825c == null) {
            return;
        }
        try {
            c0825c.c(c1407p);
            throw null;
        } catch (r e3) {
            throw d0(e3, c1407p, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void z() {
        super.z();
        this.f7580d1 = 0;
    }
}
