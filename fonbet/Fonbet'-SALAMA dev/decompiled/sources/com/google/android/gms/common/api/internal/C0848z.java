package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848z implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f11204b;

    public C0848z(A a2, TaskCompletionSource taskCompletionSource) {
        this.f11204b = a2;
        this.f11203a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        ((Map) this.f11204b.f11091b).remove(this.f11203a);
    }
}
