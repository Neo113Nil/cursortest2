package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiMemoryCache {
    private static final java.lang.String TAG = "MemoryCache";
    private final java.util.Map<java.lang.String, android.graphics.drawable.Drawable> cache = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap(10, 1.5f, true));
    long size = 0;
    private long limit = 1000000;

    InMobiMemoryCache() {
        setLimit(java.lang.Runtime.getRuntime().maxMemory() / 4);
    }

    InMobiMemoryCache(java.lang.Long l) {
        setLimit(l.longValue());
    }

    private void setLimit(long j) {
        this.limit = j;
        android.util.Log.i(TAG, "MemoryCache will use up to " + ((this.limit / 1024.0d) / 1024.0d) + "MB");
    }

    public android.graphics.drawable.Drawable get(java.lang.String str) {
        try {
            if (this.cache.containsKey(str)) {
                return this.cache.get(str);
            }
            return null;
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    void put(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        try {
            if (this.cache.containsKey(str)) {
                this.size -= getSizeInBytes(((android.graphics.drawable.BitmapDrawable) this.cache.get(str)).getBitmap());
            }
            this.cache.put(str, drawable);
            this.size += getSizeInBytes(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
            checkSize();
            android.util.Log.d(TAG, "Drawable used from cache");
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    private void checkSize() {
        android.util.Log.i(TAG, "cache size=" + this.size + " length=" + this.cache.size());
        if (this.size > this.limit) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, android.graphics.drawable.Drawable>> it = this.cache.entrySet().iterator();
            while (it.hasNext()) {
                this.size -= getSizeInBytes(((android.graphics.drawable.BitmapDrawable) it.next().getValue()).getBitmap());
                it.remove();
                if (this.size <= this.limit) {
                    break;
                }
            }
            android.util.Log.i(TAG, "Clean cache. New size " + this.cache.size());
        }
    }

    public void clear() {
        try {
            this.cache.clear();
            this.size = 0L;
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        }
    }

    private long getSizeInBytes(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return 0L;
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
