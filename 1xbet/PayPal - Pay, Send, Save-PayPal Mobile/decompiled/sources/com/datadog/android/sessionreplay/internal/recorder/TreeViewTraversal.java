package com.datadog.android.sessionreplay.internal.recorder;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&BM\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal;", "", "", "Lcom/datadog/android/sessionreplay/MapperTypeWrapper;", "mappers", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "Landroid/view/View;", "defaultViewMapper", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/HiddenViewMapper;", "hiddenViewMapper", "decorViewMapper", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewUtilsInternal;", "viewUtilsInternal", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;Lcom/datadog/android/sessionreplay/internal/recorder/mapper/HiddenViewMapper;Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;Lcom/datadog/android/sessionreplay/internal/recorder/ViewUtilsInternal;Lcom/datadog/android/api/InternalLogger;)V", "view", "Lcom/datadog/android/sessionreplay/recorder/MappingContext;", "mappingContext", "Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;", "recordedDataQueueRefs", "Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal$TraversedTreeView;", "traverse", "(Landroid/view/View;Lcom/datadog/android/sessionreplay/recorder/MappingContext;Lcom/datadog/android/sessionreplay/internal/async/RecordedDataQueueRefs;)Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal$TraversedTreeView;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/sessionreplay/recorder/mapper/WireframeMapper;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/mapper/HiddenViewMapper;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/List;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/ViewUtilsInternal;", "getOutputMinFrameDuration", "Companion", "TraversedTreeView"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TreeViewTraversal {
    public static final java.lang.String METHOD_CALL_MAP_PREFIX = "Map with";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.mapper.HiddenViewMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.datadog.android.sessionreplay.MapperTypeWrapper<?>> getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> getHighSpeedVideoFpsRangesFor;
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    public TreeViewTraversal(java.util.List<? extends com.datadog.android.sessionreplay.MapperTypeWrapper<?>> list, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<? super android.view.View> wireframeMapper, com.datadog.android.sessionreplay.internal.recorder.mapper.HiddenViewMapper hiddenViewMapper, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<? super android.view.View> wireframeMapper2, com.datadog.android.sessionreplay.internal.recorder.ViewUtilsInternal viewUtilsInternal, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hiddenViewMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wireframeMapper2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewUtilsInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRanges = wireframeMapper;
        this.Camera2StreamConfigurationMap = hiddenViewMapper;
        this.getHighSpeedVideoFpsRangesFor = wireframeMapper2;
        this.getOutputMinFrameDuration = viewUtilsInternal;
        this.getHighSpeedVideoSizes = internalLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View>] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, com.datadog.android.sessionreplay.internal.recorder.mapper.HiddenViewMapper] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View>] */
    public final com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView traverse(final android.view.View view, final com.datadog.android.sessionreplay.recorder.MappingContext mappingContext, com.datadog.android.sessionreplay.internal.async.RecordedDataQueueRefs recordedDataQueueRefs) {
        java.lang.Object obj;
        com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy traversalStrategy;
        com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback;
        com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy traversalStrategy2;
        com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappingContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordedDataQueueRefs, "");
        if (this.getOutputMinFrameDuration.isNotVisible$dd_sdk_android_session_replay_release(view) || this.getOutputMinFrameDuration.isSystemNoise$dd_sdk_android_session_replay_release(view) || this.getOutputMinFrameDuration.isOnSecondaryDisplay$dd_sdk_android_session_replay_release(view)) {
            return new com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView(kotlin.collections.CollectionsKt.emptyList(), com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_DROP_NODE);
        }
        com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback noOpAsyncJobStatusCallback = new com.datadog.android.sessionreplay.utils.NoOpAsyncJobStatusCallback();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.datadog.android.sessionreplay.MapperTypeWrapper) obj).supportsView(view)) {
                break;
            }
        }
        com.datadog.android.sessionreplay.MapperTypeWrapper mapperTypeWrapper = (com.datadog.android.sessionreplay.MapperTypeWrapper) obj;
        objectRef.element = mapperTypeWrapper != null ? mapperTypeWrapper.getUnsafeMapper() : 0;
        java.lang.Object tag = view.getTag(com.datadog.android.sessionreplay.R.id.datadog_touch_privacy);
        if (tag != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            android.graphics.Rect rect = new android.graphics.Rect(i - view.getPaddingLeft(), i2 - view.getPaddingTop(), i + view.getWidth() + view.getPaddingRight(), i2 + view.getHeight() + view.getPaddingBottom());
            try {
                java.lang.String obj2 = tag.toString();
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = obj2.toUpperCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                mappingContext.getTouchPrivacyManager().addTouchOverrideArea(rect, com.datadog.android.sessionreplay.TouchPrivacy.valueOf(upperCase));
            } catch (java.lang.IllegalArgumentException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal$updateTouchOverrideAreas$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.sessionreplay.internal.recorder.SnapshotProducer.INVALID_PRIVACY_LEVEL_ERROR;
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(view.getTag(com.datadog.android.sessionreplay.R.id.datadog_hidden), java.lang.Boolean.TRUE)) {
            traversalStrategy = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_RETURN_NODE;
            objectRef.element = this.Camera2StreamConfigurationMap;
            asyncJobStatusCallback = noOpAsyncJobStatusCallback;
        } else {
            if (objectRef.element != 0) {
                com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback queueStatusCallback = new com.datadog.android.sessionreplay.internal.recorder.mapper.QueueStatusCallback(recordedDataQueueRefs);
                if (objectRef.element instanceof com.datadog.android.sessionreplay.recorder.mapper.TraverseAllChildrenMapper) {
                    traversalStrategy2 = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.TRAVERSE_ALL_CHILDREN;
                } else {
                    traversalStrategy2 = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_RETURN_NODE;
                }
                asyncJobStatusCallback2 = queueStatusCallback;
                traversalStrategy = traversalStrategy2;
                final com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback3 = asyncJobStatusCallback2;
                return new com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView((java.util.List) com.datadog.android.api.feature.FeatureScopeExtKt.measureMethodCallPerf(this.getHighSpeedVideoSizes, getClass(), "Map with ".concat(java.lang.String.valueOf(objectRef.element.getClass().getSimpleName())), com.datadog.android.core.metrics.MethodCallSamplingRate.RARE.getRate(), new kotlin.jvm.functions.Function0<java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe>>() { // from class: com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal$traverse$resolvedWireframes$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> invoke() {
                        com.datadog.android.api.InternalLogger internalLogger;
                        com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> wireframeMapper = objectRef.element;
                        android.view.View view2 = view;
                        com.datadog.android.sessionreplay.recorder.MappingContext mappingContext2 = mappingContext;
                        com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback4 = asyncJobStatusCallback3;
                        internalLogger = this.getHighSpeedVideoSizes;
                        return wireframeMapper.map(view2, mappingContext2, asyncJobStatusCallback4, internalLogger);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }), traversalStrategy);
            }
            if (view.getParent() == null || (!android.view.View.class.isAssignableFrom(r0.getClass()))) {
                traversalStrategy = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.TRAVERSE_ALL_CHILDREN;
                objectRef.element = this.getHighSpeedVideoFpsRangesFor;
                asyncJobStatusCallback = noOpAsyncJobStatusCallback;
            } else if (view instanceof android.view.ViewGroup) {
                traversalStrategy = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.TRAVERSE_ALL_CHILDREN;
                objectRef.element = this.getHighSpeedVideoFpsRanges;
                asyncJobStatusCallback = noOpAsyncJobStatusCallback;
            } else {
                traversalStrategy = com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy.STOP_AND_RETURN_NODE;
                objectRef.element = this.getHighSpeedVideoFpsRanges;
                asyncJobStatusCallback = noOpAsyncJobStatusCallback;
                final java.lang.String canonicalName = view.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = view.getClass().getName();
                }
                this.getHighSpeedVideoSizes.log(com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.TELEMETRY, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal$traverse$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "No mapper found for view ".concat(java.lang.String.valueOf(canonicalName));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, true, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("replay.widget.type", canonicalName)));
            }
        }
        asyncJobStatusCallback2 = asyncJobStatusCallback;
        final com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback32 = asyncJobStatusCallback2;
        return new com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView((java.util.List) com.datadog.android.api.feature.FeatureScopeExtKt.measureMethodCallPerf(this.getHighSpeedVideoSizes, getClass(), "Map with ".concat(java.lang.String.valueOf(objectRef.element.getClass().getSimpleName())), com.datadog.android.core.metrics.MethodCallSamplingRate.RARE.getRate(), new kotlin.jvm.functions.Function0<java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe>>() { // from class: com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal$traverse$resolvedWireframes$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> invoke() {
                com.datadog.android.api.InternalLogger internalLogger;
                com.datadog.android.sessionreplay.recorder.mapper.WireframeMapper<android.view.View> wireframeMapper = objectRef.element;
                android.view.View view2 = view;
                com.datadog.android.sessionreplay.recorder.MappingContext mappingContext2 = mappingContext;
                com.datadog.android.sessionreplay.utils.AsyncJobStatusCallback asyncJobStatusCallback4 = asyncJobStatusCallback32;
                internalLogger = this.getHighSpeedVideoSizes;
                return wireframeMapper.map(view2, mappingContext2, asyncJobStatusCallback4, internalLogger);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }), traversalStrategy);
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal$TraversedTreeView;", "", "", "Lcom/datadog/android/sessionreplay/model/MobileSegment$Wireframe;", "mappedWireframes", "Lcom/datadog/android/sessionreplay/internal/recorder/TraversalStrategy;", "nextActionStrategy", "<init>", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/internal/recorder/TraversalStrategy;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/datadog/android/sessionreplay/internal/recorder/TraversalStrategy;", "copy", "(Ljava/util/List;Lcom/datadog/android/sessionreplay/internal/recorder/TraversalStrategy;)Lcom/datadog/android/sessionreplay/internal/recorder/TreeViewTraversal$TraversedTreeView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMappedWireframes", "Lcom/datadog/android/sessionreplay/internal/recorder/TraversalStrategy;", "getNextActionStrategy"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TraversedTreeView {
        private final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> mappedWireframes;
        private final com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy nextActionStrategy;

        /* JADX WARN: Multi-variable type inference failed */
        public TraversedTreeView(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list, com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy traversalStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traversalStrategy, "");
            this.mappedWireframes = list;
            this.nextActionStrategy = traversalStrategy;
        }

        public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> getMappedWireframes() {
            return this.mappedWireframes;
        }

        public final com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy getNextActionStrategy() {
            return this.nextActionStrategy;
        }

        public final java.lang.String toString() {
            java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> list = this.mappedWireframes;
            com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy traversalStrategy = this.nextActionStrategy;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TraversedTreeView(mappedWireframes=");
            sb.append(list);
            sb.append(", nextActionStrategy=");
            sb.append(traversalStrategy);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.mappedWireframes.hashCode() * 31) + this.nextActionStrategy.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView)) {
                return false;
            }
            com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView traversedTreeView = (com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.mappedWireframes, traversedTreeView.mappedWireframes) && this.nextActionStrategy == traversedTreeView.nextActionStrategy;
        }

        public final com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView copy(java.util.List<? extends com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> mappedWireframes, com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy nextActionStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mappedWireframes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextActionStrategy, "");
            return new com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView(mappedWireframes, nextActionStrategy);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy getNextActionStrategy() {
            return this.nextActionStrategy;
        }

        public final java.util.List<com.datadog.android.sessionreplay.model.MobileSegment.Wireframe> component1() {
            return this.mappedWireframes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView copy$default(com.datadog.android.sessionreplay.internal.recorder.TreeViewTraversal.TraversedTreeView traversedTreeView, java.util.List list, com.datadog.android.sessionreplay.internal.recorder.TraversalStrategy traversalStrategy, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = traversedTreeView.mappedWireframes;
            }
            if ((i & 2) != 0) {
                traversalStrategy = traversedTreeView.nextActionStrategy;
            }
            return traversedTreeView.copy(list, traversalStrategy);
        }
    }
}
