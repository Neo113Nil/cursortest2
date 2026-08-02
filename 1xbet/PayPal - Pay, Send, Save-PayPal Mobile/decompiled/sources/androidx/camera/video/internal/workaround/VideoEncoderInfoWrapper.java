package androidx.camera.video.internal.workaround;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012"}, d2 = {"Landroidx/camera/video/internal/workaround/VideoEncoderInfoWrapper;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "p0", "<init>", "(Landroidx/camera/video/internal/encoder/VideoEncoderInfo;)V", "", "getName", "()Ljava/lang/String;", "", "canSwapWidthHeight", "()Z", "", "width", "height", "isSizeSupported", "(II)Z", "Landroid/util/Range;", "getSupportedWidths", "()Landroid/util/Range;", "getSupportedHeights", "getSupportedWidthsFor", "(I)Landroid/util/Range;", "getSupportedHeightsFor", "Camera2StreamConfigurationMap", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "getHighSpeedVideoFpsRanges", "Landroid/util/Range;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "", "Landroid/util/Size;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getWidthAlignment", "()I", "widthAlignment", "getHeightAlignment", "heightAlignment", "getSupportedBitrateRange", "supportedBitrateRange", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoEncoderInfoWrapper implements androidx.camera.video.internal.encoder.VideoEncoderInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.Companion INSTANCE = new androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.Companion(null);
    private final androidx.camera.video.internal.encoder.VideoEncoderInfo Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.util.Range<java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.util.Range<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<android.util.Size> getHighSpeedVideoFpsRanges;

    private VideoEncoderInfoWrapper(androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo) {
        this.Camera2StreamConfigurationMap = videoEncoderInfo;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.getHighSpeedVideoFpsRanges = hashSet;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        android.util.Range<java.lang.Integer> create = android.util.Range.create(java.lang.Integer.valueOf(widthAlignment), java.lang.Integer.valueOf(((int) java.lang.Math.ceil(4096.0d / widthAlignment)) * widthAlignment));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        this.getHighSpeedVideoFpsRangesFor = create;
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        android.util.Range<java.lang.Integer> create2 = android.util.Range.create(java.lang.Integer.valueOf(heightAlignment), java.lang.Integer.valueOf(((int) java.lang.Math.ceil(2160.0d / heightAlignment)) * heightAlignment));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = create2;
        java.util.Set<android.util.Size> extraSupportedSizes = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.getExtraSupportedSizes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extraSupportedSizes, "");
        hashSet.addAll(extraSupportedSizes);
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public final java.lang.String getName() {
        return this.Camera2StreamConfigurationMap.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean canSwapWidthHeight() {
        return this.Camera2StreamConfigurationMap.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final boolean isSizeSupported(int width, int height) {
        if (this.Camera2StreamConfigurationMap.isSizeSupported(width, height)) {
            return true;
        }
        java.util.Set<android.util.Size> set = this.getHighSpeedVideoFpsRanges;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            for (android.util.Size size : set) {
                if (size.getWidth() == width && size.getHeight() == height) {
                    return true;
                }
            }
        }
        return this.getHighSpeedVideoFpsRangesFor.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(width)) && this.getHighResolutionOutputSizeshNQ4ISI.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(height)) && width % this.Camera2StreamConfigurationMap.getWidthAlignment() == 0 && height % this.Camera2StreamConfigurationMap.getHeightAlignment() == 0;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidths() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeights() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedWidthsFor(int height) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(height)) || height % this.Camera2StreamConfigurationMap.getHeightAlignment() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not supported height: ");
            sb.append(height);
            sb.append(" which is not in ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" or can not be divided by alignment ");
            sb.append(this.Camera2StreamConfigurationMap.getHeightAlignment());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedHeightsFor(int width) {
        if (!this.getHighSpeedVideoFpsRangesFor.contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(width)) || width % this.Camera2StreamConfigurationMap.getWidthAlignment() != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not supported width: ");
            sb.append(width);
            sb.append(" which is not in ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" or can not be divided by alignment ");
            sb.append(this.Camera2StreamConfigurationMap.getWidthAlignment());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getWidthAlignment() {
        return this.Camera2StreamConfigurationMap.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final int getHeightAlignment() {
        return this.Camera2StreamConfigurationMap.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public final android.util.Range<java.lang.Integer> getSupportedBitrateRange() {
        return this.Camera2StreamConfigurationMap.getSupportedBitrateRange();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/video/internal/workaround/VideoEncoderInfoWrapper$Companion;", "", "<init>", "()V", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "videoEncoderInfo", "Landroid/util/Size;", "validSizeToCheck", "from", "(Landroidx/camera/video/internal/encoder/VideoEncoderInfo;Landroid/util/Size;)Landroidx/camera/video/internal/encoder/VideoEncoderInfo;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.video.internal.encoder.VideoEncoderInfo from(androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo, android.util.Size validSizeToCheck) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEncoderInfo, "");
            if (!(videoEncoderInfo instanceof androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper)) {
                if (androidx.camera.video.internal.compat.quirk.DeviceQuirks.get(androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                    if (validSizeToCheck != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(validSizeToCheck.getWidth(), validSizeToCheck.getHeight())) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Detected that the device does not support a size ");
                        sb.append(validSizeToCheck);
                        sb.append(" that should be valid in widths/heights = ");
                        sb.append(videoEncoderInfo.getSupportedWidths());
                        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                        sb.append(videoEncoderInfo.getSupportedHeights());
                        androidx.camera.core.Logger.w("VideoEncoderInfoWrapper", sb.toString());
                    }
                }
                videoEncoderInfo = new androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper(videoEncoderInfo, null);
            }
            if (validSizeToCheck != null && (videoEncoderInfo instanceof androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper)) {
                androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper.access$addExtraSupportedSize((androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper) videoEncoderInfo, validSizeToCheck);
            }
            return videoEncoderInfo;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$addExtraSupportedSize(androidx.camera.video.internal.workaround.VideoEncoderInfoWrapper videoEncoderInfoWrapper, android.util.Size size) {
        videoEncoderInfoWrapper.getHighSpeedVideoFpsRanges.add(size);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.video.internal.encoder.VideoEncoderInfo from(androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo, android.util.Size size) {
        return INSTANCE.from(videoEncoderInfo, size);
    }

    public /* synthetic */ VideoEncoderInfoWrapper(androidx.camera.video.internal.encoder.VideoEncoderInfo videoEncoderInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(videoEncoderInfo);
    }
}
