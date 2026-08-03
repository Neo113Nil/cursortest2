package com.fyber.inneractive.sdk.ui.controller;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.ui.controller.b {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ui.controller.c f4276a;
    public final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f) {
        if (f < 0.01f || !this.b.compareAndSet(false, true)) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Float.valueOf(f * 100.0f));
        this.f4276a.t();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }
}
