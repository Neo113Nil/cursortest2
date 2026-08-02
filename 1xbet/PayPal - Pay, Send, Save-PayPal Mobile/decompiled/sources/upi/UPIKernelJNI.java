package upi;

/* loaded from: classes18.dex */
public class UPIKernelJNI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = 108 - i2;
        int i4 = 106 - s;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[21 - i];
        int i5 = 20 - i;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i4 + i5) - 5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i3 = (i7 + bArr[i4]) - 5;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 2;
        byte[] bArr = $$d;
        int i3 = 3 - (s2 * 4);
        int i4 = (s * 3) + 103;
        byte[] bArr2 = new byte[35 - i2];
        int i5 = 34 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i5;
            i4 = (i8 + (-i4)) - 3;
            i3 = i6;
            i = i7;
            int i9 = i3 + 1;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            i8 = i4;
            i4 = b2;
            i6 = i9;
            i4 = (i8 + (-i4)) - 3;
            i3 = i6;
            i = i7;
            int i92 = i3 + 1;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i922 = i3 + 1;
            bArr2[i] = (byte) i4;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    public static native void free(long j);

    public static native void freeTransaction(long j);

    public static native void init();

    public static native long newContext();

    public static native void setup(long j, byte[] bArr, byte[] bArr2);

    public static native byte[] start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, upi.UPIKernelCallback uPIKernelCallback) throws java.lang.IllegalArgumentException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {com.google.common.base.Ascii.EM, -98, 105, 102, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 44;
        byte[] bArr2 = {com.google.common.base.Ascii.GS, 122, 56, com.google.common.base.Ascii.EM, -5, 4, -1, 10, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 117;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 102, (byte) 15, bArr2[54], objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = upi.UPIKernelJNI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.graphics.Color.red(0), 349 - android.text.TextUtils.getOffsetAfter("", 0), 10 - android.text.TextUtils.getOffsetAfter("", 0), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -2017441681, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -2017441681};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char normalizeMetaState = (char) (45285 - android.view.KeyEvent.normalizeMetaState(0));
                int size = android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int green = 3 - android.graphics.Color.green(0);
                byte b = bArr[14];
                byte b2 = b;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, b2, b2, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(normalizeMetaState, size, green, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.view.KeyEvent.getDeadChar(0, 0) + 15771), 104 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 33 - android.view.KeyEvent.getDeadChar(0, 0)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r11}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int freeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                int i4 = ~freeMemory;
                int i5 = i + 1318840856 + (((~(511163999 | i4)) | 509740097) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i4 | 509774919)) | 511129177) * (-440)) + ((freeMemory | 511163999) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (117 & 491), bArr2[5], (byte) (-bArr2[16]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (117 & 475), (byte) (bArr2[6] + 1), (byte) (-bArr2[16]), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) 61, bArr2[38], (byte) (-bArr2[16]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[35], bArr2[21], bArr2[38], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (117 & 175), bArr2[43], (byte) (-bArr2[16]), objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b3 = bArr2[37];
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b3, (byte) (b3 & com.google.common.base.Ascii.SI), bArr2[38], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(upi.UPIKernelJNI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b4 = bArr2[7];
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b4, b4, (byte) (bArr2[6] + 1), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        byte b5 = bArr2[6];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a((byte) (b5 + 1), bArr2[23], (byte) (b5 + 1), objArr14);
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
