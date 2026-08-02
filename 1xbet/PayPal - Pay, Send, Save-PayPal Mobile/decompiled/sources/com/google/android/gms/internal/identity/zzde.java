package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzde extends com.google.android.gms.internal.identity.zzaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzde(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public final void zzb(com.google.android.gms.location.LocationSettingsResult locationSettingsResult) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(locationSettingsResult.getStatus(), new com.google.android.gms.location.LocationSettingsResponse(locationSettingsResult), this.zza);
    }
}
