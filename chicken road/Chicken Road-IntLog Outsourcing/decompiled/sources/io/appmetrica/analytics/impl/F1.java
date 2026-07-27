package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class F1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6768b;

    public F1(L1 l12, Intent intent) {
        this.f6768b = l12;
        this.f6767a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6768b.f7057b.a(this.f6767a);
    }
}
