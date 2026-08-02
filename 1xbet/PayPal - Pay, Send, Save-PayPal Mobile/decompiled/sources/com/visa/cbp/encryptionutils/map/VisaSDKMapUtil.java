package com.visa.cbp.encryptionutils.map;

/* loaded from: classes16.dex */
public final class VisaSDKMapUtil {
    @java.lang.Deprecated
    public static com.visa.cbp.encryptionutils.common.EncDevicePersoData getEncryptedDevicePersoData(com.visa.cbp.encryptionutils.common.DevicePersoData devicePersoData) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        try {
            return getEncryptedDevicePersoData(com.visa.cbp.encryptionutils.common.Util.getByteOutputStream(com.visa.cbp.encryptionutils.map.VisaSDKMapUtil.class, "abk_pubkey.pem"), devicePersoData);
        } catch (java.io.IOException e) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        }
    }

    /* renamed from: com.visa.cbp.encryptionutils.map.VisaSDKMapUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.visa.cbp.encryptionutils.common.EncryptionEnvironment.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.visa.cbp.encryptionutils.common.EncryptionEnvironment.SBX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.visa.cbp.encryptionutils.common.EncryptionEnvironment.PROD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.visa.cbp.encryptionutils.common.EncryptionEnvironment.CEMA_PROD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static com.visa.cbp.encryptionutils.common.EncDevicePersoData getEncryptedDevicePersoData(com.visa.cbp.encryptionutils.common.EncryptionEnvironment encryptionEnvironment, com.visa.cbp.encryptionutils.common.DevicePersoData devicePersoData) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        java.lang.String str;
        int i = com.visa.cbp.encryptionutils.map.VisaSDKMapUtil.AnonymousClass1.getHighSpeedVideoFpsRanges[encryptionEnvironment.ordinal()];
        if (i == 1) {
            str = "abk_sbx_pubkey.pem";
        } else if (i == 2) {
            str = "abk_prd_pubkey.pem";
        } else {
            str = i != 3 ? "abk_pubkey.pem" : "abk_prd_cema_pubkey.pem";
        }
        try {
            if (!com.visa.cbp.encryptionutils.map.VisaSDKMapUtil.class.getClassLoader().getResources(str).hasMoreElements()) {
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_936.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_936.getMessage());
            }
            return getEncryptedDevicePersoData(com.visa.cbp.encryptionutils.common.Util.getByteOutputStream(com.visa.cbp.encryptionutils.map.VisaSDKMapUtil.class, str), devicePersoData);
        } catch (java.io.IOException e) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        }
    }

    public static com.visa.cbp.encryptionutils.common.EncDevicePersoData getEncryptedDevicePersoData(java.io.ByteArrayOutputStream byteArrayOutputStream, com.visa.cbp.encryptionutils.common.DevicePersoData devicePersoData) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        java.lang.String str;
        if (devicePersoData != null) {
            com.visa.cbp.encryptionutils.common.Util.validateInput("mapKey", devicePersoData.getMapKey(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_905);
            com.visa.cbp.encryptionutils.common.Util.validateInput("mapSalt", 43, devicePersoData.getMapSalt(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_904);
            com.visa.cbp.encryptionutils.common.Util.validateInput("deviceSalt", 32, devicePersoData.getDeviceSalt(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_903);
            com.visa.cbp.encryptionutils.common.Util.validateInput("deviceId", 24, devicePersoData.getDeviceId(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_901);
            com.visa.cbp.encryptionutils.common.Util.validateInput("walletAccountId", devicePersoData.getWalletAccountId(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_902);
            com.visa.cbp.encryptionutils.common.Util.validateInput("ServerEntropy", 36, devicePersoData.getServerEntropy(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_908);
            com.visa.cbp.encryptionutils.common.Util.validateInput("encCert", devicePersoData.getEncCert(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_906);
            com.visa.cbp.encryptionutils.common.Util.validateInput("EncExpoHex", devicePersoData.getEncExpoHex(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_907);
            try {
                getHighSpeedVideoSizes(new java.lang.String(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Decode(devicePersoData.getEncCert())), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_920);
                if (devicePersoData.getSignCert() != null) {
                    getHighSpeedVideoSizes(new java.lang.String(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Decode(devicePersoData.getSignCert())), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_921);
                }
                com.visa.cbp.encryptionutils.common.EncDevicePersoData encDevicePersoData = new com.visa.cbp.encryptionutils.common.EncDevicePersoData();
                byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(devicePersoData.getMapKey(), devicePersoData.getDeviceSalt(), devicePersoData.getDeviceId(), devicePersoData.getWalletAccountId());
                try {
                    if (byteArrayOutputStream == null) {
                        throw new com.visa.cbp.encryptionutils.exceptions.InvalidInputException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_912.getMessage());
                    }
                    byte[] generateSalt = com.visa.dmpd.encryption.GenericEncryptionUtility.generateSalt(12);
                    com.visa.dmpd.encryption.GenericEncryptionUtility.CipherTextData encryptData = com.visa.dmpd.encryption.GenericEncryptionUtility.encryptData(highSpeedVideoFpsRangesFor, generateSalt, devicePersoData.getEncExpoHex().getBytes("UTF-8"), (byte[]) null);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(encryptData.getCipherText());
                    sb.append(".");
                    sb.append(encryptData.getAuthTag());
                    sb.append(".");
                    sb.append(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Encode(generateSalt));
                    java.lang.String obj = sb.toString();
                    if (devicePersoData.getSignExpoHex() != null) {
                        byte[] generateSalt2 = com.visa.dmpd.encryption.GenericEncryptionUtility.generateSalt(12);
                        com.visa.dmpd.encryption.GenericEncryptionUtility.CipherTextData encryptData2 = com.visa.dmpd.encryption.GenericEncryptionUtility.encryptData(highSpeedVideoFpsRangesFor, generateSalt2, devicePersoData.getSignExpoHex().getBytes("UTF-8"), (byte[]) null);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(encryptData2.getCipherText());
                        sb2.append(".");
                        sb2.append(encryptData2.getAuthTag());
                        sb2.append(".");
                        sb2.append(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Encode(generateSalt2));
                        str = sb2.toString();
                    } else {
                        str = null;
                    }
                    byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(devicePersoData.getDeviceId(), devicePersoData.getWalletAccountId());
                    java.lang.String createRSAPKIJwe = com.visa.cbp.encryptionutils.common.Util.createRSAPKIJwe(byteArrayOutputStream, getHighSpeedVideoSizes(devicePersoData).toString().getBytes("UTF-8"), devicePersoData.getDeviceId());
                    byte[] generateSalt3 = com.visa.dmpd.encryption.GenericEncryptionUtility.generateSalt(12);
                    com.visa.dmpd.encryption.GenericEncryptionUtility.CipherTextData encryptData3 = com.visa.dmpd.encryption.GenericEncryptionUtility.encryptData(highSpeedVideoFpsRanges, generateSalt3, createRSAPKIJwe.getBytes("UTF-8"), (byte[]) null);
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(encryptData3.getCipherText());
                    sb3.append(".");
                    sb3.append(encryptData3.getAuthTag());
                    sb3.append(".");
                    sb3.append(com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Encode(generateSalt3));
                    java.lang.String obj2 = sb3.toString();
                    encDevicePersoData.setDeviceId(devicePersoData.getDeviceId());
                    encDevicePersoData.setWalletAccountId(devicePersoData.getWalletAccountId());
                    encDevicePersoData.setEncExpo(obj);
                    encDevicePersoData.setSignExpo(str);
                    encDevicePersoData.setEncCert(devicePersoData.getEncCert());
                    encDevicePersoData.setSignCert(devicePersoData.getSignCert());
                    encDevicePersoData.setEncryptedDPM(obj2);
                    return encDevicePersoData;
                } catch (java.io.IOException e) {
                    int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb4.append(e.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb4.toString());
                } catch (java.lang.RuntimeException e2) {
                    int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_899.getCode();
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_899.getMessage());
                    sb5.append(e2.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb5.toString());
                } catch (java.security.InvalidKeyException e3) {
                    int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb6.append(e3.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb6.toString());
                } catch (java.security.NoSuchAlgorithmException e4) {
                    int code4 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getCode();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getMessage());
                    sb7.append(e4.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.NoSuchAlgorithmException(code4, sb7.toString());
                } catch (java.security.NoSuchProviderException e5) {
                    int code5 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getCode();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getMessage());
                    sb8.append(e5.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code5, sb8.toString());
                } catch (java.security.spec.InvalidKeySpecException e6) {
                    int code6 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb9.append(e6.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code6, sb9.toString());
                } catch (javax.crypto.BadPaddingException e7) {
                    int code7 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb10.append(e7.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code7, sb10.toString());
                } catch (javax.crypto.IllegalBlockSizeException e8) {
                    int code8 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                    sb11.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb11.append(e8.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code8, sb11.toString());
                } catch (javax.crypto.NoSuchPaddingException e9) {
                    int code9 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getCode();
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_913.getMessage());
                    sb12.append(e9.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code9, sb12.toString());
                }
            } catch (org.bouncycastle.util.encoders.DecoderException unused) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
            }
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_911.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_911.getMessage());
    }

    private static com.visa.cbp.encryptionutils.common.DPM getHighSpeedVideoSizes(com.visa.cbp.encryptionutils.common.DevicePersoData devicePersoData) {
        com.visa.cbp.encryptionutils.common.DPM dpm = new com.visa.cbp.encryptionutils.common.DPM();
        dpm.setDeviceID(devicePersoData.getDeviceId());
        dpm.setWalletAccountID(devicePersoData.getWalletAccountId());
        dpm.setDeviceSalt(devicePersoData.getDeviceSalt());
        dpm.setMapSalt(devicePersoData.getMapSalt());
        dpm.setVServerNonce(devicePersoData.getServerEntropy());
        try {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(12, 8);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MMM-dd HH:mm:ssZ");
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            dpm.setIat(java.lang.String.valueOf(simpleDateFormat.parse(simpleDateFormat.format(calendar.getTime())).getTime()));
            return dpm;
        } catch (java.text.ParseException e) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_914.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_914.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, com.visa.cbp.encryptionutils.exceptions.ErrorType errorType) {
        try {
            new org.bouncycastle.util.io.pem.PemReader(new java.io.StringReader(str)).readPemObject();
        } catch (java.io.IOException e) {
            int code = errorType.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(errorType.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        } catch (java.security.cert.CertificateExpiredException e2) {
            int code2 = errorType.getCode();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(errorType.getMessage());
            sb2.append(e2.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
        } catch (java.security.cert.CertificateNotYetValidException e3) {
            int code3 = errorType.getCode();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(errorType.getMessage());
            sb3.append(e3.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb3.toString());
        }
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        try {
            byte[] bs64Decode = com.visa.dmpd.encryption.GenericEncryptionUtility.bs64Decode(str);
            byte[] bytes = str2.getBytes("UTF-8");
            byte[] bytes2 = str3.getBytes("UTF-8");
            byte[] bytes3 = str4.getBytes("UTF-8");
            int length = bs64Decode.length;
            int length2 = bytes.length;
            byte[] bArr = new byte[length + length2 + bytes2.length + bytes3.length];
            java.lang.System.arraycopy(bs64Decode, 0, bArr, 0, bs64Decode.length);
            java.lang.System.arraycopy(bytes, 0, bArr, bs64Decode.length, bytes.length);
            java.lang.System.arraycopy(bytes2, 0, bArr, bytes.length + bs64Decode.length, bytes2.length);
            java.lang.System.arraycopy(bytes3, 0, bArr, bytes2.length + bytes.length + bs64Decode.length, bytes3.length);
            return com.visa.cbp.encryptionutils.common.Util.sha256(bArr);
        } catch (java.io.UnsupportedEncodingException e) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        } catch (java.lang.IndexOutOfBoundsException e2) {
            int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_915.getCode();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_915.getMessage());
            sb2.append(e2.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
        } catch (java.security.NoSuchAlgorithmException e3) {
            int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getCode();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getMessage());
            sb3.append(e3.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb3.toString());
        } catch (org.bouncycastle.util.encoders.DecoderException unused) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bytes2 = str2.getBytes("UTF-8");
            byte[] bArr = new byte[bytes.length + bytes2.length];
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            java.lang.System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
            return com.visa.cbp.encryptionutils.common.Util.sha256(bArr);
        } catch (java.io.UnsupportedEncodingException e) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getMessage());
            sb.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
        } catch (java.lang.IndexOutOfBoundsException e2) {
            int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_916.getCode();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_916.getMessage());
            sb2.append(e2.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
        } catch (java.security.NoSuchAlgorithmException e3) {
            int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getCode();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getMessage());
            sb3.append(e3.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb3.toString());
        }
    }

    public static com.visa.cbp.encryptionutils.common.DeviceKeyPair generateDeviceKeyPair(java.lang.String str, org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        com.visa.cbp.encryptionutils.common.Util.validateInput("deviceId", 24, str, com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_901);
        if (x500Name != null) {
            com.visa.cbp.encryptionutils.common.Util.validateInput("csrSubject", x500Name.toString(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_922);
            getHighSpeedVideoFpsRangesFor(certMetaData);
            if (privateKey == null) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_934.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_934.getMessage());
            }
            try {
                return com.visa.cbp.encryptionutils.common.Util.generateDeviceKeyPair(str, x500Name, certMetaData, privateKey);
            } catch (java.io.IOException e) {
                int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb.append(e.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
            } catch (java.security.InvalidKeyException e2) {
                int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb2.append(e2.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
            } catch (java.security.NoSuchAlgorithmException e3) {
                int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getCode();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getMessage());
                sb3.append(e3.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.NoSuchAlgorithmException(code3, sb3.toString());
            } catch (java.security.NoSuchProviderException e4) {
                int code4 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getCode();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getMessage());
                sb4.append(e4.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code4, sb4.toString());
            } catch (java.security.SignatureException e5) {
                int code5 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb5.append(e5.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code5, sb5.toString());
            } catch (java.security.cert.CertificateException e6) {
                int code6 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb6.append(e6.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code6, sb6.toString());
            } catch (javax.security.cert.CertificateException e7) {
                int code7 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb7.append(e7.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code7, sb7.toString());
            } catch (org.bouncycastle.operator.OperatorCreationException e8) {
                int code8 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
                sb8.append(e8.getLocalizedMessage());
                throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code8, sb8.toString());
            } catch (org.bouncycastle.util.encoders.DecoderException unused) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
            }
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_922.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_922.getMessage());
    }

    public static java.lang.String generateDeviceCertificate(org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey, byte[] bArr) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        return generateDeviceCertificate(x500Name, certMetaData, privateKey, bArr, "SHA1WITHRSAENCRYPTION");
    }

    public static java.lang.String generateDeviceCertificate(org.bouncycastle.asn1.x500.X500Name x500Name, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData, java.security.PrivateKey privateKey, byte[] bArr, java.lang.String str) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        if (x500Name == null) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_922.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_922.getMessage());
        }
        getHighSpeedVideoFpsRangesFor(certMetaData);
        if (privateKey == null) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_934.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_934.getMessage());
        }
        if (!str.equalsIgnoreCase("SHA1WITHRSAENCRYPTION") && !str.equalsIgnoreCase("SHA256withRSA")) {
            int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_935.getMessage());
            sb.append(str);
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(code, sb.toString());
        }
        try {
            return com.visa.cbp.encryptionutils.common.Util.generateDeviceCertificate(x500Name, certMetaData, privateKey, bArr, str);
        } catch (java.io.IOException e) {
            int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb2.append(e.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
        } catch (java.security.InvalidKeyException e2) {
            int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb3.append(e2.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb3.toString());
        } catch (java.security.NoSuchAlgorithmException e3) {
            int code4 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getCode();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_909.getMessage());
            sb4.append(e3.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.NoSuchAlgorithmException(code4, sb4.toString());
        } catch (java.security.NoSuchProviderException e4) {
            int code5 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getCode();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_910.getMessage());
            sb5.append(e4.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code5, sb5.toString());
        } catch (java.security.SignatureException e5) {
            int code6 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb6.append(e5.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code6, sb6.toString());
        } catch (java.security.cert.CertificateException e6) {
            int code7 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb7.append(e6.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code7, sb7.toString());
        } catch (javax.security.cert.CertificateException e7) {
            int code8 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb8.append(e7.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code8, sb8.toString());
        } catch (org.bouncycastle.operator.OperatorCreationException e8) {
            int code9 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getCode();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_917.getMessage());
            sb9.append(e8.getLocalizedMessage());
            throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code9, sb9.toString());
        } catch (org.bouncycastle.util.encoders.DecoderException unused) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(com.visa.cbp.encryptionutils.common.CertMetaData certMetaData) {
        if (certMetaData != null) {
            if (certMetaData.getIssuer() != null) {
                com.visa.cbp.encryptionutils.common.Util.validateInput("issuer", certMetaData.getIssuer().toString(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_924);
                if (certMetaData.getSubject() != null) {
                    com.visa.cbp.encryptionutils.common.Util.validateInput("subject", certMetaData.getSubject().toString(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_925);
                    com.visa.cbp.encryptionutils.common.Util.validateInput("serial", certMetaData.getSerial(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_928);
                    getHighSpeedVideoSizes(certMetaData.getNotBefore(), certMetaData.getNotAfter());
                    return;
                }
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_925.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_925.getMessage());
            }
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_924.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_924.getMessage());
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_923.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_923.getMessage());
    }

    private static void getHighSpeedVideoSizes(long j, long j2) {
        java.util.Date date = new java.util.Date(j * 1000);
        java.util.Date date2 = new java.util.Date(j2 * 1000);
        java.util.Date date3 = new java.util.Date();
        if (date.before(date3)) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_926.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_926.getMessage());
        }
        if (date2.before(date3)) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_927.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_927.getMessage());
        }
        if (date2.before(date)) {
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_932.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_932.getMessage());
        }
    }

    public static java.security.cert.X509Certificate getSelfSignedCert(java.security.KeyPair keyPair, com.visa.cbp.encryptionutils.common.CertMetaData certMetaData) throws com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException {
        getHighSpeedVideoFpsRangesFor(certMetaData);
        if (keyPair != null) {
            if (keyPair.getPrivate() == null) {
                throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_930.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_930.getMessage());
            }
            if (keyPair.getPublic() != null) {
                try {
                    java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier find = new org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder().find("SHA256withRSA");
                    org.bouncycastle.asn1.x509.AlgorithmIdentifier find2 = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder().find(find);
                    org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey = org.bouncycastle.crypto.util.PrivateKeyFactory.createKey(keyPair.getPrivate().getEncoded());
                    return (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(new org.bouncycastle.cert.X509v3CertificateBuilder(certMetaData.getIssuer(), new java.math.BigInteger(certMetaData.getSerial()), new java.util.Date(certMetaData.getNotBefore()), new java.util.Date(certMetaData.getNotAfter()), certMetaData.getSubject(), org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded())).build(new org.bouncycastle.operator.bc.BcRSAContentSignerBuilder(find, find2).build(createKey)).toASN1Structure().getEncoded()));
                } catch (java.io.IOException e) {
                    int code = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getCode();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getMessage());
                    sb.append(e.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code, sb.toString());
                } catch (java.security.cert.CertificateException e2) {
                    int code2 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getCode();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getMessage());
                    sb2.append(e2.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code2, sb2.toString());
                } catch (org.bouncycastle.operator.OperatorCreationException e3) {
                    int code3 = com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getCode();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_918.getMessage());
                    sb3.append(e3.getLocalizedMessage());
                    throw new com.visa.cbp.encryptionutils.exceptions.VisaSDKMapUtilException(code3, sb3.toString());
                } catch (org.bouncycastle.util.encoders.DecoderException unused) {
                    throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_933.getMessage());
                }
            }
            throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_931.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_931.getMessage());
        }
        throw new com.visa.cbp.encryptionutils.exceptions.InputValidationException(com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_929.getCode(), com.visa.cbp.encryptionutils.exceptions.ErrorType.ERROR_929.getMessage());
    }
}
