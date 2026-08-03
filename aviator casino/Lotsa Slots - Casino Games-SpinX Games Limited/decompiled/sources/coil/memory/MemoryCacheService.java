package coil.memory;

/* compiled from: MemoryCacheService.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J5\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001dJ0\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001f\u001a\u00020\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u00020\u001b*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcoil/memory/MemoryCacheService;", "", "imageLoader", "Lcoil/ImageLoader;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "<init>", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "newCacheKey", "Lcoil/memory/MemoryCache$Key;", "request", "Lcoil/request/ImageRequest;", "mappedData", "options", "Lcoil/request/Options;", "eventListener", "Lcoil/EventListener;", "getCacheValue", "Lcoil/memory/MemoryCache$Value;", "cacheKey", "size", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "isCacheValueValid", "", "cacheValue", "isCacheValueValid$coil_base_release", "isSizeValid", "setCacheValue", "result", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "newResult", "Lcoil/request/SuccessResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "isSampled", "(Lcoil/memory/MemoryCache$Value;)Z", "diskCacheKey", "", "getDiskCacheKey", "(Lcoil/memory/MemoryCache$Value;)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MemoryCacheService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil.memory.MemoryCacheService.Companion INSTANCE = new coil.memory.MemoryCacheService.Companion(null);
    public static final java.lang.String EXTRA_DISK_CACHE_KEY = "coil#disk_cache_key";
    public static final java.lang.String EXTRA_IS_SAMPLED = "coil#is_sampled";
    public static final java.lang.String EXTRA_TRANSFORMATION_INDEX = "coil#transformation_";
    public static final java.lang.String EXTRA_TRANSFORMATION_SIZE = "coil#transformation_size";
    private static final java.lang.String TAG = "MemoryCacheService";
    private final coil.ImageLoader imageLoader;
    private final coil.util.Logger logger;
    private final coil.request.RequestService requestService;

    public MemoryCacheService(coil.ImageLoader imageLoader, coil.request.RequestService requestService, coil.util.Logger logger) {
        this.imageLoader = imageLoader;
        this.requestService = requestService;
        this.logger = logger;
    }

    public final coil.memory.MemoryCache.Key newCacheKey(coil.request.ImageRequest request, java.lang.Object mappedData, coil.request.Options options, coil.EventListener eventListener) {
        coil.memory.MemoryCache.Key memoryCacheKey = request.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.keyStart(request, mappedData);
        java.lang.String key = this.imageLoader.getComponents().key(mappedData, options);
        eventListener.keyEnd(request, key);
        if (key == null) {
            return null;
        }
        java.util.List<coil.transform.Transformation> transformations = request.getTransformations();
        java.util.Map<java.lang.String, java.lang.String> memoryCacheKeys = request.getParameters().memoryCacheKeys();
        if (transformations.isEmpty() && memoryCacheKeys.isEmpty()) {
            return new coil.memory.MemoryCache.Key(key, null, 2, null);
        }
        java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(memoryCacheKeys);
        if (!transformations.isEmpty()) {
            java.util.List<coil.transform.Transformation> transformations2 = request.getTransformations();
            int size = transformations2.size();
            for (int i = 0; i < size; i++) {
                mutableMap.put(EXTRA_TRANSFORMATION_INDEX + i, transformations2.get(i).getCacheKey());
            }
            mutableMap.put(EXTRA_TRANSFORMATION_SIZE, options.getSize().toString());
        }
        return new coil.memory.MemoryCache.Key(key, mutableMap);
    }

    public final coil.memory.MemoryCache.Value getCacheValue(coil.request.ImageRequest request, coil.memory.MemoryCache.Key cacheKey, coil.size.Size size, coil.size.Scale scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        coil.memory.MemoryCache memoryCache = this.imageLoader.getMemoryCache();
        coil.memory.MemoryCache.Value value = memoryCache != null ? memoryCache.get(cacheKey) : null;
        if (value == null || !isCacheValueValid$coil_base_release(request, cacheKey, value, size, scale)) {
            return null;
        }
        return value;
    }

    public final boolean isCacheValueValid$coil_base_release(coil.request.ImageRequest request, coil.memory.MemoryCache.Key cacheKey, coil.memory.MemoryCache.Value cacheValue, coil.size.Size size, coil.size.Scale scale) {
        if (!this.requestService.isConfigValidForHardware(request, coil.util.Bitmaps.getSafeConfig(cacheValue.getBitmap()))) {
            coil.util.Logger logger = this.logger;
            if (logger == null || logger.getLevel() > 3) {
                return false;
            }
            logger.log(TAG, 3, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
            return false;
        }
        return isSizeValid(request, cacheKey, cacheValue, size, scale);
    }

    private final boolean isSizeValid(coil.request.ImageRequest request, coil.memory.MemoryCache.Key cacheKey, coil.memory.MemoryCache.Value cacheValue, coil.size.Size size, coil.size.Scale scale) {
        java.lang.String str;
        boolean isSampled = isSampled(cacheValue);
        if (coil.size.Sizes.isOriginal(size)) {
            if (!isSampled) {
                return true;
            }
            coil.util.Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 3) {
                logger.log(TAG, 3, request.getData() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        java.lang.String str2 = cacheKey.getExtras().get(EXTRA_TRANSFORMATION_SIZE);
        if (str2 != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str2, size.toString());
        }
        int width = cacheValue.getBitmap().getWidth();
        int height = cacheValue.getBitmap().getHeight();
        coil.size.Dimension width2 = size.getWidth();
        int i = width2 instanceof coil.size.Dimension.Pixels ? ((coil.size.Dimension.Pixels) width2).px : Integer.MAX_VALUE;
        coil.size.Dimension height2 = size.getHeight();
        int i2 = height2 instanceof coil.size.Dimension.Pixels ? ((coil.size.Dimension.Pixels) height2).px : Integer.MAX_VALUE;
        double computeSizeMultiplier = coil.decode.DecodeUtils.computeSizeMultiplier(width, height, i, i2, scale);
        boolean allowInexactSize = coil.util.Requests.getAllowInexactSize(request);
        if (allowInexactSize) {
            double coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(computeSizeMultiplier, 1.0d);
            str = TAG;
            if (java.lang.Math.abs(i - (width * coerceAtMost)) <= 1.0d || java.lang.Math.abs(i2 - (coerceAtMost * height)) <= 1.0d) {
                return true;
            }
        } else {
            str = TAG;
            if ((coil.util.Utils.isMinOrMax(i) || java.lang.Math.abs(i - width) <= 1) && (coil.util.Utils.isMinOrMax(i2) || java.lang.Math.abs(i2 - height) <= 1)) {
                return true;
            }
        }
        if (computeSizeMultiplier != 1.0d && !allowInexactSize) {
            coil.util.Logger logger2 = this.logger;
            if (logger2 == null || logger2.getLevel() > 3) {
                return false;
            }
            logger2.log(str, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            return false;
        }
        java.lang.String str3 = str;
        if (computeSizeMultiplier <= 1.0d || !isSampled) {
            return true;
        }
        coil.util.Logger logger3 = this.logger;
        if (logger3 == null || logger3.getLevel() > 3) {
            return false;
        }
        logger3.log(str3, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
        return false;
    }

    public final boolean setCacheValue(coil.memory.MemoryCache.Key cacheKey, coil.request.ImageRequest request, coil.intercept.EngineInterceptor.ExecuteResult result) {
        coil.memory.MemoryCache memoryCache;
        android.graphics.Bitmap bitmap;
        if (request.getMemoryCachePolicy().getWriteEnabled() && (memoryCache = this.imageLoader.getMemoryCache()) != null && cacheKey != null) {
            android.graphics.drawable.Drawable drawable = result.getDrawable();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put(EXTRA_IS_SAMPLED, java.lang.Boolean.valueOf(result.getIsSampled()));
                java.lang.String diskCacheKey = result.getDiskCacheKey();
                if (diskCacheKey != null) {
                    linkedHashMap.put(EXTRA_DISK_CACHE_KEY, diskCacheKey);
                }
                memoryCache.set(cacheKey, new coil.memory.MemoryCache.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }

    public final coil.request.SuccessResult newResult(coil.intercept.Interceptor.Chain chain, coil.request.ImageRequest request, coil.memory.MemoryCache.Key cacheKey, coil.memory.MemoryCache.Value cacheValue) {
        return new coil.request.SuccessResult(new android.graphics.drawable.BitmapDrawable(request.getContext().getResources(), cacheValue.getBitmap()), request, coil.decode.DataSource.MEMORY_CACHE, cacheKey, getDiskCacheKey(cacheValue), isSampled(cacheValue), coil.util.Utils.isPlaceholderCached(chain));
    }

    private final boolean isSampled(coil.memory.MemoryCache.Value value) {
        java.lang.Object obj = value.getExtras().get(EXTRA_IS_SAMPLED);
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final java.lang.String getDiskCacheKey(coil.memory.MemoryCache.Value value) {
        java.lang.Object obj = value.getExtras().get(EXTRA_DISK_CACHE_KEY);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    /* compiled from: MemoryCacheService.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003¨\u0006\u000e"}, d2 = {"Lcoil/memory/MemoryCacheService$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_TRANSFORMATION_INDEX", "getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations", "EXTRA_TRANSFORMATION_SIZE", "getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations", "EXTRA_IS_SAMPLED", "getEXTRA_IS_SAMPLED$coil_base_release$annotations", "EXTRA_DISK_CACHE_KEY", "getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_IS_SAMPLED$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations() {
        }

        private Companion() {
        }
    }
}
