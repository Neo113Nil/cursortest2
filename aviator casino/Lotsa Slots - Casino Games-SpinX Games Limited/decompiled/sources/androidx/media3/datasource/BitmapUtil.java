package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class BitmapUtil {
    private BitmapUtil() {
    }

    public static android.graphics.Bitmap decode(byte[] bArr, int i, android.graphics.BitmapFactory.Options options) throws java.io.IOException {
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (decodeByteArray == null) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Could not decode image data", new java.lang.IllegalStateException());
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(byteArrayInputStream);
            byteArrayInputStream.close();
            int rotationDegrees = exifInterface.getRotationDegrees();
            if (rotationDegrees == 0) {
                return decodeByteArray;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(rotationDegrees);
            return android.graphics.Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
