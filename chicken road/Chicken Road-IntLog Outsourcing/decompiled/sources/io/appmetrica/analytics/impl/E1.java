package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class E1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L1 f6711d;

    public E1(L1 l12, Intent intent, int i2, int i3) {
        this.f6711d = l12;
        this.f6708a = intent;
        this.f6709b = i2;
        this.f6710c = i3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6711d.f7057b.a(this.f6708a, this.f6709b, this.f6710c);
    }
}
