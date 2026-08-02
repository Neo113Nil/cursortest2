package sspog.internal;

/* loaded from: classes18.dex */
public class SSPOGIsolatedNativeService extends android.app.Service {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private sspog.internal.IIsolatedNativeVerifyingProcess.Stub mBinder = new sspog.internal.IIsolatedNativeVerifyingProcess.Stub() { // from class: sspog.internal.SSPOGIsolatedNativeService.1
        @Override // sspog.internal.IIsolatedNativeVerifyingProcess
        public boolean isMagiskNativelyDetected() throws android.os.RemoteException {
            sspog.SimpleLogger.d("SSPOGService", "Running SSPOGIsolatedNativeService", new java.lang.Object[0]);
            return sspog.internal.SSPOGIsolatedNativeService.this.isMagiskPresentNative();
        }
    };

    private static void a(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3 = i2 + 103;
        int i4 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 6];
        int i5 = b + 5;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (i3 + (-i4)) - 5;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i7;
            i3 = (i3 + (-bArr[i8])) - 5;
            i4 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 4) + 103;
        int i5 = 3 - (b * 2);
        byte[] bArr = $$d;
        int i6 = 35 - (s * 3);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = (i5 + i7) - 3;
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i7 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i5 = i12;
            int i92 = (i5 + i7) - 3;
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public native boolean isMagiskPresentNative();

    static {
        byte[] bArr = {40, com.google.common.base.Ascii.VT, -89, -76, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 136;
        byte[] bArr2 = {118, 85, -10, -52, com.google.common.base.Ascii.SI, -2, -6, -5, -4, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 71;
        byte b = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) (bArr2[5] + 1), bArr2[99], b, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = sspog.internal.SSPOGIsolatedNativeService.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 348, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -827454216, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -827454216};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char c = (char) (45286 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int scrollBarSize = 158 - (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                int red = android.graphics.Color.red(0) + 3;
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, scrollBarSize, red, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15772 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 103 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 33 - android.text.TextUtils.getOffsetAfter("", 0)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r10}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int nextInt = new java.util.Random().nextInt(1821743734);
                int i4 = ~nextInt;
                int i5 = i + 1078978696 + ((~(37964651 | i4)) * 979) + ((nextInt | 1058868748) * (-979)) + (((~(nextInt | 37964651)) | (~(i4 | 1058868748))) * 979);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[9], bArr2[24], (byte) (-bArr2[21]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) (-bArr2[61]), bArr2[24], bArr2[4], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (-bArr2[19]), bArr2[24], (byte) (-bArr2[2]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a((byte) 55, b, bArr2[9], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (71 & 496), bArr2[24], bArr2[41], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) 78, b, (byte) (-bArr2[42]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(sspog.internal.SSPOGIsolatedNativeService.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT > 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((byte) 101, (byte) (-bArr2[7]), bArr2[14], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, invoke2, str);
                        return;
                    }
                    byte b4 = (byte) (-bArr2[7]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a((byte) 91, b4, b4, objArr14);
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

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
