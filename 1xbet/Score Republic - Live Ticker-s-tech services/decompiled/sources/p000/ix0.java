package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 extends AbstractC0226fw {
    final /* synthetic */ jx0 this$0;

    /* JADX INFO: renamed from: ix0$a */
    /* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
    public static final class C0338a extends AbstractC0226fw {
        final /* synthetic */ jx0 this$0;

        public C0338a(jx0 jx0Var) {
            this.this$0 = jx0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            jx0 jx0Var = this.this$0;
            int i = jx0Var.f4106k + 1;
            jx0Var.f4106k = i;
            if (i == 1) {
                if (jx0Var.f4107l) {
                    jx0Var.f4110o.m440d(ph0.ON_RESUME);
                    jx0Var.f4107l = false;
                } else {
                    Handler handler = jx0Var.f4109n;
                    handler.getClass();
                    handler.removeCallbacks(jx0Var.f4111p);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            jx0 jx0Var = this.this$0;
            int i = jx0Var.f4105j + 1;
            jx0Var.f4105j = i;
            if (i == 1 && jx0Var.f4108m) {
                jx0Var.f4110o.m440d(ph0.ON_START);
                jx0Var.f4108m = false;
            }
        }
    }

    public ix0(jx0 jx0Var) {
        this.this$0 = jx0Var;
    }

    @Override // p000.AbstractC0226fw, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // p000.AbstractC0226fw, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        jx0 jx0Var = this.this$0;
        int i = jx0Var.f4106k - 1;
        jx0Var.f4106k = i;
        if (i == 0) {
            Handler handler = jx0Var.f4109n;
            handler.getClass();
            handler.postDelayed(jx0Var.f4111p, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        hx0.m2346a(activity, new C0338a(this.this$0));
    }

    @Override // p000.AbstractC0226fw, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        jx0 jx0Var = this.this$0;
        int i = jx0Var.f4105j - 1;
        jx0Var.f4105j = i;
        if (i == 0 && jx0Var.f4107l) {
            jx0Var.f4110o.m440d(ph0.ON_STOP);
            jx0Var.f4108m = true;
        }
    }
}
