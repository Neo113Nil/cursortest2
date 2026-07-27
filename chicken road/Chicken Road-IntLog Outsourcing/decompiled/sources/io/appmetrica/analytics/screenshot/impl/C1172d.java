package io.appmetrica.analytics.screenshot.impl;

import a.AbstractC0169a;
import android.app.Activity;
import f4.InterfaceC0428e;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172d implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10010a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10011b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1178j f10012c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0428e f10013d = AbstractC0169a.A(new C1169a(this));

    public C1172d(ClientContext clientContext, U u5) {
        this.f10010a = clientContext;
        this.f10011b = u5;
    }

    public static final Activity.ScreenCaptureCallback d(C1172d c1172d) {
        return G2.a.c(c1172d.f10013d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1181m c1181m) {
        this.f10012c = c1181m != null ? c1181m.f10041a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f10010a.getActivityLifecycleRegistry().registerListener(new C1171c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
