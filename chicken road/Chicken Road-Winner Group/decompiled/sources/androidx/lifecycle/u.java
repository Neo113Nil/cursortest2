package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class u extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2332b = 0;

    /* renamed from: a, reason: collision with root package name */
    public b0.i f2333a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final t Companion = new t();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.j.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            int i3 = u.f2332b;
            s.a(activity, e.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.j.e(activity, "activity");
            kotlin.jvm.internal.j.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
        }
    }

    public final void a(e eVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.j.d(activity, "activity");
            s.a(activity, eVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(e.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(e.ON_DESTROY);
        this.f2333a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(e.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        b0.i iVar = this.f2333a;
        if (iVar != null) {
            ((r) iVar.f2461b).c();
        }
        a(e.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        b0.i iVar = this.f2333a;
        if (iVar != null) {
            r rVar = (r) iVar.f2461b;
            int i3 = rVar.f2325a + 1;
            rVar.f2325a = i3;
            if (i3 == 1 && rVar.f2328d) {
                rVar.f.e(e.ON_START);
                rVar.f2328d = false;
            }
        }
        a(e.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(e.ON_STOP);
    }
}
