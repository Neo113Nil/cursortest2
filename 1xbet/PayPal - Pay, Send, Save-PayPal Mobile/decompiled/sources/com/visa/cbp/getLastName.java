package com.visa.cbp;

/* loaded from: classes5.dex */
public abstract class getLastName implements com.visa.cbp.sdk.facade.VisaPaymentSDK {
    public static final byte[] $$m = null;
    public static final int $$n = 0;
    private static final java.lang.String TAG;
    protected static android.content.BroadcastReceiver connectivityReceiver;
    protected static boolean customTransitSupported;
    public static com.visa.cbp.setMaxPmts settingsDao;
    public com.visa.cbp.setWidth cryptoServiceProvider;
    public com.visa.cbp.DynParams dataGroupDao;
    protected boolean doPreprocess = false;
    protected com.visa.cbp.getVtsCerts offlinePayment;
    protected com.visa.cbp.getPhone replenishmentCheckManager;
    public com.visa.cbp.getSc tokenDao;
    public com.visa.cbp.getApi tvlDao;
    public com.visa.cbp.setEncExpo vcpcsProcessor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 48 - s;
        byte[] bArr = $$m;
        byte[] bArr2 = new byte[i + 6];
        int i5 = i + 5;
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            i2 = 0;
            i4 = i4 + i6 + 6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i2++;
            i6 = bArr[i3];
            i4 = i4 + i6 + 6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4 = 118 - b;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    static {
        init$0();
        TAG = "getLastName";
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public com.visa.cbp.sdk.facade.data.ApduResponse processCommandApdu(android.content.Context context, byte[] bArr, android.os.Bundle bundle, boolean z) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException {
        com.visa.cbp.sdk.facade.error.CbpError cbpError;
        com.visa.cbp.sdk.facade.data.ApduResponse apduResponse;
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                com.visa.cbp.sdk.facade.error.CbpError cbpError2 = null;
                r5 = null;
                byte[] bArr2 = null;
                cbpError2 = null;
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2090, 30 - (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1660251670);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2090, 30 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m($$m[11], (byte) ($$n & 188), (short) 23, objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1660251670, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    try {
                        java.lang.Object[] objArr3 = {context};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1515112549);
                        if (obj3 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2091, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 30);
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            m($$m[12], org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, (short) 0, objArr4);
                            obj3 = cls2.getDeclaredMethod((java.lang.String) objArr4[0], android.content.Context.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1515112549, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(newInstance, objArr3);
                        com.visa.cbp.sdk.facade.data.CvmMode cvmVerificationMode = z ? getCvmVerificationMode(context) : null;
                        if (!isSdkEnabled()) {
                            cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.setContent, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
                        } else if (!com.visa.cbp.getCertFormat.ReplenishAckRequest(context)) {
                            cbpError = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
                        } else {
                            try {
                                byte[] ConfirmReplenishRequest = this.vcpcsProcessor.ConfirmReplenishRequest(context, bArr, bundle, z, cvmVerificationMode, customTransitSupported);
                                if (ConfirmReplenishRequest.length == 2 && com.visa.cbp.sdk.facade.util.MiscUtils.arrayCompare(ConfirmReplenishRequest, 0, com.visa.cbp.setEncExpo.BuildConfig, 0, 2)) {
                                    cbpError2 = com.visa.cbp.sdk.facade.error.CBPErrorFactoryCommons.error(com.visa.cbp.setDeviceCerts.Base64Encoder, com.visa.cbp.sdk.facade.error.ReasonCode.VERIFICATION_ERROR);
                                }
                                com.visa.cbp.sdk.facade.error.CbpError cbpError3 = cbpError2;
                                bArr2 = ConfirmReplenishRequest;
                                cbpError = cbpError3;
                            } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException e) {
                                if (e.getCbpError().getErrorCode() == com.visa.cbp.setDeviceCerts.DecoderException.BuildConfig()) {
                                    disableOfflinePayment(context);
                                    int BuildConfig = com.visa.cbp.setDeviceCerts.DecoderException.BuildConfig();
                                    throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.DecoderException, new com.visa.cbp.sdk.facade.error.CbpError(BuildConfig, com.visa.cbp.setDeviceCerts.DecoderException.BuildConfig(BuildConfig), com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, "", new com.visa.cbp.sdk.facade.data.ApduResponse(new byte[]{105, -122}, null)), BuildConfig);
                                }
                                throw e;
                            }
                        }
                        apduResponse = new com.visa.cbp.sdk.facade.data.ApduResponse(bArr2, cbpError);
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
        return apduResponse;
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public boolean selectCard(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        boolean z;
        synchronized (this) {
            if (tokenKey != null) {
                if (tokenKey.getTokenId() > 0) {
                    com.visa.cbp.sdk.facade.data.TokenKey values = settingsDao.values();
                    if (values == null || !tokenKey.equals(values) || !this.doPreprocess) {
                        try {
                            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2090 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 30 - (android.os.Process.myTid() >> 22))).getDeclaredConstructor(null);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                            }
                            java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                            try {
                                java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this, java.lang.Boolean.TRUE};
                                java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(761871201);
                                if (obj2 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2091, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29);
                                    byte b = (byte) (-$$m[18]);
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    m(b, (byte) (b | 34), r2[49], objArr2);
                                    obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class, java.lang.Boolean.TYPE);
                                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(761871201, obj2);
                                }
                                ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                                if (com.visa.cbp.getCertFormat.ReplenishAckRequest(context)) {
                                    try {
                                        java.lang.Object[] objArr3 = {context};
                                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1378236413);
                                        if (obj3 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2089 - android.os.Process.getGidForName(""), 30 - (android.os.Process.myTid() >> 22));
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            m(0, (byte) 0, $$m[12], objArr4);
                                            obj3 = cls2.getMethod((java.lang.String) objArr4[0], android.content.Context.class);
                                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1378236413, obj3);
                                        }
                                        ((java.lang.reflect.Method) obj3).invoke(newInstance, objArr3);
                                        if (this.tokenDao.ReplenishRequest(tokenKey)) {
                                            java.lang.String tokenStatus = getTokenStatus(context, tokenKey);
                                            if (tokenStatus != null && tokenStatus.equalsIgnoreCase(com.visa.cbp.sdk.facade.data.TokenStatus.ACTIVE.getValue())) {
                                                com.visa.cbp.sdk.facade.TokenRepersoStatus isTokenRepersoComplete = isTokenRepersoComplete(context, this.tokenDao.getTvls(tokenKey).getVProvisionedTokenID());
                                                if (isTokenRepersoComplete != com.visa.cbp.sdk.facade.TokenRepersoStatus.COMPLETED_REPERSO && isTokenRepersoComplete != com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION) {
                                                    throw new com.visa.cbp.sdk.facade.exception.InvalidTokenStateException(com.visa.cbp.setDeviceCerts.setAppPrgrmID);
                                                }
                                                settingsDao.BuildConfig(tokenKey);
                                                preProcessSelectedCardTokenInfo(context, tokenKey);
                                                this.doPreprocess = true;
                                            } else {
                                                throw new com.visa.cbp.sdk.facade.exception.InvalidTokenStateException(com.visa.cbp.setDeviceCerts.setIssuerDiscretionaryData);
                                            }
                                        } else {
                                            throw new com.visa.cbp.sdk.facade.exception.TokenInvalidException(com.visa.cbp.setDeviceCerts.getPriority);
                                        }
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } else {
                                    throw new com.visa.cbp.sdk.facade.exception.TokenInvalidException(com.visa.cbp.setDeviceCerts.setContentType);
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
                    z = this.doPreprocess;
                }
            }
            throw new com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException(com.visa.cbp.setDeviceCerts.getCap);
        }
        return z;
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public java.lang.String getTokenStatus(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2090 - android.view.KeyEvent.keyCodeFromString(""), 30 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.resolveSize(0, 0), 2090 - android.view.Gravity.getAbsoluteGravity(0, 0), 29 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r7[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    if (tokenKey != null && tokenKey.getTokenId() > 0) {
                        java.lang.String ConfirmReplenishRequest = this.tokenDao.ConfirmReplenishRequest(tokenKey);
                        if (ConfirmReplenishRequest != null) {
                            return ConfirmReplenishRequest;
                        }
                        return com.visa.cbp.sdk.facade.data.TokenStatus.NOT_FOUND.getValue();
                    }
                    throw new com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException(com.visa.cbp.setDeviceCerts.getCap);
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
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public com.visa.cbp.sdk.facade.data.TokenKey getSelectedCard(android.content.Context context) {
        com.visa.cbp.sdk.facade.data.TokenKey values;
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.myTid() >> 22), 2090 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30)).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2090 - android.view.View.resolveSize(0, 0), 30 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r4[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    values = settingsDao.values();
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
        return values;
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public com.visa.cbp.sdk.facade.data.CvmMode getCvmVerificationMode(android.content.Context context) {
        com.visa.cbp.sdk.facade.data.CvmMode cvmMode;
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                cvmMode = null;
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2090, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29)).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2090, 30 - android.widget.ExpandableListView.getPackedPositionType(0L));
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r3[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    java.lang.String retrieveStringFromPreference = com.visa.cbp.sdk.facade.util.UtilityFunctions.retrieveStringFromPreference(context, com.visa.cbp.setEncryptionScheme.getAid.BuildConfig());
                    if (retrieveStringFromPreference != null && retrieveStringFromPreference.length() > 0) {
                        cvmMode = (com.visa.cbp.sdk.facade.data.CvmMode) new com.google.gson.Gson().fromJson(retrieveStringFromPreference, new com.google.gson.reflect.TypeToken<com.visa.cbp.sdk.facade.data.CvmMode>() { // from class: com.visa.cbp.getLastName.1
                        }.getType());
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
        return cvmMode;
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public void setCvmVerificationMode(android.content.Context context, com.visa.cbp.sdk.facade.data.CvmMode cvmMode) {
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 2091 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 30)).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getOffsetAfter("", 0), 2089 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 30 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r5[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    com.visa.cbp.sdk.facade.util.UtilityFunctions.saveStringInSharedPreference(context, com.visa.cbp.setEncryptionScheme.getAid.BuildConfig(), new com.google.gson.Gson().toJson(cvmMode));
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
        }
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public boolean isCvmVerified(android.content.Context context) {
        boolean retrieveBooleanFromPreference;
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 2090 - android.view.View.resolveSizeAndState(0, 0, 0), 30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2090, android.view.View.resolveSizeAndState(0, 0, 0) + 30);
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r5[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    retrieveBooleanFromPreference = com.visa.cbp.sdk.facade.util.UtilityFunctions.retrieveBooleanFromPreference(context, com.visa.cbp.setEncryptionScheme.getCap.BuildConfig());
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
        return retrieveBooleanFromPreference;
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public void setCvmVerified(android.content.Context context, boolean z) {
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2090 - android.graphics.Color.alpha(0), 30 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.indexOf("", "") + 2090, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30);
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r5[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.getCap.BuildConfig(), z);
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
        }
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public boolean processTransactionComplete(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        synchronized (this) {
            if (!isSdkEnabled()) {
                return false;
            }
            if (tokenKey != null && tokenKey.getTokenId() > 0 && this.tokenDao.getTvls(tokenKey) != null) {
                try {
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2090, android.text.TextUtils.getCapsMode("", 0, 0) + 30)).getDeclaredConstructor(null);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                    }
                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                    try {
                        java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2090, 29 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                            byte b = (byte) (-$$m[18]);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            m(b, (byte) (b | 34), r6[49], objArr2);
                            obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                        }
                        ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                        boolean valueOf = this.vcpcsProcessor.valueOf(context, tokenKey);
                        if (valueOf) {
                            try {
                                java.lang.Object[] objArr3 = {context};
                                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1378236413);
                                if (obj3 == null) {
                                    java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 2090, 30 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    m(0, (byte) 0, $$m[12], objArr4);
                                    obj3 = cls2.getMethod((java.lang.String) objArr4[0], android.content.Context.class);
                                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1378236413, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(newInstance, objArr3);
                                if (this.tokenDao.getTvls(context, tokenKey).m23146(this.tokenDao, tokenKey) && this.tokenDao.getTvls(tokenKey) != null) {
                                    this.replenishmentCheckManager.BuildConfig(context);
                                    com.visa.cbp.setVtsCerts.getTvls(TAG, "QRC 1 replenishmentCheckManager.checkReplenishmentStatus ");
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        return valueOf;
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
            throw new com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException(com.visa.cbp.setDeviceCerts.getCap);
        }
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public boolean processTransactionComplete(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, final com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback harmfulAppsCallback) {
        synchronized (this) {
            if (!isSdkEnabled()) {
                return false;
            }
            if (tokenKey != null && tokenKey.getTokenId() > 0 && this.tokenDao.getTvls(tokenKey) != null) {
                try {
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2090 - android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.indexOf("", "") + 30)).getDeclaredConstructor(null);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                    }
                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                    try {
                        java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this, java.lang.Boolean.TRUE};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(761871201);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 2090 - android.graphics.Color.argb(0, 0, 0, 0), 30 - (android.os.Process.myTid() >> 22));
                            byte b = (byte) (-$$m[18]);
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            m(b, (byte) (b | 34), r13[49], objArr2);
                            obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class, java.lang.Boolean.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(761871201, obj2);
                        }
                        ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                        try {
                            java.lang.Object[] objArr3 = {context};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1378236413);
                            if (obj3 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2091, 31 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                m(0, (byte) 0, $$m[12], objArr4);
                                obj3 = cls2.getMethod((java.lang.String) objArr4[0], android.content.Context.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1378236413, obj3);
                            }
                            ((java.lang.reflect.Method) obj3).invoke(newInstance, objArr3);
                            boolean valueOf = this.vcpcsProcessor.valueOf(context, tokenKey);
                            if (valueOf && this.tokenDao.getTvls(context, tokenKey).m23146(this.tokenDao, tokenKey) && this.tokenDao.getTvls(tokenKey) != null) {
                                this.replenishmentCheckManager.BuildConfig(context);
                                com.visa.cbp.setVtsCerts.getTvls(TAG, "QRC 2 replenishmentCheckManager.checkReplenishmentStatus ");
                            }
                            com.visa.cbp.getEmail.checkHarmfulApps(context, new com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback() { // from class: com.visa.cbp.getLastName.5
                                @Override // com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback
                                public void onResult(int i, java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> list) {
                                    if (i == 3000) {
                                        for (com.google.android.gms.safetynet.HarmfulAppsData harmfulAppsData : list) {
                                            java.lang.String unused = com.visa.cbp.getLastName.TAG;
                                            java.lang.String str = harmfulAppsData.apkPackageName;
                                            java.lang.String unused2 = com.visa.cbp.getLastName.TAG;
                                            int i2 = harmfulAppsData.apkCategory;
                                        }
                                    }
                                    harmfulAppsCallback.onResult(i, list);
                                }

                                @Override // com.visa.cbp.sdk.facade.DASService.HarmfulAppsCallback
                                public void onError(int i, java.lang.Exception exc) {
                                    java.lang.String unused = com.visa.cbp.getLastName.TAG;
                                    exc.getMessage();
                                    harmfulAppsCallback.onError(i, exc);
                                }
                            });
                            return valueOf;
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
            throw new com.visa.cbp.sdk.facade.exception.TokenKeyInvalidException(com.visa.cbp.setDeviceCerts.getCap);
        }
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public boolean tokensExist(android.content.Context context) {
        synchronized (this) {
            try {
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1084489407);
                if (obj == null) {
                    obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.View.MeasureSpec.getMode(0) + 2090, 30 - android.view.View.MeasureSpec.getSize(0))).getDeclaredConstructor(null);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1084489407, obj);
                }
                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj).newInstance(null);
                try {
                    java.lang.Object[] objArr = {context, (com.visa.cbp.setEmail) this};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(939292915);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.graphics.Color.blue(0) + 2090, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30);
                        byte b = (byte) (-$$m[18]);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        m(b, (byte) (b | 34), r5[49], objArr2);
                        obj2 = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.visa.cbp.setEmail.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(939292915, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(newInstance, objArr);
                    java.util.List<com.visa.cbp.setDeviceId> ReplenishAckRequest = this.tokenDao.ReplenishAckRequest();
                    return ReplenishAckRequest != null && ReplenishAckRequest.size() > 0;
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
    }

    void preProcessSelectedCardTokenInfo(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        if (tokenKey != null && tokenKey.getTokenId() > 0 && this.tokenDao.getTvls(tokenKey) != null) {
            this.vcpcsProcessor.valueOf(tokenKey);
            this.vcpcsProcessor.BuildConfig(tokenKey);
            com.visa.cbp.setDeviceId BuildConfig = this.tokenDao.BuildConfig(tokenKey);
            com.visa.cbp.sdk.j.b.d.C0206 tvls = this.tokenDao.getTvls(context, tokenKey);
            com.visa.cbp.Content valueOf = this.tokenDao.valueOf(tokenKey, com.visa.cbp.getCertFormat.ReplenishAckRequest() == null ? 0 : 1);
            com.visa.cbp.external.common.PaywaveData paywaveData = new com.visa.cbp.external.common.PaywaveData();
            paywaveData.setDynParams(this.tokenDao.ReplenishRequest(context, tokenKey));
            paywaveData.setODAData(this.tokenDao.getTokenInfo(tokenKey));
            paywaveData.setStaticParams(BuildConfig.getSignature());
            paywaveData.setExpirationDate(BuildConfig.getTvls());
            paywaveData.setAppPrgrmID(BuildConfig.setTvls());
            paywaveData.setApi(tvls.m23156());
            paywaveData.setCvmPriorityList(settingsDao.setSignature());
            try {
                com.visa.cbp.sdk.facade.data.Token token = (com.visa.cbp.sdk.facade.data.Token) new com.google.gson.Gson().fromJson(new java.lang.String(this.cryptoServiceProvider.BuildConfig(context, valueOf.ConfirmReplenishRequest(), com.visa.cbp.getLocale.ConfirmReplenishRequest)), com.visa.cbp.sdk.facade.data.Token.class);
                paywaveData.setIccPrivKSize((short) valueOf.ReplenishAckRequest());
                paywaveData.setToken(token.getToken());
                paywaveData.setvProvisionedTokenId(BuildConfig.ReplenishAckRequest());
                paywaveData.setTokenRequestorID(BuildConfig.ReplenishResponse());
                int intValue = tvls.m23151().intValue();
                paywaveData.setAtc(intValue);
                paywaveData.setPaymentAccountReference(BuildConfig.getTokenInfo());
                boolean Signature = settingsDao.Signature();
                customTransitSupported = Signature;
                this.vcpcsProcessor.valueOf(tokenKey, paywaveData, intValue, Signature);
                return;
            } catch (com.google.gson.JsonSyntaxException unused) {
                throw new com.visa.cbp.sdk.facade.exception.SDKUnrecoverableException("Visa's SDK encountered an unrecoverable exception. Please uninstall and reinstall your application");
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.TokenInvalidException(com.visa.cbp.setDeviceCerts.getPriority);
    }

    @Override // com.visa.cbp.sdk.facade.VisaPaymentSDK
    public com.visa.cbp.sdk.facade.data.CVMPriority getCvmPriorityList(android.content.Context context) {
        return settingsDao.setSignature();
    }

    boolean isSdkEnabled() {
        return settingsDao.ReplenishResponse();
    }

    static void init$0() {
        $$m = new byte[]{40, 102, 18, -6, 38, -7, -14, -3, 3, -11, -33, 13, 5, -10, -13, 3, -11, 4, -17, -28, 13, 6, -2, -22, 8, -5, 13, 5, -10, -13, 3, -11, 4, -17, -45, com.google.common.base.Ascii.FS, 2, -31, 13, 6, -2, -22, 8, -5, -27, 5, 3, -22, 8, 45, -18, -3, -14, -39, 38, -7, -14, -3, -8};
        $$n = 103;
    }
}
