package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 <2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002;<B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J/\u0010-\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J'\u00102\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u00103\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006="}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/camera/camera2/pipe/Request$Listener;", "streamGraphImpl", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "isCameraTimebaseRealtime", "", "realtimeToMonotonicOffsetNs", "", "<init>", "(Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;ZJ)V", "frameInfoDistributor", "Landroidx/camera/camera2/pipe/internal/OutputDistributor;", "Landroidx/camera/camera2/pipe/FrameInfo;", "imageDistributors", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroidx/camera/camera2/pipe/OutputId;", "Landroidx/camera/camera2/pipe/media/OutputImage;", "imageStreams", "", "Landroidx/camera/camera2/pipe/CameraStream;", "frameStartedListener", "Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "getFrameStartedListener", "()Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "setFrameStartedListener", "(Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;)V", "onStarted", "", "requestMetadata", "Landroidx/camera/camera2/pipe/RequestMetadata;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "timestamp", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "onStarted-uGKBvU4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JJ)V", "onComplete", "result", "onComplete-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onBufferLost", "streamId", "outputId", "onBufferLost-iiEMlm4", "(Landroidx/camera/camera2/pipe/RequestMetadata;JII)V", "onFailed", "requestFailure", "Landroidx/camera/camera2/pipe/RequestFailure;", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "onAborted", "request", "Landroidx/camera/camera2/pipe/Request;", "close", "FrameStartedListener", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameDistributor implements java.lang.AutoCloseable, androidx.camera.camera2.pipe.Request.Listener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.internal.FrameDistributor.Companion INSTANCE = new androidx.camera.camera2.pipe.internal.FrameDistributor.Companion(null);
    private final java.util.Map<androidx.camera.camera2.pipe.StreamId, java.util.Map<androidx.camera.camera2.pipe.OutputId, androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>>> Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.internal.FrameCaptureQueue getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.FrameInfo> getHighSpeedVideoFpsRanges;
    private androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener getHighSpeedVideoFpsRangesFor;
    private final java.util.Set<androidx.camera.camera2.pipe.CameraStream> getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor$FrameStartedListener;", "", "Landroidx/camera/camera2/pipe/FrameReference;", "frameReference", "", "onFrameStarted", "(Landroidx/camera/camera2/pipe/FrameReference;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FrameStartedListener {
        void onFrameStarted(androidx.camera.camera2.pipe.FrameReference frameReference);
    }

    public FrameDistributor(androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.internal.FrameCaptureQueue frameCaptureQueue, boolean z, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameCaptureQueue, "");
        this.getOutputMinFrameDuration = streamGraphImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = frameCaptureQueue;
        this.getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.internal.OutputDistributor<>(0, androidx.camera.camera2.pipe.media.NoOpFinalizer.INSTANCE, androidx.camera.camera2.pipe.internal.OutputMatcher.INSTANCE.getEXACT(), 1, null);
        java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.media.ImageSource> imageSourceMap$camera_camera2_pipe = streamGraphImpl.getImageSourceMap$camera_camera2_pipe();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(imageSourceMap$camera_camera2_pipe.size()));
        java.util.Iterator<T> it = imageSourceMap$camera_camera2_pipe.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            int m761unboximpl = ((androidx.camera.camera2.pipe.StreamId) entry.getKey()).m761unboximpl();
            final androidx.camera.camera2.pipe.media.ImageSource imageSource = (androidx.camera.camera2.pipe.media.ImageSource) entry.getValue();
            final androidx.camera.camera2.pipe.CameraStream cameraStream = this.getOutputMinFrameDuration.m748getaKI5c8E(m761unboximpl);
            if (cameraStream == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.camera2.pipe.CameraStream.Config m939getCameraStreamConfigaKI5c8E = this.getOutputMinFrameDuration.m939getCameraStreamConfigaKI5c8E(m761unboximpl);
            kotlin.jvm.internal.Intrinsics.checkNotNull(m939getCameraStreamConfigaKI5c8E);
            androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig = m939getCameraStreamConfigaKI5c8E.getImageSourceConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageSourceConfig);
            androidx.camera.camera2.pipe.internal.OutputMatcher m959access$selectTimestampMatcher5y4XNsE = androidx.camera.camera2.pipe.internal.FrameDistributor.Companion.m959access$selectTimestampMatcher5y4XNsE(INSTANCE, m761unboximpl, m939getCameraStreamConfigaKI5c8E, imageSourceConfig, z, j);
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            for (androidx.camera.camera2.pipe.OutputStream outputStream : cameraStream.getOutputs()) {
                createMapBuilder.put(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputStream.getId()), new androidx.camera.camera2.pipe.internal.OutputDistributor(0, androidx.camera.camera2.pipe.media.ClosingFinalizer.INSTANCE, m959access$selectTimestampMatcher5y4XNsE, 1, null));
            }
            final java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            imageSource.setImageListener(new androidx.camera.camera2.pipe.media.ImageListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$imageDistributors$1$1
                @Override // androidx.camera.camera2.pipe.media.ImageListener
                /* renamed from: onImage-2cgRUCs, reason: not valid java name */
                public final void mo960onImage2cgRUCs(int i, int i2, long j2, androidx.camera.camera2.pipe.media.ImageWrapper imageWrapper) {
                    androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage> outputDistributor = build.get(androidx.camera.camera2.pipe.OutputId.m536boximpl(i2));
                    androidx.camera.camera2.pipe.media.ImageSource imageSource2 = imageSource;
                    if (outputDistributor != null) {
                        androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage> outputDistributor2 = outputDistributor;
                        if (imageWrapper != null) {
                            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                            outputDistributor2.m977onOutputResultDvZWqE8(j2, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.media.OutputImage.INSTANCE.m1004fromAQuxepk(i, i2, imageWrapper)));
                            return;
                        } else {
                            androidx.camera.camera2.pipe.internal.OutputResult.Companion companion2 = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                            outputDistributor2.m977onOutputResultDvZWqE8(j2, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m552getERROR_OUTPUT_DROPPEDU7r42EA())));
                            return;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Received unexpected images on ");
                    sb.append(imageSource2);
                    sb.append(" from (");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(i));
                    sb.append(", ");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.OutputId.m541toStringimpl(i2));
                    sb.append(')');
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
            });
            imageSource.setExpectedOutputsListener(new androidx.camera.camera2.pipe.media.ExpectedOutputsListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$$ExternalSyntheticLambda0
                @Override // androidx.camera.camera2.pipe.media.ExpectedOutputsListener
                public final void onExpectedOutputs(long j2, java.util.Set set) {
                    androidx.camera.camera2.pipe.internal.FrameDistributor.m958$r8$lambda$vSyT8tKQMfAmHOL7w_2z5D7axg(androidx.camera.camera2.pipe.CameraStream.this, build, j2, set);
                }
            });
            linkedHashMap.put(key, build);
        }
        this.Camera2StreamConfigurationMap = linkedHashMap;
        java.util.Set keySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10));
        java.util.Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            androidx.camera.camera2.pipe.CameraStream cameraStream2 = this.getOutputMinFrameDuration.m748getaKI5c8E(((androidx.camera.camera2.pipe.StreamId) it2.next()).m761unboximpl());
            if (cameraStream2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            arrayList.add(cameraStream2);
        }
        this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toSet(arrayList);
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$$ExternalSyntheticLambda1
            @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
            public final void onFrameStarted(androidx.camera.camera2.pipe.FrameReference frameReference) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            }
        };
    }

    /* renamed from: getFrameStartedListener, reason: from getter */
    public final androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFrameStartedListener(androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener frameStartedListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameStartedListener, "");
        this.getHighSpeedVideoFpsRangesFor = frameStartedListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public final void mo96onStarteduGKBvU4(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, long timestamp) {
        androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl remove;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        androidx.camera.camera2.pipe.internal.FrameState frameState = new androidx.camera.camera2.pipe.internal.FrameState(requestMetadata, frameNumber, timestamp, this.getHighSpeedVideoSizes, null);
        this.getHighSpeedVideoFpsRanges.m978onOutputStartedqGubWw0(frameNumber, timestamp, frameNumber, frameState.getFrameInfoOutput());
        int size = frameState.getImageOutputs().size();
        for (int i = 0; i < size; i++) {
            androidx.camera.camera2.pipe.internal.FrameState.ImageOutput imageOutput = frameState.getImageOutputs().get(i);
            java.util.Map<androidx.camera.camera2.pipe.OutputId, androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> map = this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(imageOutput.getStreamId()));
            if (map == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage> outputDistributor = map.get(androidx.camera.camera2.pipe.OutputId.m536boximpl(imageOutput.getOutputId()));
            if (outputDistributor == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage> outputDistributor2 = outputDistributor;
            outputDistributor2.m978onOutputStartedqGubWw0(frameNumber, timestamp, timestamp, imageOutput);
            if (!requestMetadata.getStreams().keySet().contains(androidx.camera.camera2.pipe.StreamId.m755boximpl(imageOutput.getStreamId()))) {
                outputDistributor2.m976onOutputFailureVw7M1qk(frameState.getFrameNumber());
            }
        }
        androidx.camera.camera2.pipe.internal.FrameImpl frameImpl = new androidx.camera.camera2.pipe.internal.FrameImpl(frameState, null, 2, 0 == true ? 1 : 0);
        this.getHighSpeedVideoFpsRangesFor.onFrameStarted(frameImpl);
        if (!requestMetadata.getRepeating() && (remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(requestMetadata.getRequest())) != null) {
            remove.completeWith(frameImpl);
        } else {
            frameImpl.close();
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public final void mo36onCompleteCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.FrameInfo> outputDistributor = this.getHighSpeedVideoFpsRanges;
        androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
        outputDistributor.m977onOutputResultDvZWqE8(frameNumber, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(result));
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public final void mo92onBufferLostiiEMlm4(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, int streamId, int outputId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        java.util.Map<androidx.camera.camera2.pipe.OutputId, androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> map = this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
        if (map != null) {
            androidx.camera.camera2.pipe.CameraStream.Config m939getCameraStreamConfigaKI5c8E = this.getOutputMinFrameDuration.m939getCameraStreamConfigaKI5c8E(streamId);
            if (m939getCameraStreamConfigaKI5c8E == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig = m939getCameraStreamConfigaKI5c8E.getImageSourceConfig();
            if (imageSourceConfig != null && imageSourceConfig.getEnableConcurrentOutputs()) {
                androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage> outputDistributor = map.get(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputId));
                if (outputDistributor == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                outputDistributor.m976onOutputFailureVw7M1qk(frameNumber);
                return;
            }
            if (!map.containsKey(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputId))) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            java.util.Iterator<androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m976onOutputFailureVw7M1qk(frameNumber);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public final void mo37onFailedCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
        androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.FrameInfo> outputDistributor = this.getHighSpeedVideoFpsRanges;
        androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
        outputDistributor.m977onOutputResultDvZWqE8(frameNumber, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m553getERROR_OUTPUT_FAILEDU7r42EA())));
        if (requestFailure.getWasImageCaptured()) {
            return;
        }
        java.util.Iterator<androidx.camera.camera2.pipe.StreamId> it = requestMetadata.getStreams().keySet().iterator();
        while (it.hasNext()) {
            java.util.Map<androidx.camera.camera2.pipe.OutputId, androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> map = this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(it.next().m761unboximpl()));
            if (map != null) {
                java.util.Iterator<androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    it2.next().m976onOutputFailureVw7M1qk(frameNumber);
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public final void onAborted(androidx.camera.camera2.pipe.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(request);
        if (remove != null) {
            remove.m957completeWithFailuretXNfJfc(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m551getERROR_OUTPUT_ABORTEDU7r42EA());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
        this.getHighSpeedVideoFpsRanges.close();
        java.util.Iterator<java.util.Map<androidx.camera.camera2.pipe.OutputId, androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>>> it = this.Camera2StreamConfigurationMap.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator<androidx.camera.camera2.pipe.internal.OutputDistributor<androidx.camera.camera2.pipe.media.OutputImage>> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/internal/FrameDistributor$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
        
            if (android.os.Build.VERSION.SDK_INT < 33) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
        
            r10 = r9.getOutputs();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if ((r10 instanceof java.util.Collection) == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        
            if (r10.isEmpty() == false) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        
            r10 = r10.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            if (r10.hasNext() == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        
            r11 = ((androidx.camera.camera2.pipe.OutputStream.Config) r10.next()).getTimestampBase();
            r0 = androidx.camera.camera2.pipe.OutputStream.TimestampBase.INSTANCE.m649getTIMESTAMP_BASE_REALTIME6HVI0MA();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
        
            if (r11 != null) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        
            if (androidx.camera.camera2.pipe.OutputStream.TimestampBase.m642equalsimpl0(r11.m645unboximpl(), r0) == false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x010a, code lost:
        
            return androidx.camera.camera2.pipe.internal.OutputMatcher.INSTANCE.getEXACT();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
        
            if (android.os.Build.VERSION.SDK_INT < 33) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
        
            r7 = r9.getOutputs();
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
        
            if ((r7 instanceof java.util.Collection) == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
        
            if (r7.isEmpty() == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
        
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
        
            if (r7 == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
        
            r7 = r7.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
        
            if (r7.hasNext() == false) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
        
            r9 = ((androidx.camera.camera2.pipe.OutputStream.Config) r7.next()).getTimestampBase();
            r10 = androidx.camera.camera2.pipe.OutputStream.TimestampBase.INSTANCE.m650getTIMESTAMP_BASE_SENSOR6HVI0MA();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        
            if (r9 != null) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00fd, code lost:
        
            if (androidx.camera.camera2.pipe.OutputStream.TimestampBase.m642equalsimpl0(r9.m645unboximpl(), r10) == false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
        
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE() == false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
        
            androidx.camera.camera2.pipe.StreamId.m760toStringimpl(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0121, code lost:
        
            return androidx.camera.camera2.pipe.internal.OutputMatcher.Companion.forTimestampsWithOffset$default(androidx.camera.camera2.pipe.internal.OutputMatcher.INSTANCE, r12, 0, 2, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0065, code lost:
        
            if ((r10.getUsageFlags().longValue() & 65536) != 0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x007e, code lost:
        
            if ((r10.getUsageFlags().longValue() & coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES) != 0) goto L33;
         */
        /* renamed from: access$selectTimestampMatcher-5y4XNsE, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ androidx.camera.camera2.pipe.internal.OutputMatcher m959access$selectTimestampMatcher5y4XNsE(androidx.camera.camera2.pipe.internal.FrameDistributor.Companion companion, int i, androidx.camera.camera2.pipe.CameraStream.Config config, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig, boolean z, long j) {
            if (z) {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> outputs = config.getOutputs();
                    if (!(outputs instanceof java.util.Collection) || !outputs.isEmpty()) {
                        for (androidx.camera.camera2.pipe.OutputStream.Config config2 : outputs) {
                            if (config2.getTimestampBase() != null) {
                                androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase = config2.getTimestampBase();
                                int m647getTIMESTAMP_BASE_DEFAULT6HVI0MA = androidx.camera.camera2.pipe.OutputStream.TimestampBase.INSTANCE.m647getTIMESTAMP_BASE_DEFAULT6HVI0MA();
                                if (timestampBase == null || !androidx.camera.camera2.pipe.OutputStream.TimestampBase.m642equalsimpl0(timestampBase.m645unboximpl(), m647getTIMESTAMP_BASE_DEFAULT6HVI0MA)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    if (imageSourceConfig.getUsageFlags() != null) {
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (imageSourceConfig.getUsageFlags() != null) {
                    }
                }
            } else if (android.os.Build.VERSION.SDK_INT >= 33) {
                java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> outputs2 = config.getOutputs();
                if (!(outputs2 instanceof java.util.Collection) || !outputs2.isEmpty()) {
                    java.util.Iterator<T> it = outputs2.iterator();
                    while (it.hasNext()) {
                        androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase2 = ((androidx.camera.camera2.pipe.OutputStream.Config) it.next()).getTimestampBase();
                        int m649getTIMESTAMP_BASE_REALTIME6HVI0MA = androidx.camera.camera2.pipe.OutputStream.TimestampBase.INSTANCE.m649getTIMESTAMP_BASE_REALTIME6HVI0MA();
                        if (timestampBase2 != null && androidx.camera.camera2.pipe.OutputStream.TimestampBase.m642equalsimpl0(timestampBase2.m645unboximpl(), m649getTIMESTAMP_BASE_REALTIME6HVI0MA)) {
                            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                androidx.camera.camera2.pipe.StreamId.m760toStringimpl(i);
                            }
                            return androidx.camera.camera2.pipe.internal.OutputMatcher.Companion.forTimestampsWithOffset$default(androidx.camera.camera2.pipe.internal.OutputMatcher.INSTANCE, -j, 0L, 2, null);
                        }
                    }
                }
            }
            return androidx.camera.camera2.pipe.internal.OutputMatcher.INSTANCE.getEXACT();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$vSyT8tKQ-MfAmHOL7w_2z5D7axg, reason: not valid java name */
    public static /* synthetic */ void m958$r8$lambda$vSyT8tKQMfAmHOL7w_2z5D7axg(androidx.camera.camera2.pipe.CameraStream cameraStream, java.util.Map map, long j, java.util.Set set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs = cameraStream.getOutputs();
        int size = outputs.size();
        for (int i = 0; i < size; i++) {
            int id = outputs.get(i).getId();
            if (!set.contains(androidx.camera.camera2.pipe.OutputId.m536boximpl(id))) {
                java.lang.Object obj = map.get(androidx.camera.camera2.pipe.OutputId.m536boximpl(id));
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                androidx.camera.camera2.pipe.internal.OutputResult.Companion companion = androidx.camera.camera2.pipe.internal.OutputResult.INSTANCE;
                ((androidx.camera.camera2.pipe.internal.OutputDistributor) obj).m977onOutputResultDvZWqE8(j, androidx.camera.camera2.pipe.internal.OutputResult.m979access$constructorimpl(androidx.camera.camera2.pipe.OutputStatus.m543boximpl(androidx.camera.camera2.pipe.OutputStatus.INSTANCE.m556getUNAVAILABLEU7r42EA())));
            }
        }
    }
}
