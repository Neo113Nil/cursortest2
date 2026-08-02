package util.h.xy.p;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int[] getOutputMinFrameDuration;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges = "a";
        int i = getHighSpeedVideoFpsRangesFor + 61;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m27020() {
        synchronized (util.h.xy.p.a.class) {
            int i = getHighSpeedVideoFpsRangesFor + 75;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                util.h.xy.p.ra.m27046();
                throw new java.lang.NullPointerException();
            }
            if (util.h.xy.p.ra.m27046() != null && util.h.xy.p.ra.m27046().length() != 0) {
                return true;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 111) % 128;
            return false;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m27022() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 83;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.p.ra.m27051();
            throw null;
        }
        if (util.h.xy.p.ra.m27051() != null && util.h.xy.p.ra.m27051().length() != 0) {
            return true;
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27019(util.h.xy.d.c cVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z;
        int[] iArr;
        int i;
        synchronized (util.h.xy.p.a.class) {
            m27020();
            if (m27020()) {
                if (m27022()) {
                    z = false;
                } else {
                    getHighSpeedVideoFpsRanges();
                    util.h.xy.p.mb.f2292.m27043();
                    z = true;
                }
                util.h.xy.p.ra.m27046();
                if (util.h.xy.p.ma.m27031()) {
                    util.h.xy.p.ra.m27050(util.h.xy.p.ra.m27051());
                    util.h.xy.p.ra.m27048();
                }
                if (util.h.xy.p.ma.m27029() && util.h.xy.p.mb.f2292.m27042() && !z) {
                    util.h.xy.p.mb.f2292.m27043();
                    z = true;
                }
                if (util.h.xy.p.ma.m27025() && util.h.xy.p.mb.f2292.m27041() && !z) {
                    util.h.xy.p.mb.f2292.m27043();
                    z = true;
                }
                if (util.h.xy.p.ma.m27033() && util.h.xy.p.mb.f2292.m27044() && !z) {
                    util.h.xy.p.mb.f2292.m27043();
                    z = true;
                }
                if (util.h.xy.p.ma.m27034()) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                    if (!z) {
                        util.h.xy.p.mb.f2292.m27043();
                    }
                }
                if (util.h.xy.p.ma.m27024()) {
                    util.h.xy.p.mb.f2292.m27045();
                }
            } else {
                byte[] m27028 = util.h.xy.p.ma.m27028();
                try {
                    if (m27028 != null) {
                        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
                        if (m27028.length != 0) {
                            if (util.h.xy.p.ma.m27030(m27028)) {
                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f716);
                            }
                            if (util.h.xy.p.ma.m27032(m27028) || util.h.xy.p.ma.m27035(m27028) || util.h.xy.p.ma.m27027(m27028)) {
                                util.h.xy.p.ma.m27032(m27028);
                                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f716);
                            }
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(new int[]{1491189038, 1005186720, 453278120, -1982433444}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, objArr);
                            util.h.xy.p.ra.m27052(((java.lang.String) objArr[0]).intern());
                            int i2 = getHighResolutionOutputSizeshNQ4ISI + 91;
                            getHighSpeedVideoFpsRangesFor = i2 % 128;
                            int i3 = i2 % 2;
                        }
                    }
                    if (util.h.xy.by.ma.f1067.m25806()) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(util.h.xy.al.ra.f716);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{-1023344652, 1959046289, -1779073152, -212329331, 691532714, -1052489956, 1778587633, -176398726, 482252419, 2052717140, 155543564, 588178424, 1416748936, -940188273, 1079201666, -169738532, -1357838540, -755889812, 667126343, 1311579796}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 37, objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
                    }
                    int i4 = getHighResolutionOutputSizeshNQ4ISI + 19;
                    getHighSpeedVideoFpsRangesFor = i4 % 128;
                    if (i4 % 2 == 0) {
                        getHighSpeedVideoFpsRanges();
                        iArr = new int[]{1491189038, 1005186720, 453278120, -1982433444};
                        i = 96;
                    } else {
                        getHighSpeedVideoFpsRanges();
                        iArr = new int[]{1491189038, 1005186720, 453278120, -1982433444};
                        i = 7;
                    }
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(iArr, i + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr3);
                        util.h.xy.p.ra.m27052(((java.lang.String) objArr3[0]).intern());
                        int i5 = getHighResolutionOutputSizeshNQ4ISI + 45;
                        getHighSpeedVideoFpsRangesFor = i5 % 128;
                        int i6 = i5 % 2;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(new int[]{1491189038, 1005186720, 453278120, -1982433444}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, objArr4);
                        util.h.xy.p.ra.m27052(((java.lang.String) objArr4[0]).intern());
                        int i22 = getHighResolutionOutputSizeshNQ4ISI + 91;
                        getHighSpeedVideoFpsRangesFor = i22 % 128;
                        int i32 = i22 % 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(util.h.xy.al.ra.f716);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{-564995821, 754121610}, -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
                    sb2.append(((java.lang.String) objArr5[0]).intern());
                    sb2.append(e.getMessage());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb2.toString());
                }
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{1491189038, 1005186720, 453278120, -1982433444}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr6);
            util.h.xy.p.ra.m27047(((java.lang.String) objArr6[0]).intern());
            util.h.xy.p.ra.m27046();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
            int m27023 = m27023(m24558);
            if (m27023 == 0) {
                try {
                    m27021(m24558, util.h.xy.n.a.f2244);
                } catch (java.io.IOException | org.json.JSONException e2) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(e2.getMessage());
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{-527392396, 273519060, -2022436948, 1258713428, -1217559099, -911847932, -1740878734, 817519840, -2028145781, -722163573, -1461588686, 719163160, -1499072086, -400231665, 492302551, 310734278, 1445610208, -537620137, -1862689753, -405184551, 713644539, 1834625868, 660188511, -1456890880, -767452412, -1576517192, -1375126166, 598215476, 1916303790, 564070981, -37999187, 2134654835, 1286407769, -727966937, 462789004, -955222762, 974598218, 267198384, 1378149565, 595121945}, 78 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr7);
                    sb3.append(((java.lang.String) objArr7[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb3.toString());
                }
            } else if (m27023 != util.h.xy.n.a.f2244) {
                int i7 = getHighResolutionOutputSizeshNQ4ISI + 3;
                getHighSpeedVideoFpsRangesFor = i7 % 128;
                try {
                    if (i7 % 2 == 0) {
                        m27021(m24558, util.h.xy.n.a.f2244);
                        throw new java.lang.NullPointerException();
                    }
                    m27021(m24558, util.h.xy.n.a.f2244);
                } catch (java.io.IOException e3) {
                    e = e3;
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(e.getMessage());
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{419823803, -1086452424, -314130698, 851757372, -829944739, 921049019, 984342805, 442734636, -1931279793, -45511929, 1315402756, 1327623554, -566159229, 21380156, 189718666, 726242711, 757327566, 1694218776, 155543564, 588178424, 1416748936, -940188273, -1205625716, -78468902, 1494071033, -1933480548, 1878851274, -1620597916, -1183703834, 294849787, 530510357, -413179695}, 63 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
                    sb4.append(((java.lang.String) objArr8[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb4.toString());
                } catch (org.json.JSONException e4) {
                    e = e4;
                    java.lang.StringBuilder sb42 = new java.lang.StringBuilder();
                    sb42.append(e.getMessage());
                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{419823803, -1086452424, -314130698, 851757372, -829944739, 921049019, 984342805, 442734636, -1931279793, -45511929, 1315402756, 1327623554, -566159229, 21380156, 189718666, 726242711, 757327566, 1694218776, 155543564, 588178424, 1416748936, -940188273, -1205625716, -78468902, 1494071033, -1933480548, 1878851274, -1620597916, -1183703834, 294849787, 530510357, -413179695}, 63 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr82);
                    sb42.append(((java.lang.String) objArr82[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb42.toString());
                }
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 29) % 128;
            android.content.Context m245582 = util.h.xy.ag.a.m24556().m24558();
            int m26980 = new util.h.xy.n.a(m245582, util.h.xy.al.ra.f360).m26980(util.h.xy.al.ra.f362, 0);
            int i8 = (getHighSpeedVideoFpsRangesFor + 101) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i8;
            if (m26980 == 0) {
                getHighSpeedVideoFpsRangesFor = (i8 + 31) % 128;
                try {
                    getHighResolutionOutputSizeshNQ4ISI(m245582);
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
                } catch (java.io.IOException e5) {
                    e = e5;
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(e.getMessage());
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{-527392396, 273519060, -2022436948, 1258713428, -1217559099, -911847932, -1740878734, 817519840, -2028145781, -722163573, -1461588686, 719163160, -1499072086, -400231665, 492302551, 310734278, 757327566, 1694218776, 155543564, 588178424, 1416748936, -940188273, -1205625716, -78468902, 1494071033, -1933480548, 1878851274, -1620597916, -1183703834, 294849787, 530510357, -413179695}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63, objArr9);
                    sb5.append(((java.lang.String) objArr9[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb5.toString());
                } catch (org.json.JSONException e6) {
                    e = e6;
                    java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                    sb52.append(e.getMessage());
                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{-527392396, 273519060, -2022436948, 1258713428, -1217559099, -911847932, -1740878734, 817519840, -2028145781, -722163573, -1461588686, 719163160, -1499072086, -400231665, 492302551, 310734278, 757327566, 1694218776, 155543564, 588178424, 1416748936, -940188273, -1205625716, -78468902, 1494071033, -1933480548, 1878851274, -1620597916, -1183703834, 294849787, 530510357, -413179695}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 63, objArr92);
                    sb52.append(((java.lang.String) objArr92[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb52.toString());
                }
            } else if (m26980 != 612000) {
                try {
                    getHighResolutionOutputSizeshNQ4ISI(m245582);
                } catch (java.io.IOException | org.json.JSONException e7) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(e7.getMessage());
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(new int[]{419823803, -1086452424, -314130698, 851757372, -829944739, 921049019, -1791397630, 361680126, -854115547, -1131318034, -383587215, 424923975, -1571865233, 815417897, -899151889, -519883371, -1108800905, 1258409019, 1747417179, 397548994, -557174152, 541520461, 117815174, -411129890}, 44 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr10);
                    sb6.append(((java.lang.String) objArr10[0]).intern());
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb6.toString());
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputMinFrameDuration;
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
        int[] iArr5 = getOutputMinFrameDuration;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 37) % 128;
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
            int i4 = 0;
            while (i4 < 16) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
                i4++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 105) % 128;
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

    private static void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) throws org.json.JSONException, java.io.IOException {
        util.h.xy.n.a aVar = new util.h.xy.n.a(context, util.h.xy.al.ra.f360);
        aVar.m26979(util.h.xy.al.ra.f362, com.gemalto.mfs.mwsdk.BuildConfig.VERSION_CODE);
        aVar.m26978();
        int i = getHighSpeedVideoFpsRangesFor + 39;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m27023(android.content.Context context) {
        int m26980 = new util.h.xy.n.a(context, util.h.xy.al.ra.f360).m26980(util.h.xy.al.ra.f519, 0);
        int i = getHighResolutionOutputSizeshNQ4ISI + 23;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return m26980;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m27021(android.content.Context context, int i) throws org.json.JSONException, java.io.IOException {
        util.h.xy.n.a aVar = new util.h.xy.n.a(context, util.h.xy.al.ra.f360);
        aVar.m26979(util.h.xy.al.ra.f519, i);
        aVar.m26978();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
    }

    private static void getHighSpeedVideoFpsRanges() {
        java.lang.Object obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{810750581, -470772098}, 3 >> (android.view.ViewConfiguration.getLongPressTimeout() / 52), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{810750581, -470772098}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, objArr2);
            obj = objArr2[0];
        }
        util.h.xy.p.ra.m27049(((java.lang.String) obj).intern());
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = new int[]{-1235211327, 672272686, 2106019939, 1564443543, -1645175833, 762357888, 2018731892, -961109507, -1109566737, 311291955, 1397156171, 1072183959, 919858581, 126656226, -1183667709, -302781621, 1444922370, 1170322883};
    }
}
