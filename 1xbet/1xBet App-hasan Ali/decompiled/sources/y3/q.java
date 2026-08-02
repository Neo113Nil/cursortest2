package y3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f21269k;

    public q(r rVar) {
        this.f21269k = rVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f21269k.b(new n(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f21269k.b(new p(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f21269k.b(new p(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f21269k.b(new p(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC2666b binderC2666b = new BinderC2666b();
        this.f21269k.b(new n(this, activity, binderC2666b));
        Bundle h1 = binderC2666b.h1(50L);
        if (h1 != null) {
            bundle.putAll(h1);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f21269k.b(new p(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f21269k.b(new p(this, activity, 3));
    }
}
