package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.I;

/* loaded from: classes.dex */
public abstract class G {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0739m enumC0739m) {
        t6.h.e(activity, "activity");
        t6.h.e(enumC0739m, "event");
        if (activity instanceof InterfaceC0745t) {
            AbstractC0741o lifecycle = ((InterfaceC0745t) activity).getLifecycle();
            if (lifecycle instanceof C0747v) {
                ((C0747v) lifecycle).e(enumC0739m);
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
