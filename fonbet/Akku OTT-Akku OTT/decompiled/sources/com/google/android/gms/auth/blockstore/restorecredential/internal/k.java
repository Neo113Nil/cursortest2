package com.google.android.gms.auth.blockstore.restorecredential.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class k extends c {
    public final /* synthetic */ TaskCompletionSource<com.google.android.gms.auth.blockstore.restorecredential.i> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TaskCompletionSource<com.google.android.gms.auth.blockstore.restorecredential.i> taskCompletionSource) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        this.a = taskCompletionSource;
    }
}
