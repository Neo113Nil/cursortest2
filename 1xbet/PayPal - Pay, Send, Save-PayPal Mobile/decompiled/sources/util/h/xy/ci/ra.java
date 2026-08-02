package util.h.xy.ci;

/* loaded from: classes5.dex */
public final class ra {
    private static short[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static byte[] getHighSpeedVideoSizes = null;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static char getOutputFormats = 0;
    private static boolean getOutputMinFrameDuration = false;
    private static boolean getOutputMinFrameDurationlomOqCM = false;
    private static int getOutputSizes = 0;
    private static util.h.xy.ci.ra getOutputSizeshNQ4ISI = null;
    private static final java.lang.String getOutputStallDuration;
    private static int getOutputStallDurationlomOqCM = 1;
    private static int getValidOutputFormatsForInputhNQ4ISI;
    private static char[] toString;
    private android.content.Context isOutputSupportedFor = null;
    private java.util.Map<util.h.xy.ci.mb, byte[]> unwrapAs;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges();
        getOutputStallDuration = util.h.xy.ci.ra.class.getName();
        getOutputSizeshNQ4ISI = null;
        getValidOutputFormatsForInputhNQ4ISI = (getOutputStallDurationlomOqCM + 57) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.ci.ra m25931() {
        util.h.xy.ci.ra Camera2StreamConfigurationMap2;
        synchronized (util.h.xy.ci.ra.class) {
            getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 97) % 128;
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            int i = getValidOutputFormatsForInputhNQ4ISI + 97;
            getOutputStallDurationlomOqCM = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return Camera2StreamConfigurationMap2;
    }

    private static util.h.xy.ci.ra Camera2StreamConfigurationMap() {
        util.h.xy.ci.ra raVar;
        synchronized (util.h.xy.ci.ra.class) {
            int i = getOutputStallDurationlomOqCM + 99;
            getValidOutputFormatsForInputhNQ4ISI = i % 128;
            if (i % 2 == 0) {
                if (getOutputSizeshNQ4ISI == null) {
                    getOutputSizeshNQ4ISI = new util.h.xy.ci.ra();
                }
                raVar = getOutputSizeshNQ4ISI;
                getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 65) % 128;
            } else {
                throw null;
            }
        }
        return raVar;
    }

