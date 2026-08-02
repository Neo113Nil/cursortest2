package com.google.android.gms.fido.fido2;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.internal.fido.zzf {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient fido2PrivilegedApiClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzb(java.util.List list) {
        this.zza.setResult(list);
    }

    @Override // com.google.android.gms.internal.fido.zzg
    public final void zzc(com.google.android.gms.common.api.Status status) {
        this.zza.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }
}
