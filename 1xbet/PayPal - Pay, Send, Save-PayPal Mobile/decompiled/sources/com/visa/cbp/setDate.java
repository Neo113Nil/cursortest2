package com.visa.cbp;

/* loaded from: classes5.dex */
public class setDate {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "setDate";
    private java.security.KeyStore getHighSpeedVideoFpsRanges;

    public java.security.KeyStore ConfirmReplenishRequest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public setDate() {
        try {
            try {
                java.security.KeyStore keyStore = (java.security.KeyStore) java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
                this.getHighSpeedVideoFpsRanges = keyStore;
                try {
                    java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(keyStore, null);
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
        } catch (java.lang.Exception e) {
            e.getMessage();
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, int i) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {
        android.security.keystore.KeyGenParameterSpec build = new android.security.keystore.KeyGenParameterSpec.Builder(str2, 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(i).build();
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
        keyGenerator.init(build);
        keyGenerator.generateKey();
    }

    public void valueOf(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        if (str3.equalsIgnoreCase("EC")) {
            getHighResolutionOutputSizeshNQ4ISI(context, str2, str);
        } else {
            getHighSpeedVideoFpsRangesFor(context, str2, str);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.add(1, 1);
        android.security.keystore.KeyGenParameterSpec.Builder certificateNotAfter = new android.security.keystore.KeyGenParameterSpec.Builder(str2, 4).setAlgorithmParameterSpec(new java.security.spec.ECGenParameterSpec("secp256r1")).setDigests("SHA-256", "SHA-384", "SHA-512").setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime());
        certificateNotAfter.setAttestationChallenge(str.getBytes());
        android.security.keystore.KeyGenParameterSpec build = certificateNotAfter.build();
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("EC", com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
        keyPairGenerator.initialize(build);
        keyPairGenerator.generateKeyPair();
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.add(1, 1);
        android.security.keystore.KeyGenParameterSpec.Builder certificateNotAfter = new android.security.keystore.KeyGenParameterSpec.Builder(str2, 7).setDigests("SHA-256", "SHA-512").setKeySize(2048).setEncryptionPaddings("PKCS1Padding").setSignaturePaddings("PKCS1").setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime());
        certificateNotAfter.setAttestationChallenge(str.getBytes());
        android.security.keystore.KeyGenParameterSpec build = certificateNotAfter.build();
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA", com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
        keyPairGenerator.initialize(build, java.security.SecureRandom.getInstance("SHA1PRNG"));
        keyPairGenerator.generateKeyPair();
    }

    public java.lang.String[] ConfirmReplenishRequest(java.lang.String str) {
        try {
            try {
                java.lang.Object invoke = java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
                try {
                    java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    try {
                        java.security.cert.Certificate[] certificateArr = (java.security.cert.Certificate[]) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificateChain", java.lang.String.class).invoke(invoke, str);
                        java.lang.String[] strArr = new java.lang.String[certificateArr.length];
                        for (int i = 0; i < certificateArr.length; i++) {
                            strArr[i] = new java.lang.String(android.util.Base64.encode(getHighSpeedVideoSizes(((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(certificateArr[i].getEncoded()))).getEncoded(), org.bouncycastle.openssl.PEMParser.TYPE_CERTIFICATE).getBytes(), 10));
                        }
                        return strArr;
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
        } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            return null;
        }
    }

    private java.lang.String getHighSpeedVideoSizes(byte[] bArr, java.lang.String str) throws java.io.IOException {
        int i;
        com.visa.cbp.getCardData getcarddata = new com.visa.cbp.getCardData(str, bArr);
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        com.visa.cbp.setLongDescription setlongdescription = new com.visa.cbp.setLongDescription(stringWriter);
        try {
            com.visa.cbp.getCardData valueOf = getcarddata.valueOf();
            java.lang.String str2 = valueOf.BuildConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN ");
            sb.append(str2);
            sb.append("-----");
            setlongdescription.write(sb.toString());
            setlongdescription.newLine();
            if (!valueOf.ConfirmReplenishRequest.isEmpty()) {
                for (com.visa.cbp.CardMetadataUpdate cardMetadataUpdate : valueOf.ConfirmReplenishRequest) {
                    setlongdescription.write(cardMetadataUpdate.ReplenishAckRequest);
                    setlongdescription.write(": ");
                    setlongdescription.write(cardMetadataUpdate.BuildConfig);
                    setlongdescription.newLine();
                }
                setlongdescription.newLine();
            }
            byte[] ReplenishAckRequest = com.visa.cbp.getShortDescription.ReplenishAckRequest(valueOf.ReplenishAckRequest);
            for (int i2 = 0; i2 < ReplenishAckRequest.length; i2 += setlongdescription.values.length) {
                int i3 = 0;
                while (i3 != setlongdescription.values.length && (i = i2 + i3) < ReplenishAckRequest.length) {
                    setlongdescription.values[i3] = (char) ReplenishAckRequest[i];
                    i3++;
                }
                setlongdescription.write(setlongdescription.values, 0, i3);
                setlongdescription.newLine();
            }
            java.lang.String str3 = valueOf.BuildConfig;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("-----END ");
            sb2.append(str3);
            sb2.append("-----");
            setlongdescription.write(sb2.toString());
            setlongdescription.newLine();
            setlongdescription.close();
            return stringWriter.toString();
        } catch (java.lang.Throwable th) {
            setlongdescription.close();
            throw th;
        }
    }

    public byte[] ConfirmReplenishRequest(android.content.Context context, java.lang.String str) throws java.security.cert.CertificateEncodingException {
        try {
            java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
            try {
                java.security.cert.Certificate certificate = (java.security.cert.Certificate) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificate", java.lang.String.class).invoke(this.getHighSpeedVideoFpsRanges, str);
                if (certificate != null) {
                    return ((java.security.cert.X509Certificate) certificateFactory.generateCertificate(new java.io.ByteArrayInputStream(certificate.getEncoded()))).getEncoded();
                }
                return null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.security.KeyStoreException | java.security.cert.CertificateException unused) {
            return null;
        }
    }

    public javax.crypto.SecretKey valueOf(java.lang.String str) throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.UnrecoverableEntryException {
        try {
            java.security.KeyStore keyStore = (java.security.KeyStore) java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig());
            this.getHighSpeedVideoFpsRanges = keyStore;
            try {
                java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(keyStore, null);
                try {
                    return ((java.security.KeyStore.SecretKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(this.getHighSpeedVideoFpsRanges, str, null)).getSecretKey();
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
    }

    public java.security.KeyPair BuildConfig(java.lang.String str) {
        try {
            try {
                try {
                    return new java.security.KeyPair(((java.security.cert.Certificate) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificate", java.lang.String.class).invoke(this.getHighSpeedVideoFpsRanges, str)).getPublicKey(), ((java.security.KeyStore.PrivateKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(this.getHighSpeedVideoFpsRanges, str, null)).getPrivateKey());
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
        } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException unused) {
            return null;
        }
    }

    public boolean values(java.lang.String str) {
        try {
            try {
                return ((java.lang.Boolean) java.lang.Class.forName("java.security.KeyStore").getMethod("containsAlias", java.lang.String.class).invoke(this.getHighSpeedVideoFpsRanges, str)).booleanValue();
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean values() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public boolean ReplenishAckRequest(java.lang.String str) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        try {
            java.security.KeyPair BuildConfig = BuildConfig(str);
            bool = java.lang.Boolean.valueOf(((android.security.keystore.KeyInfo) java.security.KeyFactory.getInstance(BuildConfig.getPrivate().getAlgorithm(), com.visa.cbp.setEncryptionScheme.setSignature.BuildConfig()).getKeySpec(BuildConfig.getPrivate(), android.security.keystore.KeyInfo.class)).isInsideSecureHardware());
        } catch (java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.spec.InvalidKeySpecException unused) {
        }
        return bool.booleanValue();
    }

    public void getTvls(java.lang.String str) {
        try {
            try {
                java.lang.Class.forName("java.security.KeyStore").getMethod("deleteEntry", java.lang.String.class).invoke(this.getHighSpeedVideoFpsRanges, str);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (java.security.KeyStoreException e) {
            throw new com.visa.cbp.sdk.facade.exception.CryptoException(e, com.visa.cbp.setDeviceCerts.getForegroundColor, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
        }
    }
}
