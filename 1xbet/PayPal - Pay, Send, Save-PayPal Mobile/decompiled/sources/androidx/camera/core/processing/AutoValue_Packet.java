package androidx.camera.core.processing;

/* loaded from: classes6.dex */
final class AutoValue_Packet<T> extends androidx.camera.core.processing.Packet<T> {
    private final androidx.camera.core.impl.CameraCaptureResult Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.utils.Exif getHighSpeedVideoFpsRanges;
    private final android.graphics.Rect getHighSpeedVideoFpsRangesFor;
    private final T getHighSpeedVideoSizes;
    private final android.graphics.Matrix getHighSpeedVideoSizesFor;
    private final int getOutputFormats;
    private final android.util.Size getOutputMinFrameDuration;

    AutoValue_Packet(T t, androidx.camera.core.impl.utils.Exif exif, int i, android.util.Size size, android.graphics.Rect rect, int i2, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        if (t == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRanges = exif;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.getOutputMinFrameDuration = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.getHighSpeedVideoFpsRangesFor = rect;
        this.getOutputFormats = i2;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.getHighSpeedVideoSizesFor = matrix;
        if (cameraCaptureResult == null) {
            throw new java.lang.NullPointerException("Null cameraCaptureResult");
        }
        this.Camera2StreamConfigurationMap = cameraCaptureResult;
    }

    @Override // androidx.camera.core.processing.Packet
    public final T getData() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.processing.Packet
    public final androidx.camera.core.impl.utils.Exif getExif() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int getFormat() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.processing.Packet
    public final android.util.Size getSize() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.processing.Packet
    public final android.graphics.Rect getCropRect() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.processing.Packet
    public final int getRotationDegrees() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.processing.Packet
    public final android.graphics.Matrix getSensorToBufferTransform() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.processing.Packet
    public final androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Packet{data=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", exif=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", format=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", size=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", cropRect=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", rotationDegrees=");
        sb.append(this.getOutputFormats);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", cameraCaptureResult=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.Packet)) {
            return false;
        }
        androidx.camera.core.processing.Packet packet = (androidx.camera.core.processing.Packet) obj;
        if (!this.getHighSpeedVideoSizes.equals(packet.getData())) {
            return false;
        }
        androidx.camera.core.impl.utils.Exif exif = this.getHighSpeedVideoFpsRanges;
        if (exif == null) {
            if (packet.getExif() != null) {
                return false;
            }
        } else if (!exif.equals(packet.getExif())) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI == packet.getFormat() && this.getOutputMinFrameDuration.equals(packet.getSize()) && this.getHighSpeedVideoFpsRangesFor.equals(packet.getCropRect()) && this.getOutputFormats == packet.getRotationDegrees() && this.getHighSpeedVideoSizesFor.equals(packet.getSensorToBufferTransform()) && this.Camera2StreamConfigurationMap.equals(packet.getCameraCaptureResult());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoSizes.hashCode();
        androidx.camera.core.impl.utils.Exif exif = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = exif == null ? 0 : exif.hashCode();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode3 = this.getOutputMinFrameDuration.hashCode();
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode()) * 1000003) ^ this.getOutputFormats) * 1000003) ^ this.getHighSpeedVideoSizesFor.hashCode()) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}
