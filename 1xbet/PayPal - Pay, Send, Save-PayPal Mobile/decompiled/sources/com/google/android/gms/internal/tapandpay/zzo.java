package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzN(com.google.android.gms.common.api.Status status, com.google.android.gms.tapandpay.issuer.TokenInfo[] tokenInfoArr) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, com.google.android.gms.internal.tapandpay.zzby.zzg(tokenInfoArr), this.zza);
    }
}
