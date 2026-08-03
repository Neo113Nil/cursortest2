package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904u implements io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.screenshot.impl.C0905v f7585a;

    public C0904u(io.appmetrica.analytics.screenshot.impl.C0905v c0905v) {
        this.f7585a = c0905v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(android.app.Activity activity, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent activityEvent) {
        int i2 = io.appmetrica.analytics.screenshot.impl.AbstractC0903t.f7584a[activityEvent.ordinal()];
        try {
            if (i2 == 1) {
                io.appmetrica.analytics.screenshot.impl.C0895k c0895k = this.f7585a.f7588c;
                if (c0895k == null || !c0895k.f7563a) {
                } else {
                    this.f7585a.f7586a.getContext().getContentResolver().registerContentObserver(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f7585a.f7589d);
                }
            } else if (i2 != 2) {
            } else {
                this.f7585a.f7586a.getContext().getContentResolver().unregisterContentObserver(this.f7585a.f7589d);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
