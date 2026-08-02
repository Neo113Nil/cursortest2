package util.h.xy.bo;

/* loaded from: classes18.dex */
public class a {
    private static final byte[][] getHighResolutionOutputSizeshNQ4ISI = {new byte[]{1}, new byte[]{2}, new byte[]{3}, new byte[]{4}};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 13) % 128;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25522(java.lang.String str, util.h.xy.d.md mdVar) {
        int i = Camera2StreamConfigurationMap + 9;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return getHighResolutionOutputSizeshNQ4ISI(str, mdVar);
        }
        getHighResolutionOutputSizeshNQ4ISI(str, mdVar);
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m25521(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap + 21;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            Camera2StreamConfigurationMap(bArr);
            throw null;
        }
        byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr);
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 45) % 128;
        return Camera2StreamConfigurationMap2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25519(byte[] bArr) {
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i = ~((currentTimeMillis ^ 1900391977) | (currentTimeMillis & 1900391977));
        int i2 = ((i ^ (-1200032385)) | (i & (-1200032385))) * 398;
        int i3 = ((i2 | (-842780687)) << 1) - (i2 ^ (-842780687));
        int i4 = (i3 ^ 1098950826) + ((1098950826 & i3) << 1);
        int i5 = (~((~currentTimeMillis) | 1900391977)) | 809542697;
        int i6 = -(-(((i5 ^ (-2009575082)) | (i5 & (-2009575082))) * 398));
        int i7 = (~((int) java.lang.System.currentTimeMillis())) | (-138719240);
        int i8 = ~i7;
        int i9 = (((i8 ^ 75694336) | (i8 & 75694336)) * (-828)) - 708037864;
        int i10 = i7 * (-828);
        if ((i4 & i6) + (i6 | i4) <= ((i9 & i10) + (i10 | i9)) - 1104587100) {
            return getHighSpeedVideoSizes(bArr);
        }
        getHighSpeedVideoSizes(bArr);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0196, code lost:
    
        if ((r6 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0117, code lost:
    
        if (r5.length() <= 32) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, util.h.xy.d.md mdVar) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        boolean z;
        org.json.JSONObject jSONObject;
        int i;
        int i2 = 0;
        try {
            jSONObject = new org.json.JSONObject(str);
            int i3 = Camera2StreamConfigurationMap;
            i = (i3 & 73) + (i3 | 73);
            getHighSpeedVideoFpsRanges = i % 128;
        } catch (org.json.JSONException unused) {
            bArr = null;
        }
        if (i % 2 == 0) {
            jSONObject.has(util.h.xy.al.ra.f286);
            throw new java.lang.ArithmeticException();
        }
        if (jSONObject.has(util.h.xy.al.ra.f286) && jSONObject.has(util.h.xy.al.ra.f306)) {
            int i4 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i4 & 51) + (i4 | 51)) % 128;
            if (jSONObject.has(util.h.xy.al.ra.f383)) {
                if (util.h.xy.ar.b.m25079(jSONObject.getString(util.h.xy.al.ra.f286))) {
                    int i5 = getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = ((i5 & 81) + (i5 | 81)) % 128;
                    if (util.h.xy.ar.b.m25079(jSONObject.getString(util.h.xy.al.ra.f306))) {
                        int i6 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = (((i6 | 47) << 1) - (i6 ^ 47)) % 128;
                        if (util.h.xy.ar.b.m25079(jSONObject.getString(util.h.xy.al.ra.f383))) {
                            java.lang.String string = jSONObject.getString(util.h.xy.al.ra.f286);
                            java.lang.String string2 = jSONObject.getString(util.h.xy.al.ra.f306);
                            java.lang.String string3 = jSONObject.getString(util.h.xy.al.ra.f383);
                            if (string.length() >= 10) {
                                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                int i7 = ~((currentTimeMillis ^ (-1731524264)) | (currentTimeMillis & (-1731524264)));
                                int i8 = (((i7 ^ 1561976519) | (1561976519 & i7)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 2131995405;
                                int i9 = ~currentTimeMillis;
                                int i10 = ~((i9 ^ (-1731524264)) | (i9 & (-1731524264)));
                                int i11 = -(-(((i10 ^ 1158731399) | (1158731399 & i10)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                int i12 = ((~((currentTimeMillis2 ^ 571931237) | (currentTimeMillis2 & 571931237))) | (-735583228)) * (-465);
                                int i13 = (((-756375413) | i12) << 1) - (i12 ^ (-756375413));
                                int i14 = ~((currentTimeMillis2 ^ (-735583228)) | (currentTimeMillis2 & (-735583228)));
                                int i15 = -(-(((i14 & 571931237) | (i14 ^ 571931237)) * 930));
                                int i16 = (i13 & i15) + (i15 | i13);
                                int i17 = currentTimeMillis2 | 571931237;
                                int i18 = ((i17 ^ (-735583228)) | (i17 & (-735583228))) * 465;
                                if ((i8 & i11) + (i11 | i8) > ((i16 | i18) << 1) - (i18 ^ i16)) {
                                    if (string.length() > 10) {
                                    }
                                    if (string2.length() == 12 && string3.length() == 4) {
                                        if (jSONObject.has(util.h.xy.al.ra.f333)) {
                                            int i19 = Camera2StreamConfigurationMap;
                                            int i20 = (i19 ^ 119) + ((i19 & 119) << 1);
                                            getHighSpeedVideoFpsRanges = i20 % 128;
                                            if (i20 % 2 == 0) {
                                                util.h.xy.ar.b.m25079(jSONObject.getString(util.h.xy.al.ra.f333));
                                                throw null;
                                            }
                                            if (util.h.xy.ar.b.m25079(jSONObject.getString(util.h.xy.al.ra.f333))) {
                                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 93) % 128;
                                                if (jSONObject.getString(util.h.xy.al.ra.f333).length() > 30) {
                                                }
                                            }
                                        }
                                        java.lang.String str2 = util.h.xy.al.ra.f396;
                                        java.lang.String str3 = util.h.xy.al.ra.f332;
                                        if (string2.equals(str2)) {
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 63) % 128;
                                            if (!string3.equals(str3)) {
                                                int i21 = getHighSpeedVideoFpsRanges;
                                                int i22 = (i21 ^ 1) + ((i21 & 1) << 1);
                                                Camera2StreamConfigurationMap = i22 % 128;
                                            }
                                        }
                                        org.json.JSONObject m25520 = m25520(jSONObject, mdVar);
                                        if (m25520 == null) {
                                            int i23 = getHighSpeedVideoFpsRanges;
                                            Camera2StreamConfigurationMap = ((i23 & 21) + (i23 | 21)) % 128;
                                        } else {
                                            jSONObject = m25520;
                                        }
                                        bArr = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.al.ra.f286));
                                        try {
                                            bArr2 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.al.ra.f306));
                                            try {
                                                bArr3 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.al.ra.f383));
                                                try {
                                                    if (jSONObject.has(util.h.xy.al.ra.f333)) {
                                                        bArr4 = util.h.xy.ar.b.m25076(jSONObject.getString(util.h.xy.al.ra.f333));
                                                        int i24 = getHighSpeedVideoFpsRanges;
                                                        Camera2StreamConfigurationMap = (((i24 | 33) << 1) - (i24 ^ 33)) % 128;
                                                    } else {
                                                        bArr4 = null;
                                                    }
                                                    int i25 = Camera2StreamConfigurationMap;
                                                    getHighSpeedVideoFpsRanges = ((i25 ^ 89) + ((i25 & 89) << 1)) % 128;
                                                    z = false;
                                                } catch (org.json.JSONException unused2) {
                                                    bArr4 = null;
                                                    z = true;
                                                    if (!z) {
                                                    }
                                                }
                                            } catch (org.json.JSONException unused3) {
                                                bArr3 = null;
                                            }
                                        } catch (org.json.JSONException unused4) {
                                            bArr2 = null;
                                            bArr3 = null;
                                            bArr4 = null;
                                            z = true;
                                            if (!z) {
                                            }
                                        }
                                    }
                                }
                                int i26 = Camera2StreamConfigurationMap;
                                int i27 = ((i26 | 39) << 1) - (i26 ^ 39);
                                getHighSpeedVideoFpsRanges = i27 % 128;
                                int i28 = i27 % 2;
                                if (!z) {
                                    return null;
                                }
                                byte[][] bArr5 = {bArr, bArr2, bArr3, bArr4};
                                byte[] m25024 = util.h.xy.al.rd.m25024(getHighResolutionOutputSizeshNQ4ISI, bArr5);
                                util.h.xy.ar.b.m25100(bArr, bArr2, bArr3, bArr4);
                                while (i2 < 4) {
                                    int i29 = getHighSpeedVideoFpsRanges;
                                    int i30 = (i29 ^ 115) + ((i29 & 115) << 1);
                                    Camera2StreamConfigurationMap = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        util.h.xy.ar.b.m25095(bArr5[i2]);
                                        i2 += 84;
                                    } else {
                                        util.h.xy.ar.b.m25095(bArr5[i2]);
                                        i2++;
                                    }
                                }
                                util.h.xy.ar.b.m25074(m25024);
                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 33) % 128;
                                return m25024;
                            }
                            int i31 = getHighSpeedVideoFpsRanges;
                            Camera2StreamConfigurationMap = ((i31 & 121) + (i31 | 121)) % 128;
                            bArr4 = null;
                            bArr = null;
                            bArr2 = null;
                            bArr3 = null;
                            z = true;
                            int i262 = Camera2StreamConfigurationMap;
                            int i272 = ((i262 | 39) << 1) - (i262 ^ 39);
                            getHighSpeedVideoFpsRanges = i272 % 128;
                            int i282 = i272 % 2;
                            if (!z) {
                            }
                        }
                    }
                }
                int i32 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i32 & 31) + (i32 | 31)) % 128;
                int i312 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i312 & 121) + (i312 | 121)) % 128;
                bArr4 = null;
                bArr = null;
                bArr2 = null;
                bArr3 = null;
                z = true;
                int i2622 = Camera2StreamConfigurationMap;
                int i2722 = ((i2622 | 39) << 1) - (i2622 ^ 39);
                getHighSpeedVideoFpsRanges = i2722 % 128;
                int i2822 = i2722 % 2;
                if (!z) {
                }
            }
        }
        int i33 = getHighSpeedVideoFpsRanges;
        int i34 = (i33 & 85) + (i33 | 85);
        Camera2StreamConfigurationMap = i34 % 128;
        if (i34 % 2 != 0) {
            throw null;
        }
        int i3122 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i3122 & 121) + (i3122 | 121)) % 128;
        bArr4 = null;
        bArr = null;
        bArr2 = null;
        bArr3 = null;
        z = true;
        int i26222 = Camera2StreamConfigurationMap;
        int i27222 = ((i26222 | 39) << 1) - (i26222 ^ 39);
        getHighSpeedVideoFpsRanges = i27222 % 128;
        int i28222 = i27222 % 2;
        if (!z) {
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static org.json.JSONObject m25520(org.json.JSONObject jSONObject, util.h.xy.d.md mdVar) throws org.json.JSONException {
        java.lang.String string;
        int i;
        java.lang.String tokenizedCardID;
        java.lang.String result;
        int i2 = getHighSpeedVideoFpsRanges + 73;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            string = jSONObject.getString(util.h.xy.al.ra.f286);
            i = 0;
        } else {
            string = jSONObject.getString(util.h.xy.al.ra.f286);
            i = 1;
        }
        int i3 = getHighSpeedVideoFpsRanges + 107;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 3;
        }
        java.lang.String str = "";
        while (i <= string.length()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(util.h.xy.al.ra.f393);
            str = sb.toString();
            i = (i ^ 1) + ((i & 1) << 1);
            int i5 = getHighSpeedVideoFpsRanges;
            int i6 = ((i5 | 95) << 1) - (i5 ^ 95);
            Camera2StreamConfigurationMap = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!string.equals(str)) {
            return null;
        }
        int i8 = Camera2StreamConfigurationMap;
        int i9 = ((i8 | 31) << 1) - (i8 ^ 31);
        getHighSpeedVideoFpsRanges = i9 % 128;
        try {
            if (i9 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (mdVar == null) {
                tokenizedCardID = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 23) % 128;
            } else {
                tokenizedCardID = mdVar.getTokenizedCardID();
            }
            if (tokenizedCardID != null && (result = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26151(tokenizedCardID, util.h.xy.d.ma.f1141).getResult()) != null) {
                int i10 = getHighSpeedVideoFpsRanges;
                int i11 = ((i10 | 61) << 1) - (i10 ^ 61);
                Camera2StreamConfigurationMap = i11 % 128;
                if (i11 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (!result.isEmpty()) {
                    java.lang.String string2 = new org.json.JSONObject(result).getJSONObject(util.h.xy.s.g.f2350).getString(util.h.xy.s.g.f2360);
                    jSONObject.remove(util.h.xy.al.ra.f286);
                    jSONObject.put(util.h.xy.al.ra.f286, string2);
                    return jSONObject;
                }
            }
            int i12 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = (((i12 | 31) << 1) - (i12 ^ 31)) % 128;
            return null;
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            return null;
        }
    }

    @util.h.xy.a.a
    private static byte[] Camera2StreamConfigurationMap(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] m27595;
        int i;
        int i2;
        int i3 = Camera2StreamConfigurationMap;
        int i4 = i3 + 21;
        getHighSpeedVideoFpsRanges = i4 % 128;
        byte[] bArr2 = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (bArr != null) {
            int i5 = i3 + 47;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                int length = bArr.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr.length > 0) {
                int i6 = ((i3 | 125) << 1) - (i3 ^ 125);
                getHighSpeedVideoFpsRanges = i6 % 128;
                if (i6 % 2 == 0) {
                    util.h.xy.q.b.m27056(bArr);
                    util.h.xy.bu.c.f1051.m25650();
                    throw new java.lang.ArithmeticException();
                }
                byte[] m27056 = util.h.xy.q.b.m27056(bArr);
                util.h.xy.d.md m25650 = util.h.xy.bu.c.f1051.m25650();
                if (m25650 == null) {
                    m27595 = util.h.xy.v.b.f2439.m27621(m27056);
                } else {
                    java.lang.String tokenizedCardID = m25650.getTokenizedCardID();
                    m27595 = util.h.xy.v.b.f2439.m27595(new byte[]{1, 3}, util.h.xy.f.b.f2201.m26757(tokenizedCardID, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR, false, util.h.xy.k.ra.f2243.m26940(tokenizedCardID).booleanValue()), m27056);
                    int i7 = getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = ((i7 & 119) + (i7 | 119)) % 128;
                }
                if (m27595 != null) {
                    int length2 = m27595.length;
                    int i8 = -(-(length2 * (-159)));
                    int i9 = ~((int) java.lang.System.currentTimeMillis());
                    int i10 = (((((i8 | 159) << 1) - (i8 ^ 159)) - (~(length2 * 160))) - 1) + (((~((~i9) | i9)) | (~((length2 ^ (-1)) | length2))) * (-160));
                    int i11 = ~((~length2) | i9);
                    int i12 = -(-((i11 | (i11 ^ (-1))) * 160));
                    bArr2 = new byte[(i10 & i12) + (i12 | i10)];
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 111) % 128;
                    int i13 = 0;
                    while (true) {
                        int length3 = m27595.length;
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i14 = -(-(length3 * (-301)));
                        int i15 = (i14 ^ (-303)) + ((i14 & (-303)) << 1);
                        int i16 = ~currentTimeMillis;
                        int i17 = ~((i16 ^ length3) | (i16 & length3));
                        int i18 = (length3 ^ (-1)) | length3;
                        int i19 = ~((i18 ^ currentTimeMillis) | (i18 & currentTimeMillis));
                        int i20 = ((i17 ^ i19) | (i17 & i19)) * (-302);
                        int i21 = ~((length3 & currentTimeMillis) | (length3 ^ currentTimeMillis));
                        int i22 = (((i15 ^ i20) + ((i20 & i15) << 1)) - (~(-(-(i21 * (-604)))))) - 1;
                        int i23 = i21 * 302;
                        if (i13 >= ((i22 | i23) << 1) - (i23 ^ i22)) {
                            break;
                        }
                        int i24 = Camera2StreamConfigurationMap;
                        int i25 = (i24 ^ 53) + ((i24 & 53) << 1);
                        getHighSpeedVideoFpsRanges = i25 % 128;
                        if (i25 % 2 == 0) {
                            bArr2[i13] = m27595[i13];
                            i2 = i13 & 7;
                            i = i13 | 7;
                        } else {
                            int i26 = i13 & 1;
                            bArr2[i13] = m27595[(i13 ^ 1) + (i26 << 1)];
                            i = i13 | 1;
                            i2 = i26;
                        }
                        i13 = i + i2;
                    }
                    util.h.xy.af.mb.m24551().m24555(util.h.xy.af.mb.m24551().m24553(m27595[0]));
                }
                util.h.xy.ar.b.m25095(m27056);
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 103) % 128;
            }
        }
        int i27 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i27 & 65) + (i27 | 65)) % 128;
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.bo.mb mbVar;
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i & 41) + (i | 41)) % 128;
        if (bArr != null && bArr.length != 0) {
            util.h.xy.ar.mb[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
            util.h.xy.ar.b.m25095(bArr);
            if (highSpeedVideoFpsRangesFor != null) {
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = ((i2 | 97) << 1) - (i2 ^ 97);
                int i4 = i3 % 128;
                Camera2StreamConfigurationMap = i4;
                if (i3 % 2 == 0 ? highSpeedVideoFpsRangesFor.length > 0 : highSpeedVideoFpsRangesFor.length > 0) {
                    int i5 = (i4 ^ 5) + ((i4 & 5) << 1);
                    int i6 = i5 % 128;
                    getHighSpeedVideoFpsRanges = i6;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    if (highSpeedVideoFpsRangesFor != null) {
                        int i7 = (i6 ^ 77) + ((i6 & 77) << 1);
                        Camera2StreamConfigurationMap = i7 % 128;
                        if (i7 % 2 != 0) {
                            int length = highSpeedVideoFpsRangesFor.length;
                            throw null;
                        }
                        if (highSpeedVideoFpsRangesFor.length != 0) {
                            mbVar = new util.h.xy.bo.mb();
                            int length2 = highSpeedVideoFpsRangesFor.length;
                            int i8 = getHighSpeedVideoFpsRanges;
                            Camera2StreamConfigurationMap = ((i8 & 11) + (i8 | 11)) % 128;
                            char c = 0;
                            int i9 = 0;
                            while (i9 < length2) {
                                util.h.xy.ar.mb mbVar2 = highSpeedVideoFpsRangesFor[i9];
                                byte m25109 = mbVar2.m25109();
                                byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
                                if (m25109 == bArr2[c]) {
                                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                                    int i10 = ~currentTimeMillis;
                                    int i11 = ((~(((-1462510734) ^ i10) | (i10 & (-1462510734)))) * (-560)) + 1284365930;
                                    int i12 = -(-((~((currentTimeMillis ^ (-35659913)) | (currentTimeMillis & (-35659913)))) * (-560)));
                                    int i13 = ~(i10 | 573809624);
                                    int i14 = -(-(((i13 ^ (-2000660446)) | (i13 & (-2000660446))) * 560));
                                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                                    int i15 = ~(((-1170846242) ^ currentTimeMillis2) | (currentTimeMillis2 & (-1170846242)));
                                    int i16 = ~currentTimeMillis2;
                                    int i17 = (i16 ^ (-1943982971)) | (i16 & (-1943982971));
                                    int i18 = 1065126155 - (~(-(-(((~((i17 ^ 1170846241) | (i17 & 1170846241))) | ((i15 & 67182593) | (i15 ^ 67182593))) * 886))));
                                    int i19 = ~((i16 ^ 1170846241) | (i16 & 1170846241));
                                    int i20 = ((i19 ^ (-1943982971)) | (i19 & (-1943982971))) * (-1772);
                                    int i21 = ((i18 | i20) << 1) - (i20 ^ i18);
                                    int i22 = (~i17) * 886;
                                    if ((((i11 ^ i12) + ((i12 & i11) << 1)) - (~i14)) - 1 > (i21 ^ i22) + ((i22 & i21) << 1)) {
                                        mbVar.m25527(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                        throw null;
                                    }
                                    mbVar.m25527(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[1]) {
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 5) % 128;
                                    mbVar.m25528(mbVar2.m25110());
                                } else if (mbVar2.m25109() == bArr2[2]) {
                                    int i23 = Camera2StreamConfigurationMap;
                                    getHighSpeedVideoFpsRanges = ((i23 ^ 63) + ((i23 & 63) << 1)) % 128;
                                    mbVar.m25531(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[3]) {
                                    int i24 = getHighSpeedVideoFpsRanges;
                                    Camera2StreamConfigurationMap = (((i24 | 125) << 1) - (i24 ^ 125)) % 128;
                                    mbVar.m25529(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 19) % 128;
                                } else if (mbVar2.m25109() == bArr2[4]) {
                                    int i25 = Camera2StreamConfigurationMap;
                                    getHighSpeedVideoFpsRanges = ((i25 ^ 83) + ((i25 & 83) << 1)) % 128;
                                    mbVar.m25533(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[5]) {
                                    mbVar.m25532(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[6]) {
                                    mbVar.m25524(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[7]) {
                                    mbVar.m25534(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else if (mbVar2.m25109() == bArr2[8]) {
                                    int i26 = Camera2StreamConfigurationMap;
                                    int i27 = (i26 ^ 121) + ((i26 & 121) << 1);
                                    getHighSpeedVideoFpsRanges = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        mbVar.m25525(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                        throw null;
                                    }
                                    mbVar.m25525(util.h.xy.ar.b.m25103(mbVar2.m25110()));
                                } else {
                                    continue;
                                }
                                i9 = ((i9 | 1) << 1) - (i9 ^ 1);
                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 125) % 128;
                                c = 0;
                            }
                            util.h.xy.al.rd.m25025(highSpeedVideoFpsRangesFor);
                            if (mbVar == null) {
                                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 21) % 128;
                                return mbVar;
                            }
                            int i28 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRanges = (i28 + 99) % 128;
                            getHighSpeedVideoFpsRanges = (((i28 | 91) << 1) - (i28 ^ 91)) % 128;
                        }
                    }
                    int i29 = ((i6 | 37) << 1) - (i6 ^ 37);
                    Camera2StreamConfigurationMap = i29 % 128;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    mbVar = null;
                    util.h.xy.al.rd.m25025(highSpeedVideoFpsRangesFor);
                    if (mbVar == null) {
                    }
                }
            }
            return null;
        }
        Camera2StreamConfigurationMap = (i + 101) % 128;
        return null;
    }

    private static util.h.xy.ar.mb[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        if (bArr != null) {
            int i = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i ^ 93) + ((i & 93) << 1)) % 128;
            if (bArr.length != 0) {
                byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
                util.h.xy.ar.mb[] mbVarArr = new util.h.xy.ar.mb[bArr2.length];
                int length = bArr2.length;
                Camera2StreamConfigurationMap = (((i | 111) << 1) - (i ^ 111)) % 128;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = getHighSpeedVideoFpsRanges;
                    Camera2StreamConfigurationMap = (((i4 | 119) << 1) - (i4 ^ 119)) % 128;
                    try {
                        util.h.xy.ar.mb m25057 = util.h.xy.ar.a.m25057(bArr, bArr2[i2]);
                        if (m25057 != null) {
                            mbVarArr[i3] = m25057;
                            i3++;
                        }
                        int i5 = Camera2StreamConfigurationMap;
                        int i6 = (i5 ^ 37) + ((i5 & 37) << 1);
                        getHighSpeedVideoFpsRanges = i6 % 128;
                        if (i6 % 2 == 0) {
                            i2 += 52;
                        } else {
                            int i7 = (i2 ^ (-40)) + ((i2 & (-40)) << 1);
                            i2 = (i7 & 41) + (i7 | 41);
                        }
                    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                        e.getMessage();
                        return null;
                    }
                }
                util.h.xy.ar.mb[] mbVarArr2 = new util.h.xy.ar.mb[i3];
                java.lang.System.arraycopy(mbVarArr, 0, mbVarArr2, 0, i3);
                return mbVarArr2;
            }
        }
        return null;
    }
}
