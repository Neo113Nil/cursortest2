package k0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0722v;
import io.sentry.protocol.Request;
import t6.h;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1326d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1325c f14656a = C1325c.f14655a;

    public static C1325c a(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        while (abstractComponentCallbacksC0722v != null) {
            if (abstractComponentCallbacksC0722v.l()) {
                abstractComponentCallbacksC0722v.i();
            }
            abstractComponentCallbacksC0722v = abstractComponentCallbacksC0722v.f9516M;
        }
        return f14656a;
    }

    public static void b(AbstractC1328f abstractC1328f) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC1328f.f14658a.getClass().getName()), abstractC1328f);
        }
    }

    public static final void c(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, String str) {
        h.e(abstractComponentCallbacksC0722v, Request.JsonKeys.FRAGMENT);
        h.e(str, "previousFragmentId");
        b(new C1323a(abstractComponentCallbacksC0722v, "Attempting to reuse fragment " + abstractComponentCallbacksC0722v + " with previous ID " + str));
        a(abstractComponentCallbacksC0722v).getClass();
    }
}
