package com.google.mlkit.vision.common;

/* loaded from: classes.dex */
public class InputImage implements com.google.mlkit.common.sdkinternal.MLTaskInput {
    public static final int IMAGE_FORMAT_BITMAP = -1;
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YUV_420_888 = 35;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    private volatile android.graphics.Bitmap zza;
    private volatile java.nio.ByteBuffer zzb;
    private volatile com.google.mlkit.vision.common.zzb zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final android.graphics.Matrix zzh;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ImageFormat {
    }

    private InputImage(android.graphics.Bitmap bitmap, int i) {
        this.zza = (android.graphics.Bitmap) com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmap);
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i);
        this.zzf = i;
        this.zzg = -1;
        this.zzh = null;
    }

    public static com.google.mlkit.vision.common.InputImage fromBitmap(android.graphics.Bitmap bitmap, int i) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.google.mlkit.vision.common.InputImage inputImage = new com.google.mlkit.vision.common.InputImage(bitmap, i);
        zzc(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
        return inputImage;
    }

    public static com.google.mlkit.vision.common.InputImage fromByteArray(byte[] bArr, int i, int i2, int i3, int i4) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.google.mlkit.vision.common.InputImage inputImage = new com.google.mlkit.vision.common.InputImage(java.nio.ByteBuffer.wrap((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr)), i, i2, i3, i4);
        zzc(i4, 2, elapsedRealtime, i2, i, bArr.length, i3);
        return inputImage;
    }

    public static com.google.mlkit.vision.common.InputImage fromByteBuffer(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.google.mlkit.vision.common.InputImage inputImage = new com.google.mlkit.vision.common.InputImage(byteBuffer, i, i2, i3, i4);
        zzc(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return inputImage;
    }

    public static com.google.mlkit.vision.common.InputImage fromFilePath(android.content.Context context, android.net.Uri uri) throws java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Please provide a valid Context");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.graphics.Bitmap zza = com.google.mlkit.vision.common.internal.ImageUtils.getInstance().zza(context.getContentResolver(), uri);
        com.google.mlkit.vision.common.InputImage inputImage = new com.google.mlkit.vision.common.InputImage(zza, 0);
        zzc(-1, 4, elapsedRealtime, zza.getHeight(), zza.getWidth(), zza.getAllocationByteCount(), 0);
        return inputImage;
    }

    public static com.google.mlkit.vision.common.InputImage fromMediaImage(android.media.Image image, int i) {
        return zzb(image, i, null);
    }

    private static int zza(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180) {
            if (i == 270) {
                i = 270;
            } else {
                z = false;
            }
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i;
    }

    private static com.google.mlkit.vision.common.InputImage zzb(android.media.Image image, int i, android.graphics.Matrix matrix) {
        com.google.mlkit.vision.common.InputImage inputImage;
        int limit;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(image, "Please provide a valid image");
        zza(i);
        boolean z = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Only JPEG and YUV_420_888 are supported now");
        android.media.Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            inputImage = new com.google.mlkit.vision.common.InputImage(com.google.mlkit.vision.common.internal.ImageConvertUtils.getInstance().convertJpegToUpRightBitmap(image, i), 0);
        } else {
            for (android.media.Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            inputImage = new com.google.mlkit.vision.common.InputImage(image, image.getWidth(), image.getHeight(), i, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i2 = limit;
        com.google.mlkit.vision.common.InputImage inputImage2 = inputImage;
        zzc(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i2, i);
        return inputImage2;
    }

    private static void zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        com.google.android.gms.internal.mlkit_vision_common.zzmu.zza(com.google.android.gms.internal.mlkit_vision_common.zzms.zzb("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    public android.media.Image getMediaImage() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zza();
    }

    public android.media.Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return this.zzc.zzb();
    }

    public static com.google.mlkit.vision.common.InputImage fromMediaImage(android.media.Image image, int i, android.graphics.Matrix matrix) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return zzb(image, i, matrix);
    }

    private InputImage(android.media.Image image, int i, int i2, int i3, android.graphics.Matrix matrix) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(image);
        this.zzc = new com.google.mlkit.vision.common.zzb(image);
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = 35;
        this.zzh = matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InputImage(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        boolean z;
        if (i4 != 842094169) {
            if (i4 != 17) {
                z = false;
                com.google.android.gms.common.internal.Preconditions.checkArgument(z);
                this.zzb = (java.nio.ByteBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(byteBuffer);
                com.google.android.gms.common.internal.Preconditions.checkArgument(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
                byteBuffer.rewind();
                this.zzd = i;
                this.zze = i2;
                zza(i3);
                this.zzf = i3;
                this.zzg = i4;
                this.zzh = null;
            }
            i4 = 17;
        }
        z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(z);
        this.zzb = (java.nio.ByteBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(byteBuffer);
        com.google.android.gms.common.internal.Preconditions.checkArgument(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = i4;
        this.zzh = null;
    }

    public int getWidth() {
        return this.zzd;
    }

    public int getRotationDegrees() {
        return this.zzf;
    }

    public int getHeight() {
        return this.zze;
    }

    public int getFormat() {
        return this.zzg;
    }

    public android.graphics.Matrix getCoordinatesMatrix() {
        return this.zzh;
    }

    public java.nio.ByteBuffer getByteBuffer() {
        return this.zzb;
    }

    public android.graphics.Bitmap getBitmapInternal() {
        return this.zza;
    }
}
