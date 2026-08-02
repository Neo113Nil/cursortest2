package util.h.xy.q;

/* loaded from: classes18.dex */
public class a implements util.h.xy.ba.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static final int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor;
    private static final byte[] getHighSpeedVideoSizes = null;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.lang.String f2294;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0045 -> B:4:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i3 | 83) << 1) - (i3 ^ 83)) % 128;
        int i4 = -(b * 2);
        int i5 = (i4 & 1) + (i4 | 1);
        byte[] bArr = getHighSpeedVideoSizes;
        int i6 = 3;
        int i7 = 714 - (~(-(b2 * 3)));
        char[] cArr = new char[i5];
        if (bArr == null) {
            Camera2StreamConfigurationMap = ((i3 & 113) + (i3 | 113)) % 128;
            int i8 = i5;
            int i9 = 3;
            i = 0;
            int i10 = -i6;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i11 = i10 * (-495);
            int i12 = i8 * (-495);
            int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
            int i14 = ~i10;
            int i15 = ~i8;
            int i16 = ~(i14 | i15);
            int i17 = ~((i14 ^ currentTimeMillis) | (i14 & currentTimeMillis));
            int i18 = (i16 | i17) * 992;
            int i19 = ~((i14 ^ i15) | (i15 & i14));
            int i20 = ~currentTimeMillis;
            int i21 = (i10 ^ i20) | (i10 & i20);
            int i22 = (((i13 & i18) + (i13 | i18)) - (~(((~((i21 ^ i8) | (i21 & i8))) | ((i19 ^ i17) | (i19 & i17))) * (-496)))) - 1;
            int i23 = -(-(((i8 ^ currentTimeMillis) | (i8 & currentTimeMillis)) * 496));
            int i24 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i24 | 63) << 1) - (i24 ^ 63)) % 128;
            int i25 = i9;
            i7 = (i23 & i22) + (i23 | i22);
            i6 = i25;
            cArr[i] = (char) i7;
            i2 = ((i & 113) + (i | 113)) - 112;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i26 = (i6 | 1) + (i6 & 1);
            i6 = bArr[i26];
            int i27 = i7;
            i9 = i26;
            i = i2;
            i8 = i27;
            int i102 = -i6;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i112 = i102 * (-495);
            int i122 = i8 * (-495);
            int i132 = (i112 ^ i122) + ((i112 & i122) << 1);
            int i142 = ~i102;
            int i152 = ~i8;
            int i162 = ~(i142 | i152);
            int i172 = ~((i142 ^ currentTimeMillis2) | (i142 & currentTimeMillis2));
            int i182 = (i162 | i172) * 992;
            int i192 = ~((i142 ^ i152) | (i152 & i142));
            int i202 = ~currentTimeMillis2;
            int i212 = (i102 ^ i202) | (i102 & i202);
            int i222 = (((i132 & i182) + (i132 | i182)) - (~(((~((i212 ^ i8) | (i212 & i8))) | ((i192 ^ i172) | (i192 & i172))) * (-496)))) - 1;
            int i232 = -(-(((i8 ^ currentTimeMillis2) | (i8 & currentTimeMillis2)) * 496));
            int i242 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i242 | 63) << 1) - (i242 ^ 63)) % 128;
            int i252 = i9;
            i7 = (i232 & i222) + (i232 | i222);
            i6 = i252;
            cArr[i] = (char) i7;
            i2 = ((i & 113) + (i | 113)) - 112;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            cArr[i] = (char) i7;
            i2 = ((i & 113) + (i | 113)) - 112;
            if (i2 == i5) {
            }
        }
    }

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap();
        f2294 = util.h.xy.q.a.class.getName();
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i & 17) + (i | 17)) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0979  */
    @Override // util.h.xy.ba.mb
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo25295() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        java.lang.String str;
        byte[] bArr4;
        byte b;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;
        int red = android.graphics.Color.red(0);
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ((((red * 980) - 21516) + ((~((i & (-23)) | (i ^ (-23)))) * 979)) - (~(((red ^ identityHashCode) | (red & identityHashCode)) * (-979)))) - 1;
        int i3 = ~((identityHashCode ^ (-23)) | (identityHashCode & (-23)));
        int i4 = ~(red | i);
        int i5 = -(-(((i4 ^ i3) | (i4 & i3)) * 979));
        int i6 = -(-(android.view.ViewConfiguration.getTouchSlop() >> 8));
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u000b\u0010\uffef\u0015\u0001\uffe7ￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0001\u000e", (i2 & i5) + (i5 | i2), (i6 ^ 20) + ((i6 & 20) << 1), (edgeSlop & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (edgeSlop | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE), true, objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i7 = (deadChar * 471) + 12246;
        int i8 = -(-(((deadChar ^ 26) | (deadChar & 26)) * (-470)));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        int i10 = ~deadChar;
        int i11 = ~((i10 ^ (-27)) | (i10 & (-27)));
        int i12 = ~((identityHashCode2 ^ (-27)) | (identityHashCode2 & (-27)));
        int i13 = (i11 ^ i12) | (i11 & i12);
        int i14 = ~identityHashCode2;
        int i15 = (i14 ^ deadChar) | (i14 & deadChar);
        int i16 = ~((i15 ^ 26) | (i15 & 26));
        int i17 = -(-(((i13 ^ i16) | (i13 & i16)) * (-470)));
        int i18 = ((i9 | i17) << 1) - (i17 ^ i9);
        int i19 = (deadChar ^ (-27)) | (deadChar & (-27));
        int i20 = ~((i19 ^ identityHashCode2) | (i19 & identityHashCode2));
        int i21 = -(-(((i20 ^ i16) | (i20 & i16)) * 470));
        int i22 = -(android.view.ViewConfiguration.getTouchSlop() >> 8);
        int identityHashCode3 = java.lang.System.identityHashCode(this);
        int i23 = (i22 * 302) + 3015;
        int i24 = ~identityHashCode3;
        int i25 = ~i22;
        int i26 = ~(i25 | i24);
        int i27 = ((i26 ^ 5) | (i26 & 5)) * (-602);
        int i28 = ~((i25 ^ (-6)) | (i25 & (-6)));
        int i29 = ~(identityHashCode3 | i25);
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = i22 | i24;
        int i32 = ~((i31 ^ 5) | (i31 & 5));
        int i33 = -(-(((i32 ^ i30) | (i32 & i30)) * (-301)));
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16;
        int identityHashCode4 = java.lang.System.identityHashCode(this);
        int i34 = -(-(((minimumFlingVelocity ^ identityHashCode4) | (minimumFlingVelocity & identityHashCode4)) * (-50)));
        int i35 = ~minimumFlingVelocity;
        int i36 = (i35 ^ (-165)) | (i35 & (-165));
        int i37 = ~identityHashCode4;
        int i38 = (i37 & (-165)) | (i37 ^ (-165));
        int i39 = -(-(((~((identityHashCode4 ^ i36) | (i36 & identityHashCode4))) | (~((i38 & minimumFlingVelocity) | (i38 ^ minimumFlingVelocity)))) * 50));
        int i40 = ~i38;
        int i41 = ~((minimumFlingVelocity ^ (-165)) | (minimumFlingVelocity & (-165)));
        int i42 = (i40 ^ i41) | (i40 & i41);
        int i43 = ~((minimumFlingVelocity & i37) | (i37 ^ minimumFlingVelocity));
        int i44 = -(-(((i42 ^ i43) | (i43 & i42)) * 50));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("�\n\u0000\u000b\t\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffef\u0001\uffff\u0011\u000e\u0001￮", ((i18 | i21) << 1) - (i21 ^ i18), (((((i23 | i27) << 1) - (i23 ^ i27)) - (~i33)) - 1) + ((~(i24 | 5)) * 301), (((((((minimumFlingVelocity * 51) - 8036) - (~i34)) - 1) - (~i39)) - 1) - (~i44)) - 1, false, objArr2);
        java.lang.String str3 = (java.lang.String) objArr2[0];
        byte[] m25017 = util.h.xy.al.rb.m25017(util.h.xy.v.ra.f2617);
        byte[] bArr5 = new byte[131];
        try {
            ((java.security.SecureRandom) java.lang.Class.forName(str3).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr5);
            byte[] bArr6 = new byte[128];
            byte[] bArr7 = new byte[3];
            util.h.xy.a.ra raVar = new util.h.xy.a.ra();
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f144, java.lang.String.class));
            } catch (java.lang.Exception unused) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f165, new java.lang.Class[0]));
            } catch (java.lang.Exception unused2) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class));
                int i45 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i45 & 87) + (i45 | 87)) % 128;
            } catch (java.lang.Exception unused3) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused4) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused5) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f197, java.io.InputStream.class, char[].class));
            } catch (java.lang.Exception unused6) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str2).getMethod(util.h.xy.al.b.f197, java.security.KeyStore.LoadStoreParameter.class));
            } catch (java.lang.Exception unused7) {
            }
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str2);
                java.lang.String str4 = util.h.xy.al.b.f193;
                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                clsArr[0] = java.lang.String.class;
                int i46 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                int identityHashCode5 = java.lang.System.identityHashCode(this);
                int i47 = ~identityHashCode5;
                int i48 = ~i46;
                int i49 = ~((i48 ^ (-30)) | (i48 & (-30)));
                int i50 = (i47 ^ i49) | (i49 & i47);
                int i51 = ~((i46 ^ 29) | (i46 & 29));
                int i52 = ~((i46 ^ identityHashCode5) | (i46 & identityHashCode5));
                int i53 = (i51 & i52) | (i52 ^ i51);
                int i54 = ~((identityHashCode5 ^ 29) | (identityHashCode5 & 29));
                bArr3 = bArr7;
                int i55 = ((((i46 * (-721)) - 20909) + (((i50 ^ i51) | (i50 & i51)) * 1444)) - (~(-(-(((i53 & i54) | (i53 ^ i54)) * (-1444)))))) - 1;
                int i56 = ~((i48 & 29) | (i48 ^ 29));
                int i57 = ~((i46 ^ (-30)) | (i46 & (-30)));
                int i58 = ((i56 ^ i57) | (i56 & i57)) * 722;
                try {
                    int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                    int identityHashCode6 = java.lang.System.identityHashCode(this);
                    int i59 = (scrollDefaultDelay * (-518)) - 9324;
                    int i60 = ~scrollDefaultDelay;
                    int i61 = ~identityHashCode6;
                    int i62 = (i60 ^ i61) | (i60 & i61);
                    int i63 = -(-(((~i62) | 18) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    int i64 = ~(i62 | 18);
                    int i65 = (scrollDefaultDelay ^ 18) | (scrollDefaultDelay & 18);
                    bArr2 = bArr6;
                    int i66 = ~((i65 & identityHashCode6) | (i65 ^ identityHashCode6));
                    int i67 = (((i59 ^ i63) + ((i59 & i63) << 1)) - (~(-(-(((i64 & i66) | (i66 ^ i64)) * (-519)))))) - 1;
                    int i68 = ~((identityHashCode6 ^ 18) | (identityHashCode6 & 18));
                    int i69 = -(-(((scrollDefaultDelay ^ i68) | (scrollDefaultDelay & i68)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                    try {
                        int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                        int identityHashCode7 = java.lang.System.identityHashCode(this);
                        int i70 = scrollDefaultDelay2 * (-183);
                        int i71 = (i70 & 30155) + (i70 | 30155);
                        int i72 = ~scrollDefaultDelay2;
                        bArr = m25017;
                        int i73 = ((i72 ^ 163) | (i72 & 163)) * (-368);
                        int i74 = (i71 ^ i73) + ((i73 & i71) << 1);
                        int i75 = ~identityHashCode7;
                        int i76 = -(-(((scrollDefaultDelay2 ^ (-164)) | (scrollDefaultDelay2 & (-164)) | i75) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
                        int i77 = ~(i72 | (-164));
                        int i78 = ~((i75 ^ scrollDefaultDelay2) | (i75 & scrollDefaultDelay2));
                        int i79 = (i78 ^ i77) | (i78 & i77);
                        int i80 = ~(scrollDefaultDelay2 | 163);
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI("\u0011\u000f\u0002\u0000ￋ\u0016\u0011\u0006\u000f\u0012\u0000\u0002\u0010ￋ\ufffe\u0013\ufffe\u0007\u0002\u0011\ufffe\u0000\u0006\u0003\u0006\u0011\u000f\u0002￠ￋ", ((i55 | i58) << 1) - (i58 ^ i55), (i67 ^ i69) + ((i67 & i69) << 1), ((((i74 | i76) << 1) - (i76 ^ i74)) - (~(((i80 & i79) | (i79 ^ i80)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) - 1, true, objArr3);
                            clsArr[1] = java.lang.Class.forName((java.lang.String) objArr3[0]);
                            raVar.m24514(cls.getMethod(str4, clsArr));
                        } catch (java.lang.Exception unused8) {
                        }
                    } catch (java.lang.Exception unused9) {
                        bArr = m25017;
                    }
                } catch (java.lang.Exception unused10) {
                    bArr = m25017;
                    bArr2 = bArr6;
                }
            } catch (java.lang.Exception unused11) {
                bArr = m25017;
                bArr2 = bArr6;
                bArr3 = bArr7;
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f175, new java.lang.Class[0]));
            } catch (java.lang.Exception unused12) {
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f146, new java.lang.Class[0]));
            } catch (java.lang.Exception unused13) {
            }
            try {
                raVar.m24514(java.security.KeyStore.TrustedCertificateEntry.class.getMethod(util.h.xy.al.b.f186, new java.lang.Class[0]));
            } catch (java.lang.Exception unused14) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f133, byte[].class));
            } catch (java.lang.Exception unused15) {
            }
            try {
                raVar.m24514(java.lang.Class.forName(str3).getMethod(util.h.xy.al.b.f140, java.lang.Integer.TYPE));
            } catch (java.lang.Exception unused16) {
            }
            try {
                raVar.m24514(java.util.Random.class.getMethod(util.h.xy.al.b.f125, new java.lang.Class[0]));
            } catch (java.lang.Exception unused17) {
            }
            try {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    raVar.m24514(android.content.pm.SigningInfo.class.getMethod(util.h.xy.al.b.f127, new java.lang.Class[0]));
                }
            } catch (java.lang.Exception unused18) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f121, javax.net.ssl.KeyManager[].class, javax.net.ssl.TrustManager[].class, java.lang.Class.forName(str3)));
            } catch (java.lang.Exception unused19) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused20) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused21) {
            }
            try {
                raVar.m24514(javax.net.ssl.SSLContext.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused22) {
            }
            try {
                java.lang.String str5 = util.h.xy.al.b.f105;
                java.lang.Class[] clsArr2 = new java.lang.Class[2];
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
                int identityHashCode8 = java.lang.System.identityHashCode(this);
                int i81 = (capsMode * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE) - 8460;
                int i82 = ~capsMode;
                int i83 = ~((i82 ^ 30) | (i82 & 30));
                int i84 = ~((i82 ^ identityHashCode8) | (i82 & identityHashCode8));
                int i85 = ((i83 ^ i84) | (i83 & i84)) * (-283);
                int i86 = (i81 ^ i85) + ((i81 & i85) << 1);
                int i87 = -(-((~((capsMode ^ (-31)) | (capsMode & (-31)))) * 283));
                int i88 = (i82 ^ (-31)) | (i82 & (-31));
                int i89 = -(android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int identityHashCode9 = java.lang.System.identityHashCode(this);
                int i90 = (i89 * 236) + 73947;
                int i91 = ~i89;
                str = str3;
                int i92 = ~identityHashCode9;
                int i93 = ~((i91 & i92) | (i92 ^ i91));
                bArr4 = bArr5;
                int i94 = ((i93 ^ 157) | (i93 & 157)) * (-235);
                int i95 = ((i90 | i94) << 1) - (i94 ^ i90);
                int i96 = ~((i91 ^ identityHashCode9) | (i91 & identityHashCode9));
                int i97 = -(-(((i96 ^ 157) | (i96 & 157)) * (-470)));
                int i98 = ~((i89 & (-158)) | (i89 ^ (-158)));
                int i99 = ~((i91 ^ 157) | (i91 & 157) | identityHashCode9);
                try {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("\f\u0017\u0015\b￦ￜￓ\uffd8\ufffb\uffd1\u0017\u0015\b\u0006\uffd1\u001c\u0017\f\u0015\u0018\u0006\b\u0016\uffd1\u0004\u0019\u0004\r\uffef\ufffe\uffde\b\u0017\u0004\u0006\f\t", (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 36, ((((i86 | i87) << 1) - (i87 ^ i86)) - (~((~((i88 & identityHashCode8) | (i88 ^ identityHashCode8))) * 283))) - 1, ((((i95 | i97) << 1) - (i97 ^ i95)) - (~(-(-(((i98 ^ i99) | (i98 & i99)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))))) - 1, true, objArr4);
                    clsArr2[0] = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    clsArr2[1] = java.lang.String.class;
                    raVar.m24514(util.h.xy.df.a.class.getMethod(str5, clsArr2));
                } catch (java.lang.Exception unused23) {
                }
            } catch (java.lang.Exception unused24) {
                str = str3;
                bArr4 = bArr5;
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class));
            } catch (java.lang.Exception unused25) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.lang.String.class));
            } catch (java.lang.Exception unused26) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f172, java.lang.String.class, java.security.Provider.class));
            } catch (java.lang.Exception unused27) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f121, java.lang.Class.forName(str2)));
            } catch (java.lang.Exception unused28) {
            }
            try {
                raVar.m24514(javax.net.ssl.TrustManagerFactory.class.getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
            } catch (java.lang.Exception unused29) {
            }
            try {
                int i100 = -(android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int identityHashCode10 = java.lang.System.identityHashCode(this);
                int i101 = i100 * (-661);
                int i102 = ~i100;
                int i103 = (((i101 | (-10576)) << 1) - (i101 ^ (-10576))) + (((~identityHashCode10) | (~((i102 ^ (-17)) | (i102 & (-17))))) * 1324);
                int i104 = ~((i100 ^ identityHashCode10) | (i100 & identityHashCode10));
                int i105 = ~((identityHashCode10 ^ 16) | (identityHashCode10 & 16));
                int i106 = -(-(((i105 ^ i104) | (i105 & i104)) * (-1324)));
                int i107 = (i103 ^ i106) + ((i106 & i103) << 1);
                int i108 = ~((i102 ^ 16) | (i102 & 16));
                int i109 = ~(i100 | (-17));
                int i110 = -(-(((i109 ^ i108) | (i109 & i108)) * 662));
                int i111 = -android.view.View.getDefaultSize(0, 0);
                int i112 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                int identityHashCode11 = java.lang.System.identityHashCode(this);
                int i113 = ~i112;
                int i114 = ~identityHashCode11;
                int i115 = (((i112 * 193) + 30880) - (~(((~(i113 | 160)) | i114) * (-192)))) - 1;
                int i116 = ~((i113 ^ (-161)) | (i113 & (-161)));
                int i117 = ~(i114 | (-161));
                int i118 = -(-(((i116 ^ i117) | (i116 & i117)) * (-384)));
                int i119 = (i115 ^ i118) + ((i115 & i118) << 1);
                int i120 = i113 | (-161);
                int i121 = ~((i120 ^ identityHashCode11) | (i120 & identityHashCode11));
                int i122 = (i114 & (-161)) | (i114 ^ (-161));
                int i123 = ~((i122 ^ i112) | (i122 & i112));
                int i124 = (i121 ^ i123) | (i121 & i123);
                int i125 = i112 | 160;
                int i126 = ~((i125 ^ identityHashCode11) | (i125 & identityHashCode11));
                int i127 = ((i126 ^ i124) | (i126 & i124)) * 192;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\u0015\u0007\u0001\u000e\u0004\u0012\u000f\t\u0004ￎ\u000f\u0013ￎ￤\u0005\u0002", (i107 ^ i110) + ((i110 & i107) << 1), (i111 ^ 2) + ((i111 & 2) << 1), (i119 ^ i127) + ((i127 & i119) << 1), false, objArr5);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr5[0]).getMethod(util.h.xy.al.b.f94, new java.lang.Class[0]));
            } catch (java.lang.Exception unused30) {
            }
            try {
                int i128 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int identityHashCode12 = java.lang.System.identityHashCode(this);
                int i129 = i128 * (-380);
                int i130 = (identityHashCode12 ^ 36) | (identityHashCode12 & 36);
                int i131 = ~i128;
                int i132 = (i129 ^ 13752) + ((i129 & 13752) << 1) + (((i130 & i131) | (i130 ^ i131)) * (-381));
                int i133 = ~((i131 & (-37)) | (i131 ^ (-37)));
                int i134 = ~identityHashCode12;
                int i135 = ~((i134 ^ 36) | (i134 & 36));
                int i136 = ((~(i128 | 36)) | (i135 ^ i133) | (i135 & i133)) * 381;
                int defaultSize = android.view.View.getDefaultSize(0, 0);
                int identityHashCode13 = java.lang.System.identityHashCode(this);
                int i137 = (defaultSize * (-1975)) + 4945;
                int i138 = ~defaultSize;
                int i139 = ((~(i138 | 5)) | identityHashCode13) * 988;
                int i140 = (i137 ^ i139) + ((i137 & i139) << 1);
                int i141 = ~(defaultSize | (-6));
                int i142 = ~identityHashCode13;
                int i143 = ~(defaultSize | i142);
                int i144 = ((i143 ^ i141) | (i141 & i143)) * (-1976);
                int i145 = ((i140 | i144) << 1) - (i144 ^ i140);
                int i146 = ~((i138 & 5) | (i138 ^ 5));
                int i147 = ~((identityHashCode13 ^ (-6)) | (identityHashCode13 & (-6)));
                int i148 = (i147 ^ i146) | (i146 & i147);
                int i149 = ~((i142 & 5) | (i142 ^ 5));
                int i150 = -(-(((i148 ^ i149) | (i148 & i149)) * 988));
                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
                int identityHashCode14 = java.lang.System.identityHashCode(this);
                int i151 = doubleTapTimeout * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                int i152 = ~doubleTapTimeout;
                int i153 = ~((i152 ^ (-165)) | (i152 & (-165)));
                int i154 = ~identityHashCode14;
                int i155 = ~((i154 ^ doubleTapTimeout) | (i154 & doubleTapTimeout) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
                int i156 = ((((-35916) ^ i151) + ((i151 & (-35916)) << 1)) - (~(-(-(((i153 & i155) | (i153 ^ i155)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))))) - 1;
                int i157 = ~((i154 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) | (i154 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                int i158 = -(-(((i157 ^ doubleTapTimeout) | (i157 & doubleTapTimeout)) * (-440)));
                int i159 = (i156 & i158) + (i158 | i156);
                int i160 = -(-(((doubleTapTimeout ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) | (doubleTapTimeout & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) | identityHashCode14) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("\uffff\u0010\u000b\u000e\u0015\u0006�\u0012�ￊ\u000f\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ\uffff\u0001\u000e\u0010ￊ\uffdf\u0001\u000e\u0010\u0005\u0002\u0005\uffff�\u0010\u0001￢�", (i132 ^ i136) + ((i136 & i132) << 1) + ((~((i131 ^ 36) | (i131 & 36))) * 381), (i145 & i150) + (i150 | i145), (i159 & i160) + (i160 | i159), false, objArr6);
                raVar.m24514(java.lang.Class.forName((java.lang.String) objArr6[0]).getMethod(util.h.xy.al.b.f93, new java.lang.Class[0]));
            } catch (java.lang.Exception unused31) {
            }
            try {
                byte[] bArr8 = bArr4;
                byte[] m27594 = util.h.xy.v.b.f2439.m27594(bArr8, util.h.xy.a.ma.m24504(raVar));
                int m24553 = util.h.xy.af.mb.m24551().m24553(m27594[0]);
                if (m24553 != -91) {
                    if (m24553 == 111) {
                        int i161 = getHighSpeedVideoFpsRangesFor;
                        int i162 = (i161 & 1) + (i161 | 1);
                        Camera2StreamConfigurationMap = i162 % 128;
                        if (i162 % 2 == 0) {
                            throw new java.lang.NullPointerException();
                        }
                        int i163 = ((i161 | 45) << 1) - (i161 ^ 45);
                        Camera2StreamConfigurationMap = i163 % 128;
                        try {
                            if (i163 % 2 == 0) {
                                ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                util.h.xy.ag.a.m24556().m24558();
                                throw new java.lang.ArithmeticException();
                            }
                            int nextInt = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt();
                            try {
                                java.lang.Object[] objArr7 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt)};
                                java.lang.Object obj = util.h.xy.dd.b.f1176.get(-1119310920);
                                if (obj != null) {
                                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                                } else {
                                    int i164 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    int identityHashCode15 = java.lang.System.identityHashCode(this);
                                    int i165 = (i164 * (-1975)) + 122636;
                                    int i166 = ~i164;
                                    int i167 = ~((i166 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) | (i166 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
                                    int i168 = -(-((identityHashCode15 | i167) * 988));
                                    int i169 = ~((i164 & (-125)) | (i164 ^ (-125)));
                                    int i170 = ~identityHashCode15;
                                    int i171 = ~((i164 & i170) | (i170 ^ i164));
                                    int i172 = (((i165 & i168) + (i165 | i168)) - (~(-(-(((i171 & i169) | (i169 ^ i171)) * (-1976)))))) - 1;
                                    int i173 = -(-(((~((identityHashCode15 & (-125)) | (identityHashCode15 ^ (-125)))) | i167 | (~((i170 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) | (i170 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE)))) * 988));
                                    int i174 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i175 = -(-(android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                    java.lang.Class cls2 = (java.lang.Class) util.h.xy.dd.b.m26271((i172 & i173) + (i173 | i172), (char) ((47455 ^ i174) + ((i174 & 47455) << 1)), (i175 & 21) + (i175 | 21));
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI((byte) 0, (byte) 0, objArr8);
                                    java.lang.String str6 = (java.lang.String) objArr8[0];
                                    int i176 = (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int identityHashCode16 = java.lang.System.identityHashCode(this);
                                    int i177 = i176 * 302;
                                    int i178 = ((i177 | 13266) << 1) - (i177 ^ 13266);
                                    int i179 = ~i176;
                                    int i180 = ~identityHashCode16;
                                    int i181 = ~((i179 ^ i180) | (i180 & i179));
                                    int i182 = ((i181 & 22) | (i181 ^ 22)) * (-602);
                                    int i183 = (i178 & i182) + (i178 | i182);
                                    int i184 = ~((i179 ^ (-23)) | (i179 & (-23)));
                                    int i185 = ~((identityHashCode16 & i179) | (i179 ^ identityHashCode16));
                                    int i186 = (i176 ^ i180) | (i176 & i180);
                                    int i187 = ((~((i186 ^ 22) | (i186 & 22))) | (i185 ^ i184) | (i184 & i185)) * (-301);
                                    int i188 = ((i183 | i187) << 1) - (i187 ^ i183);
                                    int i189 = -(-((~((i180 ^ 22) | (i180 & 22))) * 301));
                                    int i190 = -android.view.Gravity.getAbsoluteGravity(0, 0);
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI("\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n", (i188 ^ i189) + ((i189 & i188) << 1), ((i190 | 5) << 1) - (i190 ^ 5), 164 - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16)))), false, objArr9);
                                    obj = cls2.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr9[0]), java.lang.Integer.TYPE);
                                    util.h.xy.dd.b.f1176.put(-1119310920, obj);
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr7)).intValue() == nextInt) {
                                    int i191 = Camera2StreamConfigurationMap;
                                    int i192 = (i191 & 3) + (i191 | 3);
                                    getHighSpeedVideoFpsRangesFor = i192 % 128;
                                    if (i192 % 2 != 0) {
                                        m24553 = 111;
                                    }
                                } else {
                                    m24553 = com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                    if (m24553 == -91) {
                        int i193 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = (((i193 | 73) << 1) - (i193 ^ 73)) % 128;
                        byte[] bArr9 = new byte[131];
                        int i194 = 0;
                        while (i194 < 131) {
                            int i195 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRangesFor = (((i195 | 61) << 1) - (i195 ^ 61)) % 128;
                            bArr9[i194] = m27594[(i194 ^ 1) + ((i194 & 1) << 1)];
                            int i196 = (i194 ^ (-17)) + ((i194 & (-17)) << 1);
                            i194 = ((i196 | 18) << 1) - (i196 ^ 18);
                        }
                        for (int i197 = 0; i197 < 131; i197 = ((i197 | 1) << 1) - (i197 ^ 1)) {
                            byte b2 = (byte) (bArr9[i197] ^ bArr[i197]);
                            bArr9[i197] = b2;
                            bArr9[i197] = (byte) (b2 ^ bArr8[i197]);
                        }
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
                        int i198 = 0;
                        for (int i199 = 128; i198 < i199; i199 = 128) {
                            bArr2[i198] = bArr9[i198];
                            i198 = ((i198 | 1) << 1) - (i198 ^ 1);
                        }
                        for (int i200 = 0; i200 < 3; i200++) {
                            int identityHashCode17 = java.lang.System.identityHashCode(this);
                            int i201 = 100351 - (~(i200 * (-782)));
                            int i202 = (~i200) * (-783);
                            int i203 = ~identityHashCode17;
                            int i204 = (i203 ^ (-129)) | (i203 & (-129));
                            int i205 = (i201 ^ i202) + ((i202 & i201) << 1) + ((~((i204 & i200) | (i204 ^ i200))) * (-783));
                            int i206 = ~((i203 ^ i200) | (i203 & i200));
                            int i207 = -(-(((i206 ^ (-129)) | (i206 & (-129))) * 783));
                            bArr3[i200] = bArr9[(i205 ^ i207) + ((i207 & i205) << 1)];
                        }
                        int i208 = (getHighSpeedVideoFpsRangesFor + 7) % 128;
                        Camera2StreamConfigurationMap = i208;
                        byte b3 = bArr3[0];
                        if (b3 != 0 || bArr3[1] != 0 || bArr3[2] != 0) {
                            getHighSpeedVideoFpsRangesFor = (((i208 | 71) << 1) - (i208 ^ 71)) % 128;
                            int i209 = i208 + 99;
                            int i210 = i209 % 128;
                            getHighSpeedVideoFpsRangesFor = i210;
                            if (i209 % 2 == 0) {
                                int i211 = (i210 ^ 101) + ((i210 & 101) << 1);
                                Camera2StreamConfigurationMap = i211 % 128;
                                if (i211 % 2 != 0 ? b3 >= 0 : b3 >= 0) {
                                    byte b4 = bArr3[1];
                                    if (b4 >= 0 && (b = bArr3[2]) >= 0 && b3 != b4 && b4 != b && b3 != b) {
                                        byte b5 = bArr2[b3];
                                        byte b6 = bArr2[b4];
                                        byte b7 = bArr2[b];
                                        if (b5 < b6) {
                                            int i212 = ((i210 | 105) << 1) - (i210 ^ 105);
                                            Camera2StreamConfigurationMap = i212 % 128;
                                            if (i212 % 2 == 0) {
                                                throw null;
                                            }
                                            if (b5 >= 0) {
                                                int i213 = ((i210 | 65) << 1) - (i210 ^ 65);
                                                int i214 = i213 % 128;
                                                Camera2StreamConfigurationMap = i214;
                                                if (i213 % 2 != 0 ? b5 <= 100 : b5 <= 85) {
                                                    if (b6 >= 0 && b6 <= 100) {
                                                        int i215 = (i214 ^ 119) + ((i214 & 119) << 1);
                                                        int i216 = i215 % 128;
                                                        getHighSpeedVideoFpsRangesFor = i216;
                                                        if (i215 % 2 != 0) {
                                                            throw new java.lang.NullPointerException();
                                                        }
                                                        if (b7 >= 0 && b7 <= 100) {
                                                            int i217 = ((i216 | 29) << 1) - (i216 ^ 29);
                                                            int i218 = i217 % 128;
                                                            Camera2StreamConfigurationMap = i218;
                                                            if (i217 % 2 == 0) {
                                                                throw null;
                                                            }
                                                            if (b7 < b5) {
                                                                m24553 = 801;
                                                            } else if (b7 >= b6) {
                                                                int identityHashCode18 = java.lang.System.identityHashCode(this);
                                                                int i219 = ~identityHashCode18;
                                                                int i220 = ~(((-432382113) ^ i219) | ((-432382113) & i219));
                                                                int i221 = ~((1819763580 & i219) | (1819763580 ^ i219));
                                                                int i222 = ((i220 ^ i221) | (i221 & i220)) * (-867);
                                                                int i223 = ~(((-432382113) ^ identityHashCode18) | ((-432382113) & identityHashCode18));
                                                                int i224 = (i223 ^ 293634176) | (293634176 & i223);
                                                                int i225 = ~((1819763580 & identityHashCode18) | (1819763580 ^ identityHashCode18));
                                                                int i226 = ((-1656272212) & i222) + (i222 | (-1656272212)) + (((i224 & i225) | (i224 ^ i225)) * (-1734));
                                                                int i227 = (~((i219 ^ (-293634177)) | ((-293634177) & i219))) | (~(((-138747937) & identityHashCode18) | ((-138747937) ^ identityHashCode18)));
                                                                int i228 = ~((identityHashCode18 ^ 2113397756) | (2113397756 & identityHashCode18));
                                                                int i229 = -(-(((i228 ^ i227) | (i228 & i227)) * 867));
                                                                int identityHashCode19 = java.lang.System.identityHashCode(this);
                                                                int i230 = (1234417443 ^ identityHashCode19) | (1234417443 & identityHashCode19);
                                                                int i231 = ~i230;
                                                                int i232 = (((i231 ^ (-478310954)) | (i231 & (-478310954))) * (-465)) + 1384480685;
                                                                int i233 = ~((identityHashCode19 ^ (-478310954)) | (identityHashCode19 & (-478310954)));
                                                                int i234 = ((i233 ^ 1234417443) | (1234417443 & i233)) * 930;
                                                                int i235 = (i232 ^ i234) + ((i234 & i232) << 1);
                                                                int i236 = (i230 | (-478310954)) * 465;
                                                                m24553 = ((i226 | i229) << 1) - (i229 ^ i226) > (i235 & i236) + (i236 | i235) ? 96 : -91;
                                                                int i237 = Camera2StreamConfigurationMap;
                                                                getHighSpeedVideoFpsRangesFor = ((i237 ^ 3) + ((i237 & 3) << 1)) % 128;
                                                            } else if (b7 >= b5 && b7 < b6) {
                                                                int i238 = (i218 ^ 81) + ((i218 & 81) << 1);
                                                                getHighSpeedVideoFpsRangesFor = i238 % 128;
                                                                if (i238 % 2 != 0) {
                                                                    throw new java.lang.NullPointerException();
                                                                }
                                                                getHighSpeedVideoFpsRangesFor = (i218 + 7) % 128;
                                                                try {
                                                                    int nextInt2 = ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextInt();
                                                                    try {
                                                                        java.lang.Object[] objArr10 = {util.h.xy.ag.a.m24556().m24558(), java.lang.Integer.valueOf(nextInt2)};
                                                                        java.lang.Object obj2 = util.h.xy.dd.b.f1176.get(-1119310920);
                                                                        if (obj2 == null) {
                                                                            int i239 = -(android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                            int identityHashCode20 = java.lang.System.identityHashCode(this);
                                                                            int i240 = (i239 * 465) - 56949;
                                                                            int i241 = ~identityHashCode20;
                                                                            int i242 = ~(i241 | (-124));
                                                                            int i243 = ~((i239 ^ (-124)) | (i239 & (-124)));
                                                                            int i244 = i242 | i243;
                                                                            int i245 = ~((i241 ^ i239) | (i241 & i239));
                                                                            int i246 = -(-(((i245 ^ i244) | (i245 & i244)) * 464));
                                                                            int i247 = ((i240 | i246) << 1) - (i240 ^ i246);
                                                                            int i248 = ~i239;
                                                                            int i249 = (i248 ^ identityHashCode20) | (i248 & identityHashCode20);
                                                                            int i250 = -(-(((i249 ^ (-124)) | (i249 & (-124))) * (-464)));
                                                                            int i251 = (i247 ^ i250) + ((i250 & i247) << 1);
                                                                            int i252 = ~((i239 ^ identityHashCode20) | (i239 & identityHashCode20));
                                                                            int i253 = ((i252 ^ i243) | (i252 & i243)) * 464;
                                                                            int i254 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                            int i255 = -(-(android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                                            java.lang.Class cls3 = (java.lang.Class) util.h.xy.dd.b.m26271(((i251 | i253) << 1) - (i253 ^ i251), (char) ((47454 ^ i254) + ((i254 & 47454) << 1)), (i255 & 21) + (i255 | 21));
                                                                            int identityHashCode21 = java.lang.System.identityHashCode(this);
                                                                            int i256 = (~((identityHashCode21 ^ (-2)) | (identityHashCode21 & (-2)))) * (-754);
                                                                            int i257 = (i256 & 1508) + (i256 | 1508);
                                                                            int i258 = ~identityHashCode21;
                                                                            int i259 = (i258 & 1) | (i258 ^ 1);
                                                                            int i260 = (~(i259 | (~i259))) * (-754);
                                                                            int i261 = ((i257 | i260) << 1) - (i260 ^ i257);
                                                                            int i262 = ((i258 ^ (-2)) | (i258 & (-2))) * 754;
                                                                            byte b8 = (byte) ((i261 & i262) + (i262 | i261));
                                                                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                                            getHighResolutionOutputSizeshNQ4ISI(b8, b8, objArr11);
                                                                            java.lang.String str7 = (java.lang.String) objArr11[0];
                                                                            int i263 = -android.view.KeyEvent.keyCodeFromString("");
                                                                            int i264 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                                                                            int identityHashCode22 = java.lang.System.identityHashCode(this);
                                                                            int i265 = i264 * 477;
                                                                            int i266 = ~i264;
                                                                            int i267 = ~((i266 ^ 4) | (i266 & 4));
                                                                            int i268 = (i264 ^ (-5)) | (i264 & (-5));
                                                                            int i269 = ~((i268 ^ identityHashCode22) | (i268 & identityHashCode22));
                                                                            int i270 = (i265 & (-1900)) + (i265 | (-1900)) + (((i267 & i269) | (i267 ^ i269)) * (-476)) + (i269 * 952);
                                                                            int i271 = ~identityHashCode22;
                                                                            int i272 = -(-((~(i264 | (i271 ^ (-5)) | (i271 & (-5)))) * 476));
                                                                            int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout() >> 16;
                                                                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                                            getHighResolutionOutputSizeshNQ4ISI("\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n", ((i263 | 23) << 1) - (i263 ^ 23), (i270 & i272) + (i272 | i270), (longPressTimeout & 165) + (longPressTimeout | 165), false, objArr12);
                                                                            obj2 = cls3.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr12[0]), java.lang.Integer.TYPE);
                                                                            util.h.xy.dd.b.f1176.put(-1119310920, obj2);
                                                                        }
                                                                        if (((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr10)).intValue() != nextInt2) {
                                                                            int i273 = getHighSpeedVideoFpsRangesFor + 109;
                                                                            Camera2StreamConfigurationMap = i273 % 128;
                                                                            m24553 = i273 % 2 == 0 ? 15437 : com.visa.cbp.sdk.facade.data.Constants.ROOT_DETECTED;
                                                                        }
                                                                    } catch (java.lang.Throwable th3) {
                                                                        java.lang.Throwable cause3 = th3.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
                                                                        }
                                                                        throw th3;
                                                                    }
                                                                } catch (java.lang.Throwable th4) {
                                                                    java.lang.Throwable cause4 = th4.getCause();
                                                                    if (cause4 != null) {
                                                                        throw cause4;
                                                                    }
                                                                    throw th4;
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
                            Camera2StreamConfigurationMap = (((i210 | 75) << 1) - (i210 ^ 75)) % 128;
                        }
                    }
                    int i274 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = (((i274 | 71) << 1) - (i274 ^ 71)) % 128;
                    return m24553;
                }
                m24553 = -91;
                if (m24553 == -91) {
                }
                int i2742 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = (((i2742 | 71) << 1) - (i2742 ^ 71)) % 128;
                return m24553;
            } catch (java.io.UnsupportedEncodingException unused32) {
                throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f724);
            }
        } catch (java.lang.Throwable th5) {
            java.lang.Throwable cause5 = th5.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th5;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = -1231763754;
    }

    static void Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 117) << 1) - (i ^ 117)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        getHighSpeedVideoSizes = new byte[]{91, -70, -81, -39};
        getHighSpeedVideoFpsRanges = 70;
        Camera2StreamConfigurationMap = (i2 + 71) % 128;
    }
}
