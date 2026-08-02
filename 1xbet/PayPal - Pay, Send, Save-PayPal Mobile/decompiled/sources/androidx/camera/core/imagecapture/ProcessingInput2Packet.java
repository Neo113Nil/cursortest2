package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class ProcessingInput2Packet implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> {
    ProcessingInput2Packet() {
    }

    @Override // androidx.camera.core.processing.Operation
    public final /* synthetic */ androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) throws androidx.camera.core.ImageCaptureException {
        return Camera2StreamConfigurationMap(inputPacket);
    }

    private static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> Camera2StreamConfigurationMap(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.impl.utils.Exif createFromImageProxy;
        androidx.camera.core.impl.CameraCaptureResult create;
        androidx.camera.core.impl.CameraCaptureResult create2;
        androidx.camera.core.ImageProxy highSpeedVideoFpsRangesFor = inputPacket.getHighSpeedVideoFpsRangesFor();
        androidx.camera.core.imagecapture.ProcessingRequest highSpeedVideoSizes = inputPacket.getHighSpeedVideoSizes();
        if (androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(highSpeedVideoFpsRangesFor.getFormat())) {
            try {
                createFromImageProxy = androidx.camera.core.impl.utils.Exif.createFromImageProxy(highSpeedVideoFpsRangesFor);
                highSpeedVideoFpsRangesFor.getPlanes()[0].getBuffer().rewind();
            } catch (java.io.IOException e) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            createFromImageProxy = null;
        }
        if (androidx.camera.core.imagecapture.ImagePipeline.getHighSpeedVideoSizes.shouldUseExifOrientation(highSpeedVideoFpsRangesFor)) {
            androidx.core.util.Preconditions.checkNotNull(createFromImageProxy, "JPEG image must have exif.");
            android.util.Size size = new android.util.Size(highSpeedVideoFpsRangesFor.getWidth(), highSpeedVideoFpsRangesFor.getHeight());
            int rotation = highSpeedVideoSizes.getInputFormats - createFromImageProxy.getRotation();
            android.util.Size size2 = androidx.camera.core.impl.utils.TransformUtils.is90or270(androidx.camera.core.impl.utils.TransformUtils.within360(rotation)) ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
            android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new android.graphics.RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), rotation);
            android.graphics.RectF rectF = new android.graphics.RectF(highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
            rectToRect.mapRect(rectF);
            rectF.sort();
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.round(rect);
            int rotation2 = createFromImageProxy.getRotation();
            android.graphics.Matrix matrix = new android.graphics.Matrix(highSpeedVideoSizes.getHighSpeedVideoSizesFor);
            matrix.postConcat(rectToRect);
            if (highSpeedVideoFpsRangesFor.getImageInfo() instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo) {
                create2 = ((androidx.camera.core.internal.CameraCaptureResultImageInfo) highSpeedVideoFpsRangesFor.getImageInfo()).getCameraCaptureResult();
            } else {
                create2 = androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult.create();
            }
            return androidx.camera.core.processing.Packet.of(highSpeedVideoFpsRangesFor, createFromImageProxy, size2, rect, rotation2, matrix, create2);
        }
        android.graphics.Rect rect2 = highSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        int i = highSpeedVideoSizes.getInputFormats;
        android.graphics.Matrix matrix2 = highSpeedVideoSizes.getHighSpeedVideoSizesFor;
        if (highSpeedVideoFpsRangesFor.getImageInfo() instanceof androidx.camera.core.internal.CameraCaptureResultImageInfo) {
            create = ((androidx.camera.core.internal.CameraCaptureResultImageInfo) highSpeedVideoFpsRangesFor.getImageInfo()).getCameraCaptureResult();
        } else {
            create = androidx.camera.core.impl.CameraCaptureResult.EmptyCameraCaptureResult.create();
        }
        return androidx.camera.core.processing.Packet.of(highSpeedVideoFpsRangesFor, createFromImageProxy, rect2, i, matrix2, create);
    }
}
