package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/miteksystems/misnap/core/internal/LicensingNativeWrapper;", "", "<init>", "()V", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "featureName", "", "checkLicense", "(Ljava/lang/String;Ljava/lang/String;)Z", "checkIsExpired", "(Ljava/lang/String;)Z", "a", "()Z"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class LicensingNativeWrapper {
    private static final byte[] $$d = {39, 58, 111, com.visa.cbp.getEncExpo.kernelVersion, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
    private static final int $$e = 94;
    private static final byte[] $$a = {39, 58, 111, com.visa.cbp.getEncExpo.kernelVersion, -8, 0, 8, -42, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = 152;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 105 - b;
        int i4 = 115 - s;
        byte[] bArr2 = new byte[i + 5];
        int i5 = i + 4;
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 5;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i2++;
            i3++;
            i4 = (i4 + i6) - 5;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = s * 3;
        int i5 = 103 - (i2 * 4);
        int i6 = 4 - (i * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[35 - i4];
        int i7 = 34 - i4;
        if (bArr == null) {
            int i8 = i5;
            i5 = i7;
            i3 = 0;
            i6++;
            i5 = (i5 + i8) - 3;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i6];
            i6++;
            i5 = (i5 + i8) - 3;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private final native boolean checkIsExpired(java.lang.String license);

    private final native boolean checkLicense(java.lang.String license, java.lang.String featureName);

    public final /* synthetic */ boolean a(java.lang.String license) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
        return checkIsExpired(license);
    }

    public final /* synthetic */ boolean a(java.lang.String license, java.lang.String featureName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(license, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        return checkLicense(license, featureName);
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [boolean, int] */
    public final /* synthetic */ boolean a() {
        byte b = (byte) 101;
        try {
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, b2, b2, objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.ClassLoader classLoader = com.miteksystems.misnap.core.internal.LicensingNativeWrapper.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 350, 10 - android.view.KeyEvent.normalizeMetaState(0), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {str, classLoader, false, 1098272719, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1098272719};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char lastIndexOf = (char) (45284 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 159;
                        int indexOf2 = android.text.TextUtils.indexOf("", "", 0) + 3;
                        byte b3 = $$d[14];
                        byte b4 = b3;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr4);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(lastIndexOf, indexOf, indexOf2, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.view.View.combineMeasuredStates(0, 0)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 105, 32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                        java.lang.Object[] objArr6 = {r5, new int[]{r12}, new int[]{r11}, new int[1]};
                        int i = ((int[]) objArr5[3])[0];
                        int i2 = ((int[]) objArr5[2])[0];
                        int i3 = ((int[]) objArr5[1])[0];
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        int i4 = ~new java.util.Random().nextInt();
                        int i5 = i + (-1395535088) + ((~(1002027678 | i4)) * 52) + (((~(698878090 | i4)) | (~((-322026007) | i4)) | 303149588) * (-52)) + (((~(i4 | (-698878091))) | 680001672) * 52);
                        int i6 = (i5 << 13) ^ i5;
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) 97, bArr[104], bArr[22], objArr7);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) 81, (byte) (-bArr[10]), bArr[22], objArr8);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b((byte) 61, bArr[20], bArr[22], objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(bArr[34], bArr[37], bArr[104], objArr10);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b((byte) (bArr[54] - 1), bArr[57], bArr[22], objArr11);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b(bArr[36], bArr[22], bArr[104], objArr12);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.miteksystems.misnap.core.internal.LicensingNativeWrapper.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                byte b5 = bArr[57];
                                byte b6 = bArr[42];
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b(b5, b6, (byte) (b6 + 1), objArr13);
                                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(invoke, str, invoke2);
                            } else {
                                byte b7 = bArr[5];
                                byte b8 = (byte) (b7 | 7);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr14);
                                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(invoke, invoke2, str);
                            }
                            int i8 = ((int[]) objArr6[3])[0];
                            int i9 = i8 * i8;
                            int i10 = -(1286905169 * i8);
                            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
                            int i12 = -(i8 * (-1541478257));
                            int i13 = (i11 & i12) + (i12 | i11);
                            int i14 = (i13 ^ 2102436096) + ((2102436096 & i13) << 1);
                            int i15 = i14 >> 23;
                            int i16 = (((i15 | (-1023)) << 1) - (i15 ^ (-1023))) / 512;
                            int i17 = (i14 - (~((i16 & 1) + (i16 | 1)))) - 1;
                            int i18 = i14 >> 29;
                            int i19 = ((i18 ^ (-15)) + ((i18 & (-15)) << 1)) / 8;
                            int i20 = -(i17 ^ ((i19 & 1) + (i19 | 1)));
                            int i21 = ((i20 | 7) << 1) - (i20 ^ 7);
                            int i22 = ((i21 >> 15) - 262143) / 131072;
                            int i23 = (i22 & 1) + (i22 | 1);
                            return 6335 / (((-((i23 ^ 1) + ((i23 & 1) << 1))) & i21) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_DIMENSION);
                        } catch (java.lang.reflect.InvocationTargetException e) {
                            java.lang.Throwable cause = e.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw e;
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
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
