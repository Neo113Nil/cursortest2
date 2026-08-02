package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzr extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzr(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzd(com.google.android.gms.common.api.Status status, android.os.Bundle bundle) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status.hasResolution() ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : status, status.getResolution(), this.zza);
    }
}
