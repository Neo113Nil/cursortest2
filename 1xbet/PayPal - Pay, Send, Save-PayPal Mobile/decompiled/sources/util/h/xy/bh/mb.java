package util.h.xy.bh;

/* loaded from: classes5.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static char getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static long getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static char getOutputFormats = 0;
    private static char getOutputMinFrameDuration = 0;
    private static int getOutputSizes = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String f956;

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = "mb";
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("⬸狪⪲긄\ue69a藂죳玁\ueacf\uf210\ue69a藂莸✡묺\ue7ae罫쾅瀩辈祱璥ᰕ蕑寋䨙Å鰽湄\uec99ﻸ挻컼諉㗔\ue49f\uf33b吻呺썤鼥染훉䁎∦\uf422", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, objArr);
        f956 = ((java.lang.String) objArr[0]).intern();
        int i = getHighResolutionOutputSizeshNQ4ISI + 111;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 99) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoFpsRanges + 105;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25470(byte[] bArr, byte[] bArr2) throws java.lang.IllegalArgumentException {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 49) % 128;
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("♅\uefad㦸ꏛⳏ㹁幢ꁮᦫꂷ뾗\ue03a睎눮묺\ue7ae", 16 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (bArr2 == null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("♅\uefad㦸ꏛⳏ㹁幢ꁮᦫꂷ뾗\ue03a睎눮묺\ue7ae", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.ek.ra raVar = new util.h.xy.ek.ra(new util.h.xy.eh.mc());
        byte[] bArr3 = new byte[raVar.mo26547()];
        raVar.mo26546(new util.h.xy.ep.mc(bArr));
        raVar.mo26550(bArr2, 0, bArr2.length);
        raVar.mo26548(bArr3, 0);
        int i = getHighResolutionOutputSizeshNQ4ISI + 45;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            return bArr3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25473(java.lang.String str) {
        byte[] bArr;
        if (android.text.TextUtils.isEmpty(str)) {
            bArr = null;
        } else {
            util.h.xy.eh.ma maVar = new util.h.xy.eh.ma();
            byte[] bArr2 = new byte[maVar.mo26565()];
            maVar.mo26562(str.getBytes(), 0, str.getBytes().length);
            maVar.mo26563(bArr2, 0);
            bArr = m25471(bArr2, "").getBytes(java.nio.charset.StandardCharsets.UTF_8);
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            int i = getOutputSizes + 53;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                int i2 = 3 / 3;
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 99;
        getOutputSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = Camera2StreamConfigurationMap + 87;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i4 = getHighSpeedVideoFpsRanges + 73;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[1] = charArray[eVar.f2630];
                int i5 = eVar.f2630;
                cArr2[1] = charArray[0];
                i2 = 1;
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
                i2 = 0;
            }
            int i6 = 58224;
            while (i2 < 16) {
                int i7 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = (i7 + 19) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i6) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizes ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i6)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                i6 -= 40503;
                i2++;
                getHighSpeedVideoFpsRanges = (i7 + 71) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.au.re m25482() {
        com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration m25176;
        util.h.xy.au.mf m25169 = util.h.xy.au.mf.m25169();
        if (m25169 == null || (m25176 = m25169.m25176(util.h.xy.au.mf.f876)) == null) {
            return null;
        }
        int i = (getOutputSizes + 109) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        if (!(m25176 instanceof util.h.xy.au.re)) {
            return null;
        }
        util.h.xy.au.re reVar = (util.h.xy.au.re) m25176;
        getOutputSizes = (i + 23) % 128;
        return reVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m25477() {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ꡂ⩁ꡂ⩁촉ᢕ蛂蠔剪苸랧甠㴾韋\b䱂ᡌ柱ྯ崗랢ᩡᇒ렻ᇒ렻", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 26, objArr);
            return new java.text.SimpleDateFormat(((java.lang.String) objArr[0]).intern(), java.util.Locale.US).format(new java.util.Date());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25476() {
        byte[] bytes = java.util.UUID.randomUUID().toString().getBytes();
        new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8);
        int i = getHighResolutionOutputSizeshNQ4ISI + 107;
        getOutputSizes = i % 128;
        if (i % 2 != 0) {
            return bytes;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25472() {
        android.content.Context m25485 = util.h.xy.bh.ra.m25484().m25485();
        boolean z = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("잍狷\ue75a\ue594슮１邋ᆳ㵹Ṷ㜣䌧", 13 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) m25485.getSystemService(((java.lang.String) objArr[0]).intern())).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
            if (activeNetworkInfo.isConnected()) {
                getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 81) % 128;
                getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 119) % 128;
                return z;
            }
        }
        z = false;
        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 119) % 128;
        return z;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25471(byte[] bArr, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (bArr != null && str != null) {
            for (int i = 0; i < bArr.length; i++) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(m25481((bArr[i] & com.visa.cbp.getEncExpo.onUnminimized) >> 4));
                sb2.append(m25481(bArr[i] & com.google.common.base.Ascii.SI));
                sb.append(sb2.toString());
                if (i != bArr.length - 1) {
                    getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 89) % 128;
                    sb.append(str);
                    getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 113) % 128;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25475(byte[][] bArr, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (bArr != null && str != null) {
            int i = (getOutputSizes + 89) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i;
            getOutputSizes = (i + 65) % 128;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                for (int i3 = 0; i3 < bArr[i2].length; i3++) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(m25481((bArr[i2][i3] & com.visa.cbp.getEncExpo.onUnminimized) >> 4));
                    sb2.append(m25481(bArr[i2][i3] & com.google.common.base.Ascii.SI));
                    sb.append(sb2.toString());
                    if (i3 == bArr[i2].length - 1 && i2 != bArr.length - 1) {
                        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 39) % 128;
                        sb.append(str);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        if (r8 >= 0) goto L9;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m25481(int i) {
        java.lang.String intern;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 99;
        getOutputSizes = i2 % 128;
        if (i2 % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(0 / (android.view.ViewConfiguration.getEdgeSlop() << 89), android.graphics.Color.green(1), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 10790), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            if (i < 0) {
                return intern;
            }
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.green(0), (char) (2267 - android.text.TextUtils.getOffsetAfter("", 0)), objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
        }
        int i3 = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        getOutputSizes = i3;
        if (i < 16) {
            int i4 = i3 + 19;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0 ? i < 10 : i < 78) {
                return java.lang.String.valueOf(i);
            }
            switch (i) {
                case 10:
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((scrollBarFadeDuration >> 16) + 1, 1 - android.graphics.Color.alpha(0), (char) (android.view.KeyEvent.keyCodeFromString("") + 5381), objArr3);
                    return ((java.lang.String) objArr3[0]).intern();
                case 11:
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(-android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, (char) (6182 - android.text.TextUtils.indexOf("", "", 0)), objArr4);
                    return ((java.lang.String) objArr4[0]).intern();
                case 12:
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((edgeSlop >> 16) + 1, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28366), objArr5);
                    return ((java.lang.String) objArr5[0]).intern();
                case 13:
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI("涞肆", 1 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr6);
                        return ((java.lang.String) objArr6[0]).intern();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                case 14:
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("牻뇒", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr7);
                    return ((java.lang.String) objArr7[0]).intern();
                case 15:
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(-android.view.MotionEvent.axisFromString(""), 4 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.MeasureSpec.getMode(0), objArr8);
                    return ((java.lang.String) objArr8[0]).intern();
                default:
                    return intern;
            }
        }
        return intern;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0031, B:17:0x007c, B:26:0x008c, B:27:0x0097, B:7:0x000d, B:12:0x003d, B:15:0x0073, B:21:0x0041, B:22:0x0047, B:23:0x0048), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String Camera2StreamConfigurationMap(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        java.lang.String str;
        synchronized (util.h.xy.bh.mb.class) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 33) % 128;
            try {
                util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(context);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ꚹ\uedb4ꔏ圢ѝ〨ᳳ㗅涞肆", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, objArr);
                byte[] m25225 = m25213.m25225(((java.lang.String) objArr[0]).intern(), true, context);
                if (m25225 != null) {
                    int i = getHighResolutionOutputSizeshNQ4ISI + 37;
                    getOutputSizes = i % 128;
                    if (i % 2 == 0) {
                        int length = m25225.length;
                        throw new java.lang.NullPointerException();
                    }
                    if (m25225.length == 0) {
                    }
                    str = new java.lang.String(m25225, java.nio.charset.StandardCharsets.UTF_8);
                    if (m25225 != null) {
                        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                        java.util.Arrays.fill(m25225, (byte) 0);
                    }
                }
                m25225 = java.util.UUID.randomUUID().toString().getBytes();
                util.h.xy.au.rg m252132 = util.h.xy.au.rg.m25213(context);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ꚹ\uedb4ꔏ圢ѝ〨ᳳ㗅涞肆", 9 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
                m252132.m25218(((java.lang.String) objArr2[0]).intern(), m25225, context);
                str = new java.lang.String(m25225, java.nio.charset.StandardCharsets.UTF_8);
                if (m25225 != null) {
                }
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    java.util.Arrays.fill((byte[]) null, (byte) 0);
                    getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                }
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25474(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        java.lang.String Camera2StreamConfigurationMap2;
        synchronized (util.h.xy.bh.mb.class) {
            if (context == null) {
                int i = getOutputSizes + 69;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    util.h.xy.bh.ra.m25484().m25485();
                    throw null;
                }
                context = util.h.xy.bh.ra.m25484().m25485();
                int i2 = getOutputSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                int i3 = i2 % 2;
            }
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(context);
        }
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final byte[] m25469() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputSizes + 51) % 128;
        byte[] m25211 = ((util.h.xy.au.rf) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f873)).m25211();
        int i = getOutputSizes + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return m25211;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final byte[] m25479() {
        int i = getOutputSizes + 5;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            byte[] m25212 = ((util.h.xy.au.rf) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f873)).m25212();
            int i2 = getOutputSizes + 37;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return m25212;
            }
            throw null;
        }
        ((util.h.xy.au.rf) util.h.xy.au.mf.m25169().m25176(util.h.xy.au.mf.f873)).m25212();
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.au.mb m25478(util.h.xy.az.ma maVar) {
        if (maVar.m25271() == 2) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.COMMUNICATION_ERROR;
            int m25272 = maVar.m25272();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ᎅ籅筬䴲\uf689暎俟嬨\ue4c4퇉\ueacf\uf210\ue69a藂\uf3cc༱觠\udc31ឮ溗偿嘮頻ⶬ릏䕿Å鰽큝于系랓", 32 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            return new util.h.xy.au.mb(mGErrorCode, m25272, ((java.lang.String) objArr[0]).intern());
        }
        if (maVar.m25271() == 4) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode2 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.CONNECTION_TIMEOUT;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(22 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 5, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr2);
                return new util.h.xy.au.mb(mGErrorCode2, ((java.lang.String) objArr2[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (maVar.m25271() == 5) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode3 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_INTERNET;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 69, android.view.MotionEvent.axisFromString("") + 29, (char) android.view.View.combineMeasuredStates(0, 0), objArr3);
            return new util.h.xy.au.mb(mGErrorCode3, ((java.lang.String) objArr3[0]).intern());
        }
        if (maVar.m25271() == 6) {
            return new util.h.xy.au.mb(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR, f956);
        }
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode mGErrorCode4 = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.INTERNAL_ERROR;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("♅\uefad莸✡妈庰ꔽ꺟\uf689暎俟嬨\ue4c4퇉\uf1d5鳫\ue347\ue57aퟺ硣ƽ\ue62d\ue69a藂\uf3cc༱觠\udc31ឮ溗偿嘮頻ⶬ릏䕿Å鰽큝于삜\ue005", 42 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr4);
        return new util.h.xy.au.mb(mGErrorCode4, ((java.lang.String) objArr4[0]).intern());
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static long m25480(java.lang.String str, long j) {
        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        return currentTimeMillis - j;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25483(byte[]... bArr) {
        getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null && bArr2.length > 0) {
                getOutputSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
                java.util.Arrays.fill(bArr2, (byte) 0);
            }
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getOutputSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = (char) 16488;
        getOutputFormats = (char) 59989;
        getHighSpeedVideoSizesFor = (char) 10623;
        getHighSpeedVideoSizes = (char) 7690;
        getHighSpeedVideoFpsRangesFor = new char[]{38018, 35141, 33893, 62092, 40007, 40002, 39815, 37822, 35799, 33744, 48098, 45854, 43837, 41768, 56132, 54130, 52077, 49795, 64244, 62155, 60111, 58108, 6685, 4615, 2666, 602, 14953, 12915, 40002, 39815, 37798, 35798, 33729, 48044, 45849, 43825, 41789, 56080, 54136, 52077, 49795, 64186, 62170, 60101, 58085, 6744, 4631, 2597, 533, 14952, 12911, 10635, 8697, 22931, 20942, 18912, 16651, 30977, 28989, 26904, 24833, 39256, 37023, 35007, 32932, 47327, 45298, 43102, 40970, 55352, 53342, 51265, 49254, 65492, 63398, 61353, 59332, 8170, 6051, 3844, 1840, 16200, 14160, 12129, 9867, 24203, 22251, 20177, 18162, 32490, 30209, 28211, 26146, 40540, 38522, 36245, 34187};
        getInputFormats = 560247918450678760L;
    }
}
