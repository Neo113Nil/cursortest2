package com.visa.cbp;

/* loaded from: classes5.dex */
public class getCardMetaData implements com.visa.cbp.setWidth {
    private static com.visa.cbp.setvProvisionedTokenID getHighResolutionOutputSizeshNQ4ISI;
    private static volatile com.visa.cbp.setWidth getHighSpeedVideoFpsRanges;
    static final byte[] getHighSpeedVideoSizes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "getCardMetaData";

    @Override // com.visa.cbp.setWidth
    public java.lang.String ConfirmReplenishRequest() {
        return null;
    }

    private getCardMetaData() {
    }

    public static com.visa.cbp.setWidth valueOf(android.content.Context context) {
        com.visa.cbp.setWidth setwidth;
        synchronized (com.visa.cbp.getCardMetaData.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                com.visa.cbp.getCardMetaData getcardmetadata = new com.visa.cbp.getCardMetaData();
                getcardmetadata.getHighSpeedVideoSizes(context);
                getHighSpeedVideoFpsRanges = getcardmetadata;
            }
            setwidth = getHighSpeedVideoFpsRanges;
        }
        return setwidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(android.content.Context context) {
        if (getHighResolutionOutputSizeshNQ4ISI != null) {
            return;
        }
        try {
            try {
                java.lang.Object obj = com.visa.cbp.getWidth.AidInfo.get(1545968611);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.getWidth.ReplenishAckRequest(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56766), android.view.KeyEvent.normalizeMetaState(0) + 30)).getDeclaredConstructor(null);
                    com.visa.cbp.getWidth.AidInfo.put(1545968611, obj);
                }
                getHighResolutionOutputSizeshNQ4ISI = (com.visa.cbp.setvProvisionedTokenID) ((java.lang.reflect.Constructor) obj).newInstance(null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (java.lang.ExceptionInInitializerError e) {
            e = e;
            if (!(e instanceof java.lang.NoClassDefFoundError)) {
                throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.bs64Decode);
            }
            if (e.getCause() != null) {
                if (e.getCause() instanceof com.visa.cbp.sdk.facade.exception.InvalidVersionException) {
                    throw ((com.visa.cbp.sdk.facade.exception.InvalidVersionException) e.getCause());
                }
                if (e.getCause() instanceof com.visa.cbp.sdk.facade.exception.RootDetectException) {
                    throw ((com.visa.cbp.sdk.facade.exception.RootDetectException) e.getCause());
                }
            }
            throw e;
        } catch (java.lang.NoClassDefFoundError e2) {
            e = e2;
            if (!(e instanceof java.lang.NoClassDefFoundError)) {
            }
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getForegroundColor, e3.getMessage());
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] values(android.content.Context context, byte[] bArr, java.lang.String str) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.ReplenishAckRequest(context, str, bArr);
        } catch (java.lang.Exception e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] values(android.content.Context context, byte[] bArr) {
        return values(context, bArr, com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig());
    }

    @Override // com.visa.cbp.setWidth
    public byte[] BuildConfig(android.content.Context context, byte[] bArr, com.visa.cbp.getLocale getlocale) {
        try {
            if (com.visa.cbp.getCardMetaData.AnonymousClass4.getHighSpeedVideoFpsRangesFor[getlocale.ordinal()] != 1) {
                return null;
            }
            return getHighResolutionOutputSizeshNQ4ISI.BuildConfig(context, com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig(), bArr);
        } catch (java.lang.Exception e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public java.util.List<byte[]> values(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, bArr, com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig(), com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), com.visa.cbp.setEncryptionScheme.ReplenishAckRequest.BuildConfig(), bArr2, bArr3);
        } catch (java.lang.Exception e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public java.util.List<byte[]> values(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            try {
                java.lang.Object invoke = java.lang.Class.forName("java.security.KeyStore").getMethod("getInstance", java.lang.String.class).invoke(null, "AndroidKeyStore");
                try {
                    java.lang.Class.forName("java.security.KeyStore").getMethod("load", java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                    try {
                        try {
                            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, bArr, bArr2, com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), bArr3, bArr4, new java.security.KeyPair(((java.security.cert.Certificate) java.lang.Class.forName("java.security.KeyStore").getMethod("getCertificate", java.lang.String.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig())).getPublicKey(), ((java.security.KeyStore.PrivateKeyEntry) java.lang.Class.forName("java.security.KeyStore").getMethod("getEntry", java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, com.visa.cbp.setEncryptionScheme.getEncryptionMetaData.BuildConfig(), null)).getPrivateKey()).getPublic());
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
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.ReplenishAckRequest(context, bArr, bArr2, com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), bArr3, bArr4);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr, byte[] bArr2) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, bArr, bArr2);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] BuildConfig(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, bArr, bArr2, getHighSpeedVideoSizes, com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), bArr3, bArr4);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] values(android.content.Context context, byte[] bArr, byte[] bArr2) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, bArr, bArr2, getHighSpeedVideoSizes);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] ConfirmReplenishRequest(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str, byte[] bArr7, byte[] bArr8) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.BuildConfig(context, com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), bArr, bArr2, bArr3, bArr4, getHighSpeedVideoSizes, bArr6, str, bArr7, bArr8);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] valueOf(android.content.Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, java.lang.String str, byte[] bArr7) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context, com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), bArr, bArr2, bArr3, bArr4, getHighSpeedVideoSizes, bArr6, str, bArr7);
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] ReplenishAckRequest(android.content.Context context, java.lang.String str) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.values(context, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    @Override // com.visa.cbp.setWidth
    public java.util.List<java.lang.String[]> ReplenishAckRequest(android.content.Context context) {
        try {
            return getHighResolutionOutputSizeshNQ4ISI.valueOf(context);
        } catch (java.lang.Exception e) {
            getHighSpeedVideoFpsRanges(context, e);
            return null;
        }
    }

    /* renamed from: com.visa.cbp.getCardMetaData$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.visa.cbp.setCertUsage.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.visa.cbp.setCertUsage.BuildConfig.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.visa.cbp.setCertUsage.ConfirmReplenishRequest.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.visa.cbp.setCertUsage.values.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.visa.cbp.setCertUsage.ReplenishRequest.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.visa.cbp.setCertUsage.valueOf.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.visa.cbp.setCertUsage.ReplenishAckRequest.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[com.visa.cbp.getLocale.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[com.visa.cbp.getLocale.ConfirmReplenishRequest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.visa.cbp.setWidth
    public byte[] BuildConfig(android.content.Context context, com.visa.cbp.setCertUsage setcertusage) throws java.security.cert.CertificateException, java.security.UnrecoverableEntryException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
        java.lang.String BuildConfig;
        int i = com.visa.cbp.getCardMetaData.AnonymousClass4.getHighSpeedVideoSizes[setcertusage.ordinal()];
        if (i == 1) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig();
        } else if (i == 2) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig();
        } else {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCause);
        }
        return new com.visa.cbp.setDate().valueOf(BuildConfig).getEncoded();
    }

    @Override // com.visa.cbp.setWidth
    public java.security.KeyPair values(android.content.Context context, com.visa.cbp.setCertUsage setcertusage) {
        java.lang.String BuildConfig;
        int i = com.visa.cbp.getCardMetaData.AnonymousClass4.getHighSpeedVideoSizes[setcertusage.ordinal()];
        if (i == 3) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.ReplenishAckRequest.BuildConfig();
        } else if (i == 4) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.valueOf.BuildConfig();
        } else if (i == 5) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.values.BuildConfig();
        } else if (i == 6) {
            BuildConfig = com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig();
        } else {
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.getCause);
        }
        return new com.visa.cbp.setDate().BuildConfig(BuildConfig);
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, java.lang.Exception exc) {
        com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, exc);
    }
}
