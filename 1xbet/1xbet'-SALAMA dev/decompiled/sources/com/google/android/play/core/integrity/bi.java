package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class bi extends A3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f11643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f11644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f11644b = bnVar;
        this.f11643a = taskCompletionSource;
    }

    @Override // A3.r
    public final void b(Bundle bundle) {
        this.f11644b.f11652a.d(this.f11643a);
    }

    @Override // A3.r
    public void c(Bundle bundle) {
        this.f11644b.f11652a.d(this.f11643a);
    }

    @Override // A3.r
    public final void d(Bundle bundle) {
        this.f11644b.f11652a.d(this.f11643a);
    }

    @Override // A3.r
    public void e(Bundle bundle) {
        this.f11644b.f11652a.d(this.f11643a);
    }
}
