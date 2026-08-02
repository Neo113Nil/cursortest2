package com.datadog.android.rum.internal.instrumentation.gestures;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010!\u001a\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u00107R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R$\u0010<\u001a\f\u0012\b\u0012\u0006*\u00020\u00020\u00020;8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010B"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/WindowCallbackWrapper;", "Lcom/datadog/android/internal/utils/FixedWindowCallback;", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/view/Window$Callback;", "wrappedCallback", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "gesturesDetector", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "copyEvent", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "targetAttributesProviders", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Landroid/view/Window;Lcom/datadog/android/api/SdkCore;Landroid/view/Window$Callback;Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;Lcom/datadog/android/rum/tracking/InteractionPredicate;Lkotlin/jvm/functions/Function1;[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/KeyEvent;", "event", "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/NullPointerException;", "Lkotlin/getInputSizeshNQ4ISI;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/NullPointerException;)V", "", "featureId", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "Lkotlin/jvm/functions/Function1;", "getCopyEvent", "()Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "getInteractionPredicate", "()Lcom/datadog/android/rum/tracking/InteractionPredicate;", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/api/SdkCore;", "getSdkCore", "()Lcom/datadog/android/api/SdkCore;", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "getTargetAttributesProviders", "()[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "Ljava/lang/ref/WeakReference;", "windowReference", "Ljava/lang/ref/WeakReference;", "getWindowReference$dd_sdk_android_rum_release", "()Ljava/lang/ref/WeakReference;", "Landroid/view/Window$Callback;", "getWrappedCallback", "()Landroid/view/Window$Callback;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowCallbackWrapper extends com.datadog.android.internal.utils.FixedWindowCallback {
    public static final java.lang.String BACK_DEFAULT_TARGET_NAME = "back";
    public static final boolean EVENT_CONSUMED = true;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.rum.internal.instrumentation.gestures.GesturesDetectorWrapper getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<android.view.MotionEvent, android.view.MotionEvent> copyEvent;
    private final com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final com.datadog.android.api.SdkCore sdkCore;
    private final com.datadog.android.rum.tracking.ViewAttributesProvider[] targetAttributesProviders;
    private final java.lang.ref.WeakReference<android.view.Window> windowReference;
    private final android.view.Window.Callback wrappedCallback;

    public final com.datadog.android.api.SdkCore getSdkCore() {
        return this.sdkCore;
    }

    public final android.view.Window.Callback getWrappedCallback() {
        return this.wrappedCallback;
    }

    public /* synthetic */ WindowCallbackWrapper(android.view.Window window, com.datadog.android.api.SdkCore sdkCore, android.view.Window.Callback callback, com.datadog.android.rum.internal.instrumentation.gestures.GesturesDetectorWrapper gesturesDetectorWrapper, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, kotlin.jvm.functions.Function1 function1, com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(window, sdkCore, callback, gesturesDetectorWrapper, (i & 16) != 0 ? new com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate() : interactionPredicate, (i & 32) != 0 ? new kotlin.jvm.functions.Function1<android.view.MotionEvent, android.view.MotionEvent>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper.1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final android.view.MotionEvent invoke(android.view.MotionEvent motionEvent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "");
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "");
                return obtain;
            }
        } : function1, (i & 64) != 0 ? new com.datadog.android.rum.tracking.ViewAttributesProvider[0] : viewAttributesProviderArr, internalLogger);
    }

    public final com.datadog.android.rum.tracking.InteractionPredicate getInteractionPredicate() {
        return this.interactionPredicate;
    }

    public final kotlin.jvm.functions.Function1<android.view.MotionEvent, android.view.MotionEvent> getCopyEvent() {
        return this.copyEvent;
    }

    public final com.datadog.android.rum.tracking.ViewAttributesProvider[] getTargetAttributesProviders() {
        return this.targetAttributesProviders;
    }

    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowCallbackWrapper(android.view.Window window, com.datadog.android.api.SdkCore sdkCore, android.view.Window.Callback callback, com.datadog.android.rum.internal.instrumentation.gestures.GesturesDetectorWrapper gesturesDetectorWrapper, com.datadog.android.rum.tracking.InteractionPredicate interactionPredicate, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, android.view.MotionEvent> function1, com.datadog.android.rum.tracking.ViewAttributesProvider[] viewAttributesProviderArr, com.datadog.android.api.InternalLogger internalLogger) {
        super(callback);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gesturesDetectorWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionPredicate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewAttributesProviderArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.sdkCore = sdkCore;
        this.wrappedCallback = callback;
        this.getHighSpeedVideoFpsRanges = gesturesDetectorWrapper;
        this.interactionPredicate = interactionPredicate;
        this.copyEvent = function1;
        this.targetAttributesProviders = viewAttributesProviderArr;
        this.internalLogger = internalLogger;
        this.windowReference = new java.lang.ref.WeakReference<>(window);
    }

    public final java.lang.ref.WeakReference<android.view.Window> getWindowReference$dd_sdk_android_rum_release() {
        return this.windowReference;
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent event) {
        if (event != null) {
            android.view.MotionEvent invoke = this.copyEvent.invoke(event);
            try {
                try {
                    this.getHighSpeedVideoFpsRanges.onTouchEvent(invoke);
                } catch (java.lang.Exception e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Error processing MotionEvent";
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                }
            } finally {
                invoke.recycle();
            }
        } else {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchTouchEvent$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Received null MotionEvent";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        try {
            return this.wrappedCallback.dispatchTouchEvent(event);
        } catch (java.lang.NullPointerException e2) {
            getHighResolutionOutputSizeshNQ4ISI(e2);
            return true;
        }
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final boolean onMenuItemSelected(int featureId, android.view.MenuItem item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        android.view.Window window = this.windowReference.get();
        com.datadog.android.rum.GlobalRumMonitor.get(this.sdkCore).addAction(com.datadog.android.rum.RumActionType.TAP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resolveTargetName(this.interactionPredicate, item), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_CLASS_NAME, item.getClass().getCanonicalName()), kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_RESOURCE_ID, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resourceIdName(window != null ? window.getContext() : null, item.getItemId())), kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_TITLE, item.getTitle())));
        try {
            return this.wrappedCallback.onMenuItemSelected(featureId, item);
        } catch (java.lang.NullPointerException e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
            return true;
        }
    }

    @Override // com.datadog.android.internal.utils.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.Window window;
        android.view.View currentFocus;
        if (event == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$dispatchKeyEvent$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Received null KeyEvent";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (event.getKeyCode() != 4 || event.getAction() != 1) {
            if (event.getKeyCode() == 23 && event.getAction() == 1 && (window = this.windowReference.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_CLASS_NAME, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.targetClassName(currentFocus)), kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ACTION_TARGET_RESOURCE_ID, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resourceIdName(window.getContext(), currentFocus.getId())));
                for (com.datadog.android.rum.tracking.ViewAttributesProvider viewAttributesProvider : this.targetAttributesProviders) {
                    viewAttributesProvider.extractAttributes(currentFocus, mutableMapOf);
                }
                com.datadog.android.rum.GlobalRumMonitor.get(this.sdkCore).addAction(com.datadog.android.rum.RumActionType.CLICK, com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resolveTargetName(this.interactionPredicate, currentFocus), mutableMapOf);
            }
        } else {
            java.lang.String targetName = this.interactionPredicate.getTargetName(event);
            java.lang.String str = targetName;
            if (str == null || str.length() == 0) {
                targetName = "back";
            }
            com.datadog.android.rum.RumMonitor.DefaultImpls.addAction$default(com.datadog.android.rum.GlobalRumMonitor.get(this.sdkCore), com.datadog.android.rum.RumActionType.BACK, targetName, null, 4, null);
        }
        try {
            return this.wrappedCallback.dispatchKeyEvent(event);
        } catch (java.lang.NullPointerException e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
            return true;
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.NullPointerException p0) {
        java.lang.String message = p0.getMessage();
        if (message == null) {
            throw p0;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "Parameter specified as non-null is null", false, 2, (java.lang.Object) null)) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper$logOrRethrowWrappedCallbackException$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Wrapped Window.Callback failed processing event";
                }
            }, (java.lang.Throwable) p0, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return;
        }
        throw p0;
    }
}
