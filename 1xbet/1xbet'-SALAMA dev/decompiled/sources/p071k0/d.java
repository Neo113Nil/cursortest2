package p071k0;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0701v;
import io.sentry.protocol.Request;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14662a = c.f14661a;

    public static c a(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        while (abstractComponentCallbacksC0701v != null) {
            if (abstractComponentCallbacksC0701v.l()) {
                abstractComponentCallbacksC0701v.i();
            }
            abstractComponentCallbacksC0701v = abstractComponentCallbacksC0701v.f9516M;
        }
        return f14662a;
    }

    public static void b(f fVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(fVar.f14664a.getClass().getName()), fVar);
        }
    }

    public static final void c(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, String str) {
        h.e(abstractComponentCallbacksC0701v, Request.JsonKeys.FRAGMENT);
        h.e(str, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0701v, "Attempting to reuse fragment " + abstractComponentCallbacksC0701v + " with previous ID " + str));
        a(abstractComponentCallbacksC0701v).getClass();
    }
}
