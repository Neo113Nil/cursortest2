package coil.request;

/* compiled from: RequestService.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcoil/request/RequestService;", "", "imageLoader", "Lcoil/ImageLoader;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "logger", "Lcoil/util/Logger;", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/util/Logger;)V", "hardwareBitmapService", "Lcoil/util/HardwareBitmapService;", "requestDelegate", "Lcoil/request/RequestDelegate;", "initialRequest", "Lcoil/request/ImageRequest;", "job", "Lkotlinx/coroutines/Job;", "errorResult", "Lcoil/request/ErrorResult;", "request", "throwable", "", "options", "Lcoil/request/Options;", "size", "Lcoil/size/Size;", "isConfigValidForHardware", "", "requestedConfig", "Landroid/graphics/Bitmap$Config;", "updateOptionsOnWorkerThread", "isBitmapConfigValidWorkerThread", "isConfigValidForHardwareAllocation", "isConfigValidForTransformations", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestService {
    private final coil.util.HardwareBitmapService hardwareBitmapService;
    private final coil.ImageLoader imageLoader;
    private final coil.util.SystemCallbacks systemCallbacks;

    public RequestService(coil.ImageLoader imageLoader, coil.util.SystemCallbacks systemCallbacks, coil.util.Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.hardwareBitmapService = coil.util.HardwareBitmaps.HardwareBitmapService(logger);
    }

    public final coil.request.RequestDelegate requestDelegate(coil.request.ImageRequest initialRequest, kotlinx.coroutines.Job job) {
        androidx.lifecycle.Lifecycle lifecycle = initialRequest.getLifecycle();
        coil.target.Target target = initialRequest.getTarget();
        if (target instanceof coil.target.ViewTarget) {
            return new coil.request.ViewTargetRequestDelegate(this.imageLoader, initialRequest, (coil.target.ViewTarget) target, lifecycle, job);
        }
        return new coil.request.BaseRequestDelegate(lifecycle, job);
    }

    public final coil.request.ErrorResult errorResult(coil.request.ImageRequest request, java.lang.Throwable throwable) {
        android.graphics.drawable.Drawable error;
        if (throwable instanceof coil.request.NullRequestDataException) {
            error = request.getFallback();
            if (error == null) {
                error = request.getError();
            }
        } else {
            error = request.getError();
        }
        return new coil.request.ErrorResult(error, request, throwable);
    }

    public final coil.request.Options options(coil.request.ImageRequest request, coil.size.Size size) {
        coil.size.Scale scale;
        android.graphics.Bitmap.Config bitmapConfig = (isConfigValidForTransformations(request) && isConfigValidForHardwareAllocation(request, size)) ? request.getBitmapConfig() : android.graphics.Bitmap.Config.ARGB_8888;
        if (kotlin.jvm.internal.Intrinsics.areEqual(size.getWidth(), coil.size.Dimension.Undefined.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(size.getHeight(), coil.size.Dimension.Undefined.INSTANCE)) {
            scale = coil.size.Scale.FIT;
        } else {
            scale = request.getScale();
        }
        return new coil.request.Options(request.getContext(), bitmapConfig, request.getColorSpace(), size, scale, coil.util.Requests.getAllowInexactSize(request), request.getAllowRgb565() && request.getTransformations().isEmpty() && bitmapConfig != android.graphics.Bitmap.Config.ALPHA_8, request.getPremultipliedAlpha(), request.getDiskCacheKey(), request.getHeaders(), request.getTags(), request.getParameters(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy());
    }

    public final boolean isConfigValidForHardware(coil.request.ImageRequest request, android.graphics.Bitmap.Config requestedConfig) {
        if (!coil.util.Bitmaps.isHardware(requestedConfig)) {
            return true;
        }
        if (!request.getAllowHardware()) {
            return false;
        }
        coil.target.Target target = request.getTarget();
        if (target instanceof coil.target.ViewTarget) {
            android.view.View view = ((coil.target.ViewTarget) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final coil.request.Options updateOptionsOnWorkerThread(coil.request.Options options) {
        boolean z;
        android.graphics.Bitmap.Config config;
        coil.request.CachePolicy cachePolicy;
        coil.request.Options copy;
        android.graphics.Bitmap.Config config2 = options.getConfig();
        coil.request.CachePolicy networkCachePolicy = options.getNetworkCachePolicy();
        boolean z2 = true;
        if (isBitmapConfigValidWorkerThread(options)) {
            z = false;
            config = config2;
        } else {
            config = android.graphics.Bitmap.Config.ARGB_8888;
            z = true;
        }
        if (options.getNetworkCachePolicy().getReadEnabled() && !this.systemCallbacks.isOnline()) {
            cachePolicy = coil.request.CachePolicy.DISABLED;
            if (z2) {
                return options;
            }
            copy = options.copy((r32 & 1) != 0 ? options.context : null, (r32 & 2) != 0 ? options.config : config, (r32 & 4) != 0 ? options.colorSpace : null, (r32 & 8) != 0 ? options.size : null, (r32 & 16) != 0 ? options.scale : null, (r32 & 32) != 0 ? options.allowInexactSize : false, (r32 & 64) != 0 ? options.allowRgb565 : false, (r32 & 128) != 0 ? options.premultipliedAlpha : false, (r32 & 256) != 0 ? options.diskCacheKey : null, (r32 & 512) != 0 ? options.headers : null, (r32 & 1024) != 0 ? options.tags : null, (r32 & 2048) != 0 ? options.parameters : null, (r32 & 4096) != 0 ? options.memoryCachePolicy : null, (r32 & 8192) != 0 ? options.diskCachePolicy : null, (r32 & 16384) != 0 ? options.networkCachePolicy : cachePolicy);
            return copy;
        }
        cachePolicy = networkCachePolicy;
        z2 = z;
        if (z2) {
        }
    }

    private final boolean isBitmapConfigValidWorkerThread(coil.request.Options options) {
        return !coil.util.Bitmaps.isHardware(options.getConfig()) || this.hardwareBitmapService.getAllowHardware();
    }

    private final boolean isConfigValidForHardwareAllocation(coil.request.ImageRequest request, coil.size.Size size) {
        if (coil.util.Bitmaps.isHardware(request.getBitmapConfig())) {
            return isConfigValidForHardware(request, request.getBitmapConfig()) && this.hardwareBitmapService.allowHardwareMainThread(size);
        }
        return true;
    }

    private final boolean isConfigValidForTransformations(coil.request.ImageRequest request) {
        return request.getTransformations().isEmpty() || kotlin.collections.ArraysKt.contains(coil.util.Utils.getVALID_TRANSFORMATION_CONFIGS(), request.getBitmapConfig());
    }
}
