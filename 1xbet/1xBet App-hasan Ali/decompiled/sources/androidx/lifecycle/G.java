package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.I;

/* loaded from: classes.dex */
public abstract class G {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0486o enumC0486o) {
        kotlin.jvm.internal.l.f("event", enumC0486o);
        if (activity instanceof InterfaceC0491u) {
            L g5 = ((InterfaceC0491u) activity).g();
            if (g5 instanceof C0493w) {
                ((C0493w) g5).p(enumC0486o);
            }
        }
    }

    public static void b(Activity activity) {
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
