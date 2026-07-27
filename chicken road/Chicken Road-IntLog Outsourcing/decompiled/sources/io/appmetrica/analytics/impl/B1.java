package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class B1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f6578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6579b;

    public B1(L1 l12, Configuration configuration) {
        this.f6579b = l12;
        this.f6578a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6579b.f7057b.onConfigurationChanged(this.f6578a);
    }
}
