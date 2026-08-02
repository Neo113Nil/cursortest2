package coil3.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcoil3/request/LifecycleRequestDelegate;", "Lcoil3/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "awaitStarted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "dispose", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/Lifecycle;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleRequestDelegate implements coil3.view.RequestDelegate, androidx.view.DefaultLifecycleObserver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.Lifecycle getHighSpeedVideoFpsRanges;

    public LifecycleRequestDelegate(androidx.view.Lifecycle lifecycle, kotlinx.coroutines.Job job) {
        this.getHighSpeedVideoFpsRanges = lifecycle;
        this.Camera2StreamConfigurationMap = job;
    }

    @Override // coil3.view.RequestDelegate
    public final void start() {
        this.getHighSpeedVideoFpsRanges.addObserver(this);
    }

    @Override // coil3.view.RequestDelegate
    public final java.lang.Object awaitStarted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitStarted = coil3.content.LifecyclesKt.awaitStarted(this.getHighSpeedVideoFpsRanges, continuation);
        return awaitStarted == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitStarted : kotlin.Unit.INSTANCE;
    }

    @Override // coil3.view.RequestDelegate
    public final void complete() {
        this.getHighSpeedVideoFpsRanges.removeObserver(this);
    }

    @Override // coil3.view.RequestDelegate
    public final void dispose() {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.Camera2StreamConfigurationMap, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onDestroy(androidx.view.LifecycleOwner owner) {
        dispose();
    }
}
