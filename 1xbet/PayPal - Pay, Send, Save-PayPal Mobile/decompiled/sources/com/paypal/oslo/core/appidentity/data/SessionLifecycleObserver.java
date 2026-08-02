package com.paypal.oslo.core.appidentity.data;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0001\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u001f\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener;", "Lkotlin/jvm/JvmSuppressWildcards;", "listeners", "<init>", "(Ljava/util/Set;)V", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onStop", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStart", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Long;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionLifecycleObserver implements androidx.view.DefaultLifecycleObserver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SessionLifecycleObserver(java.util.Set<com.paypal.oslo.core.appidentity.data.SessionLifecycleListener> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRangesFor = set;
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

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onStop(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "App moved to background", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("timestamp", java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges))), null, 4, null);
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            ((com.paypal.oslo.core.appidentity.data.SessionLifecycleListener) it.next()).onStop();
        }
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onStart(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        java.lang.Long l = this.getHighSpeedVideoFpsRanges;
        java.lang.Long valueOf = l != null ? java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - l.longValue()) : null;
        for (com.paypal.oslo.core.appidentity.data.SessionLifecycleListener sessionLifecycleListener : this.getHighSpeedVideoFpsRangesFor) {
            if (valueOf != null) {
                if (valueOf.longValue() >= sessionLifecycleListener.getInactivityThresholdMs()) {
                    sessionLifecycleListener.onStart(new com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout(valueOf.longValue()));
                } else {
                    sessionLifecycleListener.onStart(new com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold(valueOf.longValue()));
                }
            }
        }
        this.getHighSpeedVideoFpsRanges = null;
    }
}
