package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10054a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10055b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1179k f10056c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f10057d;

    public C1189v(ClientContext clientContext, U u5) {
        this.f10054a = clientContext;
        this.f10055b = u5;
        this.f10057d = new Z(clientContext, new C1186s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1181m c1181m) {
        this.f10056c = c1181m != null ? c1181m.f10043c : null;
        this.f10057d.f10004c = this.f10056c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f10054a.getActivityLifecycleRegistry().registerListener(new C1188u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
