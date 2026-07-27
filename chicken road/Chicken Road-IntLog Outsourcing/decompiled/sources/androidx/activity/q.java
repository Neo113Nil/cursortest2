package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4068a = new q();

    public final OnBackInvokedCallback a(InterfaceC1430a onBackInvoked) {
        kotlin.jvm.internal.i.e(onBackInvoked, "onBackInvoked");
        return new p(0, onBackInvoked);
    }

    public final void b(Object dispatcher, int i2, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.i.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.i.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
