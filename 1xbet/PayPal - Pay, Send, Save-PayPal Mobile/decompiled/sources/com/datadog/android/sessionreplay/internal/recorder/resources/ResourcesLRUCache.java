package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,B=\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourcesLRUCache;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache;", "", "", "Landroid/content/ComponentCallbacks2;", "Lcom/datadog/android/sessionreplay/internal/utils/CacheUtils;", "cacheUtils", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "invocationUtils", "Landroidx/collection/LruCache;", com.datadog.trace.api.DDSpanTypes.CACHE, "<init>", "(Lcom/datadog/android/sessionreplay/internal/utils/CacheUtils;Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;Landroidx/collection/LruCache;)V", "", "clear", "()V", "Landroid/graphics/drawable/Drawable;", "element", "generateKeyFromDrawable$dd_sdk_android_session_replay_release", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/String;", "key", "get", "(Ljava/lang/String;)[B", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "", "level", "onTrimMemory", "(I)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/String;[B)V", io.ktor.http.ContentDisposition.Parameters.Size, "()I", "getHighSpeedVideoSizes", "Landroidx/collection/LruCache;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/utils/CacheUtils;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourcesLRUCache implements com.datadog.android.sessionreplay.internal.recorder.resources.Cache<java.lang.String, byte[]>, android.content.ComponentCallbacks2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache.Companion(null);
    private static final int MAX_CACHE_MEMORY_SIZE_BYTES = 4194304;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.InvocationUtils getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.CacheUtils<java.lang.String, byte[]> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.collection.LruCache<java.lang.String, byte[]> getHighSpeedVideoSizes;

    public ResourcesLRUCache(com.datadog.android.sessionreplay.internal.utils.CacheUtils<java.lang.String, byte[]> cacheUtils, com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils, androidx.collection.LruCache<java.lang.String, byte[]> lruCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invocationUtils, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lruCache, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cacheUtils;
        this.getHighSpeedVideoFpsRanges = invocationUtils;
        this.getHighSpeedVideoSizes = lruCache;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Cache
    public final void put(byte[] bArr) {
        com.datadog.android.sessionreplay.internal.recorder.resources.Cache.DefaultImpls.put(this, bArr);
    }

    public /* synthetic */ ResourcesLRUCache(com.datadog.android.sessionreplay.internal.utils.CacheUtils cacheUtils, com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils, androidx.collection.LruCache lruCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.sessionreplay.internal.utils.CacheUtils(null, 1, null) : cacheUtils, (i & 2) != 0 ? new com.datadog.android.sessionreplay.internal.utils.InvocationUtils() : invocationUtils, (i & 4) != 0 ? new androidx.collection.LruCache<java.lang.String, byte[]>(INSTANCE.getMAX_CACHE_MEMORY_SIZE_BYTES$dd_sdk_android_session_replay_release()) { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.collection.LruCache
            public final int sizeOf(java.lang.String key, byte[] value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
                return value.length;
            }
        } : lruCache);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int level) {
        this.getHighResolutionOutputSizeshNQ4ISI.handleTrimMemory$dd_sdk_android_session_replay_release(level, this.getHighSpeedVideoSizes);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Cache
    public final int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0001X\u0080D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourcesLRUCache$Companion;", "", "<init>", "()V", "", "MAX_CACHE_MEMORY_SIZE_BYTES", com.visa.cbp.getEncExpo.warmup, "getMAX_CACHE_MEMORY_SIZE_BYTES$dd_sdk_android_session_replay_release", "()I", "getMAX_CACHE_MEMORY_SIZE_BYTES$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getMAX_CACHE_MEMORY_SIZE_BYTES$dd_sdk_android_session_replay_release$annotations() {
        }

        private Companion() {
        }

        public final int getMAX_CACHE_MEMORY_SIZE_BYTES$dd_sdk_android_session_replay_release() {
            return com.datadog.android.sessionreplay.internal.recorder.resources.ResourcesLRUCache.MAX_CACHE_MEMORY_SIZE_BYTES;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
        com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
        try {
            this.getHighSpeedVideoSizes.evictAll();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to evict cache entries"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Cache
    public final void put(java.lang.String key, byte[] value) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
            com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
            try {
                this.getHighSpeedVideoSizes.put(key, value);
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to put item in cache"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Cache
    public final byte[] get(java.lang.String key) {
        byte[] bArr;
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
            com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
            try {
                bArr = this.getHighSpeedVideoSizes.get(key);
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to get item from cache"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                bArr = null;
            }
        }
        return bArr;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.Cache
    public final void clear() {
        synchronized (this) {
            com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
            com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
            try {
                this.getHighSpeedVideoSizes.evictAll();
            } catch (java.lang.Exception e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to evict cache entries"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
    }

    public final java.lang.String generateKeyFromDrawable$dd_sdk_android_session_replay_release(android.graphics.drawable.Drawable element) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        if (!(element instanceof android.graphics.drawable.DrawableContainer)) {
            if (element instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) element;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    sb.append(java.lang.String.valueOf(java.lang.System.identityHashCode(com.datadog.android.sessionreplay.internal.recorder.LayerDrawableExtKt.safeGetDrawable$default(layerDrawable, i, null, 2, null))));
                    sb.append("-");
                }
                str = java.lang.String.valueOf(sb);
            }
        } else {
            android.graphics.drawable.DrawableContainer drawableContainer = (android.graphics.drawable.DrawableContainer) element;
            if (!(drawableContainer instanceof android.graphics.drawable.AnimationDrawable)) {
                int[] state = drawableContainer.getState();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
                str = kotlin.collections.ArraysKt.joinToString$default(state, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) "-", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 58, (java.lang.Object) null);
            }
        }
        int identityHashCode = java.lang.System.identityHashCode(element);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(identityHashCode);
        return sb2.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newConfig, "");
    }

    public ResourcesLRUCache() {
        this(null, null, null, 7, null);
    }
}
