package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.auth.zzn {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzw(com.google.android.gms.internal.auth.zzab zzabVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzo
    public final void zzb(com.google.android.gms.common.api.Status status, android.os.Bundle bundle) {
        com.google.android.gms.internal.auth.zzab.zzf(status, bundle, this.zza);
    }
}
