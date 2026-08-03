package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
final class zbz extends com.google.android.gms.internal.p000authapi.zbi {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbz(com.google.android.gms.internal.p000authapi.zbaa zbaaVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult) throws android.os.RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(authorizationResult);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
