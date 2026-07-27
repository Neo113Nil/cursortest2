package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class J1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f6995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6996b;

    public J1(L1 l12, Bundle bundle) {
        this.f6996b = l12;
        this.f6995a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6996b.f7057b.resumeUserSession(this.f6995a);
    }
}
