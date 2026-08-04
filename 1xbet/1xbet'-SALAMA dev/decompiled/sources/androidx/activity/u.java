package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f8129a = new u();

    public final OnBackInvokedCallback a(s6.a aVar) {
        t6.h.e(aVar, "onBackInvoked");
        return new t(aVar, 0);
    }

    public final void b(Object obj, int i7, Object obj2) {
        t6.h.e(obj, "dispatcher");
        t6.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i7, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        t6.h.e(obj, "dispatcher");
        t6.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
