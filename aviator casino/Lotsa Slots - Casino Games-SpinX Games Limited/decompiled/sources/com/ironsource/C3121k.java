package com.ironsource;

/* renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3121k implements com.ironsource.Bg {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.app.Activity> f6330a;

    public C3121k(android.app.Activity activity) {
        this.f6330a = new java.lang.ref.WeakReference<>(activity);
    }

    @Override // com.ironsource.Bg
    public void a() {
        android.app.Activity activity = this.f6330a.get();
        if (activity == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        android.view.WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(android.view.WindowInsets.Type.statusBars());
        }
    }
}
