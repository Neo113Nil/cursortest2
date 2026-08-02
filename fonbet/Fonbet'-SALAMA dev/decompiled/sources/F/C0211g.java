package F;

import D6.y0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f2429a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f2430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2431c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2432d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2433e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2434f = false;

    public C0211g(Activity activity) {
        this.f2430b = activity;
        this.f2431c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2430b == activity) {
            this.f2430b = null;
            this.f2433e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2433e || this.f2434f || this.f2432d) {
            return;
        }
        Object obj = this.f2429a;
        try {
            Object obj2 = AbstractC0212h.f2437c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2431c) {
                AbstractC0212h.f2441g.postAtFrontOfQueue(new y0(5, AbstractC0212h.f2436b.get(activity), obj2));
                this.f2434f = true;
                this.f2429a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2430b == activity) {
            this.f2432d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
