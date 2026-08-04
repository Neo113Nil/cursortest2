package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public class I extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9570b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1052y0 f9571a;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final H Companion = new H();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            t6.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            t6.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            t6.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            t6.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            t6.h.e(activity, "activity");
            int i7 = I.f9570b;
            G.a(activity, EnumC0718m.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            t6.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            t6.h.e(activity, "activity");
            t6.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            t6.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            t6.h.e(activity, "activity");
        }
    }

    public final void a(EnumC0718m enumC0718m) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            t6.h.d(activity, "activity");
            G.a(activity, enumC0718m);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0718m.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0718m.ON_DESTROY);
        this.f9571a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0718m.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1052y0 c1052y0 = this.f9571a;
        if (c1052y0 != null) {
            ((ProcessLifecycleOwner) c1052y0.f17938b).a();
        }
        a(EnumC0718m.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1052y0 c1052y0 = this.f9571a;
        if (c1052y0 != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c1052y0.f17938b;
            int i7 = processLifecycleOwner.f9595a + 1;
            processLifecycleOwner.f9595a = i7;
            if (i7 == 1 && processLifecycleOwner.f9598d) {
                processLifecycleOwner.f9600f.e(EnumC0718m.ON_START);
                processLifecycleOwner.f9598d = false;
            }
        }
        a(EnumC0718m.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0718m.ON_STOP);
    }
}
