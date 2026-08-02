package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0851z implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ A b;

    public C0851z(A a, TaskCompletionSource taskCompletionSource) {
        this.b = a;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.b.b.remove(this.a);
    }
}
