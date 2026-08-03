package y;

/* renamed from: y.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1031t {
    public static void a(android.view.View view, y.w wVar) {
        l.k kVar = (l.k) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new l.k();
            view.setTag(com.watchfacestudio.huasi_urx110.R.id.tag_unhandled_key_listeners, kVar);
        }
        java.util.Objects.requireNonNull(wVar);
        android.view.View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC1030s = new y.ViewOnUnhandledKeyEventListenerC1030s();
        kVar.put(wVar, viewOnUnhandledKeyEventListenerC1030s);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC1030s);
    }

    public static java.lang.CharSequence b(android.view.View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(android.view.View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(android.view.View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(android.view.View view, y.w wVar) {
        android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        l.k kVar = (l.k) view.getTag(com.watchfacestudio.huasi_urx110.R.id.tag_unhandled_key_listeners);
        if (kVar == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) kVar.getOrDefault(wVar, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(android.view.View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    public static void g(android.view.View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(android.view.View view, java.lang.CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(android.view.View view, A.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(android.view.View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
