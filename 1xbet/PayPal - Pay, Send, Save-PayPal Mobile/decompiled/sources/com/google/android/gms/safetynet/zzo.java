package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.safetynet.SafetyNetClient safetyNetClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(com.google.android.gms.common.api.Status status, boolean z) {
        com.google.android.gms.internal.safetynet.zzad zzadVar = new com.google.android.gms.internal.safetynet.zzad(status, z);
        com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse verifyAppsUserResponse = new com.google.android.gms.safetynet.SafetyNetApi.VerifyAppsUserResponse();
        verifyAppsUserResponse.setResult(zzadVar);
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, verifyAppsUserResponse, this.zza);
    }
}
