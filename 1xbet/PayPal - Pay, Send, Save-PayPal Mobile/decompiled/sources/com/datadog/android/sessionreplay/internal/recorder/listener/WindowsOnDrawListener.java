package com.datadog.android.sessionreplay.internal.recorder.listener;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 92\u00020\u0001:\u00019Bi\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010)\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00100R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00101R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003040\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/listener/WindowsOnDrawListener;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "", "Landroid/view/View;", "zOrderedDecorViews", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "recordedDataQueueHandler", "Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;", "snapshotProducer", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "Lcom/datadog/android/sessionreplay/internal/utils/MiscUtils;", "miscUtils", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "dynamicOptimizationEnabled", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lcom/datadog/android/sessionreplay/internal/recorder/Debouncer;", "debouncer", "", "methodCallSamplingRate", "<init>", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/utils/MiscUtils;Lcom/datadog/android/api/feature/FeatureSdkCore;ZLcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lcom/datadog/android/sessionreplay/internal/recorder/Debouncer;F)V", "", "onDraw", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/Debouncer;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Lcom/datadog/android/sessionreplay/internal/utils/MiscUtils;", "getOutputFormats", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueHandler;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getOutputMinFrameDuration", "getInputFormats", "Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;", "getHighSpeedVideoSizesFor", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "getOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "Ljava/lang/ref/WeakReference;", "weakReferencedDecorViews", "Ljava/util/List;", "getWeakReferencedDecorViews$dd_sdk_android_session_replay_release", "()Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WindowsOnDrawListener implements android.view.ViewTreeObserver.OnDrawListener {
    private static final java.lang.Class<com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener> getHighSpeedVideoFpsRanges = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.class;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.ImagePrivacy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.Debouncer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.MiscUtils getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.lang.Runnable getInputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.TextAndInputPrivacy getInputFormats;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getOutputFormats;
    private final java.util.List<java.lang.ref.WeakReference<android.view.View>> weakReferencedDecorViews;

    public WindowsOnDrawListener(java.util.List<? extends android.view.View> list, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer snapshotProducer, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.utils.MiscUtils miscUtils, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, boolean z, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.internal.recorder.Debouncer debouncer, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(snapshotProducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miscUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debouncer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = recordedDataQueueHandler;
        this.getHighSpeedVideoSizesFor = snapshotProducer;
        this.getInputFormats = textAndInputPrivacy;
        this.getHighSpeedVideoFpsRangesFor = imagePrivacy;
        this.getHighSpeedVideoSizes = miscUtils;
        this.getOutputMinFrameDuration = featureSdkCore;
        this.getOutputFormats = touchPrivacyManager;
        this.getHighSpeedVideoFpsRanges = debouncer;
        this.Camera2StreamConfigurationMap = f;
        java.util.List<? extends android.view.View> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new java.lang.ref.WeakReference((android.view.View) it.next()));
        }
        this.weakReferencedDecorViews = arrayList;
        this.getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener$snapshotRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.sessionreplay.internal.utils.MiscUtils miscUtils2;
                com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler2;
                com.datadog.android.api.feature.FeatureSdkCore featureSdkCore2;
                java.lang.Class cls;
                float f2;
                com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager2;
                com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler3;
                java.util.List<java.lang.ref.WeakReference<android.view.View>> weakReferencedDecorViews$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getWeakReferencedDecorViews$dd_sdk_android_session_replay_release();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator<T> it2 = weakReferencedDecorViews$dd_sdk_android_session_replay_release.iterator();
                while (it2.hasNext()) {
                    android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) it2.next()).get();
                    if (view != null) {
                        arrayList2.add(view);
                    }
                }
                final java.util.ArrayList arrayList3 = arrayList2;
                android.view.View view2 = (android.view.View) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList3);
                android.content.Context context = view2 != null ? view2.getContext() : null;
                if (context != null) {
                    miscUtils2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getHighSpeedVideoSizes;
                    final com.datadog.android.sessionreplay.recorder.SystemInformation resolveSystemInformation$default = com.datadog.android.sessionreplay.internal.utils.MiscUtils.resolveSystemInformation$default(miscUtils2, context, null, 2, null);
                    recordedDataQueueHandler2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getHighResolutionOutputSizeshNQ4ISI;
                    final com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem addSnapshotItem = recordedDataQueueHandler2.addSnapshotItem(resolveSystemInformation$default);
                    if (addSnapshotItem == null) {
                        return;
                    }
                    featureSdkCore2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getOutputMinFrameDuration;
                    com.datadog.android.api.InternalLogger internalLogger = featureSdkCore2.getInternalLogger();
                    cls = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.getHighSpeedVideoFpsRanges;
                    f2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.Camera2StreamConfigurationMap;
                    final com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener windowsOnDrawListener = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this;
                    java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> list3 = (java.util.List) com.datadog.android.api.feature.FeatureScopeExtKt.measureMethodCallPerf(internalLogger, cls, "Capture Record", f2, new kotlin.jvm.functions.Function0<java.util.List<? extends com.datadog.android.sessionreplay.internal.recorder.Node>>() { // from class: com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener$snapshotRunnable$1$run$nodes$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.util.List<com.datadog.android.sessionreplay.internal.recorder.Node> invoke() {
                            com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler4;
                            com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer snapshotProducer2;
                            com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy2;
                            com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy2;
                            com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener windowsOnDrawListener2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this;
                            com.datadog.android.sessionreplay.internal.async.SnapshotRecordedDataQueueItem snapshotRecordedDataQueueItem = addSnapshotItem;
                            java.util.List<android.view.View> list4 = arrayList3;
                            com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation = resolveSystemInformation$default;
                            com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder("SnapshotProducer", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attribute.container", "true"))).startSpan();
                            try {
                                recordedDataQueueHandler4 = windowsOnDrawListener2.getHighResolutionOutputSizeshNQ4ISI;
                                com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs = new com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs(recordedDataQueueHandler4);
                                recordedDataQueueRefs.setRecordedDataQueueItem$dd_sdk_android_session_replay_release(snapshotRecordedDataQueueItem);
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                for (android.view.View view3 : list4) {
                                    snapshotProducer2 = windowsOnDrawListener2.getHighSpeedVideoSizesFor;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view3, "");
                                    textAndInputPrivacy2 = windowsOnDrawListener2.getInputFormats;
                                    imagePrivacy2 = windowsOnDrawListener2.getHighSpeedVideoFpsRangesFor;
                                    com.datadog.android.sessionreplay.internal.recorder.Node produce = snapshotProducer2.produce(view3, systemInformation, textAndInputPrivacy2, imagePrivacy2, recordedDataQueueRefs);
                                    if (produce != null) {
                                        arrayList4.add(produce);
                                    }
                                }
                                return arrayList4;
                            } finally {
                                startSpan.stop();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }
                    });
                    if (!list3.isEmpty()) {
                        addSnapshotItem.setNodes$dd_sdk_android_session_replay_release(list3);
                    }
                    addSnapshotItem.setFinishedTraversal$dd_sdk_android_session_replay_release(true);
                    if (addSnapshotItem.isReady$dd_sdk_android_session_replay_release()) {
                        recordedDataQueueHandler3 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getHighResolutionOutputSizeshNQ4ISI;
                        recordedDataQueueHandler3.tryToConsumeItems();
                    }
                    touchPrivacyManager2 = com.datadog.android.sessionreplay.internal.recorder.listener.WindowsOnDrawListener.this.getOutputFormats;
                    touchPrivacyManager2.updateCurrentTouchOverrideAreas$dd_sdk_android_session_replay_release();
                }
            }
        };
    }

    public /* synthetic */ WindowsOnDrawListener(java.util.List list, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueHandler recordedDataQueueHandler, com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer snapshotProducer, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.utils.MiscUtils miscUtils, com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, boolean z, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.sessionreplay.internal.recorder.Debouncer debouncer, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, recordedDataQueueHandler, snapshotProducer, textAndInputPrivacy, imagePrivacy, (i & 32) != 0 ? com.datadog.android.sessionreplay.internal.utils.MiscUtils.INSTANCE : miscUtils, featureSdkCore, z, touchPrivacyManager, (i & 512) != 0 ? new com.datadog.android.sessionreplay.internal.recorder.Debouncer(null, 0L, null, featureSdkCore, z, 7, null) : debouncer, f);
    }

    public final java.util.List<java.lang.ref.WeakReference<android.view.View>> getWeakReferencedDecorViews$dd_sdk_android_session_replay_release() {
        return this.weakReferencedDecorViews;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.getHighSpeedVideoFpsRanges.debounce$dd_sdk_android_session_replay_release(this.getInputSizeshNQ4ISI);
    }
}
