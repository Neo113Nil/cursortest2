package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        androidx.activity.t tVar = new androidx.activity.t(vVar, 2);
        Q.b.m(obj).registerOnBackInvokedCallback(1000000, tVar);
        return tVar;
    }

    public static void c(Object obj, Object obj2) {
        Q.b.m(obj).unregisterOnBackInvokedCallback(Q.b.j(obj2));
    }
}
