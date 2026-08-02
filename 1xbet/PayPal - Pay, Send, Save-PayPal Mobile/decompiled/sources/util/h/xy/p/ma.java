package util.h.xy.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static boolean getHighSpeedVideoSizes = false;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static boolean getOutputFormats;
    private static final /* synthetic */ util.h.xy.p.ma[] getOutputMinFrameDuration;
    private static char[] getOutputStallDuration;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.p.ma f2290;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected byte[] f2291 = null;

    private ma(java.lang.String str) {
    }

    public static util.h.xy.p.ma valueOf(java.lang.String str) {
        int i = getInputFormats + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.p.ma maVar = (util.h.xy.p.ma) java.lang.Enum.valueOf(util.h.xy.p.ma.class, str);
        if (i % 2 == 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.p.ma[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 115;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.p.ma[] maVarArr = (util.h.xy.p.ma[]) getOutputMinFrameDuration.clone();
        int i2 = getInputFormats + 3;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return maVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.p.ma[] maVarArr;
        getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0004\uffff\ufffb\ufff9\u0004\ufff7\n\t", 8 - android.text.TextUtils.getCapsMode("", 0, 0), 2 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 94 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), true, objArr);
            util.h.xy.p.ma maVar = new util.h.xy.p.ma(((java.lang.String) objArr[0]).intern());
            f2290 = maVar;
            int i = getHighSpeedVideoFpsRangesFor + 79;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                maVarArr = new util.h.xy.p.ma[0];
                maVarArr[1] = maVar;
            } else {
                maVarArr = new util.h.xy.p.ma[]{maVar};
            }
            getOutputMinFrameDuration = maVarArr;
            getHighSpeedVideoSizesFor = "ma";
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m27037() {
        int i = (getInputFormats + 53) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        byte[] bArr = this.f2291;
        int i2 = i + 85;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m27036(byte[] bArr) {
        int i = (getInputFormats + 57) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        this.f2291 = bArr;
        getInputFormats = (i + 31) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.m27037().length == 0) goto L9;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m27028() {
        int i = getHighSpeedVideoFpsRangesFor + 25;
        getInputFormats = i % 128;
        try {
            if (i % 2 == 0) {
                f2290.m27037();
                throw null;
            }
            util.h.xy.p.ma maVar = f2290;
            if (maVar.m27037() != null) {
                getHighSpeedVideoFpsRangesFor = (getInputFormats + 107) % 128;
            }
            util.h.xy.ak.b bVar = util.h.xy.ak.b.f76;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u000f\u0012\ufffe￤\ufffe�\bￜ\u0007\b\u0002\f\u000b\ufffe", 14 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 123 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr);
            maVar.m27036(bVar.m24965(((java.lang.String) objArr[0]).intern()));
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 39) % 128;
            if (maVar.m27037() == null || maVar.m27037().length <= 0) {
                return null;
            }
            return maVar.m27037();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m27030(byte[] bArr) {
        java.lang.String highSpeedVideoFpsRangesFor;
        java.lang.Object obj;
        int i = getHighSpeedVideoFpsRangesFor + 11;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufff0:\ufff7\ufff0\ufff2", 2 << (android.view.ViewConfiguration.getMaximumDrawingCacheSize() / com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), 3 << (android.view.ViewConfiguration.getKeyRepeatTimeout() << 112), 117 >> (android.graphics.PointF.length(1.0f, 0.0f) > 1.0f ? 1 : (android.graphics.PointF.length(1.0f, 0.0f) == 1.0f ? 0 : -1)), true, objArr);
            obj = objArr[0];
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufff0:\ufff7\ufff0\ufff2", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, 82 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), false, objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern().equalsIgnoreCase(highSpeedVideoFpsRangesFor);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m27032(byte[] bArr) {
        java.lang.String highSpeedVideoFpsRangesFor;
        java.lang.Object obj;
        int i = getInputFormats + 71;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) * 1816, "\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            obj = objArr[0];
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern().equalsIgnoreCase(highSpeedVideoFpsRangesFor);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static boolean m27035(byte[] bArr) {
        java.lang.String highSpeedVideoFpsRangesFor;
        int i;
        java.lang.Object obj;
        int i2 = getHighSpeedVideoFpsRangesFor + 15;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            i = 8822;
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            i = 128;
        }
        int i3 = getInputFormats + 85;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(i >> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 1L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 1L ? 0 : -1)), "\u008f\u008e\u008a\u008d\u008c\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                obj = objArr[0];
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(i - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), "\u008f\u008e\u008a\u008d\u008c\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
                obj = objArr2[0];
            }
            boolean equalsIgnoreCase = ((java.lang.String) obj).intern().equalsIgnoreCase(highSpeedVideoFpsRangesFor);
            getInputFormats = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            return equalsIgnoreCase;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m27027(byte[] bArr) {
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0083\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0090\u0082\u0081", objArr);
            boolean equalsIgnoreCase = ((java.lang.String) objArr[0]).intern().equalsIgnoreCase(highSpeedVideoFpsRangesFor);
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 61) % 128;
            return equalsIgnoreCase;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (r0.startsWith(((java.lang.String) r6[0]).intern()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        r1 = util.h.xy.p.ma.getInputFormats + 43;
        util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e6, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(37 - android.view.View.getDefaultSize(1, 1), "\u0090\u0082\u008b", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ff, code lost:
    
        if (r0.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x011f, code lost:
    
        if (m27026() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0121, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0102, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 127, "\u0090\u0082\u008b", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0119, code lost:
    
        if (r0.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L13;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27031() {
        int resolveOpacity;
        int minimumFlingVelocity;
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor + 25;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            util.h.xy.p.ra.m27046();
            throw null;
        }
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        try {
            if (m27046 != null) {
                int i3 = getInputFormats + 5;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(72 / (android.view.ViewConfiguration.getScrollBarSize() >>> 50), "\u0091\u0082\u008b", objArr);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0091\u0082\u008b", objArr2);
                }
                return true;
            }
            if (i % 2 != 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", resolveOpacity, minimumFlingVelocity, 68 >> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() - 29), true, objArr3);
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", resolveOpacity, minimumFlingVelocity, 68 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), true, objArr4);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4;
        minimumFlingVelocity = 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
        i = getInputFormats + 33;
        getHighSpeedVideoFpsRangesFor = i % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r0.startsWith(((java.lang.String) r9[0]).intern()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", 4 - android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 67 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r0.startsWith(((java.lang.String) r15[0]).intern()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        r3 = util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor + 39;
        util.h.xy.p.ma.getInputFormats = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a9, code lost:
    
        if ((r3 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        r3 = 74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c1, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(r3 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u0090\u0082\u008b", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d7, code lost:
    
        if (r0.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        r4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0091\u0082\u0092\u0082\u008b", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f3, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        r3 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r0.startsWith(((java.lang.String) r9[0]).intern()) == false) goto L15;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27029() {
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        if (m27046 != null) {
            if (m27046 != null) {
                int i = getHighSpeedVideoFpsRangesFor + 103;
                getInputFormats = i % 128;
                try {
                    if (i % 2 == 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(127 / (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 57), "\u0091\u0082\u008b", objArr);
                    } else {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 127, "\u0091\u0082\u008b", objArr2);
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return false;
        }
        return true;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputStallDuration;
        if (cArr != null) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 79) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getHighSpeedVideoSizes) {
            if (!getOutputFormats) {
                throw null;
            }
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 121) % 128;
            throw null;
        }
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 9) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 37) % 128;
        objArr[0] = str2;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
        char[] charArray = str.toCharArray();
        int i4 = Camera2StreamConfigurationMap + 25;
        getHighSpeedVideoFpsRanges = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = charArray;
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 43) % 128;
            raVar.f2650 = cArr[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i6 = raVar.f2649;
            cArr2[i6] = (char) (cArr2[i6] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 87) % 128;
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr4 = new char[i];
            raVar.f2649 = 0;
            int i7 = getHighSpeedVideoFpsRanges + 63;
            while (true) {
                Camera2StreamConfigurationMap = i7 % 128;
                if (raVar.f2649 >= i) {
                    break;
                }
                cArr4[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
                i7 = getHighSpeedVideoFpsRanges + 9;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cc, code lost:
    
        if (r0.startsWith(((java.lang.String) r6[0]).intern()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ea, code lost:
    
        r6 = util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor + 73;
        util.h.xy.p.ma.getInputFormats = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f3, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f5, code lost:
    
        r4 = 53;
        r7 = 2 / android.graphics.Color.green(1);
        r8 = 3 % (android.graphics.PointF.length(2.0f, 0.0f) > 2.0f ? 1 : (android.graphics.PointF.length(2.0f, 0.0f) == 2.0f ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0131, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoSizes("￼\u0001\u0004", r7, r8, r4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), false, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014b, code lost:
    
        if (r0.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014d, code lost:
    
        r4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.alpha(0) + 127, "\u0091\u0082\u0093\u0082\u008b", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0166, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0169, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016a, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016e, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0170, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0171, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0108, code lost:
    
        r6 = android.graphics.Color.green(0);
        r8 = 2 + (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        r7 = r6 + 3;
        r4 = 70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        if (r0.startsWith(((java.lang.String) r6[0]).intern()) == false) goto L21;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27034() {
        int i = getHighSpeedVideoFpsRangesFor + 9;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            util.h.xy.p.ra.m27046();
            throw new java.lang.ArithmeticException();
        }
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        if (m27046 != null) {
            if (m27046 != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0001�\u0004", 16777219 + android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 68, true, objArr);
                if (!m27046.startsWith(((java.lang.String) objArr[0]).intern())) {
                    getHighSpeedVideoFpsRangesFor = (getInputFormats + 125) % 128;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0091\u0082\u008b", objArr2);
                    if (!m27046.startsWith(((java.lang.String) objArr2[0]).intern())) {
                        getInputFormats = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 68 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), true, objArr3);
                        if (!m27046.startsWith(((java.lang.String) objArr3[0]).intern())) {
                            int i2 = getInputFormats + 49;
                            getHighSpeedVideoFpsRangesFor = i2 % 128;
                            if (i2 % 2 != 0) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(93 % (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(1) == 0.0d ? 0 : -1)), "\u0090\u0082\u008b", objArr4);
                            } else {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0090\u0082\u008b", objArr5);
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
    
        if (r0.startsWith(((java.lang.String) r12[0]).intern()) == false) goto L16;
     */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27025() {
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        if (m27046 != null) {
            if (m27046 != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0001�\u0004", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3, android.view.Gravity.getAbsoluteGravity(0, 0) + 3, 68 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, objArr);
                if (!m27046.startsWith(((java.lang.String) objArr[0]).intern())) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 127, "\u0091\u0082\u008b", objArr2);
                    if (!m27046.startsWith(((java.lang.String) objArr2[0]).intern())) {
                        getInputFormats = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", 16777220 + android.graphics.Color.rgb(0, 0, 0), -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 67, true, objArr3);
                        if (!m27046.startsWith(((java.lang.String) objArr3[0]).intern())) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0090\u0082\u008b", objArr4);
                            if (!m27046.startsWith(((java.lang.String) objArr4[0]).intern())) {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("￼\u0001\u0004", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 3, 2 - android.text.TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 70, false, objArr5);
                            }
                        }
                    }
                }
            }
            return false;
        }
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 45) % 128;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0162, code lost:
    
        if (r2.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L31;
     */
    /* renamed from: ͺ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27033() {
        getHighSpeedVideoFpsRangesFor = (getInputFormats + 93) % 128;
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        if (m27046 != null) {
            if (m27046 != null) {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u0001�\u0004", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 2, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, 69 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), true, objArr);
                    if (!m27046.startsWith(((java.lang.String) objArr[0]).intern())) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 128, "\u0091\u0082\u008b", objArr2);
                        if (!m27046.startsWith(((java.lang.String) objArr2[0]).intern())) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 69, true, objArr3);
                            if (!m27046.startsWith(((java.lang.String) objArr3[0]).intern())) {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u0090\u0082\u008b", objArr4);
                                if (!m27046.startsWith(((java.lang.String) objArr4[0]).intern())) {
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("￼\u0001\u0004", 3 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '.', android.graphics.Color.alpha(0) + 70, false, objArr5);
                                    if (!m27046.startsWith(((java.lang.String) objArr5[0]).intern())) {
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) + 127, "\u0093\u0082\u008b", objArr6);
                                        if (!m27046.startsWith(((java.lang.String) objArr6[0]).intern())) {
                                            getInputFormats = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor(128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0081\u0082\u008b", objArr7);
                                            if (!m27046.startsWith(((java.lang.String) objArr7[0]).intern())) {
                                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u008b\u0082\u008b", objArr8);
                                            }
                                        }
                                    }
                                }
                            }
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
            return false;
        }
        int i = getInputFormats + 107;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return true;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0089, code lost:
    
        if (r0.startsWith(((java.lang.String) r5[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        util.h.xy.p.ma.getInputFormats = (util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor + 45) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00be, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0006\ufffe\u0001\ufffe", android.view.View.MeasureSpec.getSize(0) + 4, 1 - android.text.TextUtils.indexOf("", ""), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 69, true, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d9, code lost:
    
        if (r0.startsWith(((java.lang.String) r14[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00db, code lost:
    
        r3 = util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor + 13;
        util.h.xy.p.ma.getInputFormats = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e8, code lost:
    
        if ((r3 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ea, code lost:
    
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(64 % (android.util.TypedValue.complexToFraction(1, 1.0f, 0.0f) > 1.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 1.0f, 0.0f) == 1.0f ? 0 : -1)), "\u0090\u0082\u008b", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0106, code lost:
    
        if (r0.startsWith(((java.lang.String) r8[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0124, code lost:
    
        r13 = new java.lang.Object[1];
        getHighSpeedVideoSizes("￼\u0001\u0004", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf("", "", 0) + 70, false, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0150, code lost:
    
        if (r0.startsWith(((java.lang.String) r13[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0152, code lost:
    
        util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor = (util.h.xy.p.ma.getInputFormats + 25) % 128;
        r4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0093\u0082\u008b", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0173, code lost:
    
        if (r0.startsWith(((java.lang.String) r4[0]).intern()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0109, code lost:
    
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(127 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0090\u0082\u008b", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0122, code lost:
    
        if (r0.startsWith(((java.lang.String) r8[0]).intern()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0176, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0177, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017b, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017d, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x017e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r0.startsWith(((java.lang.String) r13[0]).intern()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r0.startsWith(((java.lang.String) r13[0]).intern()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006e, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u0091\u0082\u008b", r5);
     */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27024() {
        java.lang.String m27046 = util.h.xy.p.ra.m27046();
        if (m27046 != null) {
            if (m27046 != null) {
                int i = getInputFormats + 79;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u0001�\u0004", 5 % android.view.View.resolveSize(0, 1), 3 >>> (android.view.ViewConfiguration.getDoubleTapTimeout() - 85), android.graphics.Color.argb(1, 1, 0, 0) + 117, true, objArr);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\u0001�\u0004", 3 - android.view.View.resolveSize(0, 0), 3 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 69 - android.graphics.Color.argb(0, 0, 0, 0), true, objArr2);
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m27026() {
        int i = getInputFormats + 73;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            java.lang.String m27046 = util.h.xy.p.ra.m27046();
            if (m27046 != null) {
                getHighSpeedVideoFpsRangesFor = (getInputFormats + 57) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0001�\u0004", 3 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 70, true, objArr);
                if (m27046.startsWith(((java.lang.String) objArr[0]).intern())) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "\u0091\u0082\u0090\u0082\u0081", objArr2);
                    if (!m27046.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                        getHighSpeedVideoFpsRangesFor = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\ufffe\u0002\ufffe\u0001\u0005", 6 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 4, 68 - android.view.KeyEvent.getDeadChar(0, 0), false, objArr3);
                        if (!m27046.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 93;
            getInputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        util.h.xy.p.ra.m27046();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x017d, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ad, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ufffe\u0001\ufffe\u0001\u0005", 5 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 69, false, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01dd, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01df, code lost:
    
        r0 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 128, "\u0090\u0082\u0083\u0082\u0081", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01fa, code lost:
    
        if (r2.startsWith(((java.lang.String) r0[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01fc, code lost:
    
        util.h.xy.p.ma.getInputFormats = (util.h.xy.p.ma.getHighSpeedVideoFpsRangesFor + 113) % 128;
        r15 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0004�\u0000�\u0002", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, android.view.View.resolveSize(0, 0) + 5, 69 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0230, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0232, code lost:
    
        r0 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 126, "\u0093\u0082\u0083\u0082\u0081", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x024d, code lost:
    
        if (r2.startsWith(((java.lang.String) r0[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x024f, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0004�\u0000�\u0004", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 4, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6, 70 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), true, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x027d, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x027f, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoSizes("\u0004�\u0000�\u0005", 4 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), 5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 70, false, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02a8, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02aa, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 127, "\u008f\u008e\u008a\u008d\u008c\u0085\u0084\u0082\u0083\u0082\u0081", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02bf, code lost:
    
        return ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ab, code lost:
    
        if (r2.startsWith(((java.lang.String) r15[0]).intern()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0352, code lost:
    
        if (r2.startsWith(((java.lang.String) r4[0]).intern()) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr);
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        getInputFormats = (getHighSpeedVideoFpsRangesFor + 43) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ufffe\u0003", (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 2, 1 - resolveSizeAndState, 68 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), false, objArr);
            if (str.startsWith(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(127 - android.graphics.Color.red(0), "\u0084\u0082\u0084\u0082\u0092", objArr2);
                return ((java.lang.String) objArr2[0]).intern();
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0091\u0082\u0081", objArr3);
            if (str.startsWith(((java.lang.String) objArr3[0]).intern())) {
                int maximumFlingVelocity = 5 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i = getHighSpeedVideoFpsRangesFor + 77;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufff0:\ufff7\ufff0\ufff2", maximumFlingVelocity, 2 >>> (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() * 113), 102 - android.view.KeyEvent.getDeadChar(1, 1), false, objArr4);
                    return ((java.lang.String) objArr4[0]).intern();
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\ufff0:\ufff7\ufff0\ufff2", maximumFlingVelocity, 2 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), 82 - android.view.KeyEvent.getDeadChar(0, 0), false, objArr5);
                return ((java.lang.String) objArr5[0]).intern();
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), "\u0083\u0082\u0081", objArr6);
            if (str.startsWith(((java.lang.String) objArr6[0]).intern())) {
                int i2 = getInputFormats + 39;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufffe\u0001\ufffe\u0000\u0005", 2 / android.text.TextUtils.indexOf("", ""), 4 << android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 19), android.view.KeyEvent.getDeadChar(1, 1) + 126, true, objArr7);
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufffe\u0001\ufffe\u0000\u0005", 5 - android.text.TextUtils.indexOf("", ""), 3 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.getDeadChar(0, 0) + 68, false, objArr8);
                }
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr9);
                return ((java.lang.String) objArr9[0]).intern();
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0001�\u0004", 3 - android.text.TextUtils.indexOf("", "", 0, 0), 3 - android.view.View.resolveSize(0, 0), 69 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), true, objArr10);
            if (str.startsWith(((java.lang.String) objArr10[0]).intern())) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 127, "\u0091\u0082\u0090\u0082\u0081", objArr11);
                if (!str.startsWith(((java.lang.String) objArr11[0]).intern())) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ufffe\u0002\ufffe\u0001\u0005", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 68, false, objArr12);
                }
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0083\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0090\u0082\u0081", objArr13);
                return ((java.lang.String) objArr13[0]).intern();
            }
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(127 - android.view.View.MeasureSpec.getMode(0), "\u008b", objArr14);
            if (str.startsWith(((java.lang.String) objArr14[0]).intern())) {
                float maxVolume = android.media.AudioTrack.getMaxVolume();
                getInputFormats = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoSizes("+￡+￩￡", 6 - (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 3, 97 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), false, objArr15);
                java.lang.String intern = ((java.lang.String) objArr15[0]).intern();
                getHighSpeedVideoFpsRangesFor = (getInputFormats + 27) % 128;
                return intern;
            }
            getHighSpeedVideoFpsRangesFor = (getInputFormats + 7) % 128;
            return "";
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputSizeshNQ4ISI = -1231763838;
        getOutputStallDuration = new char[]{64357, 64380, 64377, 64294, 64335, 64325, 64316, 64314, 64305, 64306, 64356, 64359, 64350, 64293, 64315, 64376, 64382, 64379, 64378};
        getHighResolutionOutputSizeshNQ4ISI = -1074857042;
        getOutputFormats = true;
        getHighSpeedVideoSizes = true;
    }
}
