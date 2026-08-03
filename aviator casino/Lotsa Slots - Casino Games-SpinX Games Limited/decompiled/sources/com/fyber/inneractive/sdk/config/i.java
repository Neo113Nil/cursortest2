package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3614a;
    public java.lang.ref.WeakReference b;

    public i(android.content.Context context, android.content.Context context2) {
        com.fyber.inneractive.sdk.config.h hVar = new com.fyber.inneractive.sdk.config.h(this);
        this.f3614a = context2;
        if (context instanceof android.app.Activity) {
            this.b = new java.lang.ref.WeakReference(context);
            ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }

    public final android.content.Context a() {
        android.content.Context context = (android.content.Context) com.fyber.inneractive.sdk.util.v.a(this.b);
        return context != null ? context : this.f3614a;
    }
}
