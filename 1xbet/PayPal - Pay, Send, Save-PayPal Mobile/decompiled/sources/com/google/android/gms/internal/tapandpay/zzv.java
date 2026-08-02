package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzp(com.google.android.gms.common.api.Status status, java.lang.String str) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}
