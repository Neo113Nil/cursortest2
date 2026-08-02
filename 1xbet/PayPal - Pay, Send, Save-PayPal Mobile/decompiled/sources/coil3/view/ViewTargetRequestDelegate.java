package coil3.view;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010 \u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$"}, d2 = {"Lcoil3/request/ViewTargetRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/request/ImageRequest;", "initialRequest", "Lcoil3/target/ViewTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Lcoil3/ImageLoader;Lcoil3/request/ImageRequest;Lcoil3/target/ViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", "restart", "()V", "assertActive", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "awaitStarted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "getHighSpeedVideoFpsRangesFor", "Lcoil3/ImageLoader;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcoil3/request/ImageRequest;", "getHighSpeedVideoFpsRanges", "Lcoil3/target/ViewTarget;", "getHighSpeedVideoSizes", "Landroidx/lifecycle/Lifecycle;", "Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewTargetRequestDelegate implements coil3.view.RequestDelegate, androidx.view.DefaultLifecycleObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.view.ImageRequest getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.target.ViewTarget<?> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final coil3.ImageLoader getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.Lifecycle getHighSpeedVideoFpsRanges;

    public ViewTargetRequestDelegate(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, coil3.target.ViewTarget<?> viewTarget, androidx.view.Lifecycle lifecycle, kotlinx.coroutines.Job job) {
        this.getHighResolutionOutputSizeshNQ4ISI = imageLoader;
        this.getHighSpeedVideoFpsRangesFor = imageRequest;
        this.getHighSpeedVideoSizes = viewTarget;
        this.getHighSpeedVideoFpsRanges = lifecycle;
        this.Camera2StreamConfigurationMap = job;
    }

    public final void restart() {
        this.getHighResolutionOutputSizeshNQ4ISI.enqueue(this.getHighSpeedVideoFpsRangesFor);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // coil3.view.RequestDelegate
    public final void assertActive() {
        if (this.getHighSpeedVideoSizes.getView().isAttachedToWindow()) {
            return;
        }
        coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(this.getHighSpeedVideoSizes.getView()).setRequest(this);
        throw new java.util.concurrent.CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // coil3.view.RequestDelegate
    public final void start() {
        androidx.view.Lifecycle lifecycle;
        androidx.view.Lifecycle lifecycle2 = this.getHighSpeedVideoFpsRanges;
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
        }
        coil3.target.ViewTarget<?> viewTarget = this.getHighSpeedVideoSizes;
        if ((viewTarget instanceof androidx.view.LifecycleObserver) && (lifecycle = this.getHighSpeedVideoFpsRanges) != null) {
            coil3.content.LifecyclesKt.removeAndAddObserver(lifecycle, (androidx.view.LifecycleObserver) viewTarget);
        }
        coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(this.getHighSpeedVideoSizes.getView()).setRequest(this);
    }

    @Override // coil3.view.RequestDelegate
    public final java.lang.Object awaitStarted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoFpsRanges;
        if (lifecycle == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object awaitStarted = coil3.content.LifecyclesKt.awaitStarted(lifecycle, continuation);
        return awaitStarted == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitStarted : kotlin.Unit.INSTANCE;
    }

    @Override // coil3.view.RequestDelegate
    public final void dispose() {
        androidx.view.Lifecycle lifecycle;
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.Camera2StreamConfigurationMap, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        coil3.target.ViewTarget<?> viewTarget = this.getHighSpeedVideoSizes;
        if ((viewTarget instanceof androidx.view.LifecycleObserver) && (lifecycle = this.getHighSpeedVideoFpsRanges) != null) {
            lifecycle.removeObserver((androidx.view.LifecycleObserver) viewTarget);
        }
        androidx.view.Lifecycle lifecycle2 = this.getHighSpeedVideoFpsRanges;
        if (lifecycle2 != null) {
            lifecycle2.removeObserver(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.view.DefaultLifecycleObserver
    public final void onDestroy(androidx.view.LifecycleOwner owner) {
        coil3.view.C0300ViewTargetRequestManagerKt.getRequestManager(this.getHighSpeedVideoSizes.getView()).dispose();
    }
}
