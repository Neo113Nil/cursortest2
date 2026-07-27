package E;

import android.view.View;
import com.chickyneer.roadway.R;
import java.util.Objects;
import r.C1401k;

/* loaded from: classes.dex */
public abstract class B {
    public static void a(View view, E e3) {
        C1401k c1401k = (C1401k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1401k == null) {
            c1401k = new C1401k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1401k);
        }
        Objects.requireNonNull(e3);
        View.OnUnhandledKeyEventListener a6 = new A();
        c1401k.put(e3, a6);
        view.addOnUnhandledKeyEventListener(a6);
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

    public static void e(View view, E e3) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1401k c1401k = (C1401k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1401k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1401k.getOrDefault(e3, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, G.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
