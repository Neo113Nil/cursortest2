package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final i5 f4802a = new i5();
    public static WeakReference b;
    public static Application c;

    public final Context a() {
        Context context;
        WeakReference weakReference = b;
        return (weakReference == null || (context = (Context) weakReference.get()) == null) ? c : context;
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            c = (Application) context;
            return;
        }
        b = new WeakReference(context);
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        c = applicationContext instanceof Application ? (Application) applicationContext : null;
    }
}
