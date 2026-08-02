package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbag extends com.google.android.gms.internal.p000authapi.zbt {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbag(com.google.android.gms.internal.p000authapi.zbaj zbajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.SavePasswordResult savePasswordResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, savePasswordResult, this.zba);
    }
}
