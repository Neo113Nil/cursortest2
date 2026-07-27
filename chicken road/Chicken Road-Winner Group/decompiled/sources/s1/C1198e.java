package s1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* renamed from: s1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1198e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10323a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10324b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1197d f10325c;

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f10324b) {
            this.f10324b = true;
            if (this.f10323a) {
                a(true);
                InterfaceC1197d interfaceC1197d = this.f10325c;
                if (interfaceC1197d != null) {
                    interfaceC1197d.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = runningAppProcessInfo.importance == 100 || b();
        if (this.f10324b != z3) {
            this.f10324b = z3;
            if (this.f10323a) {
                a(z3);
                InterfaceC1197d interfaceC1197d = this.f10325c;
                if (interfaceC1197d != null) {
                    interfaceC1197d.a(z3);
                }
            }
        }
    }

    public void a(boolean z3) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
