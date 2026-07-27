package com.startapp.sdk.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class kf extends k6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f3960a;

    public kf(pf pfVar) {
        this.f3960a = pfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        try {
            this.f3960a.a(activity);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
