package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes.dex */
public final class M3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final C0469ef f6275a;

    public M3(C0469ef c0469ef) {
        super(c0469ef.e(), "[ClientApiTrackingStatusToggle]");
        this.f6275a = c0469ef;
    }

    public final void a(boolean z3) {
        updateState(z3);
        this.f6275a.f(z3);
    }
}
