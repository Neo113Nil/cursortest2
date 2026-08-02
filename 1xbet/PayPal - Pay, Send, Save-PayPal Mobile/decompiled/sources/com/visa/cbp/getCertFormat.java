package com.visa.cbp;

/* loaded from: classes5.dex */
public class getCertFormat {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    protected static com.visa.cbp.setWidth BuildConfig;
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static byte[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static long getInputSizeshNQ4ISI;
    private static com.visa.cbp.getDeviceType getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static java.lang.String getOutputStallDurationlomOqCM;
    protected static com.visa.cbp.setMaxPmts valueOf;
    private java.security.KeyPair getOutputSizes = null;

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap() {
        int i = (getInputFormats + 13) % 128;
        getHighSpeedVideoSizes = i;
        java.lang.String str = Camera2StreamConfigurationMap;
        int i2 = i + 71;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRanges = 1;
        getInputFormats = 0;
        getHighSpeedVideoSizes = 1;
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = "getCertFormat";
        getOutputStallDurationlomOqCM = null;
        getOutputFormats = null;
        getHighSpeedVideoFpsRangesFor = null;
        int i = getInputFormats + 3;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static java.lang.String BuildConfig() {
        int i = getHighSpeedVideoSizes;
        getInputFormats = (i + 49) % 128;
        java.lang.String str = getOutputStallDurationlomOqCM;
        getInputFormats = (i + 51) % 128;
        return str;
    }

    public static com.visa.cbp.getDeviceType ConfirmReplenishRequest() {
        int i = getInputFormats + 71;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.visa.cbp.getDeviceType getdevicetype = getOutputFormats;
        int i3 = i2 + 67;
        getInputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            return getdevicetype;
        }
        throw null;
    }

    public static byte[] ReplenishAckRequest() {
        int i = getInputFormats;
        getHighSpeedVideoSizes = (i + 95) % 128;
        byte[] bArr = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 125;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public java.lang.String valueOf() {
        int i = getHighSpeedVideoSizes + 55;
        getInputFormats = i % 128;
        com.visa.cbp.setMaxPmts setmaxpmts = valueOf;
        if (i % 2 == 0) {
            return setmaxpmts.getSignature();
        }
        setmaxpmts.getSignature();
        throw null;
    }

    public java.lang.String values() {
        getInputFormats = (getHighSpeedVideoSizes + 109) % 128;
        java.lang.String encryptionMetaData = valueOf.getEncryptionMetaData();
        getHighSpeedVideoSizes = (getInputFormats + 31) % 128;
        return encryptionMetaData;
    }

    public boolean getTokenInfo() {
        int i = getHighSpeedVideoSizes + 93;
        getInputFormats = i % 128;
        com.visa.cbp.setMaxPmts setmaxpmts = valueOf;
        if (i % 2 == 0) {
            return setmaxpmts.setMac();
        }
        setmaxpmts.setMac();
        throw null;
    }

    public static boolean getTvls() {
        if (getOutputFormats == null) {
            return false;
        }
        int i = getInputFormats;
        int i2 = i + 101;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = getHighSpeedVideoFpsRangesFor;
        if (bArr == null) {
            return false;
        }
        int i3 = i + 81;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr.length > 0;
        }
        int length = bArr.length;
        throw null;
    }

    public static boolean ReplenishAckRequest(android.content.Context context) {
        byte[] bArr;
        int i = getInputFormats + 119;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (getOutputFormats != null && (bArr = getHighSpeedVideoFpsRangesFor) != null) {
            int i3 = i2 + 33;
            getInputFormats = i3 % 128;
            int length = bArr.length;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (length > 0) {
                return true;
            }
        }
        if (valueOf == null) {
            if (BuildConfig == null) {
                BuildConfig = com.visa.cbp.getCardMetaData.valueOf(context);
                getHighSpeedVideoSizes = (getInputFormats + 25) % 128;
            }
            valueOf = new com.visa.cbp.setApi(context, BuildConfig);
        }
        if (!valueOf.getMac()) {
            return false;
        }
        int i4 = (getInputFormats + 23) % 128;
        getHighSpeedVideoSizes = i4;
        int i5 = i4 + 97;
        getInputFormats = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public void ReplenishRequest() {
        int i = getHighSpeedVideoSizes;
        getInputFormats = (i + 81) % 128;
        valueOf = null;
        getOutputStallDurationlomOqCM = null;
        getOutputFormats = null;
        getHighSpeedVideoFpsRangesFor = null;
        getInputFormats = (i + 93) % 128;
    }

    public getCertFormat(android.content.Context context) {
        if (BuildConfig == null) {
            BuildConfig = com.visa.cbp.getCardMetaData.valueOf(context);
        }
        if (valueOf == null) {
            valueOf = new com.visa.cbp.setApi(context, BuildConfig);
        }
        if (valueOf.getIssuerApplicationDiscretionaryData()) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setCertValue);
        }
    }

