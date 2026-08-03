package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class o {
    public static final void a(android.app.Activity activity, android.app.Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
