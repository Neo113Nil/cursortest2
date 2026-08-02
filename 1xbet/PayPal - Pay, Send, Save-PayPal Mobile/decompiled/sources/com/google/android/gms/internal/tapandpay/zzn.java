package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzn extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzn(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzG(com.google.android.gms.common.api.Status status, java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}
