package coil3.memory;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010)\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u0018\u00101\u001a\u00020\u001d*\u00020\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u00100"}, d2 = {"Lcoil3/memory/MemoryCacheService;", "", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/request/RequestService;", "requestService", "Lcoil3/util/Logger;", "logger", "<init>", "(Lcoil3/ImageLoader;Lcoil3/request/RequestService;Lcoil3/util/Logger;)V", "Lcoil3/request/ImageRequest;", "request", "mappedData", "Lcoil3/request/Options;", "options", "Lcoil3/EventListener;", "eventListener", "Lcoil3/memory/MemoryCache$Key;", "newCacheKey", "(Lcoil3/request/ImageRequest;Ljava/lang/Object;Lcoil3/request/Options;Lcoil3/EventListener;)Lcoil3/memory/MemoryCache$Key;", "cacheKey", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcoil3/size/Scale;", "scale", "Lcoil3/memory/MemoryCache$Value;", "getCacheValue", "(Lcoil3/request/ImageRequest;Lcoil3/memory/MemoryCache$Key;Lcoil3/size/Size;Lcoil3/size/Scale;)Lcoil3/memory/MemoryCache$Value;", "cacheValue", "", "isCacheValueValid$coil_core", "(Lcoil3/request/ImageRequest;Lcoil3/memory/MemoryCache$Key;Lcoil3/memory/MemoryCache$Value;Lcoil3/size/Size;Lcoil3/size/Scale;)Z", "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "result", "setCacheValue", "(Lcoil3/memory/MemoryCache$Key;Lcoil3/request/ImageRequest;Lcoil3/intercept/EngineInterceptor$ExecuteResult;)Z", "Lcoil3/intercept/Interceptor$Chain;", "chain", "Lcoil3/request/SuccessResult;", "newResult", "(Lcoil3/intercept/Interceptor$Chain;Lcoil3/request/ImageRequest;Lcoil3/memory/MemoryCache$Key;Lcoil3/memory/MemoryCache$Value;)Lcoil3/request/SuccessResult;", "getHighSpeedVideoFpsRanges", "Lcoil3/ImageLoader;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcoil3/request/RequestService;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/util/Logger;", "(Lcoil3/memory/MemoryCache$Value;)Z", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MemoryCacheService {
    public static final java.lang.String EXTRA_DISK_CACHE_KEY = "coil#disk_cache_key";
    public static final java.lang.String EXTRA_IS_SAMPLED = "coil#is_sampled";
    public static final java.lang.String EXTRA_SIZE = "coil#size";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final coil3.ImageLoader getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final coil3.view.RequestService getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.content.Logger getHighSpeedVideoFpsRanges;

    public MemoryCacheService(coil3.ImageLoader imageLoader, coil3.view.RequestService requestService, coil3.content.Logger logger) {
        this.getHighSpeedVideoSizes = imageLoader;
        this.getHighResolutionOutputSizeshNQ4ISI = requestService;
        this.getHighSpeedVideoFpsRanges = logger;
    }

    public final coil3.memory.MemoryCache.Key newCacheKey(coil3.view.ImageRequest request, java.lang.Object mappedData, coil3.view.Options options, coil3.EventListener eventListener) {
        if (request.getMemoryCachePolicy() == coil3.view.CachePolicy.DISABLED) {
            return null;
        }
        if (request.getMemoryCacheKey() != null) {
            return new coil3.memory.MemoryCache.Key(request.getMemoryCacheKey(), request.getMemoryCacheKeyExtras());
        }
        eventListener.keyStart(request, mappedData);
        java.lang.String key = coil3.content.UtilsKt.key(this.getHighSpeedVideoSizes.getCamera2StreamConfigurationMap(), mappedData, options, this.getHighSpeedVideoFpsRanges, "MemoryCacheService");
        eventListener.keyEnd(request, key);
        if (key == null) {
            return null;
        }
        if (!coil3.view.ImageRequestsKt.getTransformations(request).isEmpty()) {
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(request.getMemoryCacheKeyExtras());
            mutableMap.put(EXTRA_SIZE, options.getSize().toString());
            return new coil3.memory.MemoryCache.Key(key, mutableMap);
        }
        return new coil3.memory.MemoryCache.Key(key, request.getMemoryCacheKeyExtras());
    }

    public final coil3.memory.MemoryCache.Value getCacheValue(coil3.view.ImageRequest request, coil3.memory.MemoryCache.Key cacheKey, coil3.view.Size size, coil3.view.Scale scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        coil3.memory.MemoryCache memoryCache = this.getHighSpeedVideoSizes.getMemoryCache();
        coil3.memory.MemoryCache.Value value = memoryCache != null ? memoryCache.get(cacheKey) : null;
        if (value == null || !isCacheValueValid$coil_core(request, cacheKey, value, size, scale)) {
            return null;
        }
        return value;
    }

    public final boolean isCacheValueValid$coil_core(coil3.view.ImageRequest request, coil3.memory.MemoryCache.Key cacheKey, coil3.memory.MemoryCache.Value cacheValue, coil3.view.Size size, coil3.view.Scale scale) {
        coil3.view.Size size2;
        int abs;
        int abs2;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isCacheValueValidForHardware(request, cacheValue)) {
            coil3.content.Logger logger = this.getHighSpeedVideoFpsRanges;
            if (logger != null) {
                coil3.util.Logger.Level level = coil3.util.Logger.Level.Debug;
                if (logger.getMinLevel().compareTo(level) <= 0) {
                    java.lang.Object data = request.getData();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(data);
                    sb.append(": Cached bitmap is hardware-backed, which is incompatible with the request.");
                    logger.log("MemoryCacheService", level, sb.toString(), null);
                }
            }
            return false;
        }
        java.lang.String str = cacheKey.getExtras().get(EXTRA_SIZE);
        if (str != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, size.toString())) {
                return true;
            }
            coil3.content.Logger logger2 = this.getHighSpeedVideoFpsRanges;
            if (logger2 != null) {
                coil3.util.Logger.Level level2 = coil3.util.Logger.Level.Debug;
                if (logger2.getMinLevel().compareTo(level2) <= 0) {
                    java.lang.Object data2 = request.getData();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(data2);
                    sb2.append(": Memory cached image's size (");
                    sb2.append(str);
                    sb2.append(") does not exactly match the target size (");
                    sb2.append(size);
                    sb2.append(").");
                    logger2.log("MemoryCacheService", level2, sb2.toString(), null);
                }
            }
            return false;
        }
        if (!getHighSpeedVideoFpsRanges(cacheValue) && (coil3.view.SizeKt.isOriginal(size) || request.getPrecision() == coil3.view.Precision.INEXACT)) {
            return true;
        }
        int width = cacheValue.getImage().getWidth();
        int height = cacheValue.getImage().getHeight();
        if (cacheValue.getImage() instanceof coil3.BitmapImage) {
            size2 = coil3.view.ImageRequestsKt.getMaxBitmapSize(request);
        } else {
            size2 = coil3.view.Size.ORIGINAL;
        }
        coil3.view.Dimension width2 = size.getWidth();
        int m9807unboximpl = width2 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) width2).m9807unboximpl() : Integer.MAX_VALUE;
        coil3.view.Dimension width3 = size2.getWidth();
        int min = java.lang.Math.min(m9807unboximpl, width3 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) width3).m9807unboximpl() : Integer.MAX_VALUE);
        coil3.view.Dimension height2 = size.getHeight();
        int m9807unboximpl2 = height2 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) height2).m9807unboximpl() : Integer.MAX_VALUE;
        coil3.view.Dimension height3 = size2.getHeight();
        int min2 = java.lang.Math.min(m9807unboximpl2, height3 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) height3).m9807unboximpl() : Integer.MAX_VALUE);
        double d = min / width;
        double d2 = min2 / height;
        int i = coil3.memory.MemoryCacheService.WhenMappings.$EnumSwitchMapping$0[((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? coil3.view.Scale.FIT : scale).ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (d < d2) {
                abs2 = java.lang.Math.abs(min - width);
            } else {
                abs = java.lang.Math.abs(min2 - height);
                d = d2;
                abs2 = abs;
            }
        } else if (d > d2) {
            abs2 = java.lang.Math.abs(min - width);
        } else {
            abs = java.lang.Math.abs(min2 - height);
            d = d2;
            abs2 = abs;
        }
        if (abs2 <= 1) {
            return true;
        }
        int i2 = coil3.memory.MemoryCacheService.WhenMappings.$EnumSwitchMapping$1[request.getPrecision().ordinal()];
        if (i2 == 1) {
            if (d == 1.0d) {
                return true;
            }
            coil3.content.Logger logger3 = this.getHighSpeedVideoFpsRanges;
            if (logger3 == null) {
                return false;
            }
            coil3.util.Logger.Level level3 = coil3.util.Logger.Level.Debug;
            if (logger3.getMinLevel().compareTo(level3) > 0) {
                return false;
            }
            java.lang.Object data3 = request.getData();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(data3);
            sb3.append(": Memory cached image's size (");
            sb3.append(width);
            sb3.append(", ");
            sb3.append(height);
            sb3.append(") does not exactly match the target size (");
            sb3.append(min);
            sb3.append(", ");
            sb3.append(min2);
            sb3.append(").");
            logger3.log("MemoryCacheService", level3, sb3.toString(), null);
            return false;
        }
        if (i2 != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (d <= 1.0d) {
            return true;
        }
        coil3.content.Logger logger4 = this.getHighSpeedVideoFpsRanges;
        if (logger4 == null) {
            return false;
        }
        coil3.util.Logger.Level level4 = coil3.util.Logger.Level.Debug;
        if (logger4.getMinLevel().compareTo(level4) > 0) {
            return false;
        }
        java.lang.Object data4 = request.getData();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(data4);
        sb4.append(": Memory cached image's size (");
        sb4.append(width);
        sb4.append(", ");
        sb4.append(height);
        sb4.append(") is smaller than the target size (");
        sb4.append(min);
        sb4.append(", ");
        sb4.append(min2);
        sb4.append(").");
        logger4.log("MemoryCacheService", level4, sb4.toString(), null);
        return false;
    }

    public final boolean setCacheValue(coil3.memory.MemoryCache.Key cacheKey, coil3.view.ImageRequest request, coil3.intercept.EngineInterceptor.ExecuteResult result) {
        coil3.memory.MemoryCache memoryCache;
        if (cacheKey == null || !request.getMemoryCachePolicy().getWriteEnabled() || !result.getImage().getShareable() || (memoryCache = this.getHighSpeedVideoSizes.getMemoryCache()) == null) {
            return false;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(EXTRA_IS_SAMPLED, java.lang.Boolean.valueOf(result.isSampled()));
        java.lang.String diskCacheKey = result.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put(EXTRA_DISK_CACHE_KEY, diskCacheKey);
        }
        memoryCache.set(cacheKey, new coil3.memory.MemoryCache.Value(result.getImage(), linkedHashMap));
        return true;
    }

    public final coil3.view.SuccessResult newResult(coil3.intercept.Interceptor.Chain chain, coil3.view.ImageRequest request, coil3.memory.MemoryCache.Key cacheKey, coil3.memory.MemoryCache.Value cacheValue) {
        coil3.Image image = cacheValue.getImage();
        coil3.graphics.DataSource dataSource = coil3.graphics.DataSource.MEMORY_CACHE;
        java.lang.Object obj = cacheValue.getExtras().get(EXTRA_DISK_CACHE_KEY);
        return new coil3.view.SuccessResult(image, request, dataSource, cacheKey, obj instanceof java.lang.String ? (java.lang.String) obj : null, getHighSpeedVideoFpsRanges(cacheValue), coil3.content.UtilsKt.isPlaceholderCached(chain));
    }

    private static boolean getHighSpeedVideoFpsRanges(coil3.memory.MemoryCache.Value value) {
        java.lang.Object obj = value.getExtras().get(EXTRA_IS_SAMPLED);
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[coil3.view.Scale.values().length];
            try {
                iArr[coil3.view.Scale.FILL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[coil3.view.Scale.FIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[coil3.view.Precision.values().length];
            try {
                iArr2[coil3.view.Precision.EXACT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[coil3.view.Precision.INEXACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
