package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoSizes", "DispatcherActivityCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleDispatcher {
    public static final androidx.view.LifecycleDispatcher INSTANCE = new androidx.view.LifecycleDispatcher();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);

    private LifecycleDispatcher() {
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (getHighSpeedVideoSizes.getAndSet(true)) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new androidx.lifecycle.LifecycleDispatcher.DispatcherActivityCallback());
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DispatcherActivityCallback extends androidx.view.EmptyActivityLifecycleCallbacks {
        @Override // androidx.view.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle savedInstanceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            androidx.view.ReportFragment.INSTANCE.injectIfNeededIn(activity);
        }
    }
}
