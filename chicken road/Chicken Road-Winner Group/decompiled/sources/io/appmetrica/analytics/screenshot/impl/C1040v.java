package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9072a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9073b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1030k f9074c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f9075d;

    public C1040v(ClientContext clientContext, U u3) {
        this.f9072a = clientContext;
        this.f9073b = u3;
        this.f9075d = new Z(clientContext, new C1037s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1032m c1032m) {
        this.f9074c = c1032m != null ? c1032m.f9061c : null;
        this.f9075d.f9023c = this.f9074c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f9072a.getActivityLifecycleRegistry().registerListener(new C1039u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
