package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class E extends AbstractC0480i {
    final /* synthetic */ F this$0;

    public static final class a extends AbstractC0480i {
        final /* synthetic */ F this$0;

        public a(F f) {
            this.this$0 = f;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.l.f("activity", activity);
            F f = this.this$0;
            int i = f.f7004k + 1;
            f.f7004k = i;
            if (i == 1 && f.f7007n) {
                f.f7009p.p(EnumC0486o.ON_START);
                f.f7007n = false;
            }
        }
    }

    public E(F f) {
        this.this$0 = f;
    }

    @Override // androidx.lifecycle.AbstractC0480i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = I.f7012l;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", findFragmentByTag);
            ((I) findFragmentByTag).f7013k = this.this$0.f7011r;
        }
    }

    @Override // androidx.lifecycle.AbstractC0480i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f("activity", activity);
        F f = this.this$0;
        int i = f.f7005l - 1;
        f.f7005l = i;
        if (i == 0) {
            Handler handler = f.f7008o;
            kotlin.jvm.internal.l.c(handler);
            handler.postDelayed(f.f7010q, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f("activity", activity);
        D.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0480i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f("activity", activity);
        F f = this.this$0;
        int i = f.f7004k - 1;
        f.f7004k = i;
        if (i == 0 && f.f7006m) {
            f.f7009p.p(EnumC0486o.ON_STOP);
            f.f7007n = true;
        }
    }
}
