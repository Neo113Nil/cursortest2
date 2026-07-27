package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class D1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f5826c;

    public D1(L1 l12, Intent intent, int i3) {
        this.f5826c = l12;
        this.f5824a = intent;
        this.f5825b = i3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5826c.f6202b.a(this.f5824a, this.f5825b);
    }
}
