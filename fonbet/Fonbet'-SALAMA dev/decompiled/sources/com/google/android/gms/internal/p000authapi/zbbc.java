package com.google.android.gms.internal.p000authapi;

import Y4.D;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbc(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbac
    public final void zbb(Status status, BeginSignInResult beginSignInResult) {
        D.U(status, beginSignInResult, this.zba);
    }
}
