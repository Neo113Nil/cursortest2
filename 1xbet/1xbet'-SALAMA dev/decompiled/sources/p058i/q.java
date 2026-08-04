package p058i;

import Q.b;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.t;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        t tVar = new t(vVar, 2);
        b.m(obj).registerOnBackInvokedCallback(1000000, tVar);
        return tVar;
    }

    public static void c(Object obj, Object obj2) {
        b.m(obj).unregisterOnBackInvokedCallback(b.j(obj2));
    }
}
