package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class Image2Bitmap implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, android.graphics.Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    public android.graphics.Bitmap apply(androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> packet) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        android.graphics.Bitmap rotateBitmap;
        androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = null;
        try {
            try {
                int format = packet.getFormat();
                if (format == 35) {
                    androidx.camera.core.ImageProxy data = packet.getData();
                    boolean z = packet.getRotationDegrees() % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 0;
                    safeCloseImageReaderProxy = new androidx.camera.core.SafeCloseImageReaderProxy(androidx.camera.core.ImageReaderProxys.createIsolatedReader(z ? data.getHeight() : data.getWidth(), z ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        androidx.camera.core.ImageProxy convertYUVToRGB = androidx.camera.core.ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy, java.nio.ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (convertYUVToRGB == null) {
                            throw new androidx.camera.core.ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        android.graphics.Bitmap createBitmapFromImageProxy = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromImageProxy(convertYUVToRGB);
                        convertYUVToRGB.close();
                        rotateBitmap = createBitmapFromImageProxy;
                        safeCloseImageReaderProxy2 = safeCloseImageReaderProxy;
                    } catch (java.lang.UnsupportedOperationException e) {
                        e = e;
                        java.lang.String str = packet.getFormat() == 35 ? "YUV" : "JPEG";
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't convert ");
                        sb.append(str);
                        sb.append(" to bitmap");
                        throw new androidx.camera.core.ImageCaptureException(0, sb.toString(), e);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (safeCloseImageReaderProxy != null) {
                            safeCloseImageReaderProxy.close();
                        }
                        throw th;
                    }
                } else if (format == 256 || format == 4101) {
                    androidx.camera.core.ImageProxy data2 = packet.getData();
                    android.graphics.Bitmap createBitmapFromImageProxy2 = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    rotateBitmap = androidx.camera.core.internal.utils.ImageUtil.rotateBitmap(createBitmapFromImageProxy2, packet.getRotationDegrees());
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid postview image format : ");
                    sb2.append(packet.getFormat());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                if (safeCloseImageReaderProxy2 != null) {
                    safeCloseImageReaderProxy2.close();
                }
                return rotateBitmap;
            } catch (java.lang.UnsupportedOperationException e2) {
                e = e2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            safeCloseImageReaderProxy = null;
        }
    }
}
