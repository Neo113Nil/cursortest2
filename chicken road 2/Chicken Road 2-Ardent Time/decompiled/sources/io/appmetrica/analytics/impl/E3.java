package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E3 extends io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ze f4248a;

    public E3(io.appmetrica.analytics.impl.Ze ze) {
        super(ze.e(), "[ClientApiTrackingStatusToggle]");
        this.f4248a = ze;
    }

    public final void a(boolean z2) {
        updateState(z2);
        this.f4248a.f(z2);
    }
}
