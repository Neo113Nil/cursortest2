package D;

import android.view.View;
import com.chicken.jump.road.pump.R;
import java.util.Objects;
import p.C1161k;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019u {
    public static void a(View view, InterfaceC0022x interfaceC0022x) {
        C1161k c1161k = (C1161k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1161k == null) {
            c1161k = new C1161k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1161k);
        }
        Objects.requireNonNull(interfaceC0022x);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0018t = new ViewOnUnhandledKeyEventListenerC0018t();
        c1161k.put(interfaceC0022x, viewOnUnhandledKeyEventListenerC0018t);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0018t);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, InterfaceC0022x interfaceC0022x) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1161k c1161k = (C1161k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1161k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1161k.getOrDefault(interfaceC0022x, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, F.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
