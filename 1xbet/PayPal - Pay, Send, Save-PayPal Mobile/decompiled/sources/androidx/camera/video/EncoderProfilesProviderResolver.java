package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/video/EncoderProfilesProviderResolver;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "", "videoCapabilitiesSource", "qualitySource", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "resolve", "(Landroidx/camera/core/impl/CameraInfoInternal;IILandroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)Landroidx/camera/core/impl/EncoderProfilesProvider;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncoderProfilesProviderResolver {
    public static final androidx.camera.video.EncoderProfilesProviderResolver INSTANCE = new androidx.camera.video.EncoderProfilesProviderResolver();

    private EncoderProfilesProviderResolver() {
    }

    public final androidx.camera.core.impl.EncoderProfilesProvider resolve(androidx.camera.core.impl.CameraInfoInternal cameraInfo, int videoCapabilitiesSource, int qualitySource, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "");
        if (videoCapabilitiesSource != 0 && videoCapabilitiesSource != 1) {
            throw new java.lang.IllegalArgumentException("Not a supported video capabilities source: ".concat(java.lang.String.valueOf(videoCapabilitiesSource)).toString());
        }
        androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider getInputFormats = cameraInfo.getGetInputFormats();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getInputFormats, "");
        if (qualitySource == 2) {
            if (cameraInfo.isHighSpeedSupported()) {
                return getInputFormats;
            }
            androidx.camera.core.impl.EncoderProfilesProvider encoderProfilesProvider = androidx.camera.core.impl.EncoderProfilesProvider.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encoderProfilesProvider, "");
            return encoderProfilesProvider;
        }
        if (!androidx.camera.video.CapabilitiesByQuality.containsSupportedQuality(getInputFormats, qualitySource)) {
            androidx.camera.core.Logger.w("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            getInputFormats = new androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider(cameraInfo, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.video.Quality[]{androidx.camera.video.Quality.FHD, androidx.camera.video.Quality.HD, androidx.camera.video.Quality.SD}), videoEncoderInfoFinder);
        }
        androidx.camera.core.impl.Quirks all = androidx.camera.video.internal.compat.quirk.DeviceQuirks.getAll();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(all, "");
        androidx.camera.video.internal.QualityExploredEncoderProfilesProvider qualityAddedEncoderProfilesProvider = new androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider(getInputFormats, all, cameraInfo, videoEncoderInfoFinder);
        if (videoCapabilitiesSource == 1) {
            qualityAddedEncoderProfilesProvider = new androidx.camera.video.internal.QualityExploredEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, androidx.camera.video.Quality.getSortedQualities(), java.util.Collections.singleton(androidx.camera.core.DynamicRange.SDR), cameraInfo.getSupportedResolutions(34), videoEncoderInfoFinder);
        }
        androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, all);
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = cameraInfo.getSupportedDynamicRanges();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "");
        java.util.Set<androidx.camera.core.DynamicRange> set = supportedDynamicRanges;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) it.next();
                if (dynamicRange.getEncoding() == 3 && dynamicRange.getBitDepth() == 10) {
                    qualityResolutionModifiedEncoderProfilesProvider = new androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, videoEncoderInfoFinder);
                    break;
                }
            }
        }
        return new androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, cameraInfo, all);
    }
}
