package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4486k implements Eg {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f8274a;

    public C4486k(Activity activity) {
        this.f8274a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Eg
    public void a() {
        Activity activity = this.f8274a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
