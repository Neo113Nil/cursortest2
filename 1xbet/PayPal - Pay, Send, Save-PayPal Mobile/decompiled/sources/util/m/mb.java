package util.m;

/* loaded from: classes18.dex */
public class mb {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    public static final boolean LOG_ENABLED = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = i + 6;
        int i5 = s + 4;
        int i6 = s2 + 68;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            int i9 = (i7 + i5) - 5;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            int i12 = i6;
            i8 = i11;
            i5 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + i5) - 5;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (s * 4);
        byte[] bArr = $$d;
        int i4 = i * 2;
        int i5 = 103 - (b * 3);
        byte[] bArr2 = new byte[35 - i4];
        int i6 = 34 - i4;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i5 = (i5 + i3) - 3;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            int i9 = i3 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            i7 = i9;
            i3 = bArr[i9];
            i8 = i10;
            i5 = (i5 + i3) - 3;
            i3 = i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            int i92 = i3 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            int i922 = i3 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        byte[] bArr = {88, -53, -33, -122, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 36;
        byte[] bArr2 = {109, 73, 92, com.google.common.base.Ascii.RS, 39, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, 5, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 121;
        java.lang.String str = util.h.xy.al.ra.f366;
        java.lang.String str2 = util.h.xy.al.ra.f367;
        java.lang.String str3 = util.h.xy.al.ra.f376;
        java.lang.String str4 = util.h.xy.al.ra.f353;
        byte b = (byte) 0;
        byte b2 = (byte) (b - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(b, b2, (byte) (b2 + 1), objArr);
        java.lang.String str5 = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = util.m.mb.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.graphics.Color.blue(0), android.graphics.Color.red(0) + 349, android.widget.ExpandableListView.getPackedPositionType(0L) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str5, classLoader, false, 507925721, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 507925721};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char c = (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45285);
                int minimumFlingVelocity = 158 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0) + 3;
                byte b3 = bArr[14];
                byte b4 = b3;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                c(b3, b4, b4, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, minimumFlingVelocity, absoluteGravity, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.view.View.getDefaultSize(0, 0)), 104 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r10}, new int[]{r9}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i4 = ~android.os.Process.myPid();
                int i5 = i + (-2141855840) + (((~(i4 | (-973082691))) | (~((-13708573) | i4))) * (-184)) + ((17056417 | (~((-30764990) | i4)) | (~((-990139108) | i4))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 24379208;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(bArr2[21], (byte) (-bArr2[9]), bArr2[55], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((byte) 15, bArr2[61], bArr2[55], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(bArr2[58], bArr2[19], bArr2[55], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    byte b5 = (byte) (-bArr2[9]);
                    byte b6 = (byte) (b5 | org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b(b5, b6, (byte) (b6 & 235), objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(bArr2[23], (byte) (121 & 448), bArr2[55], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    byte b7 = bArr2[42];
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b(b7, (byte) (b7 | 70), (byte) (bArr2[100] + 1), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(util.m.mb.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        b(bArr2[8], (byte) (bArr2[2] - 1), bArr2[19], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str5, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        b(bArr2[43], (byte) 101, bArr2[19], objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str5);
                    }
                    java.lang.String str6 = util.h.xy.al.ra.f366;
                    java.lang.String str7 = util.h.xy.al.ra.f367;
                    java.lang.String str8 = util.h.xy.al.ra.f376;
                    java.lang.String str9 = util.h.xy.al.ra.f351;
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
                for (java.lang.String str10 : strArr2) {
                    arrayList.add(str10);
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

    public static byte[] a(android.content.Context context, byte[] bArr) {
        util.h.xy.v.mb.m27670(context);
        return new byte[1];
    }

    public static int a(android.content.Context context, byte[] bArr, com.gemalto.mfs.mwsdk.payment.CustomConfiguration customConfiguration) {
        return util.h.xy.v.mb.m27671(context, (util.h.xy.bu.a) customConfiguration);
    }
}
