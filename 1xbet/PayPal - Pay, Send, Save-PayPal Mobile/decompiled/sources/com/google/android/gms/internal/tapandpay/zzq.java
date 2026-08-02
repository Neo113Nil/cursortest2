package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzq extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzq(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzM(com.google.android.gms.common.api.Status status, boolean z) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, java.lang.Boolean.valueOf(z), this.zza);
    }
}
