package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzdk extends com.google.android.gms.internal.identity.zzy {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzdk(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzz
    public final void zzb(com.google.android.gms.common.api.Status status, android.location.Location location) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, location, this.zza);
    }
}
