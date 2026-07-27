package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes.dex */
public final class M3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C0618ef f7131a;

    public M3(C0618ef c0618ef) {
        super(c0618ef.e(), "[ClientApiTrackingStatusToggle]");
        this.f7131a = c0618ef;
    }

    public final void a(boolean z) {
        updateState(z);
        this.f7131a.f(z);
    }
}
