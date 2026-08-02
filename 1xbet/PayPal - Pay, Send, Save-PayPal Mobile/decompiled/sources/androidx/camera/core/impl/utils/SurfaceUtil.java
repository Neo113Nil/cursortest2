package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public class SurfaceUtil {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    public static final java.lang.String JNI_LIB_NAME = "surface_util_jni";

    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    private static void a(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2 = 106 - i;
        byte[] bArr = $$a;
        int i3 = 108 - b;
        byte[] bArr2 = new byte[21 - s];
        int i4 = 20 - s;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 5;
            i2++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 = (i3 + bArr[i2]) - 5;
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 3 - (i2 * 3);
        int i6 = i3 * 4;
        int i7 = 103 - (i * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6 + 35];
        int i8 = i6 + 34;
        if (bArr == null) {
            int i9 = i5;
            int i10 = 0;
            i7 = (i7 + (-i5)) - 3;
            i5 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            int i11 = i5 + 1;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4 + 1;
            i9 = i11;
            i5 = bArr[i11];
            i10 = i12;
            i7 = (i7 + (-i5)) - 3;
            i5 = i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            int i112 = i5 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            int i1122 = i5 + 1;
            if (i4 == i8) {
            }
        }
    }

    private static native int[] nativeGetSurfaceInfo(android.view.Surface surface);

    static {
        byte[] bArr = {56, -54, 111, 88, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 150;
        byte[] bArr2 = {110, 41, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -101, 9, 6, -43, 7, 5, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 186;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr2[21], (byte) 102, (byte) 15, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = androidx.camera.core.impl.utils.SurfaceUtil.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), android.view.View.combineMeasuredStates(0, 0) + 349, android.view.MotionEvent.axisFromString("") + 11, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, 1801458006, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1801458006};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char gidForName = (char) (android.os.Process.getGidForName("") + 45286);
                int absoluteGravity = 158 - android.view.Gravity.getAbsoluteGravity(0, 0);
                int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L) + 3;
                byte b = bArr[14];
                byte b2 = b;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, b2, b2, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(gidForName, absoluteGravity, packedPositionType, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 15771), 104 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 33 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r11}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                int i4 = ~startElapsedRealtime;
                int i5 = i + 936350136 + ((startElapsedRealtime | 4752) * 988) + (((~(485234322 | i4)) | 50440204) * (-1976)) + (((~(startElapsedRealtime | (-535669775))) | 4752 | (~(i4 | 535669774))) * 988);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (-bArr2[16]), (byte) 97, (byte) (-bArr2[9]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b3 = (byte) 0;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (-bArr2[16]), (byte) 81, b3, objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (-bArr2[16]), (byte) 61, bArr2[8], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[8], bArr2[35], bArr2[21], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (-bArr2[16]), (byte) (bArr2[55] - 1), bArr2[5], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(bArr2[8], bArr2[37], bArr2[7], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(androidx.camera.core.impl.utils.SurfaceUtil.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT > 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b3, b3, bArr2[4], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, invoke2, str);
                        return;
                    }
                    byte b4 = bArr2[58];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(b3, b4, b4, objArr14);
                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls3, cls2);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(invoke, str, invoke2);
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

    private SurfaceUtil() {
    }

    public static androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo getSurfaceInfo(android.view.Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo surfaceInfo = new androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo();
        surfaceInfo.format = nativeGetSurfaceInfo[0];
        surfaceInfo.width = nativeGetSurfaceInfo[1];
        surfaceInfo.height = nativeGetSurfaceInfo[2];
        return surfaceInfo;
    }
}
