package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class H1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6007b;

    public H1(L1 l12, Intent intent) {
        this.f6007b = l12;
        this.f6006a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6007b.f6202b.b(this.f6006a);
    }
}
