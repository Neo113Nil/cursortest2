package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
final class zzz extends com.google.android.gms.internal.auth_blockstore.zzj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzz(com.google.android.gms.internal.auth_blockstore.zzaa zzaaVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzk
    public final void zza(com.google.android.gms.common.api.Status status, boolean z) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, java.lang.Boolean.valueOf(z), this.zza);
    }
}
