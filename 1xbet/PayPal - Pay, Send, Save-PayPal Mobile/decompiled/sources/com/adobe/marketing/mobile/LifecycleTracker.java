package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/LifecycleTracker;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "", "additionalContextData", "<init>", "(Ljava/util/Map;)V", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onPause", "(Landroidx/lifecycle/LifecycleOwner;)V", "onResume", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class LifecycleTracker implements androidx.view.DefaultLifecycleObserver {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    public LifecycleTracker(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoSizes = map;
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onResume(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.MobileCoreInitializer.LOG_TAG, "Lifecycle tracking - onResume", new java.lang.Object[0]);
        com.adobe.marketing.mobile.MobileCore.lifecycleStart(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public final void onPause(androidx.view.LifecycleOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.MobileCoreInitializer.LOG_TAG, "Lifecycle tracking - onPause", new java.lang.Object[0]);
        com.adobe.marketing.mobile.MobileCore.lifecyclePause();
    }
}
