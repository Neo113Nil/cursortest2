package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import w1.C1722m0;

/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11338b;

    public y(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, C1722m0 c1722m0) {
        this.f11337a = basePendingResult;
        this.f11338b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean j = status.j();
        TaskCompletionSource taskCompletionSource = this.f11338b;
        if (!j) {
            taskCompletionSource.setException(D.n(status));
            return;
        }
        this.f11337a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
