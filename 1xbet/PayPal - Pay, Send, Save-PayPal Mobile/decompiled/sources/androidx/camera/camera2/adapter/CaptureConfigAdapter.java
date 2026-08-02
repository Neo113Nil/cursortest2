package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u001b\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "templateParamsOverride", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;)V", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfig", "Landroidx/camera/camera2/pipe/RequestTemplate;", "requestTemplate", "Landroidx/camera/core/impl/Config;", "sessionConfigOptions", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "additionalListeners", "Landroidx/camera/camera2/pipe/Request;", "mapToRequest-nAberiA", "(Landroidx/camera/core/impl/CaptureConfig;ILandroidx/camera/core/impl/Config;Ljava/util/List;)Landroidx/camera/camera2/pipe/Request;", "mapToRequest", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/adapter/ZslControl;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "", "Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class CaptureConfigAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.adapter.CaptureConfigAdapter.Companion INSTANCE = new androidx.camera.camera2.adapter.CaptureConfigAdapter.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;
    private final androidx.camera.camera2.adapter.ZslControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.TemplateParamsOverride getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.UseCaseGraphContext Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CaptureConfigAdapter(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGraphContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zslControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateParamsOverride, "");
        this.Camera2StreamConfigurationMap = useCaseGraphContext;
        this.getHighResolutionOutputSizeshNQ4ISI = zslControl;
        this.getHighSpeedVideoFpsRangesFor = useCaseThreads;
        this.getHighSpeedVideoFpsRanges = templateParamsOverride;
        this.getHighSpeedVideoSizes = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraProperties.getMetadata());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: mapToRequest-nAberiA$default, reason: not valid java name */
    public static /* synthetic */ androidx.camera.camera2.pipe.Request m33mapToRequestnAberiA$default(androidx.camera.camera2.adapter.CaptureConfigAdapter captureConfigAdapter, androidx.camera.core.impl.CaptureConfig captureConfig, int i, androidx.camera.core.impl.Config config, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return captureConfigAdapter.m34mapToRequestnAberiA(captureConfig, i, config, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.camera.camera2.pipe.Request$Listener] */
    /* renamed from: mapToRequest-nAberiA, reason: not valid java name */
    public final androidx.camera.camera2.pipe.Request m34mapToRequestnAberiA(androidx.camera.core.impl.CaptureConfig captureConfig, int requestTemplate, androidx.camera.core.impl.Config sessionConfigOptions, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> additionalListeners) {
        androidx.camera.camera2.pipe.InputRequest inputRequest;
        androidx.camera.core.ImageProxy dequeueImageFromBuffer;
        androidx.camera.camera2.pipe.InputRequest inputRequest2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalListeners, "");
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = captureConfig.getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
        if (surfaces.isEmpty()) {
            throw new java.lang.IllegalStateException("Attempted to issue a capture without surfaces using ".concat(java.lang.String.valueOf(captureConfig)).toString());
        }
        java.util.List<androidx.camera.core.impl.DeferrableSurface> list = surfaces;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : list) {
            androidx.camera.camera2.pipe.StreamId streamId = this.Camera2StreamConfigurationMap.getSurfaceToStreamMap().get(deferrableSurface);
            if (streamId == null) {
                throw new java.lang.IllegalStateException("Attempted to issue a capture with an unrecognized surface: ".concat(java.lang.String.valueOf(deferrableSurface)).toString());
            }
            arrayList.add(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId.m761unboximpl()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap = new androidx.camera.camera2.impl.CameraCallbackMap();
        java.util.List<androidx.camera.core.impl.CameraCaptureCallback> cameraCaptureCallbacks = captureConfig.getCameraCaptureCallbacks();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraCaptureCallbacks, "");
        for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : cameraCaptureCallbacks) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cameraCaptureCallback);
            cameraCallbackMap.addCaptureCallback(cameraCaptureCallback, this.getHighSpeedVideoFpsRangesFor.getSequentialExecutor());
        }
        androidx.camera.core.impl.Config implementationOptions = captureConfig.getImplementationOptions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementationOptions, "");
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder.insertAllOptions(sessionConfigOptions);
        builder.insertAllOptions(implementationOptions);
        if (implementationOptions.containsOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION)) {
            android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Object retrieveOption = implementationOptions.retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_ROTATION);
            kotlin.jvm.internal.Intrinsics.checkNotNull(retrieveOption);
            builder.setCaptureRequestOption(key, retrieveOption);
        }
        if (implementationOptions.containsOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY)) {
            android.hardware.camera2.CaptureRequest.Key key2 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            java.lang.Object retrieveOption2 = implementationOptions.retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_JPEG_QUALITY);
            kotlin.jvm.internal.Intrinsics.checkNotNull(retrieveOption2);
            builder.setCaptureRequestOption(key2, java.lang.Byte.valueOf((byte) ((java.lang.Number) retrieveOption2).intValue()));
        }
        int m680constructorimpl = androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(captureConfig.getTemplateType());
        androidx.camera.camera2.pipe.InputRequest inputRequest3 = null;
        if (captureConfig.getTemplateType() != 5 || this.getHighResolutionOutputSizeshNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI() || this.getHighResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoSizes() || (dequeueImageFromBuffer = this.getHighResolutionOutputSizeshNQ4ISI.dequeueImageFromBuffer()) == null) {
            inputRequest = null;
        } else {
            androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(dequeueImageFromBuffer.getImageInfo());
            if (retrieveCameraCaptureResult == null) {
                inputRequest2 = null;
            } else {
                if (!(retrieveCameraCaptureResult instanceof androidx.camera.camera2.adapter.CaptureResultAdapter)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected capture result type: ");
                    sb.append(retrieveCameraCaptureResult.getClass());
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                android.media.Image image = dequeueImageFromBuffer.getImage();
                if (image == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                androidx.camera.camera2.pipe.media.AndroidImage androidImage = new androidx.camera.camera2.pipe.media.AndroidImage(image);
                java.lang.Object unwrapAs = ((androidx.camera.camera2.adapter.CaptureResultAdapter) retrieveCameraCaptureResult).unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.FrameInfo.class));
                if (unwrapAs == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                inputRequest3 = new androidx.camera.camera2.pipe.InputRequest(androidImage, (androidx.camera.camera2.pipe.FrameInfo) unwrapAs);
                final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(dequeueImageFromBuffer);
                inputRequest2 = new androidx.camera.camera2.pipe.Request.Listener() { // from class: androidx.camera.camera2.adapter.CaptureConfigAdapter$buildImageClosingRequestListener$1
                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
                    public final void mo36onCompleteCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                        androidx.camera.camera2.adapter.CaptureConfigAdapter.access$buildImageClosingRequestListener$closeImageProxy(atomicReference);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
                    public final void mo37onFailedCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
                        androidx.camera.camera2.adapter.CaptureConfigAdapter.access$buildImageClosingRequestListener$closeImageProxy(atomicReference);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public final void onAborted(androidx.camera.camera2.pipe.Request request) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
                        androidx.camera.camera2.adapter.CaptureConfigAdapter.access$buildImageClosingRequestListener$closeImageProxy(atomicReference);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
                    public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
                        androidx.camera.camera2.adapter.CaptureConfigAdapter.access$buildImageClosingRequestListener$closeImageProxy(atomicReference);
                    }
                };
            }
            inputRequest = inputRequest3;
            inputRequest3 = inputRequest2;
        }
        if (inputRequest == null) {
            m680constructorimpl = INSTANCE.m35getStillCaptureTemplateCMLptTo$camera_camera2(captureConfig, requestTemplate, this.getHighSpeedVideoSizes);
        }
        java.util.Map plus = kotlin.collections.MapsKt.plus(this.getHighSpeedVideoFpsRanges.mo79getOverrideParamsxlOpshk(androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(m680constructorimpl)), androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(builder.build()));
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(cameraCallbackMap);
        if (inputRequest3 != null) {
            createListBuilder.add(inputRequest3);
        }
        createListBuilder.addAll(additionalListeners);
        return new androidx.camera.camera2.pipe.Request(arrayList2, plus, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE(), captureConfig.getTagBundle())), kotlin.collections.CollectionsKt.build(createListBuilder), androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(m680constructorimpl), inputRequest, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureConfigAdapter$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/CaptureConfig;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "sessionTemplate", "", "isLegacyDevice", "getStillCaptureTemplate-CMLptTo$camera_camera2", "(Landroidx/camera/core/impl/CaptureConfig;IZ)I", "getStillCaptureTemplate"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getStillCaptureTemplate-CMLptTo$camera_camera2, reason: not valid java name */
        public final int m35getStillCaptureTemplateCMLptTo$camera_camera2(androidx.camera.core.impl.CaptureConfig captureConfig, int i, boolean z) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfig, "");
            if (!androidx.camera.camera2.pipe.RequestTemplate.m682equalsimpl0(i, androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(3)) || z) {
                i2 = (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1;
            } else {
                i2 = 4;
            }
            if (i2 != -1) {
                return androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(i2);
            }
            return androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(captureConfig.getTemplateType());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$buildImageClosingRequestListener$closeImageProxy(java.util.concurrent.atomic.AtomicReference atomicReference) {
        androidx.camera.core.ImageProxy imageProxy = (androidx.camera.core.ImageProxy) atomicReference.getAndSet(null);
        if (imageProxy != null) {
            imageProxy.close();
        }
    }
}
