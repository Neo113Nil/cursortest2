package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
final class zzp extends com.google.android.gms.internal.safetynet.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzp(com.google.android.gms.safetynet.SafetyNetClient safetyNetClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzc(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zza);
    }
}
