package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5266a;
    public WeakReference b;

    public j(Context context, Context context2) {
        i iVar = new i(this);
        this.f5266a = context2;
        if (context instanceof Activity) {
            this.b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(iVar);
        }
    }

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.b);
        return context != null ? context : this.f5266a;
    }
}
