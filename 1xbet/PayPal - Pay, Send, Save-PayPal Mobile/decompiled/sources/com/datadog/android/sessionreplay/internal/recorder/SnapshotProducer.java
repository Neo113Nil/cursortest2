package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u001aj\u0002`\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010'\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/SnapshotProducer;", "", "Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;", "imageWireframeHelper", "Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;", "treeViewTraversal", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "optionSelectorDetector", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "touchPrivacyManager", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/View;", "p0", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "p1", "Ljava/util/LinkedList;", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "p2", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "p3", "Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Ljava/util/LinkedList;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;)Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Exception;)V", "rootView", "Lcom/datadog/android/sessionreplay/recorder/SystemInformation;", "systemInformation", "Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;", "textAndInputPrivacy", "Lcom/datadog/android/sessionreplay/ImagePrivacy;", "imagePrivacy", "recordedDataQueueRefs", "produce", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/SystemInformation;Lcom/datadog/android/sessionreplay/TextAndInputPrivacy;Lcom/datadog/android/sessionreplay/ImagePrivacy;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;)Lcom/datadog/android/sessionreplay/internal/recorder/Node;", "getHighSpeedVideoFpsRangesFor", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;)Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "Lcom/datadog/android/sessionreplay/utils/ImageWireframeHelper;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/sessionreplay/recorder/OptionSelectorDetector;", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/TouchPrivacyManager;", "Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SnapshotProducer {
    public static final java.lang.String INVALID_PRIVACY_LEVEL_ERROR = "Invalid privacy level";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.OptionSelectorDetector getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.utils.ImageWireframeHelper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.TouchPrivacyManager getHighResolutionOutputSizeshNQ4ISI;

    public SnapshotProducer(com.datadog.android.sessionreplay.utils.ImageWireframeHelper imageWireframeHelper, com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal treeViewTraversal, com.datadog.android.sessionreplay.recorder.OptionSelectorDetector optionSelectorDetector, com.datadog.android.sessionreplay.internal.TouchPrivacyManager touchPrivacyManager, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageWireframeHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeViewTraversal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionSelectorDetector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchPrivacyManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = imageWireframeHelper;
        this.getHighSpeedVideoSizes = treeViewTraversal;
        this.getHighSpeedVideoFpsRangesFor = optionSelectorDetector;
        this.getHighResolutionOutputSizeshNQ4ISI = touchPrivacyManager;
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    public final com.datadog.android.sessionreplay.internal.recorder.Node produce(android.view.View rootView, com.datadog.android.sessionreplay.recorder.SystemInformation systemInformation, com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy, com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(systemInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textAndInputPrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePrivacy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueRefs, "");
        return getHighSpeedVideoFpsRanges(rootView, new com.datadog.android.sessionreplay.recorder.MappingContext(systemInformation, this.Camera2StreamConfigurationMap, textAndInputPrivacy, imagePrivacy, this.getHighResolutionOutputSizeshNQ4ISI, false, new com.datadog.android.sessionreplay.internal.recorder.callback.DefaultInteropViewCallback(this.getHighSpeedVideoSizes, recordedDataQueueRefs), 32, null), new java.util.LinkedList<>(), recordedDataQueueRefs);
    }

    private final com.datadog.android.sessionreplay.internal.recorder.Node getHighSpeedVideoFpsRanges(android.view.View p0, com.datadog.android.sessionreplay.recorder.MappingContext p1, java.util.LinkedList<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> p2, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs p3) {
        java.util.LinkedList linkedList;
        java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.lang.String simpleName = p0.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        boolean z = p0 instanceof android.view.ViewGroup;
        com.datadog.android.internal.profiler.BenchmarkSpan startSpan = com.datadog.android.internal.profiler.GlobalBenchmark.INSTANCE.getProfiler().getTracer("dd-sdk-android").spanBuilder(simpleName, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attribute.container", java.lang.String.valueOf(z)))).startSpan();
        try {
            com.datadog.android.sessionreplay.recorder.MappingContext highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, p1);
            com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView traverse = this.getHighSpeedVideoSizes.traverse(p0, highSpeedVideoFpsRangesFor, p3);
            com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy nextActionStrategy = traverse.getNextActionStrategy();
            java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> mappedWireframes = traverse.getMappedWireframes();
            if (nextActionStrategy != com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_DROP_NODE) {
                if (nextActionStrategy == com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_RETURN_NODE) {
                    return new com.datadog.android.sessionreplay.internal.recorder.Node(mappedWireframes, null, p2, 2, null);
                }
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                if (z && ((android.view.ViewGroup) p0).getChildCount() > 0 && nextActionStrategy == com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.TRAVERSE_ALL_CHILDREN) {
                    if (this.getHighSpeedVideoFpsRangesFor.isOptionSelector((android.view.ViewGroup) p0)) {
                        linkedList2 = linkedList4;
                        list = mappedWireframes;
                        highSpeedVideoFpsRangesFor = com.datadog.android.sessionreplay.recorder.MappingContext.copy$default(highSpeedVideoFpsRangesFor, null, null, null, null, null, true, null, 95, null);
                    } else {
                        linkedList2 = linkedList4;
                        list = mappedWireframes;
                    }
                    java.util.LinkedList<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> linkedList5 = new java.util.LinkedList<>(p2);
                    linkedList5.addAll(list);
                    int childCount = ((android.view.ViewGroup) p0).getChildCount();
                    int i = 0;
                    while (i < childCount) {
                        android.view.View childAt = ((android.view.ViewGroup) p0).getChildAt(i);
                        if (childAt != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childAt, "");
                            com.datadog.android.sessionreplay.internal.recorder.Node highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(childAt, highSpeedVideoFpsRangesFor, linkedList5, p3);
                            if (highSpeedVideoFpsRanges != null) {
                                linkedList3 = linkedList2;
                                linkedList3.add(highSpeedVideoFpsRanges);
                                i++;
                                linkedList2 = linkedList3;
                            }
                        }
                        linkedList3 = linkedList2;
                        i++;
                        linkedList2 = linkedList3;
                    }
                    linkedList = linkedList2;
                } else {
                    linkedList = linkedList4;
                    list = mappedWireframes;
                }
                return new com.datadog.android.sessionreplay.internal.recorder.Node(list, linkedList, p2);
            }
            startSpan.stop();
            return null;
        } finally {
            startSpan.stop();
        }
    }

    private final com.datadog.android.sessionreplay.recorder.MappingContext getHighSpeedVideoFpsRangesFor(android.view.View p0, com.datadog.android.sessionreplay.recorder.MappingContext p1) {
        com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy;
        com.datadog.android.sessionreplay.TextAndInputPrivacy textAndInputPrivacy;
        try {
            java.lang.Object tag = p0.getTag(com.datadog.android.sessionreplay.R.id.datadog_image_privacy);
            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            if (str == null) {
                imagePrivacy = p1.getImagePrivacy();
            } else {
                imagePrivacy = com.datadog.android.sessionreplay.ImagePrivacy.valueOf(str);
            }
        } catch (java.lang.IllegalArgumentException e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
            imagePrivacy = p1.getImagePrivacy();
        }
        com.datadog.android.sessionreplay.ImagePrivacy imagePrivacy2 = imagePrivacy;
        try {
            java.lang.Object tag2 = p0.getTag(com.datadog.android.sessionreplay.R.id.datadog_text_and_input_privacy);
            java.lang.String str2 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
            if (str2 == null) {
                textAndInputPrivacy = p1.getTextAndInputPrivacy();
            } else {
                textAndInputPrivacy = com.datadog.android.sessionreplay.TextAndInputPrivacy.valueOf(str2);
            }
        } catch (java.lang.IllegalArgumentException e2) {
            getHighResolutionOutputSizeshNQ4ISI(e2);
            textAndInputPrivacy = p1.getTextAndInputPrivacy();
        }
        return com.datadog.android.sessionreplay.recorder.MappingContext.copy$default(p1, null, null, textAndInputPrivacy, imagePrivacy2, null, false, null, 115, null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Exception p0) {
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer$logInvalidPrivacyLevelError$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer.INVALID_PRIVACY_LEVEL_ERROR;
            }
        }, (java.lang.Throwable) p0, false, (java.util.Map) null, 48, (java.lang.Object) null);
    }
}
