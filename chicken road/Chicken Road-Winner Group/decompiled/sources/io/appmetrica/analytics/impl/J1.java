package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class J1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f6143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6144b;

    public J1(L1 l12, Bundle bundle) {
        this.f6144b = l12;
        this.f6143a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6144b.f6202b.resumeUserSession(this.f6143a);
    }
}
