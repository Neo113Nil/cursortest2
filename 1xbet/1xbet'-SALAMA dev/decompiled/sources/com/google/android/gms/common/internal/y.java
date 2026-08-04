package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11338b;

    public y(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, C1013m0 c1013m0) {
        this.f11337a = basePendingResult;
        this.f11338b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        boolean zJ = status.j();
        TaskCompletionSource taskCompletionSource = this.f11338b;
        if (!zJ) {
            taskCompletionSource.setException(D.n(status));
            return;
        }
        this.f11337a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
