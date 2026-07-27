package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039u implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1040v f9071a;

    public C1039u(C1040v c1040v) {
        this.f9071a = c1040v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i3 = AbstractC1038t.f9070a[activityEvent.ordinal()];
        try {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                this.f9071a.f9072a.getContext().getContentResolver().unregisterContentObserver(this.f9071a.f9075d);
            } else {
                C1030k c1030k = this.f9071a.f9074c;
                if (c1030k == null || !c1030k.f9049a) {
                    return;
                }
                this.f9071a.f9072a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f9071a.f9075d);
            }
        } catch (Throwable unused) {
        }
    }
}
