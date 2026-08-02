package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.gms.internal.fido.zzd {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzu(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient fido2PrivilegedApiClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z) {
        this.zza.setResult(java.lang.Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.fido.zze
    public final void zzc(com.google.android.gms.common.api.Status status) {
        this.zza.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }
}
