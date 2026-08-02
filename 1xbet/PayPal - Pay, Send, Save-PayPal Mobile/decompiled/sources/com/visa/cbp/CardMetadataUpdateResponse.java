package com.visa.cbp;

/* loaded from: classes5.dex */
public final class CardMetadataUpdateResponse {
    private static final java.lang.String getHighSpeedVideoSizes = "CardMetadataUpdateResponse";

    private CardMetadataUpdateResponse() {
    }

    public static void BuildConfig(android.content.Context context, com.visa.cbp.setDeviceCerts setdevicecerts) {
        if (setdevicecerts == com.visa.cbp.setDeviceCerts.ReplenishRequest || setdevicecerts == com.visa.cbp.setDeviceCerts.getTvls || setdevicecerts == com.visa.cbp.setDeviceCerts.setEncryptionMetaData || setdevicecerts == com.visa.cbp.setDeviceCerts.setTokenInfo) {
            valueOf(context);
            if (setdevicecerts == com.visa.cbp.setDeviceCerts.ReplenishRequest) {
                throw new com.visa.cbp.sdk.facade.exception.RootDetectException(com.visa.cbp.setDeviceCerts.ReplenishRequest);
            }
            if (setdevicecerts == com.visa.cbp.setDeviceCerts.getTvls) {
                throw new com.visa.cbp.sdk.facade.exception.HookDetectException(com.visa.cbp.setDeviceCerts.getTvls);
            }
            if (setdevicecerts == com.visa.cbp.setDeviceCerts.setEncryptionMetaData) {
                throw new com.visa.cbp.sdk.facade.exception.EmulatorDetectException(com.visa.cbp.setDeviceCerts.setEncryptionMetaData);
            }
            if (setdevicecerts == com.visa.cbp.setDeviceCerts.setTokenInfo) {
                throw new com.visa.cbp.sdk.facade.exception.DebugDetectException(com.visa.cbp.setDeviceCerts.setTokenInfo);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ConfirmReplenishRequest(android.content.Context context, java.lang.Exception exc) {
        int i;
        if (exc.getMessage() != null) {
            exc.getMessage();
        }
        java.lang.String localizedMessage = exc.getLocalizedMessage();
        java.lang.String localizedMessage2 = exc.getCause() != null ? exc.getCause().getLocalizedMessage() : null;
        if (localizedMessage != null || localizedMessage2 != null) {
            if (exc instanceof com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException) {
                com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException = (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException) exc;
                if (visaPaymentSDKException.getCbpError() != null && visaPaymentSDKException.getCbpError().getErrorCode() != 0) {
                    i = visaPaymentSDKException.getCbpError().getErrorCode();
                    if ((localizedMessage == null && localizedMessage.equalsIgnoreCase("SDK is in Unusable Mode.")) || ((localizedMessage2 != null && localizedMessage2.equalsIgnoreCase("SDK is in Unusable Mode.")) || (exc instanceof com.visa.cbp.sdk.facade.exception.RootDetectException) || i == com.visa.cbp.setDeviceCerts.ReplenishRequest.BuildConfig())) {
                        if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.retrieveBooleanFromPreference(context, com.visa.cbp.setEncryptionScheme.getSignature.BuildConfig())) {
                            com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.getSignature.BuildConfig(), true);
                            if (context != null) {
                                valueOf(context);
                            }
                        }
                        if (i == com.visa.cbp.setDeviceCerts.ReplenishRequest.BuildConfig()) {
                            throw new com.visa.cbp.sdk.facade.exception.RootDetectException(com.visa.cbp.setDeviceCerts.ReplenishRequest);
                        }
                        throw new com.visa.cbp.sdk.facade.exception.RootDetectException();
                    }
                    if (!(exc instanceof com.visa.cbp.sdk.facade.exception.HookDetectException) || i == com.visa.cbp.setDeviceCerts.getTvls.BuildConfig()) {
                        if (context != null) {
                            valueOf(context);
                        }
                        com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.setMac.BuildConfig(), true);
                        throw new com.visa.cbp.sdk.facade.exception.HookDetectException();
                    }
                    if (i == com.visa.cbp.setDeviceCerts.setTokenInfo.BuildConfig() || i == com.visa.cbp.setDeviceCerts.setSignature.BuildConfig()) {
                        if (context != null) {
                            valueOf(context);
                        }
                        com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.setMac.BuildConfig(), true);
                        throw new com.visa.cbp.sdk.facade.exception.DebugDetectException();
                    }
                    if (i == com.visa.cbp.setDeviceCerts.setEncryptionMetaData.BuildConfig()) {
                        if (context != null) {
                            valueOf(context);
                        }
                        com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.setMac.BuildConfig(), true);
                        throw new com.visa.cbp.sdk.facade.exception.EmulatorDetectException();
                    }
                    if ((localizedMessage != null && localizedMessage.toLowerCase().contains("user not authenticated")) || (localizedMessage2 != null && localizedMessage2.toLowerCase().contains("user not authenticated"))) {
                        int BuildConfig = com.visa.cbp.setDeviceCerts.setAdditionalProperty.BuildConfig();
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setAdditionalProperty, new com.visa.cbp.sdk.facade.error.CbpError(BuildConfig, com.visa.cbp.setDeviceCerts.setAdditionalProperty.BuildConfig(BuildConfig), com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, "", new com.visa.cbp.sdk.facade.data.ApduResponse(new byte[]{105, -122}, null)), BuildConfig);
                    }
                    if (localizedMessage != null && localizedMessage.equalsIgnoreCase("Scrub and Free Failed.")) {
                        throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.setApplicationLabel, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
                    }
                    if (i > 0 && i >= com.visa.cbp.setDeviceCerts.ignore.ReplenishAckRequest() && i <= com.visa.cbp.setDeviceCerts.ignore.ConfirmReplenishRequest()) {
                        throw new com.visa.cbp.sdk.facade.exception.InvalidVersionException(com.visa.cbp.setDeviceCerts.ignore, new com.visa.cbp.sdk.facade.error.CbpError(i, com.visa.cbp.setDeviceCerts.ignore.BuildConfig(i), com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, ""));
                    }
                    if (i == -1001) {
                        throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.setCertValue, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
                    }
                    if (i == 1509) {
                        throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.setContentType, com.visa.cbp.sdk.facade.error.ReasonCode.SESSION_ERROR);
                    }
                    throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.getForegroundColor, new com.visa.cbp.sdk.facade.error.CbpError(i, com.visa.cbp.setDeviceCerts.getForegroundColor.BuildConfig(i), com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION, ""), i);
                }
            }
            i = -1000;
            if (localizedMessage == null) {
            }
            if (!(exc instanceof com.visa.cbp.sdk.facade.exception.HookDetectException)) {
            }
            if (context != null) {
            }
            com.visa.cbp.sdk.facade.util.UtilityFunctions.saveBooleanInSharedPreference(context, com.visa.cbp.setEncryptionScheme.setMac.BuildConfig(), true);
            throw new com.visa.cbp.sdk.facade.exception.HookDetectException();
        }
        throw new com.visa.cbp.sdk.facade.exception.CryptoException(com.visa.cbp.setDeviceCerts.getForegroundColor, com.visa.cbp.sdk.facade.error.ReasonCode.SDK_EXCEPTION);
    }

    public static void valueOf(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String absolutePath = context.getFilesDir().getAbsolutePath();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(absolutePath);
        sb.append(com.visa.cbp.setEncryptionScheme.Signature);
        arrayList.add(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(absolutePath);
        sb2.append(com.visa.cbp.setEncryptionScheme.setApplicationLabel);
        arrayList.add(sb2.toString());
        try {
            context.deleteDatabase(com.visa.cbp.setEncryptionScheme.setIssuerApplicationDiscretionaryData.BuildConfig());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.io.File file = new java.io.File((java.lang.String) it.next());
                if (file.exists()) {
                    try {
                        file.delete();
                    } catch (java.lang.Exception e) {
                        e.getLocalizedMessage();
                        com.visa.cbp.setDeviceCerts setdevicecerts = com.visa.cbp.setDeviceCerts.getBackgroundColor;
                        com.visa.cbp.sdk.facade.error.ReasonCode reasonCode = com.visa.cbp.sdk.facade.error.ReasonCode.RESET_ERROR;
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Error resetting [");
                        sb3.append(file);
                        sb3.append("] \n ");
                        sb3.append(e.getLocalizedMessage());
                        throw new com.visa.cbp.sdk.facade.exception.InterruptedResetException(setdevicecerts, reasonCode, sb3.toString());
                    }
                } else {
                    file.getAbsolutePath();
                }
            }
            try {
                com.visa.cbp.setDate setdate = new com.visa.cbp.setDate();
                setdate.getTvls(com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig());
                setdate.getTvls(com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig());
                setdate.getTvls(com.visa.cbp.setEncryptionScheme.valueOf.BuildConfig());
                setdate.getTvls(com.visa.cbp.setEncryptionScheme.ReplenishAckRequest.BuildConfig());
                setdate.getTvls(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig());
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                arrayList2.add(com.visa.cbp.setEncryptionScheme.getSignature.BuildConfig());
                arrayList2.add(com.visa.cbp.setEncryptionScheme.getTokenInfo.BuildConfig());
                arrayList2.add(com.visa.cbp.setEncryptionScheme.getAid.BuildConfig());
                arrayList2.add(com.visa.cbp.setEncryptionScheme.getCap.BuildConfig());
                if (arrayList2.isEmpty()) {
                    return;
                }
                for (java.lang.String str : arrayList2) {
                    try {
                        com.visa.cbp.sdk.facade.util.UtilityFunctions.deleteSdkSharedPrefs(context, str);
                    } catch (java.lang.Exception e2) {
                        e2.getLocalizedMessage();
                        com.visa.cbp.setDeviceCerts setdevicecerts2 = com.visa.cbp.setDeviceCerts.getBackgroundColor;
                        com.visa.cbp.sdk.facade.error.ReasonCode reasonCode2 = com.visa.cbp.sdk.facade.error.ReasonCode.RESET_ERROR;
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Error resetting [");
                        sb4.append(str);
                        sb4.append("] \n ");
                        sb4.append(e2.getLocalizedMessage());
                        throw new com.visa.cbp.sdk.facade.exception.InterruptedResetException(setdevicecerts2, reasonCode2, sb4.toString());
                    }
                }
            } catch (java.lang.Exception e3) {
                com.visa.cbp.setDeviceCerts setdevicecerts3 = com.visa.cbp.setDeviceCerts.getBackgroundColor;
                com.visa.cbp.sdk.facade.error.ReasonCode reasonCode3 = com.visa.cbp.sdk.facade.error.ReasonCode.RESET_ERROR;
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Error resetting [keystore] \n ");
                sb5.append(e3.getLocalizedMessage());
                throw new com.visa.cbp.sdk.facade.exception.InterruptedResetException(setdevicecerts3, reasonCode3, sb5.toString());
            }
        } catch (java.lang.Exception unused) {
            throw new com.visa.cbp.sdk.facade.exception.InterruptedResetException(com.visa.cbp.setDeviceCerts.CardMetaData, com.visa.cbp.sdk.facade.error.ReasonCode.RESET_ERROR);
        }
    }
}
