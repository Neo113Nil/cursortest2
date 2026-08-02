package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public class SplitInstallHelper {
    private static final byte[] $$d = {org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -28, 33, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
    private static final int $$e = 140;
    private static final byte[] $$a = {109, -102, 126, -3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.RS, -40, 9, -8, 8, -24, 6, -18, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, -40, 9, -8};
    private static final int $$b = 175;
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallHelper");

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 100;
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[21 - b];
        int i6 = 20 - b;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = (i7 + (-i5)) - 5;
            i3 = i8;
            int i11 = i9;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            int i12 = i5 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i4;
            i9 = i12;
            i5 = bArr[i12];
            i8 = i3 + 1;
            i7 = i13;
            int i102 = (i7 + (-i5)) - 5;
            i3 = i8;
            int i112 = i9;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            int i122 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i1222 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b * 3;
        byte[] bArr = $$d;
        int i5 = 3 - (s * 3);
        int i6 = (i * 3) + 103;
        byte[] bArr2 = new byte[i4 + 35];
        int i7 = i4 + 34;
        if (bArr == null) {
            int i8 = i7;
            i3 = i5;
            int i9 = 0;
            i5 = (i5 + i8) - 3;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i3++;
            i9 = i2 + 1;
            if (i2 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i5 = (i5 + i8) - 3;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i3++;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i5 = i6;
            i3 = i5;
            bArr2[i2] = (byte) i5;
            i3++;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x038d, code lost:
    
        if (r9.invoke(r7, r1, r4) == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03c0, code lost:
    
        r1 = r1.substring(r1.lastIndexOf(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) + 4, r1.length() - 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x03be, code lost:
    
        if (r9.invoke(r7, r1, r4) != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void loadLibrary(android.content.Context context, java.lang.String str) throws java.lang.UnsatisfiedLinkError {
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            byte b = (byte) (-1);
            try {
            } catch (java.lang.UnsatisfiedLinkError e) {
                java.lang.String str2 = context.getApplicationInfo().nativeLibraryDir;
                java.lang.String mapLibraryName = java.lang.System.mapLibraryName(str);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(mapLibraryName);
                java.lang.String obj = sb.toString();
                if (!new java.io.File(obj).exists()) {
                    throw e;
                }
                java.lang.ClassLoader classLoader = com.google.android.play.core.splitinstall.SplitInstallHelper.class.getClassLoader();
                try {
                    java.lang.Object[] objArr = {-1395598504};
                    java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                    if (Camera2StreamConfigurationMap == null) {
                        Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 349 - android.text.TextUtils.getOffsetBefore("", 0), android.view.KeyEvent.getDeadChar(0, 0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    try {
                        java.lang.Object[] objArr2 = {obj, classLoader, true, -892042894, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr), -892042894};
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                        if (Camera2StreamConfigurationMap2 == null) {
                            char gidForName = (char) (android.os.Process.getGidForName("") + 45286);
                            int offsetBefore = 158 - android.text.TextUtils.getOffsetBefore("", 0);
                            int i = 4 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            byte b2 = $$d[14];
                            byte b3 = b2;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(b2, b3, b3, objArr3);
                            Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(gidForName, offsetBefore, i, 1475857042, false, (java.lang.String) objArr3[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 104 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 33), java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr4 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2);
                        if (((int[]) objArr4[2])[0] != ((int[]) objArr4[1])[0]) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.String[] strArr = (java.lang.String[]) objArr4[0];
                            if (strArr != null) {
                                for (java.lang.String str3 : strArr) {
                                    arrayList.add(str3);
                                }
                            }
                            throw new java.lang.NullPointerException();
                        }
                        java.lang.Object[] objArr5 = {r4, new int[]{r13}, new int[]{r11}, new int[1]};
                        int i2 = ((int[]) objArr4[3])[0];
                        int i3 = ((int[]) objArr4[2])[0];
                        int i4 = ((int[]) objArr4[1])[0];
                        java.lang.String[] strArr2 = (java.lang.String[]) objArr4[0];
                        int uptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                        int i5 = ~uptimeMillis;
                        int i6 = 877502240 + (((~((-907274419) | i5)) | 100780194 | (~((-113629679) | i5)) | (~(920123902 | uptimeMillis))) * (-84));
                        int i7 = (~(uptimeMillis | (-113629679))) | 907274418;
                        int i8 = ~(i5 | 113629678);
                        int i9 = i2 + i6 + ((i7 | i8) * (-84)) + (((-920123903) | i8) * 84);
                        int i10 = (i9 << 13) ^ i9;
                        int i11 = i10 ^ (i10 >>> 17);
                        ((int[]) objArr5[3])[0] = i11 ^ (i11 << 5);
                        try {
                            byte[] bArr = $$a;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(b, bArr[9], bArr[4], objArr6);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            int i12 = $$b;
                            byte b4 = (byte) 0;
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a((byte) (i12 & 31), bArr[9], b4, objArr7);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a((byte) (i12 & 115), bArr[9], (byte) (-bArr[33]), objArr8);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            a((byte) 50, bArr[19], (byte) (-bArr[16]), objArr9);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr9[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            byte b5 = bArr[9];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a((byte) 59, b5, b5, objArr10);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                            byte b6 = bArr[19];
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            a((byte) 73, b6, (byte) (b6 + 4), objArr11);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr11[0], new java.lang.Class[0]).invoke(com.google.android.play.core.splitinstall.SplitInstallHelper.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 27) {
                                if (obj != null) {
                                    try {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        a((byte) 107, b4, (byte) (b4 | com.google.common.base.Ascii.SI), objArr12);
                                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr12[0], cls3, cls2);
                                        declaredMethod.setAccessible(true);
                                    } catch (java.lang.Exception unused) {
                                        byte b7 = (byte) 112;
                                        byte[] bArr2 = $$a;
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        a(b7, (byte) (-bArr2[53]), (byte) (-bArr2[16]), objArr13);
                                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                        declaredMethod2.setAccessible(true);
                                    }
                                }
                                if (android.os.Build.VERSION.SDK_INT <= 24) {
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    a((byte) 86, r10[117], (byte) (-$$a[53]), objArr14);
                                    java.lang.reflect.Method declaredMethod3 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls3, cls2);
                                    declaredMethod3.setAccessible(true);
                                    declaredMethod3.invoke(invoke, obj, invoke2);
                                }
                                byte[] bArr3 = $$a;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a((byte) 96, bArr3[117], bArr3[36], objArr15);
                                java.lang.reflect.Method declaredMethod4 = cls.getDeclaredMethod((java.lang.String) objArr15[0], cls2, cls3);
                                declaredMethod4.setAccessible(true);
                                declaredMethod4.invoke(invoke, invoke2, obj);
                            }
                            byte b72 = (byte) 112;
                            byte[] bArr22 = $$a;
                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                            a(b72, (byte) (-bArr22[53]), (byte) (-bArr22[16]), objArr132);
                            java.lang.reflect.Method declaredMethod22 = cls.getDeclaredMethod((java.lang.String) objArr132[0], cls3, cls2);
                            declaredMethod22.setAccessible(true);
                        } catch (java.lang.reflect.InvocationTargetException e2) {
                            java.lang.Throwable cause = e2.getCause();
                            if (cause == null) {
                                throw e2;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause2 = th.getCause();
                        if (cause2 == null) {
                            throw th;
                        }
                        throw cause2;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause3 = th2.getCause();
                    if (cause3 == null) {
                        throw th2;
                    }
                    throw cause3;
                }
            }
            try {
                byte[] bArr4 = $$a;
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                a(b, bArr4[9], bArr4[4], objArr16);
                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                int i13 = $$b;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                a((byte) (i13 & 31), bArr4[9], (byte) 0, objArr17);
                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                a((byte) (i13 & 115), bArr4[9], (byte) (-bArr4[33]), objArr18);
                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                a((byte) 50, bArr4[19], (byte) (-bArr4[16]), objArr19);
                java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr19[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                byte b8 = bArr4[9];
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                a((byte) 59, b8, b8, objArr20);
                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                byte b9 = bArr4[19];
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                a((byte) 73, b9, (byte) (b9 + 4), objArr21);
                java.lang.Object invoke4 = cls8.getMethod((java.lang.String) objArr21[0], new java.lang.Class[0]).invoke(com.google.android.play.core.splitinstall.SplitInstallHelper.class, new java.lang.Object[0]);
                if (android.os.Build.VERSION.SDK_INT <= 24) {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    a((byte) 86, bArr4[117], (byte) (-bArr4[53]), objArr22);
                    java.lang.reflect.Method declaredMethod5 = cls5.getDeclaredMethod((java.lang.String) objArr22[0], cls7, cls6);
                    declaredMethod5.setAccessible(true);
                    declaredMethod5.invoke(invoke3, str, invoke4);
                } else {
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    a((byte) 96, bArr4[117], bArr4[36], objArr23);
                    java.lang.reflect.Method declaredMethod6 = cls5.getDeclaredMethod((java.lang.String) objArr23[0], cls6, cls7);
                    declaredMethod6.setAccessible(true);
                    declaredMethod6.invoke(invoke3, invoke4, str);
                }
            } catch (java.lang.reflect.InvocationTargetException e3) {
                java.lang.Throwable cause4 = e3.getCause();
                if (cause4 == null) {
                    throw e3;
                }
                throw cause4;
            }
        }
    }

    public static void updateAppInfo(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        com.google.android.play.core.splitinstall.internal.zzu zzuVar = zza;
        zzuVar.zzd("Calling dispatchPackageBroadcast", new java.lang.Object[0]);
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Method method = cls.getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mAppThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            obj.getClass().getMethod("dispatchPackageBroadcast", java.lang.Integer.TYPE, java.lang.String[].class).invoke(obj, 3, new java.lang.String[]{context.getPackageName()});
            zzuVar.zzd("Called dispatchPackageBroadcast", new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            zza.zzc(e, "Update app info with dispatchPackageBroadcast failed!", new java.lang.Object[0]);
        }
    }

    private SplitInstallHelper() {
    }
}
