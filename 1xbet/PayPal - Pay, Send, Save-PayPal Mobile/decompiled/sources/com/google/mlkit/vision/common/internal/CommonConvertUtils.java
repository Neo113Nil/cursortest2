package com.google.mlkit.vision.common.internal;

/* loaded from: classes.dex */
public class CommonConvertUtils {
    public static com.google.mlkit.vision.common.InputImage convertMlImagetoInputImage(com.google.android.odml.image.MlImage mlImage) {
        com.google.mlkit.vision.common.InputImage fromBitmap;
        com.google.android.odml.image.ImageProperties imageProperties = mlImage.getContainedImageProperties().get(0);
        int storageType = imageProperties.getStorageType();
        if (storageType != 1) {
            fromBitmap = null;
            if (storageType == 2) {
                java.nio.ByteBuffer extract = com.google.android.odml.image.ByteBufferExtractor.extract(mlImage);
                int imageFormat = imageProperties.getImageFormat();
                java.lang.Integer valueOf = imageFormat != 4 ? imageFormat != 5 ? null : java.lang.Integer.valueOf(com.google.mlkit.vision.common.InputImage.IMAGE_FORMAT_YV12) : 17;
                if (valueOf != null) {
                    zza(valueOf.intValue(), 3, android.os.SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), extract.limit(), mlImage.getRotation());
                    fromBitmap = com.google.mlkit.vision.common.InputImage.fromByteBuffer(extract, mlImage.getWidth(), mlImage.getHeight(), mlImage.getRotation(), valueOf.intValue());
                }
            } else if (storageType == 3) {
                android.media.Image extract2 = com.google.android.odml.image.MediaImageExtractor.extract(mlImage);
                zza(extract2.getFormat(), 5, android.os.SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), extract2.getFormat() == 256 ? extract2.getPlanes()[0].getBuffer().limit() : (extract2.getPlanes()[0].getBuffer().limit() * 3) / 2, mlImage.getRotation());
                fromBitmap = com.google.mlkit.vision.common.InputImage.fromMediaImage(extract2, mlImage.getRotation());
            }
        } else {
            android.graphics.Bitmap extract3 = com.google.android.odml.image.BitmapExtractor.extract(mlImage);
            zza(-1, 1, android.os.SystemClock.elapsedRealtime(), mlImage.getHeight(), mlImage.getWidth(), extract3.getAllocationByteCount(), mlImage.getRotation());
            fromBitmap = com.google.mlkit.vision.common.InputImage.fromBitmap(extract3, mlImage.getRotation());
        }
        if (fromBitmap != null) {
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza();
        }
        return fromBitmap;
    }

    public static int convertToAndroidImageFormat(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 35;
            if (i != 35) {
                i2 = com.google.mlkit.vision.common.InputImage.IMAGE_FORMAT_YV12;
                if (i != 842094169) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static int convertToMVRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid rotation: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static void transformPointArray(android.graphics.Point[] pointArr, android.graphics.Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArr.length; i++) {
            int i2 = i + i;
            fArr[i2] = pointArr[i].x;
            fArr[i2 + 1] = pointArr[i].y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            int i4 = i3 + i3;
            pointArr[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }

    public static void transformPointF(android.graphics.PointF pointF, android.graphics.Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void transformPointList(java.util.List<android.graphics.PointF> list, android.graphics.Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i = 0; i < list.size(); i++) {
            int i2 = i + i;
            fArr[i2] = list.get(i).x;
            fArr[i2 + 1] = list.get(i).y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < list.size(); i3++) {
            int i4 = i3 + i3;
            list.get(i3).set(fArr[i4], fArr[i4 + 1]);
        }
    }

    public static void transformRect(android.graphics.Rect rect, android.graphics.Matrix matrix) {
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void zza(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        com.google.android.gms.internal.mlkit_vision_common.zzmu.zzb(com.google.android.gms.internal.mlkit_vision_common.zzms.zzb("vision-common"), i, i2, j, i3, i4, i5, i6);
    }
}
