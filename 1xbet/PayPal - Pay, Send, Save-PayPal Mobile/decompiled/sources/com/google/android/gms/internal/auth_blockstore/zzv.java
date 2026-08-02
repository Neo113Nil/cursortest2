package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.internal.auth_blockstore.zzn {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.internal.auth_blockstore.zzaa zzaaVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzo
    public final void zza(com.google.android.gms.common.api.Status status, int i) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Integer.valueOf(i), this.zza);
    }
}
