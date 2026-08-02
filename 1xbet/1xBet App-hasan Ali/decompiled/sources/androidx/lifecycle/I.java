package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class I extends Fragment {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f7012l = 0;

    /* renamed from: k, reason: collision with root package name */
    public W f7013k;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final H Companion = new H();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            kotlin.jvm.internal.l.f("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            int i = I.f7012l;
            G.a(activity, EnumC0486o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f("activity", activity);
            kotlin.jvm.internal.l.f("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
        }
    }

    public final void a(EnumC0486o enumC0486o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            kotlin.jvm.internal.l.e("getActivity(...)", activity);
            G.a(activity, enumC0486o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0486o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0486o.ON_DESTROY);
        this.f7013k = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0486o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        W w5 = this.f7013k;
        if (w5 != null) {
            ((F) w5.f7042a).c();
        }
        a(EnumC0486o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        W w5 = this.f7013k;
        if (w5 != null) {
            F f = (F) w5.f7042a;
            int i = f.f7004k + 1;
            f.f7004k = i;
            if (i == 1 && f.f7007n) {
                f.f7009p.p(EnumC0486o.ON_START);
                f.f7007n = false;
            }
        }
        a(EnumC0486o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0486o.ON_STOP);
    }
}
