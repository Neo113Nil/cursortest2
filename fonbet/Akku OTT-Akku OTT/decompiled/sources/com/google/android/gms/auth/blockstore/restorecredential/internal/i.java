package com.google.android.gms.auth.blockstore.restorecredential.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class i extends a {
    public final /* synthetic */ TaskCompletionSource<Boolean> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TaskCompletionSource<Boolean> taskCompletionSource) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        this.a = taskCompletionSource;
    }
}
