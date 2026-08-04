package P;

import android.view.View;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static void a(View view, S s7) {
        p122r.l lVar = (p122r.l) view.getTag(R.id.tag_unhandled_key_listeners);
        if (lVar == null) {
            lVar = new p122r.l();
            view.setTag(R.id.tag_unhandled_key_listeners, lVar);
        }
        Objects.requireNonNull(s7);
        View.OnUnhandledKeyEventListener l7 = new L();
        lVar.put(s7, l7);
        view.addOnUnhandledKeyEventListener(l7);
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

    public static void e(View view, S s7) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        p122r.l lVar = (p122r.l) view.getTag(R.id.tag_unhandled_key_listeners);
        if (lVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) lVar.getOrDefault(s7, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i7) {
        return (T) view.requireViewById(i7);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, S.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
