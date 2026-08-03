package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
class zzj extends com.google.android.gms.internal.auth.zzan {
    final com.google.android.gms.auth.api.accounttransfer.zzl zzb;

    public zzj(com.google.android.gms.auth.api.accounttransfer.zzl zzlVar) {
        this.zzb = zzlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.zzb.zzb;
        int i = com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza;
        taskCompletionSource.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(status));
    }
}
