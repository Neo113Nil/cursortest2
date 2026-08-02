package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zban extends com.google.android.gms.internal.p000authapi.zbp {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zba;

    zban(com.google.android.gms.internal.p000authapi.zbat zbatVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        java.util.Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbq
    public final void zbb(com.google.android.gms.common.api.Status status, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, pendingIntent, this.zba);
    }
}
