package com.squareup.picasso;

/* loaded from: classes5.dex */
public final class LruCache implements com.squareup.picasso.Cache {
    final android.util.LruCache<java.lang.String, com.squareup.picasso.LruCache.BitmapAndSize> cache;

    public LruCache(android.content.Context context) {
        this(com.squareup.picasso.Utils.calculateMemoryCacheSize(context));
    }

    public LruCache(int i) {
        this.cache = new android.util.LruCache<java.lang.String, com.squareup.picasso.LruCache.BitmapAndSize>(i) { // from class: com.squareup.picasso.LruCache.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(java.lang.String str, com.squareup.picasso.LruCache.BitmapAndSize bitmapAndSize) {
                return bitmapAndSize.byteCount;
            }
        };
    }

    @Override // com.squareup.picasso.Cache
    public android.graphics.Bitmap get(java.lang.String str) {
        com.squareup.picasso.LruCache.BitmapAndSize bitmapAndSize = this.cache.get(str);
        if (bitmapAndSize != null) {
            return bitmapAndSize.bitmap;
        }
        return null;
    }

    @Override // com.squareup.picasso.Cache
    public void set(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new java.lang.NullPointerException("key == null || bitmap == null");
        }
        int bitmapBytes = com.squareup.picasso.Utils.getBitmapBytes(bitmap);
        if (bitmapBytes > maxSize()) {
            this.cache.remove(str);
        } else {
            this.cache.put(str, new com.squareup.picasso.LruCache.BitmapAndSize(bitmap, bitmapBytes));
        }
    }

    @Override // com.squareup.picasso.Cache
    public int size() {
        return this.cache.size();
    }

    @Override // com.squareup.picasso.Cache
    public int maxSize() {
        return this.cache.maxSize();
    }

    @Override // com.squareup.picasso.Cache
    public void clear() {
        this.cache.evictAll();
    }

    @Override // com.squareup.picasso.Cache
    public void clearKeyUri(java.lang.String str) {
        for (java.lang.String str2 : this.cache.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.cache.remove(str2);
            }
        }
    }

    public int hitCount() {
        return this.cache.hitCount();
    }

    public int missCount() {
        return this.cache.missCount();
    }

    public int putCount() {
        return this.cache.putCount();
    }

    public int evictionCount() {
        return this.cache.evictionCount();
    }

    static final class BitmapAndSize {
        final android.graphics.Bitmap bitmap;
        final int byteCount;

        BitmapAndSize(android.graphics.Bitmap bitmap, int i) {
            this.bitmap = bitmap;
            this.byteCount = i;
        }
    }
}
