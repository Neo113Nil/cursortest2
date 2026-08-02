package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F extends AbstractC0733g {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends AbstractC0733g {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            t6.h.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            t6.h.e(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i7 = processLifecycleOwner.f9595a + 1;
            processLifecycleOwner.f9595a = i7;
            if (i7 == 1 && processLifecycleOwner.f9598d) {
                processLifecycleOwner.f9600f.e(EnumC0739m.ON_START);
                processLifecycleOwner.f9598d = false;
            }
        }
    }

    public F(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.AbstractC0733g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        t6.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = I.f9570b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            t6.h.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((I) findFragmentByTag).f9571a = this.this$0.f9602y;
        }
    }

    @Override // androidx.lifecycle.AbstractC0733g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        t6.h.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i7 = processLifecycleOwner.f9596b - 1;
        processLifecycleOwner.f9596b = i7;
        if (i7 == 0) {
            Handler handler = processLifecycleOwner.f9599e;
            t6.h.b(handler);
            handler.postDelayed(processLifecycleOwner.f9601x, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        t6.h.e(activity, "activity");
        E.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0733g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        t6.h.e(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i7 = processLifecycleOwner.f9595a - 1;
        processLifecycleOwner.f9595a = i7;
        if (i7 == 0 && processLifecycleOwner.f9597c) {
            processLifecycleOwner.f9600f.e(EnumC0739m.ON_STOP);
            processLifecycleOwner.f9598d = true;
        }
    }
}
