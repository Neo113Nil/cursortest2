package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class D1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f6662c;

    public D1(L1 l12, Intent intent, int i2) {
        this.f6662c = l12;
        this.f6660a = intent;
        this.f6661b = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6662c.f7057b.a(this.f6660a, this.f6661b);
    }
}
