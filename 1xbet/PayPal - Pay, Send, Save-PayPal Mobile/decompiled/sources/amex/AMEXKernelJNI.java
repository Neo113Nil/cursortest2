package amex;

/* loaded from: classes5.dex */
public class AMEXKernelJNI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s3 + 100;
        int i4 = 21 - s2;
        byte[] bArr = $$a;
        int i5 = 106 - s;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = (i6 + (-i5)) - 5;
            int i9 = i7 + 1;
            i = i2;
            i3 = i8;
            i5 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3;
            i7 = i5;
            i5 = bArr[i5];
            i6 = i10;
            int i82 = (i6 + (-i5)) - 5;
            int i92 = i7 + 1;
            i = i2;
            i3 = i82;
            i5 = i92;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = (b * 3) + 4;
        int i4 = i * 3;
        int i5 = 103 - (s * 4);
        byte[] bArr2 = new byte[35 - i4];
        int i6 = 34 - i4;
        if (bArr == null) {
            int i7 = i5;
            i2 = 0;
            i5 = i6;
            i5 = (i5 + i7) - 3;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i2++;
            i5 = (i5 + i7) - 3;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    public static native void free(long j);

    public static native void freeTransaction(long j);

    public static native void init();

    public static native long newContext();

    public static native void setup(long j, byte[] bArr, byte[] bArr2);

    public static native byte[] start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, amex.AMEXKernelCallback aMEXKernelCallback) throws java.lang.IllegalArgumentException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {78, 109, -55, com.google.common.base.Ascii.CAN, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 86;
        byte[] bArr2 = {103, 105, 16, 89, -6, 39, -46, 45, -14, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (bArr2[0] - 1), (byte) (bArr2[2] - 1), b, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = amex.AMEXKernelJNI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 349 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, 1926542495, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1926542495};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char doubleTapTimeout = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 45285);
                int i = 157 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i2 = 4 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(doubleTapTimeout, i, i2, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15770 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.View.resolveSize(0, 0) + 104, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r5}, new int[1]};
                int i3 = ((int[]) objArr5[3])[0];
                int i4 = ((int[]) objArr5[2])[0];
                int i5 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i6 = (~((int) java.lang.Runtime.getRuntime().totalMemory())) | 660252205;
                int i7 = i3 + (-473184064) + (i6 * 495) + (((~i6) | 89785377) * 495);
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr6[3])[0] = i9 ^ (i9 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) 97, bArr2[9], bArr2[14], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) 81, b, bArr2[14], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) 61, (byte) (-bArr2[38]), bArr2[14], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[12], (byte) (-bArr2[21]), bArr2[24], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    byte b4 = bArr2[14];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) 37, b4, b4, objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b5 = (byte) (-bArr2[37]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b5, (byte) (b5 & com.google.common.base.Ascii.SI), bArr2[24], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(amex.AMEXKernelJNI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b6 = (byte) (-bArr2[58]);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b6, b6, (byte) (-bArr2[42]), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b, bArr2[41], (byte) (-bArr2[42]), objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str);
                    }
                    init();
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
}
