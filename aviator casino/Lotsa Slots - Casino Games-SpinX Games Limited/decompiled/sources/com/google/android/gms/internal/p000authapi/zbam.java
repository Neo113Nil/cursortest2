package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
final class zbam extends com.google.android.gms.internal.p000authapi.zbl {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbam(com.google.android.gms.internal.p000authapi.zbaq zbaqVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.BeginSignInResult beginSignInResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, beginSignInResult, this.zba);
    }
}
