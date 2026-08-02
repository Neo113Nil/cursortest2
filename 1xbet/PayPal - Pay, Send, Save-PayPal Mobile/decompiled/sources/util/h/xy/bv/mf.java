package util.h.xy.bv;

/* loaded from: classes5.dex */
public final class mf {
    private static int Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static long getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = "mf";
        int i = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private mf() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[Catch: JSONException -> 0x027d, TRY_ENTER, TryCatch #0 {JSONException -> 0x027d, blocks: (B:3:0x000c, B:5:0x0032, B:7:0x0054, B:9:0x0057, B:10:0x005f, B:12:0x0075, B:14:0x0080, B:19:0x00bd, B:21:0x00c8, B:23:0x00d3, B:25:0x00d9, B:26:0x00ec, B:27:0x0179, B:29:0x01b0, B:31:0x01dc, B:33:0x021b, B:35:0x0227, B:37:0x022f, B:38:0x0266, B:39:0x0270, B:45:0x0271, B:46:0x0276, B:47:0x0277, B:48:0x027c, B:50:0x0092, B:51:0x0093, B:54:0x0108, B:55:0x0124, B:56:0x009f, B:58:0x00af, B:60:0x0102, B:61:0x0107, B:63:0x0125, B:65:0x013d, B:67:0x0155, B:68:0x015e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3 A[Catch: JSONException -> 0x027d, TryCatch #0 {JSONException -> 0x027d, blocks: (B:3:0x000c, B:5:0x0032, B:7:0x0054, B:9:0x0057, B:10:0x005f, B:12:0x0075, B:14:0x0080, B:19:0x00bd, B:21:0x00c8, B:23:0x00d3, B:25:0x00d9, B:26:0x00ec, B:27:0x0179, B:29:0x01b0, B:31:0x01dc, B:33:0x021b, B:35:0x0227, B:37:0x022f, B:38:0x0266, B:39:0x0270, B:45:0x0271, B:46:0x0276, B:47:0x0277, B:48:0x027c, B:50:0x0092, B:51:0x0093, B:54:0x0108, B:55:0x0124, B:56:0x009f, B:58:0x00af, B:60:0x0102, B:61:0x0107, B:63:0x0125, B:65:0x013d, B:67:0x0155, B:68:0x015e), top: B:2:0x000c }] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.util.Map<java.lang.String, java.lang.String> m25721(util.h.xy.bv.g gVar, java.lang.String str, boolean z, java.util.Map<java.lang.String, java.lang.String> map) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.bv.mf.mb mbVar;
        boolean z2;
        util.h.xy.bv.mf.ma maVar;
        util.h.xy.d.mg m26133;
        java.lang.String intern;
        int i;
        java.lang.String str2;
        byte[] m26767;
        java.lang.String str3;
        try {
            util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(str.getBytes(util.h.xy.h.a.f2221));
            m26955.m26136();
            java.lang.String obj = m26955.m26136().toString();
            java.nio.charset.Charset charset = util.h.xy.h.a.f2221;
            java.lang.String m26759 = util.h.xy.f.b.f2201.m26759(str);
            if (m26955.m26133() == util.h.xy.d.mg.f1144) {
                int m26143 = m26955.m26143();
                java.lang.String num = java.lang.Integer.toString(m26955.m26134());
                java.lang.String m25078 = util.h.xy.ar.b.m25078(m26143, 4);
                byte[] m27456 = util.h.xy.t.mb.f2417.m27456(str.getBytes());
                org.json.JSONArray m25722 = m25722(m27456);
                util.h.xy.ar.mb[] m25062 = (m27456 == null || m27456.length <= 0) ? null : util.h.xy.ar.a.m25062(m27456, m27456.length - 1, (byte) 81);
                boolean equals = java.util.Arrays.equals(util.h.xy.ak.ma.f84.m24991(str.getBytes(util.h.xy.h.a.f2221)), new byte[]{1});
                if (m25062 != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 47) % 128;
                    if (m25062.length != 0) {
                        m26767 = m25062[0].m25110();
                        int i2 = Camera2StreamConfigurationMap + 67;
                        getHighSpeedVideoSizes = i2 % 128;
                        if (i2 % 2 == 0) {
                            throw null;
                        }
                        java.lang.String str4 = "";
                        if (m26767 != null) {
                            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 29) % 128;
                            if (m26767.length > 0) {
                                str3 = util.h.xy.ar.b.m25074(m26767);
                                if (m25722 != null && m25722.length() > 0) {
                                    str4 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(m25722.toString().getBytes()));
                                }
                                maVar = new util.h.xy.bv.mf.ma(m25078, getHighSpeedVideoSizes(str, m26955.m26135()), getHighResolutionOutputSizeshNQ4ISI(m26759, str, m26955), num, str4, str3);
                            }
                        }
                        str3 = "";
                        if (m25722 != null) {
                            str4 = new java.lang.String(util.h.xy.bx.ra.f1063.m25785(m25722.toString().getBytes()));
                        }
                        maVar = new util.h.xy.bv.mf.ma(m25078, getHighSpeedVideoSizes(str, m26955.m26135()), getHighResolutionOutputSizeshNQ4ISI(m26759, str, m26955), num, str4, str3);
                    }
                }
                if (util.h.xy.j.ma.f2241.m26900() == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.WALLET_PIN || equals) {
                    m26767 = util.h.xy.f.b.f2201.m26767(str, (util.h.xy.d.rc) null, m26955.m26134());
                    if (!util.h.xy.ar.b.m25068(m26767)) {
                        int i3 = Camera2StreamConfigurationMap + 81;
                        getHighSpeedVideoSizes = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw new java.lang.NullPointerException();
                        }
                        java.lang.String str42 = "";
                        if (m26767 != null) {
                        }
                        str3 = "";
                        if (m25722 != null) {
                        }
                        maVar = new util.h.xy.bv.mf.ma(m25078, getHighSpeedVideoSizes(str, m26955.m26135()), getHighResolutionOutputSizeshNQ4ISI(m26759, str, m26955), num, str42, str3);
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(false, new int[]{0, 51, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
            }
            int m261432 = m26955.m26143();
            java.lang.String num2 = java.lang.Integer.toString(m26955.m26134());
            int m26139 = m26955.m26139();
            if (util.h.xy.k.ra.f2243.m26968(str)) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 89) % 128;
                if (util.h.xy.u.c.m27504(str, util.h.xy.k.ra.f2243.m26940(str).booleanValue())) {
                    m26139++;
                    m261432 = m26955.m26142();
                    z2 = true;
                    java.lang.String m250782 = util.h.xy.ar.b.m25078(m261432, 4);
                    util.h.xy.bv.mf.a aVar = new util.h.xy.bv.mf.a(m26139);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 77) % 128;
                    maVar = new util.h.xy.bv.mf.ma(m250782, aVar, getHighSpeedVideoSizes(m26759, str, m26955, z2), num2);
                }
            }
            z2 = false;
            java.lang.String m2507822 = util.h.xy.ar.b.m25078(m261432, 4);
            util.h.xy.bv.mf.a aVar2 = new util.h.xy.bv.mf.a(m26139);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 77) % 128;
            maVar = new util.h.xy.bv.mf.ma(m2507822, aVar2, getHighSpeedVideoSizes(m26759, str, m26955, z2), num2);
            mbVar = new util.h.xy.bv.mf.mb(str, obj, maVar);
            m26133 = m26955.m26133();
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 29) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{51, 10, 0, 2}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", objArr2);
            intern = ((java.lang.String) objArr2[0]).intern();
            int i4 = util.h.xy.bv.mf.mb.getHighSpeedVideoFpsRanges;
            i = (i4 ^ 21) + ((i4 & 21) << 1);
            util.h.xy.bv.mf.mb.getHighSpeedVideoSizes = i % 128;
            str2 = mbVar.Camera2StreamConfigurationMap;
        } catch (org.json.JSONException e) {
            e.getMessage();
        }
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        map.put(intern, str2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{61, 10, 0, 7}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        int i5 = (util.h.xy.bv.mf.mb.getHighSpeedVideoFpsRanges + 31) % 128;
        util.h.xy.bv.mf.mb.getHighSpeedVideoSizes = i5;
        java.lang.String str5 = mbVar.getHighSpeedVideoFpsRangesFor;
        int i6 = i5 + 73;
        util.h.xy.bv.mf.mb.getHighSpeedVideoFpsRanges = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        map.put(intern2, str5);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{71, 9, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000", objArr4);
        java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
        int i7 = util.h.xy.bv.mf.mb.getHighSpeedVideoFpsRanges;
        int i8 = (((i7 | 69) << 1) - (i7 ^ 69)) % 128;
        util.h.xy.bv.mf.mb.getHighSpeedVideoSizes = i8;
        util.h.xy.bv.mf.ma maVar2 = mbVar.getHighResolutionOutputSizeshNQ4ISI;
        util.h.xy.bv.mf.mb.getHighSpeedVideoFpsRanges = (((i8 | 3) << 1) - (i8 ^ 3)) % 128;
        map.put(intern3, m25723(maVar2).toString());
        if (z) {
            int i9 = getHighSpeedVideoSizes + 117;
            Camera2StreamConfigurationMap = i9 % 128;
            if (i9 % 2 != 0) {
                m26133.equals(util.h.xy.d.mg.f1144);
                throw new java.lang.NullPointerException();
            }
            if (m26133.equals(util.h.xy.d.mg.f1144)) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(true, new int[]{80, 11, 117, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", objArr5);
                java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䁿氐\u18ac압", 11369 - android.graphics.Color.blue(0), objArr6);
                map.put(intern4, ((java.lang.String) objArr6[0]).intern());
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 9) % 128;
            }
        }
        int i10 = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoSizes = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 41;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 69) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 69) % 128;
            jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputFormats ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 41) % 128;
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                int i7 = getHighSpeedVideoFpsRangesFor + 51;
                getHighSpeedVideoFpsRanges = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr6[maVar.f2631] = cArr3[(i2 % maVar.f2631) << 1];
                } else {
                    cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                }
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static org.json.JSONArray m25722(byte[] bArr) {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 87) % 128;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        byte b2 = bArr[bArr.length - 1];
        util.h.xy.ar.mb[] m25062 = util.h.xy.ar.a.m25062(bArr, bArr.length - 1, (byte) 80);
        if (m25062 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 15) % 128;
            if (m25062.length > 0) {
                util.h.xy.ar.b.m25074(m25062[0].m25110());
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i = 0; i < b2; i++) {
                    if (new java.lang.String(m25062[i].m25110()).length() > 0) {
                        jSONArray.put(new java.lang.String(m25062[i].m25110(), util.h.xy.h.a.f2221));
                    }
                }
                return jSONArray;
            }
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 19) % 128;
        return null;
    }

    private static util.h.xy.bv.mf.a getHighSpeedVideoSizes(java.lang.String str, int i) {
        util.h.xy.bv.mf.a aVar;
        try {
            aVar = new util.h.xy.bv.mf.a(util.h.xy.k.ra.f2243.m26964(str.getBytes(), 1, 1).get(0).m26226(), i);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 13) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            aVar = null;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
        return aVar;
    }

    private static java.util.ArrayList<util.h.xy.bv.mf.b> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, util.h.xy.d.b bVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.ArrayList<util.h.xy.bv.mf.b> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<util.h.xy.d.rb> it = util.h.xy.k.ra.f2243.m26964(str2.getBytes(), 1, 1).iterator();
        while (it.hasNext()) {
            int i = getHighSpeedVideoSizes + 25;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                util.h.xy.d.rb next = it.next();
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, next, next.m26233().toString(), bVar.m26133().toString()));
            } else {
                util.h.xy.d.rb next2 = it.next();
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, next2, next2.m26233().toString(), bVar.m26133().toString()));
                throw new java.lang.ArithmeticException();
            }
        }
        int i2 = getHighSpeedVideoSizes + 109;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    private static java.util.ArrayList<util.h.xy.bv.mf.b> getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, util.h.xy.d.b bVar, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        java.util.ArrayList<util.h.xy.bv.mf.b> arrayList = new java.util.ArrayList<>();
        int m26145 = bVar.m26145();
        int m26132 = bVar.m26132();
        if (z) {
            i = m26132 - 2;
        } else {
            i = m26132 - 1;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
        }
        for (util.h.xy.d.rb rbVar : util.h.xy.k.ra.f2243.m26964(str2.getBytes(), m26145, i)) {
            java.lang.String obj = rbVar.m26233().toString();
            com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m26235 = rbVar.m26235();
            if (m26235 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR) {
                int i2 = getHighSpeedVideoSizes;
                Camera2StreamConfigurationMap = (i2 + 93) % 128;
                if (str != null) {
                    Camera2StreamConfigurationMap = (i2 + 91) % 128;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("䁆瑙⡾\udc66适䐆砺ⳏ\ue0c1铤", 13332 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
                    if (!str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    }
                }
                if (rbVar.m26233().m26236() == util.h.xy.d.rb.a.f1149.m26236()) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 109) % 128;
                    arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
                    arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
                } else {
                    arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, obj, bVar.m26133().toString()));
                    arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
                }
            }
            if (m26235 != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP && m26235 != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR) {
                if (rbVar.m26233().m26236() == util.h.xy.d.rb.a.f1149.m26236()) {
                    obj = util.h.xy.d.rb.a.f1148.toString();
                }
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, obj, bVar.m26133().toString()));
            } else if (rbVar.m26233().m26236() == util.h.xy.d.rb.a.f1149.m26236()) {
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
            } else {
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, obj, bVar.m26133().toString()));
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar, util.h.xy.d.rb.a.f1148.toString(), bVar.m26133().toString()));
            }
        }
        int i3 = i + 1;
        int m26139 = bVar.m26139();
        if (!z) {
            m26139--;
        }
        for (util.h.xy.d.rb rbVar2 : util.h.xy.k.ra.f2243.m26964(str2.getBytes(), i3, m26139 + i3)) {
            java.lang.String obj2 = rbVar2.m26233().toString();
            com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m262352 = rbVar2.m26235();
            if (m262352 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_QR) {
                int i4 = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (str != null) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("䁆瑙⡾\udc66适䐆砺ⳏ\ue0c1铤", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 13331, objArr2);
                    if (!str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    }
                }
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar2, obj2, bVar.m26133().toString()));
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar2, obj2, bVar.m26133().toString()));
            }
            if (m262352 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP || m262352 == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR) {
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar2, obj2, bVar.m26133().toString()));
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar2, obj2, bVar.m26133().toString()));
            } else {
                arrayList.add(getHighSpeedVideoFpsRangesFor(str, rbVar2, obj2, bVar.m26133().toString()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r6.equalsIgnoreCase(((java.lang.String) r4[0]).intern()) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.bv.mf.b getHighSpeedVideoFpsRangesFor(java.lang.String str, util.h.xy.d.rb rbVar, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        int i = Camera2StreamConfigurationMap + 45;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1144;
            throw null;
        }
        if (str3.equalsIgnoreCase(util.h.xy.d.mg.f1144.toString())) {
            str4 = new java.lang.String(rbVar.m26228());
        } else {
            if (str != null) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 51) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䁆瑙⡾\udc66适䐆砺ⳏ\ue0c1铤", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.DC4, objArr);
            }
            if (str != null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䁝峵礶ᙯ", 7351 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                if (str.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    str4 = new java.lang.String(rbVar.m26228());
                }
            }
            str4 = util.h.xy.ar.b.m25074(rbVar.m26228());
        }
        java.lang.String m26229 = rbVar.m26229();
        util.h.xy.bv.mf.ra raVar = new util.h.xy.bv.mf.ra(rbVar.m26231() != null ? util.h.xy.ar.b.m25074(rbVar.m26231()) : null, str3);
        if (str3.equalsIgnoreCase(util.h.xy.d.mg.f1144.toString())) {
            return new util.h.xy.bv.mf.b(m26229, str4, raVar);
        }
        util.h.xy.bv.mf.b bVar = new util.h.xy.bv.mf.b(str2, m26229, str4, raVar);
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        if (r9.m25729().m25738().equals(util.h.xy.d.mg.f1145.toString()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0085, code lost:
    
        r18.m25736().m25724();
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{91, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", r11);
        r5.put(((java.lang.String) r11[0]).intern(), r18.m25736().m25724());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0083, code lost:
    
        if (r9.m25729().m25738().equals(util.h.xy.d.mg.f1145.toString()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00be, code lost:
    
        if (r9.m25729().m25738().equals(util.h.xy.d.mg.f1144.toString()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        util.h.xy.bv.mf.Camera2StreamConfigurationMap = (util.h.xy.bv.mf.getHighSpeedVideoSizes + 17) % 128;
        r18.m25736().m25726();
        r11 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁮粮㧁\uf6f5댍瀣ⵡ\uea61ꚗ掫", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15581, r11);
        r5.put(((java.lang.String) r11[0]).intern(), r18.m25736().m25726());
        r11 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁻匷曈穎ച₷㑄쟩\uda8d\uee27臇钓", 4957 - android.view.View.resolveSize(0, 0), r11);
        r5.put(((java.lang.String) r11[0]).intern(), r18.m25736().m25725());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.json.JSONObject m25723(util.h.xy.bv.mf.ma maVar) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.bv.mf.b bVar;
        java.util.ArrayList<util.h.xy.bv.mf.b> arrayList;
        java.lang.Object obj;
        if (maVar == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁪᧦\uf35a", 22937 - android.text.TextUtils.indexOf("", ""), objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), maVar.m25732());
        maVar.m25732();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.ArrayList<util.h.xy.bv.mf.b> m25733 = maVar.m25733();
        if (m25733 == null || m25733.size() <= 0) {
            bVar = null;
        } else {
            int i = Camera2StreamConfigurationMap + 73;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                m25733.size();
                bVar = m25733.get(1);
            } else {
                m25733.size();
                bVar = m25733.get(0);
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁾챁堘\ue4c7炊ﵚऴ闩↪깾㩂䘫틓序\ueb61眩菨", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 35897, objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), jSONObject2);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        if (m25733 != null) {
            int i2 = getHighSpeedVideoSizes + 11;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                m25733.size();
                throw null;
            }
            if (m25733.size() > 0) {
                for (util.h.xy.bv.mf.b bVar2 : m25733) {
                    if (treeMap.containsKey(bVar2.m25730())) {
                        if (!bVar2.getHighSpeedVideoFpsRanges.equals(util.h.xy.bz.ra.f1075.toString())) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 99) % 128;
                            if (!bVar2.getHighSpeedVideoFpsRanges.equals(util.h.xy.bz.ra.f1073.toString())) {
                                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 107) % 128;
                                if (!bVar2.getHighSpeedVideoFpsRanges.equals(util.h.xy.bz.ra.f1072.toString()) && !bVar2.getHighSpeedVideoFpsRanges.equals(util.h.xy.bz.ra.f1078.toString())) {
                                    treeMap.put(bVar2.m25730(), bVar2);
                                }
                            }
                        }
                        java.lang.String str = bVar2.getHighSpeedVideoFpsRanges;
                    } else {
                        int i3 = getHighSpeedVideoSizes + 77;
                        Camera2StreamConfigurationMap = i3 % 128;
                        if (i3 % 2 != 0) {
                            treeMap.put(bVar2.m25730(), bVar2);
                            throw new java.lang.ArithmeticException();
                        }
                        treeMap.put(bVar2.m25730(), bVar2);
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 59) % 128;
                    }
                }
                arrayList = new java.util.ArrayList();
                for (java.util.Map.Entry entry : treeMap.entrySet()) {
                    if (entry.getValue() instanceof util.h.xy.bv.mf.b) {
                        int i4 = Camera2StreamConfigurationMap + 79;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 == 0) {
                            arrayList.add((util.h.xy.bv.mf.b) entry.getValue());
                            throw new java.lang.ArithmeticException();
                        }
                        arrayList.add((util.h.xy.bv.mf.b) entry.getValue());
                    }
                }
                arrayList.size();
                if (arrayList != null && arrayList.size() > 0) {
                    for (util.h.xy.bv.mf.b bVar3 : arrayList) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        if (bVar != null && bVar.m25729() != null) {
                            int i5 = getHighSpeedVideoSizes + 95;
                            Camera2StreamConfigurationMap = i5 % 128;
                            if (i5 % 2 != 0) {
                                util.h.xy.d.mg.f1145.toString().equals(bVar.m25729().m25738());
                                throw null;
                            }
                            if (util.h.xy.d.mg.f1145.toString().equals(bVar.m25729().m25738())) {
                                int i6 = getHighSpeedVideoSizes + 111;
                                Camera2StreamConfigurationMap = i6 % 128;
                                if (i6 % 2 != 0) {
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("䁸쵝娦\ue731瓳臅ອ鮋⥠", 36131 >> android.view.View.getDefaultSize(1, 0), objArr3);
                                    obj = objArr3[0];
                                } else {
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("䁸쵝娦\ue731瓳臅ອ鮋⥠", 36131 - android.view.View.getDefaultSize(0, 0), objArr4);
                                    obj = objArr4[0];
                                }
                                jSONObject3.put(((java.lang.String) obj).intern(), bVar3.m25728());
                                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 93) % 128;
                            }
                        }
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("䁯]쀃胓䂅Ń섘臔䆚ə숏", 16446 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr5);
                        jSONObject3.put(((java.lang.String) objArr5[0]).intern(), bVar3.m25730());
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("䁿푱桀ﱗဴꐠ㠘䳣\ue0e3", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37906, objArr6);
                        jSONObject3.put(((java.lang.String) objArr6[0]).intern(), bVar3.m25727());
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("䁿瀃ₙ턽", 12401 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr7);
                        jSONObject4.put(((java.lang.String) objArr7[0]).intern(), bVar3.m25729().m25738());
                        bVar3.m25729().m25737();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(false, new int[]{107, 3, 0, 2}, "\u0001\u0000\u0001", objArr8);
                        jSONObject4.put(((java.lang.String) objArr8[0]).intern(), bVar3.m25729().m25737());
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(true, new int[]{110, 11, 41, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", objArr9);
                        jSONObject3.put(((java.lang.String) objArr9[0]).intern(), jSONObject4);
                        jSONArray.put(jSONObject3);
                    }
                }
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䁻볽륜떍눥꺝ꯥ\ua879\ua4c7ꄥ鶙騃靬", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 64663, objArr10);
                jSONObject.put(((java.lang.String) objArr10[0]).intern(), jSONArray);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("䁧扣Ѫ♤졽\uea43豍깷倬爯ᐿ㘜\ud802兀", 8712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr11);
                jSONObject.put(((java.lang.String) objArr11[0]).intern(), maVar.m25735());
                util.h.xy.d.mg mgVar = util.h.xy.d.mg.f1144;
                if (bVar != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 51) % 128;
                    bVar.m25729().m25738();
                }
                if (bVar != null) {
                    int i7 = Camera2StreamConfigurationMap + 17;
                    getHighSpeedVideoSizes = i7 % 128;
                    if (i7 % 2 == 0) {
                        bVar.m25729().m25738().equals(util.h.xy.d.mg.f1144.toString());
                        throw null;
                    }
                    if (bVar.m25729().m25738().equals(util.h.xy.d.mg.f1144.toString())) {
                        if (!android.text.TextUtils.isEmpty(maVar.m25734())) {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("䁸熳⏕헿蜊뤩歽ᲄ캲胖닗搇ᘬ졻旅ꮺ巈", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12764, objArr12);
                            jSONObject.put(((java.lang.String) objArr12[0]).intern(), maVar.m25734());
                        }
                        try {
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("䁸᎓\ue795뮟ྊ\ue389랽த\udfb2뎶ޗ\udba7꾬ϧퟘꯙ", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 21499, objArr13);
                            jSONObject.put(((java.lang.String) objArr13[0]).intern(), maVar.m25731());
                            return jSONObject;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                return jSONObject;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            while (r6.hasNext()) {
            }
        }
        java.lang.Object[] objArr102 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁻볽륜떍눥꺝ꯥ\ua879\ua4c7ꄥ鶙騃靬", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 64663, objArr102);
        jSONObject.put(((java.lang.String) objArr102[0]).intern(), jSONArray);
        java.lang.Object[] objArr112 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䁧扣Ѫ♤졽\uea43豍깷倬爯ᐿ㘜\ud802兀", 8712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr112);
        jSONObject.put(((java.lang.String) objArr112[0]).intern(), maVar.m25735());
        util.h.xy.d.mg mgVar2 = util.h.xy.d.mg.f1144;
        if (bVar != null) {
        }
        if (bVar != null) {
        }
        return jSONObject;
    }

    static final class mb {
        static int getHighSpeedVideoFpsRanges = 1;
        static int getHighSpeedVideoSizes;
        java.lang.String Camera2StreamConfigurationMap;
        util.h.xy.bv.mf.ma getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        public mb(java.lang.String str, java.lang.String str2, util.h.xy.bv.mf.ma maVar) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = maVar;
        }
    }

    public static final class ma {
        private static int getHighSpeedVideoSizesFor = 0;
        private static int getOutputFormats = 1;
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        util.h.xy.bv.mf.a getHighSpeedVideoSizes;
        java.util.ArrayList<util.h.xy.bv.mf.b> getInputFormats;

        public ma(java.lang.String str, util.h.xy.bv.mf.a aVar, java.util.ArrayList<util.h.xy.bv.mf.b> arrayList, java.lang.String str2) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = aVar;
            this.getInputFormats = arrayList;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }

        public ma(java.lang.String str, util.h.xy.bv.mf.a aVar, java.util.ArrayList<util.h.xy.bv.mf.b> arrayList, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = aVar;
            this.getInputFormats = arrayList;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.getHighSpeedVideoFpsRanges = str4;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final java.lang.String m25732() {
            int i = getOutputFormats;
            int i2 = ((i | 1) << 1) - (i ^ 1);
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            java.lang.String str = this.Camera2StreamConfigurationMap;
            getHighSpeedVideoSizesFor = (((i | 23) << 1) - (i ^ 23)) % 128;
            return str;
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public final util.h.xy.bv.mf.a m25736() {
            int i = (getHighSpeedVideoSizesFor + 33) % 128;
            getOutputFormats = i;
            util.h.xy.bv.mf.a aVar = this.getHighSpeedVideoSizes;
            getHighSpeedVideoSizesFor = (((i | 73) << 1) - (i ^ 73)) % 128;
            return aVar;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final java.util.ArrayList<util.h.xy.bv.mf.b> m25733() {
            int i = (getOutputFormats + 11) % 128;
            getHighSpeedVideoSizesFor = i;
            java.util.ArrayList<util.h.xy.bv.mf.b> arrayList = this.getInputFormats;
            int i2 = i + 65;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                return arrayList;
            }
            throw null;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final java.lang.String m25735() {
            int i = getOutputFormats;
            int i2 = (i ^ 41) + ((i & 41) << 1);
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            int i3 = i + 51;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final java.lang.String m25734() {
            int i = getHighSpeedVideoSizesFor;
            int i2 = i + 107;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = i + 79;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final java.lang.String m25731() {
            int i = getOutputFormats;
            int i2 = ((i & 55) + (i | 55)) % 128;
            getHighSpeedVideoSizesFor = i2;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            getOutputFormats = (i2 + 37) % 128;
            return str;
        }
    }

    public static final class a {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.String getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        public a(int i) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = i;
        }

        public a(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = str;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final int m25724() {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (i + 5) % 128;
            int i2 = this.getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (i + 113) % 128;
            return i2;
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public final java.lang.String m25726() {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i & 111) + (i | 111);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            int i3 = ((i | 75) << 1) - (i ^ 75);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final int m25725() {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
            Camera2StreamConfigurationMap = i;
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = ((i | 93) << 1) - (i ^ 93);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return i2;
            }
            throw null;
        }
    }

    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoSizesFor;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        util.h.xy.bv.mf.ra getHighSpeedVideoSizes;

        public b(java.lang.String str, java.lang.String str2, java.lang.String str3, util.h.xy.bv.mf.ra raVar) {
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoFpsRangesFor = str3;
            this.getHighSpeedVideoSizes = raVar;
        }

        public b(java.lang.String str, java.lang.String str2, util.h.xy.bv.mf.ra raVar) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighSpeedVideoSizes = raVar;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final java.lang.String m25728() {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i & 85) + (i | 85);
            getHighSpeedVideoSizesFor = i2 % 128;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (i2 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final java.lang.String m25727() {
            int i = Camera2StreamConfigurationMap;
            int i2 = ((i | 75) << 1) - (i ^ 75);
            getHighSpeedVideoSizesFor = i2 % 128;
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public final java.lang.String m25730() {
            int i = getHighSpeedVideoSizesFor;
            int i2 = ((i & 7) + (i | 7)) % 128;
            Camera2StreamConfigurationMap = i2;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            int i3 = i2 + 57;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.bv.mf.ra m25729() {
            int i = Camera2StreamConfigurationMap;
            int i2 = (i ^ 5) + ((i & 5) << 1);
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            util.h.xy.bv.mf.ra raVar = this.getHighSpeedVideoSizes;
            getHighSpeedVideoSizesFor = (i + 31) % 128;
            return raVar;
        }
    }

    public static final class ra {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        public ra(java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final java.lang.String m25737() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = (i + 71) % 128;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 97) + (i | 97);
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final java.lang.String m25738() {
            int i = getHighSpeedVideoFpsRanges + 101;
            int i2 = i % 128;
            Camera2StreamConfigurationMap = i2;
            if (i % 2 != 0) {
                throw null;
            }
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = (i2 & 55) + (i2 | 55);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{42463, 42067, 42050, 42109, 42051, 42105, 42110, 42407, 42409, 42051, 42403, 42407, 42049, 42058, 42051, 42106, 42403, 42406, 42111, 42048, 42411, 42403, 42051, 42049, 42401, 42409, 42051, 42403, 42417, 42078, 42072, 42416, 42408, 42058, 42052, 42051, 42105, 42050, 42411, 42403, 42104, 42406, 42400, 42050, 42051, 42111, 42049, 42048, 42050, 42111, 42108, 42341, 42292, 42302, 42251, 42246, 42292, 42293, 42288, 42300, 42302, 42343, 42302, 42301, 42292, 42293, 42288, 42284, 42289, 42289, 42295, 42340, 42294, 42295, 42301, 42245, 42292, 42292, 42298, 42285, 42281, 42420, 42426, 42430, 42430, 42424, 42431, 42375, 42368, 42421, 42422, 42341, 42293, 42288, 42243, 42247, 42294, 42297, 42246, 42246, 42292, 42298, 42296, 42294, 42294, 42294, 42295, 42344, 42295, 42299, 42256, 42433, 42432, 42462, 42278, 42448, 42441, 42462, 42458, 42443, 42444};
        getInputFormats = -1879282470561614960L;
    }
}
