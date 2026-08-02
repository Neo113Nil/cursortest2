package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u00020\u0001:\u0001.B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJi\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJe\u0010(\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020$0!2\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculatorImpl;", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "useCaseConfigFactory", "Landroidx/camera/core/impl/CameraDeviceSurfaceManager;", "cameraDeviceSurfaceManager", "<init>", "(Landroidx/camera/core/impl/UseCaseConfigFactory;Landroidx/camera/core/impl/CameraDeviceSurfaceManager;)V", "", "setCameraDeviceSurfaceManager", "(Landroidx/camera/core/impl/CameraDeviceSurfaceManager;)V", "", "cameraMode", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "", "Landroidx/camera/core/UseCase;", "newUseCases", "attachedUseCases", "Landroidx/camera/core/impl/CameraConfig;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Landroidx/camera/core/internal/StreamSpecQueryResult;", "calculateSuggestedStreamSpecs", "(ILandroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/impl/CameraConfig;ILandroid/util/Range;ZZ)Landroidx/camera/core/internal/StreamSpecQueryResult;", "p0", "p1", "p2", "", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "p3", "Landroidx/camera/core/internal/CameraUseCaseAdapter$ConfigPair;", "p4", "p5", "p6", "getHighSpeedVideoSizes", "(ILandroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)Landroidx/camera/core/internal/StreamSpecQueryResult;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/CameraDeviceSurfaceManager;", "Companion_"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamSpecsCalculatorImpl implements androidx.camera.core.internal.StreamSpecsCalculator {
    private static final androidx.camera.core.internal.StreamSpecsCalculatorImpl.Companion_ Companion_ = new androidx.camera.core.internal.StreamSpecsCalculatorImpl.Companion_(null);
    private final androidx.camera.core.impl.UseCaseConfigFactory getHighResolutionOutputSizeshNQ4ISI;
    private androidx.camera.core.impl.CameraDeviceSurfaceManager getHighSpeedVideoFpsRanges;

    public StreamSpecsCalculatorImpl(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseConfigFactory, "");
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseConfigFactory;
        this.getHighSpeedVideoFpsRanges = cameraDeviceSurfaceManager;
    }

    public /* synthetic */ StreamSpecsCalculatorImpl(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(useCaseConfigFactory, (i & 2) != 0 ? null : cameraDeviceSurfaceManager);
    }

    @Override // androidx.camera.core.internal.StreamSpecsCalculator
    public final void setCameraDeviceSurfaceManager(androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "");
        this.getHighSpeedVideoFpsRanges = cameraDeviceSurfaceManager;
    }

    private final androidx.camera.core.internal.StreamSpecQueryResult getHighSpeedVideoSizes(int p0, final androidx.camera.core.impl.CameraInfoInternal p1, java.util.List<? extends androidx.camera.core.UseCase> p2, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, ? extends androidx.camera.core.UseCase> p3, final java.util.Map<androidx.camera.core.UseCase, ? extends androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> p4, boolean p5, boolean p6) {
        int i;
        android.graphics.Rect rect;
        java.lang.String cameraId = p1.getCameraId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (p2.isEmpty()) {
            i = Integer.MAX_VALUE;
        } else {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            try {
                rect = p1.getSensorRect();
            } catch (java.lang.NullPointerException unused) {
                rect = null;
            }
            androidx.camera.core.internal.SupportedOutputSizesSorter supportedOutputSizesSorter = new androidx.camera.core.internal.SupportedOutputSizesSorter(p1, rect != null ? androidx.camera.core.impl.utils.TransformUtils.rectToSize(rect) : null);
            for (androidx.camera.core.UseCase useCase : p2) {
                androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = p4.get(useCase);
                if (configPair == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair2 = configPair;
                androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs = useCase.mergeConfigs(p1, configPair2.Camera2StreamConfigurationMap, configPair2.getHighSpeedVideoFpsRanges);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mergeConfigs, "");
                linkedHashMap2.put(mergeConfigs, useCase);
                linkedHashMap3.put(mergeConfigs, supportedOutputSizesSorter.getSortedSupportedOutputSizes(mergeConfigs));
            }
            java.util.List<? extends androidx.camera.core.UseCase> list = p2;
            androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization = androidx.camera.core.impl.utils.UseCaseUtil.getVideoStabilization(list, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.core.internal.StreamSpecsCalculatorImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.core.internal.StreamSpecsCalculatorImpl.m1015$r8$lambda$EiSDIaVoOjJPVqGwZrvYw4fiRY(p4, p1, (androidx.camera.core.UseCase) obj);
                }
            });
            androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.getHighSpeedVideoFpsRanges;
            if (cameraDeviceSurfaceManager == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            androidx.camera.core.impl.SurfaceStreamSpecQueryResult suggestedStreamSpecs = cameraDeviceSurfaceManager.getSuggestedStreamSpecs(p0, cameraId, new java.util.ArrayList(p3.keySet()), linkedHashMap3, videoStabilization, androidx.camera.core.impl.utils.UseCaseUtil.containsVideoCapture(list), p5, p6);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(suggestedStreamSpecs, "");
            java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec> component1 = suggestedStreamSpecs.component1();
            java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> component2 = suggestedStreamSpecs.component2();
            i = suggestedStreamSpecs.getMaxSupportedFrameRate();
            for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
                java.lang.Object value = entry.getValue();
                androidx.camera.core.impl.StreamSpec streamSpec = component1.get(entry.getKey());
                if (streamSpec != null) {
                    linkedHashMap.put(value, streamSpec);
                } else {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
            }
            for (java.util.Map.Entry<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec> entry2 : component2.entrySet()) {
                if (p3.containsKey(entry2.getKey())) {
                    androidx.camera.core.UseCase useCase2 = p3.get(entry2.getKey());
                    if (useCase2 != null) {
                        linkedHashMap.put(useCase2, entry2.getValue());
                    } else {
                        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
        }
        return new androidx.camera.core.internal.StreamSpecQueryResult(linkedHashMap, i);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/core/internal/StreamSpecsCalculatorImpl$Companion_;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$EiSDIaV-oOjJPVqGwZrvYw4fiRY, reason: not valid java name */
    public static /* synthetic */ androidx.camera.core.impl.UseCaseConfig m1015$r8$lambda$EiSDIaVoOjJPVqGwZrvYw4fiRY(java.util.Map map, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        java.lang.Object obj = map.get(useCase);
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair configPair = (androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair) obj;
        androidx.camera.core.impl.UseCaseConfig<?> mergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.Camera2StreamConfigurationMap, configPair.getHighSpeedVideoFpsRanges);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mergeConfigs, "");
        return mergeConfigs;
    }

    @Override // androidx.camera.core.internal.StreamSpecsCalculator
    public final androidx.camera.core.internal.StreamSpecQueryResult calculateSuggestedStreamSpecs(int cameraMode, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.core.UseCase> newUseCases, java.util.List<? extends androidx.camera.core.UseCase> attachedUseCases, androidx.camera.core.impl.CameraConfig cameraConfig, int sessionType, android.util.Range<java.lang.Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachedUseCases, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetFrameRate, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String cameraId = cameraInfoInternal.getCameraId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Iterator<? extends androidx.camera.core.UseCase> it = attachedUseCases.iterator();
        while (it.hasNext()) {
            androidx.camera.core.UseCase next = it.next();
            androidx.camera.core.impl.StreamSpec attachedStreamSpec = next.getAttachedStreamSpec();
            if (attachedStreamSpec == null) {
                throw new java.lang.IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.".toString());
            }
            androidx.camera.core.impl.CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.getHighSpeedVideoFpsRanges;
            if (cameraDeviceSurfaceManager == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            int imageFormat = next.getImageFormat();
            android.util.Size attachedSurfaceResolution = next.getAttachedSurfaceResolution();
            if (attachedSurfaceResolution != null) {
                java.util.Iterator<? extends androidx.camera.core.UseCase> it2 = it;
                java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
                androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig = cameraDeviceSurfaceManager.transformSurfaceConfig(cameraMode, cameraId, imageFormat, attachedSurfaceResolution, next.getCurrentConfig().getStreamUseCase());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transformSurfaceConfig, "");
                int imageFormat2 = next.getImageFormat();
                android.util.Size attachedSurfaceResolution2 = next.getAttachedSurfaceResolution();
                kotlin.jvm.internal.Intrinsics.checkNotNull(attachedSurfaceResolution2);
                androidx.camera.core.DynamicRange dynamicRange = attachedStreamSpec.getDynamicRange();
                java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> captureTypes = androidx.camera.core.streamsharing.StreamSharing.getCaptureTypes(next);
                androidx.camera.core.impl.Config implementationOptions = attachedStreamSpec.getImplementationOptions();
                int sessionType2 = next.getCurrentConfig().getSessionType(0);
                android.util.Range<java.lang.Integer> targetFrameRate2 = next.getCurrentConfig().getTargetFrameRate(androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
                if (targetFrameRate2 == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                boolean isStrictFrameRateRequired = next.getCurrentConfig().isStrictFrameRateRequired();
                androidx.camera.core.impl.UseCaseConfig<?> currentConfig = next.getCurrentConfig();
                android.util.Size attachedSurfaceResolution3 = next.getAttachedSurfaceResolution();
                kotlin.jvm.internal.Intrinsics.checkNotNull(attachedSurfaceResolution3);
                androidx.camera.core.impl.AttachedSurfaceInfo create = androidx.camera.core.impl.AttachedSurfaceInfo.create(transformSurfaceConfig, imageFormat2, attachedSurfaceResolution2, dynamicRange, captureTypes, implementationOptions, sessionType2, targetFrameRate2, isStrictFrameRateRequired, currentConfig.getCustomMaxFrameRate(attachedSurfaceResolution3));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
                arrayList.add(create);
                linkedHashMap3.put(create, next);
                linkedHashMap.put(next, attachedStreamSpec);
                linkedHashMap2 = linkedHashMap3;
                it = it2;
            } else {
                throw new java.lang.IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.".toString());
            }
        }
        android.util.Pair pair = new android.util.Pair(linkedHashMap, linkedHashMap2);
        java.lang.Object obj = pair.second;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.internal.CameraUseCaseAdapter.ConfigPair> highResolutionOutputSizeshNQ4ISI = androidx.camera.core.internal.CameraUseCaseAdapter.getHighResolutionOutputSizeshNQ4ISI(newUseCases, cameraConfig.getUseCaseConfigFactory(), this.getHighResolutionOutputSizeshNQ4ISI, sessionType, targetFrameRate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highResolutionOutputSizeshNQ4ISI, "");
        androidx.camera.core.internal.StreamSpecQueryResult highSpeedVideoSizes = getHighSpeedVideoSizes(cameraMode, cameraInfoInternal, newUseCases, (java.util.Map) obj, highResolutionOutputSizeshNQ4ISI, isFeatureComboInvocation, findMaxSupportedFrameRate);
        java.lang.Object obj2 = pair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return new androidx.camera.core.internal.StreamSpecQueryResult(kotlin.collections.MapsKt.plus((java.util.Map) obj2, highSpeedVideoSizes.getStreamSpecs()), highSpeedVideoSizes.getMaxSupportedFrameRate());
    }
}
