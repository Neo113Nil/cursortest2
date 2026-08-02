package com.google.android.gms.auth.blockstore.restorecredential.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class j extends b {
    public final /* synthetic */ TaskCompletionSource<com.google.android.gms.auth.blockstore.restorecredential.e> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TaskCompletionSource<com.google.android.gms.auth.blockstore.restorecredential.e> taskCompletionSource) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback");
        this.a = taskCompletionSource;
    }
}
