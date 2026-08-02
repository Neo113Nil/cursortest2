package androidx.metrics.performance;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/View;", "decorView", "Landroid/view/Choreographer;", "choreographer", "", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "delegates", "<init>", "(Landroid/view/View;Landroid/view/Choreographer;Ljava/util/List;)V", "", "onPreDraw", "()Z", "delegate", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/metrics/performance/OnFrameListenerDelegate;)V", "remove", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Ljava/util/List;", "getDelegates", "()Ljava/util/List;", "Ljava/lang/ref/WeakReference;", "decorViewRef", "Ljava/lang/ref/WeakReference;", "getDecorViewRef", "()Ljava/lang/ref/WeakReference;", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "metricsStateHolder", "Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "getMetricsStateHolder", "()Landroidx/metrics/performance/PerformanceMetricsState$Holder;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DelegatingOnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.metrics.performance.DelegatingOnPreDrawListener.Companion INSTANCE = new androidx.metrics.performance.DelegatingOnPreDrawListener.Companion(null);
    private static final java.lang.reflect.Field choreographerLastFrameTimeField;
    private final android.view.Choreographer choreographer;
    private final java.lang.ref.WeakReference<android.view.View> decorViewRef;
    private final java.util.List<androidx.metrics.performance.OnFrameListenerDelegate> delegates;
    private final androidx.metrics.performance.PerformanceMetricsState.Holder metricsStateHolder;

    public DelegatingOnPreDrawListener(android.view.View view, android.view.Choreographer choreographer, java.util.List<androidx.metrics.performance.OnFrameListenerDelegate> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choreographer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.choreographer = choreographer;
        this.delegates = list;
        this.decorViewRef = new java.lang.ref.WeakReference<>(view);
        this.metricsStateHolder = androidx.metrics.performance.PerformanceMetricsState.INSTANCE.getHolderForHierarchy(view);
    }

    public final android.view.Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final java.util.List<androidx.metrics.performance.OnFrameListenerDelegate> getDelegates() {
        return this.delegates;
    }

    public final java.lang.ref.WeakReference<android.view.View> getDecorViewRef() {
        return this.decorViewRef;
    }

    public final androidx.metrics.performance.PerformanceMetricsState.Holder getMetricsStateHolder() {
        return this.metricsStateHolder;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        final android.view.View view = this.decorViewRef.get();
        if (view != null) {
            java.lang.Object obj = choreographerLastFrameTimeField.get(this.choreographer);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            final long longValue = ((java.lang.Long) obj).longValue();
            android.os.Handler handler = view.getHandler();
            android.os.Message obtain = android.os.Message.obtain(view.getHandler(), new java.lang.Runnable() { // from class: androidx.metrics.performance.DelegatingOnPreDrawListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.metrics.performance.DelegatingOnPreDrawListener.$r8$lambda$Y4kIW7cr3lCNIl9ZEzMQrfpECKw(view, this, longValue);
                }
            });
            androidx.core.os.MessageCompat.setAsynchronous(obtain, true);
            handler.sendMessageAtFrontOfQueue(obtain);
        }
        return true;
    }

    public final void add(androidx.metrics.performance.OnFrameListenerDelegate delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        synchronized (this) {
            this.delegates.add(delegate);
        }
    }

    public final void remove(androidx.metrics.performance.OnFrameListenerDelegate delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        synchronized (this) {
            this.delegates.remove(delegate);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/metrics/performance/DelegatingOnPreDrawListener$Companion;", "", "<init>", "()V", "Landroid/view/View;", "decorView", "Landroid/view/Choreographer;", "choreographer", "Landroidx/metrics/performance/OnFrameListenerDelegate;", "delegate", "", "addDelegateToDecorView", "(Landroid/view/View;Landroid/view/Choreographer;Landroidx/metrics/performance/OnFrameListenerDelegate;)V", "removeDelegateFromDecorView", "(Landroid/view/View;Landroidx/metrics/performance/OnFrameListenerDelegate;)V", "view", "", "getExpectedFrameDuration", "(Landroid/view/View;)J", "Ljava/lang/reflect/Field;", "choreographerLastFrameTimeField", "Ljava/lang/reflect/Field;", "getChoreographerLastFrameTimeField", "()Ljava/lang/reflect/Field;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void addDelegateToDecorView(android.view.View decorView, android.view.Choreographer choreographer, androidx.metrics.performance.OnFrameListenerDelegate delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(choreographer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            androidx.metrics.performance.DelegatingOnPreDrawListener delegatingOnPreDrawListener = (androidx.metrics.performance.DelegatingOnPreDrawListener) decorView.getTag(androidx.metrics.performance.R.id.metricsDelegator);
            if (delegatingOnPreDrawListener == null) {
                androidx.metrics.performance.DelegatingOnPreDrawListener delegatingOnPreDrawListener2 = new androidx.metrics.performance.DelegatingOnPreDrawListener(decorView, choreographer, kotlin.collections.CollectionsKt.mutableListOf(delegate));
                decorView.getViewTreeObserver().addOnPreDrawListener(delegatingOnPreDrawListener2);
                decorView.setTag(androidx.metrics.performance.R.id.metricsDelegator, delegatingOnPreDrawListener2);
                return;
            }
            delegatingOnPreDrawListener.add(delegate);
        }

        public final void removeDelegateFromDecorView(android.view.View decorView, androidx.metrics.performance.OnFrameListenerDelegate delegate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
            androidx.metrics.performance.DelegatingOnPreDrawListener delegatingOnPreDrawListener = (androidx.metrics.performance.DelegatingOnPreDrawListener) decorView.getTag(androidx.metrics.performance.R.id.metricsDelegator);
            if (delegatingOnPreDrawListener != null) {
                delegatingOnPreDrawListener.remove(delegate);
                if (delegatingOnPreDrawListener.getDelegates().isEmpty()) {
                    decorView.getViewTreeObserver().removeOnPreDrawListener(delegatingOnPreDrawListener);
                    decorView.setTag(androidx.metrics.performance.R.id.metricsDelegator, null);
                }
            }
        }

        public final java.lang.reflect.Field getChoreographerLastFrameTimeField() {
            return androidx.metrics.performance.DelegatingOnPreDrawListener.choreographerLastFrameTimeField;
        }

        public final long getExpectedFrameDuration(android.view.View view) {
            if (androidx.metrics.performance.JankStatsBaseImpl.INSTANCE.getFrameDuration() < 0) {
                android.view.Window window = null;
                if ((view != null ? view.getContext() : null) instanceof android.app.Activity) {
                    android.content.Context context = view.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(context, "");
                    window = ((android.app.Activity) context).getWindow();
                }
                float f = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f = refreshRate;
                }
                androidx.metrics.performance.JankStatsBaseImpl.INSTANCE.setFrameDuration((long) ((1000.0f / f) * 1000000.0f));
            }
            return androidx.metrics.performance.JankStatsBaseImpl.INSTANCE.getFrameDuration();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.reflect.Field declaredField = android.view.Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredField, "");
        choreographerLastFrameTimeField = declaredField;
        declaredField.setAccessible(true);
    }

    public static /* synthetic */ void $r8$lambda$Y4kIW7cr3lCNIl9ZEzMQrfpECKw(android.view.View view, androidx.metrics.performance.DelegatingOnPreDrawListener delegatingOnPreDrawListener, long j) {
        long nanoTime = java.lang.System.nanoTime();
        long expectedFrameDuration = INSTANCE.getExpectedFrameDuration(view);
        synchronized (delegatingOnPreDrawListener) {
            java.util.Iterator<androidx.metrics.performance.OnFrameListenerDelegate> it = delegatingOnPreDrawListener.delegates.iterator();
            while (it.hasNext()) {
                it.next().onFrame(j, nanoTime - j, expectedFrameDuration);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.metrics.performance.PerformanceMetricsState state = delegatingOnPreDrawListener.metricsStateHolder.getState();
        if (state != null) {
            state.cleanupSingleFrameStates$metrics_performance_release();
        }
    }
}
