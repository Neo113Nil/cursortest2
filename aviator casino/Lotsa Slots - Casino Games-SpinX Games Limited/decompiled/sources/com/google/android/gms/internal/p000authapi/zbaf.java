package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
final class zbaf extends com.google.android.gms.internal.p000authapi.zbu {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zbaf(com.google.android.gms.internal.p000authapi.zbag zbagVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbv
    public final void zbb(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.identity.SavePasswordResult savePasswordResult) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, savePasswordResult, this.zba);
    }
}
