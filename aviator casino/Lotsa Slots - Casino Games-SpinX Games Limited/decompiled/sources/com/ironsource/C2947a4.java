package com.ironsource;

/* renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2947a4 {

    /* renamed from: a, reason: collision with root package name */
    android.content.MutableContextWrapper f6133a;

    public synchronized void a(android.app.Activity activity) {
        if (this.f6133a == null) {
            this.f6133a = new android.content.MutableContextWrapper(activity);
        }
        this.f6133a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f6133a = null;
    }

    public android.app.Activity a() {
        return (android.app.Activity) this.f6133a.getBaseContext();
    }
}
