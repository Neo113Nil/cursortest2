package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: classes6.dex */
public class X3 {

    /* renamed from: a, reason: collision with root package name */
    MutableContextWrapper f8003a;

    public synchronized void a(Activity activity) {
        if (this.f8003a == null) {
            this.f8003a = new MutableContextWrapper(activity);
        }
        this.f8003a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f8003a = null;
    }

    public Activity a() {
        return (Activity) this.f8003a.getBaseContext();
    }
}
