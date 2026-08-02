package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fj {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static int f3564a;
    private static int b;
    private static byte[] c;
    private static final int d;
    private static int e;
    private static short[] f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, byte b2) {
        int i3;
        int i4 = 71 - (b2 * 3);
        byte[] bArr = $$a;
        int i5 = 3 - (i2 * 3);
        int i6 = i * 3;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = i8;
            i4 = i5 + (-i7);
            i5 = i9;
            int i10 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i3++;
            i7 = bArr[i10];
            int i11 = i4;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i4 = i5 + (-i7);
            i5 = i92;
            int i102 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1022 = i5 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{94, -24, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 108};
        $$b = 59;
    }

    private static int a(java.lang.String str) {
        try {
            java.lang.String[] split = str.split("[._]");
            int parseInt = java.lang.Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : java.lang.Integer.parseInt(split[1]);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    private static int c(java.lang.String str) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!java.lang.Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return java.lang.Integer.parseInt(sb.toString());
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean c() {
        return d >= 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void g(int i, short s, int i2, int i3, byte b2, java.lang.Object[] objArr) {
        long j;
        com.facetec.sdk.hm hmVar = new com.facetec.sdk.hm();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(f3564a)};
            java.lang.Object d2 = com.facetec.sdk.al.d(-852176267);
            if (d2 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                d2 = com.facetec.sdk.al.c((char) (android.os.Process.myPid() >> 22), android.view.KeyEvent.normalizeMetaState(0) + 2222, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, 1792780429, false, $$c(b3, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
            int i4 = intValue == -1 ? 1 : 0;
            if (i4 != 0) {
                byte[] bArr = c;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object d3 = com.facetec.sdk.al.d(-1856077218);
                        if (d3 == null) {
                            d3 = com.facetec.sdk.al.c((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 93, 23 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 917633190, false, "E", new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = c;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(e)};
                    java.lang.Object d4 = com.facetec.sdk.al.d(-852176267);
                    if (d4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        d4 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2222 - android.text.TextUtils.indexOf("", "", 0), 24 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1792780429, false, $$c(b5, b6, (byte) (b6 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue()] ^ 1009991189275744878L)) + ((int) (f3564a ^ 1009991189275744878L)));
                } else {
                    j = 1009991189275744878L;
                    intValue = (short) (((short) (f[i2 + ((int) (e ^ 1009991189275744878L))] ^ 1009991189275744878L)) + ((int) (f3564a ^ 1009991189275744878L)));
                    if (intValue > 0) {
                        hmVar.b = ((i2 + intValue) - 2) + ((int) (e ^ j)) + i4;
                        java.lang.Object[] objArr5 = {hmVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(b), sb};
                        java.lang.Object d5 = com.facetec.sdk.al.d(-1371371196);
                        if (d5 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            d5 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getMode(0), 886 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0, 0) + 32, 162395068, false, $$c(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) d5).invoke(null, objArr5)).append(hmVar.c);
                        hmVar.d = hmVar.c;
                        byte[] bArr4 = c;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                bArr5[i6] = (byte) (bArr4[i6] ^ 1009991189275744878L);
                            }
                            bArr4 = bArr5;
                        }
                        boolean z = bArr4 != null;
                        hmVar.e = 1;
                        while (hmVar.e < intValue) {
                            if (z) {
                                byte[] bArr6 = c;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((byte) (((byte) (bArr6[r7] ^ 1009991189275744878L)) + s)) ^ b2));
                            } else {
                                short[] sArr = f;
                                hmVar.b = hmVar.b - 1;
                                hmVar.c = (char) (hmVar.d + (((short) (((short) (sArr[r7] ^ 1009991189275744878L)) + s)) ^ b2));
                            }
                            sb.append(hmVar.c);
                            hmVar.d = hmVar.c;
                            hmVar.e++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            j = 1009991189275744878L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        a();
        try {
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            g(indexOf + 690921055, (short) (android.text.TextUtils.indexOf("", "", 0) + 87), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1910560365, (-1) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            g(690921050 - lastIndexOf, (short) ((-17) - android.text.TextUtils.getTrimmedLength("")), (-1910560350) - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            java.lang.String str = (java.lang.String) cls.getMethod((java.lang.String) objArr2[0], java.lang.String.class).invoke(null, "java.version");
            int a2 = a(str);
            if (a2 == -1) {
                a2 = c(str);
            }
            if (a2 == -1) {
                a2 = 6;
            }
            d = a2;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void a() {
        e = -554775552;
        f3564a = -1358030226;
        b = 2044688482;
        c = new byte[]{126, -33, -12, -60, -51, -95, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, com.google.common.base.Ascii.RS, -52, -40, com.visa.cbp.getEncExpo.onUnminimized, -119, com.google.common.base.Ascii.CAN, -6, -48, -50, 101, 120, 125, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 104, 124, com.visa.cbp.getEncExpo.IResultReceiver2, 93, -125, 78, 97};
    }
}
