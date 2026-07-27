package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
public abstract class s {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, e event) {
        m e3;
        kotlin.jvm.internal.j.e(event, "event");
        if (!(activity instanceof k) || (e3 = ((k) activity).e()) == null) {
            return;
        }
        e3.e(event);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            u.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new u.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new u(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
