package visa;

/* loaded from: classes18.dex */
public final class VISAKernelJNI {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = i + 4;
        byte[] bArr = $$a;
        int i3 = 108 - s2;
        byte[] bArr2 = new byte[s + 6];
        int i4 = s + 5;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (i4 + (-i2)) - 5;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            int i7 = i2 + 1;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i6;
            i3 = (i3 + (-bArr[i7])) - 5;
            i2 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 103 - (b * 3);
        int i3 = b2 + 4;
        int i4 = s * 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 35];
        int i5 = i4 + 34;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2 = (i2 + i6) - 3;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i++;
            i2 = (i2 + i6) - 3;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    public static native void free(long j);

    public static native void freeTransaction(long j);

    public static native void init();

    public static native long newContext();

    public static native void setup(long j, byte[] bArr, byte[] bArr2);

    public static native byte[] start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, visa.VISAKernelCallback vISAKernelCallback) throws java.lang.IllegalArgumentException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {106, 124, -118, -18, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 113;
        byte[] bArr2 = {118, 85, -10, -52, -35, 38, -7, -3, -52, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (byte) (b - 1), (byte) (-bArr2[18]), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = visa.VISAKernelJNI.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 348 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 11 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -1230818340, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -1230818340};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char c = (char) (45286 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int size = android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int blue = 3 - android.graphics.Color.blue(0);
                byte b2 = bArr[14];
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, bArr[13], b2, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, size, blue, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15771), 104 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.View.MeasureSpec.getMode(0) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r11}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int nextInt = new java.util.Random().nextInt();
                int i4 = ~((-683139669) | nextInt);
                int i5 = ~nextInt;
                int i6 = i4 | (~(337764428 | i5));
                int i7 = ~(683139668 | i5);
                int i8 = i + (-1154098496) + ((i6 | i7) * (-516)) + (((~(nextInt | (-2220101))) | (~((-335544329) | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((335544328 | i7) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr6[3])[0] = i10 ^ (i10 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (-bArr2[21]), bArr2[9], bArr2[16], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (bArr2[11] - 1), (byte) (-bArr2[61]), bArr2[16], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (-bArr2[2]), (byte) (-bArr2[19]), bArr2[16], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b3 = bArr2[9];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(b3, (byte) (b3 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE), (byte) (-bArr2[38]), objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[41], (byte) (198 & 368), bArr2[16], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b4 = (byte) (-bArr2[42]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | 70), (byte) (-bArr2[38]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(visa.VISAKernelJNI.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((byte) (-bArr2[38]), (byte) 91, b, objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(bArr2[14], (byte) 101, b, objArr14);
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
