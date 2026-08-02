package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public abstract class lIIllllIIl {
    public static java.lang.Error IlIllIlIIl = null;
    public static boolean llIIlIlIIl = false;
    private static final byte[] $$d = {87, -111, 66, 14, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
    private static final int $$e = 44;
    private static final byte[] $$a = {89, -90, 60, -111, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
    private static final int $$b = 10;

    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    public static boolean IlIllIlIIl() {
        if (!llIIlIlIIl) {
            try {
                if (!com.microblink.blinkid.hardware.MicroblinkDeviceManager.IllIIIllII) {
                    throw new java.lang.UnsatisfiedLinkError("Incompatible CPU!");
                }
                java.lang.String str = com.microblink.blinkid.secured.IlIlllllII.llIIlIlIIl[0];
                com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.lIIllllIIl.class, "Loading lib{}.so", str);
                java.lang.ClassLoader classLoader = com.microblink.blinkid.secured.lIIllllIIl.class.getClassLoader();
                try {
                    java.lang.Object[] objArr = {-1395598504};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 350, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    try {
                        java.lang.Object[] objArr2 = {str, classLoader, false, -1967763178, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr), -1967763178};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                        if (Camera2StreamConfigurationMap2 == null) {
                            char keyRepeatTimeout = (char) (45285 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int maximumDrawingCacheSize = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                            int resolveSize = 3 - android.view.View.resolveSize(0, 0);
                            byte[] bArr = $$d;
                            byte b = bArr[13];
                            byte b2 = bArr[14];
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(b, b2, b2, objArr3);
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(keyRepeatTimeout, maximumDrawingCacheSize, resolveSize, 1475857042, false, (java.lang.String) objArr3[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.graphics.Color.green(0) + 15771), 104 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 34 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2);
                        if (((int[]) objArr4[2])[0] != ((int[]) objArr4[1])[0]) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.String[] strArr = (java.lang.String[]) objArr4[0];
                            if (strArr != null) {
                                for (java.lang.String str2 : strArr) {
                                    arrayList.add(str2);
                                }
                            }
                            throw new java.lang.NullPointerException();
                        }
                        java.lang.Object[] objArr5 = {r3, new int[]{r15}, new int[]{r14}, new int[1]};
                        int i = ((int[]) objArr4[3])[0];
                        int i2 = ((int[]) objArr4[2])[0];
                        int i3 = ((int[]) objArr4[1])[0];
                        java.lang.String[] strArr2 = (java.lang.String[]) objArr4[0];
                        int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                        int i4 = ~((-213957121) | startElapsedRealtime);
                        int i5 = i + (-933455512) + ((805371998 | i4) * (-476)) + (i4 * 952) + ((~((~startElapsedRealtime) | (-213957121))) * 476);
                        int i6 = (i5 << 13) ^ i5;
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) objArr5[3])[0] = i7 ^ (i7 << 5);
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 | 7);
                        try {
                            byte[] bArr2 = $$a;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(b3, b4, bArr2[11], objArr6);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b(bArr2[6], (byte) (-bArr2[16]), bArr2[11], objArr7);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) 36, bArr2[9], bArr2[11], objArr8);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b((byte) (bArr2[12] - 1), b3, (byte) (-bArr2[33]), objArr9);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr9[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(bArr2[2], (byte) (-bArr2[33]), bArr2[11], objArr10);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b((byte) ($$b | 64), bArr2[4], (byte) (-bArr2[33]), objArr11);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr11[0], new java.lang.Class[0]).invoke(com.microblink.blinkid.secured.lIIllllIIl.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                byte b5 = (byte) 87;
                                byte b6 = (byte) (b5 & 1);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                b(b5, b6, (byte) (b6 - 1), objArr12);
                                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr12[0], cls3, cls2);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(invoke, str, invoke2);
                            } else {
                                byte b7 = bArr2[11];
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b((byte) 97, b7, (byte) (b7 - 2), objArr13);
                                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(invoke, invoke2, str);
                            }
                            int i8 = ((int[]) objArr5[3])[0];
                            int i9 = ((i8 * i8) - (~(-(1666844624 * i8)))) - 1;
                            int i10 = -(i8 * 976981696);
                            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                            int i12 = (i11 & 1326138432) + (1326138432 | i11);
                            int i13 = ((i12 >> 22) - 2047) / 1024;
                            int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
                            int i15 = ((i12 | i14) << 1) - (i14 ^ i12);
                            int i16 = i12 >> 23;
                            int i17 = (((i16 | (-1023)) << 1) - (i16 ^ (-1023))) / 512;
                            int i18 = -(i15 ^ ((i17 & 1) + (i17 | 1)));
                            int i19 = (i18 & 7) + (i18 | 7);
                            int i20 = i19 >> 22;
                            int i21 = (((i20 | (-2047)) << 1) - (i20 ^ (-2047))) / 1024;
                            int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
                            llIIlIlIIl = 3430 / (((-((i22 ^ 1) + ((i22 & 1) << 1))) & i19) * 490);
                        } catch (java.lang.reflect.InvocationTargetException e) {
                            java.lang.Throwable cause = e.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw e;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause3 = th2.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th2;
                }
            } catch (java.lang.Error e2) {
                llIIlIlIIl = false;
                com.microblink.blinkid.util.Log.e(com.microblink.blinkid.secured.lIIllllIIl.class, e2, "error loading native library", new java.lang.Object[0]);
                IlIllIlIIl = e2;
            }
        }
        return llIIlIlIIl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i = b + 4;
        ?? r6 = 103 - (s * 3);
        byte[] bArr = $$d;
        int i2 = s2 * 3;
        byte[] bArr2 = new byte[35 - i2];
        int i3 = 34 - i2;
        int i4 = -1;
        byte b2 = r6;
        if (bArr == null) {
            i4 = -1;
            b2 = (r6 + i) - 3;
            i = i;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = b2;
            if (i5 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i6 = i + 1;
            i4 = i5;
            b2 = (b2 + bArr[i6]) - 3;
            i = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 108 - b;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i2 + 10];
        int i6 = i2 + 9;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = (i7 + (-i5)) - 5;
            int i11 = i9 + 1;
            i3 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i9 = i5;
            i5 = bArr[i5];
            i8 = i3 + 1;
            i7 = i12;
            int i102 = (i7 + (-i5)) - 5;
            int i112 = i9 + 1;
            i3 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static void llIIlIlIIl() {
        if (IlIllIlIIl()) {
            return;
        }
        java.lang.Error error = IlIllIlIIl;
        if (error == null) {
            throw new java.lang.RuntimeException("Native library is not loaded");
        }
        throw error;
    }
}
