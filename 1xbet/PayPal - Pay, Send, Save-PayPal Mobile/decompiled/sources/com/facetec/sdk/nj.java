package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nj {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static long f3681a;
    private static int b;
    private static long c;
    private static int j;

    @javax.annotation.Nullable
    public final com.facetec.sdk.mw d;

    @javax.annotation.Nullable
    public final com.facetec.sdk.mx e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$e(byte b2, int i, byte b3) {
        int i2;
        int i3 = 4 - (i * 2);
        int i4 = b2 * 3;
        byte[] bArr = $$c;
        int i5 = b3 + 109;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 = (-i5) + i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                return new java.lang.String(bArr2, 0);
            }
            int i8 = i2 + 1;
            i6 = i5;
            i5 = bArr[i3];
            i7 = i8;
            i5 = (-i5) + i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(short s, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b2 + 97;
        int i3 = s * 4;
        int i4 = (b3 * 3) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            i = 0;
            i4++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i4];
            i4++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i3) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -25, 39, -86};
        $$b = 31;
    }

    static void init$1() {
        $$c = new byte[]{kotlin.io.encoding.Base64.padSymbol, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE};
        $$d = 138;
    }

    private static void g(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hu huVar = new com.facetec.sdk.hu();
        char[] b2 = com.facetec.sdk.hu.b(c ^ 4732878740741522786L, charArray, i);
        huVar.b = 4;
        while (true) {
            $11 = ($10 + 89) % 128;
            if (huVar.b >= b2.length) {
                objArr[0] = new java.lang.String(b2, 4, b2.length - 4);
                return;
            }
            huVar.e = huVar.b - 4;
            int i2 = huVar.b;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(b2[huVar.b] ^ b2[huVar.b % 4]), java.lang.Long.valueOf(huVar.e), java.lang.Long.valueOf(c)};
                java.lang.Object d = com.facetec.sdk.al.d(-474326228);
                if (d == null) {
                    byte b3 = (byte) 0;
                    d = com.facetec.sdk.al.c((char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6935), 2389 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 23, 1146429908, false, $$e(b3, b3, b3), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE});
                }
                b2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) d).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {huVar, huVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(-57140341);
                if (d2 == null) {
                    byte b4 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) android.graphics.Color.alpha(0), 885 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33, 1534550387, false, $$e(b4, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    nj(com.facetec.sdk.mx mxVar, com.facetec.sdk.mw mwVar) {
        this.e = mxVar;
        this.d = mwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r4.j().d == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r0 = com.facetec.sdk.nj.j + 101;
        com.facetec.sdk.nj.b = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if ((r0 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r4.j().c != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        r4 = r4.j().c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r4.j().d == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(com.facetec.sdk.mw mwVar, com.facetec.sdk.mx mxVar) {
        int e = mwVar.e();
        if (e != 200 && e != 410 && e != 414 && e != 501 && e != 203 && e != 204) {
            if (e != 307) {
                if (e != 308 && e != 404 && e != 405) {
                    switch (e) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (mwVar.b(com.google.common.net.HttpHeaders.EXPIRES) == null && mwVar.j().c() == -1) {
                int i = b + 81;
                j = i % 128;
                if (i % 2 == 0) {
                    int i2 = 57 / 0;
                }
                return false;
            }
        }
        if (mwVar.j().d() || mxVar.i().d()) {
            return false;
        }
        int i3 = j + 107;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static void f(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = ($10 + 95) % 128;
        $11 = i2;
        if (str != null) {
            $10 = (i2 + 125) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.facetec.sdk.hv hvVar = new com.facetec.sdk.hv();
        hvVar.d = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        hvVar.c = 0;
        while (hvVar.c < cArr2.length) {
            $10 = ($11 + 71) % 128;
            int i3 = hvVar.c;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[hvVar.c]), hvVar, hvVar};
                java.lang.Object d = com.facetec.sdk.al.d(-1009843105);
                if (d == null) {
                    byte b2 = (byte) 0;
                    d = com.facetec.sdk.al.c((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33464), android.text.TextUtils.indexOf("", "") + 479, 24 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1679851175, false, $$e(b2, b2, (byte) (b2 | com.google.common.base.Ascii.VT)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue() ^ (f3681a ^ 2966223176042272838L);
                java.lang.Object[] objArr3 = {hvVar, hvVar};
                java.lang.Object d2 = com.facetec.sdk.al.d(95517984);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 591, 24 - android.view.KeyEvent.normalizeMetaState(0), -1570895912, false, $$e(b3, b3, (byte) (b3 | 10)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d2).invoke(null, objArr3);
                $11 = ($10 + 61) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        hvVar.c = 0;
        $11 = ($10 + 7) % 128;
        while (hvVar.c < cArr2.length) {
            $11 = ($10 + 95) % 128;
            cArr3[hvVar.c] = (char) jArr[hvVar.c];
            java.lang.Object[] objArr4 = {hvVar, hvVar};
            java.lang.Object d3 = com.facetec.sdk.al.d(95517984);
            if (d3 == null) {
                byte b4 = (byte) 0;
                d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 591, 25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1570895912, false, $$e(b4, b4, (byte) (b4 | 10)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d3).invoke(null, objArr4);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        $10 = ($11 + 7) % 128;
        objArr[0] = str2;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        java.util.Date f3682a;
        java.lang.String b;
        final com.facetec.sdk.mw c;
        final com.facetec.sdk.mx d;
        final long e;
        java.lang.String f;
        long g;
        long h;
        java.util.Date i;
        java.util.Date j;
        java.lang.String k;
        int l;

        public b(long j, com.facetec.sdk.mx mxVar, com.facetec.sdk.mw mwVar) {
            this.l = -1;
            this.e = j;
            this.d = mxVar;
            this.c = mwVar;
            if (mwVar != null) {
                this.h = mwVar.h();
                this.g = mwVar.f();
                com.facetec.sdk.mm c = mwVar.c();
                int e = c.e();
                for (int i = 0; i < e; i++) {
                    java.lang.String a2 = c.a(i);
                    java.lang.String e2 = c.e(i);
                    if (com.google.common.net.HttpHeaders.DATE.equalsIgnoreCase(a2)) {
                        this.f3682a = com.facetec.sdk.ny.c(e2);
                        this.b = e2;
                    } else if (com.google.common.net.HttpHeaders.EXPIRES.equalsIgnoreCase(a2)) {
                        this.j = com.facetec.sdk.ny.c(e2);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.i = com.facetec.sdk.ny.c(e2);
                        this.f = e2;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.k = e2;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.l = com.facetec.sdk.nz.c(e2, -1);
                    }
                }
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        b = 0;
        j = 1;
        f3681a = 7457557130016024064L;
        c = -7782565867751119851L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1730 A[Catch: Exception -> 0x175c, all -> 0x1774, IOException -> 0x177c, TryCatch #14 {Exception -> 0x175c, blocks: (B:341:0x16eb, B:390:0x16ed, B:392:0x16fa, B:393:0x16fb, B:396:0x16fd, B:398:0x170a, B:399:0x170b, B:408:0x172a, B:410:0x1730, B:411:0x1731, B:429:0x1742, B:431:0x1748, B:432:0x1749), top: B:220:0x10d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1731 A[Catch: Exception -> 0x175c, all -> 0x1774, IOException -> 0x177c, TryCatch #14 {Exception -> 0x175c, blocks: (B:341:0x16eb, B:390:0x16ed, B:392:0x16fa, B:393:0x16fb, B:396:0x16fd, B:398:0x170a, B:399:0x170b, B:408:0x172a, B:410:0x1730, B:411:0x1731, B:429:0x1742, B:431:0x1748, B:432:0x1749), top: B:220:0x10d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1748 A[Catch: Exception -> 0x175c, all -> 0x1774, IOException -> 0x177c, TryCatch #14 {Exception -> 0x175c, blocks: (B:341:0x16eb, B:390:0x16ed, B:392:0x16fa, B:393:0x16fb, B:396:0x16fd, B:398:0x170a, B:399:0x170b, B:408:0x172a, B:410:0x1730, B:411:0x1731, B:429:0x1742, B:431:0x1748, B:432:0x1749), top: B:220:0x10d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1749 A[Catch: Exception -> 0x175c, all -> 0x1774, IOException -> 0x177c, TRY_LEAVE, TryCatch #14 {Exception -> 0x175c, blocks: (B:341:0x16eb, B:390:0x16ed, B:392:0x16fa, B:393:0x16fb, B:396:0x16fd, B:398:0x170a, B:399:0x170b, B:408:0x172a, B:410:0x1730, B:411:0x1731, B:429:0x1742, B:431:0x1748, B:432:0x1749), top: B:220:0x10d5 }] */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v32, types: [long] */
    /* JADX WARN: Type inference failed for: r29v33 */
    /* JADX WARN: Type inference failed for: r29v34 */
    /* JADX WARN: Type inference failed for: r30v39 */
    /* JADX WARN: Type inference failed for: r30v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] a(android.content.Context context, int i, int i2, int i3) {
        int i4;
        java.lang.Object[] objArr;
        char c2;
        int i5;
        int i6;
        int i7;
        java.lang.Object[] objArr2;
        int i8;
        java.lang.Object[] objArr3;
        int i9;
        java.lang.Object[] objArr4;
        int i10;
        java.lang.Object[] objArr5;
        int i11;
        char c3;
        java.lang.Object[] objArr6;
        int length;
        java.lang.Object obj;
        java.lang.Object obj2;
        ?? r29;
        java.lang.Object obj3;
        java.lang.String str;
        java.lang.Process exec;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.Object newInstance;
        java.lang.Throwable th2;
        java.lang.Throwable cause2;
        java.lang.Object[] objArr7;
        java.lang.Object d;
        java.lang.Object newInstance2;
        java.lang.Throwable th3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        ?? r27;
        int i12;
        int i13;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object[] objArr8;
        char c4;
        java.lang.Object[] objArr9;
        char c5;
        java.lang.Object[] objArr10;
        char c6;
        int i14;
        int i15;
        java.lang.Object[] objArr11;
        char c7;
        int i16 = i3;
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
        int i17 = (scrollDefaultDelay * (-112)) - 6610352;
        int i18 = ~i;
        int i19 = ~((-59022) | i18);
        int i20 = ((i19 ^ scrollDefaultDelay) | (i19 & scrollDefaultDelay)) * 226;
        int i21 = (i17 ^ i20) + ((i17 & i20) << 1);
        int i22 = ~scrollDefaultDelay;
        int i23 = ~((59021 & i22) | (59021 ^ i22));
        int i24 = ~((i22 ^ i) | (i22 & i));
        int i25 = (i24 ^ i23) | (i23 & i24);
        int i26 = ((-59022) ^ i18) | ((-59022) & i18);
        int i27 = ~((scrollDefaultDelay ^ i26) | (scrollDefaultDelay & i26));
        int i28 = ((i27 ^ i25) | (i27 & i25)) * (-113);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        f("븧墥猸ඓ␝㻮\ud96c\uf3b3詍ꓜ뾪嘽炿ଁ▄㰫훦\uf176讂ꉰ봲垧渴ࢄ⌝㷢푠\ueef0襅ꏑ몉唻澀\u0604", (i21 & i28) + (i28 | i21) + ((~(((-59022) ^ i) | ((-59022) & i))) * 113), objArr12);
        java.lang.String str4 = (java.lang.String) objArr12[0];
        int i29 = -(-android.view.KeyEvent.keyCodeFromString(""));
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        g("弣絊免彇⟚鱜鏗菞\udabbᩰ᧵", (i29 ^ 1) + ((i29 & 1) << 1), objArr13);
        java.lang.String str5 = (java.lang.String) objArr13[0];
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        g("ꚏ⥬⋏ꛥ溔졺\ue057쪐⍽乓橤䒻교쑭\uec3d\udee1㝩娂瘬嬉", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr14);
        java.lang.String str6 = (java.lang.String) objArr14[0];
        try {
            if (context == null) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                f("빩Β압蜺䣹੍찻釰厗ᕣ훞题", 48562 - (~android.text.TextUtils.indexOf("", "", 0)), objArr15);
                java.lang.Object[] objArr16 = {(java.lang.String) objArr15[0]};
                java.lang.Object d2 = com.facetec.sdk.al.d(2084539986);
                if (d2 == null) {
                    char c8 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6934);
                    int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                    byte length2 = (byte) $$a.length;
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    h((byte) 0, length2, (byte) (length2 - 4), objArr17);
                    d2 = com.facetec.sdk.al.c(c8, 2389 - combineMeasuredStates, normalizeMetaState + 23, -607062870, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr16)).longValue();
                long j2 = 708571926;
                long j3 = 988;
                long myPid = android.os.Process.myPid();
                long j4 = -1;
                long j5 = ((j2 ^ j4) | longValue) ^ j4;
                long j6 = longValue ^ j4;
                long j7 = myPid ^ j4;
                long j8 = ((-1975) * j2) + (com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd * longValue) + ((myPid | j5) * j3) + ((-1976) * (((j6 | j2) ^ j4) | ((j7 | j2) ^ j4))) + ((j5 | ((j6 | myPid) ^ j4) | ((j7 | longValue) ^ j4)) * j3) + 263577416;
                int i30 = ((int) (j8 >> 32)) & (((((~((-404718678) | i)) | 1032507733) * (-366)) - 1263677648) + (((~((-1377281) | i)) | 629166336) * 366));
                int i31 = ((int) j8) & (((((~((-1422765822) | r5)) | 1434975064) * (-366)) - 2123418587) + (((~(new java.util.Random().nextInt() | (-4719782))) | 16929024) * 366));
                if (((i30 ^ i31) | (i30 & i31)) != 0) {
                    objArr8 = new java.lang.Object[]{null, new int[]{i ^ 50}, new int[]{i}, new int[1], null};
                    int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i32 = ~maxMemory;
                    int i33 = (((((~((-500931165) | i32)) | 356517904) | (~(180066158 | i32))) * (-1136)) - 2111405883) + (((~((-500931165) | maxMemory)) | (~(180066158 | maxMemory)) | (~((-35652899) | i32))) * (-568)) + (((~(maxMemory | (-356517905))) | (~(i32 | 500931164)) | (~((-180066159) | i32))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
                    int i34 = (((i33 | 16) << 1) - (i33 ^ 16)) + i16;
                    int i35 = i34 << 13;
                    int i36 = (~(i34 & i35)) & (i34 | i35);
                    int i37 = i36 >>> 17;
                    int i38 = (~(i36 & i37)) & (i36 | i37);
                    int i39 = i38 << 5;
                    int[] iArr = (int[]) objArr8[3];
                    int i40 = (~(i38 & i39)) & (i38 | i39);
                    c4 = 0;
                    iArr[0] = i40;
                } else {
                    objArr8 = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[1], null};
                    int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                    int i41 = ((((-48230634) | uptimeMillis) * 376) - 65292587) + (((~((~uptimeMillis) | 184547586)) | (-184547820)) * (-376)) + (((~(uptimeMillis | (-184547587))) | 136317419) * 376);
                    int i42 = (i41 << 1) - i41;
                    int i43 = (i16 & i42) + (i42 | i16);
                    int i44 = (i43 << 13) ^ i43;
                    int i45 = i44 >>> 17;
                    int i46 = (~(i44 & i45)) & (i44 | i45);
                    int i47 = i46 << 5;
                    int[] iArr2 = (int[]) objArr8[3];
                    int i48 = (i46 & (~i47)) | ((~i46) & i47);
                    c4 = 0;
                    iArr2[0] = i48;
                }
                if (((int[]) objArr8[1])[c4] != i) {
                    return objArr8;
                }
                int i49 = -(-(android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                g("\ue69c浲ᔭ\ue6b3鵧豶ힺ㥱挴\u0a44嶊뜉\ued52耭\udbe3ⴕ睦Ḝ䇰꣭\uf19c间켐⛗", (i49 & 1) + (i49 | 1), objArr18);
                java.lang.Object[] objArr19 = {(java.lang.String) objArr18[0]};
                java.lang.Object d3 = com.facetec.sdk.al.d(2084539986);
                if (d3 == null) {
                    char minimumFlingVelocity = (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6935);
                    int argb = android.graphics.Color.argb(0, 0, 0, 0);
                    int defaultSize = android.view.View.getDefaultSize(0, 0);
                    byte length3 = (byte) $$a.length;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    h((byte) 0, length3, (byte) (length3 - 4), objArr20);
                    d3 = com.facetec.sdk.al.c(minimumFlingVelocity, argb + 2389, defaultSize + 23, -607062870, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr19)).longValue();
                long j9 = 550112385;
                long j10 = -500;
                long j11 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                long j12 = longValue2 ^ j4;
                long j13 = j9 ^ j4;
                long j14 = i;
                long j15 = (j10 * j9) + (j10 * longValue2) + ((((j12 | j9) ^ j4) | (((j13 | longValue2) | j14) ^ j4)) * j11) + (1002 * ((j12 | j13) ^ j4)) + (j11 * ((longValue2 | ((j14 ^ j4) | j13)) ^ j4)) + 422036957;
                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                int i50 = ((int) (j15 >> 32)) & (((~(754974719 | elapsedCpuTime)) * (-301)) + 1633796358 + (((~((-754612220) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 682614191))) * (-301)) + (((~(elapsedCpuTime | (-682614192))) | (-754612220)) * 301));
                int myUid = android.os.Process.myUid();
                int i51 = ((int) j15) & ((((~((-744538785) | (~myUid))) | (~(2113202101 | myUid))) * (-272)) + 217499173 + (((~((-2095105698) | myUid)) | 1350566913) * (-272)) + (((~(myUid | 2095105697)) | 762635188) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                if (((i51 ^ i50) | (i50 & i51)) != 0) {
                    objArr9 = new java.lang.Object[]{null, new int[]{(~(i & 60)) & (i | 60)}, new int[]{i}, new int[]{r1}, null};
                    int i52 = ((~(303310683 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1914696837 + ((i18 | (-17553537)) * (-216)) + (((~(i18 | 303310683)) | 17554322) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
                    int i53 = ((i52 | 16) << 1) - (i52 ^ 16);
                    int i54 = (i16 & i53) + (i53 | i16);
                    int i55 = i54 << 13;
                    int i56 = (i54 & (~i55)) | ((~i54) & i55);
                    int i57 = i56 >>> 17;
                    int i58 = (~(i56 & i57)) & (i56 | i57);
                    int i59 = i58 << 5;
                    int i60 = (~(i58 & i59)) & (i58 | i59);
                    c5 = 0;
                } else {
                    objArr9 = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[]{r1}, null};
                    int i61 = (i16 - (~(-(-(((((((~(i18 | 408713758)) | (-729578765)) | (~((-408713759) | i))) * (-564)) - 1725990863) + ((~((-140277773) | i)) * 1128)) + (((~(i18 | (-729578765))) | 268435986) * 564)))))) - 1;
                    int i62 = i61 << 13;
                    int i63 = (i61 & (~i62)) | ((~i61) & i62);
                    int i64 = i63 ^ (i63 >>> 17);
                    int i65 = i64 << 5;
                    int i66 = (~(i64 & i65)) & (i64 | i65);
                    c5 = 0;
                }
                if (((int[]) objArr9[1])[c5] != i) {
                    return objArr9;
                }
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                f("빩貯\udb3d⦕琓䊨酬\udffc⩚磒䟫鈪\ue0b5⼂緞䡢雴\ue574㏔縟䴣鮹\ue63c㒟̑凪鱰\ueab6㥜ߙ劳ꄊ\uef82㨊࢈坠", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12940, objArr21);
                java.lang.Object[] objArr22 = {(java.lang.String) objArr21[c5]};
                java.lang.Object d4 = com.facetec.sdk.al.d(1873189073);
                if (d4 == null) {
                    char c9 = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6934);
                    int myTid = android.os.Process.myTid();
                    int indexOf = android.text.TextUtils.indexOf("", "", 0);
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 3);
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    h(b2, b3, (byte) (b3 - 3), objArr23);
                    d4 = com.facetec.sdk.al.c(c9, 2389 - (myTid >> 22), indexOf + 23, -934682071, false, (java.lang.String) objArr23[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) d4).invoke(null, objArr22)).longValue();
                long j16 = 498688093;
                long j17 = 449;
                long j18 = ((j16 ^ j4) | longValue3) ^ j4;
                long j19 = longValue3 ^ j4;
                long uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                long j20 = (450 * j16) + ((-448) * longValue3) + ((j18 | (((j19 | j16) | uptimeMillis2) ^ j4)) * j17) + ((-1347) * j18) + (j17 * ((((j19 | (uptimeMillis2 ^ j4)) | j16) ^ j4) | j18)) + 438391550;
                int i67 = ((int) (j20 >> 32)) & ((((~(i18 | (-1073775105))) | (~((-822742039) | i))) * 988) + 818197478 + (((~(961223742 | i)) | (-2034998847) | (~(i18 | (-822742039)))) * 988));
                int i68 = ~android.os.Process.myPid();
                int i69 = ((int) j20) & ((((~(r3 | 427922083)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 55220819) + ((2141977327 | i68) * (-216)) + (((~(i68 | 427922083)) | (-1865148494)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                if (((i67 ^ i69) | (i67 & i69)) != 0) {
                    objArr10 = new java.lang.Object[]{null, new int[]{(~(i & 80)) & (i | 80)}, new int[]{i}, new int[1], null};
                    int i70 = ((((~(86449613 | i)) | 407314619) * (-366)) - 1093793175) + (((~(493305343 | i)) | 458889) * 366);
                    int d5 = com.facetec.sdk.ou.d();
                    int i71 = -(-(i70 * (-375)));
                    int i72 = (i71 & (-6000)) + (i71 | (-6000));
                    int i73 = ~i70;
                    int i74 = (~((i73 ^ (-17)) | (i73 & (-17)))) | d5;
                    int i75 = ~(i70 | 16);
                    int i76 = ((i74 ^ i75) | (i74 & i75)) * 376;
                    int i77 = (i72 ^ i76) + ((i76 & i72) << 1);
                    int i78 = ~d5;
                    int i79 = ~((i78 ^ 16) | (i78 & 16));
                    int i80 = ~((i70 ^ 16) | (i70 & 16));
                    int i81 = -(-(((i79 ^ i80) | (i79 & i80)) * (-376)));
                    int i82 = ~((d5 ^ (-17)) | (d5 & (-17)));
                    int i83 = (i77 & i81) + (i81 | i77) + (((i70 ^ i82) | (i82 & i70)) * 376);
                    int i84 = (i3 & i83) + (i3 | i83);
                    int i85 = i84 ^ (i84 << 13);
                    int i86 = i85 ^ (i85 >>> 17);
                    int i87 = i86 << 5;
                    int[] iArr3 = (int[]) objArr10[3];
                    int i88 = (i86 & (~i87)) | ((~i86) & i87);
                    c6 = 0;
                    iArr3[0] = i88;
                } else {
                    objArr10 = new java.lang.Object[]{null, new int[]{i}, new int[]{i}, new int[]{r1}, null};
                    int i89 = ((((~((-226259864) | i)) | (~(i18 | 94605142))) * (-1808)) - 922351499) + (((~((-85984023) | i)) | (~(i18 | 234880983))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-94605143) | i)) | 140275841 | (~(i18 | 226259863))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                    int i90 = -(-(i89 * (-475)));
                    int i91 = ~((i89 ^ (-1)) | i89);
                    int i92 = ~i89;
                    int i93 = ~((i92 & i) | (i92 ^ i));
                    int i94 = ((((i90 + (((i91 ^ i93) | (i91 & i93)) * (-476))) - (~(-(-(i93 * 952))))) - 1) - (~(-(-((~((i92 ^ i18) | (i92 & i18))) * 476))))) - 1;
                    int i95 = ((i3 | i94) << 1) - (i94 ^ i3);
                    int i96 = i95 << 13;
                    int i97 = (i95 & (~i96)) | ((~i95) & i96);
                    int i98 = i97 >>> 17;
                    int i99 = (~(i97 & i98)) & (i97 | i98);
                    int i100 = i99 << 5;
                    int i101 = (i99 & (~i100)) | ((~i99) & i100);
                    c6 = 0;
                }
                if (((int[]) objArr10[1])[c6] != i) {
                    return objArr10;
                }
                int i102 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                f("빩薕쥉ഗ僻铺\ud868ᰦ掊Ꝉ\ueb4f\u2ef8犽뙠頻솜՚䤎賶킶ᐤ堤龒\ue353✜櫶꺹\uf26f㙬継䅁蔎죊\u0cff偻鐳\udb9bὖ按Ꚉ\ueaa8\u2e64", (i102 & 15288) + (i102 | 15288), objArr24);
                java.lang.Object[] objArr25 = {(java.lang.String) objArr24[0]};
                java.lang.Object d6 = com.facetec.sdk.al.d(1873189073);
                if (d6 == null) {
                    char resolveSize = (char) (android.view.View.resolveSize(0, 0) + 6935);
                    int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                    long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 3);
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    h(b4, b5, (byte) (b5 - 3), objArr26);
                    d6 = com.facetec.sdk.al.c(resolveSize, 2389 - (keyRepeatDelay >> 16), 24 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), -934682071, false, (java.lang.String) objArr26[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) d6).invoke(null, objArr25)).longValue();
                long j21 = 614988092;
                long j22 = j21 ^ j4;
                long j23 = (((int) java.lang.Runtime.getRuntime().totalMemory()) | longValue4) ^ j4;
                long j24 = ((-109) * j21) + (111 * longValue4) + ((-220) * (j22 | j23)) + (com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE * (j23 | ((j21 | longValue4) ^ j4))) + (110 * (((j22 | longValue4) ^ j4) | ((j21 | (longValue4 ^ j4)) ^ j4))) + 322091551;
                int i103 = (int) java.lang.Runtime.getRuntime().totalMemory();
                int i104 = ((int) (j24 >> 32)) & ((((~((-260393853) | i103)) | 100993580) * 336) + 501358106 + (((~(1176832558 | i103)) | (-1336232831)) * (-168)) + (((~((~i103) | 1176832558)) | (-260393853)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i105 = ((int) j24) & (((~(2109734651 | freeMemory)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1705707304 + (((~((~freeMemory) | 2109734651)) | 537399297) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
                if (((i104 ^ i105) | (i104 & i105)) != 0) {
                    i14 = i;
                    objArr11 = new java.lang.Object[]{null, new int[]{(~(i14 & 90)) & (i14 | 90)}, new int[]{i14}, new int[]{(r1 & (~r5)) | r8}, null};
                    int i106 = -(-((((~(i18 | (-983023412))) | 411042610) * (-241)) + 1541293303 + (((~(i18 | (-571980802))) | (-1073201016)) * 241) + 16));
                    i15 = i3;
                    int i107 = ((i15 | i106) << 1) - (i106 ^ i15);
                    int i108 = i107 << 13;
                    int i109 = ((~i108) & i107) | ((~i107) & i108);
                    int i110 = i109 >>> 17;
                    int i111 = (i109 & (~i110)) | ((~i109) & i110);
                    int i112 = i111 << 5;
                    int i113 = (~i111) & i112;
                    c7 = 0;
                } else {
                    i14 = i;
                    i15 = i3;
                    objArr11 = new java.lang.Object[]{null, new int[]{i14}, new int[]{i14}, new int[]{r1}, null};
                    int i114 = -(-((((~(i18 | (-536871951))) | (~((-455170) | i14)) | (~(753334063 | i14))) * 765) + 933886433 + (((~(i18 | (-537327120))) | 536871950) * 1530) + (((~((-537327120) | i14)) | (~(i18 | 753334063))) * 765)));
                    int i115 = ((i15 | i114) << 1) - (i114 ^ i15);
                    int i116 = i115 << 13;
                    int i117 = (~(i116 & i115)) & (i116 | i115);
                    int i118 = i117 >>> 17;
                    int i119 = (~(i117 & i118)) & (i117 | i118);
                    int i120 = i119 ^ (i119 << 5);
                    c7 = 0;
                }
                if (((int[]) objArr11[1])[c7] != i14) {
                    return objArr11;
                }
                int i121 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                f("빩꿲鶐譖來\ue73a퓎슘ズḱఘ緔毾妺䝆땗ꌥ郏", ((i121 | 4561) << 1) - (i121 ^ 4561), objArr27);
                java.lang.Object[] objArr28 = {(java.lang.String) objArr27[0]};
                java.lang.Object d7 = com.facetec.sdk.al.d(1873189073);
                if (d7 == null) {
                    char mirror = (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6887);
                    int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                    int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 3);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    h(b6, b7, (byte) (b7 - 3), objArr29);
                    d7 = com.facetec.sdk.al.c(mirror, offsetAfter + 2389, 23 - (pressedStateDuration >> 16), -934682071, false, (java.lang.String) objArr29[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) d7).invoke(null, objArr28)).longValue();
                long j25 = 132757040;
                long j26 = -751;
                long j27 = j25 ^ j4;
                long j28 = longValue5 ^ j4;
                long myTid2 = android.os.Process.myTid();
                long j29 = j27 | longValue5;
                long j30 = (j26 * j25) + (j26 * longValue5) + ((((j27 | j28) ^ j4) | ((j27 | myTid2) ^ j4)) * 1504) + ((-1504) * ((myTid2 | j29) ^ j4)) + (752 * (((j28 | j25) ^ j4) | (j4 ^ j29))) + 804322603;
                int i122 = ((int) (j30 >> 32)) & (((((~(i18 | 1765496239)) | (~((-1092244646) | i14))) * (-272)) - 122078454) + (((~(1629115823 | i14)) | 136380416) * (-272)) + (((~((-1629115824) | i14)) | (-1228625062)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                int i123 = ~(384801045 | i14);
                int i124 = ((int) j30) & ((((-2130706368) | i123) * (-814)) + 331503183 + ((i123 | (~(i18 | 1822027455)) | 76122133) * 407) + (((~((-384801046) | i14)) | 76122133 | (~((-1822027456) | i14))) * 407));
                if (((i124 ^ i122) | (i122 & i124)) == 0) {
                    java.lang.Object[] objArr30 = {null, new int[]{i14}, new int[]{i14}, new int[1], null};
                    int i125 = (int) java.lang.Runtime.getRuntime().totalMemory();
                    int i126 = ((((~(527424541 | r4)) | (~((-848289548) | i125))) * (-370)) - 1218167433) + (((~(i125 | 527424541)) | (~((~i125) | (-848289548))) | 224395284) * (-370)) + 1421876456;
                    int d8 = com.facetec.sdk.ou.d();
                    int i127 = -(-(i126 * (-271)));
                    int i128 = ~i126;
                    int i129 = i128 | (i128 ^ (-1));
                    int i130 = ~d8;
                    int i131 = ~((i129 ^ i130) | (i129 & i130));
                    int i132 = ~((i126 ^ d8) | (i126 & d8));
                    int i133 = ~((i126 ^ (-1)) | i126);
                    int i134 = ~(d8 | (d8 ^ (-1)));
                    int i135 = ((((i127 << 1) - i127) + (((i131 & i132) | (i131 ^ i132)) * (-272))) - (~(-(-(((i134 ^ i133) | (i133 & i134)) * (-272)))))) - 1;
                    int i136 = ((i130 & i126) | (i126 ^ i130)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
                    int i137 = -(-((i135 & i136) + (i136 | i135)));
                    int i138 = ((i15 | i137) << 1) - (i137 ^ i15);
                    int i139 = i138 << 13;
                    int i140 = (~(i139 & i138)) & (i139 | i138);
                    int i141 = i140 ^ (i140 >>> 17);
                    int i142 = i141 << 5;
                    ((int[]) objArr30[3])[0] = (i141 & (~i142)) | ((~i141) & i142);
                    return objArr30;
                }
                java.lang.Object[] objArr31 = {null, new int[]{(i14 & (-101)) | (i18 & 100)}, new int[]{i14}, new int[1], null};
                int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
                int i143 = ((((~((-960080124) | r4)) | (~(639215117 | r4))) * (-867)) - 662049900) + (((~((-960080124) | uptimeMillis3)) | 421529842 | (~(639215117 | uptimeMillis3))) * (-1734)) + (((~(uptimeMillis3 | (-538550282))) | (~((~uptimeMillis3) | (-421529843))) | (~(1060744959 | uptimeMillis3))) * 867);
                int i144 = (i143 ^ 16) + ((i143 & 16) << 1);
                int d9 = com.facetec.sdk.ou.d();
                int i145 = i144 * 141;
                int i146 = i15 * (-139);
                int i147 = ~i144;
                int i148 = ~((i147 ^ i15) | (i147 & i15));
                int i149 = ~((i147 & d9) | (i147 ^ d9));
                int i150 = (i145 ^ i146) + ((i145 & i146) << 1) + (((i148 & i149) | (i148 ^ i149)) * (-280));
                int i151 = ~i15;
                int i152 = ~((i151 & d9) | (i151 ^ d9));
                int i153 = -(-(((i152 ^ i149) | (i152 & i149)) * 140));
                int i154 = (i147 ^ i151) | (i147 & i151);
                int i155 = ~((i154 ^ d9) | (i154 & d9));
                int i156 = ~d9;
                int i157 = (i147 ^ i156) | (i147 & i156);
                int i158 = ~((i15 ^ i157) | (i15 & i157));
                int i159 = (i158 ^ i155) | (i158 & i155);
                int i160 = i156 | i151;
                int i161 = ~((i144 ^ i160) | (i144 & i160));
                int i162 = (((i150 | i153) << 1) - (i153 ^ i150)) + (((i161 ^ i159) | (i161 & i159)) * 140);
                int i163 = i162 << 13;
                int i164 = ((~i163) & i162) | ((~i162) & i163);
                int i165 = i164 >>> 17;
                int i166 = (~(i164 & i165)) & (i164 | i165);
                int i167 = i166 << 5;
                ((int[]) objArr31[3])[0] = (i166 & (~i167)) | ((~i166) & i167);
                return objArr31;
            }
            int i168 = i;
            try {
                int i169 = -android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                f("븧蚟콌ᐑ峵ꖼ\uea68㍩箝䁆褎퇯ᚷ彣ꐰ\uecd1㕵税䋶讧큯\u193d憈", (i169 & 14519) + (i169 | 14519), objArr32);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr32[0]);
                int i170 = -(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                g("\ueca3넟ᆫ\uecc4멝倍팱Ṩ椞혯夊遽\ue77c展\udf43ਡ絚쉱", (i170 & 1) + (i170 | 1), objArr33);
                java.lang.String str7 = (java.lang.String) cls.getMethod((java.lang.String) objArr33[0], null).invoke(context, null);
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                f("븧蚟콌ᐑ峵ꖼ\uea68㍩箝䁆褎퇯ᚷ彣ꐰ\uecd1㕵税䋶讧큯\u193d憈", android.view.View.getDefaultSize(0, 0) + 14519, objArr34);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                int i171 = -android.graphics.Color.rgb(0, 0, 0);
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                g("鮟㴒䙷鯸痏\udc00蓭퇫ḳ娱໑忧遄큜袥얻\u0a64乷ኼ䁘貉얚", ((-16777215) ^ i171) + ((i171 & (-16777215)) << 1), objArr35);
                java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr35[0], null).invoke(context, null);
                int indexOf2 = ((java.lang.String) java.lang.Class.forName(str4).getField(str5).get(invoke)).indexOf(str7);
                if (indexOf2 > 0) {
                    java.lang.String str8 = (java.lang.String) java.lang.Class.forName(str4).getField(str5).get(invoke);
                    int length4 = str8.length();
                    int d10 = com.facetec.sdk.ou.d();
                    int i172 = ~length4;
                    int i173 = ~d10;
                    int i174 = (length4 ^ (-16)) | (length4 & (-16));
                    int i175 = i173 & i172;
                    ?? r26 = i174 ^ d10;
                    int i176 = (((length4 * 832) + 13280) - (~(((~(r26 | (i174 & d10))) | (~((i172 ^ i173) | (i175 == true ? 1 : 0)))) * (-831)))) - 1;
                    int i177 = -(-((~(i172 | (-16) | d10)) * (-1662)));
                    int i178 = (i176 & i177) + (i177 | i176);
                    int i179 = ~((i173 ^ 15) | (i173 & 15));
                    int i180 = ~(d10 | (-16));
                    int i181 = ((i179 & i180) | (i179 ^ i180) | (~(length4 | d10))) * 831;
                    int i182 = (i178 ^ i181) + ((i181 & i178) << 1);
                    if (i182 >= 0) {
                        int i183 = 0;
                        r26 = r26;
                        i175 = i175;
                        while (i183 <= i182) {
                            java.lang.Object[] objArr36 = {str8.substring(i183, i183 + 16), 931995};
                            java.lang.Object d11 = com.facetec.sdk.al.d(-582857820);
                            if (d11 == null) {
                                char lastIndexOf = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
                                int blue = android.graphics.Color.blue(0);
                                byte b8 = (byte) 0;
                                byte b9 = (byte) (b8 + 3);
                                i13 = i182;
                                str2 = str6;
                                str3 = str8;
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                h(b8, b9, (byte) (b9 - 3), objArr37);
                                ?? r30 = (elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) + 2364;
                                d11 = com.facetec.sdk.al.c(lastIndexOf, r30 == true ? 1 : 0, blue + 24, 2058170716, false, (java.lang.String) objArr37[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                obj2 = r30;
                            } else {
                                i13 = i182;
                                str2 = str6;
                                str3 = str8;
                                obj2 = obj2;
                            }
                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) d11).invoke(null, objArr36)).longValue();
                            int i184 = indexOf2;
                            long j31 = -217031695;
                            long j32 = -495;
                            java.lang.String str9 = str5;
                            int i185 = i183;
                            long j33 = -1;
                            long j34 = j31 ^ j33;
                            java.lang.Object obj6 = invoke;
                            long j35 = i168;
                            r29 = ((j34 | (longValue6 ^ j33)) ^ j33) | ((j34 | j35) ^ j33);
                            long j36 = (j32 * j31) + (j32 * longValue6) + (992 * r29) + ((-496) * (r29 | (((j31 | (j35 ^ j33)) | longValue6) ^ j33))) + (496 * (longValue6 | j35)) + 1376229093;
                            int i186 = ((int) (j36 >> 32)) & (((((-4457473) | r4) * (-381)) - 328815318) + (((~((~((int) android.os.SystemClock.elapsedRealtime())) | (-1414278763))) | (-38098305)) * 381) + 1698296832);
                            int i187 = i18 | 983471936;
                            int i188 = ((int) j36) & ((i187 * 495) + 1378283332 + (((~i187) | 714478336) * 495));
                            if (((i188 ^ i186) | (i186 & i188)) == -725904754) {
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(str4).getField(str9).get(obj6);
                                ((int[]) objArr[2])[0] = i168;
                                ((int[]) objArr[1])[0] = i168 ^ 20;
                                objArr = new java.lang.Object[]{str10, new int[1], new int[1], new int[1], null};
                                int maxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i189 = (((~(419224299 | maxMemory2)) | 83887380 | (~((-98359294) | maxMemory2))) * (-744)) + 2115469861 + (((~maxMemory2) | 404752386) * 744) + ((maxMemory2 | (-83887381)) * 744);
                                int i190 = ~(-(-(((i189 | 16) << 1) - (i189 ^ 16))));
                                i16 = i3;
                                int i191 = (i16 - i190) - 1;
                                int i192 = i191 << 13;
                                int i193 = (~(i191 & i192)) & (i191 | i192);
                                int i194 = i193 >>> 17;
                                int i195 = (i193 & (~i194)) | ((~i193) & i194);
                                int i196 = i195 << 5;
                                ((int[]) objArr[3])[0] = (~(i195 & i196)) & (i195 | i196);
                                break;
                            }
                            i16 = i3;
                            str5 = str9;
                            invoke = obj6;
                            i183 = (i185 ^ (-118)) + ((i185 & (-118)) << 1) + 119;
                            indexOf2 = i184;
                            i182 = i13;
                            str8 = str3;
                            str6 = str2;
                            r26 = str9;
                            i175 = i185;
                        }
                    }
                    int i197 = indexOf2;
                    java.lang.String str11 = str6;
                    java.lang.String str12 = (java.lang.String) java.lang.Class.forName(str4).getField(str5).get(invoke);
                    int length5 = str12.length();
                    int d12 = com.facetec.sdk.ou.d();
                    int i198 = length5 * 949;
                    int i199 = ~length5;
                    int i200 = (i199 & 5) | (i199 ^ 5);
                    int i201 = ~d12;
                    int i202 = (i198 ^ 5682) + ((i198 & 5682) << 1) + (((~((d12 & i199) | (i199 ^ d12))) | 5) * (-948)) + ((~((i200 & i201) | (i200 ^ i201))) * (-948));
                    int i203 = -(-(((i199 ^ (-6)) | (i199 & (-6))) * 948));
                    int i204 = (i202 & i203) + (i203 | i202);
                    if (i204 >= 0) {
                        int i205 = 0;
                        i175 = i175;
                        r29 = r29;
                        obj2 = obj2;
                        while (i205 <= i204) {
                            java.lang.Object[] objArr38 = {str12.substring(i205, (i205 & 6) + (i205 | 6)), 931995};
                            java.lang.Object d13 = com.facetec.sdk.al.d(-582857820);
                            if (d13 == null) {
                                char c10 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                float maxVolume = android.media.AudioTrack.getMaxVolume();
                                byte b10 = (byte) 0;
                                byte b11 = (byte) (b10 + 3);
                                r27 = str12;
                                i12 = i204;
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                h(b10, b11, (byte) (b11 - 3), objArr39);
                                d13 = com.facetec.sdk.al.c(c10, packedPositionGroup + 2365, 25 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), 2058170716, false, (java.lang.String) objArr39[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                            } else {
                                r27 = str12;
                                i12 = i204;
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) d13).invoke(null, objArr38)).longValue();
                            long j37 = 185061769;
                            java.lang.Object obj7 = invoke;
                            long j38 = 433;
                            java.lang.String str13 = str5;
                            ?? r302 = i205;
                            long j39 = -1;
                            long j40 = j37 ^ j39;
                            java.lang.String str14 = str4;
                            long j41 = i168;
                            long j42 = ((-432) * j37) + (434 * longValue7) + ((((j40 | (j41 ^ j39)) | longValue7) ^ j39) * j38) + ((-433) * (j40 | (((longValue7 ^ j39) | j41) ^ j39))) + ((((j40 | j41) ^ j39) | ((longValue7 | j37) ^ j39)) * j38) + 974135629;
                            int maxMemory3 = (int) java.lang.Runtime.getRuntime().maxMemory();
                            if (((((int) j42) & (((((~(823591839 | r4)) | 2034149046) * (-328)) - 474340079) + ((2034149046 | maxMemory3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(maxMemory3 | (-823591840))) | 823526038 | (~((~maxMemory3) | 2034214847))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) (j42 >> 32)) & ((((~(1034451087 | i168)) | 99600) * (-140)) + 169595890 + ((~(1034550687 | i168)) * 70) + (((~(402775323 | i168)) | 631874964) * 70)))) == -2096167706) {
                                java.lang.String str15 = (java.lang.String) java.lang.Class.forName(str14).getField(str13).get(obj7);
                                ((int[]) objArr[2])[0] = i168;
                                ((int[]) objArr[1])[0] = (~(i168 & 20)) & (i168 | 20);
                                objArr = new java.lang.Object[]{str15, new int[1], new int[1], new int[1], null};
                                int myUid2 = android.os.Process.myUid();
                                int i206 = ((((~((-651737297) | r3)) | (~((-330872291) | myUid2))) * com.visa.cbp.getCertUsage.getODAData) - 470612637) + (((~(myUid2 | (-651737297))) | (~((~myUid2) | (-330872291)))) * com.visa.cbp.getCertUsage.getODAData);
                                int i207 = i206 * (-622);
                                int i208 = ~i206;
                                int i209 = (i208 & 16) | (i208 ^ 16);
                                int i210 = (((i207 ^ 9984) + ((i207 & 9984) << 1)) - (~(-(-((~((i209 ^ i168) | (i209 & i168))) * 623))))) - 1;
                                int i211 = ~((i206 & (-17)) | (i206 ^ (-17)));
                                int i212 = ((i18 ^ i211) | (i18 & i211)) * (-623);
                                int i213 = (i210 & i212) + (i212 | i210);
                                int i214 = ~i209;
                                int i215 = ~(i208 | i168);
                                int i216 = (i214 ^ i215) | (i214 & i215);
                                int i217 = ~((i168 ^ 16) | (i168 & 16));
                                int i218 = ((i216 ^ i217) | (i216 & i217)) * 623;
                                int i219 = -(-(((i213 | i218) << 1) - (i218 ^ i213)));
                                i16 = i3;
                                int i220 = (i16 & i219) + (i219 | i16);
                                int i221 = i220 << 13;
                                int i222 = (~(i221 & i220)) & (i221 | i220);
                                int i223 = i222 >>> 17;
                                int i224 = (~(i222 & i223)) & (i222 | i223);
                                int i225 = i224 << 5;
                                ((int[]) objArr[3])[0] = (i224 & (~i225)) | ((~i224) & i225);
                                break;
                            }
                            i16 = i3;
                            str5 = str13;
                            int i226 = (((r302 == true ? 1 : 0) | (-79)) << 1) - ((r302 == true ? 1 : 0) ^ (-79));
                            i205 = (i226 & 80) + (i226 | 80);
                            invoke = obj7;
                            str12 = r27;
                            str4 = str14;
                            i204 = i12;
                            i175 = r27;
                            r29 = str13;
                            obj2 = r302;
                        }
                    }
                    java.lang.String str16 = str4;
                    java.lang.Object obj8 = invoke;
                    int i227 = 0;
                    java.lang.String substring = ((java.lang.String) java.lang.Class.forName(str16).getField(str5).get(obj8)).substring(0, i197);
                    int i228 = -(-android.graphics.Color.green(0));
                    int i229 = 1;
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    g("ㅫ\udb8c㸸ㅄ∔", ((i228 | 1) << 1) - (i228 ^ 1), objArr40);
                    java.lang.String[] split = substring.split((java.lang.String) objArr40[0]);
                    int length6 = split.length;
                    int i230 = 0;
                    java.lang.String[] strArr = r26;
                    int i231 = i175;
                    int i232 = r29;
                    java.lang.Object obj9 = obj2;
                    loop4: while (i230 < length6) {
                        java.lang.String str17 = split[i230];
                        java.lang.Object[] objArr41 = new java.lang.Object[i229];
                        f("븝煱\u2029", android.graphics.Color.alpha(i227) + 53017, objArr41);
                        if (str17.split((java.lang.String) objArr41[i227]).length > i229) {
                            obj3 = (java.lang.Class) com.facetec.sdk.al.b((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1436 - android.view.View.MeasureSpec.getMode(i227), 23 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            synchronized (obj3) {
                                try {
                                    try {
                                        try {
                                            int deadChar = android.view.KeyEvent.getDeadChar(i227, i227);
                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                            f("븶\ued36ᡜ䝽\uf25b↤䲜ﮭ⛞刢脇Ⱂ孻虘㖵悆", (deadChar ^ 21277) + ((deadChar & 21277) << 1), objArr42);
                                            str = (java.lang.String) objArr42[0];
                                            try {
                                                try {
                                                    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                    g("⬚囏\ud8ec⭩[럐", 1 - (android.os.Process.myPid() >> 22), objArr43);
                                                    exec = runtime.exec((java.lang.String) objArr43[0], (java.lang.String[]) null, (java.io.File) null);
                                                    try {
                                                        java.lang.Object[] objArr44 = {exec.getInputStream()};
                                                        java.lang.Object d14 = com.facetec.sdk.al.d(1647730903);
                                                        if (d14 == null) {
                                                            try {
                                                                strArr = split;
                                                                try {
                                                                    i231 = length6;
                                                                    try {
                                                                        d14 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", "", 0, 0), 1340 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.getCapsMode("", 0, 0) + 24, -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                                    } catch (java.lang.Throwable th4) {
                                                                        th = th4;
                                                                        th = th;
                                                                        cause = th.getCause();
                                                                        if (cause != null) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                    th = th;
                                                                    cause = th.getCause();
                                                                    if (cause != null) {
                                                                    }
                                                                }
                                                            } catch (java.lang.Throwable th6) {
                                                                th = th6;
                                                            }
                                                        } else {
                                                            strArr = split;
                                                            i231 = length6;
                                                        }
                                                        try {
                                                            newInstance = ((java.lang.reflect.Constructor) d14).newInstance(objArr44);
                                                        } catch (java.lang.Throwable th7) {
                                                            th = th7;
                                                            th = th;
                                                            cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (java.lang.Exception unused) {
                                                }
                                            } catch (java.lang.Exception unused2) {
                                            }
                                        } catch (java.io.IOException unused3) {
                                            strArr = split;
                                            i231 = length6;
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        th = th9;
                                        obj9 = obj3;
                                    }
                                } catch (java.io.IOException unused4) {
                                }
                                try {
                                    try {
                                        objArr7 = new java.lang.Object[]{exec.getErrorStream()};
                                        d = com.facetec.sdk.al.d(1647730903);
                                        if (d == null) {
                                            try {
                                                i232 = i230;
                                                try {
                                                    d = com.facetec.sdk.al.c((char) android.view.View.resolveSize(0, 0), 1340 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 24, -975627729, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                } catch (java.lang.Throwable th10) {
                                                    th = th10;
                                                    th2 = th;
                                                    cause2 = th2.getCause();
                                                    if (cause2 == null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th11) {
                                                th = th11;
                                            }
                                        } else {
                                            i232 = i230;
                                        }
                                    } catch (java.lang.Throwable th12) {
                                        th = th12;
                                    }
                                    try {
                                        newInstance2 = ((java.lang.reflect.Constructor) d).newInstance(objArr7);
                                    } catch (java.lang.Throwable th13) {
                                        th = th13;
                                        th2 = th;
                                        cause2 = th2.getCause();
                                        if (cause2 == null) {
                                        }
                                    }
                                } catch (java.io.IOException unused5) {
                                    obj9 = obj3;
                                    i232 = i230;
                                    strArr = strArr;
                                    i231 = i231;
                                    obj3 = obj8;
                                    i230 = ((i232 | 1) << 1) - (i232 ^ 1);
                                    obj8 = obj3;
                                    split = strArr;
                                    length6 = i231;
                                    i229 = 1;
                                    i227 = 0;
                                    strArr = strArr;
                                    i231 = i231;
                                    i232 = i232;
                                    obj9 = obj9;
                                } catch (java.lang.Exception unused6) {
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    g("ٶ폇ⵔذ㨬㋑\uefd3鸥菏듰斾မඡ㻈\ue391詃鞇ꂭ禢ྰᄦ⭁\uf72a膉魈굫䴍篸┭휫쭬", android.view.View.getDefaultSize(0, 0) + 1, objArr45);
                                    throw new java.io.IOException((java.lang.String) objArr45[0]);
                                }
                                try {
                                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                    try {
                                        java.lang.Class<?> cls3 = java.lang.Class.forName(str11);
                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                        f("븵朁ు㖭\udafe", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55602, objArr46);
                                        cls3.getMethod((java.lang.String) objArr46[0], null).invoke(newInstance, null);
                                        try {
                                            java.lang.Class<?> cls4 = java.lang.Class.forName(str11);
                                            int i233 = -android.view.View.getDefaultSize(0, 0);
                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                            f("븵朁ు㖭\udafe", (i233 ^ 55603) + ((i233 & 55603) << 1), objArr47);
                                            cls4.getMethod((java.lang.String) objArr47[0], null).invoke(newInstance2, null);
                                            try {
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                sb.append(str);
                                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                f("빌", android.graphics.Color.alpha(0) + 58441, objArr48);
                                                sb.append((java.lang.String) objArr48[0]);
                                                java.lang.String obj10 = sb.toString();
                                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                f("븓\ue0efϺꊜ얊", 24317 - (~(-(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr49);
                                                dataOutputStream.write(obj10.getBytes((java.lang.String) objArr49[0]));
                                                dataOutputStream.flush();
                                                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength() >> 16;
                                                int d15 = com.facetec.sdk.ou.d();
                                                int i234 = fadingEdgeLength * 71;
                                                int i235 = ~fadingEdgeLength;
                                                int i236 = ~((i235 ^ 1) | (i235 & 1));
                                                int i237 = ~((d15 ^ 1) | (d15 & 1));
                                                int i238 = (fadingEdgeLength ^ 1) | (fadingEdgeLength & 1);
                                                int i239 = ((((i234 & (-69)) + (i234 | (-69))) + (((i236 ^ i237) | (i237 & i236)) * (-140))) - (~((~((i238 & d15) | (i238 ^ d15))) * 70))) - 1;
                                                int i240 = ~((fadingEdgeLength ^ (-2)) | (fadingEdgeLength & (-2)));
                                                int i241 = (i240 & i236) | (i236 ^ i240);
                                                int i242 = ~(fadingEdgeLength | d15);
                                                int i243 = ((i242 ^ i241) | (i242 & i241)) * 70;
                                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                g("\ud880\ueb98睇\ud8e5暘ગ뗀슉嵖", (i239 ^ i243) + ((i243 & i239) << 1), objArr50);
                                                java.lang.String str18 = (java.lang.String) objArr50[0];
                                                int i244 = -android.text.TextUtils.getOffsetBefore("", 0);
                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                f("븓\ue0efϺꊜ얊", (i244 ^ 24317) + ((i244 & 24317) << 1), objArr51);
                                                dataOutputStream.write(str18.getBytes((java.lang.String) objArr51[0]));
                                                dataOutputStream.flush();
                                                try {
                                                    long nanoTime = java.lang.System.nanoTime();
                                                    long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                    while (true) {
                                                        try {
                                                            exec.exitValue();
                                                            obj4 = obj8;
                                                            obj9 = obj3;
                                                            break;
                                                        } catch (java.lang.IllegalThreadStateException unused7) {
                                                            if (nanos > 0) {
                                                                try {
                                                                    obj4 = obj8;
                                                                    obj5 = obj3;
                                                                    try {
                                                                        java.lang.Object[] objArr52 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                        java.lang.Class<?> cls5 = java.lang.Class.forName(str11);
                                                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                                        f("븵젥刽\udc0e昊", android.graphics.Color.green(0) + 30223, objArr53);
                                                                        cls5.getMethod((java.lang.String) objArr53[0], java.lang.Long.TYPE).invoke(null, objArr52);
                                                                    } catch (java.lang.Throwable th14) {
                                                                        java.lang.Throwable cause3 = th14.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th14;
                                                                    }
                                                                } catch (java.lang.InterruptedException e) {
                                                                    e = e;
                                                                    obj4 = obj8;
                                                                    throw e;
                                                                } catch (java.lang.Throwable th15) {
                                                                    th = th15;
                                                                    obj4 = obj8;
                                                                    th3 = th;
                                                                    try {
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    } catch (java.lang.Exception unused8) {
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } else {
                                                                obj4 = obj8;
                                                                obj5 = obj3;
                                                            }
                                                            try {
                                                                nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                obj9 = obj5;
                                                                if (nanos > 0) {
                                                                    obj3 = obj5;
                                                                    obj8 = obj4;
                                                                }
                                                            } catch (java.lang.InterruptedException e2) {
                                                                e = e2;
                                                                throw e;
                                                            } catch (java.lang.Throwable th16) {
                                                                th = th16;
                                                                th3 = th;
                                                                exec.destroy();
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.InterruptedException e3) {
                                                            throw e3;
                                                        } catch (java.lang.Throwable th17) {
                                                            th3 = th17;
                                                            exec.destroy();
                                                            throw th3;
                                                        }
                                                    }
                                                } catch (java.lang.InterruptedException e4) {
                                                    e = e4;
                                                } catch (java.lang.Throwable th18) {
                                                    th = th18;
                                                }
                                            } catch (java.lang.Throwable th19) {
                                                th = th19;
                                            }
                                            try {
                                                try {
                                                    dataOutputStream.close();
                                                } catch (java.io.IOException unused9) {
                                                }
                                                try {
                                                    try {
                                                        java.lang.Class<?> cls6 = java.lang.Class.forName(str11);
                                                        int i245 = -(-android.view.KeyEvent.getDeadChar(0, 0));
                                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                        f("븬ᣎ\uf3e1䪝", (42727 & i245) + (i245 | 42727), objArr54);
                                                        cls6.getMethod((java.lang.String) objArr54[0], java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                        try {
                                                            java.lang.Class<?> cls7 = java.lang.Class.forName(str11);
                                                            int i246 = -(-android.graphics.Color.alpha(0));
                                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                            f("븬ᣎ\uf3e1䪝", (42727 & i246) + (i246 | 42727), objArr55);
                                                            cls7.getMethod((java.lang.String) objArr55[0], java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                            try {
                                                                try {
                                                                    try {
                                                                        exec.destroy();
                                                                    } catch (java.lang.Throwable th20) {
                                                                        th = th20;
                                                                        java.lang.Throwable th21 = th;
                                                                        throw th21;
                                                                    }
                                                                } catch (java.io.IOException unused10) {
                                                                }
                                                            } catch (java.lang.Exception unused11) {
                                                            }
                                                            try {
                                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                java.lang.Object d16 = com.facetec.sdk.al.d(785456562);
                                                                if (d16 == null) {
                                                                    char argb2 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                                                    int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                                                    byte b12 = (byte) 0;
                                                                    byte b13 = b12;
                                                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                                    h(b12, b13, b13, objArr56);
                                                                    d16 = com.facetec.sdk.al.c(argb2, packedPositionType + 1340, normalizeMetaState2 + 24, -1992399030, false, (java.lang.String) objArr56[0], null);
                                                                }
                                                                sb2.append(((java.lang.reflect.Field) d16).get(newInstance).toString());
                                                                java.lang.Object d17 = com.facetec.sdk.al.d(785456562);
                                                                if (d17 == null) {
                                                                    char c11 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                    float minVolume = android.media.AudioTrack.getMinVolume();
                                                                    double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                                                    byte b14 = (byte) 0;
                                                                    byte b15 = b14;
                                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                    h(b14, b15, b15, objArr57);
                                                                    d17 = com.facetec.sdk.al.c(c11, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 1340, (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)) + 24, -1992399030, false, (java.lang.String) objArr57[0], null);
                                                                }
                                                                sb2.append(((java.lang.reflect.Field) d17).get(newInstance2).toString());
                                                                java.lang.String obj11 = sb2.toString();
                                                                int i247 = -(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                f("빌", (58441 ^ i247) + ((i247 & 58441) << 1), objArr58);
                                                                java.lang.String[] split2 = obj11.split((java.lang.String) objArr58[0]);
                                                                int length7 = split2.length;
                                                                int i248 = 0;
                                                                while (i248 < length7) {
                                                                    java.lang.String str19 = split2[i248];
                                                                    int i249 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                                    g("㥢燨訞㤒菻郾䢓⟵볟ᛜ슱ꦀ㊹鲨䓕㏈ꢑʌ\udef3뙥\u2e7e襪偮", (i249 & 1) + (i249 | 1), objArr59);
                                                                    if (!str19.startsWith((java.lang.String) objArr59[0])) {
                                                                        int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                        int i250 = lastIndexOf2 * 860;
                                                                        int i251 = ~((i18 ^ lastIndexOf2) | (i18 & lastIndexOf2));
                                                                        int i252 = (~lastIndexOf2) | (-38449);
                                                                        int i253 = ~((i252 & i168) | (i252 ^ i168));
                                                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                        f("븶⠈鉻粠\ue69b僊㬹ꔵཝ年揽쩭됓ṋ袰狵\udcd9䜰ㅬ鬕", (((i250 | (-32988384)) << 1) - (i250 ^ (-32988384))) + ((lastIndexOf2 | i168) * (-859)) + (((i251 ^ i253) | (i251 & i253)) * 859) + (((~(((-38449) ^ lastIndexOf2) | (lastIndexOf2 & (-38449)))) | (~((i18 & (-38449)) | (i18 ^ (-38449))))) * 859), objArr60);
                                                                        if (str19.startsWith((java.lang.String) objArr60[0])) {
                                                                            continue;
                                                                        } else {
                                                                            int i254 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                            f("븶౼\uda93ꤼ睋엦送币", (45658 ^ i254) + ((i254 & 45658) << 1), objArr61);
                                                                            if (str19.startsWith((java.lang.String) objArr61[0])) {
                                                                                int i255 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                                int d18 = com.facetec.sdk.ou.d();
                                                                                int i256 = (i255 * (-519)) + 31368368;
                                                                                int i257 = ~i255;
                                                                                int i258 = ((-60209) ^ i257) | ((-60209) & i257);
                                                                                int i259 = ~d18;
                                                                                int i260 = ~((i258 & i259) | (i258 ^ i259));
                                                                                int i261 = ~(60208 | d18);
                                                                                int i262 = ((i260 ^ i261) | (i260 & i261)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL;
                                                                                int i263 = (i256 ^ i262) + ((i256 & i262) << 1);
                                                                                int i264 = ~((-60209) | i259);
                                                                                int i265 = ~((i255 ^ d18) | (i255 & d18));
                                                                                int i266 = -(-(((i264 ^ i265) | (i264 & i265)) * (-1040)));
                                                                                int i267 = ~((i257 ^ i259) | (i257 & i259));
                                                                                int i268 = ~((-60209) | i255);
                                                                                int i269 = (i267 & i268) | (i267 ^ i268);
                                                                                int i270 = ~(i255 | d18);
                                                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                                                f("빼", (i263 ^ i266) + ((i266 & i263) << 1) + (((i270 ^ i269) | (i269 & i270)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL), objArr62);
                                                                                java.lang.String[] split3 = str19.split((java.lang.String) objArr62[0]);
                                                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str17)) {
                                                                                    java.lang.String str20 = (java.lang.String) java.lang.Class.forName(str16).getField(str5).get(obj4);
                                                                                    ((int[]) objArr[2])[0] = i168;
                                                                                    ((int[]) objArr[1])[0] = (i168 & (-21)) | (i18 & 20);
                                                                                    objArr = new java.lang.Object[]{str20, new int[1], new int[1], new int[1], null};
                                                                                    int myUid3 = android.os.Process.myUid();
                                                                                    int i271 = -(-(((~((-46623397) | myUid3)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 826955416 + (((~((~myUid3) | (-46623397))) | (-937914295)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 16));
                                                                                    int i272 = ((i16 | i271) << 1) - (i271 ^ i16);
                                                                                    int i273 = (i272 << 13) ^ i272;
                                                                                    int i274 = i273 >>> 17;
                                                                                    int i275 = (~(i273 & i274)) & (i273 | i274);
                                                                                    int i276 = i275 << 5;
                                                                                    ((int[]) objArr[3])[0] = (i275 & (~i276)) | ((~i275) & i276);
                                                                                    i5 = 1;
                                                                                    c2 = 0;
                                                                                }
                                                                            } else {
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    i248 = (i248 ^ 1) + ((i248 & 1) << 1);
                                                                    obj4 = obj4;
                                                                }
                                                                obj3 = obj4;
                                                            } catch (java.lang.Exception unused12) {
                                                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                                                g("ٶ폇ⵔذ㨬㋑\uefd3鸥菏듰斾မඡ㻈\ue391詃鞇ꂭ禢ྰᄦ⭁\uf72a膉魈굫䴍篸┭휫쭬", android.view.View.getDefaultSize(0, 0) + 1, objArr452);
                                                                throw new java.io.IOException((java.lang.String) objArr452[0]);
                                                            }
                                                        } catch (java.lang.Throwable th22) {
                                                            java.lang.Throwable cause4 = th22.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th22;
                                                        }
                                                    } catch (java.lang.Throwable th23) {
                                                        java.lang.Throwable cause5 = th23.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th23;
                                                    }
                                                } catch (java.lang.InterruptedException e5) {
                                                    e = e5;
                                                    throw e;
                                                }
                                            } catch (java.lang.InterruptedException e6) {
                                                e = e6;
                                                throw e;
                                            } catch (java.lang.Throwable th24) {
                                                th = th24;
                                                th3 = th;
                                                exec.destroy();
                                                throw th3;
                                            }
                                        } catch (java.lang.Throwable th25) {
                                            java.lang.Throwable cause6 = th25.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th25;
                                        }
                                    } catch (java.lang.Throwable th26) {
                                        java.lang.Throwable cause7 = th26.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th26;
                                    }
                                } catch (java.io.IOException unused13) {
                                    obj9 = obj3;
                                    strArr = strArr;
                                    i231 = i231;
                                    i232 = i232;
                                    obj3 = obj8;
                                    i230 = ((i232 | 1) << 1) - (i232 ^ 1);
                                    obj8 = obj3;
                                    split = strArr;
                                    length6 = i231;
                                    i229 = 1;
                                    i227 = 0;
                                    strArr = strArr;
                                    i231 = i231;
                                    i232 = i232;
                                    obj9 = obj9;
                                } catch (java.lang.Exception unused14) {
                                    java.lang.Object[] objArr4522 = new java.lang.Object[1];
                                    g("ٶ폇ⵔذ㨬㋑\uefd3鸥菏듰斾မඡ㻈\ue391詃鞇ꂭ禢ྰᄦ⭁\uf72a膉魈굫䴍篸┭휫쭬", android.view.View.getDefaultSize(0, 0) + 1, objArr4522);
                                    throw new java.io.IOException((java.lang.String) objArr4522[0]);
                                }
                            }
                        } else {
                            strArr = split;
                            i231 = length6;
                            obj3 = obj8;
                            i232 = i230;
                        }
                        i230 = ((i232 | 1) << 1) - (i232 ^ 1);
                        obj8 = obj3;
                        split = strArr;
                        length6 = i231;
                        i229 = 1;
                        i227 = 0;
                        strArr = strArr;
                        i231 = i231;
                        i232 = i232;
                        obj9 = obj9;
                    }
                    i4 = i229;
                } else {
                    i4 = 1;
                }
                int[] iArr4 = new int[i4];
                int[] iArr5 = new int[i4];
                int[] iArr6 = new int[i4];
                iArr5[0] = i168;
                iArr4[0] = i168;
                objArr = new java.lang.Object[]{null, iArr4, iArr5, iArr6, null};
                int i277 = ((((~(i18 | (-210115775))) | (~(i18 | (-110749232)))) * (-867)) - 662049900) + (((~((-210115775) | i168)) | 75498542 | (~((-110749232) | i168))) * (-1734)) + (((~(i18 | (-75498543))) | (~((-134617233) | i168)) | (~((-35250690) | i168))) * 867);
                int i278 = i277 * 131;
                int i279 = (i278 << 1) - i278;
                int i280 = ~i277;
                int i281 = (~(i280 | i18)) * 130;
                int i282 = (i279 ^ i281) + ((i279 & i281) << 1);
                int i283 = (~i280) * (-260);
                int i284 = (i282 & i283) + (i283 | i282);
                int i285 = ~(i277 | (i277 ^ (-1)));
                int i286 = ~((i280 ^ i168) | (i280 & i168));
                int i287 = -(-(((i285 ^ i286) | (i286 & i285)) * 130));
                int i288 = -(-(((i284 | i287) << 1) - (i287 ^ i284)));
                int i289 = (i16 ^ i288) + ((i288 & i16) << 1);
                int i290 = i289 << 13;
                int i291 = ((~i290) & i289) | ((~i289) & i290);
                int i292 = i291 >>> 17;
                int i293 = (i291 & (~i292)) | ((~i291) & i292);
                int i294 = i293 << 5;
                int i295 = (i293 & (~i294)) | ((~i293) & i294);
                c2 = 0;
                iArr6[0] = i295;
                i5 = 1;
                if (((int[]) objArr[i5])[c2] != i168) {
                    return objArr;
                }
                int[] iArr7 = new int[i5];
                int[] iArr8 = new int[i5];
                iArr8[c2] = i168;
                iArr7[c2] = i168;
                java.lang.Object[] objArr63 = {null, iArr7, iArr8, new int[i5], null};
                int myTid3 = android.os.Process.myTid();
                int i296 = (((~((-10403918) | myTid3)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 545558600) + (((~((~myTid3) | (-10403918))) | 205595264) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL);
                int i297 = (i16 ^ i296) + ((i296 & i16) << 1);
                int i298 = i297 ^ (i297 << 13);
                int i299 = i298 ^ (i298 >>> 17);
                int i300 = i299 << 5;
                ((int[]) objArr63[3])[0] = (~(i299 & i300)) & (i299 | i300);
                if (((int[]) objArr63[1])[0] != i168) {
                    return objArr63;
                }
                if ((i2 & 1) == 0) {
                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                    f("븢ᘘ\uee46䚞ỉ\uf704佻➫\ufff1吹ⱡ蒬峻", 43068 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr64);
                    try {
                        java.lang.Object[] objArr65 = {(java.lang.String) objArr64[0]};
                        int i301 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                        f("븧蚟콌ᐑ峵ꖼ\uea68㍩箝䁆褎퇯ᚷ彣ꐰ\uecd1㕵税䋶讧큯\u193d憈", (i301 ^ 14519) + ((i301 & 14519) << 1), objArr66);
                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                        int i302 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                        f("븡俶嶘歪祫ܜᓌ⋰ゃ㹨챱\uda13\uebcc茶螃镘", (61910 ^ i302) + ((i302 & 61910) << 1), objArr67);
                        java.lang.Object invoke2 = cls8.getMethod((java.lang.String) objArr67[0], java.lang.String.class).invoke(context, objArr65);
                        if (invoke2 != null) {
                            int i303 = -(-(android.os.Process.myTid() >> 22));
                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                            g("䍩廓㭜䌈槔ᬒ淪췃웚鴱珲䎻䢰\u1754\uf58a\ud9e7튜襤澳屄呷˂\ue146퉤\ude53蒡嬅⠀怑ﻻ\udd26기\uea0e瀉僣ⓜ淧\uea3d쫵뫴\uf7a7", ((i303 | 1) << 1) - (i303 ^ 1), objArr68);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr68[0]);
                            int i304 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                            f("븡ᷞ杻嗰㇑跃槁엛ꇋ緢\ud9c0뗴ᇳ\uedf1䧣", (41981 & i304) + (i304 | 41981), objArr69);
                            java.util.List list = (java.util.List) cls9.getMethod((java.lang.String) objArr69[0], null).invoke(invoke2, null);
                            if (list != null) {
                                java.util.Iterator it = list.iterator();
                                loop1: while (it.hasNext()) {
                                    java.lang.Object next = it.next();
                                    int i305 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                    f("븧\udb09瑠酗⪭䞊\ue0e4綏霭\u3000䵢\ue659ί鲅㧼劇\uec15घꉹ㽅墽\uf59d\u0ef5ꯟ씪帱ﭽᑐ놿", (i305 ^ 25889) + ((i305 & 25889) << 1), objArr70);
                                    java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr70[0]);
                                    java.lang.Object[] objArr71 = new java.lang.Object[1];
                                    g("\ueca3넟ᆫ\uecc4멝倍팱Ṩ椞혯夊遽\ue77c展\udf43ਡ絚쉱", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr71);
                                    java.lang.String str21 = (java.lang.String) cls10.getMethod((java.lang.String) objArr71[0], null).invoke(next, null);
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    g("䍩廓㭜䌈槔ᬒ淪췃웚鴱珲䎻䢰\u1754\uf58a\ud9e7튜襤澳屄呷˂\ue146퉤\ude53蒡嬅⠀怑ﻻ\udd26기\uea0e瀉僣ⓜ淧\uea3d쫵뫴\uf7a7", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr72);
                                    java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr72[0]);
                                    java.lang.Object[] objArr73 = new java.lang.Object[1];
                                    f("븯妼焄ࢯ\u200d㮍팙\uea95艫鷘땫䳋摏翁\u1779⼱욦", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59272, objArr73);
                                    if (((java.lang.Boolean) cls11.getMethod((java.lang.String) objArr73[0], java.lang.String.class).invoke(invoke2, str21)).booleanValue() && str21.length() - 20 >= 0) {
                                        int i306 = 0;
                                        while (i306 <= length) {
                                            java.lang.Object[] objArr74 = {str21.substring(i306, i306 + 20), 931995};
                                            java.lang.Object d19 = com.facetec.sdk.al.d(-582857820);
                                            if (d19 == null) {
                                                char indexOf3 = (char) android.text.TextUtils.indexOf("", "", 0, 0);
                                                int red = android.graphics.Color.red(0);
                                                float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                                                byte b16 = (byte) 0;
                                                byte b17 = (byte) (b16 + 3);
                                                obj = invoke2;
                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                h(b16, b17, (byte) (b17 - 3), objArr75);
                                                d19 = com.facetec.sdk.al.c(indexOf3, 2365 - red, (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) + 23, 2058170716, false, (java.lang.String) objArr75[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                            } else {
                                                obj = invoke2;
                                            }
                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) d19).invoke(null, objArr74)).longValue();
                                            long j43 = -191149689;
                                            java.lang.String str22 = str21;
                                            int i307 = length;
                                            java.util.Iterator it2 = it;
                                            long j44 = 623;
                                            long j45 = -1;
                                            long j46 = longValue8 ^ j45;
                                            long j47 = j46 | j43;
                                            long j48 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                            long j49 = (624 * j43) + ((-622) * longValue8) + (((j47 | j48) ^ j45) * j44) + ((-623) * ((j48 ^ j45) | (((j43 ^ j45) | longValue8) ^ j45))) + (j44 * ((j45 ^ (j43 | j48)) | (j47 ^ j45) | ((j46 | j48) ^ j45))) + 1350347087;
                                            int i308 = (int) (j49 >> 32);
                                            i7 = i;
                                            int i309 = ~(1056457832 | i7);
                                            if (((i308 & (((((~(1150318854 | i7)) | 1707422030) * (-318)) - 1792590054) + (((~(1707422030 | i7)) | (~(i18 | (-1149251847)))) * 318) + (((~(i18 | (-1067009))) | (~((-1149251847) | i7))) * 318))) | (((int) j49) & (((((~(i18 | (-710427753))) | (~(1801283053 | i7))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 675168131) + (((~(i18 | (-1801283054))) | i309) * (-1040)) + ((i309 | (~(i18 | (-1056457833))) | 1090855301) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) == 1245577864) {
                                                objArr6 = new java.lang.Object[]{null, new int[]{(i7 & (-71)) | (i18 & 70)}, new int[]{i7}, new int[]{r3 ^ (r3 << 5)}, null};
                                                int i310 = (((((~(i18 | (-1009734400))) | 337642222) | r1) * (-502)) - 1981431391) + (((~((-16777217) | i7)) | (~(i18 | (-672092178)))) * 502) + 16;
                                                i6 = i3;
                                                int i311 = i310 + i6;
                                                int i312 = i311 << 13;
                                                int i313 = (i311 & (~i312)) | ((~i311) & i312);
                                                int i314 = i313 ^ (i313 >>> 17);
                                                c3 = 0;
                                                break loop1;
                                            }
                                            i306++;
                                            i16 = i3;
                                            i168 = i7;
                                            length = i307;
                                            it = it2;
                                            str21 = str22;
                                            invoke2 = obj;
                                        }
                                    }
                                    i16 = i16;
                                    i168 = i168;
                                    it = it;
                                    invoke2 = invoke2;
                                }
                            }
                        }
                        i6 = i16;
                        i7 = i168;
                        java.lang.Object[] objArr76 = {null, new int[]{i7}, new int[]{i7}, new int[1], null};
                        int i315 = (int) java.lang.Runtime.getRuntime().totalMemory();
                        int i316 = -(-((((~(150155991 | r5)) * (-560)) - 1054344003) + ((~(i315 | (-34390017))) * (-560)) + (((~(170709014 | (~i315))) | 13836993) * 560)));
                        int i317 = ((i6 | i316) << 1) - (i316 ^ i6);
                        int i318 = (i317 << 13) ^ i317;
                        int i319 = i318 >>> 17;
                        int i320 = (i318 & (~i319)) | ((~i318) & i319);
                        int i321 = i320 << 5;
                        int[] iArr9 = (int[]) objArr76[3];
                        int i322 = (i320 & (~i321)) | ((~i320) & i321);
                        c3 = 0;
                        iArr9[0] = i322;
                        objArr6 = objArr76;
                        if (((int[]) objArr6[1])[c3] != i7) {
                            return objArr6;
                        }
                    } catch (java.lang.Throwable th27) {
                        java.lang.Throwable cause8 = th27.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th27;
                    }
                } else {
                    i6 = i16;
                    i7 = i168;
                }
                java.lang.Object[] objArr77 = new java.lang.Object[1];
                f("빩Β압蜺䣹੍찻釰厗ᕣ훞题", 48563 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr77);
                java.lang.Object[] objArr78 = {(java.lang.String) objArr77[0]};
                java.lang.Object d20 = com.facetec.sdk.al.d(2084539986);
                if (d20 == null) {
                    char c12 = (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6934);
                    long elapsedCpuTime3 = android.os.Process.getElapsedCpuTime();
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    byte length8 = (byte) $$a.length;
                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                    h((byte) 0, length8, (byte) (length8 - 4), objArr79);
                    d20 = com.facetec.sdk.al.c(c12, 2390 - (elapsedCpuTime3 > 0L ? 1 : (elapsedCpuTime3 == 0L ? 0 : -1)), 22 - bitsPerPixel, -607062870, false, (java.lang.String) objArr79[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) d20).invoke(null, objArr78)).longValue();
                long j50 = -958735936;
                long j51 = -103;
                long j52 = 104;
                long j53 = -1;
                long j54 = longValue9 ^ j53;
                long myUid4 = android.os.Process.myUid();
                long j55 = (j51 * j50) + (j51 * longValue9) + (((((j50 ^ j53) | j54) ^ j53) | ((j54 | myUid4) ^ j53)) * j52) + ((-104) * ((((myUid4 ^ j53) | j50) | longValue9) ^ j53)) + (j52 * (myUid4 | j50)) + 1930885278;
                int uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
                int i323 = ~uptimeMillis4;
                int i324 = ((int) (j55 >> 32)) & ((((~(38341161 | i323)) | (~((-1475567573) | uptimeMillis4))) * (-370)) + 635053406 + (((~(uptimeMillis4 | 38341161)) | (~(i323 | (-1475567573))) | 524329) * (-370)) + 194001730);
                int i325 = ((int) j55) & ((((~(i18 | (-1415064707))) | (~((-19157057) | i7)) | (~((-8454418) | i7))) * 765) + 861330074 + (((~(i18 | (-1434221763))) | 1415064706) * 1530) + (((~((-1434221763) | i7)) | (~(i18 | (-8454418)))) * 765));
                if (((i325 ^ i324) | (i324 & i325)) != 0) {
                    objArr2 = new java.lang.Object[]{null, new int[]{i7 ^ 50}, new int[]{i7}, new int[1], null};
                    int nextInt = new java.util.Random().nextInt();
                    int i326 = ((~((~nextInt) | (-218103877))) * (-116)) + 1755230089 + ((576942898 | nextInt) * 116) + (((~(nextInt | 256077892)) | 538968882) * 116) + 16;
                    int d21 = com.facetec.sdk.ou.d();
                    int i327 = i326 * (-501);
                    int i328 = -(-(i6 * 503));
                    int i329 = ~i6;
                    int i330 = ~((i329 ^ d21) | (i329 & d21));
                    int i331 = ~((i326 ^ i6) | (i326 & i6));
                    int i332 = (((i327 ^ i328) + ((i327 & i328) << 1)) - (~(-(-(((i330 & i331) | (i330 ^ i331)) * (-502)))))) - 1;
                    int i333 = (~d21) | i329;
                    int i334 = -(-((~((i333 ^ i326) | (i333 & i326))) * (-502)));
                    int i335 = ~(d21 | (~i326));
                    int i336 = (((i332 ^ i334) + ((i334 & i332) << 1)) - (~(((i335 ^ i329) | (i335 & i329)) * 502))) - 1;
                    int i337 = i336 << 13;
                    int i338 = (~(i337 & i336)) & (i337 | i336);
                    int i339 = i338 >>> 17;
                    int i340 = (~(i338 & i339)) & (i338 | i339);
                    i8 = 0;
                    ((int[]) objArr2[3])[0] = i340 ^ (i340 << 5);
                } else {
                    objArr2 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                    int nextInt2 = new java.util.Random().nextInt(594629165);
                    int i341 = ~nextInt2;
                    int i342 = ((67428609 | i341) * (-192)) + 1797403821 + (((~(337961733 | i341)) | 591398130) * (-384)) + (((~(nextInt2 | (-591398131))) | (~(i341 | 929359863)) | (~((-270533125) | nextInt2))) * 192);
                    int i343 = ((i6 | i342) << 1) - (i6 ^ i342);
                    int i344 = i343 << 13;
                    int i345 = (i343 & (~i344)) | ((~i343) & i344);
                    int i346 = i345 >>> 17;
                    int i347 = (i345 & (~i346)) | ((~i345) & i346);
                    i8 = 0;
                    ((int[]) objArr2[3])[0] = i347 ^ (i347 << 5);
                }
                if (((int[]) objArr2[1])[i8] != i7) {
                    return objArr2;
                }
                java.lang.Object[] objArr80 = new java.lang.Object[1];
                g("\ue69c浲ᔭ\ue6b3鵧豶ힺ㥱挴\u0a44嶊뜉\ued52耭\udbe3ⴕ睦Ḝ䇰꣭\uf19c间켐⛗", android.graphics.Color.green(i8) + 1, objArr80);
                java.lang.Object[] objArr81 = {(java.lang.String) objArr80[i8]};
                java.lang.Object d22 = com.facetec.sdk.al.d(2084539986);
                if (d22 == null) {
                    char capsMode = (char) (6935 - android.text.TextUtils.getCapsMode("", i8, i8));
                    float minVolume2 = android.media.AudioTrack.getMinVolume();
                    int threadPriority = android.os.Process.getThreadPriority(i8);
                    byte b18 = (byte) i8;
                    byte length9 = (byte) $$a.length;
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    h(b18, length9, (byte) (length9 - 4), objArr82);
                    d22 = com.facetec.sdk.al.c(capsMode, (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)) + 2389, ((threadPriority + 20) >> 6) + 23, -607062870, false, (java.lang.String) objArr82[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) d22).invoke(null, objArr81)).longValue();
                long j56 = -875423669;
                long j57 = j56 ^ j53;
                long j58 = i7;
                long j59 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
                long j60 = longValue10 ^ j53;
                long j61 = (567 * j56) + ((-565) * longValue10) + ((((j57 | longValue10) ^ j53) | ((j57 | j58) ^ j53)) * (-566)) + (((j56 | j60) ^ j53) * j59) + (j59 * (((j57 | j60) | j58) ^ j53)) + 1847573011;
                int i348 = ~((-469906212) | i7);
                int i349 = ((int) (j61 >> 32)) & (((((~(i18 | (-469906212))) | 67244320) * (-245)) - 170116362) + (i348 * (-245)) + ((i348 | 967320199) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE));
                int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i350 = ((int) j61) & (((~((~freeMemory2) | 2052417087)) * (-116)) + 2072280017 + ((805660214 | freeMemory2) * 116) + (((~(freeMemory2 | (-2052080672))) | 805323798) * 116));
                if (((i349 ^ i350) | (i349 & i350)) != 0) {
                    objArr3 = new java.lang.Object[]{null, new int[]{(i7 & (-61)) | (i18 & 60)}, new int[]{i7}, new int[]{r2}, null};
                    int i351 = (((~((-302436681) | i7)) | 302432328) * (-283)) + 9867909 + ((~(i7 | (-4353))) * 283);
                    int i352 = -(-((i351 ^ 16) + ((i351 & 16) << 1)));
                    int i353 = (i6 ^ i352) + ((i352 & i6) << 1);
                    int i354 = i353 << 13;
                    int i355 = ((~i354) & i353) | ((~i353) & i354);
                    int i356 = i355 >>> 17;
                    int i357 = (i355 & (~i356)) | ((~i355) & i356);
                    int i358 = i357 << 5;
                    int i359 = (i357 & (~i358)) | ((~i357) & i358);
                    i9 = 0;
                } else {
                    objArr3 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                    int i360 = (((~(i18 | (-570339324))) | 249474317) * (-865)) + 790060630 + ((~(570339323 | i7)) * 865) + (((~(i18 | 570339323)) | (~(i18 | 249474317))) * 865);
                    int i361 = (-1) - (~(-(-(i360 * 471))));
                    int i362 = ((~((i18 ^ (-1)) | i18)) | i360) * (-235);
                    int i363 = (i361 & i362) + (i362 | i361);
                    int i364 = ~((i7 ^ (-1)) | i7);
                    int i365 = ((i364 ^ i360) | (i364 & i360)) * (-470);
                    int i366 = ~(~i360);
                    int i367 = i360 | (i360 ^ (-1));
                    int i368 = ~((i367 ^ i7) | (i367 & i7));
                    int i369 = ((((i363 | i365) << 1) - (i365 ^ i363)) - (~(((i368 ^ i366) | (i366 & i368)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) - 1;
                    int d23 = com.facetec.sdk.ou.d();
                    int i370 = i369 * (-129);
                    int i371 = -(-(i6 * 131));
                    int i372 = ~i6;
                    int i373 = ~d23;
                    int i374 = (i373 ^ i372) | (i373 & i372);
                    int i375 = (i370 & i371) + (i370 | i371) + ((~((i374 & i369) | (i374 ^ i369))) * 130);
                    int i376 = (i372 & i369) | (i372 ^ i369);
                    int i377 = i375 + ((~i376) * (-260));
                    int i378 = ~i369;
                    int i379 = ~((i378 ^ i6) | (i378 & i6));
                    int i380 = ~((d23 ^ i376) | (d23 & i376));
                    int i381 = -(-(((i380 ^ i379) | (i380 & i379)) * 130));
                    int i382 = (i377 ^ i381) + ((i381 & i377) << 1);
                    int i383 = i382 << 13;
                    int i384 = ((~i383) & i382) | ((~i382) & i383);
                    int i385 = i384 >>> 17;
                    int i386 = (i384 & (~i385)) | ((~i384) & i385);
                    i9 = 0;
                    ((int[]) objArr3[3])[0] = i386 ^ (i386 << 5);
                }
                if (((int[]) objArr3[1])[i9] != i7) {
                    return objArr3;
                }
                java.lang.Object[] objArr83 = new java.lang.Object[1];
                f("빩貯\udb3d⦕琓䊨酬\udffc⩚磒䟫鈪\ue0b5⼂緞䡢雴\ue574㏔縟䴣鮹\ue63c㒟̑凪鱰\ueab6㥜ߙ劳ꄊ\uef82㨊࢈坠", 12940 - (~(android.widget.ExpandableListView.getPackedPositionForGroup(i9) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i9) == 0L ? 0 : -1))), objArr83);
                java.lang.Object[] objArr84 = {(java.lang.String) objArr83[i9]};
                java.lang.Object d24 = com.facetec.sdk.al.d(1873189073);
                if (d24 == null) {
                    char c13 = (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6934);
                    int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                    int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                    byte b19 = (byte) 0;
                    byte b20 = (byte) (b19 + 3);
                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                    h(b19, b20, (byte) (b20 - 3), objArr85);
                    d24 = com.facetec.sdk.al.c(c13, (minimumFlingVelocity2 >> 16) + 2389, offsetAfter2 + 23, -934682071, false, (java.lang.String) objArr85[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) d24).invoke(null, objArr84)).longValue();
                long j62 = 251732183;
                long j63 = 69;
                long j64 = j62 ^ j53;
                long j65 = longValue11 ^ j53;
                long j66 = (70 * j62) + ((-68) * longValue11) + (((((j64 | j65) | j58) ^ j53) | (((j62 | longValue11) | j58) ^ j53)) * j63) + ((-69) * (((longValue11 | j58) ^ j53) | ((j64 | longValue11) ^ j53) | ((j64 | j58) ^ j53))) + (j63 * ((j65 | j62) ^ j53)) + 685347460;
                int i387 = ((int) (j66 >> 32)) & (((~((-1342877738) | i7)) * (-301)) + 414090576 + (((~(1380628523 | i7)) | (~(i18 | (-1477112362)))) * (-301)) + (((~(1477112361 | i7)) | 1380628523) * 301));
                int myTid4 = android.os.Process.myTid();
                int i388 = ~myTid4;
                int i389 = ((int) j66) & ((((~((-389632140) | myTid4)) | (~((-1757586997) | i388))) * (-406)) + 809828459 + ((~((-69271554) | i388)) * (-406)) + (((~(myTid4 | 1826858549)) | (~(i388 | 389632139))) * 406));
                if (((i387 ^ i389) | (i387 & i389)) != 0) {
                    objArr4 = new java.lang.Object[]{null, new int[]{(~(i7 & 80)) & (i7 | 80)}, new int[]{i7}, new int[1], null};
                    int maxMemory4 = (int) java.lang.Runtime.getRuntime().maxMemory();
                    int i390 = ((((~((~maxMemory4) | (-759320880))) | (-438455874)) * (-235)) - 1543185434) + (((~((-759320880) | maxMemory4)) | (-438455874)) * (-470)) + (((~(maxMemory4 | (-134365186))) | (-1063411568)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE) + 16;
                    int i391 = (i6 ^ i390) + ((i390 & i6) << 1);
                    int i392 = i391 ^ (i391 << 13);
                    int i393 = i392 ^ (i392 >>> 17);
                    int i394 = i393 << 5;
                    int[] iArr10 = (int[]) objArr4[3];
                    int i395 = (~(i393 & i394)) & (i393 | i394);
                    i10 = 0;
                    iArr10[0] = i395;
                } else {
                    objArr4 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                    int nextInt3 = new java.util.Random().nextInt(1159470018);
                    int i396 = (((((~((-143752199) | r5)) | 2) | (~((-320865009) | nextInt3))) * 717) - 2097191339) + (((~(nextInt3 | (-143752199))) | (~((~nextInt3) | (-320865009))) | 2) * 717);
                    int i397 = (-1) - (~(i396 * 503));
                    int i398 = ~i396;
                    int i399 = ~((i398 ^ i7) | (i398 & i7));
                    int i400 = ((i399 ^ i398) | (i399 & i398)) * (-502);
                    int i401 = (i397 ^ i400) + ((i400 & i397) << 1) + ((~((i398 & i18) | (i398 ^ i18))) * (-502));
                    int i402 = ~((i7 ^ (-1)) | i7);
                    int i403 = -(-(((i398 ^ i402) | (i398 & i402)) * 502));
                    int i404 = (i401 ^ i403) + ((i403 & i401) << 1);
                    int i405 = (i6 & i404) + (i404 | i6);
                    int i406 = i405 ^ (i405 << 13);
                    int i407 = i406 >>> 17;
                    int i408 = (~(i406 & i407)) & (i406 | i407);
                    int i409 = i408 << 5;
                    int[] iArr11 = (int[]) objArr4[3];
                    int i410 = (~(i408 & i409)) & (i408 | i409);
                    i10 = 0;
                    iArr11[0] = i410;
                }
                if (((int[]) objArr4[1])[i10] != i7) {
                    return objArr4;
                }
                java.lang.Object[] objArr86 = new java.lang.Object[1];
                f("빩薕쥉ഗ僻铺\ud868ᰦ掊Ꝉ\ueb4f\u2ef8犽뙠頻솜՚䤎賶킶ᐤ堤龒\ue353✜櫶꺹\uf26f㙬継䅁蔎죊\u0cff偻鐳\udb9bὖ按Ꚉ\ueaa8\u2e64", 15287 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr86);
                java.lang.Object[] objArr87 = {(java.lang.String) objArr86[i10]};
                java.lang.Object d25 = com.facetec.sdk.al.d(1873189073);
                if (d25 == null) {
                    char defaultSize2 = (char) (6935 - android.view.View.getDefaultSize(i10, i10));
                    int indexOf4 = android.text.TextUtils.indexOf("", "", i10);
                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                    byte b21 = (byte) i10;
                    byte b22 = (byte) (b21 + 3);
                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                    h(b21, b22, (byte) (b22 - 3), objArr88);
                    d25 = com.facetec.sdk.al.c(defaultSize2, indexOf4 + 2389, 23 - (doubleTapTimeout >> 16), -934682071, false, (java.lang.String) objArr88[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) d25).invoke(null, objArr87)).longValue();
                long j67 = 579091264;
                long j68 = 367;
                long j69 = -366;
                long j70 = longValue12 ^ j53;
                long myUid5 = android.os.Process.myUid();
                long j71 = (j68 * j67) + (j68 * longValue12) + ((j67 | longValue12) * j69) + (j69 * (((j70 | myUid5) ^ j53) | j67)) + (366 * (((longValue12 | (j67 ^ j53)) ^ j53) | (((j67 | j70) | myUid5) ^ j53))) + 357988379;
                int i411 = ((int) (j71 >> 32)) & ((((~(96763140 | i7)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 914029318) + ((i18 | (-1243709603)) * (-216)) + (((~(i18 | 96763140)) | 1340463270) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE));
                int nextInt4 = new java.util.Random().nextInt();
                int i412 = ~nextInt4;
                int i413 = ((int) j71) & ((((~((-1180943090) | i412)) | (~((-1676797797) | nextInt4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1682006875 + (((~(nextInt4 | (-67240082))) | (~(i412 | (-563094789)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
                if (((i413 ^ i411) | (i411 & i413)) != 0) {
                    objArr5 = new java.lang.Object[]{null, new int[]{(~(i7 & 90)) & (i7 | 90)}, new int[]{i7}, new int[]{r2}, null};
                    int i414 = ~(i18 | (-651933722));
                    int i415 = (((-939244860) | i414 | (~(651933721 | i7))) * (-338)) + 683682229 + ((i414 | (~((-287311139) | i7))) * 338);
                    int i416 = (i415 & 16) + (i415 | 16);
                    int i417 = i416 * (-433);
                    int i418 = i6 * (-216);
                    int i419 = (i417 & i418) + (i417 | i418);
                    int i420 = ~i416;
                    int i421 = ~((i420 ^ i18) | (i420 & i18));
                    int i422 = ~i6;
                    int i423 = ~((i422 & i7) | (i422 ^ i7));
                    int i424 = ((i421 ^ i423) | (i421 & i423)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
                    int i425 = ~((i420 & i422) | (i420 ^ i422));
                    int i426 = ~((i420 ^ i7) | (i420 & i7));
                    int i427 = ((((i419 | i424) << 1) - (i424 ^ i419)) - (~(-(-(((i426 ^ i425) | (i425 & i426)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE))))) - 1;
                    int i428 = ~(i422 | i18);
                    int i429 = -(-(((i416 ^ i428) | (i416 & i428)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE));
                    int i430 = (i427 ^ i429) + ((i429 & i427) << 1);
                    int i431 = i430 << 13;
                    int i432 = (~(i431 & i430)) & (i431 | i430);
                    int i433 = i432 >>> 17;
                    int i434 = (i432 & (~i433)) | ((~i432) & i433);
                    int i435 = i434 << 5;
                    int i436 = (~(i434 & i435)) & (i434 | i435);
                    i11 = 0;
                } else {
                    objArr5 = new java.lang.Object[]{null, new int[]{i7}, new int[]{i7}, new int[1], null};
                    int i437 = ((((~((~r2) | 918666424)) | 18874690) * 529) - 1740238132) + (((~(((int) android.os.SystemClock.elapsedRealtime()) | 918666424)) | 597801418) * 529);
                    int i438 = -(-(i437 * (-667)));
                    int i439 = ~i437;
                    int i440 = -(-(((i18 & i439) | (i439 ^ i18)) * (-668)));
                    int i441 = (i438 & i440) + (i438 | i440) + ((~((i439 ^ i7) | (i439 & i7))) * 1336);
                    int i442 = -(-((i7 | i439) * 668));
                    int i443 = (i441 & i442) + (i442 | i441);
                    int i444 = (i6 ^ i443) + ((i443 & i6) << 1);
                    int i445 = i444 << 13;
                    int i446 = (i444 & (~i445)) | ((~i444) & i445);
                    int i447 = i446 >>> 17;
                    int i448 = (~(i446 & i447)) & (i446 | i447);
                    int i449 = i448 << 5;
                    int[] iArr12 = (int[]) objArr5[3];
                    int i450 = (i448 & (~i449)) | ((~i448) & i449);
                    i11 = 0;
                    iArr12[0] = i450;
                }
                if (((int[]) objArr5[1])[i11] != i7) {
                    return objArr5;
                }
                int i451 = -android.view.View.combineMeasuredStates(i11, i11);
                java.lang.Object[] objArr89 = new java.lang.Object[1];
                f("빩꿲鶐譖來\ue73a퓎슘ズḱఘ緔毾妺䝆땗ꌥ郏", (i451 & 4561) + (i451 | 4561), objArr89);
                java.lang.Object[] objArr90 = {(java.lang.String) objArr89[i11]};
                java.lang.Object d26 = com.facetec.sdk.al.d(1873189073);
                if (d26 == null) {
                    char c14 = (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6935);
                    int red2 = android.graphics.Color.red(0);
                    int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout();
                    byte b23 = (byte) 0;
                    byte b24 = (byte) (b23 + 3);
                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                    h(b23, b24, (byte) (b24 - 3), objArr91);
                    d26 = com.facetec.sdk.al.c(c14, red2 + 2389, 23 - (doubleTapTimeout2 >> 16), -934682071, false, (java.lang.String) objArr91[0], new java.lang.Class[]{java.lang.String.class});
                }
                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) d26).invoke(null, objArr90)).longValue();
                long j72 = 278384871;
                long j73 = longValue13 ^ j53;
                long uptimeMillis5 = ((((int) android.os.SystemClock.uptimeMillis()) ^ j53) | longValue13) ^ j53;
                long j74 = j72 ^ j53;
                long j75 = ((-1939) * j72) + (971 * longValue13) + ((((j73 | j72) ^ j53) | uptimeMillis5) * (-970)) + (1940 * ((j74 | longValue13) ^ j53)) + (970 * (((j74 | j73) ^ j53) | uptimeMillis5)) + 658694772;
                int i452 = ((int) (j75 >> 32)) & (((((~(667224551 | i7)) | 1479169552) * 104) - 2005432166) + ((~(i18 | (-41943142))) * (-104)) + ((2104450962 | i7) * 104));
                int i453 = ((int) j75) & (((((~(562756000 | i7)) | 362128809) * 398) - 339546331) + (((~(i18 | 562756000)) | 362128809) * 398));
                if (((i452 ^ i453) | (i452 & i453)) == 0) {
                    java.lang.Object[] objArr92 = {null, new int[]{i7}, new int[]{i7}, new int[]{r1 ^ (r1 << 5)}, null};
                    int i454 = ((((i18 | (-182451438)) * 1444) + 584565379) + (((~(i7 | 70974372)) | ((~(249890633 | i7)) | (-251658222))) * (-1444))) - 1414048662;
                    int i455 = -(-(i454 * 306));
                    int i456 = ~i454;
                    int i457 = -(-(((i456 & i18) | (i456 ^ i18)) * 305));
                    int i458 = ~i18;
                    int i459 = (i6 - (~(-(-((((((i455 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i455 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)) - (~i457)) - 1) - (~(((i456 ^ i458) | (i456 & i458)) * 305))) - 1))))) - 1;
                    int i460 = i459 ^ (i459 << 13);
                    int i461 = i460 >>> 17;
                    int i462 = (i460 & (~i461)) | ((~i460) & i461);
                    return objArr92;
                }
                java.lang.Object[] objArr93 = {null, new int[]{i7 ^ 100}, new int[]{i7}, new int[]{(r1 & (~r3)) | r4}, null};
                int i463 = ~(860939985 | i7);
                int i464 = ((((~(i7 | 540074979)) | ((~((-860939986) | i7)) | 322962448)) * (-880)) - 785772131) + (((~(i18 | (-860939986))) | (-540074980) | i463) * (-880)) + (i463 * 880);
                int i465 = ((i464 | 16) << 1) - (i464 ^ 16);
                int i466 = (i6 & i465) + (i6 | i465);
                int i467 = i466 << 13;
                int i468 = (~(i467 & i466)) & (i467 | i466);
                int i469 = i468 >>> 17;
                int i470 = (i468 & (~i469)) | ((~i468) & i469);
                int i471 = i470 << 5;
                int i472 = (~i470) & i471;
                return objArr93;
            } catch (java.lang.Throwable th28) {
                java.lang.Throwable cause9 = th28.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th28;
            }
        } catch (java.lang.Throwable th29) {
            java.lang.Throwable cause10 = th29.getCause();
            if (cause10 != null) {
                throw cause10;
            }
            throw th29;
        }
    }
}
