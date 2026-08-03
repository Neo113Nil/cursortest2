package com.ironsource;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3139l implements com.ironsource.Bg {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.app.Activity> f6351a;

    public C3139l(android.app.Activity activity) {
        this.f6351a = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // com.ironsource.Bg
    public void a() {
        android.app.Activity activity = this.f6351a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
