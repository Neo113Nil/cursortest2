package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class G1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f5974b;

    public G1(L1 l12, Intent intent) {
        this.f5974b = l12;
        this.f5973a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5974b.f6202b.c(this.f5973a);
    }
}
