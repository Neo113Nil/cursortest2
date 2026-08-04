package com.google.android.gms.internal.p000authapi;

import Y4.D;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC0788i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbbd extends AbstractBinderC0788i {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbd(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0789j
    public final void onResult(Status status) {
        D.U(status, null, this.zba);
    }
}
