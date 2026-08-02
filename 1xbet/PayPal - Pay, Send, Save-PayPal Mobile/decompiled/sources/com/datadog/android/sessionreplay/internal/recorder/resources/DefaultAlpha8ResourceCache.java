package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/DefaultAlpha8ResourceCache;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8ResourceCache;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapSignatureGenerator;", "signatureGenerator", "Landroidx/collection/LruCache;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "", com.datadog.trace.api.DDSpanTypes.CACHE, "<init>", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapSignatureGenerator;Landroidx/collection/LruCache;)V", "Landroid/graphics/Bitmap;", "bitmap", "generateKey", "(Landroid/graphics/Bitmap;)Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "key", "get", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;)Ljava/lang/String;", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "resourceId", "put", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Landroidx/collection/LruCache;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapSignatureGenerator;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultAlpha8ResourceCache implements com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8ResourceCache {
    public static final int MAX_CACHE_MEMORY_SIZE_BYTES = 4194304;
    public static final int STRING_OBJECT_OVERHEAD_BYTES = 40;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.BitmapSignatureGenerator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.LruCache<com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey, java.lang.String> getHighSpeedVideoFpsRangesFor;

    public DefaultAlpha8ResourceCache(com.datadog.android.sessionreplay.internal.recorder.resources.BitmapSignatureGenerator bitmapSignatureGenerator, androidx.collection.LruCache<com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey, java.lang.String> lruCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapSignatureGenerator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lruCache, "");
        this.getHighSpeedVideoSizes = bitmapSignatureGenerator;
        this.getHighSpeedVideoFpsRangesFor = lruCache;
    }

    public /* synthetic */ DefaultAlpha8ResourceCache(com.datadog.android.sessionreplay.internal.recorder.resources.BitmapSignatureGenerator bitmapSignatureGenerator, androidx.collection.LruCache lruCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmapSignatureGenerator, (i & 2) != 0 ? new androidx.collection.LruCache<com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey, java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.DefaultAlpha8ResourceCache.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.collection.LruCache
            public final int sizeOf(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey key, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                return (value.length() * 2) + 40;
            }
        } : lruCache);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8ResourceCache
    public final com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey generateKey(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        java.lang.Long generateSignature = this.getHighSpeedVideoSizes.generateSignature(bitmap);
        if (generateSignature == null) {
            return null;
        }
        return new com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey(bitmap.getWidth(), bitmap.getHeight(), generateSignature.longValue());
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8ResourceCache
    public final java.lang.String get(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoFpsRangesFor.get(key);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8ResourceCache
    public final void put(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey key, java.lang.String resourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        this.getHighSpeedVideoFpsRangesFor.put(key, resourceId);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int level) {
        int maxSize = this.getHighSpeedVideoFpsRangesFor.maxSize() / 2;
        int maxSize2 = this.getHighSpeedVideoFpsRangesFor.maxSize() / 4;
        if (level != 5) {
            if (level != 10) {
                if (level != 15) {
                    if (level == 20) {
                        return;
                    }
                    if (level != 40) {
                        if (level != 60) {
                            if (level != 80) {
                                this.getHighSpeedVideoFpsRangesFor.evictAll();
                                return;
                            }
                        }
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.evictAll();
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.trimToSize(maxSize);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.trimToSize(maxSize2 * 3);
    }

    @Override // android.content.ComponentCallbacks
    @kotlin.Deprecated(message = "Deprecated in Java")
    public final void onLowMemory() {
        this.getHighSpeedVideoFpsRangesFor.evictAll();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "");
    }
}
