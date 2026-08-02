package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class I implements i.a {
    public final /* synthetic */ com.google.android.gms.common.api.i a;
    public final /* synthetic */ TaskCompletionSource b;

    public I(com.google.android.gms.common.api.i iVar, TaskCompletionSource taskCompletionSource, J j) {
        this.a = iVar;
        this.b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        boolean l = status.l();
        TaskCompletionSource taskCompletionSource = this.b;
        if (!l) {
            taskCompletionSource.setException(C0860b.a(status));
            return;
        }
        this.a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
