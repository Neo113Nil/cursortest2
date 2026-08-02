package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0834h;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zby extends InterfaceC0834h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zby(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0834h
    public final void onResult(Status status) throws RemoteException {
        if (status.l()) {
            this.zba.setResult(null);
        } else {
            this.zba.setException(C0860b.a(status));
        }
    }
}
