package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/Lifecycle$State;", "minState", "Landroidx/lifecycle/DispatchQueue;", "dispatchQueue", "Lkotlinx/coroutines/Job;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "", "finish", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/Lifecycle;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/Lifecycle$State;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/DispatchQueue;", "Landroidx/lifecycle/LifecycleEventObserver;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/LifecycleEventObserver;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleController {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.lifecycle.Lifecycle.State getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.LifecycleEventObserver getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.Lifecycle Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.DispatchQueue getHighSpeedVideoFpsRanges;

    public LifecycleController(androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, androidx.view.DispatchQueue dispatchQueue, final kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
        this.Camera2StreamConfigurationMap = lifecycle;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoFpsRanges = dispatchQueue;
        androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.view.LifecycleController.m9163$r8$lambda$oWRpCg8vH8nSBgktHTqCrANl8M(androidx.view.LifecycleController.this, job, lifecycleOwner, event);
            }
        };
        this.getHighSpeedVideoSizes = lifecycleEventObserver;
        if (lifecycle.getCamera2StreamConfigurationMap() != androidx.lifecycle.Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            finish();
        }
    }

    public final void finish() {
        this.Camera2StreamConfigurationMap.removeObserver(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges.finish();
    }

    /* renamed from: $r8$lambda$oWRpCg8vH8nSBgktHTqCr-ANl8M, reason: not valid java name */
    public static /* synthetic */ void m9163$r8$lambda$oWRpCg8vH8nSBgktHTqCrANl8M(androidx.view.LifecycleController lifecycleController, kotlinx.coroutines.Job job, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap().compareTo(lifecycleController.getHighSpeedVideoFpsRangesFor) < 0) {
            lifecycleController.getHighSpeedVideoFpsRanges.pause();
        } else {
            lifecycleController.getHighSpeedVideoFpsRanges.resume();
        }
    }
}
