package com.datadog.android.sessionreplay.internal.recorder.callback;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b'\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00100\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00104R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0014\u00108\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u0014\u0010:\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010>\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u0014\u0010I\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010G\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010OR\u0014\u0010J\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010PR\u0014\u0010S\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010Q\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010X"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/RecorderWindowCallback;", "Lcom/datadog/android/internal/utils/FixedWindowCallback;", "Landroid/content/Context;", "appContext", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "Landroid/view/Window$Callback;", "wrappedCallback", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "rumContextProvider", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "viewOnDrawInterceptor", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "copyEvent", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/MotionEventUtils;", "motionEventUtils", "", "motionUpdateThresholdInNs", "flushPositionBufferThresholdInNs", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;", "windowInspector", "<init>", "(Landroid/content/Context;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;Landroid/view/Window$Callback;Lcom/datadog/android/internal/time/TimeProvider;Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/sessionreplay/internal/recorder/callback/MotionEventUtils;JJLcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;)V", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "getHighSpeedVideoSizes", "()V", "hasFocus", "onWindowFocusChanged", "(Z)V", "p0", "Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;", "p1", "(Landroid/view/MotionEvent;Lcom/datadog/android/sessionreplay/model/MobileSegment$PointerEventType;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "J", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getOutputMinFrameDuration", "getInputSizeshNQ4ISI", "getOutputFormats", "Lcom/datadog/android/sessionreplay/internal/recorder/callback/MotionEventUtils;", "getInputFormats", "", "getHighSpeedVideoSizesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$MobileRecord;", "pointerInteractions", "Ljava/util/List;", "getPointerInteractions$dd_sdk_android_session_replay_release", "()Ljava/util/List;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getOutputSizes", "getOutputStallDuration", "Lcom/datadog/android/sessionreplay/internal/utils/RumContextProvider;", "getOutputMinFrameDurationlomOqCM", "getOutputStallDurationlomOqCM", "Z", "Lcom/datadog/android/internal/time/TimeProvider;", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "toString", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "unwrapAs", "isOutputSupportedFor", "Lcom/datadog/android/sessionreplay/internal/recorder/WindowInspector;", "Landroid/view/Window$Callback;", "getWrappedCallback$dd_sdk_android_session_replay_release", "()Landroid/view/Window$Callback;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecorderWindowCallback extends com.datadog.android.internal.utils.FixedWindowCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.Companion(null);
    public static final java.lang.String FAIL_TO_PROCESS_MOTION_EVENT_ERROR_MESSAGE = "RecorderWindowCallback: wrapped callback failed to handle the motion event";
    private static final long FLUSH_BUFFER_THRESHOLD_NS;
    public static final java.lang.String MOTION_EVENT_WAS_NULL_ERROR_MESSAGE = "RecorderWindowCallback: intercepted null motion event";
    private static final long MOTION_UPDATE_DELAY_THRESHOLD_NS;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.ImagePrivacy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<android.view.MotionEvent, android.view.MotionEvent> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final float getOutputFormats;
    private final long getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getOutputStallDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getOutputSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.RumContextProvider getOutputMinFrameDurationlomOqCM;
    private boolean getOutputStallDurationlomOqCM;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.WindowInspector toString;
    private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> pointerInteractions;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor unwrapAs;
    private final android.view.Window.Callback wrappedCallback;

    /* renamed from: getWrappedCallback$dd_sdk_android_session_replay_release, reason: from getter */
    public final android.view.Window.Callback getWrappedCallback() {
        return this.wrappedCallback;
    }

    public /* synthetic */ RecorderWindowCallback(android.content.Context context, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, android.view.Window.Callback callback, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, kotlin.jvm.functions.Function1 function1, com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils motionEventUtils, long j, long j2, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, recordedDataQueueHandler, callback, timeProvider, rumContextProvider, viewOnDrawInterceptor, internalLogger, textAndInputPrivacy, imagePrivacy, touchPrivacyManager, (i & 1024) != 0 ? new kotlin.jvm.functions.Function1<android.view.MotionEvent, android.view.MotionEvent>() { // from class: com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final android.view.MotionEvent invoke(android.view.MotionEvent motionEvent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "");
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "");
                return obtain;
            }
        } : function1, (i & 2048) != 0 ? com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils.INSTANCE : motionEventUtils, (i & 4096) != 0 ? MOTION_UPDATE_DELAY_THRESHOLD_NS : j, (i & 8192) != 0 ? FLUSH_BUFFER_THRESHOLD_NS : j2, (i & 16384) != 0 ? com.datadog.android.sessionreplay.internal.recorder.WindowInspector.INSTANCE : windowInspector);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecorderWindowCallback(android.content.Context context, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, android.view.Window.Callback callback, com.datadog.android.internal.time.TimeProvider timeProvider, com.datadog.android.sessionreplay.internal.utils.RumContextProvider rumContextProvider, com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor viewOnDrawInterceptor, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, android.view.MotionEvent> function1, com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils motionEventUtils, long j, long j2, com.datadog.android.sessionreplay.internal.recorder.WindowInspector windowInspector) {
        super(callback);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewOnDrawInterceptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEventUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInspector, "");
        this.getOutputSizes = recordedDataQueueHandler;
        this.wrappedCallback = callback;
        this.getOutputSizeshNQ4ISI = timeProvider;
        this.getOutputMinFrameDurationlomOqCM = rumContextProvider;
        this.unwrapAs = viewOnDrawInterceptor;
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighSpeedVideoSizesFor = textAndInputPrivacy;
        this.getHighResolutionOutputSizeshNQ4ISI = imagePrivacy;
        this.getOutputStallDuration = touchPrivacyManager;
        this.Camera2StreamConfigurationMap = function1;
        this.getOutputMinFrameDuration = motionEventUtils;
        this.getInputFormats = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.toString = windowInspector;
        this.getOutputFormats = context.getResources().getDisplayMetrics().density;
        this.pointerInteractions = new java.util.LinkedList();
        this.getInputSizeshNQ4ISI = timeProvider.getDeviceElapsedTimeNanos();
    }

    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord> getPointerInteractions$dd_sdk_android_session_replay_release() {
        return this.pointerInteractions;
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent event) {
        if (event != null) {
            if (event.getAction() == 0) {
                this.getOutputStallDurationlomOqCM = this.getOutputStallDuration.shouldRecordTouch$dd_sdk_android_session_replay_release(new android.graphics.Point((int) event.getX(), (int) event.getY()));
            }
            if (this.getOutputStallDurationlomOqCM) {
                android.view.MotionEvent invoke = this.Camera2StreamConfigurationMap.invoke(event);
                try {
                    int action = invoke.getAction() & 255;
                    if (action == 0) {
                        this.getInputSizeshNQ4ISI = this.getOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos();
                        getHighSpeedVideoSizes(invoke, com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.DOWN);
                        this.getHighSpeedVideoFpsRangesFor = 0L;
                    } else if (action == 1) {
                        getHighSpeedVideoSizes(invoke, com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.UP);
                        getHighSpeedVideoSizes();
                        this.getHighSpeedVideoFpsRangesFor = 0L;
                    } else if (action == 2) {
                        if (this.getOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos() - this.getHighSpeedVideoFpsRangesFor >= this.getInputFormats) {
                            getHighSpeedVideoSizes(invoke, com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType.MOVE);
                            this.getHighSpeedVideoFpsRangesFor = this.getOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos();
                        }
                        if (this.getOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos() - this.getInputSizeshNQ4ISI >= this.getHighSpeedVideoFpsRanges) {
                            getHighSpeedVideoSizes();
                        }
                    }
                } finally {
                    invoke.recycle();
                }
            }
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback$dispatchTouchEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.MOTION_EVENT_WAS_NULL_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
        try {
            return super.dispatchTouchEvent(event);
        } catch (java.lang.NullPointerException e) {
            java.lang.String message = e.getMessage();
            if (message != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "Parameter specified as non-null is null", false, 2, (java.lang.Object) null)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback$logOrRethrowWrappedCallbackException$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.FAIL_TO_PROCESS_MOTION_EVENT_ERROR_MESSAGE;
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                return true;
            }
            throw e;
        }
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean hasFocus) {
        java.util.List<? extends android.view.View> globalWindowViews$default = com.datadog.android.sessionreplay.internal.recorder.WindowInspector.getGlobalWindowViews$default(this.toString, this.getHighSpeedVideoSizes, null, 2, null);
        if (!globalWindowViews$default.isEmpty()) {
            this.unwrapAs.stopIntercepting();
            this.unwrapAs.intercept(globalWindowViews$default, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        super.onWindowFocusChanged(hasFocus);
    }

    private final void getHighSpeedVideoSizes(android.view.MotionEvent p0, com.datadog.android.sessionreplay.model.MobileSegment.PointerEventType p1) {
        int pointerCount = p0.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int i2 = i;
            this.pointerInteractions.add(new com.datadog.android.sessionreplay.model.MobileSegment.MobileRecord.MobileIncrementalSnapshotRecord(this.getOutputSizeshNQ4ISI.getDeviceTimestampMillis() + this.getOutputMinFrameDurationlomOqCM.getRumContext().getViewTimeOffsetMs(), new com.datadog.android.sessionreplay.model.MobileSegment.MobileIncrementalData.PointerInteractionData(p1, com.datadog.android.sessionreplay.model.MobileSegment.PointerType.TOUCH, p0.getPointerId(i), java.lang.Long.valueOf(com.datadog.android.internal.utils.LongExtKt.densityNormalized((long) com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils.getPointerAbsoluteX$default(this.getOutputMinFrameDuration, p0, i2, null, 4, null), this.getOutputFormats)), java.lang.Long.valueOf(com.datadog.android.internal.utils.LongExtKt.densityNormalized((long) com.datadog.android.sessionreplay.internal.recorder.callback.MotionEventUtils.getPointerAbsoluteY$default(this.getOutputMinFrameDuration, p0, i2, null, 4, null), this.getOutputFormats)))));
        }
    }

    private final void getHighSpeedVideoSizes() {
        com.datadog.android.sessionreplay.internal.async.TouchEventRecordedDataQueueItem addTouchEventItem;
        if (this.pointerInteractions.isEmpty() || (addTouchEventItem = this.getOutputSizes.addTouchEventItem(new java.util.ArrayList(this.pointerInteractions))) == null) {
            return;
        }
        if (addTouchEventItem.isReady$dd_sdk_android_session_replay_release()) {
            this.getOutputSizes.tryToConsumeItems();
        }
        this.pointerInteractions.clear();
        this.getInputSizeshNQ4ISI = this.getOutputSizeshNQ4ISI.getDeviceElapsedTimeNanos();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/callback/RecorderWindowCallback$Companion;", "", "<init>", "()V", "", "FAIL_TO_PROCESS_MOTION_EVENT_ERROR_MESSAGE", "Ljava/lang/String;", "", "FLUSH_BUFFER_THRESHOLD_NS", "J", "getFLUSH_BUFFER_THRESHOLD_NS$dd_sdk_android_session_replay_release", "()J", "MOTION_EVENT_WAS_NULL_ERROR_MESSAGE", "MOTION_UPDATE_DELAY_THRESHOLD_NS", "getMOTION_UPDATE_DELAY_THRESHOLD_NS$dd_sdk_android_session_replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final long getMOTION_UPDATE_DELAY_THRESHOLD_NS$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.MOTION_UPDATE_DELAY_THRESHOLD_NS;
        }

        public final long getFLUSH_BUFFER_THRESHOLD_NS$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.callback.RecorderWindowCallback.FLUSH_BUFFER_THRESHOLD_NS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(16L);
        MOTION_UPDATE_DELAY_THRESHOLD_NS = nanos;
        FLUSH_BUFFER_THRESHOLD_NS = nanos * 10;
    }
}
