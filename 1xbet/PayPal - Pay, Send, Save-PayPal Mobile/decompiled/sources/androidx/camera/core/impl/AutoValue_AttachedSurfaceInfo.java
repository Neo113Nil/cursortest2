package androidx.camera.core.impl;

/* loaded from: classes6.dex */
final class AutoValue_AttachedSurfaceInfo extends androidx.camera.core.impl.AttachedSurfaceInfo {
    private final androidx.camera.core.impl.Config Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.DynamicRange getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.SurfaceConfig getHighSpeedVideoSizesFor;
    private final android.util.Range<java.lang.Integer> getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final android.util.Size getOutputFormats;
    private final boolean getOutputMinFrameDuration;

    AutoValue_AttachedSurfaceInfo(androidx.camera.core.impl.SurfaceConfig surfaceConfig, int i, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list, androidx.camera.core.impl.Config config, int i2, android.util.Range<java.lang.Integer> range, boolean z, int i3) {
        if (surfaceConfig == null) {
            throw new java.lang.NullPointerException("Null surfaceConfig");
        }
        this.getHighSpeedVideoSizesFor = surfaceConfig;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.getOutputFormats = size;
        if (dynamicRange == null) {
            throw new java.lang.NullPointerException("Null dynamicRange");
        }
        this.getHighSpeedVideoSizes = dynamicRange;
        if (list == null) {
            throw new java.lang.NullPointerException("Null captureTypes");
        }
        this.getHighSpeedVideoFpsRanges = list;
        this.Camera2StreamConfigurationMap = config;
        this.getInputSizeshNQ4ISI = i2;
        if (range == null) {
            throw new java.lang.NullPointerException("Null targetFrameRate");
        }
        this.getInputFormats = range;
        this.getOutputMinFrameDuration = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final androidx.camera.core.impl.SurfaceConfig getSurfaceConfig() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final int getImageFormat() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final android.util.Size getSize() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final androidx.camera.core.impl.Config getImplementationOptions() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final int getSessionType() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final boolean isStrictFrameRateRequired() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.impl.AttachedSurfaceInfo
    public final int getCustomMaxFrameRate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", imageFormat=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", size=");
        sb.append(this.getOutputFormats);
        sb.append(", dynamicRange=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", captureTypes=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", implementationOptions=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", sessionType=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", targetFrameRate=");
        sb.append(this.getInputFormats);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", customMaxFrameRate=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.AttachedSurfaceInfo)) {
            return false;
        }
        androidx.camera.core.impl.AttachedSurfaceInfo attachedSurfaceInfo = (androidx.camera.core.impl.AttachedSurfaceInfo) obj;
        if (!this.getHighSpeedVideoSizesFor.equals(attachedSurfaceInfo.getSurfaceConfig()) || this.getHighSpeedVideoFpsRangesFor != attachedSurfaceInfo.getImageFormat() || !this.getOutputFormats.equals(attachedSurfaceInfo.getSize()) || !this.getHighSpeedVideoSizes.equals(attachedSurfaceInfo.getDynamicRange()) || !this.getHighSpeedVideoFpsRanges.equals(attachedSurfaceInfo.getCaptureTypes())) {
            return false;
        }
        androidx.camera.core.impl.Config config = this.Camera2StreamConfigurationMap;
        if (config == null) {
            if (attachedSurfaceInfo.getImplementationOptions() != null) {
                return false;
            }
        } else if (!config.equals(attachedSurfaceInfo.getImplementationOptions())) {
            return false;
        }
        return this.getInputSizeshNQ4ISI == attachedSurfaceInfo.getSessionType() && this.getInputFormats.equals(attachedSurfaceInfo.getTargetFrameRate()) && this.getOutputMinFrameDuration == attachedSurfaceInfo.isStrictFrameRateRequired() && this.getHighResolutionOutputSizeshNQ4ISI == attachedSurfaceInfo.getCustomMaxFrameRate();
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizesFor.hashCode();
        int i = this.getHighSpeedVideoFpsRangesFor;
        int hashCode2 = this.getOutputFormats.hashCode();
        int hashCode3 = this.getHighSpeedVideoSizes.hashCode();
        int hashCode4 = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.camera.core.impl.Config config = this.Camera2StreamConfigurationMap;
        int hashCode5 = config == null ? 0 : config.hashCode();
        int i2 = this.getInputSizeshNQ4ISI;
        return ((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ i2) * 1000003) ^ this.getInputFormats.hashCode()) * 1000003) ^ (this.getOutputMinFrameDuration ? 1231 : 1237)) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
