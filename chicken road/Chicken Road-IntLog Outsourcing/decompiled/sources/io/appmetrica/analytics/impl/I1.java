package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class I1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f6902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f6903c;

    public I1(L1 l12, int i2, Bundle bundle) {
        this.f6903c = l12;
        this.f6901a = i2;
        this.f6902b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6903c.f7057b.reportData(this.f6901a, this.f6902b);
    }
}
