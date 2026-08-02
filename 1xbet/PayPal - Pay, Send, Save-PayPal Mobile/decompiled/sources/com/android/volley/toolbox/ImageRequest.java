package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class ImageRequest extends com.android.volley.Request<android.graphics.Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final java.lang.Object sDecodeLock = new java.lang.Object();
    private final android.graphics.Bitmap.Config mDecodeConfig;
    private com.android.volley.Response.Listener<android.graphics.Bitmap> mListener;
    private final java.lang.Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final android.widget.ImageView.ScaleType mScaleType;

    public ImageRequest(java.lang.String str, com.android.volley.Response.Listener<android.graphics.Bitmap> listener, int i, int i2, android.widget.ImageView.ScaleType scaleType, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.mLock = new java.lang.Object();
        setRetryPolicy(new com.android.volley.DefaultRetryPolicy(1000, 2, 2.0f));
        this.mListener = listener;
        this.mDecodeConfig = config;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mScaleType = scaleType;
    }

    @java.lang.Deprecated
    public ImageRequest(java.lang.String str, com.android.volley.Response.Listener<android.graphics.Bitmap> listener, int i, int i2, android.graphics.Bitmap.Config config, com.android.volley.Response.ErrorListener errorListener) {
        this(str, listener, i, i2, android.widget.ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }

    @Override // com.android.volley.Request
    public com.android.volley.Request.Priority getPriority() {
        return com.android.volley.Request.Priority.LOW;
    }

    private static int getResizedDimension(int i, int i2, int i3, int i4, android.widget.ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType != android.widget.ImageView.ScaleType.FIT_XY) {
                if (i == 0) {
                    return (int) (i3 * (i2 / i4));
                }
                if (i2 == 0) {
                    return i;
                }
                double d = i4 / i3;
                if (scaleType == android.widget.ImageView.ScaleType.CENTER_CROP) {
                    double d2 = i2;
                    return ((double) i) * d < d2 ? (int) (d2 / d) : i;
                }
                double d3 = i2;
                return ((double) i) * d > d3 ? (int) (d3 / d) : i;
            }
            if (i != 0) {
                return i;
            }
        }
        return i3;
    }

    @Override // com.android.volley.Request
    public com.android.volley.Response<android.graphics.Bitmap> parseNetworkResponse(com.android.volley.NetworkResponse networkResponse) {
        com.android.volley.Response<android.graphics.Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                doParse = doParse(networkResponse);
            } catch (java.lang.OutOfMemoryError e) {
                com.android.volley.VolleyLog.e("Caught OOM for %d byte image, url=%s", java.lang.Integer.valueOf(networkResponse.data.length), getUrl());
                return com.android.volley.Response.error(new com.android.volley.ParseError(e));
            }
        }
        return doParse;
    }

    private com.android.volley.Response<android.graphics.Bitmap> doParse(com.android.volley.NetworkResponse networkResponse) {
        android.graphics.Bitmap decodeByteArray;
        byte[] bArr = networkResponse.data;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, resizedDimension, resizedDimension2);
            decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return com.android.volley.Response.error(new com.android.volley.ParseError(networkResponse));
        }
        return com.android.volley.Response.success(decodeByteArray, com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void deliverResponse(android.graphics.Bitmap bitmap) {
        com.android.volley.Response.Listener<android.graphics.Bitmap> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double min = java.lang.Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }
}
