package com.paypal.oslo.feature.inappcheckout.features.lifecycleObserver;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/lifecycleObserver/CheckoutAppLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "Landroidx/lifecycle/Lifecycle;", "processLifecycle", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;Landroidx/lifecycle/Lifecycle;)V", "", "startMonitoring", "()V", "stopMonitoring", "markTransactionComplete", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "onStop", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStart", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/Lifecycle;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckoutAppLifecycleObserver implements androidx.view.DefaultLifecycleObserver {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.Lifecycle getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CheckoutAppLifecycleObserver(com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, androidx.view.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        this.getHighSpeedVideoFpsRanges = analyticsTracer;
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycle;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final /* bridge */ void onCreate(androidx.view.LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final /* bridge */ void onDestroy(androidx.view.LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final /* bridge */ void onPause(androidx.view.LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final /* bridge */ void onResume(androidx.view.LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    public final void startMonitoring() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        this.getHighResolutionOutputSizeshNQ4ISI.addObserver(this);
    }

    public final void stopMonitoring() {
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = false;
            this.getHighResolutionOutputSizeshNQ4ISI.removeObserver(this);
        }
    }

    public final void markTransactionComplete() {
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onStop(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        this.getHighSpeedVideoFpsRanges.trackConsumerAppBackgrounded();
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = false;
            stopMonitoring();
        }
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onStart(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        this.getHighSpeedVideoFpsRanges.trackConsumerAppForegrounded();
    }
}
