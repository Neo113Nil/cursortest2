package K4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import w1.F0;

/* renamed from: K4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0316c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f4008b;

    public C0316c(F0 f02, AtomicBoolean atomicBoolean) {
        this.f4008b = f02;
        this.f4007a = atomicBoolean;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f4007a.compareAndSet(true, false)) {
            this.f4008b.E();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f4007a.compareAndSet(true, false)) {
            this.f4008b.E();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f4007a.compareAndSet(true, false)) {
            this.f4008b.E();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
