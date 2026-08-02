package androidx.camera.camera2.pipe.graph;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B#\b\u0002\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "Landroidx/camera/camera2/pipe/CaptureSequence;", "p0", "<init>", "(Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;)V", "", "abortCaptures$camera_camera2_pipe", "()V", "stopRepeating$camera_camera2_pipe", "shutdown$camera_camera2_pipe", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isRepeating", "", "Landroidx/camera/camera2/pipe/Request;", "requests", "", "defaultParameters", "graphParameters", "requiredParameters", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "submit$camera_camera2_pipe", "(ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "", "Ljava/util/List;", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor$activeBurstListener$1;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor$activeBurstListener$1;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GraphRequestProcessor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.graph.GraphRequestProcessor.Companion INSTANCE = new androidx.camera.camera2.pipe.graph.GraphRequestProcessor.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1 getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.CaptureSequence<?>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.CaptureSequenceProcessor<java.lang.Object, androidx.camera.camera2.pipe.CaptureSequence<java.lang.Object>> getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1] */
    private GraphRequestProcessor(androidx.camera.camera2.pipe.CaptureSequenceProcessor<? extends java.lang.Object, androidx.camera.camera2.pipe.CaptureSequence<java.lang.Object>> captureSequenceProcessor) {
        this.getHighSpeedVideoSizes = captureSequenceProcessor;
        this.Camera2StreamConfigurationMap = androidx.camera.camera2.pipe.graph.GraphRequestProcessorKt.getGraphRequestProcessorIds().incrementAndGet();
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener() { // from class: androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1
            @Override // androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener
            public final void onCaptureSequenceComplete(androidx.camera.camera2.pipe.CaptureSequence<?> captureSequence) {
                java.util.List list;
                java.util.List list2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequence, "");
                if (captureSequence.getRepeating()) {
                    return;
                }
                list = androidx.camera.camera2.pipe.graph.GraphRequestProcessor.this.getHighSpeedVideoFpsRangesFor;
                androidx.camera.camera2.pipe.graph.GraphRequestProcessor graphRequestProcessor = androidx.camera.camera2.pipe.graph.GraphRequestProcessor.this;
                synchronized (list) {
                    list2 = graphRequestProcessor.getHighSpeedVideoFpsRangesFor;
                    list2.remove(captureSequence);
                }
            }
        };
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;", "captureSequenceProcessor", "Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;", "from", "(Landroidx/camera/camera2/pipe/CaptureSequenceProcessor;)Landroidx/camera/camera2/pipe/graph/GraphRequestProcessor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.pipe.graph.GraphRequestProcessor from(androidx.camera.camera2.pipe.CaptureSequenceProcessor<?, ?> captureSequenceProcessor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequenceProcessor, "");
            return new androidx.camera.camera2.pipe.graph.GraphRequestProcessor(captureSequenceProcessor, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void abortCaptures$camera_camera2_pipe() {
        java.util.List<androidx.camera.camera2.pipe.CaptureSequence> list;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRangesFor.clear();
        }
        for (androidx.camera.camera2.pipe.CaptureSequence captureSequence : list) {
            androidx.camera.camera2.pipe.CaptureSequences captureSequences = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.beginSection("InvokeInternalListeners");
            int size = captureSequence.getCaptureMetadataList().size();
            for (int i = 0; i < size; i++) {
                androidx.camera.camera2.pipe.RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i);
                int size2 = captureSequence.getListeners().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    captureSequence.getListeners().get(i2).onAborted(requestMetadata.getRequest());
                }
            }
            androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.endSection();
            androidx.camera.camera2.pipe.core.Debug debug3 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.beginSection("InvokeRequestListeners");
            int size3 = captureSequence.getCaptureMetadataList().size();
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.camera.camera2.pipe.RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i3);
                int size4 = requestMetadata2.getRequest().getListeners().size();
                for (int i4 = 0; i4 < size4; i4++) {
                    requestMetadata2.getRequest().getListeners().get(i4).onAborted(requestMetadata2.getRequest());
                }
            }
            androidx.camera.camera2.pipe.core.Debug debug4 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.endSection();
        }
        this.getHighSpeedVideoSizes.abortCaptures();
    }

    public final void stopRepeating$camera_camera2_pipe() {
        this.getHighSpeedVideoSizes.stopRepeating();
    }

    public final java.lang.Object shutdown$camera_camera2_pipe(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
            java.lang.Object shutdown = this.getHighSpeedVideoSizes.shutdown(continuation);
            return shutdown == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? shutdown : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final boolean submit$camera_camera2_pipe(boolean isRepeating, java.util.List<androidx.camera.camera2.pipe.Request> requests, java.util.Map<?, ? extends java.lang.Object> defaultParameters, java.util.Map<?, ? extends java.lang.Object> graphParameters, java.util.Map<?, ? extends java.lang.Object> requiredParameters, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> listeners) {
        boolean z;
        androidx.camera.camera2.pipe.media.ImageWrapper image;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeners, "");
        if (this.getHighSpeedVideoFpsRanges.getValue()) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                java.util.Objects.toString(requests);
                toString();
            }
            return false;
        }
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        try {
            android.os.Trace.beginSection("CXCP#buildCaptureSequence");
            androidx.camera.camera2.pipe.CaptureSequence<?> build = this.getHighSpeedVideoSizes.build(isRepeating, requests, defaultParameters, graphParameters, requiredParameters, this.getHighResolutionOutputSizeshNQ4ISI, listeners);
            android.os.Trace.endSection();
            boolean z2 = true;
            if (build == null) {
                java.util.List<androidx.camera.camera2.pipe.Request> list = requests;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((androidx.camera.camera2.pipe.Request) it.next()).getInputRequest() != null) {
                            for (androidx.camera.camera2.pipe.Request request : requests) {
                                androidx.camera.camera2.pipe.InputRequest inputRequest = request.getInputRequest();
                                if (inputRequest != null && (image = inputRequest.getImage()) != null) {
                                    image.close();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                                java.util.Iterator<androidx.camera.camera2.pipe.Request.Listener> it2 = request.getListeners().iterator();
                                while (it2.hasNext()) {
                                    it2.next().onAborted(request);
                                }
                            }
                            return true;
                        }
                    }
                }
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(requests);
                    toString();
                }
                return false;
            }
            if (this.getHighSpeedVideoFpsRanges.getValue()) {
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(requests);
                    toString();
                }
                return false;
            }
            if (!build.getRepeating()) {
                synchronized (this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoFpsRangesFor.add(build);
                }
            }
            try {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                androidx.camera.camera2.pipe.CaptureSequences captureSequences = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                android.os.Trace.beginSection("InvokeInternalListeners");
                int size = build.getCaptureMetadataList().size();
                for (int i = 0; i < size; i++) {
                    androidx.camera.camera2.pipe.RequestMetadata requestMetadata = build.getCaptureMetadataList().get(i);
                    int size2 = build.getListeners().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        build.getListeners().get(i2).onRequestSequenceCreated(requestMetadata);
                    }
                }
                androidx.camera.camera2.pipe.core.Debug debug3 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                android.os.Trace.endSection();
                androidx.camera.camera2.pipe.core.Debug debug4 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                android.os.Trace.beginSection("InvokeRequestListeners");
                int size3 = build.getCaptureMetadataList().size();
                for (int i3 = 0; i3 < size3; i3++) {
                    androidx.camera.camera2.pipe.RequestMetadata requestMetadata2 = build.getCaptureMetadataList().get(i3);
                    int size4 = requestMetadata2.getRequest().getListeners().size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        requestMetadata2.getRequest().getListeners().get(i4).onRequestSequenceCreated(requestMetadata2);
                    }
                }
                androidx.camera.camera2.pipe.core.Debug debug5 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                synchronized (build) {
                    if (this.getHighSpeedVideoFpsRanges.getValue()) {
                        if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                            java.util.Objects.toString(build);
                            toString();
                        }
                        if (!build.getRepeating()) {
                            synchronized (this.getHighSpeedVideoFpsRangesFor) {
                                this.getHighSpeedVideoFpsRangesFor.remove(build);
                            }
                            androidx.camera.camera2.pipe.CaptureSequences captureSequences2 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                            androidx.camera.camera2.pipe.core.Debug debug6 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.beginSection("InvokeInternalListeners");
                            int size5 = build.getCaptureMetadataList().size();
                            for (int i5 = 0; i5 < size5; i5++) {
                                androidx.camera.camera2.pipe.RequestMetadata requestMetadata3 = build.getCaptureMetadataList().get(i5);
                                int size6 = build.getListeners().size();
                                for (int i6 = 0; i6 < size6; i6++) {
                                    build.getListeners().get(i6).onAborted(requestMetadata3.getRequest());
                                }
                            }
                            androidx.camera.camera2.pipe.core.Debug debug7 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.endSection();
                            androidx.camera.camera2.pipe.core.Debug debug8 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.beginSection("InvokeRequestListeners");
                            int size7 = build.getCaptureMetadataList().size();
                            for (int i7 = 0; i7 < size7; i7++) {
                                androidx.camera.camera2.pipe.RequestMetadata requestMetadata4 = build.getCaptureMetadataList().get(i7);
                                int size8 = requestMetadata4.getRequest().getListeners().size();
                                for (int i8 = 0; i8 < size8; i8++) {
                                    requestMetadata4.getRequest().getListeners().get(i8).onAborted(requestMetadata4.getRequest());
                                }
                            }
                            androidx.camera.camera2.pipe.core.Debug debug9 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        }
                        return false;
                    }
                    androidx.camera.camera2.pipe.core.Debug debug10 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    try {
                        android.os.Trace.beginSection("CXCP#submit(CaptureSequence)");
                        java.lang.Integer submit = this.getHighSpeedVideoSizes.submit(build);
                        int intValue = submit != null ? submit.intValue() : -1;
                        build.setSequenceNumber(intValue);
                        if (intValue != -1) {
                            androidx.camera.camera2.pipe.CaptureSequences captureSequences3 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                            androidx.camera.camera2.pipe.core.Debug debug11 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.beginSection("InvokeInternalListeners");
                            int size9 = build.getCaptureMetadataList().size();
                            for (int i9 = 0; i9 < size9; i9++) {
                                androidx.camera.camera2.pipe.RequestMetadata requestMetadata5 = build.getCaptureMetadataList().get(i9);
                                int size10 = build.getListeners().size();
                                for (int i10 = 0; i10 < size10; i10++) {
                                    build.getListeners().get(i10).onRequestSequenceSubmitted(requestMetadata5);
                                }
                            }
                            androidx.camera.camera2.pipe.core.Debug debug12 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.endSection();
                            androidx.camera.camera2.pipe.core.Debug debug13 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            android.os.Trace.beginSection("InvokeRequestListeners");
                            int size11 = build.getCaptureMetadataList().size();
                            for (int i11 = 0; i11 < size11; i11++) {
                                androidx.camera.camera2.pipe.RequestMetadata requestMetadata6 = build.getCaptureMetadataList().get(i11);
                                int size12 = requestMetadata6.getRequest().getListeners().size();
                                for (int i12 = 0; i12 < size12; i12++) {
                                    requestMetadata6.getRequest().getListeners().get(i12).onRequestSequenceSubmitted(requestMetadata6);
                                }
                            }
                            androidx.camera.camera2.pipe.core.Debug debug14 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                            try {
                                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                                z = true;
                            } catch (android.hardware.camera2.CameraAccessException | androidx.camera.camera2.pipe.compat.ObjectUnavailableException unused) {
                                return false;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (!z2 && !build.getRepeating()) {
                                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                                        this.getHighSpeedVideoFpsRangesFor.remove(build);
                                    }
                                    androidx.camera.camera2.pipe.CaptureSequences captureSequences4 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                                    androidx.camera.camera2.pipe.core.Debug debug15 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                                    android.os.Trace.beginSection("InvokeInternalListeners");
                                    int size13 = build.getCaptureMetadataList().size();
                                    for (int i13 = 0; i13 < size13; i13++) {
                                        androidx.camera.camera2.pipe.RequestMetadata requestMetadata7 = build.getCaptureMetadataList().get(i13);
                                        int size14 = build.getListeners().size();
                                        for (int i14 = 0; i14 < size14; i14++) {
                                            build.getListeners().get(i14).onAborted(requestMetadata7.getRequest());
                                        }
                                    }
                                    androidx.camera.camera2.pipe.core.Debug debug16 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                                    android.os.Trace.endSection();
                                    androidx.camera.camera2.pipe.core.Debug debug17 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                                    android.os.Trace.beginSection("InvokeRequestListeners");
                                    int size15 = build.getCaptureMetadataList().size();
                                    for (int i15 = 0; i15 < size15; i15++) {
                                        androidx.camera.camera2.pipe.RequestMetadata requestMetadata8 = build.getCaptureMetadataList().get(i15);
                                        int size16 = requestMetadata8.getRequest().getListeners().size();
                                        for (int i16 = 0; i16 < size16; i16++) {
                                            requestMetadata8.getRequest().getListeners().get(i16).onAborted(requestMetadata8.getRequest());
                                        }
                                    }
                                    androidx.camera.camera2.pipe.core.Debug debug18 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                                }
                                throw th;
                            }
                        } else {
                            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                                java.util.Objects.toString(build);
                                toString();
                            }
                            z = false;
                            z2 = false;
                        }
                        if (z2 || build.getRepeating()) {
                            return z;
                        }
                        synchronized (this.getHighSpeedVideoFpsRangesFor) {
                            this.getHighSpeedVideoFpsRangesFor.remove(build);
                        }
                        androidx.camera.camera2.pipe.CaptureSequences captureSequences5 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                        androidx.camera.camera2.pipe.core.Debug debug19 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeInternalListeners");
                        int size17 = build.getCaptureMetadataList().size();
                        for (int i17 = 0; i17 < size17; i17++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata9 = build.getCaptureMetadataList().get(i17);
                            int size18 = build.getListeners().size();
                            for (int i18 = 0; i18 < size18; i18++) {
                                build.getListeners().get(i18).onAborted(requestMetadata9.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug20 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.endSection();
                        androidx.camera.camera2.pipe.core.Debug debug21 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeRequestListeners");
                        int size19 = build.getCaptureMetadataList().size();
                        for (int i19 = 0; i19 < size19; i19++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata10 = build.getCaptureMetadataList().get(i19);
                            int size20 = requestMetadata10.getRequest().getListeners().size();
                            for (int i20 = 0; i20 < size20; i20++) {
                                requestMetadata10.getRequest().getListeners().get(i20).onAborted(requestMetadata10.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug22 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        return z;
                    } finally {
                    }
                }
            } catch (android.hardware.camera2.CameraAccessException unused2) {
                if (!build.getRepeating()) {
                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor.remove(build);
                        androidx.camera.camera2.pipe.CaptureSequences captureSequences6 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                        androidx.camera.camera2.pipe.core.Debug debug23 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeInternalListeners");
                        int size21 = build.getCaptureMetadataList().size();
                        for (int i21 = 0; i21 < size21; i21++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata11 = build.getCaptureMetadataList().get(i21);
                            int size22 = build.getListeners().size();
                            for (int i22 = 0; i22 < size22; i22++) {
                                build.getListeners().get(i22).onAborted(requestMetadata11.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug24 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.endSection();
                        androidx.camera.camera2.pipe.core.Debug debug25 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeRequestListeners");
                        int size23 = build.getCaptureMetadataList().size();
                        for (int i23 = 0; i23 < size23; i23++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata12 = build.getCaptureMetadataList().get(i23);
                            int size24 = requestMetadata12.getRequest().getListeners().size();
                            for (int i24 = 0; i24 < size24; i24++) {
                                requestMetadata12.getRequest().getListeners().get(i24).onAborted(requestMetadata12.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug26 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    }
                }
            } catch (androidx.camera.camera2.pipe.compat.ObjectUnavailableException unused3) {
                if (!build.getRepeating()) {
                    synchronized (this.getHighSpeedVideoFpsRangesFor) {
                        this.getHighSpeedVideoFpsRangesFor.remove(build);
                        androidx.camera.camera2.pipe.CaptureSequences captureSequences7 = androidx.camera.camera2.pipe.CaptureSequences.INSTANCE;
                        androidx.camera.camera2.pipe.core.Debug debug27 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeInternalListeners");
                        int size25 = build.getCaptureMetadataList().size();
                        for (int i25 = 0; i25 < size25; i25++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata13 = build.getCaptureMetadataList().get(i25);
                            int size26 = build.getListeners().size();
                            for (int i26 = 0; i26 < size26; i26++) {
                                build.getListeners().get(i26).onAborted(requestMetadata13.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug28 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.endSection();
                        androidx.camera.camera2.pipe.core.Debug debug29 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                        android.os.Trace.beginSection("InvokeRequestListeners");
                        int size27 = build.getCaptureMetadataList().size();
                        for (int i27 = 0; i27 < size27; i27++) {
                            androidx.camera.camera2.pipe.RequestMetadata requestMetadata14 = build.getCaptureMetadataList().get(i27);
                            int size28 = requestMetadata14.getRequest().getListeners().size();
                            for (int i28 = 0; i28 < size28; i28++) {
                                requestMetadata14.getRequest().getListeners().get(i28).onAborted(requestMetadata14.getRequest());
                            }
                        }
                        androidx.camera.camera2.pipe.core.Debug debug30 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z2 = false;
            }
        } finally {
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphRequestProcessor-");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    public /* synthetic */ GraphRequestProcessor(androidx.camera.camera2.pipe.CaptureSequenceProcessor captureSequenceProcessor, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(captureSequenceProcessor);
    }
}
