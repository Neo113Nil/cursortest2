package jcb;

/* loaded from: classes17.dex */
public final class JCBKernelJNI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    private static void a(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i = s + 103;
        int i2 = 105 - b;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b2 + 6];
        int i3 = b2 + 5;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + i2) - 5;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            int i6 = i2 + 1;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i6]) - 5;
                i2 = i6;
                i4 = i5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = 103 - (s * 3);
        int i3 = s2 + 4;
        int i4 = s3 * 3;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[35 - i4];
        int i5 = 34 - i4;
        if (bArr == null) {
            int i6 = i3;
            i2 = i5;
            int i7 = 0;
            i2 = (i2 + (-i3)) - 3;
            i3 = i6;
            i = i7;
            bArr2[i] = (byte) i2;
            int i8 = i3 + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i2 = (i2 + (-i3)) - 3;
            i3 = i6;
            i = i7;
            bArr2[i] = (byte) i2;
            int i82 = i3 + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i822 = i3 + 1;
            if (i == i5) {
            }
        }
    }

    public static native void free(long j);

    public static native void freeTransaction(long j);

    public static native void init();

    public static native long newContext();

    public static native void setup(long j, byte[] bArr, byte[] bArr2);

    public static native byte[] start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, jcb.JCBKernelCallback jCBKernelCallback) throws java.lang.IllegalArgumentException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 75, 76, -100, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 84;
        byte[] bArr2 = {4, 65, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 39, -15, -36, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -45, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (-bArr2[4]), (byte) 102, (byte) (bArr2[6] - 1), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = jcb.JCBKernelJNI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 349, android.graphics.Color.red(0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -751427391, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -751427391};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char windowTouchSlop = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 45285);
                int mode = 158 - android.view.View.MeasureSpec.getMode(0);
                int alpha = 3 - android.graphics.Color.alpha(0);
                byte b = bArr[14];
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, bArr[4], b, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(windowTouchSlop, mode, alpha, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), 104 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r13}, new int[]{r12}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                int i4 = i + (-550436236) + (((~((-273604896) | elapsedRealtime)) | (-1020191136)) * (-502)) + ((~((~elapsedRealtime) | (-272891935))) * (-502)) + (((~(elapsedRealtime | (-747299202))) | (-273604896)) * 502);
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[56], (byte) 97, bArr2[21], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(bArr2[56], (byte) 81, (byte) (-bArr2[4]), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(bArr2[56], (byte) 61, bArr2[58], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a((byte) (bArr2[6] - 1), bArr2[35], bArr2[0], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[56], (byte) (bArr2[55] - 1), bArr2[23], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) (bArr2[6] - 1), bArr2[37], bArr2[42], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(jcb.JCBKernelJNI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b2 = bArr2[38];
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b2, bArr2[58], b2, objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        byte b3 = bArr2[38];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(b3, (byte) (b3 - 5), bArr2[43], objArr14);
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
