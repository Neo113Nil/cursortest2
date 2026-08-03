package androidx.lifecycle;

/* loaded from: classes.dex */
public final class t implements android.app.Application.ActivityLifecycleCallbacks {
    public static final androidx.lifecycle.s Companion = new androidx.lifecycle.s();

    public static final void registerIn(android.app.Activity activity) {
        Companion.getClass();
        kotlin.jvm.internal.i.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new androidx.lifecycle.t());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        int i2 = androidx.lifecycle.u.f2411b;
        Q1.d.i(activity, androidx.lifecycle.d.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }
}
