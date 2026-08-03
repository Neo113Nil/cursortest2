package androidx.lifecycle;

/* loaded from: classes.dex */
public final class p extends androidx.lifecycle.a {
    final /* synthetic */ androidx.lifecycle.r this$0;

    public p(androidx.lifecycle.r rVar) {
        this.this$0 = rVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        this.this$0.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(android.app.Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        androidx.lifecycle.r rVar = this.this$0;
        int i2 = rVar.f2403a + 1;
        rVar.f2403a = i2;
        if (i2 == 1 && rVar.f2406d) {
            rVar.f2408f.d(androidx.lifecycle.d.ON_START);
            rVar.f2406d = false;
        }
    }
}
