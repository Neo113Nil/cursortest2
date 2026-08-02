package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class Image2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {
    private final androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector getHighSpeedVideoFpsRanges;

    Image2JpegBytes(androidx.camera.core.impl.Quirks quirks) {
        this.getHighSpeedVideoFpsRanges = new androidx.camera.core.internal.compat.workaround.JpegMetadataCorrector(quirks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.camera.core.processing.Operation
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public androidx.camera.core.processing.Packet<byte[]> apply(androidx.camera.core.imagecapture.Image2JpegBytes.In in) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<byte[]> highSpeedVideoFpsRanges;
        try {
            int format = in.getHighResolutionOutputSizeshNQ4ISI().getFormat();
            if (format == 35) {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(in);
            } else {
                if (format != 256 && format != 4101) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected format: ");
                    sb.append(format);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> highResolutionOutputSizeshNQ4ISI = in.getHighResolutionOutputSizeshNQ4ISI();
                highSpeedVideoFpsRanges = androidx.camera.core.processing.Packet.of(this.getHighSpeedVideoFpsRanges.jpegImageToJpegByteArray(highResolutionOutputSizeshNQ4ISI.getData()), (androidx.camera.core.impl.utils.Exif) java.util.Objects.requireNonNull(highResolutionOutputSizeshNQ4ISI.getExif()), format, highResolutionOutputSizeshNQ4ISI.getSize(), highResolutionOutputSizeshNQ4ISI.getCropRect(), highResolutionOutputSizeshNQ4ISI.getRotationDegrees(), highResolutionOutputSizeshNQ4ISI.getSensorToBufferTransform(), highResolutionOutputSizeshNQ4ISI.getCameraCaptureResult());
            }
            return highSpeedVideoFpsRanges;
        } finally {
            in.getHighResolutionOutputSizeshNQ4ISI().getData().close();
        }
    }

    private static androidx.camera.core.processing.Packet<byte[]> getHighSpeedVideoFpsRanges(androidx.camera.core.imagecapture.Image2JpegBytes.In in) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> highResolutionOutputSizeshNQ4ISI = in.getHighResolutionOutputSizeshNQ4ISI();
        androidx.camera.core.ImageProxy data = highResolutionOutputSizeshNQ4ISI.getData();
        android.graphics.Rect cropRect = highResolutionOutputSizeshNQ4ISI.getCropRect();
        try {
            byte[] yuvImageToJpegByteArray = androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(data, cropRect, in.getHighSpeedVideoSizes(), highResolutionOutputSizeshNQ4ISI.getRotationDegrees());
            return androidx.camera.core.processing.Packet.of(yuvImageToJpegByteArray, getHighSpeedVideoFpsRangesFor(yuvImageToJpegByteArray), 256, new android.util.Size(cropRect.width(), cropRect.height()), new android.graphics.Rect(0, 0, cropRect.width(), cropRect.height()), highResolutionOutputSizeshNQ4ISI.getRotationDegrees(), androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(highResolutionOutputSizeshNQ4ISI.getSensorToBufferTransform(), cropRect), highResolutionOutputSizeshNQ4ISI.getCameraCaptureResult());
        } catch (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to encode the image to JPEG.", e);
        }
    }

    private static androidx.camera.core.impl.utils.Exif getHighSpeedVideoFpsRangesFor(byte[] bArr) throws androidx.camera.core.ImageCaptureException {
        try {
            return androidx.camera.core.impl.utils.Exif.createFromInputStream(new java.io.ByteArrayInputStream(bArr));
        } catch (java.io.IOException e) {
            throw new androidx.camera.core.ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    static abstract class In {
        abstract androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoSizes();

        In() {
        }

        static androidx.camera.core.imagecapture.Image2JpegBytes.In Camera2StreamConfigurationMap(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet, int i) {
            return new androidx.camera.core.imagecapture.AutoValue_Image2JpegBytes_In(packet, i);
        }
    }
}
