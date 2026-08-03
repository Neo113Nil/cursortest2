package androidx.core.graphics;

/* loaded from: classes.dex */
public final class BitmapCompat {
    static int sizeAtStep(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }

    public static boolean hasMipMap(android.graphics.Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void setHasMipMap(android.graphics.Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }

    public static int getAllocationByteCount(android.graphics.Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a5, code lost:
    
        if (androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r10) == false) goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap bitmap, int i, int i2, android.graphics.Rect rect, boolean z) {
        int i3;
        double floor;
        double floor2;
        android.graphics.Bitmap bitmap2;
        int i4;
        int i5;
        android.graphics.Rect rect2;
        android.graphics.Bitmap bitmap3;
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new java.lang.IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        android.graphics.Bitmap copyBitmapIfHardware = android.os.Build.VERSION.SDK_INT >= 27 ? androidx.core.graphics.BitmapCompat.Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int width = rect != null ? rect.width() : bitmap.getWidth();
        int height = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        int i6 = rect != null ? rect.left : 0;
        int i7 = rect != null ? rect.top : 0;
        if (i6 == 0 && i7 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == copyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : copyBitmapIfHardware;
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setFilterBitmap(true);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.graphics.BitmapCompat.Api29Impl.setPaintBlendMode(paint);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        }
        if (width == i && height == i2) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, copyBitmapIfHardware.getConfig());
            new android.graphics.Canvas(createBitmap).drawBitmap(copyBitmapIfHardware, -i6, -i7, paint);
            return createBitmap;
        }
        double log = java.lang.Math.log(2.0d);
        if (f > 1.0f) {
            i3 = i6;
            floor = java.lang.Math.ceil(java.lang.Math.log(f) / log);
        } else {
            i3 = i6;
            floor = java.lang.Math.floor(java.lang.Math.log(f) / log);
        }
        int i8 = (int) floor;
        if (f2 > 1.0f) {
            floor2 = java.lang.Math.ceil(java.lang.Math.log(f2) / log);
        } else {
            floor2 = java.lang.Math.floor(java.lang.Math.log(f2) / log);
        }
        int i9 = (int) floor2;
        if (!z || android.os.Build.VERSION.SDK_INT < 27 || androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            bitmap2 = null;
            i4 = i3;
            i5 = 0;
        } else {
            android.graphics.Bitmap createBitmapWithSourceColorspace = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(i8 > 0 ? sizeAtStep(width, i, 1, i8) : width, i9 > 0 ? sizeAtStep(height, i2, 1, i9) : height, bitmap, true);
            new android.graphics.Canvas(createBitmapWithSourceColorspace).drawBitmap(copyBitmapIfHardware, -i3, -i7, paint);
            i7 = 0;
            i4 = 0;
            i5 = 1;
            bitmap2 = copyBitmapIfHardware;
            copyBitmapIfHardware = createBitmapWithSourceColorspace;
        }
        android.graphics.Rect rect3 = new android.graphics.Rect(i4, i7, width, height);
        android.graphics.Rect rect4 = new android.graphics.Rect();
        int i10 = i8;
        int i11 = i9;
        while (true) {
            if (i10 == 0 && i11 == 0) {
                break;
            }
            if (i10 < 0) {
                i10++;
            } else if (i10 > 0) {
                i10--;
            }
            if (i11 < 0) {
                i11++;
            } else if (i11 > 0) {
                i11--;
            }
            int i12 = i11;
            android.graphics.Paint paint2 = paint;
            android.graphics.Rect rect5 = rect3;
            rect4.set(0, 0, sizeAtStep(width, i, i10, i8), sizeAtStep(height, i2, i12, i9));
            boolean z2 = i10 == 0 && i12 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z) {
                    rect2 = rect4;
                    if (android.os.Build.VERSION.SDK_INT >= 27) {
                    }
                } else {
                    rect2 = rect4;
                }
                if (!z2 || (z3 && i5 == 0)) {
                    bitmap3 = bitmap2;
                    android.graphics.Rect rect6 = rect2;
                    new android.graphics.Canvas(bitmap3).drawBitmap(copyBitmapIfHardware, rect5, rect6, paint2);
                    rect5.set(rect6);
                    i11 = i12;
                    android.graphics.Bitmap bitmap4 = copyBitmapIfHardware;
                    copyBitmapIfHardware = bitmap3;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint = paint2;
                    bitmap2 = bitmap4;
                }
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int sizeAtStep = sizeAtStep(width, i, i10 > 0 ? i5 : i10, i8);
            int sizeAtStep2 = sizeAtStep(height, i2, i12 > 0 ? i5 : i12, i9);
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                bitmap3 = androidx.core.graphics.BitmapCompat.Api27Impl.createBitmapWithSourceColorspace(sizeAtStep, sizeAtStep2, bitmap, z && !z2);
            } else {
                bitmap3 = android.graphics.Bitmap.createBitmap(sizeAtStep, sizeAtStep2, copyBitmapIfHardware.getConfig());
            }
            android.graphics.Rect rect62 = rect2;
            new android.graphics.Canvas(bitmap3).drawBitmap(copyBitmapIfHardware, rect5, rect62, paint2);
            rect5.set(rect62);
            i11 = i12;
            android.graphics.Bitmap bitmap42 = copyBitmapIfHardware;
            copyBitmapIfHardware = bitmap3;
            rect4 = rect62;
            rect3 = rect5;
            paint = paint2;
            bitmap2 = bitmap42;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return copyBitmapIfHardware;
    }

    private BitmapCompat() {
    }

    static class Api27Impl {
        private Api27Impl() {
        }

        static android.graphics.Bitmap createBitmapWithSourceColorspace(int i, int i2, android.graphics.Bitmap bitmap, boolean z) {
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = android.graphics.Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE) {
                config = android.graphics.Bitmap.Config.ARGB_8888;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    config = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return android.graphics.Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean isAlreadyF16AndLinear(android.graphics.Bitmap bitmap) {
            return bitmap.getConfig() == android.graphics.Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        static android.graphics.Bitmap copyBitmapIfHardware(android.graphics.Bitmap bitmap) {
            if (bitmap.getConfig() != android.graphics.Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                config = androidx.core.graphics.BitmapCompat.Api31Impl.getHardwareBitmapConfig(bitmap);
            }
            return bitmap.copy(config, true);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void setPaintBlendMode(android.graphics.Paint paint) {
            paint.setBlendMode(android.graphics.BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static android.graphics.Bitmap.Config getHardwareBitmapConfig(android.graphics.Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return android.graphics.Bitmap.Config.RGBA_F16;
            }
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }
}
