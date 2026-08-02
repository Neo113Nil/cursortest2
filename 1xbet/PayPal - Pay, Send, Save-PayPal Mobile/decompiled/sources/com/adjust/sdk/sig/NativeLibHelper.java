package com.adjust.sdk.sig;

/* loaded from: classes7.dex */
class NativeLibHelper implements com.adjust.sdk.sig.a {
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
    private static void a(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 21 - s;
        int i5 = s2 + 103;
        byte[] bArr = $$a;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            i3 = 0;
            int i9 = (i8 + i6) - 5;
            int i10 = i7 + 1;
            i2 = i3;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i7 = i6;
            i6 = bArr[i6];
            i8 = i11;
            int i92 = (i8 + i6) - 5;
            int i102 = i7 + 1;
            i2 = i3;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = 3 - (i2 * 2);
        int i4 = 103 - (b * 4);
        int i5 = i * 4;
        byte[] bArr2 = new byte[35 - i5];
        int i6 = 34 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i3 + i6) - 3;
            i3 = i3;
        }
        while (true) {
            i7++;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i4 = (i4 + bArr[i8]) - 3;
                i3 = i8;
            }
        }
    }

    native void nOnResume();

    native byte[] nSign(android.content.Context context, java.lang.Object obj, byte[] bArr, int i);

    static {
        byte[] bArr = {com.google.common.base.Ascii.ETB, -98, 35, com.google.common.base.Ascii.GS, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 200;
        byte[] bArr2 = {103, 105, 16, 89, 1, -47, 8, 3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 241;
        try {
            byte b = (byte) (bArr2[4] - 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(b, (byte) (b | com.google.common.base.Ascii.SI), (byte) (-bArr2[16]), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.ClassLoader classLoader = com.adjust.sdk.sig.NativeLibHelper.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 349, 9 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {str, classLoader, false, -883509943, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -883509943};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char lastIndexOf = (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45286);
                        int myTid = 158 - (android.os.Process.myTid() >> 22);
                        int makeMeasureSpec = 3 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b2 = bArr[14];
                        byte b3 = b2;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr4);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf, myTid, makeMeasureSpec, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 105, android.graphics.Color.red(0) + 33), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                        java.lang.Object[] objArr6 = {r0, new int[]{r11}, new int[]{r10}, new int[1]};
                        int i = ((int[]) objArr5[3])[0];
                        int i2 = ((int[]) objArr5[2])[0];
                        int i3 = ((int[]) objArr5[1])[0];
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        int maxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                        int i4 = i + ((((-1632445600) + (((~maxMemory) | (-987085919)) * 1444)) + (((~(maxMemory | 966178665)) | ((~(54725431 | maxMemory)) | (-1003995008))) * (-1444))) - 288538340);
                        int i5 = (i4 << 13) ^ i4;
                        int i6 = i5 ^ (i5 >>> 17);
                        ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a(bArr2[38], (byte) (-bArr2[9]), bArr2[7], objArr7);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            a(bArr2[102], (byte) (bArr2[4] - 1), bArr2[7], objArr8);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            a(bArr2[18], bArr2[38], bArr2[7], objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a((byte) 56, bArr2[21], (byte) (bArr2[4] - 1), objArr10);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            a((byte) (241 & 327), bArr2[43], bArr2[7], objArr11);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                            byte b4 = (byte) 79;
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a(b4, (byte) (b4 & com.google.common.base.Ascii.ETB), (byte) (bArr2[4] - 1), objArr12);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.adjust.sdk.sig.NativeLibHelper.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a((byte) 92, bArr2[58], bArr2[38], objArr13);
                                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(invoke, str, invoke2);
                                return;
                            }
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            a((byte) (bArr2[0] - 1), bArr2[23], bArr2[38], objArr14);
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
                    throw new java.lang.NullPointerException();
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
        } catch (java.lang.UnsatisfiedLinkError e2) {
            e2.getMessage();
        }
    }
}