    private ra() {
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25935() throws util.h.xy.ci.ma {
        synchronized (this) {
            int i = getValidOutputFormatsForInputhNQ4ISI;
            getOutputStallDurationlomOqCM = (i + 119) % 128;
            int i2 = i + 7;
            getOutputStallDurationlomOqCM = i2 % 128;
            if (i2 % 2 == 0) {
                getOutputFormats();
                getHighResolutionOutputSizeshNQ4ISI();
                throw null;
            }
            getOutputFormats();
            if (getHighResolutionOutputSizeshNQ4ISI()) {
                int i3 = getOutputStallDurationlomOqCM + 87;
                getValidOutputFormatsForInputhNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    getOutputMinFrameDuration();
                    throw new java.lang.ArithmeticException();
                }
                getOutputMinFrameDuration();
            } else {
                int i4 = getValidOutputFormatsForInputhNQ4ISI + 5;
                getOutputStallDurationlomOqCM = i4 % 128;
                if (i4 % 2 == 0) {
                    util.h.xy.cr.ra.m26019(util.h.xy.ct.mb.f1127);
                    throw new java.lang.ArithmeticException();
                }
                util.h.xy.cr.ra.m26019(util.h.xy.ct.mb.f1127);
            }
            int i5 = getValidOutputFormatsForInputhNQ4ISI + 61;
            int i6 = i5 % 128;
            getOutputStallDurationlomOqCM = i6;
            if (i5 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
            int i7 = i6 + 41;
            getValidOutputFormatsForInputhNQ4ISI = i7 % 128;
            if (i7 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final android.content.Context m25934() {
        int i = getValidOutputFormatsForInputhNQ4ISI;
        getOutputStallDurationlomOqCM = (i + 119) % 128;
        int i2 = i + 97;
        int i3 = i2 % 128;
        getOutputStallDurationlomOqCM = i3;
        android.content.Context context = this.isOutputSupportedFor;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getValidOutputFormatsForInputhNQ4ISI = (i3 + 49) % 128;
        return context;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25933(util.h.xy.ci.mb mbVar) {
        getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 107) % 128;
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(mbVar);
        getValidOutputFormatsForInputhNQ4ISI = (getOutputStallDurationlomOqCM + 87) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25936(android.content.Context context) throws util.h.xy.ci.ma {
        android.content.Context context2 = context;
        synchronized (this) {
            getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 87) % 128;
            synchronized (this) {
                try {
                    if (context2 == null) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) (9 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0006\u000b\u0015\b #\n\u000f\t !\u000b\u000e\u0016\u000b\n\f\u0004\"\r\u0015 㗿㗿", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 25, objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                    if (context2 instanceof android.app.Activity) {
                        context2 = context.getApplicationContext();
                    } else {
                        int lastIndexOf = 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        byte[] bytes = "\u0089\u008c\u008a\u0089\u0082\u0085\u008b\u0087\u0089\u0082\u008a\u0089\u0082\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
                        util.h.xz.b.md mdVar = new util.h.xz.b.md();
                        char[] cArr = getHighSpeedVideoSizesFor;
                        if (cArr != null) {
                            int length = cArr.length;
                            char[] cArr2 = new char[length];
                            for (int i = 0; i < length; i++) {
                                cArr2[i] = (char) (cArr[i] ^ (-3299939579226817547L));
                            }
                            cArr = cArr2;
                        }
                        int i2 = (int) (getInputSizeshNQ4ISI ^ (-3299939579226817547L));
                        if (!getOutputMinFrameDuration) {
                            if (!getOutputMinFrameDurationlomOqCM) {
                                throw new java.lang.NullPointerException();
                            }
                            throw new java.lang.NullPointerException();
                        }
                        mdVar.f2642 = bytes.length;
                        char[] cArr3 = new char[mdVar.f2642];
                        mdVar.f2643 = 0;
                        while (mdVar.f2643 < mdVar.f2642) {
                            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + lastIndexOf] - i2);
                            mdVar.f2643++;
                        }
                        java.lang.String str = new java.lang.String(cArr3);
                        java.lang.String str2 = str;
                        if (!java.lang.Class.forName(str).isInstance(context2)) {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((-255231205) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) android.text.TextUtils.indexOf("", ""), android.widget.ExpandableListView.getPackedPositionGroup(0L) - 67, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1719701330, objArr2);
                            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                        }
                    }
                    this.isOutputSupportedFor = context2;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-255231185) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) android.graphics.Color.argb(0, 0, 0, 0), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-75) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1719701292, objArr3);
                    java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                    android.content.Context context3 = this.isOutputSupportedFor;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-255231172) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 83, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1719701294, objArr4);
                    java.lang.System.setProperty(intern, context3.getDir(((java.lang.String) objArr4[0]).intern(), 0).getPath());
                    util.h.xy.cm.a.m25958();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        getValidOutputFormatsForInputhNQ4ISI = (getOutputStallDurationlomOqCM + 15) % 128;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.util.Properties properties, util.h.xy.ci.mb mbVar) throws util.h.xy.ci.ma {
        java.lang.String property = properties.getProperty(mbVar.m25930());
        if (property != null && property.length() != 0) {
            return property;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 255231400, (short) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (byte) android.view.View.resolveSize(0, 0), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 59, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 1719701320, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(mbVar);
            throw new util.h.xy.ci.ma(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI() {
        boolean z;
        int i = getOutputStallDurationlomOqCM + 125;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            try {
                z = util.h.xy.ck.ra.f1116.m25946();
            } catch (util.h.xy.ck.rc unused) {
                z = true;
            }
        } else {
            try {
                z = util.h.xy.ck.ra.f1116.m25946();
            } catch (util.h.xy.ck.rc unused2) {
                z = false;
            }
        }
        int i2 = getOutputStallDurationlomOqCM + 29;
        getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r3 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
    
        r0.f2647 = r9 + r3;
        r0.f2644 = (char) (r18 + ((int) (util.h.xy.ci.ra.getOutputSizes ^ (-2689713159175858216L))));
        r1.append(r0.f2644);
        r0.f2646 = r0.f2644;
        r3 = util.h.xy.ci.ra.getHighSpeedVideoSizes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        r8 = util.h.xy.ci.ra.getHighSpeedVideoFpsRangesFor + 101;
        util.h.xy.ci.ra.getHighResolutionOutputSizeshNQ4ISI = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f8, code lost:
    
        if ((r8 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        r8 = r3.length;
        r9 = new byte[r8];
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        if (r10 >= r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        r9[r10] = (byte) (r3[r10] ^ (-2689713159175858216L));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r8 = r3.length;
        r9 = new byte[r8];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        util.h.xy.ci.ra.getHighSpeedVideoFpsRangesFor = (util.h.xy.ci.ra.getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        r0.f2645 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0122, code lost:
    
        if (r0.f2645 >= r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r3 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        r8 = util.h.xy.ci.ra.getHighSpeedVideoSizes;
        r0.f2647 = r0.f2647 - 1;
        r0.f2644 = (char) (r0.f2646 + (((byte) (((byte) (r8[r9] ^ (-2689713159175858216L))) + r15)) ^ r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0157, code lost:
    
        r1.append(r0.f2644);
        r0.f2646 = r0.f2644;
        r0.f2645++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
    
        r8 = util.h.xy.ci.ra.Camera2StreamConfigurationMap;
        r0.f2647 = r0.f2647 - 1;
        r0.f2644 = (char) (r0.f2646 + (((short) (((short) (r8[r9] ^ (-2689713159175858216L))) + r15)) ^ r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        r8 = r8 + 37;
        util.h.xy.ci.ra.getHighResolutionOutputSizeshNQ4ISI = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        if ((r8 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        if (r3 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
        boolean z = i5 == -1;
        if (z) {
            byte[] bArr = getHighSpeedVideoSizes;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = getHighResolutionOutputSizeshNQ4ISI + 105;
                    getHighSpeedVideoFpsRangesFor = i7 % 128;
                    if (i7 % 2 != 0) {
                        bArr2[i6] = (byte) (bArr[i6] | (-2689713159175858216L));
                        i6--;
                    } else {
                        bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                        i6++;
                    }
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i8 = getHighResolutionOutputSizeshNQ4ISI + 97;
                getHighSpeedVideoFpsRangesFor = i8 % 128;
                i5 = (byte) (i8 % 2 != 0 ? ((byte) (getHighSpeedVideoSizes[((int) (getInputFormats * (-2689713159175858216L))) + i] / (-2689713159175858216L))) % ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) : ((byte) (getHighSpeedVideoSizes[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (Camera2StreamConfigurationMap[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i9 = getHighSpeedVideoFpsRangesFor;
            int i10 = i9 + 47;
            getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
            if (i10 % 2 == 0) {
                i4 = ((i << i5) + 2) >>> ((int) (getInputFormats + 2689713159175858216L));
            } else {
                i4 = ((i + i5) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L)));
            }
        }
        objArr[0] = sb.toString();
    }

    private void getOutputFormats() throws util.h.xy.ci.ma {
        getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 33) % 128;
        java.io.InputStream inputStream = null;
        try {
            try {
                android.content.res.AssetManager assets = this.isOutputSupportedFor.getAssets();
                int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
                short keyRepeatDelay2 = (short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte indexOf = (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1);
                int alpha = android.graphics.Color.alpha(0);
                getValidOutputFormatsForInputhNQ4ISI = (getOutputStallDurationlomOqCM + 59) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((-255231370) - (keyRepeatDelay >> 16), keyRepeatDelay2, indexOf, alpha - 73, (-1719701283) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
                    java.io.InputStream open = assets.open(((java.lang.String) objArr[0]).intern());
                    java.util.Properties properties = new java.util.Properties();
                    properties.load(open);
                    java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1107);
                    java.lang.String Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1104);
                    java.lang.String Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1105);
                    java.lang.String Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1106);
                    java.lang.String Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1103);
                    java.lang.String Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(properties, util.h.xy.ci.mb.f1102);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    this.unwrapAs = hashMap;
                    hashMap.put(util.h.xy.ci.mb.f1107, Camera2StreamConfigurationMap2.getBytes());
                    this.unwrapAs.put(util.h.xy.ci.mb.f1104, Camera2StreamConfigurationMap3.getBytes());
                    this.unwrapAs.put(util.h.xy.ci.mb.f1105, Camera2StreamConfigurationMap4.getBytes());
                    this.unwrapAs.put(util.h.xy.ci.mb.f1106, Camera2StreamConfigurationMap5.getBytes());
                    this.unwrapAs.put(util.h.xy.ci.mb.f1103, Camera2StreamConfigurationMap6.getBytes());
                    this.unwrapAs.put(util.h.xy.ci.mb.f1102, Camera2StreamConfigurationMap7.getBytes());
                    if (open != null) {
                        try {
                            open.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.io.IOException e) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (110 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0016\u0019\u001d\u0006㙎", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5, objArr2);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.ch.ma.m25927(e));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 85), "\u0017\u001b\u0006\u0004\u0019 \n\u000e\u0019#\u0003\r\u000e\u0017\u0004\u000f\u0016\u000b\u0016\u0002\u000f\u0005#\u001b\u0003\u0007\u0010\u000b\u0016\u000e\u0005\u0010\u0019 㘊", android.graphics.Color.argb(0, 0, 0, 0) + 35, objArr3);
                throw new util.h.xy.ci.ma(((java.lang.String) objArr3[0]).intern());
            }
        } catch (java.lang.Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                    getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 113) % 128;
                } catch (java.io.IOException unused2) {
                }
            }
            throw th2;
        }
    }

    private static void getOutputMinFrameDuration() throws util.h.xy.ci.ma {
        int i = getValidOutputFormatsForInputhNQ4ISI + 111;
        getOutputStallDurationlomOqCM = i % 128;
        try {
            if (i % 2 == 0) {
                getHighSpeedVideoFpsRangesFor();
                util.h.xy.ct.rc.m26047().mo26035(m25931().m25933(util.h.xy.ci.mb.f1107), null, util.h.xy.ct.ma.b.f1126.m26043());
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoFpsRangesFor();
            util.h.xy.ct.rc.m26047().mo26035(m25931().m25933(util.h.xy.ci.mb.f1107), null, util.h.xy.ct.ma.b.f1126.m26043());
            int i2 = getOutputStallDurationlomOqCM + 103;
            getValidOutputFormatsForInputhNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            }
        } catch (util.h.xy.ct.mc e) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) - 255231356, (short) android.text.TextUtils.getOffsetBefore("", 0), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-84) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1719701316, objArr);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.ch.ma.m25927(e));
            util.h.xy.ci.b bVar = util.h.xy.ci.b.f1099;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((jumpTapTimeout >> 16) - 255231351, (short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-36) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-1719701314) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.ci.ma(bVar, sb.toString(), e);
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.ci.mb mbVar) {
        if (mbVar == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-255231300) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (-55) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-1719701331) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (this.unwrapAs == null && this.isOutputSupportedFor != null) {
            try {
                getOutputFormats();
            } catch (util.h.xy.ci.ma e) {
                e.getMessage();
            }
        }
        if (!this.unwrapAs.containsKey(mbVar)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 255231266, (short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.KeyEvent.getDeadChar(0, 0) - 28, (-1719701330) - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        }
        return this.unwrapAs.get(mbVar);
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        int i4 = getHighSpeedVideoFpsRangesFor;
        int i5 = i4 + 19;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i6 = i4 + 43;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = toString;
        if (cArr2 != null) {
            int i7 = getHighResolutionOutputSizeshNQ4ISI;
            int i8 = i7 + 75;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            getHighSpeedVideoFpsRangesFor = (i7 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            while (i3 < length) {
                cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                i3++;
            }
            cArr2 = cArr;
        }
        char c = (char) (4042185467053315654L ^ getOutputFormats);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 63) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            int i9 = getHighSpeedVideoFpsRangesFor + 29;
            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
            int i10 = i9 % 2;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i11 = mcVar.f2639;
                        int i12 = mcVar.f2640;
                        int i13 = mcVar.f2637;
                        int i14 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr2[(i11 * c) + i12];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i13 * c) + i14];
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i15 = mcVar.f2639;
                        int i16 = mcVar.f2640;
                        int i17 = mcVar.f2637;
                        int i18 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr2[(i15 * c) + i16];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i17 * c) + i18];
                    } else {
                        int i19 = mcVar.f2639;
                        int i20 = mcVar.f2635;
                        int i21 = mcVar.f2637;
                        int i22 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr2[(i19 * c) + i20];
                        cArr3[mcVar.f2638 + 1] = cArr2[(i21 * c) + i22];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i23 = 0; i23 < i; i23++) {
            cArr3[i23] = (char) (cArr3[i23] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoFpsRangesFor() {
        getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 41) % 128;
        util.h.xy.ct.mb m26018 = util.h.xy.cr.ra.m26018();
        try {
            if (m26018 != util.h.xy.ct.mb.f1129) {
                int i = getOutputStallDurationlomOqCM + 119;
                getValidOutputFormatsForInputhNQ4ISI = i % 128;
                if (i % 2 == 0) {
                    if (m26018 != util.h.xy.ct.mb.f1128) {
                        return;
                    }
                } else {
                    util.h.xy.ct.mb mbVar = util.h.xy.ct.mb.f1128;
                    throw null;
                }
            }
            util.h.xy.ct.rc.m26047().mo26037(m25931().m25933(util.h.xy.ci.mb.f1107));
            util.h.xy.ct.rc.m26046().mo26042(new util.h.xy.cp.ma().m25992(m26018));
        } catch (util.h.xy.cm.ma e) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (123 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), "\u0016\u0019\u0003\u0017㙖", android.text.TextUtils.getCapsMode("", 0, 0) + 5, objArr);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.ch.ma.m25927(e));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (util.h.xy.ct.mc e2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (104 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0016\u0019\u001f\u0018㙅", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5, objArr2);
            util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.ch.ma.m25927(e2));
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25932() {
        synchronized (this) {
            getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 15) % 128;
            try {
                this.isOutputSupportedFor = null;
                this.unwrapAs = null;
                util.h.xy.ck.ra.f1116.m25956();
                getOutputStallDurationlomOqCM = (getValidOutputFormatsForInputhNQ4ISI + 117) % 128;
            } catch (util.h.xy.ck.rc unused) {
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = new char[]{64223, 64194, 64216, 64206, 64205, 64199, 64258, 64217, 64200, 64219, 64249, 64180};
        getInputSizeshNQ4ISI = -1074857156;
        getOutputMinFrameDurationlomOqCM = true;
        getOutputMinFrameDuration = true;
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = -392719760;
        getHighSpeedVideoFpsRanges = -408873087;
        getOutputSizes = -2128504755;
        getHighSpeedVideoSizes = new byte[]{62, com.google.common.base.Ascii.RS, -34, -47, 32, -48, 33, -33, -99, 106, 39, -34, 45, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 37, -42, 38, -37, 32, 39, -12, -5, 97, 33, -35, 46, -40, -46, -60, -42, 36, 45, -38, -43, 45, -39, 37, -38, -102, 99, -42, 38, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 42, -56, 47, 34, 62, -63, 117, -41, 43, -41, 38, 42, -117, 116, -34, -47, 36, 37, -47, -101, 100, -37, 42, -37, -108, 105, 35, -116, 108, -37, -48, -61, -2, 39, 101, 39, 33, -37, -48, -61, -2, 99, 43, 37, -42, 38, -37, 32, 39, -12, -5, 99, 38, -34, -41, 109, -40, 47, -33, -106, 99, -37, -102, 116, -35, -39, -106, 116, -39, 38, -48, -107, Byte.MAX_VALUE, -52, 34, -109, 106, 39, -34, 45, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 37, -42, 38, -37, 32, 39, -12, 18, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -55, 37, -45, 32, 45, -45, 35, -35, -111, Byte.MAX_VALUE, -43, 34, -43, 45, -39, 37, -38, -120, 116, -35, -39, -106, 117, -54, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -113, 117, -40, -54, 45, -15, -5, -40, 42, 18, 46, 33, -34, -47, -98, 116, -35, -39, -106, 106, 39, -34, 45, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 37, -42, 38, -37, 32, 39, -12, 36, -53, 41, -34, 39, -44, -101, 99, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -46, 37, 36, -42, 43, -118, 116, -35, -39, -40, -43, -58, -47, -35, 44, -37, 33, -98, 103, -34, -29, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -51, 47, -42, 33, -37, -37, -40, -40, -40, -40, -40, -40, -40, -40, -40};
        toString = new char[]{41918, 41917, 41024, 41915, 41914, 41882, 41916, 41031, 41905, 41896, 41907, 41887, 41030, 41029, 41026, 41912, 41980, 41909, 41027, 41870, 41906, 41868, 41028, 41919, 41872, 41880, 41904, 41881, 41883, 41902, 41873, 41913, 41970, 41897, 41892, 41903};
        getOutputFormats = (char) 38464;
    }
}
