package com.google.android.gms.internal.p000authapi;

import Y4.D;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    public zbav(zbaw zbawVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbal
    public final void zbb(Status status, SavePasswordResult savePasswordResult) {
        D.U(status, savePasswordResult, this.zba);
    }
}
