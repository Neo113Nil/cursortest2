package com.facetec.sdk;

/* loaded from: classes8.dex */
final class cn {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static /* synthetic */ boolean E;
    private static int F;
    private static long I;
    private static int J;
    private static long K;
    private static char L;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    private static int Q;
    private static char R;
    private static int S;
    private static final byte[] T = null;
    private static final int V = 0;
    static volatile java.lang.String b;
    static volatile java.lang.String e;
    private static com.facetec.sdk.cn f;
    final com.facetec.sdk.z d;
    private final java.lang.ref.WeakReference<android.app.Activity> k;
    private com.facetec.sdk.cm l;
    private com.facetec.sdk.cl m;
    private com.facetec.sdk.co n;
    private com.facetec.sdk.cp p;
    private com.facetec.sdk.cs q;
    private com.facetec.sdk.ct r;
    private com.facetec.sdk.cv s;
    private com.facetec.sdk.cr t;
    private int v;
    private java.lang.Object y;
    boolean c = false;

    /* renamed from: a, reason: collision with root package name */
    boolean f3471a = false;
    private com.facetec.sdk.cn.b x = com.facetec.sdk.cn.b.NOT_STARTED;
    private final java.lang.Object w = new java.lang.Object();
    private int u = 0;
    private final java.util.Timer D = new java.util.Timer();
    private java.util.TimerTask B = null;
    private java.util.Date C = null;
    private final java.util.concurrent.Semaphore z = new java.util.concurrent.Semaphore(1);
    private boolean H = false;
    private final java.lang.Runnable[] G = {new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda12
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.cn.this.u();
        }
    }, new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda13
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.cn.this.v();
        }
    }, new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda14
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.cn.this.y();
        }
    }, new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda15
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.cn.this.C();
        }
    }, new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda16
        @Override // java.lang.Runnable
        public final void run() {
            com.facetec.sdk.cn.this.z();
        }
    }};
    private final java.util.concurrent.ExecutorService h = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: o, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f3472o = java.util.concurrent.Executors.newSingleThreadExecutor();
    private final java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.e>> i = new java.util.ArrayList<>(2);
    private final java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.d>> j = new java.util.ArrayList<>(2);
    private final java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.c>> g = new java.util.ArrayList<>(2);
    private final boolean A = com.facetec.sdk.bj.c();

    enum b {
        NOT_STARTED,
        PRE_SESSION,
        PROCESSING,
        ID_SCAN,
        WAITING_TO_FINISH,
        FINISHED
    }

    @java.lang.FunctionalInterface
    interface c {
        void onIDScanProgress(com.facetec.sdk.co coVar, com.facetec.sdk.cp cpVar);
    }

    interface d {
        void a();

        void b();

        void d();

        void d(com.facetec.sdk.cm cmVar, com.facetec.sdk.cl clVar);

        void e();
    }

    @java.lang.FunctionalInterface
    interface e {
        void onPreSessionProgress(com.facetec.sdk.cs csVar, com.facetec.sdk.cr crVar, com.facetec.sdk.ct ctVar, com.facetec.sdk.cv cvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b2, byte b3, int i) {
        int i2;
        int i3;
        int i4 = (b3 * 4) + 4;
        byte[] bArr = $$c;
        int i5 = b2 * 2;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            int i7 = 0;
            i4 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i3];
            i4 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            int i8 = 116 - i;
            i2 = 0;
            i3 = i4;
            i4 = i8;
            bArr2[i2] = (byte) i4;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    private static void ad(byte b2, int i, int i2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = i + 4;
        int i4 = i2 * 4;
        int i5 = b2 + 97;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = (-i5) + i4;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i5;
            if (i8 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = (-bArr[i7]) + i5;
            i3 = i7;
            i6 = i8;
        }
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i2)) | i8;
        int i10 = ~i2;
        int i11 = (~(i5 | i7 | i10)) | (~((~i5) | i7 | i2));
        int i12 = (~(i10 | i)) | i8;
        int i13 = i + i2 + i3 + ((-1696018712) * i4) + (2108813197 * i6);
        int i14 = i13 * i13;
        int i15 = ((362004572 * i) - 1408384217) + (362004174 * i2) + (i9 * (-398)) + (i11 * 199) + (i12 * 199) + (362004373 * i3) + ((-1290304248) * i4) + (155295761 * i6) + ((-60686336) * i14);
        switch (((i * 212195308) - 2121662464) + (i2 * 1221732374) + (i9 * 1009537066) + (i11 * (-504768533)) + (i12 * (-504768533)) + (i3 * 716963840) + (i4 * 39845888) + (i6 * 227278848) + (i14 * (-1705377792)) + (i15 * i15 * (-1680474112))) {
            case 1:
                return a(objArr);
            case 2:
                return e(objArr);
            case 3:
                return c(objArr);
            case 4:
                return b(objArr);
            case 5:
                com.facetec.sdk.m mVar = (com.facetec.sdk.m) objArr[0];
                int i16 = (P + 7) % 128;
                O = i16;
                if (mVar != null) {
                    P = (i16 + 11) % 128;
                    mVar.d(b, com.facetec.sdk.t.b.WAYPOINT_UPLOAD);
                    P = (O + 125) % 128;
                }
                return null;
            case 6:
                com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) objArr[0];
                O = (P + 59) % 128;
                cnVar.W();
                P = (O + 71) % 128;
                return null;
            case 7:
                return j(objArr);
            case 8:
                return g(objArr);
            case 9:
                return h(objArr);
            default:
                return d(objArr);
        }
    }

    static void init$0() {
        $$a = new byte[]{5, 107, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 106};
        $$b = 53;
    }

    static void init$1() {
        $$c = new byte[]{41, -22, -104, -77};
        $$d = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        t();
        S = 0;
        Q = 1;
        P = 0;
        O = 1;
        r();
        b(new java.lang.Object[0], 1159640395, -1159640395, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
        b(new java.lang.Object[0], 1076437108, -1076437104, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
        E = true;
        f = null;
        e = "";
        b = "";
        int i = S + 67;
        Q = i % 128;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
        }
    }

    static /* synthetic */ com.facetec.sdk.cn.b a(com.facetec.sdk.cn cnVar) {
        int i = P;
        int i2 = i + 111;
        O = i2 % 128;
        com.facetec.sdk.cn.b bVar = cnVar.x;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        int i4 = i + 109;
        O = i4 % 128;
        if (i4 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    static /* synthetic */ void a$1702fdc1(com.facetec.sdk.cn cnVar, java.lang.Object obj, int i) {
        P = (O + 99) % 128;
        b(new java.lang.Object[]{cnVar, obj, java.lang.Integer.valueOf(i)}, 774973806, -774973799, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
        int i2 = O + 7;
        P = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    static /* synthetic */ void b$1702fdc1(com.facetec.sdk.cn cnVar, java.lang.Object obj, int i) {
        int i2 = O + 107;
        P = i2 % 128;
        cnVar.e$6962e6(obj, i);
        if (i2 % 2 != 0) {
            java.lang.Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = P + 95;
        O = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
    }

    static /* synthetic */ void d$1702fdc1(com.facetec.sdk.cn cnVar, java.lang.Object obj, int i) {
        P = (O + 5) % 128;
        cnVar.a$6962e6(obj, i);
        int i2 = P + 111;
        O = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        java.lang.Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static /* synthetic */ void e(com.facetec.sdk.cn cnVar) {
        P = (O + 35) % 128;
        cnVar.H();
        int i = O + 93;
        P = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r3 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.facetec.sdk.cn c(android.app.Activity activity) throws java.lang.Throwable {
        synchronized (com.facetec.sdk.cn.class) {
            if (f == null) {
                f = new com.facetec.sdk.cn(activity);
                boolean d2 = com.facetec.sdk.cq.d((android.content.Context) activity);
                if (!E) {
                    int i = O + 39;
                    P = i % 128;
                    if (i % 2 != 0) {
                        int i2 = 16 / 0;
                    }
                }
            }
            com.facetec.sdk.cn cnVar = f;
            int i3 = O + 33;
            P = i3 % 128;
            if (i3 % 2 == 0) {
                return cnVar;
            }
            int i4 = 3 / 0;
            return cnVar;
        }
    }

    static void d() {
        synchronized (com.facetec.sdk.cn.class) {
            int i = P + 1;
            O = i % 128;
            if (i % 2 != 0) {
                com.facetec.sdk.cn cnVar = f;
                if (cnVar != null) {
                    cnVar.I();
                    f = null;
                    P = (O + 107) % 128;
                }
            } else {
                throw null;
            }
        }
    }

    static void a() {
        synchronized (com.facetec.sdk.cn.class) {
            if (f == null) {
                int i = O + 11;
                P = i % 128;
                if (i % 2 != 0) {
                    com.facetec.sdk.cq.a();
                    int i2 = 79 / 0;
                } else {
                    com.facetec.sdk.cq.a();
                }
            }
            P = (O + 93) % 128;
        }
    }

    private static void aj(int i, int i2, int i3, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i3];
        hpVar.d = 0;
        while (hpVar.d < i3) {
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i2 + hpVar.b);
            int i4 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(J)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) (19485 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 729, 25 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1066373931, false, $$e(b2, b2, (byte) (b2 + 3)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (24338 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.graphics.Color.red(0) + 1621, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            hpVar.f3630a = i;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i3 - hpVar.f3630a);
            $10 = ($11 + 67) % 128;
        }
        if (z) {
            char[] cArr3 = new char[i3];
            hpVar.d = 0;
            while (hpVar.d < i3) {
                int i5 = $10 + 31;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr3[hpVar.d] = cArr[(i3 >>> hpVar.d) % 1];
                    java.lang.Object[] objArr4 = {hpVar, hpVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                    if (d4 == null) {
                        d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24337), 1621 - android.graphics.Color.blue(0), 25 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                } else {
                    cArr3[hpVar.d] = cArr[(i3 - hpVar.d) - 1];
                    java.lang.Object[] objArr5 = {hpVar, hpVar};
                    java.lang.Object d5 = com.facetec.sdk.al.d(1965925374);
                    if (d5 == null) {
                        d5 = com.facetec.sdk.al.c((char) (android.text.TextUtils.getTrimmedLength("") + 24338), 1621 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 24, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private cn(android.app.Activity activity) {
        this.k = new java.lang.ref.WeakReference<>(activity);
        this.d = new com.facetec.sdk.z(activity);
        x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ae(java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = ($10 + 43) % 128;
        $11 = i2;
        if (str3 != null) {
            int i3 = i2 + 107;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 69) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        int i4 = 0;
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c2);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    char c3 = (char) (android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(i4, i4);
                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                    byte b2 = (byte) i4;
                    java.lang.String $$e = $$e(b2, b2, (byte) (b2 + 5));
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i4] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(c3, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd, (keyRepeatDelay >> 16) + 24, 326823045, false, $$e, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    char packedPositionGroup = (char) android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int indexOf = android.text.TextUtils.indexOf("", "", i4);
                    int myPid = android.os.Process.myPid();
                    byte b3 = (byte) i4;
                    java.lang.String $$e2 = $$e(b3, b3, (byte) (b3 | 8));
                    java.lang.Class[] clsArr2 = new java.lang.Class[1];
                    clsArr2[i4] = java.lang.Object.class;
                    d3 = com.facetec.sdk.al.c(packedPositionGroup, indexOf + 1505, 24 - (myPid >> 22), -750364609, false, $$e2, clsArr2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                char c4 = cArr5[hsVar.d % 4];
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr4[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr4[i4] = hsVar;
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    byte b4 = (byte) i4;
                    d4 = com.facetec.sdk.al.c((char) (26699 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 639 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 23 - android.view.KeyEvent.normalizeMetaState(i4), 510477072, false, $$e(b4, b4, (byte) (b4 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    byte b5 = (byte) 0;
                    d5 = com.facetec.sdk.al.c((char) (android.graphics.Color.alpha(0) + 409), 2198 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, -340948215, false, $$e(b5, b5, b5), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr5[intValue2] = hsVar.b;
                cArr7[hsVar.d] = (char) ((((cArr5[intValue2] ^ charArray[hsVar.d]) ^ (K ^ 9010024738234916139L)) ^ ((int) (N ^ 9010024738234916139L))) ^ ((char) (R ^ 9010024738234916139L)));
                hsVar.d++;
                i4 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        int i5 = $10 + 35;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str4;
        } else {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void ai(int i, java.lang.String str, char c2, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c3;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        int i2 = 0;
        if (str2 != 0) {
            int i3 = $10 + 97;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr = str2.toCharArray();
                int i4 = 24 / 0;
            } else {
                cArr = str2.toCharArray();
            }
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            cArr2 = str.toCharArray();
            $10 = ($11 + 95) % 128;
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.facetec.sdk.hs hsVar = new com.facetec.sdk.hs();
        int length = cArr4.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c2);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        hsVar.d = 0;
        while (hsVar.d < length3) {
            try {
                java.lang.Object[] objArr2 = {hsVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1265265027);
                if (d2 == null) {
                    char c4 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                    int offsetAfter = android.text.TextUtils.getOffsetAfter("", i2);
                    byte b2 = (byte) i2;
                    java.lang.String $$e = $$e(b2, b2, (byte) (b2 + 5));
                    java.lang.Class[] clsArr = new java.lang.Class[1];
                    clsArr[i2] = java.lang.Object.class;
                    d2 = com.facetec.sdk.al.c(c4, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 987, 24 - offsetAfter, 326823045, false, $$e, clsArr);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr3 = {hsVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1957241543);
                if (d3 == null) {
                    byte b3 = (byte) i2;
                    d3 = com.facetec.sdk.al.c((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1505 - android.text.TextUtils.getCapsMode("", i2, i2), 25 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), -750364609, false, $$e(b3, b3, (byte) (b3 | 8)), new java.lang.Class[]{java.lang.Object.class});
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                java.lang.Object[] objArr4 = {hsVar, java.lang.Integer.valueOf(cArr5[hsVar.d % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1182647832);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    d4 = com.facetec.sdk.al.c((char) (26699 - android.view.KeyEvent.getDeadChar(0, 0)), 639 - android.graphics.Color.argb(0, 0, 0, 0), 22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 510477072, false, $$e(b4, b4, (byte) (b4 + 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object d5 = com.facetec.sdk.al.d(1279455729);
                if (d5 == null) {
                    char windowTouchSlop = (char) (409 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    byte b5 = (byte) 0;
                    java.lang.String $$e2 = $$e(b5, b5, b5);
                    c3 = 2;
                    d5 = com.facetec.sdk.al.c(windowTouchSlop, lastIndexOf + 2199, bitsPerPixel + 25, -340948215, false, $$e2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                } else {
                    c3 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).charValue();
                cArr5[intValue2] = hsVar.b;
                cArr7[hsVar.d] = (char) ((((cArr5[intValue2] ^ cArr3[hsVar.d]) ^ (I ^ 9010024738234916139L)) ^ ((int) (F ^ 9010024738234916139L))) ^ ((char) (L ^ 9010024738234916139L)));
                hsVar.d++;
                i2 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0019, code lost:
    
        r2 = r24.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0017, code lost:
    
        if (r24 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r24 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r2 = r24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ah(boolean z, int i, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray;
        int i4 = $11 + 41;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
        char[] cArr = charArray;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr2 = new char[i];
        hpVar.d = 0;
        while (hpVar.d < i) {
            $11 = ($10 + 83) % 128;
            hpVar.b = cArr[hpVar.d];
            cArr2[hpVar.d] = (char) (i2 + hpVar.b);
            int i6 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6]), java.lang.Integer.valueOf(M)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    byte b2 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 19486), android.view.View.MeasureSpec.getSize(0) + 730, 24 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1066373931, false, $$e(b2, b2, (byte) (b2 + 3)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (24338 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), 1620 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            hpVar.f3630a = i3;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr3, hpVar.f3630a, cArr2, 0, i - hpVar.f3630a);
            $10 = ($11 + 119) % 128;
        }
        if (z) {
            char[] cArr4 = new char[i];
            hpVar.d = 0;
            while (hpVar.d < i) {
                $11 = ($10 + 117) % 128;
                cArr4[hpVar.d] = cArr2[(i - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) (24338 - android.graphics.Color.blue(0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1621, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.EM, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            $10 = ($11 + 3) % 128;
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    final void e() {
        int i = O + 103;
        P = i % 128;
        if (i % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.d == null || this.x == com.facetec.sdk.cn.b.ID_SCAN) {
            return;
        }
        this.d.c(false);
        P = (O + 65) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        int i = P + 65;
        O = i % 128;
        if (i % 2 == 0) {
            g();
            this.d.c(z);
            this.f3471a = true;
        } else {
            g();
            this.d.c(z);
            this.f3471a = false;
        }
        int i2 = O + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        P = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
    }

    private void c(final boolean z) {
        int i = O + 61;
        P = i % 128;
        if (i % 2 != 0) {
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.d != null && this.x != com.facetec.sdk.cn.b.ID_SCAN) {
            c();
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cn.this.a(z);
                }
            });
            O = (P + 27) % 128;
        } else {
            int i2 = O + 111;
            P = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 30 / 0;
            }
        }
    }

    final void c() {
        com.facetec.sdk.z zVar = this.d;
        if (zVar != null) {
            O = (P + 57) % 128;
            if (zVar.d()) {
                this.d.a(this.f3471a, new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.cn.this.E();
                    }
                });
                P = (O + 19) % 128;
            }
        }
    }

    final void b() {
        int i = O + 49;
        P = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.facetec.sdk.z zVar = this.d;
        if (zVar == null) {
            return;
        }
        zVar.c();
        P = (O + 103) % 128;
    }

    final void g() {
        com.facetec.sdk.z zVar = this.d;
        if (zVar != null) {
            int i = O + 43;
            P = i % 128;
            if (i % 2 == 0) {
                zVar.h();
                P = (O + 95) % 128;
            } else {
                zVar.h();
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    static void h() {
        int i = P + 63;
        O = i % 128;
        if (i % 2 == 0) {
            e = java.util.UUID.randomUUID().toString();
            int i2 = 2 / 0;
        } else {
            e = java.util.UUID.randomUUID().toString();
        }
        O = (P + 113) % 128;
    }

    final void d(com.facetec.sdk.cn.d dVar) {
        synchronized (this) {
            this.j.add(new java.lang.ref.WeakReference<>(dVar));
            P = (O + 111) % 128;
        }
    }

    final void c(com.facetec.sdk.cn.e eVar) {
        synchronized (this) {
            this.i.add(new java.lang.ref.WeakReference<>(eVar));
            int i = O + 93;
            P = i % 128;
            if (i % 2 != 0) {
                int i2 = 92 / 0;
            }
        }
    }

    final void a(com.facetec.sdk.cn.c cVar) {
        synchronized (this) {
            this.g.add(new java.lang.ref.WeakReference<>(cVar));
            P = (O + 115) % 128;
        }
    }

    final void e(com.facetec.sdk.cn.d dVar) {
        synchronized (this) {
            O = (P + 15) % 128;
            d(dVar, this.j);
            P = (O + 103) % 128;
        }
    }

    final void b(com.facetec.sdk.cn.e eVar) {
        synchronized (this) {
            int i = O + 73;
            P = i % 128;
            if (i % 2 == 0) {
                d(eVar, this.i);
            } else {
                d(eVar, this.i);
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    final void b(com.facetec.sdk.cn.c cVar) {
        synchronized (this) {
            int i = P + 83;
            O = i % 128;
            if (i % 2 == 0) {
                d(cVar, this.g);
                int i2 = 87 / 0;
            } else {
                d(cVar, this.g);
            }
        }
    }

    private <T> void d(T t, java.util.ArrayList<java.lang.ref.WeakReference<T>> arrayList) {
        java.util.Iterator<java.lang.ref.WeakReference<T>> it;
        synchronized (this) {
            int i = O + 97;
            P = i % 128;
            if (i % 2 != 0) {
                it = arrayList.iterator();
                int i2 = 59 / 0;
            } else {
                it = arrayList.iterator();
            }
            while (it.hasNext()) {
                int i3 = P + 19;
                O = i3 % 128;
                if (i3 % 2 == 0) {
                    it.next().get();
                    java.lang.Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (it.next().get() == t) {
                    it.remove();
                    int i4 = P + 101;
                    O = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 / 4;
                    }
                }
            }
        }
    }

    final java.lang.Object j$56fe9f7() {
        java.lang.Object obj;
        int i = O;
        int i2 = i + 33;
        P = i2 % 128;
        if (i2 % 2 != 0) {
            obj = this.y;
            int i3 = 10 / 0;
        } else {
            obj = this.y;
        }
        P = (i + 93) % 128;
        return obj;
    }

    private boolean w() {
        boolean z;
        synchronized (this.w) {
            z = (this.x == com.facetec.sdk.cn.b.PRE_SESSION || this.x == com.facetec.sdk.cn.b.PROCESSING || this.x == com.facetec.sdk.cn.b.ID_SCAN) && !this.H;
        }
        return z;
    }

    private static void x() {
        synchronized (com.facetec.sdk.cn.class) {
            int i = P + 101;
            O = i % 128;
            if (i % 2 == 0) {
                b = java.util.UUID.randomUUID().toString();
                int i2 = 97 / 0;
            } else {
                b = java.util.UUID.randomUUID().toString();
            }
            int i3 = P + 113;
            O = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    private static void e(android.content.Context context) {
        P = (O + 125) % 128;
        com.facetec.sdk.cq.J(com.facetec.sdk.as.an, com.facetec.sdk.FaceTecSDK.b);
        com.facetec.sdk.cq.J(com.facetec.sdk.as.ap, com.facetec.sdk.FaceTecSDK.h);
        com.facetec.sdk.cq.J(com.facetec.sdk.as.aq, com.facetec.sdk.FaceTecSDK.j);
        com.facetec.sdk.cq.Q(b);
        int d2 = com.facetec.sdk.oz.d();
        int d3 = com.facetec.sdk.oz.d();
        int d4 = com.facetec.sdk.oz.d();
        com.facetec.sdk.cq.S((java.lang.String) com.facetec.sdk.ax.b(com.facetec.sdk.oz.d(), 1391125088, d2, d3, d4, new java.lang.Object[0], -1391125088));
        com.facetec.sdk.cq.P(com.facetec.sdk.ax.d(context));
        com.facetec.sdk.by.e();
        com.facetec.sdk.cq.L(com.facetec.sdk.as.ae, ((android.os.PowerManager) context.getSystemService("power")).isPowerSaveMode());
        int i = O + 113;
        P = i % 128;
        if (i % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: com.facetec.sdk.cn$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3474a;

        static {
            int[] iArr = new int[com.facetec.sdk.cn.b.values().length];
            f3474a = iArr;
            try {
                iArr[com.facetec.sdk.cn.b.NOT_STARTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f3474a[com.facetec.sdk.cn.b.FINISHED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f3474a[com.facetec.sdk.cn.b.WAITING_TO_FINISH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f3474a[com.facetec.sdk.cn.b.PRE_SESSION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f3474a[com.facetec.sdk.cn.b.PROCESSING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        java.lang.Object[] objArr;
        O = (P + 65) % 128;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char indexOf = (char) (1536 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            int touchSlop = android.view.ViewConfiguration.getTouchSlop();
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ad(b2, b3, (byte) (b3 + 1), objArr2);
            d2 = com.facetec.sdk.al.c(indexOf, 708 - (longPressTimeout >> 16), (touchSlop >> 8) + 22, 936091891, false, (java.lang.String) objArr2[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.View.combineMeasuredStates(0, 0), objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (64381 - android.view.View.resolveSize(0, 0)), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", android.os.Process.getGidForName("") + 1293611999, objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char c2 = (char) (1537 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
            int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ad(b4, b5, (byte) (b5 + 1), objArr5);
            d3 = com.facetec.sdk.al.c(c2, (scrollDefaultDelay >> 16) + 708, 22 - (scrollBarSize >> 8), 939112562, false, (java.lang.String) objArr5[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char axisFromString = (char) (android.view.MotionEvent.axisFromString("") + 1538);
                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 4);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                ad(b6, b7, (byte) (b7 + 1), objArr6);
                d4 = com.facetec.sdk.al.c(axisFromString, 708 - (keyRepeatTimeout >> 16), 22 - (tapTimeout >> 16), 934179829, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (java.lang.String[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}};
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = (((((~(684080588 | identityHashCode)) | (-1054752733)) | (~(911741532 | identityHashCode))) * (-744)) - 284861464) + (((~identityHashCode) | 541069388) * 744) + ((identityHashCode | 1054752732) * 744) + 1720500769;
            int i2 = (i << 13) ^ i;
            int i3 = i2 ^ (i2 >>> 17);
            ((int[]) objArr[0])[0] = i3 ^ (i3 << 5);
        } else {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 3397), "０ეﺹ䋉ஐ٭쌚憧揬츓話낱掠蓣ᒿꨯ", "穹袸䓁ᰍ", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47558), "䏄徼뉙\ued3c\ue39c겗\u2e77ॸ靄钻䝦䏓㾬軶\ud924Ꜧ", "거⭪옙油", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
            try {
                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr9[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, 1720500769};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char resolveOpacity = (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1537);
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 4);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    ad(b8, b9, (byte) (b9 + 1), objArr11);
                    d5 = com.facetec.sdk.al.c(resolveOpacity, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, indexOf2 + 23, -388840623, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr10);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char mode = (char) (android.view.View.MeasureSpec.getMode(0) + 1537);
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                    char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ad(b10, b11, (byte) (b11 + 1), objArr12);
                    d6 = com.facetec.sdk.al.c(mode, 708 - (edgeSlop >> 16), mirror - 26, 934179829, false, (java.lang.String) objArr12[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.getSize(0), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.View.resolveSize(0, 0), objArr13);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) (android.view.KeyEvent.keyCodeFromString("") + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1293611998, objArr14);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char c3 = (char) (1537 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int defaultSize = android.view.View.getDefaultSize(0, 0);
                        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        ad(b12, b13, (byte) (b13 + 1), objArr15);
                        d7 = com.facetec.sdk.al.c(c3, 708 - defaultSize, resolveSizeAndState + 22, 939112562, false, (java.lang.String) objArr15[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char resolveSizeAndState2 = (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 1537);
                        float minVolume = android.media.AudioTrack.getMinVolume();
                        int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                        byte b14 = (byte) ($$b & 3);
                        byte b15 = (byte) (-b14);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ad(b14, b15, (byte) (b15 + 1), objArr16);
                        d8 = com.facetec.sdk.al.c(resolveSizeAndState2, 708 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 22 - (tapTimeout2 >> 16), 936091891, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[3];
        int i4 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i5 = ((int[]) obj2)[0];
        if (i5 == i4) {
            int i6 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr17 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i7 = ~identityHashCode2;
            int i8 = i6 + (((~((-1553991669) | i7)) | (~((-41830453) | identityHashCode2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1921038848 + (((~(identityHashCode2 | (-1551894465))) | (~(i7 | (-39733249)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr17[0])[0] = i10 ^ (i10 << 5);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = (java.lang.String[]) objArr[2];
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                arrayList.add(str);
            }
        }
        int[] iArr = new int[i5];
        int i11 = i5 - 1;
        iArr[i11] = 1;
        android.widget.Toast.makeText((android.content.Context) null, iArr[((i5 * i11) % 2) - 1], 1).show();
        int i12 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) objArr[3])[0]}};
        int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        int i13 = ~freeMemory;
        int i14 = i12 + (((80055618 | i13) * (-192)) - 1243976152) + (((~((-976773822) | i13)) | 538992681) * (-384)) + (((~(freeMemory | (-538992682))) | (~(i13 | (-437781141))) | (~(1056829439 | freeMemory))) * 192);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr18[0])[0] = i16 ^ (i16 << 5);
        int i17 = O + 31;
        P = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 51 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        java.lang.Object[] objArr;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1538);
            int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
            int myTid = android.os.Process.myTid();
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ad(b2, b3, (byte) (b3 + 1), objArr2);
            d2 = com.facetec.sdk.al.c(lastIndexOf, resolveOpacity + 708, (myTid >> 22) + 22, 936091891, false, (java.lang.String) objArr2[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) android.view.View.combineMeasuredStates(0, 0), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.os.Process.getGidForName("") + 1, objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.indexOf("", "") + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1293611998, objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char axisFromString = (char) (android.view.MotionEvent.axisFromString("") + 1538);
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ad(b4, b5, (byte) (b5 + 1), objArr5);
            d3 = com.facetec.sdk.al.c(axisFromString, packedPositionGroup + 708, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 22, 939112562, false, (java.lang.String) objArr5[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char packedPositionType = (char) (1537 - android.widget.ExpandableListView.getPackedPositionType(0L));
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 4);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                ad(b6, b7, (byte) (b7 + 1), objArr6);
                d4 = com.facetec.sdk.al.c(packedPositionType, makeMeasureSpec + 708, argb + 22, 934179829, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (java.lang.String[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}};
            int i = ~((~java.lang.System.identityHashCode(this)) | 580398563);
            int i2 = ((((35130786 | i) * (-970)) + 684179890) + ((i | 545267777) * 970)) - 1175335921;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3396), "０ეﺹ䋉ஐ٭쌚憧揬츓話낱掠蓣ᒿꨯ", "穹袸䓁ᰍ", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (android.graphics.Color.argb(0, 0, 0, 0) + 47558), "䏄徼뉙\ued3c\ue39c겗\u2e77ॸ靄钻䝦䏓㾬軶\ud924Ꜧ", "거⭪옙油", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr9);
            try {
                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr9[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -1175335921};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char c2 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1537);
                    int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                    int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 4);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    ad(b8, b9, (byte) (b9 + 1), objArr11);
                    d5 = com.facetec.sdk.al.c(c2, indexOf + 708, trimmedLength + 22, -388840623, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr10);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char touchSlop = (char) (1537 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ad(b10, b11, (byte) (b11 + 1), objArr12);
                    d6 = com.facetec.sdk.al.c(touchSlop, rgb + 16777924, 23 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 934179829, false, (java.lang.String) objArr12[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.View.MeasureSpec.getMode(0), objArr13);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) (64381 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", 1293611999 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr14);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char maxKeyCode = (char) (1537 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        int alpha = android.graphics.Color.alpha(0);
                        int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        ad(b12, b13, (byte) (b13 + 1), objArr15);
                        d7 = com.facetec.sdk.al.c(maxKeyCode, alpha + 708, 22 - (maximumDrawingCacheSize >> 24), 939112562, false, (java.lang.String) objArr15[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char blue = (char) (1537 - android.graphics.Color.blue(0));
                        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                        int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                        byte b14 = (byte) ($$b & 3);
                        byte b15 = (byte) (-b14);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ad(b14, b15, (byte) (b15 + 1), objArr16);
                        d8 = com.facetec.sdk.al.c(blue, (longPressTimeout >> 16) + 708, 22 - (maximumDrawingCacheSize2 >> 24), 936091891, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    O = (P + 61) % 128;
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[3];
        int i5 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i6 = ((int[]) obj2)[0];
        if (i6 == i5) {
            int i7 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr17 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
            int i8 = (~((-822731302) | elapsedRealtime)) | 536896001;
            int i9 = i7 + (i8 * 992) + 342033064 + ((i8 | (~((~elapsedRealtime) | 1058926119))) * (-496)) + ((elapsedRealtime | 773090819) * 496);
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr17[0])[0] = i11 ^ (i11 << 5);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = (java.lang.String[]) objArr[2];
        if (strArr != null) {
            O = (P + 115) % 128;
            int i12 = 0;
            while (i12 < strArr.length) {
                arrayList.add(strArr[i12]);
                i12++;
                int i13 = P + 89;
                O = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 2 / 5;
                }
            }
        }
        int[] iArr = new int[i6];
        int i15 = i6 - 1;
        iArr[i15] = 1;
        android.widget.Toast.makeText((android.content.Context) null, iArr[((i6 * i15) % 2) - 1], 1).show();
        int i16 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) objArr[3])[0]}};
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i17 = ~identityHashCode;
        int i18 = i16 + (((1091088 | i17) * (-192)) - 1243976152) + (((~((-1049319824) | i17)) | 545411209) * (-384)) + (((~(identityHashCode | (-545411210))) | (~(i17 | (-503908615))) | (~(1050410911 | identityHashCode))) * 192);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[0])[0] = i20 ^ (i20 << 5);
    }

    private static /* synthetic */ java.lang.Object g(java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) objArr[0];
        P = (O + 27) % 128;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char longPressTimeout = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1537);
            int mode = android.view.View.MeasureSpec.getMode(0);
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            ad(b2, b3, (byte) (b3 + 1), objArr3);
            d2 = com.facetec.sdk.al.c(longPressTimeout, 708 - mode, (keyRepeatDelay >> 16) + 22, 936091891, false, (java.lang.String) objArr3[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr4);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getMode(0) + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1293611999, objArr5);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char scrollBarSize = (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1537);
            int myTid = android.os.Process.myTid();
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            ad(b4, b5, (byte) (b5 + 1), objArr6);
            d3 = com.facetec.sdk.al.c(scrollBarSize, (myTid >> 22) + 708, 22 - absoluteGravity, 939112562, false, (java.lang.String) objArr6[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            P = (O + 51) % 128;
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char c2 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1536);
                int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                int defaultSize = android.view.View.getDefaultSize(0, 0);
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 4);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                ad(b6, b7, (byte) (b7 + 1), objArr7);
                d4 = com.facetec.sdk.al.c(c2, 708 - (scrollBarSize2 >> 8), 22 - defaultSize, 934179829, false, (java.lang.String) objArr7[0], null);
            }
            java.lang.Object[] objArr8 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr2 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (java.lang.String[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}};
            int myPid = android.os.Process.myPid();
            int i = ~myPid;
            int i2 = (((~((-1016478533) | i)) | 579343588) * 226) + 1656548992 + (((~(i | (-471214849))) | (~((-579343589) | myPid)) | 34079904) * (-113)) + ((~(myPid | (-1016478533))) * 113) + 1954464965;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr2[0])[0] = i4 ^ (i4 << 5);
        } else {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 3396), "０ეﺹ䋉ஐ٭쌚憧揬츓話낱掠蓣ᒿꨯ", "穹袸䓁ᰍ", android.view.KeyEvent.keyCodeFromString(""), objArr9);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (android.view.View.MeasureSpec.getMode(0) + 47558), "䏄徼뉙\ued3c\ue39c겗\u2e77ॸ靄钻䝦䏓㾬軶\ud924Ꜧ", "거⭪옙油", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10);
            try {
                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr10[0], java.lang.Object.class).invoke(null, cnVar)).intValue()), 0, 1954464965};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char lastIndexOf = (char) (1536 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                    int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
                    int indexOf2 = android.text.TextUtils.indexOf("", "", 0);
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ad(b8, b9, (byte) (b9 + 1), objArr12);
                    d5 = com.facetec.sdk.al.c(lastIndexOf, indexOf + 708, indexOf2 + 22, -388840623, false, (java.lang.String) objArr12[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr11);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char c3 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1538);
                    int red = android.graphics.Color.red(0);
                    float maxVolume = android.media.AudioTrack.getMaxVolume();
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 4);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ad(b10, b11, (byte) (b11 + 1), objArr13);
                    d6 = com.facetec.sdk.al.c(c3, 708 - red, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 21, 934179829, false, (java.lang.String) objArr13[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr2);
                try {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.indexOf("", "", 0, 0), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.Gravity.getAbsoluteGravity(0, 0), objArr14);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", 1293611998 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr15[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char resolveSizeAndState = (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 1537);
                        int argb = android.graphics.Color.argb(0, 0, 0, 0);
                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ad(b12, b13, (byte) (b13 + 1), objArr16);
                        d7 = com.facetec.sdk.al.c(resolveSizeAndState, argb + 708, 22 - packedPositionGroup, 939112562, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char blue = (char) (1537 - android.graphics.Color.blue(0));
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                        byte b14 = (byte) ($$b & 3);
                        byte b15 = (byte) (-b14);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        ad(b14, b15, (byte) (b15 + 1), objArr17);
                        d8 = com.facetec.sdk.al.c(blue, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 709, 21 - modifierMetaStateMask, 936091891, false, (java.lang.String) objArr17[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.lang.Object obj = objArr2[3];
        int i5 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr2[1];
        int i6 = ((int[]) obj2)[0];
        if (i6 == i5) {
            int i7 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr2[2], new int[]{((int[]) obj)[0]}};
            int nextInt = new java.util.Random().nextInt();
            int i8 = i7 + (((~((-555679810) | nextInt)) | (~((~nextInt) | 1040142311))) * (-318)) + 1612103140 + (((~(568280291 | nextInt)) | 471862020) * (-318)) + (((~(nextInt | (-568280292))) | (-1027541830)) * 318);
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr18[0])[0] = i10 ^ (i10 << 5);
            O = (P + 109) % 128;
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] strArr = (java.lang.String[]) objArr2[2];
        if (strArr != null) {
            int i11 = P + 91;
            O = i11 % 128;
            for (int i12 = i11 % 2 == 0 ? 1 : 0; i12 < strArr.length; i12++) {
                arrayList.add(strArr[i12]);
            }
        }
        android.widget.Toast.makeText((android.content.Context) null, i6 / (((i6 - 1) * i6) % 2), 0).show();
        int i13 = ((int[]) objArr2[0])[0];
        java.lang.Object[] objArr19 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (java.lang.String[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}};
        int nextInt2 = new java.util.Random().nextInt();
        int i14 = ~((-563226737) | (~nextInt2));
        int i15 = i13 + ((470550408 | i14 | (~(563226736 | nextInt2))) * (-338)) + 1728070072 + (((~(nextInt2 | 1033777144)) | i14) * 338);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr19[0])[0] = i17 ^ (i17 << 5);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        java.lang.Object[] objArr;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char maxKeyCode = (char) (1537 - (android.view.KeyEvent.getMaxKeyCode() >> 16));
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ad(b2, b3, (byte) (b3 + 1), objArr2);
            d2 = com.facetec.sdk.al.c(maxKeyCode, (keyRepeatDelay >> 16) + 708, lastIndexOf + 23, 936091891, false, (java.lang.String) objArr2[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", 1293611997 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char absoluteGravity = (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 1537);
            float minVolume = android.media.AudioTrack.getMinVolume();
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ad(b4, b5, (byte) (b5 + 1), objArr5);
            d3 = com.facetec.sdk.al.c(absoluteGravity, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 708, 23 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 939112562, false, (java.lang.String) objArr5[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char indexOf = (char) (1537 - android.text.TextUtils.indexOf("", "", 0, 0));
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 4);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                ad(b6, b7, (byte) (b7 + 1), objArr6);
                d4 = com.facetec.sdk.al.c(indexOf, 708 - capsMode, 21 - indexOf2, 934179829, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (java.lang.String[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}};
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i = (((((~(identityHashCode | 965571791)) | 630250329) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1217712113) + (((~((~identityHashCode) | 965571791)) | 68193040) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)) - 1116109486;
            int i2 = (i << 13) ^ i;
            int i3 = i2 ^ (i2 >>> 17);
            ((int[]) objArr[0])[0] = i3 ^ (i3 << 5);
        } else {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (3395 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "０ეﺹ䋉ஐ٭쌚憧揬츓話낱掠蓣ᒿꨯ", "穹袸䓁ᰍ", android.view.View.MeasureSpec.getMode(0), objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (47557 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "䏄徼뉙\ued3c\ue39c겗\u2e77ॸ靄钻䝦䏓㾬軶\ud924Ꜧ", "거⭪옙油", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0', objArr9);
            try {
                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr9[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -1116109486};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char c2 = (char) (1537 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 4);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    ad(b8, b9, (byte) (b9 + 1), objArr11);
                    d5 = com.facetec.sdk.al.c(c2, (jumpTapTimeout >> 16) + 708, rgb + 16777238, -388840623, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr10);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char c3 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1537);
                    int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ad(b10, b11, (byte) (b11 + 1), objArr12);
                    d6 = com.facetec.sdk.al.c(c3, (touchSlop >> 8) + 708, (maximumFlingVelocity >> 16) + 22, 934179829, false, (java.lang.String) objArr12[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr13);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", 1293611998 - android.view.View.combineMeasuredStates(0, 0), objArr14);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char offsetBefore = (char) (1537 - android.text.TextUtils.getOffsetBefore("", 0));
                        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                        int indexOf3 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        ad(b12, b13, (byte) (b13 + 1), objArr15);
                        d7 = com.facetec.sdk.al.c(offsetBefore, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 21 - indexOf3, 939112562, false, (java.lang.String) objArr15[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char mode = (char) (1537 - android.view.View.MeasureSpec.getMode(0));
                        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                        int axisFromString = android.view.MotionEvent.axisFromString("");
                        byte b14 = (byte) ($$b & 3);
                        byte b15 = (byte) (-b14);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ad(b14, b15, (byte) (b15 + 1), objArr16);
                        d8 = com.facetec.sdk.al.c(mode, 709 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 21 - axisFromString, 936091891, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[3];
        int i4 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i5 = ((int[]) obj2)[0];
        if (i5 != i4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr[2];
            if (strArr != null) {
                P = (O + 95) % 128;
                for (java.lang.String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new java.lang.RuntimeException(java.lang.String.valueOf(i5));
        }
        P = (O + 65) % 128;
        int i6 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr17 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i7 = i6 + (((~((-869301816) | identityHashCode2)) | (-1004404728)) * (-502)) + 257696108 + ((~((~identityHashCode2) | (-277884423))) * (-502)) + (((~(identityHashCode2 | (-726520306))) | (-869301816)) * 502);
        int i8 = (i7 << 13) ^ i7;
        int i9 = i8 ^ (i8 >>> 17);
        ((int[]) objArr17[0])[0] = i9 ^ (i9 << 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        java.lang.Object[] objArr;
        java.lang.Object d2 = com.facetec.sdk.al.d(-1876633077);
        if (d2 == null) {
            char c2 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1536);
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            float complexToFloat = android.util.TypedValue.complexToFloat(0);
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ad(b2, b3, (byte) (b3 + 1), objArr2);
            d2 = com.facetec.sdk.al.c(c2, 707 - lastIndexOf, 22 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 936091891, false, (java.lang.String) objArr2[0], null);
        }
        long j = ((java.lang.reflect.Field) d2).getLong(null);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) (android.os.Process.myPid() >> 22), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr3);
        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ae("\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64381), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1293611999, objArr4);
        long longValue = ((java.lang.Long) cls.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-1877556598);
        if (d3 == null) {
            char offsetBefore = (char) (1537 - android.text.TextUtils.getOffsetBefore("", 0));
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
            byte b4 = (byte) 0;
            byte b5 = (byte) (b4 - 1);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ad(b4, b5, (byte) (b5 + 1), objArr5);
            d3 = com.facetec.sdk.al.c(offsetBefore, 708 - (maxKeyCode >> 16), 22 - trimmedLength, 939112562, false, (java.lang.String) objArr5[0], null);
        }
        if (j == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d4 = com.facetec.sdk.al.d(-1874786035);
            if (d4 == null) {
                char c3 = (char) (1537 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                float complexToFloat2 = android.util.TypedValue.complexToFloat(0);
                byte b6 = (byte) 3;
                byte b7 = (byte) (b6 - 4);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                ad(b6, b7, (byte) (b7 + 1), objArr6);
                d4 = com.facetec.sdk.al.c(c3, packedPositionType + 708, (complexToFloat2 > 0.0f ? 1 : (complexToFloat2 == 0.0f ? 0 : -1)) + 22, 934179829, false, (java.lang.String) objArr6[0], null);
            }
            java.lang.Object[] objArr7 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (java.lang.String[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}};
            int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
            int i = (((-268436097) | maxMemory) * (-381)) + 1203934684 + (((~((~maxMemory) | 1327222134)) | (-1595494341)) * 381) + 2082550398;
            int i2 = (i << 13) ^ i;
            int i3 = i2 ^ (i2 >>> 17);
            ((int[]) objArr[0])[0] = i3 ^ (i3 << 5);
        } else {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (3396 - android.view.View.resolveSizeAndState(0, 0, 0)), "０ეﺹ䋉ஐ٭쌚憧揬츓話낱掠蓣ᒿꨯ", "穹袸䓁ᰍ", android.text.TextUtils.indexOf("", "", 0), objArr8);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ae("\u0000\u0000\u0000\u0000", (char) (47559 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "䏄徼뉙\ued3c\ue39c겗\u2e77ॸ靄钻䝦䏓㾬軶\ud924Ꜧ", "거⭪옙油", android.view.Gravity.getAbsoluteGravity(0, 0), objArr9);
            try {
                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(((java.lang.Integer) cls2.getMethod((java.lang.String) objArr9[0], java.lang.Object.class).invoke(null, this)).intValue()), 0, -1407354370};
                java.lang.Object d5 = com.facetec.sdk.al.d(1329445289);
                if (d5 == null) {
                    char offsetAfter = (char) (android.text.TextUtils.getOffsetAfter("", 0) + 1537);
                    long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                    float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                    byte b8 = (byte) 3;
                    byte b9 = (byte) (b8 - 4);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    ad(b8, b9, (byte) (b9 + 1), objArr11);
                    d5 = com.facetec.sdk.al.c(offsetAfter, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 709, (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 22, -388840623, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                objArr = (java.lang.Object[]) ((java.lang.reflect.Method) d5).invoke(null, objArr10);
                java.lang.Object d6 = com.facetec.sdk.al.d(-1874786035);
                if (d6 == null) {
                    char packedPositionChild = (char) (1536 - android.widget.ExpandableListView.getPackedPositionChild(0L));
                    int red = android.graphics.Color.red(0);
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 4);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ad(b10, b11, (byte) (b11 + 1), objArr12);
                    d6 = com.facetec.sdk.al.c(packedPositionChild, red + 708, 21 - indexOf, 934179829, false, (java.lang.String) objArr12[0], null);
                }
                ((java.lang.reflect.Field) d6).set(null, objArr);
                try {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), "缓Ꮃ₦욮⨆시妋க\uecad㍥퉿羫蛈촨놵ἤ퇰䃧皑⟔栝룿", "⻖\ufdd5ᛐ摝", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr13);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    ae("\u0000\u0000\u0000\u0000", (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 64333), "ᔟፐ훼\uf8ed똃벊\ue8a2㑛\u0012剌絛ⲛ⊗곏霍", "\ude81\u1af3絍ꟻ", 1293611998 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr14);
                    long longValue2 = ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d7 = com.facetec.sdk.al.d(-1877556598);
                    if (d7 == null) {
                        char resolveOpacity = (char) (1537 - android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        ad(b12, b13, (byte) (b13 + 1), objArr15);
                        d7 = com.facetec.sdk.al.c(resolveOpacity, 708 - (doubleTapTimeout >> 16), 22 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 939112562, false, (java.lang.String) objArr15[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d8 = com.facetec.sdk.al.d(-1876633077);
                    if (d8 == null) {
                        char minimumFlingVelocity = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1537);
                        long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        int myPid = android.os.Process.myPid();
                        byte b14 = (byte) ($$b & 3);
                        byte b15 = (byte) (-b14);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ad(b14, b15, (byte) (b15 + 1), objArr16);
                        d8 = com.facetec.sdk.al.c(minimumFlingVelocity, 707 - (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)), 22 - (myPid >> 22), 936091891, false, (java.lang.String) objArr16[0], null);
                    }
                    ((java.lang.reflect.Field) d8).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                } catch (java.lang.Exception unused) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.Object obj = objArr[3];
        int i4 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr[1];
        int i5 = ((int[]) obj2)[0];
        if (i5 != i4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr[2];
            if (strArr != null) {
                int i6 = O + 9;
                P = i6 % 128;
                for (int i7 = i6 % 2 != 0 ? 1 : 0; i7 < strArr.length; i7++) {
                    O = (P + 77) % 128;
                    arrayList.add(strArr[i7]);
                }
            }
            int[] iArr = new int[i5];
            int i8 = i5 - 1;
            iArr[i8] = 1;
            android.widget.Toast.makeText((android.content.Context) null, iArr[((i5 * i8) % 2) - 1], 1).show();
            int i9 = ((int[]) objArr[0])[0];
            java.lang.Object[] objArr17 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) objArr[3])[0]}};
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i10 = ~identityHashCode;
            int i11 = (~((-692042960) | i10)) | 136391814 | (~(903779161 | i10));
            int i12 = i9 + (((~(identityHashCode | (-348128017))) | i11) * 590) + 1225514524 + (i11 * (-1180)) + (((~(i10 | 692042959)) | (~((-903779162) | i10))) * 590);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr17[0])[0] = i14 ^ (i14 << 5);
            return;
        }
        P = (O + 65) % 128;
        int i15 = ((int[]) objArr[0])[0];
        java.lang.Object[] objArr18 = {new int[1], new int[]{((int[]) obj2)[0]}, (java.lang.String[]) objArr[2], new int[]{((int[]) obj)[0]}};
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i16 = i15 + ((((~((-869038632) | r2)) | (~((-726783490) | identityHashCode2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) - 703016143) + (((~(identityHashCode2 | (-869038632))) | 591417857) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (((~((-726783490) | (~identityHashCode2))) | 869038631) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE);
        int i17 = (i16 << 13) ^ i16;
        int i18 = i17 ^ (i17 >>> 17);
        ((int[]) objArr18[0])[0] = i18 ^ (i18 << 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean e(final android.content.Context context, java.lang.String str) {
        synchronized (this) {
            this.v = 0;
            int[] iArr = com.facetec.sdk.cn.AnonymousClass5.f3474a;
            com.facetec.sdk.cn.b bVar = this.x;
            try {
                byte[] bArr = T;
                java.lang.Object[] objArr = new java.lang.Object[1];
                ag(bArr[21], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, bArr[121], objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                short s = bArr[9];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                ag(s, (short) (s | com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor), (byte) 67, objArr2);
                int i = iArr[((java.lang.Integer) cls.getMethod((java.lang.String) objArr2[0], null).invoke(bVar, null)).intValue()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (com.facetec.sdk.ai.f3384a) {
                            com.facetec.sdk.cq.d(true);
                            com.facetec.sdk.cq.e(str);
                        }
                        this.x = com.facetec.sdk.cn.b.PROCESSING;
                    } else if (i != 4) {
                    }
                    synchronized (this.D) {
                        B();
                        com.facetec.sdk.dg dgVar = (com.facetec.sdk.dg) b(new java.lang.Object[]{this}, -948509798, 948509807, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
                        this.B = dgVar;
                        java.util.Timer timer = this.D;
                        try {
                            java.lang.Object[] objArr3 = {dgVar, 60L, 10000L};
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            ag(bArr[1173], (short) 116, bArr[121], objArr4);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            ag(bArr[178], (short) 102, bArr[169], objArr5);
                            java.lang.String str2 = (java.lang.String) objArr5[0];
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            ag(bArr[178], (short) 84, bArr[121], objArr6);
                            cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0]), java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(timer, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    e(context);
                    return true;
                }
                if (!com.facetec.sdk.cq.e(str)) {
                    return false;
                }
                this.x = com.facetec.sdk.cn.b.PROCESSING;
                a(context);
                com.facetec.sdk.eb.e();
                if (this.A) {
                    com.facetec.sdk.k.c();
                }
                com.facetec.sdk.k.e();
                com.facetec.sdk.k.b();
                com.facetec.sdk.cq.H(com.facetec.sdk.as.T, ((java.lang.Integer) com.facetec.sdk.bj.e(new java.lang.Object[]{context}, 922074868, -922074866, com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c(), com.facetec.sdk.ft.c())).intValue());
                if (com.facetec.sdk.d.a()) {
                    com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda18
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.cn.c(context);
                        }
                    });
                }
                com.facetec.sdk.cq.M(com.facetec.sdk.as.aa, com.facetec.sdk.bd.h);
                com.facetec.sdk.cq.J(com.facetec.sdk.as.aa, com.facetec.sdk.bd.h ? 1 : 0);
                com.facetec.sdk.cq.J(com.facetec.sdk.as.x, com.facetec.sdk.k.f3633a);
                java.lang.String str3 = com.facetec.sdk.as.w;
                short s2 = bArr[157];
                short s3 = (short) (V - 3);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                ag(s2, s3, bArr[174], objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                short s4 = bArr[9];
                short s5 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                ag(s4, s5, (byte) (bArr[185] + 1), objArr8);
                com.facetec.sdk.cq.H(str3, cls3.getField((java.lang.String) objArr8[0]).getInt(null));
                java.lang.String str4 = com.facetec.sdk.as.w;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                ag(bArr[157], s3, bArr[174], objArr9);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                ag(bArr[9], s5, (byte) (bArr[185] + 1), objArr10);
                com.facetec.sdk.cq.J(str4, cls4.getField((java.lang.String) objArr10[0]).getInt(null));
                com.facetec.sdk.k.j();
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda19
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.cn.this.b(context);
                    }
                });
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                ag(bArr[157], s3, bArr[174], objArr11);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                ag(bArr[9], s5, (byte) (bArr[185] + 1), objArr12);
                if (cls5.getField((java.lang.String) objArr12[0]).getInt(null) >= 23) {
                    com.facetec.sdk.dk.b(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.cn.d(context);
                        }
                    });
                }
                com.facetec.sdk.k.i();
                com.facetec.sdk.k.g();
                com.facetec.sdk.k.a();
                com.facetec.sdk.k.f();
                synchronized (this.D) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(android.content.Context context) {
        P = (O + 75) % 128;
        com.facetec.sdk.k.e(context);
        P = (O + 93) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(android.content.Context context) {
        if (this.A) {
            int i = P + 25;
            O = i % 128;
            if (i % 2 != 0) {
                com.facetec.sdk.k.a(context);
                int i2 = P + 47;
                O = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 / 2;
                    return;
                }
                return;
            }
            com.facetec.sdk.k.a(context);
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    final void d(android.content.Context context, boolean z, java.lang.String str) {
        synchronized (this) {
            this.v = 0;
            com.facetec.sdk.dk.e(A());
            int[] iArr = com.facetec.sdk.cn.AnonymousClass5.f3474a;
            com.facetec.sdk.cn.b bVar = this.x;
            try {
                byte[] bArr = T;
                java.lang.Object[] objArr = new java.lang.Object[1];
                ag(bArr[21], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, bArr[121], objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                short s = bArr[9];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                ag(s, (short) (s | com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor), (byte) 67, objArr2);
                int i = iArr[((java.lang.Integer) cls.getMethod((java.lang.String) objArr2[0], null).invoke(bVar, null)).intValue()];
                if (i == 1 || i == 2) {
                    if (!com.facetec.sdk.cq.f(z, str)) {
                        return;
                    } else {
                        this.x = com.facetec.sdk.cn.b.ID_SCAN;
                    }
                } else {
                    if (i == 3 || i == 4) {
                        return;
                    }
                    if (i == 5) {
                        return;
                    }
                }
                synchronized (this.D) {
                    B();
                    com.facetec.sdk.dg dgVar = (com.facetec.sdk.dg) b(new java.lang.Object[]{this}, -948509798, 948509807, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
                    this.B = dgVar;
                    java.util.Timer timer = this.D;
                    try {
                        java.lang.Object[] objArr3 = {dgVar, 60L, 10000L};
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        ag(bArr[1173], (short) 116, bArr[121], objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        ag(bArr[178], (short) 102, bArr[169], objArr5);
                        java.lang.String str2 = (java.lang.String) objArr5[0];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        ag(bArr[178], (short) 84, bArr[121], objArr6);
                        cls2.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0]), java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(timer, objArr3);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                e(context);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    private static /* synthetic */ java.lang.Object h(java.lang.Object[] objArr) {
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference((com.facetec.sdk.cn) objArr[0]);
        com.facetec.sdk.dg dgVar = new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.cn.c(weakReference);
            }
        });
        int i = P + 91;
        O = i % 128;
        if (i % 2 != 0) {
            return dgVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(java.lang.ref.WeakReference weakReference) {
        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) weakReference.get();
        if (cnVar != null) {
            P = (O + 71) % 128;
            cnVar.N();
            P = (O + 125) % 128;
        }
    }

    private void B() {
        synchronized (this.D) {
            this.C = null;
            java.util.TimerTask timerTask = this.B;
            if (timerTask != null) {
                timerTask.cancel();
                this.B = null;
            }
        }
    }

    private static void G() {
        int i = P + 81;
        O = i % 128;
        if (i % 2 != 0) {
            com.facetec.sdk.k.d();
            return;
        }
        com.facetec.sdk.k.d();
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        com.facetec.sdk.cn.O = (com.facetec.sdk.cn.P + 67) % 128;
        com.facetec.sdk.cq.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (com.facetec.sdk.cd.d(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (com.facetec.sdk.cd.d(r3) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(android.content.Context context) {
        int i = P + 1;
        O = i % 128;
        if (i % 2 == 0) {
            int i2 = 55 / 0;
        }
        if (this.A) {
            com.facetec.sdk.cq.B();
        }
    }

    final void i() {
        boolean z;
        synchronized (this) {
            com.facetec.sdk.dk.e(A());
            synchronized (this.w) {
                if (this.x != com.facetec.sdk.cn.b.PRE_SESSION && this.x != com.facetec.sdk.cn.b.PROCESSING && this.x != com.facetec.sdk.cn.b.WAITING_TO_FINISH) {
                    z = false;
                }
                this.x = com.facetec.sdk.cn.b.FINISHED;
                z = true;
            }
            if (z) {
                com.facetec.sdk.cq.j(true);
            }
        }
    }

    final void f() {
        boolean z;
        synchronized (this) {
            com.facetec.sdk.dk.e(A());
            synchronized (this.w) {
                z = this.x == com.facetec.sdk.cn.b.ID_SCAN || this.x == com.facetec.sdk.cn.b.PRE_SESSION || this.x == com.facetec.sdk.cn.b.PROCESSING || this.x == com.facetec.sdk.cn.b.WAITING_TO_FINISH;
                this.x = com.facetec.sdk.cn.b.FINISHED;
            }
            if (z) {
                com.facetec.sdk.cq.g(false);
            }
        }
    }

    final void n() {
        synchronized (this) {
            synchronized (this.w) {
                if (this.x == com.facetec.sdk.cn.b.PROCESSING || this.x == com.facetec.sdk.cn.b.WAITING_TO_FINISH) {
                    this.x = com.facetec.sdk.cn.b.FINISHED;
                }
            }
            com.facetec.sdk.dk.e(A());
            B();
            c();
            G();
            this.i.clear();
            this.j.clear();
        }
    }

    final void e(boolean z) {
        boolean z2;
        synchronized (this) {
            synchronized (this.w) {
                z2 = this.x == com.facetec.sdk.cn.b.PROCESSING || this.x == com.facetec.sdk.cn.b.WAITING_TO_FINISH;
                this.x = com.facetec.sdk.cn.b.FINISHED;
            }
            com.facetec.sdk.dk.e(A());
            B();
            c();
            G();
            if (z2) {
                com.facetec.sdk.cq.d(z);
            }
        }
    }

    private static /* synthetic */ java.lang.Object c(java.lang.Object[] objArr) {
        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) objArr[0];
        synchronized (cnVar.w) {
            if (cnVar.x == com.facetec.sdk.cn.b.PRE_SESSION || cnVar.x == com.facetec.sdk.cn.b.PROCESSING || cnVar.x == com.facetec.sdk.cn.b.ID_SCAN) {
                cnVar.x = com.facetec.sdk.cn.b.WAITING_TO_FINISH;
            }
        }
        cnVar.B();
        java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.e>> arrayList = cnVar.i;
        try {
            byte[] bArr = T;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ag(bArr[145], (short) (bArr[1178] + 1), bArr[121], objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            short s = bArr[4];
            short s2 = (short) (s | 35);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            ag(s, s2, (byte) (s2 | 16), objArr3);
            cls.getMethod((java.lang.String) objArr3[0], null).invoke(arrayList, null);
            java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.d>> arrayList2 = cnVar.j;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            ag(bArr[145], (short) (bArr[1178] + 1), bArr[121], objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s3 = bArr[4];
            short s4 = (short) (s3 | 35);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ag(s3, s4, (byte) (s4 | 16), objArr5);
            cls2.getMethod((java.lang.String) objArr5[0], null).invoke(arrayList2, null);
            java.util.ArrayList<java.lang.ref.WeakReference<com.facetec.sdk.cn.c>> arrayList3 = cnVar.g;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            ag(bArr[145], (short) (bArr[1178] + 1), bArr[121], objArr6);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            short s5 = bArr[4];
            short s6 = (short) (s5 | 35);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            ag(s5, s6, (byte) (s6 | 16), objArr7);
            cls3.getMethod((java.lang.String) objArr7[0], null).invoke(arrayList3, null);
            java.util.concurrent.ExecutorService executorService = cnVar.h;
            short s7 = bArr[192];
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            ag(s7, s7, bArr[121], objArr8);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            ag(bArr[17], bArr[33], bArr[169], objArr9);
            cls4.getMethod((java.lang.String) objArr9[0], null).invoke(executorService, null);
            java.util.concurrent.ExecutorService executorService2 = cnVar.f3472o;
            short s8 = bArr[192];
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            ag(s8, s8, bArr[121], objArr10);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr10[0]);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            ag(bArr[17], bArr[33], bArr[169], objArr11);
            cls5.getMethod((java.lang.String) objArr11[0], null).invoke(executorService2, null);
            return null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static boolean k() {
        int i = P + 93;
        O = i % 128;
        if (i % 2 != 0) {
            return com.facetec.sdk.cq.U();
        }
        com.facetec.sdk.cq.U();
        throw null;
    }

    final com.facetec.sdk.cs o() {
        int i = O + 31;
        P = i % 128;
        if (i % 2 == 0) {
            int b2 = com.facetec.sdk.gj.AnonymousClass32.b();
            int b3 = com.facetec.sdk.gj.AnonymousClass32.b();
            com.facetec.sdk.cs csVar = (com.facetec.sdk.cs) com.facetec.sdk.cq.c(2081813785, -2081813784, com.facetec.sdk.gj.AnonymousClass32.b(), b2, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b3);
            this.q = csVar;
            return csVar;
        }
        int b4 = com.facetec.sdk.gj.AnonymousClass32.b();
        int b5 = com.facetec.sdk.gj.AnonymousClass32.b();
        this.q = (com.facetec.sdk.cs) com.facetec.sdk.cq.c(2081813785, -2081813784, com.facetec.sdk.gj.AnonymousClass32.b(), b4, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b5);
        throw null;
    }

    final com.facetec.sdk.ct m() {
        com.facetec.sdk.ct k;
        int i = P + 21;
        O = i % 128;
        if (i % 2 == 0) {
            k = com.facetec.sdk.cq.k();
            this.r = k;
            int i2 = 32 / 0;
        } else {
            k = com.facetec.sdk.cq.k();
            this.r = k;
        }
        int i3 = O + 71;
        P = i3 % 128;
        if (i3 % 2 == 0) {
            return k;
        }
        throw null;
    }

    final com.facetec.sdk.cl s() {
        int i = O + 45;
        P = i % 128;
        if (i % 2 != 0) {
            int b2 = com.facetec.sdk.gj.AnonymousClass32.b();
            int b3 = com.facetec.sdk.gj.AnonymousClass32.b();
            com.facetec.sdk.cl clVar = (com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b2, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b3);
            this.m = clVar;
            int i2 = 40 / 0;
            return clVar;
        }
        int b4 = com.facetec.sdk.gj.AnonymousClass32.b();
        int b5 = com.facetec.sdk.gj.AnonymousClass32.b();
        com.facetec.sdk.cl clVar2 = (com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b4, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b5);
        this.m = clVar2;
        return clVar2;
    }

    private void I() {
        P = (O + 15) % 128;
        b(new java.lang.Object[]{this}, -773064662, 773064665, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
        e(true);
        try {
            this.h.awaitTermination(2L, java.util.concurrent.TimeUnit.SECONDS);
            this.f3472o.awaitTermination(2L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
        }
        B();
        O = (P + 65) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (((java.lang.reflect.Field) r0).getInt(r10) > 25) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b$6962e6(final java.lang.Object obj, final int i) {
        this.y = obj;
        synchronized (this.D) {
            if (this.C == null) {
                this.C = new java.util.Date();
            }
        }
        if (!this.f3472o.isShutdown() && this.x != com.facetec.sdk.cn.b.ID_SCAN && this.d.b()) {
            java.lang.Object d2 = com.facetec.sdk.al.d(-1679792678);
            if (d2 == null) {
                d2 = com.facetec.sdk.al.c((char) (android.text.TextUtils.getTrimmedLength("") + 5486), android.view.ViewConfiguration.getFadingEdgeLength() >> 16, 25 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1007623970, false, "a", null);
            }
            if (((java.lang.reflect.Field) d2).getInt(obj) <= 25) {
                java.lang.Object d3 = com.facetec.sdk.al.d(-1676098594);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 5486), android.view.ViewConfiguration.getLongPressTimeout() >> 16, android.view.Gravity.getAbsoluteGravity(0, 0) + 24, 1006090534, false, "e", null);
                }
            }
            try {
                this.f3472o.execute(new java.lang.Runnable() { // from class: com.facetec.sdk.cn.4
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;

                    /* renamed from: a, reason: collision with root package name */
                    private static char[] f3473a;
                    private static long c;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static java.lang.String $$c(int i2, short s, short s2) {
                        int i3;
                        int i4;
                        int i5 = i2 * 3;
                        ?? r8 = 106 - s2;
                        byte[] bArr = $$a;
                        int i6 = (s * 3) + 4;
                        byte[] bArr2 = new byte[i5 + 1];
                        if (bArr == null) {
                            byte b2 = r8;
                            i3 = 0;
                            int i7 = i6;
                            int i8 = i7 + 1;
                            i4 = i6 + (-b2);
                            i6 = i8;
                            bArr2[i3] = (byte) i4;
                            if (i3 == i5) {
                                return new java.lang.String(bArr2, 0);
                            }
                            b2 = bArr[i6];
                            i3++;
                            int i9 = i4;
                            i7 = i6;
                            i6 = i9;
                            int i82 = i7 + 1;
                            i4 = i6 + (-b2);
                            i6 = i82;
                            bArr2[i3] = (byte) i4;
                            if (i3 == i5) {
                            }
                        } else {
                            i3 = 0;
                            i4 = r8;
                            bArr2[i3] = (byte) i4;
                            if (i3 == i5) {
                            }
                        }
                    }

                    static void init$0() {
                        $$a = new byte[]{34, com.visa.cbp.getEncExpo.registerForActivityResult, 8, 97};
                        $$b = 79;
                    }

                    private static void f(char c2, int i2, int i3, java.lang.Object[] objArr) {
                        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
                        long[] jArr = new long[i3];
                        hhVar.e = 0;
                        while (hhVar.e < i3) {
                            int i4 = hhVar.e;
                            try {
                                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(f3473a[i2 + i4])};
                                java.lang.Object d4 = com.facetec.sdk.al.d(-719238807);
                                if (d4 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 45150), 2151 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 1926116241, false, $$c(b2, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(c), java.lang.Integer.valueOf(c2)};
                                java.lang.Object d5 = com.facetec.sdk.al.d(671690243);
                                if (d5 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    d5 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1833 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.rgb(0, 0, 0) + 16777240, -1880730373, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                                }
                                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d5).invoke(null, objArr3)).longValue();
                                java.lang.Object[] objArr4 = {hhVar, hhVar};
                                java.lang.Object d6 = com.facetec.sdk.al.d(898558648);
                                if (d6 == null) {
                                    byte b6 = (byte) 0;
                                    d6 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", ""), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2340, android.view.View.MeasureSpec.getSize(0) + 24, -1839099840, false, $$c(b6, b6, (byte) $$a.length), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((java.lang.reflect.Method) d6).invoke(null, objArr4);
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr = new char[i3];
                        hhVar.e = 0;
                        while (hhVar.e < i3) {
                            cArr[hhVar.e] = (char) jArr[hhVar.e];
                            java.lang.Object[] objArr5 = {hhVar, hhVar};
                            java.lang.Object d7 = com.facetec.sdk.al.d(898558648);
                            if (d7 == null) {
                                byte b7 = (byte) 0;
                                d7 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2341 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1839099840, false, $$c(b7, b7, (byte) $$a.length), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) d7).invoke(null, objArr5);
                        }
                        objArr[0] = new java.lang.String(cArr);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.Object obj2 = obj;
                        java.lang.Object d4 = com.facetec.sdk.al.d(-1677945636);
                        if (d4 == null) {
                            d4 = com.facetec.sdk.al.c((char) ((android.os.Process.myPid() >> 22) + 5486), android.text.TextUtils.getTrimmedLength(""), 24 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1007939108, false, "c", null);
                        }
                        byte[] bArr = (byte[]) ((java.lang.reflect.Field) d4).get(obj2);
                        java.lang.Object obj3 = obj;
                        java.lang.Object d5 = com.facetec.sdk.al.d(-1679792678);
                        int i2 = 1;
                        if (d5 == null) {
                            d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5486), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, 24 - android.view.View.MeasureSpec.getSize(0), 1007623970, false, "a", null);
                        }
                        int i3 = ((java.lang.reflect.Field) d5).getInt(obj3);
                        java.lang.Object obj4 = obj;
                        java.lang.Object d6 = com.facetec.sdk.al.d(-1676098594);
                        if (d6 == null) {
                            d6 = com.facetec.sdk.al.c((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 5487), 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 1006090534, false, "e", null);
                        }
                        int i4 = ((java.lang.reflect.Field) d6).getInt(obj4);
                        if (i3 > 25 || i4 > 25) {
                            int floor = (int) java.lang.Math.floor(bArr.length / (i3 * i4));
                            byte[] bArr2 = new byte[floor * 625];
                            int floor2 = (int) java.lang.Math.floor((i3 - 25) / 2.0d);
                            int floor3 = (int) java.lang.Math.floor(i3 * ((i4 - 25) / 2.0d));
                            int i5 = 0;
                            for (int i6 = 25; i5 < i6; i6 = 25) {
                                try {
                                    java.lang.Object[] objArr = new java.lang.Object[5];
                                    objArr[4] = java.lang.Integer.valueOf(floor * 25);
                                    objArr[3] = java.lang.Integer.valueOf(i5 * 25 * floor);
                                    objArr[2] = bArr2;
                                    objArr[i2] = java.lang.Integer.valueOf((i3 * i5 * floor) + (floor3 * floor) + (floor2 * floor));
                                    objArr[0] = bArr;
                                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                                    f((char) android.graphics.Color.blue(0), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, android.os.Process.getGidForName("") + 17, objArr2);
                                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                                    java.lang.Object[] objArr3 = new java.lang.Object[i2];
                                    f((char) android.view.View.MeasureSpec.getSize(0), 17 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 9 - android.view.View.MeasureSpec.getSize(0), objArr3);
                                    cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                                    i5++;
                                    i2 = 1;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr = bArr2;
                        }
                        com.facetec.sdk.cn.this.d.a(bArr);
                    }

                    static {
                        init$0();
                        f3473a = new char[]{27760, 30826, 17486, 20552, 15472, 2083, 5149, 57347, 52469, 55469, 42211, 45272, 40101, 26803, 29841, 16520, 27771, 30841, 17482, 20552, 15399, 2092, 5139, 57373, 52459};
                        c = -4948157214998104053L;
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }
        if (w() && this.z.tryAcquire()) {
            this.H = true;
            try {
                this.h.execute(new java.lang.Runnable() { // from class: com.facetec.sdk.cn.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (com.facetec.sdk.cn.a(com.facetec.sdk.cn.this) == com.facetec.sdk.cn.b.PRE_SESSION) {
                                com.facetec.sdk.cn.b$1702fdc1(com.facetec.sdk.cn.this, obj, i);
                            } else if (com.facetec.sdk.cn.a(com.facetec.sdk.cn.this) == com.facetec.sdk.cn.b.ID_SCAN) {
                                com.facetec.sdk.cn.a$1702fdc1(com.facetec.sdk.cn.this, obj, i);
                            } else {
                                com.facetec.sdk.cn.d$1702fdc1(com.facetec.sdk.cn.this, obj, i);
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException unused2) {
                H();
            }
        }
    }

    private void H() {
        P = (O + 39) % 128;
        this.H = false;
        this.z.release();
        int i = P + 73;
        O = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object j(java.lang.Object[] objArr) {
        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) objArr[0];
        java.lang.Object obj = objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        synchronized (cnVar.w) {
            if (cnVar.x != com.facetec.sdk.cn.b.ID_SCAN) {
                return null;
            }
            int i = cnVar.v + 1;
            cnVar.v = i;
            if (i < 4) {
                return null;
            }
            com.facetec.sdk.cq.k(obj, intValue, false);
            cnVar.n = com.facetec.sdk.cq.q();
            cnVar.p = com.facetec.sdk.cq.v();
            cnVar.L();
            return null;
        }
    }

    private void F() {
        if (!com.facetec.sdk.t.d) {
            O = (P + 59) % 128;
            return;
        }
        final com.facetec.sdk.m mVar = ((com.facetec.sdk.bl) this.k.get()).f3428o;
        if (com.facetec.sdk.t.f3763a == 1) {
            com.facetec.sdk.cq.H("waypoint", 1);
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cn.a(com.facetec.sdk.m.this);
                }
            });
        } else if (com.facetec.sdk.t.f3763a > 10) {
            P = (O + 5) % 128;
            com.facetec.sdk.cq.H("waypoint", 2);
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cn.d(com.facetec.sdk.m.this);
                }
            });
            com.facetec.sdk.t.d = false;
        }
        com.facetec.sdk.t.f3763a++;
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        com.facetec.sdk.m mVar = (com.facetec.sdk.m) objArr[0];
        O = (P + 51) % 128;
        if (mVar != null) {
            mVar.d(b, com.facetec.sdk.t.b.WAYPOINT_UPLOAD);
        }
        int i = O + 99;
        P = i % 128;
        java.lang.Object obj = null;
        if (i % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private void e$6962e6(java.lang.Object obj, int i) {
        synchronized (this.w) {
            if (this.x != com.facetec.sdk.cn.b.PRE_SESSION) {
                return;
            }
            int i2 = this.v + 1;
            this.v = i2;
            if (i2 < 4) {
                return;
            }
            F();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                ah(false, 16 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 225, android.text.TextUtils.getTrimmedLength("") + 4, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                ah(true, android.view.View.MeasureSpec.getSize(0) + 17, "\u0000￫\u000b\u0005￼\t\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004", 232 - (android.os.Process.myTid() >> 22), 10 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                com.facetec.sdk.cq.i(obj, ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue(), i, true);
                int b2 = com.facetec.sdk.gj.AnonymousClass32.b();
                int b3 = com.facetec.sdk.gj.AnonymousClass32.b();
                this.q = (com.facetec.sdk.cs) com.facetec.sdk.cq.c(2081813785, -2081813784, com.facetec.sdk.gj.AnonymousClass32.b(), b2, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b3);
                this.t = com.facetec.sdk.cq.i();
                this.r = com.facetec.sdk.cq.k();
                this.s = com.facetec.sdk.cq.m();
                J();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private void a$6962e6(java.lang.Object obj, int i) {
        synchronized (this.w) {
            if (this.x == com.facetec.sdk.cn.b.FINISHED || this.x == com.facetec.sdk.cn.b.WAITING_TO_FINISH) {
                return;
            }
            int i2 = this.v + 1;
            this.v = i2;
            if (i2 < 4) {
                return;
            }
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                ah(false, android.view.Gravity.getAbsoluteGravity(0, 0) + 16, "\u0011\u0012\u0003\u000b\b\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017", 225 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                ah(true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, "\u0000￫\u000b\u0005￼\t\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004", 233 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
                com.facetec.sdk.cq.i(obj, ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue(), i, false);
                this.l = com.facetec.sdk.cq.j();
                int b2 = com.facetec.sdk.gj.AnonymousClass32.b();
                int b3 = com.facetec.sdk.gj.AnonymousClass32.b();
                this.m = (com.facetec.sdk.cl) com.facetec.sdk.cq.c(984600981, -984600979, com.facetec.sdk.gj.AnonymousClass32.b(), b2, com.facetec.sdk.gj.AnonymousClass32.b(), new java.lang.Object[0], b3);
                if (this.l == com.facetec.sdk.cm.ZOOM_CLOSE) {
                    this.f3471a = true;
                }
                com.facetec.sdk.cm cmVar = this.l;
                if (cmVar == com.facetec.sdk.cm.PROCESSING_COMPLETE_RETRY || cmVar == com.facetec.sdk.cm.PROCESSING_COMPLETE_SUCCESS) {
                    this.x = com.facetec.sdk.cn.b.WAITING_TO_FINISH;
                }
                if (this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_TIMED_OUT || this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_RETRY || this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_SUCCESS) {
                    this.x = com.facetec.sdk.cn.b.WAITING_TO_FINISH;
                    c();
                    com.facetec.sdk.k.d();
                }
                K();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject b2 = this.d.a().b();
        java.lang.Object[] objArr = new java.lang.Object[1];
        ai((-1619365898) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\uf612穯蚟毵", (char) (android.text.TextUtils.indexOf("", "", 0) + 62854), "裬㽵俘", "\u0000\u0000\u0000\u0000", objArr);
        java.lang.String optString = b2.optString(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        aj(1 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 3 - android.text.TextUtils.indexOf("", "", 0, 0), "\ufff8\n\u0000", false, objArr2);
        java.lang.String optString2 = b2.optString(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        aj(1 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, (android.os.Process.myTid() >> 22) + 2, "�\u0004", false, objArr3);
        java.lang.String optString3 = b2.optString(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        ai((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 959912494, "⽳㜚䬹盻", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 64331), "✒ꗹ桰ﹳ맛", "\u0000\u0000\u0000\u0000", objArr4);
        java.lang.String optString4 = b2.optString(((java.lang.String) objArr4[0]).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        aj((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, 127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.MotionEvent.axisFromString("") + 6, "�\uffff\u0000\u0002\u0005", false, objArr5);
        java.lang.String optString5 = b2.optString(((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        aj(android.text.TextUtils.getOffsetBefore("", 0) + 3, (android.os.Process.myPid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 5, "\n\u0002ￒ\r\u0017", false, objArr6);
        java.lang.String optString6 = b2.optString(((java.lang.String) objArr6[0]).intern());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        ai(android.graphics.Color.rgb(0, 0, 0) - 959201293, "\uf380펿ￅ씾", (char) (android.os.Process.getGidForName("") + 16128), "떘웞䟯䚹婺", "\u0000\u0000\u0000\u0000", objArr7);
        java.lang.String optString7 = b2.optString(((java.lang.String) objArr7[0]).intern());
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        ai(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33620, "蓶\ud883℩趭", (char) (44321 - android.view.KeyEvent.keyCodeFromString("")), "\ua3303ᵏδ센", "\u0000\u0000\u0000\u0000", objArr8);
        java.lang.String optString8 = b2.optString(((java.lang.String) objArr8[0]).intern());
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        aj((android.os.Process.myTid() >> 22) + 5, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 129, 5 - android.view.View.getDefaultSize(0, 0), "\u0005�\uffff�\u0002", true, objArr9);
        java.lang.String optString9 = b2.optString(((java.lang.String) objArr9[0]).intern());
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        aj(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 128 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', "\u0007\ufffe\uffff\u0001\uffff", false, objArr10);
        java.lang.String optString10 = b2.optString(((java.lang.String) objArr10[0]).intern());
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        ai((-824359588) - (android.view.ViewConfiguration.getTouchSlop() >> 8), "尰\udd45ᯎ㔂", (char) (android.text.TextUtils.getTrimmedLength("") + 539), "맜\ue74b\uf885↓뮳", "\u0000\u0000\u0000\u0000", objArr11);
        java.lang.String optString11 = b2.optString(((java.lang.String) objArr11[0]).intern());
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        aj(android.text.TextUtils.getTrimmedLength("") + 2, android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, "\fￒ\f\u0016\u0004", false, objArr12);
        java.lang.String optString12 = b2.optString(((java.lang.String) objArr12[0]).intern());
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        aj((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, 124 - android.graphics.Color.green(0), 5 - android.view.View.getDefaultSize(0, 0), "\u000b\u0003\u0015\u000bￒ", true, objArr13);
        java.lang.String optString13 = b2.optString(((java.lang.String) objArr13[0]).intern());
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        ai((-1619365898) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\uf612穯蚟毵", (char) (62854 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), "裬㽵俘", "\u0000\u0000\u0000\u0000", objArr14);
        com.facetec.sdk.cq.d(((java.lang.String) objArr14[0]).intern(), optString);
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        aj(1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1, "�\u0004", false, objArr15);
        com.facetec.sdk.cq.d(((java.lang.String) objArr15[0]).intern(), optString3);
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        aj(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 132 - android.widget.ExpandableListView.getPackedPositionType(0L), 3 - android.view.KeyEvent.getDeadChar(0, 0), "\ufff8\n\u0000", false, objArr16);
        com.facetec.sdk.cq.d(((java.lang.String) objArr16[0]).intern(), optString2);
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        ai(android.text.TextUtils.getOffsetAfter("", 0) + 959912495, "⽳㜚䬹盻", (char) (64330 - android.widget.ExpandableListView.getPackedPositionChild(0L)), "✒ꗹ桰ﹳ맛", "\u0000\u0000\u0000\u0000", objArr17);
        com.facetec.sdk.cq.d(((java.lang.String) objArr17[0]).intern(), optString4);
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        aj(android.graphics.Color.alpha(0) + 1, android.view.KeyEvent.normalizeMetaState(0) + 127, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, "�\uffff\u0000\u0002\u0005", false, objArr18);
        com.facetec.sdk.cq.d(((java.lang.String) objArr18[0]).intern(), optString5);
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        aj(3 - android.text.TextUtils.getOffsetAfter("", 0), 122 - android.text.TextUtils.getOffsetBefore("", 0), 5 - android.widget.ExpandableListView.getPackedPositionType(0L), "\n\u0002ￒ\r\u0017", false, objArr19);
        com.facetec.sdk.cq.d(((java.lang.String) objArr19[0]).intern(), optString6);
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        ai((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 975978510, "\uf380펿ￅ씾", (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 16127), "떘웞䟯䚹婺", "\u0000\u0000\u0000\u0000", objArr20);
        com.facetec.sdk.cq.d(((java.lang.String) objArr20[0]).intern(), optString7);
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        ai(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 702055301, "蓶\ud883℩趭", (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 44321), "\ua3303ᵏδ센", "\u0000\u0000\u0000\u0000", objArr21);
        com.facetec.sdk.cq.d(((java.lang.String) objArr21[0]).intern(), optString8);
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        aj(5 - android.view.KeyEvent.keyCodeFromString(""), 130 - android.view.KeyEvent.getDeadChar(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 5, "\u0005�\uffff�\u0002", true, objArr22);
        com.facetec.sdk.cq.H(((java.lang.String) objArr22[0]).intern(), java.lang.Integer.parseInt(optString9));
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        aj(-(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 128, 6 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0007\ufffe\uffff\u0001\uffff", false, objArr23);
        com.facetec.sdk.cq.H(((java.lang.String) objArr23[0]).intern(), java.lang.Integer.parseInt(optString10));
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        ai((-824359588) - android.graphics.Color.argb(0, 0, 0, 0), "尰\udd45ᯎ㔂", (char) (539 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "맜\ue74b\uf885↓뮳", "\u0000\u0000\u0000\u0000", objArr24);
        com.facetec.sdk.cq.H(((java.lang.String) objArr24[0]).intern(), java.lang.Integer.parseInt(optString11));
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        aj(2 - android.view.KeyEvent.getDeadChar(0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 5 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\fￒ\f\u0016\u0004", false, objArr25);
        com.facetec.sdk.cq.H(((java.lang.String) objArr25[0]).intern(), java.lang.Integer.parseInt(optString12));
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        aj(4 - android.text.TextUtils.getOffsetBefore("", 0), 124 - android.text.TextUtils.indexOf("", "", 0), android.text.TextUtils.getOffsetAfter("", 0) + 5, "\u000b\u0003\u0015\u000bￒ", true, objArr26);
        com.facetec.sdk.cq.H(((java.lang.String) objArr26[0]).intern(), java.lang.Integer.parseInt(optString13));
        try {
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            ai(android.widget.ExpandableListView.getPackedPositionType(0L) - 1619365898, "\uf612穯蚟毵", (char) (62854 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "裬㽵俘", "\u0000\u0000\u0000\u0000", objArr27);
            jSONObject = b2;
            try {
                jSONObject.put(((java.lang.String) objArr27[0]).intern(), new java.util.ArrayList().toString());
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                aj(3 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 121, 5 - android.view.KeyEvent.keyCodeFromString(""), "\n\u0002ￒ\r\u0017", false, objArr28);
                jSONObject.put(((java.lang.String) objArr28[0]).intern(), new java.util.ArrayList().toString());
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                ai((-975978509) - android.text.TextUtils.getTrimmedLength(""), "\uf380펿ￅ씾", (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 16127), "떘웞䟯䚹婺", "\u0000\u0000\u0000\u0000", objArr29);
                jSONObject.put(((java.lang.String) objArr29[0]).intern(), new java.util.ArrayList().toString());
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                ai(702055299 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "蓶\ud883℩趭", (char) (44321 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), "\ua3303ᵏδ센", "\u0000\u0000\u0000\u0000", objArr30);
                jSONObject.put(((java.lang.String) objArr30[0]).intern(), new java.util.ArrayList().toString());
                int i = O + 7;
                P = i % 128;
                if (i % 2 != 0) {
                    int i2 = 5 / 4;
                }
            } catch (org.json.JSONException unused) {
            }
        } catch (org.json.JSONException unused2) {
            jSONObject = b2;
        }
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        aj((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, 132 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 3, "￼\n￼", false, objArr31);
        com.facetec.sdk.cq.N(((java.lang.String) objArr31[0]).intern(), jSONObject.toString());
    }

    private void N() {
        synchronized (this.w) {
            if (this.x == com.facetec.sdk.cn.b.FINISHED || this.x == com.facetec.sdk.cn.b.WAITING_TO_FINISH) {
                return;
            }
            synchronized (this.D) {
                if (this.C == null) {
                    return;
                }
                long time = new java.util.Date().getTime();
                long time2 = this.C.getTime();
                if (time - time2 > 615000) {
                    com.facetec.sdk.n.b(new java.lang.Throwable("Phoenix hang was detected"));
                    e(false);
                    this.l = com.facetec.sdk.cm.PROCESSING_COMPLETE_TIMED_OUT;
                    K();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r0.runOnUiThread(new com.facetec.sdk.cn$$ExternalSyntheticLambda5(r2));
        com.facetec.sdk.cn.P = (com.facetec.sdk.cn.O + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void L() {
        android.app.Activity activity;
        synchronized (this) {
            int i = O + 115;
            P = i % 128;
            if (i % 2 != 0) {
                activity = this.k.get();
                int i2 = 25 / 0;
            } else {
                activity = this.k.get();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ac() {
        P = (O + 53) % 128;
        X();
        P = (O + 69) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r0.runOnUiThread(new com.facetec.sdk.cn$$ExternalSyntheticLambda2(r2));
        com.facetec.sdk.cn.P = (com.facetec.sdk.cn.O + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void J() {
        android.app.Activity activity;
        synchronized (this) {
            int i = P + 119;
            O = i % 128;
            if (i % 2 == 0) {
                activity = this.k.get();
                int i2 = 92 / 0;
            } else {
                activity = this.k.get();
            }
        }
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) objArr[0];
        int i = P + 83;
        O = i % 128;
        cnVar.O();
        java.lang.Object obj = null;
        if (i % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        O = (P + 53) % 128;
        S();
        P = (O + 29) % 128;
    }

    private void K() {
        synchronized (this) {
            O = (P + 71) % 128;
            android.app.Activity activity = this.k.get();
            if (activity == null) {
                return;
            }
            if (this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_STILL_COMPUTING) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.cn.this.aa();
                    }
                });
                return;
            }
            if (this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_TIMED_OUT) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.cn.this.Z();
                    }
                });
                return;
            }
            if (this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_RETRY) {
                int i = P + 63;
                O = i % 128;
                if (i % 2 == 0) {
                    activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.cn.this.Y();
                        }
                    });
                    int i2 = 14 / 0;
                } else {
                    activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.facetec.sdk.cn.this.Y();
                        }
                    });
                }
                return;
            }
            if (this.l == com.facetec.sdk.cm.PROCESSING_COMPLETE_SUCCESS) {
                activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.cn.this.ab();
                    }
                });
                return;
            }
            activity.runOnUiThread(new java.lang.Runnable() { // from class: com.facetec.sdk.cn$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.cn.this.V();
                }
            });
            int i3 = P + 45;
            O = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        int i = O + 1;
        P = i % 128;
        Q();
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = P + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        O = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ab() {
        O = (P + 7) % 128;
        T();
        O = (P + 5) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        int i = P + 81;
        O = i % 128;
        U();
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    private java.util.List<com.facetec.sdk.cn.d> M() {
        java.util.List<com.facetec.sdk.cn.d> d2;
        synchronized (this) {
            O = (P + 3) % 128;
            d2 = d(this.j);
            P = (O + 83) % 128;
        }
        return d2;
    }

    private java.util.List<com.facetec.sdk.cn.e> P() {
        java.util.List<com.facetec.sdk.cn.e> d2;
        synchronized (this) {
            O = (P + 125) % 128;
            d2 = d(this.i);
            int i = O + 89;
            P = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        return d2;
    }

    private java.util.List<com.facetec.sdk.cn.c> R() {
        synchronized (this) {
            O = (P + 45) % 128;
            java.util.List<com.facetec.sdk.cn.c> d2 = d(this.g);
            int i = P + 67;
            O = i % 128;
            if (i % 2 != 0) {
                return d2;
            }
            int i2 = 34 / 0;
            return d2;
        }
    }

    private <T> java.util.List<T> d(java.util.ArrayList<java.lang.ref.WeakReference<T>> arrayList) {
        java.util.ArrayList arrayList2;
        synchronized (this) {
            arrayList2 = new java.util.ArrayList(arrayList.size());
            java.util.Iterator<java.lang.ref.WeakReference<T>> it = arrayList.iterator();
            while (it.hasNext()) {
                int i = P + 83;
                O = i % 128;
                java.lang.Object obj = null;
                if (i % 2 == 0) {
                    it.next().get();
                    obj.hashCode();
                    throw null;
                }
                T t = it.next().get();
                if (t != null) {
                    int i2 = P + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    O = i2 % 128;
                    if (i2 % 2 == 0) {
                        arrayList2.add(t);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList2.add(t);
                }
                P = (O + 97) % 128;
            }
        }
        return arrayList2;
    }

    private void S() {
        synchronized (this) {
            java.util.Iterator<com.facetec.sdk.cn.d> it = M().iterator();
            int i = O + 101;
            P = i % 128;
            int i2 = i % 2;
            while (it.hasNext()) {
                it.next().b();
            }
            P = (O + 21) % 128;
        }
    }

    private void O() {
        synchronized (this) {
            P = (O + 89) % 128;
            java.util.Iterator<com.facetec.sdk.cn.d> it = M().iterator();
            while (it.hasNext()) {
                O = (P + 41) % 128;
                it.next().e();
            }
        }
    }

    private void Q() {
        synchronized (this) {
            int i = O + 119;
            P = i % 128;
            if (i % 2 != 0) {
                M().iterator();
                throw null;
            }
            java.util.Iterator<com.facetec.sdk.cn.d> it = M().iterator();
            int i2 = P + 101;
            O = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    private void T() {
        java.util.Iterator<com.facetec.sdk.cn.d> it;
        synchronized (this) {
            int i = O + 23;
            P = i % 128;
            if (i % 2 != 0) {
                it = M().iterator();
                int i2 = 81 / 0;
            } else {
                it = M().iterator();
            }
            while (it.hasNext()) {
                int i3 = P + 63;
                O = i3 % 128;
                if (i3 % 2 == 0) {
                    it.next().a();
                    throw null;
                }
                it.next().a();
                int i4 = O + 39;
                P = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private void U() {
        synchronized (this) {
            java.util.Iterator<com.facetec.sdk.cn.d> it = M().iterator();
            P = (O + 35) % 128;
            while (it.hasNext()) {
                int i = O + 17;
                P = i % 128;
                if (i % 2 == 0) {
                    it.next().d(this.l, this.m);
                } else {
                    it.next().d(this.l, this.m);
                    throw null;
                }
            }
        }
    }

    private void X() {
        synchronized (this) {
            O = (P + 39) % 128;
            java.util.Iterator<com.facetec.sdk.cn.e> it = P().iterator();
            while (it.hasNext()) {
                int i = P + 43;
                O = i % 128;
                if (i % 2 != 0) {
                    it.next().onPreSessionProgress(this.q, this.t, this.r, this.s);
                } else {
                    it.next().onPreSessionProgress(this.q, this.t, this.r, this.s);
                    throw null;
                }
            }
        }
    }

    private void W() {
        synchronized (this) {
            O = (P + 47) % 128;
            java.util.Iterator<com.facetec.sdk.cn.c> it = R().iterator();
            int i = P + 99;
            O = i % 128;
            int i2 = i % 2;
            while (it.hasNext()) {
                it.next().onIDScanProgress(this.n, this.p);
            }
            int i3 = O + 69;
            P = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(android.content.Context context) {
        java.util.Iterator<android.hardware.usb.UsbDevice> it;
        java.lang.String str;
        com.facetec.sdk.bc.a("UMT");
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getApplicationContext().getSystemService("usb");
        com.facetec.sdk.bc.c("UMT");
        com.facetec.sdk.bc.a("UDT");
        java.util.HashMap<java.lang.String, android.hardware.usb.UsbDevice> deviceList = usbManager.getDeviceList();
        com.facetec.sdk.bc.c("UDT");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        java.util.Iterator<android.hardware.usb.UsbDevice> it2 = deviceList.values().iterator();
        int i = P + 9;
        O = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 5;
        }
        boolean z = false;
        while (it2.hasNext()) {
            android.hardware.usb.UsbDevice next = it2.next();
            if (next != null) {
                O = (P + 111) % 128;
                java.lang.String deviceName = next.getDeviceName();
                int deviceClass = next.getDeviceClass();
                if (next.getManufacturerName() != null) {
                    str = next.getManufacturerName().trim();
                    int i3 = P + 23;
                    O = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 3 / 5;
                    }
                } else {
                    str = "FT_NULL";
                }
                java.lang.String trim = next.getProductName() != null ? next.getProductName().trim() : "FT_NULL";
                sb.append(deviceName);
                byte[] bArr = T;
                byte b2 = bArr[33];
                short s = b2;
                it = it2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                ag(s, (short) (s | 1199), b2, objArr);
                sb.append((java.lang.String) objArr[0]);
                sb2.append(java.lang.String.valueOf(deviceClass));
                byte b3 = bArr[33];
                short s2 = b3;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                ag(s2, (short) (s2 | 1199), b3, objArr2);
                sb2.append((java.lang.String) objArr2[0]);
                sb3.append(str);
                byte b4 = bArr[33];
                short s3 = b4;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                ag(s3, (short) (s3 | 1199), b4, objArr3);
                sb3.append((java.lang.String) objArr3[0]);
                sb4.append(trim);
                byte b5 = bArr[33];
                short s4 = b5;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                ag(s4, (short) (s4 | 1199), b5, objArr4);
                sb4.append((java.lang.String) objArr4[0]);
                O = (P + 85) % 128;
                z = true;
            } else {
                it = it2;
            }
            it2 = it;
        }
        com.facetec.sdk.cq.M(com.facetec.sdk.as.z, z);
        com.facetec.sdk.cq.F(com.facetec.sdk.as.G, sb.toString());
        com.facetec.sdk.cq.F(com.facetec.sdk.as.H, sb2.toString());
        com.facetec.sdk.cq.F(com.facetec.sdk.as.F, sb3.toString());
        com.facetec.sdk.cq.F(com.facetec.sdk.as.I, sb4.toString());
        com.facetec.sdk.cq.F(com.facetec.sdk.as.N, java.lang.String.valueOf(com.facetec.sdk.bc.b("UMT")));
        com.facetec.sdk.cq.F(com.facetec.sdk.as.K, java.lang.String.valueOf(com.facetec.sdk.bc.b("UDT")));
    }

    private static /* synthetic */ java.lang.Object b(java.lang.Object[] objArr) {
        int i = P;
        int i2 = i + 95;
        O = i2 % 128;
        I = 9010024738234916139L;
        F = 113208162;
        L = (char) 23851;
        J = 780577506;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = i + 35;
        O = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ java.lang.Object d(java.lang.Object[] objArr) {
        int i = O;
        P = (i + 105) % 128;
        M = 780577414;
        int i2 = i + 75;
        P = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag(int i, int i2, byte b2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = b2 + 44;
        int i6 = 1316 - i2;
        byte[] bArr = T;
        int i7 = i + 1;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i5 = i7;
            int i8 = i6;
            i4 = 0;
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i6++;
            i5 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    static void t() {
        byte[] bArr = new byte[1323];
        java.lang.System.arraycopy("\u0013¡«J\u0004û\u0001\u0005ú\u0006ú\u0001\u0006ù\t÷\u0001\u0007ø\fô\ró\u0001\u0006ù\u0005ÿü\u0001\b÷\u0005\u0000û\u0005\u0001ú\u0005\u0002ù\u0001\tö\u0005\u0003ø\u0001\nõ\u0001\u000bô\u0005\u0005ö\u0005\u0006õ\u0005\u0007ô\u0001\fó\u0005\u0000û\u0006þü\u0001\u0004ÿü\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0001\u0004\u0001ú\u0001\u000bô\u0006ÿû\u0005\u0007ô\u0001\fó\u0005\u0001ú\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0001\u0004\u0004÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð÷\u0015ëÍGÿõ\u0003Â5\fÿõ\u0012ý\u0000ó\t\u0006º&\u0014\nóü\u0003è#ôþ\u000bæ\u000f\rö\u000bþ\u0012ý\u0000ó\t\u0006÷\u0013üÕ%\u0006\u0004û\ró\u0001\u0005ú\u0001\u0006ù\u0001\u0007ø\u0001\b÷\u0001\tö\ró\u0001\nõ\u0001\u000bô\u0001\fó\u0001\u0004ÿü\ró\u0001\nõ\u0001\u0004\u0000û\u0001\u0004\u0001ú\u0001\u0004\u0002ù\u0001\u0004\u0003ø\ró\u0006\u0002ø\u0001\u0004\u0004÷\u0001\u0004\u0005ö\u0001\u0004\u0003ø\u0006\u0003÷\u0001\u0004\u0006õ\u0001\u0004\u0007ô\ró\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\u0001\u0005\u0000ú\ró\u0001\nõ\u0001\u0004\u0000û\u0001\u0005\u0001ù\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0006\u0003÷\u0001\u0005\u0004ö\u0006\u0004ö\u0001\u0005\u0005õ\u0006\u0005õ\u0006\u0006ô\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\ró\u0001\u0004\bó\u0001\u0006þû\u0001\u0006ÿú\u0001\u0006\u0000ù\u0006\u0003÷\u0001\u0006\u0001ø\u0006\u0004ö\u0001\u0006\u0001ø\u0006\u0007ó\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u0001\u0006\u0004õ\u0007ýü\u0001\u0006\u0005ô\u0001\u0006\u0006ó\u0001\u0007üü\ró\u0007þû\u0001\u0007ýû\u0001\u0007þú\u0001\u0007ÿù\ró\u0001\u0004\u0004÷\u0001\u0007\u0000ø\u0001\u0007ÿù\u0001\u0007\u0001÷\u0006\u0003÷\u0001\u0007\u0002ö\u0006\u0004ö\u0001\u0007\u0002ö\u0001\u0004\u0005ö\u0001\u0007\u0003õ\ró\u0006\u0002ø\u0001\u0004\bó\u0006\u0003÷\u0007\u0000ù\u0001\u0007\u0004ô\u0007\u0001ø\u0001\u0007\u0005ó\ró\u0001\bûü\u0001\büû\u0001\býú\u0007\u0002÷\u0001\bþù\u0007\u0003ö\u0001\bÿø\u0001\b\u0000÷\u0005\u0002ù\u0001\b\u0001ö\ró\u0001\u0005ú\u0001\b\u0002õ\u0007\u0005ô\u0001\b\u0003ô\u0007\u0006ó\u0001\b\u0004ó\u0001\túü\u0001\tûû\u0001\tüú\büü\u0001\týù\býû\bþú\u0001\tþø\u0006\u0004ö\u0001\tÿ÷\ró\u0001\u0006ù\u0001\t\u0000ö\bÿù\u0001\t\u0001õ\u0001\t\u0002ô\büü\u0001\t\u0003ó\u0001\nùü\büü\u0001\týù\b\u0000ø\u0001\tþø\u0001\nùü\u0006\u0003÷\u0001\núû\u0005\u0000û\u0005\u0000û\u0006þü\u0005\u0002ù\u0001\nûú\u0005\u0000û\u0005\u0001ú\u0005\u0002ù\u0001\u0005\u0004ö\u0005\u0003ø\u0001\nüù\u0005\u0003ø\u0001\nüù\u0005\u0003ø\u0001\nüù\u0001\nýø\b\u0002ö\u0006\u0005õ\b\u0003õ\u0006þü\u0001\nþ÷\u0005\u0000û\u0006þü\u0001\nÿö\u0001\n\u0000õ\u0001\n\u0001ô\u0001\n\u0001ô\u0001\n\u0002ó\b\u0004ô\u0006\u0005õ\u0005\u0007ô\u0001\u000bøü\u0005\u0001ú\u0001\u000bùû\u0001\u000búú\u0001\u000bûù\u0001\u000büø\u0007ýü\b\u0005ó\u0001\u000bý÷\u0001\u0006\u0004õ\u0001\u0007\u0003õ\u0001\n\u0002ó\tûü\u0005\u0006õ\u0005\u0007ô\u0001\u000bøü\u0005\u0000û\u0006þü\u0001\u000bþö\u0001\u000bÿõ\u0001\u000b\u0000ô\u0001\u000büø\ró\u0001\u0004\u0004÷\bþú\u0001\u000b\u0001ó\u0005\u0002ù\u0001\f÷ü\u0001\u0007ÿù\u0001\u0007\u0001÷\u0001\n\u0002ó\tüû\u0007\u0000ù\u0006\u0005õ\b\u0003õ\u0006þü\u0001\u000bøü\u0005\u0000û\u0006þü\u0001\føû\u0001\fùú\u0001\fúù\u0001\u000büø\ró\u0001\nõ\u0001\u0004\u0000û\bþú\u0001\u000b\u0001ó\u0005\u0002ù\u0001\fûø\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0001\n\u0002ó\týú\tþù\u0006þü\u0001\u000bøü\u0005\u0001ú\u0001\fü÷\u0001\fýö\u0001\fþõ\u0001\u000büø\u0005\u0003ø\bþú\u0001\u000b\u0001ó\u0005\u0002ù\u0001\nüù\u0001\fÿô\tÿø\u0001\f\u0000ó\t\u0000÷\u0001\f\u0000ó\u0001\u0004ÿ\u0000ü\t\u0001ö\u0001\u0004ÿ\u0001û\t\u0002õ\u0001\u0004ÿ\u0001û\u0001\u0004ÿ\u0002ú\t\u0003ô\u0001\u0004ÿ\u0003ù\t\u0004ó\u0001\u0004ÿ\u0003ù\u0001\u0004ÿ\u0004ø\u0006\u0004ö\u0001\u0004ÿ\u0005÷\u0006\u0003÷\u0001\u0004ÿ\u0005÷\u0001\u0004ÿ\u0006ö\núü\u0001\u0004ÿ\u0007õ\nûû\u0001\u0004ÿ\u0007õ\u0001\u0004ÿ\bô\nüú\u0001\u0004ÿ\tó\nýù\u0001\u0004ÿ\tó\u0001\u0004\u0000ÿü\u0006\u0004ö\u0001\u0004\u0000\u0000û\u0006\u0003÷\u0001\u0004\u0000\u0000÷\u0015ëÍ>õ\rùÇ\u0017)\u0007ø\u0003ò\u0005\u0005ó\u000b\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿñ\u0007\u0014ê\u0005\u0006÷\u0015ëÍGÿõ\u0003Â&\u0015\u0004ø\rð\u0005ýÿ\u0011÷ùÜ3Ò#\u000fíÿî\u000f\u0013ñ÷\u0015ëÍGÿõ\u0003Â&\u0015\u0004ø\râ\r\u0012ø÷\u0015ëÍGÿõ\u0003Â\u0013!\u0011\u0001þï\u0002\u0011Ï,ý\u0000ùþ\u0011õ\u0006ÿ\tùü\u0011÷\u0015ëÍGÿõ\u0003Â5\fÿõ\u0012ý\u0000ó\t\u0006º\u00173íþ\u0012ÿû\u0003á\u0012\r\u0004óú\u0002õ\rÿð\u000b\b÷".getBytes("ISO-8859-1"), 0, bArr, 0, 1323);
        T = bArr;
        V = 148;
    }

    static void r() {
        K = 9010024738234916139L;
        N = 603544875;
        R = (char) 54220;
    }

    static void p() {
        b(new java.lang.Object[0], 1159640395, -1159640395, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    static void q() {
        b(new java.lang.Object[0], 1076437108, -1076437104, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.facetec.sdk.m mVar) {
        b(new java.lang.Object[]{mVar}, 467238825, -467238824, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.facetec.sdk.m mVar) {
        b(new java.lang.Object[]{mVar}, -824692282, 824692287, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void af() {
        b(new java.lang.Object[]{this}, 700962883, -700962877, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aa() {
        b(new java.lang.Object[]{this}, 262378450, -262378448, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    private void c$6962e6(java.lang.Object obj, int i) {
        b(new java.lang.Object[]{this, obj, java.lang.Integer.valueOf(i)}, 774973806, -774973799, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    final void l() {
        b(new java.lang.Object[]{this}, -773064662, 773064665, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    private com.facetec.sdk.dg D() {
        return (com.facetec.sdk.dg) b(new java.lang.Object[]{this}, -948509798, 948509807, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x06f2 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v63 */
    /* JADX WARN: Type inference failed for: r14v64 */
    /* JADX WARN: Type inference failed for: r6v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v81, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean b(android.content.Context context, boolean z) {
        int i;
        ?? r14;
        java.lang.Object obj;
        int i2;
        java.lang.Object obj2;
        int i3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i4;
        boolean z2;
        int i5;
        java.lang.Object obj5;
        int i6;
        int i7;
        int i8;
        synchronized (this) {
            com.facetec.sdk.dv dvVar = new com.facetec.sdk.dv(this, context, z ? 1 : 0);
            byte[] bArr = T;
            java.lang.Object[] objArr = new java.lang.Object[1];
            ag((short) 938, (short) 1102, bArr[6], objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            byte b2 = bArr[33];
            short s = b2;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            ag(s, (short) (s | 1199), b2, objArr2);
            try {
                java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                char c2 = 197;
                short s2 = bArr[197];
                char c3 = 'y';
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                ag(s2, (short) (s2 | 1184), bArr[121], objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                ag(bArr[4], (short) 1184, bArr[169], objArr5);
                java.lang.String str2 = (java.lang.String) objArr5[0];
                short s3 = bArr[197];
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                ag(s3, (short) (s3 | 1184), bArr[121], objArr6);
                java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
                int[] iArr = new int[objArr7.length];
                int i9 = 0;
                while (i9 < objArr7.length) {
                    java.lang.Object[] objArr8 = {objArr7[i9]};
                    byte[] bArr2 = T;
                    short s4 = (short) (-bArr2[155]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    ag(s4, (short) (s4 | 1164), bArr2[c3], objArr9);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    ag(bArr2[9], (short) 1164, bArr2[3], objArr10);
                    java.lang.String str3 = (java.lang.String) objArr10[0];
                    short s5 = bArr2[c2];
                    byte b3 = bArr2[c3];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    ag(s5, (short) (s5 | 1184), b3, objArr11);
                    java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                    short s6 = (short) (-bArr2[155]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    ag(s6, (short) (s6 | 1164), bArr2[121], objArr12);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    ag(bArr2[17], (short) 1158, (byte) (bArr2[121] - 1), objArr13);
                    iArr[i9] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                    i9++;
                    c2 = 197;
                    c3 = 'y';
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        r14 = 23;
                    } catch (java.lang.Throwable th) {
                        th = th;
                    }
                    switch (dvVar.c(iArr[i10])) {
                        case -111:
                            i10 = 259;
                        case androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING /* -110 */:
                            dvVar.c(37);
                            i11 = dvVar.f3526a != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE : 68;
                        case -109:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
                        case -108:
                            dvVar.c(37);
                            i11 = dvVar.f3526a != 54 ? 59 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
                        case -107:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE;
                        case -106:
                            dvVar.c(37);
                            i11 = dvVar.f3526a != 29 ? 224 : 144;
                        case -105:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE;
                        case -104:
                            try {
                                dvVar.c(37);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                                if (i10 < i) {
                                }
                                if (i10 < 186) {
                                }
                                if (i10 < 208) {
                                }
                                if (i10 < 225) {
                                }
                                throw th;
                            }
                            if (dvVar.f3526a != 0) {
                                i11 = 12;
                            } else {
                                i10 = 23;
                            }
                            break;
                        case -103:
                            i10 = 239;
                        case -102:
                            obj = null;
                            dvVar.c(37);
                            int i12 = dvVar.f3526a;
                            if (i12 == 1 || i12 != 15) {
                                i10 = 192;
                            } else {
                                i2 = 39;
                                i10 = i2;
                            }
                            break;
                        case -101:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
                        case -100:
                            obj = null;
                            dvVar.c(37);
                            int i13 = dvVar.f3526a;
                            if (i13 != 7 && i13 == 70) {
                                i2 = 79;
                                i10 = i2;
                            }
                            i10 = 63;
                            break;
                        case -99:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
                        case -98:
                            obj = null;
                            dvVar.c(37);
                            if (dvVar.f3526a != 50) {
                                i10 = 53;
                            } else {
                                i2 = 51;
                                i10 = i2;
                            }
                        case -97:
                            i10 = 250;
                        case -96:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                        case -95:
                            obj = null;
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE;
                                i10 = i2;
                            }
                        case -94:
                            obj = null;
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
                                i10 = i2;
                            }
                        case -93:
                            i10 = 31;
                        case -92:
                            i10 = 205;
                        case -91:
                            obj = null;
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i2 = 203;
                                i10 = i2;
                            }
                        case com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.NetworkConstants.PAST_90_DAYS /* -90 */:
                            obj = null;
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i2 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
                                i10 = i2;
                            }
                        case -89:
                            obj = null;
                            try {
                                dvVar.e = 1;
                                dvVar.c(3);
                                try {
                                    dvVar.c(4);
                                    dvVar.e = dvVar.f.hashCode();
                                    dvVar.c(7);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                                    if (i10 < i) {
                                        break;
                                    }
                                    if (i10 < 186) {
                                        break;
                                    }
                                    if (i10 < 208) {
                                        break;
                                    }
                                    if (i10 < 225) {
                                        break;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                            }
                        case -88:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                        case -87:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                        case -86:
                            obj2 = null;
                            obj3 = null;
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
                                i10 = i3;
                            }
                        case -85:
                            obj2 = null;
                            obj3 = null;
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
                                i10 = i3;
                            }
                        case -84:
                            r14 = 0;
                            dvVar.c(15);
                            throw ((java.lang.Throwable) dvVar.f);
                            break;
                        case -83:
                            i10 = 255;
                        case -82:
                            i10 = 257;
                        case -81:
                            obj2 = null;
                            obj3 = null;
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i3 = 166;
                                i10 = i3;
                            }
                        case -80:
                            r14 = 0;
                            obj3 = null;
                            dvVar.e = 1;
                            dvVar.c(3);
                            try {
                                dvVar.c(6);
                                P = dvVar.f3526a;
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                                i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                                if (i10 < i) {
                                }
                                if (i10 < 186) {
                                }
                                if (i10 < 208) {
                                }
                                if (i10 < 225) {
                                }
                                throw th;
                            }
                            break;
                        case -79:
                            obj4 = null;
                            i5 = O;
                            dvVar.e = i5;
                            dvVar.c(7);
                        case -78:
                            i10 = 18;
                        case -77:
                            i10 = 157;
                        case -76:
                            obj4 = null;
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i4 = 156;
                                i10 = i4;
                            }
                        case -75:
                            obj4 = null;
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(6);
                            O = dvVar.f3526a;
                        case -74:
                            obj4 = null;
                            i5 = P;
                            dvVar.e = i5;
                            dvVar.c(7);
                        case -73:
                            dvVar.c(45);
                            z2 = dvVar.f3526a != 0;
                            break;
                        case -72:
                            i10 = 1;
                        case -71:
                            i10 = 142;
                        case -70:
                            i10 = 129;
                        case -69:
                            obj4 = null;
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            e((android.content.Context) dvVar.f);
                        case -68:
                            obj4 = null;
                            com.facetec.sdk.eb.e();
                        case -67:
                            obj4 = null;
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(4);
                            cnVar.a((android.content.Context) dvVar.f);
                        case -66:
                            obj4 = null;
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar2 = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(4);
                            cnVar2.x = (com.facetec.sdk.cn.b) dvVar.f;
                        case -65:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE;
                        case -64:
                            obj4 = null;
                            dvVar.e = 4;
                            dvVar.c(3);
                            dvVar.c(4);
                            android.content.Context context2 = (android.content.Context) dvVar.f;
                            dvVar.c(4);
                            com.facetec.sdk.c cVar = (com.facetec.sdk.c) dvVar.f;
                            dvVar.c(4);
                            java.lang.String str4 = (java.lang.String) dvVar.f;
                            dvVar.c(4);
                            com.facetec.sdk.t.c(context2, cVar, str4, (java.lang.Throwable) dvVar.f);
                        case -63:
                            obj4 = null;
                            dvVar.i = com.facetec.sdk.c.PRE_SESSION_START_ERROR;
                            dvVar.c(1);
                        case -62:
                            i10 = 115;
                        case -61:
                            i10 = 108;
                        case -60:
                            obj4 = null;
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i4 = 107;
                                i10 = i4;
                            }
                        case -59:
                            obj4 = null;
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(6);
                            i5 = com.facetec.sdk.cq.c(dvVar.f3526a != 0);
                            dvVar.e = i5;
                            dvVar.c(7);
                        case -58:
                            try {
                                obj4 = null;
                                dvVar.c(37);
                                i8 = dvVar.f3526a;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                                if (i10 < i && i10 < 173) {
                                    i10 = 167;
                                } else if (i10 < 186 && i10 < 192) {
                                    i10 = 183;
                                } else if (i10 < 208 && i10 < 214) {
                                    i10 = 204;
                                } else {
                                    if (i10 < 225 || i10 >= 229) {
                                        throw th;
                                    }
                                    i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE;
                                }
                                dvVar.i = th;
                                dvVar.c(64);
                            }
                            if (i8 == 1 || i8 == 2) {
                                i4 = 103;
                            } else if (i8 != 3) {
                                i10 = 129;
                            } else {
                                i4 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                            }
                            i10 = i4;
                            break;
                        case -57:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            java.lang.Object obj6 = dvVar.f;
                            try {
                                byte[] bArr3 = T;
                                try {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    ag(bArr3[21], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, bArr3[121], objArr14);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                                    short s7 = bArr3[9];
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    ag(s7, (short) (s7 | com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor), (byte) 67, objArr15);
                                    obj4 = null;
                                    try {
                                        i5 = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr15[0], null).invoke(obj6, null)).intValue();
                                        dvVar.e = i5;
                                        dvVar.c(7);
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        case -56:
                            obj5 = com.facetec.sdk.cn.AnonymousClass5.f3474a;
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -55:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            obj5 = com.facetec.sdk.dk.e((java.lang.Runnable) dvVar.f);
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -54:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            obj5 = ((com.facetec.sdk.cn) dvVar.f).A();
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -53:
                            obj5 = "Session Finished";
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -52:
                            obj5 = "Session is waiting to finish";
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -51:
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar3 = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(4);
                            cnVar3.q = (com.facetec.sdk.cs) dvVar.f;
                        case -50:
                            obj5 = com.facetec.sdk.cs.DETECTING_LIGHT_MODE;
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -49:
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar4 = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(6);
                            cnVar4.v = dvVar.f3526a;
                        case -48:
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar5 = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(6);
                            cnVar5.u = dvVar.f3526a;
                        case -47:
                            i10 = 79;
                        case -46:
                            i10 = 77;
                        case -45:
                            i10 = 75;
                        case -44:
                            dvVar.c(32);
                            if (dvVar.f3526a == 0) {
                                i6 = 72;
                                i10 = i6;
                            }
                        case -43:
                            i10 = 73;
                        case -42:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE;
                        case -41:
                            dvVar.c(19);
                            i10 = dvVar.f3526a == 0 ? 67 : i11;
                        case -40:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                        case -39:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
                        case -38:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 62;
                                i10 = i6;
                            }
                        case -37:
                            i10 = 63;
                        case -36:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        case -35:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 58;
                                i10 = i6;
                            }
                        case -34:
                            i10 = 55;
                        case -33:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
                        case -32:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
                        case -31:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 50;
                                i10 = i6;
                            }
                        case -30:
                            i10 = 53;
                        case -29:
                            i10 = 46;
                        case -28:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i10 = 45;
                            }
                        case -27:
                            i10 = 136;
                        case -26:
                            i10 = 41;
                        case -25:
                            i10 = 39;
                        case -24:
                            i10 = 37;
                        case -23:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 36;
                                i10 = i6;
                            }
                        case -22:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                        case -21:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
                        case -20:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 30;
                                i10 = i6;
                            }
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            i7 = ((com.facetec.sdk.cn) dvVar.f).u;
                            dvVar.e = i7;
                            obj4 = null;
                            dvVar.c(7);
                        case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            x();
                        case -17:
                            i10 = 140;
                        case -16:
                            dvVar.e = 2;
                            dvVar.c(3);
                            dvVar.c(4);
                            com.facetec.sdk.cn cnVar6 = (com.facetec.sdk.cn) dvVar.f;
                            dvVar.c(6);
                            cnVar6.c(dvVar.f3526a != 0);
                        case -15:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            i7 = ((com.facetec.sdk.cn) dvVar.f).c;
                            dvVar.e = i7;
                            obj4 = null;
                            dvVar.c(7);
                        case -14:
                            i10 = 23;
                        case -13:
                            i10 = 146;
                        case -12:
                            dvVar.c(19);
                            if (dvVar.f3526a == 0) {
                                i6 = 17;
                                i10 = i6;
                            }
                        case -11:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            i7 = ((com.facetec.sdk.z) dvVar.f).d();
                            dvVar.e = i7;
                            obj4 = null;
                            dvVar.c(7);
                        case -10:
                            i10 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
                        case -9:
                            i10 = 247;
                        case -8:
                            dvVar.c(23);
                            if (dvVar.f3526a == 0) {
                                i6 = 11;
                                i10 = i6;
                            }
                        case -7:
                            dvVar.e = 1;
                            dvVar.c(3);
                            dvVar.c(4);
                            obj5 = ((com.facetec.sdk.cn) dvVar.f).d;
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -6:
                            i10 = 25;
                        case -5:
                            i10 = 7;
                        case -4:
                            dvVar.c(22);
                            if (dvVar.f3526a == 0) {
                                i10 = 6;
                            }
                        case -3:
                            obj5 = com.facetec.sdk.cn.b.PRE_SESSION;
                            dvVar.i = obj5;
                            obj4 = null;
                            dvVar.c(1);
                        case -2:
                            try {
                                dvVar.e = 1;
                                dvVar.c(3);
                                dvVar.c(4);
                                obj5 = ((com.facetec.sdk.cn) dvVar.f).x;
                                dvVar.i = obj5;
                                obj4 = null;
                                dvVar.c(1);
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                r14 = 0;
                                i = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
                                if (i10 < i) {
                                }
                                if (i10 < 186) {
                                }
                                if (i10 < 208) {
                                }
                                if (i10 < 225) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i10 = 131;
                        default:
                    }
                }
                throw th;
            } catch (java.lang.Throwable th11) {
                java.lang.Throwable cause2 = th11.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th11;
            }
        }
        return z2;
    }

    private java.lang.Runnable A() {
        int i;
        com.facetec.sdk.dv dvVar = new com.facetec.sdk.dv(this);
        byte[] bArr = T;
        java.lang.Object[] objArr = new java.lang.Object[1];
        ag((short) 113, (short) 1312, bArr[6], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b2 = bArr[33];
        short s = b2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        ag(s, (short) (s | 1199), b2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 197;
            short s2 = bArr[197];
            char c3 = 'y';
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            ag(s2, (short) (s2 | 1184), bArr[121], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            ag(bArr[4], (short) 1184, bArr[169], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            short s3 = bArr[197];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            ag(s3, (short) (s3 | 1184), bArr[121], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = T;
                short s4 = (short) (-bArr2[155]);
                byte b3 = bArr2[c3];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                ag(s4, (short) (s4 | 1164), b3, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                ag(bArr2[9], (short) 1164, bArr2[3], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                short s5 = bArr2[c2];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                ag(s5, (short) (s5 | 1184), bArr2[121], objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                short s6 = (short) (-bArr2[155]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                ag(s6, (short) (s6 | 1164), bArr2[121], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                ag(bArr2[17], (short) 1158, (byte) (bArr2[121] - 1), objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c2 = 197;
                c3 = 'y';
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                switch (dvVar.c(iArr[i3])) {
                    case -15:
                        i3 = 1;
                    case -14:
                        i4 = 36;
                        i3 = i4;
                    case -13:
                        dvVar.c(19);
                        if (dvVar.f3526a == 0) {
                            i4 = 35;
                        }
                        i3 = i4;
                    case -12:
                        i3 = 15;
                    case -11:
                        i4 = 27;
                        i3 = i4;
                    case -10:
                        dvVar.c(19);
                        if (dvVar.f3526a == 0) {
                            i4 = 26;
                        }
                        i3 = i4;
                    case -9:
                        dvVar.e = 1;
                        dvVar.c(3);
                        dvVar.c(6);
                        O = dvVar.f3526a;
                        i3 = i4;
                    case -8:
                        i = P;
                        dvVar.e = i;
                        dvVar.c(7);
                        i3 = i4;
                    case -7:
                        dvVar.c(15);
                        return (java.lang.Runnable) dvVar.f;
                    case -6:
                        i3 = 28;
                    case -5:
                        i3 = 17;
                    case -4:
                        dvVar.e = 3;
                        dvVar.c(3);
                        dvVar.c(4);
                        java.lang.Object obj = dvVar.f;
                        dvVar.c(6);
                        int i5 = dvVar.f3526a;
                        dvVar.c(6);
                        java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(dvVar.f3526a)};
                        byte[] bArr3 = T;
                        short s7 = bArr3[126];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        ag(s7, (short) (s7 | 1114), bArr3[121], objArr15);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        ag(bArr3[9], (short) 1108, (byte) (bArr3[1178] + 1), objArr16);
                        i = ((java.lang.Integer) cls4.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(obj, objArr14)).intValue();
                        dvVar.e = i;
                        dvVar.c(7);
                        i3 = i4;
                    case -3:
                        dvVar.e = 1;
                        dvVar.c(3);
                        dvVar.c(4);
                        dvVar.i = ((com.facetec.sdk.cn) dvVar.f).G;
                        dvVar.c(1);
                        i3 = i4;
                    case -2:
                        short s8 = T[126];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        ag(s8, (short) (s8 | 1114), r3[121], objArr17);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        ag(r3[9], (short) 1114, (byte) 55, objArr18);
                        dvVar.i = cls5.getMethod((java.lang.String) objArr18[0], null).invoke(null, null);
                        dvVar.c(1);
                        i3 = i4;
                    case -1:
                        i3 = 11;
                    default:
                        i3 = i4;
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        b(new java.lang.Object[]{this}, -636169626, 636169634, com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e(), com.facetec.sdk.fp.c.e());
    }
}
