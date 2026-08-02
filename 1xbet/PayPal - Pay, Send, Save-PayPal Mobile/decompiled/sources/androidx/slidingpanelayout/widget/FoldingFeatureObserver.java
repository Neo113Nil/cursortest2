package androidx.slidingpanelayout.widget;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "Landroidx/window/layout/WindowInfoTracker;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V", "Landroid/app/Activity;", "activity", "", "registerLayoutStateChangeCallback", "(Landroid/app/Activity;)V", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "onFoldingFeatureChangeListener", "setOnFoldingFeatureChangeListener", "(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;)V", "unregisterLayoutStateChangeCallback", "()V", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "Landroidx/window/layout/WindowInfoTracker;", "OnFoldingFeatureChangeListener"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FoldingFeatureObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.window.layout.WindowInfoTracker getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "Landroidx/window/layout/FoldingFeature;", "foldingFeature", "", "onFoldingFeatureChange", "(Landroidx/window/layout/FoldingFeature;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(androidx.window.layout.FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(androidx.window.layout.WindowInfoTracker windowInfoTracker, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInfoTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoFpsRanges = windowInfoTracker;
        this.getHighSpeedVideoFpsRangesFor = executor;
    }

    public final void setOnFoldingFeatureChangeListener(androidx.slidingpanelayout.widget.FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "");
        this.getHighSpeedVideoSizes = onFoldingFeatureChangeListener;
    }

    public final void registerLayoutStateChangeCallback(android.app.Activity activity) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(this.getHighSpeedVideoFpsRangesFor)), null, null, new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this, activity, null), 3, null);
        this.Camera2StreamConfigurationMap = launch$default;
    }

    public final void unregisterLayoutStateChangeCallback() {
        kotlinx.coroutines.Job job = this.Camera2StreamConfigurationMap;
        if (job == null) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    public static final /* synthetic */ androidx.window.layout.FoldingFeature access$getFoldingFeature(androidx.slidingpanelayout.widget.FoldingFeatureObserver foldingFeatureObserver, androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        java.lang.Object obj;
        java.util.Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.window.layout.DisplayFeature) obj) instanceof androidx.window.layout.FoldingFeature) {
                break;
            }
        }
        if (obj instanceof androidx.window.layout.FoldingFeature) {
            return (androidx.window.layout.FoldingFeature) obj;
        }
        return null;
    }
}
