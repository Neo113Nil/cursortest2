package util.h.xy.v;

/* loaded from: classes5.dex */
public class mb {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static util.h.xy.ae.b Camera2StreamConfigurationMap = null;
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static final int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static boolean getHighSpeedVideoSizes = false;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static util.h.xy.ae.ma getInputFormats = null;
    private static boolean getInputSizeshNQ4ISI = false;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static char getOutputMinFrameDurationlomOqCM;
    private static util.h.xy.ae.mb getOutputSizes;
    private static java.lang.Object getOutputStallDuration;
    private static int getOutputStallDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 108 - s2;
        byte[] bArr = $$a;
        int i4 = s3 + 6;
        int i5 = 106 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i3 = i4;
            i2 = 0;
            i5++;
            i3 = (i3 + i6) - 5;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i5++;
            i3 = (i3 + i6) - 5;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = 4 - (s * 4);
        int i4 = (i * 2) + 103;
        int i5 = s2 * 3;
        byte[] bArr2 = new byte[35 - i5];
        int i6 = 34 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3++;
            i4 = (i7 + i4) - 3;
            i2 = i8;
            int i9 = i3;
            int i10 = i4;
            bArr2[i2] = (byte) i10;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3 = i9;
            i4 = bArr[i9];
            i8 = i2 + 1;
            i7 = i10;
            i3++;
            i4 = (i7 + i4) - 3;
            i2 = i8;
            int i92 = i3;
            int i102 = i4;
            bArr2[i2] = (byte) i102;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i3;
            int i1022 = i4;
            bArr2[i2] = (byte) i1022;
            if (i2 == i6) {
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object[] objArr) {
        int i;
        int i2 = getOutputFormats;
        getOutputMinFrameDuration = ((i2 & 73) + (i2 | 73)) % 128;
        char[] cArr = new char[1];
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            int i3 = (i2 + 1) % 128;
            getOutputMinFrameDuration = i3;
            int i4 = (i3 ^ 87) + ((i3 & 87) << 1);
            getOutputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 5;
            }
            i = 719;
        } else {
            i = 715;
        }
        cArr[0] = (char) i;
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [boolean, int] */
    static {
        byte[] bArr = {39, com.google.common.base.Ascii.SYN, -92, -36, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
        byte[] bArr2 = {77, -89, -118, -2, 39, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, 5, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 44;
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap();
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 102, bArr2[19], b, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = util.h.xy.v.mb.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap2 == null) {
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 349 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -16542061, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2), -16542061};
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap3 == null) {
                char trimmedLength = (char) (45285 - android.text.TextUtils.getTrimmedLength(""));
                int bitsPerPixel = 157 - android.graphics.ImageFormat.getBitsPerPixel(0);
                int i = 4 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(trimmedLength, bitsPerPixel, i, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 104 - android.text.TextUtils.getOffsetBefore("", 0), 33 - android.graphics.Color.green(0)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r10}, new int[1]};
                int i2 = ((int[]) objArr5[3])[0];
                int i3 = ((int[]) objArr5[2])[0];
                int i4 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i5 = ~new java.util.Random().nextInt(851800586);
                int i6 = i2 + (-1652665528) + ((~(784314751 | i5)) * 52) + (((~(247075111 | i5)) | (~((-773828986) | i5)) | 537239640) * (-52)) + (((~(i5 | (-247075112))) | 10485766) * 52);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr6[3])[0] = i8 ^ (i8 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) 97, (byte) (-bArr2[3]), bArr2[21], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b4 = (byte) (-bArr2[3]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) 81, b4, (byte) (b4 | 13), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (44 | 17), (byte) (-bArr2[3]), bArr2[58], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[35], bArr2[8], (byte) (-bArr2[9]), objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (bArr2[55] - 1), (byte) (-bArr2[3]), bArr2[23], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(bArr2[37], bArr2[8], bArr2[42], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(util.h.xy.v.mb.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(bArr2[58], b, bArr2[8], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b, b, bArr2[43], objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str);
                    }
                    getHighSpeedVideoSizesFor = "mb";
                    getOutputStallDurationlomOqCM = -90;
                    int i9 = ((int[]) objArr6[3])[0];
                    int i10 = ((i9 * i9) - (~(-(1524808855 * i9)))) - 1;
                    int i11 = -(i9 * 1103361791);
                    int i12 = (i10 & i11) + (i11 | i10);
                    int i13 = (i12 ^ 220251897) + ((220251897 & i12) << 1);
                    int i14 = i13 >> 29;
                    int i15 = ((i14 ^ (-15)) + ((i14 & (-15)) << 1)) / 8;
                    int i16 = (i13 - (~(((i15 | 1) << 1) - (i15 ^ 1)))) - 1;
                    int i17 = i13 >> 15;
                    int i18 = -(i16 ^ (((((-262143) & i17) + (i17 | (-262143))) / 131072) + 1));
                    int i19 = (i18 & 5) + (i18 | 5);
                    int i20 = (((i19 >> 21) - 4095) / 2048) + 1;
                    getInputSizeshNQ4ISI = 0 / (((-((i20 & 1) + (i20 | 1))) & i19) * 805);
                    getInputFormats = new util.h.xy.ae.ma();
                    getOutputSizes = new util.h.xy.ae.mb();
                    Camera2StreamConfigurationMap = new util.h.xy.ae.b();
                    getOutputStallDuration = new java.lang.Object();
                    getHighSpeedVideoSizes = false;
                    int i21 = getOutputFormats + 111;
                    getOutputMinFrameDuration = i21 % 128;
                    if (i21 % 2 == 0) {
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
                for (java.lang.String str2 : strArr2) {
                    arrayList.add(str2);
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x024b, code lost:
    
        if (r2 != util.h.xy.v.ma.f2610.m27668()) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x024d, code lost:
    
        Camera2StreamConfigurationMap(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x020c, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r5).invoke(null, r7)).intValue() != r2) goto L48;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27670(android.content.Context context) {
        synchronized (getOutputStallDuration) {
            if (!getInputSizeshNQ4ISI && !getHighSpeedVideoSizes) {
                java.io.File databasePath = context.getDatabasePath(util.h.xy.al.ra.f498);
                java.io.File filesDir = context.getFilesDir();
                java.lang.String absolutePath = databasePath.getParentFile().getAbsolutePath();
                java.io.File file = new java.io.File(absolutePath);
                if (!file.exists()) {
                    file.mkdir();
                }
                util.h.xy.v.a aVar = util.h.xy.v.a.f2437;
                util.h.xy.ae.ma maVar = getInputFormats;
                util.h.xy.ae.mb mbVar = getOutputSizes;
                util.h.xy.ae.b bVar = Camera2StreamConfigurationMap;
                int m27566 = aVar.m27566(maVar, mbVar, bVar, mbVar, bVar, absolutePath, filesDir.getAbsolutePath(), new int[0], 0, new long[0], 0);
                if (m27566 == util.h.xy.v.ma.f2572.m27668()) {
                    try {
                        int i = -(-(android.view.KeyEvent.getMaxKeyCode() >> 16));
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI((byte) ((i & 107) + (i | 107)), "\u0014\u0016\u0001\u0017\u000f\n\r\u0003\u0012\f\u0002\u0014\u000f\u000b\u0012\t\u0016\u0012\u0012\r\u0010\u0001\u000e\u0002\u0006\u000b", 26 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
                        int nextInt = ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt();
                        try {
                            java.lang.Object[] objArr2 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                            java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                            if (obj == null) {
                                int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
                                int i2 = -android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                int i3 = ~currentTimeMillis;
                                int i4 = ~((i3 & (-47504)) | (i3 ^ (-47504)));
                                int i5 = ~i2;
                                int i6 = ~((i5 & currentTimeMillis) | (i5 ^ currentTimeMillis));
                                int i7 = ~((i5 & i3) | (i3 ^ i5));
                                int i8 = ~((currentTimeMillis ^ (-47504)) | (currentTimeMillis & (-47504)));
                                int i9 = (i8 ^ i7) | (i8 & i7);
                                int i10 = ~((i2 ^ 47503) | (i2 & 47503));
                                int i11 = (i2 * 371) + 17623613 + (((i4 & i6) | (i4 ^ i6)) * (-370)) + (((i9 ^ i10) | (i9 & i10)) * (-370));
                                int i12 = -(-((~(i2 | 47503)) * com.knotapi.knot.utilities.Constants.ID_KROGER));
                                char c = (char) ((i11 & i12) + (i12 | i11));
                                int rgb = android.graphics.Color.rgb(0, 0, 0);
                                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                int i13 = (rgb * (-432)) - 1308613734;
                                int i14 = ~rgb;
                                int i15 = (~currentTimeMillis2) | i14;
                                int i16 = -(-((~((i15 & 16777237) | (i15 ^ 16777237))) * 433));
                                int i17 = (i13 & i16) + (i13 | i16);
                                int i18 = ((~(((-16777238) & currentTimeMillis2) | (currentTimeMillis2 ^ (-16777238)))) | i14) * (-433);
                                int i19 = ~(currentTimeMillis2 | i14);
                                int i20 = ~(rgb | 16777237);
                                java.lang.Class cls = (java.lang.Class) util.h.xy.dd.b.m26271((edgeSlop >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, c, (((i17 | i18) << 1) - (i18 ^ i17)) + (((i20 ^ i19) | (i20 & i19)) * 433));
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(objArr3);
                                java.lang.String str = (java.lang.String) objArr3[0];
                                int axisFromString = android.view.MotionEvent.axisFromString("");
                                int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                                int i21 = (axisFromString * (-419)) + 18945;
                                int i22 = (~((currentTimeMillis3 ^ 45) | (currentTimeMillis3 & 45))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                                int i23 = (i21 & i22) + (i21 | i22);
                                int i24 = ~axisFromString;
                                int i25 = ((i24 ^ 45) | (i24 & 45)) * (-420);
                                int i26 = (i23 ^ i25) + ((i25 & i23) << 1);
                                int i27 = ~((i24 ^ (-46)) | (i24 & (-46)));
                                int i28 = ~currentTimeMillis3;
                                int i29 = ~((i28 ^ 45) | (i28 & 45));
                                int i30 = ((i27 ^ i29) | (i27 & i29)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
                                byte b = (byte) ((i26 ^ i30) + ((i30 & i26) << 1));
                                int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                                int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                int i31 = -(-(touchSlop * 306));
                                int i32 = (i31 & androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) + (i31 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS);
                                int i33 = (i32 ^ 7038) + ((i32 & 7038) << 1);
                                int i34 = ~((touchSlop ^ 23) | (touchSlop & 23));
                                int i35 = ~((touchSlop ^ currentTimeMillis4) | (touchSlop & currentTimeMillis4));
                                int i36 = -(-(((i34 ^ i35) | (i34 & i35)) * 305));
                                int i37 = (i33 ^ i36) + ((i33 & i36) << 1);
                                int i38 = ~currentTimeMillis4;
                                int i39 = ~((touchSlop ^ i38) | (i38 & touchSlop));
                                int i40 = ((i39 ^ (-24)) | (i39 & (-24))) * 305;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(b, "\u0016\u000b\u0003\u000e\u0002\u0001\u0000\u000e\u0015\u0003\u0011\u0002\u0007\r\u0014\f\u0006\u0004\u0011\u0002\u0005\u0017㘚", (i37 & i40) + (i40 | i37), objArr4);
                                obj = cls.getMethod(str, java.lang.Class.forName((java.lang.String) objArr4[0]), java.lang.Integer.TYPE);
                                util.h.xy.dd.b.f1176.put(-1119310920, obj);
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else if (m27566 != util.h.xy.v.ma.f2565.m27668()) {
                    if (m27566 != util.h.xy.v.ma.f2557.m27668()) {
                        if (m27566 != util.h.xy.v.ma.f2598.m27668()) {
                            if (m27566 != util.h.xy.v.ma.f2597.m27668()) {
                            }
                        }
                    }
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(boolean z) {
        int i = getOutputFormats;
        int i2 = ((i ^ 1) + ((i & 1) << 1)) % 128;
        getOutputMinFrameDuration = i2;
        getHighSpeedVideoSizes = z;
        int i3 = i2 + 109;
        getOutputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m27671(android.content.Context context, util.h.xy.bu.a aVar) {
        int i;
        synchronized (util.h.xy.v.mb.class) {
            synchronized (getOutputStallDuration) {
                boolean z = getInputSizeshNQ4ISI;
                if (!z && aVar != null) {
                    java.io.File databasePath = context.getDatabasePath(util.h.xy.al.ra.f498);
                    java.io.File filesDir = context.getFilesDir();
                    java.lang.String absolutePath = databasePath.getParentFile().getAbsolutePath();
                    java.io.File file = new java.io.File(absolutePath);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    int[] iArr = new int[5];
                    iArr[0] = aVar.m25634();
                    int m27482 = util.h.xy.u.a.f2431.m27482(context);
                    if (m27482 == -1) {
                        iArr[1] = aVar.m25633();
                    } else {
                        iArr[1] = m27482;
                    }
                    iArr[2] = aVar.m25635() ? 1 : 0;
                    iArr[3] = aVar.m25636();
                    iArr[4] = aVar.m25632() ? 1 : 0;
                    long[] jArr = {aVar.m25637(), aVar.m25631()};
                    util.h.xy.v.a aVar2 = util.h.xy.v.a.f2437;
                    util.h.xy.ae.ma maVar = getInputFormats;
                    util.h.xy.ae.mb mbVar = getOutputSizes;
                    util.h.xy.ae.b bVar = Camera2StreamConfigurationMap;
                    int m27566 = aVar2.m27566(maVar, mbVar, bVar, mbVar, bVar, absolutePath, filesDir.getAbsolutePath(), iArr, 5, jArr, 2);
                    if (m27566 == util.h.xy.v.ma.f2572.m27668()) {
                        try {
                            int i2 = -((android.os.Process.getThreadPriority(0) + 20) >> 6);
                            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                            int i3 = (i2 * (-755)) - 80785;
                            int i4 = ~i2;
                            int i5 = -(-((~((i4 ^ (-108)) | (i4 & (-108)))) * 1512));
                            int i6 = ~(i4 | (-108));
                            int i7 = i2 | 107;
                            int i8 = ~((i7 ^ currentTimeMillis) | (i7 & currentTimeMillis));
                            int i9 = ((((i3 | i5) << 1) - (i3 ^ i5)) - (~(((i6 & i8) | (i6 ^ i8)) * (-756)))) - 1;
                            int i10 = -(-(((i2 ^ 107) | (i2 & 107) | (~currentTimeMillis)) * 756));
                            byte b = (byte) ((i9 & i10) + (i10 | i9));
                            int threadPriority = android.os.Process.getThreadPriority(0);
                            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                            int i11 = -(-(threadPriority * com.knotapi.knot.utilities.Constants.ID_KROGER));
                            int i12 = (i11 & 7400) + (i11 | 7400);
                            int i13 = ~currentTimeMillis2;
                            int i14 = (threadPriority | 20 | i13) * (-369);
                            int i15 = (i12 ^ i14) + ((i12 & i14) << 1);
                            int i16 = (i13 & (-21)) | (i13 ^ (-21));
                            int i17 = ~i16;
                            int i18 = -(-(((i17 ^ threadPriority) | (i17 & threadPriority)) * (-369)));
                            int i19 = ((i15 | i18) << 1) - (i18 ^ i15);
                            int i20 = ~threadPriority;
                            int i21 = ~((i20 ^ 20) | (i20 & 20));
                            int i22 = ~(currentTimeMillis2 | 20);
                            int i23 = (i22 ^ i21) | (i22 & i21);
                            int i24 = ~((threadPriority ^ i16) | (threadPriority & i16));
                            int i25 = -(-(((i24 ^ i23) | (i24 & i23)) * 369));
                            int i26 = (((i19 | i25) << 1) - (i25 ^ i19)) >> 6;
                            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                            int i27 = (i26 * (-300)) + 7852;
                            int i28 = i26 | 26;
                            int i29 = -(-((~((i28 ^ currentTimeMillis3) | (i28 & currentTimeMillis3))) * (-301)));
                            int i30 = ~(currentTimeMillis3 | (-27));
                            int i31 = ~currentTimeMillis3;
                            int i32 = ~((i31 ^ i26) | (i31 & i26));
                            int i33 = (((i27 | i29) << 1) - (i27 ^ i29)) + (((i30 & i32) | (i30 ^ i32)) * (-301));
                            int i34 = ~i26;
                            int i35 = ~((i34 ^ currentTimeMillis3) | (i34 & currentTimeMillis3));
                            int i36 = -(-(((i35 ^ (-27)) | (i35 & (-27))) * 301));
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(b, "\u0014\u0016\u0001\u0017\u000f\n\r\u0003\u0012\f\u0002\u0014\u000f\u000b\u0012\t\u0016\u0012\u0012\r\u0010\u0001\u000e\u0002\u0006\u000b", (i33 & i36) + (i36 | i33), objArr);
                            int nextInt = ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextInt();
                            try {
                                java.lang.Object[] objArr2 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                                java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                java.lang.Object obj2 = obj;
                                if (obj == null) {
                                    try {
                                        int i37 = (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1));
                                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                        int i38 = ~i37;
                                        int i39 = (((i37 * (-496)) - 60512) - (~((~(i38 | (-123))) * 497))) - 1;
                                        int i40 = ~((i38 ^ (-123)) | (i38 & (-123)) | currentTimeMillis4);
                                        int i41 = ~currentTimeMillis4;
                                        int i42 = (i41 ^ (-123)) | (i41 & (-123));
                                        int i43 = ~((i42 ^ i37) | (i42 & i37));
                                        int i44 = -(-(((i40 ^ i43) | (i40 & i43)) * 497));
                                        int i45 = (i39 & i44) + (i39 | i44);
                                        int i46 = ~((i41 & i38) | (i38 ^ i41));
                                        int i47 = ~((i38 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) | (i38 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE));
                                        int i48 = (i37 ^ (-123)) | (i37 & (-123));
                                        int i49 = -(-(((~((i48 ^ currentTimeMillis4) | (i48 & currentTimeMillis4))) | (i46 & i47) | (i47 ^ i46)) * 497));
                                        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
                                        int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                        int i50 = ~offsetBefore;
                                        int i51 = ~currentTimeMillis5;
                                        int i52 = ~((i51 & i50) | (i50 ^ i51));
                                        int i53 = ~((offsetBefore ^ (-47456)) | ((-47456) & offsetBefore));
                                        int i54 = (i52 ^ i53) | (i53 & i52);
                                        int i55 = ~((offsetBefore ^ currentTimeMillis5) | (offsetBefore & currentTimeMillis5));
                                        int i56 = (((offsetBefore * (-337)) + 16087245) - (~(((i54 ^ i55) | (i55 & i54)) * (-338)))) - 1;
                                        int i57 = (~((i50 & 47455) | (i50 ^ 47455))) * 338;
                                        int i58 = (47455 ^ offsetBefore) | (offsetBefore & 47455);
                                        int i59 = ~((i58 ^ currentTimeMillis5) | (i58 & currentTimeMillis5));
                                        char c = (char) ((((i56 ^ i57) + ((i56 & i57) << 1)) - (~(-(-(((i59 ^ i52) | (i59 & i52)) * 338))))) - 1);
                                        int i60 = -(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                        java.lang.Class cls = (java.lang.Class) util.h.xy.dd.b.m26271(((i45 | i49) << 1) - (i49 ^ i45), c, ((i60 | 21) << 1) - (i60 ^ 21));
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(objArr3);
                                        java.lang.String str = (java.lang.String) objArr3[0];
                                        byte argb = (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 44);
                                        int i61 = -android.view.View.combineMeasuredStates(0, 0);
                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(argb, "\u0016\u000b\u0003\u000e\u0002\u0001\u0000\u000e\u0015\u0003\u0011\u0002\u0007\r\u0014\f\u0006\u0004\u0011\u0002\u0005\u0017㘚", (i61 & 23) + (i61 | 23), objArr4);
                                        java.lang.reflect.Method method = cls.getMethod(str, java.lang.Class.forName((java.lang.String) objArr4[0]), java.lang.Integer.TYPE);
                                        util.h.xy.dd.b.f1176.put(-1119310920, method);
                                        obj2 = method;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue() != nextInt) {
                                    i = com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                }
                                i = -91;
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
                    } else if (m27566 == util.h.xy.v.ma.f2565.m27668()) {
                        i = 801;
                    } else if (m27566 == util.h.xy.v.ma.f2557.m27668()) {
                        i = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP;
                    } else if (m27566 == util.h.xy.v.ma.f2598.m27668()) {
                        i = 803;
                    } else if (m27566 == util.h.xy.v.ma.f2597.m27668()) {
                        i = com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED;
                    } else {
                        if (m27566 != util.h.xy.v.ma.f2610.m27668()) {
                            i = -90;
                        }
                        i = -91;
                    }
                    getOutputStallDurationlomOqCM = i;
                    getInputSizeshNQ4ISI = true;
                    return i;
                }
                return z ? getOutputStallDurationlomOqCM : -90;
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputMinFrameDurationlomOqCM);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
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
                        int i4 = mcVar.f2639;
                        int i5 = mcVar.f2640;
                        int i6 = mcVar.f2637;
                        int i7 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i4 * c) + i5];
                        cArr3[mcVar.f2638 + 1] = cArr[(i6 * c) + i7];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i8 = mcVar.f2639;
                        int i9 = mcVar.f2640;
                        int i10 = mcVar.f2637;
                        int i11 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i8 * c) + i9];
                        cArr3[mcVar.f2638 + 1] = cArr[(i10 * c) + i11];
                    } else {
                        int i12 = mcVar.f2639;
                        int i13 = mcVar.f2635;
                        int i14 = mcVar.f2637;
                        int i15 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i12 * c) + i13];
                        cArr3[mcVar.f2638 + 1] = cArr[(i14 * c) + i15];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr3[i16] = (char) (cArr3[i16] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27669() {
        synchronized (util.h.xy.v.mb.class) {
            synchronized (getOutputStallDuration) {
                getInputSizeshNQ4ISI = false;
                util.h.xy.f.b.f2201.m26762();
                Camera2StreamConfigurationMap(false);
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRangesFor = new char[]{41909, 41907, 41916, 41898, 41912, 41903, 41905, 41914, 41913, 41887, 41970, 41870, 41906, 41902, 41904, 41918, 41893, 41897, 41915, 41871, 41892, 41917, 41896, 41919, 41910};
        getOutputMinFrameDurationlomOqCM = (char) 38467;
    }

    static void Camera2StreamConfigurationMap() {
        int i = getOutputFormats;
        getOutputMinFrameDuration = (i + 113) % 128;
        getHighResolutionOutputSizeshNQ4ISI = new byte[]{35, 105, -115, com.google.common.base.Ascii.FS};
        getHighSpeedVideoFpsRanges = 63;
        getOutputMinFrameDuration = (i + 73) % 128;
    }
}
