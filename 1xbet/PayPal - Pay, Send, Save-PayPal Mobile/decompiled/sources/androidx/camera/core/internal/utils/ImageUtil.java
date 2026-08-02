package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public final class ImageUtil {
    public static final int DEFAULT_RGBA_PIXEL_STRIDE = 4;

    public static boolean isJpegFormats(int i) {
        return i == 256 || i == 4101;
    }

    public static boolean isRawFormats(int i) {
        return i == 32;
    }

    public static boolean shouldCropImage(int i, int i2, int i3, int i4) {
        return (i == i3 && i2 == i4) ? false : true;
    }

    private ImageUtil() {
    }

    public static android.graphics.Bitmap createBitmapFromImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        int format = imageProxy.getFormat();
        if (format == 1) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            imageProxy.getPlanes()[0].getBuffer().rewind();
            androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride());
            return createBitmap;
        }
        if (format == 35) {
            return androidx.camera.core.ImageProcessingUtil.convertYUVToBitmap(imageProxy);
        }
        if (format != 256 && format != 4101) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect image format of the input image proxy: ");
            sb.append(imageProxy.getFormat());
            sb.append(", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] jpegImageToJpegByteArray = jpegImageToJpegByteArray(imageProxy);
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(jpegImageToJpegByteArray, 0, jpegImageToJpegByteArray.length, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new java.lang.UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static android.graphics.Bitmap createBitmapFromPlane(androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr, int i, int i2) {
        androidx.core.util.Preconditions.checkArgument(planeProxyArr.length == 1, "Expect a single plane");
        androidx.core.util.Preconditions.checkArgument(planeProxyArr[0].getPixelStride() == 4, "Expect pixelStride=4");
        androidx.core.util.Preconditions.checkArgument(planeProxyArr[0].getRowStride() == i * 4, "Expect rowStride=width*4");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        planeProxyArr[0].getBuffer().rewind();
        androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, planeProxyArr[0].getBuffer(), planeProxyArr[0].getRowStride());
        return createBitmap;
    }

    public static android.graphics.Bitmap rotateBitmap(android.graphics.Bitmap bitmap, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(i);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static java.nio.ByteBuffer createDirectByteBuffer(android.graphics.Bitmap bitmap) {
        androidx.core.util.Preconditions.checkArgument(bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        androidx.camera.core.ImageProcessingUtil.copyBitmapToByteBuffer(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static float[] sizeToVertexes(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float min(float f, float f2, float f3, float f4) {
        return java.lang.Math.min(java.lang.Math.min(f, f2), java.lang.Math.min(f3, f4));
    }

    public static android.util.Rational getRotatedAspectRatio(int i, android.util.Rational rational) {
        if (i == 90 || i == 270) {
            return rational == null ? rational : new android.util.Rational(rational.getDenominator(), rational.getNumerator());
        }
        return new android.util.Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy) {
        if (!isJpegFormats(imageProxy.getFormat())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect image format of the input image proxy: ");
            sb.append(imageProxy.getFormat());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public static byte[] jpegImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy, android.graphics.Rect rect, int i) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        if (!isJpegFormats(imageProxy.getFormat())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect image format of the input image proxy: ");
            sb.append(imageProxy.getFormat());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return getHighSpeedVideoFpsRangesFor(jpegImageToJpegByteArray(imageProxy), rect, i);
    }

    public static byte[] yuvImageToJpegByteArray(androidx.camera.core.ImageProxy imageProxy, android.graphics.Rect rect, int i, int i2) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        if (imageProxy.getFormat() != 35) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect image format of the input image proxy: ");
            sb.append(imageProxy.getFormat());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(yuv_420_888toNv21(imageProxy), 17, imageProxy.getWidth(), imageProxy.getHeight(), null);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        androidx.camera.core.impl.utils.ExifOutputStream exifOutputStream = new androidx.camera.core.impl.utils.ExifOutputStream(byteArrayOutputStream, androidx.camera.core.impl.utils.ExifData.create(imageProxy, i2));
        if (rect == null) {
            rect = new android.graphics.Rect(0, 0, imageProxy.getWidth(), imageProxy.getHeight());
        }
        if (!yuvImage.compressToJpeg(rect, i, exifOutputStream)) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("YuvImage failed to encode jpeg.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] yuv_420_888toNv21(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        androidx.camera.core.ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        java.nio.ByteBuffer buffer = planeProxy.getBuffer();
        java.nio.ByteBuffer buffer2 = planeProxy2.getBuffer();
        java.nio.ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[((imageProxy.getWidth() * imageProxy.getHeight()) / 2) + remaining];
        int i = 0;
        for (int i2 = 0; i2 < imageProxy.getHeight(); i2++) {
            buffer.get(bArr, i, imageProxy.getWidth());
            i += imageProxy.getWidth();
            buffer.position(java.lang.Math.min(remaining, (buffer.position() - imageProxy.getWidth()) + planeProxy.getRowStride()));
        }
        int height = imageProxy.getHeight() / 2;
        int width = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i3 = 0; i3 < height; i3++) {
            buffer3.get(bArr2, 0, java.lang.Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, java.lang.Math.min(rowStride2, buffer2.remaining()));
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < width) {
                bArr[i] = bArr2[i5];
                bArr[i + 1] = bArr3[i6];
                i5 += pixelStride;
                i6 += pixelStride2;
                i4++;
                i += 2;
            }
        }
        return bArr;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, android.graphics.Rect rect, int i) throws androidx.camera.core.internal.utils.ImageUtil.CodecFailedException {
        try {
            android.graphics.BitmapRegionDecoder newInstance = android.graphics.BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            android.graphics.Bitmap decodeRegion = newInstance.decodeRegion(rect, new android.graphics.BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion == null) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            if (!decodeRegion.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream)) {
                throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Encode bitmap failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED);
            }
            decodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed.", androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        } catch (java.lang.IllegalArgumentException e) {
            throw new androidx.camera.core.internal.utils.ImageUtil.CodecFailedException("Decode byte array failed with illegal argument.".concat(java.lang.String.valueOf(e)), androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static boolean isAspectRatioValid(android.util.Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean isAspectRatioValid(android.util.Size size, android.util.Rational rational) {
        if (rational == null || rational.floatValue() <= 0.0f) {
            return false;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return ((height == java.lang.Math.round((((float) width) / numerator) * denominator) && width == java.lang.Math.round((((float) height) / denominator) * numerator)) || rational.isNaN()) ? false : true;
    }

    public static android.graphics.Rect computeCropRectFromAspectRatio(android.util.Size size, android.util.Rational rational) {
        int i;
        if (!isAspectRatioValid(rational)) {
            androidx.camera.core.Logger.w("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f3) {
            int round = java.lang.Math.round((f / numerator) * denominator);
            i = (height - round) / 2;
            height = round;
        } else {
            int round2 = java.lang.Math.round((f2 / denominator) * numerator);
            int i3 = (width - round2) / 2;
            width = round2;
            i = 0;
            i2 = i3;
        }
        return new android.graphics.Rect(i2, i, width + i2, height + i);
    }

    public static android.graphics.Rect computeCropRectFromDispatchInfo(android.graphics.Rect rect, int i, android.util.Size size, int i2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(i2 - i);
        float[] sizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(sizeToVertexes);
        matrix.postTranslate(-min(sizeToVertexes[0], sizeToVertexes[2], sizeToVertexes[4], sizeToVertexes[6]), -min(sizeToVertexes[1], sizeToVertexes[3], sizeToVertexes[5], sizeToVertexes[7]));
        matrix.invert(matrix);
        android.graphics.RectF rectF = new android.graphics.RectF();
        matrix.mapRect(rectF, new android.graphics.RectF(rect));
        rectF.sort();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        rectF.round(rect2);
        return rect2;
    }

    public static boolean shouldCropImage(androidx.camera.core.ImageProxy imageProxy) {
        return shouldCropImage(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getCropRect().width(), imageProxy.getCropRect().height());
    }

    public static final class CodecFailedException extends java.lang.Exception {
        private final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType Camera2StreamConfigurationMap;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        CodecFailedException(java.lang.String str, androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType failureType) {
            super(str);
            this.Camera2StreamConfigurationMap = failureType;
        }

        public final androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType getFailureType() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
