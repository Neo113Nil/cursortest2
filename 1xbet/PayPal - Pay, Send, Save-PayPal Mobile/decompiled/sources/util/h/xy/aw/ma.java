package util.h.xy.aw;

/* loaded from: classes5.dex */
public final class ma {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static long getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;

    static {
        getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes = util.h.xy.aw.ma.class.getName();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
    }

    private ma() {
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e6  */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte m25243() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte b;
        int i;
        int i2;
        int i3;
        if (Camera2StreamConfigurationMap()) {
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = (i4 & 49) + (i4 | 49);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            b = util.h.xy.ar.b.m25091((byte) 0, i5 % 2 == 0 ? 64 : 7);
        } else {
            b = 0;
        }
        byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        byte[] bArr = new byte[131];
        int i6 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i6 & 15) + (i6 | 15)) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\udff1鉵\udf9b挨䭺ᛑꥴ씄ᬯ\u242a\u0e79巃噤\ue91b악飤酘퉗顯\ue7e5챒雼弾∕ܓ寸ሲ椄䈾᳄", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[3];
            byte[] m27613 = util.h.xy.v.b.f2439.m27613(bArr);
            if (util.h.xy.af.mb.m24551().m24553(m27613[0]) == -91) {
                byte[] bArr4 = new byte[131];
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 31) % 128;
                for (int i7 = 0; i7 < 131; i7++) {
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i8 = ~i7;
                    int i9 = (i8 ^ (-2)) | (i8 & (-2));
                    int i10 = ~((i9 ^ currentTimeMillis) | (i9 & currentTimeMillis));
                    int i11 = ~currentTimeMillis;
                    int i12 = (i11 ^ 1) | (i11 & 1);
                    int i13 = ~((i12 ^ i7) | (i12 & i7));
                    int i14 = ~((currentTimeMillis ^ (-2)) | (currentTimeMillis & (-2)));
                    bArr4[i7] = m27613[((((((-318) - (~(-(-(i7 * 319))))) - (~(((i10 ^ i13) | (i13 & i10)) * (-318)))) - 1) + (((~(i8 | 1)) | (~(currentTimeMillis | 1))) * (-318))) - (~(-(-(((i14 ^ i8) | (i14 & i8)) * 318))))) - 1];
                }
                int i15 = 0;
                while (i15 < 131) {
                    int i16 = getHighResolutionOutputSizeshNQ4ISI + 97;
                    getHighSpeedVideoFpsRanges = i16 % 128;
                    if (i16 % 2 != 0) {
                        byte b2 = bArr4[i15];
                        byte b3 = m25017[i15];
                        byte b4 = (byte) ((~(b2 & b3)) & (b2 | b3));
                        bArr4[i15] = b4;
                        byte b5 = bArr[i15];
                        bArr4[i15] = (byte) ((b4 & (~b5)) | ((~b4) & b5));
                        i15 = (i15 | 21) + (i15 & 21);
                    } else {
                        byte b6 = bArr4[i15];
                        byte b7 = m25017[i15];
                        byte b8 = (byte) ((b6 & (~b7)) | ((~b6) & b7));
                        bArr4[i15] = b8;
                        byte b9 = bArr[i15];
                        bArr4[i15] = (byte) ((b8 & (~b9)) | ((~b8) & b9));
                        int i17 = (i15 & (-38)) + (i15 | (-38));
                        i15 = (i17 ^ 39) + ((i17 & 39) << 1);
                    }
                }
                for (int i18 = 0; i18 < 128; i18 = (i18 & 1) + (i18 | 1)) {
                    bArr2[i18] = bArr4[i18];
                }
                for (int i19 = 0; i19 < 3; i19++) {
                    int i20 = getHighSpeedVideoFpsRanges;
                    getHighResolutionOutputSizeshNQ4ISI = ((i20 ^ 71) + ((i20 & 71) << 1)) % 128;
                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                    int i21 = 78719 - (~(-(-(i19 * (-613)))));
                    int i22 = ~((i19 ^ (-129)) | (i19 & (-129)));
                    int i23 = (currentTimeMillis2 ^ i22) | (currentTimeMillis2 & i22);
                    int i24 = ~i19;
                    int i25 = ~((i24 & 128) | (i24 ^ 128));
                    int i26 = ((i23 ^ i25) | (i23 & i25)) * 614;
                    int i27 = (i21 ^ i26) + ((i21 & i26) << 1);
                    int i28 = ~currentTimeMillis2;
                    int i29 = ~((i28 ^ (-129)) | (i28 & (-129)));
                    int i30 = (i22 ^ i29) | (i22 & i29);
                    int i31 = ~(i28 | i19);
                    int i32 = ((i30 ^ i31) | (i31 & i30)) * (-1228);
                    int i33 = (i27 ^ i32) + ((i32 & i27) << 1);
                    int i34 = (i24 & (-129)) | (i24 ^ (-129));
                    int i35 = ~((i34 ^ i28) | (i34 & i28));
                    int i36 = (i28 & 128) | (i28 ^ 128);
                    int i37 = ~((i36 ^ i19) | (i36 & i19));
                    int i38 = ((i37 ^ i35) | (i35 & i37)) * 614;
                    bArr3[i19] = bArr4[(i33 & i38) + (i38 | i33)];
                }
                int i39 = getHighResolutionOutputSizeshNQ4ISI;
                int i40 = (i39 & 33) + (i39 | 33);
                i = 128;
                getHighSpeedVideoFpsRanges = i40 % 128;
            } else {
                i = 128;
                b = util.h.xy.ar.b.m25091(b, 6);
            }
            int i41 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i41 & 89) + (i41 | 89)) % i;
            boolean z = false;
            byte b10 = bArr3[0];
            if (b10 != 0 || bArr3[1] != 0 || bArr3[2] != 0) {
                int i42 = ((i41 | 115) << 1) - (i41 ^ 115);
                int i43 = i42 % 128;
                getHighSpeedVideoFpsRanges = i43;
                if (i42 % 2 == 0 && b10 >= 0) {
                    int i44 = (i43 + 95) % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i44;
                    byte b11 = bArr3[1];
                    if (b11 >= 0) {
                        int i45 = (i44 + 113) % 128;
                        getHighSpeedVideoFpsRanges = i45;
                        byte b12 = bArr3[2];
                        if (b12 >= 0 && b10 != b11 && b11 != b12) {
                            int i46 = ((i45 | 63) << 1) - (i45 ^ 63);
                            getHighResolutionOutputSizeshNQ4ISI = i46 % 128;
                            if (i46 % 2 != 0 ? b10 != b12 : b10 != bArr3[4]) {
                                byte b13 = bArr2[b10];
                                byte b14 = bArr2[b11];
                                byte b15 = bArr2[b12];
                                if (b13 < b14) {
                                    int i47 = (i45 & 57) + (i45 | 57);
                                    getHighResolutionOutputSizeshNQ4ISI = i47 % 128;
                                    if (i47 % 2 == 0) {
                                        throw null;
                                    }
                                    if (b13 >= 0 && b13 <= 100 && b14 >= 0 && b14 <= 100) {
                                        int i48 = i45 + 115;
                                        getHighResolutionOutputSizeshNQ4ISI = i48 % 128;
                                        if (i48 % 2 == 0) {
                                            throw null;
                                        }
                                        if (b15 >= 0 && b15 <= 100) {
                                            int i49 = ((i45 & 65) + (i45 | 65)) % 128;
                                            getHighResolutionOutputSizeshNQ4ISI = i49;
                                            if (b15 < b13) {
                                                getHighSpeedVideoFpsRanges = (((i49 | 91) << 1) - (i49 ^ 91)) % 128;
                                                b = util.h.xy.ar.b.m25091(b, 6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int i50 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (i50 + 75) % 128;
            getHighResolutionOutputSizeshNQ4ISI = (i50 + 29) % 128;
            int i51 = ((i50 | 107) << 1) - (i50 ^ 107);
            getHighResolutionOutputSizeshNQ4ISI = i51 % 128;
            if (i51 % 2 == 0) {
                ((android.net.ConnectivityManager) getHighSpeedVideoSizes().getSystemService(util.h.xy.al.ra.f530)).getActiveNetworkInfo();
                throw null;
            }
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) getHighSpeedVideoSizes().getSystemService(util.h.xy.al.ra.f530)).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 9) % 128;
                if (activeNetworkInfo.isConnected()) {
                    int i52 = getHighResolutionOutputSizeshNQ4ISI;
                    int i53 = (i52 & 35) + (i52 | 35);
                    getHighSpeedVideoFpsRanges = i53 % 128;
                    i2 = 2;
                    if (i53 % 2 == 0) {
                        z = true;
                    }
                    i3 = getHighResolutionOutputSizeshNQ4ISI + 1;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % i2 == 0) {
                        throw null;
                    }
                    if (!z) {
                        b = util.h.xy.ar.b.m25091(b, 3);
                    }
                    if (!m25245()) {
                        return b;
                    }
                    int i54 = getHighResolutionOutputSizeshNQ4ISI + 125;
                    getHighSpeedVideoFpsRanges = i54 % 128;
                    return i54 % 2 != 0 ? util.h.xy.ar.b.m25091(b, 5) : util.h.xy.ar.b.m25091(b, 2);
                }
            }
            i2 = 2;
            i3 = getHighResolutionOutputSizeshNQ4ISI + 1;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % i2 == 0) {
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        if (((java.lang.Boolean) r1.getMethod((java.lang.String) r3[0], null).invoke(null, null)).booleanValue() != false) goto L11;
     */
    @util.h.xy.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 73) + (i | 73)) % 128;
        int i2 = (i & 47) + (i | 47);
        getHighSpeedVideoFpsRanges = i2 % 128;
        boolean z = true;
        try {
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ㇽͳ㆜\uf221䒥\u0ee7ꚹ\udd21\uf562딶Ƶ䖫롲砜쫏胱罈䌝鞄ￂ", android.graphics.Color.blue(0), objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ue4c2\ua7eb\ue4ab嚤霌뢸田歩⁐ᆲ툿\uf3aa浇\udc85ᤫ㚒ꩼ\ue789䐝䦎\uf776ꍲ荬", (-1) % android.text.TextUtils.lastIndexOf("", 'p'), objArr2);
                if (!((java.lang.Boolean) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).booleanValue()) {
                    z = false;
                }
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
                return z;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ㇽͳ㆜\uf221䒥\u0ee7ꚹ\udd21\uf562딶Ƶ䖫롲砜쫏胱罈䌝鞄ￂ", android.graphics.Color.blue(0), objArr3);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ue4c2\ua7eb\ue4ab嚤霌뢸田歩⁐ᆲ툿\uf3aa浇\udc85ᤫ㚒ꩼ\ue789䐝䦎\uf776ꍲ荬", (-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)) - 1, objArr4);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if ((r3 % 2) == 0) goto L13;
     */
    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m25245() {
        boolean z = false;
        try {
            util.h.xy.c.b bVar = (util.h.xy.c.b) new util.h.xy.c.ra().m25833(getHighSpeedVideoSizes(), 1048704);
            if (bVar.f1081 != 128) {
                if (bVar.f1081 == 64) {
                    getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                    z = true;
                }
            } else {
                int i = getHighSpeedVideoFpsRanges;
                int i2 = (i & 71) + (i | 71);
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            }
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = (i3 ^ 1) + ((i3 & 1) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            int i5 = i4 % 2;
        } catch (util.h.xy.c.ma e) {
            e.m25832();
        }
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
        return z;
    }

    private static android.content.Context getHighSpeedVideoSizes() {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 55) + (i | 55);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return m24558;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0274  */
    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m25244() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte b;
        byte b2;
        int i;
        int i2;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        byte[] bArr = new byte[131];
        int i3 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i3 ^ 83) + ((i3 & 83) << 1)) % 128;
        try {
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i4 = ~currentTimeMillis;
            int i5 = ~indexOf;
            int i6 = ~((i5 & (-2)) | (i5 ^ (-2)));
            int i7 = ((indexOf * (-661)) - 661) + (((i4 ^ i6) | (i4 & i6)) * 1324);
            int i8 = ((~(currentTimeMillis | indexOf)) | (~((currentTimeMillis & 1) | (currentTimeMillis ^ 1)))) * (-1324);
            int i9 = (i7 & i8) + (i8 | i7);
            int i10 = ~((i5 & 1) | (i5 ^ 1));
            int i11 = ~((indexOf ^ (-2)) | (indexOf & (-2)));
            int i12 = ((i11 ^ i10) | (i11 & i10)) * 662;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\udff1鉵\udf9b挨䭺ᛑꥴ씄ᬯ\u242a\u0e79巃噤\ue91b악飤酘퉗顯\ue7e5챒雼弾∕ܓ寸ሲ椄䈾᳄", (i9 & i12) + (i12 | i9), objArr);
            ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr);
            byte[] bArr2 = new byte[128];
            byte[] bArr3 = new byte[3];
            byte[] m27613 = util.h.xy.v.b.f2439.m27613(bArr);
            if (util.h.xy.af.mb.m24551().m24553(m27613[0]) == -91) {
                byte[] bArr4 = new byte[131];
                int i13 = getHighSpeedVideoFpsRanges;
                getHighResolutionOutputSizeshNQ4ISI = (((i13 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i13 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                for (int i14 = 0; i14 < 131; i14++) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 97) % 128;
                    int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                    int i15 = (i14 * (-493)) + 495;
                    int i16 = ~i14;
                    int i17 = ((i16 ^ 1) | (i16 & 1)) * (-988);
                    int i18 = (i14 ^ (-2)) | (i14 & (-2));
                    int i19 = ~currentTimeMillis2;
                    int i20 = ~(i16 | (-2));
                    int i21 = ~((i19 & i14) | (i19 ^ i14));
                    int i22 = (i20 & i21) | (i21 ^ i20);
                    int i23 = ~((i14 ^ 1) | (i14 & 1));
                    bArr4[i14] = m27613[((((i15 ^ i17) + ((i17 & i15) << 1)) + (((i18 ^ i19) | (i19 & i18)) * 494)) - (~(((i22 ^ i23) | (i22 & i23)) * 494))) - 1];
                }
                int i24 = 0;
                while (i24 < 131) {
                    byte b3 = bArr4[i24];
                    byte b4 = m25017[i24];
                    byte b5 = (byte) ((~(b3 & b4)) & (b3 | b4));
                    bArr4[i24] = b5;
                    bArr4[i24] = (byte) (b5 ^ bArr[i24]);
                    int i25 = (i24 ^ (-49)) + ((i24 & (-49)) << 1);
                    i24 = (i25 & 50) + (i25 | 50);
                }
                int i26 = 0;
                while (i26 < 128) {
                    int i27 = getHighSpeedVideoFpsRanges;
                    int i28 = (i27 ^ 113) + ((i27 & 113) << 1);
                    getHighResolutionOutputSizeshNQ4ISI = i28 % 128;
                    if (i28 % 2 == 0) {
                        bArr2[i26] = bArr4[i26];
                        i26 += 112;
                    } else {
                        bArr2[i26] = bArr4[i26];
                        int i29 = (i26 & (-51)) + (i26 | (-51));
                        i26 = (i29 & 52) + (i29 | 52);
                    }
                }
                int i30 = 0;
                while (i30 < 3) {
                    int i31 = getHighResolutionOutputSizeshNQ4ISI;
                    int i32 = (i31 & 25) + (i31 | 25);
                    getHighSpeedVideoFpsRanges = i32 % 128;
                    if (i32 % 2 != 0) {
                        bArr3[i30] = bArr4[i30 * 23202];
                        int i33 = (i30 & 167) + (i30 | 167);
                        i30 = (i33 ^ (-67)) + ((i33 & (-67)) << 1);
                    } else {
                        bArr3[i30] = bArr4[(i30 ^ 128) + ((i30 & 128) << 1)];
                        i30++;
                    }
                }
                b = 0;
            } else {
                b = 1;
            }
            int i34 = getHighResolutionOutputSizeshNQ4ISI;
            int i35 = ((i34 | 13) << 1) - (i34 ^ 13);
            getHighSpeedVideoFpsRanges = i35 % 128;
            if (i35 % 2 == 0 && bArr3[0] == 0) {
                int i36 = i34 + 27;
                getHighSpeedVideoFpsRanges = i36 % 128;
                if (i36 % 2 == 0 ? bArr3[1] == 0 : bArr3[1] == 0) {
                    if (bArr3[2] == 0) {
                        getHighSpeedVideoFpsRanges = (i34 + 23) % 128;
                        if (util.h.xy.v.b.f2439.m27626(new byte[]{0})[0] == 1) {
                            int i37 = getHighResolutionOutputSizeshNQ4ISI;
                            getHighSpeedVideoFpsRanges = (((i37 | 73) << 1) - (i37 ^ 73)) % 128;
                            b = (byte) (b | 2);
                        }
                        if (Camera2StreamConfigurationMap()) {
                            b2 = 0;
                        } else {
                            int i38 = getHighSpeedVideoFpsRanges;
                            int i39 = ((i38 | 51) << 1) - (i38 ^ 51);
                            int i40 = i39 % 128;
                            getHighResolutionOutputSizeshNQ4ISI = i40;
                            b2 = i39 % 2 == 0 ? (byte) 4 : (byte) 2;
                            getHighSpeedVideoFpsRanges = ((i40 & 43) + (i40 | 43)) % 128;
                        }
                        if (m25245()) {
                            int i41 = getHighSpeedVideoFpsRanges;
                            int i42 = (i41 & 55) + (i41 | 55);
                            getHighResolutionOutputSizeshNQ4ISI = i42 % 128;
                            if (i42 % 2 == 0) {
                                i = b2 ^ 5;
                                i2 = b2 & 5;
                            } else {
                                i = b2 ^ 4;
                                i2 = b2 & 4;
                            }
                            b2 = (byte) (i | i2);
                        }
                        return util.h.xy.al.rb.m25016(new byte[]{b, b2});
                    }
                }
            }
            int i43 = getHighSpeedVideoFpsRanges;
            int i44 = ((i43 & 65) + (i43 | 65)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i44;
            int i45 = (i44 + 121) % 128;
            getHighSpeedVideoFpsRanges = i45;
            byte b6 = bArr3[0];
            if (b6 >= 0) {
                int i46 = i45 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getHighResolutionOutputSizeshNQ4ISI = i46 % 128;
                if (i46 % 2 != 0 ? bArr3[1] >= 0 : b6 >= 0) {
                    int i47 = ((i45 & 21) + (i45 | 21)) % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i47;
                    byte b7 = bArr3[2];
                    if (b7 >= 0) {
                        getHighSpeedVideoFpsRanges = ((i47 & 105) + (i47 | 105)) % 128;
                        byte b8 = bArr3[1];
                        if (b6 != b8) {
                            int i48 = (i47 & 59) + (i47 | 59);
                            int i49 = i48 % 128;
                            getHighSpeedVideoFpsRanges = i49;
                            if (i48 % 2 == 0 ? b8 != b7 : b6 != bArr3[5]) {
                                if (b6 != b7) {
                                    byte b9 = bArr2[b6];
                                    byte b10 = bArr2[b8];
                                    byte b11 = bArr2[b7];
                                    if (b9 < b10) {
                                        getHighResolutionOutputSizeshNQ4ISI = (i49 + 31) % 128;
                                        if (b9 >= 0 && b9 <= 100 && b10 >= 0) {
                                            int i50 = (i49 ^ 7) + ((i49 & 7) << 1);
                                            getHighResolutionOutputSizeshNQ4ISI = i50 % 128;
                                            if (i50 % 2 != 0 ? b10 <= 100 : b10 <= 119) {
                                                if (b11 >= 0 && b11 <= 100 && b11 < b9) {
                                                    b = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (util.h.xy.v.b.f2439.m27626(new byte[]{0})[0] == 1) {
            }
            if (Camera2StreamConfigurationMap()) {
            }
            if (m25245()) {
            }
            return util.h.xy.al.rb.m25016(new byte[]{b, b2});
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRangesFor = -4724165344727135980L;
    }
}
