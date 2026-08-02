package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzv(com.google.android.gms.internal.p001authapiphone.zzab zzabVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        java.util.Objects.requireNonNull(zzabVar);
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) {
        if (status.getStatusCode() == 6) {
            this.zza.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        } else {
            com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zza);
        }
    }
}
