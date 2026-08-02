package com.datadog.android.rum.internal.instrumentation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/UserActionTrackingStrategyLegacy;", "Lcom/datadog/android/rum/tracking/ActivityLifecycleTrackingStrategy;", "Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "gesturesTracker", "<init>", "(Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getGesturesTracker", "()Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "", "hashCode", "()I", "Landroid/app/Activity;", "activity", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityResumed", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "getGesturesTracker$dd_sdk_android_rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserActionTrackingStrategyLegacy extends com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy implements com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy {
    private final com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker gesturesTracker;

    public final com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker getGesturesTracker$dd_sdk_android_rum_release() {
        return this.gesturesTracker;
    }

    public UserActionTrackingStrategyLegacy(com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker gesturesTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesturesTracker, "");
        this.gesturesTracker = gesturesTracker;
    }

    @Override // com.datadog.android.rum.internal.tracking.UserActionTrackingStrategy
    public final com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker getGesturesTracker() {
        return this.gesturesTracker;
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityResumed(activity);
        withSdkCore(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy$onActivityResumed$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                Camera2StreamConfigurationMap(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy.this.getGesturesTracker$dd_sdk_android_rum_release().startTracking(activity.getWindow(), activity, featureSdkCore);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // com.datadog.android.rum.tracking.ActivityLifecycleTrackingStrategy, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPaused(activity);
        this.gesturesTracker.stopTracking(activity.getWindow(), activity);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.gesturesTracker, ((com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy) other).gesturesTracker);
    }

    public final int hashCode() {
        return this.gesturesTracker.hashCode();
    }

    public final java.lang.String toString() {
        com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker gesturesTracker = this.gesturesTracker;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserActionTrackingStrategyLegacy(");
        sb.append(gesturesTracker);
        sb.append(")");
        return sb.toString();
    }
}
