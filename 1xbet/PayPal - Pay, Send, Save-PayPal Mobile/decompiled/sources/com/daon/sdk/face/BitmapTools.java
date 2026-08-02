package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class BitmapTools {
    public static android.graphics.Bitmap bitmapFromFile(java.lang.String str) throws java.lang.Exception {
        byte[] read = com.daon.sdk.face.FileTools.read(null, str);
        if (read != null) {
            return android.graphics.BitmapFactory.decodeByteArray(read, 0, read.length);
        }
        throw new java.io.IOException("Unable to read file: ".concat(java.lang.String.valueOf(str)));
    }

    public static android.graphics.Bitmap bitmapToGrayscale(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                int alpha = android.graphics.Color.alpha(bitmap.getPixel(i, i2));
                int red = (int) ((android.graphics.Color.red(r6) * 0.299d) + (android.graphics.Color.green(r6) * 0.587d) + (android.graphics.Color.blue(r6) * 0.114d));
                createBitmap.setPixel(i, i2, android.graphics.Color.argb(alpha, red, red, red));
            }
        }
        return createBitmap;
    }

    public static com.daon.sdk.face.YUV bitmapToYUV(android.graphics.Bitmap bitmap, int i, int i2, float f) {
        if (bitmap != null) {
            return new com.daon.sdk.face.YUV(getHighSpeedVideoFpsRangesFor(bitmap, i2, i, f));
        }
        return null;
    }

    public static byte[] compress(android.graphics.Bitmap bitmap, int i) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static android.graphics.Bitmap crop(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        if (rect.left < 0) {
            rect.left = 0;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        return (rect.left + rect.width() > bitmap.getWidth() || rect.top + rect.height() > bitmap.getHeight()) ? bitmap : android.graphics.Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
    }

    private static android.graphics.Bitmap getHighSpeedVideoFpsRangesFor(android.graphics.Bitmap bitmap, int i, int i2, float f) {
        if (bitmap == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i != width || i2 != height) {
            matrix.postScale(i / width, i2 / height);
        }
        if (f > 0.0f) {
            matrix.postRotate(f);
        }
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static android.graphics.Bitmap makeEvenDimensions(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width % 2;
        if (i != 0) {
            width += i;
        }
        int i2 = height % 2;
        if (i2 != 0) {
            height += i2;
        }
        return (i == 0 && i2 == 0) ? bitmap : com.daon.sdk.renderscript.Toolkit.f2846a.a(bitmap, width, height);
    }

    public static android.graphics.Bitmap mask(android.graphics.Bitmap bitmap, android.content.res.Resources resources, int i) {
        android.graphics.Bitmap copy = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        copy.setHasAlpha(true);
        android.graphics.Canvas canvas = new android.graphics.Canvas(copy);
        android.graphics.Bitmap highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(android.graphics.BitmapFactory.decodeResource(resources, i), bitmap.getHeight(), bitmap.getWidth(), 90.0f);
        if (highSpeedVideoFpsRangesFor != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(highSpeedVideoFpsRangesFor, 0.0f, 0.0f, paint);
            highSpeedVideoFpsRangesFor.recycle();
        }
        return copy;
    }

    public static android.graphics.Bitmap mirror(android.graphics.Bitmap bitmap) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.preScale(-1.0f, 1.0f);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static android.graphics.Bitmap resize(android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i != width || i2 != height) {
            matrix.postScale(i / width, i2 / height);
        }
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static android.graphics.Bitmap rotate(android.graphics.Bitmap bitmap, float f) {
        return rotate(bitmap, f, false);
    }

    public static java.util.List<android.graphics.Bitmap> splitImage(android.graphics.Bitmap bitmap, int i, float f) {
        int height;
        int height2;
        int width;
        int width2;
        int i2 = i;
        float f2 = f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        double d = 1.0d / i2;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            int height3 = bitmap.getHeight();
            for (int i3 = 0; i3 < i2; i3++) {
                if (i3 == 0) {
                    width2 = (int) (bitmap.getWidth() * (f2 + d));
                    width = 0;
                } else if (i3 == i2 - 1) {
                    width = (int) (bitmap.getWidth() * ((i3 * d) - f2));
                    width2 = bitmap.getWidth() - 1;
                } else {
                    double d2 = f2 / 2.0f;
                    width = (int) (bitmap.getWidth() * ((i3 * d) - d2));
                    width2 = (int) (bitmap.getWidth() * (((i3 + 1) * d) + d2));
                }
                arrayList.add(makeEvenDimensions(crop(bitmap, new android.graphics.Rect(width, 1, width2, height3))));
            }
        } else {
            int width3 = bitmap.getWidth();
            int i4 = 0;
            while (i4 < i2) {
                if (i4 == 0) {
                    height2 = (int) (bitmap.getHeight() * (f2 + d));
                    height = 0;
                } else if (i4 == i2 - 1) {
                    height = (int) (bitmap.getHeight() * ((i4 * d) - f2));
                    height2 = bitmap.getHeight() - 1;
                } else {
                    double d3 = f2 / 2.0f;
                    height = (int) (bitmap.getHeight() * ((i4 * d) - d3));
                    height2 = (int) (bitmap.getHeight() * (((i4 + 1) * d) + d3));
                    arrayList.add(makeEvenDimensions(crop(bitmap, new android.graphics.Rect(1, height, width3, height2))));
                    i4++;
                    i2 = i;
                    f2 = f;
                }
                arrayList.add(makeEvenDimensions(crop(bitmap, new android.graphics.Rect(1, height, width3, height2))));
                i4++;
                i2 = i;
                f2 = f;
            }
        }
        return arrayList;
    }

    public static android.graphics.Bitmap rotate(android.graphics.Bitmap bitmap, float f, boolean z) {
        if (bitmap == null) {
            return null;
        }
        if (f == 0.0f) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.postRotate(f);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
