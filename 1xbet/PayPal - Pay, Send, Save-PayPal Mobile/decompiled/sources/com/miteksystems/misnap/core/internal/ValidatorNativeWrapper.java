package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/internal/ValidatorNativeWrapper;", "", "<init>", "()V", "", "a", "()Z", "", "loadKeySpec", "()[B"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class ValidatorNativeWrapper {
    private static final byte[] $$d = {org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 116, -42, -81, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
    private static final int $$e = 37;
    private static final byte[] $$a = {86, 123, -90, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -1, -13, -45, -8, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
    private static final int $$b = 12;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = b + 3;
        byte[] bArr = $$a;
        int i3 = 112 - s2;
        byte[] bArr2 = new byte[s + 6];
        int i4 = s + 5;
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 = (i3 + (-i2)) - 5;
            i2 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i2;
            i2 = bArr[i2];
            i3 = (i3 + (-i2)) - 5;
            i2 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i4) {
            }
        }
    }

    private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
        byte[] bArr = $$d;
        int i4 = i * 4;
        int i5 = 3 - (i3 * 2);
        int i6 = 103 - (i2 * 4);
        byte[] bArr2 = new byte[i4 + 35];
        int i7 = i4 + 34;
        int i8 = -1;
        if (bArr == null) {
            i6 = (i5 + i6) - 3;
            i5 = i5;
            i8 = -1;
        }
        while (true) {
            int i9 = i8 + 1;
            int i10 = i5 + 1;
            bArr2[i9] = (byte) i6;
            if (i9 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = (i6 + bArr[i10]) - 3;
            i5 = i10;
            i8 = i9;
        }
    }

    public final native byte[] loadKeySpec();

    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    public final /* synthetic */ boolean a() {
        try {
            byte[] bArr = $$a;
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, b2, b2, objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.ClassLoader classLoader = com.miteksystems.misnap.core.internal.ValidatorNativeWrapper.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.view.KeyEvent.normalizeMetaState(0), 349 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {str, classLoader, false, 1274023479, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 1274023479};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char maximumFlingVelocity = (char) (45285 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int trimmedLength = 158 - android.text.TextUtils.getTrimmedLength("");
                        int keyRepeatDelay = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3;
                        byte b3 = $$d[14];
                        byte b4 = b3;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr4);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(maximumFlingVelocity, trimmedLength, keyRepeatDelay, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 103, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                        java.lang.Object[] objArr6 = {r6, new int[]{r12}, new int[]{r11}, new int[1]};
                        int i = ((int[]) objArr5[3])[0];
                        int i2 = ((int[]) objArr5[2])[0];
                        int i3 = ((int[]) objArr5[1])[0];
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        int myUid = android.os.Process.myUid();
                        int i4 = (~((-124477853) | myUid)) | 90857732;
                        int i5 = i + 1458613408 + (i4 * 992) + ((i4 | (~((~myUid) | 930046364))) * (-496)) + ((myUid | 896426244) * 496);
                        int i6 = (i5 << 13) ^ i5;
                        int i7 = i6 ^ (i6 >>> 17);
                        ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((byte) (-bArr[20]), bArr[13], (byte) (-bArr[37]), objArr7);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((byte) ($$b + 3), bArr[13], (byte) (-bArr[101]), objArr8);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b((byte) (-bArr[57]), bArr[13], (byte) (-bArr[17]), objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(bArr[8], bArr[40], (byte) 56, objArr10);
                            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b(bArr[40], bArr[13], (byte) 65, objArr11);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                            byte b5 = (byte) (-bArr[7]);
                            byte b6 = bArr[40];
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b(b5, b6, (byte) (b6 | 70), objArr12);
                            java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.miteksystems.misnap.core.internal.ValidatorNativeWrapper.class, new java.lang.Object[0]);
                            if (android.os.Build.VERSION.SDK_INT <= 24) {
                                byte b7 = (byte) (-bArr[37]);
                                byte b8 = bArr[8];
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b(b7, b8, (byte) (b8 | 88), objArr13);
                                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(invoke, str, invoke2);
                            } else {
                                byte b9 = bArr[13];
                                byte b10 = bArr[8];
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(b9, b10, (byte) (b10 | 98), objArr14);
                                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(invoke, invoke2, str);
                            }
                            int i8 = ((int[]) objArr6[3])[0];
                            int i9 = i8 * i8;
                            int i10 = -(1802029824 * i8);
                            int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                            int i12 = -(i8 * (-1037907898));
                            int i13 = (i11 & i12) + (i12 | i11);
                            int i14 = (i13 & (-139502135)) + ((-139502135) | i13);
                            int i15 = i14 >> 22;
                            int i16 = (((i15 | (-2047)) << 1) - (i15 ^ (-2047))) / 1024;
                            int i17 = (i16 & 1) + (i16 | 1);
                            int i18 = (i14 & i17) + (i17 | i14);
                            int i19 = i14 >> 28;
                            int i20 = (((i19 | (-31)) << 1) - (i19 ^ (-31))) / 16;
                            int i21 = -((((i20 | 1) << 1) - (i20 ^ 1)) ^ i18);
                            int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
                            int i23 = (((i22 >> 16) - 131071) / 65536) + 1;
                            return 509 / (((-((i23 & 1) + (i23 | 1))) & i22) * 509);
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
