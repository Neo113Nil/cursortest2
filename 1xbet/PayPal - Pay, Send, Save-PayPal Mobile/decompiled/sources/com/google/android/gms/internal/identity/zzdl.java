package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdl extends com.google.android.gms.internal.identity.zzw {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzdl(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzx
    public final void zzb(com.google.android.gms.common.api.Status status, com.google.android.gms.location.LocationAvailability locationAvailability) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, locationAvailability, this.zza);
    }
}
