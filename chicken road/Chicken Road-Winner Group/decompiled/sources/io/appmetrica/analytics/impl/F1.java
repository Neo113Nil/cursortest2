package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class F1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f5926b;

    public F1(L1 l12, Intent intent) {
        this.f5926b = l12;
        this.f5925a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5926b.f6202b.a(this.f5925a);
    }
}
