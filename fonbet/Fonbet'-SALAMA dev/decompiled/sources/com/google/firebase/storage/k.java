package com.google.firebase.storage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class k implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12042a;

    public k(TaskCompletionSource taskCompletionSource) {
        this.f12042a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f12042a.setException(i.b(exc, 0));
    }
}
