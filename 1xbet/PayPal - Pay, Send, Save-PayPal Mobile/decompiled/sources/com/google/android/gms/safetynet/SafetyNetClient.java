package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public class SafetyNetClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    SafetyNetClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions>) com.google.android.gms.safetynet.SafetyNet.API, (com.google.android.gms.common.api.Api.ApiOptions) null, (com.google.android.gms.common.api.internal.StatusExceptionMapper) new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.AttestationResponse> attest(byte[] bArr, java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.internal.safetynet.zzae.zza(asGoogleApiClient(), bArr, str), new com.google.android.gms.safetynet.SafetyNetApi.AttestationResponse());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse> enableVerifyApps() {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.safetynet.SafetyNet.SafetyNetApi.enableVerifyApps(asGoogleApiClient()), new com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> initSafeBrowsing() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(4202).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.safetynet.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.safetynet.zzh) ((com.google.android.gms.internal.safetynet.zzaf) obj).getService()).zze(new com.google.android.gms.safetynet.zzp(com.google.android.gms.safetynet.SafetyNetClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse> isVerifyAppsEnabled() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(4201).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.safetynet.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.safetynet.zzh) ((com.google.android.gms.internal.safetynet.zzaf) obj).getService()).zzf(new com.google.android.gms.safetynet.zzo(com.google.android.gms.safetynet.SafetyNetClient.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResponse> listHarmfulApps() {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.safetynet.SafetyNet.SafetyNetApi.listHarmfulApps(asGoogleApiClient()), new com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResponse());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResponse> lookupUri(java.lang.String str, java.lang.String str2, int... iArr) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.internal.safetynet.zzae.zzb(asGoogleApiClient(), str, 3, str2, iArr), new com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResponse());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> shutdownSafeBrowsing() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(4203).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.safetynet.zzn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i = com.google.android.gms.safetynet.SafetyNetClient.zza;
                ((com.google.android.gms.internal.safetynet.zzh) ((com.google.android.gms.internal.safetynet.zzaf) obj).getService()).zzi();
            }
        }).build());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResponse> verifyWithRecaptcha(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.safetynet.SafetyNet.SafetyNetApi.verifyWithRecaptcha(asGoogleApiClient(), str), new com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResponse());
    }

    SafetyNetClient(android.content.Context context) {
        super(context, com.google.android.gms.safetynet.SafetyNet.API, (com.google.android.gms.common.api.Api.ApiOptions) null, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
    }
}
