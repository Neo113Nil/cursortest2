package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class B1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f5746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f5747b;

    public B1(L1 l12, Configuration configuration) {
        this.f5747b = l12;
        this.f5746a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5747b.f6202b.onConfigurationChanged(this.f5746a);
    }
}
