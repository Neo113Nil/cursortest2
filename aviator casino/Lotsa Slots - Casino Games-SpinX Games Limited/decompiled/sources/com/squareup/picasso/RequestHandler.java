package com.squareup.picasso;

/* loaded from: classes5.dex */
public abstract class RequestHandler {
    public abstract boolean canHandleRequest(com.squareup.picasso.Request request);

    int getRetryCount() {
        return 0;
    }

    public abstract com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request request, int i) throws java.io.IOException;

    boolean shouldRetry(boolean z, android.net.NetworkInfo networkInfo) {
        return false;
    }

    boolean supportsReplay() {
        return false;
    }

    public static final class Result {
        private final android.graphics.Bitmap bitmap;
        private final int exifOrientation;
        private final com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
        private final okio.Source source;

        public Result(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
            this((android.graphics.Bitmap) com.squareup.picasso.Utils.checkNotNull(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public Result(okio.Source source, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
            this(null, (okio.Source) com.squareup.picasso.Utils.checkNotNull(source, "source == null"), loadedFrom, 0);
        }

        Result(android.graphics.Bitmap bitmap, okio.Source source, com.squareup.picasso.Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) == (source != null)) {
                throw new java.lang.AssertionError();
            }
            this.bitmap = bitmap;
            this.source = source;
            this.loadedFrom = (com.squareup.picasso.Picasso.LoadedFrom) com.squareup.picasso.Utils.checkNotNull(loadedFrom, "loadedFrom == null");
            this.exifOrientation = i;
        }

        public android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public okio.Source getSource() {
            return this.source;
        }

        public com.squareup.picasso.Picasso.LoadedFrom getLoadedFrom() {
            return this.loadedFrom;
        }

        int getExifOrientation() {
            return this.exifOrientation;
        }
    }

    static android.graphics.BitmapFactory.Options createBitmapOptions(com.squareup.picasso.Request request) {
        boolean hasSize = request.hasSize();
        boolean z = request.config != null;
        if (!hasSize && !z && !request.purgeable) {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        options.inInputShareable = request.purgeable;
        options.inPurgeable = request.purgeable;
        if (z) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    static boolean requiresInSampleSize(android.graphics.BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    static void calculateInSampleSize(int i, int i2, android.graphics.BitmapFactory.Options options, com.squareup.picasso.Request request) {
        calculateInSampleSize(i, i2, options.outWidth, options.outHeight, options, request);
    }

    static void calculateInSampleSize(int i, int i2, int i3, int i4, android.graphics.BitmapFactory.Options options, com.squareup.picasso.Request request) {
        int min;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = java.lang.Math.floor(i3 / i);
            } else if (i == 0) {
                floor = java.lang.Math.floor(i4 / i2);
            } else {
                int floor2 = (int) java.lang.Math.floor(i4 / i2);
                int floor3 = (int) java.lang.Math.floor(i3 / i);
                if (request.centerInside) {
                    min = java.lang.Math.max(floor2, floor3);
                } else {
                    min = java.lang.Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        } else {
            min = 1;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }
}
