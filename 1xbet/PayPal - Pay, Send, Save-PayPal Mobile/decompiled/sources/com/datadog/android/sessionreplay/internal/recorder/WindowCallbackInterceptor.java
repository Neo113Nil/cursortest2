package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001c\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/WindowCallbackInterceptor;", "", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "viewOnDrawInterceptor", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "rumContextProvider", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "<init>", "(Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;Lcom/datadog/android/internal/time/TimeProvider;Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;)V", "", "Landroid/view/Window;", "windows", "Landroid/content/Context;", "appContext", "", "intercept", "(Ljava/util/List;Landroid/content/Context;)V", "stopIntercepting", "()V", "(Ljava/util/List;)V", "p0", "getHighSpeedVideoSizes", "(Landroid/view/Window;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getOutputMinFrameDuration", "Lcom/datadog/android/internal/time/TimeProvider;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "getInputFormats", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "getOutputFormats", "Ljava/util/WeakHashMap;", "getInputSizeshNQ4ISI", "Ljava/util/WeakHashMap;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WindowCallbackInterceptor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;
    private final com.datadog.android.sessionreplay.ImagePrivacy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.RumContextProvider Camera2StreamConfigurationMap;
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy getHighSpeedVideoSizes;
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getHighSpeedVideoSizesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.WeakHashMap<android.view.Window, java.lang.Object> getInputFormats;
    private final com.datadog.android.internal.time.TimeProvider getOutputMinFrameDuration;

    public WindowCallbackInterceptor(com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewOnDrawInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        this.getHighSpeedVideoFpsRangesFor = recordedDataQueueHandler;
        this.getOutputFormats = viewOnDrawInterceptor;
        this.getOutputMinFrameDuration = timeProvider;
        this.Camera2StreamConfigurationMap = rumContextProvider;
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = imagePrivacy;
        this.getHighSpeedVideoSizes = textAndInputPrivacy;
        this.getHighSpeedVideoSizesFor = touchPrivacyManager;
        this.getInputFormats = new java.util.WeakHashMap<>();
    }

    public final void intercept(java.util.List<? extends android.view.Window> windows, android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        for (android.view.Window window : windows) {
            com.datadog.android.sessionreplay.internal.recorder.callback.NoOpWindowCallback callback = window.getCallback();
            if (callback == null) {
                callback = new com.datadog.android.sessionreplay.internal.recorder.callback.NoOpWindowCallback();
            }
            window.setCallback(new com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback(appContext, this.getHighSpeedVideoFpsRangesFor, callback, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, null, null, 0L, 0L, null, 31744, null));
            this.getInputFormats.put(window, null);
        }
    }

    public final void stopIntercepting(java.util.List<? extends android.view.Window> windows) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windows, "");
        for (android.view.Window window : windows) {
            getHighSpeedVideoSizes(window);
            this.getInputFormats.remove(window);
        }
    }

    public final void stopIntercepting() {
        java.util.Set<java.util.Map.Entry<android.view.Window, java.lang.Object>> entrySet = this.getInputFormats.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            getHighSpeedVideoSizes((android.view.Window) key);
        }
        this.getInputFormats.clear();
    }

    private static void getHighSpeedVideoSizes(android.view.Window p0) {
        android.view.Window.Callback callback = p0.getCallback();
        if (callback instanceof com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback) {
            android.view.Window.Callback wrappedCallback = ((com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback) callback).getWrappedCallback();
            if (!(wrappedCallback instanceof com.datadog.android.sessionreplay.internal.recorder.callback.NoOpWindowCallback)) {
                p0.setCallback(wrappedCallback);
            } else {
                p0.setCallback(null);
            }
        }
    }
}
