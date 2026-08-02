package com.visa.cbp;

/* loaded from: classes5.dex */
class getVtsCerts {
    private static com.visa.cbp.setWidth Camera2StreamConfigurationMap;
    private static com.visa.cbp.getVtsCerts getHighResolutionOutputSizeshNQ4ISI;
    private static com.visa.cbp.setMaxPmts getHighSpeedVideoFpsRangesFor;
    private static com.visa.cbp.getSc getHighSpeedVideoSizes;
    private final java.lang.String getOutputStallDurationlomOqCM = "getVtsCerts";
    private final java.lang.String getHighSpeedVideoFpsRanges = "RSA";
    private final java.lang.String getOutputSizes = org.jose4j.keys.AesKey.ALGORITHM;
    private final java.lang.String getInputFormats = "SHA1PRNG";
    private final java.lang.String getOutputMinFrameDuration = "AndroidKeyStore";
    private final int getHighSpeedVideoSizesFor = 1800;
    private final int getOutputFormats = 4096;
    private final int getInputSizeshNQ4ISI = 256;

    getVtsCerts() {
    }

    public static com.visa.cbp.getVtsCerts getHighSpeedVideoSizes(boolean z, com.visa.cbp.setMaxPmts setmaxpmts, com.visa.cbp.getSc getsc, com.visa.cbp.setWidth setwidth) throws java.security.InvalidAlgorithmParameterException, java.lang.NoSuchMethodError, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException {
        getHighSpeedVideoFpsRangesFor = setmaxpmts;
        getHighSpeedVideoSizes = getsc;
        Camera2StreamConfigurationMap = setwidth;
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = new com.visa.cbp.getVtsCerts();
        }
        getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(z);
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.visa.cbp.getVtsCerts getHighSpeedVideoFpsRangesFor(com.visa.cbp.setMaxPmts setmaxpmts, com.visa.cbp.getSc getsc, com.visa.cbp.setWidth setwidth) {
        getHighSpeedVideoFpsRangesFor = setmaxpmts;
        getHighSpeedVideoSizes = getsc;
        Camera2StreamConfigurationMap = setwidth;
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = new com.visa.cbp.getVtsCerts();
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.visa.cbp.getVtsCerts Camera2StreamConfigurationMap() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private void getHighSpeedVideoFpsRanges(boolean z) throws java.security.InvalidAlgorithmParameterException, java.lang.NoSuchMethodError, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException {
        if (z) {
            if (getHighSpeedVideoFpsRangesFor.getMac()) {
                Camera2StreamConfigurationMap(false);
            } else {
                Camera2StreamConfigurationMap(true);
            }
        }
    }

    private java.security.KeyPair Camera2StreamConfigurationMap(boolean z) throws java.lang.NoSuchMethodError, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException {
        java.security.KeyPair highResolutionOutputSizeshNQ4ISI = !z ? getHighResolutionOutputSizeshNQ4ISI() : null;
        if (highResolutionOutputSizeshNQ4ISI == null) {
            android.security.keystore.KeyGenParameterSpec build = new android.security.keystore.KeyGenParameterSpec.Builder(com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig(), 3).setDigests("SHA-256", "SHA-512").setKeySize(4096).setEncryptionPaddings("PKCS1Padding").setSignaturePaddings("PKCS1").setUserAuthenticationRequired(true).setUserAuthenticationParameters(1800, 3).build();
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build, java.security.SecureRandom.getInstance("SHA1PRNG"));
            keyPairGenerator.generateKeyPair();
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    private java.security.KeyPair getHighResolutionOutputSizeshNQ4ISI() throws java.security.KeyStoreException, java.security.InvalidAlgorithmParameterException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        try {
            java.lang.Object invoke = java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, "AndroidKeyStore");
            try {
                java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                try {
                    java.security.KeyStore.PrivateKeyEntry privateKeyEntry = (java.security.KeyStore.PrivateKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig(), null);
                    if (privateKeyEntry != null) {
                        try {
                            return new java.security.KeyPair(((java.security.cert.Certificate) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificate", java.lang.String.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig())).getPublicKey(), privateKeyEntry.getPrivateKey());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    return Camera2StreamConfigurationMap(true);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
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

    private java.security.KeyPair getHighSpeedVideoSizes() throws java.security.KeyStoreException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException, java.security.NoSuchAlgorithmException {
        try {
            try {
                java.lang.Object invoke = java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, "AndroidKeyStore");
                try {
                    java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    try {
                        java.security.KeyStore.PrivateKeyEntry privateKeyEntry = (java.security.KeyStore.PrivateKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig(), null);
                        if (privateKeyEntry == null) {
                            return null;
                        }
                        try {
                            return new java.security.KeyPair(((java.security.cert.Certificate) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificate", java.lang.String.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig())).getPublicKey(), privateKeyEntry.getPrivateKey());
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
        } catch (java.lang.Exception e) {
            if (e instanceof java.security.UnrecoverableKeyException) {
                throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.DecoderException, com.visa.cbp.sdk.facade.error.ReasonCode.KEYSTOREEXCEPTION);
            }
            throw e;
        }
    }

    javax.crypto.SecretKey getHighSpeedVideoFpsRanges() throws java.security.NoSuchAlgorithmException {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM);
        keyGenerator.init(256, secureRandom);
        return keyGenerator.generateKey();
    }

    void getHighSpeedVideoFpsRanges(android.content.Context context) throws com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException, java.security.NoSuchAlgorithmException {
        if (com.visa.cbp.getCertFormat.getTvls()) {
            com.visa.cbp.getDeviceType ConfirmReplenishRequest = com.visa.cbp.getCertFormat.ConfirmReplenishRequest();
            if (ConfirmReplenishRequest != null) {
                byte[] ReplenishAckRequest = com.visa.cbp.getCertFormat.ReplenishAckRequest();
                if (ReplenishAckRequest != null) {
                    if (getHighSpeedVideoSizes.ReplenishRequest()) {
                        for (com.visa.cbp.sdk.facade.data.TokenData tokenData : getHighSpeedVideoSizes.values()) {
                            if (tokenData != null) {
                                com.visa.cbp.Content BuildConfig = getHighSpeedVideoSizes.BuildConfig(tokenData.getTokenKey(), false);
                                try {
                                    try {
                                        javax.crypto.SecretKey highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                                        getHighSpeedVideoSizes.ConfirmReplenishRequest();
                                        java.util.List<byte[]> list = null;
                                        java.util.List<byte[]> values = (BuildConfig.valueOf() == null || BuildConfig.valueOf().length <= 0) ? null : Camera2StreamConfigurationMap.values(context, null, BuildConfig.valueOf(), ConfirmReplenishRequest.values(), ReplenishAckRequest);
                                        if (BuildConfig.values() != null && BuildConfig.values().length > 0) {
                                            list = Camera2StreamConfigurationMap.values(context, highSpeedVideoFpsRanges.getEncoded(), BuildConfig.values(), ConfirmReplenishRequest.values(), ReplenishAckRequest);
                                        }
                                        com.visa.cbp.Content content = new com.visa.cbp.Content();
                                        if (values != null) {
                                            content.values(values.get(0));
                                        }
                                        if (list != null) {
                                            content.valueOf(list.get(0));
                                            content.BuildConfig(list.get(1));
                                        }
                                        if (getHighSpeedVideoSizes.BuildConfig(tokenData.getTokenKey(), content)) {
                                            getHighSpeedVideoSizes.valueOf();
                                        }
                                    } catch (java.lang.Exception e) {
                                        e.getMessage();
                                        throw e;
                                    }
                                } finally {
                                    getHighSpeedVideoSizes.BuildConfig();
                                }
                            } else {
                                throw new com.visa.cbp.sdk.facade.exception.TokenInvalidException(com.visa.cbp.setDeviceCerts.getPriority);
                            }
                        }
                    }
                    getHighSpeedVideoFpsRangesFor.values(true);
                    return;
                }
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
            }
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContactEmail));
        }
        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
    }

    void getHighSpeedVideoFpsRangesFor() throws java.security.KeyStoreException, java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.io.IOException, java.security.NoSuchAlgorithmException {
        try {
            if (getHighSpeedVideoSizes() != null) {
                new com.visa.cbp.setDate().getTvls(com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException e) {
            if (e.getCbpError().getErrorCode() != com.visa.cbp.setDeviceCerts.DecoderException.BuildConfig()) {
                throw e;
            }
        }
        if (getHighSpeedVideoSizes.ReplenishRequest()) {
            for (com.visa.cbp.sdk.facade.data.TokenData tokenData : getHighSpeedVideoSizes.values()) {
                if (tokenData != null) {
                    getHighSpeedVideoSizes.ConfirmReplenishRequest();
                    if (getHighSpeedVideoSizes.BuildConfig(tokenData.getTokenKey(), (com.visa.cbp.Content) null)) {
                        getHighSpeedVideoSizes.valueOf();
                    }
                    getHighSpeedVideoSizes.BuildConfig();
                }
            }
        }
        getHighSpeedVideoFpsRangesFor.values(false);
    }
}
