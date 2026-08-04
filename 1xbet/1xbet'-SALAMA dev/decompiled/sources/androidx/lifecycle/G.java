package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0718m enumC0718m) {
        t6.h.e(activity, "activity");
        t6.h.e(enumC0718m, "event");
        if (activity instanceof InterfaceC0724t) {
            AbstractC0720o lifecycle = ((InterfaceC0724t) activity).getLifecycle();
            if (lifecycle instanceof C0726v) {
                ((C0726v) lifecycle).e(enumC0718m);
            }
        }
    }

    public static void b(Activity activity) {
        t6.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            I.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new I.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new I(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
