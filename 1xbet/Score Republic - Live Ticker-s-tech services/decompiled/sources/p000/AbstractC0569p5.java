package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569p5 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m3848a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m3849b(Object obj, LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5) {
        Objects.requireNonNull(layoutInflaterFactory2C0828w5);
        C0532o5 c0532o5 = new C0532o5(0, layoutInflaterFactory2C0828w5);
        C0270h1.m2185a(obj).registerOnBackInvokedCallback(1000000, c0532o5);
        return c0532o5;
    }

    /* JADX INFO: renamed from: c */
    public static void m3850c(Object obj, Object obj2) {
        C0270h1.m2185a(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
