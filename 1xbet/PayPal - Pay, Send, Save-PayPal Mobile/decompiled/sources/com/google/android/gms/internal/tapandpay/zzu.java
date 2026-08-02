package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzu(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzq(com.google.android.gms.common.api.Status status, com.google.android.gms.tapandpay.issuer.TokenStatus tokenStatus) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, tokenStatus, this.zza);
    }
}
