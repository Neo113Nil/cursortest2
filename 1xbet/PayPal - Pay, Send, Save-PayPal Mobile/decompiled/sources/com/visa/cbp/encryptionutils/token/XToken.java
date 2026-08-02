package com.visa.cbp.encryptionutils.token;

/* loaded from: classes16.dex */
public final class XToken {
    public static final java.lang.String BLOW_FISH_PREFIX = "enc.";
    private static final java.security.Provider getHighSpeedVideoFpsRanges = new org.bouncycastle.jce.provider.BouncyCastleProvider();

    public enum Validation {
        SUCCESS,
        FAILURE,
        EXPIRED,
        CONTENT_SHA2_MATCH_FAIL,
        HEADERS_SHA2_MATCH_FAIL,
        XTOKEN_SIGNATURE_MATCH_FAIL
    }

    public static final java.lang.String generate(java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        try {
            getHighResolutionOutputSizeshNQ4ISI("authenticationSecret", str);
            getHighResolutionOutputSizeshNQ4ISI("apiName", str2);
            getHighResolutionOutputSizeshNQ4ISI("timestamp", l);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
            sb.append(l);
            sb.append(str2);
            sb.append((map == null || map.isEmpty()) ? "" : getHighSpeedVideoFpsRangesFor(map));
            if (str3 != null && !"".equals(str3)) {
                sb.append(str3);
            }
            java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("SHA-256", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("x:");
            sb2.append(l);
            sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb2.append(Camera2StreamConfigurationMap);
            return sb2.toString();
        } catch (com.visa.cbp.encryptionutils.exceptions.TokenException e) {
            throw e;
        } catch (java.io.UnsupportedEncodingException e2) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken: UnsupportedEncodingException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e2);
        } catch (java.security.SignatureException e3) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken: SignatureException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e3);
        }
    }

    public static final java.lang.String generateV2(java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        try {
            getHighResolutionOutputSizeshNQ4ISI("authenticationSecret", str);
            getHighResolutionOutputSizeshNQ4ISI("apiName", str2);
            getHighResolutionOutputSizeshNQ4ISI("timestamp", l);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.Long.toString(l.longValue()));
            sb.append(str2);
            sb.append((map == null || map.isEmpty()) ? "" : getHighSpeedVideoFpsRangesFor(map));
            if (str3 != null && !"".equals(str3)) {
                sb.append(str3);
            }
            java.lang.String computeHmacBase16 = com.visa.dmpd.encryption.GenericEncryptionUtility.computeHmacBase16(org.jose4j.mac.MacUtil.HMAC_SHA256, str, sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("xv2:");
            sb2.append(l);
            sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb2.append(computeHmacBase16);
            return sb2.toString();
        } catch (com.visa.cbp.encryptionutils.exceptions.TokenException e) {
            throw e;
        } catch (java.io.UnsupportedEncodingException e2) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken: UnsupportedEncodingException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e2);
        } catch (java.security.InvalidKeyException e3) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken: InvalidKeyException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e3);
        } catch (java.security.NoSuchAlgorithmException e4) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken: NoSuchAlgorithmException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e4);
        }
    }

    public static final com.visa.cbp.encryptionutils.token.XToken.Validation validate(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4, java.lang.Long l) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        java.lang.String str5;
        java.lang.String generateV2;
        try {
            getHighResolutionOutputSizeshNQ4ISI("xToken", str4);
            getHighResolutionOutputSizeshNQ4ISI("TimeToLive", l);
            java.lang.String lowerCase = str4.toLowerCase();
            java.lang.String[] split = lowerCase.split(io.ktor.sse.ServerSentEventKt.COLON);
            if (split.length == 3 && (str5 = split[1]) != null) {
                try {
                    long longValue = java.lang.Long.valueOf(str5).longValue();
                    if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - longValue) > l.longValue()) {
                        return com.visa.cbp.encryptionutils.token.XToken.Validation.EXPIRED;
                    }
                    if ("x".equalsIgnoreCase(split[0])) {
                        generateV2 = generate(str, java.lang.Long.valueOf(longValue), str2, map, str3);
                    } else {
                        generateV2 = "xv2".equalsIgnoreCase(split[0]) ? generateV2(str, java.lang.Long.valueOf(longValue), str2, map, str3) : null;
                    }
                    if (lowerCase.equals(generateV2)) {
                        return com.visa.cbp.encryptionutils.token.XToken.Validation.SUCCESS;
                    }
                } catch (java.lang.NumberFormatException unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("XToken: invalid timestamp format in xtoken: ");
                    sb.append(lowerCase);
                    throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                }
            }
            return com.visa.cbp.encryptionutils.token.XToken.Validation.FAILURE;
        } catch (com.visa.cbp.encryptionutils.exceptions.TokenException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error validating xToken.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: Exception -> 0x00fe, IOException -> 0x0109, InvalidKeyException -> 0x0114, NoSuchAlgorithmException -> 0x011f, SignatureException -> 0x012a, TokenException -> 0x0135, TryCatch #2 {TokenException -> 0x0135, IOException -> 0x0109, InvalidKeyException -> 0x0114, NoSuchAlgorithmException -> 0x011f, SignatureException -> 0x012a, Exception -> 0x00fe, blocks: (B:2:0x0000, B:4:0x0016, B:8:0x0022, B:10:0x0028, B:12:0x0036, B:13:0x003c, B:15:0x0050, B:17:0x0058, B:18:0x005f, B:20:0x0064, B:21:0x0067, B:22:0x009e, B:24:0x00a4, B:26:0x00ad, B:30:0x00da, B:31:0x00f3, B:32:0x00f4, B:33:0x00fd), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[Catch: Exception -> 0x00fe, IOException -> 0x0109, InvalidKeyException -> 0x0114, NoSuchAlgorithmException -> 0x011f, SignatureException -> 0x012a, TokenException -> 0x0135, LOOP:0: B:22:0x009e->B:24:0x00a4, LOOP_END, TryCatch #2 {TokenException -> 0x0135, IOException -> 0x0109, InvalidKeyException -> 0x0114, NoSuchAlgorithmException -> 0x011f, SignatureException -> 0x012a, Exception -> 0x00fe, blocks: (B:2:0x0000, B:4:0x0016, B:8:0x0022, B:10:0x0028, B:12:0x0036, B:13:0x003c, B:15:0x0050, B:17:0x0058, B:18:0x005f, B:20:0x0064, B:21:0x0067, B:22:0x009e, B:24:0x00a4, B:26:0x00ad, B:30:0x00da, B:31:0x00f3, B:32:0x00f4, B:33:0x00fd), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String generateV3(com.visa.cbp.encryptionutils.enums.KeyType keyType, java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        java.lang.String str5;
        java.lang.StringBuilder sb;
        java.io.BufferedInputStream bufferedInputStream;
        try {
            getHighResolutionOutputSizeshNQ4ISI("privateKeyInfo", str);
            getHighResolutionOutputSizeshNQ4ISI("uri", str2);
            getHighResolutionOutputSizeshNQ4ISI("timestamp", l);
            getHighResolutionOutputSizeshNQ4ISI("httpVerb", str4);
            if (keyType == null) {
                throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Key Type is null.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
            }
            if (!keyType.equals(com.visa.cbp.encryptionutils.enums.KeyType.RSA_KEY)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Key Type is unsupported. Key Type : ");
                sb2.append(keyType.toString());
                throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb2.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
            }
            if (map != null && !map.isEmpty()) {
                java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(map);
                if (!highResolutionOutputSizeshNQ4ISI.trim().isEmpty()) {
                    str5 = Camera2StreamConfigurationMap("SHA-256", highResolutionOutputSizeshNQ4ISI);
                    sb = new java.lang.StringBuilder(java.lang.Long.toString(l.longValue()));
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    if (str3 != null && !"".equals(str3)) {
                        sb.append(Camera2StreamConfigurationMap("SHA-256", str3));
                    }
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    if (str5 != null) {
                        sb.append(str5);
                    }
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    sb.append(str2);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    sb.append(str4.toUpperCase());
                    java.security.PrivateKey convertStringToRSAPrivateKey = convertStringToRSAPrivateKey(str);
                    java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA", getHighSpeedVideoFpsRanges);
                    signature.initSign(convertStringToRSAPrivateKey);
                    bufferedInputStream = new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(sb.toString().getBytes(com.visa.dmpd.encryption.GenericEncryptionUtility.utf8)));
                    byte[] bArr = new byte[1024];
                    while (bufferedInputStream.available() != 0) {
                        signature.update(bArr, 0, bufferedInputStream.read(bArr));
                    }
                    bufferedInputStream.close();
                    java.lang.String lowerCase = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(signature.sign()), com.visa.dmpd.encryption.GenericEncryptionUtility.utf8).toLowerCase();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("xv3:");
                    sb3.append(l);
                    sb3.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb3.append(lowerCase);
                    return sb3.toString();
                }
            }
            str5 = null;
            sb = new java.lang.StringBuilder(java.lang.Long.toString(l.longValue()));
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            if (str3 != null) {
                sb.append(Camera2StreamConfigurationMap("SHA-256", str3));
            }
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            if (str5 != null) {
            }
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(str2);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(str4.toUpperCase());
            java.security.PrivateKey convertStringToRSAPrivateKey2 = convertStringToRSAPrivateKey(str);
            java.security.Signature signature2 = java.security.Signature.getInstance("SHA256withRSA", getHighSpeedVideoFpsRanges);
            signature2.initSign(convertStringToRSAPrivateKey2);
            bufferedInputStream = new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(sb.toString().getBytes(com.visa.dmpd.encryption.GenericEncryptionUtility.utf8)));
            byte[] bArr2 = new byte[1024];
            while (bufferedInputStream.available() != 0) {
            }
            bufferedInputStream.close();
            java.lang.String lowerCase2 = new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(signature2.sign()), com.visa.dmpd.encryption.GenericEncryptionUtility.utf8).toLowerCase();
            java.lang.StringBuilder sb32 = new java.lang.StringBuilder("xv3:");
            sb32.append(l);
            sb32.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb32.append(lowerCase2);
            return sb32.toString();
        } catch (com.visa.cbp.encryptionutils.exceptions.TokenException e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : IOException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e2);
        } catch (java.security.InvalidKeyException e3) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : InvalidKeyException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e3);
        } catch (java.security.NoSuchAlgorithmException e4) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : NoSuchAlgorithmException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e4);
        } catch (java.security.SignatureException e5) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : SignatureException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e5);
        } catch (java.lang.Exception e6) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : Exception.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: Exception -> 0x01ab, SignatureException -> 0x01b7, InvalidKeyException -> 0x01c3, NoSuchAlgorithmException -> 0x01cf, TokenException -> 0x01db, TRY_LEAVE, TryCatch #3 {TokenException -> 0x01db, InvalidKeyException -> 0x01c3, NoSuchAlgorithmException -> 0x01cf, SignatureException -> 0x01b7, Exception -> 0x01ab, blocks: (B:3:0x0008, B:5:0x002b, B:9:0x0038, B:11:0x003e, B:13:0x004c, B:14:0x0052, B:16:0x0060, B:22:0x0065, B:23:0x006d, B:25:0x0082, B:27:0x0085, B:29:0x0095, B:31:0x009d, B:32:0x00a6, B:34:0x00ab, B:35:0x00ae, B:37:0x00d6, B:39:0x00f8, B:42:0x00fd, B:45:0x010b, B:47:0x0111, B:50:0x0116, B:53:0x0123, B:55:0x0129, B:60:0x012f, B:61:0x0144, B:18:0x015b, B:19:0x0170, B:64:0x0145, B:65:0x015a, B:66:0x0171, B:67:0x0186, B:69:0x0187, B:70:0x01a0, B:71:0x01a1, B:72:0x01aa), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171 A[Catch: Exception -> 0x01ab, SignatureException -> 0x01b7, InvalidKeyException -> 0x01c3, NoSuchAlgorithmException -> 0x01cf, TokenException -> 0x01db, TryCatch #3 {TokenException -> 0x01db, InvalidKeyException -> 0x01c3, NoSuchAlgorithmException -> 0x01cf, SignatureException -> 0x01b7, Exception -> 0x01ab, blocks: (B:3:0x0008, B:5:0x002b, B:9:0x0038, B:11:0x003e, B:13:0x004c, B:14:0x0052, B:16:0x0060, B:22:0x0065, B:23:0x006d, B:25:0x0082, B:27:0x0085, B:29:0x0095, B:31:0x009d, B:32:0x00a6, B:34:0x00ab, B:35:0x00ae, B:37:0x00d6, B:39:0x00f8, B:42:0x00fd, B:45:0x010b, B:47:0x0111, B:50:0x0116, B:53:0x0123, B:55:0x0129, B:60:0x012f, B:61:0x0144, B:18:0x015b, B:19:0x0170, B:64:0x0145, B:65:0x015a, B:66:0x0171, B:67:0x0186, B:69:0x0187, B:70:0x01a0, B:71:0x01a1, B:72:0x01aa), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.visa.cbp.encryptionutils.token.XToken.Validation validateV3(com.visa.cbp.encryptionutils.enums.KeyType keyType, java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str4, java.lang.String str5) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        java.lang.String str6;
        java.lang.String[] split;
        java.lang.String str7;
        try {
            getHighResolutionOutputSizeshNQ4ISI("xToken", str2);
            getHighResolutionOutputSizeshNQ4ISI("publicKeyinfo", str);
            getHighResolutionOutputSizeshNQ4ISI("TimeToLive", l);
            getHighResolutionOutputSizeshNQ4ISI("uri", str3);
            getHighResolutionOutputSizeshNQ4ISI("httpVerb", str5);
            if (keyType != null) {
                if (!keyType.equals(com.visa.cbp.encryptionutils.enums.KeyType.RSA_KEY)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Key Type is unsupported. Key Type : ");
                    sb.append(keyType.toString());
                    throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                }
                if (map != null && !map.isEmpty()) {
                    java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(map);
                    if (!highResolutionOutputSizeshNQ4ISI.trim().isEmpty()) {
                        str6 = Camera2StreamConfigurationMap("SHA-256", highResolutionOutputSizeshNQ4ISI);
                        java.lang.String lowerCase = str2.toLowerCase();
                        split = lowerCase.split(io.ktor.sse.ServerSentEventKt.COLON);
                        if (split.length == 3) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The input xToken is not in valid format: ");
                            sb2.append(lowerCase);
                            throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb2.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                        }
                        java.lang.String str8 = split[1];
                        if (str8 != null) {
                            try {
                                long longValue = java.lang.Long.valueOf(str8).longValue();
                                if (java.lang.Math.abs((java.lang.System.currentTimeMillis() / 1000) - longValue) > l.longValue()) {
                                    return com.visa.cbp.encryptionutils.token.XToken.Validation.EXPIRED;
                                }
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.Long.toString(longValue));
                                sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                if (str4 == null || "".equals(str4)) {
                                    str7 = null;
                                } else {
                                    str7 = Camera2StreamConfigurationMap("SHA-256", str4);
                                    sb3.append(str7);
                                }
                                sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                if (str6 != null) {
                                    sb3.append(str6);
                                }
                                sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                sb3.append(str3);
                                sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                sb3.append(str5.toUpperCase());
                                byte[] decode = org.bouncycastle.util.encoders.Hex.decode(split[2].getBytes(com.visa.dmpd.encryption.GenericEncryptionUtility.utf8));
                                if (!"xv3".equalsIgnoreCase(split[0])) {
                                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The input xToken is not xv3: ");
                                    sb4.append(lowerCase);
                                    throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb4.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                                }
                                java.security.PublicKey publicKeyFromString = getPublicKeyFromString(str);
                                java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA", getHighSpeedVideoFpsRanges);
                                signature.initVerify(publicKeyFromString);
                                signature.update(sb3.toString().getBytes(com.visa.dmpd.encryption.GenericEncryptionUtility.utf8));
                                if (!signature.verify(decode)) {
                                    return com.visa.cbp.encryptionutils.token.XToken.Validation.XTOKEN_SIGNATURE_MATCH_FAIL;
                                }
                                java.lang.String str9 = map != null ? map.get("x-visa-header-sha2") : null;
                                if (str9 != null && (str6 == null || !str6.equals(str9))) {
                                    return com.visa.cbp.encryptionutils.token.XToken.Validation.HEADERS_SHA2_MATCH_FAIL;
                                }
                                java.lang.String str10 = map != null ? map.get("x-visa-content-sha2") : null;
                                if (str10 != null && (str7 == null || !str10.equals(str7))) {
                                    return com.visa.cbp.encryptionutils.token.XToken.Validation.CONTENT_SHA2_MATCH_FAIL;
                                }
                                return com.visa.cbp.encryptionutils.token.XToken.Validation.SUCCESS;
                            } catch (java.lang.NumberFormatException unused) {
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("XToken: invalid timestamp format in xtoken: ");
                                sb5.append(lowerCase);
                                throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb5.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                            }
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("The timeStamp in input xToken is null/ empty.");
                        sb6.append(lowerCase);
                        throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb6.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
                    }
                }
                str6 = null;
                java.lang.String lowerCase2 = str2.toLowerCase();
                split = lowerCase2.split(io.ktor.sse.ServerSentEventKt.COLON);
                if (split.length == 3) {
                }
            } else {
                throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Key Type is null.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
            }
        } catch (com.visa.cbp.encryptionutils.exceptions.TokenException e) {
            throw e;
        } catch (java.security.InvalidKeyException e2) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : InvalidKeyException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : Exception.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e3);
        } catch (java.security.SignatureException e4) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error generating xToken : SignatureException.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e4);
        } catch (java.lang.Exception e5) {
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException("Error validating xToken : Exception.", com.visa.cbp.encryptionutils.exceptions.ExceptionType.SYSTEM_ERROR, e5);
        }
    }

    public static final com.visa.cbp.encryptionutils.token.XToken.Validation ValidateForMultiValueParameters(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String[]> map, java.lang.String str3, java.lang.String str4, java.lang.Long l) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        return validate(str, str2, getHighSpeedVideoFpsRanges(map), str3, str4, l);
    }

    public static final java.lang.String generateForMultiValueParameters(java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String[]> map, java.lang.String str3) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        return generate(str, l, str2, getHighSpeedVideoFpsRanges(map), str3);
    }

    public static final java.lang.String generateV2ForMultiValueParameters(java.lang.String str, java.lang.Long l, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String[]> map, java.lang.String str3) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        return generateV2(str, l, str2, getHighSpeedVideoFpsRanges(map), str3);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        if (str2 == null || "".equals(str2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(str);
            sb.append(" can not be null or empty. Please provide valid value.");
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Long l) throws com.visa.cbp.encryptionutils.exceptions.TokenException {
        if (l == null || l.equals(0L)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(str);
            sb.append(" can not be null or empty. Please provide valid value.");
            throw new com.visa.cbp.encryptionutils.exceptions.TokenException(sb.toString(), com.visa.cbp.encryptionutils.exceptions.ExceptionType.INPUT_ERROR);
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String[]> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null && !map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                java.lang.String[] strArr = map.get(str);
                if (strArr != null && strArr.length != 0) {
                    if (strArr.length <= 1) {
                        hashMap.put(str, strArr[0]);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        for (java.lang.String str2 : strArr) {
                            sb.append(str2);
                            sb.append(",");
                        }
                        hashMap.put(str, sb.toString());
                    }
                } else {
                    hashMap.put(str, null);
                }
            }
        }
        return hashMap;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) throws java.security.SignatureException {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
            messageDigest.update(str2.getBytes(com.visa.dmpd.encryption.GenericEncryptionUtility.utf8));
            return new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(messageDigest.digest()), com.visa.dmpd.encryption.GenericEncryptionUtility.utf8).toLowerCase();
        } catch (java.lang.Exception e) {
            throw new java.security.SignatureException(e);
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.String> map) throws java.io.UnsupportedEncodingException {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        treeMap.putAll(map);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY.equalsIgnoreCase(str) && !str.startsWith(BLOW_FISH_PREFIX)) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                java.lang.String str2 = (java.lang.String) entry.getKey();
                sb.append(str2 == null ? "" : getHighSpeedVideoFpsRanges(java.net.URLEncoder.encode(str2, "UTF-8"), false));
                sb.append("=");
                java.lang.String str3 = (java.lang.String) entry.getValue();
                sb.append(str3 != null ? getHighSpeedVideoFpsRanges(java.net.URLEncoder.encode(str3, "UTF-8"), false) : "");
            }
        }
        return sb.toString();
    }

    public static java.security.PrivateKey convertStringToRSAPrivateKey(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        return java.security.KeyFactory.getInstance("RSA", getHighSpeedVideoFpsRanges).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(org.bouncycastle.util.encoders.Base64.decode(str.replace("-----BEGIN RSA PRIVATE KEY-----", "").replace("-----END RSA PRIVATE KEY-----", "").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "").replace("\r", ""))));
    }

    public static java.security.PublicKey getPublicKeyFromString(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        return java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(org.bouncycastle.util.encoders.Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "").replace("\r", ""))));
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String lowerCase = entry.getKey().toLowerCase();
            java.lang.String trim = entry.getValue().toLowerCase().trim();
            if (lowerCase.startsWith("x-visa") && !"x-visa-header-sha2".equals(lowerCase) && !"x-visa-content-sha2".equals(lowerCase)) {
                treeMap.put(lowerCase, trim);
            }
        }
        for (java.util.Map.Entry entry2 : treeMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry2.getKey();
            java.lang.String str2 = (java.lang.String) entry2.getValue();
            sb.append(".");
            sb.append(str);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(str2);
        }
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 100);
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 2;
                if (i2 < length && str.charAt(i + 1) == '7' && str.charAt(i2) == 'E') {
                    sb.append('~');
                    i = i2;
                } else {
                    sb.append(str.charAt(i));
                }
            } else if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
