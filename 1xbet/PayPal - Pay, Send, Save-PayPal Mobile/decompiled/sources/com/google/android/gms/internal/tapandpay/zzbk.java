package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbk extends com.google.android.gms.internal.tapandpay.zzbj {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzbk(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzd(com.google.android.gms.common.api.Status status, android.os.Bundle bundle) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status.hasResolution() ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : status.getStatus(), status.getResolution(), this.zza);
    }
}
