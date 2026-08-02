package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdm extends com.google.android.gms.internal.identity.zzn {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzdm(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzo
    public final void zzb(com.google.android.gms.common.api.Status status, boolean z) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Boolean.valueOf(z), this.zza);
    }
}
