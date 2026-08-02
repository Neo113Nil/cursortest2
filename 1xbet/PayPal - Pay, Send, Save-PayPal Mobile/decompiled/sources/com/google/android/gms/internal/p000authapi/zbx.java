package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbx extends com.google.android.gms.internal.p000authapi.zbh {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbx(com.google.android.gms.internal.p000authapi.zbad zbadVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbi
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult) throws android.os.RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(authorizationResult);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
