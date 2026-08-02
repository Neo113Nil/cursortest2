package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0010\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"Landroidx/camera/video/EncoderProfilesResolverFactory;", "", "<init>", "()V", com.datadog.trace.api.DDSpanTypes.CACHE, "Landroid/util/LruCache;", "Landroidx/camera/video/EncoderProfilesResolverFactory$CacheKey;", "Landroidx/camera/video/EncoderProfilesResolver;", "getResolver", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "videoRecordingType", "", "videoCapabilitiesSource", "videoEncoderInfoFinder", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "createResolver", "shouldSkipCache", "", "CacheKey", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EncoderProfilesResolverFactory {
    public static final androidx.camera.video.EncoderProfilesResolverFactory INSTANCE = new androidx.camera.video.EncoderProfilesResolverFactory();
    private static final android.util.LruCache<androidx.camera.video.EncoderProfilesResolverFactory.CacheKey, androidx.camera.video.EncoderProfilesResolver> getHighSpeedVideoFpsRangesFor = new android.util.LruCache<>(16);

    private EncoderProfilesResolverFactory() {
    }

    public static /* synthetic */ androidx.camera.video.EncoderProfilesResolver getResolver$default(androidx.camera.core.CameraInfo cameraInfo, int i, int i2, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            finder = androidx.camera.video.internal.encoder.VideoEncoderInfoImpl.FINDER;
        }
        return getResolver(cameraInfo, i, i2, finder);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.video.EncoderProfilesResolver getResolver(final androidx.camera.core.CameraInfo cameraInfo, final int videoRecordingType, final int videoCapabilitiesSource, final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        androidx.camera.video.EncoderProfilesResolver encoderProfilesResolver;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.video.EncoderProfilesResolverFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.video.EncoderProfilesResolverFactory.$r8$lambda$gbwcZatsf5Q_o66QGWQ27_5iA5w(androidx.camera.core.CameraInfo.this, videoRecordingType, videoCapabilitiesSource, videoEncoderInfoFinder);
            }
        });
        if (cameraInfo instanceof androidx.camera.core.impl.AdapterCameraInfo) {
            androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo = (androidx.camera.core.impl.AdapterCameraInfo) cameraInfo;
            if (!adapterCameraInfo.isExternalCamera() && adapterCameraInfo.getLensFacing() != -1) {
                androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo2 = (androidx.camera.core.impl.AdapterCameraInfo) cameraInfo;
                java.lang.String cameraId = adapterCameraInfo2.getCameraId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
                androidx.camera.core.impl.CameraConfig cameraConfig = adapterCameraInfo2.getCameraConfig();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraConfig, "");
                androidx.camera.video.EncoderProfilesResolverFactory.CacheKey cacheKey = new androidx.camera.video.EncoderProfilesResolverFactory.CacheKey(cameraId, cameraConfig, videoRecordingType, videoCapabilitiesSource, videoEncoderInfoFinder);
                android.util.LruCache<androidx.camera.video.EncoderProfilesResolverFactory.CacheKey, androidx.camera.video.EncoderProfilesResolver> lruCache = getHighSpeedVideoFpsRangesFor;
                synchronized (lruCache) {
                    encoderProfilesResolver = lruCache.get(cacheKey);
                    if (encoderProfilesResolver == null) {
                        encoderProfilesResolver = (androidx.camera.video.EncoderProfilesResolver) lazy.getValue();
                        lruCache.put(cacheKey, encoderProfilesResolver);
                    }
                }
                return encoderProfilesResolver;
            }
        }
        return (androidx.camera.video.EncoderProfilesResolver) lazy.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0013\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0011\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/video/EncoderProfilesResolverFactory$CacheKey;", "", "", "p0", "p1", "", "p2", "p3", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/Object;IILandroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class CacheKey {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.Object getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        public CacheKey(java.lang.String str, java.lang.Object obj, int i, int i2, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finder, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = obj;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoFpsRangesFor = finder;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CacheKey(getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + java.lang.Integer.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + java.lang.Integer.hashCode(this.Camera2StreamConfigurationMap)) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.video.EncoderProfilesResolverFactory.CacheKey)) {
                return false;
            }
            androidx.camera.video.EncoderProfilesResolverFactory.CacheKey cacheKey = (androidx.camera.video.EncoderProfilesResolverFactory.CacheKey) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, cacheKey.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, cacheKey.getHighSpeedVideoFpsRanges) && this.getHighResolutionOutputSizeshNQ4ISI == cacheKey.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == cacheKey.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, cacheKey.getHighSpeedVideoFpsRangesFor);
        }
    }

    public static /* synthetic */ androidx.camera.video.EncoderProfilesResolver $r8$lambda$gbwcZatsf5Q_o66QGWQ27_5iA5w(androidx.camera.core.CameraInfo cameraInfo, int i, int i2, androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder finder) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(cameraInfo, "");
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
        int i3 = i != 2 ? 1 : 2;
        androidx.camera.core.impl.EncoderProfilesProvider resolve = androidx.camera.video.EncoderProfilesProviderResolver.INSTANCE.resolve(cameraInfoInternal, i2, i3, finder);
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "");
        return new androidx.camera.video.EncoderProfilesResolver(resolve, i3, supportedDynamicRanges);
    }
}
