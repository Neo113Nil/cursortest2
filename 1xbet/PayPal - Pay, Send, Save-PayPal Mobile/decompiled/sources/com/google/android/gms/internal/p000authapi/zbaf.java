package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbaf extends com.google.android.gms.internal.p000authapi.zbr {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbaf(com.google.android.gms.internal.p000authapi.zbaj zbajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws android.os.RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(saveAccountLinkingTokenResult);
        } else {
            this.zba.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
