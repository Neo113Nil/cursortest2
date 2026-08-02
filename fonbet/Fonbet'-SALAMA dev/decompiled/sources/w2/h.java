package w2;

import A1.AbstractC0023i;
import A1.C0042s;
import A1.G0;
import A1.K;
import A1.L;
import A1.X;
import C0.C0091j;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E4.M;
import R1.p;
import R1.q;
import R5.F;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import c2.W;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.sentry.ProfileContext;
import io.sentry.TransactionOptions;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import v2.AbstractC1664a;
import v2.t;
import w1.C1719l1;
import w1.V0;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: E1, reason: collision with root package name */
    public static final int[] f17980E1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: F1, reason: collision with root package name */
    public static boolean f17981F1;

    /* renamed from: G1, reason: collision with root package name */
    public static boolean f17982G1;

    /* renamed from: A1, reason: collision with root package name */
    public boolean f17983A1;

    /* renamed from: B1, reason: collision with root package name */
    public int f17984B1;

    /* renamed from: C1, reason: collision with root package name */
    public C1772g f17985C1;

    /* renamed from: D1, reason: collision with root package name */
    public L f17986D1;

    /* renamed from: V0, reason: collision with root package name */
    public final Context f17987V0;
    public final m W0;

    /* renamed from: X0, reason: collision with root package name */
    public final w f17988X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final long f17989Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final int f17990Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final boolean f17991a1;

    /* renamed from: b1, reason: collision with root package name */
    public C0091j f17992b1;
    public boolean c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f17993d1;

    /* renamed from: e1, reason: collision with root package name */
    public Surface f17994e1;

    /* renamed from: f1, reason: collision with root package name */
    public PlaceholderSurface f17995f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f17996g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f17997h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f17998i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f17999j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f18000k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f18001l1;

    /* renamed from: m1, reason: collision with root package name */
    public long f18002m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f18003n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f18004o1;

    /* renamed from: p1, reason: collision with root package name */
    public int f18005p1;
    public int q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f18006r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f18007s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f18008t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f18009u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f18010v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f18011w1;
    public int x1;

    /* renamed from: y1, reason: collision with root package name */
    public float f18012y1;

    /* renamed from: z1, reason: collision with root package name */
    public o f18013z1;

    public h(Context context, R1.j jVar, Handler handler, K k7) {
        super(2, jVar, 30.0f);
        this.f17989Y0 = 5000L;
        this.f17990Z0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f17987V0 = applicationContext;
        this.W0 = new m(applicationContext);
        this.f17988X0 = new w(23, handler, k7);
        this.f17991a1 = "NVIDIA".equals(t.f17155c);
        this.f18002m1 = -9223372036854775807L;
        this.f18010v1 = -1;
        this.f18011w1 = -1;
        this.f18012y1 = -1.0f;
        this.f17997h1 = 1;
        this.f17984B1 = 0;
        this.f18013z1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x06d7, code lost:
    
        if (r12.equals("A10-70L") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x084d, code lost:
    
        if (r0.equals("AFTN") == false) goto L622;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean r0(String str) {
        boolean z4;
        char c3 = 26;
        char c4 = 2;
        boolean z7 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!f17981F1) {
                    int i7 = t.f17153a;
                    if (i7 <= 28) {
                        String str2 = t.f17154b;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z4 = false;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z4 = true;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z4 = 2;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z4 = 3;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z4 = 4;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z4 = 5;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z4 = 6;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z4 = 7;
                                    break;
                                }
                                z4 = -1;
                                break;
                            default:
                                z4 = -1;
                                break;
                        }
                        switch (z4) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z7 = true;
                                break;
                        }
                        f17982G1 = z7;
                        f17981F1 = true;
                    }
                    if (i7 > 27 || !"HWEML".equals(t.f17154b)) {
                        if (i7 <= 26) {
                            String str3 = t.f17154b;
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case -2144781245:
                                    if (str3.equals("GIONEE_SWW1609")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -2144781185:
                                    if (str3.equals("GIONEE_SWW1627")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -2144781160:
                                    if (str3.equals("GIONEE_SWW1631")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -2097309513:
                                    if (str3.equals("K50a40")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -2022874474:
                                    if (str3.equals("CP8676_I02")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1978993182:
                                    if (str3.equals("NX541J")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1978990237:
                                    if (str3.equals("NX573J")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1936688988:
                                    if (str3.equals("PGN528")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1936688066:
                                    if (str3.equals("PGN610")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1936688065:
                                    if (str3.equals("PGN611")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1931988508:
                                    if (str3.equals("AquaPowerM")) {
                                        c3 = '\n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1885099851:
                                    if (str3.equals("RAIJIN")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1696512866:
                                    if (str3.equals("XT1663")) {
                                        c3 = '\f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1680025915:
                                    if (str3.equals("ComioS1")) {
                                        c3 = '\r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1615810839:
                                    if (str3.equals("Phantom6")) {
                                        c3 = 14;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1600724499:
                                    if (str3.equals("pacificrim")) {
                                        c3 = 15;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1554255044:
                                    if (str3.equals("vernee_M5")) {
                                        c3 = 16;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1481772737:
                                    if (str3.equals("panell_dl")) {
                                        c3 = 17;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1481772730:
                                    if (str3.equals("panell_ds")) {
                                        c3 = 18;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1481772729:
                                    if (str3.equals("panell_dt")) {
                                        c3 = 19;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1320080169:
                                    if (str3.equals("GiONEE_GBL7319")) {
                                        c3 = 20;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1217592143:
                                    if (str3.equals("BRAVIA_ATV2")) {
                                        c3 = 21;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1180384755:
                                    if (str3.equals("iris60")) {
                                        c3 = 22;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1139198265:
                                    if (str3.equals("Slate_Pro")) {
                                        c3 = 23;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1052835013:
                                    if (str3.equals("namath")) {
                                        c3 = 24;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -993250464:
                                    if (str3.equals("A10-70F")) {
                                        c3 = 25;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -993250458:
                                    break;
                                case -965403638:
                                    if (str3.equals("s905x018")) {
                                        c3 = 27;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -958336948:
                                    if (str3.equals("ELUGA_Ray_X")) {
                                        c3 = 28;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -879245230:
                                    if (str3.equals("tcl_eu")) {
                                        c3 = 29;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -842500323:
                                    if (str3.equals("nicklaus_f")) {
                                        c3 = 30;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -821392978:
                                    if (str3.equals("A7000-a")) {
                                        c3 = 31;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -797483286:
                                    if (str3.equals("SVP-DTV15")) {
                                        c3 = ' ';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -794946968:
                                    if (str3.equals("watson")) {
                                        c3 = '!';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -788334647:
                                    if (str3.equals("whyred")) {
                                        c3 = '\"';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -782144577:
                                    if (str3.equals("OnePlus5T")) {
                                        c3 = '#';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -575125681:
                                    if (str3.equals("GiONEE_CBL7513")) {
                                        c3 = '$';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -521118391:
                                    if (str3.equals("GIONEE_GBL7360")) {
                                        c3 = '%';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -430914369:
                                    if (str3.equals("Pixi4-7_3G")) {
                                        c3 = '&';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -290434366:
                                    if (str3.equals("taido_row")) {
                                        c3 = '\'';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -282781963:
                                    if (str3.equals("BLACK-1X")) {
                                        c3 = '(';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -277133239:
                                    if (str3.equals("Z12_PRO")) {
                                        c3 = ')';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -173639913:
                                    if (str3.equals("ELUGA_A3_Pro")) {
                                        c3 = '*';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -56598463:
                                    if (str3.equals("woods_fn")) {
                                        c3 = '+';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2126:
                                    if (str3.equals("C1")) {
                                        c3 = ',';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2564:
                                    if (str3.equals("Q5")) {
                                        c3 = '-';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2715:
                                    if (str3.equals("V1")) {
                                        c3 = '.';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2719:
                                    if (str3.equals("V5")) {
                                        c3 = '/';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3091:
                                    if (str3.equals("b5")) {
                                        c3 = '0';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3483:
                                    if (str3.equals("mh")) {
                                        c3 = '1';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 73405:
                                    if (str3.equals("JGZ")) {
                                        c3 = '2';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 75537:
                                    if (str3.equals("M04")) {
                                        c3 = '3';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 75739:
                                    if (str3.equals("M5c")) {
                                        c3 = '4';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 76779:
                                    if (str3.equals("MX6")) {
                                        c3 = '5';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 78669:
                                    if (str3.equals("P85")) {
                                        c3 = '6';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 79305:
                                    if (str3.equals("PLE")) {
                                        c3 = '7';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 80618:
                                    if (str3.equals("QX1")) {
                                        c3 = '8';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 88274:
                                    if (str3.equals("Z80")) {
                                        c3 = '9';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98846:
                                    if (str3.equals("cv1")) {
                                        c3 = ':';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98848:
                                    if (str3.equals("cv3")) {
                                        c3 = ';';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 99329:
                                    if (str3.equals("deb")) {
                                        c3 = '<';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 101481:
                                    if (str3.equals("flo")) {
                                        c3 = '=';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1513190:
                                    if (str3.equals("1601")) {
                                        c3 = '>';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1514184:
                                    if (str3.equals("1713")) {
                                        c3 = '?';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1514185:
                                    if (str3.equals("1714")) {
                                        c3 = '@';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133089:
                                    if (str3.equals("F01H")) {
                                        c3 = 'A';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133091:
                                    if (str3.equals("F01J")) {
                                        c3 = 'B';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133120:
                                    if (str3.equals("F02H")) {
                                        c3 = 'C';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133151:
                                    if (str3.equals("F03H")) {
                                        c3 = 'D';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133182:
                                    if (str3.equals("F04H")) {
                                        c3 = 'E';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2133184:
                                    if (str3.equals("F04J")) {
                                        c3 = 'F';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2436959:
                                    if (str3.equals("P681")) {
                                        c3 = 'G';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2463773:
                                    if (str3.equals("Q350")) {
                                        c3 = 'H';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2464648:
                                    if (str3.equals("Q427")) {
                                        c3 = 'I';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2689555:
                                    if (str3.equals("XE2X")) {
                                        c3 = 'J';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3154429:
                                    if (str3.equals("fugu")) {
                                        c3 = 'K';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3284551:
                                    if (str3.equals("kate")) {
                                        c3 = 'L';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3351335:
                                    if (str3.equals("mido")) {
                                        c3 = 'M';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3386211:
                                    if (str3.equals("p212")) {
                                        c3 = 'N';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 41325051:
                                    if (str3.equals("MEIZU_M5")) {
                                        c3 = 'O';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 51349633:
                                    if (str3.equals("601LV")) {
                                        c3 = 'P';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 51350594:
                                    if (str3.equals("602LV")) {
                                        c3 = 'Q';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 55178625:
                                    if (str3.equals("Aura_Note_2")) {
                                        c3 = 'R';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 61542055:
                                    if (str3.equals("A1601")) {
                                        c3 = 'S';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 65355429:
                                    if (str3.equals("E5643")) {
                                        c3 = 'T';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66214468:
                                    if (str3.equals("F3111")) {
                                        c3 = 'U';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66214470:
                                    if (str3.equals("F3113")) {
                                        c3 = 'V';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66214473:
                                    if (str3.equals("F3116")) {
                                        c3 = 'W';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66215429:
                                    if (str3.equals("F3211")) {
                                        c3 = 'X';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66215431:
                                    if (str3.equals("F3213")) {
                                        c3 = 'Y';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66215433:
                                    if (str3.equals("F3215")) {
                                        c3 = 'Z';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 66216390:
                                    if (str3.equals("F3311")) {
                                        c3 = '[';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 76402249:
                                    if (str3.equals("PRO7S")) {
                                        c3 = '\\';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 76404105:
                                    if (str3.equals("Q4260")) {
                                        c3 = ']';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 76404911:
                                    if (str3.equals("Q4310")) {
                                        c3 = '^';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 80963634:
                                    if (str3.equals("V23GB")) {
                                        c3 = '_';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 82882791:
                                    if (str3.equals("X3_HK")) {
                                        c3 = '`';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98715550:
                                    if (str3.equals("i9031")) {
                                        c3 = 'a';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 101370885:
                                    if (str3.equals("l5460")) {
                                        c3 = 'b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 102844228:
                                    if (str3.equals("le_x6")) {
                                        c3 = 'c';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 165221241:
                                    if (str3.equals("A2016a40")) {
                                        c3 = 'd';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 182191441:
                                    if (str3.equals("CPY83_I00")) {
                                        c3 = 'e';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 245388979:
                                    if (str3.equals("marino_f")) {
                                        c3 = 'f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 287431619:
                                    if (str3.equals("griffin")) {
                                        c3 = 'g';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 307593612:
                                    if (str3.equals("A7010a48")) {
                                        c3 = 'h';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 308517133:
                                    if (str3.equals("A7020a48")) {
                                        c3 = 'i';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 316215098:
                                    if (str3.equals("TB3-730F")) {
                                        c3 = 'j';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 316215116:
                                    if (str3.equals("TB3-730X")) {
                                        c3 = 'k';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 316246811:
                                    if (str3.equals("TB3-850F")) {
                                        c3 = 'l';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 316246818:
                                    if (str3.equals("TB3-850M")) {
                                        c3 = 'm';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 407160593:
                                    if (str3.equals("Pixi5-10_4G")) {
                                        c3 = 'n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 507412548:
                                    if (str3.equals("QM16XE_U")) {
                                        c3 = 'o';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 793982701:
                                    if (str3.equals("GIONEE_WBL5708")) {
                                        c3 = 'p';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 794038622:
                                    if (str3.equals("GIONEE_WBL7365")) {
                                        c3 = 'q';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 794040393:
                                    if (str3.equals("GIONEE_WBL7519")) {
                                        c3 = 'r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 835649806:
                                    if (str3.equals("manning")) {
                                        c3 = 's';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 917340916:
                                    if (str3.equals("A7000plus")) {
                                        c3 = 't';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 958008161:
                                    if (str3.equals("j2xlteins")) {
                                        c3 = 'u';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1060579533:
                                    if (str3.equals("panell_d")) {
                                        c3 = 'v';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1150207623:
                                    if (str3.equals("LS-5017")) {
                                        c3 = 'w';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1176899427:
                                    if (str3.equals("itel_S41")) {
                                        c3 = 'x';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1280332038:
                                    if (str3.equals("hwALE-H")) {
                                        c3 = 'y';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1306947716:
                                    if (str3.equals("EverStar_S")) {
                                        c3 = 'z';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1349174697:
                                    if (str3.equals("htc_e56ml_dtul")) {
                                        c3 = '{';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1522194893:
                                    if (str3.equals("woods_f")) {
                                        c3 = '|';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1691543273:
                                    if (str3.equals("CPH1609")) {
                                        c3 = '}';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1691544261:
                                    if (str3.equals("CPH1715")) {
                                        c3 = '~';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1709443163:
                                    if (str3.equals("iball8735_9806")) {
                                        c3 = 127;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1865889110:
                                    if (str3.equals("santoni")) {
                                        c3 = 128;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1906253259:
                                    if (str3.equals("PB2-670M")) {
                                        c3 = 129;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1977196784:
                                    if (str3.equals("Infinix-X572")) {
                                        c3 = 130;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2006372676:
                                    if (str3.equals("BRAVIA_ATV3_4K")) {
                                        c3 = 131;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2019281702:
                                    if (str3.equals("DM-01K")) {
                                        c3 = 132;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2029784656:
                                    if (str3.equals("HWBLN-H")) {
                                        c3 = 133;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2030379515:
                                    if (str3.equals("HWCAM-H")) {
                                        c3 = 134;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2033393791:
                                    if (str3.equals("ASUS_X00AD_2")) {
                                        c3 = 135;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2047190025:
                                    if (str3.equals("ELUGA_Note")) {
                                        c3 = 136;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2047252157:
                                    if (str3.equals("ELUGA_Prim")) {
                                        c3 = 137;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2048319463:
                                    if (str3.equals("HWVNS-H")) {
                                        c3 = 138;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2048855701:
                                    if (str3.equals("HWWAS-H")) {
                                        c3 = 139;
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
                                    String str4 = t.f17156d;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -594534941:
                                            if (str4.equals("JSN-L21")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2006354:
                                            if (str4.equals("AFTA")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2006367:
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                    }
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
                        f17982G1 = z7;
                        f17981F1 = true;
                    }
                    z7 = true;
                    f17982G1 = z7;
                    f17981F1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f17982G1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
    
        if (r10.equals("video/av01") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s0(R1.m mVar, X x4) {
        int i7;
        int i8;
        int intValue;
        int i9 = 4;
        char c3 = 1;
        int i10 = x4.f288H;
        if (i10 == -1 || (i7 = x4.f289I) == -1) {
            return -1;
        }
        String str = x4.f283C;
        if ("video/dolby-vision".equals(str)) {
            Pair d7 = R1.w.d(x4);
            str = (d7 == null || !((intValue = ((Integer) d7.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
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
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c3 = 5;
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
            case 3:
            case 5:
                i8 = i10 * i7;
                i9 = 2;
                break;
            case 2:
            case 6:
                i8 = i10 * i7;
                break;
            case 4:
                String str2 = t.f17156d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(t.f17155c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mVar.f5930f)))) {
                    i8 = t.g(i7, 16) * t.g(i10, 16) * 256;
                    i9 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static AbstractC0167z t0(q qVar, X x4, boolean z4, boolean z7) {
        String str = x4.f283C;
        if (str == null) {
            C0165x c0165x = AbstractC0167z.f2083b;
            return E3.L.f2000e;
        }
        qVar.getClass();
        List e7 = R1.w.e(str, z4, z7);
        String b7 = R1.w.b(x4);
        if (b7 == null) {
            return AbstractC0167z.E(e7);
        }
        List e8 = R1.w.e(b7, z4, z7);
        C0165x c0165x2 = AbstractC0167z.f2083b;
        C0164w c0164w = new C0164w();
        c0164w.c(e7);
        c0164w.c(e8);
        return c0164w.d();
    }

    public static int u0(R1.m mVar, X x4) {
        if (x4.f284D == -1) {
            return s0(mVar, x4);
        }
        List list = x4.f285E;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((byte[]) list.get(i8)).length;
        }
        return x4.f284D + i7;
    }

    public final boolean A0(R1.m mVar) {
        return t.f17153a >= 23 && !this.f17983A1 && !r0(mVar.f5925a) && (!mVar.f5930f || PlaceholderSurface.b(this.f17987V0));
    }

    public final void B0(R1.k kVar, int i7) {
        AbstractC1664a.c("skipVideoBuffer");
        kVar.w(i7, false);
        AbstractC1664a.m();
        this.f5968Q0.f1690f++;
    }

    @Override // R1.p
    public final D1.i C(R1.m mVar, X x4, X x7) {
        D1.i b7 = mVar.b(x4, x7);
        C0091j c0091j = this.f17992b1;
        int i7 = c0091j.f1289a;
        int i8 = b7.f1706e;
        if (x7.f288H > i7 || x7.f289I > c0091j.f1290b) {
            i8 |= 256;
        }
        if (u0(mVar, x7) > this.f17992b1.f1291c) {
            i8 |= 64;
        }
        int i9 = i8;
        return new D1.i(mVar.f5925a, x4, x7, i9 != 0 ? 0 : b7.f1705d, i9);
    }

    public final void C0(int i7, int i8) {
        D1.e eVar = this.f5968Q0;
        eVar.f1692h += i7;
        int i9 = i7 + i8;
        eVar.f1691g += i9;
        this.f18004o1 += i9;
        int i10 = this.f18005p1 + i9;
        this.f18005p1 = i10;
        eVar.f1693i = Math.max(i10, eVar.f1693i);
        int i11 = this.f17990Z0;
        if (i11 <= 0 || this.f18004o1 < i11) {
            return;
        }
        v0();
    }

    @Override // R1.p
    public final R1.l D(IllegalStateException illegalStateException, R1.m mVar) {
        Surface surface = this.f17994e1;
        C1771f c1771f = new C1771f(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c1771f;
    }

    public final void D0(long j) {
        D1.e eVar = this.f5968Q0;
        eVar.f1694k += j;
        eVar.f1695l++;
        this.f18008t1 += j;
        this.f18009u1++;
    }

    @Override // R1.p
    public final boolean L() {
        return this.f17983A1 && t.f17153a < 23;
    }

    @Override // R1.p
    public final float M(float f7, X[] xArr) {
        float f8 = -1.0f;
        for (X x4 : xArr) {
            float f9 = x4.f290J;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    @Override // R1.p
    public final ArrayList N(q qVar, X x4, boolean z4) {
        AbstractC0167z t02 = t0(qVar, x4, z4, this.f17983A1);
        Pattern pattern = R1.w.f6011a;
        ArrayList arrayList = new ArrayList(t02);
        Collections.sort(arrayList, new M(new C0042s(x4, 27), 3));
        return arrayList;
    }

    @Override // R1.p
    public final R1.i P(R1.m mVar, X x4, MediaCrypto mediaCrypto, float f7) {
        int i7;
        C1767b c1767b;
        int i8;
        C0091j c0091j;
        int i9;
        Point point;
        float f8;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i10;
        char c3;
        boolean z4;
        Pair d7;
        int s02;
        PlaceholderSurface placeholderSurface = this.f17995f1;
        if (placeholderSurface != null && placeholderSurface.f10703a != mVar.f5930f) {
            if (this.f17994e1 == placeholderSurface) {
                this.f17994e1 = null;
            }
            placeholderSurface.release();
            this.f17995f1 = null;
        }
        String str = mVar.f5927c;
        X[] xArr = this.f382y;
        xArr.getClass();
        int i11 = x4.f288H;
        int u02 = u0(mVar, x4);
        int length = xArr.length;
        float f9 = x4.f290J;
        int i12 = x4.f288H;
        C1767b c1767b2 = x4.f295O;
        int i13 = x4.f289I;
        if (length == 1) {
            if (u02 != -1 && (s02 = s0(mVar, x4)) != -1) {
                u02 = Math.min((int) (u02 * 1.5f), s02);
            }
            c0091j = new C0091j(i11, i13, u02);
            i7 = i12;
            c1767b = c1767b2;
            i8 = i13;
        } else {
            int length2 = xArr.length;
            int i14 = i13;
            int i15 = 0;
            boolean z7 = false;
            while (i15 < length2) {
                X x7 = xArr[i15];
                X[] xArr2 = xArr;
                if (c1767b2 != null && x7.f295O == null) {
                    Format$Builder a2 = x7.a();
                    a2.f10549w = c1767b2;
                    x7 = new X(a2);
                }
                if (mVar.b(x4, x7).f1705d != 0) {
                    int i16 = x7.f289I;
                    i10 = length2;
                    int i17 = x7.f288H;
                    c3 = 65535;
                    z7 |= i17 == -1 || i16 == -1;
                    i11 = Math.max(i11, i17);
                    i14 = Math.max(i14, i16);
                    u02 = Math.max(u02, u0(mVar, x7));
                } else {
                    i10 = length2;
                    c3 = 65535;
                }
                i15++;
                xArr = xArr2;
                length2 = i10;
            }
            if (z7) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i11 + "x" + i14);
                boolean z8 = i13 > i12;
                int i18 = z8 ? i13 : i12;
                if (z8) {
                    i9 = i12;
                    c1767b = c1767b2;
                } else {
                    c1767b = c1767b2;
                    i9 = i13;
                }
                float f10 = i9 / i18;
                int[] iArr = f17980E1;
                i7 = i12;
                i8 = i13;
                int i19 = 0;
                while (i19 < 9) {
                    int i20 = iArr[i19];
                    int[] iArr2 = iArr;
                    int i21 = (int) (i20 * f10);
                    if (i20 <= i18 || i21 <= i9) {
                        break;
                    }
                    int i22 = i18;
                    int i23 = i9;
                    if (t.f17153a >= 21) {
                        int i24 = z8 ? i21 : i20;
                        if (!z8) {
                            i20 = i21;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f8 = f10;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f8 = f10;
                            point2 = new Point(t.g(i24, widthAlignment) * widthAlignment, t.g(i20, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (mVar.e(point2.x, point2.y, f9)) {
                            point = point3;
                            break;
                        }
                        i19++;
                        iArr = iArr2;
                        i18 = i22;
                        i9 = i23;
                        f10 = f8;
                    } else {
                        f8 = f10;
                        try {
                            int g3 = t.g(i20, 16) * 16;
                            int g7 = t.g(i21, 16) * 16;
                            if (g3 * g7 <= R1.w.i()) {
                                int i25 = z8 ? g7 : g3;
                                if (!z8) {
                                    g3 = g7;
                                }
                                point = new Point(i25, g3);
                            } else {
                                i19++;
                                iArr = iArr2;
                                i18 = i22;
                                i9 = i23;
                                f10 = f8;
                            }
                        } catch (R1.t unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i11 = Math.max(i11, point.x);
                    i14 = Math.max(i14, point.y);
                    Format$Builder a4 = x4.a();
                    a4.f10542p = i11;
                    a4.f10543q = i14;
                    u02 = Math.max(u02, s0(mVar, new X(a4)));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i11 + "x" + i14);
                }
            } else {
                i7 = i12;
                c1767b = c1767b2;
                i8 = i13;
            }
            c0091j = new C0091j(i11, i14, u02);
        }
        this.f17992b1 = c0091j;
        int i26 = this.f17983A1 ? this.f17984B1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i8);
        AbstractC1664a.E(mediaFormat, x4.f285E);
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        AbstractC1664a.w(mediaFormat, "rotation-degrees", x4.f291K);
        if (c1767b != null) {
            C1767b c1767b3 = c1767b;
            AbstractC1664a.w(mediaFormat, "color-transfer", c1767b3.f17958c);
            AbstractC1664a.w(mediaFormat, "color-standard", c1767b3.f17956a);
            AbstractC1664a.w(mediaFormat, "color-range", c1767b3.f17957b);
            byte[] bArr = c1767b3.f17959d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(x4.f283C) && (d7 = R1.w.d(x4)) != null) {
            AbstractC1664a.w(mediaFormat, ProfileContext.TYPE, ((Integer) d7.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0091j.f1289a);
        mediaFormat.setInteger("max-height", c0091j.f1290b);
        AbstractC1664a.w(mediaFormat, "max-input-size", c0091j.f1291c);
        if (t.f17153a >= 23) {
            mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (this.f17991a1) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (this.f17994e1 == null) {
            if (!A0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f17995f1 == null) {
                this.f17995f1 = PlaceholderSurface.c(this.f17987V0, mVar.f5930f);
            }
            this.f17994e1 = this.f17995f1;
        }
        return new R1.i(mVar, mediaFormat, x4, this.f17994e1, mediaCrypto);
    }

    @Override // R1.p
    public final void Q(D1.h hVar) {
        if (this.f17993d1) {
            ByteBuffer byteBuffer = hVar.f1700x;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4 && b9 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    R1.k kVar = this.f5980Z;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.l(bundle);
                }
            }
        }
    }

    @Override // R1.p
    public final void U(Exception exc) {
        AbstractC1664a.l("MediaCodecVideoRenderer", "Video codec error", exc);
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, exc, 2));
        }
    }

    @Override // R1.p
    public final void V(long j, long j3, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, str, j, j3));
        }
        this.c1 = r0(str);
        R1.m mVar = this.f5986g0;
        mVar.getClass();
        boolean z4 = false;
        if (t.f17153a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f5926b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f5928d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i7].profile == 16384) {
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        this.f17993d1 = z4;
        if (t.f17153a < 23 || !this.f17983A1) {
            return;
        }
        R1.k kVar = this.f5980Z;
        kVar.getClass();
        this.f17985C1 = new C1772g(this, kVar);
    }

    @Override // R1.p
    public final void W(String str) {
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, str, 1));
        }
    }

    @Override // R1.p
    public final D1.i X(V0 v02) {
        D1.i X6 = super.X(v02);
        X x4 = (X) v02.f17563c;
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, x4, X6));
        }
        return X6;
    }

    @Override // R1.p
    public final void Y(X x4, MediaFormat mediaFormat) {
        R1.k kVar = this.f5980Z;
        if (kVar != null) {
            kVar.z(this.f17997h1);
        }
        if (this.f17983A1) {
            this.f18010v1 = x4.f288H;
            this.f18011w1 = x4.f289I;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f18010v1 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f18011w1 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f7 = x4.f292L;
        this.f18012y1 = f7;
        int i7 = t.f17153a;
        int i8 = x4.f291K;
        if (i7 < 21) {
            this.x1 = i8;
        } else if (i8 == 90 || i8 == 270) {
            int i9 = this.f18010v1;
            this.f18010v1 = this.f18011w1;
            this.f18011w1 = i9;
            this.f18012y1 = 1.0f / f7;
        }
        float f8 = x4.f290J;
        m mVar = this.W0;
        mVar.f18029f = f8;
        C1769d c1769d = mVar.f18024a;
        c1769d.f17969a.c();
        c1769d.f17970b.c();
        c1769d.f17971c = false;
        c1769d.f17972d = -9223372036854775807L;
        c1769d.f17973e = 0;
        mVar.b();
    }

    @Override // R1.p
    public final void Z(long j) {
        super.Z(j);
        if (this.f17983A1) {
            return;
        }
        this.q1--;
    }

    @Override // R1.p
    public final void a0() {
        q0();
    }

    @Override // R1.p
    public final void b0(D1.h hVar) {
        boolean z4 = this.f17983A1;
        if (!z4) {
            this.q1++;
        }
        if (t.f17153a >= 23 || !z4) {
            return;
        }
        long j = hVar.f1699f;
        p0(j);
        x0();
        this.f5968Q0.f1689e++;
        w0();
        Z(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [android.view.Surface] */
    @Override // A1.AbstractC0023i, A1.C0
    public final void c(int i7, Object obj) {
        Handler handler;
        Handler handler2;
        int intValue;
        m mVar = this.W0;
        if (i7 != 1) {
            if (i7 == 7) {
                this.f17986D1 = (L) obj;
                return;
            }
            if (i7 == 10) {
                int intValue2 = ((Integer) obj).intValue();
                if (this.f17984B1 != intValue2) {
                    this.f17984B1 = intValue2;
                    if (this.f17983A1) {
                        f0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i7 != 4) {
                if (i7 == 5 && mVar.j != (intValue = ((Integer) obj).intValue())) {
                    mVar.j = intValue;
                    mVar.c(true);
                    return;
                }
                return;
            }
            int intValue3 = ((Integer) obj).intValue();
            this.f17997h1 = intValue3;
            R1.k kVar = this.f5980Z;
            if (kVar != null) {
                kVar.z(intValue3);
                return;
            }
            return;
        }
        PlaceholderSurface placeholderSurface = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurface == null) {
            PlaceholderSurface placeholderSurface2 = this.f17995f1;
            if (placeholderSurface2 != null) {
                placeholderSurface = placeholderSurface2;
            } else {
                R1.m mVar2 = this.f5986g0;
                if (mVar2 != null && A0(mVar2)) {
                    placeholderSurface = PlaceholderSurface.c(this.f17987V0, mVar2.f5930f);
                    this.f17995f1 = placeholderSurface;
                }
            }
        }
        Surface surface = this.f17994e1;
        w wVar = this.f17988X0;
        if (surface == placeholderSurface) {
            if (placeholderSurface == null || placeholderSurface == this.f17995f1) {
                return;
            }
            o oVar = this.f18013z1;
            if (oVar != null && (handler = (Handler) wVar.f11335b) != null) {
                handler.post(new io.sentry.cache.f(9, wVar, oVar));
            }
            if (this.f17996g1) {
                Surface surface2 = this.f17994e1;
                Handler handler3 = (Handler) wVar.f11335b;
                if (handler3 != null) {
                    handler3.post(new io.sentry.android.core.m(wVar, surface2, SystemClock.elapsedRealtime(), 2));
                    return;
                }
                return;
            }
            return;
        }
        this.f17994e1 = placeholderSurface;
        mVar.getClass();
        PlaceholderSurface placeholderSurface3 = placeholderSurface instanceof PlaceholderSurface ? null : placeholderSurface;
        if (mVar.f18028e != placeholderSurface3) {
            mVar.a();
            mVar.f18028e = placeholderSurface3;
            mVar.c(true);
        }
        this.f17996g1 = false;
        int i8 = this.f380f;
        R1.k kVar2 = this.f5980Z;
        if (kVar2 != null) {
            if (t.f17153a < 23 || placeholderSurface == null || this.c1) {
                f0();
                S();
            } else {
                kVar2.E(placeholderSurface);
            }
        }
        if (placeholderSurface == null || placeholderSurface == this.f17995f1) {
            this.f18013z1 = null;
            q0();
            return;
        }
        o oVar2 = this.f18013z1;
        if (oVar2 != null && (handler2 = (Handler) wVar.f11335b) != null) {
            handler2.post(new io.sentry.cache.f(9, wVar, oVar2));
        }
        q0();
        if (i8 == 2) {
            long j = this.f17989Y0;
            this.f18002m1 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if ((r9 == 0 ? false : r1.f17967g[(int) ((r9 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        if ((((r5 > (-30000) ? 1 : (r5 == (-30000) ? 0 : -1)) < 0) && r13 > 100000) != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    @Override // R1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(long j, long j3, R1.k kVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, X x4) {
        boolean z8;
        long j8;
        boolean z9;
        long j9;
        boolean z10;
        boolean z11;
        long j10;
        long j11;
        kVar.getClass();
        if (this.f18001l1 == -9223372036854775807L) {
            this.f18001l1 = j;
        }
        if (j7 != this.f18006r1) {
            m mVar = this.W0;
            long j12 = mVar.f18036n;
            if (j12 != -1) {
                mVar.f18038p = j12;
                mVar.f18039q = mVar.f18037o;
            }
            mVar.f18035m++;
            long j13 = j7 * 1000;
            C1769d c1769d = mVar.f18024a;
            c1769d.f17969a.b(j13);
            if (c1769d.f17969a.a()) {
                c1769d.f17971c = false;
            } else if (c1769d.f17972d != -9223372036854775807L) {
                if (c1769d.f17971c) {
                    C1768c c1768c = c1769d.f17970b;
                    long j14 = c1768c.f17964d;
                }
                c1769d.f17970b.c();
                c1769d.f17970b.b(c1769d.f17972d);
                c1769d.f17971c = true;
                c1769d.f17970b.b(j13);
            }
            if (c1769d.f17971c && c1769d.f17970b.a()) {
                C1768c c1768c2 = c1769d.f17969a;
                c1769d.f17969a = c1769d.f17970b;
                c1769d.f17970b = c1768c2;
                c1769d.f17971c = false;
            }
            c1769d.f17972d = j13;
            c1769d.f17973e = c1769d.f17969a.a() ? 0 : c1769d.f17973e + 1;
            mVar.b();
            this.f18006r1 = j7;
        }
        long j15 = this.f5972S0;
        long j16 = j7 - j15;
        if (z4 && !z7) {
            B0(kVar, i7);
            return true;
        }
        double d7 = this.f5978X;
        boolean z12 = this.f380f == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j17 = (long) ((j7 - j) / d7);
        if (z12) {
            j17 -= elapsedRealtime - j3;
        }
        if (this.f17994e1 == this.f17995f1) {
            if (!(j17 < -30000)) {
                return false;
            }
            B0(kVar, i7);
            D0(j17);
            return true;
        }
        long j18 = elapsedRealtime - this.f18007s1;
        if (this.f18000k1 ? this.f17998i1 : !(z12 || this.f17999j1)) {
            j8 = j16;
            z8 = false;
        } else {
            z8 = true;
            j8 = j16;
        }
        if (this.f18002m1 == -9223372036854775807L && j >= j15) {
            if (!z8) {
                if (z12) {
                }
            }
            z9 = true;
            if (!z9) {
                long nanoTime = System.nanoTime();
                L l7 = this.f17986D1;
                if (l7 != null) {
                    l7.d(j8, nanoTime);
                }
                if (t.f17153a >= 21) {
                    z0(kVar, i7, nanoTime);
                } else {
                    y0(kVar, i7);
                }
                D0(j17);
                return true;
            }
            long j19 = j8;
            if (z12 && j != this.f18001l1) {
                long nanoTime2 = System.nanoTime();
                long j20 = (j17 * 1000) + nanoTime2;
                m mVar2 = this.W0;
                if (mVar2.f18038p == -1 || !mVar2.f18024a.f17969a.a()) {
                    j9 = j19;
                } else {
                    C1769d c1769d2 = mVar2.f18024a;
                    if (c1769d2.f17969a.a()) {
                        C1768c c1768c3 = c1769d2.f17969a;
                        long j21 = c1768c3.f17965e;
                        j11 = j21 == 0 ? 0L : c1768c3.f17966f / j21;
                    } else {
                        j11 = -9223372036854775807L;
                    }
                    j9 = j19;
                    long j22 = mVar2.f18039q + ((long) (((mVar2.f18035m - mVar2.f18038p) * j11) / mVar2.f18032i));
                    if (Math.abs(j20 - j22) <= 20000000) {
                        j20 = j22;
                    } else {
                        mVar2.f18035m = 0L;
                        mVar2.f18038p = -1L;
                        mVar2.f18036n = -1L;
                    }
                }
                mVar2.f18036n = mVar2.f18035m;
                mVar2.f18037o = j20;
                l lVar = mVar2.f18026c;
                if (lVar != null && mVar2.f18033k != -9223372036854775807L) {
                    long j23 = lVar.f18020a;
                    if (j23 != -9223372036854775807L) {
                        long j24 = mVar2.f18033k;
                        long j25 = (((j20 - j23) / j24) * j24) + j23;
                        if (j20 <= j25) {
                            j10 = j25 - j24;
                        } else {
                            j10 = j25;
                            j25 = j24 + j25;
                        }
                        if (j25 - j20 >= j20 - j10) {
                            j25 = j10;
                        }
                        j20 = j25 - mVar2.f18034l;
                    }
                }
                long j26 = (j20 - nanoTime2) / 1000;
                boolean z13 = this.f18002m1 != -9223372036854775807L;
                if (j26 < -500000 && !z7) {
                    W w7 = this.f381x;
                    w7.getClass();
                    int d8 = w7.d(j - this.f383z);
                    if (d8 == 0) {
                        z11 = false;
                    } else {
                        if (z13) {
                            D1.e eVar = this.f5968Q0;
                            eVar.f1688d += d8;
                            eVar.f1690f += this.q1;
                        } else {
                            this.f5968Q0.j++;
                            C0(d8, this.q1);
                        }
                        if (J()) {
                            S();
                        }
                        z11 = true;
                    }
                    if (z11) {
                        return false;
                    }
                }
                if (((j26 > (-30000L) ? 1 : (j26 == (-30000L) ? 0 : -1)) < 0) && !z7) {
                    if (z13) {
                        B0(kVar, i7);
                        z10 = true;
                    } else {
                        AbstractC1664a.c("dropVideoBuffer");
                        kVar.w(i7, false);
                        AbstractC1664a.m();
                        z10 = true;
                        C0(0, 1);
                    }
                    D0(j26);
                    return z10;
                }
                if (t.f17153a < 21) {
                    long j27 = j9;
                    if (j26 < TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION) {
                        if (j26 > 11000) {
                            try {
                                Thread.sleep((j26 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        L l8 = this.f17986D1;
                        if (l8 != null) {
                            l8.d(j27, j20);
                        }
                        y0(kVar, i7);
                        D0(j26);
                        return true;
                    }
                } else if (j26 < 50000) {
                    L l9 = this.f17986D1;
                    if (l9 != null) {
                        l9.d(j9, j20);
                    }
                    z0(kVar, i7, j20);
                    D0(j26);
                    return true;
                }
            }
            return false;
        }
        z9 = false;
        if (!z9) {
        }
    }

    @Override // R1.p
    public final void h0() {
        super.h0();
        this.q1 = 0;
    }

    @Override // A1.AbstractC0023i
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // R1.p
    public final boolean k0(R1.m mVar) {
        return this.f17994e1 != null || A0(mVar);
    }

    @Override // R1.p, A1.AbstractC0023i
    public final boolean m() {
        PlaceholderSurface placeholderSurface;
        if (super.m() && (this.f17998i1 || (((placeholderSurface = this.f17995f1) != null && this.f17994e1 == placeholderSurface) || this.f5980Z == null || this.f17983A1))) {
            this.f18002m1 = -9223372036854775807L;
            return true;
        }
        if (this.f18002m1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f18002m1) {
            return true;
        }
        this.f18002m1 = -9223372036854775807L;
        return false;
    }

    @Override // R1.p
    public final int m0(q qVar, X x4) {
        boolean z4;
        int i7 = 0;
        if (!v2.i.j(x4.f283C)) {
            return AbstractC0023i.e(0, 0, 0);
        }
        boolean z7 = x4.f286F != null;
        AbstractC0167z t02 = t0(qVar, x4, z7, false);
        if (z7 && t02.isEmpty()) {
            t02 = t0(qVar, x4, false, false);
        }
        if (t02.isEmpty()) {
            return AbstractC0023i.e(1, 0, 0);
        }
        int i8 = x4.f302V;
        if (i8 != 0 && i8 != 2) {
            return AbstractC0023i.e(2, 0, 0);
        }
        R1.m mVar = (R1.m) t02.get(0);
        boolean c3 = mVar.c(x4);
        if (!c3) {
            for (int i9 = 1; i9 < t02.size(); i9++) {
                R1.m mVar2 = (R1.m) t02.get(i9);
                if (mVar2.c(x4)) {
                    c3 = true;
                    z4 = false;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z4 = true;
        int i10 = c3 ? 4 : 3;
        int i11 = mVar.d(x4) ? 16 : 8;
        int i12 = mVar.f5931g ? 64 : 0;
        int i13 = z4 ? 128 : 0;
        if (c3) {
            AbstractC0167z t03 = t0(qVar, x4, z7, true);
            if (!t03.isEmpty()) {
                Pattern pattern = R1.w.f6011a;
                ArrayList arrayList = new ArrayList(t03);
                Collections.sort(arrayList, new M(new C0042s(x4, 27), 3));
                R1.m mVar3 = (R1.m) arrayList.get(0);
                if (mVar3.c(x4) && mVar3.d(x4)) {
                    i7 = 32;
                }
            }
        }
        return i10 | i11 | i7 | i12 | i13;
    }

    @Override // A1.AbstractC0023i
    public final void n() {
        w wVar = this.f17988X0;
        this.f18013z1 = null;
        q0();
        this.f17996g1 = false;
        this.f17985C1 = null;
        try {
            this.f5967Q = null;
            this.f5970R0 = -9223372036854775807L;
            this.f5972S0 = -9223372036854775807L;
            this.f5974T0 = 0;
            J();
            D1.e eVar = this.f5968Q0;
            wVar.getClass();
            synchronized (eVar) {
            }
            Handler handler = (Handler) wVar.f11335b;
            if (handler != null) {
                handler.post(new io.sentry.cache.f(10, wVar, eVar));
            }
        } catch (Throwable th) {
            D1.e eVar2 = this.f5968Q0;
            wVar.getClass();
            synchronized (eVar2) {
                Handler handler2 = (Handler) wVar.f11335b;
                if (handler2 != null) {
                    handler2.post(new io.sentry.cache.f(10, wVar, eVar2));
                }
                throw th;
            }
        }
    }

    @Override // A1.AbstractC0023i
    public final void o(boolean z4, boolean z7) {
        this.f5968Q0 = new D1.e();
        G0 g02 = this.f377c;
        g02.getClass();
        boolean z8 = g02.f97a;
        AbstractC1664a.h((z8 && this.f17984B1 == 0) ? false : true);
        if (this.f17983A1 != z8) {
            this.f17983A1 = z8;
            f0();
        }
        D1.e eVar = this.f5968Q0;
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new n(wVar, eVar, 4));
        }
        this.f17999j1 = z7;
        this.f18000k1 = false;
    }

    @Override // R1.p, A1.AbstractC0023i
    public final void p(long j, boolean z4) {
        super.p(j, z4);
        q0();
        m mVar = this.W0;
        mVar.f18035m = 0L;
        mVar.f18038p = -1L;
        mVar.f18036n = -1L;
        this.f18006r1 = -9223372036854775807L;
        this.f18001l1 = -9223372036854775807L;
        this.f18005p1 = 0;
        if (!z4) {
            this.f18002m1 = -9223372036854775807L;
        } else {
            long j3 = this.f17989Y0;
            this.f18002m1 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // A1.AbstractC0023i
    public final void q() {
        try {
            try {
                E();
                f0();
                C1719l1 c1719l1 = this.f5973T;
                if (c1719l1 != null) {
                    c1719l1.F(null);
                }
                this.f5973T = null;
            } catch (Throwable th) {
                C1719l1 c1719l12 = this.f5973T;
                if (c1719l12 != null) {
                    c1719l12.F(null);
                }
                this.f5973T = null;
                throw th;
            }
        } finally {
            PlaceholderSurface placeholderSurface = this.f17995f1;
            if (placeholderSurface != null) {
                if (this.f17994e1 == placeholderSurface) {
                    this.f17994e1 = null;
                }
                placeholderSurface.release();
                this.f17995f1 = null;
            }
        }
    }

    public final void q0() {
        R1.k kVar;
        this.f17998i1 = false;
        if (t.f17153a < 23 || !this.f17983A1 || (kVar = this.f5980Z) == null) {
            return;
        }
        this.f17985C1 = new C1772g(this, kVar);
    }

    @Override // A1.AbstractC0023i
    public final void r() {
        this.f18004o1 = 0;
        this.f18003n1 = SystemClock.elapsedRealtime();
        this.f18007s1 = SystemClock.elapsedRealtime() * 1000;
        this.f18008t1 = 0L;
        this.f18009u1 = 0;
        m mVar = this.W0;
        mVar.f18027d = true;
        mVar.f18035m = 0L;
        mVar.f18038p = -1L;
        mVar.f18036n = -1L;
        k kVar = mVar.f18025b;
        if (kVar != null) {
            l lVar = mVar.f18026c;
            lVar.getClass();
            lVar.f18021b.sendEmptyMessage(1);
            kVar.h(new F(mVar, 19));
        }
        mVar.c(false);
    }

    @Override // A1.AbstractC0023i
    public final void s() {
        this.f18002m1 = -9223372036854775807L;
        v0();
        int i7 = this.f18009u1;
        if (i7 != 0) {
            long j = this.f18008t1;
            w wVar = this.f17988X0;
            Handler handler = (Handler) wVar.f11335b;
            if (handler != null) {
                handler.post(new n(wVar, j, i7));
            }
            this.f18008t1 = 0L;
            this.f18009u1 = 0;
        }
        m mVar = this.W0;
        mVar.f18027d = false;
        k kVar = mVar.f18025b;
        if (kVar != null) {
            kVar.a();
            l lVar = mVar.f18026c;
            lVar.getClass();
            lVar.f18021b.sendEmptyMessage(2);
        }
        mVar.a();
    }

    public final void v0() {
        if (this.f18004o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f18003n1;
            int i7 = this.f18004o1;
            w wVar = this.f17988X0;
            Handler handler = (Handler) wVar.f11335b;
            if (handler != null) {
                handler.post(new n(wVar, i7, j));
            }
            this.f18004o1 = 0;
            this.f18003n1 = elapsedRealtime;
        }
    }

    public final void w0() {
        this.f18000k1 = true;
        if (this.f17998i1) {
            return;
        }
        this.f17998i1 = true;
        Surface surface = this.f17994e1;
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new io.sentry.android.core.m(wVar, surface, SystemClock.elapsedRealtime(), 2));
        }
        this.f17996g1 = true;
    }

    public final void x0() {
        int i7 = this.f18010v1;
        if (i7 == -1 && this.f18011w1 == -1) {
            return;
        }
        o oVar = this.f18013z1;
        if (oVar != null && oVar.f18042a == i7 && oVar.f18043b == this.f18011w1 && oVar.f18044c == this.x1 && oVar.f18045d == this.f18012y1) {
            return;
        }
        o oVar2 = new o(i7, this.f18011w1, this.x1, this.f18012y1);
        this.f18013z1 = oVar2;
        w wVar = this.f17988X0;
        Handler handler = (Handler) wVar.f11335b;
        if (handler != null) {
            handler.post(new io.sentry.cache.f(9, wVar, oVar2));
        }
    }

    @Override // R1.p, A1.AbstractC0023i
    public final void y(float f7, float f8) {
        super.y(f7, f8);
        m mVar = this.W0;
        mVar.f18032i = f7;
        mVar.f18035m = 0L;
        mVar.f18038p = -1L;
        mVar.f18036n = -1L;
        mVar.c(false);
    }

    public final void y0(R1.k kVar, int i7) {
        x0();
        AbstractC1664a.c("releaseOutputBuffer");
        kVar.w(i7, true);
        AbstractC1664a.m();
        this.f18007s1 = SystemClock.elapsedRealtime() * 1000;
        this.f5968Q0.f1689e++;
        this.f18005p1 = 0;
        w0();
    }

    public final void z0(R1.k kVar, int i7, long j) {
        x0();
        AbstractC1664a.c("releaseOutputBuffer");
        kVar.n(i7, j);
        AbstractC1664a.m();
        this.f18007s1 = SystemClock.elapsedRealtime() * 1000;
        this.f5968Q0.f1689e++;
        this.f18005p1 = 0;
        w0();
    }
}
