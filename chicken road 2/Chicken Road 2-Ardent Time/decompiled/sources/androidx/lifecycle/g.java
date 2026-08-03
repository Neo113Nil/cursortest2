package androidx.lifecycle;

/* loaded from: classes.dex */
public final class g extends androidx.lifecycle.a {
    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.lifecycle.t.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.t());
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new androidx.lifecycle.u(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
