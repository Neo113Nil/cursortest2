package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0848w;
import com.google.android.gms.common.api.internal.InterfaceC0834h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zbam extends InterfaceC0834h.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zbam(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0834h
    public final void onResult(Status status) throws RemoteException {
        C0848w.a(status, null, this.zba);
    }
}
