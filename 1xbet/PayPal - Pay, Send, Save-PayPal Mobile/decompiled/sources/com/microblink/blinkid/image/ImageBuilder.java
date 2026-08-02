package com.microblink.blinkid.image;

/* loaded from: classes10.dex */
public class ImageBuilder {
    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
    }

    public static com.microblink.blinkid.image.Image buildImageFromJpegBytes(byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("Failed to create native image. Jpeg bytes null.");
        }
        long buildNativeImageFromJpegBytes = buildNativeImageFromJpegBytes(bArr, bArr.length, i);
        if (buildNativeImageFromJpegBytes != 0) {
            return buildImageFromNativeContext(buildNativeImageFromJpegBytes, true, bArr);
        }
        throw new java.lang.RuntimeException("Failed to create native image. Please check log for details.");
    }

    public static com.microblink.blinkid.image.Image buildImageFromNativeContext(long j, boolean z, java.lang.Object obj) {
        com.microblink.blinkid.image.Image image = new com.microblink.blinkid.image.Image(j, z);
        image.getHighResolutionOutputSizeshNQ4ISI = obj;
        return image;
    }

    public static com.microblink.blinkid.image.InputImage buildInputImageFromByteBuffer(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, com.microblink.blinkid.hardware.orientation.Orientation orientation, java.lang.Object obj) {
        if (byteBuffer == null) {
            throw new java.lang.NullPointerException("Failed to create native image. ByteBuffer null.");
        }
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Buffer must be a direct buffer!");
        }
        if (byteBuffer.capacity() < i2 * i3) {
            throw new java.lang.IllegalArgumentException("Buffer capacity is less than required for given image dimensions.");
        }
        if (i3 < i * 4) {
            throw new java.lang.IllegalArgumentException("Row stride is less than required for given image width.");
        }
        long buildNativeInputImageFromByteBuffer = buildNativeInputImageFromByteBuffer(byteBuffer, i2, i3, i, orientation.intValue());
        if (buildNativeInputImageFromByteBuffer != 0) {
            return buildInputImageFromNativeContext(buildNativeInputImageFromByteBuffer, true, obj);
        }
        throw new java.lang.RuntimeException("Failed to create native image. Please check log for details.");
    }

    public static com.microblink.blinkid.image.InputImage buildInputImageFromCamera1NV21Frame(byte[] bArr, int i, int i2, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle) {
        int bitsPerPixel = ((i * i2) * android.graphics.ImageFormat.getBitsPerPixel(17)) / 8;
        if (bArr.length != bitsPerPixel) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong size of imageBuffer! For image size ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append(", the expected buffer size is ");
            sb.append(java.lang.Integer.toString(bitsPerPixel));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            throw new java.lang.IllegalArgumentException("Image orientation cannot be null nor unknown");
        }
        if (rectangle == null) {
            rectangle = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        }
        if (!rectangle.isRelative()) {
            throw new java.lang.IllegalArgumentException("Scanning region must be given in relative coordinates, i.e. following must hold true: x + width <= 1.f && y + height <= 1.f");
        }
        long buildNativeInputImageFromCamera1Buffer = buildNativeInputImageFromCamera1Buffer(i, i2, bArr, orientation.intValue(), rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        if (buildNativeInputImageFromCamera1Buffer != 0) {
            return buildInputImageFromNativeContext(buildNativeInputImageFromCamera1Buffer, true, bArr);
        }
        throw new java.lang.RuntimeException("Failed to create native image. Please check log for details.");
    }

    public static com.microblink.blinkid.image.InputImage buildInputImageFromCamera2Image(android.media.Image image, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle) {
        if (image.getFormat() != 35) {
            throw new java.lang.IllegalArgumentException("Camera2 image must be in YUV_420_888 format. Other formats are not supported!");
        }
        if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            throw new java.lang.IllegalArgumentException("Image orientation cannot be null nor unknown");
        }
        com.microblink.blinkid.geometry.Rectangle defaultROI = rectangle == null ? com.microblink.blinkid.geometry.Rectangle.getDefaultROI() : rectangle;
        if (!defaultROI.isRelative()) {
            throw new java.lang.IllegalArgumentException("Scanning region must be given in relative coordinates, i.e. following must hold true: x + width <= 1.f && y + height <= 1.f");
        }
        long buildNativeInputImageFromCamera2Image = buildNativeInputImageFromCamera2Image(image.getWidth(), image.getHeight(), orientation.intValue(), defaultROI.getX(), defaultROI.getY(), defaultROI.getWidth(), defaultROI.getHeight(), image.getPlanes()[0].getBuffer(), image.getPlanes()[0].getRowStride(), image.getPlanes()[0].getPixelStride(), image.getPlanes()[1].getBuffer(), image.getPlanes()[1].getRowStride(), image.getPlanes()[1].getPixelStride(), image.getPlanes()[2].getBuffer(), image.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride());
        if (buildNativeInputImageFromCamera2Image != 0) {
            return buildInputImageFromNativeContext(buildNativeInputImageFromCamera2Image, true, image);
        }
        throw new java.lang.RuntimeException("Failed to create native image. Please check log for details.");
    }

    public static com.microblink.blinkid.image.InputImage buildInputImageFromImage(com.microblink.blinkid.image.Image image) {
        long buildNativeInputImageFromImage = buildNativeInputImageFromImage(image.getHighSpeedVideoFpsRanges);
        if (buildNativeInputImageFromImage != 0) {
            return buildInputImageFromNativeContext(buildNativeInputImageFromImage, true, image);
        }
        throw new java.lang.RuntimeException("Failed to create native image. Please check log for details.");
    }

    public static com.microblink.blinkid.image.InputImage buildInputImageFromNativeContext(long j, boolean z, java.lang.Object obj) {
        com.microblink.blinkid.image.InputImage inputImage = new com.microblink.blinkid.image.InputImage(j, z);
        inputImage.lIlIIIIlIl = obj;
        return inputImage;
    }

    private static native long buildNativeImageFromJpegBytes(byte[] bArr, int i, int i2);

    private static native long buildNativeInputImageFromByteBuffer(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    private static native long buildNativeInputImageFromCamera1Buffer(int i, int i2, byte[] bArr, int i3, float f, float f2, float f3, float f4);

    private static native long buildNativeInputImageFromCamera2Image(int i, int i2, int i3, float f, float f2, float f3, float f4, java.nio.ByteBuffer byteBuffer, int i4, int i5, java.nio.ByteBuffer byteBuffer2, int i6, int i7, java.nio.ByteBuffer byteBuffer3, int i8, int i9);

    private static native long buildNativeInputImageFromImage(long j);
}
