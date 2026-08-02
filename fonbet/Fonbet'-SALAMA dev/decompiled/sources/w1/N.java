package w1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N extends G2 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: C, reason: collision with root package name */
    public static String f17451C;

    /* renamed from: A, reason: collision with root package name */
    public int f17452A;

    /* renamed from: B, reason: collision with root package name */
    public final HashSet f17453B;

    public N() {
        this.f17452A = 0;
        Application application = (Application) AbstractC1707i1.f17743c;
        if (application != null) {
            this.f17452A = application.getResources().getConfiguration().orientation;
            application.registerActivityLifecycleCallbacks(this);
            application.registerComponentCallbacks(this);
        }
        this.f17453B = new HashSet();
    }

    public final void j(Activity activity, int i7) {
        Bundle extras;
        Bundle bundle = new Bundle();
        bundle.putString("activity_name", activity.getLocalClassName());
        if (t.e.b(1, i7)) {
            try {
                Intent intent = activity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null) {
                    bundle.putBundle("launch_options", extras);
                }
            } catch (Throwable unused) {
            }
        }
        h(new M(i7, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j(activity, 1);
        synchronized (this) {
            try {
                if (f17451C == null) {
                    f17451C = activity.getClass().getName();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        j(activity, 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        j(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(activity, 7);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f17453B.add(activity.toString());
        j(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        HashSet hashSet = this.f17453B;
        hashSet.remove(activity.toString());
        j(activity, 5);
        if (hashSet.isEmpty()) {
            j(activity, 9);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i7 = configuration.orientation;
        if (this.f17452A != i7) {
            this.f17452A = i7;
            Bundle bundle = new Bundle();
            bundle.putInt("orientation_name", this.f17452A);
            h(new M(8, bundle));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Bundle bundle = new Bundle();
        bundle.putInt("trim_memory_level", 80);
        h(new M(10, bundle));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("trim_memory_level", i7);
        h(new M(10, bundle));
    }
}
