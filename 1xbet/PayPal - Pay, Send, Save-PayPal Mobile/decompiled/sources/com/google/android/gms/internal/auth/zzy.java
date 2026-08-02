package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.gms.internal.auth.zzj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzy(com.google.android.gms.internal.auth.zzab zzabVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void zzb(com.google.android.gms.common.api.Status status, android.os.Bundle bundle) {
        com.google.android.gms.internal.auth.zzab.zzf(status, bundle, this.zza);
    }
}
