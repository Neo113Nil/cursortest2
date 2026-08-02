package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.C0809c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zbx extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    public zbx(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbi
    public final void zbb(Status status, C0809c c0809c) throws RemoteException {
        if (status.l()) {
            this.zba.setResult(c0809c);
        } else {
            this.zba.setException(C0860b.a(status));
        }
    }
}
