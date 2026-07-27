package com.mbridge.msdk.config.activity.backdispatcher;

import android.os.Build;
import android.util.Log;
import android.view.Window;
import android.window.OnBackInvokedCallback;

/* compiled from: MBOnBackInvokedDispatcher.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    OnBackInvokedCallback f8897a;

    public void a(Window window, final b bVar) {
        if (Build.VERSION.SDK_INT < 33 || window == null || bVar == null) {
            return;
        }
        try {
            this.f8897a = new OnBackInvokedCallback() { // from class: com.mbridge.msdk.config.activity.backdispatcher.a$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    b.this.a();
                }
            };
            window.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f8897a);
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "registerOnBackInvokedCallback error");
        }
    }

    public void a(Window window) {
        if (Build.VERSION.SDK_INT < 33 || window == null) {
            return;
        }
        try {
            window.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f8897a);
            this.f8897a = null;
        } catch (Throwable unused) {
            Log.e("MBOnBackInvokedCallback", "unregisterOnBackInvokedCallback error");
        }
    }
}
