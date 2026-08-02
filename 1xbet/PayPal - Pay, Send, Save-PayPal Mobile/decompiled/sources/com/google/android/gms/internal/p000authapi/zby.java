package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zby extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zby(com.google.android.gms.internal.p000authapi.zbad zbadVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(null);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
