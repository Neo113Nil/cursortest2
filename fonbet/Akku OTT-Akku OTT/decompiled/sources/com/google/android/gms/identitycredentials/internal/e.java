package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.identitycredentials.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class e extends a {
    public final /* synthetic */ TaskCompletionSource<l> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaskCompletionSource<l> taskCompletionSource) {
        super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        this.a = taskCompletionSource;
    }
}
