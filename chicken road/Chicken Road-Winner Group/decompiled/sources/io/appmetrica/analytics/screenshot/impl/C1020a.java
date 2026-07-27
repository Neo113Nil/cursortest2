package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C1020a;
import io.appmetrica.analytics.screenshot.impl.C1023d;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020a extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1023d f9024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020a(C1023d c1023d) {
        super(0);
        this.f9024a = c1023d;
    }

    public static final void a(C1023d c1023d) {
        ((C1042x) c1023d.f9030b).a("AndroidApiScreenshotCaptor");
    }

    @Override // o2.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C1023d c1023d = this.f9024a;
        return new Activity.ScreenCaptureCallback() { // from class: G1.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C1020a.a(C1023d.this);
            }
        };
    }
}
