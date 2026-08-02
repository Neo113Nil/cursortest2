package util.h.xy.au;

/* loaded from: classes5.dex */
public class mc {
    private static int getHighSpeedVideoFpsRanges = 77;
    private static int getHighSpeedVideoSizes;

    static {
        int i = 77 % 2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m25164(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus, byte[] bArr) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (util.h.xy.au.mc.class) {
            int i = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = (((i | 73) << 1) - (i ^ 73)) % 128;
            util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25214(str, bArr);
            getHighResolutionOutputSizeshNQ4ISI(str, cardStatus, bArr);
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25166(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (util.h.xy.au.mc.class) {
            int i = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i & 15) + (i | 15)) % 128;
            util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25223(str);
            getHighResolutionOutputSizeshNQ4ISI(str, null, null);
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 17) << 1) - (i2 ^ 17);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[Catch: all -> 0x00bf, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0021, B:10:0x0030, B:13:0x0034, B:14:0x0065, B:16:0x006e, B:18:0x0074, B:22:0x0091, B:20:0x0098, B:23:0x009b, B:28:0x004b, B:34:0x0053, B:35:0x0054, B:36:0x00a8, B:42:0x00be, B:30:0x004c, B:31:0x0051, B:38:0x00b7, B:39:0x00bc), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b A[EDGE_INSN: B:27:0x009b->B:23:0x009b BREAK  A[LOOP:0: B:16:0x006e->B:20:0x0098], SYNTHETIC] */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m25165(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException, org.json.JSONException {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        java.lang.String str2;
        int i;
        synchronized (util.h.xy.au.mc.class) {
            int i2 = getHighSpeedVideoFpsRanges + 63;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25215();
                throw new java.lang.NullPointerException();
            }
            byte[] m25215 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25215();
            if (m25215 != null) {
                int i3 = getHighSpeedVideoSizes;
                int i4 = (i3 & 35) + (i3 | 35);
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 == 0) {
                    int length = m25215.length;
                    throw new java.lang.ArithmeticException();
                }
                if (m25215.length != 0) {
                    jSONObject = new org.json.JSONObject(new java.lang.String(m25215, java.nio.charset.StandardCharsets.UTF_8));
                    int i5 = getHighSpeedVideoSizes + 111;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    int i6 = i5 % 2;
                    jSONArray = jSONObject.getJSONArray(util.h.xy.al.ra.f843);
                    str2 = "";
                    i = 0;
                    while (true) {
                        if (i < jSONArray.length()) {
                            break;
                        }
                        int i7 = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRanges = ((i7 ^ 81) + ((i7 & 81) << 1)) % 128;
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (str.equals(jSONObject2.getString(util.h.xy.al.ra.f842))) {
                            str2 = jSONObject2.getString(util.h.xy.al.ra.f831);
                            break;
                        }
                        i++;
                    }
                    int i8 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRanges = ((i8 & 33) + (i8 | 33)) % 128;
                }
            }
            jSONObject = new org.json.JSONObject(java.lang.String.format(util.h.xy.al.ra.f290, util.h.xy.al.ra.f843));
            jSONArray = jSONObject.getJSONArray(util.h.xy.al.ra.f843);
            str2 = "";
            i = 0;
            while (true) {
                if (i < jSONArray.length()) {
                }
                i++;
            }
            int i82 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = ((i82 & 33) + (i82 | 33)) % 128;
        }
        return str2;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus, byte[] bArr) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = getHighSpeedVideoSizes + 25;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
            m25213.m25219(getHighSpeedVideoFpsRangesFor(m25213.m25215(), str, cardStatus, bArr));
            int i2 = getHighSpeedVideoSizes + 19;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        util.h.xy.au.rg m252132 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
        m252132.m25219(getHighSpeedVideoFpsRangesFor(m252132.m25215(), str, cardStatus, bArr));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus, byte[] bArr2) throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        int i;
        int i2;
        int i3 = getHighSpeedVideoSizes;
        int i4 = ((i3 ^ 59) + ((i3 & 59) << 1)) % 128;
        getHighSpeedVideoFpsRanges = i4;
        if (bArr != null) {
            int i5 = i4 + 25;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
                jSONArray = jSONObject.getJSONArray(util.h.xy.al.ra.f843);
                i = 0;
                while (true) {
                    if (i < jSONArray.length()) {
                        i = -1;
                        break;
                    }
                    int i6 = getHighSpeedVideoFpsRanges;
                    getHighSpeedVideoSizes = ((i6 & 107) + (i6 | 107)) % 128;
                    if (str.equals(jSONArray.getJSONObject(i).getString(util.h.xy.al.ra.f842))) {
                        int i7 = getHighSpeedVideoSizes;
                        int i8 = (i7 & 101) + (i7 | 101);
                        getHighSpeedVideoFpsRanges = i8 % 128;
                        if (i8 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i9 = (i & 108) + (i | 108);
                        i = ((i9 | (-107)) << 1) - (i9 ^ (-107));
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
                    }
                }
                if (bArr2 != null) {
                    if (i >= 0) {
                        int i10 = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRanges = (((i10 | 107) << 1) - (i10 ^ 107)) % 128;
                        jSONArray.remove(i);
                    }
                } else if (i < 0) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(util.h.xy.al.ra.f842, str);
                    jSONObject2.put(util.h.xy.al.ra.f831, cardStatus);
                    jSONArray.put(jSONObject2);
                } else {
                    jSONArray.getJSONObject(i).put(util.h.xy.al.ra.f831, cardStatus);
                }
                byte[] bytes = jSONObject.toString().getBytes();
                int i11 = getHighSpeedVideoSizes;
                i2 = (i11 & 99) + (i11 | 99);
                getHighSpeedVideoFpsRanges = i2 % 128;
                if (i2 % 2 == 0) {
                    return bytes;
                }
                throw null;
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(java.lang.String.format(util.h.xy.al.ra.f290, util.h.xy.al.ra.f843));
        int i12 = getHighSpeedVideoFpsRanges;
        int i13 = (i12 & 37) + (i12 | 37);
        getHighSpeedVideoSizes = i13 % 128;
        int i14 = i13 % 2;
        jSONObject = jSONObject3;
        jSONArray = jSONObject.getJSONArray(util.h.xy.al.ra.f843);
        i = 0;
        while (true) {
            if (i < jSONArray.length()) {
            }
            int i92 = (i & 108) + (i | 108);
            i = ((i92 | (-107)) << 1) - (i92 ^ (-107));
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
        }
        if (bArr2 != null) {
        }
        byte[] bytes2 = jSONObject.toString().getBytes();
        int i112 = getHighSpeedVideoSizes;
        i2 = (i112 & 99) + (i112 | 99);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    static java.util.Collection<com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry> getHighSpeedVideoSizes() throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] m25215 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485()).m25215();
        int i = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (m25215 != null) {
            int i2 = getHighSpeedVideoSizes;
            int i3 = (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                int length = m25215.length;
                throw null;
            }
            if (m25215.length != 0) {
                org.json.JSONArray jSONArray = new org.json.JSONObject(new java.lang.String(m25215, java.nio.charset.StandardCharsets.UTF_8)).getJSONArray(util.h.xy.al.ra.f843);
                while (i < jSONArray.length()) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new util.h.xy.au.ra().m25197(jSONObject.getString(util.h.xy.al.ra.f842)).m25198(util.h.xy.bh.b.m25466(jSONObject.getString(util.h.xy.al.ra.f831))));
                    int i4 = ((i | 80) << 1) - (i ^ 80);
                    i = ((i4 | (-79)) << 1) - (i4 ^ (-79));
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 61) % 128;
                }
                return arrayList;
            }
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return arrayList;
    }
}
