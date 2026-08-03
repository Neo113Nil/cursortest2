package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885a extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.screenshot.impl.C0888d f7537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0885a(io.appmetrica.analytics.screenshot.impl.C0888d c0888d) {
        super(0);
        this.f7537a = c0888d;
    }

    public static final void a(io.appmetrica.analytics.screenshot.impl.C0888d c0888d) {
        ((io.appmetrica.analytics.screenshot.impl.C0907x) c0888d.f7543b).a("AndroidApiScreenshotCaptor");
    }

    @Override // s1.InterfaceC0991a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.app.Activity.ScreenCaptureCallback invoke() {
        final io.appmetrica.analytics.screenshot.impl.C0888d c0888d = this.f7537a;
        return new android.app.Activity.ScreenCaptureCallback() { // from class: N0.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                io.appmetrica.analytics.screenshot.impl.C0885a.a(io.appmetrica.analytics.screenshot.impl.C0888d.this);
            }
        };
    }
}
