package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbam extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbam(com.google.android.gms.internal.p000authapi.zbat zbatVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zba);
    }
}
