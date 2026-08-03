package coil.request;

/* compiled from: DefaultRequestOptions.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J¢\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0015J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00103\u001a\u000204H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0017\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-¨\u00065"}, d2 = {"Lcoil/request/DefaultRequestOptions;", "", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "transitionFactory", "Lcoil/transition/Transition$Factory;", "precision", "Lcoil/size/Precision;", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "allowHardware", "", "allowRgb565", "placeholder", "Landroid/graphics/drawable/Drawable;", "error", "fallback", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getFetcherDispatcher", "getDecoderDispatcher", "getTransformationDispatcher", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "getPrecision", "()Lcoil/size/Precision;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getAllowHardware", "()Z", "getAllowRgb565", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "getError", "getFallback", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "getDiskCachePolicy", "getNetworkCachePolicy", "copy", "equals", "other", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultRequestOptions {
    private final boolean allowHardware;
    private final boolean allowRgb565;
    private final android.graphics.Bitmap.Config bitmapConfig;
    private final kotlinx.coroutines.CoroutineDispatcher decoderDispatcher;
    private final coil.request.CachePolicy diskCachePolicy;
    private final android.graphics.drawable.Drawable error;
    private final android.graphics.drawable.Drawable fallback;
    private final kotlinx.coroutines.CoroutineDispatcher fetcherDispatcher;
    private final kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher;
    private final coil.request.CachePolicy memoryCachePolicy;
    private final coil.request.CachePolicy networkCachePolicy;
    private final android.graphics.drawable.Drawable placeholder;
    private final coil.size.Precision precision;
    private final kotlinx.coroutines.CoroutineDispatcher transformationDispatcher;
    private final coil.transition.Transition.Factory transitionFactory;

    public DefaultRequestOptions() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, androidx.compose.ui.layout.LayoutKt.LargeDimension, null);
    }

    public DefaultRequestOptions(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher4, coil.transition.Transition.Factory factory, coil.size.Precision precision, android.graphics.Bitmap.Config config, boolean z, boolean z2, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3) {
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.transitionFactory = factory;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = z;
        this.allowRgb565 = z2;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    public /* synthetic */ DefaultRequestOptions(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher4, coil.transition.Transition.Factory factory, coil.size.Precision precision, android.graphics.Bitmap.Config config, boolean z, boolean z2, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, coil.request.CachePolicy cachePolicy, coil.request.CachePolicy cachePolicy2, coil.request.CachePolicy cachePolicy3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.Dispatchers.getMain().getImmediate() : coroutineDispatcher, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher2, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher3, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getIO() : coroutineDispatcher4, (i & 16) != 0 ? coil.transition.Transition.Factory.NONE : factory, (i & 32) != 0 ? coil.size.Precision.AUTOMATIC : precision, (i & 64) != 0 ? coil.util.Utils.getDEFAULT_BITMAP_CONFIG() : config, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & 2048) == 0 ? drawable3 : null, (i & 4096) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy2, (i & 16384) != 0 ? coil.request.CachePolicy.ENABLED : cachePolicy3);
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

    public final coil.transition.Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    public final coil.size.Precision getPrecision() {
        return this.precision;
    }

    public final android.graphics.Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final android.graphics.drawable.Drawable getPlaceholder() {
        return this.placeholder;
    }

    public final android.graphics.drawable.Drawable getError() {
        return this.error;
    }

    public final android.graphics.drawable.Drawable getFallback() {
        return this.fallback;
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

    public final coil.request.DefaultRequestOptions copy(kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher, kotlinx.coroutines.CoroutineDispatcher fetcherDispatcher, kotlinx.coroutines.CoroutineDispatcher decoderDispatcher, kotlinx.coroutines.CoroutineDispatcher transformationDispatcher, coil.transition.Transition.Factory transitionFactory, coil.size.Precision precision, android.graphics.Bitmap.Config bitmapConfig, boolean allowHardware, boolean allowRgb565, android.graphics.drawable.Drawable placeholder, android.graphics.drawable.Drawable error, android.graphics.drawable.Drawable fallback, coil.request.CachePolicy memoryCachePolicy, coil.request.CachePolicy diskCachePolicy, coil.request.CachePolicy networkCachePolicy) {
        return new coil.request.DefaultRequestOptions(interceptorDispatcher, fetcherDispatcher, decoderDispatcher, transformationDispatcher, transitionFactory, precision, bitmapConfig, allowHardware, allowRgb565, placeholder, error, fallback, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.request.DefaultRequestOptions) {
            coil.request.DefaultRequestOptions defaultRequestOptions = (coil.request.DefaultRequestOptions) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.interceptorDispatcher, defaultRequestOptions.interceptorDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.fetcherDispatcher, defaultRequestOptions.fetcherDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.decoderDispatcher, defaultRequestOptions.decoderDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.transformationDispatcher, defaultRequestOptions.transformationDispatcher) && kotlin.jvm.internal.Intrinsics.areEqual(this.transitionFactory, defaultRequestOptions.transitionFactory) && this.precision == defaultRequestOptions.precision && this.bitmapConfig == defaultRequestOptions.bitmapConfig && this.allowHardware == defaultRequestOptions.allowHardware && this.allowRgb565 == defaultRequestOptions.allowRgb565 && kotlin.jvm.internal.Intrinsics.areEqual(this.placeholder, defaultRequestOptions.placeholder) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, defaultRequestOptions.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallback, defaultRequestOptions.fallback) && this.memoryCachePolicy == defaultRequestOptions.memoryCachePolicy && this.diskCachePolicy == defaultRequestOptions.diskCachePolicy && this.networkCachePolicy == defaultRequestOptions.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.interceptorDispatcher.hashCode() * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.allowHardware)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.allowRgb565)) * 31;
        android.graphics.drawable.Drawable drawable = this.placeholder;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        android.graphics.drawable.Drawable drawable2 = this.error;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        android.graphics.drawable.Drawable drawable3 = this.fallback;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }
}
