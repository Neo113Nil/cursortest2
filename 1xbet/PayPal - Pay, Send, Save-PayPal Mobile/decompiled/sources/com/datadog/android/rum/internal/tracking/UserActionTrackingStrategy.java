package com.datadog.android.rum.internal.tracking;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/UserActionTrackingStrategy;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "getGesturesTracker", "()Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UserActionTrackingStrategy extends com.datadog.android.rum.tracking.TrackingStrategy {
    com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker getGesturesTracker();
}
