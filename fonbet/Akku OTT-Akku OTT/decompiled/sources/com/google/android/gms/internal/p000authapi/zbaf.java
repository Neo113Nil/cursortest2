package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0817k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zbaf extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    public zbaf(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs
    public final void zbb(Status status, C0817k c0817k) throws RemoteException {
        if (status.l()) {
            this.zba.setResult(c0817k);
        } else {
            this.zba.setException(C0860b.a(status));
        }
    }
}
