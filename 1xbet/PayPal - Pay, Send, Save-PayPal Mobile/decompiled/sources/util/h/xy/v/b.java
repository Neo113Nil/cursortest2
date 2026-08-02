package util.h.xy.v;

/* loaded from: classes5.dex */
public class b {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static byte[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static short[] getOutputMinFrameDuration;
    private static long getOutputSizes;
    private static char[] getOutputSizeshNQ4ISI;
    private static int getOutputStallDurationlomOqCM;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.v.b f2439;
    private final java.util.concurrent.ConcurrentHashMap<util.h.xy.v.b.mb, util.h.xy.v.ma> getOutputStallDuration = new java.util.concurrent.ConcurrentHashMap<>(util.h.xy.v.b.mb.f2475.ordinal());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = 108 - b;
        int i4 = 105 - i;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[s + 6];
        int i5 = s + 5;
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            int i8 = 0;
            int i9 = (i7 + (-i4)) - 5;
            i2 = i8;
            int i10 = i6;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            int i12 = i3;
            i6 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + (-i4)) - 5;
            i2 = i8;
            int i102 = i6;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = s3 * 2;
        int i3 = 103 - (s2 * 3);
        byte[] bArr = $$d;
        int i4 = (s * 2) + 4;
        byte[] bArr2 = new byte[35 - i2];
        int i5 = 34 - i2;
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            i = 0;
            int i8 = i6 + 1;
            i3 = (i4 + i7) - 3;
            i4 = i8;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i7 = bArr[i4];
            int i9 = i3;
            i6 = i4;
            i4 = i9;
            int i82 = i6 + 1;
            i3 = (i4 + i7) - 3;
            i4 = i82;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    static {
        byte[] bArr = {com.google.common.base.Ascii.ETB, -98, 35, com.google.common.base.Ascii.GS, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 27;
        byte[] bArr2 = {113, 1, -3, 74, -39, 43, -51, 43, -5, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 49;
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges();
        java.lang.String str = util.h.xy.al.ra.f366;
        java.lang.String str2 = util.h.xy.al.ra.f367;
        java.lang.String str3 = util.h.xy.al.ra.f708;
        java.lang.String str4 = util.h.xy.al.ra.f353;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 102, (byte) (-bArr2[19]), (byte) (bArr2[1] - 1), objArr);
        java.lang.String str5 = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = util.h.xy.v.b.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap2 == null) {
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((-1) - android.view.MotionEvent.axisFromString("")), 349 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 10 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str5, classLoader, false, 1410426302, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2), 1410426302};
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap3 == null) {
                char size = (char) (45285 - android.view.View.MeasureSpec.getSize(0));
                int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int i = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3;
                byte b = bArr[14];
                byte b2 = b;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, b2, b2, objArr4);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(size, combineMeasuredStates, i, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.view.View.combineMeasuredStates(0, 0) + 15771), android.view.View.resolveSizeAndState(0, 0, 0) + 104, 32 - android.view.MotionEvent.axisFromString("")), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r5, new int[]{r12}, new int[]{r10}, new int[1]};
                int i2 = ((int[]) objArr5[3])[0];
                int i3 = ((int[]) objArr5[2])[0];
                int i4 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                int i5 = ~uptimeMillis;
                int i6 = i2 + (-849779564) + ((1065236002 | i5) * (-757)) + ((~(1073641379 | uptimeMillis)) * 1514) + (((~(uptimeMillis | (-8405378))) | (~(i5 | 44331905)) | 1029309474) * 757);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr6[3])[0] = i8 ^ (i8 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) 97, bArr2[16], (byte) (-bArr2[21]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b3 = bArr2[16];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) 81, b3, (byte) (b3 | 13), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (49 | 12), bArr2[16], (byte) (-bArr2[58]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[12], (byte) (-bArr2[8]), bArr2[9], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) 37, bArr2[16], bArr2[41], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) (-bArr2[37]), (byte) (-bArr2[8]), (byte) (-bArr2[42]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(util.h.xy.v.b.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((byte) (-bArr2[58]), (byte) (bArr2[1] - 1), (byte) (-bArr2[8]), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str5, invoke2);
                    } else {
                        byte b4 = (byte) (bArr2[1] - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b4, b4, bArr2[14], objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str5);
                    }
                    java.lang.String str6 = util.h.xy.al.ra.f366;
                    java.lang.String str7 = util.h.xy.al.ra.f367;
                    java.lang.String str8 = util.h.xy.al.ra.f708;
                    java.lang.String str9 = util.h.xy.al.ra.f351;
                    getInputFormats = 512;
                    getHighSpeedVideoSizesFor = 16;
                    f2439 = new util.h.xy.v.b();
                    int i9 = getOutputFormats + 113;
                    getInputSizeshNQ4ISI = i9 % 128;
                    int i10 = ((int[]) objArr6[3])[0];
                    int i11 = i10 * i10;
                    int i12 = -(328419548 * i10);
                    int i13 = (i11 & i12) + (i11 | i12);
                    int i14 = -(i10 * (-1195923276));
                    int i15 = (((i13 | i14) << 1) - (i14 ^ i13)) - 2100552640;
                    int i16 = (i15 - (~((((i15 >> 28) - 31) / 16) + 1))) - 1;
                    int i17 = i15 >> 27;
                    int i18 = (((i17 | (-63)) << 1) - (i17 ^ (-63))) / 32;
                    int i19 = -(i16 ^ ((i18 & 1) + (i18 | 1)));
                    int i20 = (i19 & 3) + (i19 | 3);
                    int i21 = i20 >> 16;
                    int i22 = ((((-131071) | i21) << 1) - (i21 ^ (-131071))) / 65536;
                    int i23 = (i22 & 1) + (i22 | 1);
                    if (i9 % (4872 / (((-(((i23 | 1) << 1) - (i23 ^ 1))) & i20) * 812)) != 0) {
                        throw null;
                    }
                    return;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
            if (strArr2 != null) {
                for (java.lang.String str10 : strArr2) {
                    arrayList.add(str10);
                }
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class mb {
        private static long Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static final /* synthetic */ util.h.xy.v.b.mb[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;
        private static int getHighSpeedVideoSizesFor;
        private static char[] getOutputMinFrameDuration;

        /* renamed from: ı, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2440;

        /* renamed from: ǃ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2441;

        /* renamed from: ʲ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2442;

        /* renamed from: ʳ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2443;

        /* renamed from: ʴ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2444;

        /* renamed from: ʹ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2445;

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2446;

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2447;

        /* renamed from: ʽ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2448;

        /* renamed from: ʾ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2449;

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2450;

        /* renamed from: ˆ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2451;

        /* renamed from: ˇ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2452;

        /* renamed from: ˈ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2453;

        /* renamed from: ˉ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2454;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2455;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2456;

        /* renamed from: ˌ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2457;

        /* renamed from: ˍ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2458;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2459;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2460;

        /* renamed from: ː, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2461;

        /* renamed from: ˑ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2462;

        /* renamed from: ˡ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2463;

        /* renamed from: ˣ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2464;

        /* renamed from: ˮ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2465;

        /* renamed from: ͺ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2466;

        /* renamed from: ՙ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2467;

        /* renamed from: ו, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2468;

        /* renamed from: י, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2469;

        /* renamed from: ـ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2470;

        /* renamed from: ٴ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2471;

        /* renamed from: ۥ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2472;

        /* renamed from: ۦ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2473;

        /* renamed from: เ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2474;

        /* renamed from: Ꭵ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2475;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2476;

        /* renamed from: ᐟ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2477;

        /* renamed from: ᐠ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2478;

        /* renamed from: ᐡ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2479;

        /* renamed from: ᐣ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2480;

        /* renamed from: ᐤ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2481;

        /* renamed from: ᐧ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2482;

        /* renamed from: ᐨ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2483;

        /* renamed from: ᐩ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2484;

        /* renamed from: ᐪ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2485;

        /* renamed from: ᑊ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2486;

        /* renamed from: ᒢ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2487;

        /* renamed from: ᒽ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2488;

        /* renamed from: ᔇ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2489;

        /* renamed from: ᔈ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2490;

        /* renamed from: ᕀ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2491;

        /* renamed from: ᗮ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2492;

        /* renamed from: ᴵ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2493;

        /* renamed from: ᴶ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2494;

        /* renamed from: ᴸ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2495;

        /* renamed from: ᵀ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2496;

        /* renamed from: ᵋ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2497;

        /* renamed from: ᵎ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2498;

        /* renamed from: ᵔ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2499;

        /* renamed from: ᵕ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2500;

        /* renamed from: ᵗ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2501;

        /* renamed from: ᵢ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2502;

        /* renamed from: ᵣ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2503;

        /* renamed from: ι, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2504;

        /* renamed from: ⁱ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2505;

        /* renamed from: יִ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2506;

        /* renamed from: יּ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2507;

        /* renamed from: ﹳ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2508;

        /* renamed from: ﹶ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2509;

        /* renamed from: ﹺ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2510;

        /* renamed from: ｰ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2511;

        /* renamed from: ﾞ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2512;

        /* renamed from: ﾟ, reason: contains not printable characters */
        public static final util.h.xy.v.b.mb f2513;

        private mb(java.lang.String str, int i) {
        }

        public static util.h.xy.v.b.mb valueOf(java.lang.String str) {
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
            util.h.xy.v.b.mb mbVar = (util.h.xy.v.b.mb) java.lang.Enum.valueOf(util.h.xy.v.b.mb.class, str);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 17) % 128;
            return mbVar;
        }

        public static util.h.xy.v.b.mb[] values() {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            util.h.xy.v.b.mb[] mbVarArr = (util.h.xy.v.b.mb[]) getHighSpeedVideoFpsRanges.clone();
            getHighSpeedVideoSizesFor = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
            return mbVarArr;
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(25 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.Color.blue(0), (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
                f2476 = new util.h.xy.v.b.mb(((java.lang.String) objArr[0]).intern(), 0);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(16 - android.view.KeyEvent.getDeadChar(0, 0), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0), objArr2);
                f2460 = new util.h.xy.v.b.mb(((java.lang.String) objArr2[0]).intern(), 1);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(19 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.getTrimmedLength("") + 40, (char) (53653 - android.graphics.Color.blue(0)), objArr3);
                f2456 = new util.h.xy.v.b.mb(((java.lang.String) objArr3[0]).intern(), 2);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(17 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 60, (char) android.view.View.MeasureSpec.getSize(0), objArr4);
                f2459 = new util.h.xy.v.b.mb(((java.lang.String) objArr4[0]).intern(), 3);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(28 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 75 - android.view.MotionEvent.axisFromString(""), (char) android.graphics.Color.green(0), objArr5);
                f2455 = new util.h.xy.v.b.mb(((java.lang.String) objArr5[0]).intern(), 4);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(19 - android.view.View.getDefaultSize(0, 0), 105 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr6);
                f2446 = new util.h.xy.v.b.mb(((java.lang.String) objArr6[0]).intern(), 5);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(22 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 123 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (23719 - android.graphics.Color.blue(0)), objArr7);
                f2466 = new util.h.xy.v.b.mb(((java.lang.String) objArr7[0]).intern(), 6);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(25 - android.text.TextUtils.getOffsetAfter("", 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 143, (char) (28120 - android.graphics.Color.red(0)), objArr8);
                f2448 = new util.h.xy.v.b.mb(((java.lang.String) objArr8[0]).intern(), 7);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 170 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr9);
                f2447 = new util.h.xy.v.b.mb(((java.lang.String) objArr9[0]).intern(), 8);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 185 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                f2504 = new util.h.xy.v.b.mb(((java.lang.String) objArr10[0]).intern(), 9);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - android.text.TextUtils.getOffsetAfter("", 0), 203 - android.view.View.MeasureSpec.getMode(0), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1757), objArr11);
                f2450 = new util.h.xy.v.b.mb(((java.lang.String) objArr11[0]).intern(), 10);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 225 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr12);
                f2457 = new util.h.xy.v.b.mb(((java.lang.String) objArr12[0]).intern(), 11);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 22, 248 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr13);
                f2453 = new util.h.xy.v.b.mb(((java.lang.String) objArr13[0]).intern(), 12);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 21617), objArr14);
                f2454 = new util.h.xy.v.b.mb(((java.lang.String) objArr14[0]).intern(), 13);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - android.graphics.Color.alpha(0), 295 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr15);
                f2449 = new util.h.xy.v.b.mb(((java.lang.String) objArr15[0]).intern(), 14);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 317, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr16);
                f2483 = new util.h.xy.v.b.mb(((java.lang.String) objArr16[0]).intern(), 15);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 336, (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 18590), objArr17);
                f2462 = new util.h.xy.v.b.mb(((java.lang.String) objArr17[0]).intern(), 16);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 356 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52302), objArr18);
                f2470 = new util.h.xy.v.b.mb(((java.lang.String) objArr18[0]).intern(), 17);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(25 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 379, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr19);
                f2458 = new util.h.xy.v.b.mb(((java.lang.String) objArr19[0]).intern(), 18);
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 18, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 404, (char) (63841 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr20);
                f2482 = new util.h.xy.v.b.mb(((java.lang.String) objArr20[0]).intern(), 19);
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(25 - android.graphics.Color.blue(0), android.view.View.getDefaultSize(0, 0) + 422, (char) android.view.KeyEvent.normalizeMetaState(0), objArr21);
                f2508 = new util.h.xy.v.b.mb(((java.lang.String) objArr21[0]).intern(), 20);
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((tapTimeout >> 16) + 20, 447 - (longPressTimeout >> 16), (char) (38475 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr22);
                f2469 = new util.h.xy.v.b.mb(((java.lang.String) objArr22[0]).intern(), 21);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetAfter("", 0) + 25, android.graphics.Color.rgb(0, 0, 0) + 16777683, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr23);
                f2467 = new util.h.xy.v.b.mb(((java.lang.String) objArr23[0]).intern(), 22);
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(22 - (intValue >> 22), 492 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6337), objArr24);
                f2512 = new util.h.xy.v.b.mb(((java.lang.String) objArr24[0]).intern(), 23);
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.ImageFormat.getBitsPerPixel(0) + 29, (android.view.KeyEvent.getMaxKeyCode() >> 16) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 38574), objArr25);
                f2445 = new util.h.xy.v.b.mb(((java.lang.String) objArr25[0]).intern(), 24);
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(27 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 542, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 38740), objArr26);
                f2502 = new util.h.xy.v.b.mb(((java.lang.String) objArr26[0]).intern(), 25);
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 569, (char) android.text.TextUtils.getOffsetAfter("", 0), objArr27);
                f2498 = new util.h.xy.v.b.mb(((java.lang.String) objArr27[0]).intern(), 26);
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, android.view.View.MeasureSpec.getSize(0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1638), objArr28);
                f2471 = new util.h.xy.v.b.mb(((java.lang.String) objArr28[0]).intern(), 27);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) + 33, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 626, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr29);
                f2493 = new util.h.xy.v.b.mb(((java.lang.String) objArr29[0]).intern(), 28);
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 33, 659 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr30);
                f2499 = new util.h.xy.v.b.mb(((java.lang.String) objArr30[0]).intern(), 29);
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(29 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 691, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr31);
                f2509 = new util.h.xy.v.b.mb(((java.lang.String) objArr31[0]).intern(), 30);
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(33 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.graphics.Color.green(0) + 721, (char) (60224 - android.text.TextUtils.getOffsetAfter("", 0)), objArr32);
                f2443 = new util.h.xy.v.b.mb(((java.lang.String) objArr32[0]).intern(), 31);
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.KeyEvent.keyCodeFromString("") + 753, (char) (48835 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr33);
                f2511 = new util.h.xy.v.b.mb(((java.lang.String) objArr33[0]).intern(), 32);
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, android.view.KeyEvent.getDeadChar(0, 0) + 780, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 50615), objArr34);
                f2510 = new util.h.xy.v.b.mb(((java.lang.String) objArr34[0]).intern(), 33);
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(25 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 804 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48614), objArr35);
                f2505 = new util.h.xy.v.b.mb(((java.lang.String) objArr35[0]).intern(), 34);
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, 829 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), objArr36);
                f2444 = new util.h.xy.v.b.mb(((java.lang.String) objArr36[0]).intern(), 35);
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(38 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 856 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr37);
                f2452 = new util.h.xy.v.b.mb(((java.lang.String) objArr37[0]).intern(), 36);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 19, 894 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (27846 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr38);
                f2463 = new util.h.xy.v.b.mb(((java.lang.String) objArr38[0]).intern(), 37);
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(20 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 912, (char) (android.view.View.getDefaultSize(0, 0) + 23724), objArr39);
                f2451 = new util.h.xy.v.b.mb(((java.lang.String) objArr39[0]).intern(), 38);
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(21 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 932, (char) (40400 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr40);
                f2465 = new util.h.xy.v.b.mb(((java.lang.String) objArr40[0]).intern(), 39);
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 952 - android.view.MotionEvent.axisFromString(""), (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr41);
                f2480 = new util.h.xy.v.b.mb(((java.lang.String) objArr41[0]).intern(), 40);
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0, 0) + 20, 976 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr42);
                f2472 = new util.h.xy.v.b.mb(((java.lang.String) objArr42[0]).intern(), 41);
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12, 997 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 12187), objArr43);
                f2484 = new util.h.xy.v.b.mb(((java.lang.String) objArr43[0]).intern(), 42);
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) + 14, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1008, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr44);
                f2486 = new util.h.xy.v.b.mb(((java.lang.String) objArr44[0]).intern(), 43);
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetAfter("", 0) + 20, 1021 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (62271 - android.graphics.Color.blue(0)), objArr45);
                f2478 = new util.h.xy.v.b.mb(((java.lang.String) objArr45[0]).intern(), 44);
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 20, 1042 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (27733 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr46);
                f2506 = new util.h.xy.v.b.mb(((java.lang.String) objArr46[0]).intern(), 45);
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 26, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 822), objArr47);
                f2503 = new util.h.xy.v.b.mb(((java.lang.String) objArr47[0]).intern(), 46);
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - android.text.TextUtils.getOffsetBefore("", 0), 1088 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr48);
                f2500 = new util.h.xy.v.b.mb(((java.lang.String) objArr48[0]).intern(), 47);
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.graphics.Color.rgb(0, 0, 0) + 16778322, (char) (22569 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr49);
                f2491 = new util.h.xy.v.b.mb(((java.lang.String) objArr49[0]).intern(), 48);
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 20, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1124, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33446), objArr50);
                f2507 = new util.h.xy.v.b.mb(((java.lang.String) objArr50[0]).intern(), 49);
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(24 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1144, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 52209), objArr51);
                f2488 = new util.h.xy.v.b.mb(((java.lang.String) objArr51[0]).intern(), 50);
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 22, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1169, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49987), objArr52);
                f2477 = new util.h.xy.v.b.mb(((java.lang.String) objArr52[0]).intern(), 51);
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1191, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26586), objArr53);
                f2485 = new util.h.xy.v.b.mb(((java.lang.String) objArr53[0]).intern(), 52);
                java.lang.Object[] objArr54 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18, 1219 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr54);
                f2479 = new util.h.xy.v.b.mb(((java.lang.String) objArr54[0]).intern(), 53);
                java.lang.Object[] objArr55 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1238, (char) android.graphics.Color.green(0), objArr55);
                f2489 = new util.h.xy.v.b.mb(((java.lang.String) objArr55[0]).intern(), 54);
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1267, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34797), objArr56);
                f2490 = new util.h.xy.v.b.mb(((java.lang.String) objArr56[0]).intern(), 55);
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 1293 - android.graphics.Color.green(0), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 57323), objArr57);
                f2492 = new util.h.xy.v.b.mb(((java.lang.String) objArr57[0]).intern(), 56);
                java.lang.Object[] objArr58 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1328, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr58);
                f2496 = new util.h.xy.v.b.mb(((java.lang.String) objArr58[0]).intern(), 57);
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 42, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1369, (char) (android.view.KeyEvent.normalizeMetaState(0) + 50631), objArr59);
                f2495 = new util.h.xy.v.b.mb(((java.lang.String) objArr59[0]).intern(), 58);
                java.lang.Object[] objArr60 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 31, android.graphics.Color.rgb(0, 0, 0) + 16778627, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13187), objArr60);
                f2494 = new util.h.xy.v.b.mb(((java.lang.String) objArr60[0]).intern(), 59);
                java.lang.Object[] objArr61 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(28 - android.graphics.Color.argb(0, 0, 0, 0), 1443 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr61);
                f2441 = new util.h.xy.v.b.mb(((java.lang.String) objArr61[0]).intern(), 60);
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 25, 1470 - android.graphics.Color.blue(0), (char) (android.view.View.getDefaultSize(0, 0) + 6681), objArr62);
                f2497 = new util.h.xy.v.b.mb(((java.lang.String) objArr62[0]).intern(), 61);
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(24 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1496, (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 3214), objArr63);
                f2513 = new util.h.xy.v.b.mb(((java.lang.String) objArr63[0]).intern(), 62);
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(31 - android.graphics.ImageFormat.getBitsPerPixel(0), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1519, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr64);
                f2440 = new util.h.xy.v.b.mb(((java.lang.String) objArr64[0]).intern(), 63);
                java.lang.Object[] objArr65 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(23 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1551 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.MotionEvent.axisFromString("") + 1), objArr65);
                f2501 = new util.h.xy.v.b.mb(((java.lang.String) objArr65[0]).intern(), 64);
                java.lang.Object[] objArr66 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 25, 1575 - android.view.View.combineMeasuredStates(0, 0), (char) (56595 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr66);
                f2473 = new util.h.xy.v.b.mb(((java.lang.String) objArr66[0]).intern(), 65);
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1601, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr67);
                f2461 = new util.h.xy.v.b.mb(((java.lang.String) objArr67[0]).intern(), 66);
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 22, android.graphics.ImageFormat.getBitsPerPixel(0) + 1630, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 39271), objArr68);
                f2464 = new util.h.xy.v.b.mb(((java.lang.String) objArr68[0]).intern(), 67);
                java.lang.Object[] objArr69 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(26 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.green(0) + 1651, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 61472), objArr69);
                f2468 = new util.h.xy.v.b.mb(((java.lang.String) objArr69[0]).intern(), 68);
                java.lang.Object[] objArr70 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 29, 1678 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 9615), objArr70);
                f2442 = new util.h.xy.v.b.mb(((java.lang.String) objArr70[0]).intern(), 69);
                java.lang.Object[] objArr71 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, android.view.Gravity.getAbsoluteGravity(0, 0) + 1707, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr71);
                f2487 = new util.h.xy.v.b.mb(((java.lang.String) objArr71[0]).intern(), 70);
                java.lang.Object[] objArr72 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(20 - android.widget.ExpandableListView.getPackedPositionType(0L), 1737 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr72);
                f2481 = new util.h.xy.v.b.mb(((java.lang.String) objArr72[0]).intern(), 71);
                java.lang.Object[] objArr73 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(22 - android.view.View.resolveSizeAndState(0, 0, 0), 1756 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr73);
                f2474 = new util.h.xy.v.b.mb(((java.lang.String) objArr73[0]).intern(), 72);
                java.lang.Object[] objArr74 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(13 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1779, (char) android.graphics.Color.alpha(0), objArr74);
                f2475 = new util.h.xy.v.b.mb(((java.lang.String) objArr74[0]).intern(), 73);
                int i = (getHighSpeedVideoSizesFor + 47) % 128;
                getHighResolutionOutputSizeshNQ4ISI = i;
                util.h.xy.v.b.mb[] mbVarArr = {f2476, f2460, f2456, f2459, f2455, f2446, f2466, f2448, f2447, f2504, f2450, f2457, f2453, f2454, f2449, f2483, f2462, f2470, f2458, f2482, f2508, f2469, f2467, f2512, f2445, f2502, f2498, f2471, f2493, f2499, f2509, f2443, f2511, f2510, f2505, f2444, f2452, f2463, f2451, f2465, f2480, f2472, f2484, f2486, f2478, f2506, f2503, f2500, f2491, f2507, f2488, f2477, f2485, f2479, f2489, f2490, f2492, f2496, f2495, f2494, f2441, f2497, f2513, f2440, f2501, f2473, f2461, f2464, f2468, f2442, f2487, f2481, f2474, f2475};
                getHighSpeedVideoSizesFor = (i + 43) % 128;
                getHighSpeedVideoFpsRanges = mbVarArr;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 25) % 128;
                jArr[rbVar.f2651] = (((char) (getOutputMinFrameDuration[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
                rbVar.f2651++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 5) % 128;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            }
            java.lang.String str = new java.lang.String(cArr);
            int i3 = getHighSpeedVideoFpsRangesFor + 33;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        static void getHighSpeedVideoFpsRangesFor() {
            char[] cArr = new char[1792];
            java.nio.ByteBuffer.wrap("\u009cK\u0007LªFMWð]\u009b\\>\\¡WD\\ïI\u0092L5\u007fØfCiæf\u0089a,p×|zs\u001dg\u0080|+nÎ\u0007q\u0011\u009cK\u0007LªFMWðN\u009bB>V¡UDKïE\u0092Q5aØqCoæ}\u0089iMÞÖÙ{Ó\u009cÂ!ßJÞïÒpÞ\u0095Ø>×CÄäê\tó\u0092ü7ðXíýá\u0006ÿ«ö\u009cK\u0007LªFMWð^\u009bK>G¡KDIï[\u0092K5hØzCbæj\u0089x,p\u009cK\u0007LªFMWð^\u009bK>]¡PDFïY\u0092P5nØqCgæh\u0089x,}×wzd\u001dk\u0080b+nÎ\u0011q\u000b\u0014\u000f¿\u0003\"\u0003Å\u0015\u009cK\u0007LªFMWð^\u009bK>]¡PDFïK\u0092M5\u007fØuCtæd\u0089j,x×~zrÀì[ëöá\u0011ð¬ùÇìbúý÷\u0018á³ùÎëiÕ\u0084Ò\u001fÞºÜÕÙpÙ\u008bÓ&ÙAÓÜßñ\u0093j\u0094Ç\u009e \u008f\u009d\u0099ö\u0099S\u008aÌ\u0088)\u009e\u0082\u0081ÿ\u0095X½µ¹.¡\u008b°ä»A§º¾\u0017®p£í±Fª£Þ\u001cÏyÂ\u009cK\u0007LªFMWðA\u009bA>R¡PDFïY\u0092M5eØaCyæz\u0089~\u009cK\u0007LªFMWðA\u009bA>R¡PDFïY\u0092M5eØaCyæo\u0089\u007f,c×b\u009a\u0096\u0001\u0091¬\u009bK\u008aö\u0097\u009d\u00968\u009a§\u0096B\u0080é\u0082\u0094\u00843¼Þ\u00adE·à¢\u008f®*¼Ñ½|¥\u001b£\u0086©-¯ÈÛ\u009cK\u0007LªFMWðD\u009bH>L¡RDPïV\u0092Z5\u007fØaCgæ\u007f\u0089i,n×qzv\u001d{\u0080u+{Î\u0007\u009cK\u0007LªFMWð_\u009bK>^¡[DOï_\u0092@5cØdCeæc\u0089i,u×mzs\u001dy\u0080i+\u007fÈ:S=þ7\u0019&¤;Ï:j6õ:\u0010)»/Æ*a\u000e\u008c\u001b\u0017\u0007²\u000eÝ\u0014x\u000f\u0083\r.\u0019I\rÔ\r\u007f\u001b\u009as\u009cK\u0007LªFMWð^\u009bK>G¡KDXï^\u0092[5\u007fØjCvæ\u007f\u0089e,~×|zh\u001d|\u0080|+jÎ\u0002\u009cK\u0007LªFMWð^\u009bK>G¡KDNï[\u0092S5lØ`Cræt\u0089|,x×|ÔÕOÒâØ\u0005É¸ÅÓÕvßéÃ\fÁ§ÝÚÞ}é\u0090ú\u000bô®ùÁ÷dû\u009fó2ùUïÈíP\u0005Ë\u0002f\b\u0081\u0019<\u0016W\u0010ò\u0019m\u001b\u0088\u0003#\u0011^\u000eù>\u00149\u008f'*5E'à-\u001b(¶ Ñ)L%ç1\u0002A\u009cK\u0007LªFMWð_\u009bK>G¡FDPï_\u0092I5eØzCvæy\u0089c,a×wze\u001dl\u0080d+aÎ\u0015q\u0005\u0014\u0005e)þ.S$´5\t&b?Ç.X5½3\u0016'k+Ì\u0007!\u0015º\r\u001f\u000fp\u0007Õ\u0016.\u0014\u009cK\u0007LªFMWð^\u009bK>G¡KDZï^\u0092\\5vØhCyæj\u0089y,e×zzh\u001dk\u0080i+\u007fÎ\u0017q\u0011\u0014\u001a\n\u0000\u0091\u0007<\rÛ\u001cf\u0015\r\u0000¨\f7\u0000Ò\u0007y\u0002\u0004\u0011£9N1Õ.p/\u001f)º)A<ì2\u008b'\u009cK\u0007LªFMWð_\u009bK>@¡QDMïE\u0092M5iØvCmæt\u0089m,w×fzr\u001dj\u0080b+\u007fÎ\u0016q\u0010\u0014\u0001\u0084º\u001f½²·U¦è»\u0083º&¶¹º\\£÷®\u008a·-\u008eÀ\u0082[\u0096þ\u0096\u0091\u00824\u0090Ï\u0086b\u0094\u0005\u0080\u0098\u00833\u008b\næ\u0091á<ëÛúfó\ræ¨ð7ýÒëyä\u0004û£ÊNÆÕÊpÒ\u001fÔºÎAÚìÅ\u008bÁ\u0016ß½ÌX ç¨\u0082°)®´´S¸\u000b\u0018\u0090\u001f=\u0015Ú\u0004g\u0017\f\u0013©\t6\u0013Ó\u0015x\n\u0005\u001a¢>O)Ô'q1\u001e,»)@>í)\u008a,\u0017<¼2YFæ^\u0083I(X\u009cK\u0007LªFMWð_\u009bK>^¡[DOï_\u0092@5cØpCtæy\u0089i,\u007f×fzh\u001dy\u0080~+}Î\u0016q\t\u0014\u001c¿\u0006\"\u000eÅ\u0004h\u001a\u0013\u0004\u009a.\u0001)¬#K2ö:\u009d.8;§>B*é:\u0094%3\u0006Þ\u0016E\u000eà\u0011\u008f\u001b*\u001dÑ\u0004|\u0019\u001b\u0002\u0086\u0015-\u001cÈtw~\u0012z¹f$yÃt\u009cK\u0007LªFMWð^\u009bK>G¡KDZï^\u0092\\5vØhCyæj\u0089y,e×zzh\u001dk\u0080i+\u007fÎ\u0017q\u0011\u0014\u001a¿\u0015\"\fÅ\u001fh\u0017\u0013\u0017¶\u001fY\u001bü$\u009cK\u0007LªFMWð_\u009bK>@¡QDMïE\u0092M5iØvCmæt\u0089m,w×fzr\u001dj\u0080b+\u007fÎ\u0016q\u0010\u0014\u0001¿\u0015\"\fÅ\u001fh\u0017\u0013\u0017¶\u001fY\u001bü$\u009cK\u0007LªFMWð[\u009bK>A¡]D_ïC\u0092@5wØdCjæg\u0089i,e×mzg\u001dq\u0080s+aÎ\u0000q\u000b\u0014\u000b¿\u000b\"\u000bÅ\u0017h\u0010w\u000bì\fA\u0006¦\u0017\u001b\u001ep\u000bÕ\u001dJ\u0010¯\u0006\u0004\u001by\nÞ83:¨5\r\"b+Ç?<3\u0091#ö-k/À;%\\\u009aPÿFTUÉA.Q\u0083Aø_]M²Y\"\u0088¹\u008f\u0014\u0085ó\u0094N\u009c%\u0088\u0080\u009d\u001f\u0098ú\u008cQ\u009c,\u0083\u008b f°ý¨X·7½\u0092»i¢Ä¿£¤>³\u0095ºpÒÏØªË\u0001Å\u009cÀYýÂúoð\u0088á5ò^öûìdö\u0081ð*ïWÿðÛ\u001dÌ\u0086Â#ÔLÉéÌ\u0012Û¿ÌØÉEÙî×\u000b¸´±!\u00adºª\u0017 ð±M¹&\u00ad\u0083¸\u001c½ù©R¹/¦\u0088\u0085e\u0095þ\u008d[\u00924\u0098\u0091\u009ej\u0087Ç\u009a \u0081=\u0096\u0096\u009fs÷Ìý©â\u0002ï\u009cK\u0007LªFMWð^\u009bK>]¡PDFïY\u0092^5rØaCyæ\u007f\u0089c,z×wzy\u001dq\u0080g+{Î\u0007q\u001b\u0014\u0000¿\u000e\u009cK\u0007LªFMWðA\u009bA>R¡PDFï[\u0092Q5dØzCuæ\u007f\u0089c,c×wzh\u001dk\u0080t+yÎ\rq\u0005\u0014\u001d¿\u001f\"\u001dÅ\u0015h\n\u0013\u0013¶\u0016Y\fü5g;\n8\u00ad<P;û\"ð\u008ek\u0089Æ\u0083!\u0092\u009c\u008b÷\u0087R\u0093Í\u0090(\u008e\u0083\u0080þ\u009cY·´©/°\u008aºå¶@ »¶\u0016¢Àç[àöê\u0011û¬ñÇðbðýû\u0018ð³åÎàiÓ\u0084Ø\u001fØºØÕÃpÒ\u008bÚ&Þ\u0001\u009a\u009a\u009d7\u0097Ð\u0086m\u0095\u0006\u0091£\u008b<\u0091Ù\u0097r\u0088\u000f\u0098¨¼E«Þ¥{³\u0014®±«J¼ç«\u0080®\u001d¾\u009cK\u0007LªFMWð_\u009bK>^¡[DOï_\u0092@5cØsCkæt\u0089~,x×az|\u001dg\u0080p+yÎ\u0011\u009cK\u0007LªFMWðJ\u009bK>G¡KDPïT\u0092P5dØ`Cyæe\u0089y,|×pzr\u001dj³Ð(×\u0085ÝbÌßß´Û\u0011Á\u008eÛkÝÀÂ½×\u001aù\u009cK\u0007LªFMWð^\u009bK>G¡KDIïJ\u0092L5eØfCootôsYy¾h\u0003~h~ÍmRo·y\u001cfarÆZ+^°\\\u0015ZzGßG$L\u0089DîTð\u001fk\u0018Æ\u0012!\u0003\u009c\u000b÷\u001fR\u0006Í\u0004(\u0012\u0083\u0014þ\bY8´./$\u008a:å*@6»/\u0016,q\"\u009f~\u0004y©sNbój\u0098~=g¢eGsìu\u0091i6YÛO@PåQ\u008aT/TÔFyV\u001eD\u0083J(BÍ:r8\u0017(¼&\u009cK\u0007LªFMWð_\u009bA>\\¡@DFï^\u0092Z5tØ`Ceæ\u007f\u0089e,~×|Äb_eòo\u0015~¨lÃhfuùv\u001co·wÊsm]\u0080I\u001bL¾VÑLtW\u008fU\u001eì\u0085ë(áÏðrø\u0019ì¼õ#÷Æámû\u0010ñ·ÉZÅÁÄdÞ\u000bÛ®ÄUÜøÞ\u009fËWºÌ½a·\u0086¦;¬P\u00adõ\u00adj¦\u008f\u00ad$¸Y½þ\u008e\u0013\u0095\u0088\u0087-\u009eB\u0088ç\u009f\u001c\u008a±\u0088Ö\u009dK\u0089à\u009d\u0005üºôßô_\tÄ\u000ei\u0004\u008e\u00153\fX\u0003ý\u001cb\u0006\u0087\u000e,\fQ\u0018ö=\u001b&\u00801%=J&ï,\u0014&¹4Þ6C*è9û\u0090`\u0097Í\u009d*\u008c\u0097\u0086ü\u0087Y\u0087Æ\u008c#\u0087\u0088\u0092õ\u0097R¤¿º$®\u0081¢î§Kµ°½\u001d¾z¢ç¨L¶©Ù\u0016ÜsÆØØEÛ¢Å\u009cK\u0007LªFMWð^\u009bK>G¡KDZïH\u0092Z5dØ`Chæ\u007f\u0089e,p×~zd\u009cK\u0007LªFMWðC\u009bO>G¡]DOï_\u0092@5dØ`Cdæ~\u0089k,v×wze\u001dg\u0080y+{Î\u0017q\u0001\u0014\n¿\u001e\"\u0006Å\u001fh\u001b\u001b¦\u0080¡-«Êºw²\u001c¦¹\u00ad&¼Ã h¨\u0015¦²\u0084_\u0085Ä\u008ea\u0099\u000e\u008e«\u009aP\u0080ý\u0096\u009a\u0094\u0007\u0083¬\u0087Iñöê\u0093ì8ñC Ø§u\u00ad\u0092¼/ªDªá¹~»\u009b\u00ad0°Mºê\u008f\u0007\u0091\u009c\u009e9\u0094V\u0088ó\u0088\b\u009c¥\u0083Â\u0080_\u009fô\u0092\u0011æ®îËö`ôýö\u001aþ·áÌéiâ\u0086ï#Õ¸ÅÕÃrÄ\u009cK\u0007LªFMWðA\u009bX>G¡KDUïU\u0092^5dØzCgæe\u0089h,n×azc\u001dw\u0080o+{Î\u001cq\u0017\u0014\u0000¿\r\"\u0001Å\u0011h\u0001\u0013\u0003¶\tY\u0019ü>g6\n5\u00ad0P2û\"\u009e<\u00013Y\u008cÂ\u008bo\u0081\u0088\u00905\u0086^\u009fû\u0080d\u008c\u0081\u0092*\u0092W\u0099ð£\u001d½\u0086 #¢L¯é©\u0012¦¿¤Ø°E¨î¼\u000bÛ´ÐÑÇzÊçÆ\u0000Ö\u00adÆÖÄsÎ\u009cÞ9ù¢àÏíhÿ\u0095þ>ð[ëÄçaè\u008añ¯È4Ï\u0099Å~ÔÃÀ¨Â\rÞ\u0092ÈwÞÜÜ¡Ú\u0006âëópéÕüºð\u001fâäãIû.ý³÷\u0018ñý\u0085B\u0098'\u0086\u008c\u0086\u0011\u008dö\u0097[\u009f \u009b\u0085\u009f\u009cK\u0007LªFMWðC\u009bA>]¡KD]ï_\u0092Y5aØpCjæ\u007f\u0089s,r×sze\u001d|\u0080b+nÎ\u0002q\u001d\u0014\u0004¿\u000f\"\u0001Å\u0004\u0086R\u001dU°_WNêW\u0081X$G»]^UõW\u0088C/fÂ}Yzüa\u0093j6cÍh`x\u0007~\u009ar1fÔ\u0016k\b\u000e\u0015\u0090Å\u000bÂ¦ÈAÙüÀ\u0097Ï2Ð\u00adÊHÂãÀ\u009eÔ9ñÔæOéêæ\u0085ý ôÛÿvï\u0011é\u008cå'ñÂ\u0081}\u009f\u0018\u0082\u009cK\u0007LªFMWð^\u009bK>]¡PDFï[\u0092J5xØzCeæd\u0089b,e×szt\u001dl\u0080q+{Î\u0010q\u0017\u0014\u0016¿\u001a\"\u001dÅ\u001fh\u0013\u0013\u001f¶\u0017Y\u0019\u009cK\u0007LªFMWð^\u009bK>]¡PDFï[\u0092J5xØzCwæy\u0089s,a×`zx\u001d~\u0080t+rÎ\u0006AXÚ_wU\u0090D-MFXãN|C\u0099U2HOYèk\u0005i\u009eq;kTmñr\n~§tÀy]aök\u0013\u0019¬\u001bÉ\u001f\u009cK\u0007LªFMWðA\u009bA>R¡PDFï[\u0092J5xØzCeæy\u0089i,u×mzt\u001dw\u0080s+jÎ\u0002q\u0007\u0014\u001d¿\u0006\"\nÅ\u0003h\u0006\u0005,\u009e+3!Ô0i&\u0002&§587Ý!v<\u000b-¬\u001fA\u001dÚ\u0002\u007f\u001e\u0010\u000eµ\u0012N\nã\u0014\u0084\f\u0019\b²\tlk÷lZf½w\u0000xk~ÎwQu´m\u001f\u007fb`ÅA(P³^\u0016Ty\\ÜC']\u008aGí]pOÛJ>:\u0081;ä?O+Ò#¹Å\"Â\u008fÈhÙÕÑ¾Å\u001bÉ\u0084ÈaÞÊÑ·Ç\u0010ëýôféÃð¬ú\tàòì_ë8ù¥ã\u000eõë\u009fT\u009e1\u009e\u009a\u009b\u0007\u0097à\u009fM\u0097\u009cK\u0007LªFMWð^\u009bK>]¡PDFï[\u0092J5xØzCeæj\u0089~,u×mzc\u001dw\u0080v+{Î\rq\r\u0014\u0013¿\u000f\"\u000bÅ\u000fh\u001c\u0013\u0012\u009cK\u0007LªFMWðA\u009bA>R¡PDFï[\u0092J5xØzCeæy\u0089i,u×mzf\u001dj\u009cK\u0007LªFMWð_\u009bK>@¡QDMïE\u0092\\5dØfCpæf\u0089s,b×fzv\u001dl\u0080h+m\u009cK\u0007LªFMWðA\u009bO>@¡@DFïY\u0092^5lØi".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1792);
            getOutputMinFrameDuration = cArr;
            Camera2StreamConfigurationMap = 7900419416008951554L;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 43) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputSizes))) ^ c;
            rbVar.f2651++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 57) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 31) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private b() {
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.v.ma m27609(util.h.xy.v.b.mb mbVar) {
        int i = getOutputFormats + 7;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.ma maVar = this.getOutputStallDuration.get(mbVar);
        if (i % 2 == 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: util.h.xy.v.b$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[util.h.xy.v.ma.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[util.h.xy.v.ma.f2583.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2525.ordinal()] = 2;
                int i = getHighSpeedVideoSizes;
                int i2 = ((i | 1) << 1) - (i ^ 1);
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2536.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2527.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2533.ordinal()] = 5;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 117) % 128;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2535.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2614.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2559.ordinal()] = 8;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2524.ordinal()] = 9;
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 71) % 128;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2566.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2538.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2564.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2568.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2570.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2605.ordinal()] = 15;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2595.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2581.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2604.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2600.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2576.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2560.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2562.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2574.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2569.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2588.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2589.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2585.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2596.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2577.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2587.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2615.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2515.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2517.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2544.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2555.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2590.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2514.ordinal()] = 37;
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i4 & 119) + (i4 | 119)) % 128;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2540.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2551.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2592.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2599.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2553.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2594.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2586.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2609.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2603.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2613.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2611.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2518.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2607.ordinal()] = 50;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2522.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2531.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2519.ordinal()] = 53;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2546.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2530.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2554.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2542.ordinal()] = 57;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2608.ordinal()] = 58;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2601.ordinal()] = 59;
                int i5 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = ((i5 ^ 117) + ((i5 & 117) << 1)) % 128;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2516.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2529.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2612.ordinal()] = 62;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2606.ordinal()] = 63;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2528.ordinal()] = 64;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2521.ordinal()] = 65;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2520.ordinal()] = 66;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2543.ordinal()] = 67;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2545.ordinal()] = 68;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2548.ordinal()] = 69;
            } catch (java.lang.NoSuchFieldError unused69) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2563.ordinal()] = 70;
            } catch (java.lang.NoSuchFieldError unused70) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2556.ordinal()] = 71;
            } catch (java.lang.NoSuchFieldError unused71) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2580.ordinal()] = 72;
            } catch (java.lang.NoSuchFieldError unused72) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2578.ordinal()] = 73;
            } catch (java.lang.NoSuchFieldError unused73) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2573.ordinal()] = 74;
            } catch (java.lang.NoSuchFieldError unused74) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2575.ordinal()] = 75;
            } catch (java.lang.NoSuchFieldError unused75) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2579.ordinal()] = 76;
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i6 & 95) + (i6 | 95)) % 128;
            } catch (java.lang.NoSuchFieldError unused76) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2558.ordinal()] = 77;
            } catch (java.lang.NoSuchFieldError unused77) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2557.ordinal()] = 78;
            } catch (java.lang.NoSuchFieldError unused78) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2565.ordinal()] = 79;
            } catch (java.lang.NoSuchFieldError unused79) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2598.ordinal()] = 80;
            } catch (java.lang.NoSuchFieldError unused80) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2593.ordinal()] = 81;
            } catch (java.lang.NoSuchFieldError unused81) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2572.ordinal()] = 82;
            } catch (java.lang.NoSuchFieldError unused82) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2597.ordinal()] = 83;
            } catch (java.lang.NoSuchFieldError unused83) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.v.ma.f2610.ordinal()] = 84;
            } catch (java.lang.NoSuchFieldError unused84) {
            }
            int i7 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (((i7 | 75) << 1) - (75 ^ i7)) % 128;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getHighSpeedVideoFpsRangesFor;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getHighSpeedVideoFpsRangesFor[((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getOutputMinFrameDuration[((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputStallDurationlomOqCM ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoFpsRangesFor;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m27597(util.h.xy.v.b.mb mbVar, util.h.xy.v.ma maVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, 21 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.indexOf("", "", 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        if (maVar != util.h.xy.v.ma.f2539) {
            try {
                switch (util.h.xy.v.b.AnonymousClass2.getHighSpeedVideoFpsRanges[maVar.ordinal()]) {
                    case 1:
                        int m27668 = maVar.m27668();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, android.graphics.Color.rgb(0, 0, 0) + 16777216, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 38212), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(mbVar.ordinal());
                        sb.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m27668, sb.toString());
                    case 2:
                        int m276682 = maVar.m27668();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(33 - android.view.View.getDefaultSize(0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 51786), objArr3);
                        sb2.append(((java.lang.String) objArr3[0]).intern());
                        sb2.append(mbVar.ordinal());
                        sb2.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276682, sb2.toString());
                    case 3:
                        int m276683 = maVar.m27668();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.blue(0) + 57, 56 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (34172 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr4);
                        sb3.append(((java.lang.String) objArr4[0]).intern());
                        sb3.append(mbVar.ordinal());
                        sb3.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276683, sb3.toString());
                    case 4:
                        int m276684 = maVar.m27668();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 112 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (17815 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr5);
                        sb4.append(((java.lang.String) objArr5[0]).intern());
                        sb4.append(mbVar.ordinal());
                        sb4.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276684, sb4.toString());
                    case 5:
                        int m276685 = maVar.m27668();
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47, android.view.KeyEvent.getDeadChar(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, (char) (android.view.View.getDefaultSize(0, 0) + 31346), objArr6);
                        sb5.append(((java.lang.String) objArr6[0]).intern());
                        sb5.append(mbVar.ordinal());
                        sb5.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276685, sb5.toString());
                    case 6:
                        int m276686 = maVar.m27668();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.View.getDefaultSize(0, 0) + 32, 211 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39231), objArr7);
                        sb6.append(((java.lang.String) objArr7[0]).intern());
                        sb6.append(mbVar.ordinal());
                        sb6.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276686, sb6.toString());
                    case 7:
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(35 - android.text.TextUtils.indexOf("", "", 0, 0), 242 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""), objArr8);
                        sb7.append(((java.lang.String) objArr8[0]).intern());
                        sb7.append(mbVar.ordinal());
                        sb7.append(intern);
                        throw new util.h.xy.ab.b(sb7.toString());
                    case 8:
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 277 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), objArr9);
                        sb8.append(((java.lang.String) objArr9[0]).intern());
                        sb8.append(mbVar.ordinal());
                        sb8.append(intern);
                        throw new util.h.xy.ab.b(sb8.toString());
                    case 9:
                        int m276687 = maVar.m27668();
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.graphics.ImageFormat.getBitsPerPixel(0) + 36, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 305, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr10);
                        sb9.append(((java.lang.String) objArr10[0]).intern());
                        sb9.append(mbVar.ordinal());
                        sb9.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276687, sb9.toString());
                    case 10:
                        int m276688 = maVar.m27668();
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 42, android.text.TextUtils.getOffsetAfter("", 0) + 340, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr11);
                        sb10.append(((java.lang.String) objArr11[0]).intern());
                        sb10.append(mbVar.ordinal());
                        sb10.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276688, sb10.toString());
                    case 11:
                        int m276689 = maVar.m27668();
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(29 - android.text.TextUtils.indexOf("", "", 0, 0), 382 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                        sb11.append(((java.lang.String) objArr12[0]).intern());
                        sb11.append(mbVar.ordinal());
                        sb11.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m276689, sb11.toString());
                    case 12:
                        int m2766810 = maVar.m27668();
                        java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.blue(0) + 26, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 410, (char) (33821 - android.view.KeyEvent.keyCodeFromString("")), objArr13);
                        sb12.append(((java.lang.String) objArr13[0]).intern());
                        sb12.append(mbVar.ordinal());
                        sb12.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766810, sb12.toString());
                    case 13:
                        int m2766811 = maVar.m27668();
                        java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(53 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 437 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (35831 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr14);
                        sb13.append(((java.lang.String) objArr14[0]).intern());
                        sb13.append(mbVar.ordinal());
                        sb13.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766811, sb13.toString());
                    case 14:
                        int m2766812 = maVar.m27668();
                        java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.graphics.Color.argb(0, 0, 0, 0) + 30, 490 - android.text.TextUtils.indexOf("", "", 0), (char) (25210 - android.view.View.combineMeasuredStates(0, 0)), objArr15);
                        sb14.append(((java.lang.String) objArr15[0]).intern());
                        sb14.append(mbVar.ordinal());
                        sb14.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766812, sb14.toString());
                    case 15:
                        int m2766813 = maVar.m27668();
                        java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 45, android.text.TextUtils.indexOf("", "", 0, 0) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) android.graphics.Color.alpha(0), objArr16);
                        sb15.append(((java.lang.String) objArr16[0]).intern());
                        sb15.append(mbVar.ordinal());
                        sb15.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766813, sb15.toString());
                    case 16:
                        int m2766814 = maVar.m27668();
                        java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(22 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 565 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (18834 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr17);
                        sb16.append(((java.lang.String) objArr17[0]).intern());
                        sb16.append(mbVar.ordinal());
                        sb16.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766814, sb16.toString());
                    case 17:
                        int m2766815 = maVar.m27668();
                        java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI('J' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 586 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.KeyEvent.normalizeMetaState(0) + 33206), objArr18);
                        sb17.append(((java.lang.String) objArr18[0]).intern());
                        sb17.append(mbVar.ordinal());
                        sb17.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766815, sb17.toString());
                    case 18:
                        int m2766816 = maVar.m27668();
                        java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 613, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr19);
                        sb18.append(((java.lang.String) objArr19[0]).intern());
                        sb18.append(mbVar.ordinal());
                        sb18.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766816, sb18.toString());
                    case 19:
                        int m2766817 = maVar.m27668();
                        java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29, 688 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr20);
                        sb19.append(((java.lang.String) objArr20[0]).intern());
                        sb19.append(mbVar.ordinal());
                        sb19.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766817, sb19.toString());
                    case 20:
                        int m2766818 = maVar.m27668();
                        java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 30, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 640, (char) android.view.View.MeasureSpec.getMode(0), objArr21);
                        sb20.append(((java.lang.String) objArr21[0]).intern());
                        sb20.append(mbVar.ordinal());
                        sb20.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766818, sb20.toString());
                    case 21:
                        int m2766819 = maVar.m27668();
                        java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 640 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr22);
                        sb21.append(((java.lang.String) objArr22[0]).intern());
                        sb21.append(mbVar.ordinal());
                        sb21.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766819, sb21.toString());
                    case 22:
                        int m2766820 = maVar.m27668();
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(29 - android.graphics.Color.red(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.MIGRATION_SYSTEM_ERROR, (char) android.text.TextUtils.indexOf("", "", 0), objArr23);
                        sb22.append(((java.lang.String) objArr23[0]).intern());
                        sb22.append(mbVar.ordinal());
                        sb22.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766820, sb22.toString());
                    case 23:
                        int m2766821 = maVar.m27668();
                        java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(32 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 699 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33833), objArr24);
                        sb23.append(((java.lang.String) objArr24[0]).intern());
                        sb23.append(mbVar.ordinal());
                        sb23.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766821, sb23.toString());
                    case 24:
                        int m2766822 = maVar.m27668();
                        java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, android.text.TextUtils.indexOf("", "") + 731, (char) (29684 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr25);
                        sb24.append(((java.lang.String) objArr25[0]).intern());
                        sb24.append(mbVar.ordinal());
                        sb24.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766822, sb24.toString());
                    case 25:
                        int m2766823 = maVar.m27668();
                        java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 760, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr26);
                        sb25.append(((java.lang.String) objArr26[0]).intern());
                        sb25.append(mbVar.ordinal());
                        sb25.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766823, sb25.toString());
                    case 26:
                        int m2766824 = maVar.m27668();
                        java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, android.text.TextUtils.indexOf("", "", 0) + 785, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr27);
                        sb26.append(((java.lang.String) objArr27[0]).intern());
                        sb26.append(mbVar.ordinal());
                        sb26.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766824, sb26.toString());
                    case 27:
                        int m2766825 = maVar.m27668();
                        java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(17 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), 814 - android.graphics.Color.green(0), (char) (1433 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr28);
                        sb27.append(((java.lang.String) objArr28[0]).intern());
                        sb27.append(mbVar.ordinal());
                        sb27.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766825, sb27.toString());
                    case 28:
                        int m2766826 = maVar.m27668();
                        java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(31 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 832, (char) (33920 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr29);
                        sb28.append(((java.lang.String) objArr29[0]).intern());
                        sb28.append(mbVar.ordinal());
                        sb28.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766826, sb28.toString());
                    case 29:
                        int m2766827 = maVar.m27668();
                        java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 864, (char) (50014 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr30);
                        sb29.append(((java.lang.String) objArr30[0]).intern());
                        sb29.append(mbVar.ordinal());
                        sb29.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766827, sb29.toString());
                    case 30:
                        int m2766828 = maVar.m27668();
                        java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 17, 895 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 56538), objArr31);
                        sb30.append(((java.lang.String) objArr31[0]).intern());
                        sb30.append(mbVar.ordinal());
                        sb30.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766828, sb30.toString());
                    case 31:
                        int m2766829 = maVar.m27668();
                        java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(31 - android.text.TextUtils.getOffsetAfter("", 0), 832 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (33920 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr32);
                        sb31.append(((java.lang.String) objArr32[0]).intern());
                        sb31.append(mbVar.ordinal());
                        sb31.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766829, sb31.toString());
                    case 32:
                        int m2766830 = maVar.m27668();
                        java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(33 - android.view.View.MeasureSpec.getSize(0), 925 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr33);
                        sb32.append(((java.lang.String) objArr33[0]).intern());
                        sb32.append(mbVar.ordinal());
                        sb32.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766830, sb32.toString());
                    case 33:
                        int m2766831 = maVar.m27668();
                        java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 33, 959 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr34);
                        sb33.append(((java.lang.String) objArr34[0]).intern());
                        sb33.append(mbVar.ordinal());
                        sb33.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766831, sb33.toString());
                    case 34:
                        int m2766832 = maVar.m27668();
                        java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(37 - android.text.TextUtils.indexOf("", "", 0), 992 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr35);
                        sb34.append(((java.lang.String) objArr35[0]).intern());
                        sb34.append(mbVar.ordinal());
                        sb34.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766832, sb34.toString());
                    case 35:
                        int m2766833 = maVar.m27668();
                        java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, 1028 - android.view.KeyEvent.keyCodeFromString(""), (char) (6136 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr36);
                        sb35.append(((java.lang.String) objArr36[0]).intern());
                        sb35.append(mbVar.ordinal());
                        sb35.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766833, sb35.toString());
                    case 36:
                        int m2766834 = maVar.m27668();
                        java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, 1051 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (14480 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr37);
                        sb36.append(((java.lang.String) objArr37[0]).intern());
                        sb36.append(mbVar.ordinal());
                        sb36.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766834, sb36.toString());
                    case 37:
                        int m2766835 = maVar.m27668();
                        java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(30 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), 1126 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr38);
                        sb37.append(((java.lang.String) objArr38[0]).intern());
                        sb37.append(mbVar.ordinal());
                        sb37.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766835, sb37.toString());
                    case 38:
                        int m2766836 = maVar.m27668();
                        java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1107 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22246), objArr39);
                        sb38.append(((java.lang.String) objArr39[0]).intern());
                        sb38.append(mbVar.ordinal());
                        sb38.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766836, sb38.toString());
                    case 39:
                        int m2766837 = maVar.m27668();
                        java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr40 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 47, 1138 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr40);
                        sb39.append(((java.lang.String) objArr40[0]).intern());
                        sb39.append(mbVar.ordinal());
                        sb39.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766837, sb39.toString());
                    case 40:
                        int m2766838 = maVar.m27668();
                        java.lang.StringBuilder sb40 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(44 - android.view.View.getDefaultSize(0, 0), 1185 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1916), objArr41);
                        sb40.append(((java.lang.String) objArr41[0]).intern());
                        sb40.append(mbVar.ordinal());
                        sb40.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766838, sb40.toString());
                    case 41:
                        int m2766839 = maVar.m27668();
                        java.lang.StringBuilder sb41 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.View.combineMeasuredStates(0, 0) + 41, 1229 - android.view.KeyEvent.normalizeMetaState(0), (char) (26159 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr42);
                        sb41.append(((java.lang.String) objArr42[0]).intern());
                        sb41.append(mbVar.ordinal());
                        sb41.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766839, sb41.toString());
                    case 42:
                        int m2766840 = maVar.m27668();
                        java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(42 - android.text.TextUtils.indexOf("", "", 0), 1270 - android.graphics.Color.blue(0), (char) (28326 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr43);
                        sb42.append(((java.lang.String) objArr43[0]).intern());
                        sb42.append(mbVar.ordinal());
                        sb42.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766840, sb42.toString());
                    case 43:
                        int m2766841 = maVar.m27668();
                        java.lang.StringBuilder sb43 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(53 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1312 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr44);
                        sb43.append(((java.lang.String) objArr44[0]).intern());
                        sb43.append(mbVar.ordinal());
                        sb43.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766841, sb43.toString());
                    case 44:
                        int m2766842 = maVar.m27668();
                        java.lang.StringBuilder sb44 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(48 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), 1413 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (48672 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr45);
                        sb44.append(((java.lang.String) objArr45[0]).intern());
                        sb44.append(mbVar.ordinal());
                        sb44.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766842, sb44.toString());
                    case 45:
                        int m2766843 = maVar.m27668();
                        java.lang.StringBuilder sb45 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(37 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1411, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr46);
                        sb45.append(((java.lang.String) objArr46[0]).intern());
                        sb45.append(mbVar.ordinal());
                        sb45.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766843, sb45.toString());
                    case 46:
                        int m2766844 = maVar.m27668();
                        java.lang.StringBuilder sb46 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(42 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1449 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (11808 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr47);
                        sb46.append(((java.lang.String) objArr47[0]).intern());
                        sb46.append(mbVar.ordinal());
                        sb46.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766844, sb46.toString());
                    case 47:
                        int m2766845 = maVar.m27668();
                        java.lang.StringBuilder sb47 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(37 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1491, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr48);
                        sb47.append(((java.lang.String) objArr48[0]).intern());
                        sb47.append(mbVar.ordinal());
                        sb47.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766845, sb47.toString());
                    case 48:
                        int m2766846 = maVar.m27668();
                        java.lang.StringBuilder sb48 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(42 - android.view.KeyEvent.normalizeMetaState(0), 1527 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr49);
                        sb48.append(((java.lang.String) objArr49[0]).intern());
                        sb48.append(mbVar.ordinal());
                        sb48.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766846, sb48.toString());
                    case 49:
                        int m2766847 = maVar.m27668();
                        java.lang.StringBuilder sb49 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr50 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(42 - android.graphics.Color.argb(0, 0, 0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1569, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4332), objArr50);
                        sb49.append(((java.lang.String) objArr50[0]).intern());
                        sb49.append(mbVar.ordinal());
                        sb49.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766847, sb49.toString());
                    case 50:
                        int m2766848 = maVar.m27668();
                        java.lang.StringBuilder sb50 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 54, (-16775605) - android.graphics.Color.rgb(0, 0, 0), (char) (11552 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr51);
                        sb50.append(((java.lang.String) objArr51[0]).intern());
                        sb50.append(mbVar.ordinal());
                        sb50.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766848, sb50.toString());
                    case 51:
                        int m2766849 = maVar.m27668();
                        java.lang.StringBuilder sb51 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(48 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1665 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr52);
                        sb51.append(((java.lang.String) objArr52[0]).intern());
                        sb51.append(mbVar.ordinal());
                        sb51.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766849, sb51.toString());
                    case 52:
                        int m2766850 = maVar.m27668();
                        java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1712, (char) (40954 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr53);
                        sb52.append(((java.lang.String) objArr53[0]).intern());
                        sb52.append(mbVar.ordinal());
                        sb52.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766850, sb52.toString());
                    case 53:
                        int m2766851 = maVar.m27668();
                        java.lang.StringBuilder sb53 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, android.text.TextUtils.indexOf("", "") + 1763, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr54);
                        sb53.append(((java.lang.String) objArr54[0]).intern());
                        sb53.append(mbVar.ordinal());
                        sb53.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766851, sb53.toString());
                    case 54:
                        int m2766852 = maVar.m27668();
                        java.lang.StringBuilder sb54 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(36 - android.view.View.getDefaultSize(0, 0), 1810 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr55);
                        sb54.append(((java.lang.String) objArr55[0]).intern());
                        sb54.append(mbVar.ordinal());
                        sb54.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766852, sb54.toString());
                    case 55:
                        int m2766853 = maVar.m27668();
                        java.lang.StringBuilder sb55 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(47 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1846, (char) (34861 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr56);
                        sb55.append(((java.lang.String) objArr56[0]).intern());
                        sb55.append(mbVar.ordinal());
                        sb55.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766853, sb55.toString());
                    case 56:
                        int m2766854 = maVar.m27668();
                        java.lang.StringBuilder sb56 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 60, 1893 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (char) (android.graphics.Color.rgb(0, 0, 0) + 16810236), objArr57);
                        sb56.append(((java.lang.String) objArr57[0]).intern());
                        sb56.append(mbVar.ordinal());
                        sb56.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766854, sb56.toString());
                    case 57:
                        int m2766855 = maVar.m27668();
                        java.lang.StringBuilder sb57 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 51, 1953 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr58);
                        sb57.append(((java.lang.String) objArr58[0]).intern());
                        sb57.append(mbVar.ordinal());
                        sb57.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766855, sb57.toString());
                    case 58:
                        int m2766856 = maVar.m27668();
                        java.lang.StringBuilder sb58 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr59);
                        sb58.append(((java.lang.String) objArr59[0]).intern());
                        sb58.append(mbVar.ordinal());
                        sb58.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766856, sb58.toString());
                    case 59:
                        int m2766857 = maVar.m27668();
                        java.lang.StringBuilder sb59 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(20 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2033 - android.graphics.Color.alpha(0), (char) android.graphics.Color.blue(0), objArr60);
                        sb59.append(((java.lang.String) objArr60[0]).intern());
                        sb59.append(mbVar.ordinal());
                        sb59.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766857, sb59.toString());
                    case 60:
                        int m2766858 = maVar.m27668();
                        java.lang.StringBuilder sb60 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2051 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr61);
                        sb60.append(((java.lang.String) objArr61[0]).intern());
                        sb60.append(mbVar.ordinal());
                        sb60.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766858, sb60.toString());
                    case 61:
                        int m2766859 = maVar.m27668();
                        java.lang.StringBuilder sb61 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(28 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2080 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (46483 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr62);
                        sb61.append(((java.lang.String) objArr62[0]).intern());
                        sb61.append(mbVar.ordinal());
                        sb61.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766859, sb61.toString());
                    case 62:
                        int m2766860 = maVar.m27668();
                        java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(30 - android.view.View.getDefaultSize(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2109, (char) (5819 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr63);
                        sb62.append(((java.lang.String) objArr63[0]).intern());
                        sb62.append(mbVar.ordinal());
                        sb62.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766860, sb62.toString());
                    case 63:
                        int m2766861 = maVar.m27668();
                        java.lang.StringBuilder sb63 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.View.combineMeasuredStates(0, 0) + 22, android.text.TextUtils.getOffsetAfter("", 0) + 2139, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr64);
                        sb63.append(((java.lang.String) objArr64[0]).intern());
                        sb63.append(mbVar.ordinal());
                        sb63.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766861, sb63.toString());
                    case 64:
                        int m2766862 = maVar.m27668();
                        java.lang.StringBuilder sb64 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(26 - android.text.TextUtils.indexOf("", ""), 2160 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0), objArr65);
                        sb64.append(((java.lang.String) objArr65[0]).intern());
                        sb64.append(mbVar.ordinal());
                        sb64.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766862, sb64.toString());
                    case 65:
                        int m2766863 = maVar.m27668();
                        java.lang.StringBuilder sb65 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, 2186 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.alpha(0), objArr66);
                        sb65.append(((java.lang.String) objArr66[0]).intern());
                        sb65.append(mbVar.ordinal());
                        sb65.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766863, sb65.toString());
                    case 66:
                        int m2766864 = maVar.m27668();
                        java.lang.StringBuilder sb66 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getOffsetAfter("", 0) + 33, 2205 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 895), objArr67);
                        sb66.append(((java.lang.String) objArr67[0]).intern());
                        sb66.append(mbVar.ordinal());
                        sb66.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766864, sb66.toString());
                    case 67:
                        int m2766865 = maVar.m27668();
                        java.lang.StringBuilder sb67 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2239, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr68);
                        sb67.append(((java.lang.String) objArr68[0]).intern());
                        sb67.append(mbVar.ordinal());
                        sb67.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766865, sb67.toString());
                    case 68:
                        int m2766866 = maVar.m27668();
                        java.lang.StringBuilder sb68 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(23 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2268, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr69);
                        sb68.append(((java.lang.String) objArr69[0]).intern());
                        sb68.append(mbVar.ordinal());
                        sb68.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766866, sb68.toString());
                    case 69:
                        int m2766867 = maVar.m27668();
                        java.lang.StringBuilder sb69 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.view.Gravity.getAbsoluteGravity(0, 0) + 30, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2291, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr70);
                        sb69.append(((java.lang.String) objArr70[0]).intern());
                        sb69.append(mbVar.ordinal());
                        sb69.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766867, sb69.toString());
                    case 70:
                        int m2766868 = maVar.m27668();
                        java.lang.StringBuilder sb70 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 34, 2322 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 38986), objArr71);
                        sb70.append(((java.lang.String) objArr71[0]).intern());
                        sb70.append(mbVar.ordinal());
                        sb70.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766868, sb70.toString());
                    case 71:
                        int m2766869 = maVar.m27668();
                        java.lang.StringBuilder sb71 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.getTrimmedLength("") + 34, android.view.KeyEvent.keyCodeFromString("") + 2355, (char) android.view.View.MeasureSpec.getSize(0), objArr72);
                        sb71.append(((java.lang.String) objArr72[0]).intern());
                        sb71.append(mbVar.ordinal());
                        sb71.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766869, sb71.toString());
                    case 72:
                        int m2766870 = maVar.m27668();
                        java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(43 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2390, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 55834), objArr73);
                        sb72.append(((java.lang.String) objArr73[0]).intern());
                        sb72.append(mbVar.ordinal());
                        sb72.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766870, sb72.toString());
                    case 73:
                        int m2766871 = maVar.m27668();
                        java.lang.StringBuilder sb73 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(41 - android.text.TextUtils.indexOf("", ""), 2431 - android.view.MotionEvent.axisFromString(""), (char) (62021 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr74);
                        sb73.append(((java.lang.String) objArr74[0]).intern());
                        sb73.append(mbVar.ordinal());
                        sb73.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766871, sb73.toString());
                    case 74:
                        int m2766872 = maVar.m27668();
                        java.lang.StringBuilder sb74 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 2472 - android.view.MotionEvent.axisFromString(""), (char) (35265 - android.graphics.Color.alpha(0)), objArr75);
                        sb74.append(((java.lang.String) objArr75[0]).intern());
                        sb74.append(mbVar.ordinal());
                        sb74.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766872, sb74.toString());
                    case 75:
                        int m2766873 = maVar.m27668();
                        java.lang.StringBuilder sb75 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(22 - android.graphics.Color.green(0), 2505 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52913), objArr76);
                        sb75.append(((java.lang.String) objArr76[0]).intern());
                        sb75.append(mbVar.ordinal());
                        sb75.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766873, sb75.toString());
                    case 76:
                        int m2766874 = maVar.m27668();
                        java.lang.StringBuilder sb76 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36, android.graphics.Color.alpha(0) + 2528, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr77);
                        sb76.append(((java.lang.String) objArr77[0]).intern());
                        sb76.append(mbVar.ordinal());
                        sb76.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766874, sb76.toString());
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                        return;
                    default:
                        int m2766875 = maVar.m27668();
                        java.lang.StringBuilder sb77 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(11 - android.view.View.combineMeasuredStates(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 2563, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr78);
                        sb77.append(((java.lang.String) objArr78[0]).intern());
                        sb77.append(maVar.toString());
                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 9, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2574, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64124), objArr79);
                        sb77.append(((java.lang.String) objArr79[0]).intern());
                        sb77.append(mbVar.ordinal());
                        sb77.append(intern);
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m2766875, sb77.toString());
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27593(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 89;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2476, bArr, bArr.length, getInputFormats);
            throw null;
        }
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2476, bArr, bArr.length, getInputFormats);
        getInputSizeshNQ4ISI = (getOutputFormats + 13) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m27610(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 75;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2460;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m27598(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 21;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2456;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27587(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 125) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2459, bArr, bArr.length, getInputFormats);
        int i = getInputSizeshNQ4ISI + 107;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m27588(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 61) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2455, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getOutputFormats + 59;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] m27579(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 49) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2440, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 11) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public byte[] m27577(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 55;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2446, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2446, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getInputSizeshNQ4ISI + 73;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public byte[] m27636(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 5) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2501, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 9) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public byte[] m27578(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 15;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2466;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public byte[] m27602(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 35;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2473, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2473, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getOutputFormats + 91;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public byte[] m27585(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 27;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2448;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte[] m27581(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 67;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2461, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2461, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getOutputFormats + 83;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public byte[] m27584(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 11) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2447, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 3;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public byte[] m27580(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 39;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2481;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public byte[] m27590(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 9) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2504, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 23;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public byte[] m27605(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 31;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2464;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ᐨ, reason: contains not printable characters */
    public byte[] m27616(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 67;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2450;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ˍ, reason: contains not printable characters */
    public byte[] m27591(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 43;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2457;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public byte[] m27599(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 81) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2453, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 57) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public byte[] m27615(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 7;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2454;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        }
        getHighSpeedVideoFpsRangesFor(mbVar, bArr, bArr.length, getInputFormats);
        throw null;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public byte[] m27640(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 101) % 128;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb.f2449, bArr, bArr.length, getInputFormats);
        getInputSizeshNQ4ISI = (getOutputFormats + 25) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    /* renamed from: ՙ, reason: contains not printable characters */
    public byte[] m27603(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 91;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2483, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2483, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 93) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: י, reason: contains not printable characters */
    public byte[] m27604(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 91) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2462, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getOutputFormats + 5;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public byte[] m27644(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 111;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2509, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2509, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getInputSizeshNQ4ISI + 99;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʹ, reason: contains not printable characters */
    public byte[] m27576(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 121) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2470, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 113) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public byte[] m27631(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 115) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2468, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getOutputFormats + 3;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public byte[] m27634(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 107;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2458;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public byte[] m27630(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 15;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2442, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw new java.lang.ArithmeticException();
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2442, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 27) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public byte[] m27625(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 95;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2482, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2482, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 79) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public byte[] m27606(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 1) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2490, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 71) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public byte[] m27641(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 117;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2508, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw new java.lang.ArithmeticException();
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2508, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getInputSizeshNQ4ISI + 1;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ｰ, reason: contains not printable characters */
    public byte[] m27643(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 107) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2469, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 21;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʳ, reason: contains not printable characters */
    public byte[] m27574(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 39;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2467, bArr, bArr.length, getInputFormats);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2467, bArr, bArr.length, getInputFormats);
        getOutputFormats = (getInputSizeshNQ4ISI + 79) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public byte[] m27637(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 103) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2512, bArr, bArr.length, getInputFormats);
        getInputSizeshNQ4ISI = (getOutputFormats + 91) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ﹺ, reason: contains not printable characters */
    public byte[] m27642(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 25) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2445, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 85;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʴ, reason: contains not printable characters */
    public byte[] m27575(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 43;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2443;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public byte[] m27582(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 105;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2502;
        if (i % 2 != 0) {
            return Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ˇ, reason: contains not printable characters */
    public byte[] m27583(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 3;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2498, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2498, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 63) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ˡ, reason: contains not printable characters */
    public byte[] m27600(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 113;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2471, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw new java.lang.ArithmeticException();
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2471, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getInputSizeshNQ4ISI + 19;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˮ, reason: contains not printable characters */
    public byte[] m27601(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 107;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2499, bArr, bArr.length, getInputFormats);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(util.h.xy.v.b.mb.f2499, bArr, bArr.length, getInputFormats);
        int i2 = getInputSizeshNQ4ISI + 29;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᑊ, reason: contains not printable characters */
    public byte[] m27619(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 55;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2493;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        Camera2StreamConfigurationMap(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ᐠ, reason: contains not printable characters */
    public byte[] m27612(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 5;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2511, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw null;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2511, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 103) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᐣ, reason: contains not printable characters */
    public byte[] m27614(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 85;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2510;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ᐩ, reason: contains not printable characters */
    public byte[] m27617(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 63;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2505;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ۥ, reason: contains not printable characters */
    public byte[] m27607(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 101) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2444, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 51;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: יּ, reason: contains not printable characters */
    public byte[] m27639(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 97;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2487;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: יִ, reason: contains not printable characters */
    public byte[] m27638(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 43) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2452, bArr, bArr.length, getInputFormats);
        getInputSizeshNQ4ISI = (getOutputFormats + 19) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᵕ, reason: contains not printable characters */
    public byte[] m27632(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 81) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2492, bArr, bArr.length, getInputFormats);
        getOutputFormats = (getInputSizeshNQ4ISI + 93) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᵣ, reason: contains not printable characters */
    public byte[] m27635(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 103) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2496, bArr, bArr.length, getInputFormats);
        int i = getOutputFormats + 125;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᕀ, reason: contains not printable characters */
    public byte[] m27623(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 31;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2495, bArr, bArr.length, getInputFormats);
            throw new java.lang.ArithmeticException();
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2495, bArr, bArr.length, getInputFormats);
        int i2 = getInputSizeshNQ4ISI + 43;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐪ, reason: contains not printable characters */
    public byte[] m27618(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 125) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2463, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 81) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᔇ, reason: contains not printable characters */
    public byte[] m27621(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 59) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2451, bArr, bArr.length, 1024);
        getInputSizeshNQ4ISI = (getOutputFormats + 25) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᐟ, reason: contains not printable characters */
    public byte[] m27611(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 63) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2465, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getOutputFormats = (getInputSizeshNQ4ISI + 19) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᒽ, reason: contains not printable characters */
    public byte[] m27620(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 7) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2480, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getInputSizeshNQ4ISI + 45;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public long m27596(android.content.Context context, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (!util.h.xy.ag.a.m24556().m24560()) {
            util.h.xy.ag.a.m24556().m24559(context);
            getInputSizeshNQ4ISI = (getOutputFormats + 87) % 128;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2472, bArr, bArr.length, 8);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.put(highSpeedVideoFpsRanges);
        allocate.flip();
        long j = allocate.getLong();
        getOutputFormats = (getInputSizeshNQ4ISI + 49) % 128;
        return j;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public long m27608(android.content.Context context, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
        if (!util.h.xy.ag.a.m24556().m24560()) {
            util.h.xy.ag.a.m24556().m24559(context);
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2506, bArr, bArr.length, 8);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.put(highSpeedVideoFpsRanges);
        allocate.flip();
        long j = allocate.getLong();
        int i = getOutputFormats + 7;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m27592(android.content.Context context, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 45;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            if (!util.h.xy.ag.a.m24556().m24560()) {
                getOutputFormats = (getInputSizeshNQ4ISI + 109) % 128;
                util.h.xy.ag.a.m24556().m24559(context);
            }
            byte b = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2503, bArr, bArr.length, getHighSpeedVideoSizesFor)[0];
            int i2 = getOutputFormats + 53;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return b;
            }
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ag.a.m24556().m24560();
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐡ, reason: contains not printable characters */
    public byte[] m27613(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int length;
        int i;
        int i2 = getInputSizeshNQ4ISI + 115;
        getOutputFormats = i2 % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2500;
        if (i2 % 2 == 0) {
            length = bArr.length;
            i = 22798;
        } else {
            length = bArr.length;
            i = 132;
        }
        return getHighSpeedVideoFpsRanges(mbVar, bArr, length, i);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27594(byte[] bArr, byte[] bArr2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 7) % 128;
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        java.lang.System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2491, bArr3, length, 132);
        int i = getOutputFormats + 13;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ᴶ, reason: contains not printable characters */
    public byte[] m27626(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 45) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2489, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 119) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m27586(android.content.Context context, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 33) % 128;
        util.h.xy.v.mb.m27670(context);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2507, bArr, bArr.length, 64);
        int i = getOutputFormats + 53;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ᗮ, reason: contains not printable characters */
    public byte[] m27624(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 61) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2488, bArr, bArr.length, 512);
        int i = getInputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ᴸ, reason: contains not printable characters */
    public byte[] m27627(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2477, bArr, bArr.length, 33);
        this.getOutputStallDuration.put(util.h.xy.v.b.mb.f2477, util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges[32]));
        util.h.xy.v.ma m27667 = util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges[32]);
        java.lang.String str = util.h.xy.al.ra.f366;
        m27667.m27668();
        if (m27667.m27668() <= util.h.xy.v.ma.f2558.m27668()) {
            int i = getOutputFormats + 107;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                if (m27667.m27668() > util.h.xy.v.ma.f2610.m27668()) {
                    int i2 = getInputSizeshNQ4ISI + 3;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.String str2 = util.h.xy.al.ra.f366;
                        m27667.m27668();
                        return null;
                    }
                    java.lang.String str3 = util.h.xy.al.ra.f366;
                    m27667.m27668();
                    throw new java.lang.ArithmeticException();
                }
            } else {
                m27667.m27668();
                util.h.xy.v.ma.f2610.m27668();
                throw null;
            }
        }
        byte[] bArr2 = new byte[32];
        java.lang.System.arraycopy(highSpeedVideoFpsRanges, 0, bArr2, 0, 32);
        return bArr2;
    }

    /* renamed from: ᔈ, reason: contains not printable characters */
    public byte[] m27622(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 13;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            java.lang.String str = util.h.xy.al.ra.f366;
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2497, bArr, bArr.length, 3);
            this.getOutputStallDuration.put(util.h.xy.v.b.mb.f2497, util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges[3]));
            byte[] bArr2 = new byte[3];
            java.lang.System.arraycopy(highSpeedVideoFpsRanges, 0, bArr2, 0, 5);
            return bArr2;
        }
        java.lang.String str2 = util.h.xy.al.ra.f366;
        byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2497, bArr, bArr.length, 4);
        this.getOutputStallDuration.put(util.h.xy.v.b.mb.f2497, util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges2[3]));
        byte[] bArr3 = new byte[3];
        java.lang.System.arraycopy(highSpeedVideoFpsRanges2, 0, bArr3, 0, 3);
        return bArr3;
    }

    /* renamed from: ᵀ, reason: contains not printable characters */
    public byte[] m27628(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        int i = getOutputFormats + 95;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2513, bArr, bArr.length, 4);
            this.getOutputStallDuration.put(util.h.xy.v.b.mb.f2513, util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges[4]));
            bArr2 = new byte[3];
            java.lang.System.arraycopy(highSpeedVideoFpsRanges, 0, bArr2, 1, 3);
        } else {
            byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2513, bArr, bArr.length, 4);
            this.getOutputStallDuration.put(util.h.xy.v.b.mb.f2513, util.h.xy.v.ma.m27667(highSpeedVideoFpsRanges2[3]));
            bArr2 = new byte[3];
            java.lang.System.arraycopy(highSpeedVideoFpsRanges2, 0, bArr2, 0, 3);
        }
        int i2 = getInputSizeshNQ4ISI + 37;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    /* renamed from: ᵋ, reason: contains not printable characters */
    public byte[] m27629(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 27) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2485, bArr, bArr.length, 1024);
        int i = getInputSizeshNQ4ISI + 37;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ǃ, reason: contains not printable characters */
    public byte[] m27573(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputSizeshNQ4ISI + 49;
        getOutputFormats = i % 128;
        util.h.xy.v.b.mb mbVar = util.h.xy.v.b.mb.f2486;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        }
        getHighSpeedVideoFpsRanges(mbVar, bArr, bArr.length, getHighSpeedVideoSizesFor);
        throw null;
    }

    /* renamed from: ᵗ, reason: contains not printable characters */
    public byte[] m27633(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputFormats + 95;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2478, bArr, bArr.length, getHighSpeedVideoSizesFor);
            throw new java.lang.ArithmeticException();
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2478, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i2 = getOutputFormats + 91;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ﾟ, reason: contains not printable characters */
    public byte[] m27645(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputSizeshNQ4ISI = (getOutputFormats + 121) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2479, bArr, bArr.length, getHighSpeedVideoSizesFor);
        int i = getOutputFormats + 35;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return highSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ı, reason: contains not printable characters */
    public byte[] m27572(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputFormats = (getInputSizeshNQ4ISI + 29) % 128;
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb.f2474, bArr, bArr.length, getHighSpeedVideoSizesFor);
        getInputSizeshNQ4ISI = (getOutputFormats + 43) % 128;
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m27595(byte[] bArr, byte[] bArr2, byte[] bArr3) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr4;
        getInputSizeshNQ4ISI = (getOutputFormats + 13) % 128;
        byte[] bArr5 = new byte[1024];
        int[] iArr = {0};
        int m27568 = util.h.xy.v.a.f2437.m27568(bArr, bArr.length, bArr2, bArr2.length, bArr3, bArr3.length, bArr5, iArr);
        if (m27568 != 0) {
            m27597(util.h.xy.v.b.mb.f2441, util.h.xy.v.ma.m27667(m27568));
        }
        int i = iArr[0];
        if (i > 0) {
            int i2 = getOutputFormats + 93;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                bArr4 = new byte[i];
                java.lang.System.arraycopy(bArr5, 1, bArr4, 1, i);
            } else {
                bArr4 = new byte[i];
                java.lang.System.arraycopy(bArr5, 0, bArr4, 0, i);
            }
            getOutputFormats = (getInputSizeshNQ4ISI + 79) % 128;
        } else {
            bArr4 = new byte[0];
        }
        int i3 = getOutputFormats + 85;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr4;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r13 = util.h.xy.v.b.getInputSizeshNQ4ISI + 13;
        util.h.xy.v.b.getOutputFormats = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if ((r13 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        m27597(util.h.xy.v.b.mb.f2494, util.h.xy.v.ma.m27667(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        m27597(util.h.xy.v.b.mb.f2494, util.h.xy.v.ma.m27667(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r12 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r12 != 0) goto L9;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m27589(byte[] bArr, byte[] bArr2, byte[] bArr3) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr4;
        int[] iArr;
        int highSpeedVideoFpsRanges;
        byte[] bArr5;
        int i = getOutputFormats;
        getInputSizeshNQ4ISI = (i + 57) % 128;
        int length = bArr.length;
        int length2 = bArr2.length;
        int length3 = bArr3.length;
        int i2 = getHighSpeedVideoSizesFor;
        int i3 = i + 85;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            bArr4 = new byte[i2];
            iArr = new int[]{1};
            util.h.xy.v.a aVar = util.h.xy.v.a.f2437;
            highSpeedVideoFpsRanges = util.h.xy.v.a.getHighSpeedVideoFpsRanges(bArr, length, bArr2, length2, bArr3, length3, bArr4, iArr);
        } else {
            bArr4 = new byte[i2];
            iArr = new int[]{0};
            util.h.xy.v.a aVar2 = util.h.xy.v.a.f2437;
            highSpeedVideoFpsRanges = util.h.xy.v.a.getHighSpeedVideoFpsRanges(bArr, length, bArr2, length2, bArr3, length3, bArr4, iArr);
        }
        int i4 = iArr[0];
        if (i4 > 0) {
            getOutputFormats = (getInputSizeshNQ4ISI + 75) % 128;
            bArr5 = new byte[i4];
            java.lang.System.arraycopy(bArr4, 0, bArr5, 0, i4);
        } else {
            bArr5 = new byte[0];
        }
        getOutputFormats = (getInputSizeshNQ4ISI + 87) % 128;
        return bArr5;
    }

    private byte[] getHighSpeedVideoFpsRangesFor(util.h.xy.v.b.mb mbVar, byte[] bArr, int i, int i2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        int[] iArr;
        int m27551;
        int i3 = getInputSizeshNQ4ISI + 83;
        getOutputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            util.h.xy.v.mb.m27670(util.h.xy.ag.a.m24556().m24558());
            bArr2 = new byte[i2];
            iArr = new int[1];
            iArr[1] = 1;
        } else {
            util.h.xy.v.mb.m27670(util.h.xy.ag.a.m24556().m24558());
            bArr2 = new byte[i2];
            iArr = new int[]{0};
        }
        getOutputFormats = (getInputSizeshNQ4ISI + 55) % 128;
        try {
            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((maximumFlingVelocity >> 16) + 922148192, (short) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 120), (byte) android.text.TextUtils.getTrimmedLength(""), (-48) - android.view.View.resolveSize(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 1269978215, objArr);
            int abs = java.lang.Math.abs(((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt() % 3);
            int ordinal = mbVar.ordinal();
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.f2583);
            if (abs == 0) {
                m27551 = util.h.xy.v.a.f2437.m27551(ordinal, bArr, i, bArr2, iArr);
            } else if (abs == 1) {
                m27551 = util.h.xy.v.a.f2437.m27553(bArr, i, ordinal, bArr2, iArr);
            } else if (abs != 2) {
                m27551 = -1;
            } else {
                m27551 = util.h.xy.v.a.f2437.m27560(bArr, i, bArr2, iArr, ordinal);
                getInputSizeshNQ4ISI = (getOutputFormats + 95) % 128;
            }
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.m27667(m27551));
            if (m27551 != 0) {
                m27597(mbVar, util.h.xy.v.ma.m27667(m27551));
            }
            int i4 = iArr[0];
            if (i4 <= 0) {
                return new byte[0];
            }
            int i5 = getOutputFormats + 57;
            getInputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                byte[] bArr3 = new byte[i4];
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i4);
                return bArr3;
            }
            int i6 = iArr[1];
            byte[] bArr4 = new byte[i6];
            java.lang.System.arraycopy(bArr2, 1, bArr4, 1, i6);
            return bArr4;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private byte[] Camera2StreamConfigurationMap(util.h.xy.v.b.mb mbVar, byte[] bArr, int i, int i2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2;
        int[] iArr;
        int m27557;
        int i3 = getInputSizeshNQ4ISI + 33;
        getOutputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            util.h.xy.v.mb.m27670(util.h.xy.ag.a.m24556().m24558());
            bArr2 = new byte[i2];
            iArr = new int[0];
            iArr[1] = 1;
        } else {
            util.h.xy.v.mb.m27670(util.h.xy.ag.a.m24556().m24558());
            bArr2 = new byte[i2];
            iArr = new int[]{0};
        }
        getInputSizeshNQ4ISI = (getOutputFormats + 69) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(922148193 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (android.os.Process.getGidForName("") + 121), (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.os.Process.myTid() >> 22) - 48, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1269978216, objArr);
            int abs = java.lang.Math.abs(((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt() % 3);
            int ordinal = mbVar.ordinal();
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.f2583);
            if (abs == 0) {
                m27557 = util.h.xy.v.a.f2437.m27557(ordinal, bArr, i, bArr2, iArr);
            } else if (abs == 1) {
                m27557 = util.h.xy.v.a.f2437.m27570(bArr, i, ordinal, bArr2, iArr);
            } else if (abs != 2) {
                m27557 = -1;
            } else {
                m27557 = util.h.xy.v.a.f2437.m27554(bArr, i, bArr2, iArr, ordinal);
                getOutputFormats = (getInputSizeshNQ4ISI + 53) % 128;
            }
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.m27667(m27557));
            if (m27557 != 0) {
                m27597(mbVar, util.h.xy.v.ma.m27667(m27557));
            }
            int i4 = iArr[0];
            if (i4 <= 0) {
                return new byte[0];
            }
            getInputSizeshNQ4ISI = (getOutputFormats + 37) % 128;
            byte[] bArr3 = new byte[i4];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i4);
            getInputSizeshNQ4ISI = (getOutputFormats + 89) % 128;
            return bArr3;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private byte[] getHighSpeedVideoFpsRanges(util.h.xy.v.b.mb mbVar, byte[] bArr, int i, int i2) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        char c;
        int m27561;
        util.h.xy.v.mb.m27670(util.h.xy.ag.a.m24556().m24558());
        byte[] bArr2 = new byte[i2];
        int[] iArr = {0};
        getOutputFormats = (getInputSizeshNQ4ISI + 15) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(922148192 - android.text.TextUtils.getOffsetBefore("", 0), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 119), (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-49) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-1269978215) - android.view.KeyEvent.getDeadChar(0, 0), objArr);
            int abs = java.lang.Math.abs(((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt() % 3);
            int ordinal = mbVar.ordinal();
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.f2583);
            if (abs == 0) {
                c = 1;
                m27561 = util.h.xy.v.a.f2437.m27561(ordinal, bArr, i, bArr2, iArr);
            } else if (abs == 1) {
                c = 1;
                m27561 = util.h.xy.v.a.f2437.m27564(bArr, i, ordinal, bArr2, iArr);
                getOutputFormats = (getInputSizeshNQ4ISI + 77) % 128;
            } else if (abs != 2) {
                m27561 = -1;
                c = 1;
            } else {
                c = 1;
                m27561 = util.h.xy.v.a.f2437.m27569(bArr, i, bArr2, iArr, ordinal);
            }
            this.getOutputStallDuration.put(mbVar, util.h.xy.v.ma.m27667(m27561));
            if (m27561 != 0) {
                getOutputFormats = (getInputSizeshNQ4ISI + 59) % 128;
                m27597(mbVar, util.h.xy.v.ma.m27667(m27561));
            }
            int i3 = iArr[0];
            if (i3 <= 0) {
                return new byte[0];
            }
            int i4 = getInputSizeshNQ4ISI + 85;
            getOutputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                byte[] bArr3 = new byte[i3];
                java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i3);
                return bArr3;
            }
            int i5 = iArr[c];
            byte[] bArr4 = new byte[i5];
            java.lang.System.arraycopy(bArr2, 0, bArr4, 0, i5);
            return bArr4;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputStallDurationlomOqCM = 782775672;
        Camera2StreamConfigurationMap = -408873070;
        getHighResolutionOutputSizeshNQ4ISI = -1408023799;
        getHighSpeedVideoFpsRangesFor = new byte[]{94, 75, -90, 77, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -83, -93, 93, 66, 94, 66, 117, -27, 85, 75, -89, 93, 66, 94, -94, com.google.common.base.Ascii.NAK, -115, -85, 69, -89, -40};
    }

    static void getHighSpeedVideoFpsRanges() {
        char[] cArr = new char[2582];
        java.nio.ByteBuffer.wrap("\t\u0016Ì\u0000\u0083FF¢\u001dôÐÃ\u0096CmT ¬ç\u0095ºÃp;7m\n\u0018ÁÃ\u0084üZ \u0011jÔT«Ün±\u009c(V\u001c\u0093\u000bÜK\u0019µBÿ\u008fÜÉ\r2k\u007f©¸\u009eåÌ/shGUZ\u009e\u0088Ûã\u0005=Nq\u008bNôË1Ù{?¤\fá@*¢\u0017¡P\u009a\u009a\u0005Ça\u0000«M\u0095¶\u009dðH\u00194Ü\"\u0093vV\u009a\rÐÀé\u00867}C0\u008f÷¥ªã`\u000f'^\u001anÑó\u0094òJ\f\u0001EÄb»»~Ç4\fëk®Ye\u008aXÚ\u001fóÕ7\u0088BO\u0084\u0002¯ù÷¿.r_)ßì«£ë\u0099\u001a\\T\u0013xÖõ\u008dËC\u0014\u0006%ýd°\u0092wÁ*çà)§<\u009aÇQØ\u0014üÊ6\u0081HDÀ;åÙß\u001cÉS\u009d\u0096qÍ;\u0000\u0002FÜ½¨ðd7Nj\b äçµÚ\u0085\u0011\u0018T\u0019\u008açÁ®\u0004\u0089{P¾,ôç+\u0080nµ¥]\u0098\rß<\u0015\u009dH¯\u008fiÂZ9\u0016\u007fÄ²çé{,Fc\u0011Yö\u009c¢Ó\u0093\u0016[M+\u0083¼Æ\u0085=\u009cp~·6ê\n \u009cg×æ:#,lx©\u0094òÞ?çy9\u0082MÏ\u0081\b«Uí\u009f\u0001ØPå`.ýküµ\u0002þK;lDµ\u0081ÉË\u0002\u0014eQe\u009a\u0099§\u009aàì**w]°\u0091ý¿\u0006¼@<\u008dAÖ\u0092\u0013µ\\åf\u0014£Pì`)ûr\u0082¼\u001fù=\u0002qO\u008d\u0088\u0087Õ¬\u0005\bÀ\u001c\u008fOJ·\u0011âÜÕ\u009a\u000ba6,¨ë\u008a¶Ì|/;`\u0006YÍ\u0081\u0088êV\"\u001d ØC§\u0083bæ(7÷\u0012²ByùD \u0003ÝÉ\u001f\u0094sS¯\u001eÅå\u008e\u009cQYQ\u0016\u001aÓÿ\u0088 E\u009a\u0003SøvµÌrÖ/\u008cås¢#\u009f\u0019T\u008f\u0011³Ït\u0084-A\u001c>Ðû¬±$nR+\u0014àëÝ§\u009a\u0089P\n\ruÊê\u0087Ê|\u0080:B÷j¬£\u009cRYU\u0016\u0000Óç\u0088·E\u0091\u0003\u0007ø\u0015µárÙ/\u0085åt¢(\u009f\u0010T\u008f\u0011»Ïc\u00842A\u001c>Ðûõ±,nQ+\u0013à÷Ý«\u009aÁP\n\u009cQYQ\u0016\u001aÓÿ\u0088 E\u009a\u0003SøvµÌrÖ/\u008cås¢#\u009f\u0019T\u008f\u0011©Ïc\u0084/A\u001d>Åûõ±hnR+\bàþÝ¼\u009a\u0093P\n\ruÊê\u0087Ê|\u0080:B÷j¬£\u009cDYB\u0016\u0011Óý\u0088·EÔ\u0003Nø8µ©rÏ/\u0099ås¢9\u009f\u0015TÁ\u0011¹Ï1\u0084/A\u0001>\u0082û´±gnT+\u0003àêÝ»\u009a\u0092PD\r:Ê¬\u0087Ù|\u0087:M÷5¬£i\u009a&\u0083\u001caÙ)\u0096\u0015S\u0093\bø\u009cQYQ\u0016\u001aÓÿ\u0088 E\u009a\u0003SøvµÌrÖ/\u008cås¢#\u009f\u0019T\u008f\u0011¸Ïp\u0084)A\u001f>Çû±±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r}\u0018NÝH\u0092\u001fWë\f±Á\u0087\u0087]|k1ñöÈ«\u0086as&)\u001bAÐÔ\u0095ªK`\u00008ÅNº\u0097\u007f®5lêD¯\u0018d¾Yõ\u0017µÒµ\u009díX\u0015\u0003FÎl\u0088ðsÄ>\fù=¤sn\u009f)\u009a\u0014ïß-\u009a[D\u008f\u000fÙÊãµupD:\u009aå¬ ôkNV\\\u0011dÛ¸\u0086ÉA\u0010\f;÷l±»|\u0087'\u0017â*\u00ad\u007f\u0097\u0093RÅ\u001dõØ?\u0083[M\u0095\b¢óô¾Ky\u0010$oî³©ù\u0094\u0007_\u000f\u001a\"þ=;#tu±\u008dê\u009f'ía5\u009aI×\u0090\u0010©Mâ\u0087\u0015ÀZý&6¸sÍ\u00ad\u0018æW#h\\¬\u0099ÌÓ\u0016\fmI4\u0082\u0085¿Çøï23o\u001d¨Ö\u009c@Y^\u0016\u0007Óà\u0088ªE\u009d\u0003Cø\u001fµír\u0098/\u0082åi¢m\u009f\u0019TÂ\u0011®Ïe\u00849AS>Æû ±vn^+\bàþÝè\u009a\u009dPC\r1Êé\u0087\u009f|\u008f:B÷3¬æiÁ&\u0096\u001c4Ùo\u0096\u0010SÜ\b¶Æh\u0083\u0000xMÕÖ\u0010Ï_\u0081\u009atÁ.\fFJï±\u0087üW;\nf\u001f¬áë³Ö\u008b\u001d\u001dXd\u0086åÍ§\b\u008fwS²}ø¶\u001díØÅ\u0097\u0099R\u0004\t\u0018Ä'\u0082èyÀ4Vó`®4dØ#Û\u001e\u008fÕk\u0090\u001aNÈ\u0005\u0084Àå¿<z\u00050Çïïª³a\u0015\\^\u009c[Ys\u0016/Ó²\u0088ªE\u0084\u0003Bø$µèrÌ/\u0082åu¢#\u009f\\Tê\u0011¬Ïc\u0084/A\u0001>\u0082ûý±bnB+\bàúÝò\u009aÛ\u009cFYr\u0016CÓß\u0088\u0084E·\u0003\u0007ø9µùrÝ/\u0099å{¢9\u009f\u0015TÀ\u0011°Ï1\u0084\u0005A\u0001>Ðûº±vn\u0017+NàÿÝ½\u009a\u0095PI\rgÊ¬\u009cQY{\u0016\u0006Óë\u0088åE\u0090\u0003Bø5µûrÁ/\u009bån¢$\u009f\u0013TÁ\u0011þÏt\u00842A\u0001>Íû§±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r}\u0018ZÝj\u0092+Wè\f\u0085Áº\u0087`|_1Äöô«°aZ&\u0012\u001b4Ðò\u0095\u009eKW\u0000\u0007Åzºî\u007f\u008e5_êq¯=d\u0090YÉ\u001e´Ôv\u0089\u001aNÆ\u0003¬øçïµ*\u0092eÝ GûT6dp \u008bÊÆ\n\u0001,\\j\u0096\u0086Ñ×ìç'zbN¼\u0096÷Ç2éM%\u0088\u0000ÂÙ\u001d¤Xæ\u0093\u0002®^é4#ÿ\u009c@Y\\\u0016\u0017Ó÷\u0088·EÔ\u0003Eø#µïrÞ/\u008eåh¢m\u009f\u0019TÝ\u0011¬Ï~\u00842AS>\u008aû³±qnY+\u0005à£Ýè\u009cBYB\u0016\u001aÓâ\u0088±E\u009b\u0003\u0007ø µìrÊ/\u0082å|¢4\u009f7TÊ\u0011§ÏT\u00842A\u0001>Íû§±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r}\u0099Ð\\ä\u0013»ÖH\u008d|@(\u0006Ìý½°\u007fwS*Rà«§²\u009a\u0090QX\u0014$Ê²\u0081ù\u0018ÂÝÂ\u0092\u009aWb\f1Á\u001b\u0087\u0087|\u00931{öJ«\u0004aè&í\u001b½Ðj\u0095\rK±\u0000¦Å\u0092ºK\u007f95áêÓ¯Æd1Y.\u001e\u000eÔÄ\u0089¾N6\u0003\u001f_\u001c\u009a\u001cÕD\u0010¼Kï\u0086ÅÀY;Mv¥±\u0094ìÚ&6a3\\p\u0097¢ÒÁ\foGx\u0082Lý\u00958çr?\u00ad\rè\u0018#ï\u001eðYÐ\u0093\u001aÎ`\tèDÁ@\u009b\u0085\u009bÊÃ\u000f;Th\u0099BßÞ$Êi\"®\u0013ó]9±~´Cö\u0088>ÍF\u0013èXÿ\u009dËâ\u0012'`m¸²\u008a÷\u009f<h\u0001wFW\u008c\u009dÑç\u0016o[F\u009cBYB\u0016\u001aÓâ\u0088±E\u009b\u0003\u0007ø\u0004µÚrù/Ëå~¢(\u009f\u001fTÝ\u0011§Ïa\u00844AS>Äû´±mn[+\u0003àýÝè\u009aÓPL\r(Êâ\u0087Ü|Ô:\u0001\u009cBYt\u0016\"Ó²\u0088\u0095E\u0095\u0003Cø2µàrÖ/\u008cå:¢?\u009f\u0019TÂ\u0011±Ïg\u0084!A\u001f>\u0082û°±vnE+\tàëÝè\u009aÓPL\r(Êâ\u0087Ü|Ô:\u0001\u009cHY^\u0016\u0015Óó\u0088©E\u009d\u0003CøvµêrÊ/\u0092åj¢9\u009f\u0013T\u008f\u0011ºÏp\u00844A\u0012>\u0082û¦±pnE+\u0013àúÝ¼\u009a\u008ePX\r8Ê¬\u0087\u0097|\u0088:T÷>¬ài\u0088&Å\u008b°N¦\u0001íÄ\u000b\u009fQRe\u0014»ï\u008e¢<e/8wò\u0097µÙ\u0088ñC$\u0006\u0006ØÁ\u0093ÞVþ)4ìN¦Æyï¤ØaÎ.\u0085ëc°9}\r;ÓÀæ\u008dsJ[\u0017\u0014Ýä\u009aý§\u008alV)+÷í¼´y\u0090\u0006\u0012Ãm\u0089òVÒ\u0013\u0098Øjåb¢K\u009cBYc\u0016!Ó²\u0088\u008fE§\u0003hø\u0018µ©rÈ/\u008aåh¢>\u009f\u0015TÁ\u0011¹Ï1\u0084%A\u0001>Ðûº±vn\u0017+NàÿÝ½\u009a\u0095PI\rgÊ¬Ê©\u000f¼@õ\u0085\u0004ÞI\u0013\u007fU¥®\u0093ã>$\u000eyO³ßôûÉð\u0002-GU\u0099\u0095ÒÑ\u0017ãh5\u00adUçÁ8ú}å¶\t\u008bCÌ}\u0006õ[\u0098\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u001a>Îû¹±anP+\u0007àõÝè\u009a\u009aPX\r:Êå\u0087Ò|\u008b:O÷$¬£i×&\u0097\u001cfÙ(\u0096\u0004S\u0089\bðÆm\u0083Ox\u00035ÿòõ¯Þ\u009b:^)\u0011qÔ\u008b\u008fËBé\u0004/ÿC²\u009auª(·â7¥c\u0098CS¼\u0016ÆÈ\b\u0083\u001cFf9°üß¶\u0019i',sç\u0081Ú\u0094\u009dîW8\nQÍ\u0085\u0080·{²=9ðM«\u008bn¯!¹\u001b@Þ]\u0091\u007fT»\u000fÇÁM\u0084fúi?zp\"µØî\u0098#ºe|\u009e\u0010ÓÉ\u0014ùIä\u0083dÄ0ù\u00102ïw\u0095©[âO'+Xÿ\u009d\u0095×E\b\u007fMi\u0086×»\u008eü°6%k\u0017¬Ñáâ\u001a®\\|\u0091_Ê\u0084\u000fû@¿zU¿\u000bðc5¦òà7óx«½Qæ\u0011+3mõ\u0096\u0099Û@\u001cpAm\u008bíÌ¹ñ\u0099:f\u007f\u001c¡ÒêÆ/¤Pv\u0095SßÌ\u0000þE´\u008e\u001f³\u001dô(>üc\u008b¤Eék\u0012<Tâ\u0099\u0092Â\u0005\u0007<H%rÇ·\u008fø³=5f^\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u001a>Ìû¼±pn\u0017+\u0012àëÝ©\u009a\u0095PY\r<Êï\u0087Ë|\u0087:N÷>¬£iÖ&\u0084\u001c`Ù&\u0096VSÌ\bªÆy\u0083Ux\u001f5¼òç¯\u0098eD\"\u000e\u001fðÔø\u0091Õ\"fçu¨-m×6\u0097ûµ½sF\u001f\u000bÆÌö\u0091ë[k\u001c?!\u001fêà¯\u009aqT:@ÿ!\u0080ëE\u0086\u000fOÐ7\u0095+^Øc\u0086$ºîm³\u0018tÁ9úÂ \u0084uIP\u0012Æ×à\u0098·¢[g\u0015(ví¡¶\u009ex^=tÆ.\u008b\u0086LÏ\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u0010>Æû¶±rnZ+FàüÝº\u009a\u0089PE\r/Ê¬\u0087\u0097|\u0088:T÷>¬ài\u0088&Å²fwu8-ý×¦\u0097kµ-sÖ\u001f\u009bÆ\\ö\u0001ëËk\u008c?±\u001fzà?\u009aáTª@o#\u0010ðÕ\u0090\u009fT@7\u0005\"ÎØó\u009c´º~*#\u0018äÞ©íR¡\u0014sÙP\u0082\u008bGô\b°2Z÷\u0004¸l}©\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u0000>Öû´±inG+FàüÝº\u009a\u0089PE\r/Ê¬\u0087\u0097|\u0088:T÷>¬ài\u0088&Å\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u0010>Ðû¬±tnC+\tàþÝº\u009a\u009aPG\r}Êé\u0087Í|\u009c:N÷\"¬£i\u009a&\u0083\u001caÙ)\u0096\u0015S\u0093\bø\u008cªI¹\u0006áÃ\u001b\u0098[Uy\u0013¿èÓ¥\nb:?'õ§²ó\u008fÓD,\u0001Vß\u0098\u0094\u008cQñ.!ë\u0019¡\u0098~©;åð\u0013ÍM\u008a{@£\u001d\u0091Ú%\u0097!lp*¢çÎ¼Oyv6o\f\u008dÉÅ\u0086ùC\u007f\u0018\u0014±ftu;-þ×¥\u0097hµ.sÕ\u001f\u0098Æ_ö\u0002ëÈk\u008f?²\u001fyà<\u009aâT©@l#\u0013ãÖ\u008c\u009cICr\u0006(ÍÍðÈ·¿}k \tçÍª¿Q \u0017nÚ\u0004\u0081\u0083Dû\u000b«1]ô\u0013»?~è%\u0094ëB®`U(\u0018ØßÏ\u0082öHw\u000f52Ýù\u0081¼ïb$\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u001a>Ìû¼±pn\u0017+\u0014àðÝ»\u009a\u0090P\n\r-Êí\u0087Í|\u008f:L÷p¬æiÀ&\u0097\u001c{Ù5\u0096VS\u0081\b¾Æ~\u0083Tx\u000e5¦òï\u0003¿Æ¬\u0089ôL\u000e\u0017NÚl\u009cªgÆ*\u001fí/°2z²=æ\u0000ÆË9\u008eCP\u008d\u001b\u0099Þé¡.d^.\u008fñ«´ñ\u007f\u0003BH\u0005\"Ï°\u0092ËU\u001b\u00180ãr¥ªhÚ3\u0013ö$¹r\u0083ÍFÛ\týÌ\"\u0097NY\u0080\u001cãç¼ª\u0003mC0iú«½£\u0080J\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u001f>Íû´±`n\u0017+\u0005àëÝ\u00ad\u009a\u009fPO\r3Êø\u0087Ö|\u008f:M÷p¬æiÀ&\u0097\u001c{Ù5\u0096VS\u0081\b¾Æ~\u0083Tx\u000e5¦òï\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u001f>Ñû§±in\u0017+\u0003àëÝº\u009a\u0094PX\r}Ê¤\u0087Ù|\u009b:O÷3¬¹i\u0092\u0014hÑ{\u009e#[Ù\u0000\u0099Í»\u008b}p\u0011=Èúø§åme*1\u0017\u0011Üî\u0099\u0094GZ\fNÉ?¶ùs\u00929Fæ}£hhÔU\u008e\u0012¼Øt\u0085SBÆ\u000fðô´²n\u007f^$Èáî®¹\u0094UQ\u001b\u001exÛ¯\u0080\u0090NP\u000bzð ½\u0088zÁ\u001cºÙ©\u0096ñS\u000b\bKÅi\u0083¯xÃ5\u001aò*¯7e·\"ã\u001fÃÔ<\u0091FO\u0088\u0004\u009cÁí¾+{@1\u0094î¯«º`\u0006][\u001aiÐ²\u008dÄJ\u001e\u00070üwº¹w\u008c,\u000fé/¦`\u009c\u0085YÞ\u0016äÓ!\u0088\u0004F\u0093\u0003§øåµ\u0001r\u0013/gå¿¢î\u009f\u0000TL\u0011)Ïð\u0084ÍA\u000f>+ûw±Ýn\u0096\u009cFYU\u0016\rÓ÷\u0088·E\u0095\u0003Sø?µærÖ/ËåK¢\u001f\u009f?TÀ\u0011ºÏt\u0084`A\u0007>Ðû´±jnD+\u0007àúÝ¼\u009a\u0092PE\r3Ê¬\u0087Ü|\u0081:O÷$¬æiÊ&\u0091\u001c4Ù\"\u0096\u0004SÛ\b·Æy\u0083\u001axE5úòº¯\u0090eR\"Z\u001f³\u009cFYu\u0016-ÓÓ\u0088\u0086EÔ\u0003Aø?µçrÙ/\u0087ås¢7\u009f\u0019T\u008f\u0011¸Ïp\u0084)A\u001f>Çû±±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r}\u009cLYY\u0016\u0010Óá\u0088¬E\u009a\u0003@øvµÈrñ/»å:¢e\u009f\u001aTÚ\u0011°Ïr\u0084zAS\u009cGYQ\u0016\nÓþ\u0088 E\u0090\u0003\u0007ø\"µær\u0098/\u0099å\u007f¢=\u009f\u0010TÎ\u0011½Ït\u0084`A2>ëû\u0085±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r})ßìà£ÐfM=9ð\u0006¶ÐMå\u0000YÇY\u009a\u001dPí\u0017\u00ad*ÏáZ¤,zë1¿ô\u0085\u008bUNf\u0004¿ÛÂ\u009e\u0080Udh8/Rå\u0099\u008aêOÞ\u0000\u008aÅl\u009e^S\u0003\u0015óî\u008c£Vd#9\u0013óÓ´\u0093\u0089£Bg\u0007EÙÌ\u0092\u009aW¡(uí\u000b§Ûx¬=õöDË\u0006\u008c.Fò\u001bÜÜ\u0017\u009cLYY\u0016\u0010Óá\u0088¬E\u009a\u0003@øvµÙr÷/¸åY¢\u0004\u009f5T\u008f\u0011öÏw\u00845A\u001d>Áûï±$\u009cHY^\u0016\u0015Óó\u0088©E\u009d\u0003CøvµÙrÙ/\u0092åw¢(\u009f\u0012TÛ\u0011¸Ïr\u0084)AS>\u008aû³±qnY+\u0005à£Ýè\u009cLYY\u0016\u0010Óá\u0088¬E\u009a\u0003@øvµÈrñ/¯å:¢e\u009f\u001aTÚ\u0011°Ïr\u0084zAS\u009fÑZÑ\u0015\u009aÐ\u007f\u008b F\u001a\u0000Óûö¶Oq{,\"æº¡®\u009c\u008eWJ\u0012?Ìå\u0087¥BÓ=Dø4²ímÛ(\u0083ã}Þh\u0099SSÌ\u000e¨Éb\u0084\\\u007fT9\u0081\u009cQYt\u0016,ÓÞ\u0088åE¦\u0003Bø\"µûrÑ/\u008eål¢,\u009f\u0010T\u008f\u0011¸Ïp\u0084)A\u001f>Çû±±$n\u001f+\u0000àìÝ¦\u009a\u0098P\u0010\r}\u009cWYw\u00163ÓÝ\u0088åE¹\u0003tø\u0012µ©rþ/\u008aås¢!\u009f\u0019TË\u0011þÏ9\u0084&A\u0006>Ìû¶±>n\u0017\u009cWYY\u0016\u0010Óó\u0088åE¸\u0003Hø7µír\u0098/¨åh¢(\u009f\u0018TÜ\u0011þÏw\u0084!A\u001a>Îû°±`n\u0017+NàÿÝ½\u009a\u0095PI\rgÊ¬\u0004\fÁ*\u008exK\u008b\u0010¬Ýí\u009b\u001c`p-¦ê\u0098·Î}6:$\u0007[Ì\u0089\u0089ãWx\u001chÙL¦\u008acõ)!ö\u001f³Mx¼Eä\u0002\u0092ÈK\u0095rR°\u001f\u0098äÄ¢Ro9\u009cVYB\u0016\fÓü\u0088¢EÔ\u0003cø\u0005µÛrè/Ëåj¢?\u009f\u0013TÉ\u0011·Ï}\u0084%AS>Ôû°±vnD+\u000fàöÝ¦\u009aÛP\u0002\r;Êù\u0087Ñ|\u008d:\u001b÷pF_\u0083yÌ+\tØRÿ\u009f\u00adÙR\"\"o÷¨Ëõ\u0085?ix8E\b\u008e\u0095Ë«\u0015m^z\u009b\u001cäË!ªk>´Cñ\u0013:÷\u0007ò@\u0092\u008aQ×3\u0010ÿ]Ö¦\u0092àR-/vý³\u0088ü×Æh\u0003(L\u0002\u0089ÐÒø\u001c1n\u0001«'äu!\u0086z¡·äñ\u0011\nsG£\u0080\u008fÝÎ\u0017=P}mQ¦\u0084ãô=uvM³SÌÆ\tÿC/\u009c\u0007Ù\u0002\u0012¼/úhÞ¢\u0007ÿu8©u\u0099\u008eÆÈ\u0000\u00054^ï\u009b\u0090ÔÔî>+`d\b¡Í\u0015\u0084Ð¢\u009fðZ\u0003\u0001$Ìa\u008a\u0094qö<&û\n¦Kl¸+ø\u0016ÔÝ\u0001\u0098qFð\råÈ×·\u0000rx8¬ç\u0098¢Âi<T)\u0013\u0012Ù\u008d\u0084éC#\u000e\u001dõ\u0015³ÀRô\u0097ÒØ\u0080\u001dsFT\u008b\u0012Íä6\u0088{V¼náz+êlµQ\u009d\u009a>ßG\u0001ÆJ\u0084\u008f¬ðp5^\u007f\u0095\u009cEYc\u00161ÓÂ\u0088åE\u0099\u0003Nø%µúrÑ/\u0085å}¢m\u009f\u0011TÎ\u0011°Ïu\u0084!A\u0007>Íû§±}n\u0017+\u0002àøÝ¼\u009a\u009aP\n\ruÊê\u0087Ê|\u0080:B÷j¬£\u009cKY~\u0016\"Ó²\u0088\u0080E\u0086\u0003Uø9µûr\u0082/Ëf]£dìy)\u009br×¿ëùa\u0002\n".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2582);
        getOutputSizeshNQ4ISI = cArr;
        getOutputSizes = -1211087205270136528L;
    }
}
