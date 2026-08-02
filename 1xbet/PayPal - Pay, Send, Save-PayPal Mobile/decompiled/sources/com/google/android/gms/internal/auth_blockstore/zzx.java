package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
final class zzx extends com.google.android.gms.internal.auth_blockstore.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzx(com.google.android.gms.internal.auth_blockstore.zzaa zzaaVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zza(com.google.android.gms.common.api.Status status, byte[] bArr) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, bArr, this.zza);
    }
}
