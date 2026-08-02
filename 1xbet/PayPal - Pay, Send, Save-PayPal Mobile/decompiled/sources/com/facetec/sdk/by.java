package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class by {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;

    /* renamed from: a, reason: collision with root package name */
    private static int f3446a;
    private static final java.util.List<java.lang.String> b;
    private static int c;
    private static int d;
    public static boolean e;
    private static char f;
    private static boolean g;
    private static boolean h;
    private static char i;
    private static final java.lang.String[] j;
    private static char k;
    private static int l;
    private static char m;
    private static long n;

    /* renamed from: o, reason: collision with root package name */
    private static char[] f3447o;
    private static int p;
    private static int r;
    private static int s;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$g(int i2, int i3, byte b2) {
        int i4;
        int i5 = 112 - b2;
        int i6 = i3 * 3;
        byte[] bArr = $$c;
        int i7 = i2 + 4;
        byte[] bArr2 = new byte[1 - i6];
        if (bArr == null) {
            int i8 = i5;
            int i9 = 0;
            int i10 = i7;
            int i11 = (-i7) + i8;
            i4 = i9;
            int i12 = i10;
            i5 = i11;
            i7 = i12;
            bArr2[i4] = (byte) i5;
            int i13 = i7 + 1;
            if (i4 == 0 - i6) {
                return new java.lang.String(bArr2, 0);
            }
            int i14 = i5;
            i10 = i13;
            i7 = bArr[i13];
            i9 = i4 + 1;
            i8 = i14;
            int i112 = (-i7) + i8;
            i4 = i9;
            int i122 = i10;
            i5 = i112;
            i7 = i122;
            bArr2[i4] = (byte) i5;
            int i132 = i7 + 1;
            if (i4 == 0 - i6) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            int i1322 = i7 + 1;
            if (i4 == 0 - i6) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SUB, -87, -71, -124};
        $$b = 41;
    }

    static void init$1() {
        $$d = new byte[]{64, com.google.common.base.Ascii.SYN, -17, -83, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 57, 14, -63, 69, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 57, com.google.common.base.Ascii.FS, -77, 67, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 69, 16, -77, 69, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 3, -58, com.google.common.base.Ascii.NAK, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.CAN, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 60, 6, -58, com.google.common.base.Ascii.SYN, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 70, 6, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 58, 17, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 6, -61, com.google.common.base.Ascii.ETB, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 70, -1, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 58, com.google.common.base.Ascii.NAK, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 70, 2, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 9, com.visa.cbp.getEncExpo.startTransaction, 19, 5, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 58, com.google.common.base.Ascii.GS, -79, 69, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 71, -1, -62, 70, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 9, com.visa.cbp.getEncExpo.startTransaction, com.google.common.base.Ascii.EM, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, com.google.common.base.Ascii.SI, -70, com.google.common.base.Ascii.ETB, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 9, com.visa.cbp.getEncExpo.startTransaction, 19, 7, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 72, 4, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.NAK, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 69, -2, -59, 69, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 57, 16, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 63, 9, com.visa.cbp.getEncExpo.startTransaction, 19, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 69, com.google.common.base.Ascii.SI, -76, 70, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, 69, 6, -67, 68, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, kotlin.io.encoding.Base64.padSymbol, 16, -69, com.google.common.base.Ascii.DC4, 18, 4, -57, 62, 1, 8, 8, com.google.common.base.Ascii.NAK, -9, 4, -47, 75, -9, 13, -55, kotlin.io.encoding.Base64.padSymbol, 2, -55, 71};
        $$e = 199;
    }

    static void init$2() {
        $$c = new byte[]{114, 116, -115, com.google.common.base.Ascii.CAN};
        $$f = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void u(short s2, short s3, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = b2 * 3;
        int i4 = 106 - s2;
        int i5 = 3 - (s3 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 += -i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i8 = i5 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i6 = i8;
            i5 = bArr[i8];
            i7 = i9;
            i4 += -i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            int i82 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i822 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void v(short s2, int i2, short s3, java.lang.Object[] objArr) {
        int i3;
        int i4 = s2 + 4;
        byte[] bArr = $$d;
        int i5 = s3 + 97;
        byte[] bArr2 = new byte[21 - i2];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i4;
            int i9 = (i6 + i4) - 6;
            int i10 = i8 + 1;
            i3 = i7;
            i5 = i9;
            i4 = i10;
            bArr2[i3] = (byte) i5;
            if (i3 == 20 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i3 + 1;
            i6 = i11;
            int i92 = (i6 + i4) - 6;
            int i102 = i8 + 1;
            i3 = i7;
            i5 = i92;
            i4 = i102;
            bArr2[i3] = (byte) i5;
            if (i3 == 20 - i2) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == 20 - i2) {
            }
        }
    }

    by() {
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        r = 0;
        s = 1;
        l = 0;
        p = 1;
        b();
        android.view.ViewConfiguration.getEdgeSlop();
        c = 0;
        d = 0;
        b = new java.util.ArrayList();
        f3446a = 0;
        g = false;
        e = false;
        h = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        t(16 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 80 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        q("＝䵭ꁆ鯽ꑶ惇붓穔啅턁\u1943坘", android.view.KeyEvent.getDeadChar(0, 0) + 11, objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        q("＝䵭㟽崡\ud991檐刍遤⓺뚅㯰曓啅턁\u1943坘", 15 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        j = new java.lang.String[]{intern, intern2, ((java.lang.String) objArr3[0]).intern()};
        r = (s + 81) % 128;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static int i = 0;

        /* renamed from: o, reason: collision with root package name */
        private static int f3449o = 1;
        final int f;

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.by.a f3448a = new com.facetec.sdk.by.a("InvalidCamera2OutputSizesDetected", 0, 1);
        public static final com.facetec.sdk.by.a c = new com.facetec.sdk.by.a("InvalidCamera1PreviewSizesDetected", 1, 2);
        public static final com.facetec.sdk.by.a b = new com.facetec.sdk.by.a("AllocationCopyToDuplicateBufferDetected", 2, 4);
        public static final com.facetec.sdk.by.a e = new com.facetec.sdk.by.a("Camera1SuspiciousFrameCallerDetected", 3, 8);
        public static final com.facetec.sdk.by.a d = new com.facetec.sdk.by.a("UnConfiguredCamera2CaptureRequestSurfaceDetected", 4, 16);
        public static final com.facetec.sdk.by.a h = new com.facetec.sdk.by.a("UnexpectedLikelyHookingExceptionDetected", 5, 32);
        public static final com.facetec.sdk.by.a j = new com.facetec.sdk.by.a("VirtualCamFilesDetected", 6, 64);
        private static final /* synthetic */ com.facetec.sdk.by.a[] g = e();
        private static int n = 1;
        private static int l = (n + 11) % 128;

        private static /* synthetic */ com.facetec.sdk.by.a[] e() {
            int i2 = (i + 107) % 128;
            f3449o = i2;
            com.facetec.sdk.by.a[] aVarArr = {f3448a, c, b, e, d, h, j};
            int i3 = (i2 ^ 7) + ((i2 & 7) << 1);
            i = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 81 / 0;
            }
            return aVarArr;
        }

        public static com.facetec.sdk.by.a valueOf(java.lang.String str) {
            f3449o = (i + 29) % 128;
            com.facetec.sdk.by.a aVar = (com.facetec.sdk.by.a) java.lang.Enum.valueOf(com.facetec.sdk.by.a.class, str);
            int i2 = f3449o;
            int i3 = ((i2 | 71) << 1) - (i2 ^ 71);
            i = i3 % 128;
            if (i3 % 2 == 0) {
                return aVar;
            }
            throw null;
        }

        public static com.facetec.sdk.by.a[] values() {
            f3449o = (i + 73) % 128;
            com.facetec.sdk.by.a[] aVarArr = (com.facetec.sdk.by.a[]) g.clone();
            int i2 = f3449o + 67;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            return aVarArr;
        }

        private a(java.lang.String str, int i2, int i3) {
            this.f = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        com.facetec.sdk.by.d = r3.f | com.facetec.sdk.by.d;
        e();
        r3 = com.facetec.sdk.by.p + 105;
        com.facetec.sdk.by.l = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        com.facetec.sdk.by.c |= r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0018, code lost:
    
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.facetec.sdk.by.a aVar, boolean z) {
        synchronized (com.facetec.sdk.by.class) {
            int i2 = p + 101;
            l = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 29 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if ((r4.f & com.facetec.sdk.by.c) > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        com.facetec.sdk.by.l = (com.facetec.sdk.by.p + 57) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        if ((r4.f & com.facetec.sdk.by.c) > 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean e(com.facetec.sdk.by.a aVar) {
        synchronized (com.facetec.sdk.by.class) {
            int i2 = p + 99;
            l = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 37 / 0;
            }
        }
    }

    private static void t(int i2, char c2, int i3, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        $10 = ($11 + 117) % 128;
        while (hhVar.e < i2) {
            int i4 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(f3447o[i3 + i4])};
                java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                if (d2 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    d2 = com.facetec.sdk.al.c((char) (45149 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 2150 - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.rgb(0, 0, 0) + 16777240, 1926116241, false, $$g(b2, b3, (byte) (b3 | 7)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(n), java.lang.Integer.valueOf(c2)};
                java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                if (d3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    d3 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 1835 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25, -1880730373, false, $$g(b4, b5, (byte) (b5 | 6)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                if (d4 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    d4 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.View.MeasureSpec.getMode(0) + 2341, 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), -1839099840, false, $$g(b6, b7, (byte) (b7 | 10)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        $11 = ($10 + 115) % 128;
        while (hhVar.e < i2) {
            $10 = ($11 + 61) % 128;
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
            if (d5 == null) {
                byte b8 = (byte) (-1);
                byte b9 = (byte) (b8 + 1);
                d5 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2341, 24 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), -1839099840, false, $$g(b8, b9, (byte) (b9 | 10)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        private static java.lang.Boolean f3450a;
        private static int b;
        private static int c;
        private static int d;
        private static byte[] e;
        private static short[] f;
        private static char g;
        private static char h;
        private static char i;
        private static char j;
        private static final int k = 0;
        private static int l;
        private static final byte[] m = null;
        private static int n;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$e(int i2, short s, short s2) {
            int i3;
            int i4 = s2 + 68;
            byte[] bArr = $$c;
            int i5 = (s * 4) + 4;
            int i6 = i2 * 3;
            byte[] bArr2 = new byte[i6 + 1];
            if (bArr == null) {
                int i7 = i4;
                i3 = 0;
                i4 = i6;
                i5++;
                i4 += i7;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                    return new java.lang.String(bArr2, 0);
                }
                i3++;
                i7 = bArr[i5];
                i5++;
                i4 += i7;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                if (i3 == i6) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{2, 98, -91, -34, 9, -5, -66, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -8, -1, -1, com.google.common.base.Ascii.FF, -18, -5, -56, 66, -18, 4, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, com.google.common.base.Ascii.DC4};
            $$b = 207;
        }

        static void init$1() {
            $$c = new byte[]{com.google.common.base.Ascii.EM, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 18};
            $$d = 193;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void p(byte b2, byte b3, short s, java.lang.Object[] objArr) {
            int i2;
            int i3 = 20 - (b3 * 17);
            byte[] bArr = $$a;
            int i4 = b2 * 17;
            int i5 = 101 - (s * 2);
            byte[] bArr2 = new byte[18 - i4];
            int i6 = 17 - i4;
            if (bArr == null) {
                int i7 = i6;
                int i8 = i3;
                int i9 = 0;
                int i10 = i3 + i7 + 3;
                i2 = i9;
                int i11 = i8;
                i5 = i10;
                i3 = i11;
                int i12 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i9 = i2 + 1;
                if (i2 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i12];
                int i13 = i5;
                i8 = i12;
                i3 = i13;
                int i102 = i3 + i7 + 3;
                i2 = i9;
                int i112 = i8;
                i5 = i102;
                i3 = i112;
                int i122 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i9 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                int i1222 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i9 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        private static void r(java.lang.String str, int i2, java.lang.Object[] objArr) {
            char[] charArray = str != null ? str.toCharArray() : str;
            com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
            char[] cArr = new char[charArray.length];
            hoVar.b = 0;
            char[] cArr2 = new char[2];
            while (hoVar.b < charArray.length) {
                $10 = ($11 + 31) % 128;
                cArr2[0] = charArray[hoVar.b];
                cArr2[1] = charArray[hoVar.b + 1];
                int i3 = 58224;
                int i4 = 0;
                while (i4 < 16) {
                    $10 = ($11 + 13) % 128;
                    char c2 = cArr2[1];
                    char c3 = cArr2[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (i ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(g)};
                        int i5 = c3 + i3;
                        java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                        if (d2 == null) {
                            d2 = com.facetec.sdk.al.c((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 211 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (j ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(h)};
                        int i6 = charValue + i3;
                        java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 211, android.view.View.MeasureSpec.getMode(0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                        i3 -= 40503;
                        i4++;
                        $11 = ($10 + 117) % 128;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr[hoVar.b] = cArr2[0];
                cArr[hoVar.b + 1] = cArr2[1];
                java.lang.Object[] objArr4 = {hoVar, hoVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
                if (d4 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    d4 = com.facetec.sdk.al.c((char) (31540 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1914 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 23, 635836640, false, $$e(b2, b3, (byte) (b3 | 44)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            java.lang.String str2 = new java.lang.String(cArr, 0, i2);
            int i7 = $10 + 19;
            $11 = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = str2;
            } else {
                java.lang.Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private static void q(byte b2, int i2, short s, int i3, int i4, java.lang.Object[] objArr) {
            int i5;
            int i6;
            int i7;
            com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(b)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2222, 25 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1792780429, false, $$e(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                if (intValue == -1) {
                    i5 = 1;
                } else {
                    $11 = ($10 + 119) % 128;
                    i5 = 0;
                }
                if (i5 != 0) {
                    int i8 = $10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i9 = i8 % 128;
                    $11 = i9;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr = e;
                    if (bArr != null) {
                        $10 = (i9 + 51) % 128;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i10])};
                            java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                            if (d3 == null) {
                                d3 = com.facetec.sdk.al.c((char) android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.red(0) + 94, android.text.TextUtils.getTrimmedLength("") + 23, 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            bArr2[i10] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i11 = $10 + 81;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            byte[] bArr3 = e;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(d)};
                            java.lang.Object d4 = com.facetec.sdk.al.d(-852176267);
                            if (d4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2222 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, 1792780429, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            i7 = ((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue()] % 1009991189275744878L)) >>> ((int) (b % 1009991189275744878L));
                        } else {
                            byte[] bArr4 = e;
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(d)};
                            java.lang.Object d5 = com.facetec.sdk.al.d(-852176267);
                            if (d5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                d5 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2222, (-16777192) - android.graphics.Color.rgb(0, 0, 0), 1792780429, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            i7 = ((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).intValue()] ^ 1009991189275744878L)) + ((int) (b ^ 1009991189275744878L));
                        }
                        intValue = (byte) i7;
                    } else {
                        intValue = (short) (((short) (f[i3 + ((int) (d ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (b ^ 1009991189275744878L)));
                    }
                }
                if (intValue > 0) {
                    $11 = ($10 + 51) % 128;
                    hmVar.b = ((i3 + intValue) - 2) + ((int) (d ^ 1009991189275744878L)) + i5;
                    java.lang.Object[] objArr6 = {hmVar, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(c), sb};
                    java.lang.Object d6 = com.facetec.sdk.al.d(-1371371196);
                    if (d6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        d6 = com.facetec.sdk.al.c((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 884, 32 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 162395068, false, $$e(b9, b10, (byte) (b10 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) d6).invoke(null, objArr6)).append(hmVar.c);
                    hmVar.d = hmVar.c;
                    byte[] bArr5 = e;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr6[i12] = (byte) (bArr5[i12] ^ 1009991189275744878L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z = bArr5 != null;
                    hmVar.e = 1;
                    $10 = ($11 + 57) % 128;
                    while (hmVar.e < intValue) {
                        if (z) {
                            int i13 = $10 + 117;
                            $11 = i13 % 128;
                            if (i13 % 2 == 0) {
                                byte[] bArr7 = e;
                                hmVar.b = hmVar.b;
                                i6 = hmVar.d * (((byte) (((byte) (bArr7[r8] % 1009991189275744878L)) - s)) ^ b2);
                            } else {
                                byte[] bArr8 = e;
                                hmVar.b = hmVar.b - 1;
                                i6 = hmVar.d + (((byte) (((byte) (bArr8[r8] ^ 1009991189275744878L)) + s)) ^ b2);
                            }
                            hmVar.c = (char) i6;
                        } else {
                            short[] sArr = f;
                            hmVar.b = hmVar.b - 1;
                            hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r8] ^ 1009991189275744878L)) + s)) ^ b2));
                        }
                        sb.append(hmVar.c);
                        hmVar.d = hmVar.c;
                        hmVar.e++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public static void b(android.content.Context context, long j2, long j3) {
            int i2 = l + 27;
            n = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (context == null) {
                return;
            }
            try {
                java.lang.Object[] objArr = {context, com.facetec.sdk.by.e.class.getField("j").get(null)};
                byte[] bArr = $$a;
                byte b2 = bArr[9];
                byte b3 = (byte) (b2 + 1);
                byte b4 = (byte) (-b2);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                p(b3, b4, b4, objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                byte b5 = (byte) (-bArr[9]);
                byte b6 = (byte) (b5 - 1);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                p(b5, b6, b6, objArr3);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, objArr);
                n = (l + 91) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void o(short s, short s2, int i2, java.lang.Object[] objArr) {
            int i3;
            byte[] bArr = m;
            int i4 = s + 44;
            int i5 = 301 - s2;
            byte[] bArr2 = new byte[224 - i2];
            int i6 = 223 - i2;
            if (bArr == null) {
                int i7 = i4;
                i4 = i6;
                int i8 = 0;
                i4 = i4 + (-i7) + 2;
                i3 = i8;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i5++;
                i7 = bArr[i5];
                i4 = i4 + (-i7) + 2;
                i3 = i8;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i6) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i8 = i3 + 1;
                if (i3 == i6) {
                }
            }
        }

        static void a() {
            m = new byte[]{5, 99, 10, 46, -2, 7, 1, -3, 8, 1, -4, 9, 1, -5, 10, 1, -6, com.google.common.base.Ascii.VT, 1, -3, 8, 1, -7, com.google.common.base.Ascii.FF, 1, -8, 13, 1, -9, 14, -9, 13, 1, -10, com.google.common.base.Ascii.SI, 1, -7, com.google.common.base.Ascii.FF, 1, -2, 3, 6, -10, 14, -11, com.google.common.base.Ascii.SI, -3, 3, 6, 1, -2, 2, 7, -3, 2, 7, 1, -8, 13, 1, -2, 1, 8, -3, 1, 8, -3, 0, 9, -11, com.google.common.base.Ascii.SI, 1, -2, 0, 9, -3, -3, com.google.common.base.Ascii.FF, 1, -2, -1, 10, 1, -2, -2, com.google.common.base.Ascii.VT, 1, -2, -3, com.google.common.base.Ascii.FF, 1, -2, -4, 13, -3, 2, 7, -3, -5, 14, -3, -6, com.google.common.base.Ascii.SI, -3, 3, 6, 1, -8, 13, 1, -2, 1, 8, -4, 4, 6, -4, 3, 7, -4, 2, 8, -11, com.google.common.base.Ascii.SI, 1, -2, 0, 9, -4, 1, 9, -11, com.google.common.base.Ascii.SI, 1, -2, -5, 14, 1, -2, -6, com.google.common.base.Ascii.SI, 1, -3, 4, 6, 1, -2, -4, 13, 1, -3, 8, -4, 0, 10, 1, -3, 3, 7, -3, 3, 6, 1, -3, 2, 8, 1, -3, 1, 9, 1, -3, 0, 10, 1, -3, -1, com.google.common.base.Ascii.VT, -4, -2, com.google.common.base.Ascii.FF, 1, -3, -2, com.google.common.base.Ascii.FF, -4, -3, 13, 1, -3, -2, com.google.common.base.Ascii.FF, 1, -3, -3, 13, -4, -2, com.google.common.base.Ascii.FF, 1, -3, -4, 14, -4, -3, 13, 1, -3, -4, 14, 1, -3, -5, com.google.common.base.Ascii.SI, -4, -2, com.google.common.base.Ascii.FF, 1, -4, 5, 6, -4, -3, 13, 1, -4, 5, com.google.common.base.Ascii.VT, -19, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -60, 13, -11, 9, 59, -35, -31, 4, com.google.common.base.Ascii.VT, -3, 9, 5, 6, 5, -9, com.google.common.base.Ascii.VT, -19, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -60, 13, -11, 9, 59, -25, -35, -4, 17, 0, 4, -11, com.google.common.base.Ascii.ETB, -9, -7, 18, com.google.common.base.Ascii.CAN, -21, -3, -4, 32, -9, -9, -7, 18, com.google.common.base.Ascii.VT, -19, com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -60, 13, -11, 9, 59, -18, -43, 2, 5, 9, 6, -11, -11, 2, 5, 9, 6, -11, com.google.common.base.Ascii.SUB, -9, -9, -7, 18, 4, -1, 18};
            k = 65;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            a();
            l = 0;
            n = 1;
            d = -1458906492;
            b = -1358030328;
            c = 1986077970;
            e = new byte[]{-82, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 70, -80, -79, 66, -78, 64, -107, -105, -73, 76, 106, -99, 73, -73, 76, 10, -3, 113, 67, 72, -93, -124, 2, -78, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 64, 74, -91, 73, 69, -14, 1, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 92, -94, 64, -33, 74, -91, 71, -80, 73, -102, -93, com.google.common.base.Ascii.FF, -80, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 71, -80, 73, -70, -125, 124, 77, 76, 75, -72, 64, -69, -58, com.google.common.base.Ascii.SYN, -25, 58, -5, -31, com.google.common.base.Ascii.EM, -23, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, 14, -61, 16, -31, -42, 80, -95, 124, -67, -89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -81, 81, 91, 72, 123, -104, -92, com.google.common.base.Ascii.ESC, -29, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 80, -88, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -90, 85, 108, -109, -94, -93, -92, 87, -81, 84, -15, com.google.common.base.Ascii.CAN, -22, com.google.common.base.Ascii.SYN, -57, -53, 125, -118, 114, -110, 126, 122, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -86, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -127, -40, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 65, -67, -81, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -69, 66, -86, com.visa.cbp.getEncExpo.registerForActivityResult, 125, 65, -2, 6, -70, -75, 77, -70, 67, -80, -119, 118, 71, 70, 65, -78, 74, -79, -46, -11, com.google.common.base.Ascii.ETB, -6, -2, 7, -7, -15, 6, 9, 38, 14, 13, -1, -39, 46, -66, 6, 9, 6, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, 1, com.google.common.base.Ascii.SI, -13, -7, com.google.common.base.Ascii.SYN, -6, -10, 65, -55, -17, 17, -13, -33, -27, com.google.common.base.Ascii.US, -23, -24, com.google.common.base.Ascii.ESC, -21, com.google.common.base.Ascii.EM, -52, -50, -18, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 10, -1, 16, com.google.common.base.Ascii.NAK, -26, 3, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -31, 16};
            j = (char) 36424;
            h = (char) 31729;
            i = (char) 37659;
            g = (char) 43808;
        }

        public static java.lang.Object[] e(android.content.Context context, int i2, int i3) {
            int i4 = 0;
            if (context == null) {
                java.lang.Object[] objArr = {null, new int[]{i2}, new int[]{i2}, new int[1]};
                int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                int i5 = ~uptimeMillis;
                int i6 = ~(134527630 | i5);
                int i7 = i3 + ((555942993 | i6) * (-712)) + 1305761883 + (((~(uptimeMillis | 690470623)) | (~(i5 | (-555942994)))) * (-712)) + (((-690170966) | i6) * 712);
                int i8 = i7 ^ (i7 << 13);
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
                return objArr;
            }
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                q((byte) ((-39) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (-103) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) - 100974826, android.graphics.Color.red(0) + 647020782, objArr2);
                java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr2[0]).intern()), 2);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                r("쪎\udb5c隯퍼\ue379幌챪毚ゅධ訧大본\uf649痘㢁㤥ť隯퍼\ue379幌챪毚ゅධ碣撼ឥ\ufdd0䝱\u2eff", 31 - android.text.TextUtils.indexOf("", ""), objArr4);
                try {
                    java.lang.Object[] objArr5 = {((java.lang.String) objArr4[0]).intern()};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    q((byte) ((android.os.Process.myPid() >> 22) - 39), (-103) - (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) android.text.TextUtils.indexOf("", ""), android.graphics.Color.alpha(0) - 100974826, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 647020783, objArr6);
                    objArr3[0] = java.lang.Class.forName(((java.lang.String) objArr6[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    r("큸䴞픺ᙧ㤥ť隯퍼\ue379幌챪毚ゅධ碣撼\ue0a6訍鼔俲䤃翌扫틱톒븈ۀ뾹囇崆椌≣", android.view.MotionEvent.axisFromString("") + 32, objArr7);
                    try {
                        java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        q((byte) (android.graphics.Color.argb(0, 0, 0, 0) - 39), android.view.View.getDefaultSize(0, 0) - 103, (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-100974827) - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 647020782, objArr9);
                        objArr3[1] = java.lang.Class.forName(((java.lang.String) objArr9[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8);
                        try {
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            q((byte) ((-40) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-103) - android.view.KeyEvent.normalizeMetaState(0), (short) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.view.View.MeasureSpec.getSize(0) - 100974788, android.widget.ExpandableListView.getPackedPositionChild(0L) + 647020774, objArr10);
                            java.lang.Class<?> cls = java.lang.Class.forName(((java.lang.String) objArr10[0]).intern());
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            r("鼻⚠ኽⶦ볒㸩㊊붓鼻⚠⃩絕䎠\ue29d鼻⚠ᒫ垱", android.text.TextUtils.indexOf("", "", 0) + 17, objArr11);
                            java.lang.Object invoke = cls.getMethod(((java.lang.String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                int i10 = 647020773;
                                q((byte) (android.view.KeyEvent.normalizeMetaState(0) - 40), android.view.KeyEvent.normalizeMetaState(0) - 103, (short) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 100974788, 647020773 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr12);
                                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                r("鼻⚠ኽⶦ볒㸩㊊붓鼻⚠㩧퐭곱༃", android.widget.ExpandableListView.getPackedPositionType(0L) + 14, objArr13);
                                try {
                                    java.lang.Object[] objArr14 = {cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    r("熄ꀊ䤃翌扫틱톁ኔ쐕攚뷳左ᐓ砜˙\uf742\uef2d⓴㲄焺볒㸩㊊붓鼻⚠⃩絕䎠\ue29d鼻⚠ᒫ垱", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, objArr15);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr15[0]).intern());
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    q((byte) (android.text.TextUtils.getOffsetAfter("", 0) + 113), (-103) - android.graphics.Color.argb(0, 0, 0, 0), (short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 100974765, 647020779 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr16);
                                    java.lang.Object invoke2 = cls3.getMethod(((java.lang.String) objArr16[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr14);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    q((byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 55), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 102, (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-100974751) - android.graphics.Color.blue(0), 647020773 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    r("\uf457㦋쭲櫃꿌慄֔뷧\ufafd궪", android.view.View.getDefaultSize(0, 0) + 10, objArr18);
                                    java.lang.Object[] objArr19 = (java.lang.Object[]) cls4.getField(((java.lang.String) objArr18[0]).intern()).get(invoke2);
                                    int length = objArr19.length;
                                    int i11 = 0;
                                    while (i11 < length) {
                                        java.lang.Object obj = objArr19[i11];
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        q((byte) (128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionChild(0L) - 102, (short) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-100974721) - android.view.KeyEvent.getDeadChar(i4, i4), android.text.TextUtils.getOffsetBefore("", i4) + 647020764, objArr20);
                                        try {
                                            java.lang.Object[] objArr21 = {((java.lang.String) objArr20[i4]).intern()};
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            r("\u202aȐޒ\ud8cb\u0ba5傠氹竑֔뷧㉼㘩诪૦눘襤郞ᾎ㗝㈽؛里ﹲ銎༈清\ud978ڨ야／\uef59Ѕ\ueb23ﯾ槂ɧඤト", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 37, objArr22);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr22[i4]).intern());
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            q((byte) (android.view.KeyEvent.getDeadChar(i4, i4) + 17), (-103) - android.graphics.Color.argb(i4, i4, i4, i4), (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-100974715) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 647020778 - (android.widget.ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)), objArr23);
                                            java.lang.String intern = ((java.lang.String) objArr23[i4]).intern();
                                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                            clsArr[i4] = java.lang.String.class;
                                            java.lang.Object invoke3 = cls5.getMethod(intern, clsArr).invoke(null, objArr21);
                                            try {
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                q((byte) ((-46) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-103) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i4) + 1), (-100974704) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + i10, objArr24);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[0]).intern());
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                r("\ud8b3\ue95cஃ㇆야／\ue808ꙹ뇿훼ඤト", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 11, objArr25);
                                                try {
                                                    java.lang.Object[] objArr26 = {new java.io.ByteArrayInputStream((byte[]) cls6.getMethod(((java.lang.String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    r("\u202aȐޒ\ud8cb\u0ba5傠氹竑֔뷧㉼㘩诪૦눘襤郞ᾎ㗝㈽؛里ﹲ銎༈清\ud978ڨ야／\uef59Ѕ\ueb23ﯾ槂ɧඤト", 37 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr27);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    r("鼻⚠킅밍뇿훼야／ꇢ拵郞ᾎ狷䃧\ud9fb\ua639꿌慄칵외", android.text.TextUtils.getTrimmedLength("") + 19, objArr28);
                                                    java.lang.Object invoke4 = cls7.getMethod(((java.lang.String) objArr28[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr26);
                                                    int length2 = objArr3.length;
                                                    int i12 = 0;
                                                    for (int i13 = 2; i12 < i13; i13 = 2) {
                                                        java.lang.Object obj2 = objArr3[i12];
                                                        try {
                                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                            q((byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 106), (-103) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 100974676, 647020782 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr29);
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            q((byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT), (-104) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) android.text.TextUtils.indexOf("", ""), (-100974643) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 647020779, objArr30);
                                                            if (obj2.equals(cls8.getMethod(((java.lang.String) objArr30[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr31 = {null, new int[]{i2}, new int[]{i2 ^ 1}, new int[]{r2 ^ (r2 << 5)}};
                                                                int i14 = i3 + ((((~(1073347318 | i2)) | 2215954) * 449) - 268619018) + (((~((~i2) | 1073347318)) | 2215954) * 449) + 16;
                                                                int i15 = i14 ^ (i14 << 13);
                                                                int i16 = i15 ^ (i15 >>> 17);
                                                                return objArr31;
                                                            }
                                                            i12++;
                                                        } catch (java.lang.Throwable th) {
                                                            java.lang.Throwable cause = th.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    i11++;
                                                    i4 = 0;
                                                    i10 = 647020773;
                                                } catch (java.lang.Throwable th2) {
                                                    java.lang.Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                java.lang.Throwable cause3 = th3.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th3;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (java.lang.Throwable th5) {
                                    java.lang.Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                            } catch (java.lang.Throwable th6) {
                                java.lang.Throwable cause6 = th6.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th6;
                            }
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause7 = th7.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th7;
                        }
                    } catch (java.lang.Throwable th8) {
                        java.lang.Throwable cause8 = th8.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th8;
                    }
                } catch (java.lang.Throwable th9) {
                    java.lang.Throwable cause9 = th9.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th9;
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object[] objArr32 = {null, new int[]{i2}, new int[]{i2}, new int[]{r1 ^ (r1 << 5)}};
            int i17 = ~i2;
            int i18 = i3 + ((((~((-880138413) | i17)) | 875563044) * (-241)) - 1879582492) + (((~(i17 | (-4575369))) | (-931002861)) * 241);
            int i19 = i18 ^ (i18 << 13);
            int i20 = i19 ^ (i19 >>> 17);
            return objArr32;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x034b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0357  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0364 A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0351 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static boolean a(android.content.Context context) {
            java.lang.Object obj;
            int i2;
            int hashCode;
            boolean z;
            synchronized (com.facetec.sdk.by.c.class) {
                com.facetec.sdk.dy dyVar = new com.facetec.sdk.dy(context);
                byte[] bArr = m;
                java.lang.Object[] objArr = new java.lang.Object[1];
                o(bArr[6], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, bArr[67], objArr);
                char c2 = 0;
                java.lang.String str = (java.lang.String) objArr[0];
                byte b2 = bArr[67];
                short s = (short) (b2 | 75);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                o(b2, s, (short) (s | com.visa.cbp.setDeviceName.coroutineBoundary), objArr2);
                try {
                    java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                    int i3 = k;
                    byte b3 = (byte) (i3 - 3);
                    short s2 = (short) (i3 | 10);
                    short s3 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    o(b3, s2, s3, objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    o((byte) (i3 | 6), (short) (-bArr[231]), (short) (i3 | 154), objArr5);
                    java.lang.String str2 = (java.lang.String) objArr5[0];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    o(b3, s2, s3, objArr6);
                    java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
                    int[] iArr = new int[objArr7.length];
                    int i4 = 0;
                    while (i4 < objArr7.length) {
                        java.lang.Object[] objArr8 = {objArr7[i4]};
                        int i5 = k;
                        byte b4 = (byte) (i5 - 3);
                        short s4 = (short) (b4 & 248);
                        short s5 = (short) (i5 | 142);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        o(b4, s4, s5, objArr9);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[c2]);
                        java.lang.Object[] objArr10 = objArr7;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        o((byte) 74, (short) 40, (short) (i5 | 152), objArr11);
                        java.lang.String str3 = (java.lang.String) objArr11[0];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        o(b4, (short) (i5 | 10), s3, objArr12);
                        java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr12[0])).invoke(null, objArr8);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        o(b4, s4, s5, objArr13);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        o((byte) (i5 - 4), (short) 34, (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, objArr14);
                        iArr[i4] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr14[0], null).invoke(invoke, null)).intValue();
                        i4++;
                        objArr7 = objArr10;
                        c2 = 0;
                    }
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        try {
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                        switch (dyVar.b(iArr[i6])) {
                            case -30:
                                i6 = 63;
                            case -29:
                                dyVar.b(25);
                                int i8 = dyVar.c;
                                if (i8 != 0 && i8 == 1) {
                                    i6 = 8;
                                }
                                i6 = 5;
                                break;
                            case -28:
                                i6 = 58;
                            case -27:
                                dyVar.b(25);
                                int i9 = dyVar.c;
                                if (i9 != 0 && i9 == 1) {
                                    i6 = 1;
                                }
                                i6 = 46;
                                break;
                            case -26:
                                i6 = 53;
                            case -25:
                                try {
                                    dyVar.b(25);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    if (i6 < 30) {
                                        i6 = 28;
                                        dyVar.j = th;
                                        dyVar.b(28);
                                        break;
                                    }
                                    if (i6 < 47) {
                                        break;
                                    }
                                    throw th;
                                }
                                if (dyVar.c != 0) {
                                    i6 = 17;
                                } else {
                                    i7 = 29;
                                }
                            case -24:
                                i6 = 64;
                            case -23:
                                i6 = 66;
                            case -22:
                                obj = null;
                                dyVar.b(2);
                                if (dyVar.c == 0) {
                                    i2 = 52;
                                    i6 = i2;
                                }
                            case -21:
                                obj = null;
                                dyVar.d = 1;
                                dyVar.b(3);
                                dyVar.b(4);
                                hashCode = dyVar.f.hashCode();
                                dyVar.d = hashCode;
                                dyVar.b(5);
                            case -20:
                                i6 = 59;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                i6 = 61;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                obj = null;
                                dyVar.b(15);
                                if (dyVar.c == 0) {
                                    i2 = 44;
                                    i6 = i2;
                                }
                            case -17:
                                obj = null;
                                dyVar.b(17);
                                throw ((java.lang.Throwable) dyVar.f);
                                break;
                            case -16:
                                i6 = 54;
                            case -15:
                                i6 = 56;
                            case -14:
                                obj = null;
                                dyVar.b(15);
                                if (dyVar.c == 0) {
                                    i2 = 27;
                                    i6 = i2;
                                }
                            case -13:
                                obj = null;
                                dyVar.d = 1;
                                dyVar.b(3);
                                dyVar.b(14);
                                n = dyVar.c;
                            case -12:
                                obj = null;
                                hashCode = l;
                                dyVar.d = hashCode;
                                dyVar.b(5);
                            case -11:
                                i6 = 34;
                            case -10:
                                i6 = 19;
                            case -9:
                                obj = null;
                                dyVar.d = 1;
                                dyVar.b(3);
                                dyVar.b(4);
                                f3450a = (java.lang.Boolean) dyVar.f;
                            case -8:
                                try {
                                    int i10 = k;
                                    byte[] bArr2 = m;
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    o((byte) (i10 - 3), (short) (bArr2[297] + 1), (short) (i10 | 142), objArr15);
                                    try {
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                        byte b5 = (byte) 40;
                                        try {
                                            short s6 = bArr2[67];
                                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                                            o(b5, s6, (short) (s6 | 220), objArr16);
                                            try {
                                                obj = null;
                                                try {
                                                    dyVar.j = cls4.getField((java.lang.String) objArr16[0]).get(null);
                                                    dyVar.b(1);
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    if (i6 < 30 && i6 < 34) {
                                                        i6 = 28;
                                                        dyVar.j = th;
                                                        dyVar.b(28);
                                                    }
                                                    if (i6 < 47 || i6 >= 53) {
                                                        throw th;
                                                    }
                                                    i6 = 45;
                                                    dyVar.j = th;
                                                    dyVar.b(28);
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                obj = null;
                                                if (i6 < 30) {
                                                }
                                                if (i6 < 47) {
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            th = th5;
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        obj = null;
                                        if (i6 < 30) {
                                        }
                                        if (i6 < 47) {
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                }
                                break;
                            case -7:
                                try {
                                    dyVar.b(6);
                                    z = dyVar.c != 0;
                                    break;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    if (i6 < 30) {
                                    }
                                    if (i6 < 47) {
                                    }
                                    throw th;
                                }
                                break;
                            case -6:
                                dyVar.d = 1;
                                dyVar.b(3);
                                dyVar.b(4);
                                java.lang.Object obj2 = dyVar.f;
                                try {
                                    int i11 = k;
                                    byte[] bArr3 = m;
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    o((byte) (i11 - 3), (short) (bArr3[297] + 1), (short) (i11 | 142), objArr17);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    o((byte) (bArr3[230] + 1), bArr3[17], (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, objArr18);
                                    dyVar.d = ((java.lang.Boolean) cls5.getMethod((java.lang.String) objArr18[0], null).invoke(obj2, null)).booleanValue() ? 1 : 0;
                                    dyVar.b(5);
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause = th9.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th9;
                                }
                            case -5:
                                i6 = 8;
                            case -4:
                                i6 = 5;
                            case -3:
                                dyVar.b(2);
                                i6 = dyVar.c == 0 ? 4 : i7;
                            case -2:
                                dyVar.j = f3450a;
                                dyVar.b(1);
                            case -1:
                                i6 = 13;
                            default:
                        }
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause2 = th10.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th10;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (com.facetec.sdk.by.b.contains(r3) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (com.facetec.sdk.by.b.contains(r3) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        com.facetec.sdk.by.b.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(android.content.Context context, java.lang.String str, java.lang.Exception exc) {
        int i2 = l + 11;
        p = i2 % 128;
        if (i2 % 2 == 0) {
            a(com.facetec.sdk.by.a.h, true);
        } else {
            a(com.facetec.sdk.by.a.h, true);
        }
        com.facetec.sdk.t.c(context, com.facetec.sdk.c.UNEXPECTED_HOOK_CHECK_ERROR, str, exc);
        e();
        p = (l + 45) % 128;
    }

    static void e() {
        synchronized (com.facetec.sdk.by.class) {
            int i2 = p + 9;
            l = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 != 0) {
                com.facetec.sdk.cq.c();
                obj.hashCode();
                throw null;
            }
            if (!com.facetec.sdk.cq.c()) {
                int i3 = p + 85;
                l = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            com.facetec.sdk.cq.J(com.facetec.sdk.as.ak, 2);
            com.facetec.sdk.cq.J(com.facetec.sdk.as.ai, d);
            com.facetec.sdk.cq.J(com.facetec.sdk.as.aj, c);
            com.facetec.sdk.cq.N(com.facetec.sdk.as.am, new org.json.JSONArray((java.util.Collection) b).toString());
            com.facetec.sdk.cq.L(com.facetec.sdk.as.al, e);
            int i4 = l + 119;
            p = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
                return;
            }
            return;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static int k = 0;
        private static int l = 1;
        private static int m = 0;
        private static int s = 1;
        final int h;
        public static final com.facetec.sdk.by.e e = new com.facetec.sdk.by.e("EmulatorAbiDetected", 0, 1);

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.by.e f3451a = new com.facetec.sdk.by.e("DexGuardEmulatorDetected", 1, 2);
        public static final com.facetec.sdk.by.e c = new com.facetec.sdk.by.e("DexGuardRootDetected", 2, 4);
        public static final com.facetec.sdk.by.e d = new com.facetec.sdk.by.e("DexGuardHookDetected", 3, 8);
        public static final com.facetec.sdk.by.e b = new com.facetec.sdk.by.e("DexGuardVirtualEnvDetected", 4, 16);
        public static final com.facetec.sdk.by.e f = new com.facetec.sdk.by.e("DexGuardApkTamper", 5, 32);
        public static final com.facetec.sdk.by.e j = new com.facetec.sdk.by.e("DexGuardDebuggerAttached", 6, 64);
        private static com.facetec.sdk.by.e i = new com.facetec.sdk.by.e("CameraFrameHashFailed", 7, 256);
        private static com.facetec.sdk.by.e g = new com.facetec.sdk.by.e("Next", 8, 512);
        private static com.facetec.sdk.by.e n = new com.facetec.sdk.by.e("DexGuardTimeoutOrError", 9, 1073741824);

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ com.facetec.sdk.by.e[] f3452o = d();

        private static /* synthetic */ com.facetec.sdk.by.e[] d() {
            int i2 = (l + 119) % 128;
            m = i2;
            com.facetec.sdk.by.e[] eVarArr = {e, f3451a, c, d, b, f, j, i, g, n};
            int i3 = ((i2 | 49) << 1) - (i2 ^ 49);
            l = i3 % 128;
            if (i3 % 2 != 0) {
                return eVarArr;
            }
            java.lang.Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static com.facetec.sdk.by.e valueOf(java.lang.String str) {
            int i2 = m;
            l = (((i2 | 79) << 1) - (i2 ^ 79)) % 128;
            com.facetec.sdk.by.e eVar = (com.facetec.sdk.by.e) java.lang.Enum.valueOf(com.facetec.sdk.by.e.class, str);
            int i3 = l;
            m = (((i3 | 93) << 1) - (i3 ^ 93)) % 128;
            return eVar;
        }

        public static com.facetec.sdk.by.e[] values() {
            int i2 = l;
            m = (((i2 | 61) << 1) - (i2 ^ 61)) % 128;
            com.facetec.sdk.by.e[] eVarArr = (com.facetec.sdk.by.e[]) f3452o.clone();
            int i3 = l;
            int i4 = ((i3 | 11) << 1) - (i3 ^ 11);
            m = i4 % 128;
            if (i4 % 2 == 0) {
                return eVarArr;
            }
            throw null;
        }

        static {
            int i2 = k;
            int i3 = (i2 ^ 15) + ((i2 & 15) << 1);
            s = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        private e(java.lang.String str, int i2, int i3) {
            this.h = i3;
        }
    }

    private static void q(java.lang.String str, int i2, java.lang.Object[] objArr) {
        $10 = ($11 + 121) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr = new char[charArray.length];
        hoVar.b = 0;
        char[] cArr2 = new char[2];
        while (hoVar.b < charArray.length) {
            cArr2[0] = charArray[hoVar.b];
            cArr2[1] = charArray[hoVar.b + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c2 = cArr2[1];
                char c3 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c2), java.lang.Integer.valueOf(((c3 << 4) + ((char) (m ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(c3 >>> 5), java.lang.Integer.valueOf(k)};
                    int i5 = c3 + i3;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.graphics.Color.blue(0) + 211, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (f ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(i)};
                    int i6 = charValue + i3;
                    java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getOffsetBefore("", 0) + 211, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $10 + 55;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 / 4;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[hoVar.b] = cArr2[0];
            cArr[hoVar.b + 1] = cArr2[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
            if (d4 == null) {
                byte b2 = (byte) (-1);
                byte b3 = (byte) (b2 + 1);
                d4 = com.facetec.sdk.al.c((char) (31541 - android.view.Gravity.getAbsoluteGravity(0, 0)), 1913 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 23 - android.view.KeyEvent.keyCodeFromString(""), 635836640, false, $$g(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr, 0, i2);
    }

    private static /* synthetic */ java.lang.Object a(java.lang.Object[] objArr) {
        p = (l + 79) % 128;
        f();
        int i2 = p + 15;
        l = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 57 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171 A[Catch: all -> 0x017c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:28:0x0132, B:29:0x013d, B:32:0x0148, B:35:0x0153, B:38:0x0166, B:41:0x0171, B:44:0x0027, B:48:0x0045, B:50:0x0061, B:51:0x006c, B:53:0x008a, B:55:0x0092, B:57:0x00be, B:60:0x00cd, B:62:0x00f2, B:65:0x0101, B:67:0x011b), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(java.lang.String str) {
        synchronized (com.facetec.sdk.by.class) {
            int hashCode = str.hashCode();
            char c2 = 0;
            if (hashCode != 97) {
                if (hashCode == 104) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    t((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.red(0), objArr);
                    if (str.equals(((java.lang.String) objArr[0]).intern())) {
                        int i2 = l + 87;
                        p = i2 % 128;
                        if (i2 % 2 != 0) {
                            c2 = 3;
                        }
                        c2 = 2;
                    }
                    c2 = 65535;
                } else if (hashCode != 114) {
                    if (hashCode == 118) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        q("症ꕗ", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                        if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                            p = (l + 97) % 128;
                            c2 = 5;
                        }
                    } else if (hashCode == 100) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        q("頢\u07b7", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr3);
                        if (str.equals(((java.lang.String) objArr3[0]).intern())) {
                            p = (l + 99) % 128;
                            c2 = 1;
                        }
                    } else if (hashCode == 101) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        q("묇삙", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr4);
                        if (str.equals(((java.lang.String) objArr4[0]).intern())) {
                            c2 = 2;
                        }
                    }
                    c2 = 65535;
                } else {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    t(1 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (63527 - (android.os.Process.myPid() >> 22)), 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
                    if (str.equals(((java.lang.String) objArr5[0]).intern())) {
                        int i3 = l + 13;
                        p = i3 % 128;
                        if (i3 % 2 != 0) {
                            c2 = 4;
                        }
                        c2 = 5;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    f3446a |= com.facetec.sdk.by.e.f.h;
                    return;
                }
                if (c2 == 1) {
                    f3446a |= com.facetec.sdk.by.e.j.h;
                    return;
                }
                if (c2 == 2) {
                    f3446a |= com.facetec.sdk.by.e.f3451a.h;
                    p = (l + 49) % 128;
                    return;
                } else if (c2 == 3) {
                    f3446a |= com.facetec.sdk.by.e.d.h;
                    return;
                } else if (c2 == 4) {
                    f3446a |= com.facetec.sdk.by.e.c.h;
                    return;
                } else {
                    if (c2 == 5) {
                        f3446a |= com.facetec.sdk.by.e.b.h;
                    }
                    return;
                }
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            q("ৡ\ufe6c", android.graphics.Color.argb(0, 0, 0, 0) + 1, objArr6);
            if (str.equals(((java.lang.String) objArr6[0]).intern())) {
                l = (p + 47) % 128;
                if (c2 == 0) {
                }
            }
            c2 = 65535;
            if (c2 == 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        com.facetec.sdk.by.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if ((com.facetec.sdk.by.f3446a & com.facetec.sdk.by.e.e.h) <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        r0 = com.facetec.sdk.by.p + 15;
        com.facetec.sdk.by.l = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if ((r0 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (com.facetec.sdk.cq.d(com.facetec.sdk.by.f3446a) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        com.facetec.sdk.by.g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        com.facetec.sdk.cq.d(com.facetec.sdk.by.f3446a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f() {
        int i2 = l;
        p = (i2 + 59) % 128;
        if (!g) {
            p = (i2 + 115) % 128;
            java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                java.lang.Object obj = null;
                if (i3 >= length) {
                    break;
                }
                java.lang.String lowerCase = strArr[i3].toLowerCase();
                java.lang.Object[] objArr = new java.lang.Object[1];
                q("䥞曻\uaad9쟗", 3 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                if (lowerCase.startsWith(((java.lang.String) objArr[0]).intern())) {
                    int i4 = p + 49;
                    l = i4 % 128;
                    if (i4 % 2 != 0) {
                        f3446a |= com.facetec.sdk.by.e.e.h;
                        obj.hashCode();
                        throw null;
                    }
                    f3446a |= com.facetec.sdk.by.e.e.h;
                } else {
                    i3++;
                    l = (p + 107) % 128;
                }
            }
        }
        i();
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.by$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.by.g();
            }
        });
    }

    /* renamed from: com.facetec.sdk.by$3, reason: invalid class name */
    public class AnonymousClass3 implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.facetec.sdk.cq.L(com.facetec.sdk.as.al, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x19c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x1b30  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x1b8a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x1bd8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x1ec3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x2004  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x205f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x20a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x227f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x22ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x2147  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1f34  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1c81  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1bc2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1a2b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1815  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x23f5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x23f6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1636  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1465  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1397  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1218  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x1016  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0f60  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0d3c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0eaf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x11b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x12f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x13ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x15e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x16c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x1726  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x176e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void g() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object[] objArr;
        java.lang.String str3;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Long valueOf;
        java.lang.Object d2;
        char c2;
        int keyCodeFromString;
        int indexOf;
        java.lang.Object obj;
        java.lang.Object[] objArr4;
        java.lang.Throwable cause;
        int i2;
        java.lang.Object obj2;
        java.lang.Object d3;
        long j2;
        long longValue;
        java.lang.Object d4;
        java.lang.String str4;
        java.lang.Object[] objArr5;
        int i3;
        java.lang.Object obj3;
        java.lang.String str5;
        int i4;
        java.lang.Object d5;
        long j3;
        long longValue2;
        java.lang.Object d6;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object[] objArr6;
        java.lang.Object[] objArr7;
        int i5;
        java.lang.Object obj4;
        int nextInt;
        java.lang.Object d7;
        long j4;
        long longValue3;
        java.lang.Object d8;
        java.lang.String str8;
        java.lang.Object[] objArr8;
        java.lang.String str9;
        int i6;
        java.lang.Object obj5;
        int i7;
        java.lang.Object d9;
        long j5;
        long longValue4;
        java.lang.Object d10;
        java.lang.String str10;
        java.lang.Object[] objArr9;
        int i8;
        int i9;
        int i10;
        java.lang.Object d11;
        long j6;
        long longValue5;
        java.lang.Object d12;
        java.lang.String str11;
        java.lang.Object[] objArr10;
        java.lang.Object[] objArr11;
        int i11;
        java.lang.Object obj6;
        int i12;
        java.lang.Object d13;
        long j7;
        long longValue6;
        java.lang.Object d14;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.Object[] objArr12;
        int i13;
        java.lang.Object obj7;
        int i14;
        java.lang.Object d15;
        long j8;
        long longValue7;
        java.lang.Object d16;
        java.lang.Object[] objArr13;
        int i15;
        java.lang.Object obj8;
        p = (l + 31) % 128;
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1\ueca9蠜꙽䛂궻ㄌ\ue773뛳䤶\u0bdd\uf1cd럅狺﮽", android.text.TextUtils.getTrimmedLength("") + 22, objArr14);
        java.lang.String intern = ((java.lang.String) objArr14[0]).intern();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        t(android.widget.ExpandableListView.getPackedPositionType(0L) + 15, (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2, objArr15);
        java.lang.String intern2 = ((java.lang.String) objArr15[0]).intern();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1ꉹꨒ雧\ue5e9䔗䇘伂\u2fe1昩ᗕᴏ巆ᧀ蘼䨕壕\ue14c盄", 27 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr16);
        java.lang.String intern3 = ((java.lang.String) objArr16[0]).intern();
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        q("缋\ue158䗃⬆霒\ue7e9╁＋ढ़ꞷ＝䵭柍呖伂\u2fe1쯩\ud99f", 17 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr17);
        java.lang.String intern4 = ((java.lang.String) objArr17[0]).intern();
        java.lang.Object d17 = com.facetec.sdk.al.d(-1672709414);
        if (d17 == null) {
            char c3 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b2 = (byte) 0;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            u((byte) ($$b & 30), b2, b2, objArr18);
            d17 = com.facetec.sdk.al.c(c3, 1436 - (maximumDrawingCacheSize >> 24), 22 - lastIndexOf, 1000538146, false, (java.lang.String) objArr18[0], null);
        }
        long j9 = ((java.lang.reflect.Field) d17).getLong(null);
        long longValue8 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d18 = com.facetec.sdk.al.d(-1669938851);
        if (d18 == null) {
            char c4 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
            int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
            byte b3 = (byte) 5;
            byte b4 = (byte) (b3 - 5);
            str2 = intern2;
            str = intern;
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            u(b3, b4, b4, objArr19);
            d18 = com.facetec.sdk.al.c(c4, 1435 - lastIndexOf2, bitsPerPixel + 24, 999930789, false, (java.lang.String) objArr19[0], null);
        } else {
            str = intern;
            str2 = intern2;
        }
        if (j9 == ((longValue8 - ((((java.lang.reflect.Field) d18).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d19 = com.facetec.sdk.al.d(-1670862372);
            if (d19 == null) {
                char offsetBefore = (char) android.text.TextUtils.getOffsetBefore("", 0);
                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                int green = android.graphics.Color.green(0);
                byte b5 = (byte) 0;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                u((byte) 6, b5, b5, objArr20);
                d19 = com.facetec.sdk.al.c(offsetBefore, 1436 - (scrollDefaultDelay >> 16), green + 23, 998757156, false, (java.lang.String) objArr20[0], null);
            }
            java.lang.Object[] objArr21 = (java.lang.Object[]) ((java.lang.reflect.Field) d19).get(null);
            objArr2 = new java.lang.Object[]{(java.lang.String) objArr21[0], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, new int[1], (java.lang.String) objArr21[4]};
            int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i16 = ~freeMemory;
            int i17 = ((((((~((-714340181) | i16)) | 680784448) * (-108)) + 226698421) + (((~(i16 | 1035205186)) | ((~((-1035205187) | freeMemory)) | (-1068760919))) * 54)) + ((freeMemory | (-1068760919)) * 54)) - 162336326;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr2[3])[0] = i19 ^ (i19 << 5);
            str3 = str2;
        } else {
            android.content.Context context = (android.content.Context) java.lang.Class.forName(intern3).getMethod(intern4, new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                p = (l + 121) % 128;
                context = ((context instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            try {
                byte[] bArr = $$d;
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                v((short) 348, bArr[8], bArr[235], objArr22);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr22[0]);
                int i20 = bArr[8] - 1;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                v((short) i20, bArr[482], (byte) i20, objArr23);
                objArr = (java.lang.Object[]) cls.getMethod((java.lang.String) objArr23[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context, 0, 0, -162336326);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            if (context != null) {
                int i21 = p + 11;
                l = i21 % 128;
                try {
                    if (i21 % 2 != 0) {
                        java.lang.Object d20 = com.facetec.sdk.al.d(-1670862372);
                        if (d20 == null) {
                            char c5 = (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            byte b6 = (byte) 0;
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            u((byte) 6, b6, b6, objArr24);
                            d20 = com.facetec.sdk.al.c(c5, (maximumFlingVelocity >> 16) + 1436, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 22, 998757156, false, (java.lang.String) objArr24[0], null);
                        }
                        ((java.lang.reflect.Field) d20).set(null, objArr);
                        str3 = str2;
                        long longValue9 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Object d21 = com.facetec.sdk.al.d(-1669938851);
                        if (d21 == null) {
                            char c6 = (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            float complexToFloat = android.util.TypedValue.complexToFloat(0);
                            byte b7 = (byte) 5;
                            byte b8 = (byte) (b7 - 5);
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            u(b7, b8, b8, objArr25);
                            d21 = com.facetec.sdk.al.c(c6, 1435 - indexOf2, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 23, 999930789, false, (java.lang.String) objArr25[0], null);
                        }
                        ((java.lang.reflect.Field) d21).set(null, java.lang.Long.valueOf(longValue9));
                        valueOf = java.lang.Long.valueOf(longValue9 << 86);
                        d2 = com.facetec.sdk.al.d(-1672709414);
                        if (d2 == null) {
                            c2 = (char) android.text.TextUtils.indexOf("", "", 0);
                            keyCodeFromString = 1435 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
                            indexOf = 22 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            byte b9 = (byte) 0;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            u((byte) ($$b & 30), b9, b9, objArr26);
                            obj = objArr26[0];
                            objArr3 = objArr;
                            d2 = com.facetec.sdk.al.c(c2, keyCodeFromString, indexOf, 1000538146, false, (java.lang.String) obj, null);
                            ((java.lang.reflect.Field) d2).set(null, valueOf);
                            objArr4 = objArr3;
                            java.lang.Object obj9 = objArr4[1];
                            i2 = ((int[]) obj9)[0];
                            obj2 = objArr4[2];
                            if (((int[]) obj2)[0] != i2) {
                                l = (p + 11) % 128;
                                int i22 = ((int[]) objArr4[3])[0];
                                java.lang.Object[] objArr27 = {(java.lang.String) objArr4[0], new int[]{((int[]) obj9)[0]}, new int[]{((int[]) obj2)[0]}, new int[1], (java.lang.String) objArr4[4]};
                                int i23 = ~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 487604282);
                                int i24 = i22 + ((152043528 | i23) * (-374)) + 404899217 + ((i23 | 335560754) * 374);
                                int i25 = (i24 << 13) ^ i24;
                                int i26 = i25 ^ (i25 >>> 17);
                                ((int[]) objArr27[3])[0] = i26 ^ (i26 << 5);
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add((java.lang.String) objArr4[4]);
                                arrayList.add((java.lang.String) objArr4[0]);
                                try {
                                    java.lang.Object[] objArr28 = {java.lang.Long.valueOf((i2 ^ r7) ^ (-7417002864825860096L)), -1726905583L};
                                    byte[] bArr2 = $$d;
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    v((short) 367, bArr2[8], bArr2[235], objArr29);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    v((short) 38, bArr2[482], bArr2[235], objArr30);
                                    cls2.getMethod((java.lang.String) objArr30[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr28);
                                    int i27 = ((int[]) objArr4[3])[0];
                                    java.lang.Object[] objArr31 = {(java.lang.String) objArr4[0], new int[]{((int[]) objArr4[1])[0]}, new int[]{((int[]) objArr4[2])[0]}, new int[1], (java.lang.String) objArr4[4]};
                                    int myPid = android.os.Process.myPid();
                                    int i28 = i27 + ((((((~((-545260545) | myPid)) | (~((-224395539) | myPid))) * 69) + 1971476582) + ((((~(myPid | (-545868874))) | 608329) | (~((-225003868) | myPid))) * (-69))) - 1608636876);
                                    int i29 = (i28 << 13) ^ i28;
                                    int i30 = i29 ^ (i29 >>> 17);
                                    ((int[]) objArr31[3])[0] = i30 ^ (i30 << 5);
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }
                            d3 = com.facetec.sdk.al.d(-1265134566);
                            if (d3 == null) {
                                char myTid = (char) (android.os.Process.myTid() >> 22);
                                long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                                int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                                byte length = (byte) $$a.length;
                                byte b10 = (byte) (length - 4);
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                u(length, b10, b10, objArr32);
                                d3 = com.facetec.sdk.al.c(myTid, 568 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 24 - (maximumDrawingCacheSize2 >> 24), 326692578, false, (java.lang.String) objArr32[0], null);
                            }
                            j2 = ((java.lang.reflect.Field) d3).getLong(null);
                            longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d4 = com.facetec.sdk.al.d(-1261440482);
                            if (d4 != null) {
                                char lastIndexOf3 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                str4 = intern4;
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                u(b11, b12, b12, objArr33);
                                d4 = com.facetec.sdk.al.c(lastIndexOf3, 567 - makeMeasureSpec, 24 - packedPositionType, 320899302, false, (java.lang.String) objArr33[0], null);
                            } else {
                                str4 = intern4;
                            }
                            if (j2 != ((longValue - ((((java.lang.reflect.Field) d4).getLong(null) << 53) >>> 53)) >> 11)) {
                                java.lang.Object d22 = com.facetec.sdk.al.d(-1262364003);
                                if (d22 == null) {
                                    char myPid2 = (char) (android.os.Process.myPid() >> 22);
                                    int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                    int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                                    byte b13 = (byte) ($$b & 7);
                                    byte b14 = (byte) (b13 - 1);
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    u(b13, b14, b14, objArr34);
                                    d22 = com.facetec.sdk.al.c(myPid2, normalizeMetaState + 567, (touchSlop >> 8) + 24, 321822821, false, (java.lang.String) objArr34[0], null);
                                }
                                java.lang.Object[] objArr35 = (java.lang.Object[]) ((java.lang.reflect.Field) d22).get(null);
                                objArr5 = new java.lang.Object[]{(java.lang.String) objArr35[0], new int[]{((int[]) objArr35[1])[0]}, new int[]{((int[]) objArr35[2])[0]}, new int[1]};
                                int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                int i31 = ((((~((-612449942) | freeMemory2)) | 75507716) * 345) - 228475144) + (((~((-612449942) | (~freeMemory2))) | 136740938) * 345) + ((~(freeMemory2 | (-75507717))) * 345) + 1273620630;
                                int i32 = (i31 << 13) ^ i31;
                                int i33 = i32 ^ (i32 >>> 17);
                                ((int[]) objArr5[3])[0] = i33 ^ (i33 << 5);
                            } else {
                                byte[] bArr3 = $$d;
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                v((short) 386, bArr3[77], bArr3[235], objArr36);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr3[482], bArr3[8], objArr37);
                                objArr5 = (java.lang.Object[]) cls3.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, 1273620630);
                                java.lang.Object d23 = com.facetec.sdk.al.d(-1262364003);
                                if (d23 == null) {
                                    char packedPositionChild = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                                    long zoomControlsTimeout2 = android.view.ViewConfiguration.getZoomControlsTimeout();
                                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                    byte b15 = (byte) ($$b & 7);
                                    byte b16 = (byte) (b15 - 1);
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    u(b15, b16, b16, objArr38);
                                    d23 = com.facetec.sdk.al.c(packedPositionChild, (zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 24 - (edgeSlop >> 16), 321822821, false, (java.lang.String) objArr38[0], null);
                                }
                                ((java.lang.reflect.Field) d23).set(null, objArr5);
                                try {
                                    long longValue10 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Object d24 = com.facetec.sdk.al.d(-1261440482);
                                    if (d24 == null) {
                                        char edgeSlop2 = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                        int indexOf3 = android.text.TextUtils.indexOf("", "", 0);
                                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                                        byte b17 = (byte) 0;
                                        byte b18 = b17;
                                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                                        u(b17, b18, b18, objArr39);
                                        d24 = com.facetec.sdk.al.c(edgeSlop2, 567 - indexOf3, 24 - makeMeasureSpec2, 320899302, false, (java.lang.String) objArr39[0], null);
                                    }
                                    ((java.lang.reflect.Field) d24).set(null, java.lang.Long.valueOf(longValue10));
                                    java.lang.Object d25 = com.facetec.sdk.al.d(-1265134566);
                                    if (d25 == null) {
                                        char mode = (char) android.view.View.MeasureSpec.getMode(0);
                                        float maxVolume = android.media.AudioTrack.getMaxVolume();
                                        int indexOf4 = android.text.TextUtils.indexOf("", "", 0, 0);
                                        byte length2 = (byte) $$a.length;
                                        byte b19 = (byte) (length2 - 4);
                                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                                        u(length2, b19, b19, objArr40);
                                        d25 = com.facetec.sdk.al.c(mode, 568 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), indexOf4 + 24, 326692578, false, (java.lang.String) objArr40[0], null);
                                    }
                                    ((java.lang.reflect.Field) d25).set(null, java.lang.Long.valueOf(longValue10 >> 11));
                                } catch (java.lang.Exception unused) {
                                    throw new java.lang.RuntimeException();
                                }
                            }
                            java.lang.Object obj10 = objArr5[2];
                            i3 = ((int[]) obj10)[0];
                            obj3 = objArr5[1];
                            if (((int[]) obj3)[0] != i3) {
                                int i34 = ((int[]) objArr5[3])[0];
                                java.lang.Object[] objArr41 = {(java.lang.String) objArr5[0], new int[]{((int[]) obj3)[0]}, new int[]{((int[]) obj10)[0]}, new int[1]};
                                int elapsedRealtime2 = (int) android.os.SystemClock.elapsedRealtime();
                                int i35 = i34 + ((((~((-93442115) | elapsedRealtime2)) | 76648450) * (-140)) - 1378947687) + ((~((-16793665) | elapsedRealtime2)) * 70) + (((~(elapsedRealtime2 | 918140710)) | (-858285925)) * 70);
                                int i36 = (i35 << 13) ^ i35;
                                int i37 = i36 ^ (i36 >>> 17);
                                ((int[]) objArr41[3])[0] = i37 ^ (i37 << 5);
                                p = (l + 89) % 128;
                                i4 = 0;
                                str5 = str4;
                            } else {
                                new java.util.ArrayList().add((java.lang.String) objArr5[0]);
                                str5 = str4;
                                android.content.Context context2 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str5, new java.lang.Class[0]).invoke(null, null);
                                if (context2 != null) {
                                    context2 = ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
                                }
                                if (android.os.Looper.myLooper() == null) {
                                    context2 = null;
                                }
                                java.lang.Object[] objArr42 = {context2, java.lang.Long.valueOf((i3 ^ r10) ^ (-7828133695792873472L)), -1822629391L};
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                v((short) (-$$d[443]), r3[77], r3[235], objArr43);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr43[0]);
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                v((short) 93, r3[482], r3[5], objArr44);
                                cls4.getMethod((java.lang.String) objArr44[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr42);
                                int i38 = ((int[]) objArr5[3])[0];
                                java.lang.Object[] objArr45 = {(java.lang.String) objArr5[0], new int[]{((int[]) objArr5[1])[0]}, new int[]{((int[]) objArr5[2])[0]}, new int[1]};
                                int i39 = i38 + ((((~((-619846187) | r3)) | 70256680) * 576) - 1755289565) + (((~((~((int) android.os.SystemClock.uptimeMillis())) | (-549589507))) | 134595729) * 576) + 1813142016;
                                int i40 = (i39 << 13) ^ i39;
                                int i41 = i40 ^ (i40 >>> 17);
                                i4 = 0;
                                ((int[]) objArr45[3])[0] = i41 ^ (i41 << 5);
                            }
                            d5 = com.facetec.sdk.al.d(-1266058087);
                            if (d5 == null) {
                                char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                int combineMeasuredStates = android.view.View.combineMeasuredStates(i4, i4);
                                byte b20 = (byte) 5;
                                byte b21 = (byte) (b20 - 5);
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                u(b20, b21, b21, objArr46);
                                d5 = com.facetec.sdk.al.c(maximumFlingVelocity2, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, combineMeasuredStates + 24, 325453409, false, (java.lang.String) objArr46[0], null);
                            }
                            j3 = ((java.lang.reflect.Field) d5).getLong(null);
                            longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d6 = com.facetec.sdk.al.d(-1266981608);
                            if (d6 != null) {
                                char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                int indexOf5 = android.text.TextUtils.indexOf("", "");
                                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                                byte b22 = (byte) 0;
                                str6 = str3;
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                u((byte) 6, b22, b22, objArr47);
                                d6 = com.facetec.sdk.al.c(scrollBarSize, indexOf5 + 567, 24 - capsMode, 328474592, false, (java.lang.String) objArr47[0], null);
                            } else {
                                str6 = str3;
                            }
                            if (j3 != ((longValue2 - ((((java.lang.reflect.Field) d6).getLong(null) << 53) >>> 53)) >> 11)) {
                                l = (p + 73) % 128;
                                java.lang.Object d26 = com.facetec.sdk.al.d(-1264211045);
                                if (d26 == null) {
                                    char c7 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                                    int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                                    int indexOf6 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                    byte b23 = (byte) 3;
                                    byte b24 = (byte) (b23 - 3);
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    u(b23, b24, b24, objArr48);
                                    d26 = com.facetec.sdk.al.c(c7, 567 - (minimumFlingVelocity >> 16), 23 - indexOf6, 323670371, false, (java.lang.String) objArr48[0], null);
                                }
                                java.lang.Object[] objArr49 = (java.lang.Object[]) ((java.lang.reflect.Field) d26).get(null);
                                objArr7 = new java.lang.Object[]{(java.lang.String) objArr49[0], new int[]{((int[]) objArr49[1])[0]}, new int[]{((int[]) objArr49[2])[0]}, new int[1]};
                                int elapsedRealtime3 = (int) android.os.SystemClock.elapsedRealtime();
                                int i42 = ~elapsedRealtime3;
                                int i43 = ((((((~((-19418149) | i42)) | 844116744) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 304719031) + (((~(i42 | (-162385000))) | 987083595) * (-440))) + ((elapsedRealtime3 | (-19418149)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 348501553;
                                int i44 = (i43 << 13) ^ i43;
                                int i45 = i44 ^ (i44 >>> 17);
                                ((int[]) objArr7[3])[0] = i45 ^ (i45 << 5);
                                str7 = str6;
                            } else {
                                android.content.Context context3 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str5, new java.lang.Class[0]).invoke(null, null);
                                if (context3 != null) {
                                    context3 = ((context3 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context3).getBaseContext() == null) ? null : context3.getApplicationContext();
                                }
                                byte[] bArr4 = $$d;
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                v((short) 403, bArr4[8], bArr4[235], objArr50);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                v((short) 38, bArr4[482], bArr4[235], objArr51);
                                java.lang.Object[] objArr52 = (java.lang.Object[]) cls5.getMethod((java.lang.String) objArr51[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, -348501553);
                                if (context3 != null) {
                                    java.lang.Object d27 = com.facetec.sdk.al.d(-1264211045);
                                    if (d27 == null) {
                                        char argb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                                        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
                                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                                        byte b25 = (byte) 3;
                                        byte b26 = (byte) (b25 - 3);
                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                        u(b25, b26, b26, objArr53);
                                        d27 = com.facetec.sdk.al.c(argb, 567 - absoluteGravity, (maxKeyCode >> 16) + 24, 323670371, false, (java.lang.String) objArr53[0], null);
                                    }
                                    ((java.lang.reflect.Field) d27).set(null, objArr52);
                                    try {
                                        str7 = str6;
                                        long longValue11 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Object d28 = com.facetec.sdk.al.d(-1266981608);
                                        if (d28 == null) {
                                            char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
                                            int offsetBefore2 = android.text.TextUtils.getOffsetBefore("", 0);
                                            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                                            byte b27 = (byte) 0;
                                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                                            u((byte) 6, b27, b27, objArr54);
                                            d28 = com.facetec.sdk.al.c(deadChar, offsetBefore2 + 567, trimmedLength + 24, 328474592, false, (java.lang.String) objArr54[0], null);
                                        }
                                        ((java.lang.reflect.Field) d28).set(null, java.lang.Long.valueOf(longValue11));
                                        java.lang.Object d29 = com.facetec.sdk.al.d(-1266058087);
                                        if (d29 == null) {
                                            char bitsPerPixel2 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
                                            long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                            byte b28 = (byte) 5;
                                            byte b29 = (byte) (b28 - 5);
                                            objArr6 = objArr52;
                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                            u(b28, b29, b29, objArr55);
                                            d29 = com.facetec.sdk.al.c(bitsPerPixel2, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, packedPositionGroup + 24, 325453409, false, (java.lang.String) objArr55[0], null);
                                        } else {
                                            objArr6 = objArr52;
                                        }
                                        ((java.lang.reflect.Field) d29).set(null, java.lang.Long.valueOf(longValue11 >> 11));
                                    } catch (java.lang.Exception unused2) {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    str7 = str6;
                                    objArr6 = objArr52;
                                }
                                objArr7 = objArr6;
                            }
                            java.lang.Object obj11 = objArr7[2];
                            i5 = ((int[]) obj11)[0];
                            obj4 = objArr7[1];
                            if (((int[]) obj4)[0] != i5) {
                                int i46 = ((int[]) objArr7[3])[0];
                                java.lang.Object[] objArr56 = {(java.lang.String) objArr7[0], new int[]{((int[]) obj4)[0]}, new int[]{((int[]) obj11)[0]}, new int[1]};
                                int i47 = ~((int) android.os.SystemClock.elapsedRealtime());
                                int i48 = i46 + ((((~(r3 | (-612434140))) | r7) * 590) - 661459415) + (((~((-174502661) | i47)) | 136740864 | (~(650195935 | i47))) * (-1180)) + (((~(i47 | 174502660)) | (~((-650195936) | i47))) * 590);
                                int i49 = (i48 << 13) ^ i48;
                                int i50 = i49 ^ (i49 >>> 17);
                                ((int[]) objArr56[3])[0] = i50 ^ (i50 << 5);
                            } else {
                                android.content.Context context4 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str5, new java.lang.Class[0]).invoke(null, null);
                                if (context4 != null) {
                                    context4 = ((context4 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context4).getBaseContext() == null) ? null : context4.getApplicationContext();
                                }
                                if (android.os.Looper.myLooper() == null) {
                                    context4 = null;
                                }
                                java.lang.Object[] objArr57 = {context4, java.lang.Long.valueOf((i5 ^ r11) ^ 6118099021010567168L), 1424480421L};
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                v((short) (-$$d[443]), r3[77], r3[235], objArr58);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr58[0]);
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                v((short) 93, r3[482], r3[5], objArr59);
                                cls6.getMethod((java.lang.String) objArr59[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr57);
                                int i51 = ((int[]) objArr7[3])[0];
                                java.lang.Object[] objArr60 = {(java.lang.String) objArr7[0], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, new int[1]};
                                int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
                                int i52 = i51 + ((((((-213911057) | elapsedRealtime4) * (-381)) + 929743218) + (((~((~elapsedRealtime4) | 322304111)) | (-247731740)) * 381)) - 104266288);
                                int i53 = (i52 << 13) ^ i52;
                                int i54 = i53 ^ (i53 >>> 17);
                                ((int[]) objArr60[3])[0] = i54 ^ (i54 << 5);
                            }
                            nextInt = new java.util.Random().nextInt(2);
                            if (nextInt != 0) {
                                h();
                            } else if (nextInt == 1) {
                                j();
                            }
                            d7 = com.facetec.sdk.al.d(-2058842632);
                            if (d7 == null) {
                                char c8 = (char) (26699 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                                int gidForName = android.os.Process.getGidForName("");
                                byte b30 = (byte) 0;
                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                u((byte) ($$b & 31), b30, b30, objArr61);
                                d7 = com.facetec.sdk.al.c(c8, (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)) + 638, gidForName + 24, 581433088, false, (java.lang.String) objArr61[0], null);
                            }
                            j4 = ((java.lang.reflect.Field) d7).getLong(null);
                            longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d8 = com.facetec.sdk.al.d(-2055148548);
                            if (d8 != null) {
                                char c9 = (char) (26700 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int indexOf7 = android.text.TextUtils.indexOf("", "");
                                int packedPositionType2 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                byte b31 = (byte) 5;
                                byte b32 = (byte) (b31 - 5);
                                str8 = str7;
                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                u(b31, b32, b32, objArr62);
                                d8 = com.facetec.sdk.al.c(c9, 639 - indexOf7, packedPositionType2 + 23, 577736964, false, (java.lang.String) objArr62[0], null);
                            } else {
                                str8 = str7;
                            }
                            if (j4 != ((longValue3 - ((((java.lang.reflect.Field) d8).getLong(null) << 53) >>> 53)) >> 11)) {
                                java.lang.Object d30 = com.facetec.sdk.al.d(-2056072069);
                                if (d30 == null) {
                                    char indexOf8 = (char) (26699 - android.text.TextUtils.indexOf("", ""));
                                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                                    int normalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                    byte b33 = (byte) 0;
                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                    u((byte) 6, b33, b33, objArr63);
                                    d30 = com.facetec.sdk.al.c(indexOf8, 639 - (scrollBarFadeDuration >> 16), 23 - normalizeMetaState2, 580759171, false, (java.lang.String) objArr63[0], null);
                                }
                                java.lang.Object[] objArr64 = (java.lang.Object[]) ((java.lang.reflect.Field) d30).get(null);
                                objArr8 = new java.lang.Object[]{new int[1], (java.lang.String[]) objArr64[1], new int[]{((int[]) objArr64[2])[0]}, new int[]{((int[]) objArr64[3])[0]}};
                                int i55 = (((((~(2010586453 | r3)) | 18089280) * (-756)) - 1060633455) + (((~new java.util.Random().nextInt()) | 2010586453) * 756)) - 239141399;
                                int i56 = (i55 << 13) ^ i55;
                                int i57 = i56 ^ (i56 >>> 17);
                                ((int[]) objArr8[0])[0] = i57 ^ (i57 << 5);
                                str9 = str8;
                            } else {
                                android.content.Context context5 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str5, new java.lang.Class[0]).invoke(null, null);
                                if (context5 != null) {
                                    p = (l + 75) % 128;
                                    context5 = ((context5 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context5).getBaseContext() == null) ? null : context5.getApplicationContext();
                                }
                                java.lang.Object[] objArr65 = {context5, 0, 0, -239141399};
                                byte[] bArr5 = $$d;
                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                v((short) 422, bArr5[8], bArr5[235], objArr66);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr66[0]);
                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr5[482], bArr5[8], objArr67);
                                objArr8 = (java.lang.Object[]) cls7.getMethod((java.lang.String) objArr67[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr65);
                                java.lang.Object d31 = com.facetec.sdk.al.d(-2056072069);
                                if (d31 == null) {
                                    char threadPriority = (char) (26699 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                    int resolveSize = android.view.View.resolveSize(0, 0);
                                    int indexOf9 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    byte b34 = (byte) 0;
                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                    u((byte) 6, b34, b34, objArr68);
                                    d31 = com.facetec.sdk.al.c(threadPriority, resolveSize + 639, indexOf9 + 24, 580759171, false, (java.lang.String) objArr68[0], null);
                                }
                                ((java.lang.reflect.Field) d31).set(null, objArr8);
                                try {
                                    str9 = str8;
                                    long longValue12 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Object d32 = com.facetec.sdk.al.d(-2055148548);
                                    if (d32 == null) {
                                        char makeMeasureSpec3 = (char) (26699 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        int trimmedLength2 = android.text.TextUtils.getTrimmedLength("");
                                        int mode2 = android.view.View.MeasureSpec.getMode(0);
                                        byte b35 = (byte) 5;
                                        byte b36 = (byte) (b35 - 5);
                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                        u(b35, b36, b36, objArr69);
                                        d32 = com.facetec.sdk.al.c(makeMeasureSpec3, 639 - trimmedLength2, 23 - mode2, 577736964, false, (java.lang.String) objArr69[0], null);
                                    }
                                    ((java.lang.reflect.Field) d32).set(null, java.lang.Long.valueOf(longValue12));
                                    java.lang.Object d33 = com.facetec.sdk.al.d(-2058842632);
                                    if (d33 == null) {
                                        char c10 = (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26698);
                                        int alpha = android.graphics.Color.alpha(0);
                                        int threadPriority2 = android.os.Process.getThreadPriority(0);
                                        byte b37 = (byte) 0;
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        u((byte) ($$b & 31), b37, b37, objArr70);
                                        d33 = com.facetec.sdk.al.c(c10, alpha + 639, 23 - ((threadPriority2 + 20) >> 6), 581433088, false, (java.lang.String) objArr70[0], null);
                                    }
                                    ((java.lang.reflect.Field) d33).set(null, java.lang.Long.valueOf(longValue12 >> 11));
                                } catch (java.lang.Exception unused3) {
                                    throw new java.lang.RuntimeException();
                                }
                            }
                            java.lang.Object obj12 = objArr8[2];
                            i6 = ((int[]) obj12)[0];
                            obj5 = objArr8[3];
                            if (((int[]) obj5)[0] != i6) {
                                int i58 = ((int[]) objArr8[0])[0];
                                java.lang.Object[] objArr71 = {new int[1], (java.lang.String[]) objArr8[1], new int[]{((int[]) obj12)[0]}, new int[]{((int[]) obj5)[0]}};
                                int i59 = ~android.os.Process.myUid();
                                int i60 = i58 + (((1158985936 | r6) * 764) - 652234495) + (((~(i59 | 1158985936)) | 851591429) * (-1528)) + ((1992478997 | (~(869689797 | i59))) * 764);
                                int i61 = (i60 << 13) ^ i60;
                                int i62 = i61 ^ (i61 >>> 17);
                                i7 = 0;
                                ((int[]) objArr71[0])[0] = i62 ^ (i62 << 5);
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.String[] strArr = (java.lang.String[]) objArr8[1];
                                if (strArr != null) {
                                    for (java.lang.String str14 : strArr) {
                                        arrayList2.add(str14);
                                    }
                                }
                                java.lang.Object[] objArr72 = {java.lang.Long.valueOf((i6 ^ r9) ^ 7152198623286001664L), 1665251017L};
                                byte[] bArr6 = $$d;
                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                v((short) 441, bArr6[8], bArr6[235], objArr73);
                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr73[0]);
                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr6[482], bArr6[8], objArr74);
                                cls8.getMethod((java.lang.String) objArr74[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr72);
                                int i63 = ((int[]) objArr8[0])[0];
                                java.lang.Object[] objArr75 = {new int[1], (java.lang.String[]) objArr8[1], new int[]{((int[]) objArr8[2])[0]}, new int[]{((int[]) objArr8[3])[0]}};
                                int nextInt2 = new java.util.Random().nextInt();
                                int i64 = i63 + ((~((~nextInt2) | (-1077936129))) * 130) + 1174198659 + (((~(nextInt2 | (-1077936129))) | 613585481) * 130);
                                int i65 = (i64 << 13) ^ i64;
                                int i66 = i65 ^ (i65 >>> 17);
                                i7 = 0;
                                ((int[]) objArr75[0])[0] = i66 ^ (i66 << 5);
                            }
                            d9 = com.facetec.sdk.al.d(-1876633077);
                            if (d9 == null) {
                                char indexOf10 = (char) (1536 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i7));
                                int indexOf11 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int lastIndexOf4 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                byte b38 = (byte) i7;
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                u((byte) ($$b & 30), b38, b38, objArr76);
                                d9 = com.facetec.sdk.al.c(indexOf10, indexOf11 + 709, lastIndexOf4 + 23, 936091891, false, (java.lang.String) objArr76[i7], null);
                            }
                            j5 = ((java.lang.reflect.Field) d9).getLong(null);
                            longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d10 = com.facetec.sdk.al.d(-1877556598);
                            if (d10 != null) {
                                char tapTimeout = (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 1537);
                                float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                                byte b39 = (byte) 0;
                                str10 = str5;
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                u((byte) ($$b & 31), b39, b39, objArr77);
                                d10 = com.facetec.sdk.al.c(tapTimeout, (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 708, 22 - (doubleTapTimeout >> 16), 939112562, false, (java.lang.String) objArr77[0], null);
                            } else {
                                str10 = str5;
                            }
                            if (j5 != ((longValue4 - ((((java.lang.reflect.Field) d10).getLong(null) << 53) >>> 53)) >> 11)) {
                                p = (l + 63) % 128;
                                java.lang.Object d34 = com.facetec.sdk.al.d(-1874786035);
                                if (d34 == null) {
                                    char c11 = (char) (1537 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    float length3 = android.graphics.PointF.length(0.0f, 0.0f);
                                    int lastIndexOf5 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                                    byte b40 = (byte) 0;
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    u((byte) 6, b40, b40, objArr78);
                                    d34 = com.facetec.sdk.al.c(c11, 708 - (length3 > 0.0f ? 1 : (length3 == 0.0f ? 0 : -1)), lastIndexOf5 + 23, 934179829, false, (java.lang.String) objArr78[0], null);
                                }
                                java.lang.Object[] objArr79 = (java.lang.Object[]) ((java.lang.reflect.Field) d34).get(null);
                                objArr9 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr79[1])[0]}, (java.lang.String[]) objArr79[2], new int[]{((int[]) objArr79[3])[0]}};
                                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                                int i67 = ((((-13709271) | elapsedCpuTime) * 376) - 1432840856) + (((~((~elapsedCpuTime) | 799519739)) | (-804765696)) * (-376)) + (((~(elapsedCpuTime | (-799519740))) | 796302381) * 376) + 1415932276;
                                int i68 = (i67 << 13) ^ i67;
                                int i69 = i68 ^ (i68 >>> 17);
                                ((int[]) objArr9[0])[0] = i69 ^ (i69 << 5);
                            } else {
                                try {
                                    java.lang.Object[] objArr80 = {0, 0, 1415932276};
                                    java.lang.Object d35 = com.facetec.sdk.al.d(1329445289);
                                    if (d35 == null) {
                                        char jumpTapTimeout = (char) (1537 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                                        int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                                        byte b41 = (byte) 0;
                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                        u((byte) 6, b41, b41, objArr81);
                                        d35 = com.facetec.sdk.al.c(jumpTapTimeout, 708 - (fadingEdgeLength >> 16), 22 - argb2, -388840623, false, (java.lang.String) objArr81[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                    }
                                    objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) d35).invoke(null, objArr80);
                                    java.lang.Object d36 = com.facetec.sdk.al.d(-1874786035);
                                    if (d36 == null) {
                                        char threadPriority3 = (char) (1537 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                        int red = android.graphics.Color.red(0);
                                        int scrollBarSize2 = android.view.ViewConfiguration.getScrollBarSize();
                                        byte b42 = (byte) 0;
                                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                                        u((byte) 6, b42, b42, objArr82);
                                        d36 = com.facetec.sdk.al.c(threadPriority3, red + 708, 22 - (scrollBarSize2 >> 8), 934179829, false, (java.lang.String) objArr82[0], null);
                                    }
                                    ((java.lang.reflect.Field) d36).set(null, objArr9);
                                    try {
                                        long longValue13 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Object d37 = com.facetec.sdk.al.d(-1877556598);
                                        if (d37 == null) {
                                            char trimmedLength3 = (char) (android.text.TextUtils.getTrimmedLength("") + 1537);
                                            int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
                                            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                            byte b43 = (byte) 0;
                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                            u((byte) ($$b & 31), b43, b43, objArr83);
                                            d37 = com.facetec.sdk.al.c(trimmedLength3, (scrollDefaultDelay2 >> 16) + 708, (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 21, 939112562, false, (java.lang.String) objArr83[0], null);
                                        }
                                        ((java.lang.reflect.Field) d37).set(null, java.lang.Long.valueOf(longValue13));
                                        java.lang.Object d38 = com.facetec.sdk.al.d(-1876633077);
                                        if (d38 == null) {
                                            char c12 = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1537);
                                            int capsMode2 = android.text.TextUtils.getCapsMode("", 0, 0);
                                            int scrollBarSize3 = android.view.ViewConfiguration.getScrollBarSize();
                                            byte b44 = (byte) 0;
                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                            u((byte) ($$b & 30), b44, b44, objArr84);
                                            d38 = com.facetec.sdk.al.c(c12, 708 - capsMode2, (scrollBarSize3 >> 8) + 22, 936091891, false, (java.lang.String) objArr84[0], null);
                                        }
                                        ((java.lang.reflect.Field) d38).set(null, java.lang.Long.valueOf(longValue13 >> 11));
                                    } catch (java.lang.Exception unused4) {
                                        throw new java.lang.RuntimeException();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            }
                            java.lang.Object obj13 = objArr9[3];
                            i8 = ((int[]) obj13)[0];
                            java.lang.Object obj14 = objArr9[1];
                            i9 = ((int[]) obj14)[0];
                            if (i9 != i8) {
                                int i70 = ((int[]) objArr9[0])[0];
                                java.lang.Object[] objArr85 = {new int[1], new int[]{((int[]) obj14)[0]}, (java.lang.String[]) objArr9[2], new int[]{((int[]) obj13)[0]}};
                                int myUid = android.os.Process.myUid();
                                int i71 = i70 + ((((~((-174257050) | myUid)) | 172008208) * (-283)) - 1265462568) + ((~(myUid | (-2248842))) * 283);
                                int i72 = (i71 << 13) ^ i71;
                                int i73 = i72 ^ (i72 >>> 17);
                                i10 = 0;
                                ((int[]) objArr85[0])[0] = i73 ^ (i73 << 5);
                            } else {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.String[] strArr2 = (java.lang.String[]) objArr9[2];
                                if (strArr2 != null) {
                                    for (java.lang.String str15 : strArr2) {
                                        arrayList3.add(str15);
                                    }
                                }
                                int[] iArr = new int[i9];
                                int i74 = i9 - 1;
                                iArr[i74] = 1;
                                android.widget.Toast.makeText((android.content.Context) null, iArr[((i9 * i74) % 2) - 1], 1).show();
                                int i75 = ((int[]) objArr9[0])[0];
                                java.lang.Object[] objArr86 = {new int[1], new int[]{((int[]) objArr9[1])[0]}, (java.lang.String[]) objArr9[2], new int[]{((int[]) objArr9[3])[0]}};
                                int i76 = i75 + ((((~((-755485750) | r3)) | 537296945) * 1504) - 166536536) + ((~(((int) android.os.SystemClock.elapsedRealtime()) | (-218188805))) * (-1504)) + 1121605024;
                                int i77 = (i76 << 13) ^ i76;
                                int i78 = i77 ^ (i77 >>> 17);
                                i10 = 0;
                                ((int[]) objArr86[0])[0] = i78 ^ (i78 << 5);
                            }
                            d11 = com.facetec.sdk.al.d(-1269752171);
                            if (d11 == null) {
                                char modifierMetaStateMask = (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
                                int rgb = android.graphics.Color.rgb(i10, i10, i10);
                                int combineMeasuredStates2 = android.view.View.combineMeasuredStates(i10, i10);
                                byte b45 = (byte) i10;
                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                u((byte) ($$b & 31), b45, b45, objArr87);
                                d11 = com.facetec.sdk.al.c(modifierMetaStateMask, (-16776649) - rgb, 24 - combineMeasuredStates2, 331244653, false, (java.lang.String) objArr87[i10], null);
                            }
                            j6 = ((java.lang.reflect.Field) d11).getLong(null);
                            longValue5 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d12 = com.facetec.sdk.al.d(-1267905129);
                            if (d12 == null) {
                                char bitsPerPixel3 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
                                int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
                                int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength();
                                byte b46 = (byte) 0;
                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                u((byte) 7, b46, b46, objArr88);
                                d12 = com.facetec.sdk.al.c(bitsPerPixel3, 567 - (fadingEdgeLength2 >> 16), (fadingEdgeLength3 >> 16) + 24, 327300975, false, (java.lang.String) objArr88[0], null);
                            }
                            if (j6 != ((longValue5 - ((((java.lang.reflect.Field) d12).getLong(null) << 53) >>> 53)) >> 11)) {
                                java.lang.Object d39 = com.facetec.sdk.al.d(-1268828650);
                                if (d39 == null) {
                                    char red2 = (char) android.graphics.Color.red(0);
                                    int indexOf12 = android.text.TextUtils.indexOf("", "", 0);
                                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                    byte b47 = (byte) 0;
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    u((byte) ($$b & 30), b47, b47, objArr89);
                                    d39 = com.facetec.sdk.al.c(red2, indexOf12 + 567, 24 - resolveOpacity, 330321134, false, (java.lang.String) objArr89[0], null);
                                }
                                java.lang.Object[] objArr90 = (java.lang.Object[]) ((java.lang.reflect.Field) d39).get(null);
                                objArr11 = new java.lang.Object[]{(java.lang.String) objArr90[0], new int[]{((int[]) objArr90[1])[0]}, new int[]{((int[]) objArr90[2])[0]}, new int[1]};
                                int myPid3 = android.os.Process.myPid();
                                int i79 = ((((r5 * 992) - 203911405) + ((((~((-1040098666) | myPid3)) | 824705384) | (~((~myPid3) | (-6789)))) * (-496))) + ((myPid3 | (-215400070)) * 496)) - 1011720987;
                                int i80 = (i79 << 13) ^ i79;
                                int i81 = i80 ^ (i80 >>> 17);
                                ((int[]) objArr11[3])[0] = i81 ^ (i81 << 5);
                                str11 = str10;
                            } else {
                                str11 = str10;
                                android.content.Context context6 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str11, new java.lang.Class[0]).invoke(null, null);
                                if (context6 != null) {
                                    context6 = ((context6 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context6).getBaseContext() == null) ? null : context6.getApplicationContext();
                                }
                                byte[] bArr7 = $$d;
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                v((short) 460, bArr7[8], bArr7[235], objArr91);
                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr91[0]);
                                int i82 = bArr7[8] - 1;
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                v((short) i82, bArr7[482], (byte) i82, objArr92);
                                java.lang.Object[] objArr93 = (java.lang.Object[]) cls9.getMethod((java.lang.String) objArr92[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context6, 0, 0, -1011720987);
                                if (context6 != null) {
                                    java.lang.Object d40 = com.facetec.sdk.al.d(-1268828650);
                                    if (d40 == null) {
                                        char tapTimeout2 = (char) (android.view.ViewConfiguration.getTapTimeout() >> 16);
                                        float complexToFraction2 = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                                        int indexOf13 = android.text.TextUtils.indexOf("", "", 0, 0);
                                        byte b48 = (byte) 0;
                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                        u((byte) ($$b & 30), b48, b48, objArr94);
                                        d40 = com.facetec.sdk.al.c(tapTimeout2, (complexToFraction2 > 0.0f ? 1 : (complexToFraction2 == 0.0f ? 0 : -1)) + 567, indexOf13 + 24, 330321134, false, (java.lang.String) objArr94[0], null);
                                    }
                                    ((java.lang.reflect.Field) d40).set(null, objArr93);
                                    try {
                                        long longValue14 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Object d41 = com.facetec.sdk.al.d(-1267905129);
                                        if (d41 == null) {
                                            char lastIndexOf6 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1);
                                            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                                            int myPid4 = android.os.Process.myPid();
                                            byte b49 = (byte) 0;
                                            objArr10 = objArr93;
                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                            u((byte) 7, b49, b49, objArr95);
                                            d41 = com.facetec.sdk.al.c(lastIndexOf6, 567 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 24 - (myPid4 >> 22), 327300975, false, (java.lang.String) objArr95[0], null);
                                        } else {
                                            objArr10 = objArr93;
                                        }
                                        ((java.lang.reflect.Field) d41).set(null, java.lang.Long.valueOf(longValue14));
                                        java.lang.Object d42 = com.facetec.sdk.al.d(-1269752171);
                                        if (d42 == null) {
                                            char lastIndexOf7 = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                                            int indexOf14 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                            byte b50 = (byte) 0;
                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                            u((byte) ($$b & 31), b50, b50, objArr96);
                                            d42 = com.facetec.sdk.al.c(lastIndexOf7, (keyRepeatDelay >> 16) + 567, 23 - indexOf14, 331244653, false, (java.lang.String) objArr96[0], null);
                                        }
                                        ((java.lang.reflect.Field) d42).set(null, java.lang.Long.valueOf(longValue14 >> 11));
                                    } catch (java.lang.Exception unused5) {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    objArr10 = objArr93;
                                }
                                objArr11 = objArr10;
                            }
                            java.lang.Object obj15 = objArr11[2];
                            i11 = ((int[]) obj15)[0];
                            obj6 = objArr11[1];
                            if (((int[]) obj6)[0] != i11) {
                                int i83 = ((int[]) objArr11[3])[0];
                                java.lang.Object[] objArr97 = {(java.lang.String) objArr11[0], new int[]{((int[]) obj6)[0]}, new int[]{((int[]) obj15)[0]}, new int[1]};
                                int nextInt3 = new java.util.Random().nextInt();
                                int i84 = i83 + (((824737636 | nextInt3) * 376) - 24327813) + (((~((~nextInt3) | 838710053)) | 19520) * (-376)) + (((~(nextInt3 | (-838710054))) | (-14011458)) * 376);
                                int i85 = (i84 << 13) ^ i84;
                                int i86 = i85 ^ (i85 >>> 17);
                                i12 = 0;
                                ((int[]) objArr97[3])[0] = i86 ^ (i86 << 5);
                            } else {
                                android.content.Context context7 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str11, new java.lang.Class[0]).invoke(null, null);
                                if (context7 != null) {
                                    context7 = ((context7 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context7).getBaseContext() == null) ? null : context7.getApplicationContext();
                                }
                                if (android.os.Looper.myLooper() == null) {
                                    context7 = null;
                                }
                                java.lang.Object[] objArr98 = {context7, java.lang.Long.valueOf((i11 ^ r11) ^ (-1344435178667245568L)), -313025712L};
                                short s2 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                                byte[] bArr8 = $$d;
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                v(s2, bArr8[8], bArr8[235], objArr99);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr99[0]);
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr8[482], bArr8[8], objArr100);
                                cls10.getMethod((java.lang.String) objArr100[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr98);
                                int i87 = ((int[]) objArr11[3])[0];
                                java.lang.Object[] objArr101 = {(java.lang.String) objArr11[0], new int[]{((int[]) objArr11[1])[0]}, new int[]{((int[]) objArr11[2])[0]}, new int[1]};
                                int myTid2 = android.os.Process.myTid();
                                int i88 = i87 + ((((~((-531030854) | r6)) | (~(293667742 | myTid2))) * com.visa.cbp.getCertUsage.getODAData) - 907805707) + (((~(myTid2 | (-531030854))) | (~((~myTid2) | 293667742))) * com.visa.cbp.getCertUsage.getODAData);
                                int i89 = (i88 << 13) ^ i88;
                                int i90 = i89 ^ (i89 >>> 17);
                                i12 = 0;
                                ((int[]) objArr101[3])[0] = i90 ^ (i90 << 5);
                            }
                            d13 = com.facetec.sdk.al.d(-1656269327);
                            if (d13 == null) {
                                char threadPriority4 = (char) ((android.os.Process.getThreadPriority(i12) + 20) >> 6);
                                int offsetBefore3 = android.text.TextUtils.getOffsetBefore("", i12);
                                int offsetAfter = android.text.TextUtils.getOffsetAfter("", i12);
                                byte b51 = (byte) i12;
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                u((byte) 7, b51, b51, objArr102);
                                d13 = com.facetec.sdk.al.c(threadPriority4, offsetBefore3 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, offsetAfter + 24, 984100617, false, (java.lang.String) objArr102[i12], null);
                            }
                            j7 = ((java.lang.reflect.Field) d13).getLong(null);
                            longValue6 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d14 = com.facetec.sdk.al.d(-1658116369);
                            if (d14 != null) {
                                char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                                int size = android.view.View.MeasureSpec.getSize(0);
                                byte b52 = (byte) 0;
                                str12 = str9;
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                u((byte) ($$b & 31), b52, b52, objArr103);
                                d14 = com.facetec.sdk.al.c(doubleTapTimeout2, 800 - offsetAfter2, size + 24, 985947159, false, (java.lang.String) objArr103[0], null);
                            } else {
                                str12 = str9;
                            }
                            if (j7 != ((longValue6 - ((((java.lang.reflect.Field) d14).getLong(null) << 53) >>> 53)) >> 11)) {
                                java.lang.Object d43 = com.facetec.sdk.al.d(-1654422285);
                                if (d43 == null) {
                                    char packedPositionChild2 = (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1);
                                    int bitsPerPixel4 = android.graphics.ImageFormat.getBitsPerPixel(0);
                                    long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                                    byte b53 = (byte) 5;
                                    byte b54 = (byte) (b53 - 5);
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    u(b53, b54, b54, objArr104);
                                    d43 = com.facetec.sdk.al.c(packedPositionChild2, bitsPerPixel4 + 801, (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)) + 25, 982318603, false, (java.lang.String) objArr104[0], null);
                                }
                                java.lang.Object[] objArr105 = (java.lang.Object[]) ((java.lang.reflect.Field) d43).get(null);
                                objArr12 = new java.lang.Object[]{(java.lang.String[]) objArr105[0], new int[1], new int[]{((int[]) objArr105[2])[0]}, new int[]{((int[]) objArr105[3])[0]}};
                                int nextInt4 = new java.util.Random().nextInt();
                                int i91 = (((((~((-613267185) | nextInt4)) | 210906815) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 1013711157) + (((~((~nextInt4) | (-613267185))) | 210906815) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)) - 895465450;
                                int i92 = (i91 << 13) ^ i91;
                                int i93 = i92 ^ (i92 >>> 17);
                                ((int[]) objArr12[1])[0] = i93 ^ (i93 << 5);
                                str13 = str12;
                            } else {
                                android.content.Context context8 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str11, new java.lang.Class[0]).invoke(null, null);
                                if (context8 != null) {
                                    if (context8 instanceof android.content.ContextWrapper) {
                                        l = (p + 39) % 128;
                                        if (((android.content.ContextWrapper) context8).getBaseContext() == null) {
                                            context8 = null;
                                        }
                                    }
                                    context8 = context8.getApplicationContext();
                                }
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                t((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 28343), android.view.View.getDefaultSize(0, 0) + 65, objArr106);
                                java.lang.String intern5 = ((java.lang.String) objArr106[0]).intern();
                                java.lang.Object[] objArr107 = {938831993};
                                java.lang.Object d44 = com.facetec.sdk.al.d(-1302416045);
                                if (d44 == null) {
                                    d44 = com.facetec.sdk.al.c((char) (40648 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.os.Process.getGidForName("") + 778, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, 363974571, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                java.lang.Object[] objArr108 = {context8, intern5, -895465450, 0, 144, ((java.lang.reflect.Constructor) d44).newInstance(objArr107), false};
                                java.lang.Object d45 = com.facetec.sdk.al.d(-324935441);
                                if (d45 == null) {
                                    char gidForName2 = (char) (android.os.Process.getGidForName("") + 1);
                                    int packedPositionType3 = android.widget.ExpandableListView.getPackedPositionType(0L);
                                    int deadChar2 = android.view.KeyEvent.getDeadChar(0, 0);
                                    byte b55 = (byte) 0;
                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                    u((byte) ($$b & 30), b55, b55, objArr109);
                                    d45 = com.facetec.sdk.al.c(gidForName2, 800 - packedPositionType3, 24 - deadChar2, 1263442455, false, (java.lang.String) objArr109[0], new java.lang.Class[]{android.content.Context.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 63027), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 855, android.view.View.MeasureSpec.getMode(0) + 30), java.lang.Boolean.TYPE});
                                }
                                java.lang.Object[] objArr110 = (java.lang.Object[]) ((java.lang.reflect.Method) d45).invoke(null, objArr108);
                                if (context8 != null) {
                                    java.lang.Object d46 = com.facetec.sdk.al.d(-1654422285);
                                    if (d46 == null) {
                                        char gidForName3 = (char) ((-1) - android.os.Process.getGidForName(""));
                                        int alpha2 = android.graphics.Color.alpha(0);
                                        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                                        byte b56 = (byte) 5;
                                        byte b57 = (byte) (b56 - 5);
                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                        u(b56, b57, b57, objArr111);
                                        d46 = com.facetec.sdk.al.c(gidForName3, alpha2 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 24 - (longPressTimeout >> 16), 982318603, false, (java.lang.String) objArr111[0], null);
                                    }
                                    ((java.lang.reflect.Field) d46).set(null, objArr110);
                                    try {
                                        str13 = str12;
                                        long longValue15 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                        java.lang.Object d47 = com.facetec.sdk.al.d(-1658116369);
                                        if (d47 == null) {
                                            char indexOf15 = (char) android.text.TextUtils.indexOf("", "");
                                            int touchSlop2 = android.view.ViewConfiguration.getTouchSlop();
                                            int argb3 = android.graphics.Color.argb(0, 0, 0, 0);
                                            byte b58 = (byte) 0;
                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                            u((byte) ($$b & 31), b58, b58, objArr112);
                                            d47 = com.facetec.sdk.al.c(indexOf15, 800 - (touchSlop2 >> 8), argb3 + 24, 985947159, false, (java.lang.String) objArr112[0], null);
                                        }
                                        ((java.lang.reflect.Field) d47).set(null, java.lang.Long.valueOf(longValue15));
                                        java.lang.Object d48 = com.facetec.sdk.al.d(-1656269327);
                                        if (d48 == null) {
                                            char indexOf16 = (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                            int argb4 = android.graphics.Color.argb(0, 0, 0, 0);
                                            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                                            byte b59 = (byte) 0;
                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                            u((byte) 7, b59, b59, objArr113);
                                            d48 = com.facetec.sdk.al.c(indexOf16, argb4 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, (keyRepeatTimeout >> 16) + 24, 984100617, false, (java.lang.String) objArr113[0], null);
                                        }
                                        ((java.lang.reflect.Field) d48).set(null, java.lang.Long.valueOf(longValue15 >> 11));
                                    } catch (java.lang.Exception unused6) {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    str13 = str12;
                                }
                                objArr12 = objArr110;
                            }
                            java.lang.Object obj16 = objArr12[2];
                            i13 = ((int[]) obj16)[0];
                            obj7 = objArr12[3];
                            if (((int[]) obj7)[0] != i13) {
                                p = (l + 63) % 128;
                                int i94 = ((int[]) objArr12[1])[0];
                                java.lang.Object[] objArr114 = {(java.lang.String[]) objArr12[0], new int[1], new int[]{((int[]) obj16)[0]}, new int[]{((int[]) obj7)[0]}};
                                int myUid2 = android.os.Process.myUid();
                                int i95 = ~(429014963 | myUid2);
                                int i96 = i94 + (((((~((-429014964) | myUid2)) | 286396288) | (~((-857411469) | myUid2))) * (-880)) - 529680433) + (((~((~myUid2) | (-429014964))) | 857411468 | i95) * (-880)) + (i95 * 880);
                                int i97 = (i96 << 13) ^ i96;
                                int i98 = i97 ^ (i97 >>> 17);
                                i14 = 0;
                                ((int[]) objArr114[1])[0] = i98 ^ (i98 << 5);
                            } else {
                                java.lang.Object[] objArr115 = {java.lang.Long.valueOf((i13 ^ r6) ^ (-5516964227052470272L)), -1284649404L};
                                byte[] bArr9 = $$d;
                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                v((short) 38, bArr9[8], bArr9[235], objArr116);
                                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr116[0]);
                                int i99 = bArr9[8] - 1;
                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                v((short) i99, bArr9[482], (byte) i99, objArr117);
                                cls11.getMethod((java.lang.String) objArr117[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr115);
                                int i100 = ((int[]) objArr12[1])[0];
                                java.lang.Object[] objArr118 = {(java.lang.String[]) objArr12[0], new int[1], new int[]{((int[]) objArr12[2])[0]}, new int[]{((int[]) objArr12[3])[0]}};
                                int i101 = ~((-920870536) | ((int) java.lang.Runtime.getRuntime().maxMemory()));
                                int i102 = i100 + ((((~((~r3) | (-920870536))) | 572657159) * (-245)) - 100440486) + (i101 * (-245)) + ((i101 | 365555896) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
                                int i103 = (i102 << 13) ^ i102;
                                int i104 = i103 ^ (i103 >>> 17);
                                i14 = 0;
                                ((int[]) objArr118[1])[0] = i104 ^ (i104 << 5);
                            }
                            d15 = com.facetec.sdk.al.d(1606058502);
                            if (d15 == null) {
                                char c13 = (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)));
                                int lastIndexOf8 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i14, i14);
                                int indexOf17 = android.text.TextUtils.indexOf("", "", i14, i14);
                                byte b60 = (byte) 5;
                                byte b61 = (byte) (b60 - 5);
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                u(b60, b61, b61, objArr119);
                                d15 = com.facetec.sdk.al.c(c13, lastIndexOf8 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, indexOf17 + 23, -128583426, false, (java.lang.String) objArr119[0], null);
                            }
                            j8 = ((java.lang.reflect.Field) d15).getLong(null);
                            longValue7 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            d16 = com.facetec.sdk.al.d(1605134981);
                            if (d16 == null) {
                                char c14 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int deadChar3 = android.view.KeyEvent.getDeadChar(0, 0);
                                int indexOf18 = android.text.TextUtils.indexOf("", "");
                                byte b62 = (byte) 0;
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                u((byte) 6, b62, b62, objArr120);
                                d16 = com.facetec.sdk.al.c(c14, deadChar3 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 23 - indexOf18, -129822595, false, (java.lang.String) objArr120[0], null);
                            }
                            if (j8 != ((longValue7 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
                                java.lang.Object d49 = com.facetec.sdk.al.d(1603287939);
                                if (d49 == null) {
                                    char c15 = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                    int size2 = android.view.View.MeasureSpec.getSize(0);
                                    long globalActionKeyTimeout2 = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                                    byte b63 = (byte) 0;
                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                    u((byte) ($$b & 30), b63, b63, objArr121);
                                    d49 = com.facetec.sdk.al.c(c15, 1058 - size2, 24 - (globalActionKeyTimeout2 > 0L ? 1 : (globalActionKeyTimeout2 == 0L ? 0 : -1)), -125877893, false, (java.lang.String) objArr121[0], null);
                                }
                                java.lang.Object[] objArr122 = (java.lang.Object[]) ((java.lang.reflect.Field) d49).get(null);
                                objArr13 = new java.lang.Object[]{(java.lang.String[]) objArr122[0], new int[1], new int[]{((int[]) objArr122[2])[0]}, new int[]{((int[]) objArr122[3])[0]}};
                                int i105 = (~((int) java.lang.Runtime.getRuntime().maxMemory())) | 1069280191;
                                int i106 = (((~i105) | 548937768) * (-828)) + 1472891659 + (i105 * (-828)) + 574425750;
                                int i107 = (i106 << 13) ^ i106;
                                int i108 = i107 ^ (i107 >>> 17);
                                ((int[]) objArr13[1])[0] = i108 ^ (i108 << 5);
                            } else {
                                java.lang.Object[] objArr123 = {938831993};
                                java.lang.Object d50 = com.facetec.sdk.al.d(-583417224);
                                if (d50 == null) {
                                    d50 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), 1036 - (android.os.Process.myTid() >> 22), android.view.View.resolveSize(0, 0) + 22, 2060892288, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                java.lang.Object[] a$896c745 = com.facetec.sdk.fr.a$896c745(((java.lang.reflect.Constructor) d50).newInstance(objArr123));
                                java.lang.Object d51 = com.facetec.sdk.al.d(1603287939);
                                if (d51 == null) {
                                    char pressedStateDuration = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                                    int green2 = android.graphics.Color.green(0);
                                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                                    byte b64 = (byte) 0;
                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                    u((byte) ($$b & 30), b64, b64, objArr124);
                                    d51 = com.facetec.sdk.al.c(pressedStateDuration, green2 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 23 - (windowTouchSlop >> 8), -125877893, false, (java.lang.String) objArr124[0], null);
                                }
                                ((java.lang.reflect.Field) d51).set(null, a$896c745);
                                try {
                                    long longValue16 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                                    java.lang.Object d52 = com.facetec.sdk.al.d(1605134981);
                                    if (d52 == null) {
                                        char c16 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                                        int rgb2 = android.graphics.Color.rgb(0, 0, 0);
                                        int maximumDrawingCacheSize3 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                                        byte b65 = (byte) 0;
                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                        u((byte) 6, b65, b65, objArr125);
                                        d52 = com.facetec.sdk.al.c(c16, rgb2 + 16778274, 23 - (maximumDrawingCacheSize3 >> 24), -129822595, false, (java.lang.String) objArr125[0], null);
                                    }
                                    ((java.lang.reflect.Field) d52).set(null, java.lang.Long.valueOf(longValue16));
                                    java.lang.Object d53 = com.facetec.sdk.al.d(1606058502);
                                    if (d53 == null) {
                                        char defaultSize = (char) android.view.View.getDefaultSize(0, 0);
                                        int indexOf19 = android.text.TextUtils.indexOf("", "", 0);
                                        int offsetBefore4 = android.text.TextUtils.getOffsetBefore("", 0);
                                        byte b66 = (byte) 5;
                                        byte b67 = (byte) (b66 - 5);
                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                        u(b66, b67, b67, objArr126);
                                        d53 = com.facetec.sdk.al.c(defaultSize, indexOf19 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, offsetBefore4 + 23, -128583426, false, (java.lang.String) objArr126[0], null);
                                    }
                                    ((java.lang.reflect.Field) d53).set(null, java.lang.Long.valueOf(longValue16 >> 11));
                                    objArr13 = a$896c745;
                                } catch (java.lang.Exception unused7) {
                                    throw new java.lang.RuntimeException();
                                }
                            }
                            java.lang.Object obj17 = objArr13[2];
                            i15 = ((int[]) obj17)[0];
                            obj8 = objArr13[3];
                            if (((int[]) obj8)[0] != i15) {
                                int i109 = ((int[]) objArr13[1])[0];
                                java.lang.Object[] objArr127 = {(java.lang.String[]) objArr13[0], new int[1], new int[]{((int[]) obj17)[0]}, new int[]{((int[]) obj8)[0]}};
                                int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                                int i110 = ~maxMemory;
                                int i111 = i109 + (((~((-1485197466) | i110)) | 8654856) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 340540495 + ((~((-8654857) | maxMemory)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(maxMemory | (-1476542610))) | (~(i110 | (-133020495))) | 124365638) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                int i112 = (i111 << 13) ^ i111;
                                int i113 = i112 ^ (i112 >>> 17);
                                ((int[]) objArr127[1])[0] = i113 ^ (i113 << 5);
                                return;
                            }
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.String[] strArr3 = (java.lang.String[]) objArr13[0];
                            if (strArr3 != null) {
                                for (java.lang.String str16 : strArr3) {
                                    arrayList4.add(str16);
                                }
                            }
                            java.lang.Object[] objArr128 = {java.lang.Long.valueOf((i15 ^ r5) ^ 7582340663132291072L), 1765401259L};
                            short s3 = (short) ($$e | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                            byte[] bArr10 = $$d;
                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                            v(s3, bArr10[8], bArr10[235], objArr129);
                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr129[0]);
                            int i114 = bArr10[8] - 1;
                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                            v((short) i114, bArr10[482], (byte) i114, objArr130);
                            cls12.getMethod((java.lang.String) objArr130[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr128);
                            int i115 = ((int[]) objArr13[1])[0];
                            java.lang.Object[] objArr131 = {(java.lang.String[]) objArr13[0], new int[1], new int[]{((int[]) objArr13[2])[0]}, new int[]{((int[]) objArr13[3])[0]}};
                            int i116 = (~new java.util.Random().nextInt()) | 1061157367;
                            int i117 = i115 + (((~i116) | 557060592) * (-828)) + 1472891659 + (i116 * (-828)) + 1829994976;
                            int i118 = (i117 << 13) ^ i117;
                            int i119 = i118 ^ (i118 >>> 17);
                            ((int[]) objArr131[1])[0] = i119 ^ (i119 << 5);
                            return;
                        }
                        objArr3 = objArr;
                        ((java.lang.reflect.Field) d2).set(null, valueOf);
                        objArr4 = objArr3;
                        java.lang.Object obj92 = objArr4[1];
                        i2 = ((int[]) obj92)[0];
                        obj2 = objArr4[2];
                        if (((int[]) obj2)[0] != i2) {
                        }
                        d3 = com.facetec.sdk.al.d(-1265134566);
                        if (d3 == null) {
                        }
                        j2 = ((java.lang.reflect.Field) d3).getLong(null);
                        longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d4 = com.facetec.sdk.al.d(-1261440482);
                        if (d4 != null) {
                        }
                        if (j2 != ((longValue - ((((java.lang.reflect.Field) d4).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj102 = objArr5[2];
                        i3 = ((int[]) obj102)[0];
                        obj3 = objArr5[1];
                        if (((int[]) obj3)[0] != i3) {
                        }
                        d5 = com.facetec.sdk.al.d(-1266058087);
                        if (d5 == null) {
                        }
                        j3 = ((java.lang.reflect.Field) d5).getLong(null);
                        longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d6 = com.facetec.sdk.al.d(-1266981608);
                        if (d6 != null) {
                        }
                        if (j3 != ((longValue2 - ((((java.lang.reflect.Field) d6).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj112 = objArr7[2];
                        i5 = ((int[]) obj112)[0];
                        obj4 = objArr7[1];
                        if (((int[]) obj4)[0] != i5) {
                        }
                        nextInt = new java.util.Random().nextInt(2);
                        if (nextInt != 0) {
                        }
                        d7 = com.facetec.sdk.al.d(-2058842632);
                        if (d7 == null) {
                        }
                        j4 = ((java.lang.reflect.Field) d7).getLong(null);
                        longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d8 = com.facetec.sdk.al.d(-2055148548);
                        if (d8 != null) {
                        }
                        if (j4 != ((longValue3 - ((((java.lang.reflect.Field) d8).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj122 = objArr8[2];
                        i6 = ((int[]) obj122)[0];
                        obj5 = objArr8[3];
                        if (((int[]) obj5)[0] != i6) {
                        }
                        d9 = com.facetec.sdk.al.d(-1876633077);
                        if (d9 == null) {
                        }
                        j5 = ((java.lang.reflect.Field) d9).getLong(null);
                        longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d10 = com.facetec.sdk.al.d(-1877556598);
                        if (d10 != null) {
                        }
                        if (j5 != ((longValue4 - ((((java.lang.reflect.Field) d10).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj132 = objArr9[3];
                        i8 = ((int[]) obj132)[0];
                        java.lang.Object obj142 = objArr9[1];
                        i9 = ((int[]) obj142)[0];
                        if (i9 != i8) {
                        }
                        d11 = com.facetec.sdk.al.d(-1269752171);
                        if (d11 == null) {
                        }
                        j6 = ((java.lang.reflect.Field) d11).getLong(null);
                        longValue5 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d12 = com.facetec.sdk.al.d(-1267905129);
                        if (d12 == null) {
                        }
                        if (j6 != ((longValue5 - ((((java.lang.reflect.Field) d12).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj152 = objArr11[2];
                        i11 = ((int[]) obj152)[0];
                        obj6 = objArr11[1];
                        if (((int[]) obj6)[0] != i11) {
                        }
                        d13 = com.facetec.sdk.al.d(-1656269327);
                        if (d13 == null) {
                        }
                        j7 = ((java.lang.reflect.Field) d13).getLong(null);
                        longValue6 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d14 = com.facetec.sdk.al.d(-1658116369);
                        if (d14 != null) {
                        }
                        if (j7 != ((longValue6 - ((((java.lang.reflect.Field) d14).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj162 = objArr12[2];
                        i13 = ((int[]) obj162)[0];
                        obj7 = objArr12[3];
                        if (((int[]) obj7)[0] != i13) {
                        }
                        d15 = com.facetec.sdk.al.d(1606058502);
                        if (d15 == null) {
                        }
                        j8 = ((java.lang.reflect.Field) d15).getLong(null);
                        longValue7 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d16 = com.facetec.sdk.al.d(1605134981);
                        if (d16 == null) {
                        }
                        if (j8 != ((longValue7 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj172 = objArr13[2];
                        i15 = ((int[]) obj172)[0];
                        obj8 = objArr13[3];
                        if (((int[]) obj8)[0] != i15) {
                        }
                    } else {
                        str3 = str2;
                        java.lang.Object d54 = com.facetec.sdk.al.d(-1670862372);
                        if (d54 == null) {
                            char offsetAfter3 = (char) android.text.TextUtils.getOffsetAfter("", 0);
                            int blue = android.graphics.Color.blue(0);
                            int lastIndexOf9 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                            byte b68 = (byte) 0;
                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                            u((byte) 6, b68, b68, objArr132);
                            d54 = com.facetec.sdk.al.c(offsetAfter3, 1436 - blue, lastIndexOf9 + 24, 998757156, false, (java.lang.String) objArr132[0], null);
                        }
                        ((java.lang.reflect.Field) d54).set(null, objArr);
                        long longValue17 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        java.lang.Object d55 = com.facetec.sdk.al.d(-1669938851);
                        if (d55 == null) {
                            char argb5 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                            long packedPositionForChild3 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            byte b69 = (byte) 5;
                            byte b70 = (byte) (b69 - 5);
                            objArr3 = objArr;
                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                            u(b69, b70, b70, objArr133);
                            d55 = com.facetec.sdk.al.c(argb5, (packedPositionForChild3 > 0L ? 1 : (packedPositionForChild3 == 0L ? 0 : -1)) + 1437, 'G' - mirror, 999930789, false, (java.lang.String) objArr133[0], null);
                        } else {
                            objArr3 = objArr;
                        }
                        ((java.lang.reflect.Field) d55).set(null, java.lang.Long.valueOf(longValue17));
                        valueOf = java.lang.Long.valueOf(longValue17 >> 11);
                        d2 = com.facetec.sdk.al.d(-1672709414);
                        if (d2 == null) {
                            c2 = (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            keyCodeFromString = android.view.KeyEvent.keyCodeFromString("") + 1436;
                            indexOf = android.text.TextUtils.indexOf("", "", 0) + 23;
                            byte b71 = (byte) 0;
                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                            u((byte) ($$b & 30), b71, b71, objArr134);
                            obj = objArr134[0];
                            d2 = com.facetec.sdk.al.c(c2, keyCodeFromString, indexOf, 1000538146, false, (java.lang.String) obj, null);
                        }
                        ((java.lang.reflect.Field) d2).set(null, valueOf);
                        objArr4 = objArr3;
                        java.lang.Object obj922 = objArr4[1];
                        i2 = ((int[]) obj922)[0];
                        obj2 = objArr4[2];
                        if (((int[]) obj2)[0] != i2) {
                        }
                        d3 = com.facetec.sdk.al.d(-1265134566);
                        if (d3 == null) {
                        }
                        j2 = ((java.lang.reflect.Field) d3).getLong(null);
                        longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d4 = com.facetec.sdk.al.d(-1261440482);
                        if (d4 != null) {
                        }
                        if (j2 != ((longValue - ((((java.lang.reflect.Field) d4).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1022 = objArr5[2];
                        i3 = ((int[]) obj1022)[0];
                        obj3 = objArr5[1];
                        if (((int[]) obj3)[0] != i3) {
                        }
                        d5 = com.facetec.sdk.al.d(-1266058087);
                        if (d5 == null) {
                        }
                        j3 = ((java.lang.reflect.Field) d5).getLong(null);
                        longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d6 = com.facetec.sdk.al.d(-1266981608);
                        if (d6 != null) {
                        }
                        if (j3 != ((longValue2 - ((((java.lang.reflect.Field) d6).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1122 = objArr7[2];
                        i5 = ((int[]) obj1122)[0];
                        obj4 = objArr7[1];
                        if (((int[]) obj4)[0] != i5) {
                        }
                        nextInt = new java.util.Random().nextInt(2);
                        if (nextInt != 0) {
                        }
                        d7 = com.facetec.sdk.al.d(-2058842632);
                        if (d7 == null) {
                        }
                        j4 = ((java.lang.reflect.Field) d7).getLong(null);
                        longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d8 = com.facetec.sdk.al.d(-2055148548);
                        if (d8 != null) {
                        }
                        if (j4 != ((longValue3 - ((((java.lang.reflect.Field) d8).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1222 = objArr8[2];
                        i6 = ((int[]) obj1222)[0];
                        obj5 = objArr8[3];
                        if (((int[]) obj5)[0] != i6) {
                        }
                        d9 = com.facetec.sdk.al.d(-1876633077);
                        if (d9 == null) {
                        }
                        j5 = ((java.lang.reflect.Field) d9).getLong(null);
                        longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d10 = com.facetec.sdk.al.d(-1877556598);
                        if (d10 != null) {
                        }
                        if (j5 != ((longValue4 - ((((java.lang.reflect.Field) d10).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1322 = objArr9[3];
                        i8 = ((int[]) obj1322)[0];
                        java.lang.Object obj1422 = objArr9[1];
                        i9 = ((int[]) obj1422)[0];
                        if (i9 != i8) {
                        }
                        d11 = com.facetec.sdk.al.d(-1269752171);
                        if (d11 == null) {
                        }
                        j6 = ((java.lang.reflect.Field) d11).getLong(null);
                        longValue5 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d12 = com.facetec.sdk.al.d(-1267905129);
                        if (d12 == null) {
                        }
                        if (j6 != ((longValue5 - ((((java.lang.reflect.Field) d12).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1522 = objArr11[2];
                        i11 = ((int[]) obj1522)[0];
                        obj6 = objArr11[1];
                        if (((int[]) obj6)[0] != i11) {
                        }
                        d13 = com.facetec.sdk.al.d(-1656269327);
                        if (d13 == null) {
                        }
                        j7 = ((java.lang.reflect.Field) d13).getLong(null);
                        longValue6 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d14 = com.facetec.sdk.al.d(-1658116369);
                        if (d14 != null) {
                        }
                        if (j7 != ((longValue6 - ((((java.lang.reflect.Field) d14).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1622 = objArr12[2];
                        i13 = ((int[]) obj1622)[0];
                        obj7 = objArr12[3];
                        if (((int[]) obj7)[0] != i13) {
                        }
                        d15 = com.facetec.sdk.al.d(1606058502);
                        if (d15 == null) {
                        }
                        j8 = ((java.lang.reflect.Field) d15).getLong(null);
                        longValue7 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                        d16 = com.facetec.sdk.al.d(1605134981);
                        if (d16 == null) {
                        }
                        if (j8 != ((longValue7 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
                        }
                        java.lang.Object obj1722 = objArr13[2];
                        i15 = ((int[]) obj1722)[0];
                        obj8 = objArr13[3];
                        if (((int[]) obj8)[0] != i15) {
                        }
                    }
                } catch (java.lang.Exception unused8) {
                    throw new java.lang.RuntimeException();
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            str3 = str2;
            objArr2 = objArr;
        }
        objArr4 = objArr2;
        java.lang.Object obj9222 = objArr4[1];
        i2 = ((int[]) obj9222)[0];
        obj2 = objArr4[2];
        if (((int[]) obj2)[0] != i2) {
        }
        d3 = com.facetec.sdk.al.d(-1265134566);
        if (d3 == null) {
        }
        j2 = ((java.lang.reflect.Field) d3).getLong(null);
        longValue = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d4 = com.facetec.sdk.al.d(-1261440482);
        if (d4 != null) {
        }
        if (j2 != ((longValue - ((((java.lang.reflect.Field) d4).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj10222 = objArr5[2];
        i3 = ((int[]) obj10222)[0];
        obj3 = objArr5[1];
        if (((int[]) obj3)[0] != i3) {
        }
        d5 = com.facetec.sdk.al.d(-1266058087);
        if (d5 == null) {
        }
        j3 = ((java.lang.reflect.Field) d5).getLong(null);
        longValue2 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str3, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d6 = com.facetec.sdk.al.d(-1266981608);
        if (d6 != null) {
        }
        if (j3 != ((longValue2 - ((((java.lang.reflect.Field) d6).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj11222 = objArr7[2];
        i5 = ((int[]) obj11222)[0];
        obj4 = objArr7[1];
        if (((int[]) obj4)[0] != i5) {
        }
        nextInt = new java.util.Random().nextInt(2);
        if (nextInt != 0) {
        }
        d7 = com.facetec.sdk.al.d(-2058842632);
        if (d7 == null) {
        }
        j4 = ((java.lang.reflect.Field) d7).getLong(null);
        longValue3 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str7, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d8 = com.facetec.sdk.al.d(-2055148548);
        if (d8 != null) {
        }
        if (j4 != ((longValue3 - ((((java.lang.reflect.Field) d8).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj12222 = objArr8[2];
        i6 = ((int[]) obj12222)[0];
        obj5 = objArr8[3];
        if (((int[]) obj5)[0] != i6) {
        }
        d9 = com.facetec.sdk.al.d(-1876633077);
        if (d9 == null) {
        }
        j5 = ((java.lang.reflect.Field) d9).getLong(null);
        longValue4 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d10 = com.facetec.sdk.al.d(-1877556598);
        if (d10 != null) {
        }
        if (j5 != ((longValue4 - ((((java.lang.reflect.Field) d10).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj13222 = objArr9[3];
        i8 = ((int[]) obj13222)[0];
        java.lang.Object obj14222 = objArr9[1];
        i9 = ((int[]) obj14222)[0];
        if (i9 != i8) {
        }
        d11 = com.facetec.sdk.al.d(-1269752171);
        if (d11 == null) {
        }
        j6 = ((java.lang.reflect.Field) d11).getLong(null);
        longValue5 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d12 = com.facetec.sdk.al.d(-1267905129);
        if (d12 == null) {
        }
        if (j6 != ((longValue5 - ((((java.lang.reflect.Field) d12).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj15222 = objArr11[2];
        i11 = ((int[]) obj15222)[0];
        obj6 = objArr11[1];
        if (((int[]) obj6)[0] != i11) {
        }
        d13 = com.facetec.sdk.al.d(-1656269327);
        if (d13 == null) {
        }
        j7 = ((java.lang.reflect.Field) d13).getLong(null);
        longValue6 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d14 = com.facetec.sdk.al.d(-1658116369);
        if (d14 != null) {
        }
        if (j7 != ((longValue6 - ((((java.lang.reflect.Field) d14).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj16222 = objArr12[2];
        i13 = ((int[]) obj16222)[0];
        obj7 = objArr12[3];
        if (((int[]) obj7)[0] != i13) {
        }
        d15 = com.facetec.sdk.al.d(1606058502);
        if (d15 == null) {
        }
        j8 = ((java.lang.reflect.Field) d15).getLong(null);
        longValue7 = ((java.lang.Long) java.lang.Class.forName(str).getDeclaredMethod(str13, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        d16 = com.facetec.sdk.al.d(1605134981);
        if (d16 == null) {
        }
        if (j8 != ((longValue7 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
        }
        java.lang.Object obj17222 = objArr13[2];
        i15 = ((int[]) obj17222)[0];
        obj8 = objArr13[3];
        if (((int[]) obj8)[0] != i15) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (com.facetec.sdk.by.h == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i() {
        synchronized (com.facetec.sdk.by.class) {
            int i2 = f3446a;
            if (i2 == 0) {
                l = (p + 11) % 128;
            }
            if (com.facetec.sdk.cq.d(i2)) {
                int i3 = l;
                p = (i3 + 77) % 128;
                h = true;
                int i4 = i3 + 1;
                p = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private static void h() {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i2;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.Object[] d$896c745;
        int i3;
        java.lang.String str2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        int i4;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object[] objArr5;
        int i5;
        java.lang.String str6;
        java.lang.Object[] objArr6;
        java.lang.String str7;
        int i6;
        java.lang.Object[] objArr7;
        int i7;
        java.lang.Object[] objArr8;
        int i8;
        java.lang.Object[] objArr9;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1\ueca9蠜꙽䛂궻ㄌ\ue773뛳䤶\u0bdd\uf1cd럅狺﮽", 22 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
        java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        t((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 2 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
        java.lang.String intern2 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1ꉹꨒ雧\ue5e9䔗䇘伂\u2fe1昩ᗕᴏ巆ᧀ蘼䨕壕\ue14c盄", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, objArr12);
        java.lang.String intern3 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        q("缋\ue158䗃⬆霒\ue7e9╁＋ढ़ꞷ＝䵭柍呖伂\u2fe1쯩\ud99f", 18 - android.text.TextUtils.indexOf("", "", 0), objArr13);
        java.lang.String intern4 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object d2 = com.facetec.sdk.al.d(-2058842632);
        if (d2 == null) {
            char blue = (char) (android.graphics.Color.blue(0) + 26699);
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
            byte b2 = (byte) 0;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            u((byte) ($$b & 31), b2, b2, objArr14);
            d2 = com.facetec.sdk.al.c(blue, 639 - (keyRepeatDelay >> 16), 23 - (pressedStateDuration >> 16), 581433088, false, (java.lang.String) objArr14[0], null);
        }
        long j2 = ((java.lang.reflect.Field) d2).getLong(null);
        long longValue = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-2055148548);
        if (d3 == null) {
            char makeMeasureSpec = (char) (26699 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
            double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
            byte b3 = (byte) 5;
            byte b4 = (byte) (b3 - 5);
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            u(b3, b4, b4, objArr15);
            d3 = com.facetec.sdk.al.c(makeMeasureSpec, 639 - (keyRepeatTimeout >> 16), 23 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 577736964, false, (java.lang.String) objArr15[0], null);
        }
        if (j2 == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            l = (p + 17) % 128;
            java.lang.Object d4 = com.facetec.sdk.al.d(-2056072069);
            if (d4 == null) {
                char resolveSize = (char) (26699 - android.view.View.resolveSize(0, 0));
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b5 = (byte) 0;
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                u((byte) 6, b5, b5, objArr16);
                d4 = com.facetec.sdk.al.c(resolveSize, argb + 639, makeMeasureSpec2 + 23, 580759171, false, (java.lang.String) objArr16[0], null);
            }
            java.lang.Object[] objArr17 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr2 = new java.lang.Object[]{new int[1], (java.lang.String[]) objArr17[1], new int[]{((int[]) objArr17[2])[0]}, new int[]{((int[]) objArr17[3])[0]}};
            int nextInt = new java.util.Random().nextInt(2012729457);
            int i9 = ((((~(1381085164 | r8)) | 612913153) * (-108)) - 489481557) + (((~((~nextInt) | 647590569)) | (~((-647590570) | nextInt)) | 1346407748) * 54) + ((nextInt | 1346407748) * 54) + 395753732;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr2[0])[0] = i11 ^ (i11 << 5);
        } else {
            android.content.Context context = (android.content.Context) java.lang.Class.forName(intern3).getMethod(intern4, new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                context = ((context instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            try {
                java.lang.Object[] objArr18 = {context, 0, 0, 395753732};
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                t(android.widget.ExpandableListView.getPackedPositionChild(0L) + 49, (char) (android.os.Process.getGidForName("") + 28580), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16, objArr19);
                java.lang.Class<?> cls = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                int i12 = $$d[8] - 1;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                v((short) i12, r8[482], (byte) i12, objArr20);
                java.lang.Object[] objArr21 = (java.lang.Object[]) cls.getMethod((java.lang.String) objArr20[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr18);
                java.lang.Object d5 = com.facetec.sdk.al.d(-2056072069);
                if (d5 == null) {
                    char myPid = (char) ((android.os.Process.myPid() >> 22) + 26699);
                    int rgb = android.graphics.Color.rgb(0, 0, 0);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    byte b6 = (byte) 0;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    u((byte) 6, b6, b6, objArr22);
                    d5 = com.facetec.sdk.al.c(myPid, rgb + 16777855, (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 22, 580759171, false, (java.lang.String) objArr22[0], null);
                }
                ((java.lang.reflect.Field) d5).set(null, objArr21);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d6 = com.facetec.sdk.al.d(-2055148548);
                    if (d6 == null) {
                        char packedPositionType = (char) (26699 - android.widget.ExpandableListView.getPackedPositionType(0L));
                        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        byte b7 = (byte) 5;
                        byte b8 = (byte) (b7 - 5);
                        objArr = objArr21;
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        u(b7, b8, b8, objArr23);
                        d6 = com.facetec.sdk.al.c(packedPositionType, 639 - (tapTimeout >> 16), 22 - indexOf, 577736964, false, (java.lang.String) objArr23[0], null);
                    } else {
                        objArr = objArr21;
                    }
                    ((java.lang.reflect.Field) d6).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d7 = com.facetec.sdk.al.d(-2058842632);
                    if (d7 == null) {
                        char c2 = (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26699);
                        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                        int pressedStateDuration2 = android.view.ViewConfiguration.getPressedStateDuration();
                        byte b9 = (byte) 0;
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b9, b9, objArr24);
                        d7 = com.facetec.sdk.al.c(c2, capsMode + 639, (pressedStateDuration2 >> 16) + 23, 581433088, false, (java.lang.String) objArr24[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    objArr2 = objArr;
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
        java.lang.Object obj = objArr2[2];
        int i13 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr2[3];
        if (((int[]) obj2)[0] == i13) {
            int i14 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr25 = {new int[1], (java.lang.String[]) objArr2[1], new int[]{((int[]) obj)[0]}, new int[]{((int[]) obj2)[0]}};
            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
            int i15 = ~(746579072 | elapsedCpuTime);
            int i16 = i14 + (((~((-746579073) | elapsedCpuTime)) | 208348160 | (~((-1282096662) | elapsedCpuTime))) * (-880)) + 556925637 + (((~((~elapsedCpuTime) | (-746579073))) | 1282096661 | i15) * (-880)) + (i15 * 880);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            i2 = 0;
            ((int[]) objArr25[0])[0] = i18 ^ (i18 << 5);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr2[1];
            if (strArr != null) {
                l = (p + 105) % 128;
                int i19 = 0;
                while (i19 < strArr.length) {
                    int i20 = p + 87;
                    l = i20 % 128;
                    if (i20 % 2 != 0) {
                        arrayList.add(strArr[i19]);
                        i19 += 80;
                    } else {
                        arrayList.add(strArr[i19]);
                        i19++;
                    }
                }
            }
            try {
                java.lang.Object[] objArr26 = {java.lang.Long.valueOf((i13 ^ r11) ^ 1577970099787137024L), 367399802L};
                byte[] bArr = $$d;
                byte b10 = bArr[8];
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                v((short) (b10 - 1), b10, bArr[235], objArr27);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                int i21 = bArr[8] - 1;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                v((short) i21, bArr[482], (byte) i21, objArr28);
                cls2.getMethod((java.lang.String) objArr28[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr26);
                int i22 = ((int[]) objArr2[0])[0];
                java.lang.Object[] objArr29 = {new int[1], (java.lang.String[]) objArr2[1], new int[]{((int[]) objArr2[2])[0]}, new int[]{((int[]) objArr2[3])[0]}};
                int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i23 = ~freeMemory;
                int i24 = i22 + (((~(freeMemory | 1619430155)) | (~((-295691) | i23)) | (-2028380044)) * (-68)) + 1340503121 + ((~((-408949889) | i23)) * (-68)) + (((~(i23 | (-1619430156))) | (-409245579)) * 68);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                i2 = 0;
                ((int[]) objArr29[0])[0] = i26 ^ (i26 << 5);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        java.lang.Object d8 = com.facetec.sdk.al.d(1606058502);
        if (d8 == null) {
            char indexOf2 = (char) android.text.TextUtils.indexOf("", "");
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, i2);
            double convertQuartSecToDecDegrees2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i2);
            byte b11 = (byte) 5;
            byte b12 = (byte) (b11 - 5);
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            u(b11, b12, b12, objArr30);
            d8 = com.facetec.sdk.al.c(indexOf2, absoluteGravity + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, (convertQuartSecToDecDegrees2 > 0.0d ? 1 : (convertQuartSecToDecDegrees2 == 0.0d ? 0 : -1)) + 23, -128583426, false, (java.lang.String) objArr30[0], null);
        }
        long j3 = ((java.lang.reflect.Field) d8).getLong(null);
        long longValue3 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d9 = com.facetec.sdk.al.d(1605134981);
        if (d9 == null) {
            char pressedStateDuration3 = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
            int red = android.graphics.Color.red(0);
            byte b13 = (byte) 0;
            num = 0;
            str = intern4;
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            u((byte) 6, b13, b13, objArr31);
            d9 = com.facetec.sdk.al.c(pressedStateDuration3, resolveSizeAndState + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 23 - red, -129822595, false, (java.lang.String) objArr31[0], null);
        } else {
            num = 0;
            str = intern4;
        }
        if (j3 == ((longValue3 - ((((java.lang.reflect.Field) d9).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d10 = com.facetec.sdk.al.d(1603287939);
            if (d10 == null) {
                char keyRepeatDelay2 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                int red2 = android.graphics.Color.red(0);
                int red3 = android.graphics.Color.red(0);
                byte b14 = (byte) 0;
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                u((byte) ($$b & 30), b14, b14, objArr32);
                d10 = com.facetec.sdk.al.c(keyRepeatDelay2, 1058 - red2, 23 - red3, -125877893, false, (java.lang.String) objArr32[0], null);
            }
            java.lang.Object[] objArr33 = (java.lang.Object[]) ((java.lang.reflect.Field) d10).get(null);
            d$896c745 = new java.lang.Object[]{(java.lang.String[]) objArr33[0], new int[1], new int[]{((int[]) objArr33[2])[0]}, new int[]{((int[]) objArr33[3])[0]}};
            int myUid = android.os.Process.myUid();
            int i27 = (((((~((-71559879) | myUid)) * 623) - 1174506660) + (((~myUid) | 439353633) * (-623))) + ((((~(myUid | (-625212103))) | 71559878) | (~(993005857 | myUid))) * 623)) - 244638953;
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) d$896c745[1])[0] = i29 ^ (i29 << 5);
        } else {
            try {
                java.lang.Object[] objArr34 = {-1521222092};
                java.lang.Object d11 = com.facetec.sdk.al.d(-583417224);
                if (d11 == null) {
                    d11 = com.facetec.sdk.al.c((char) android.graphics.Color.argb(0, 0, 0, 0), 1036 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 2060892288, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                d$896c745 = com.facetec.sdk.py.d$896c745(((java.lang.reflect.Constructor) d11).newInstance(objArr34));
                java.lang.Object d12 = com.facetec.sdk.al.d(1603287939);
                if (d12 == null) {
                    char packedPositionChild = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                    int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                    byte b15 = (byte) 0;
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b15, b15, objArr35);
                    d12 = com.facetec.sdk.al.c(packedPositionChild, 1058 - (maxKeyCode >> 16), (fadingEdgeLength >> 16) + 23, -125877893, false, (java.lang.String) objArr35[0], null);
                }
                ((java.lang.reflect.Field) d12).set(null, d$896c745);
                try {
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d13 = com.facetec.sdk.al.d(1605134981);
                    if (d13 == null) {
                        char maximumDrawingCacheSize = (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        float complexToFloat = android.util.TypedValue.complexToFloat(0);
                        int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                        byte b16 = (byte) 0;
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        u((byte) 6, b16, b16, objArr36);
                        d13 = com.facetec.sdk.al.c(maximumDrawingCacheSize, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 23 - (keyRepeatTimeout2 >> 16), -129822595, false, (java.lang.String) objArr36[0], null);
                    }
                    ((java.lang.reflect.Field) d13).set(null, java.lang.Long.valueOf(longValue4));
                    java.lang.Object d14 = com.facetec.sdk.al.d(1606058502);
                    if (d14 == null) {
                        char c3 = (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        int myPid2 = android.os.Process.myPid();
                        byte b17 = (byte) 5;
                        byte b18 = (byte) (b17 - 5);
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        u(b17, b18, b18, objArr37);
                        d14 = com.facetec.sdk.al.c(c3, 1057 - packedPositionChild2, 23 - (myPid2 >> 22), -128583426, false, (java.lang.String) objArr37[0], null);
                    }
                    ((java.lang.reflect.Field) d14).set(null, java.lang.Long.valueOf(longValue4 >> 11));
                } catch (java.lang.Exception unused2) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        java.lang.Object obj3 = d$896c745[2];
        int i30 = ((int[]) obj3)[0];
        java.lang.Object obj4 = d$896c745[3];
        if (((int[]) obj4)[0] == i30) {
            int i31 = ((int[]) d$896c745[1])[0];
            java.lang.Object[] objArr38 = {(java.lang.String[]) d$896c745[0], new int[1], new int[]{((int[]) obj3)[0]}, new int[]{((int[]) obj4)[0]}};
            int i32 = ~(((int) android.os.Process.getElapsedCpuTime()) | 359304953);
            int i33 = i31 + (((1583608343 | i32) * (-658)) - 978953319) + ((i32 | 1241608198) * 658);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            i3 = 0;
            ((int[]) objArr38[1])[0] = i35 ^ (i35 << 5);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) d$896c745[0];
            if (strArr2 != null) {
                for (java.lang.String str8 : strArr2) {
                    p = (l + 25) % 128;
                    arrayList2.add(str8);
                }
            }
            java.lang.Object[] objArr39 = {java.lang.Long.valueOf((i30 ^ r8) ^ (-6469338697698377728L)), -1506260295L};
            byte[] bArr2 = $$d;
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            v(bArr2[254], bArr2[8], bArr2[235], objArr40);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr40[0]);
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            v((short) 38, bArr2[482], bArr2[235], objArr41);
            cls3.getMethod((java.lang.String) objArr41[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr39);
            int i36 = ((int[]) d$896c745[1])[0];
            java.lang.Object[] objArr42 = {(java.lang.String[]) d$896c745[0], new int[1], new int[]{((int[]) d$896c745[2])[0]}, new int[]{((int[]) d$896c745[3])[0]}};
            int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
            int i37 = ~elapsedRealtime;
            int i38 = ~(942872212 | i37);
            int i39 = i36 + ((4251971 | i38) * (-712)) + 117935903 + (((~(elapsedRealtime | 947124183)) | (~(i37 | (-4251972)))) * (-712)) + (((-675345748) | i38) * 712);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            i3 = 0;
            ((int[]) objArr42[1])[0] = i41 ^ (i41 << 5);
        }
        java.lang.Object d15 = com.facetec.sdk.al.d(-1656269327);
        if (d15 == null) {
            char argb2 = (char) android.graphics.Color.argb(i3, i3, i3, i3);
            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(i3);
            byte b19 = (byte) i3;
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            u((byte) 7, b19, b19, objArr43);
            d15 = com.facetec.sdk.al.c(argb2, 800 - (windowTouchSlop >> 8), 24 - normalizeMetaState, 984100617, false, (java.lang.String) objArr43[i3], null);
        }
        long j4 = ((java.lang.reflect.Field) d15).getLong(null);
        long longValue5 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d16 = com.facetec.sdk.al.d(-1658116369);
        if (d16 == null) {
            char c4 = (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
            int packedPositionChild3 = android.widget.ExpandableListView.getPackedPositionChild(0L);
            int indexOf3 = android.text.TextUtils.indexOf("", "");
            byte b20 = (byte) 0;
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            u((byte) ($$b & 31), b20, b20, objArr44);
            d16 = com.facetec.sdk.al.c(c4, packedPositionChild3 + 801, indexOf3 + 24, 985947159, false, (java.lang.String) objArr44[0], null);
        }
        if (j4 == ((longValue5 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d17 = com.facetec.sdk.al.d(-1654422285);
            if (d17 == null) {
                char scrollDefaultDelay = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                float minVolume = android.media.AudioTrack.getMinVolume();
                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                byte b21 = (byte) 5;
                byte b22 = (byte) (b21 - 5);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                u(b21, b22, b22, objArr45);
                d17 = com.facetec.sdk.al.c(scrollDefaultDelay, (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 25 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), 982318603, false, (java.lang.String) objArr45[0], null);
            }
            java.lang.Object[] objArr46 = (java.lang.Object[]) ((java.lang.reflect.Field) d17).get(null);
            objArr4 = new java.lang.Object[]{(java.lang.String[]) objArr46[0], new int[1], new int[]{((int[]) objArr46[2])[0]}, new int[]{((int[]) objArr46[3])[0]}};
            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
            int i42 = (((~(1225617705 | uptimeMillis2)) | 60808726) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 426642219 + (((~((~uptimeMillis2) | 1225617705)) | 43159062) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 525099932;
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr4[1])[0] = i44 ^ (i44 << 5);
            str2 = str;
        } else {
            str2 = str;
            android.content.Context context2 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str2, new java.lang.Class[0]).invoke(null, null);
            if (context2 != null) {
                l = (p + 31) % 128;
                context2 = ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
            }
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            t(15 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (28342 - (android.os.Process.myTid() >> 22)), 65 - android.text.TextUtils.indexOf("", ""), objArr47);
            java.lang.String intern5 = ((java.lang.String) objArr47[0]).intern();
            java.lang.Object[] objArr48 = {-1521222092};
            java.lang.Object d18 = com.facetec.sdk.al.d(-1302416045);
            if (d18 == null) {
                d18 = com.facetec.sdk.al.c((char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 40646), 777 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 363974571, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr49 = {context2, intern5, 525099932, num, 144, ((java.lang.reflect.Constructor) d18).newInstance(objArr48), false};
            java.lang.Object d19 = com.facetec.sdk.al.d(-324935441);
            if (d19 == null) {
                char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
                long uptimeMillis3 = android.os.SystemClock.uptimeMillis();
                byte b23 = (byte) 0;
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                u((byte) ($$b & 30), b23, b23, objArr50);
                d19 = com.facetec.sdk.al.c(maximumFlingVelocity, 800 - (scrollBarSize >> 8), (uptimeMillis3 > 0L ? 1 : (uptimeMillis3 == 0L ? 0 : -1)) + 23, 1263442455, false, (java.lang.String) objArr50[0], new java.lang.Class[]{android.content.Context.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) (63026 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 854 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 30), java.lang.Boolean.TYPE});
            }
            java.lang.Object[] objArr51 = (java.lang.Object[]) ((java.lang.reflect.Method) d19).invoke(null, objArr49);
            if (context2 != null) {
                l = (p + 85) % 128;
                java.lang.Object d20 = com.facetec.sdk.al.d(-1654422285);
                if (d20 == null) {
                    char deadChar = (char) android.view.KeyEvent.getDeadChar(0, 0);
                    long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                    int maximumDrawingCacheSize2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    byte b24 = (byte) 5;
                    byte b25 = (byte) (b24 - 5);
                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                    u(b24, b25, b25, objArr52);
                    d20 = com.facetec.sdk.al.c(deadChar, (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 799, (maximumDrawingCacheSize2 >> 24) + 24, 982318603, false, (java.lang.String) objArr52[0], null);
                }
                ((java.lang.reflect.Field) d20).set(null, objArr51);
                try {
                    long longValue6 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d21 = com.facetec.sdk.al.d(-1658116369);
                    if (d21 == null) {
                        char combineMeasuredStates = (char) android.view.View.combineMeasuredStates(0, 0);
                        int threadPriority = android.os.Process.getThreadPriority(0);
                        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
                        byte b26 = (byte) 0;
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b26, b26, objArr53);
                        d21 = com.facetec.sdk.al.c(combineMeasuredStates, ((threadPriority + 20) >> 6) + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 24 - absoluteGravity2, 985947159, false, (java.lang.String) objArr53[0], null);
                    }
                    ((java.lang.reflect.Field) d21).set(null, java.lang.Long.valueOf(longValue6));
                    java.lang.Object d22 = com.facetec.sdk.al.d(-1656269327);
                    if (d22 == null) {
                        char edgeSlop = (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                        long currentThreadTimeMillis2 = android.os.SystemClock.currentThreadTimeMillis();
                        int gidForName = android.os.Process.getGidForName("");
                        byte b27 = (byte) 0;
                        objArr3 = objArr51;
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        u((byte) 7, b27, b27, objArr54);
                        d22 = com.facetec.sdk.al.c(edgeSlop, 801 - (currentThreadTimeMillis2 > (-1L) ? 1 : (currentThreadTimeMillis2 == (-1L) ? 0 : -1)), gidForName + 25, 984100617, false, (java.lang.String) objArr54[0], null);
                    } else {
                        objArr3 = objArr51;
                    }
                    ((java.lang.reflect.Field) d22).set(null, java.lang.Long.valueOf(longValue6 >> 11));
                } catch (java.lang.Exception unused3) {
                    throw new java.lang.RuntimeException();
                }
            } else {
                objArr3 = objArr51;
            }
            objArr4 = objArr3;
        }
        java.lang.Object obj5 = objArr4[2];
        int i45 = ((int[]) obj5)[0];
        java.lang.Object obj6 = objArr4[3];
        if (((int[]) obj6)[0] == i45) {
            int i46 = ((int[]) objArr4[1])[0];
            java.lang.Object[] objArr55 = {(java.lang.String[]) objArr4[0], new int[1], new int[]{((int[]) obj5)[0]}, new int[]{((int[]) obj6)[0]}};
            int nextInt2 = new java.util.Random().nextInt();
            int i47 = i46 + ((((~((-284227859) | nextInt2)) | 4237586) * (-283)) - 1809304027) + ((~(nextInt2 | (-279990273))) * 283);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            i4 = 0;
            ((int[]) objArr55[1])[0] = i49 ^ (i49 << 5);
        } else {
            java.lang.Object[] objArr56 = {java.lang.Long.valueOf((i45 ^ r9) ^ 5751572821276884992L), 1339273474L};
            byte[] bArr3 = $$d;
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            v((short) 38, bArr3[8], bArr3[235], objArr57);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr57[0]);
            int i50 = bArr3[8] - 1;
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            v((short) i50, bArr3[482], (byte) i50, objArr58);
            cls4.getMethod((java.lang.String) objArr58[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr56);
            int i51 = ((int[]) objArr4[1])[0];
            java.lang.Object[] objArr59 = {(java.lang.String[]) objArr4[0], new int[1], new int[]{((int[]) objArr4[2])[0]}, new int[]{((int[]) objArr4[3])[0]}};
            int i52 = ~((int) android.os.SystemClock.uptimeMillis());
            int i53 = i51 + (((750131905 | r6) * 764) - 746698929) + (((~(i52 | 750131905)) | 323036222) * (-1528)) + ((859909823 | (~(536294526 | i52))) * 764);
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            i4 = 0;
            ((int[]) objArr59[1])[0] = i55 ^ (i55 << 5);
        }
        java.lang.Object d23 = com.facetec.sdk.al.d(-1269752171);
        if (d23 == null) {
            char windowTouchSlop2 = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(i4);
            int capsMode2 = android.text.TextUtils.getCapsMode("", i4, i4);
            byte b28 = (byte) i4;
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            u((byte) ($$b & 31), b28, b28, objArr60);
            d23 = com.facetec.sdk.al.c(windowTouchSlop2, 567 - (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)), 24 - capsMode2, 331244653, false, (java.lang.String) objArr60[i4], null);
        }
        long j5 = ((java.lang.reflect.Field) d23).getLong(null);
        long longValue7 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d24 = com.facetec.sdk.al.d(-1267905129);
        if (d24 == null) {
            char makeMeasureSpec3 = (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            long currentThreadTimeMillis3 = android.os.SystemClock.currentThreadTimeMillis();
            int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b29 = (byte) 0;
            str3 = intern;
            str4 = intern2;
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            u((byte) 7, b29, b29, objArr61);
            d24 = com.facetec.sdk.al.c(makeMeasureSpec3, 568 - (currentThreadTimeMillis3 > (-1L) ? 1 : (currentThreadTimeMillis3 == (-1L) ? 0 : -1)), indexOf4 + 25, 327300975, false, (java.lang.String) objArr61[0], null);
        } else {
            str3 = intern;
            str4 = intern2;
        }
        if (j5 == ((longValue7 - ((((java.lang.reflect.Field) d24).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d25 = com.facetec.sdk.al.d(-1268828650);
            if (d25 == null) {
                char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1);
                int mode = android.view.View.MeasureSpec.getMode(0);
                int windowTouchSlop3 = android.view.ViewConfiguration.getWindowTouchSlop();
                byte b30 = (byte) 0;
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                u((byte) ($$b & 30), b30, b30, objArr62);
                d25 = com.facetec.sdk.al.c(lastIndexOf, mode + 567, 24 - (windowTouchSlop3 >> 8), 330321134, false, (java.lang.String) objArr62[0], null);
            }
            java.lang.Object[] objArr63 = (java.lang.Object[]) ((java.lang.reflect.Field) d25).get(null);
            objArr5 = new java.lang.Object[]{(java.lang.String) objArr63[0], new int[]{((int[]) objArr63[1])[0]}, new int[]{((int[]) objArr63[2])[0]}, new int[1]};
            int i56 = ((((~(952965745 | r1)) | 119546252) * 305) - 1045299784) + (((~((~android.os.Process.myPid()) | 952965745)) | 128267149) * 305) + 1883268686;
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr5[3])[0] = i58 ^ (i58 << 5);
            str5 = str4;
        } else {
            android.content.Context context3 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str2, new java.lang.Class[0]).invoke(null, null);
            if (context3 != null) {
                context3 = ((context3 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context3).getBaseContext() == null) ? null : context3.getApplicationContext();
            }
            byte[] bArr4 = $$d;
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            v(bArr4[19], bArr4[8], bArr4[235], objArr64);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr64[0]);
            java.lang.Object[] objArr65 = new java.lang.Object[1];
            v((short) (-bArr4[443]), bArr4[482], bArr4[77], objArr65);
            java.lang.Object[] objArr66 = (java.lang.Object[]) cls5.getMethod((java.lang.String) objArr65[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, num, num, 1883268686);
            if (context3 != null) {
                java.lang.Object d26 = com.facetec.sdk.al.d(-1268828650);
                if (d26 == null) {
                    char c5 = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1);
                    int pressedStateDuration4 = android.view.ViewConfiguration.getPressedStateDuration();
                    int maximumFlingVelocity2 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                    byte b31 = (byte) 0;
                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b31, b31, objArr67);
                    d26 = com.facetec.sdk.al.c(c5, (pressedStateDuration4 >> 16) + 567, 24 - (maximumFlingVelocity2 >> 16), 330321134, false, (java.lang.String) objArr67[0], null);
                }
                ((java.lang.reflect.Field) d26).set(null, objArr66);
                try {
                    str5 = str4;
                    long longValue8 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d27 = com.facetec.sdk.al.d(-1267905129);
                    if (d27 == null) {
                        char scrollDefaultDelay2 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        byte b32 = (byte) 0;
                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                        u((byte) 7, b32, b32, objArr68);
                        d27 = com.facetec.sdk.al.c(scrollDefaultDelay2, (touchSlop >> 8) + 567, 25 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), 327300975, false, (java.lang.String) objArr68[0], null);
                    }
                    ((java.lang.reflect.Field) d27).set(null, java.lang.Long.valueOf(longValue8));
                    java.lang.Object d28 = com.facetec.sdk.al.d(-1269752171);
                    if (d28 == null) {
                        char combineMeasuredStates2 = (char) android.view.View.combineMeasuredStates(0, 0);
                        int red4 = android.graphics.Color.red(0);
                        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                        byte b33 = (byte) 0;
                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b33, b33, objArr69);
                        d28 = com.facetec.sdk.al.c(combineMeasuredStates2, red4 + 567, trimmedLength + 24, 331244653, false, (java.lang.String) objArr69[0], null);
                    }
                    ((java.lang.reflect.Field) d28).set(null, java.lang.Long.valueOf(longValue8 >> 11));
                } catch (java.lang.Exception unused4) {
                    throw new java.lang.RuntimeException();
                }
            } else {
                str5 = str4;
            }
            objArr5 = objArr66;
        }
        java.lang.Object obj7 = objArr5[2];
        int i59 = ((int[]) obj7)[0];
        java.lang.Object obj8 = objArr5[1];
        if (((int[]) obj8)[0] == i59) {
            p = (l + 71) % 128;
            int i60 = ((int[]) objArr5[3])[0];
            java.lang.Object[] objArr70 = {(java.lang.String) objArr5[0], new int[]{((int[]) obj8)[0]}, new int[]{((int[]) obj7)[0]}, new int[1]};
            int i61 = ~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | 853832890);
            int i62 = i60 + (((10749074 | i61) * (-374)) - 1230849601) + ((i61 | 843083816) * 374);
            int i63 = (i62 << 13) ^ i62;
            int i64 = i63 ^ (i63 >>> 17);
            i5 = 0;
            ((int[]) objArr70[3])[0] = i64 ^ (i64 << 5);
        } else {
            android.content.Context context4 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str2, new java.lang.Class[0]).invoke(null, null);
            if (context4 != null) {
                int i65 = p + 89;
                l = i65 % 128;
                if (i65 % 2 != 0) {
                    boolean z = context4 instanceof android.content.ContextWrapper;
                    throw null;
                }
                context4 = ((context4 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context4).getBaseContext() == null) ? null : context4.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                context4 = null;
            }
            java.lang.Object[] objArr71 = {context4, java.lang.Long.valueOf((i59 ^ r10) ^ 2128070520376131584L), 495480025L};
            java.lang.Object[] objArr72 = new java.lang.Object[1];
            v((short) (-$$d[443]), r1[77], r1[235], objArr72);
            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr72[0]);
            java.lang.Object[] objArr73 = new java.lang.Object[1];
            v((short) 93, r1[482], r1[5], objArr73);
            cls6.getMethod((java.lang.String) objArr73[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr71);
            int i66 = ((int[]) objArr5[3])[0];
            java.lang.Object[] objArr74 = {(java.lang.String) objArr5[0], new int[]{((int[]) objArr5[1])[0]}, new int[]{((int[]) objArr5[2])[0]}, new int[1]};
            int myTid = android.os.Process.myTid();
            int i67 = i66 + ((((~(454965088 | myTid)) | 67209347) * (-140)) - 846544779) + ((~(522174435 | myTid)) * 70) + (((~(myTid | 369733507)) | 219650275) * 70);
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            i5 = 0;
            ((int[]) objArr74[3])[0] = i69 ^ (i69 << 5);
        }
        java.lang.Object d29 = com.facetec.sdk.al.d(-1265134566);
        if (d29 == null) {
            char c6 = (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int makeMeasureSpec4 = android.view.View.MeasureSpec.makeMeasureSpec(i5, i5);
            int rgb2 = android.graphics.Color.rgb(i5, i5, i5);
            byte length = (byte) $$a.length;
            byte b34 = (byte) (length - 4);
            java.lang.Object[] objArr75 = new java.lang.Object[1];
            u(length, b34, b34, objArr75);
            d29 = com.facetec.sdk.al.c(c6, makeMeasureSpec4 + 567, (-16777192) - rgb2, 326692578, false, (java.lang.String) objArr75[0], null);
        }
        long j6 = ((java.lang.reflect.Field) d29).getLong(null);
        long longValue9 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d30 = com.facetec.sdk.al.d(-1261440482);
        if (d30 == null) {
            char bitsPerPixel = (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0));
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
            byte b35 = (byte) 0;
            byte b36 = b35;
            str6 = str2;
            java.lang.Object[] objArr76 = new java.lang.Object[1];
            u(b35, b36, b36, objArr76);
            d30 = com.facetec.sdk.al.c(bitsPerPixel, (elapsedRealtime2 > 0L ? 1 : (elapsedRealtime2 == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 24 - (longPressTimeout >> 16), 320899302, false, (java.lang.String) objArr76[0], null);
        } else {
            str6 = str2;
        }
        if (j6 == ((longValue9 - ((((java.lang.reflect.Field) d30).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d31 = com.facetec.sdk.al.d(-1262364003);
            if (d31 == null) {
                char doubleTapTimeout = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                int windowTouchSlop4 = android.view.ViewConfiguration.getWindowTouchSlop();
                float maxVolume = android.media.AudioTrack.getMaxVolume();
                byte b37 = (byte) ($$b & 7);
                byte b38 = (byte) (b37 - 1);
                java.lang.Object[] objArr77 = new java.lang.Object[1];
                u(b37, b38, b38, objArr77);
                d31 = com.facetec.sdk.al.c(doubleTapTimeout, 567 - (windowTouchSlop4 >> 8), (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 23, 321822821, false, (java.lang.String) objArr77[0], null);
            }
            java.lang.Object[] objArr78 = (java.lang.Object[]) ((java.lang.reflect.Field) d31).get(null);
            objArr6 = new java.lang.Object[]{(java.lang.String) objArr78[0], new int[]{((int[]) objArr78[1])[0]}, new int[]{((int[]) objArr78[2])[0]}, new int[1]};
            int i70 = ~((int) java.lang.Runtime.getRuntime().maxMemory());
            int i71 = (((((~((-449663749) | i70)) | (-375034848)) * (-933)) + 1733986492) + (((~(i70 | (-375034848))) | 68321499) * 933)) - 2071407898;
            int i72 = (i71 << 13) ^ i71;
            int i73 = i72 ^ (i72 >>> 17);
            ((int[]) objArr6[3])[0] = i73 ^ (i73 << 5);
        } else {
            byte[] bArr5 = $$d;
            java.lang.Object[] objArr79 = new java.lang.Object[1];
            v((short) 93, bArr5[8], bArr5[235], objArr79);
            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr79[0]);
            java.lang.Object[] objArr80 = new java.lang.Object[1];
            v((short) 38, bArr5[482], bArr5[235], objArr80);
            objArr6 = (java.lang.Object[]) cls7.getMethod((java.lang.String) objArr80[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, num, 172491334);
            java.lang.Object d32 = com.facetec.sdk.al.d(-1262364003);
            if (d32 == null) {
                char c7 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                int indexOf5 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                byte b39 = (byte) ($$b & 7);
                byte b40 = (byte) (b39 - 1);
                java.lang.Object[] objArr81 = new java.lang.Object[1];
                u(b39, b40, b40, objArr81);
                d32 = com.facetec.sdk.al.c(c7, 567 - resolveOpacity, 23 - indexOf5, 321822821, false, (java.lang.String) objArr81[0], null);
            }
            ((java.lang.reflect.Field) d32).set(null, objArr6);
            try {
                long longValue10 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d33 = com.facetec.sdk.al.d(-1261440482);
                if (d33 == null) {
                    char c8 = (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int indexOf6 = android.text.TextUtils.indexOf("", "");
                    int mode2 = android.view.View.MeasureSpec.getMode(0);
                    byte b41 = (byte) 0;
                    byte b42 = b41;
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    u(b41, b42, b42, objArr82);
                    d33 = com.facetec.sdk.al.c(c8, indexOf6 + 567, mode2 + 24, 320899302, false, (java.lang.String) objArr82[0], null);
                }
                ((java.lang.reflect.Field) d33).set(null, java.lang.Long.valueOf(longValue10));
                java.lang.Object d34 = com.facetec.sdk.al.d(-1265134566);
                if (d34 == null) {
                    char lastIndexOf2 = (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    long currentThreadTimeMillis4 = android.os.SystemClock.currentThreadTimeMillis();
                    int defaultSize = android.view.View.getDefaultSize(0, 0);
                    byte length2 = (byte) $$a.length;
                    byte b43 = (byte) (length2 - 4);
                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                    u(length2, b43, b43, objArr83);
                    d34 = com.facetec.sdk.al.c(lastIndexOf2, 568 - (currentThreadTimeMillis4 > (-1L) ? 1 : (currentThreadTimeMillis4 == (-1L) ? 0 : -1)), defaultSize + 24, 326692578, false, (java.lang.String) objArr83[0], null);
                }
                ((java.lang.reflect.Field) d34).set(null, java.lang.Long.valueOf(longValue10 >> 11));
            } catch (java.lang.Exception unused5) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj9 = objArr6[2];
        int i74 = ((int[]) obj9)[0];
        java.lang.Object obj10 = objArr6[1];
        if (((int[]) obj10)[0] == i74) {
            int i75 = ((int[]) objArr6[3])[0];
            java.lang.Object[] objArr84 = {(java.lang.String) objArr6[0], new int[]{((int[]) obj10)[0]}, new int[]{((int[]) obj9)[0]}, new int[1]};
            int myTid2 = android.os.Process.myTid();
            int i76 = ~myTid2;
            int i77 = i75 + ((((~((-532497081) | i76)) | (-292201516)) * (-865)) - 1773035184) + ((~(myTid2 | 532497080)) * 865) + (((~((-292201516) | i76)) | (~(i76 | 532497080))) * 865);
            int i78 = (i77 << 13) ^ i77;
            int i79 = i78 ^ (i78 >>> 17);
            ((int[]) objArr84[3])[0] = i79 ^ (i79 << 5);
            i6 = 0;
            str7 = str6;
        } else {
            new java.util.ArrayList().add((java.lang.String) objArr6[0]);
            str7 = str6;
            android.content.Context context5 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context5 != null) {
                context5 = ((context5 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context5).getBaseContext() == null) ? null : context5.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                context5 = null;
            }
            java.lang.Object[] objArr85 = {context5, java.lang.Long.valueOf((i74 ^ r9) ^ (-4964829907520585728L)), -1155964527L};
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            v((short) (-$$d[443]), r1[77], r1[235], objArr86);
            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr86[0]);
            java.lang.Object[] objArr87 = new java.lang.Object[1];
            v((short) 93, r1[482], r1[5], objArr87);
            cls8.getMethod((java.lang.String) objArr87[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr85);
            int i80 = ((int[]) objArr6[3])[0];
            java.lang.Object[] objArr88 = {(java.lang.String) objArr6[0], new int[]{((int[]) objArr6[1])[0]}, new int[]{((int[]) objArr6[2])[0]}, new int[1]};
            int myUid2 = android.os.Process.myUid();
            int i81 = i80 + ((((~(612631609 | myUid2)) | (-212066987)) * (-668)) - 1534170669) + (((~((-212066987) | myUid2)) | 612631609) * 1336) + ((myUid2 | (-136569475)) * 668);
            int i82 = (i81 << 13) ^ i81;
            int i83 = i82 ^ (i82 >>> 17);
            i6 = 0;
            ((int[]) objArr88[3])[0] = i83 ^ (i83 << 5);
        }
        java.lang.Object d35 = com.facetec.sdk.al.d(-1266058087);
        if (d35 == null) {
            char resolveOpacity2 = (char) android.graphics.drawable.Drawable.resolveOpacity(i6, i6);
            int lastIndexOf3 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i6, i6);
            int packedPositionChild4 = android.widget.ExpandableListView.getPackedPositionChild(0L);
            byte b44 = (byte) 5;
            byte b45 = (byte) (b44 - 5);
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            u(b44, b45, b45, objArr89);
            d35 = com.facetec.sdk.al.c(resolveOpacity2, lastIndexOf3 + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, packedPositionChild4 + 25, 325453409, false, (java.lang.String) objArr89[0], null);
        }
        long j7 = ((java.lang.reflect.Field) d35).getLong(null);
        long longValue11 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d36 = com.facetec.sdk.al.d(-1266981608);
        if (d36 == null) {
            char maxKeyCode2 = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
            int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            byte b46 = (byte) 0;
            java.lang.Object[] objArr90 = new java.lang.Object[1];
            u((byte) 6, b46, b46, objArr90);
            d36 = com.facetec.sdk.al.c(maxKeyCode2, (scrollBarFadeDuration >> 16) + 567, 24 - (jumpTapTimeout >> 16), 328474592, false, (java.lang.String) objArr90[0], null);
        }
        if (j7 == ((longValue11 - ((((java.lang.reflect.Field) d36).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d37 = com.facetec.sdk.al.d(-1264211045);
            if (d37 == null) {
                char green = (char) android.graphics.Color.green(0);
                int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
                int argb3 = android.graphics.Color.argb(0, 0, 0, 0);
                byte b47 = (byte) 3;
                byte b48 = (byte) (b47 - 3);
                java.lang.Object[] objArr91 = new java.lang.Object[1];
                u(b47, b48, b48, objArr91);
                d37 = com.facetec.sdk.al.c(green, (fadingEdgeLength2 >> 16) + 567, 24 - argb3, 323670371, false, (java.lang.String) objArr91[0], null);
            }
            java.lang.Object[] objArr92 = (java.lang.Object[]) ((java.lang.reflect.Field) d37).get(null);
            objArr7 = new java.lang.Object[]{(java.lang.String) objArr92[0], new int[]{((int[]) objArr92[1])[0]}, new int[]{((int[]) objArr92[2])[0]}, new int[1]};
            int freeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i84 = ~((-671223900) | freeMemory2);
            int i85 = (((((68535424 | i84) * (-476)) + 1707793327) + (i84 * 952)) + ((~((~freeMemory2) | (-671223900))) * 476)) - 1130308625;
            int i86 = (i85 << 13) ^ i85;
            int i87 = i86 ^ (i86 >>> 17);
            ((int[]) objArr7[3])[0] = i87 ^ (i87 << 5);
        } else {
            android.content.Context context6 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context6 != null) {
                if (context6 instanceof android.content.ContextWrapper) {
                    p = (l + 35) % 128;
                    if (((android.content.ContextWrapper) context6).getBaseContext() == null) {
                        context6 = null;
                    }
                }
                context6 = context6.getApplicationContext();
            }
            byte[] bArr6 = $$d;
            java.lang.Object[] objArr93 = new java.lang.Object[1];
            v((short) 112, bArr6[77], bArr6[235], objArr93);
            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr93[0]);
            java.lang.Object[] objArr94 = new java.lang.Object[1];
            v((short) 38, bArr6[482], bArr6[235], objArr94);
            java.lang.Object[] objArr95 = (java.lang.Object[]) cls9.getMethod((java.lang.String) objArr94[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context6, num, -1130308625);
            if (context6 != null) {
                java.lang.Object d38 = com.facetec.sdk.al.d(-1264211045);
                if (d38 == null) {
                    char capsMode3 = (char) android.text.TextUtils.getCapsMode("", 0, 0);
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                    byte b49 = (byte) 3;
                    byte b50 = (byte) (b49 - 3);
                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                    u(b49, b50, b50, objArr96);
                    d38 = com.facetec.sdk.al.c(capsMode3, (elapsedRealtime3 > 0L ? 1 : (elapsedRealtime3 == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, resolveSize2 + 24, 323670371, false, (java.lang.String) objArr96[0], null);
                }
                ((java.lang.reflect.Field) d38).set(null, objArr95);
                try {
                    long longValue12 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d39 = com.facetec.sdk.al.d(-1266981608);
                    if (d39 == null) {
                        char lastIndexOf4 = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                        int lastIndexOf5 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        float minVolume2 = android.media.AudioTrack.getMinVolume();
                        byte b51 = (byte) 0;
                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                        u((byte) 6, b51, b51, objArr97);
                        d39 = com.facetec.sdk.al.c(lastIndexOf4, lastIndexOf5 + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, 24 - (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)), 328474592, false, (java.lang.String) objArr97[0], null);
                    }
                    ((java.lang.reflect.Field) d39).set(null, java.lang.Long.valueOf(longValue12));
                    java.lang.Object d40 = com.facetec.sdk.al.d(-1266058087);
                    if (d40 == null) {
                        char packedPositionChild5 = (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L));
                        int maxKeyCode3 = android.view.KeyEvent.getMaxKeyCode();
                        int indexOf7 = android.text.TextUtils.indexOf("", "", 0);
                        byte b52 = (byte) 5;
                        byte b53 = (byte) (b52 - 5);
                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                        u(b52, b53, b53, objArr98);
                        d40 = com.facetec.sdk.al.c(packedPositionChild5, (maxKeyCode3 >> 16) + 567, indexOf7 + 24, 325453409, false, (java.lang.String) objArr98[0], null);
                    }
                    ((java.lang.reflect.Field) d40).set(null, java.lang.Long.valueOf(longValue12 >> 11));
                } catch (java.lang.Exception unused6) {
                    throw new java.lang.RuntimeException();
                }
            }
            objArr7 = objArr95;
        }
        java.lang.Object obj11 = objArr7[2];
        int i88 = ((int[]) obj11)[0];
        java.lang.Object obj12 = objArr7[1];
        if (((int[]) obj12)[0] == i88) {
            int i89 = ((int[]) objArr7[3])[0];
            java.lang.Object[] objArr99 = {(java.lang.String) objArr7[0], new int[]{((int[]) obj12)[0]}, new int[]{((int[]) obj11)[0]}, new int[1]};
            int freeMemory3 = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i90 = ~freeMemory3;
            int i91 = i89 + ((733099628 | i90) * (-757)) + 1109394524 + ((~((-71663636) | freeMemory3)) * 1514) + (((~(freeMemory3 | 804763263)) | (~(i90 | (-91598968))) | 19935332) * 757);
            int i92 = (i91 << 13) ^ i91;
            int i93 = i92 ^ (i92 >>> 17);
            i7 = 0;
            ((int[]) objArr99[3])[0] = i93 ^ (i93 << 5);
        } else {
            android.content.Context context7 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context7 != null) {
                context7 = ((context7 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context7).getBaseContext() == null) ? null : context7.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                context7 = null;
            }
            java.lang.Object[] objArr100 = {context7, java.lang.Long.valueOf((i88 ^ r10) ^ 1668856130371059712L), 388560335L};
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            v((short) (-$$d[443]), r1[77], r1[235], objArr101);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr101[0]);
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            v((short) 93, r1[482], r1[5], objArr102);
            cls10.getMethod((java.lang.String) objArr102[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr100);
            int i94 = ((int[]) objArr7[3])[0];
            java.lang.Object[] objArr103 = {(java.lang.String) objArr7[0], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, new int[1]};
            int myUid3 = android.os.Process.myUid();
            int i95 = ~myUid3;
            int i96 = ~(515325486 | i95);
            int i97 = i94 + ((4227217 | i96) * (-712)) + 215494235 + (((~(myUid3 | 519552703)) | (~(i95 | (-4227218)))) * (-712)) + (((-309373110) | i96) * 712);
            int i98 = (i97 << 13) ^ i97;
            int i99 = i98 ^ (i98 >>> 17);
            i7 = 0;
            ((int[]) objArr103[3])[0] = i99 ^ (i99 << 5);
        }
        java.lang.Object d41 = com.facetec.sdk.al.d(-1672709414);
        if (d41 == null) {
            char makeMeasureSpec5 = (char) android.view.View.MeasureSpec.makeMeasureSpec(i7, i7);
            int deadChar2 = android.view.KeyEvent.getDeadChar(i7, i7);
            int argb4 = android.graphics.Color.argb(i7, i7, i7, i7);
            byte b54 = (byte) i7;
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            u((byte) ($$b & 30), b54, b54, objArr104);
            d41 = com.facetec.sdk.al.c(makeMeasureSpec5, 1436 - deadChar2, 23 - argb4, 1000538146, false, (java.lang.String) objArr104[i7], null);
        }
        long j8 = ((java.lang.reflect.Field) d41).getLong(null);
        long longValue13 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d42 = com.facetec.sdk.al.d(-1669938851);
        if (d42 == null) {
            char deadChar3 = (char) android.view.KeyEvent.getDeadChar(0, 0);
            int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
            int indexOf8 = android.text.TextUtils.indexOf("", "", 0);
            byte b55 = (byte) 5;
            byte b56 = (byte) (b55 - 5);
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            u(b55, b56, b56, objArr105);
            d42 = com.facetec.sdk.al.c(deadChar3, offsetBefore + 1436, indexOf8 + 23, 999930789, false, (java.lang.String) objArr105[0], null);
        }
        if (j8 == ((longValue13 - ((((java.lang.reflect.Field) d42).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d43 = com.facetec.sdk.al.d(-1670862372);
            if (d43 == null) {
                char c9 = (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int keyRepeatTimeout3 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                byte b57 = (byte) 0;
                java.lang.Object[] objArr106 = new java.lang.Object[1];
                u((byte) 6, b57, b57, objArr106);
                d43 = com.facetec.sdk.al.c(c9, 1436 - (keyRepeatTimeout3 >> 16), 22 - modifierMetaStateMask, 998757156, false, (java.lang.String) objArr106[0], null);
            }
            java.lang.Object[] objArr107 = (java.lang.Object[]) ((java.lang.reflect.Field) d43).get(null);
            objArr8 = new java.lang.Object[]{(java.lang.String) objArr107[0], new int[]{((int[]) objArr107[1])[0]}, new int[]{((int[]) objArr107[2])[0]}, new int[1], (java.lang.String) objArr107[4]};
            int i100 = ((((~(795205142 | r1)) | 268435752) * 305) - 599555668) + (((~((~new java.util.Random().nextInt(674151889)) | 795205142)) | 474340136) * 305) + 1235230107;
            int i101 = (i100 << 13) ^ i100;
            int i102 = i101 ^ (i101 >>> 17);
            ((int[]) objArr8[3])[0] = i102 ^ (i102 << 5);
        } else {
            android.content.Context context8 = (android.content.Context) java.lang.Class.forName(intern3).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context8 != null) {
                context8 = ((context8 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context8).getBaseContext() == null) ? null : context8.getApplicationContext();
            }
            short s2 = (short) ($$e & com.google.zxing.pdf417.PDF417Common.NUMBER_OF_CODEWORDS);
            byte[] bArr7 = $$d;
            java.lang.Object[] objArr108 = new java.lang.Object[1];
            v(s2, bArr7[5], bArr7[235], objArr108);
            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr108[0]);
            java.lang.Object[] objArr109 = new java.lang.Object[1];
            v((short) 38, bArr7[482], bArr7[235], objArr109);
            java.lang.Object[] objArr110 = (java.lang.Object[]) cls11.getMethod((java.lang.String) objArr109[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context8, num, num, 1235230107);
            if (context8 != null) {
                java.lang.Object d44 = com.facetec.sdk.al.d(-1670862372);
                if (d44 == null) {
                    char doubleTapTimeout2 = (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int keyRepeatTimeout4 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                    byte b58 = (byte) 0;
                    java.lang.Object[] objArr111 = new java.lang.Object[1];
                    u((byte) 6, b58, b58, objArr111);
                    d44 = com.facetec.sdk.al.c(doubleTapTimeout2, (keyRepeatTimeout4 >> 16) + 1436, keyCodeFromString + 23, 998757156, false, (java.lang.String) objArr111[0], null);
                }
                ((java.lang.reflect.Field) d44).set(null, objArr110);
                try {
                    long longValue14 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d45 = com.facetec.sdk.al.d(-1669938851);
                    if (d45 == null) {
                        char argb5 = (char) android.graphics.Color.argb(0, 0, 0, 0);
                        int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                        float minVolume3 = android.media.AudioTrack.getMinVolume();
                        byte b59 = (byte) 5;
                        byte b60 = (byte) (b59 - 5);
                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                        u(b59, b60, b60, objArr112);
                        d45 = com.facetec.sdk.al.c(argb5, bitsPerPixel2 + 1437, (minVolume3 > 0.0f ? 1 : (minVolume3 == 0.0f ? 0 : -1)) + 23, 999930789, false, (java.lang.String) objArr112[0], null);
                    }
                    ((java.lang.reflect.Field) d45).set(null, java.lang.Long.valueOf(longValue14));
                    java.lang.Object d46 = com.facetec.sdk.al.d(-1672709414);
                    if (d46 == null) {
                        char packedPositionType2 = (char) android.widget.ExpandableListView.getPackedPositionType(0L);
                        int myTid3 = android.os.Process.myTid();
                        int size = android.view.View.MeasureSpec.getSize(0);
                        byte b61 = (byte) 0;
                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                        u((byte) ($$b & 30), b61, b61, objArr113);
                        d46 = com.facetec.sdk.al.c(packedPositionType2, 1436 - (myTid3 >> 22), size + 23, 1000538146, false, (java.lang.String) objArr113[0], null);
                    }
                    ((java.lang.reflect.Field) d46).set(null, java.lang.Long.valueOf(longValue14 >> 11));
                } catch (java.lang.Exception unused7) {
                    throw new java.lang.RuntimeException();
                }
            }
            objArr8 = objArr110;
        }
        java.lang.Object obj13 = objArr8[1];
        int i103 = ((int[]) obj13)[0];
        java.lang.Object obj14 = objArr8[2];
        if (((int[]) obj14)[0] == i103) {
            int i104 = ((int[]) objArr8[3])[0];
            java.lang.Object[] objArr114 = {(java.lang.String) objArr8[0], new int[]{((int[]) obj13)[0]}, new int[]{((int[]) obj14)[0]}, new int[1], (java.lang.String) objArr8[4]};
            int elapsedRealtime4 = (int) android.os.SystemClock.elapsedRealtime();
            int i105 = ~((-816098678) | elapsedRealtime4);
            int i106 = ~elapsedRealtime4;
            int i107 = i104 + (((277129221 | i105) * (-280)) - 776199863) + ((i105 | (~(495233671 | elapsedRealtime4))) * 140) + (((~(elapsedRealtime4 | (-538969457))) | (~(i106 | (-277129222))) | (~(1034203127 | i106))) * 140);
            int i108 = i107 ^ (i107 << 13);
            int i109 = i108 ^ (i108 >>> 17);
            i8 = 0;
            ((int[]) objArr114[3])[0] = i109 ^ (i109 << 5);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add((java.lang.String) objArr8[4]);
            arrayList3.add((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr115 = {java.lang.Long.valueOf((i103 ^ r6) ^ (-8592221352847474688L)), -2000532460L};
            byte[] bArr8 = $$d;
            java.lang.Object[] objArr116 = new java.lang.Object[1];
            v((short) 145, bArr8[77], bArr8[235], objArr116);
            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr116[0]);
            java.lang.Object[] objArr117 = new java.lang.Object[1];
            v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr8[482], bArr8[8], objArr117);
            cls12.getMethod((java.lang.String) objArr117[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr115);
            int i110 = ((int[]) objArr8[3])[0];
            java.lang.Object[] objArr118 = {(java.lang.String) objArr8[0], new int[]{((int[]) objArr8[1])[0]}, new int[]{((int[]) objArr8[2])[0]}, new int[1], (java.lang.String) objArr8[4]};
            int uptimeMillis4 = (int) android.os.SystemClock.uptimeMillis();
            int i111 = i110 + (((~((-4195585) | (~uptimeMillis4))) | (-316669422)) * (-591)) + 332421066 + ((uptimeMillis4 | (-4195585)) * 591);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            i8 = 0;
            ((int[]) objArr118[3])[0] = i113 ^ (i113 << 5);
        }
        java.lang.Object d47 = com.facetec.sdk.al.d(-1876633077);
        if (d47 == null) {
            char indexOf9 = (char) (1537 - android.text.TextUtils.indexOf("", ""));
            int blue2 = android.graphics.Color.blue(i8);
            int doubleTapTimeout3 = android.view.ViewConfiguration.getDoubleTapTimeout();
            byte b62 = (byte) i8;
            java.lang.Object[] objArr119 = new java.lang.Object[1];
            u((byte) ($$b & 30), b62, b62, objArr119);
            d47 = com.facetec.sdk.al.c(indexOf9, 708 - blue2, 22 - (doubleTapTimeout3 >> 16), 936091891, false, (java.lang.String) objArr119[i8], null);
        }
        long j9 = ((java.lang.reflect.Field) d47).getLong(null);
        long longValue15 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d48 = com.facetec.sdk.al.d(-1877556598);
        if (d48 == null) {
            char c10 = (char) (1538 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int blue3 = android.graphics.Color.blue(0);
            long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
            byte b63 = (byte) 0;
            java.lang.Object[] objArr120 = new java.lang.Object[1];
            u((byte) ($$b & 31), b63, b63, objArr120);
            d48 = com.facetec.sdk.al.c(c10, 708 - blue3, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 23, 939112562, false, (java.lang.String) objArr120[0], null);
        }
        if (j9 == ((longValue15 - ((((java.lang.reflect.Field) d48).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d49 = com.facetec.sdk.al.d(-1874786035);
            if (d49 == null) {
                char keyRepeatDelay3 = (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1537);
                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                int deadChar4 = android.view.KeyEvent.getDeadChar(0, 0);
                byte b64 = (byte) 0;
                java.lang.Object[] objArr121 = new java.lang.Object[1];
                u((byte) 6, b64, b64, objArr121);
                d49 = com.facetec.sdk.al.c(keyRepeatDelay3, 708 - packedPositionGroup, 22 - deadChar4, 934179829, false, (java.lang.String) objArr121[0], null);
            }
            java.lang.Object[] objArr122 = (java.lang.Object[]) ((java.lang.reflect.Field) d49).get(null);
            objArr9 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr122[1])[0]}, (java.lang.String[]) objArr122[2], new int[]{((int[]) objArr122[3])[0]}};
            int i114 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i115 = ~i114;
            int i116 = ((157078547 | i114) * (-50)) + 1937080260 + (((~(i114 | (-20993042))) | (~((-1417750533) | i115))) * 50) + (((~(157078547 | i115)) | (~(i115 | (-1438743574))) | 1417750532) * 50) + 83288156;
            int i117 = (i116 << 13) ^ i116;
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr9[0])[0] = i118 ^ (i118 << 5);
        } else {
            java.lang.Object[] objArr123 = {num, num, 83288156};
            java.lang.Object d50 = com.facetec.sdk.al.d(1329445289);
            if (d50 == null) {
                char lastIndexOf6 = (char) (1536 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0));
                int tapTimeout2 = android.view.ViewConfiguration.getTapTimeout();
                int lastIndexOf7 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                byte b65 = (byte) 0;
                java.lang.Object[] objArr124 = new java.lang.Object[1];
                u((byte) 6, b65, b65, objArr124);
                d50 = com.facetec.sdk.al.c(lastIndexOf6, (tapTimeout2 >> 16) + 708, 21 - lastIndexOf7, -388840623, false, (java.lang.String) objArr124[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            objArr9 = (java.lang.Object[]) ((java.lang.reflect.Method) d50).invoke(null, objArr123);
            java.lang.Object d51 = com.facetec.sdk.al.d(-1874786035);
            if (d51 == null) {
                char deadChar5 = (char) (android.view.KeyEvent.getDeadChar(0, 0) + 1537);
                int indexOf10 = android.text.TextUtils.indexOf("", "");
                int alpha = android.graphics.Color.alpha(0);
                byte b66 = (byte) 0;
                java.lang.Object[] objArr125 = new java.lang.Object[1];
                u((byte) 6, b66, b66, objArr125);
                d51 = com.facetec.sdk.al.c(deadChar5, 708 - indexOf10, alpha + 22, 934179829, false, (java.lang.String) objArr125[0], null);
            }
            ((java.lang.reflect.Field) d51).set(null, objArr9);
            try {
                long longValue16 = ((java.lang.Long) java.lang.Class.forName(str3).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d52 = com.facetec.sdk.al.d(-1877556598);
                if (d52 == null) {
                    char packedPositionGroup2 = (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1537);
                    int keyRepeatTimeout5 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int myTid4 = android.os.Process.myTid();
                    byte b67 = (byte) 0;
                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                    u((byte) ($$b & 31), b67, b67, objArr126);
                    d52 = com.facetec.sdk.al.c(packedPositionGroup2, 708 - (keyRepeatTimeout5 >> 16), 22 - (myTid4 >> 22), 939112562, false, (java.lang.String) objArr126[0], null);
                }
                ((java.lang.reflect.Field) d52).set(null, java.lang.Long.valueOf(longValue16));
                java.lang.Object d53 = com.facetec.sdk.al.d(-1876633077);
                if (d53 == null) {
                    char jumpTapTimeout2 = (char) (1537 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    int resolveOpacity3 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    int bitsPerPixel3 = android.graphics.ImageFormat.getBitsPerPixel(0);
                    byte b68 = (byte) 0;
                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b68, b68, objArr127);
                    d53 = com.facetec.sdk.al.c(jumpTapTimeout2, 708 - resolveOpacity3, bitsPerPixel3 + 23, 936091891, false, (java.lang.String) objArr127[0], null);
                }
                ((java.lang.reflect.Field) d53).set(null, java.lang.Long.valueOf(longValue16 >> 11));
            } catch (java.lang.Exception unused8) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj15 = objArr9[3];
        int i119 = ((int[]) obj15)[0];
        java.lang.Object obj16 = objArr9[1];
        int i120 = ((int[]) obj16)[0];
        if (i120 == i119) {
            int i121 = ((int[]) objArr9[0])[0];
            java.lang.Object[] objArr128 = {new int[1], new int[]{((int[]) obj16)[0]}, (java.lang.String[]) objArr9[2], new int[]{((int[]) obj15)[0]}};
            int myTid5 = android.os.Process.myTid();
            int i122 = i121 + (((-282341255) | myTid5) * (-381)) + 930581706 + (((~((~myTid5) | 774492281)) | (-517844951)) * 381) + 197835374;
            int i123 = (i122 << 13) ^ i122;
            int i124 = i123 ^ (i123 >>> 17);
            ((int[]) objArr128[0])[0] = i124 ^ (i124 << 5);
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.String[] strArr3 = (java.lang.String[]) objArr9[2];
        if (strArr3 != null) {
            p = (l + 33) % 128;
            for (java.lang.String str9 : strArr3) {
                arrayList4.add(str9);
            }
        }
        android.widget.Toast.makeText((android.content.Context) null, i120 / (((i120 - 1) * i120) % 2), 0).show();
        int i125 = ((int[]) objArr9[0])[0];
        java.lang.Object[] objArr129 = {new int[1], new int[]{((int[]) objArr9[1])[0]}, (java.lang.String[]) objArr9[2], new int[]{((int[]) objArr9[3])[0]}};
        int elapsedRealtime5 = (int) android.os.SystemClock.elapsedRealtime();
        int i126 = i125 + ((((~(1516806884 | elapsedRealtime5)) | 76877056) * (-140)) - 265345432) + ((~(1593683940 | elapsedRealtime5)) * 70) + (((~(elapsedRealtime5 | 79015236)) | 1591545760) * 70);
        int i127 = (i126 << 13) ^ i126;
        int i128 = i127 ^ (i127 >>> 17);
        ((int[]) objArr129[0])[0] = i128 ^ (i128 << 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:423:0x020c, code lost:
    
        if ((r0 instanceof android.content.ContextWrapper) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x021f, code lost:
    
        r0 = r0.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x021a, code lost:
    
        if (((android.content.ContextWrapper) r0).getBaseContext() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x021d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0211, code lost:
    
        if ((r0 instanceof android.content.ContextWrapper) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j() {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object[] e$896c745;
        java.lang.Object[] objArr3;
        int i2;
        java.lang.String str3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object[] objArr6;
        int i3;
        java.lang.String str6;
        java.lang.Object[] objArr7;
        java.lang.String str7;
        int i4;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.Object[] objArr8;
        java.lang.Object[] objArr9;
        int i5;
        java.lang.String str10;
        java.lang.Object[] objArr10;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1\ueca9蠜꙽䛂궻ㄌ\ue773뛳䤶\u0bdd\uf1cd럅狺﮽", 23 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr11);
        java.lang.String intern = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        t(15 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3, objArr12);
        java.lang.String intern2 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        q("捣⮼욽㳗첍拔苭\ud8a1ꉹꨒ雧\ue5e9䔗䇘伂\u2fe1昩ᗕᴏ巆ᧀ蘼䨕壕\ue14c盄", 25 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr13);
        java.lang.String intern3 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        q("缋\ue158䗃⬆霒\ue7e9╁＋ढ़ꞷ＝䵭柍呖伂\u2fe1쯩\ud99f", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, objArr14);
        java.lang.String intern4 = ((java.lang.String) objArr14[0]).intern();
        java.lang.Object d2 = com.facetec.sdk.al.d(-2058842632);
        if (d2 == null) {
            char argb = (char) (android.graphics.Color.argb(0, 0, 0, 0) + 26699);
            int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
            int indexOf = android.text.TextUtils.indexOf("", "", 0);
            byte b2 = (byte) 0;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            u((byte) ($$b & 31), b2, b2, objArr15);
            d2 = com.facetec.sdk.al.c(argb, 639 - combineMeasuredStates, indexOf + 23, 581433088, false, (java.lang.String) objArr15[0], null);
        }
        long j2 = ((java.lang.reflect.Field) d2).getLong(null);
        long longValue = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d3 = com.facetec.sdk.al.d(-2055148548);
        if (d3 == null) {
            char keyRepeatTimeout = (char) (26699 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
            float complexToFloat = android.util.TypedValue.complexToFloat(0);
            byte b3 = (byte) 5;
            byte b4 = (byte) (b3 - 5);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            u(b3, b4, b4, objArr16);
            d3 = com.facetec.sdk.al.c(keyRepeatTimeout, 639 - (windowTouchSlop >> 8), 23 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 577736964, false, (java.lang.String) objArr16[0], null);
        }
        if (j2 == ((longValue - ((((java.lang.reflect.Field) d3).getLong(null) << 53) >>> 53)) >> 11)) {
            p = (l + 91) % 128;
            java.lang.Object d4 = com.facetec.sdk.al.d(-2056072069);
            if (d4 == null) {
                char scrollDefaultDelay = (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 26699);
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                byte b5 = (byte) 0;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                u((byte) 6, b5, b5, objArr17);
                d4 = com.facetec.sdk.al.c(scrollDefaultDelay, 639 - capsMode, 24 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 580759171, false, (java.lang.String) objArr17[0], null);
            }
            java.lang.Object[] objArr18 = (java.lang.Object[]) ((java.lang.reflect.Field) d4).get(null);
            objArr2 = new java.lang.Object[]{new int[1], (java.lang.String[]) objArr18[1], new int[]{((int[]) objArr18[2])[0]}, new int[]{((int[]) objArr18[3])[0]}};
            int elapsedCpuTime2 = (int) android.os.Process.getElapsedCpuTime();
            int i6 = ~elapsedCpuTime2;
            int i7 = ((((((~((-174859433) | elapsedCpuTime2)) | (~((-1610629381) | i6))) * 920) - 337192163) + (((~((-243186922) | i6)) | 174859432) * 920)) + ((((~(elapsedCpuTime2 | (-68327490))) | (~(i6 | (-174859433)))) | (~((-1610629381) | elapsedCpuTime2))) * 920)) - 273158070;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr2[0])[0] = i9 ^ (i9 << 5);
            c2 = 2;
        } else {
            android.content.Context context = (android.content.Context) java.lang.Class.forName(intern3).getMethod(intern4, new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                int i10 = p + 81;
                l = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 70 / 0;
                }
            }
            try {
                java.lang.Object[] objArr19 = {context, 0, 0, -273158070};
                short s2 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
                byte[] bArr = $$d;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                v(s2, bArr[8], bArr[235], objArr20);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr20[0]);
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                v((short) 38, bArr[482], bArr[235], objArr21);
                java.lang.Object[] objArr22 = (java.lang.Object[]) cls.getMethod((java.lang.String) objArr21[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr19);
                java.lang.Object d5 = com.facetec.sdk.al.d(-2056072069);
                if (d5 == null) {
                    char deadChar = (char) (26699 - android.view.KeyEvent.getDeadChar(0, 0));
                    int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
                    int indexOf2 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    byte b6 = (byte) 0;
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    u((byte) 6, b6, b6, objArr23);
                    d5 = com.facetec.sdk.al.c(deadChar, 639 - argb2, 22 - indexOf2, 580759171, false, (java.lang.String) objArr23[0], null);
                }
                ((java.lang.reflect.Field) d5).set(null, objArr22);
                try {
                    long longValue2 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d6 = com.facetec.sdk.al.d(-2055148548);
                    if (d6 == null) {
                        char windowTouchSlop2 = (char) (26699 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                        byte b7 = (byte) 5;
                        byte b8 = (byte) (b7 - 5);
                        objArr = objArr22;
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        u(b7, b8, b8, objArr24);
                        d6 = com.facetec.sdk.al.c(windowTouchSlop2, lastIndexOf + 640, bitsPerPixel + 24, 577736964, false, (java.lang.String) objArr24[0], null);
                    } else {
                        objArr = objArr22;
                    }
                    ((java.lang.reflect.Field) d6).set(null, java.lang.Long.valueOf(longValue2));
                    java.lang.Object d7 = com.facetec.sdk.al.d(-2058842632);
                    if (d7 == null) {
                        char packedPositionGroup = (char) (26699 - android.widget.ExpandableListView.getPackedPositionGroup(0L));
                        float maxVolume = android.media.AudioTrack.getMaxVolume();
                        float maxVolume2 = android.media.AudioTrack.getMaxVolume();
                        byte b9 = (byte) 0;
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b9, b9, objArr25);
                        d7 = com.facetec.sdk.al.c(packedPositionGroup, (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 638, 24 - (maxVolume2 > 0.0f ? 1 : (maxVolume2 == 0.0f ? 0 : -1)), 581433088, false, (java.lang.String) objArr25[0], null);
                    }
                    ((java.lang.reflect.Field) d7).set(null, java.lang.Long.valueOf(longValue2 >> 11));
                    objArr2 = objArr;
                    c2 = 2;
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
        java.lang.Object obj = objArr2[c2];
        int i12 = ((int[]) obj)[0];
        java.lang.Object obj2 = objArr2[3];
        if (((int[]) obj2)[0] == i12) {
            p = (l + 65) % 128;
            int i13 = ((int[]) objArr2[0])[0];
            java.lang.Object[] objArr26 = {new int[1], (java.lang.String[]) objArr2[1], new int[]{((int[]) obj)[0]}, new int[]{((int[]) obj2)[0]}};
            int elapsedCpuTime3 = (int) android.os.Process.getElapsedCpuTime();
            int i14 = ~elapsedCpuTime3;
            int i15 = i13 + (((~((-1700432193) | i14)) | 328243541) * 226) + 421584592 + (((~(i14 | (-1682571265))) | (~((-328243542) | elapsedCpuTime3)) | 310382613) * (-113)) + ((~(elapsedCpuTime3 | (-1700432193))) * 113);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr26[0])[0] = i17 ^ (i17 << 5);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr = (java.lang.String[]) objArr2[1];
            if (strArr != null) {
                for (java.lang.String str11 : strArr) {
                    arrayList.add(str11);
                }
            }
            try {
                java.lang.Object[] objArr27 = {java.lang.Long.valueOf((i12 ^ r11) ^ 2830578598493028352L), 659045429L};
                byte[] bArr2 = $$d;
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                v((short) 181, bArr2[77], bArr2[235], objArr28);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                v((short) 93, bArr2[482], bArr2[5], objArr29);
                cls2.getMethod((java.lang.String) objArr29[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr27);
                int i18 = ((int[]) objArr2[0])[0];
                java.lang.Object[] objArr30 = {new int[1], (java.lang.String[]) objArr2[1], new int[]{((int[]) objArr2[2])[0]}, new int[]{((int[]) objArr2[3])[0]}};
                int elapsedCpuTime4 = (int) android.os.Process.getElapsedCpuTime();
                int i19 = ~(670930516 | elapsedCpuTime4);
                int i20 = i18 + (((~((-670930517) | elapsedCpuTime4)) | 15565888 | (~((-1357745218) | elapsedCpuTime4))) * (-880)) + 556925637 + (((~((~elapsedCpuTime4) | (-670930517))) | 1357745217 | i19) * (-880)) + (i19 * 880);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr30[0])[0] = i22 ^ (i22 << 5);
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        java.lang.Object d8 = com.facetec.sdk.al.d(1606058502);
        if (d8 == null) {
            char scrollDefaultDelay2 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
            int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
            int axisFromString = android.view.MotionEvent.axisFromString("");
            byte b10 = (byte) 5;
            byte b11 = (byte) (b10 - 5);
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            u(b10, b11, b11, objArr31);
            d8 = com.facetec.sdk.al.c(scrollDefaultDelay2, (edgeSlop >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 22 - axisFromString, -128583426, false, (java.lang.String) objArr31[0], null);
        }
        long j3 = ((java.lang.reflect.Field) d8).getLong(null);
        long longValue3 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d9 = com.facetec.sdk.al.d(1605134981);
        if (d9 == null) {
            char indexOf3 = (char) android.text.TextUtils.indexOf("", "");
            int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int axisFromString2 = android.view.MotionEvent.axisFromString("");
            byte b12 = (byte) 0;
            str = intern3;
            str2 = intern4;
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            u((byte) 6, b12, b12, objArr32);
            d9 = com.facetec.sdk.al.c(indexOf3, indexOf4 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, axisFromString2 + 24, -129822595, false, (java.lang.String) objArr32[0], null);
        } else {
            str = intern3;
            str2 = intern4;
        }
        if (j3 == ((longValue3 - ((((java.lang.reflect.Field) d9).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d10 = com.facetec.sdk.al.d(1603287939);
            if (d10 == null) {
                char scrollDefaultDelay3 = (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                int blue = android.graphics.Color.blue(0);
                byte b13 = (byte) 0;
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                u((byte) ($$b & 30), b13, b13, objArr33);
                d10 = com.facetec.sdk.al.c(scrollDefaultDelay3, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_VERSION_INFO, 23 - blue, -125877893, false, (java.lang.String) objArr33[0], null);
            }
            java.lang.Object[] objArr34 = (java.lang.Object[]) ((java.lang.reflect.Field) d10).get(null);
            e$896c745 = new java.lang.Object[]{(java.lang.String[]) objArr34[0], new int[1], new int[]{((int[]) objArr34[2])[0]}, new int[]{((int[]) objArr34[3])[0]}};
            int elapsedCpuTime5 = (int) android.os.Process.getElapsedCpuTime();
            int i23 = ((((((~(1345958335 | elapsedCpuTime5)) | 150016) * (-140)) - 526247779) + ((~(1346108351 | elapsedCpuTime5)) * 70)) + (((~(elapsedCpuTime5 | 272259624)) | 1073998743) * 70)) - 1366647372;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) e$896c745[1])[0] = i25 ^ (i25 << 5);
        } else {
            try {
                java.lang.Object[] objArr35 = {1873358819};
                java.lang.Object d11 = com.facetec.sdk.al.d(-583417224);
                if (d11 == null) {
                    d11 = com.facetec.sdk.al.c((char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getTapTimeout() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, 23 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2060892288, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                e$896c745 = com.facetec.sdk.et.e$896c745(((java.lang.reflect.Constructor) d11).newInstance(objArr35));
                java.lang.Object d12 = com.facetec.sdk.al.d(1603287939);
                if (d12 == null) {
                    char maximumFlingVelocity = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int alpha = android.graphics.Color.alpha(0);
                    int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
                    byte b14 = (byte) 0;
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b14, b14, objArr36);
                    d12 = com.facetec.sdk.al.c(maximumFlingVelocity, alpha + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, 22 - bitsPerPixel2, -125877893, false, (java.lang.String) objArr36[0], null);
                }
                ((java.lang.reflect.Field) d12).set(null, e$896c745);
                try {
                    long longValue4 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d13 = com.facetec.sdk.al.d(1605134981);
                    if (d13 == null) {
                        char rgb = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                        int indexOf5 = android.text.TextUtils.indexOf("", "");
                        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                        byte b15 = (byte) 0;
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        u((byte) 6, b15, b15, objArr37);
                        d13 = com.facetec.sdk.al.c(rgb, 1058 - indexOf5, 22 - (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)), -129822595, false, (java.lang.String) objArr37[0], null);
                    }
                    ((java.lang.reflect.Field) d13).set(null, java.lang.Long.valueOf(longValue4));
                    java.lang.Object d14 = com.facetec.sdk.al.d(1606058502);
                    if (d14 == null) {
                        char offsetAfter = (char) android.text.TextUtils.getOffsetAfter("", 0);
                        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                        int indexOf6 = android.text.TextUtils.indexOf("", "", 0, 0);
                        byte b16 = (byte) 5;
                        byte b17 = (byte) (b16 - 5);
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        u(b16, b17, b17, objArr38);
                        d14 = com.facetec.sdk.al.c(offsetAfter, 1058 - (keyRepeatDelay >> 16), 23 - indexOf6, -128583426, false, (java.lang.String) objArr38[0], null);
                    }
                    ((java.lang.reflect.Field) d14).set(null, java.lang.Long.valueOf(longValue4 >> 11));
                } catch (java.lang.Exception unused2) {
                    throw new java.lang.RuntimeException();
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        java.lang.Object obj3 = e$896c745[2];
        int i26 = ((int[]) obj3)[0];
        java.lang.Object obj4 = e$896c745[3];
        if (((int[]) obj4)[0] == i26) {
            int i27 = ((int[]) e$896c745[1])[0];
            java.lang.Object[] objArr39 = {(java.lang.String[]) e$896c745[0], new int[1], new int[]{((int[]) obj3)[0]}, new int[]{((int[]) obj4)[0]}};
            int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
            int i28 = i27 + (((~(1064564663 | uptimeMillis)) | 553653296) * (-756)) + 1916281147 + (((~uptimeMillis) | 1064564663) * 756);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr39[1])[0] = i30 ^ (i30 << 5);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) e$896c745[0];
            if (strArr2 != null) {
                for (java.lang.String str12 : strArr2) {
                    arrayList2.add(str12);
                }
            }
            java.lang.Object[] objArr40 = {java.lang.Long.valueOf((i26 ^ r8) ^ 4733028031474434048L), 1101993961L};
            short s3 = (short) ($$e - 1);
            byte[] bArr3 = $$d;
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            v(s3, bArr3[77], bArr3[235], objArr41);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr41[0]);
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            v((short) (-bArr3[443]), bArr3[482], bArr3[77], objArr42);
            cls3.getMethod((java.lang.String) objArr42[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr40);
            int i31 = ((int[]) e$896c745[1])[0];
            java.lang.Object[] objArr43 = {(java.lang.String[]) e$896c745[0], new int[1], new int[]{((int[]) e$896c745[2])[0]}, new int[]{((int[]) e$896c745[3])[0]}};
            int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
            int i32 = i31 + (((~((~freeMemory) | 1609557991)) * (-116)) - 1411471557) + ((49096678 | freeMemory) * 116) + (((~(freeMemory | (-1569121282))) | 8659968) * 116);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr43[1])[0] = i34 ^ (i34 << 5);
        }
        java.lang.Object d15 = com.facetec.sdk.al.d(-1876633077);
        if (d15 == null) {
            char c3 = (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1536);
            int indexOf7 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
            byte b18 = (byte) 0;
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            u((byte) ($$b & 30), b18, b18, objArr44);
            d15 = com.facetec.sdk.al.c(c3, 707 - indexOf7, (minimumFlingVelocity >> 16) + 22, 936091891, false, (java.lang.String) objArr44[0], null);
        }
        long j4 = ((java.lang.reflect.Field) d15).getLong(null);
        long longValue5 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d16 = com.facetec.sdk.al.d(-1877556598);
        if (d16 == null) {
            char touchSlop = (char) (1537 - (android.view.ViewConfiguration.getTouchSlop() >> 8));
            int capsMode2 = android.text.TextUtils.getCapsMode("", 0, 0);
            int myTid = android.os.Process.myTid();
            byte b19 = (byte) 0;
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            u((byte) ($$b & 31), b19, b19, objArr45);
            d16 = com.facetec.sdk.al.c(touchSlop, capsMode2 + 708, (myTid >> 22) + 22, 939112562, false, (java.lang.String) objArr45[0], null);
        }
        if (j4 == ((longValue5 - ((((java.lang.reflect.Field) d16).getLong(null) << 53) >>> 53)) >> 11)) {
            p = (l + 39) % 128;
            java.lang.Object d17 = com.facetec.sdk.al.d(-1874786035);
            if (d17 == null) {
                char c4 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1536);
                int axisFromString3 = android.view.MotionEvent.axisFromString("");
                int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                byte b20 = (byte) 0;
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                u((byte) 6, b20, b20, objArr46);
                d17 = com.facetec.sdk.al.c(c4, axisFromString3 + 709, 22 - normalizeMetaState, 934179829, false, (java.lang.String) objArr46[0], null);
            }
            java.lang.Object[] objArr47 = (java.lang.Object[]) ((java.lang.reflect.Field) d17).get(null);
            objArr3 = new java.lang.Object[]{new int[1], new int[]{((int[]) objArr47[1])[0]}, (java.lang.String[]) objArr47[2], new int[]{((int[]) objArr47[3])[0]}};
            int nextInt = new java.util.Random().nextInt();
            int i35 = ~(1433418799 | (~nextInt));
            int i36 = (((((((~(r4 | (-1433418800))) | ((~((-162403322) | r4)) | 18878505)) | (~(1576943615 | nextInt))) * (-84)) - 1794073272) + ((((~(nextInt | (-1433418800))) | 162403321) | i35) * (-84))) + (((-1576943616) | i35) * 84)) - 244448288;
            int i37 = (i36 << 13) ^ i36;
            int i38 = i37 ^ (i37 >>> 17);
            ((int[]) objArr3[0])[0] = i38 ^ (i38 << 5);
        } else {
            java.lang.Object[] objArr48 = {0, 0, -244448288};
            java.lang.Object d18 = com.facetec.sdk.al.d(1329445289);
            if (d18 == null) {
                char jumpTapTimeout = (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1537);
                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                int green = android.graphics.Color.green(0);
                byte b21 = (byte) 0;
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                u((byte) 6, b21, b21, objArr49);
                d18 = com.facetec.sdk.al.c(jumpTapTimeout, (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, green + 22, -388840623, false, (java.lang.String) objArr49[0], new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            objArr3 = (java.lang.Object[]) ((java.lang.reflect.Method) d18).invoke(null, objArr48);
            java.lang.Object d19 = com.facetec.sdk.al.d(-1874786035);
            if (d19 == null) {
                char rgb2 = (char) (android.graphics.Color.rgb(0, 0, 0) + 16778753);
                int indexOf8 = android.text.TextUtils.indexOf("", "", 0);
                int scrollDefaultDelay4 = android.view.ViewConfiguration.getScrollDefaultDelay();
                byte b22 = (byte) 0;
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                u((byte) 6, b22, b22, objArr50);
                d19 = com.facetec.sdk.al.c(rgb2, indexOf8 + 708, 22 - (scrollDefaultDelay4 >> 16), 934179829, false, (java.lang.String) objArr50[0], null);
            }
            ((java.lang.reflect.Field) d19).set(null, objArr3);
            try {
                long longValue6 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d20 = com.facetec.sdk.al.d(-1877556598);
                if (d20 == null) {
                    char red = (char) (android.graphics.Color.red(0) + 1537);
                    float complexToFloat2 = android.util.TypedValue.complexToFloat(0);
                    int windowTouchSlop3 = android.view.ViewConfiguration.getWindowTouchSlop();
                    byte b23 = (byte) 0;
                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                    u((byte) ($$b & 31), b23, b23, objArr51);
                    d20 = com.facetec.sdk.al.c(red, (complexToFloat2 > 0.0f ? 1 : (complexToFloat2 == 0.0f ? 0 : -1)) + 708, (windowTouchSlop3 >> 8) + 22, 939112562, false, (java.lang.String) objArr51[0], null);
                }
                ((java.lang.reflect.Field) d20).set(null, java.lang.Long.valueOf(longValue6));
                java.lang.Object d21 = com.facetec.sdk.al.d(-1876633077);
                if (d21 == null) {
                    char longPressTimeout = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1537);
                    int jumpTapTimeout2 = android.view.ViewConfiguration.getJumpTapTimeout();
                    int defaultSize = android.view.View.getDefaultSize(0, 0);
                    byte b24 = (byte) 0;
                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b24, b24, objArr52);
                    d21 = com.facetec.sdk.al.c(longPressTimeout, (jumpTapTimeout2 >> 16) + 708, 22 - defaultSize, 936091891, false, (java.lang.String) objArr52[0], null);
                }
                ((java.lang.reflect.Field) d21).set(null, java.lang.Long.valueOf(longValue6 >> 11));
            } catch (java.lang.Exception unused3) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj5 = objArr3[3];
        int i39 = ((int[]) obj5)[0];
        java.lang.Object obj6 = objArr3[1];
        int i40 = ((int[]) obj6)[0];
        if (i40 == i39) {
            int i41 = ((int[]) objArr3[0])[0];
            java.lang.Object[] objArr53 = {new int[1], new int[]{((int[]) obj6)[0]}, (java.lang.String[]) objArr3[2], new int[]{((int[]) obj5)[0]}};
            int uptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
            int i42 = ~uptimeMillis2;
            int i43 = i41 + (((~((-650267325) | i42)) | 109202064) * 98) + 1381678556 + (((~(i42 | (-945554797))) | (-650267325) | (~(945554796 | uptimeMillis2))) * (-49)) + (((~(uptimeMillis2 | (-650267325))) | (-1054756861)) * 49);
            int i44 = (i43 << 13) ^ i43;
            int i45 = i44 ^ (i44 >>> 17);
            i2 = 0;
            ((int[]) objArr53[0])[0] = i45 ^ (i45 << 5);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.String[] strArr3 = (java.lang.String[]) objArr3[2];
            if (strArr3 != null) {
                for (java.lang.String str13 : strArr3) {
                    arrayList3.add(str13);
                }
            }
            android.widget.Toast.makeText((android.content.Context) null, i40 / (((i40 - 1) * i40) % 2), 0).show();
            int i46 = ((int[]) objArr3[0])[0];
            java.lang.Object[] objArr54 = {new int[1], new int[]{((int[]) objArr3[1])[0]}, (java.lang.String[]) objArr3[2], new int[]{((int[]) objArr3[3])[0]}};
            int nextInt2 = new java.util.Random().nextInt();
            int i47 = ~nextInt2;
            int i48 = i46 + ((((~((-52437077) | nextInt2)) | (~((-1342703617) | i47))) * 920) - 1976680344) + (((~((-200681429) | i47)) | 52437076) * 920) + (((~(nextInt2 | (-148244353))) | (~(i47 | (-52437077))) | (~((-1342703617) | nextInt2))) * 920);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            i2 = 0;
            ((int[]) objArr54[0])[0] = i50 ^ (i50 << 5);
        }
        java.lang.Object d22 = com.facetec.sdk.al.d(-1672709414);
        if (d22 == null) {
            char c5 = (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
            int resolveSize = android.view.View.resolveSize(i2, i2);
            byte b25 = (byte) i2;
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            u((byte) ($$b & 30), b25, b25, objArr55);
            d22 = com.facetec.sdk.al.c(c5, 1436 - (minimumFlingVelocity2 >> 16), resolveSize + 23, 1000538146, false, (java.lang.String) objArr55[i2], null);
        }
        long j5 = ((java.lang.reflect.Field) d22).getLong(null);
        long longValue7 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d23 = com.facetec.sdk.al.d(-1669938851);
        if (d23 == null) {
            char red2 = (char) android.graphics.Color.red(0);
            int lastIndexOf2 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int indexOf9 = android.text.TextUtils.indexOf("", "", 0, 0);
            byte b26 = (byte) 5;
            byte b27 = (byte) (b26 - 5);
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            u(b26, b27, b27, objArr56);
            d23 = com.facetec.sdk.al.c(red2, 1435 - lastIndexOf2, 23 - indexOf9, 999930789, false, (java.lang.String) objArr56[0], null);
        }
        if (j5 == ((longValue7 - ((((java.lang.reflect.Field) d23).getLong(null) << 53) >>> 53)) >> 11)) {
            l = (p + 111) % 128;
            java.lang.Object d24 = com.facetec.sdk.al.d(-1670862372);
            if (d24 == null) {
                char keyCodeFromString = (char) android.view.KeyEvent.keyCodeFromString("");
                int red3 = android.graphics.Color.red(0);
                int windowTouchSlop4 = android.view.ViewConfiguration.getWindowTouchSlop();
                byte b28 = (byte) 0;
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                u((byte) 6, b28, b28, objArr57);
                d24 = com.facetec.sdk.al.c(keyCodeFromString, red3 + 1436, 23 - (windowTouchSlop4 >> 8), 998757156, false, (java.lang.String) objArr57[0], null);
            }
            java.lang.Object[] objArr58 = (java.lang.Object[]) ((java.lang.reflect.Field) d24).get(null);
            objArr5 = new java.lang.Object[]{(java.lang.String) objArr58[0], new int[]{((int[]) objArr58[1])[0]}, new int[]{((int[]) objArr58[2])[0]}, new int[1], (java.lang.String) objArr58[4]};
            int myPid = android.os.Process.myPid();
            int i51 = ~myPid;
            int i52 = ((((((~(263684846 | i51)) | 4750609) * (-108)) + 700433999) + (((~(i51 | 57180159)) | ((~((-57180160) | myPid)) | 211255296)) * 54)) + ((myPid | 211255296) * 54)) - 1234198742;
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr5[3])[0] = i54 ^ (i54 << 5);
            str3 = str2;
        } else {
            str3 = str2;
            android.content.Context context2 = (android.content.Context) java.lang.Class.forName(str).getMethod(str3, new java.lang.Class[0]).invoke(null, null);
            if (context2 != null) {
                context2 = ((context2 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context2).getBaseContext() == null) ? null : context2.getApplicationContext();
            }
            short s4 = (short) ($$e | 16);
            byte[] bArr4 = $$d;
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            v(s4, bArr4[77], bArr4[235], objArr59);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr59[0]);
            int i55 = bArr4[8] - 1;
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            v((short) i55, bArr4[482], (byte) i55, objArr60);
            java.lang.Object[] objArr61 = (java.lang.Object[]) cls4.getMethod((java.lang.String) objArr60[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context2, 0, 0, -1234198742);
            if (context2 != null) {
                java.lang.Object d25 = com.facetec.sdk.al.d(-1670862372);
                if (d25 == null) {
                    char indexOf10 = (char) android.text.TextUtils.indexOf("", "", 0);
                    int longPressTimeout2 = android.view.ViewConfiguration.getLongPressTimeout();
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b29 = (byte) 0;
                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                    u((byte) 6, b29, b29, objArr62);
                    d25 = com.facetec.sdk.al.c(indexOf10, (longPressTimeout2 >> 16) + 1436, makeMeasureSpec + 23, 998757156, false, (java.lang.String) objArr62[0], null);
                }
                ((java.lang.reflect.Field) d25).set(null, objArr61);
                try {
                    long longValue8 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d26 = com.facetec.sdk.al.d(-1669938851);
                    if (d26 == null) {
                        char size = (char) android.view.View.MeasureSpec.getSize(0);
                        int blue2 = android.graphics.Color.blue(0);
                        int lastIndexOf3 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                        byte b30 = (byte) 5;
                        byte b31 = (byte) (b30 - 5);
                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                        u(b30, b31, b31, objArr63);
                        d26 = com.facetec.sdk.al.c(size, 1436 - blue2, 22 - lastIndexOf3, 999930789, false, (java.lang.String) objArr63[0], null);
                    }
                    ((java.lang.reflect.Field) d26).set(null, java.lang.Long.valueOf(longValue8));
                    java.lang.Object d27 = com.facetec.sdk.al.d(-1672709414);
                    if (d27 == null) {
                        char bitsPerPixel3 = (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1);
                        int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
                        byte b32 = (byte) 0;
                        objArr4 = objArr61;
                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                        u((byte) ($$b & 30), b32, b32, objArr64);
                        d27 = com.facetec.sdk.al.c(bitsPerPixel3, packedPositionType + 1436, 24 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), 1000538146, false, (java.lang.String) objArr64[0], null);
                    } else {
                        objArr4 = objArr61;
                    }
                    ((java.lang.reflect.Field) d27).set(null, java.lang.Long.valueOf(longValue8 >> 11));
                } catch (java.lang.Exception unused4) {
                    throw new java.lang.RuntimeException();
                }
            } else {
                objArr4 = objArr61;
            }
            objArr5 = objArr4;
        }
        java.lang.Object obj7 = objArr5[1];
        int i56 = ((int[]) obj7)[0];
        java.lang.Object obj8 = objArr5[2];
        if (((int[]) obj8)[0] == i56) {
            int i57 = ((int[]) objArr5[3])[0];
            java.lang.Object[] objArr65 = {(java.lang.String) objArr5[0], new int[]{((int[]) obj7)[0]}, new int[]{((int[]) obj8)[0]}, new int[1], (java.lang.String) objArr5[4]};
            int myUid = android.os.Process.myUid();
            int i58 = i57 + ((((~((~myUid) | (-406603915))) | (-85738909)) * (-235)) - 259077283) + (((~((-406603915) | myUid)) | (-85738909)) * (-470)) + (((~(myUid | (-1851529))) | (-490491295)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
            int i59 = i58 ^ (i58 << 13);
            int i60 = i59 ^ (i59 >>> 17);
            ((int[]) objArr65[3])[0] = i60 ^ (i60 << 5);
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add((java.lang.String) objArr5[4]);
            arrayList4.add((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr66 = {java.lang.Long.valueOf((i56 ^ r10) ^ 4969501148311453696L), 1157052119L};
            byte[] bArr5 = $$d;
            java.lang.Object[] objArr67 = new java.lang.Object[1];
            v((short) 145, bArr5[77], bArr5[235], objArr67);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr67[0]);
            java.lang.Object[] objArr68 = new java.lang.Object[1];
            v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr5[482], bArr5[8], objArr68);
            cls5.getMethod((java.lang.String) objArr68[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr66);
            int i61 = ((int[]) objArr5[3])[0];
            java.lang.Object[] objArr69 = {(java.lang.String) objArr5[0], new int[]{((int[]) objArr5[1])[0]}, new int[]{((int[]) objArr5[2])[0]}, new int[1], (java.lang.String) objArr5[4]};
            int i62 = ~((int) android.os.Process.getElapsedCpuTime());
            int i63 = i61 + ((~(i62 | (-19))) * 52) + 1278590985 + (((~(522903461 | i62)) | (~(202038455 | i62)) | (-522903480)) * (-52)) + (((~(i62 | (-522903462))) | 202038437) * 52);
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr69[3])[0] = i65 ^ (i65 << 5);
        }
        java.lang.Object d28 = com.facetec.sdk.al.d(-1269752171);
        if (d28 == null) {
            char pressedStateDuration = (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
            float length = android.graphics.PointF.length(0.0f, 0.0f);
            float length2 = android.graphics.PointF.length(0.0f, 0.0f);
            byte b33 = (byte) 0;
            java.lang.Object[] objArr70 = new java.lang.Object[1];
            u((byte) ($$b & 31), b33, b33, objArr70);
            d28 = com.facetec.sdk.al.c(pressedStateDuration, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 567, (length2 > 0.0f ? 1 : (length2 == 0.0f ? 0 : -1)) + 24, 331244653, false, (java.lang.String) objArr70[0], null);
        }
        long j6 = ((java.lang.reflect.Field) d28).getLong(null);
        long longValue9 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(intern2, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d29 = com.facetec.sdk.al.d(-1267905129);
        if (d29 == null) {
            char threadPriority = (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6);
            int lastIndexOf4 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            int lastIndexOf5 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            byte b34 = (byte) 0;
            str4 = intern2;
            java.lang.Object[] objArr71 = new java.lang.Object[1];
            u((byte) 7, b34, b34, objArr71);
            d29 = com.facetec.sdk.al.c(threadPriority, lastIndexOf4 + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, lastIndexOf5 + 25, 327300975, false, (java.lang.String) objArr71[0], null);
        } else {
            str4 = intern2;
        }
        if (j6 == ((longValue9 - ((((java.lang.reflect.Field) d29).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d30 = com.facetec.sdk.al.d(-1268828650);
            if (d30 == null) {
                char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                int rgb3 = android.graphics.Color.rgb(0, 0, 0);
                int argb3 = android.graphics.Color.argb(0, 0, 0, 0);
                byte b35 = (byte) 0;
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                u((byte) ($$b & 30), b35, b35, objArr72);
                d30 = com.facetec.sdk.al.c(scrollBarSize, rgb3 + 16777783, argb3 + 24, 330321134, false, (java.lang.String) objArr72[0], null);
            }
            java.lang.Object[] objArr73 = (java.lang.Object[]) ((java.lang.reflect.Field) d30).get(null);
            objArr6 = new java.lang.Object[]{(java.lang.String) objArr73[0], new int[]{((int[]) objArr73[1])[0]}, new int[]{((int[]) objArr73[2])[0]}, new int[1]};
            int i66 = ~(((int) android.os.SystemClock.uptimeMillis()) | 1011250107);
            int i67 = (((((-928579437) | i66) * (-658)) - 795516743) + ((i66 | (-1063190528)) * 658)) - 1357746924;
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            ((int[]) objArr6[3])[0] = i69 ^ (i69 << 5);
            str5 = str4;
        } else {
            android.content.Context context3 = (android.content.Context) java.lang.Class.forName(str).getMethod(str3, new java.lang.Class[0]).invoke(null, null);
            if (context3 != null) {
                if (context3 instanceof android.content.ContextWrapper) {
                    p = (l + 11) % 128;
                    if (((android.content.ContextWrapper) context3).getBaseContext() == null) {
                        context3 = null;
                    }
                }
                context3 = context3.getApplicationContext();
            }
            short s5 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
            byte[] bArr6 = $$d;
            java.lang.Object[] objArr74 = new java.lang.Object[1];
            v(s5, (byte) (bArr6[8] - 1), bArr6[235], objArr74);
            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr74[0]);
            int i70 = bArr6[8] - 1;
            java.lang.Object[] objArr75 = new java.lang.Object[1];
            v((short) i70, bArr6[482], (byte) i70, objArr75);
            java.lang.Object[] objArr76 = (java.lang.Object[]) cls6.getMethod((java.lang.String) objArr75[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context3, 0, 0, -1357746924);
            if (context3 != null) {
                java.lang.Object d31 = com.facetec.sdk.al.d(-1268828650);
                if (d31 == null) {
                    char indexOf11 = (char) android.text.TextUtils.indexOf("", "");
                    long elapsedCpuTime6 = android.os.Process.getElapsedCpuTime();
                    int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                    byte b36 = (byte) 0;
                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                    u((byte) ($$b & 30), b36, b36, objArr77);
                    d31 = com.facetec.sdk.al.c(indexOf11, (elapsedCpuTime6 > 0L ? 1 : (elapsedCpuTime6 == 0L ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST, 24 - offsetAfter2, 330321134, false, (java.lang.String) objArr77[0], null);
                }
                ((java.lang.reflect.Field) d31).set(null, objArr76);
                try {
                    str5 = str4;
                    long longValue10 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d32 = com.facetec.sdk.al.d(-1267905129);
                    if (d32 == null) {
                        char absoluteGravity = (char) android.view.Gravity.getAbsoluteGravity(0, 0);
                        int bitsPerPixel4 = android.graphics.ImageFormat.getBitsPerPixel(0);
                        int scrollDefaultDelay5 = android.view.ViewConfiguration.getScrollDefaultDelay();
                        byte b37 = (byte) 0;
                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                        u((byte) 7, b37, b37, objArr78);
                        d32 = com.facetec.sdk.al.c(absoluteGravity, 566 - bitsPerPixel4, 24 - (scrollDefaultDelay5 >> 16), 327300975, false, (java.lang.String) objArr78[0], null);
                    }
                    ((java.lang.reflect.Field) d32).set(null, java.lang.Long.valueOf(longValue10));
                    java.lang.Object d33 = com.facetec.sdk.al.d(-1269752171);
                    if (d33 == null) {
                        char c6 = (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int jumpTapTimeout3 = android.view.ViewConfiguration.getJumpTapTimeout();
                        int red4 = android.graphics.Color.red(0);
                        byte b38 = (byte) 0;
                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b38, b38, objArr79);
                        d33 = com.facetec.sdk.al.c(c6, (jumpTapTimeout3 >> 16) + 567, red4 + 24, 331244653, false, (java.lang.String) objArr79[0], null);
                    }
                    ((java.lang.reflect.Field) d33).set(null, java.lang.Long.valueOf(longValue10 >> 11));
                } catch (java.lang.Exception unused5) {
                    throw new java.lang.RuntimeException();
                }
            } else {
                str5 = str4;
            }
            objArr6 = objArr76;
        }
        java.lang.Object obj9 = objArr6[2];
        int i71 = ((int[]) obj9)[0];
        java.lang.Object obj10 = objArr6[1];
        if (((int[]) obj10)[0] == i71) {
            int i72 = ((int[]) objArr6[3])[0];
            java.lang.Object[] objArr80 = {(java.lang.String) objArr6[0], new int[]{((int[]) obj10)[0]}, new int[]{((int[]) obj9)[0]}, new int[1]};
            int i73 = ~((int) java.lang.Runtime.getRuntime().freeMemory());
            int i74 = i72 + ((~(748150459 | i73)) * 52) + 297433175 + (((~(747801257 | i73)) | (~((-76897339) | i73)) | 349202) * (-52)) + (((~(i73 | (-747801258))) | 671253121) * 52);
            int i75 = (i74 << 13) ^ i74;
            int i76 = i75 ^ (i75 >>> 17);
            i3 = 0;
            ((int[]) objArr80[3])[0] = i76 ^ (i76 << 5);
        } else {
            android.content.Context context4 = (android.content.Context) java.lang.Class.forName(str).getMethod(str3, new java.lang.Class[0]).invoke(null, null);
            if (context4 != null) {
                context4 = ((context4 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context4).getBaseContext() == null) ? null : context4.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                int i77 = p + 85;
                l = i77 % 128;
                if (i77 % 2 != 0) {
                    int i78 = 5 / 0;
                }
                context4 = null;
            }
            java.lang.Object[] objArr81 = {context4, java.lang.Long.valueOf((i71 ^ r11) ^ 6265773663232983040L), 1458864119L};
            short s6 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
            byte[] bArr7 = $$d;
            java.lang.Object[] objArr82 = new java.lang.Object[1];
            v(s6, bArr7[8], bArr7[235], objArr82);
            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr82[0]);
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr7[482], bArr7[8], objArr83);
            cls7.getMethod((java.lang.String) objArr83[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr81);
            int i79 = ((int[]) objArr6[3])[0];
            java.lang.Object[] objArr84 = {(java.lang.String) objArr6[0], new int[]{((int[]) objArr6[1])[0]}, new int[]{((int[]) objArr6[2])[0]}, new int[1]};
            int i80 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i81 = i79 + ((~((-559645) | i80)) * (-301)) + 1084831420 + (((~(1019423 | i80)) | (~((~i80) | 825718019))) * (-301)) + (((~(i80 | (-825718020))) | 1019423) * 301);
            int i82 = (i81 << 13) ^ i81;
            int i83 = i82 ^ (i82 >>> 17);
            i3 = 0;
            ((int[]) objArr84[3])[0] = i83 ^ (i83 << 5);
            p = (l + 93) % 128;
        }
        java.lang.Object d34 = com.facetec.sdk.al.d(-1265134566);
        if (d34 == null) {
            char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(i3, i3, i3);
            float complexToFraction = android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f);
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            byte length3 = (byte) $$a.length;
            byte b39 = (byte) (length3 - 4);
            java.lang.Object[] objArr85 = new java.lang.Object[1];
            u(length3, b39, b39, objArr85);
            d34 = com.facetec.sdk.al.c(resolveSizeAndState, 567 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 23, 326692578, false, (java.lang.String) objArr85[0], null);
        }
        long j7 = ((java.lang.reflect.Field) d34).getLong(null);
        long longValue11 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d35 = com.facetec.sdk.al.d(-1261440482);
        if (d35 == null) {
            char keyRepeatDelay2 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
            int defaultSize2 = android.view.View.getDefaultSize(0, 0);
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            byte b40 = (byte) 0;
            byte b41 = b40;
            str6 = str3;
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            u(b40, b41, b41, objArr86);
            d35 = com.facetec.sdk.al.c(keyRepeatDelay2, 567 - defaultSize2, (doubleTapTimeout >> 16) + 24, 320899302, false, (java.lang.String) objArr86[0], null);
        } else {
            str6 = str3;
        }
        if (j7 == ((longValue11 - ((((java.lang.reflect.Field) d35).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d36 = com.facetec.sdk.al.d(-1262364003);
            if (d36 == null) {
                char scrollBarSize2 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                int trimmedLength = android.text.TextUtils.getTrimmedLength("");
                float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
                byte b42 = (byte) ($$b & 7);
                byte b43 = (byte) (b42 - 1);
                java.lang.Object[] objArr87 = new java.lang.Object[1];
                u(b42, b43, b43, objArr87);
                d36 = com.facetec.sdk.al.c(scrollBarSize2, 567 - trimmedLength, (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)) + 23, 321822821, false, (java.lang.String) objArr87[0], null);
            }
            java.lang.Object[] objArr88 = (java.lang.Object[]) ((java.lang.reflect.Field) d36).get(null);
            objArr7 = new java.lang.Object[]{(java.lang.String) objArr88[0], new int[]{((int[]) objArr88[1])[0]}, new int[]{((int[]) objArr88[2])[0]}, new int[1]};
            int i84 = ~((int) android.os.SystemClock.elapsedRealtime());
            int i85 = ((((~((-604242449) | i84)) | (~((-148083852) | i84))) * (-184)) - 595987525) + (((~(i84 | (-640428597))) | (~((-184270000) | i84)) | 36186148) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 37205916;
            int i86 = (i85 << 13) ^ i85;
            int i87 = i86 ^ (i86 >>> 17);
            ((int[]) objArr7[3])[0] = i87 ^ (i87 << 5);
        } else {
            short s7 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE;
            byte[] bArr8 = $$d;
            java.lang.Object[] objArr89 = new java.lang.Object[1];
            v(s7, bArr8[8], bArr8[235], objArr89);
            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr89[0]);
            java.lang.Object[] objArr90 = new java.lang.Object[1];
            v((short) 93, bArr8[482], bArr8[5], objArr90);
            objArr7 = (java.lang.Object[]) cls8.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, 0, 979803732);
            java.lang.Object d37 = com.facetec.sdk.al.d(-1262364003);
            if (d37 == null) {
                char rgb4 = (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216);
                int capsMode3 = android.text.TextUtils.getCapsMode("", 0, 0);
                int rgb5 = android.graphics.Color.rgb(0, 0, 0);
                byte b44 = (byte) ($$b & 7);
                byte b45 = (byte) (b44 - 1);
                java.lang.Object[] objArr91 = new java.lang.Object[1];
                u(b44, b45, b45, objArr91);
                d37 = com.facetec.sdk.al.c(rgb4, 567 - capsMode3, rgb5 + 16777240, 321822821, false, (java.lang.String) objArr91[0], null);
            }
            ((java.lang.reflect.Field) d37).set(null, objArr7);
            try {
                long longValue12 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                java.lang.Object d38 = com.facetec.sdk.al.d(-1261440482);
                if (d38 == null) {
                    char c7 = (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                    int packedPositionGroup2 = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int gidForName = android.os.Process.getGidForName("");
                    byte b46 = (byte) 0;
                    byte b47 = b46;
                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                    u(b46, b47, b47, objArr92);
                    d38 = com.facetec.sdk.al.c(c7, packedPositionGroup2 + 567, 23 - gidForName, 320899302, false, (java.lang.String) objArr92[0], null);
                }
                ((java.lang.reflect.Field) d38).set(null, java.lang.Long.valueOf(longValue12));
                java.lang.Object d39 = com.facetec.sdk.al.d(-1265134566);
                if (d39 == null) {
                    char scrollBarFadeDuration = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int defaultSize3 = android.view.View.getDefaultSize(0, 0);
                    long packedPositionForChild2 = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                    byte length4 = (byte) $$a.length;
                    byte b48 = (byte) (length4 - 4);
                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                    u(length4, b48, b48, objArr93);
                    d39 = com.facetec.sdk.al.c(scrollBarFadeDuration, defaultSize3 + 567, (packedPositionForChild2 > 0L ? 1 : (packedPositionForChild2 == 0L ? 0 : -1)) + 25, 326692578, false, (java.lang.String) objArr93[0], null);
                }
                ((java.lang.reflect.Field) d39).set(null, java.lang.Long.valueOf(longValue12 >> 11));
            } catch (java.lang.Exception unused6) {
                throw new java.lang.RuntimeException();
            }
        }
        java.lang.Object obj11 = objArr7[2];
        int i88 = ((int[]) obj11)[0];
        java.lang.Object obj12 = objArr7[1];
        if (((int[]) obj12)[0] == i88) {
            int i89 = ((int[]) objArr7[3])[0];
            java.lang.Object[] objArr94 = {(java.lang.String) objArr7[0], new int[]{((int[]) obj12)[0]}, new int[]{((int[]) obj11)[0]}, new int[1]};
            int myTid2 = android.os.Process.myTid();
            int i90 = i89 + (((~(686835990 | r4)) * (-560)) - 1657718989) + ((~(myTid2 | (-496842))) * (-560)) + (((~(137862605 | (~myTid2))) | 549470226) * 560);
            int i91 = (i90 << 13) ^ i90;
            int i92 = i91 ^ (i91 >>> 17);
            ((int[]) objArr94[3])[0] = i92 ^ (i92 << 5);
            i4 = 0;
            str7 = str6;
        } else {
            new java.util.ArrayList().add((java.lang.String) objArr7[0]);
            str7 = str6;
            android.content.Context context5 = (android.content.Context) java.lang.Class.forName(str).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context5 != null) {
                context5 = ((context5 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context5).getBaseContext() == null) ? null : context5.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                context5 = null;
            }
            java.lang.Object[] objArr95 = {context5, java.lang.Long.valueOf((i88 ^ r10) ^ 2570853138600820736L), 598573407L};
            short s8 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE;
            byte[] bArr9 = $$d;
            java.lang.Object[] objArr96 = new java.lang.Object[1];
            v(s8, bArr9[8], bArr9[235], objArr96);
            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr96[0]);
            java.lang.Object[] objArr97 = new java.lang.Object[1];
            v((short) 93, bArr9[482], bArr9[5], objArr97);
            cls9.getMethod((java.lang.String) objArr97[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr95);
            int i93 = ((int[]) objArr7[3])[0];
            java.lang.Object[] objArr98 = {(java.lang.String) objArr7[0], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, new int[1]};
            int elapsedCpuTime7 = (int) android.os.Process.getElapsedCpuTime();
            int i94 = i93 + ((((~((-19401477) | (~elapsedCpuTime7))) | (~(805297119 | elapsedCpuTime7))) * (-272)) - 882006221) + (((~((-132881357) | elapsedCpuTime7)) | 113479880) * (-272)) + (((~(elapsedCpuTime7 | 132881356)) | 691817239) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
            int i95 = (i94 << 13) ^ i94;
            int i96 = i95 ^ (i95 >>> 17);
            i4 = 0;
            ((int[]) objArr98[3])[0] = i96 ^ (i96 << 5);
            p = (l + 85) % 128;
        }
        java.lang.Object d40 = com.facetec.sdk.al.d(-1266058087);
        if (d40 == null) {
            char makeMeasureSpec2 = (char) android.view.View.MeasureSpec.makeMeasureSpec(i4, i4);
            int jumpTapTimeout4 = android.view.ViewConfiguration.getJumpTapTimeout();
            int size2 = android.view.View.MeasureSpec.getSize(i4);
            byte b49 = (byte) 5;
            byte b50 = (byte) (b49 - 5);
            java.lang.Object[] objArr99 = new java.lang.Object[1];
            u(b49, b50, b50, objArr99);
            d40 = com.facetec.sdk.al.c(makeMeasureSpec2, 567 - (jumpTapTimeout4 >> 16), size2 + 24, 325453409, false, (java.lang.String) objArr99[0], null);
        }
        long j8 = ((java.lang.reflect.Field) d40).getLong(null);
        long longValue13 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str5, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d41 = com.facetec.sdk.al.d(-1266981608);
        if (d41 == null) {
            char fadingEdgeLength = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            int indexOf12 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int keyRepeatDelay3 = android.view.ViewConfiguration.getKeyRepeatDelay();
            byte b51 = (byte) 0;
            str8 = str5;
            java.lang.Object[] objArr100 = new java.lang.Object[1];
            u((byte) 6, b51, b51, objArr100);
            d41 = com.facetec.sdk.al.c(fadingEdgeLength, indexOf12 + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION, (keyRepeatDelay3 >> 16) + 24, 328474592, false, (java.lang.String) objArr100[0], null);
        } else {
            str8 = str5;
        }
        if (j8 == ((longValue13 - ((((java.lang.reflect.Field) d41).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d42 = com.facetec.sdk.al.d(-1264211045);
            if (d42 == null) {
                char offsetBefore = (char) android.text.TextUtils.getOffsetBefore("", 0);
                int lastIndexOf6 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                int lastIndexOf7 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                byte b52 = (byte) 3;
                byte b53 = (byte) (b52 - 3);
                java.lang.Object[] objArr101 = new java.lang.Object[1];
                u(b52, b53, b53, objArr101);
                d42 = com.facetec.sdk.al.c(offsetBefore, 566 - lastIndexOf6, lastIndexOf7 + 25, 323670371, false, (java.lang.String) objArr101[0], null);
            }
            java.lang.Object[] objArr102 = (java.lang.Object[]) ((java.lang.reflect.Field) d42).get(null);
            objArr9 = new java.lang.Object[]{(java.lang.String) objArr102[0], new int[]{((int[]) objArr102[1])[0]}, new int[]{((int[]) objArr102[2])[0]}, new int[1]};
            int i97 = (int) java.lang.Runtime.getRuntime().totalMemory();
            int i98 = ((((((~(391695657 | i97)) | (-433002939)) * (-668)) + 22157203) + (((~((-433002939) | i97)) | 391695657) * 1336)) + ((i97 | (-143069331)) * 668)) - 1650444967;
            int i99 = (i98 << 13) ^ i98;
            int i100 = i99 ^ (i99 >>> 17);
            ((int[]) objArr9[3])[0] = i100 ^ (i100 << 5);
            str9 = str8;
        } else {
            android.content.Context context6 = (android.content.Context) java.lang.Class.forName(str).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context6 != null) {
                p = (l + 101) % 128;
                context6 = ((context6 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context6).getBaseContext() == null) ? null : context6.getApplicationContext();
            }
            byte[] bArr10 = $$d;
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            v((short) 309, bArr10[8], bArr10[235], objArr103);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr103[0]);
            int i101 = bArr10[8] - 1;
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            v((short) i101, bArr10[482], (byte) i101, objArr104);
            java.lang.Object[] objArr105 = (java.lang.Object[]) cls10.getMethod((java.lang.String) objArr104[0], android.content.Context.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, context6, 0, -1650444967);
            if (context6 != null) {
                java.lang.Object d43 = com.facetec.sdk.al.d(-1264211045);
                if (d43 == null) {
                    char fadingEdgeLength2 = (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                    int myTid3 = android.os.Process.myTid();
                    long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
                    byte b54 = (byte) 3;
                    byte b55 = (byte) (b54 - 3);
                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                    u(b54, b55, b55, objArr106);
                    d43 = com.facetec.sdk.al.c(fadingEdgeLength2, (myTid3 >> 22) + 567, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 24, 323670371, false, (java.lang.String) objArr106[0], null);
                }
                ((java.lang.reflect.Field) d43).set(null, objArr105);
                try {
                    str9 = str8;
                    long longValue14 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d44 = com.facetec.sdk.al.d(-1266981608);
                    if (d44 == null) {
                        char maximumFlingVelocity2 = (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int fadingEdgeLength3 = android.view.ViewConfiguration.getFadingEdgeLength();
                        double convertQuartSecToDecDegrees = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                        byte b56 = (byte) 0;
                        objArr8 = objArr105;
                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                        u((byte) 6, b56, b56, objArr107);
                        d44 = com.facetec.sdk.al.c(maximumFlingVelocity2, 567 - (fadingEdgeLength3 >> 16), 24 - (convertQuartSecToDecDegrees > 0.0d ? 1 : (convertQuartSecToDecDegrees == 0.0d ? 0 : -1)), 328474592, false, (java.lang.String) objArr107[0], null);
                    } else {
                        objArr8 = objArr105;
                    }
                    ((java.lang.reflect.Field) d44).set(null, java.lang.Long.valueOf(longValue14));
                    java.lang.Object d45 = com.facetec.sdk.al.d(-1266058087);
                    if (d45 == null) {
                        char jumpTapTimeout5 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                        int defaultSize4 = android.view.View.getDefaultSize(0, 0);
                        int maximumFlingVelocity3 = android.view.ViewConfiguration.getMaximumFlingVelocity();
                        byte b57 = (byte) 5;
                        byte b58 = (byte) (b57 - 5);
                        java.lang.Object[] objArr108 = new java.lang.Object[1];
                        u(b57, b58, b58, objArr108);
                        d45 = com.facetec.sdk.al.c(jumpTapTimeout5, defaultSize4 + 567, 24 - (maximumFlingVelocity3 >> 16), 325453409, false, (java.lang.String) objArr108[0], null);
                    }
                    ((java.lang.reflect.Field) d45).set(null, java.lang.Long.valueOf(longValue14 >> 11));
                } catch (java.lang.Exception unused7) {
                    throw new java.lang.RuntimeException();
                }
            } else {
                str9 = str8;
                objArr8 = objArr105;
            }
            objArr9 = objArr8;
        }
        java.lang.Object obj13 = objArr9[2];
        int i102 = ((int[]) obj13)[0];
        java.lang.Object obj14 = objArr9[1];
        if (((int[]) obj14)[0] == i102) {
            int i103 = ((int[]) objArr9[3])[0];
            java.lang.Object[] objArr109 = {(java.lang.String) objArr9[0], new int[]{((int[]) obj14)[0]}, new int[]{((int[]) obj13)[0]}, new int[1]};
            int i104 = ~((~((int) java.lang.Runtime.getRuntime().freeMemory())) | 956446035);
            int i105 = i103 + (((16909379 | i104) * (-374)) - 640519323) + ((i104 | 939536656) * 374);
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            i5 = 0;
            ((int[]) objArr109[3])[0] = i107 ^ (i107 << 5);
        } else {
            android.content.Context context7 = (android.content.Context) java.lang.Class.forName(str).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context7 != null) {
                context7 = ((context7 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context7).getBaseContext() == null) ? null : context7.getApplicationContext();
            }
            if (android.os.Looper.myLooper() == null) {
                context7 = null;
            }
            java.lang.Object[] objArr110 = {context7, java.lang.Long.valueOf((i102 ^ r11) ^ (-9012646505927933952L)), -2098419775L};
            short s9 = (short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
            byte[] bArr11 = $$d;
            java.lang.Object[] objArr111 = new java.lang.Object[1];
            v(s9, bArr11[8], bArr11[235], objArr111);
            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr111[0]);
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, bArr11[482], bArr11[8], objArr112);
            cls11.getMethod((java.lang.String) objArr112[0], android.content.Context.class, java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr110);
            int i108 = ((int[]) objArr9[3])[0];
            java.lang.Object[] objArr113 = {(java.lang.String) objArr9[0], new int[]{((int[]) objArr9[1])[0]}, new int[]{((int[]) objArr9[2])[0]}, new int[1]};
            int i109 = i108 + ((((~((~r2) | 908486129)) | 14162444) * 529) - 996407784) + (((~(((int) java.lang.Runtime.getRuntime().totalMemory()) | 908486129)) | 83787533) * 529);
            int i110 = (i109 << 13) ^ i109;
            int i111 = i110 ^ (i110 >>> 17);
            i5 = 0;
            ((int[]) objArr113[3])[0] = i111 ^ (i111 << 5);
        }
        java.lang.Object d46 = com.facetec.sdk.al.d(-1656269327);
        if (d46 == null) {
            char offsetBefore2 = (char) android.text.TextUtils.getOffsetBefore("", i5);
            long packedPositionForGroup2 = android.widget.ExpandableListView.getPackedPositionForGroup(i5);
            int alpha2 = android.graphics.Color.alpha(i5);
            byte b59 = (byte) i5;
            java.lang.Object[] objArr114 = new java.lang.Object[1];
            u((byte) 7, b59, b59, objArr114);
            d46 = com.facetec.sdk.al.c(offsetBefore2, (packedPositionForGroup2 > 0L ? 1 : (packedPositionForGroup2 == 0L ? 0 : -1)) + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, alpha2 + 24, 984100617, false, (java.lang.String) objArr114[i5], null);
        }
        long j9 = ((java.lang.reflect.Field) d46).getLong(null);
        long longValue15 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str9, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
        java.lang.Object d47 = com.facetec.sdk.al.d(-1658116369);
        if (d47 == null) {
            char scrollBarSize3 = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
            int lastIndexOf8 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int green2 = android.graphics.Color.green(0);
            byte b60 = (byte) 0;
            str10 = str9;
            java.lang.Object[] objArr115 = new java.lang.Object[1];
            u((byte) ($$b & 31), b60, b60, objArr115);
            d47 = com.facetec.sdk.al.c(scrollBarSize3, 799 - lastIndexOf8, 24 - green2, 985947159, false, (java.lang.String) objArr115[0], null);
        } else {
            str10 = str9;
        }
        if (j9 == ((longValue15 - ((((java.lang.reflect.Field) d47).getLong(null) << 53) >>> 53)) >> 11)) {
            java.lang.Object d48 = com.facetec.sdk.al.d(-1654422285);
            if (d48 == null) {
                char keyRepeatDelay4 = (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                int offsetAfter3 = android.text.TextUtils.getOffsetAfter("", 0);
                float complexToFloat3 = android.util.TypedValue.complexToFloat(0);
                byte b61 = (byte) 5;
                byte b62 = (byte) (b61 - 5);
                java.lang.Object[] objArr116 = new java.lang.Object[1];
                u(b61, b62, b62, objArr116);
                d48 = com.facetec.sdk.al.c(keyRepeatDelay4, offsetAfter3 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, (complexToFloat3 > 0.0f ? 1 : (complexToFloat3 == 0.0f ? 0 : -1)) + 24, 982318603, false, (java.lang.String) objArr116[0], null);
            }
            java.lang.Object[] objArr117 = (java.lang.Object[]) ((java.lang.reflect.Field) d48).get(null);
            objArr10 = new java.lang.Object[]{(java.lang.String[]) objArr117[0], new int[1], new int[]{((int[]) objArr117[2])[0]}, new int[]{((int[]) objArr117[3])[0]}};
            int elapsedCpuTime8 = (int) android.os.Process.getElapsedCpuTime();
            int i112 = ~elapsedCpuTime8;
            int i113 = ((679545020 | elapsedCpuTime8) * 988) + 59711667 + (((~(947980540 | i112)) | 70010371) * (-1976)) + (((~(elapsedCpuTime8 | (-338445892))) | 679545020 | (~(i112 | 338445891))) * 988) + 519444310;
            int i114 = (i113 << 13) ^ i113;
            int i115 = i114 ^ (i114 >>> 17);
            ((int[]) objArr10[1])[0] = i115 ^ (i115 << 5);
        } else {
            android.content.Context context8 = (android.content.Context) java.lang.Class.forName(str).getMethod(str7, new java.lang.Class[0]).invoke(null, null);
            if (context8 != null) {
                context8 = ((context8 instanceof android.content.ContextWrapper) && ((android.content.ContextWrapper) context8).getBaseContext() == null) ? null : context8.getApplicationContext();
            }
            java.lang.Object[] objArr118 = new java.lang.Object[1];
            t(15 - android.text.TextUtils.indexOf("", ""), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28294), android.view.MotionEvent.axisFromString("") + 66, objArr118);
            java.lang.String intern5 = ((java.lang.String) objArr118[0]).intern();
            java.lang.Object[] objArr119 = {1873358819};
            java.lang.Object d49 = com.facetec.sdk.al.d(-1302416045);
            if (d49 == null) {
                d49 = com.facetec.sdk.al.c((char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40647), android.text.TextUtils.indexOf("", "", 0) + 777, android.graphics.Color.green(0) + 23, 363974571, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr120 = {context8, intern5, 519444310, 0, 144, ((java.lang.reflect.Constructor) d49).newInstance(objArr119), false};
            java.lang.Object d50 = com.facetec.sdk.al.d(-324935441);
            if (d50 == null) {
                char scrollBarFadeDuration2 = (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int lastIndexOf9 = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                double convertQuartSecToDecDegrees2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0);
                byte b63 = (byte) 0;
                java.lang.Object[] objArr121 = new java.lang.Object[1];
                u((byte) ($$b & 30), b63, b63, objArr121);
                d50 = com.facetec.sdk.al.c(scrollBarFadeDuration2, 799 - lastIndexOf9, (convertQuartSecToDecDegrees2 > 0.0d ? 1 : (convertQuartSecToDecDegrees2 == 0.0d ? 0 : -1)) + 24, 1263442455, false, (java.lang.String) objArr121[0], new java.lang.Class[]{android.content.Context.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, (java.lang.Class) com.facetec.sdk.al.b((char) (63027 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), 855 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 29 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), java.lang.Boolean.TYPE});
            }
            java.lang.Object[] objArr122 = (java.lang.Object[]) ((java.lang.reflect.Method) d50).invoke(null, objArr120);
            if (context8 != null) {
                java.lang.Object d51 = com.facetec.sdk.al.d(-1654422285);
                if (d51 == null) {
                    char c8 = (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int red5 = android.graphics.Color.red(0);
                    int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
                    byte b64 = (byte) 5;
                    byte b65 = (byte) (b64 - 5);
                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                    u(b64, b65, b65, objArr123);
                    d51 = com.facetec.sdk.al.c(c8, red5 + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 24 - (maxKeyCode >> 16), 982318603, false, (java.lang.String) objArr123[0], null);
                }
                ((java.lang.reflect.Field) d51).set(null, objArr122);
                try {
                    long longValue16 = ((java.lang.Long) java.lang.Class.forName(intern).getDeclaredMethod(str10, new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Object d52 = com.facetec.sdk.al.d(-1658116369);
                    if (d52 == null) {
                        char keyRepeatTimeout2 = (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        float complexToFloat4 = android.util.TypedValue.complexToFloat(0);
                        int red6 = android.graphics.Color.red(0);
                        byte b66 = (byte) 0;
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        u((byte) ($$b & 31), b66, b66, objArr124);
                        d52 = com.facetec.sdk.al.c(keyRepeatTimeout2, (complexToFloat4 > 0.0f ? 1 : (complexToFloat4 == 0.0f ? 0 : -1)) + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, red6 + 24, 985947159, false, (java.lang.String) objArr124[0], null);
                    }
                    ((java.lang.reflect.Field) d52).set(null, java.lang.Long.valueOf(longValue16));
                    java.lang.Object d53 = com.facetec.sdk.al.d(-1656269327);
                    if (d53 == null) {
                        char jumpTapTimeout6 = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                        int capsMode4 = android.text.TextUtils.getCapsMode("", 0, 0);
                        int keyRepeatDelay5 = android.view.ViewConfiguration.getKeyRepeatDelay();
                        byte b67 = (byte) 0;
                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                        u((byte) 7, b67, b67, objArr125);
                        d53 = com.facetec.sdk.al.c(jumpTapTimeout6, 800 - capsMode4, (keyRepeatDelay5 >> 16) + 24, 984100617, false, (java.lang.String) objArr125[0], null);
                    }
                    ((java.lang.reflect.Field) d53).set(null, java.lang.Long.valueOf(longValue16 >> 11));
                } catch (java.lang.Exception unused8) {
                    throw new java.lang.RuntimeException();
                }
            }
            objArr10 = objArr122;
        }
        java.lang.Object obj15 = objArr10[2];
        int i116 = ((int[]) obj15)[0];
        java.lang.Object obj16 = objArr10[3];
        if (((int[]) obj16)[0] == i116) {
            int i117 = ((int[]) objArr10[1])[0];
            java.lang.Object[] objArr126 = {(java.lang.String[]) objArr10[0], new int[1], new int[]{((int[]) obj15)[0]}, new int[]{((int[]) obj16)[0]}};
            int uptimeMillis3 = (int) android.os.SystemClock.uptimeMillis();
            int i118 = ~uptimeMillis3;
            int i119 = i117 + ((16780805 | uptimeMillis3) * 988) + 1545163903 + (((~(96890373 | i118)) | 1109426490) * (-1976)) + (((~(uptimeMillis3 | (-1189536059))) | 16780805 | (~(i118 | 1189536058))) * 988);
            int i120 = (i119 << 13) ^ i119;
            int i121 = i120 ^ (i120 >>> 17);
            ((int[]) objArr126[1])[0] = i121 ^ (i121 << 5);
            return;
        }
        java.lang.Object[] objArr127 = {java.lang.Long.valueOf((i116 ^ r4) ^ 4428260863002017792L), 1031165899L};
        java.lang.Object[] objArr128 = new java.lang.Object[1];
        v((short) 328, (byte) ($$d[8] - 1), r2[235], objArr128);
        java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr128[0]);
        java.lang.Object[] objArr129 = new java.lang.Object[1];
        v((short) com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, r2[482], r2[8], objArr129);
        cls12.getMethod((java.lang.String) objArr129[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr127);
        int i122 = ((int[]) objArr10[1])[0];
        java.lang.Object[] objArr130 = {(java.lang.String[]) objArr10[0], new int[1], new int[]{((int[]) objArr10[2])[0]}, new int[]{((int[]) objArr10[3])[0]}};
        int myPid2 = android.os.Process.myPid();
        int i123 = i122 + ((((~(1154710631 | myPid2)) | 50889368) * (-140)) - 1603735003) + ((~(1205599999 | myPid2)) * 70) + (((~(myPid2 | 131715800)) | 1124773567) * 70);
        int i124 = (i123 << 13) ^ i123;
        int i125 = i124 ^ (i124 >>> 17);
        ((int[]) objArr130[1])[0] = i125 ^ (i125 << 5);
    }

    static void d() throws com.facetec.sdk.ej {
        int i2 = p + 121;
        l = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (com.facetec.sdk.by.c.a(r3) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0017, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r2 = com.facetec.sdk.by.l + 43;
        com.facetec.sdk.by.p = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((r2 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r2 = 8 / 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(com.facetec.sdk.by.e eVar, android.content.Context context) {
        if (eVar == com.facetec.sdk.by.e.j) {
            int i2 = p + 39;
            l = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 59 / 0;
            }
        }
        f3446a = eVar.h | f3446a;
        i();
    }

    public static void e(final android.content.Context context, final com.facetec.sdk.by.e eVar) {
        int i2 = p + 99;
        l = i2 % 128;
        if (i2 % 2 == 0) {
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.by$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.by.a(com.facetec.sdk.by.e.this, context);
                }
            });
            l = (p + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.by$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.by.a(com.facetec.sdk.by.e.this, context);
                }
            });
            throw null;
        }
    }

    private static void m() {
        int i2 = p + 7;
        l = i2 % 128;
        if (i2 % 2 == 0) {
            e(null, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField("c").get(null));
        } else {
            e(null, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField("c").get(null));
            throw null;
        }
    }

    private static void o() {
        l = (p + 25) % 128;
        e(null, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField(util.h.xy.cb.b.f1091).get(null));
        l = (p + 7) % 128;
    }

    private static void n() {
        int i2 = p + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        l = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 == 0) {
            e(null, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField("a").get(null));
            p = (l + 119) % 128;
        } else {
            e(null, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField("a").get(null));
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object e(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i2 = l;
        p = (i2 + 95) % 128;
        java.lang.Object obj = null;
        if (context != null) {
            e(context, (com.facetec.sdk.by.e) com.facetec.sdk.by.e.class.getField("j").get(null));
            return null;
        }
        int i3 = i2 + 53;
        p = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        r0 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        com.facetec.sdk.by.l = (r1 + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if (com.facetec.sdk.by.e != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (com.facetec.sdk.by.e != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        com.facetec.sdk.by.e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r1 = com.facetec.sdk.by.AnonymousClass3.class.getDeclaredConstructor(null);
        r1.setAccessible(true);
        r1 = new java.lang.Object[]{r1.newInstance(null)};
        r4 = com.facetec.sdk.dk.class.getMethod("e", java.lang.Runnable.class);
        r4.setAccessible(true);
        r4.invoke(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        r0 = com.facetec.sdk.by.l + 25;
        com.facetec.sdk.by.p = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void l() {
        int i2 = l + 97;
        int i3 = i2 % 128;
        p = i3;
        if (i2 % 2 == 0) {
            int i4 = 38 / 0;
        }
    }

    static void c() {
        l = (p + 91) % 128;
        if (e(com.facetec.sdk.by.a.j)) {
            return;
        }
        boolean z = false;
        java.lang.Object[] objArr = new java.lang.Object[1];
        q("\udc71迟귱\ueff1ヂ\ude85柍呖\ueaef鶧옻謮", android.view.View.resolveSize(0, 0) + 12, objArr);
        java.io.File file = new java.io.File(((java.lang.String) objArr[0]).intern());
        if (file.exists()) {
            p = (l + 21) % 128;
            if (file.isDirectory()) {
                java.lang.String[] strArr = j;
                int length = strArr.length;
                int i2 = p + 29;
                l = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 2;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (new java.io.File(file, strArr[i4]).exists()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
        }
        a(com.facetec.sdk.by.a.j, z);
    }

    public static /* synthetic */ java.lang.Object e(int i2, int i3, int i4, int i5, int i6, int i7, java.lang.Object[] objArr) {
        int i8 = ~(i2 | i3 | i7);
        int i9 = ~i3;
        int i10 = (~(i9 | i7)) | (~((~i7) | i2));
        int i11 = (~(i7 | (~i2))) | i9;
        int i12 = i2 + i3 + i4 + ((-2044576983) * i6) + (1743660113 * i5);
        int i13 = i12 * i12;
        int i14 = ((2048727874 * i2) - 782056376) + (2048728756 * i3) + (i8 * (-441)) + (i10 * (-441)) + (i11 * 441) + (2048728315 * i4) + (2142076211 * i6) + ((-1448904853) * i5) + (1885470720 * i13);
        int i15 = ((i2 * 1047202342) - 713031680) + (i3 * 164951516) + (i8 * 441125413) + (i10 * 441125413) + (i11 * (-441125413)) + (i4 * 606076928) + (i6 * 689963008) + (i5 * (-299892736)) + (i13 * (-1081737216)) + (i14 * i14 * (-1618345984));
        if (i15 == 1) {
            return e(objArr);
        }
        if (i15 == 2) {
            return a(objArr);
        }
        p = (l + 71) % 128;
        com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.by$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.by.k();
            }
        });
        p = (l + 55) % 128;
        return null;
    }

    static void b() {
        f = (char) 1220;
        i = (char) 16548;
        m = (char) 19384;
        k = (char) 21878;
        f3447o = new char[]{27762, 37967, 27775, 53325, 5133, 22747, 40069, 49496, 1308, 18901, 36263, 62056, 13880, 31463, 48823, 57992, 10053, 986, 49133, 31650, 14118, 62259, 44799, 27320, 9793, 57877, 40399, 22932, 5406, 53518, 36130, 18664, 1250, 49231, 31795, 16380, 64445, 46961, 29451, 11976, 60087, 42576, 25108, 7716, 55781, 38305, 20820, 3366, 51432, 33965, 16461, 64513, 49131, 31616, 14157, 62223, 44843, 27372, 9891, 57965, 40497, 23017, 5519, 53580, 36098, 719, 48888, 31415, 13875, 61990, 45034, 27565, 10068, 58112, 40154, 22657, 5131, 53275, 35895, 18941, 27766, 53320, 5134, 22744, 40094, 49500, 1308, 18920, 36277, 62049, 13883, 31484, 48821, 58059, 10067, 27392};
        n = 170032445295546401L;
    }

    private static void b(android.content.Context context) {
        int b2 = com.facetec.sdk.my.b();
        int b3 = com.facetec.sdk.my.b();
        int b4 = com.facetec.sdk.my.b();
        e(287898811, -287898810, b3, com.facetec.sdk.my.b(), b4, b2, new java.lang.Object[]{context});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k() {
        int b2 = com.facetec.sdk.my.b();
        int b3 = com.facetec.sdk.my.b();
        int b4 = com.facetec.sdk.my.b();
        e(-1260898631, 1260898633, b3, com.facetec.sdk.my.b(), b4, b2, new java.lang.Object[0]);
    }

    static void a() throws com.facetec.sdk.ej {
        int b2 = com.facetec.sdk.my.b();
        int b3 = com.facetec.sdk.my.b();
        int b4 = com.facetec.sdk.my.b();
        e(352003939, -352003939, b3, com.facetec.sdk.my.b(), b4, b2, new java.lang.Object[0]);
    }
}
