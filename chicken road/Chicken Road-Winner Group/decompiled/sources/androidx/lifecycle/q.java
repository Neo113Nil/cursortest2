package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class q extends AbstractC0151a {
    final /* synthetic */ r this$0;

    public static final class a extends AbstractC0151a {
        final /* synthetic */ r this$0;

        public a(r rVar) {
            this.this$0 = rVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.j.e(activity, "activity");
            r rVar = this.this$0;
            int i3 = rVar.f2325a + 1;
            rVar.f2325a = i3;
            if (i3 == 1 && rVar.f2328d) {
                rVar.f.e(e.ON_START);
                rVar.f2328d = false;
            }
        }
    }

    public q(r rVar) {
        this.this$0 = rVar;
    }

    @Override // androidx.lifecycle.AbstractC0151a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = u.f2332b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.j.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((u) findFragmentByTag).f2333a = this.this$0.f2331h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0151a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        r rVar = this.this$0;
        int i3 = rVar.f2326b - 1;
        rVar.f2326b = i3;
        if (i3 == 0) {
            Handler handler = rVar.f2329e;
            kotlin.jvm.internal.j.b(handler);
            handler.postDelayed(rVar.f2330g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.j.e(activity, "activity");
        p.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0151a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.j.e(activity, "activity");
        r rVar = this.this$0;
        int i3 = rVar.f2325a - 1;
        rVar.f2325a = i3;
        if (i3 == 0 && rVar.f2327c) {
            rVar.f.e(e.ON_STOP);
            rVar.f2328d = true;
        }
    }
}