    public com.visa.cbp.sdk.facade.EnrollDeviceDasRequest values(com.visa.cbp.sdk.facade.DasDeviceInfo dasDeviceInfo, java.lang.String str) {
        java.util.ArrayList arrayList;
        getInputFormats = (getHighSpeedVideoSizes + 99) % 128;
        if (dasDeviceInfo == null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.values);
        }
        com.visa.cbp.sdk.facade.EnrollDeviceDasRequest enrollDeviceDasRequest = new com.visa.cbp.sdk.facade.EnrollDeviceDasRequest();
        com.visa.cbp.sdk.facade.DeviceProfile deviceProfile = new com.visa.cbp.sdk.facade.DeviceProfile();
        com.visa.cbp.setDate setdate = new com.visa.cbp.setDate();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        boolean ReplenishAckRequest = setdate.ReplenishAckRequest(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig());
        if (setdate.values() && setdate.values(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig())) {
            java.lang.String[] ConfirmReplenishRequest = setdate.ConfirmReplenishRequest(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig());
            arrayList = new java.util.ArrayList(ConfirmReplenishRequest.length);
            for (java.lang.String str2 : ConfirmReplenishRequest) {
                getHighSpeedVideoSizes = (getInputFormats + 11) % 128;
                arrayList.add(str2);
            }
        } else {
            arrayList = null;
        }
        deviceProfile.setHardwareBackKeystoreSupport(java.lang.Boolean.toString(ReplenishAckRequest));
        deviceProfile.setKeyAttestationSupport(arrayList.size() >= 3 ? "true" : "false");
        com.visa.cbp.sdk.facade.VisaCertReferenceList visaCertReferenceList = new com.visa.cbp.sdk.facade.VisaCertReferenceList();
        com.visa.cbp.sdk.facade.VisaCertReferenceList visaCertReferenceList2 = new com.visa.cbp.sdk.facade.VisaCertReferenceList();
        visaCertReferenceList.setCertUsage("KEY_AGREEMENT");
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, "鿠箼ꆅ驊р쌐对ꛔ", "ꦟ\ue39c㞼때", objArr);
        visaCertReferenceList.setVCertificateID(((java.lang.String) objArr[0]).intern());
        visaCertReferenceList2.setCertUsage("AUTHENTICITY");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes((char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "䷡耇\uf505\ud9ad昸魭携ꨊ", "쩍츏㏵ࢬ", objArr2);
        visaCertReferenceList2.setVCertificateID(((java.lang.String) objArr2[0]).intern());
        arrayList2.add(visaCertReferenceList);
        arrayList2.add(visaCertReferenceList2);
        enrollDeviceDasRequest.setDeviceInfo(dasDeviceInfo);
        enrollDeviceDasRequest.setDeviceProfile(deviceProfile);
        enrollDeviceDasRequest.setDeviceCertList(arrayList);
        enrollDeviceDasRequest.setVisaCertReferenceList(arrayList2);
        enrollDeviceDasRequest.setProfileAppID(str);
        int i = getHighSpeedVideoSizes + 29;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return enrollDeviceDasRequest;
        }
        throw new java.lang.ArithmeticException();
    }

    public void values(com.visa.cbp.sdk.facade.EnrollDeviceDasResponse enrollDeviceDasResponse) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 35;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (enrollDeviceDasResponse != null) {
            getInputFormats = (i + 57) % 128;
            if (enrollDeviceDasResponse.getDeviceKeyID() == null || enrollDeviceDasResponse.getDeviceKeyID().length() == 0) {
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.BuildConfig);
            }
            if (enrollDeviceDasResponse.getDeviceID() != null) {
                getInputFormats = (getHighSpeedVideoSizes + 61) % 128;
                if (enrollDeviceDasResponse.getDeviceID().length() != 0) {
                    if (enrollDeviceDasResponse.getDeviceIDType() == null || enrollDeviceDasResponse.getDeviceIDType().length() == 0) {
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.valueOf);
                    }
                    valueOf.values(enrollDeviceDasResponse.getDeviceKeyID());
                    valueOf.BuildConfig(enrollDeviceDasResponse.getDeviceID());
                    valueOf.ConfirmReplenishRequest(enrollDeviceDasResponse.getDeviceIDType());
                    valueOf.ConfirmReplenishRequest(true);
                    return;
                }
            }
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.ReplenishAckRequest);
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.ConfirmReplenishRequest);
    }

    public com.visa.cbp.sdk.facade.LoginRequest ConfirmReplenishRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = getInputFormats;
        getHighSpeedVideoSizes = (i + 125) % 128;
        if (str != null) {
            getHighSpeedVideoSizes = (i + 57) % 128;
            if (str.length() != 0) {
                if (str2 == null || str2.length() == 0) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.ReplenishRequest);
                }
                if (str3 == null || str3.length() == 0) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getTvls);
                }
                if (str4 == null || str4.length() == 0) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.valueOf);
                }
                try {
                    java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC");
                    keyPairGenerator.initialize(256);
                    java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                    this.getOutputSizes = generateKeyPair;
                    if (generateKeyPair == null) {
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getvProvisionedTokenID);
                    }
                    com.visa.cbp.sdk.facade.LoginRequest loginRequest = new com.visa.cbp.sdk.facade.LoginRequest(getHighResolutionOutputSizeshNQ4ISI(generateKeyPair.getPublic(), str, str2, str3, str4));
                    int i2 = getHighSpeedVideoSizes + 25;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 == 0) {
                        return loginRequest;
                    }
                    throw null;
                } catch (java.security.NoSuchAlgorithmException unused) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor);
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getTokenInfo);
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.security.PublicKey publicKey, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = getInputFormats + 73;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (publicKey == null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor, com.visa.cbp.sdk.facade.error.ReasonCode.KEYSTOREEXCEPTION);
        }
        if (str == null || str.length() == 0) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getTokenInfo);
        }
        if (str2 == null || str2.length() == 0) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.BuildConfig);
        }
        if (str3 != null) {
            getHighSpeedVideoSizes = (getInputFormats + 93) % 128;
            if (str3.length() != 0) {
                if (str4 == null || str4.length() == 0) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.valueOf);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList.add(new com.visa.cbp.sdk.facade.ApuKey((java.security.interfaces.ECPublicKey) publicKey));
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\u0000\u0000\u0000\u0000", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "鿠箼ꆅ驊р쌐对ꛔ", "ꦟ\ue39c㞼때", objArr);
                arrayList2.add(new com.visa.cbp.sdk.facade.ApvKey(((java.lang.String) objArr[0]).intern()));
                com.visa.cbp.sdk.facade.DkmPart dkmPart = new com.visa.cbp.sdk.facade.DkmPart("PAYLOAD_CONFIDENTIALITY", 128, "1");
                com.visa.cbp.sdk.facade.DkmPart dkmPart2 = new com.visa.cbp.sdk.facade.DkmPart("AUTHENTICITY", 256, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D);
                com.visa.cbp.sdk.facade.DkmPart dkmPart3 = new com.visa.cbp.sdk.facade.DkmPart("FIELD_CONFIDENTIALITY", 256, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
                com.visa.cbp.sdk.facade.DkmPart dkmPart4 = new com.visa.cbp.sdk.facade.DkmPart("PAYLOAD_INTEGRITY", 256, "4");
                arrayList3.add(dkmPart);
                arrayList3.add(dkmPart2);
                arrayList3.add(dkmPart3);
                arrayList3.add(dkmPart4);
                com.visa.cbp.sdk.facade.KeyAgr keyAgr = new com.visa.cbp.sdk.facade.KeyAgr(arrayList, arrayList2);
                com.visa.cbp.sdk.facade.KeyDm keyDm = new com.visa.cbp.sdk.facade.KeyDm(str, arrayList3);
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                long timeInMillis = calendar.getTimeInMillis() / 1000;
                calendar.add(13, 59);
                com.visa.cbp.sdk.facade.CryptoCredentialClaimSet cryptoCredentialClaimSet = new com.visa.cbp.sdk.facade.CryptoCredentialClaimSet(str3, str4, timeInMillis, calendar.getTimeInMillis() / 1000, setTokenInfo(), keyAgr, keyDm);
                return getHighSpeedVideoFpsRanges(str2, new com.google.gson.Gson().toJson(cryptoCredentialClaimSet), new com.visa.cbp.setDate().BuildConfig(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig()));
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getTvls);
    }

    public java.lang.String setTokenInfo() {
        int i = getInputFormats + 11;
        getHighSpeedVideoSizes = i % 128;
        java.lang.String values = values(i % 2 == 0 ? 25 : 16);
        int i2 = getInputFormats + 83;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return values;
        }
        throw null;
    }

    public java.lang.String values(int i) {
        byte[] bArr = new byte[i];
        new java.security.SecureRandom().nextBytes(bArr);
        java.lang.String obj = com.nimbusds.jose.util.Base64URL.encode(bArr).toString();
        int i2 = getHighSpeedVideoSizes + 7;
        getInputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.security.KeyPair keyPair) {
        com.nimbusds.jose.JWSObject jWSObject = new com.nimbusds.jose.JWSObject(new com.nimbusds.jose.JWSHeader.Builder(com.nimbusds.jose.JWSAlgorithm.ES256).keyID(str).type(new com.nimbusds.jose.JOSEObjectType("JOSE+ext.crypto_credential")).build(), new com.nimbusds.jose.Payload(str2));
        ((java.security.interfaces.ECPublicKey) keyPair.getPublic()).getW().getAffineX().toByteArray();
        ((java.security.interfaces.ECPublicKey) keyPair.getPublic()).getW().getAffineY().toByteArray();
        try {
            jWSObject.sign(new com.nimbusds.jose.crypto.ECDSASigner(new com.nimbusds.jose.jwk.ECKey.Builder(com.nimbusds.jose.jwk.Curve.P_256, (java.security.interfaces.ECPublicKey) keyPair.getPublic()).privateKey(keyPair.getPrivate()).build()));
            java.lang.String serialize = jWSObject.serialize();
            int i = getHighSpeedVideoSizes + 39;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                return serialize;
            }
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.String str3 = Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("createJws error: ");
            sb.append(e.getMessage());
            com.visa.cbp.setVtsCerts.getTvls(str3, sb.toString());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r18.getAuthData().getServerNonce() != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.visa.cbp.getDeviceType ReplenishAckRequest(com.visa.cbp.sdk.facade.LoginResponse loginResponse, java.lang.String str, java.lang.String str2) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
        java.security.PublicKey generatePublic;
        if (loginResponse == null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.setTvls);
        }
        if (loginResponse.getAccessToken() != null) {
            int i = getHighSpeedVideoSizes + 109;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                if (loginResponse.getAuthData() != null && ((loginResponse.getAuthData() == null || loginResponse.getAuthData().getMacTag() != null) && (loginResponse.getAuthData() == null || loginResponse.getAuthData().getNonce() != null))) {
                    if (loginResponse.getAuthData() != null) {
                        getInputFormats = (getHighSpeedVideoSizes + 117) % 128;
                    }
                    if (str2 == null || str2.length() == 0) {
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.ReplenishRequest);
                    }
                    if (loginResponse.getSubject_auth_status().get(0).equals("AUTHENTICATED")) {
                        if (this.getOutputSizes != null) {
                            getOutputStallDurationlomOqCM = loginResponse.getAccessToken();
                            java.lang.String serverNonce = loginResponse.getAuthData().getServerNonce();
                            java.security.PrivateKey privateKey = this.getOutputSizes.getPrivate();
                            java.security.PublicKey publicKey = this.getOutputSizes.getPublic();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes((char) android.graphics.Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", 1265280195 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\uf683\uf425\uf8d1정ὃ硝櫧ꓟ뎢䭎鱒\uea47滔櫳箅줯ᾷ薸\uf4adᨒ몚ᗮ焱\ue45a帠\u1777\udc0aꟿ\udefc阺㬈\ua958\ueb19\ua8da㲛ꀈ℻蝖訹刵㇛쀂䅈㳔ꎗ伳鸳䈸\uf269\uf66b䝑稜긔蕵\ue4e2㳊\udf5e䂙Ꞹﰋ❅剴\ud9b5㣎凶ꀾΌ载央၄ׅ죗᪕豌䲶⨖䂌岵뒮裵渏餳\uf80f嘿摽㓙浃崾갩ꨘ聢\uf4f0搗峔侧쓊㮡盨鋨㘜쾎㇏㥞\uf59e泺绩흾퇘\udc0c㳕밚ꌌᯗ듳篪姻\u177a෩껕鷽ݛ\uf34e螇\uf4b9辟쭌⚭ᮂ黷ጼ腎\udeb8웷\uf815ࢂ쓏䏬県巋䈲\ue072漘캨ϸ᮸뱚燢鴜௬\udc3b⻈흹쥪㯕짉餈쌵∣倡ઑꉽ喠↢ᖬ刐蘹랎躅酐蠜\uf38b\uecc3㣬い⡱숑尖", "썮檤Ὃ\ueeee", objArr);
                            try {
                                generatePublic = java.security.KeyFactory.getInstance("EC").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(((java.lang.String) objArr[0]).intern().replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, ""), 0)));
                            } catch (java.security.NoSuchAlgorithmException e) {
                                getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(e));
                            } catch (java.lang.Exception e2) {
                                getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(e2));
                            }
                            if (privateKey != null && generatePublic != null) {
                                getOutputFormats = new com.visa.cbp.getDeviceType(com.visa.cbp.getDeviceIDType.ReplenishAckRequest(privateKey, generatePublic), valueOf.getSignature());
                                java.lang.String valueOf2 = new com.visa.cbp.setOsVersion().valueOf(publicKey, getOutputFormats.valueOf(), valueOf.getSignature(), str, serverNonce);
                                getOutputFormats.ReplenishAckRequest(null);
                                if (valueOf2 != null) {
                                    if (loginResponse.getAuthData().getMacTag().equalsIgnoreCase(valueOf2)) {
                                        getHighSpeedVideoFpsRangesFor(false, null);
                                        return getOutputFormats;
                                    }
                                    getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getContactName));
                                    getInputFormats = (getHighSpeedVideoSizes + 51) % 128;
                                } else {
                                    getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContactEmail));
                                }
                            } else {
                                getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getLabelColor));
                            }
                        } else {
                            getHighSpeedVideoFpsRangesFor(true, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCause));
                        }
                    }
                    return null;
                }
            } else {
                loginResponse.getAuthData();
                throw new java.lang.ArithmeticException();
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse);
    }

    public java.lang.String values(com.visa.cbp.sdk.facade.GetServerNonceResponse getServerNonceResponse) {
        int i = getInputFormats + 97;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (getServerNonceResponse != null) {
            java.lang.String jwsServerData = getServerNonceResponse.getJwsServerData();
            int i2 = getInputFormats + 79;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return jwsServerData;
            }
            throw null;
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.setTokenInfo);
    }

    public void ConfirmReplenishRequest(android.content.Context context, java.lang.String str, final com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback deviceAttestationCallback) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 93;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (context == null) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getSignature);
        }
        if (str != null) {
            getInputFormats = (i + 113) % 128;
            if (str.length() != 0) {
                if (deviceAttestationCallback == null) {
                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.setEncryptionMetaData);
                }
                com.visa.cbp.sdk.facade.SNWrapper sNWrapper = com.visa.cbp.sdk.facade.SNWrapper.getInstance(context);
                if (sNWrapper != null) {
                    sNWrapper.deviceAttestation(new com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback() { // from class: com.visa.cbp.getCertFormat.2
                        @Override // com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback
                        public void onResult(int i3, java.lang.String str2) {
                            java.lang.String Camera2StreamConfigurationMap2 = com.visa.cbp.getCertFormat.Camera2StreamConfigurationMap();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Device Attestation result:\n");
                            sb.append(str2);
                            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                            com.visa.cbp.setVtsCerts.getTvls(Camera2StreamConfigurationMap2, sb.toString());
                            deviceAttestationCallback.onResult(i3, str2);
                        }

                        @Override // com.visa.cbp.sdk.facade.DASService.DeviceAttestationCallback
                        public void onError(int i3, java.lang.Exception exc) {
                            deviceAttestationCallback.onError(i3, exc);
                        }
                    }, str);
                    return;
                }
                com.visa.cbp.setVtsCerts.getTvls(Camera2StreamConfigurationMap, com.visa.cbp.setDeviceCerts.CardMetadataUpdate.valueOf());
                deviceAttestationCallback.onError(4000, new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCardData));
                getInputFormats = (getHighSpeedVideoSizes + 37) % 128;
                return;
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getTokenInfo);
    }

    public com.visa.cbp.sdk.facade.ValidateDeviceRequest valueOf(java.lang.String str, java.lang.String str2) {
        int i = getHighSpeedVideoSizes + 87;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            if (str == null || str.length() == 0) {
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.getEncryptionMetaData);
            }
            if (str2 != null) {
                int i2 = getInputFormats + 5;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    if (str2.length() != 0) {
                        com.visa.cbp.sdk.facade.ValidateDeviceRequest validateDeviceRequest = new com.visa.cbp.sdk.facade.ValidateDeviceRequest();
                        validateDeviceRequest.setJwsDevicePayload(str2);
                        validateDeviceRequest.setJwsServerData(str);
                        return validateDeviceRequest;
                    }
                } else {
                    throw null;
                }
            }
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.ReplenishResponse, com.visa.cbp.setFirstName.ReplenishResponse);
        }
        throw null;
    }

    public void BuildConfig(com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse validateDeviceAndGetKramResponse) {
        if (validateDeviceAndGetKramResponse != null && validateDeviceAndGetKramResponse.getEncKeyRam() != null) {
            int i = getHighSpeedVideoSizes + 105;
            getInputFormats = i % 128;
            if (i % 2 != 0) {
                validateDeviceAndGetKramResponse.getEncKeyRam();
                throw null;
            }
            if (validateDeviceAndGetKramResponse.getEncKeyRam().length() > 0) {
                getInputFormats = (getHighSpeedVideoSizes + 65) % 128;
                if (values(validateDeviceAndGetKramResponse.getEncKeyRam())) {
                    byte[] bytes = validateDeviceAndGetKramResponse.getEncKeyRam().getBytes();
                    getHighSpeedVideoFpsRangesFor = bytes;
                    java.lang.String str = Camera2StreamConfigurationMap;
                    com.visa.cbp.setVtsCerts.getTvls(str, "INSIDE processValidateDeviceAndGetKramResponse: ".concat(new java.lang.String(bytes)));
                    com.visa.cbp.setVtsCerts.getTvls(str, "INSIDE processValidateDeviceAndGetKramResponse: ".concat(new java.lang.String(ReplenishAckRequest())));
                    int i2 = getInputFormats + 119;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCardMetaData);
    }

    public void BuildConfig(com.visa.cbp.sdk.facade.KeyRamResponse keyRamResponse) {
        if (keyRamResponse != null) {
            getHighSpeedVideoSizes = (getInputFormats + 103) % 128;
            if (keyRamResponse.getEncKeyRam() != null) {
                getInputFormats = (getHighSpeedVideoSizes + 109) % 128;
                if (keyRamResponse.getEncKeyRam().length() > 0) {
                    getInputFormats = (getHighSpeedVideoSizes + 71) % 128;
                    if (values(keyRamResponse.getEncKeyRam())) {
                        byte[] bytes = keyRamResponse.getEncKeyRam().getBytes();
                        getHighSpeedVideoFpsRangesFor = bytes;
                        java.lang.String str = Camera2StreamConfigurationMap;
                        com.visa.cbp.setVtsCerts.getTvls(str, "INSIDE processGetKramResponse: ".concat(new java.lang.String(bytes)));
                        com.visa.cbp.setVtsCerts.getTvls(str, "INSIDE processGetKramResponse: ".concat(new java.lang.String(ReplenishAckRequest())));
                        return;
                    }
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getPaymentInstrument);
    }

    public boolean values(java.lang.String str) {
        if (!com.nimbusds.jose.JWSObject.parse(str).verify(new com.nimbusds.jose.crypto.MACVerifier(ConfirmReplenishRequest().BuildConfig()))) {
            com.visa.cbp.setVtsCerts.getTvls(Camera2StreamConfigurationMap, "processValidateDeviceAndGetKramResponse: NOT Verified");
            getInputFormats = (getHighSpeedVideoSizes + 99) % 128;
            return false;
        }
        int i = getInputFormats + 29;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            com.visa.cbp.setVtsCerts.getTvls(Camera2StreamConfigurationMap, "processValidateDeviceAndGetKramResponse: Verified");
            return false;
        }
        com.visa.cbp.setVtsCerts.getTvls(Camera2StreamConfigurationMap, "processValidateDeviceAndGetKramResponse: Verified");
        return true;
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z, com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
        int i = (getInputFormats + 63) % 128;
        getHighSpeedVideoSizes = i;
        this.getOutputSizes = null;
        if (z) {
            getInputFormats = (i + 103) % 128;
            throw visaPaymentSDKException;
        }
    }

    private com.visa.cbp.sdk.facade.JwsAttestationResult getHighSpeedVideoSizes(java.lang.String str) {
        com.visa.cbp.sdk.facade.JwsAttestationResult jwsAttestationResult = (com.visa.cbp.sdk.facade.JwsAttestationResult) new com.google.gson.Gson().fromJson(new java.lang.String(android.util.Base64.decode(str.split("[.]")[1], 8)), com.visa.cbp.sdk.facade.JwsAttestationResult.class);
        int i = getInputFormats + 57;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return jwsAttestationResult;
        }
        throw null;
    }

    private static void getHighSpeedVideoSizes(char c, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i2 + 97) % 128;
        getHighSpeedVideoFpsRanges = (i2 + 75) % 128;
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
        char[] charArray2 = str2.toCharArray();
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = (i3 + 55) % 128;
        getHighSpeedVideoFpsRanges = (i3 + 25) % 128;
        char[] charArray3 = str.toCharArray();
        com.visa.cbp.AidInfo aidInfo = new com.visa.cbp.AidInfo();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        aidInfo.valueOf = 0;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        while (aidInfo.valueOf < length3) {
            try {
                java.lang.Object[] objArr2 = {aidInfo};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1983273232);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.indexOf("", "", 0), 2000 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.os.Process.getGidForName("") + 30)).getMethod("D", java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1983273232, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                try {
                    java.lang.Object[] objArr3 = {aidInfo};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1725818816);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.red(0), 177 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26);
                        byte[] bArr = new byte[1];
                        bArr[0] = (byte) ($$a != null ? 67 : -63);
                        java.lang.String str4 = new java.lang.String(bArr, 0);
                        java.lang.String str5 = str4;
                        obj2 = cls.getMethod(str4, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1725818816, obj2);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    try {
                        java.lang.Object[] objArr4 = {aidInfo, java.lang.Integer.valueOf(cArr[aidInfo.valueOf % 4] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1422457014);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 99, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 26)).getMethod("A", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1422457014, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                        try {
                            java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(cArr[intValue2] * 32718), java.lang.Integer.valueOf(cArr2[intValue])};
                            java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(894413753);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 30832), (android.os.Process.myPid() >> 22) + 1971, 28 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod(com.visa.cbp.getEncExpo.warmup, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(894413753, obj4);
                            }
                            cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).charValue();
                            cArr[intValue2] = aidInfo.BuildConfig;
                            cArr3[aidInfo.valueOf] = (char) ((((int) (getOutputMinFrameDuration ^ 1527987341865046008L)) ^ ((cArr[intValue2] ^ r1[aidInfo.valueOf]) ^ (getInputSizeshNQ4ISI ^ 1527987341865046008L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 1527987341865046008L)));
                            aidInfo.valueOf++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        java.lang.String str6 = new java.lang.String(cArr3);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 119) % 128;
        objArr[0] = str6;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        $$a = new byte[]{70, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 35};
        $$b = 34;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = -22551666;
        getHighSpeedVideoSizesFor = (char) 53240;
        getInputSizeshNQ4ISI = 1527987341865046008L;
    }
}
