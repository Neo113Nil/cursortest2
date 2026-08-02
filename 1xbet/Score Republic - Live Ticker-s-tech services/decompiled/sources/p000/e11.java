package p000;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.C0030a;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e11 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m1347a(Activity activity, ph0 ph0Var) {
        C0030a c0030aMo862d;
        ph0Var.getClass();
        if (!(activity instanceof yh0) || (c0030aMo862d = ((yh0) activity).mo862d()) == null) {
            return;
        }
        c0030aMo862d.m440d(ph0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m1348b(Activity activity) {
        g11.C0233a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new g11.C0233a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new g11(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
