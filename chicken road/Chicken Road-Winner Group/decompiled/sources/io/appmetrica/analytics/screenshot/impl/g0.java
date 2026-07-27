package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9037a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9038b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9039c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f9040d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1033n f9041e;
    public final d0 f = new d0(this);

    public g0(ClientContext clientContext, U u3) {
        this.f9037a = clientContext;
        this.f9038b = u3;
        this.f9039c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1032m c1032m) {
        this.f9041e = c1032m != null ? c1032m.f9060b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f9037a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
