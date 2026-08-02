package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "p0", "Lcom/datadog/android/rum/RumMonitor;", "getHighSpeedVideoSizes", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)Lcom/datadog/android/rum/RumMonitor;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ActivityViewTrackingStrategy$getRumMonitor$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, com.datadog.android.rum.RumMonitor> {
    public static final com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1 getHighSpeedVideoSizes = new com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final com.datadog.android.rum.RumMonitor invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        return com.datadog.android.rum.GlobalRumMonitor.get(featureSdkCore);
    }

    ActivityViewTrackingStrategy$getRumMonitor$1() {
        super(1);
    }
}
