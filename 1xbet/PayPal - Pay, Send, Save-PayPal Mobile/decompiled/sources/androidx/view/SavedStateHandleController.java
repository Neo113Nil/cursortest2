package androidx.view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "key", "", "handle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isAttached", "()Z", "attachToLifecycle", "", "registry", "Landroidx/savedstate/SavedStateRegistry;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/Lifecycle;", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "close", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleController implements androidx.view.LifecycleEventObserver, java.lang.AutoCloseable {
    private final androidx.view.SavedStateHandle Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    public SavedStateHandleController(java.lang.String str, androidx.view.SavedStateHandle savedStateHandle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = savedStateHandle;
    }

    /* renamed from: getHandle, reason: from getter */
    public final androidx.view.SavedStateHandle getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: isAttached, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void attachToLifecycle(androidx.view.SavedStateRegistry registry, androidx.view.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.getHighSpeedVideoSizes = true;
        lifecycle.addObserver(this);
        registry.registerSavedStateProvider(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.savedStateProvider());
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            this.getHighSpeedVideoSizes = false;
            source.getLifecycle().removeObserver(this);
        }
    }
}
