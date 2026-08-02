package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u001aJC\u0010!\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Landroidx/camera/core/CameraUseCaseAdapterProviderImpl;", "Landroidx/camera/core/CameraUseCaseAdapterProvider;", "Landroidx/camera/core/impl/CameraRepository;", "cameraRepository", "Landroidx/camera/core/concurrent/CameraCoordinator;", "cameraCoordinator", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "useCaseConfigFactory", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "<init>", "(Landroidx/camera/core/impl/CameraRepository;Landroidx/camera/core/concurrent/CameraCoordinator;Landroidx/camera/core/impl/UseCaseConfigFactory;Landroidx/camera/core/internal/StreamSpecsCalculator;)V", "", "cameraId", "Landroidx/camera/core/internal/CameraUseCaseAdapter;", "provide", "(Ljava/lang/String;)Landroidx/camera/core/internal/CameraUseCaseAdapter;", "Landroidx/camera/core/impl/CameraInternal;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "secondaryCamera", "Landroidx/camera/core/impl/AdapterCameraInfo;", "adapterCameraInfo", "secondaryAdapterCameraInfo", "Landroidx/camera/core/CompositionSettings;", "compositionSettings", "secondaryCompositionSettings", "(Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/impl/AdapterCameraInfo;Landroidx/camera/core/impl/AdapterCameraInfo;Landroidx/camera/core/CompositionSettings;Landroidx/camera/core/CompositionSettings;)Landroidx/camera/core/internal/CameraUseCaseAdapter;", "p0", "p1", "p2", "p3", "p4", "p5", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/CameraRepository;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/concurrent/CameraCoordinator;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "getHighSpeedVideoSizes", "Landroidx/camera/core/internal/StreamSpecsCalculator;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraUseCaseAdapterProviderImpl implements androidx.camera.core.CameraUseCaseAdapterProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.core.impl.UseCaseConfigFactory getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.core.concurrent.CameraCoordinator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.core.internal.StreamSpecsCalculator getHighSpeedVideoFpsRanges;

    public CameraUseCaseAdapterProviderImpl(androidx.camera.core.impl.CameraRepository cameraRepository, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator, androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseConfigFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
        this.Camera2StreamConfigurationMap = cameraRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraCoordinator;
        this.getHighSpeedVideoFpsRangesFor = useCaseConfigFactory;
        this.getHighSpeedVideoFpsRanges = streamSpecsCalculator;
    }

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    public final androidx.camera.core.internal.CameraUseCaseAdapter provide(java.lang.String cameraId) throws java.lang.IllegalArgumentException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        androidx.camera.core.impl.CameraInternal camera = this.Camera2StreamConfigurationMap.getCamera(cameraId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera, "");
        androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo = new androidx.camera.core.impl.AdapterCameraInfo(camera.getCamera2StreamConfigurationMap(), androidx.camera.core.impl.CameraConfigs.defaultConfig());
        androidx.camera.core.CompositionSettings compositionSettings = androidx.camera.core.CompositionSettings.DEFAULT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compositionSettings, "");
        androidx.camera.core.CompositionSettings compositionSettings2 = androidx.camera.core.CompositionSettings.DEFAULT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compositionSettings2, "");
        return getHighSpeedVideoFpsRanges(camera, null, adapterCameraInfo, null, compositionSettings, compositionSettings2);
    }

    @Override // androidx.camera.core.CameraUseCaseAdapterProvider
    public final androidx.camera.core.internal.CameraUseCaseAdapter provide(androidx.camera.core.impl.CameraInternal camera, androidx.camera.core.impl.CameraInternal secondaryCamera, androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo, androidx.camera.core.impl.AdapterCameraInfo secondaryAdapterCameraInfo, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings secondaryCompositionSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterCameraInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compositionSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryCompositionSettings, "");
        return getHighSpeedVideoFpsRanges(camera, secondaryCamera, adapterCameraInfo, secondaryAdapterCameraInfo, compositionSettings, secondaryCompositionSettings);
    }

    private final androidx.camera.core.internal.CameraUseCaseAdapter getHighSpeedVideoFpsRanges(androidx.camera.core.impl.CameraInternal p0, androidx.camera.core.impl.CameraInternal p1, androidx.camera.core.impl.AdapterCameraInfo p2, androidx.camera.core.impl.AdapterCameraInfo p3, androidx.camera.core.CompositionSettings p4, androidx.camera.core.CompositionSettings p5) {
        return new androidx.camera.core.internal.CameraUseCaseAdapter(p0, p1, p2, p3, p4, p5, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }
}
