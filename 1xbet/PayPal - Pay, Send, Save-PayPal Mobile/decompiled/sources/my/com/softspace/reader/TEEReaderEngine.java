package my.com.softspace.reader;

/* loaded from: classes17.dex */
public final class TEEReaderEngine {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static my.com.softspace.reader.TEEReaderEngine getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static final java.lang.Object getHighSpeedVideoSizes;
    private boolean Camera2StreamConfigurationMap;
    private final my.com.softspace.reader.TransactionHandler getHighSpeedVideoFpsRanges;
    private my.com.softspace.reader.ILogger getInputFormats;
    private final java.security.SecureRandom getInputSizeshNQ4ISI;
    private boolean getOutputMinFrameDuration;

    public interface NFCProvider {
        default void disableListening() {
        }

        default void enableListening(android.content.Context context, java.util.function.BiFunction<android.nfc.NfcAdapter, android.nfc.Tag, java.lang.Void> biFunction) {
        }
    }

    private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = s + 4;
        int i3 = i + 103;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 6];
        int i4 = b + 5;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i4 + (-i2)) - 5;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i3 = (i3 + (-bArr[i2])) - 5;
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = (s * 3) + 4;
        byte[] bArr = $$d;
        int i4 = 103 - (s2 * 4);
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 35];
        int i6 = i5 + 34;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4 = (i4 + i7) - 3;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i4 = (i4 + i7) - 3;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static boolean isInit() {
        while (true) {
        }
    }

    public interface EncryptionModel {
        default java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return new java.lang.Object[]{0, bArr2};
        }

        default java.lang.Object[] hmacSHA256(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[32]};
        }

        default java.lang.Object[] cmac(byte[] bArr) {
            return new java.lang.Object[]{0, new byte[16]};
        }
    }

    static {
        byte[] bArr = {64, -102, 18, -39, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 27;
        byte[] bArr2 = {com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, 101, 94, 67, -4, -57, -2, 41, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 239;
        getHighSpeedVideoSizes = new java.lang.Object();
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (-bArr2[15]), b, b, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = my.com.softspace.reader.TEEReaderEngine.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 349 - android.view.Gravity.getAbsoluteGravity(0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.VT, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -224120305, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -224120305};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char edgeSlop = (char) (45285 - (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                int indexOf = android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int i = (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4;
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(edgeSlop, indexOf, i, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.text.TextUtils.getTrimmedLength("") + 104, 33 - android.graphics.Color.red(0)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r10}, new int[1]};
                int i2 = ((int[]) objArr5[3])[0];
                int i3 = ((int[]) objArr5[2])[0];
                int i4 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                int i5 = ~elapsedCpuTime;
                int i6 = i2 + (-1542549760) + ((elapsedCpuTime | 29395336) * 140) + (((~(29395336 | i5)) | 974729232) * (-280)) + (((~(elapsedCpuTime | (-974729233))) | (~(991508760 | i5)) | 12615808) * 140);
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr6[3])[0] = i8 ^ (i8 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[24], (byte) (-bArr2[21]), (byte) (-bArr2[38]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b4 = bArr2[24];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | com.google.common.base.Ascii.FF), (byte) (-bArr2[102]), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(bArr2[24], (byte) (-bArr2[58]), bArr2[8], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(b, bArr2[9], (byte) 56, objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[24], bArr2[41], (byte) (239 & 337), objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b5 = (byte) (-bArr2[42]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(b, b5, (byte) (b5 | 71), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(my.com.softspace.reader.TEEReaderEngine.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b6 = (byte) (-bArr2[38]);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b6, b6, (byte) 92, objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                        return;
                    }
                    byte b7 = (byte) (-bArr2[38]);
                    byte b8 = bArr2[14];
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(b7, b8, (byte) (b8 | com.visa.cbp.getEncExpo.IResultReceiver2), objArr14);
                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(invoke, invoke2, str);
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

    private TEEReaderEngine(java.security.SecureRandom secureRandom, my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = new my.com.softspace.reader.internal.NfcTransactionHandler();
        this.getHighSpeedVideoFpsRanges = nfcTransactionHandler;
        nfcTransactionHandler.injectEncryptionModel(encryptionModel);
        nfcTransactionHandler.injectNFCTagController(nFCProvider);
        this.getInputSizeshNQ4ISI = secureRandom;
    }

    private TEEReaderEngine(java.security.SecureRandom secureRandom, boolean z, my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel, boolean z2, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        my.com.softspace.reader.internal.NfcTransactionHandler nfcTransactionHandler = new my.com.softspace.reader.internal.NfcTransactionHandler();
        this.getHighSpeedVideoFpsRanges = nfcTransactionHandler;
        nfcTransactionHandler.injectEncryptionModel(encryptionModel);
        nfcTransactionHandler.injectNFCTagController(nFCProvider);
        this.getInputSizeshNQ4ISI = secureRandom;
        this.Camera2StreamConfigurationMap = z;
        this.getOutputMinFrameDuration = z2;
    }

    public static my.com.softspace.reader.TEEReaderEngine init(java.security.SecureRandom secureRandom, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        return init(secureRandom, new my.com.softspace.reader.TEEReaderEngine.EncryptionModel() { // from class: my.com.softspace.reader.TEEReaderEngine.1
        }, nFCProvider);
    }

    public static my.com.softspace.reader.TEEReaderEngine init(java.security.SecureRandom secureRandom, my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        return init(secureRandom, encryptionModel, new my.com.softspace.reader.ILogger() { // from class: my.com.softspace.reader.TEEReaderEngine.2
        }, nFCProvider);
    }

    public static my.com.softspace.reader.TEEReaderEngine init(java.security.SecureRandom secureRandom, my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel, my.com.softspace.reader.ILogger iLogger, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        my.com.softspace.reader.TEEReaderEngine tEEReaderEngine = new my.com.softspace.reader.TEEReaderEngine(secureRandom, encryptionModel, nFCProvider);
        getHighResolutionOutputSizeshNQ4ISI = tEEReaderEngine;
        tEEReaderEngine.getInputFormats = iLogger;
        getHighSpeedVideoFpsRangesFor = true;
        return tEEReaderEngine;
    }

    public static my.com.softspace.reader.TEEReaderEngine init(java.security.SecureRandom secureRandom, boolean z, my.com.softspace.reader.TEEReaderEngine.EncryptionModel encryptionModel, boolean z2, my.com.softspace.reader.ILogger iLogger, my.com.softspace.reader.TEEReaderEngine.NFCProvider nFCProvider) {
        my.com.softspace.reader.TEEReaderEngine tEEReaderEngine = new my.com.softspace.reader.TEEReaderEngine(secureRandom, z, encryptionModel, z2, nFCProvider);
        getHighResolutionOutputSizeshNQ4ISI = tEEReaderEngine;
        tEEReaderEngine.getInputFormats = iLogger;
        getHighSpeedVideoFpsRangesFor = true;
        return tEEReaderEngine;
    }

    public static my.com.softspace.reader.TEEReaderEngine getInstance() {
        if (!getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException();
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final my.com.softspace.reader.ILogger getLogger() {
        return this.getInputFormats;
    }

    public final my.com.softspace.reader.TransactionHandler provideTransaction() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.security.SecureRandom sharedSecureRandom() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isSecureData() {
        return this.getOutputMinFrameDuration;
    }

    public final boolean isProductionMode() {
        return this.Camera2StreamConfigurationMap;
    }
}
