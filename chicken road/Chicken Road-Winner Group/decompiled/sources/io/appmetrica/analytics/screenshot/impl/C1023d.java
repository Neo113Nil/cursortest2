package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import d2.C0277g;
import d2.InterfaceC0273c;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9029a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9030b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1029j f9031c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0273c f9032d = new C0277g(new C1020a(this));

    public C1023d(ClientContext clientContext, U u3) {
        this.f9029a = clientContext;
        this.f9030b = u3;
    }

    public static final Activity.ScreenCaptureCallback d(C1023d c1023d) {
        return G1.b.l(((C0277g) c1023d.f9032d).a());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1032m c1032m) {
        this.f9031c = c1032m != null ? c1032m.f9059a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f9029a.getActivityLifecycleRegistry().registerListener(new C1022c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
