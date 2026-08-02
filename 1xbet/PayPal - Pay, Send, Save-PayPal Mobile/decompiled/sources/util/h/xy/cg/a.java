package util.h.xy.cg;

/* loaded from: classes5.dex */
public class a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static long getHighSpeedVideoSizes;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges = util.h.xy.cg.a.class.getName();
        int i = Camera2StreamConfigurationMap + 19;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25906() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 95) + ((i & 95) << 1)) % 128;
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) util.h.xy.ag.a.m24556().m24558().getSystemService(util.h.xy.al.ra.f530)).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 113;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                activeNetworkInfo.isConnected();
                throw null;
            }
            if (activeNetworkInfo.isConnected()) {
                int i3 = Camera2StreamConfigurationMap;
                int i4 = ((i3 | 57) << 1) - (i3 ^ 57);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
        }
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError m25917 = util.h.xy.cg.ra.m25917();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 75) % 128;
        return m25917;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m25905(long j) {
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 35) % 128;
        try {
            java.lang.Thread.sleep(j);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i & 51) + (i | 51)) % 128;
        } catch (java.lang.InterruptedException unused) {
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 33) + (i2 | 33);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25904() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte b;
        byte b2;
        byte b3;
        java.lang.String str = util.h.xy.al.ra.f418;
        byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        byte[] bArr = new byte[131];
        try {
            int mode = android.view.View.MeasureSpec.getMode(0);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i = mode * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
            int i2 = ~mode;
            int i3 = ~((i2 ^ (-2)) | (i2 & (-2)));
            int i4 = ~currentTimeMillis;
            int i5 = ~((i4 ^ (-2)) | (i4 & (-2)));
            int i6 = (i3 ^ i5) | (i3 & i5);
            int i7 = (mode ^ 1) | (mode & 1);
            int i8 = ~((currentTimeMillis ^ i7) | (currentTimeMillis & i7));
            int i9 = (((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) << 1)) - (~(((i6 ^ i8) | (i6 & i8)) * (-252)))) - 1;
            int i10 = i7 * (-252);
            int i11 = i4 | (-2);
            int i12 = ~((mode ^ i11) | (mode & i11));
            int i13 = (((i9 & i10) + (i9 | i10)) - (~(((i12 ^ i8) | (i12 & i8)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))) - 1;
            char[] charArray = "\ud920䁧\ud94a昕낪ﳺ䌪䅂﹋ㅲ咽㮔\ue9cdᚾ챽鏗ᆽ꺾ꗳਊ롳응ᶎ\ue27e\u200e徉\uf566媣䢇\uf7d1".toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i13);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)) ^ (m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]));
                aVar.f2623++;
                bArr = bArr;
            }
            byte[] bArr2 = bArr;
            java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
            java.lang.String str3 = str2;
            ((java.security.SecureRandom) java.lang.Class.forName(str2).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
            byte[] bArr3 = new byte[128];
            byte[] bArr4 = new byte[3];
            byte[] m27613 = util.h.xy.v.b.f2439.m27613(bArr2);
            if (util.h.xy.af.mb.m24551().m24553(m27613[0]) != -91) {
                return util.h.xy.al.ra.f458;
            }
            byte[] bArr5 = new byte[131];
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 95) % 128;
            int i14 = 0;
            for (int i15 = 131; i14 < i15; i15 = 131) {
                int i16 = getHighResolutionOutputSizeshNQ4ISI;
                int i17 = (i16 & 3) + (i16 | 3);
                Camera2StreamConfigurationMap = i17 % 128;
                if (i17 % 2 == 0) {
                    bArr5[i14] = m27613[0];
                    i14 = (i14 | 104) + (i14 & 104);
                } else {
                    bArr5[i14] = m27613[i14 + 1];
                    i14 = (((i14 | 98) << 1) - (i14 ^ 98)) - 97;
                }
            }
            int i18 = 0;
            while (i18 < 131) {
                int i19 = Camera2StreamConfigurationMap + 49;
                getHighResolutionOutputSizeshNQ4ISI = i19 % 128;
                if (i19 % 2 != 0) {
                    byte b4 = bArr5[i18];
                    byte b5 = m25017[i18];
                    byte b6 = (byte) ((b4 | b5) & (~(b4 & b5)));
                    bArr5[i18] = b6;
                    byte b7 = bArr2[i18];
                    bArr5[i18] = (byte) ((b6 | b7) & (~(b6 & b7)));
                    int i20 = ((i18 | 23) << 1) - (i18 ^ 23);
                    i18 = (i20 & 29) + (i20 | 29);
                } else {
                    byte b8 = (byte) (bArr5[i18] ^ m25017[i18]);
                    bArr5[i18] = b8;
                    byte b9 = bArr2[i18];
                    bArr5[i18] = (byte) (((~b8) & b9) | (b8 & (~b9)));
                    int i21 = i18 + 90;
                    i18 = ((i21 | (-89)) << 1) - (i21 ^ (-89));
                }
            }
            int i22 = 0;
            while (i22 < 128) {
                bArr3[i22] = bArr5[i22];
                i22++;
                int i23 = Camera2StreamConfigurationMap;
                getHighResolutionOutputSizeshNQ4ISI = ((i23 ^ 15) + ((i23 & 15) << 1)) % 128;
            }
            for (int i24 = 0; i24 < 3; i24++) {
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i25 = -(-(i24 * 984));
                int i26 = ~i24;
                int i27 = ~currentTimeMillis2;
                int i28 = ~((i27 & (-129)) | (i27 ^ (-129)));
                int i29 = ~(i24 | (-129));
                bArr4[i24] = bArr5[((((((i25 | (-251520)) << 1) - (i25 ^ (-251520))) + (((i26 & 128) | (i26 ^ 128)) * 983)) + (((~((i26 & i27) | (i27 ^ i26))) | (-129)) * (-983))) - (~(((i28 & i29) | (i28 ^ i29)) * 983))) - 1];
            }
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i30 = ((~((currentTimeMillis3 ^ 2128855556) | (currentTimeMillis3 & 2128855556))) | (-2130178622)) * 992;
            int i31 = ((1498367441 | i30) << 1) - (i30 ^ 1498367441);
            int i32 = (~(2128855556 | currentTimeMillis3)) | (-2130178622);
            int i33 = ~currentTimeMillis3;
            int i34 = (i33 ^ (-2128855557)) | ((-2128855557) & i33);
            int i35 = ~((i34 ^ (-1813393978)) | (i34 & (-1813393978)));
            int i36 = ((i32 ^ i35) | (i32 & i35)) * (-496);
            int i37 = (i31 & i36) + (i36 | i31);
            int i38 = -(-(((currentTimeMillis3 ^ (-1813393978)) | (currentTimeMillis3 & (-1813393978))) * 496));
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i39 = ~currentTimeMillis4;
            int i40 = ~((i39 ^ 688012413) | (i39 & 688012413));
            int i41 = ~(((-1277018525) ^ currentTimeMillis4) | ((-1277018525) & currentTimeMillis4));
            int i42 = 1212909243 - (~(-(-(((i40 ^ i41) | (i40 & i41)) * 1150))));
            int i43 = ~((1277018524 & i39) | (i39 ^ 1277018524));
            int i44 = ((i43 & i41) | (i43 ^ i41)) * (-575);
            int i45 = (i42 & i44) + (i44 | i42);
            int i46 = ~((currentTimeMillis4 & 688012413) | (currentTimeMillis4 ^ 688012413));
            int i47 = ~((i39 ^ (-688012414)) | ((-688012414) & i39));
            int i48 = ((i46 ^ i47) | (i47 & i46)) * 575;
            if ((i37 ^ i38) + ((i38 & i37) << 1) <= (i45 ^ i48) + ((i48 & i45) << 1) ? bArr4[0] == 0 : bArr4[1] == 0) {
                if (bArr4[1] == 0) {
                    int i49 = getHighResolutionOutputSizeshNQ4ISI;
                    Camera2StreamConfigurationMap = ((i49 ^ 29) + ((i49 & 29) << 1)) % 128;
                    if (bArr4[2] == 0) {
                        return str;
                    }
                }
            }
            int i50 = getHighResolutionOutputSizeshNQ4ISI;
            int i51 = (i50 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i50 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            Camera2StreamConfigurationMap = i51 % 128;
            if (i51 % 2 != 0 && (b = bArr4[0]) >= 0 && (b2 = bArr4[1]) >= 0 && (b3 = bArr4[2]) >= 0) {
                int i52 = (i50 + 119) % 128;
                Camera2StreamConfigurationMap = i52;
                if (b != b2 && b2 != b3) {
                    int i53 = i52 + 5;
                    int i54 = i53 % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i54;
                    if (i53 % 2 == 0 ? b != b3 : b2 != bArr4[3]) {
                        byte b10 = bArr3[b];
                        byte b11 = bArr3[b2];
                        byte b12 = bArr3[b3];
                        if (b10 < b11) {
                            Camera2StreamConfigurationMap = ((i54 & 35) + (i54 | 35)) % 128;
                            if (b10 >= 0 && b10 <= 100 && b11 >= 0 && b11 <= 100) {
                                int i55 = ((i54 & 93) + (i54 | 93)) % 128;
                                Camera2StreamConfigurationMap = i55;
                                if (b12 >= 0) {
                                    int i56 = ((i55 & 95) + (i55 | 95)) % 128;
                                    getHighResolutionOutputSizeshNQ4ISI = i56;
                                    if (b12 <= 100) {
                                        int i57 = i56 + 91;
                                        Camera2StreamConfigurationMap = i57 % 128;
                                        if (i57 % 2 == 0) {
                                            throw null;
                                        }
                                        if (b12 >= b10) {
                                            return str;
                                        }
                                        java.lang.String str4 = util.h.xy.al.ra.f458;
                                        int i58 = Camera2StreamConfigurationMap;
                                        getHighResolutionOutputSizeshNQ4ISI = ((i58 & 59) + (i58 | 59)) % 128;
                                        return str4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return str;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m25903(byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 87;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            throw null;
        }
        boolean z = false;
        if (bArr == null) {
            return false;
        }
        int length = bArr.length;
        if (length >= 4) {
            int i3 = (i2 ^ 75) + ((i2 & 75) << 1);
            int i4 = i3 % 128;
            Camera2StreamConfigurationMap = i4;
            if (i3 % 2 != 0 ? length <= 12 : length <= 68) {
                getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 25) + ((i4 & 25) << 1)) % 128;
                z = true;
            }
        }
        int i5 = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i5 & 35) + (i5 | 35)) % 128;
        return z;
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = -2538562841420505541L;
    }
}
