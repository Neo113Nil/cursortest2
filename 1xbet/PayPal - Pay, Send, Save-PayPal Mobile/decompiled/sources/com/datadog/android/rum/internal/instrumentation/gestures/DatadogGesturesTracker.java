package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/DatadogGesturesTracker;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesTracker;", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "targetAttributesProviders", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "composeActionsTrackingStrategy", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "([Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;Lcom/datadog/android/api/InternalLogger;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "generateGestureDetector$dd_sdk_android_rum_release", "(Landroid/content/Context;Landroid/view/Window;Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "", "hashCode", "()I", "", "startTracking", "(Landroid/view/Window;Landroid/content/Context;Lcom/datadog/android/api/SdkCore;)V", "stopTracking", "(Landroid/view/Window;Landroid/content/Context;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/tracking/ActionTrackingStrategy;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInteractionPredicate$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "getTargetAttributesProviders$dd_sdk_android_rum_release", "()[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogGesturesTracker implements com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.tracking.ActionTrackingStrategy getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate;
    private final com.datadog.android.rum.tracking.ViewAttributesProvider[] targetAttributesProviders;

    public DatadogGesturesTracker(com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, com.datadog.android.rum.tracking.ActionTrackingStrategy actionTrackingStrategy, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewAttributesProviderArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionTrackingStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.targetAttributesProviders = viewAttributesProviderArr;
        this.interactionPredicate = interactionPredicate;
        this.getHighResolutionOutputSizeshNQ4ISI = actionTrackingStrategy;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
    }

    /* renamed from: getTargetAttributesProviders$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.ViewAttributesProvider[] getTargetAttributesProviders() {
        return this.targetAttributesProviders;
    }

    /* renamed from: getInteractionPredicate$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.tracking.InteractionPredicate getInteractionPredicate() {
        return this.interactionPredicate;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public final void startTracking(android.view.Window window, android.content.Context context, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        if (window == null) {
            return;
        }
        com.datadog.android.rum.internal.instrumentation.gestures.NoOpWindowCallback callback = window.getCallback();
        if (callback == null) {
            callback = new com.datadog.android.rum.internal.instrumentation.gestures.NoOpWindowCallback();
        }
        window.setCallback(new com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper(window, sdkCore, callback, generateGestureDetector$dd_sdk_android_rum_release(context, window, sdkCore), this.interactionPredicate, null, this.targetAttributesProviders, this.getHighSpeedVideoFpsRangesFor, 32, null));
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GesturesTracker
    public final void stopTracking(android.view.Window window, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (window != null) {
            android.view.Window.Callback callback = window.getCallback();
            if (callback instanceof com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper) {
                com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper windowCallbackWrapper = (com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper) callback;
                if (!(windowCallbackWrapper.getWrappedCallback() instanceof com.datadog.android.rum.internal.instrumentation.gestures.NoOpWindowCallback)) {
                    window.setCallback(windowCallbackWrapper.getWrappedCallback());
                } else {
                    window.setCallback(null);
                }
            }
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker datadogGesturesTracker = (com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker) other;
        return java.util.Arrays.equals(this.targetAttributesProviders, datadogGesturesTracker.targetAttributesProviders) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionPredicate.getClass(), datadogGesturesTracker.interactionPredicate.getClass());
    }

    public final int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.targetAttributesProviders) + 544;
        return hashCode + (hashCode * 31) + this.interactionPredicate.getClass().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String joinToString$default = kotlin.collections.ArraysKt.joinToString$default(this.targetAttributesProviders, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 63, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DatadogGesturesTracker(");
        sb.append(joinToString$default);
        sb.append(")");
        return sb.toString();
    }

    public final com.datadog.android.rum.internal.instrumentation.gestures.GesturesDetectorWrapper generateGestureDetector$dd_sdk_android_rum_release(android.content.Context context, android.view.Window window, com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(window);
        com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr = this.targetAttributesProviders;
        com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate = this.interactionPredicate;
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(context);
        return new com.datadog.android.rum.internal.instrumentation.gestures.GesturesDetectorWrapper(context, new com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener(sdkCore, weakReference, viewAttributesProviderArr, interactionPredicate, weakReference2, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null, 128, null));
    }
}
