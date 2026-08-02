package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzae implements com.google.android.gms.safetynet.SafetyNetApi {
    private static final java.lang.String zza = "zzae";

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.AttestationResult> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, byte[] bArr, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzi(googleApiClient, bArr, str));
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> zzb(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, int i, java.lang.String str2, int... iArr) {
        if (iArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzk(googleApiClient, iArr, i, str, str2));
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.AttestationResult> attest(com.google.android.gms.common.api.GoogleApiClient googleApiClient, byte[] bArr) {
        return zza(googleApiClient, bArr, null);
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> enableVerifyApps(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzm(this, googleApiClient));
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final boolean isVerifyAppsEnabled(android.content.Context context) {
        com.google.android.gms.tasks.Task<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse> isVerifyAppsEnabled = com.google.android.gms.safetynet.SafetyNet.getClient(context).isVerifyAppsEnabled();
        try {
            com.google.android.gms.tasks.Tasks.await(isVerifyAppsEnabled, 15000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            return isVerifyAppsEnabled.getResult().isVerifyAppsEnabled();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.HarmfulAppsResult> listHarmfulApps(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzn(this, googleApiClient));
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> lookupUri(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str, java.lang.String str2, int... iArr) {
        return zzb(googleApiClient, str, 1, str2, iArr);
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.RecaptchaTokenResult> verifyWithRecaptcha(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Null or empty site key in verifyWithRecaptcha");
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzo(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> lookupUri(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.util.List<java.lang.Integer> list, java.lang.String str) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("Null threatTypes in lookupUri");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Null or empty uri in lookupUri");
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzj(this, googleApiClient, list, str, null));
    }

    @Override // com.google.android.gms.safetynet.SafetyNetApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResult> isVerifyAppsEnabled(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.safetynet.zzl(this, googleApiClient));
    }
}
