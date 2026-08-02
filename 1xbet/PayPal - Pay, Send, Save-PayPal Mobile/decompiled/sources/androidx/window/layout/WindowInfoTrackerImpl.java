package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Landroidx/window/layout/WindowMetricsCalculator;", "windowMetricsCalculator", "Landroidx/window/layout/adapter/WindowBackend;", "windowBackend", "Landroidx/window/WindowSdkExtensions;", "windowSdkExtensions", "<init>", "(Landroidx/window/layout/WindowMetricsCalculator;Landroidx/window/layout/adapter/WindowBackend;Landroidx/window/WindowSdkExtensions;)V", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lkotlinx/coroutines/flow/Flow;", "getCurrentWindowLayoutInfo", "(Landroid/content/Context;)Landroidx/window/layout/WindowLayoutInfo;", "getHighSpeedVideoFpsRanges", "Landroidx/window/layout/WindowMetricsCalculator;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/window/layout/adapter/WindowBackend;", "Landroidx/window/WindowSdkExtensions;", "getHighResolutionOutputSizeshNQ4ISI", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "supportedPostures"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowInfoTrackerImpl implements androidx.window.layout.WindowInfoTracker {
    private final androidx.window.layout.adapter.WindowBackend Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.window.layout.WindowMetricsCalculator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.window.WindowSdkExtensions getHighResolutionOutputSizeshNQ4ISI;

    public WindowInfoTrackerImpl(androidx.window.layout.WindowMetricsCalculator windowMetricsCalculator, androidx.window.layout.adapter.WindowBackend windowBackend, androidx.window.WindowSdkExtensions windowSdkExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetricsCalculator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowBackend, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowSdkExtensions, "");
        this.getHighSpeedVideoSizes = windowMetricsCalculator;
        this.Camera2StreamConfigurationMap = windowBackend;
        this.getHighResolutionOutputSizeshNQ4ISI = windowSdkExtensions;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public final kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1(this, context, null)), kotlinx.coroutines.Dispatchers.getMain());
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public final kotlinx.coroutines.flow.Flow<androidx.window.layout.WindowLayoutInfo> windowLayoutInfo(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2(this, activity, null)), kotlinx.coroutines.Dispatchers.getMain());
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public final java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        this.getHighResolutionOutputSizeshNQ4ISI.requireExtensionVersion$window_release(6);
        return this.Camera2StreamConfigurationMap.getSupportedPostures();
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public final androidx.window.layout.WindowLayoutInfo getCurrentWindowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI.requireExtensionVersion$window_release(9);
        return this.Camera2StreamConfigurationMap.getCurrentWindowLayoutInfo(context);
    }
}
