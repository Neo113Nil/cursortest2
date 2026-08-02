package my.com.softspace.ssfasstapsdk.internal.pog;

/* loaded from: classes17.dex */
public class StandardPOGHandler implements my.com.softspace.ssfasstapsdk.pog.AttestationPOG {
    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    @java.lang.Deprecated
    public void setPOGLibraryEvent(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGLibraryEvent pOGLibraryEvent) {
    }

    public StandardPOGHandler(android.content.Context context, sspog.SSPOGProperties sSPOGProperties, java.security.SecureRandom secureRandom) {
        sspog.SSPOGService.init(context, sSPOGProperties, secureRandom);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public int login(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Login user ID must not be empty");
        }
        return sspog.SSPOGService.getInstance().login(context, str);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void loginWithResetProvision(android.content.Context context, java.lang.String str, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Login user ID must not be empty");
        }
        if (sspog.SSPOGService.getInstance().login(context, str) == 769) {
            confirmResetProvision(context, str);
        }
        attest(context, new java.util.HashMap<>(), attestationEvent, true, false);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void logout(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        sspog.SSPOGService.getInstance().logout(context);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public int confirmResetProvision(android.content.Context context, java.lang.String str) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("User ID must not be empty");
        }
        return sspog.SSPOGService.getInstance().confirmResetProvision(context, str);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public my.com.softspace.ssfasstapsdk.pog.POGServiceStatus getLastServiceStatus() {
        sspog.SSPOGServiceStatus lastServiceStatus = sspog.SSPOGService.getInstance().getLastServiceStatus();
        return new my.com.softspace.ssfasstapsdk.pog.POGServiceStatus(lastServiceStatus.getStatus(), lastServiceStatus.getMessage());
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.String getServiceAppName() {
        return sspog.SSPOGService.getInstance().getServiceAppName();
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.String getServiceAppVersion() {
        return sspog.SSPOGService.getInstance().getServiceAppVersion();
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo getInstanceInfo() {
        my.com.softspace.sspog.SSPOGInstanceInfo instanceInfo = sspog.SSPOGService.getInstance().getInstanceInfo();
        my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo attestationInstanceInfo = new my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo();
        attestationInstanceInfo.setDeviceId(instanceInfo.getDeviceId());
        attestationInstanceInfo.setInstanceId(instanceInfo.getInstanceId());
        attestationInstanceInfo.setSessionId(instanceInfo.getSessionId());
        attestationInstanceInfo.setToken(instanceInfo.getToken());
        attestationInstanceInfo.setTokenSignature(instanceInfo.getTokenSignature());
        return attestationInstanceInfo;
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void attest(android.content.Context context, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent) {
        attest(context, attestationEvent, false, false);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void attest(android.content.Context context, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent, boolean z, boolean z2) {
        attest(context, null, attestationEvent, z, z2);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void attest(android.content.Context context, java.util.HashMap<java.lang.String, java.lang.String> hashMap, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent) {
        attest(context, hashMap, attestationEvent, false, false);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void attest(android.content.Context context, java.util.HashMap<java.lang.String, java.lang.String> hashMap, final my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent, boolean z, boolean z2) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        if (z2) {
            sspog.SSPOGService.getInstance().resetAttestationCache();
        }
        if (hashMap == null) {
            hashMap = new java.util.HashMap<>();
        }
        hashMap.put("ssmobile-pog-engine", my.com.softspace.sspog.BuildConfig.VERSION_NAME);
        hashMap.put("ssmobile-fasstap-sdk", my.com.softspace.ssfasstapsdk.BuildConfig.SDK_VERSION);
        hashMap.put("ssmobile-tee-engine", my.com.softspace.reader.BuildConfig.VERSION_NAME);
        sspog.SSPOGService.getInstance().attest(context, hashMap, new java.util.function.BiFunction() { // from class: my.com.softspace.ssfasstapsdk.internal.pog.StandardPOGHandler$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return my.com.softspace.ssfasstapsdk.internal.pog.StandardPOGHandler.getHighResolutionOutputSizeshNQ4ISI(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent.this, (java.lang.Integer) obj, (java.util.List) obj2);
            }
        }, z2 || z);
    }

    static /* synthetic */ java.lang.Void getHighResolutionOutputSizeshNQ4ISI(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.AttestationEvent attestationEvent, java.lang.Integer num, java.util.List list) {
        java.util.List<my.com.softspace.ssfasstapsdk.pog.RecoverableAction> list2 = list != null ? (java.util.List) list.stream().map(new java.util.function.Function() { // from class: my.com.softspace.ssfasstapsdk.internal.pog.StandardPOGHandler$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return my.com.softspace.ssfasstapsdk.internal.pog.StandardPOGHandler.getHighResolutionOutputSizeshNQ4ISI((sspog.SSPOGSuggestedAction) obj);
            }
        }).collect(java.util.stream.Collectors.toList()) : null;
        if (attestationEvent != null) {
            attestationEvent.onAttestationFinished(num.intValue(), list2);
        }
        return null;
    }

    static /* synthetic */ my.com.softspace.ssfasstapsdk.pog.RecoverableAction getHighResolutionOutputSizeshNQ4ISI(sspog.SSPOGSuggestedAction sSPOGSuggestedAction) {
        return new my.com.softspace.ssfasstapsdk.pog.RecoverableAction(sSPOGSuggestedAction.getIntent(), sSPOGSuggestedAction.isIncludePackage(), sSPOGSuggestedAction.getMessage(), sSPOGSuggestedAction.getErrorCode(), sSPOGSuggestedAction.getAction(), sSPOGSuggestedAction.getMessageKey());
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.String getCurrentTOTP(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        return sspog.SSPOGService.getInstance().getCurrentTOTP(context);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.String getVerifyTOTPURL() {
        return sspog.SSPOGService.getInstance().getVerifyTOTPURL();
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public long getLatestAttestationTimeTaken() {
        return sspog.SSPOGService.getInstance().getLatestAttestationTimeTaken();
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.Object[] cryptoOperation(android.content.Context context, boolean z, byte[] bArr, boolean z2) {
        return sspog.SSPOGService.getInstance().cryptoOperation(context, z, bArr, z2);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.Object[] hmacSHA256(android.content.Context context, byte[] bArr) {
        return sspog.SSPOGService.getInstance().hmacSHA256(context, bArr);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public java.lang.Object[] cmac(android.content.Context context, byte[] bArr) {
        return sspog.SSPOGService.getInstance().cmac(context, bArr);
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public int resetAttestationCache() {
        return sspog.SSPOGService.getInstance().resetAttestationCache();
    }

    @Override // my.com.softspace.ssfasstapsdk.pog.AttestationPOG
    public void cancelPin() {
        sspog.SSPOGService.getInstance().cancelPinSDK();
    }
}
