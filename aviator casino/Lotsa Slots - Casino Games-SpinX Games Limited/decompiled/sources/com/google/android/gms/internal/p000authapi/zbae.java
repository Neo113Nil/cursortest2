package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
final class zbae extends com.google.android.gms.internal.p000authapi.zbs {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbae(com.google.android.gms.internal.p000authapi.zbag zbagVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws android.os.RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(saveAccountLinkingTokenResult);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
