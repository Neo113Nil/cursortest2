package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public class ImageUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = new com.google.android.gms.common.internal.GmsLogger("MLKitImageUtils", "");
    private static final com.google.mlkit.vision.common.internal.ImageUtils zzb = new com.google.mlkit.vision.common.internal.ImageUtils();

    public com.google.android.gms.dynamic.IObjectWrapper getImageDataWrapper(com.google.mlkit.vision.common.InputImage inputImage) throws com.google.mlkit.common.MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return com.google.android.gms.dynamic.ObjectWrapper.wrap((android.graphics.Bitmap) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return com.google.android.gms.dynamic.ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                int format2 = inputImage.getFormat();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported image format: ");
                sb.append(format2);
                throw new com.google.mlkit.common.MlKitException(sb.toString(), 3);
            }
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap((java.nio.ByteBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(com.google.mlkit.vision.common.InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(com.google.mlkit.vision.common.InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((android.graphics.Bitmap) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((java.nio.ByteBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((android.media.Image.Plane[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public android.graphics.Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        if (i3 == 0) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:9:0x0071, B:10:0x0086, B:14:0x00b6, B:16:0x00c0, B:21:0x008a, B:23:0x008e, B:24:0x0095, B:25:0x0099, B:26:0x00a0, B:27:0x00a4, B:28:0x00ab, B:36:0x006b, B:41:0x0056, B:57:0x00c5, B:58:0x00cc), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Bitmap zza(android.content.ContentResolver contentResolver, android.net.Uri uri) throws java.io.IOException {
        androidx.exifinterface.media.ExifInterface exifInterface;
        android.graphics.Matrix matrix;
        android.graphics.Bitmap createBitmap;
        try {
            android.graphics.Bitmap bitmap = android.provider.MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new java.io.IOException("The image Uri could not be resolved.");
            }
            int i = 0;
            android.graphics.Matrix matrix2 = null;
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
                    if (openInputStream != null) {
                        try {
                            exifInterface = new androidx.exifinterface.media.ExifInterface(openInputStream);
                        } finally {
                            try {
                                openInputStream.close();
                            } catch (java.lang.Throwable e) {
                                try {
                                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, e);
                                } catch (java.lang.Exception unused) {
                                }
                            }
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (openInputStream != null) {
                        try {
                        } catch (java.io.IOException e2) {
                            zza.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))), e);
                            if (exifInterface != null) {
                            }
                            android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            switch (i) {
                            }
                            matrix = matrix3;
                            return matrix == null ? bitmap : bitmap;
                        }
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    i = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
                }
            }
            android.graphics.Matrix matrix32 = new android.graphics.Matrix();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            switch (i) {
                case 2:
                    matrix2 = new android.graphics.Matrix();
                    matrix2.postScale(-1.0f, 1.0f);
                    matrix = matrix2;
                    break;
                case 3:
                    matrix32.postRotate(180.0f);
                    break;
                case 4:
                    matrix32.postScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix32.postRotate(90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix32.postRotate(90.0f);
                    break;
                case 7:
                    matrix32.postRotate(-90.0f);
                    matrix32.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix32.postRotate(-90.0f);
                    break;
                default:
                    matrix = matrix2;
                    break;
            }
            matrix = matrix32;
            if (matrix == null && bitmap != (createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true))) {
                bitmap.recycle();
                return createBitmap;
            }
        } catch (java.io.FileNotFoundException e4) {
            zza.e("MLKitImageUtils", "Could not open file: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))), e4);
            throw e4;
        }
    }

    public static com.google.mlkit.vision.common.internal.ImageUtils getInstance() {
        return zzb;
    }

    private ImageUtils() {
    }
}
