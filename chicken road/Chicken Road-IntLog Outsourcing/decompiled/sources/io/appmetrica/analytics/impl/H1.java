package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class H1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6852b;

    public H1(L1 l12, Intent intent) {
        this.f6852b = l12;
        this.f6851a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6852b.f7057b.b(this.f6851a);
    }
}
