package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class K1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f6173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6174b;

    public K1(L1 l12, Bundle bundle) {
        this.f6174b = l12;
        this.f6173a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6174b.f6202b.pauseUserSession(this.f6173a);
    }
}
