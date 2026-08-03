package androidx.lifecycle;

/* loaded from: classes.dex */
public final class q extends androidx.lifecycle.a {
    final /* synthetic */ androidx.lifecycle.r this$0;

    public q(androidx.lifecycle.r rVar) {
        this.this$0 = rVar;
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i2 = androidx.lifecycle.u.f2411b;
            android.app.Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((androidx.lifecycle.u) findFragmentByTag).f2412a = this.this$0.f2410h;
        }
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        androidx.lifecycle.r rVar = this.this$0;
        int i2 = rVar.f2404b - 1;
        rVar.f2404b = i2;
        if (i2 == 0) {
            android.os.Handler handler = rVar.f2407e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(rVar.f2409g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        androidx.lifecycle.o.a(activity, new androidx.lifecycle.p(this.this$0));
    }

    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        androidx.lifecycle.r rVar = this.this$0;
        int i2 = rVar.f2403a - 1;
        rVar.f2403a = i2;
        if (i2 == 0 && rVar.f2405c) {
            rVar.f2408f.d(androidx.lifecycle.d.ON_STOP);
            rVar.f2406d = true;
        }
    }
}
