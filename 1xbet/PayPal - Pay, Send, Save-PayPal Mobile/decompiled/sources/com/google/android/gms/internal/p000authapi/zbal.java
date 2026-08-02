package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbal extends com.google.android.gms.internal.p000authapi.zbk {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbal(com.google.android.gms.internal.p000authapi.zbat zbatVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbl
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, beginSignInResult, this.zba);
    }
}
