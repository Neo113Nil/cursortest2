package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0014\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0014\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\u001d8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010%"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/ViewOnDrawInterceptor;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lcom/datadog/android/sessionreplay/internal/recorder/OnDrawListenerProducer;", "onDrawListenerProducer", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lcom/datadog/android/sessionreplay/internal/recorder/OnDrawListenerProducer;)V", "", "Landroid/view/View;", "decorViews", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "", "intercept", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;)V", "stopIntercepting", "()V", "(Ljava/util/List;)V", "p0", "getHighSpeedVideoFpsRangesFor", "Landroid/view/ViewTreeObserver$OnDrawListener;", "p1", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "Ljava/util/WeakHashMap;", "decorOnDrawListeners", "Ljava/util/WeakHashMap;", "getDecorOnDrawListeners$dd_sdk_android_session_replay_release", "()Ljava/util/WeakHashMap;", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/recorder/OnDrawListenerProducer;", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewOnDrawInterceptor {
    private final java.util.WeakHashMap<android.view.View, android.view.ViewTreeObserver.OnDrawListener> decorOnDrawListeners;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private final com.datadog.android.sessionreplay.internal.recorder.OnDrawListenerProducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager Camera2StreamConfigurationMap;

    public ViewOnDrawInterceptor(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.internal.recorder.OnDrawListenerProducer onDrawListenerProducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDrawListenerProducer, "");
        this.getHighSpeedVideoSizes = internalLogger;
        this.Camera2StreamConfigurationMap = touchPrivacyManager;
        this.getHighSpeedVideoFpsRangesFor = onDrawListenerProducer;
        this.decorOnDrawListeners = new java.util.WeakHashMap<>();
    }

    public final java.util.WeakHashMap<android.view.View, android.view.ViewTreeObserver.OnDrawListener> getDecorOnDrawListeners$dd_sdk_android_session_replay_release() {
        return this.decorOnDrawListeners;
    }

    public final void intercept(java.util.List<? extends android.view.View> decorViews, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorViews, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        getHighSpeedVideoFpsRangesFor(decorViews);
        android.view.ViewTreeObserver.OnDrawListener create = this.getHighSpeedVideoFpsRangesFor.create(decorViews, textAndInputPrivacy, imagePrivacy, this.Camera2StreamConfigurationMap);
        for (android.view.View view : decorViews) {
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                try {
                    viewTreeObserver.addOnDrawListener(create);
                    this.decorOnDrawListeners.put(view, create);
                } catch (java.lang.IllegalStateException e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor$intercept$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Unable to add onDrawListener onto viewTreeObserver";
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                }
            }
        }
        create.onDraw();
    }

    public final void stopIntercepting(java.util.List<? extends android.view.View> decorViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decorViews, "");
        getHighSpeedVideoFpsRangesFor(decorViews);
    }

    public final void stopIntercepting() {
        java.util.Set<java.util.Map.Entry<android.view.View, android.view.ViewTreeObserver.OnDrawListener>> entrySet = this.decorOnDrawListeners.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entry, "");
            android.view.View view = (android.view.View) entry.getKey();
            android.view.ViewTreeObserver.OnDrawListener onDrawListener = (android.view.ViewTreeObserver.OnDrawListener) entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(onDrawListener, "");
            getHighSpeedVideoFpsRanges(view, onDrawListener);
        }
        this.decorOnDrawListeners.clear();
    }

    private final void getHighSpeedVideoFpsRangesFor(java.util.List<? extends android.view.View> p0) {
        for (android.view.View view : p0) {
            android.view.ViewTreeObserver.OnDrawListener remove = this.decorOnDrawListeners.remove(view);
            if (remove != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(remove, "");
                getHighSpeedVideoFpsRanges(view, remove);
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges(android.view.View p0, android.view.ViewTreeObserver.OnDrawListener p1) {
        if (p0.getViewTreeObserver().isAlive()) {
            try {
                p0.getViewTreeObserver().removeOnDrawListener(p1);
            } catch (java.lang.IllegalStateException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.ViewOnDrawInterceptor$stopInterceptingSafe$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to remove onDrawListener from viewTreeObserver";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }
}
