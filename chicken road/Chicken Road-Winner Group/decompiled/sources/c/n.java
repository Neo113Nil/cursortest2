package c;

import I1.C0025b;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2520a = new n();

    public final OnBackInvokedCallback a(o2.a onBackInvoked) {
        kotlin.jvm.internal.j.e(onBackInvoked, "onBackInvoked");
        return new C0025b(1, onBackInvoked);
    }

    public final void b(Object dispatcher, int i3, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.j.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.j.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
