package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/camera2/impl/FeatureCombinationQueryImpl;", "Landroidx/camera/core/featuregroup/impl/FeatureCombinationQuery;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/compat/quirk/CameraQuirks;)V", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "isSupported", "(Landroidx/camera/core/impl/SessionConfig;)Z", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/CameraPipe;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureCombinationQueryImpl implements androidx.camera.core.featuregroup.impl.FeatureCombinationQuery {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.CameraQuirks Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoSizes;

    public FeatureCombinationQueryImpl(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
        this.getHighSpeedVideoSizes = cameraMetadata;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraPipe;
        this.Camera2StreamConfigurationMap = cameraQuirks;
    }

    @Override // androidx.camera.core.featuregroup.impl.FeatureCombinationQuery
    public final boolean isSupported(androidx.camera.core.impl.SessionConfig sessionConfig) {
        androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult m98create79VDu0o;
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        m98create79VDu0o = new androidx.camera.camera2.impl.CameraGraphConfigProvider(new androidx.camera.camera2.impl.CameraCallbackMap(), new androidx.camera.camera2.impl.ComboRequestListener(), new androidx.camera.camera2.config.CameraConfig(this.getHighSpeedVideoSizes.getCamera(), null), this.Camera2StreamConfigurationMap, new androidx.camera.camera2.adapter.ZslControlNoOpImpl(), new androidx.camera.camera2.compat.workaround.TemplateParamsQuirkOverride(this.Camera2StreamConfigurationMap.getQuirks()), this.getHighSpeedVideoSizes, null, null, 384, null).m98create79VDu0o(androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m383getNORMAL2uNL3no(), sessionConfig, true, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? kotlin.collections.MapsKt.emptyMap() : null, (r18 & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : null);
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.camera.camera2.impl.FeatureCombinationQueryImpl$isSupported$1(this, m98create79VDu0o, null), 1, null);
        return ((java.lang.Boolean) runBlocking$default).booleanValue();
    }
}
