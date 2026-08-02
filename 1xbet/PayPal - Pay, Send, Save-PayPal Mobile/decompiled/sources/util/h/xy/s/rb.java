package util.h.xy.s;

/* loaded from: classes5.dex */
public class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static char getOutputStallDuration;

    static {
        getHighSpeedVideoFpsRangesFor();
        getOutputMinFrameDuration = util.h.xy.s.rb.class.getName();
        getInputFormats = (getHighSpeedVideoSizes + 69) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039c  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable, util.h.xy.d.b] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.s.re> m27289(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.d.c cVar;
        java.lang.String str2;
        util.h.xy.s.a.b bVar;
        byte b;
        java.lang.CharSequence charSequence;
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel;
        ?? r6;
        util.h.xy.s.re reVar;
        java.lang.String str3;
        util.h.xy.s.a.b bVar2;
        util.h.xy.d.c cVar2;
        util.h.xy.s.re reVar2;
        java.lang.String str4;
        int i;
        byte b2;
        java.lang.CharSequence charSequence2;
        int i2 = (getInputFormats + 1) % 128;
        getHighSpeedVideoSizes = i2;
        getInputFormats = (i2 + 1) % 128;
        util.h.xy.d.c m26925 = util.h.xy.k.ma.m26925();
        java.lang.String result = m26925.mo26151(str, util.h.xy.d.ma.f1140).getResult();
        java.lang.String m27074 = util.h.xy.s.b.m27074(result);
        util.h.xy.s.a.b m27288 = m27288(result);
        boolean m27300 = m27300(result);
        boolean m27298 = m27298(result);
        boolean m27295 = m27295(result);
        int m27296 = m27296(result);
        java.lang.String m27299 = m27299(result);
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m27287 = m27287(result);
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(m27287)) {
            getInputFormats = (getHighSpeedVideoSizes + 85) % 128;
            if (m27288 == util.h.xy.s.a.b.f2298) {
                getInputFormats = (getHighSpeedVideoSizes + 33) % 128;
                byte[] code = m27287.getCode();
                util.h.xy.s.re reVar3 = new util.h.xy.s.re(m27300, false, false);
                org.json.JSONObject jSONObject = new org.json.JSONObject(m26925.mo26151(str, util.h.xy.d.ma.f1141).getResult());
                util.h.xy.s.rf rfVar = new util.h.xy.s.rf();
                if (m27288 == util.h.xy.s.a.b.f2298) {
                    getInputFormats = (getHighSpeedVideoSizes + 121) % 128;
                    rfVar.m27398(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2330)));
                    rfVar.m27401(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2304)));
                    rfVar.m27406(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2325)));
                    str2 = result;
                    if (jSONObject.has(util.h.xy.s.g.f2328)) {
                        getHighSpeedVideoSizes = (getInputFormats + 125) % 128;
                        byte[] m27184 = util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2328));
                        rfVar.m27386(m27184);
                        util.h.xy.ar.b.m25074(m27184);
                        cVar = m26925;
                        bVar = m27288;
                    } else {
                        cVar = m26925;
                        bVar = m27288;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) (88 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), "㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻", android.view.View.MeasureSpec.getSize(0) + 12, objArr);
                        byte[] m25076 = util.h.xy.ar.b.m25076(((java.lang.String) objArr[0]).intern());
                        rfVar.m27386(m25076);
                        util.h.xy.ar.b.m25074(m25076);
                    }
                    rfVar.m27389(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2327)));
                    if (jSONObject.has(util.h.xy.s.g.f2333)) {
                        byte[] m271842 = util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2333));
                        rfVar.m27390(m271842);
                        util.h.xy.ar.b.m25074(m271842);
                        charSequence2 = "";
                        b = 0;
                    } else {
                        charSequence2 = "";
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 88), "㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻㗻", 12 - android.text.TextUtils.indexOf("", "", 0, 0), objArr2);
                        b = 0;
                        byte[] m250762 = util.h.xy.ar.b.m25076(((java.lang.String) objArr2[0]).intern());
                        rfVar.m27390(m250762);
                        util.h.xy.ar.b.m25074(m250762);
                    }
                    rfVar.m27394(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2302)));
                    rfVar.m27393(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2300)));
                    rfVar.m27402(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2337)));
                    rfVar.m27384(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2338)));
                    rfVar.m27385(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2299)));
                    rfVar.m27404(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2308)));
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(util.h.xy.s.ma.f2350);
                    rfVar.m27396(util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.g.f2360)));
                    rfVar.m27387(util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.g.f2326)));
                    java.lang.String optString = jSONObject.optString(util.h.xy.s.g.f2318);
                    if (!optString.isEmpty()) {
                        getInputFormats = (getHighSpeedVideoSizes + 77) % 128;
                        rfVar.m27392(util.h.xy.s.d.m27184(optString));
                    }
                    java.lang.String optString2 = jSONObject.optString(util.h.xy.s.g.f2329);
                    if (!optString2.isEmpty()) {
                        rfVar.m27400(util.h.xy.s.d.m27184(optString2));
                        getHighSpeedVideoSizes = (getInputFormats + 75) % 128;
                    }
                    if (jSONObject.has(util.h.xy.s.ma.f2349)) {
                        org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(util.h.xy.s.ma.f2349);
                        util.h.xy.s.mb mbVar = new util.h.xy.s.mb();
                        byte[] m271843 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.g.f2360));
                        byte[] m271844 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.g.f2326));
                        mbVar.m27214(m271843);
                        mbVar.m27215(m271844);
                        rfVar.m27391(mbVar);
                    }
                } else {
                    cVar = m26925;
                    str2 = result;
                    bVar = m27288;
                    charSequence2 = "";
                    b = 0;
                    rfVar = null;
                }
                rfVar.m27388(util.h.xy.s.d.m27184(m27299));
                rfVar.m27405(code);
                byte[] m27403 = rfVar.m27403();
                byte[] m27397 = rfVar.m27397();
                reVar3.m27379(rfVar);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(util.h.xy.s.g.f2360, m27403);
                hashMap.put(util.h.xy.s.g.f2326, m27397);
                r6 = 0;
                charSequence = charSequence2;
                profileChannel = m27287;
                util.h.xy.s.a aVar = new util.h.xy.s.a(hashMap, false, util.h.xy.s.a.b.f2298, true, m27074);
                getInputFormats = (getHighSpeedVideoSizes + 63) % 128;
                reVar3.m27373(m27074);
                reVar3.m27369(aVar);
                reVar3.m27372(m27296);
                int i3 = getHighSpeedVideoSizes + 47;
                getInputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                reVar = reVar3;
                if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isClSupported(profileChannel)) {
                    str3 = str2;
                    bVar2 = bVar;
                    cVar2 = cVar;
                    reVar2 = reVar;
                } else {
                    util.h.xy.s.re reVar4 = reVar == null ? new util.h.xy.s.re(m27300, m27298, m27295) : reVar;
                    cVar2 = cVar;
                    bVar2 = bVar;
                    util.h.xy.s.me m27293 = m27293(str, cVar2.mo26151(str, util.h.xy.d.ma.f1142).getResult(), bVar2, m27074);
                    if (bVar2 == util.h.xy.s.a.b.f2296) {
                        int i4 = getInputFormats + 43;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 == 0) {
                            util.h.xy.aw.ma.m25243();
                            throw new java.lang.ArithmeticException();
                        }
                        b2 = util.h.xy.aw.ma.m25243();
                    } else {
                        b2 = b;
                    }
                    reVar4.m27373(m27074);
                    reVar4.m27372(m27296);
                    str3 = str2;
                    util.h.xy.s.c m27292 = m27292(reVar4, m27293, bVar2, b2, str3);
                    if (bVar2 == util.h.xy.s.a.b.f2298) {
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148 = util.h.xy.k.ma.m26925().mo26148(str);
                        if (mo26148.isSuccessful()) {
                            util.h.xy.d.rf rfVar2 = new util.h.xy.d.rf(mo26148.getResult(), r6, cVar2.mo26170(str).getResult());
                            rfVar2.getExpiryDate();
                            if (m27300) {
                                java.lang.String expiryDate = rfVar2.getExpiryDate();
                                if (!android.text.TextUtils.isEmpty(expiryDate)) {
                                    int i5 = getInputFormats + 39;
                                    getHighSpeedVideoSizes = i5 % 128;
                                    int i6 = i5 % 2;
                                    byte[] m27548 = util.h.xy.u.rc.m27548(expiryDate);
                                    if (i6 == 0) {
                                        m27292.m27124(m27548);
                                        throw r6;
                                    }
                                    m27292.m27124(m27548);
                                }
                            }
                        }
                    }
                    reVar4.m27381(m27292);
                    reVar4.m27369(m27293.m27243());
                    if (reVar4 != null) {
                        getHighSpeedVideoSizes = (getInputFormats + 101) % 128;
                        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(profileChannel) && bVar2 == util.h.xy.s.a.b.f2297) {
                            java.lang.CharSequence charSequence3 = charSequence;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", 3 - android.text.TextUtils.indexOf(charSequence3, charSequence3, b), objArr3);
                            if (!m27074.equals(((java.lang.String) objArr3[b]).intern())) {
                                getHighSpeedVideoSizes = (getInputFormats + 41) % 128;
                                util.h.xy.s.me m272932 = m27293(str, cVar2.mo26151(str, util.h.xy.d.ma.f1142).getResult(), bVar2, m27074);
                                reVar4 = m27297(reVar4, m272932, m27292(reVar4, m272932, bVar2, b, str3), bVar2, m27296, m27074);
                            }
                        }
                    }
                    reVar2 = reVar4;
                }
                if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isDsrpSupported(profileChannel)) {
                    str4 = r6;
                } else {
                    int i7 = getInputFormats + 15;
                    getHighSpeedVideoSizes = i7 % 128;
                    if (i7 % 2 == 0) {
                        java.lang.Throwable th = r6;
                        m27290(reVar2, cVar2, str, m27296, str3, m27074, bVar2, profileChannel);
                        throw th;
                    }
                    str4 = r6;
                    reVar2 = m27290(reVar2, cVar2, str, m27296, str3, m27074, bVar2, profileChannel);
                }
                util.h.xy.al.rb.m25016(profileChannel.getCode());
                if (reVar2 != null) {
                    reVar2.m27374(profileChannel);
                }
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(reVar2, true, str4);
                i = getHighSpeedVideoSizes + 17;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    return raVar;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        cVar = m26925;
        str2 = result;
        bVar = m27288;
        b = 0;
        charSequence = "";
        profileChannel = m27287;
        r6 = 0;
        reVar = null;
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isClSupported(profileChannel)) {
        }
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isDsrpSupported(profileChannel)) {
        }
        util.h.xy.al.rb.m25016(profileChannel.getCode());
        if (reVar2 != null) {
        }
        util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(reVar2, true, str4);
        i = getHighSpeedVideoSizes + 17;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27300(java.lang.String str) {
        boolean z;
        int i;
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            z = false;
        }
        if (jSONObject.has(util.h.xy.s.ma.f2348)) {
            int i2 = getHighSpeedVideoSizes + 121;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                z = jSONObject.getBoolean(util.h.xy.s.ma.f2348);
                i = getInputFormats + 81;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    return z;
                }
                throw new java.lang.ArithmeticException();
            }
            z = jSONObject.getBoolean(util.h.xy.s.ma.f2348);
            try {
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Exception unused2) {
            }
        }
        z = false;
        i = getInputFormats + 81;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 91) % 128;
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 79) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputStallDuration ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m27298(java.lang.String str) {
        boolean z;
        int i;
        org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            z = false;
        }
        if (jSONObject.has(util.h.xy.s.ma.f2369)) {
            int i2 = getInputFormats + 7;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                z = jSONObject.getBoolean(util.h.xy.s.ma.f2369);
                i = getInputFormats + 3;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    return z;
                }
                throw new java.lang.ArithmeticException();
            }
            z = jSONObject.getBoolean(util.h.xy.s.ma.f2369);
            try {
                throw new java.lang.ArithmeticException();
            } catch (java.lang.Exception unused2) {
            }
        }
        z = false;
        i = getInputFormats + 3;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m27295(java.lang.String str) {
        boolean z = false;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(util.h.xy.s.ma.f2364)) {
                int i = getHighSpeedVideoSizes + 25;
                getInputFormats = i % 128;
                if (i % 2 == 0) {
                    z = jSONObject.getBoolean(util.h.xy.s.ma.f2364);
                } else {
                    jSONObject.getBoolean(util.h.xy.s.ma.f2364);
                    throw null;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        getInputFormats = (getHighSpeedVideoSizes + 57) % 128;
        return z;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m27296(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (40 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\r\u0010!\t\u001b\u0004", 7 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            java.lang.String m27506 = util.h.xy.u.d.m27506(str, ((java.lang.String) objArr[0]).intern());
            java.lang.String m27074 = util.h.xy.s.b.m27074(str);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\uea1aᅬ\ue790昱鮂\uf2ef赻\ud92d烴鿟", 10 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
            if (m27506.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                int i = getInputFormats + 57;
                int i2 = i % 128;
                getHighSpeedVideoSizes = i2;
                int i3 = i % 2 == 0 ? 1 : 0;
                getInputFormats = (i2 + 27) % 128;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("纅ꓝꨧ\uebad", 3 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(i3))).intValue() + 20) >> 6), objArr3);
                    if (m27074.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                        return 30;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (jSONObject.has(util.h.xy.s.ma.f2343)) {
                java.lang.String optString = jSONObject.optString(util.h.xy.s.ma.f2343);
                if (!android.text.TextUtils.isEmpty(optString)) {
                    getInputFormats = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    java.lang.Integer.parseInt(optString);
                }
                return java.lang.Integer.parseInt(optString);
            }
        } catch (java.lang.Exception unused) {
        }
        return 30;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m27287(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u000f\b\u001c\"\u0004\t\u001e\u001c!\u000f㘁㘁\u0005\u000f㗶", 15 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.view.View.resolveSize(0, 0) + 13), "\u000f\b\u001c\"\u0004\t\u001e\u001c!\u000f㘁㘁\u0005\u000f㗶", 16 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), "\r\u0010!\t\u001b\u0004", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6, objArr3);
            java.lang.String string2 = jSONObject.getString(((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 97), "\u0003\u0006\u0010\u001e\u0001\t\u001b\u0006\b\u0019", android.view.MotionEvent.axisFromString("") + 11, objArr4);
            if (!string2.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                return com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.get(util.h.xy.ar.b.m25076(string)[0]);
            }
            int i = getInputFormats + 15;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0 ? (profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.get(util.h.xy.ar.b.m25076(string)[0])) != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR : (profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.get(util.h.xy.ar.b.m25076(string)[1])) != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP_AND_QR) {
                if (profileChannel != com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP) {
                    if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP) {
                        int i2 = getHighSpeedVideoSizes + 81;
                        getInputFormats = i2 % 128;
                        if (i2 % 2 == 0) {
                            return com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                        }
                        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel2 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP;
                        throw new java.lang.ArithmeticException();
                    }
                    return com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS;
                }
            }
            com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel3 = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS_AND_DSRP;
            getInputFormats = (getHighSpeedVideoSizes + 121) % 128;
            return profileChannel3;
        }
        return com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static util.h.xy.s.a.b m27288(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.has(util.h.xy.s.ma.f2347)) {
            getInputFormats = (getHighSpeedVideoSizes + 45) % 128;
            java.lang.String string = jSONObject.getString(util.h.xy.s.ma.f2347);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (96 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0003\u0006\u0010\u001e\u0001\t\u001b\u0006\b\u0019", android.view.KeyEvent.getDeadChar(0, 0) + 10, objArr);
            if (!string.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (android.view.KeyEvent.getDeadChar(0, 0) + 44), "\"\u0003\u000f\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr2);
                if (string.equalsIgnoreCase(((java.lang.String) objArr2[0]).intern())) {
                    return util.h.xy.s.a.b.f2296;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ᤌ\udcbf鷑ḅ", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5, objArr3);
                if (!string.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    return util.h.xy.s.a.b.f2295;
                }
                int i = getInputFormats + 117;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 != 0) {
                    return util.h.xy.s.a.b.f2298;
                }
                util.h.xy.s.a.b bVar = util.h.xy.s.a.b.f2298;
                throw null;
            }
            getInputFormats = (getHighSpeedVideoSizes + 19) % 128;
            return util.h.xy.s.a.b.f2297;
        }
        return util.h.xy.s.a.b.f2295;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.s.me m27293(java.lang.String str, java.lang.String str2, util.h.xy.s.a.b bVar, java.lang.String str3) throws org.json.JSONException {
        util.h.xy.s.mf mfVar;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
        if (bVar == util.h.xy.s.a.b.f2297) {
            util.h.xy.s.rc rcVar = new util.h.xy.s.rc();
            rcVar.m27234(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.md.f2356)));
            rcVar.m27316(new java.math.BigInteger(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.md.f2385))).intValue());
            rcVar.m27317(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.md.f2384)));
            if (jSONObject.has(util.h.xy.s.md.f2397)) {
                getHighSpeedVideoSizes = (getInputFormats + 89) % 128;
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(util.h.xy.s.md.f2397);
                byte[] m27184 = util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.md.f2377));
                byte[] m271842 = util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.md.f2398));
                byte[] m271843 = util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.md.f2396));
                byte[] m271844 = util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.md.f2388));
                rcVar.m27324(m27184);
                rcVar.m27305(m271842);
                rcVar.m27326(m271843);
                rcVar.m27303(m271844);
            }
            if (jSONObject.has(util.h.xy.s.md.f2379)) {
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(util.h.xy.s.md.f2379);
                byte[] m271845 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.md.f2389));
                byte[] m271846 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.md.f2387));
                byte[] m271847 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.md.f2390));
                byte[] m271848 = util.h.xy.s.d.m27184(jSONObject3.getString(util.h.xy.s.md.f2386));
                rcVar.m27334(m271845);
                rcVar.m27301(m271846);
                rcVar.m27310(m271847);
                rcVar.m27318(m271848);
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2, objArr);
            if (str3.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                rcVar.m27313(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.md.f2382)));
                rcVar.m27321(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.md.f2383)));
                rcVar.m27329(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.md.f2378)));
                mfVar = rcVar;
            } else {
                rcVar.m27323(jSONObject.getString(util.h.xy.s.md.f2394));
                rcVar.m27320(jSONObject.getString(util.h.xy.s.md.f2393));
                rcVar.m27328(jSONObject.getString(util.h.xy.s.md.f2391));
                rcVar.m27312(jSONObject.getString(util.h.xy.s.md.f2395));
                mfVar = rcVar;
            }
        } else if (bVar == util.h.xy.s.a.b.f2298) {
            util.h.xy.s.mg mgVar = new util.h.xy.s.mg();
            mgVar.m27234(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.g.f2318)));
            mgVar.m27256(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2306)));
            mgVar.m27260(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2308)));
            mgVar.m27266(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2307)));
            mgVar.m27262(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2304)));
            mgVar.m27254(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2303)));
            mgVar.m27264(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2311)));
            mgVar.m27268(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2302)));
            mgVar.m27246(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2336)));
            mgVar.m27250(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2337)));
            mgVar.m27248(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2332)));
            mgVar.m27253(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.g.f2317)));
            mgVar.m27258(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.g.f2323)));
            mfVar = mgVar;
        } else {
            util.h.xy.s.mf mfVar2 = new util.h.xy.s.mf();
            if (jSONObject.has(util.h.xy.s.ma.f2374)) {
                getInputFormats = (getHighSpeedVideoSizes + 85) % 128;
                byte[] m271849 = util.h.xy.s.d.m27184(jSONObject.getJSONObject(util.h.xy.s.ma.f2374).getString(util.h.xy.s.ma.f2353));
                mfVar2.m27240(m271849);
                util.h.xy.ar.b.m25095(m271849);
                getInputFormats = (getHighSpeedVideoSizes + 1) % 128;
            }
            mfVar2.m27244(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.rh.f2413)));
            mfVar = mfVar2;
        }
        mfVar.m27227(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.ma.f2342)));
        if (bVar == util.h.xy.s.a.b.f2296) {
            java.lang.String optString = jSONObject.optString(util.h.xy.s.ma.f2346);
            if (optString.isEmpty()) {
                try {
                    m27291(str, jSONObject);
                    mfVar.m27228(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.ma.f2346)));
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                    throw new org.json.JSONException(e.getMessage());
                }
            } else {
                mfVar.m27228(util.h.xy.s.d.m27184(optString));
            }
        }
        mfVar.m27239(getHighSpeedVideoSizes(jSONObject, jSONObject.getJSONObject(util.h.xy.s.ma.f2350), util.h.xy.s.ma.f2350, str3, bVar));
        util.h.xy.s.a[] aVarArr = null;
        mfVar.m27230(jSONObject.has(util.h.xy.s.ma.f2349) ? getHighSpeedVideoSizes(jSONObject, jSONObject.getJSONObject(util.h.xy.s.ma.f2349), util.h.xy.s.ma.f2349, str3, bVar) : null);
        if (jSONObject.has(util.h.xy.s.ma.f2355)) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(util.h.xy.s.ma.f2355);
            int length = jSONArray.length();
            util.h.xy.s.a[] aVarArr2 = new util.h.xy.s.a[length];
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                jSONArray.getJSONObject(i);
                aVarArr2[i] = getHighSpeedVideoSizes(jSONObject, jSONArray.getJSONObject(i), util.h.xy.s.ma.f2355, str3, bVar);
                length = i;
            }
            aVarArr = aVarArr2;
        }
        mfVar.m27231(aVarArr);
        if (bVar != util.h.xy.s.a.b.f2298) {
            getInputFormats = (getHighSpeedVideoSizes + 9) % 128;
            mfVar.m27229(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.s.ma.f2367, "")));
            getHighSpeedVideoSizes = (getInputFormats + 119) % 128;
        }
        mfVar.m27233(getHighResolutionOutputSizeshNQ4ISI(jSONObject.getJSONArray(util.h.xy.s.md.f2373)));
        return mfVar;
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (Camera2StreamConfigurationMap + 15) % 128;
        getHighSpeedVideoFpsRanges = i3;
        int i4 = i3 + 35;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
                cArr2[i5] = (char) (cArr[i5] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputFormats);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 69) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 115) % 128;
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m27291(java.lang.String str, org.json.JSONObject jSONObject) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getInputFormats = (getHighSpeedVideoSizes + 43) % 128;
        try {
            byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.s.ma.f2342));
            util.h.xy.ar.b.m25106(m25076);
            jSONObject.put(util.h.xy.s.ma.f2346, util.h.xy.ar.b.m25106(util.h.xy.d.mb.m26187(m25076)));
            java.lang.String jSONObject2 = jSONObject.toString();
            util.h.xy.t.mb.f2417.m27470(str.getBytes(util.h.xy.h.a.f2221), jSONObject2.getBytes(util.h.xy.h.a.f2221));
            getInputFormats = (getHighSpeedVideoSizes + 83) % 128;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 33), "\u000e\u000f\u001b\b!\u0004\u0006#\u0002\u001c\u0011\u000b\u0015\r\u0013\u001a!\n#\u001c\u0011\u0006!\u000b\u0005\u0010\u0002\u001b#\u0007", 30 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString());
        } catch (org.json.JSONException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (46 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u000e\u000f\u001b\b!\u0004\u0006#\u0002\u001c\u0011\u000b\u0000\u0010# \u0011\u001d\u0018\u0013\u0007\u0006\u0003\b\u0006\r\n\u0010\u0005\u0007\u001f\b\r\u0019\r\u0001㗧", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(e2.getMessage());
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb2.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ff, code lost:
    
        if (r20.equals(((java.lang.String) r10[0]).intern()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.s.a getHighSpeedVideoSizes(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.lang.String str, java.lang.String str2, util.h.xy.s.a.b bVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject3;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean equalsIgnoreCase = str.equalsIgnoreCase(util.h.xy.s.ma.f2350);
        boolean z = !equalsIgnoreCase;
        try {
            hashMap.put(util.h.xy.s.ma.f2360, util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.ma.f2360)));
            if (bVar == util.h.xy.s.a.b.f2296) {
                if (util.h.xy.d.mb.m26184(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.s.ma.f2346))).get(jSONObject2.getString(util.h.xy.s.ma.f2360)) == com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.LOCKED) {
                    hashMap.put(util.h.xy.s.ma.f2346, new byte[]{0});
                } else {
                    hashMap.put(util.h.xy.s.ma.f2346, new byte[]{1});
                }
                jSONObject.getString(util.h.xy.s.ma.f2346);
                util.h.xy.ar.b.m25106((byte[]) hashMap.get(util.h.xy.s.ma.f2346));
            }
            byte[] m27184 = util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.ma.f2361));
            hashMap.put(util.h.xy.s.ma.f2361, m27184);
            if (bVar == util.h.xy.s.a.b.f2297) {
                byte[] copyOf = java.util.Arrays.copyOf(m27184, m27184.length);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", 2 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
                if (!str2.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                    byte[] m25052 = util.h.xy.ar.a.m25052(m27184, new byte[]{111});
                    byte[] m250522 = util.h.xy.ar.a.m25052(m27184, new byte[]{-91});
                    if (m250522.length > 0) {
                        byte[] m250523 = util.h.xy.ar.a.m25052(m250522, new byte[]{-97, 56});
                        if (m250523.length == 0) {
                            copyOf = util.h.xy.ar.a.m25055(copyOf, new byte[]{111}, util.h.xy.ar.a.m25055(m25052, new byte[]{-91}, util.h.xy.ar.b.m25090(m250522, new byte[]{-97, 56, 6}, new byte[]{-97, com.google.common.base.Ascii.SUB, 2}, new byte[]{-97, com.google.common.base.Ascii.GS, 8})));
                        } else {
                            boolean highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(m250523, new byte[]{-97, com.google.common.base.Ascii.SUB});
                            boolean highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(m250523, new byte[]{-97, com.google.common.base.Ascii.GS});
                            if (!highSpeedVideoFpsRangesFor) {
                                m250523 = util.h.xy.ar.b.m25090(m250523, new byte[]{-97, com.google.common.base.Ascii.SUB, 2});
                            }
                            if (!highSpeedVideoFpsRangesFor2) {
                                int i = getInputFormats + 91;
                                getHighSpeedVideoSizes = i % 128;
                                if (i % 2 == 0) {
                                    byte[][] bArr = new byte[5][];
                                    bArr[0] = m250523;
                                    bArr[1] = new byte[]{-97, com.google.common.base.Ascii.GS, 8};
                                    m250523 = util.h.xy.ar.b.m25090(bArr);
                                } else {
                                    m250523 = util.h.xy.ar.b.m25090(m250523, new byte[]{-97, com.google.common.base.Ascii.GS, 8});
                                }
                            }
                            if (!highSpeedVideoFpsRangesFor || !highSpeedVideoFpsRangesFor2) {
                                copyOf = util.h.xy.ar.a.m25055(copyOf, new byte[]{111}, util.h.xy.ar.a.m25055(m25052, new byte[]{-91}, util.h.xy.ar.a.m25055(m250522, new byte[]{-97, 56}, m250523)));
                            }
                        }
                    }
                }
                hashMap.put(util.h.xy.s.ma.f2361, copyOf);
            } else {
                hashMap.put(util.h.xy.s.ma.f2361, m27184);
            }
            if (jSONObject2.has(util.h.xy.s.ma.f2354)) {
                hashMap.put(util.h.xy.s.ma.f2354, util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.ma.f2354)));
            }
            if (bVar == util.h.xy.s.a.b.f2298) {
                getHighSpeedVideoSizes = (getInputFormats + 27) % 128;
                if (!equalsIgnoreCase) {
                    return new util.h.xy.s.a(hashMap, z, bVar, false, str2);
                }
            }
            hashMap.put(util.h.xy.s.ma.f2353, util.h.xy.s.d.m27184(jSONObject2.optString(util.h.xy.s.ma.f2353)));
            util.h.xy.s.f[] fVarArr = null;
            if (bVar == util.h.xy.s.a.b.f2297) {
                int i2 = getHighSpeedVideoSizes + 87;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", android.view.ViewConfiguration.getTouchSlop() + 77, objArr2);
                    if (str2.equals(((java.lang.String) objArr2[0]).intern())) {
                        hashMap.put(util.h.xy.s.md.f2381, util.h.xy.s.d.m27184(jSONObject2.optString(util.h.xy.s.md.f2381, "")));
                        jSONObject3 = jSONObject2;
                    }
                    jSONObject3 = jSONObject.optJSONObject(util.h.xy.s.ma.f2341);
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", 3 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
                }
                java.lang.String str3 = util.h.xy.s.md.f2380;
                getHighSpeedVideoSizes = (getInputFormats + 53) % 128;
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((byte) (119 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), "㙒㙒㙒㙒㙒㙒㙒㙒㙒㙒㙒㙒", android.text.TextUtils.indexOf("", "", 0, 0) + 12, objArr4);
                    hashMap.put(util.h.xy.s.md.f2380, util.h.xy.s.d.m27184(jSONObject2.optString(str3, ((java.lang.String) objArr4[0]).intern())));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (bVar == util.h.xy.s.a.b.f2296) {
                    hashMap.put(util.h.xy.s.rh.f2414, util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.rh.f2414)));
                    hashMap.put(util.h.xy.s.rh.f2415, util.h.xy.s.d.m27184(jSONObject2.optString(util.h.xy.s.rh.f2415)));
                } else if (bVar == util.h.xy.s.a.b.f2298) {
                    hashMap.put(util.h.xy.s.g.f2305, util.h.xy.s.d.m27184(jSONObject2.optString(util.h.xy.s.g.f2305)));
                    hashMap.put(util.h.xy.s.g.f2316, util.h.xy.s.d.m27184(jSONObject2.getString(util.h.xy.s.g.f2316)));
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(util.h.xy.s.g.f2313);
                    if (optJSONObject != null) {
                        org.json.JSONObject jSONObject4 = optJSONObject.getJSONObject(util.h.xy.s.g.f2353);
                        hashMap.put(util.h.xy.s.g.f2315, util.h.xy.s.d.m27184(jSONObject4.optString(util.h.xy.s.g.f2301)));
                        hashMap.put(util.h.xy.s.g.f2321, util.h.xy.s.d.m27184(jSONObject4.optString(util.h.xy.s.g.f2322)));
                        hashMap.put(util.h.xy.s.g.f2331, util.h.xy.s.d.m27184(jSONObject4.optString(util.h.xy.s.g.f2314)));
                    }
                    org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject(util.h.xy.s.g.f2310);
                    if (optJSONObject2 != null) {
                        org.json.JSONObject jSONObject5 = optJSONObject2.getJSONObject(util.h.xy.s.g.f2353);
                        hashMap.put(util.h.xy.s.g.f2319, util.h.xy.s.d.m27184(jSONObject5.optString(util.h.xy.s.g.f2301)));
                        hashMap.put(util.h.xy.s.g.f2334, util.h.xy.s.d.m27184(jSONObject5.optString(util.h.xy.s.g.f2322)));
                    }
                }
                jSONObject3 = jSONObject2;
            }
            hashMap.put(util.h.xy.s.ma.f2376, util.h.xy.s.d.m27184(jSONObject3.optString(util.h.xy.s.ma.f2376, "")));
            hashMap.put(util.h.xy.s.ma.f2372, util.h.xy.s.d.m27184(jSONObject3.optString(util.h.xy.s.ma.f2372, "")));
            hashMap.put(util.h.xy.s.ma.f2365, util.h.xy.s.d.m27184(jSONObject3.optString(util.h.xy.s.ma.f2365, "")));
            hashMap.put(util.h.xy.s.ma.f2366, util.h.xy.s.d.m27184(jSONObject3.optString(util.h.xy.s.ma.f2366, "")));
            hashMap.put(util.h.xy.s.ma.f2368, util.h.xy.s.d.m27184(jSONObject3.optString(util.h.xy.s.ma.f2368, "")));
            util.h.xy.s.a aVar = new util.h.xy.s.a(hashMap, z, bVar, false, str2);
            org.json.JSONArray optJSONArray = jSONObject2.optJSONArray(util.h.xy.s.md.f2373);
            if (optJSONArray != null) {
                int i3 = getHighSpeedVideoSizes + 89;
                getInputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    getHighResolutionOutputSizeshNQ4ISI(optJSONArray);
                    throw null;
                }
                fVarArr = getHighResolutionOutputSizeshNQ4ISI(optJSONArray);
            }
            aVar.m27064(fVarArr);
            return aVar;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoSizes("潾㔄ꉞ秛\uef7e忟懃᪽哖\ud896闌呺篆ᐙएɝ餫㝎磁ꗐ\u206aꚣ⭌䐬賙룔㏿\uebceứ铬", android.view.View.resolveSize(0, 0) + 30, objArr5);
            sb.append(((java.lang.String) objArr5[0]).intern());
            sb.append(e.getMessage());
            throw new org.json.JSONException(sb.toString());
        } catch (org.json.JSONException e2) {
            e2.getMessage();
            throw e2;
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        getInputFormats = (getHighSpeedVideoSizes + 69) % 128;
        int i = 0;
        while (true) {
            if (i >= bArr.length) {
                int i2 = getInputFormats + 55;
                getHighSpeedVideoSizes = i2 % 128;
                for (int i3 = i2 % 2 != 0 ? 0 : 1; i3 < bArr2.length; i3++) {
                    if (bArr[i + i3] != bArr2[i3]) {
                        int i4 = getInputFormats + 37;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                }
                i += bArr2.length;
            } else {
                int i5 = getInputFormats + 55;
                getHighSpeedVideoSizes = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static util.h.xy.s.f[] getHighResolutionOutputSizeshNQ4ISI(org.json.JSONArray jSONArray) throws org.json.JSONException {
        int i = getHighSpeedVideoSizes + 29;
        getInputFormats = i % 128;
        int i2 = i % 2;
        jSONArray.length();
        try {
            util.h.xy.s.f[] fVarArr = new util.h.xy.s.f[jSONArray.length()];
            getHighSpeedVideoSizes = (getInputFormats + 117) % 128;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                fVarArr[i3] = new util.h.xy.s.f();
                org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i3);
                byte[] m25076 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.s.md.f2339));
                byte[] m250762 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.s.md.f2375));
                byte[] m250763 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.s.md.f2370));
                fVarArr[i3].m27209(m25076);
                fVarArr[i3].m27212(m250762);
                fVarArr[i3].m27213(m250763);
            }
            getInputFormats = (getHighSpeedVideoSizes + 69) % 128;
            return fVarArr;
        } catch (org.json.JSONException unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (19 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), "\u0010\u0007\u0004\u000f\u000f\u0002\u0010!\u0002\u001b\b\u001d\n!㘎", 15 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            throw new org.json.JSONException(((java.lang.String) objArr[0]).intern());
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.s.c m27292(util.h.xy.s.re reVar, util.h.xy.s.me meVar, util.h.xy.s.a.b bVar, byte b, java.lang.String str) throws org.json.JSONException {
        util.h.xy.s.ra[] raVarArr;
        util.h.xy.s.c cVar = new util.h.xy.s.c();
        util.h.xy.s.a m27243 = meVar.m27243();
        cVar.m27100(meVar.m27238());
        byte[] m27067 = m27243.m27067(util.h.xy.s.ma.f2353);
        if (bVar == util.h.xy.s.a.b.f2296) {
            cVar.m27171(meVar.m27235());
            getInputFormats = (getHighSpeedVideoSizes + 75) % 128;
            byte[] bArr = {-97, 16};
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            byte[] m25110 = util.h.xy.ar.a.m25058(util.h.xy.ar.a.m25058(m27067, bool, new byte[]{com.visa.cbp.getEncExpo.IResultReceiver})[0].m25110(), bool, bArr)[0].m25110();
            util.h.xy.ar.b.m25074(m25110);
            m25110[7] = b;
            util.h.xy.ar.a.m25066(m27067, bArr, m25110);
            util.h.xy.ar.b.m25074(m25110);
            getHighSpeedVideoSizes = (getInputFormats + 39) % 128;
            cVar.m27110(m27067);
            cVar.m27151(m27243.m27067(util.h.xy.s.rh.f2415));
        } else if (bVar == util.h.xy.s.a.b.f2297) {
            cVar.m27110(m27067);
        } else if (bVar == util.h.xy.s.a.b.f2298) {
            getHighSpeedVideoSizes = (getInputFormats + 5) % 128;
            cVar.m27179(m27243.m27067(util.h.xy.s.g.f2353));
        }
        cVar.m27103(m27243.m27067(util.h.xy.s.ma.f2360));
        cVar.m27137(m27243.m27067(util.h.xy.s.ma.f2361));
        try {
            cVar.m27115(m27243.m27067(util.h.xy.s.ma.f2354));
        } catch (org.json.JSONException unused) {
            java.lang.String str2 = util.h.xy.s.ma.f2354;
        }
        cVar.m27111(m27243.m27065());
        if (bVar == util.h.xy.s.a.b.f2297) {
            util.h.xy.s.rc rcVar = (util.h.xy.s.rc) meVar;
            cVar.m27109(rcVar.m27315());
            cVar.m27082(meVar.m27241());
            cVar.m27088(rcVar.m27322());
            cVar.m27160(rcVar.m27302());
            cVar.m27159(rcVar.m27308());
            cVar.m27153(rcVar.m27319());
            cVar.m27075(rcVar.m27311());
            cVar.m27076(rcVar.m27307());
            cVar.m27167(rcVar.m27309());
            cVar.m27161(rcVar.m27332());
            cVar.m27183(rcVar.m27331());
            java.lang.String m27383 = reVar.m27383();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, objArr);
            if (m27383.equals(((java.lang.String) objArr[0]).intern())) {
                cVar.m27086(rcVar.m27330());
                cVar.m27084(rcVar.m27314());
                cVar.m27096(m27243.m27067(util.h.xy.s.md.f2381));
                cVar.m27105(rcVar.m27325());
            } else {
                cVar.m27098(util.h.xy.s.b.m27073(str));
                cVar.m27139(rcVar.m27306());
                cVar.m27155(rcVar.m27304());
                cVar.m27114(rcVar.m27333());
                cVar.m27158(rcVar.m27327());
            }
            cVar.m27118(m27243.m27067(util.h.xy.s.md.f2380));
        } else if (bVar == util.h.xy.s.a.b.f2298) {
            cVar.m27181(m27243.m27067(util.h.xy.s.g.f2316));
            cVar.m27078(m27243.m27067(util.h.xy.s.g.f2305));
            util.h.xy.s.mg mgVar = (util.h.xy.s.mg) meVar;
            cVar.m27084(mgVar.m27255());
            cVar.m27169(mgVar.m27267());
            cVar.m27156(mgVar.m27261());
            cVar.m27162(mgVar.m27263());
            cVar.m27173(reVar.m27370());
            cVar.m27180(mgVar.m27257());
            cVar.m27178(mgVar.m27269());
            cVar.m27120(mgVar.m27265());
            cVar.m27125(mgVar.m27251());
            cVar.m27080(mgVar.m27247());
            cVar.m27132(mgVar.m27249());
            cVar.m27164(mgVar.m27252());
            cVar.m27141(mgVar.m27259());
            cVar.m27082(meVar.m27241());
            cVar.m27135(reVar.m27382());
            try {
                cVar.m27117(m27243.m27067(util.h.xy.s.g.f2315));
            } catch (org.json.JSONException unused2) {
                java.lang.String str3 = util.h.xy.s.g.f2315;
            }
            try {
                cVar.m27077(m27243.m27067(util.h.xy.s.g.f2321));
            } catch (org.json.JSONException unused3) {
                java.lang.String str4 = util.h.xy.s.g.f2321;
            }
            try {
                cVar.m27127(m27243.m27067(util.h.xy.s.g.f2331));
            } catch (org.json.JSONException unused4) {
                java.lang.String str5 = util.h.xy.s.g.f2331;
            }
            cVar.m27121(reVar.m27366());
            try {
                cVar.m27136(m27243.m27067(util.h.xy.s.g.f2319));
            } catch (org.json.JSONException unused5) {
                java.lang.String str6 = util.h.xy.s.g.f2319;
            }
            try {
                cVar.m27143(m27243.m27067(util.h.xy.s.g.f2334));
            } catch (org.json.JSONException unused6) {
                java.lang.String str7 = util.h.xy.s.g.f2334;
            }
        } else if (bVar == util.h.xy.s.a.b.f2296) {
            int i = getHighSpeedVideoSizes + 5;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                util.h.xy.ar.b.m25074(m27243.m27067(util.h.xy.s.rh.f2414));
                cVar.m27128(m27243.m27067(util.h.xy.s.rh.f2414));
                cVar.m27176(meVar.m27237());
                cVar.m27149(((util.h.xy.s.mf) meVar).m27245());
                throw null;
            }
            util.h.xy.ar.b.m25074(m27243.m27067(util.h.xy.s.rh.f2414));
            cVar.m27128(m27243.m27067(util.h.xy.s.rh.f2414));
            cVar.m27176(meVar.m27237());
            cVar.m27149(((util.h.xy.s.mf) meVar).m27245());
        }
        cVar.m27090(m27243.m27067(util.h.xy.s.ma.f2376));
        cVar.m27094(m27243.m27067(util.h.xy.s.ma.f2365));
        cVar.m27146(m27243.m27067(util.h.xy.s.ma.f2372));
        cVar.m27144(m27243.m27067(util.h.xy.s.ma.f2368));
        cVar.m27130(m27243.m27067(util.h.xy.s.ma.f2366));
        util.h.xy.s.a m27242 = meVar.m27242();
        if (m27242 == null) {
            cVar.m27099((util.h.xy.s.ra) null);
        } else {
            cVar.m27099(m27294(m27242, m27243, bVar, b, reVar.m27383(), reVar.m27375()));
            getHighSpeedVideoSizes = (getInputFormats + 63) % 128;
        }
        util.h.xy.s.a[] m27226 = meVar.m27226();
        int length = m27226 != null ? m27226.length : 0;
        if (length > 0) {
            raVarArr = new util.h.xy.s.ra[m27226.length];
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                raVarArr[i2] = m27294(m27226[i2], m27243, bVar, b, reVar.m27383(), reVar.m27375());
                getInputFormats = (getHighSpeedVideoSizes + 53) % 128;
                length = i2;
            }
        } else {
            raVarArr = null;
        }
        cVar.m27101(raVarArr);
        cVar.m27116(meVar.m27236());
        if (bVar != util.h.xy.s.a.b.f2298) {
            int i3 = getInputFormats + 115;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                cVar.m27108(meVar.m27232());
                throw null;
            }
            cVar.m27108(meVar.m27232());
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0.length == 0) goto L8;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static util.h.xy.s.ra m27294(util.h.xy.s.a aVar, util.h.xy.s.a aVar2, util.h.xy.s.a.b bVar, byte b, java.lang.String str, boolean z) throws org.json.JSONException {
        util.h.xy.s.ra raVar = new util.h.xy.s.ra();
        raVar.m27275(aVar.m27067(util.h.xy.s.ma.f2360));
        raVar.m27277(aVar.m27067(util.h.xy.s.ma.f2361));
        if (bVar != util.h.xy.s.a.b.f2298) {
            byte[] m27067 = aVar.m27067(util.h.xy.s.ma.f2353);
            if (m27067 != null) {
                getInputFormats = (getHighSpeedVideoSizes + 103) % 128;
            }
            m27067 = aVar2.m27067(util.h.xy.s.ma.f2353);
            raVar.m27273(m27067);
        }
        if (bVar == util.h.xy.s.a.b.f2297) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("鑋䊈ꨧ\uebad", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, objArr);
            if (str.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                getInputFormats = (getHighSpeedVideoSizes + 61) % 128;
                raVar.m27270(aVar.m27067(util.h.xy.s.md.f2381));
            }
            raVar.m27283(aVar.m27067(util.h.xy.s.md.f2380));
        } else if (bVar == util.h.xy.s.a.b.f2296) {
            raVar.m27272(aVar.m27067(util.h.xy.s.rh.f2414));
            raVar.m27285(aVar.m27067(util.h.xy.s.rh.f2415));
        }
        if (bVar == util.h.xy.s.a.b.f2298 && z) {
            getHighSpeedVideoSizes = (getInputFormats + 5) % 128;
            raVar.m27279(aVar.m27067(util.h.xy.s.ma.f2354));
        }
        raVar.m27280(aVar.m27065());
        return raVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.s.re m27297(util.h.xy.s.re reVar, util.h.xy.s.me meVar, util.h.xy.s.c cVar, util.h.xy.s.a.b bVar, int i, java.lang.String str) throws org.json.JSONException {
        getInputFormats = (getHighSpeedVideoSizes + 95) % 128;
        reVar.m27378(util.h.xy.s.b.m27071(cVar, meVar));
        reVar.m27372(i);
        reVar.m27373(str);
        getInputFormats = (getHighSpeedVideoSizes + 119) % 128;
        return reVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.s.re m27290(util.h.xy.s.re reVar, util.h.xy.d.c cVar, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, util.h.xy.s.a.b bVar, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) throws org.json.JSONException {
        int i2 = getInputFormats + 117;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (reVar == null) {
            reVar = new util.h.xy.s.re(false, false, false);
            getHighSpeedVideoSizes = (getInputFormats + 117) % 128;
        }
        util.h.xy.s.e m27069 = util.h.xy.s.b.m27069(cVar.mo26151(str, util.h.xy.d.ma.f1143).getResult(), str2);
        util.h.xy.s.a aVar = new util.h.xy.s.a(bVar);
        reVar.m27377(m27069);
        reVar.m27372(i);
        reVar.m27373(str3);
        reVar.m27369(aVar);
        reVar.m27374(profileChannel);
        int i3 = getHighSpeedVideoSizes + 33;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return reVar;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static java.lang.String m27299(java.lang.String str) throws org.json.JSONException {
        java.lang.String optString = new org.json.JSONObject(str).optString(util.h.xy.s.g.f2324, "0");
        int i = getHighSpeedVideoSizes + 11;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return optString;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new char[]{41873, 41915, 41868, 41913, 41909, 41872, 41874, 41902, 41882, 41917, 41906, 41980, 41903, 41865, 41900, 41919, 41892, 41904, 41875, 41907, 41911, 41957, 41893, 41878, 41887, 41871, 41912, 41908, 41905, 41897, 41885, 41958, 41881, 41866, 41896, 41914};
        getOutputFormats = (char) 38464;
        getOutputStallDuration = (char) 33997;
        getInputSizeshNQ4ISI = (char) 3340;
        getHighResolutionOutputSizeshNQ4ISI = (char) 25695;
        getHighSpeedVideoFpsRangesFor = (char) 55302;
    }
}
