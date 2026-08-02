package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzbe extends com.google.android.gms.internal.tapandpay.zzbn {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbe(com.google.android.gms.internal.tapandpay.zzbi zzbiVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbn, com.google.android.gms.internal.tapandpay.zzm
    public final void zza(com.google.android.gms.common.api.Status status, java.lang.String str) {
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}
