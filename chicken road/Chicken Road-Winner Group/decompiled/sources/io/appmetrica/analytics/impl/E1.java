package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class E1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L1 f5872d;

    public E1(L1 l12, Intent intent, int i3, int i4) {
        this.f5872d = l12;
        this.f5869a = intent;
        this.f5870b = i3;
        this.f5871c = i4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5872d.f6202b.a(this.f5869a, this.f5870b, this.f5871c);
    }
}
