package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbz
    public final void zbb(Status status, AuthorizationResult authorizationResult) {
        if (status.j()) {
            this.zba.setResult(authorizationResult);
        } else {
            this.zba.setException(D.n(status));
        }
    }
}
