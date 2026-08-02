package L3;

import B3.C2566j;
import B3.M;
import B3.q;
import F3.InterfaceC3018x;
import L3.K;
import L3.L;
import L3.o;
import L3.v;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import j3.C7267i;
import j3.C7272n;
import j3.O;
import j3.Q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import m3.C8052E;
import m3.C8065g;
import m3.N;
import t3.C9730B;
import t3.C9737c;
import t3.C9738d;

/* renamed from: L3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3571k extends B3.C {

    /* renamed from: R1, reason: collision with root package name */
    private static final int[] f16305R1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: S1, reason: collision with root package name */
    private static boolean f16306S1;

    /* renamed from: T1, reason: collision with root package name */
    private static boolean f16307T1;

    /* renamed from: A1, reason: collision with root package name */
    private int f16308A1;

    /* renamed from: B1, reason: collision with root package name */
    private t3.H f16309B1;

    /* renamed from: C1, reason: collision with root package name */
    private boolean f16310C1;

    /* renamed from: D1, reason: collision with root package name */
    private long f16311D1;

    /* renamed from: E1, reason: collision with root package name */
    private int f16312E1;

    /* renamed from: F1, reason: collision with root package name */
    private long f16313F1;

    /* renamed from: G1, reason: collision with root package name */
    private Q f16314G1;

    /* renamed from: H1, reason: collision with root package name */
    private Q f16315H1;

    /* renamed from: I1, reason: collision with root package name */
    private int f16316I1;

    /* renamed from: J1, reason: collision with root package name */
    private boolean f16317J1;

    /* renamed from: K1, reason: collision with root package name */
    private int f16318K1;

    /* renamed from: L1, reason: collision with root package name */
    e f16319L1;

    /* renamed from: M1, reason: collision with root package name */
    private u f16320M1;

    /* renamed from: N1, reason: collision with root package name */
    private long f16321N1;

    /* renamed from: O1, reason: collision with root package name */
    private long f16322O1;

    /* renamed from: P1, reason: collision with root package name */
    private boolean f16323P1;

    /* renamed from: Q1, reason: collision with root package name */
    private int f16324Q1;

    /* renamed from: a1, reason: collision with root package name */
    private final Context f16325a1;

    /* renamed from: b1, reason: collision with root package name */
    private final boolean f16326b1;

    /* renamed from: c1, reason: collision with root package name */
    private final K.a f16327c1;

    /* renamed from: d1, reason: collision with root package name */
    private final int f16328d1;

    /* renamed from: e1, reason: collision with root package name */
    private final boolean f16329e1;

    /* renamed from: f1, reason: collision with root package name */
    private final v f16330f1;

    /* renamed from: g1, reason: collision with root package name */
    private final v.a f16331g1;

    /* renamed from: h1, reason: collision with root package name */
    private final long f16332h1;

    /* renamed from: i1, reason: collision with root package name */
    private final PriorityQueue<Long> f16333i1;

    /* renamed from: j1, reason: collision with root package name */
    private final boolean f16334j1;

    /* renamed from: k1, reason: collision with root package name */
    private d f16335k1;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f16336l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f16337m1;

    /* renamed from: n1, reason: collision with root package name */
    private L f16338n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f16339o1;

    /* renamed from: p1, reason: collision with root package name */
    private int f16340p1;

    /* renamed from: q1, reason: collision with root package name */
    private List<Object> f16341q1;

    /* renamed from: r1, reason: collision with root package name */
    private Surface f16342r1;

    /* renamed from: s1, reason: collision with root package name */
    private C3572l f16343s1;

    /* renamed from: t1, reason: collision with root package name */
    private C8052E f16344t1;

    /* renamed from: u1, reason: collision with root package name */
    private boolean f16345u1;

    /* renamed from: v1, reason: collision with root package name */
    private int f16346v1;

    /* renamed from: w1, reason: collision with root package name */
    private int f16347w1;

    /* renamed from: x1, reason: collision with root package name */
    private long f16348x1;

    /* renamed from: y1, reason: collision with root package name */
    private int f16349y1;

    /* renamed from: z1, reason: collision with root package name */
    private int f16350z1;

    /* renamed from: L3.k$a */
    /* loaded from: classes8.dex */
    final class a implements L.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B3.q f16351a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16352b;

        a(B3.q qVar, int i11, long j11) {
            this.f16351a = qVar;
            this.f16352b = i11;
        }

        @Override // L3.L.b
        public final void a() {
            C3571k.this.G1(this.f16351a, this.f16352b);
        }

        @Override // L3.L.b
        public final void b(long j11) {
            C3571k.this.C1(this.f16351a, this.f16352b, j11);
        }
    }

    /* renamed from: L3.k$b */
    /* loaded from: classes8.dex */
    private static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i11 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: L3.k$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16354a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16355b;

        /* renamed from: c, reason: collision with root package name */
        private q.b f16356c;

        /* renamed from: d, reason: collision with root package name */
        private long f16357d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16358e;

        /* renamed from: f, reason: collision with root package name */
        private Handler f16359f;

        /* renamed from: g, reason: collision with root package name */
        private K f16360g;

        /* renamed from: h, reason: collision with root package name */
        private int f16361h;

        public c(Context context) {
            this.f16354a = context;
            this.f16356c = new C2566j(context);
        }

        public final C3571k h() {
            G10.a.h(!this.f16355b);
            Handler handler = this.f16359f;
            G10.a.h((handler == null && this.f16360g == null) || !(handler == null || this.f16360g == null));
            this.f16355b = true;
            return new C3571k(this);
        }

        public final void i() {
            this.f16357d = 5000L;
        }

        public final void j(q.b bVar) {
            this.f16356c = bVar;
        }

        public final void k(boolean z11) {
            this.f16358e = z11;
        }

        public final void l(Handler handler) {
            this.f16359f = handler;
        }

        public final void m(K k11) {
            this.f16360g = k11;
        }

        public final void n() {
            this.f16361h = 50;
        }
    }

    /* renamed from: L3.k$d */
    protected static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f16362a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16363b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16364c;

        public d(int i11, int i12, int i13) {
            this.f16362a = i11;
            this.f16363b = i12;
            this.f16364c = i13;
        }
    }

    /* renamed from: L3.k$e */
    /* loaded from: classes8.dex */
    private final class e implements q.d, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f16365a;

        public e(B3.q qVar) {
            Handler p11 = N.p(this);
            this.f16365a = p11;
            qVar.d(this, p11);
        }

        private void b(long j11) {
            C3571k c3571k = C3571k.this;
            if (this != c3571k.f16319L1 || c3571k.m0() == null) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                C3571k.r1(c3571k);
                return;
            }
            try {
                c3571k.B1(j11);
            } catch (C5449k e11) {
                c3571k.c1(e11);
            }
        }

        @Override // B3.q.d
        public final void a(long j11) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j11);
            } else {
                Handler handler = this.f16365a;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j11 >> 32), (int) j11));
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = N.f74289a;
            b(((i11 & 4294967295L) << 32) | (4294967295L & i12));
            return true;
        }
    }

    protected C3571k(c cVar) {
        super(2, cVar.f16356c, B3.E.f2296T, cVar.f16358e, 30.0f);
        Context applicationContext = cVar.f16354a.getApplicationContext();
        this.f16325a1 = applicationContext;
        this.f16328d1 = cVar.f16361h;
        this.f16338n1 = null;
        this.f16327c1 = new K.a(cVar.f16359f, cVar.f16360g);
        this.f16326b1 = this.f16338n1 == null;
        this.f16330f1 = new v(applicationContext, this, cVar.f16357d);
        this.f16331g1 = new v.a();
        this.f16329e1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f16344t1 = C8052E.f74274c;
        this.f16346v1 = 1;
        this.f16347w1 = 0;
        this.f16314G1 = Q.f69042d;
        this.f16318K1 = 0;
        this.f16315H1 = null;
        this.f16316I1 = -1000;
        this.f16321N1 = -9223372036854775807L;
        this.f16322O1 = -9223372036854775807L;
        this.f16333i1 = new PriorityQueue<>();
        this.f16332h1 = -9223372036854775807L;
        this.f16334j1 = false;
        this.f16309B1 = null;
    }

    private void A1() {
        if (this.f16317J1) {
            int i11 = Build.VERSION.SDK_INT;
            B3.q m02 = m0();
            if (m02 == null) {
                return;
            }
            this.f16319L1 = new e(m02);
            if (i11 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                m02.a(bundle);
            }
        }
    }

    private void D1(Object obj) throws C5449k {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f16342r1;
        K.a aVar = this.f16327c1;
        if (surface2 == surface) {
            if (surface != null) {
                Q q11 = this.f16315H1;
                if (q11 != null) {
                    aVar.t(q11);
                }
                Surface surface3 = this.f16342r1;
                if (surface3 == null || !this.f16345u1) {
                    return;
                }
                aVar.q(surface3);
                return;
            }
            return;
        }
        this.f16342r1 = surface;
        L l11 = this.f16338n1;
        v vVar = this.f16330f1;
        if (l11 == null) {
            vVar.m(surface);
        }
        this.f16345u1 = false;
        int state = getState();
        B3.q m02 = m0();
        if (m02 != null && this.f16338n1 == null) {
            B3.t o02 = o0();
            o02.getClass();
            boolean y12 = y1(o02);
            int i11 = Build.VERSION.SDK_INT;
            if (!y12 || this.f16336l1) {
                V0();
                G0();
            } else {
                Surface x12 = x1(o02);
                if (x12 != null) {
                    m02.m(x12);
                } else {
                    if (i11 < 35) {
                        throw new IllegalStateException();
                    }
                    m02.k();
                }
            }
        }
        if (surface != null) {
            Q q12 = this.f16315H1;
            if (q12 != null) {
                aVar.t(q12);
            }
        } else {
            this.f16315H1 = null;
            L l12 = this.f16338n1;
            if (l12 != null) {
                l12.u();
            }
        }
        if (state == 2) {
            L l13 = this.f16338n1;
            if (l13 != null) {
                l13.w(true);
            } else {
                vVar.d(true);
            }
        }
        A1();
    }

    static void p1(C3571k c3571k) {
        c3571k.f16327c1.q(c3571k.f16342r1);
        c3571k.f16345u1 = true;
    }

    static void r1(C3571k c3571k) {
        c3571k.b1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x074f, code lost:
    
        if (r14.equals("A10-70L") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08b7, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L662;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static boolean t1(String str) {
        char c11;
        boolean z11;
        char c12 = 26;
        boolean z12 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C3571k.class) {
            try {
                if (!f16306S1) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z11 = false;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z11 = true;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z11 = 2;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z11 = 3;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z11 = 4;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z11 = 5;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z11 = 6;
                                    break;
                                }
                                z11 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z11 = 7;
                                    break;
                                }
                                z11 = -1;
                                break;
                            default:
                                z11 = -1;
                                break;
                        }
                        switch (z11) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z12 = true;
                                break;
                        }
                        f16307T1 = z12;
                        f16306S1 = true;
                    }
                    if (i11 > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            default:
                                if (i11 <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c12 = '\t';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c12 = '\n';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c12 = 11;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c12 = '\f';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c12 = '\r';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c12 = 14;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c12 = 15;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c12 = 16;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c12 = 17;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c12 = 18;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c12 = 19;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c12 = 20;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c12 = 21;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c12 = 22;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c12 = 23;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c12 = 24;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c12 = 25;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -993250458:
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c12 = 27;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -958336948:
                                            if (str4.equals("ELUGA_Ray_X")) {
                                                c12 = 28;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c12 = 29;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c12 = 30;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c12 = 31;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c12 = ' ';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c12 = '!';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c12 = '\"';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c12 = '#';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c12 = '$';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c12 = '%';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c12 = '&';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c12 = '\'';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c12 = '(';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c12 = ')';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c12 = '*';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c12 = '+';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c12 = ',';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c12 = '-';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c12 = '.';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c12 = '/';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c12 = '0';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c12 = '1';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c12 = '2';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c12 = '3';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c12 = '4';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c12 = '5';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c12 = '6';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c12 = '7';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c12 = '8';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c12 = '9';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c12 = ':';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c12 = ';';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c12 = '<';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c12 = '=';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c12 = '>';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c12 = '?';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c12 = '@';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c12 = 'A';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c12 = 'B';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c12 = 'C';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c12 = 'D';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c12 = 'E';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c12 = 'F';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c12 = 'G';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c12 = 'H';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c12 = 'I';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c12 = 'J';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c12 = 'K';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c12 = 'L';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c12 = 'M';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c12 = 'N';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c12 = 'O';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c12 = 'P';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c12 = 'Q';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c12 = 'R';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c12 = 'S';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c12 = 'T';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c12 = 'U';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c12 = 'V';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c12 = 'W';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c12 = 'X';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c12 = 'Y';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c12 = 'Z';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c12 = '[';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c12 = '\\';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c12 = ']';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c12 = '^';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c12 = '_';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c12 = '`';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c12 = 'a';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c12 = 'b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c12 = 'c';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c12 = 'd';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c12 = 'e';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c12 = 'f';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c12 = 'g';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c12 = 'h';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c12 = 'i';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c12 = 'j';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c12 = 'k';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c12 = 'l';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c12 = 'm';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c12 = 'n';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c12 = 'o';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c12 = 'p';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c12 = 'q';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c12 = 'r';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c12 = 's';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c12 = 't';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c12 = 'u';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c12 = 'v';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c12 = 'w';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c12 = 'x';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c12 = 'y';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c12 = 'z';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c12 = '{';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c12 = '|';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c12 = '}';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c12 = '~';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c12 = 127;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c12 = 128;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c12 = 129;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c12 = 130;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c12 = 131;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c12 = 132;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c12 = 133;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c12 = 134;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c12 = 135;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c12 = 136;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c12 = 137;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c12 = 138;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c12 = 139;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
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
                        f16307T1 = z12;
                        f16306S1 = true;
                    }
                    z12 = true;
                    f16307T1 = z12;
                    f16306S1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f16307T1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
    
        if (r10.equals("video/hevc") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int u1(B3.t tVar, C7272n c7272n) {
        int i11;
        char c11 = 2;
        int i12 = c7272n.f69134v;
        if (i12 != -1 && (i11 = c7272n.f69135w) != -1) {
            String str = c7272n.f69127o;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                int i13 = M.f2300b;
                Pair<Integer, Integer> c12 = C8065g.c(c7272n);
                if (c12 != null) {
                    int intValue = ((Integer) c12.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1662735862:
                    if (str.equals("video/av01")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1662541442:
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i12 * i11) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i12 * i11) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !tVar.f2374f)))) {
                        return ((N.f(i11, 16) * N.f(i12, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i12 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    private static List<B3.t> v1(Context context, B3.E e11, C7272n c7272n, boolean z11, boolean z12) throws M.b {
        String str = c7272n.f69127o;
        if (str == null) {
            return AbstractC5880y.v();
        }
        if ("video/dolby-vision".equals(str) && !b.a(context)) {
            String b11 = M.b(c7272n);
            List<B3.t> v11 = b11 == null ? AbstractC5880y.v() : e11.a(b11, z11, z12);
            if (!v11.isEmpty()) {
                return v11;
            }
        }
        return M.f(e11, c7272n, z11, z12);
    }

    protected static int w1(B3.t tVar, C7272n c7272n) {
        if (c7272n.f69128p == -1) {
            return u1(tVar, c7272n);
        }
        List<byte[]> list = c7272n.f69130r;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += list.get(i12).length;
        }
        return c7272n.f69128p + i11;
    }

    private Surface x1(B3.t tVar) {
        L l11 = this.f16338n1;
        if (l11 != null) {
            return l11.b();
        }
        Surface surface = this.f16342r1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && tVar.f2376h) {
            return null;
        }
        G10.a.h(F1(tVar));
        C3572l c3572l = this.f16343s1;
        boolean z11 = tVar.f2374f;
        if (c3572l != null && c3572l.f16369a != z11 && c3572l != null) {
            c3572l.release();
            this.f16343s1 = null;
        }
        if (this.f16343s1 == null) {
            this.f16343s1 = C3572l.b(z11);
        }
        return this.f16343s1;
    }

    private boolean y1(B3.t tVar) {
        if (this.f16338n1 != null) {
            return true;
        }
        Surface surface = this.f16342r1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && tVar.f2376h) || F1(tVar);
        }
        return true;
    }

    private boolean z1(s3.f fVar) {
        if (f() || fVar.k() || this.f16322O1 == -9223372036854775807L) {
            return true;
        }
        return this.f16322O1 - (fVar.f98186f - w0()) <= 100000;
    }

    @Override // B3.C, androidx.media3.exoplayer.j0
    public final void A(float f7, float f11) throws C5449k {
        super.A(f7, f11);
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.t(f7);
        } else {
            this.f16330f1.n(f7);
        }
    }

    @Override // B3.C
    @TargetApi(29)
    protected final void A0(s3.f fVar) throws C5449k {
        if (this.f16337m1) {
            ByteBuffer byteBuffer = fVar.f98187g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b11 = byteBuffer.get();
                short s11 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b12 = byteBuffer.get();
                byte b13 = byteBuffer.get();
                byteBuffer.position(0);
                if (b11 == -75 && s11 == 60 && s12 == 1 && b12 == 4) {
                    if (b13 == 0 || b13 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        B3.q m02 = m0();
                        m02.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        m02.a(bundle);
                    }
                }
            }
        }
    }

    protected final void B1(long j11) throws C5449k {
        Surface surface;
        m1(j11);
        Q q11 = this.f16314G1;
        boolean equals = q11.equals(Q.f69042d);
        K.a aVar = this.f16327c1;
        if (!equals && !q11.equals(this.f16315H1)) {
            this.f16315H1 = q11;
            aVar.t(q11);
        }
        this.f2257R0.f99015e++;
        if (this.f16330f1.e() && (surface = this.f16342r1) != null) {
            aVar.q(surface);
            this.f16345u1 = true;
        }
        P0(j11);
    }

    protected final void C1(B3.q qVar, int i11, long j11) {
        Surface surface;
        qVar.g(i11, j11);
        this.f2257R0.f99015e++;
        this.f16350z1 = 0;
        if (this.f16338n1 == null) {
            Q q11 = this.f16314G1;
            boolean equals = q11.equals(Q.f69042d);
            K.a aVar = this.f16327c1;
            if (!equals && !q11.equals(this.f16315H1)) {
                this.f16315H1 = q11;
                aVar.t(q11);
            }
            if (!this.f16330f1.e() || (surface = this.f16342r1) == null) {
                return;
            }
            aVar.q(surface);
            this.f16345u1 = true;
        }
    }

    public final boolean E1(long j11, long j12, boolean z11, boolean z12) throws C5449k {
        int Z11;
        if (this.f16338n1 != null && this.f16326b1) {
            j12 -= -this.f16321N1;
        }
        if (j11 >= -500000 || z11 || (Z11 = Z(j12)) == 0) {
            return false;
        }
        PriorityQueue<Long> priorityQueue = this.f16333i1;
        if (z12) {
            C9737c c9737c = this.f2257R0;
            int i11 = c9737c.f99014d + Z11;
            c9737c.f99014d = i11;
            c9737c.f99016f += this.f16308A1;
            c9737c.f99014d = priorityQueue.size() + i11;
        } else {
            this.f2257R0.f99020j++;
            H1(priorityQueue.size() + Z11, this.f16308A1);
        }
        j0();
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.v(false);
        }
        return true;
    }

    protected final boolean F1(B3.t tVar) {
        if (this.f16317J1 || t1(tVar.f2369a)) {
            return false;
        }
        return !tVar.f2374f || C3572l.a();
    }

    protected final void G1(B3.q qVar, int i11) {
        qVar.f(i11);
        this.f2257R0.f99016f++;
    }

    protected final void H1(int i11, int i12) {
        int i13;
        C9737c c9737c = this.f2257R0;
        c9737c.f99018h += i11;
        int i14 = i11 + i12;
        c9737c.f99017g += i14;
        this.f16349y1 += i14;
        int i15 = this.f16350z1 + i14;
        this.f16350z1 = i15;
        c9737c.f99019i = Math.max(i15, c9737c.f99019i);
        int i16 = this.f16328d1;
        if (i16 <= 0 || (i13 = this.f16349y1) < i16 || i13 <= 0) {
            return;
        }
        F();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f16327c1.n(this.f16349y1, elapsedRealtime - this.f16348x1);
        this.f16349y1 = 0;
        this.f16348x1 = elapsedRealtime;
    }

    @Override // B3.C
    protected final boolean I0(C7272n c7272n) throws C5449k {
        L l11 = this.f16338n1;
        if (l11 == null || l11.isInitialized()) {
            return true;
        }
        try {
            return this.f16338n1.o(c7272n);
        } catch (L.c e11) {
            throw D(e11, c7272n, 7000);
        }
    }

    protected final void I1(long j11) {
        C9737c c9737c = this.f2257R0;
        c9737c.f99021k += j11;
        c9737c.f99022l++;
        this.f16311D1 += j11;
        this.f16312E1++;
    }

    @Override // B3.C
    protected final void J0(Exception exc) {
        m3.s.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f16327c1.s(exc);
    }

    @Override // B3.C
    protected final void K0(String str, long j11, long j12) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f16327c1.k(str, j11, j12);
        this.f16336l1 = t1(str);
        B3.t o02 = o0();
        o02.getClass();
        boolean z11 = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(o02.f2370b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = o02.f2372d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i11].profile == 16384) {
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        this.f16337m1 = z11;
        A1();
    }

    @Override // B3.C
    protected final void L0(String str) {
        this.f16327c1.l(str);
    }

    @Override // B3.C
    protected final C9738d M0(C9730B c9730b) throws C5449k {
        C9738d M02 = super.M0(c9730b);
        C7272n c7272n = c9730b.f98980b;
        c7272n.getClass();
        this.f16327c1.p(c7272n, M02);
        return M02;
    }

    @Override // B3.C
    protected final void N0(C7272n c7272n, MediaFormat mediaFormat) {
        int integer;
        int i11;
        B3.q m02 = m0();
        if (m02 != null) {
            m02.e(this.f16346v1);
        }
        if (this.f16317J1) {
            i11 = c7272n.f69134v;
            integer = c7272n.f69135w;
        } else {
            mediaFormat.getClass();
            boolean z11 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z11 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z11 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i11 = integer2;
        }
        float f7 = c7272n.f69097B;
        int i12 = c7272n.f69096A;
        if (i12 == 90 || i12 == 270) {
            f7 = 1.0f / f7;
            int i13 = integer;
            integer = i11;
            i11 = i13;
        }
        this.f16314G1 = new Q(i11, integer, f7);
        L l11 = this.f16338n1;
        if (l11 == null || !this.f16323P1) {
            this.f16330f1.l(c7272n.f69138z);
        } else {
            C7272n.a a11 = c7272n.a();
            a11.F0(i11);
            a11.h0(integer);
            a11.u0(f7);
            C7272n P11 = a11.P();
            int i14 = this.f16340p1;
            List list = this.f16341q1;
            if (list == null) {
                list = AbstractC5880y.v();
            }
            l11.s(P11, x0(), i14, list);
            this.f16340p1 = 2;
        }
        this.f16323P1 = false;
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        K.a aVar = this.f16327c1;
        this.f16315H1 = null;
        this.f16322O1 = -9223372036854775807L;
        A1();
        this.f16345u1 = false;
        this.f16319L1 = null;
        this.f16310C1 = true;
        try {
            super.O();
        } finally {
            aVar.m(this.f2257R0);
            aVar.t(Q.f69042d);
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void P(boolean z11, boolean z12) throws C5449k {
        super.P(z11, z12);
        boolean z13 = G().f98987b;
        G10.a.h((z13 && this.f16318K1 == 0) ? false : true);
        if (this.f16317J1 != z13) {
            this.f16317J1 = z13;
            V0();
        }
        this.f16327c1.o(this.f2257R0);
        boolean z14 = this.f16339o1;
        v vVar = this.f16330f1;
        if (!z14) {
            if (this.f16341q1 != null && this.f16338n1 == null) {
                o.a aVar = new o.a(this.f16325a1, vVar);
                aVar.h();
                aVar.g(F());
                o f7 = aVar.f();
                f7.D();
                this.f16338n1 = f7.z();
            }
            this.f16339o1 = true;
        }
        L l11 = this.f16338n1;
        if (l11 == null) {
            vVar.k(F());
            vVar.h(!z12 ? 1 : 0);
            return;
        }
        l11.i(new C3570j(this), com.google.common.util.concurrent.o.a());
        u uVar = this.f16320M1;
        if (uVar != null) {
            this.f16338n1.h(uVar);
        }
        if (this.f16342r1 != null && !this.f16344t1.equals(C8052E.f74274c)) {
            this.f16338n1.m(this.f16342r1, this.f16344t1);
        }
        this.f16338n1.n(this.f16347w1);
        this.f16338n1.t(y0());
        List<Object> list = this.f16341q1;
        if (list != null) {
            this.f16338n1.q(list);
        }
        this.f16340p1 = !z12 ? 1 : 0;
        g0();
    }

    @Override // B3.C
    protected final void P0(long j11) {
        super.P0(j11);
        if (this.f16317J1) {
            return;
        }
        this.f16308A1--;
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) throws C5449k {
        L l11 = this.f16338n1;
        if (l11 != null && !z11) {
            l11.v(true);
        }
        super.Q(j11, z11);
        L l12 = this.f16338n1;
        v vVar = this.f16330f1;
        if (l12 == null) {
            vVar.i();
        }
        if (z11) {
            L l13 = this.f16338n1;
            if (l13 != null) {
                l13.w(false);
            } else {
                vVar.d(false);
            }
        }
        A1();
        this.f16350z1 = 0;
    }

    @Override // B3.C
    protected final void Q0() {
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.f();
            if (this.f16321N1 == -9223372036854775807L) {
                this.f16321N1 = x0();
            }
            this.f16338n1.p(-this.f16321N1);
        } else {
            this.f16330f1.h(2);
        }
        this.f16323P1 = true;
        A1();
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void R() {
        L l11 = this.f16338n1;
        if (l11 == null || !this.f16326b1) {
            return;
        }
        l11.release();
    }

    @Override // B3.C
    protected final void R0(s3.f fVar) throws C5449k {
        this.f16324Q1 = 0;
        int n02 = n0(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (n02 & 32) == 0) && !this.f16317J1) {
            this.f16308A1++;
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void T() {
        try {
            super.T();
        } finally {
            this.f16339o1 = false;
            this.f16321N1 = -9223372036854775807L;
            C3572l c3572l = this.f16343s1;
            if (c3572l != null) {
                c3572l.release();
                this.f16343s1 = null;
            }
        }
    }

    @Override // B3.C
    protected final boolean T0(long j11, long j12, B3.q qVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, C7272n c7272n) throws C5449k {
        int i14;
        qVar.getClass();
        long w02 = j13 - w0();
        int i15 = 0;
        while (true) {
            PriorityQueue<Long> priorityQueue = this.f16333i1;
            Long peek = priorityQueue.peek();
            if (peek == null || peek.longValue() >= j13) {
                break;
            }
            i15++;
            priorityQueue.poll();
        }
        H1(i15, 0);
        L l11 = this.f16338n1;
        if (l11 != null) {
            if (!z11 || z12) {
                return l11.g(j13, new a(qVar, i11, w02));
            }
            G1(qVar, i11);
            return true;
        }
        int b11 = this.f16330f1.b(j13, j11, j12, x0(), z11, z12, this.f16331g1);
        v.a aVar = this.f16331g1;
        if (b11 == 0) {
            F();
            long nanoTime = System.nanoTime();
            u uVar = this.f16320M1;
            if (uVar != null) {
                uVar.b(w02, nanoTime, c7272n, r0());
            }
            C1(qVar, i11, nanoTime);
            I1(aVar.f());
            return true;
        }
        if (b11 != 1) {
            if (b11 == 2) {
                qVar.f(i11);
                H1(0, 1);
                I1(aVar.f());
                return true;
            }
            if (b11 == 3) {
                G1(qVar, i11);
                I1(aVar.f());
                return true;
            }
            if (b11 == 4 || b11 == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(b11));
        }
        long g10 = aVar.g();
        long f7 = aVar.f();
        if (g10 == this.f16313F1) {
            G1(qVar, i11);
        } else {
            u uVar2 = this.f16320M1;
            if (uVar2 != null) {
                i14 = i11;
                uVar2.b(w02, g10, c7272n, r0());
            } else {
                i14 = i11;
            }
            C1(qVar, i14, g10);
        }
        I1(f7);
        this.f16313F1 = g10;
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void U() {
        this.f16349y1 = 0;
        F();
        this.f16348x1 = SystemClock.elapsedRealtime();
        this.f16311D1 = 0L;
        this.f16312E1 = 0;
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.l();
        } else {
            this.f16330f1.f();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void V() {
        int i11 = this.f16349y1;
        K.a aVar = this.f16327c1;
        if (i11 > 0) {
            F();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.n(this.f16349y1, elapsedRealtime - this.f16348x1);
            this.f16349y1 = 0;
            this.f16348x1 = elapsedRealtime;
        }
        int i12 = this.f16312E1;
        if (i12 != 0) {
            aVar.r(i12, this.f16311D1);
            this.f16311D1 = 0L;
            this.f16312E1 = 0;
        }
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.k();
        } else {
            this.f16330f1.g();
        }
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f
    protected final void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) throws C5449k {
        super.W(c7272nArr, j11, j12, bVar);
        AbstractC7252H M11 = M();
        if (M11.isEmpty()) {
            this.f16322O1 = -9223372036854775807L;
            return;
        }
        bVar.getClass();
        this.f16322O1 = M11.getPeriodByUid(bVar.f8751a, new AbstractC7252H.b()).f68940d;
    }

    @Override // B3.C
    protected final void W0() {
        L l11 = this.f16338n1;
        if (l11 != null) {
            l11.f();
        }
    }

    @Override // B3.C
    protected final void X0() {
        super.X0();
        this.f16333i1.clear();
        this.f16308A1 = 0;
        this.f16324Q1 = 0;
        this.f16310C1 = false;
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        L l11 = this.f16338n1;
        return l11 == null || l11.a();
    }

    @Override // B3.C, androidx.media3.exoplayer.j0
    public final void c(long j11, long j12) throws C5449k {
        L l11 = this.f16338n1;
        if (l11 != null) {
            try {
                l11.c(j11, j12);
            } catch (L.c e11) {
                throw D(e11, e11.f16274a, 7001);
            }
        }
        super.c(j11, j12);
    }

    @Override // B3.C
    protected final C9738d c0(B3.t tVar, C7272n c7272n, C7272n c7272n2) {
        C9738d b11 = tVar.b(c7272n, c7272n2);
        d dVar = this.f16335k1;
        dVar.getClass();
        int i11 = c7272n2.f69134v;
        int i12 = dVar.f16362a;
        int i13 = b11.f99027e;
        if (i11 > i12 || c7272n2.f69135w > dVar.f16363b) {
            i13 |= 256;
        }
        if (w1(tVar, c7272n2) > dVar.f16364c) {
            i13 |= 64;
        }
        int i14 = i13;
        return new C9738d(tVar.f2369a, c7272n, c7272n2, i14 != 0 ? 0 : b11.f99026d, i14);
    }

    @Override // B3.C
    protected final B3.s d0(IllegalStateException illegalStateException, B3.t tVar) {
        return new C3569i(illegalStateException, tVar, this.f16342r1);
    }

    @Override // B3.C
    protected final boolean d1(s3.f fVar) {
        boolean z11 = false;
        if (!z1(fVar)) {
            boolean z12 = fVar.f98186f < I();
            if (z12 && !fVar.h()) {
                if (fVar.l()) {
                    fVar.f();
                    z11 = true;
                }
                if (z11) {
                    if (z12) {
                        this.f2257R0.f99014d++;
                        return z11;
                    }
                    this.f16333i1.add(Long.valueOf(fVar.f98186f));
                    this.f16324Q1++;
                }
                return z11;
            }
        }
        return false;
    }

    @Override // B3.C
    protected final boolean e1() {
        C7272n p02 = p0();
        t3.H h11 = this.f16309B1;
        if (h11 == null || !h11.f98991c || this.f16310C1 || this.f16317J1) {
            return true;
        }
        return (p02 != null && p02.f69129q > 0) || B0() || u0() != -9223372036854775807L;
    }

    @Override // B3.C
    protected final boolean f1(B3.t tVar) {
        return y1(tVar);
    }

    @Override // B3.C
    protected final boolean g1() {
        B3.t o02 = o0();
        if (this.f16338n1 != null && o02 != null) {
            String str = o02.f2369a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.g1();
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // B3.C
    protected final int i1(B3.E e11, C7272n c7272n) throws M.b {
        boolean z11;
        int i11 = 0;
        if (!j3.u.l(c7272n.f69127o)) {
            return k0.g(0, 0, 0, 0);
        }
        boolean z12 = c7272n.f69131s != null;
        Context context = this.f16325a1;
        List<B3.t> v12 = v1(context, e11, c7272n, z12, false);
        if (z12 && v12.isEmpty()) {
            v12 = v1(context, e11, c7272n, false, false);
        }
        if (v12.isEmpty()) {
            return k0.g(1, 0, 0, 0);
        }
        int i12 = c7272n.f69111P;
        if (i12 != 0 && i12 != 2) {
            return k0.g(2, 0, 0, 0);
        }
        B3.t tVar = v12.get(0);
        boolean g10 = tVar.g(c7272n);
        if (!g10) {
            for (int i13 = 1; i13 < v12.size(); i13++) {
                B3.t tVar2 = v12.get(i13);
                if (tVar2.g(c7272n)) {
                    z11 = false;
                    g10 = true;
                    tVar = tVar2;
                    break;
                }
            }
        }
        z11 = true;
        int i14 = g10 ? 4 : 3;
        int i15 = tVar.h(c7272n) ? 16 : 8;
        int i16 = tVar.f2375g ? 64 : 0;
        int i17 = z11 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0;
        if ("video/dolby-vision".equals(c7272n.f69127o) && !b.a(context)) {
            i17 = 256;
        }
        if (g10) {
            List<B3.t> v13 = v1(context, e11, c7272n, z12, true);
            if (!v13.isEmpty()) {
                B3.t tVar3 = (B3.t) M.g(v13, c7272n).get(0);
                if (tVar3.g(c7272n) && tVar3.h(c7272n)) {
                    i11 = 32;
                }
            }
        }
        return i14 | i15 | i11 | i16 | i17;
    }

    @Override // B3.C, androidx.media3.exoplayer.j0
    public final boolean isReady() {
        boolean isReady = super.isReady();
        L l11 = this.f16338n1;
        if (l11 != null) {
            return l11.r(isReady);
        }
        if (isReady && (m0() == null || this.f16317J1)) {
            return true;
        }
        return this.f16330f1.c(isReady);
    }

    @Override // B3.C, androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.h0.b
    public final void j(int i11, Object obj) throws C5449k {
        if (i11 == 1) {
            D1(obj);
            return;
        }
        if (i11 == 7) {
            obj.getClass();
            u uVar = (u) obj;
            this.f16320M1 = uVar;
            L l11 = this.f16338n1;
            if (l11 != null) {
                l11.h(uVar);
                return;
            }
            return;
        }
        if (i11 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f16318K1 != intValue) {
                this.f16318K1 = intValue;
                if (this.f16317J1) {
                    V0();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 4) {
            obj.getClass();
            this.f16346v1 = ((Integer) obj).intValue();
            B3.q m02 = m0();
            if (m02 != null) {
                m02.e(this.f16346v1);
                return;
            }
            return;
        }
        if (i11 == 5) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f16347w1 = intValue2;
            L l12 = this.f16338n1;
            if (l12 != null) {
                l12.n(intValue2);
                return;
            } else {
                this.f16330f1.j(intValue2);
                return;
            }
        }
        if (i11 == 13) {
            obj.getClass();
            List<Object> list = (List) obj;
            if (list.equals(O.f69041a)) {
                L l13 = this.f16338n1;
                if (l13 == null || !l13.isInitialized()) {
                    return;
                }
                this.f16338n1.redraw();
                return;
            }
            this.f16341q1 = list;
            L l14 = this.f16338n1;
            if (l14 != null) {
                l14.q(list);
                return;
            }
            return;
        }
        if (i11 == 14) {
            obj.getClass();
            C8052E c8052e = (C8052E) obj;
            if (c8052e.b() == 0 || c8052e.a() == 0) {
                return;
            }
            this.f16344t1 = c8052e;
            L l15 = this.f16338n1;
            if (l15 != null) {
                Surface surface = this.f16342r1;
                G10.a.i(surface);
                l15.m(surface, c8052e);
                return;
            }
            return;
        }
        switch (i11) {
            case 16:
                obj.getClass();
                this.f16316I1 = ((Integer) obj).intValue();
                B3.q m03 = m0();
                if (m03 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f16316I1));
                    m03.a(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f16342r1;
                D1(null);
                obj.getClass();
                ((C3571k) obj).j(1, surface2);
                break;
            case 18:
                t3.H h11 = this.f16309B1;
                boolean z11 = h11 != null && h11.f98990b;
                t3.H h12 = (t3.H) obj;
                this.f16309B1 = h12;
                if (z11 != (h12 != null && h12.f98990b)) {
                    j1();
                    break;
                }
                break;
            default:
                super.j(i11, obj);
                break;
        }
    }

    @Override // B3.C
    protected final int n0(s3.f fVar) {
        t3.H h11;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f16334j1 || (((h11 = this.f16309B1) != null && h11.f98993e) || this.f16317J1)) && fVar.f98186f < I() && !z1(fVar)) ? 32 : 0;
        }
        return 0;
    }

    @Override // B3.C
    protected final float q0(float f7, C7272n c7272n, C7272n[] c7272nArr) {
        B3.t o02;
        float f11 = -1.0f;
        for (C7272n c7272n2 : c7272nArr) {
            float f12 = c7272n2.f69138z;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        float f13 = f11 == -1.0f ? -1.0f : f11 * f7;
        if (this.f16309B1 == null || (o02 = o0()) == null) {
            return f13;
        }
        float c11 = o02.c(c7272n.f69134v, c7272n.f69135w);
        return f13 != -1.0f ? Math.max(f13, c11) : c11;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void s() {
        L l11 = this.f16338n1;
        if (l11 == null) {
            this.f16330f1.a();
            return;
        }
        int i11 = this.f16340p1;
        if (i11 == 0 || i11 == 1) {
            this.f16340p1 = 0;
        } else {
            l11.j();
        }
    }

    @Override // B3.C
    protected final ArrayList s0(B3.E e11, C7272n c7272n, boolean z11) throws M.b {
        return M.g(v1(this.f16325a1, e11, c7272n, z11, this.f16317J1), c7272n);
    }

    @Override // B3.C
    protected final q.a v0(B3.t tVar, C7272n c7272n, MediaCrypto mediaCrypto, float f7) {
        boolean z11;
        C7267i c7267i;
        int i11;
        d dVar;
        Point point;
        int i12;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        C7272n[] c7272nArr;
        int i13;
        char c11;
        boolean z12;
        int u12;
        String str = tVar.f2371c;
        C7272n[] K11 = K();
        int i14 = c7272n.f69134v;
        int w12 = w1(tVar, c7272n);
        int length = K11.length;
        float f11 = c7272n.f69138z;
        int i15 = c7272n.f69134v;
        C7267i c7267i2 = c7272n.f69100E;
        int i16 = c7272n.f69135w;
        if (length == 1) {
            if (w12 != -1 && (u12 = u1(tVar, c7272n)) != -1) {
                w12 = Math.min((int) (w12 * 1.5f), u12);
            }
            dVar = new d(i14, i16, w12);
            z11 = true;
            c7267i = c7267i2;
            i11 = i16;
        } else {
            int length2 = K11.length;
            z11 = true;
            int i17 = i16;
            int i18 = 0;
            boolean z13 = false;
            while (i18 < length2) {
                C7272n c7272n2 = K11[i18];
                int i19 = i18;
                if (c7267i2 != null && c7272n2.f69100E == null) {
                    C7272n.a a11 = c7272n2.a();
                    a11.V(c7267i2);
                    c7272n2 = a11.P();
                }
                if (tVar.b(c7272n, c7272n2).f99026d != 0) {
                    int i21 = c7272n2.f69135w;
                    c7272nArr = K11;
                    int i22 = c7272n2.f69134v;
                    i13 = length2;
                    c11 = 65535;
                    z13 |= i22 == -1 || i21 == -1;
                    int max = Math.max(i14, i22);
                    i17 = Math.max(i17, i21);
                    w12 = Math.max(w12, w1(tVar, c7272n2));
                    i14 = max;
                } else {
                    c7272nArr = K11;
                    i13 = length2;
                    c11 = 65535;
                }
                i18 = i19 + 1;
                K11 = c7272nArr;
                length2 = i13;
            }
            if (z13) {
                m3.s.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i14 + "x" + i17);
                boolean z14 = i16 > i15;
                int i23 = z14 ? i16 : i15;
                boolean z15 = z14;
                int i24 = z14 ? i15 : i16;
                float f12 = i24 / i23;
                int[] iArr = f16305R1;
                c7267i = c7267i2;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = iArr[i25];
                    int i27 = i25;
                    int i28 = (int) (i26 * f12);
                    if (i26 <= i23 || i28 <= i24) {
                        break;
                    }
                    if (!z15) {
                        i28 = i26;
                    }
                    if (!z15) {
                        i26 = i28;
                    }
                    int i29 = i24;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = tVar.f2372d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i12 = i23;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i12 = i23;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(N.f(i28, widthAlignment) * widthAlignment, N.f(i26, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i11 = i16;
                        if (tVar.i(point.x, point.y, f11)) {
                            break;
                        }
                    } else {
                        i11 = i16;
                    }
                    i25 = i27 + 1;
                    i16 = i11;
                    i24 = i29;
                    i23 = i12;
                }
                i11 = i16;
                point = null;
                if (point != null) {
                    i14 = Math.max(i14, point.x);
                    i17 = Math.max(i17, point.y);
                    C7272n.a a12 = c7272n.a();
                    a12.F0(i14);
                    a12.h0(i17);
                    w12 = Math.max(w12, u1(tVar, a12.P()));
                    m3.s.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i14 + "x" + i17);
                }
            } else {
                c7267i = c7267i2;
                i11 = i16;
            }
            dVar = new d(i14, i17, w12);
        }
        this.f16335k1 = dVar;
        int i31 = this.f16317J1 ? this.f16318K1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i15);
        mediaFormat.setInteger("height", i11);
        m3.v.b(mediaFormat, c7272n.f69130r);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        m3.v.a(mediaFormat, "rotation-degrees", c7272n.f69096A);
        if (c7267i != null) {
            C7267i c7267i3 = c7267i;
            m3.v.a(mediaFormat, "color-transfer", c7267i3.f69069c);
            m3.v.a(mediaFormat, "color-standard", c7267i3.f69067a);
            m3.v.a(mediaFormat, "color-range", c7267i3.f69068b);
            byte[] bArr = c7267i3.f69070d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c7272n.f69127o)) {
            int i32 = M.f2300b;
            Pair<Integer, Integer> c12 = C8065g.c(c7272n);
            if (c12 != null) {
                m3.v.a(mediaFormat, Scopes.PROFILE, ((Integer) c12.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", dVar.f16362a);
        mediaFormat.setInteger("max-height", dVar.f16363b);
        m3.v.a(mediaFormat, "max-input-size", dVar.f16364c);
        int i33 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f7);
        }
        if (this.f16329e1) {
            z12 = z11;
            mediaFormat.setInteger("no-post-process", z12 ? 1 : 0);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = z11;
        }
        if (i31 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i31);
        }
        if (i33 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f16316I1));
        }
        Surface x12 = x1(tVar);
        if (this.f16338n1 != null && !N.N(this.f16325a1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return q.a.b(tVar, mediaFormat, c7272n, x12, mediaCrypto);
    }
}
