package androidx.camera.video.internal.workaround;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR=\u0010\u0014\u001a$\u0012\b\u0012\u0006*\u00020\u001d0\u001d*\u0011\u0012\b\u0012\u0006*\u00020\u001d0\u001d0\u0004¢\u0006\u0002\b\u001e0\u001c¢\u0006\u0002\b\u001e8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001a\u0010 R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\""}, d2 = {"Landroidx/camera/video/internal/workaround/DefaultEncoderProfilesProvider;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "", "Landroidx/camera/video/Quality;", "targetQualities", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "hasProfile", "(I)Z", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getAll", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "p0", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/CameraInfoInternal;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "", "Landroid/util/Size;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/Lazy;", "()Ljava/util/List;", "", "Ljava/util/Map;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultEncoderProfilesProvider implements androidx.camera.core.impl.EncoderProfilesProvider {
    public static final int DEFAULT_AUDIO_BITRATE = 96000;
    public static final int DEFAULT_AUDIO_CHANNELS = 1;
    public static final int DEFAULT_AUDIO_CODEC = 3;
    public static final java.lang.String DEFAULT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int DEFAULT_AUDIO_PROFILE = 2;
    public static final int DEFAULT_AUDIO_SAMPLE_RATE = 44100;
    public static final int DEFAULT_DURATION_SECONDS = 60;
    public static final int DEFAULT_OUTPUT_FORMAT = 2;
    public static final int DEFAULT_VIDEO_BITRATE_FHD = 10000000;
    public static final int DEFAULT_VIDEO_BITRATE_HD = 4000000;
    public static final int DEFAULT_VIDEO_BITRATE_SD = 2000000;
    public static final int DEFAULT_VIDEO_BITRATE_UHD = 40000000;
    public static final int DEFAULT_VIDEO_BIT_DEPTH = 8;
    public static final int DEFAULT_VIDEO_CHROMA_SUBSAMPLING = 0;
    public static final int DEFAULT_VIDEO_CODEC = 2;
    public static final int DEFAULT_VIDEO_FRAME_RATE = 30;
    public static final int DEFAULT_VIDEO_HDR_FORMAT = 0;
    public static final java.lang.String DEFAULT_VIDEO_MIME_TYPE = "video/avc";
    public static final int DEFAULT_VIDEO_PROFILE = -1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Integer, androidx.camera.core.impl.EncoderProfilesProxy> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.video.Quality> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultEncoderProfilesProvider(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, java.util.List<? extends androidx.camera.video.Quality> list, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finder, "");
        this.getHighSpeedVideoSizes = cameraInfoInternal;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = finder;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.List supportedResolutions;
                supportedResolutions = androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.this.getHighSpeedVideoSizes.getSupportedResolutions(34);
                return supportedResolutions;
            }
        });
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    private final java.util.List<android.util.Size> getHighSpeedVideoFpsRanges() {
        return (java.util.List) this.Camera2StreamConfigurationMap.getValue();
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean hasProfile(int quality) {
        return Camera2StreamConfigurationMap(quality) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final androidx.camera.core.impl.EncoderProfilesProxy getAll(int quality) {
        return Camera2StreamConfigurationMap(quality);
    }

    private final androidx.camera.core.impl.EncoderProfilesProxy Camera2StreamConfigurationMap(int p0) {
        androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy;
        java.lang.Object obj;
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        int i;
        if (this.getHighSpeedVideoFpsRanges.containsKey(java.lang.Integer.valueOf(p0))) {
            return this.getHighSpeedVideoFpsRanges.get(java.lang.Integer.valueOf(p0));
        }
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (true) {
            immutableEncoderProfilesProxy = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            androidx.camera.video.Quality quality = (androidx.camera.video.Quality) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNull(quality, "");
            if (((androidx.camera.video.Quality.ConstantQuality) quality).getQualityValue(1) == p0) {
                break;
            }
        }
        androidx.camera.video.Quality.ConstantQuality constantQuality = obj instanceof androidx.camera.video.Quality.ConstantQuality ? (androidx.camera.video.Quality.ConstantQuality) obj : null;
        if (constantQuality != null) {
            for (android.util.Size size : constantQuality.getTypicalSizes()) {
                if (getHighSpeedVideoFpsRanges().contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    androidx.camera.video.Quality.ConstantQuality constantQuality2 = constantQuality;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(constantQuality2, androidx.camera.video.Quality.UHD)) {
                        i = DEFAULT_VIDEO_BITRATE_UHD;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(constantQuality2, androidx.camera.video.Quality.FHD)) {
                        i = DEFAULT_VIDEO_BITRATE_FHD;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(constantQuality2, androidx.camera.video.Quality.HD)) {
                        i = DEFAULT_VIDEO_BITRATE_HD;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(constantQuality2, androidx.camera.video.Quality.SD)) {
                            throw new java.lang.IllegalArgumentException("Undefined bitrate for quality: ".concat(java.lang.String.valueOf(constantQuality2)));
                        }
                        i = DEFAULT_VIDEO_BITRATE_SD;
                    }
                    videoProfileProxy = getHighSpeedVideoFpsRanges(width, height, i);
                    androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String mediaType = videoProfileProxy.getMediaType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mediaType, "");
                    androidx.camera.video.internal.encoder.VideoEncoderInfo find = finder.find(mediaType);
                    if (find != null && find.isSizeSupportedAllowSwapping(width, height)) {
                        java.lang.Integer clamp = find.getSupportedBitrateRange().clamp(java.lang.Integer.valueOf(i));
                        if (clamp == null || clamp.intValue() != i) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(clamp);
                            videoProfileProxy = getHighSpeedVideoFpsRanges(width, height, clamp.intValue());
                        }
                    } else {
                        videoProfileProxy = null;
                    }
                    if (videoProfileProxy != null) {
                        break;
                    }
                }
            }
        }
        videoProfileProxy = null;
        if (videoProfileProxy != null) {
            androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy create = androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy.create(3, "audio/mp4a-latm", DEFAULT_AUDIO_BITRATE, 44100, 1, 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy create2 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(60, 2, kotlin.collections.CollectionsKt.listOf(create), kotlin.collections.CollectionsKt.listOf(videoProfileProxy));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
            immutableEncoderProfilesProxy = create2;
        }
        this.getHighSpeedVideoFpsRanges.put(java.lang.Integer.valueOf(p0), immutableEncoderProfilesProxy);
        return immutableEncoderProfilesProxy;
    }

    private static /* synthetic */ androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy create = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.create(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }
}
