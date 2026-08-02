package androidx.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$Event;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroidx/lifecycle/Lifecycle$Event;)V", "onServicePreSuperOnCreate", "()V", "onServicePreSuperOnBind", "onServicePreSuperOnStart", "onServicePreSuperOnDestroy", "Landroidx/lifecycle/LifecycleRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/LifecycleRegistry;", "getHighSpeedVideoSizes", "Landroid/os/Handler;", "Landroid/os/Handler;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "DispatchRunnable"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ServiceLifecycleDispatcher {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.LifecycleRegistry getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.os.Handler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable getHighSpeedVideoFpsRanges;

    public ServiceLifecycleDispatcher(androidx.view.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.getHighSpeedVideoSizes = new androidx.view.LifecycleRegistry(lifecycleOwner);
        this.getHighSpeedVideoFpsRangesFor = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private final void getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event p0) {
        androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable dispatchRunnable = this.getHighSpeedVideoFpsRanges;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable dispatchRunnable2 = new androidx.lifecycle.ServiceLifecycleDispatcher.DispatchRunnable(this.getHighSpeedVideoSizes, p0);
        this.getHighSpeedVideoFpsRanges = dispatchRunnable2;
        this.getHighSpeedVideoFpsRangesFor.postAtFrontOfQueue(dispatchRunnable2);
    }

    public void onServicePreSuperOnCreate() {
        getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnBind() {
        getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnStart() {
        getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnDestroy() {
        getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        getHighSpeedVideoFpsRanges(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
    }

    public androidx.view.Lifecycle getLifecycle() {
        return this.getHighSpeedVideoSizes;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/Lifecycle$Event;", "event", "<init>", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "", "run", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/LifecycleRegistry;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DispatchRunnable implements java.lang.Runnable {
        private final androidx.lifecycle.Lifecycle.Event event;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.view.LifecycleRegistry Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizes;

        public DispatchRunnable(androidx.view.LifecycleRegistry lifecycleRegistry, androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleRegistry, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            this.Camera2StreamConfigurationMap = lifecycleRegistry;
            this.event = event;
        }

        public final androidx.lifecycle.Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.Camera2StreamConfigurationMap.handleLifecycleEvent(this.event);
            this.getHighSpeedVideoSizes = true;
        }
    }
}
