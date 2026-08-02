package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.auth_blockstore.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzw(com.google.android.gms.internal.auth_blockstore.zzaa zzaaVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zzb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.blockstore.RetrieveBytesResponse retrieveBytesResponse) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, retrieveBytesResponse, this.zza);
    }
}
