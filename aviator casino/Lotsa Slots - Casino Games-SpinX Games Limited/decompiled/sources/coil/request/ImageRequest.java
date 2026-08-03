package coil.request;

/* compiled from: ImageRequest.kt */
@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u008d\u0001\u008e\u0001B÷\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\b\u0010>\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010@\u001a\u0004\u0018\u00010<\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\u0014\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007J\u0015\u0010\u008a\u0001\u001a\u00020#2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u008c\u0001\u001a\u00020:H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR'\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010$\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bg\u0010fR\u0011\u0010%\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bh\u0010fR\u0011\u0010&\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bi\u0010fR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bl\u0010kR\u0011\u0010*\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bm\u0010kR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010-\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bp\u0010oR\u0011\u0010.\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bq\u0010oR\u0011\u0010/\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\br\u0010oR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0013\u00108\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b{\u0010PR\u0012\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010>\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010|R\u0010\u0010@\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0012\u0010C\u001a\u00020D¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u0016\u0010\u0086\u0001\u001a\u0004\u0018\u00010<8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0083\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcoil/request/ImageRequest;", "", "context", "Landroid/content/Context;", "data", "target", "Lcoil/target/Target;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "precision", "Lcoil/size/Precision;", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", "allowConversionToBitmap", "", "allowHardware", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "parameters", "Lcoil/request/Parameters;", "placeholderMemoryCacheKey", "placeholderResId", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "defined", "Lcoil/request/DefinedRequestOptions;", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$Factory;Ljava/util/List;Lcoil/transition/Transition$Factory;Lokhttp3/Headers;Lcoil/request/Tags;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lcoil/request/Parameters;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/lang/Object;", "getTarget", "()Lcoil/target/Target;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getDiskCacheKey", "()Ljava/lang/String;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getPrecision", "()Lcoil/size/Precision;", "getFetcherFactory", "()Lkotlin/Pair;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", "getTransformations", "()Ljava/util/List;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "getHeaders", "()Lokhttp3/Headers;", "getTags", "()Lcoil/request/Tags;", "getAllowConversionToBitmap", "()Z", "getAllowHardware", "getAllowRgb565", "getPremultipliedAlpha", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "getDiskCachePolicy", "getNetworkCachePolicy", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getFetcherDispatcher", "getDecoderDispatcher", "getTransformationDispatcher", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getScale", "()Lcoil/size/Scale;", "getParameters", "()Lcoil/request/Parameters;", "getPlaceholderMemoryCacheKey", "Ljava/lang/Integer;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "placeholder", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "error", "getError", "fallback", "getFallback", "newBuilder", "Lcoil/request/ImageRequest$Builder;", "equals", "other", "hashCode", "Listener", "Builder", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageRequest {
    private final boolean allowConversionToBitmap;
    private final boolean allowHardware;
    private final boolean allowRgb565;
    private final android.graphics.Bitmap.Config bitmapConfig;
    private final android.graphics.ColorSpace colorSpace;
    private final android.content.Context context;
    private final java.lang.Object data;
    private final kotlinx.coroutines.CoroutineDispatcher decoderDispatcher;
    private final coil.decode.Decoder.Factory decoderFactory;
    private final coil.request.DefaultRequestOptions defaults;
    private final coil.request.DefinedRequestOptions defined;
    private final java.lang.String diskCacheKey;
    private final coil.request.CachePolicy diskCachePolicy;
    private final android.graphics.drawable.Drawable errorDrawable;
    private final java.lang.Integer errorResId;
    private final android.graphics.drawable.Drawable fallbackDrawable;
    private final java.lang.Integer fallbackResId;
    private final kotlinx.coroutines.CoroutineDispatcher fetcherDispatcher;
    private final kotlin.Pair<coil.fetch.Fetcher.Factory<?>, java.lang.Class<?>> fetcherFactory;
    private final okhttp3.Headers headers;
    private final kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher;
    private final androidx.lifecycle.Lifecycle lifecycle;
    private final coil.request.ImageRequest.Listener listener;
    private final coil.memory.MemoryCache.Key memoryCacheKey;
    private final coil.request.CachePolicy memoryCachePolicy;
    private final coil.request.CachePolicy networkCachePolicy;
    private final coil.request.Parameters parameters;
    private final android.graphics.drawable.Drawable placeholderDrawable;
    private final coil.memory.MemoryCache.Key placeholderMemoryCacheKey;
    private final java.lang.Integer placeholderResId;
    private final coil.size.Precision precision;
    private final boolean premultipliedAlpha;
    private final coil.size.Scale scale;
    private final coil.size.SizeResolver sizeResolver;
    private final coil.request.Tags tags;
    private final coil.target.Target target;
    private final kotlinx.coroutines.CoroutineDispatcher transformationDispatcher;
    private final java.util.List<coil.transform.Transformation> transformations;
    private final coil.transition.Transition.Factory transitionFactory;

    public /* synthetic */ ImageRequest(android.content.Context context, java.lang.Object obj, coil.target.Target target, coil.request.ImageRequest.Listener listener, coil.memory.MemoryCache.Key key, java.lang.String str, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, coil.size.Precision precision, kotlin.Pair pair, coil.decode.Decoder.Factory factory, java.util.List list, coil.transition.Transition.Factory factory2, okhttp3.Headers headers, coil.request.Tags tags, boolean z, boolean z2, boolean z3, boolean z4, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher4, androidx.lifecycle.Lifecycle lifecycle, coil.size.SizeResolver sizeResolver, coil.size.Scale scale, coil.request.Parameters parameters, coil.memory.MemoryCache.Key key2, java.lang.Integer num, android.graphics.drawable.Drawable drawable, java.lang.Integer num2, android.graphics.drawable.Drawable drawable2, java.lang.Integer num3, android.graphics.drawable.Drawable drawable3, coil.request.DefinedRequestOptions definedRequestOptions, coil.request.DefaultRequestOptions defaultRequestOptions, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, listener, key, str, config, colorSpace, precision, pair, factory, list, factory2, headers, tags, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    public final coil.request.ImageRequest.Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImageRequest(android.content.Context context, java.lang.Object obj, coil.target.Target target, coil.request.ImageRequest.Listener listener, coil.memory.MemoryCache.Key key, java.lang.String str, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, coil.size.Precision precision, kotlin.Pair<? extends coil.fetch.Fetcher.Factory<?>, ? extends java.lang.Class<?>> pair, coil.decode.Decoder.Factory factory, java.util.List<? extends coil.transform.Transformation> list, coil.transition.Transition.Factory factory2, okhttp3.Headers headers, coil.request.Tags tags, boolean z, boolean z2, boolean z3, boolean z4, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher4, androidx.lifecycle.Lifecycle lifecycle, coil.size.SizeResolver sizeResolver, coil.size.Scale scale, coil.request.Parameters parameters, coil.memory.MemoryCache.Key key2, java.lang.Integer num, android.graphics.drawable.Drawable drawable, java.lang.Integer num2, android.graphics.drawable.Drawable drawable2, java.lang.Integer num3, android.graphics.drawable.Drawable drawable3, coil.request.DefinedRequestOptions definedRequestOptions, coil.request.DefaultRequestOptions defaultRequestOptions) {
        this.context = context;
        this.data = obj;
        this.target = target;
        this.listener = listener;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = precision;
        this.fetcherFactory = pair;
        this.decoderFactory = factory;
        this.transformations = list;
        this.transitionFactory = factory2;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z;
        this.allowHardware = z2;
        this.allowRgb565 = z3;
        this.premultipliedAlpha = z4;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.lifecycle = lifecycle;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = definedRequestOptions;
        this.defaults = defaultRequestOptions;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.Object getData() {
        return this.data;
    }

    public final coil.target.Target getTarget() {
        return this.target;
    }

    public final coil.request.ImageRequest.Listener getListener() {
        return this.listener;
    }

    public final coil.memory.MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final java.lang.String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public final android.graphics.Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final android.graphics.ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public final coil.size.Precision getPrecision() {
        return this.precision;
    }

    public final kotlin.Pair<coil.fetch.Fetcher.Factory<?>, java.lang.Class<?>> getFetcherFactory() {
        return this.fetcherFactory;
    }

    public final coil.decode.Decoder.Factory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final java.util.List<coil.transform.Transformation> getTransformations() {
        return this.transformations;
    }

    public final coil.transition.Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    public final okhttp3.Headers getHeaders() {
        return this.headers;
    }

    public final coil.request.Tags getTags() {
        return this.tags;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    public final coil.request.CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final coil.request.CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final coil.request.CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    public final androidx.lifecycle.Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final coil.size.SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    public final coil.size.Scale getScale() {
        return this.scale;
    }

    public final coil.request.Parameters getParameters() {
        return this.parameters;
    }

    public final coil.memory.MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    public final coil.request.DefinedRequestOptions getDefined() {
        return this.defined;
    }

    public final coil.request.DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    public final android.graphics.drawable.Drawable getPlaceholder() {
        return coil.util.Requests.getDrawableCompat(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    public final android.graphics.drawable.Drawable getError() {
        return coil.util.Requests.getDrawableCompat(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    public final android.graphics.drawable.Drawable getFallback() {
        return coil.util.Requests.getDrawableCompat(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    public static /* synthetic */ coil.request.ImageRequest.Builder newBuilder$default(coil.request.ImageRequest imageRequest, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.newBuilder(context);
    }

    public final coil.request.ImageRequest.Builder newBuilder(android.content.Context context) {
        return new coil.request.ImageRequest.Builder(this, context);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.request.ImageRequest) {
            coil.request.ImageRequest imageRequest = (coil.request.ImageRequest) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.context, imageRequest.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, imageRequest.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.target, imageRequest.target) && kotlin.jvm.internal.Intrinsics.areEqual(this.listener, imageRequest.listener) && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryCacheKey, imageRequest.memoryCacheKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.diskCacheKey, imageRequest.diskCacheKey) && this.bitmapConfig == imageRequest.bitmapConfig && ((android.os.Build.VERSION.SDK_INT < 26 || kotlin.jvm.internal.Intrinsics.areEqual(this.colorSpace, imageRequest.colorSpace)) && this.precision == imageRequest.precision && kotlin.jvm.internal.Intrinsics.areEqual(this.fetcherFactory, imageRequest.fetcherFactory) && kotlin.jvm.internal.Intrinsics.areEqual(this.decoderFactory, imageRequest.decoderFactory) && kotlin.jvm.internal.Intrinsics.areEqual(this.transformations, imageRequest.transformations) && kotlin.jvm.internal.Intrinsics.areEqual(this.transitionFactory, imageRequest.transitionFactory) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, imageRequest.headers) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, imageRequest.tags) && this.allowConversionToBitmap == imageRequest.allowConversionToBitmap && this.allowHardware == imageRequest.allowHardware && this.allowRgb565 == imageRequest.allowRgb565 && this.premultipliedAlpha == imageRequest.premultipliedAlpha && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && kotlin.jvm.internal.Intrinsics.areEqual(this.interceptorDispatcher, imageRequest.interceptorDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.fetcherDispatcher, imageRequest.fetcherDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.decoderDispatcher, imageRequest.decoderDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.transformationDispatcher, imageRequest.transformationDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderResId, imageRequest.placeholderResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholderDrawable, imageRequest.placeholderDrawable) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorResId, imageRequest.errorResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDrawable, imageRequest.errorDrawable) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallbackResId, imageRequest.fallbackResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallbackDrawable, imageRequest.fallbackDrawable) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifecycle, imageRequest.lifecycle) && kotlin.jvm.internal.Intrinsics.areEqual(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, imageRequest.parameters) && kotlin.jvm.internal.Intrinsics.areEqual(this.defined, imageRequest.defined) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaults, imageRequest.defaults))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        coil.target.Target target = this.target;
        int hashCode2 = (hashCode + (target != null ? target.hashCode() : 0)) * 31;
        coil.request.ImageRequest.Listener listener = this.listener;
        int hashCode3 = (hashCode2 + (listener != null ? listener.hashCode() : 0)) * 31;
        coil.memory.MemoryCache.Key key = this.memoryCacheKey;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        java.lang.String str = this.diskCacheKey;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        android.graphics.ColorSpace colorSpace = this.colorSpace;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        kotlin.Pair<coil.fetch.Fetcher.Factory<?>, java.lang.Class<?>> pair = this.fetcherFactory;
        int hashCode7 = (hashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        coil.decode.Decoder.Factory factory = this.decoderFactory;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (factory != null ? factory.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.allowConversionToBitmap)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.allowHardware)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.allowRgb565)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        coil.memory.MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        java.lang.Integer num = this.placeholderResId;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        android.graphics.drawable.Drawable drawable = this.placeholderDrawable;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        java.lang.Integer num2 = this.errorResId;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        android.graphics.drawable.Drawable drawable2 = this.errorDrawable;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        java.lang.Integer num3 = this.fallbackResId;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        android.graphics.drawable.Drawable drawable3 = this.fallbackDrawable;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* compiled from: ImageRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000bH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcoil/request/ImageRequest$Listener;", "", "onStart", "", "request", "Lcoil/request/ImageRequest;", "onCancel", "onError", "result", "Lcoil/request/ErrorResult;", "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void onCancel(coil.request.ImageRequest request);

        void onError(coil.request.ImageRequest request, coil.request.ErrorResult result);

        void onStart(coil.request.ImageRequest request);

        void onSuccess(coil.request.ImageRequest request, coil.request.SuccessResult result);

        /* compiled from: ImageRequest.kt */
        /* renamed from: coil.request.ImageRequest$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onCancel(coil.request.ImageRequest.Listener _this, coil.request.ImageRequest imageRequest) {
            }

            public static void $default$onError(coil.request.ImageRequest.Listener _this, coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
            }

            public static void $default$onStart(coil.request.ImageRequest.Listener _this, coil.request.ImageRequest imageRequest) {
            }

            public static void $default$onSuccess(coil.request.ImageRequest.Listener _this, coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
            }
        }

        /* compiled from: ImageRequest.kt */
        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static void onStart(coil.request.ImageRequest.Listener listener, coil.request.ImageRequest imageRequest) {
                coil.request.ImageRequest.Listener.CC.$default$onStart(listener, imageRequest);
            }

            @java.lang.Deprecated
            public static void onCancel(coil.request.ImageRequest.Listener listener, coil.request.ImageRequest imageRequest) {
                coil.request.ImageRequest.Listener.CC.$default$onCancel(listener, imageRequest);
            }

            @java.lang.Deprecated
            public static void onError(coil.request.ImageRequest.Listener listener, coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
                coil.request.ImageRequest.Listener.CC.$default$onError(listener, imageRequest, errorResult);
            }

            @java.lang.Deprecated
            public static void onSuccess(coil.request.ImageRequest.Listener listener, coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
                coil.request.ImageRequest.Listener.CC.$default$onSuccess(listener, imageRequest, successResult);
            }
        }
    }

    /* compiled from: ImageRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0013JÇ\u0001\u0010\u000e\u001a\u00020\u00002#\b\u0006\u0010N\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020R0O2#\b\u0006\u0010S\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020R0O28\b\u0006\u0010T\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110V¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R0U28\b\u0006\u0010X\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110Y¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R0UH\u0086\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204J\u000e\u00103\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204J\u000e\u00105\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204J\u000e\u00106\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204J\u000e\u00107\u001a\u00020\u00002\u0006\u0010Z\u001a\u000204J\u001f\u0010 \u001a\u00020\u00002\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0[\"\u00020\"¢\u0006\u0002\u0010\\J\u0014\u0010 \u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010^\u001a\u00020\u00002\b\b\u0001\u0010^\u001a\u00020<J\u001a\u0010^\u001a\u00020\u00002\b\b\u0001\u0010_\u001a\u00020<2\b\b\u0001\u0010`\u001a\u00020<J\u0016\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020a2\u0006\u0010`\u001a\u00020aJ\u000e\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020bJ\u000e\u0010^\u001a\u00020\u00002\u0006\u0010c\u001a\u00020GJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010H\u001a\u00020IJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J#\u0010\u001a\u001a\u00020\u0000\"\n\b\u0000\u0010d\u0018\u0001*\u00020\u00012\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hd0\u001cH\u0086\bJ,\u0010\u001a\u001a\u00020\u0000\"\b\b\u0000\u0010d*\u00020\u00012\f\u0010e\u001a\b\u0012\u0004\u0012\u0002Hd0\u001c2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002Hd0\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010e\u001a\u00020\u001fJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010g\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010g\u001a\u00020*J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010g\u001a\u00020*J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010g\u001a\u00020*J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010h\u001a\u000200J\u000e\u00101\u001a\u00020\u00002\u0006\u0010h\u001a\u000200J\u000e\u00102\u001a\u00020\u00002\u0006\u0010h\u001a\u000200J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020iJ\u0016\u0010j\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\u0013J\u0016\u0010l\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\u0013J\u000e\u0010m\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0013J$\u0010n\u001a\u00020\u0000\"\n\b\u0000\u0010d\u0018\u0001*\u00020\u00012\b\u0010n\u001a\u0004\u0018\u0001HdH\u0086\b¢\u0006\u0002\u0010oJ/\u0010n\u001a\u00020\u0000\"\b\b\u0000\u0010d*\u00020\u00012\u000e\u0010f\u001a\n\u0012\u0006\b\u0000\u0012\u0002Hd0\u001d2\b\u0010n\u001a\u0004\u0018\u0001Hd¢\u0006\u0002\u0010pJ\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020qJ\u0010\u0010:\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0013J\u0010\u0010:\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0011J\u0010\u0010r\u001a\u00020\u00002\b\b\u0001\u0010s\u001a\u00020<J\u0010\u0010r\u001a\u00020\u00002\b\u0010t\u001a\u0004\u0018\u00010?J\u0010\u0010u\u001a\u00020\u00002\b\b\u0001\u0010s\u001a\u00020<J\u0010\u0010u\u001a\u00020\u00002\b\u0010t\u001a\u0004\u0018\u00010?J\u0010\u0010v\u001a\u00020\u00002\b\b\u0001\u0010s\u001a\u00020<J\u0010\u0010v\u001a\u00020\u00002\b\u0010t\u001a\u0004\u0018\u00010?J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010w\u001a\u00020xJ|\u0010\f\u001a\u00020\u00002%\b\u0006\u0010N\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010?¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(r\u0012\u0004\u0012\u00020R0O2%\b\u0006\u0010T\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010?¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(u\u0012\u0004\u0012\u00020R0O2#\b\u0006\u0010X\u001a\u001d\u0012\u0013\u0012\u00110?¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(W\u0012\u0004\u0012\u00020R0OH\u0086\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010y\u001a\u00020\u00002\u0006\u0010g\u001a\u00020*J\u000e\u0010y\u001a\u00020\u00002\u0006\u0010z\u001a\u00020<J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010{\u001a\u00020$J\u0010\u0010D\u001a\u00020\u00002\b\u0010|\u001a\u0004\u0018\u00010}J\u0010\u0010D\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010EJ&\u0010~\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00132\b\u0010k\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0007J\u000e\u0010\u007f\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0013J\u000f\u00108\u001a\u00020\u00002\u0007\u00108\u001a\u00030\u0080\u0001J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0007\u0010\u0081\u0001\u001a\u00020\u0007J\t\u0010\u0082\u0001\u001a\u00020RH\u0002J\t\u0010\u0083\u0001\u001a\u00020RH\u0002J\t\u0010\u0084\u0001\u001a\u00020EH\u0002J\t\u0010\u0085\u0001\u001a\u00020GH\u0002J\t\u0010\u0086\u0001\u001a\u00020IH\u0002J\u0013\u0010\u0087\u0001\u001a\u00020\u00002\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0007J\u0013\u0010\u0089\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0007J\u0011\u0010{\u001a\u00020\u00002\u0007\u0010{\u001a\u00030\u008b\u0001H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010'\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020\u0001\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010,R\u0012\u0010-\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010,R\u000e\u0010.\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010;\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010@\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010=R\u0010\u0010A\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010B\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010=R\u0010\u0010C\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010IX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008c\u0001"}, d2 = {"Lcoil/request/ImageRequest$Builder;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "request", "Lcoil/request/ImageRequest;", "(Lcoil/request/ImageRequest;Landroid/content/Context;)V", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "data", "target", "Lcoil/target/Target;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "precision", "Lcoil/size/Precision;", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "headers", "Lokhttp3/Headers$Builder;", "tags", "", "allowConversionToBitmap", "", "allowHardware", "Ljava/lang/Boolean;", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "parameters", "Lcoil/request/Parameters$Builder;", "placeholderMemoryCacheKey", "placeholderResId", "", "Ljava/lang/Integer;", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "resolvedLifecycle", "resolvedSizeResolver", "resolvedScale", com.ironsource.X3.i.W, "onStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onCancel", "onError", "Lkotlin/Function2;", "Lcoil/request/ErrorResult;", "result", "onSuccess", "Lcoil/request/SuccessResult;", "dispatcher", "", "([Lcoil/transform/Transformation;)Lcoil/request/ImageRequest$Builder;", com.helpshift.proactive.InAppViewConstants.CONFIG, "size", "width", "height", "Lcoil/size/Dimension;", "Lcoil/size/Size;", "resolver", "T", "factory", "type", com.ironsource.mediationsdk.metadata.a.j, "policy", "Lokhttp3/Headers;", "addHeader", "value", "setHeader", "removeHeader", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "(Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "(Ljava/lang/Class;Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/Tags;", "placeholder", "drawableResId", "drawable", "error", "fallback", "imageView", "Landroid/widget/ImageView;", "crossfade", "durationMillis", "transition", "owner", "Landroidx/lifecycle/LifecycleOwner;", "setParameter", "removeParameter", "Lcoil/request/Parameters;", "build", "resetResolvedValues", "resetResolvedScale", "resolveLifecycle", "resolveSizeResolver", "resolveScale", "fetcher", "Lcoil/fetch/Fetcher;", "decoder", "Lcoil/decode/Decoder;", "Lcoil/transition/Transition;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean allowConversionToBitmap;
        private java.lang.Boolean allowHardware;
        private java.lang.Boolean allowRgb565;
        private android.graphics.Bitmap.Config bitmapConfig;
        private android.graphics.ColorSpace colorSpace;
        private final android.content.Context context;
        private java.lang.Object data;
        private kotlinx.coroutines.CoroutineDispatcher decoderDispatcher;
        private coil.decode.Decoder.Factory decoderFactory;
        private coil.request.DefaultRequestOptions defaults;
        private java.lang.String diskCacheKey;
        private coil.request.CachePolicy diskCachePolicy;
        private android.graphics.drawable.Drawable errorDrawable;
        private java.lang.Integer errorResId;
        private android.graphics.drawable.Drawable fallbackDrawable;
        private java.lang.Integer fallbackResId;
        private kotlinx.coroutines.CoroutineDispatcher fetcherDispatcher;
        private kotlin.Pair<? extends coil.fetch.Fetcher.Factory<?>, ? extends java.lang.Class<?>> fetcherFactory;
        private okhttp3.Headers.Builder headers;
        private kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher;
        private androidx.lifecycle.Lifecycle lifecycle;
        private coil.request.ImageRequest.Listener listener;
        private coil.memory.MemoryCache.Key memoryCacheKey;
        private coil.request.CachePolicy memoryCachePolicy;
        private coil.request.CachePolicy networkCachePolicy;
        private coil.request.Parameters.Builder parameters;
        private android.graphics.drawable.Drawable placeholderDrawable;
        private coil.memory.MemoryCache.Key placeholderMemoryCacheKey;
        private java.lang.Integer placeholderResId;
        private coil.size.Precision precision;
        private boolean premultipliedAlpha;
        private androidx.lifecycle.Lifecycle resolvedLifecycle;
        private coil.size.Scale resolvedScale;
        private coil.size.SizeResolver resolvedSizeResolver;
        private coil.size.Scale scale;
        private coil.size.SizeResolver sizeResolver;
        private java.util.Map<java.lang.Class<?>, java.lang.Object> tags;
        private coil.target.Target target;
        private kotlinx.coroutines.CoroutineDispatcher transformationDispatcher;
        private java.util.List<? extends coil.transform.Transformation> transformations;
        private coil.transition.Transition.Factory transitionFactory;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(coil.request.ImageRequest imageRequest) {
            this(imageRequest, null, 2, 0 == true ? 1 : 0);
        }

        public final coil.request.ImageRequest.Builder setParameter(java.lang.String str, java.lang.Object obj) {
            return setParameter$default(this, str, obj, null, 4, null);
        }

        public Builder(android.content.Context context) {
            this.context = context;
            this.defaults = coil.util.Requests.getDEFAULT_REQUEST_OPTIONS();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = null;
            }
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = kotlin.collections.CollectionsKt.emptyList();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public Builder(coil.request.ImageRequest imageRequest, android.content.Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.bitmapConfig = imageRequest.getDefined().getBitmapConfig();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = imageRequest.getColorSpace();
            }
            this.precision = imageRequest.getDefined().getPrecision();
            this.fetcherFactory = imageRequest.getFetcherFactory();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.transformations = imageRequest.getTransformations();
            this.transitionFactory = imageRequest.getDefined().getTransitionFactory();
            this.headers = imageRequest.getHeaders().newBuilder();
            this.tags = kotlin.collections.MapsKt.toMutableMap(imageRequest.getTags().asMap());
            this.allowConversionToBitmap = imageRequest.getAllowConversionToBitmap();
            this.allowHardware = imageRequest.getDefined().getAllowHardware();
            this.allowRgb565 = imageRequest.getDefined().getAllowRgb565();
            this.premultipliedAlpha = imageRequest.getPremultipliedAlpha();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = imageRequest.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = imageRequest.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = imageRequest.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = imageRequest.getDefined().getTransformationDispatcher();
            this.parameters = imageRequest.getParameters().newBuilder();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderResId = imageRequest.placeholderResId;
            this.placeholderDrawable = imageRequest.placeholderDrawable;
            this.errorResId = imageRequest.errorResId;
            this.errorDrawable = imageRequest.errorDrawable;
            this.fallbackResId = imageRequest.fallbackResId;
            this.fallbackDrawable = imageRequest.fallbackDrawable;
            this.lifecycle = imageRequest.getDefined().getLifecycle();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            if (imageRequest.getContext() == context) {
                this.resolvedLifecycle = imageRequest.getLifecycle();
                this.resolvedSizeResolver = imageRequest.getSizeResolver();
                this.resolvedScale = imageRequest.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }

        public /* synthetic */ Builder(coil.request.ImageRequest imageRequest, android.content.Context context, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.getContext() : context);
        }

        public final coil.request.ImageRequest.Builder data(java.lang.Object data) {
            this.data = data;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final coil.request.ImageRequest.Builder memoryCacheKey(java.lang.String key) {
            coil.memory.MemoryCache.Key key2 = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            if (key != null) {
                key2 = new coil.memory.MemoryCache.Key(key, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return memoryCacheKey(key2);
        }

        public final coil.request.ImageRequest.Builder memoryCacheKey(coil.memory.MemoryCache.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        public final coil.request.ImageRequest.Builder diskCacheKey(java.lang.String key) {
            this.diskCacheKey = key;
            return this;
        }

        public static /* synthetic */ coil.request.ImageRequest.Builder listener$default(coil.request.ImageRequest.Builder builder, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1<coil.request.ImageRequest, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$listener$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(coil.request.ImageRequest imageRequest) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            if ((i & 2) != 0) {
                function12 = new kotlin.jvm.functions.Function1<coil.request.ImageRequest, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$listener$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(coil.request.ImageRequest imageRequest) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function2 = new kotlin.jvm.functions.Function2<coil.request.ImageRequest, coil.request.ErrorResult, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$listener$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest imageRequest, coil.request.ErrorResult errorResult) {
                        invoke2(imageRequest, errorResult);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            if ((i & 8) != 0) {
                function22 = new kotlin.jvm.functions.Function2<coil.request.ImageRequest, coil.request.SuccessResult, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$listener$4
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(coil.request.ImageRequest imageRequest, coil.request.SuccessResult successResult) {
                        invoke2(imageRequest, successResult);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            return builder.listener(new coil.request.ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        public final coil.request.ImageRequest.Builder listener(kotlin.jvm.functions.Function1<? super coil.request.ImageRequest, kotlin.Unit> onStart, kotlin.jvm.functions.Function1<? super coil.request.ImageRequest, kotlin.Unit> onCancel, kotlin.jvm.functions.Function2<? super coil.request.ImageRequest, ? super coil.request.ErrorResult, kotlin.Unit> onError, kotlin.jvm.functions.Function2<? super coil.request.ImageRequest, ? super coil.request.SuccessResult, kotlin.Unit> onSuccess) {
            return listener(new coil.request.ImageRequest$Builder$listener$5(onStart, onCancel, onError, onSuccess));
        }

        public final coil.request.ImageRequest.Builder listener(coil.request.ImageRequest.Listener listener) {
            this.listener = listener;
            return this;
        }

        public final coil.request.ImageRequest.Builder dispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.fetcherDispatcher = dispatcher;
            this.decoderDispatcher = dispatcher;
            this.transformationDispatcher = dispatcher;
            return this;
        }

        public final coil.request.ImageRequest.Builder interceptorDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.interceptorDispatcher = dispatcher;
            return this;
        }

        public final coil.request.ImageRequest.Builder fetcherDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.fetcherDispatcher = dispatcher;
            return this;
        }

        public final coil.request.ImageRequest.Builder decoderDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.decoderDispatcher = dispatcher;
            return this;
        }

        public final coil.request.ImageRequest.Builder transformationDispatcher(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
            this.transformationDispatcher = dispatcher;
            return this;
        }

        public final coil.request.ImageRequest.Builder transformations(coil.transform.Transformation... transformations) {
            return transformations(kotlin.collections.ArraysKt.toList(transformations));
        }

        public final coil.request.ImageRequest.Builder transformations(java.util.List<? extends coil.transform.Transformation> transformations) {
            this.transformations = coil.util.Collections.toImmutableList(transformations);
            return this;
        }

        public final coil.request.ImageRequest.Builder bitmapConfig(android.graphics.Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        public final coil.request.ImageRequest.Builder colorSpace(android.graphics.ColorSpace colorSpace) {
            this.colorSpace = colorSpace;
            return this;
        }

        public final coil.request.ImageRequest.Builder size(int size) {
            return size(size, size);
        }

        public final coil.request.ImageRequest.Builder size(int width, int height) {
            return size(coil.size.Sizes.Size(width, height));
        }

        public final coil.request.ImageRequest.Builder size(coil.size.Dimension width, coil.size.Dimension height) {
            return size(new coil.size.Size(width, height));
        }

        public final coil.request.ImageRequest.Builder size(coil.size.Size size) {
            return size(coil.size.SizeResolvers.create(size));
        }

        public final coil.request.ImageRequest.Builder size(coil.size.SizeResolver resolver) {
            this.sizeResolver = resolver;
            resetResolvedValues();
            return this;
        }

        public final coil.request.ImageRequest.Builder scale(coil.size.Scale scale) {
            this.scale = scale;
            return this;
        }

        public final coil.request.ImageRequest.Builder precision(coil.size.Precision precision) {
            this.precision = precision;
            return this;
        }

        public final /* synthetic */ <T> coil.request.ImageRequest.Builder fetcherFactory(coil.fetch.Fetcher.Factory<T> factory) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return fetcherFactory(factory, java.lang.Object.class);
        }

        public final <T> coil.request.ImageRequest.Builder fetcherFactory(coil.fetch.Fetcher.Factory<T> factory, java.lang.Class<T> type) {
            this.fetcherFactory = kotlin.TuplesKt.to(factory, type);
            return this;
        }

        public final coil.request.ImageRequest.Builder decoderFactory(coil.decode.Decoder.Factory factory) {
            this.decoderFactory = factory;
            return this;
        }

        public final coil.request.ImageRequest.Builder allowConversionToBitmap(boolean enable) {
            this.allowConversionToBitmap = enable;
            return this;
        }

        public final coil.request.ImageRequest.Builder allowHardware(boolean enable) {
            this.allowHardware = java.lang.Boolean.valueOf(enable);
            return this;
        }

        public final coil.request.ImageRequest.Builder allowRgb565(boolean enable) {
            this.allowRgb565 = java.lang.Boolean.valueOf(enable);
            return this;
        }

        public final coil.request.ImageRequest.Builder premultipliedAlpha(boolean enable) {
            this.premultipliedAlpha = enable;
            return this;
        }

        public final coil.request.ImageRequest.Builder memoryCachePolicy(coil.request.CachePolicy policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        public final coil.request.ImageRequest.Builder diskCachePolicy(coil.request.CachePolicy policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        public final coil.request.ImageRequest.Builder networkCachePolicy(coil.request.CachePolicy policy) {
            this.networkCachePolicy = policy;
            return this;
        }

        public final coil.request.ImageRequest.Builder headers(okhttp3.Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        public final coil.request.ImageRequest.Builder addHeader(java.lang.String name, java.lang.String value) {
            okhttp3.Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new okhttp3.Headers.Builder();
                this.headers = builder;
            }
            builder.add(name, value);
            return this;
        }

        public final coil.request.ImageRequest.Builder setHeader(java.lang.String name, java.lang.String value) {
            okhttp3.Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new okhttp3.Headers.Builder();
                this.headers = builder;
            }
            builder.set(name, value);
            return this;
        }

        public final coil.request.ImageRequest.Builder removeHeader(java.lang.String name) {
            okhttp3.Headers.Builder builder = this.headers;
            if (builder != null) {
                builder.removeAll(name);
            }
            return this;
        }

        public final /* synthetic */ <T> coil.request.ImageRequest.Builder tag(T tag) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return tag(java.lang.Object.class, tag);
        }

        public final <T> coil.request.ImageRequest.Builder tag(java.lang.Class<? super T> type, T tag) {
            if (tag == null) {
                java.util.Map<java.lang.Class<?>, java.lang.Object> map = this.tags;
                if (map != null) {
                    map.remove(type);
                }
            } else {
                java.util.LinkedHashMap linkedHashMap = this.tags;
                if (linkedHashMap == null) {
                    linkedHashMap = new java.util.LinkedHashMap();
                    this.tags = linkedHashMap;
                }
                T cast = type.cast(tag);
                kotlin.jvm.internal.Intrinsics.checkNotNull(cast);
                linkedHashMap.put(type, cast);
            }
            return this;
        }

        public final coil.request.ImageRequest.Builder tags(coil.request.Tags tags) {
            this.tags = kotlin.collections.MapsKt.toMutableMap(tags.asMap());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final coil.request.ImageRequest.Builder placeholderMemoryCacheKey(java.lang.String key) {
            coil.memory.MemoryCache.Key key2 = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            if (key != null) {
                key2 = new coil.memory.MemoryCache.Key(key, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return placeholderMemoryCacheKey(key2);
        }

        public final coil.request.ImageRequest.Builder placeholderMemoryCacheKey(coil.memory.MemoryCache.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        public final coil.request.ImageRequest.Builder placeholder(int drawableResId) {
            this.placeholderResId = java.lang.Integer.valueOf(drawableResId);
            this.placeholderDrawable = null;
            return this;
        }

        public final coil.request.ImageRequest.Builder placeholder(android.graphics.drawable.Drawable drawable) {
            this.placeholderDrawable = drawable;
            this.placeholderResId = 0;
            return this;
        }

        public final coil.request.ImageRequest.Builder error(int drawableResId) {
            this.errorResId = java.lang.Integer.valueOf(drawableResId);
            this.errorDrawable = null;
            return this;
        }

        public final coil.request.ImageRequest.Builder error(android.graphics.drawable.Drawable drawable) {
            this.errorDrawable = drawable;
            this.errorResId = 0;
            return this;
        }

        public final coil.request.ImageRequest.Builder fallback(int drawableResId) {
            this.fallbackResId = java.lang.Integer.valueOf(drawableResId);
            this.fallbackDrawable = null;
            return this;
        }

        public final coil.request.ImageRequest.Builder fallback(android.graphics.drawable.Drawable drawable) {
            this.fallbackDrawable = drawable;
            this.fallbackResId = 0;
            return this;
        }

        public final coil.request.ImageRequest.Builder target(android.widget.ImageView imageView) {
            return target(new coil.target.ImageViewTarget(imageView));
        }

        public static /* synthetic */ coil.request.ImageRequest.Builder target$default(coil.request.ImageRequest.Builder builder, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$target$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.graphics.drawable.Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.drawable.Drawable drawable) {
                        invoke2(drawable);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            if ((i & 2) != 0) {
                function12 = new kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$target$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.graphics.drawable.Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.drawable.Drawable drawable) {
                        invoke2(drawable);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function13 = new kotlin.jvm.functions.Function1<android.graphics.drawable.Drawable, kotlin.Unit>() { // from class: coil.request.ImageRequest$Builder$target$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(android.graphics.drawable.Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.drawable.Drawable drawable) {
                        invoke2(drawable);
                        return kotlin.Unit.INSTANCE;
                    }
                };
            }
            return builder.target(new coil.request.ImageRequest$Builder$target$4(function1, function12, function13));
        }

        public final coil.request.ImageRequest.Builder target(kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> onStart, kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> onError, kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> onSuccess) {
            return target(new coil.request.ImageRequest$Builder$target$4(onStart, onError, onSuccess));
        }

        public final coil.request.ImageRequest.Builder target(coil.target.Target target) {
            this.target = target;
            resetResolvedValues();
            return this;
        }

        public final coil.request.ImageRequest.Builder crossfade(boolean enable) {
            return crossfade(enable ? 100 : 0);
        }

        public final coil.request.ImageRequest.Builder crossfade(int durationMillis) {
            coil.transition.CrossfadeTransition.Factory factory;
            if (durationMillis > 0) {
                factory = new coil.transition.CrossfadeTransition.Factory(durationMillis, false, 2, null);
            } else {
                factory = coil.transition.Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        public final coil.request.ImageRequest.Builder transitionFactory(coil.transition.Transition.Factory transition) {
            this.transitionFactory = transition;
            return this;
        }

        public final coil.request.ImageRequest.Builder lifecycle(androidx.lifecycle.LifecycleOwner owner) {
            return lifecycle(owner != null ? owner.getLifecycle() : null);
        }

        public final coil.request.ImageRequest.Builder lifecycle(androidx.lifecycle.Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public static /* synthetic */ coil.request.ImageRequest.Builder setParameter$default(coil.request.ImageRequest.Builder builder, java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.setParameter(str, obj, str2);
        }

        public final coil.request.ImageRequest.Builder setParameter(java.lang.String key, java.lang.Object value, java.lang.String memoryCacheKey) {
            coil.request.Parameters.Builder builder = this.parameters;
            if (builder == null) {
                builder = new coil.request.Parameters.Builder();
                this.parameters = builder;
            }
            builder.set(key, value, memoryCacheKey);
            return this;
        }

        public final coil.request.ImageRequest.Builder removeParameter(java.lang.String key) {
            coil.request.Parameters.Builder builder = this.parameters;
            if (builder != null) {
                builder.remove(key);
            }
            return this;
        }

        public final coil.request.ImageRequest.Builder parameters(coil.request.Parameters parameters) {
            this.parameters = parameters.newBuilder();
            return this;
        }

        public final coil.request.ImageRequest.Builder defaults(coil.request.DefaultRequestOptions defaults) {
            this.defaults = defaults;
            resetResolvedScale();
            return this;
        }

        public final coil.request.ImageRequest build() {
            android.content.Context context = this.context;
            java.lang.Object obj = this.data;
            if (obj == null) {
                obj = coil.request.NullRequestData.INSTANCE;
            }
            java.lang.Object obj2 = obj;
            coil.target.Target target = this.target;
            coil.request.ImageRequest.Listener listener = this.listener;
            coil.memory.MemoryCache.Key key = this.memoryCacheKey;
            java.lang.String str = this.diskCacheKey;
            android.graphics.Bitmap.Config config = this.bitmapConfig;
            if (config == null) {
                config = this.defaults.getBitmapConfig();
            }
            android.graphics.Bitmap.Config config2 = config;
            android.graphics.ColorSpace colorSpace = this.colorSpace;
            coil.size.Precision precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            coil.size.Precision precision2 = precision;
            kotlin.Pair<? extends coil.fetch.Fetcher.Factory<?>, ? extends java.lang.Class<?>> pair = this.fetcherFactory;
            coil.decode.Decoder.Factory factory = this.decoderFactory;
            java.util.List<? extends coil.transform.Transformation> list = this.transformations;
            coil.transition.Transition.Factory factory2 = this.transitionFactory;
            if (factory2 == null) {
                factory2 = this.defaults.getTransitionFactory();
            }
            coil.transition.Transition.Factory factory3 = factory2;
            okhttp3.Headers.Builder builder = this.headers;
            okhttp3.Headers orEmpty = coil.util.Utils.orEmpty(builder != null ? builder.build() : null);
            java.util.Map<java.lang.Class<?>, ? extends java.lang.Object> map = this.tags;
            coil.request.Tags orEmpty2 = coil.util.Utils.orEmpty(map != null ? coil.request.Tags.INSTANCE.from(map) : null);
            boolean z = this.allowConversionToBitmap;
            java.lang.Boolean bool = this.allowHardware;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            java.lang.Boolean bool2 = this.allowRgb565;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z2 = this.premultipliedAlpha;
            coil.request.CachePolicy cachePolicy = this.memoryCachePolicy;
            if (cachePolicy == null) {
                cachePolicy = this.defaults.getMemoryCachePolicy();
            }
            coil.request.CachePolicy cachePolicy2 = cachePolicy;
            coil.request.CachePolicy cachePolicy3 = this.diskCachePolicy;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.defaults.getDiskCachePolicy();
            }
            coil.request.CachePolicy cachePolicy4 = cachePolicy3;
            coil.request.CachePolicy cachePolicy5 = this.networkCachePolicy;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.defaults.getNetworkCachePolicy();
            }
            coil.request.CachePolicy cachePolicy6 = cachePolicy5;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.interceptorDispatcher;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.defaults.getInterceptorDispatcher();
            }
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3 = this.fetcherDispatcher;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.defaults.getFetcherDispatcher();
            }
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher5 = this.decoderDispatcher;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.defaults.getDecoderDispatcher();
            }
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher7 = this.transformationDispatcher;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.defaults.getTransformationDispatcher();
            }
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            androidx.lifecycle.Lifecycle lifecycle = this.lifecycle;
            if (lifecycle == null && (lifecycle = this.resolvedLifecycle) == null) {
                lifecycle = resolveLifecycle();
            }
            androidx.lifecycle.Lifecycle lifecycle2 = lifecycle;
            coil.size.SizeResolver sizeResolver = this.sizeResolver;
            if (sizeResolver == null && (sizeResolver = this.resolvedSizeResolver) == null) {
                sizeResolver = resolveSizeResolver();
            }
            coil.size.SizeResolver sizeResolver2 = sizeResolver;
            coil.size.Scale scale = this.scale;
            if (scale == null && (scale = this.resolvedScale) == null) {
                scale = resolveScale();
            }
            coil.size.Scale scale2 = scale;
            coil.request.Parameters.Builder builder2 = this.parameters;
            return new coil.request.ImageRequest(context, obj2, target, listener, key, str, config2, colorSpace, precision2, pair, factory, list, factory3, orEmpty, orEmpty2, z, booleanValue, booleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle2, sizeResolver2, scale2, coil.util.Utils.orEmpty(builder2 != null ? builder2.build() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new coil.request.DefinedRequestOptions(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        private final void resetResolvedValues() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        private final void resetResolvedScale() {
            this.resolvedScale = null;
        }

        private final androidx.lifecycle.Lifecycle resolveLifecycle() {
            coil.target.Target target = this.target;
            androidx.lifecycle.Lifecycle lifecycle = coil.util.Contexts.getLifecycle(target instanceof coil.target.ViewTarget ? ((coil.target.ViewTarget) target).getView().getContext() : this.context);
            return lifecycle == null ? coil.request.GlobalLifecycle.INSTANCE : lifecycle;
        }

        private final coil.size.SizeResolver resolveSizeResolver() {
            android.widget.ImageView.ScaleType scaleType;
            coil.target.Target target = this.target;
            if (target instanceof coil.target.ViewTarget) {
                android.view.View view = ((coil.target.ViewTarget) target).getView();
                if ((view instanceof android.widget.ImageView) && ((scaleType = ((android.widget.ImageView) view).getScaleType()) == android.widget.ImageView.ScaleType.CENTER || scaleType == android.widget.ImageView.ScaleType.MATRIX)) {
                    return coil.size.SizeResolvers.create(coil.size.Size.ORIGINAL);
                }
                return coil.size.ViewSizeResolvers.create$default(view, false, 2, null);
            }
            return new coil.size.DisplaySizeResolver(this.context);
        }

        private final coil.size.Scale resolveScale() {
            android.view.View view;
            coil.size.SizeResolver sizeResolver = this.sizeResolver;
            android.view.View view2 = null;
            coil.size.ViewSizeResolver viewSizeResolver = sizeResolver instanceof coil.size.ViewSizeResolver ? (coil.size.ViewSizeResolver) sizeResolver : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                coil.target.Target target = this.target;
                coil.target.ViewTarget viewTarget = target instanceof coil.target.ViewTarget ? (coil.target.ViewTarget) target : null;
                if (viewTarget != null) {
                    view2 = viewTarget.getView();
                }
            } else {
                view2 = view;
            }
            if (view2 instanceof android.widget.ImageView) {
                return coil.util.Utils.getScale((android.widget.ImageView) view2);
            }
            return coil.size.Scale.FIT;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @kotlin.ReplaceWith(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        public final coil.request.ImageRequest.Builder fetcher(coil.fetch.Fetcher fetcher) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @kotlin.ReplaceWith(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        public final coil.request.ImageRequest.Builder decoder(coil.decode.Decoder decoder) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @kotlin.ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        public final coil.request.ImageRequest.Builder transition(coil.transition.Transition transition) {
            coil.util.Utils.unsupported();
            throw new kotlin.KotlinNothingValueException();
        }
    }
}
