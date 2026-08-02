package util.m;

/* loaded from: classes18.dex */
public class ma {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int Camera2StreamConfigurationMap = 1;
    public static final boolean LOG_ENABLED = true;
    public static boolean SD = false;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 + 68;
        byte[] bArr = $$a;
        int i5 = b + 3;
        byte[] bArr2 = new byte[i + 6];
        int i6 = i + 5;
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            int i9 = i5;
            int i10 = (i5 + i7) - 5;
            int i11 = i9 + 1;
            i3 = i8;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            int i12 = i4;
            i9 = i5;
            i5 = i12;
            int i102 = (i5 + i7) - 5;
            int i112 = i9 + 1;
            i3 = i8;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 3 - (b * 3);
        int i6 = (i * 3) + 103;
        int i7 = (i2 * 2) + 35;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6 = (i6 + i5) - 3;
            i5 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i5 + 1;
            i8 = i9;
            i5 = bArr[i9];
            i6 = (i6 + i5) - 3;
            i5 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public final native void lg(byte[] bArr);

    public final native void mcmg();

    public final native long ta(int i, long j);

    public final native byte[] te(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public final native byte[] te2(byte[] bArr);

    public final native void txd(byte[] bArr);

    public final native void un(byte[] bArr);

    public final native void vcmg();

    static {
        byte[] bArr = {40, com.google.common.base.Ascii.VT, -89, -76, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
        byte[] bArr2 = {86, 123, -90, 39, -43, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, 5, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 215;
        getHighResolutionOutputSizeshNQ4ISI();
        SD = false;
        java.lang.String str = util.h.xy.al.ra.f366;
        java.lang.String str2 = util.h.xy.al.ra.f367;
        java.lang.String str3 = util.h.xy.al.ra.f708;
        java.lang.String str4 = util.h.xy.al.ra.f353;
        byte b = (byte) 0;
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        java.lang.String str5 = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = util.m.ma.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap2 == null) {
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 348 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str5, classLoader, false, 940701204, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2), 940701204};
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap3 == null) {
                char touchSlop = (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 45285);
                int bitsPerPixel = 157 - android.graphics.ImageFormat.getBitsPerPixel(0);
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0) + 3;
                byte b3 = bArr[14];
                byte b4 = b3;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                c(b3, b4, b4, objArr4);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(touchSlop, bitsPerPixel, capsMode, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 104 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 33 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r10}, new int[]{r9}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int elapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                int i4 = ~elapsedRealtime;
                int i5 = i + 1609703348 + (((~((-493413915) | i4)) | (-527490183)) * (-865)) + ((~(elapsedRealtime | 493413914)) * 865) + (((~((-527490183) | i4)) | (~(i4 | 493413914))) * 865);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(bArr2[7], bArr2[20], bArr2[54], objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(bArr2[101], (byte) 15, bArr2[54], objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(bArr2[17], bArr2[57], bArr2[54], objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a((byte) 56, (byte) (-bArr2[8]), (byte) (bArr2[99] + 1), objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) (215 & 353), bArr2[22], bArr2[54], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) 79, bArr2[41], (byte) (bArr2[99] + 1), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(util.m.ma.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((byte) 92, bArr2[7], bArr2[18], objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str5, invoke2);
                    } else {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a((byte) 102, bArr2[42], bArr2[18], objArr14);
                        java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(invoke, invoke2, str5);
                    }
                    java.lang.String str6 = util.h.xy.al.ra.f366;
                    java.lang.String str7 = util.h.xy.al.ra.f367;
                    java.lang.String str8 = util.h.xy.al.ra.f708;
                    java.lang.String str9 = util.h.xy.al.ra.f351;
                    int i8 = getHighResolutionOutputSizeshNQ4ISI;
                    int i9 = ((int[]) objArr6[3])[0];
                    int i10 = i9 * i9;
                    int i11 = -(1234815638 * i9);
                    int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                    int i13 = -(i9 * 366433756);
                    int i14 = (i12 & i13) + (i13 | i12);
                    int i15 = ((i14 | (-1859113807)) << 1) - ((-1859113807) ^ i14);
                    int i16 = i15 >> 20;
                    int i17 = (i15 - (~(((((i16 | (-8191)) << 1) - (i16 ^ (-8191))) / 4096) + 1))) - 1;
                    int i18 = i15 >> 25;
                    int i19 = ((i18 ^ (-255)) + ((i18 & (-255)) << 1)) / 128;
                    int i20 = -(i17 ^ (((i19 | 1) << 1) - (i19 ^ 1)));
                    int i21 = ((i20 | 7) << 1) - (i20 ^ 7);
                    int i22 = i21 >> 28;
                    int i23 = ((((i22 | (-31)) << 1) - (i22 ^ (-31))) / 16) + 1;
                    int i24 = i8 + (1294482 / (((-(((i23 | 1) << 1) - (i23 ^ 1))) & i21) * 1666));
                    Camera2StreamConfigurationMap = i24 % 128;
                    if (i24 % 2 == 0) {
                        throw null;
                    }
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

    public void sdt() {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
    }

    public java.lang.String acmti(java.lang.String str) {
        try {
            util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
            m25213.m25217(str, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25213.m25217(str, true), java.nio.charset.StandardCharsets.UTF_8));
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(new int[]{-538065376, 1586268619, 2138751913, -478518775, -1214854146, -1571519490}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, objArr);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
            int[] iArr = {1805972959, -98730013, -367499723, 156035833, 241645436, 1112478788, -1133092778, -257402029};
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(iArr, 15 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr2);
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(((java.lang.String) objArr2[0]).intern());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(new int[]{-1624994058, -1004785037, -465315628, -1008263313}, 6 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
                java.lang.String string = jSONObject3.getString(((java.lang.String) objArr3[0]).intern());
                int i = getHighResolutionOutputSizeshNQ4ISI + 55;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 != 0) {
                    return string;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException e) {
            throw new java.lang.RuntimeException(e);
        } catch (org.json.JSONException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public void ptip() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 25;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void atip() {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
    }

    private static void getHighSpeedVideoSizes(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRanges;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRanges;
        if (iArr5 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 63) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 121) % 128;
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 91) % 128;
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final byte[] h(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 111;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return getHighSpeedVideoFpsRangesFor(bArr);
        }
        getHighSpeedVideoFpsRangesFor(bArr);
        throw null;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 59) % 128;
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr);
        int i = Camera2StreamConfigurationMap + 15;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return Camera2StreamConfigurationMap2;
        }
        throw null;
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 15;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                return util.h.xy.v.b.f2439.m27593(bArr);
            }
            byte[] m27593 = util.h.xy.v.b.f2439.m27593(bArr);
            try {
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m27593;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2;
        int i = Camera2StreamConfigurationMap + 5;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27610(bArr);
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27610(bArr);
                try {
                    throw new java.lang.NullPointerException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        int i2 = Camera2StreamConfigurationMap + 51;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] e(byte[] bArr) {
        byte[] bArr2;
        int i = Camera2StreamConfigurationMap + 71;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27645(bArr);
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27645(bArr);
                try {
                    throw new java.lang.ArithmeticException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        int i2 = Camera2StreamConfigurationMap + 53;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] f(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 101;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                return util.h.xy.v.b.f2439.m27598(bArr);
            }
            byte[] m27598 = util.h.xy.v.b.f2439.m27598(bArr);
            try {
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m27598;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] g(byte[] bArr) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        try {
            byte[] m27587 = util.h.xy.v.b.f2439.m27587(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            return m27587;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] i(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 65;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27588 = util.h.xy.v.b.f2439.m27588(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                return m27588;
            }
            byte[] m275882 = util.h.xy.v.b.f2439.m27588(bArr);
            try {
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m275882;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] i2(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 49;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27577 = util.h.xy.v.b.f2439.m27577(bArr);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 23) % 128;
                return m27577;
            }
            byte[] m275772 = util.h.xy.v.b.f2439.m27577(bArr);
            try {
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m275772;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] i4(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 11;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27578 = util.h.xy.v.b.f2439.m27578(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                return m27578;
            }
            byte[] m275782 = util.h.xy.v.b.f2439.m27578(bArr);
            try {
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m275782;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] j(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 35;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27585 = util.h.xy.v.b.f2439.m27585(bArr);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 65) % 128;
                return m27585;
            }
            util.h.xy.v.b.f2439.m27585(bArr);
            throw new java.lang.NullPointerException();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] j2(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 103;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27584 = util.h.xy.v.b.f2439.m27584(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
                return m27584;
            }
            byte[] m275842 = util.h.xy.v.b.f2439.m27584(bArr);
            try {
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m275842;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] j4(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 41;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                return util.h.xy.v.b.f2439.m27590(bArr);
            }
            byte[] m27590 = util.h.xy.v.b.f2439.m27590(bArr);
            try {
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m27590;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] k(byte[] bArr) {
        byte[] bArr2;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27616(bArr);
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 33) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 65) % 128;
        return bArr2;
    }

    public final byte[] l(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27633(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 35;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] m(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
        try {
            byte[] m27591 = util.h.xy.v.b.f2439.m27591(bArr);
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 39) % 128;
            return m27591;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] n(byte[] bArr) {
        byte[] bArr2;
        int i = Camera2StreamConfigurationMap + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27599(bArr);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27599(bArr);
                try {
                    throw new java.lang.ArithmeticException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        return bArr2;
    }

    public final byte[] o(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 97;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27615 = util.h.xy.v.b.f2439.m27615(bArr);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 9) % 128;
                return m27615;
            }
            byte[] m276152 = util.h.xy.v.b.f2439.m27615(bArr);
            try {
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m276152;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] p(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 25) % 128;
        try {
            byte[] m27640 = util.h.xy.v.b.f2439.m27640(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 5) % 128;
            return m27640;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] q(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 11) % 128;
        try {
            byte[] m27603 = util.h.xy.v.b.f2439.m27603(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
            return m27603;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] r(byte[] bArr) {
        byte[] bArr2;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27604(Camera2StreamConfigurationMap(bArr, new byte[]{0, 0, 0, com.google.common.base.Ascii.GS, -1}));
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 23;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] r(byte[] bArr, int i, byte b) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27604(Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(bArr, new byte[]{(byte) (((-16777216) & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)}), new byte[]{b}));
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
        return bArr2;
    }

    public final byte[] s(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27576(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] t(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 65) % 128;
        try {
            byte[] m27634 = util.h.xy.v.b.f2439.m27634(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            return m27634;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] v(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 39) % 128;
        try {
            byte[] m27625 = util.h.xy.v.b.f2439.m27625(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            return m27625;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] v3(byte[] bArr) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 57) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27606(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] w(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27573(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 57;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] x(byte[] bArr) {
        byte[] bArr2;
        int i = getHighResolutionOutputSizeshNQ4ISI + 75;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                bArr2 = util.h.xy.v.b.f2439.m27641(bArr);
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27641(bArr);
                try {
                    throw new java.lang.ArithmeticException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        int i2 = Camera2StreamConfigurationMap + 55;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] y(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 105) % 128;
        try {
            byte[] m27643 = util.h.xy.v.b.f2439.m27643(bArr);
            int i = getHighResolutionOutputSizeshNQ4ISI + 105;
            Camera2StreamConfigurationMap = i % 128;
            int i2 = i % 2;
            return m27643;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] z(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 55;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27574 = util.h.xy.v.b.f2439.m27574(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                return m27574;
            }
            byte[] m275742 = util.h.xy.v.b.f2439.m27574(bArr);
            try {
                throw null;
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m275742;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] a1(byte[] bArr) {
        byte[] bArr2;
        int i = getHighResolutionOutputSizeshNQ4ISI + 89;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                bArr2 = util.h.xy.v.b.f2439.m27642(bArr);
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27642(bArr);
                try {
                    throw new java.lang.NullPointerException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 53) % 128;
        return bArr2;
    }

    public final byte[] b1(byte[] bArr) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 101) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27637(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        return bArr2;
    }

    public final byte[] c1(byte[] bArr) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 45) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27582(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] d1(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27583(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] e1(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 37) % 128;
        try {
            byte[] m27600 = util.h.xy.v.b.f2439.m27600(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            return m27600;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] f1(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27612(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 115;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] g1(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27614(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 27;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] h1(byte[] bArr) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        try {
            byte[] m27617 = util.h.xy.v.b.f2439.m27617(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
            return m27617;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] k1(byte[] bArr) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 93) % 128;
        try {
            byte[] m27607 = util.h.xy.v.b.f2439.m27607(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
            return m27607;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] l1(byte[] bArr) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
        try {
            byte[] m27638 = util.h.xy.v.b.f2439.m27638(bArr);
            int i = Camera2StreamConfigurationMap + 63;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 / 5;
            }
            return m27638;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] l2(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 109;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27632(bArr);
            } else {
                byte[] m27632 = util.h.xy.v.b.f2439.m27632(bArr);
                try {
                    throw null;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                    bArr2 = m27632;
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 115) % 128;
        return bArr2;
    }

    public final byte[] l3(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 61) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27635(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        return bArr2;
    }

    public final byte[] l4(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 87;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27623 = util.h.xy.v.b.f2439.m27623(bArr);
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
                return m27623;
            }
            byte[] m276232 = util.h.xy.v.b.f2439.m27623(bArr);
            try {
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m276232;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] m1(byte[] bArr) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 17) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27618(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] n1(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 83;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27621 = util.h.xy.v.b.f2439.m27621(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
                return m27621;
            }
            byte[] m276212 = util.h.xy.v.b.f2439.m27621(bArr);
            try {
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m276212;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] o1(byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 15;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                byte[] m27611 = util.h.xy.v.b.f2439.m27611(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 33) % 128;
                return m27611;
            }
            byte[] m276112 = util.h.xy.v.b.f2439.m27611(bArr);
            try {
                throw new java.lang.ArithmeticException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m276112;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    public final byte[] o2(byte[] bArr) {
        byte[] bArr2;
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 3) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27620(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 107;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final long aa(android.content.Context context, byte[] bArr) {
        long j;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        try {
            j = util.h.xy.v.b.f2439.m27596(context, bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            j = 0;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        return j;
    }

    public final long zz(android.content.Context context, byte[] bArr) {
        long j;
        int i = getHighResolutionOutputSizeshNQ4ISI + 23;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            try {
                j = util.h.xy.v.b.f2439.m27608(context, bArr);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                j = 1;
            }
        } else {
            try {
                j = util.h.xy.v.b.f2439.m27608(context, bArr);
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
                j = 0;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 75) % 128;
        return j;
    }

    public final int zx(android.content.Context context, byte[] bArr) {
        int i;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        try {
            i = util.h.xy.v.b.f2439.m27592(context, bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            i = 0;
        }
        int i2 = Camera2StreamConfigurationMap + 11;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final byte[] xx(byte[] bArr) {
        byte[] bArr2;
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                bArr2 = util.h.xy.v.b.f2439.m27613(bArr);
            } else {
                bArr2 = util.h.xy.v.b.f2439.m27613(bArr);
                try {
                    throw new java.lang.ArithmeticException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr2 = null;
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        return bArr2;
    }

    public final byte[] xy(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        Camera2StreamConfigurationMap = i % 128;
        try {
            if (i % 2 != 0) {
                bArr3 = util.h.xy.v.b.f2439.m27594(bArr, bArr2);
            } else {
                bArr3 = util.h.xy.v.b.f2439.m27594(bArr, bArr2);
                try {
                    throw new java.lang.NullPointerException();
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            bArr3 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 23) % 128;
        return bArr3;
    }

    public final byte[] xz(byte[] bArr) {
        byte[] bArr2;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 41) % 128;
        try {
            bArr2 = util.h.xy.v.b.f2439.m27626(bArr);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            bArr2 = null;
        }
        int i = Camera2StreamConfigurationMap + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] ac(android.content.Context context, byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27586(context, bArr);
            } else {
                byte[] m27586 = util.h.xy.v.b.f2439.m27586(context, bArr);
                try {
                    throw null;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                    bArr2 = m27586;
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
        }
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        return bArr2;
    }

    public final byte[] p1(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 63;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr2 = null;
        try {
            if (i % 2 == 0) {
                bArr2 = util.h.xy.v.b.f2439.m27624(bArr);
            } else {
                byte[] m27624 = util.h.xy.v.b.f2439.m27624(bArr);
                try {
                    throw null;
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                    bArr2 = m27624;
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
        }
        int i2 = Camera2StreamConfigurationMap + 3;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] t1(byte[] bArr) {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        try {
            byte[] m27627 = util.h.xy.v.b.f2439.m27627(bArr);
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
            return m27627;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    public final byte[] v1(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 73;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 == 0) {
                byte[] m27629 = util.h.xy.v.b.f2439.m27629(bArr);
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
                return m27629;
            }
            byte[] m276292 = util.h.xy.v.b.f2439.m27629(bArr);
            try {
                throw new java.lang.NullPointerException();
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                return m276292;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused2) {
            return null;
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        byte b;
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            if (i < bArr.length) {
                int i2 = Camera2StreamConfigurationMap + 23;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 != 0) {
                    byte b2 = bArr[i];
                    throw null;
                }
                b = bArr[i];
            } else {
                b = bArr2[i - bArr.length];
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
            }
            bArr3[i] = b;
        }
        return bArr3;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRanges = new int[]{488200007, -860418702, -1305667235, -735087036, 1099623598, -1131982399, 1184350233, 1204107416, 2138354146, 57743909, -772556094, -42391182, 1666836858, -1492674241, -1854822564, -578477866, 1838214042, -1333667607};
    }
}
