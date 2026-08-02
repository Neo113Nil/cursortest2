package androidx.core.graphics;

/* loaded from: classes7.dex */
public final class BitmapCompat {
    static int getHighSpeedVideoFpsRanges(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.hasMipMap()")
    @java.lang.Deprecated
    public static boolean hasMipMap(android.graphics.Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.setHasMipMap(hasMipMap)")
    @java.lang.Deprecated
    public static void setHasMipMap(android.graphics.Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }

    @androidx.annotation.ReplaceWith(expression = "bitmap.getAllocationByteCount()")
    @java.lang.Deprecated
    public static int getAllocationByteCount(android.graphics.Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a4, code lost:
    
        if (androidx.core.graphics.BitmapCompat.Api27Impl.getHighSpeedVideoFpsRangesFor(r4) == false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Bitmap createScaledBitmap(android.graphics.Bitmap bitmap, int i, int i2, android.graphics.Rect rect, boolean z) {
        int i3;
        double floor;
        double floor2;
        int i4;
        int i5;
        android.graphics.Bitmap bitmap2;
        android.graphics.Rect rect2;
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new java.lang.IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        android.graphics.Bitmap highSpeedVideoSizes = android.os.Build.VERSION.SDK_INT >= 27 ? androidx.core.graphics.BitmapCompat.Api27Impl.getHighSpeedVideoSizes(bitmap) : bitmap;
        int width = rect != null ? rect.width() : bitmap.getWidth();
        int height = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / width;
        float f2 = i2 / height;
        int i6 = rect != null ? rect.left : 0;
        int i7 = rect != null ? rect.top : 0;
        if (i6 == 0 && i7 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == highSpeedVideoSizes) ? bitmap.copy(bitmap.getConfig(), true) : highSpeedVideoSizes;
        }
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setFilterBitmap(true);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.graphics.BitmapCompat.Api29Impl.getHighSpeedVideoFpsRanges(paint);
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        }
        if (width == i && height == i2) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, highSpeedVideoSizes.getConfig());
            new android.graphics.Canvas(createBitmap).drawBitmap(highSpeedVideoSizes, -i6, -i7, paint);
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
        if (!z || android.os.Build.VERSION.SDK_INT < 27 || androidx.core.graphics.BitmapCompat.Api27Impl.getHighSpeedVideoFpsRangesFor(bitmap)) {
            i4 = i3;
            i5 = 0;
            bitmap2 = highSpeedVideoSizes;
            highSpeedVideoSizes = null;
        } else {
            bitmap2 = androidx.core.graphics.BitmapCompat.Api27Impl.getHighSpeedVideoFpsRangesFor(i8 > 0 ? getHighSpeedVideoFpsRanges(width, i, 1, i8) : width, i9 > 0 ? getHighSpeedVideoFpsRanges(height, i2, 1, i9) : height, bitmap, true);
            new android.graphics.Canvas(bitmap2).drawBitmap(highSpeedVideoSizes, -i3, -i7, paint);
            i5 = 1;
            i7 = 0;
            i4 = 0;
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
            rect4.set(0, 0, getHighSpeedVideoFpsRanges(width, i, i10, i8), getHighSpeedVideoFpsRanges(height, i2, i12, i9));
            boolean z2 = i10 == 0 && i12 == 0;
            boolean z3 = highSpeedVideoSizes != null && highSpeedVideoSizes.getWidth() == i && highSpeedVideoSizes.getHeight() == i2;
            if (highSpeedVideoSizes == null || highSpeedVideoSizes == bitmap) {
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
                    android.graphics.Rect rect6 = rect2;
                    new android.graphics.Canvas(highSpeedVideoSizes).drawBitmap(bitmap2, rect5, rect6, paint2);
                    rect5.set(rect6);
                    i11 = i12;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint = paint2;
                    android.graphics.Bitmap bitmap3 = bitmap2;
                    bitmap2 = highSpeedVideoSizes;
                    highSpeedVideoSizes = bitmap3;
                }
            }
            if (highSpeedVideoSizes != bitmap && highSpeedVideoSizes != null) {
                highSpeedVideoSizes.recycle();
            }
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(width, i, i10 > 0 ? i5 : i10, i8);
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(height, i2, i12 > 0 ? i5 : i12, i9);
            if (android.os.Build.VERSION.SDK_INT >= 27) {
                highSpeedVideoSizes = androidx.core.graphics.BitmapCompat.Api27Impl.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, bitmap, z && !z2);
            } else {
                highSpeedVideoSizes = android.graphics.Bitmap.createBitmap(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, bitmap2.getConfig());
            }
            android.graphics.Rect rect62 = rect2;
            new android.graphics.Canvas(highSpeedVideoSizes).drawBitmap(bitmap2, rect5, rect62, paint2);
            rect5.set(rect62);
            i11 = i12;
            rect4 = rect62;
            rect3 = rect5;
            paint = paint2;
            android.graphics.Bitmap bitmap32 = bitmap2;
            bitmap2 = highSpeedVideoSizes;
            highSpeedVideoSizes = bitmap32;
        }
        if (highSpeedVideoSizes != bitmap && highSpeedVideoSizes != null) {
            highSpeedVideoSizes.recycle();
        }
        return bitmap2;
    }

    private BitmapCompat() {
    }

    static class Api27Impl {
        private Api27Impl() {
        }

        static android.graphics.Bitmap getHighSpeedVideoFpsRangesFor(int i, int i2, android.graphics.Bitmap bitmap, boolean z) {
            android.graphics.Bitmap.Config config = bitmap.getConfig();
            android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
            android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = android.graphics.Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE) {
                config = android.graphics.Bitmap.Config.ARGB_8888;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    config = androidx.core.graphics.BitmapCompat.Api31Impl.getHighSpeedVideoSizes(bitmap);
                }
            }
            return android.graphics.Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.graphics.Bitmap bitmap) {
            return bitmap.getConfig() == android.graphics.Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        static android.graphics.Bitmap getHighSpeedVideoSizes(android.graphics.Bitmap bitmap) {
            if (bitmap.getConfig() != android.graphics.Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                config = androidx.core.graphics.BitmapCompat.Api31Impl.getHighSpeedVideoSizes(bitmap);
            }
            return bitmap.copy(config, true);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.graphics.Paint paint) {
            paint.setBlendMode(android.graphics.BlendMode.SRC);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static android.graphics.Bitmap.Config getHighSpeedVideoSizes(android.graphics.Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return android.graphics.Bitmap.Config.RGBA_F16;
            }
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }
}
