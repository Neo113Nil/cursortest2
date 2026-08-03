package coil;

/* compiled from: RealImageLoader.kt */
@kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0016J\u0016\u0010A\u001a\u00020B2\u0006\u0010?\u001a\u00020@H\u0096@¢\u0006\u0002\u0010CJ\u001e\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020GH\u0083@¢\u0006\u0002\u0010HJ\u0015\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020GH\u0000¢\u0006\u0002\bLJ\b\u0010;\u001a\u00020JH\u0016J\b\u0010M\u001a\u00020NH\u0016J\"\u0010O\u001a\u00020J2\u0006\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020UH\u0002J\"\u0010V\u001a\u00020J2\u0006\u0010P\u001a\u00020W2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020UH\u0002J\u0018\u0010X\u001a\u00020J2\u0006\u0010?\u001a\u00020@2\u0006\u0010T\u001a\u00020UH\u0002J1\u0010Y\u001a\u00020J2\u0006\u0010P\u001a\u00020B2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020U2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020J0[H\u0082\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b0\u00101*\u0004\b.\u0010/R\u001d\u00102\u001a\u0004\u0018\u00010\n8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b4\u00105*\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", com.google.firebase.remoteconfig.RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "diskCacheLazy", "Lcoil/disk/DiskCache;", "callFactoryLazy", "Lokhttp3/Call$Factory;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", "options", "Lcoil/util/ImageLoaderOptions;", "logger", "Lcoil/util/Logger;", "<init>", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "getContext", "()Landroid/content/Context;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "getDiskCacheLazy", "getCallFactoryLazy", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "getLogger", "()Lcoil/util/Logger;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "requestService", "Lcoil/request/RequestService;", "memoryCache", "getMemoryCache$delegate", "(Lcoil/RealImageLoader;)Ljava/lang/Object;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "diskCache", "getDiskCache$delegate", "getDiskCache", "()Lcoil/disk/DiskCache;", "components", "getComponents", "interceptors", "", "Lcoil/intercept/Interceptor;", "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeMain", "initialRequest", "type", "", "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTrimMemory", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "onTrimMemory$coil_base_release", "newBuilder", "Lcoil/ImageLoader$Builder;", "onSuccess", "result", "Lcoil/request/SuccessResult;", "target", "Lcoil/target/Target;", "eventListener", "Lcoil/EventListener;", "onError", "Lcoil/request/ErrorResult;", "onCancel", "transition", "setDrawable", "Lkotlin/Function0;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RealImageLoader implements coil.ImageLoader {
    private static final int REQUEST_TYPE_ENQUEUE = 0;
    private static final int REQUEST_TYPE_EXECUTE = 1;
    private static final java.lang.String TAG = "RealImageLoader";
    private final kotlin.Lazy<okhttp3.Call.Factory> callFactoryLazy;
    private final coil.ComponentRegistry componentRegistry;
    private final coil.ComponentRegistry components;
    private final android.content.Context context;
    private final coil.request.DefaultRequestOptions defaults;
    private final kotlin.Lazy<coil.disk.DiskCache> diskCacheLazy;
    private final coil.EventListener.Factory eventListenerFactory;
    private final java.util.List<coil.intercept.Interceptor> interceptors;
    private final coil.util.Logger logger;
    private final kotlin.Lazy<coil.memory.MemoryCache> memoryCacheLazy;
    private final coil.util.ImageLoaderOptions options;
    private final coil.request.RequestService requestService;
    private final kotlinx.coroutines.CoroutineScope scope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()).plus(new coil.RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE, this)));
    private final java.util.concurrent.atomic.AtomicBoolean shutdown;
    private final coil.util.SystemCallbacks systemCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(android.content.Context context, coil.request.DefaultRequestOptions defaultRequestOptions, kotlin.Lazy<? extends coil.memory.MemoryCache> lazy, kotlin.Lazy<? extends coil.disk.DiskCache> lazy2, kotlin.Lazy<? extends okhttp3.Call.Factory> lazy3, coil.EventListener.Factory factory, coil.ComponentRegistry componentRegistry, coil.util.ImageLoaderOptions imageLoaderOptions, coil.util.Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        this.logger = logger;
        coil.util.SystemCallbacks systemCallbacks = new coil.util.SystemCallbacks(this);
        this.systemCallbacks = systemCallbacks;
        coil.RealImageLoader realImageLoader = this;
        coil.request.RequestService requestService = new coil.request.RequestService(realImageLoader, systemCallbacks, logger);
        this.requestService = requestService;
        this.components = componentRegistry.newBuilder().add(new coil.map.HttpUrlMapper(), okhttp3.HttpUrl.class).add(new coil.map.StringMapper(), java.lang.String.class).add(new coil.map.FileUriMapper(), android.net.Uri.class).add(new coil.map.ResourceUriMapper(), android.net.Uri.class).add(new coil.map.ResourceIntMapper(), java.lang.Integer.class).add(new coil.map.ByteArrayMapper(), byte[].class).add(new coil.key.UriKeyer(), android.net.Uri.class).add(new coil.key.FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), java.io.File.class).add(new coil.fetch.HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), android.net.Uri.class).add(new coil.fetch.FileFetcher.Factory(), java.io.File.class).add(new coil.fetch.AssetUriFetcher.Factory(), android.net.Uri.class).add(new coil.fetch.ContentUriFetcher.Factory(), android.net.Uri.class).add(new coil.fetch.ResourceUriFetcher.Factory(), android.net.Uri.class).add(new coil.fetch.DrawableFetcher.Factory(), android.graphics.drawable.Drawable.class).add(new coil.fetch.BitmapFetcher.Factory(), android.graphics.Bitmap.class).add(new coil.fetch.ByteBufferFetcher.Factory(), java.nio.ByteBuffer.class).add(new coil.decode.BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends coil.intercept.EngineInterceptor>) getComponents().getInterceptors(), new coil.intercept.EngineInterceptor(realImageLoader, systemCallbacks, requestService, logger));
        this.shutdown = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // coil.ImageLoader
    public coil.request.DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    public final kotlin.Lazy<coil.memory.MemoryCache> getMemoryCacheLazy() {
        return this.memoryCacheLazy;
    }

    public final kotlin.Lazy<coil.disk.DiskCache> getDiskCacheLazy() {
        return this.diskCacheLazy;
    }

    public final kotlin.Lazy<okhttp3.Call.Factory> getCallFactoryLazy() {
        return this.callFactoryLazy;
    }

    public final coil.EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final coil.ComponentRegistry getComponentRegistry() {
        return this.componentRegistry;
    }

    public final coil.util.ImageLoaderOptions getOptions() {
        return this.options;
    }

    public final coil.util.Logger getLogger() {
        return this.logger;
    }

    @Override // coil.ImageLoader
    public coil.memory.MemoryCache getMemoryCache() {
        return this.memoryCacheLazy.getValue();
    }

    @Override // coil.ImageLoader
    public coil.disk.DiskCache getDiskCache() {
        return this.diskCacheLazy.getValue();
    }

    @Override // coil.ImageLoader
    public coil.ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    public coil.request.Disposable enqueue(coil.request.ImageRequest request) {
        kotlinx.coroutines.Deferred<? extends coil.request.ImageResult> async$default;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new coil.RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        if (request.getTarget() instanceof coil.target.ViewTarget) {
            return coil.util.Utils.getRequestManager(((coil.target.ViewTarget) request.getTarget()).getView()).getDisposable(async$default);
        }
        return new coil.request.OneShotDisposable(async$default);
    }

    @Override // coil.ImageLoader
    public java.lang.Object execute(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        if (imageRequest.getTarget() instanceof coil.target.ViewTarget) {
            return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new coil.RealImageLoader$execute$2(imageRequest, this, null), continuation);
        }
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new coil.RealImageLoader$execute$3(this, imageRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018c A[Catch: all -> 0x004c, TryCatch #4 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x0186, B:16:0x018c, B:20:0x0197, B:22:0x019b, B:23:0x01a9, B:24:0x01ae), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0197 A[Catch: all -> 0x004c, TryCatch #4 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x0186, B:16:0x018c, B:20:0x0197, B:22:0x019b, B:23:0x01a9, B:24:0x01ae), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c3 A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #2 {all -> 0x01d8, blocks: (B:27:0x01bf, B:29:0x01c3, B:32:0x01d4, B:33:0x01d7), top: B:26:0x01bf }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d4 A[Catch: all -> 0x01d8, TRY_ENTER, TryCatch #2 {all -> 0x01d8, blocks: (B:27:0x01bf, B:29:0x01c3, B:32:0x01d4, B:33:0x01d7), top: B:26:0x01bf }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3 A[Catch: all -> 0x01af, TryCatch #5 {all -> 0x01af, blocks: (B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:61:0x0101, B:63:0x0109, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:69:0x012f, B:70:0x0132, B:75:0x0119), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: all -> 0x01af, TryCatch #5 {all -> 0x01af, blocks: (B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:61:0x0101, B:63:0x0109, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:69:0x012f, B:70:0x0132, B:75:0x0119), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123 A[Catch: all -> 0x01af, TryCatch #5 {all -> 0x01af, blocks: (B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:61:0x0101, B:63:0x0109, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:69:0x012f, B:70:0x0132, B:75:0x0119), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f A[Catch: all -> 0x01af, TryCatch #5 {all -> 0x01af, blocks: (B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:61:0x0101, B:63:0x0109, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:69:0x012f, B:70:0x0132, B:75:0x0119), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119 A[Catch: all -> 0x01af, TryCatch #5 {all -> 0x01af, blocks: (B:55:0x00ed, B:57:0x00f3, B:59:0x00f9, B:61:0x0101, B:63:0x0109, B:64:0x011d, B:66:0x0123, B:67:0x0126, B:69:0x012f, B:70:0x0132, B:75:0x0119), top: B:54:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeMain(coil.request.ImageRequest imageRequest, int i, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        coil.RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        java.lang.Object coroutine_suspended;
        int i2;
        coil.request.RequestDelegate requestDelegate;
        coil.request.ImageRequest build;
        coil.RealImageLoader realImageLoader;
        coil.request.RequestDelegate requestDelegate2;
        coil.EventListener eventListener;
        coil.RealImageLoader realImageLoader2;
        coil.request.ImageRequest imageRequest2;
        coil.EventListener eventListener2;
        coil.request.RequestDelegate requestDelegate3;
        coil.memory.MemoryCache memoryCache;
        android.graphics.Bitmap bitmap;
        coil.target.Target target;
        coil.request.ImageRequest.Listener listener;
        java.lang.Object size;
        android.graphics.Bitmap bitmap2;
        coil.RealImageLoader realImageLoader3;
        coil.request.RequestDelegate requestDelegate4;
        java.lang.Object obj;
        coil.request.ImageRequest imageRequest3;
        java.lang.Object withContext;
        java.lang.Object obj2;
        coil.request.ImageResult imageResult;
        try {
            if (continuation instanceof coil.RealImageLoader$executeMain$1) {
                realImageLoader$executeMain$1 = (coil.RealImageLoader$executeMain$1) continuation;
                if ((realImageLoader$executeMain$1.label & Integer.MIN_VALUE) != 0) {
                    realImageLoader$executeMain$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj3 = realImageLoader$executeMain$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = realImageLoader$executeMain$1.label;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        requestDelegate = this.requestService.requestDelegate(imageRequest, kotlinx.coroutines.JobKt.getJob(realImageLoader$executeMain$1.getContext()));
                        requestDelegate.assertActive();
                        build = coil.request.ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
                        coil.EventListener create = this.eventListenerFactory.create(build);
                        try {
                            if (build.getData() == coil.request.NullRequestData.INSTANCE) {
                                throw new coil.request.NullRequestDataException();
                            }
                            requestDelegate.start();
                            if (i == 0) {
                                androidx.lifecycle.Lifecycle lifecycle = build.getLifecycle();
                                realImageLoader$executeMain$1.L$0 = this;
                                realImageLoader$executeMain$1.L$1 = requestDelegate;
                                realImageLoader$executeMain$1.L$2 = build;
                                realImageLoader$executeMain$1.L$3 = create;
                                realImageLoader$executeMain$1.label = 1;
                                if (coil.util.Lifecycles.awaitStarted(lifecycle, realImageLoader$executeMain$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                realImageLoader2 = this;
                                imageRequest2 = build;
                                eventListener2 = create;
                                requestDelegate3 = requestDelegate;
                            } else {
                                realImageLoader2 = this;
                                imageRequest2 = build;
                                eventListener2 = create;
                                memoryCache = realImageLoader2.getMemoryCache();
                                if (memoryCache != null) {
                                    coil.memory.MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                                    coil.memory.MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
                                    if (value != null) {
                                        bitmap = value.getBitmap();
                                        android.graphics.drawable.BitmapDrawable bitmapDrawable = bitmap == null ? new android.graphics.drawable.BitmapDrawable(imageRequest2.getContext().getResources(), bitmap) : imageRequest2.getPlaceholder();
                                        target = imageRequest2.getTarget();
                                        if (target != null) {
                                            target.onStart(bitmapDrawable);
                                        }
                                        eventListener2.onStart(imageRequest2);
                                        listener = imageRequest2.getListener();
                                        if (listener != null) {
                                            listener.onStart(imageRequest2);
                                        }
                                        eventListener2.resolveSizeStart(imageRequest2);
                                        coil.size.SizeResolver sizeResolver = imageRequest2.getSizeResolver();
                                        realImageLoader$executeMain$1.L$0 = realImageLoader2;
                                        realImageLoader$executeMain$1.L$1 = requestDelegate;
                                        realImageLoader$executeMain$1.L$2 = imageRequest2;
                                        realImageLoader$executeMain$1.L$3 = eventListener2;
                                        realImageLoader$executeMain$1.L$4 = bitmap;
                                        realImageLoader$executeMain$1.label = 2;
                                        size = sizeResolver.size(realImageLoader$executeMain$1);
                                        if (size != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        bitmap2 = bitmap;
                                        realImageLoader3 = realImageLoader2;
                                        coil.request.ImageRequest imageRequest4 = imageRequest2;
                                        requestDelegate4 = requestDelegate;
                                        obj = size;
                                        imageRequest3 = imageRequest4;
                                        coil.size.Size size2 = (coil.size.Size) obj;
                                        eventListener2.resolveSizeEnd(imageRequest3, size2);
                                        kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                                        coil.RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new coil.RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size2, eventListener2, bitmap2, null);
                                        realImageLoader$executeMain$1.L$0 = realImageLoader3;
                                        realImageLoader$executeMain$1.L$1 = requestDelegate4;
                                        realImageLoader$executeMain$1.L$2 = imageRequest3;
                                        realImageLoader$executeMain$1.L$3 = eventListener2;
                                        realImageLoader$executeMain$1.L$4 = null;
                                        realImageLoader$executeMain$1.label = 3;
                                        withContext = kotlinx.coroutines.BuildersKt.withContext(interceptorDispatcher, realImageLoader$executeMain$result$1, realImageLoader$executeMain$1);
                                        if (withContext != coroutine_suspended) {
                                        }
                                    }
                                }
                                bitmap = null;
                                if (bitmap == null) {
                                }
                                target = imageRequest2.getTarget();
                                if (target != null) {
                                }
                                eventListener2.onStart(imageRequest2);
                                listener = imageRequest2.getListener();
                                if (listener != null) {
                                }
                                eventListener2.resolveSizeStart(imageRequest2);
                                coil.size.SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
                                realImageLoader$executeMain$1.L$0 = realImageLoader2;
                                realImageLoader$executeMain$1.L$1 = requestDelegate;
                                realImageLoader$executeMain$1.L$2 = imageRequest2;
                                realImageLoader$executeMain$1.L$3 = eventListener2;
                                realImageLoader$executeMain$1.L$4 = bitmap;
                                realImageLoader$executeMain$1.label = 2;
                                size = sizeResolver2.size(realImageLoader$executeMain$1);
                                if (size != coroutine_suspended) {
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            realImageLoader = this;
                            requestDelegate2 = requestDelegate;
                            eventListener = create;
                            if (th instanceof java.util.concurrent.CancellationException) {
                            }
                        }
                    } else if (i2 == 1) {
                        eventListener2 = (coil.EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest2 = (coil.request.ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate3 = (coil.request.RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader2 = (coil.RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            eventListener = eventListener2;
                            build = imageRequest2;
                            requestDelegate2 = requestDelegate3;
                            realImageLoader = realImageLoader2;
                            if (th instanceof java.util.concurrent.CancellationException) {
                                realImageLoader.onCancel(build, eventListener);
                                throw th;
                            }
                            coil.request.ErrorResult errorResult = realImageLoader.requestService.errorResult(build, th);
                            realImageLoader.onError(errorResult, build.getTarget(), eventListener);
                            return errorResult;
                        }
                    } else if (i2 == 2) {
                        android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) realImageLoader$executeMain$1.L$4;
                        eventListener2 = (coil.EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest3 = (coil.request.ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate4 = (coil.request.RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader3 = (coil.RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            bitmap2 = bitmap3;
                            obj = obj3;
                            coil.size.Size size22 = (coil.size.Size) obj;
                            eventListener2.resolveSizeEnd(imageRequest3, size22);
                            kotlinx.coroutines.CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
                            coil.RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$12 = new coil.RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size22, eventListener2, bitmap2, null);
                            realImageLoader$executeMain$1.L$0 = realImageLoader3;
                            realImageLoader$executeMain$1.L$1 = requestDelegate4;
                            realImageLoader$executeMain$1.L$2 = imageRequest3;
                            realImageLoader$executeMain$1.L$3 = eventListener2;
                            realImageLoader$executeMain$1.L$4 = null;
                            realImageLoader$executeMain$1.label = 3;
                            withContext = kotlinx.coroutines.BuildersKt.withContext(interceptorDispatcher2, realImageLoader$executeMain$result$12, realImageLoader$executeMain$1);
                            if (withContext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            obj2 = withContext;
                            imageResult = (coil.request.ImageResult) obj2;
                            if (!(imageResult instanceof coil.request.SuccessResult)) {
                            }
                            return imageResult;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            if (th instanceof java.util.concurrent.CancellationException) {
                            }
                        }
                    } else {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eventListener = (coil.EventListener) realImageLoader$executeMain$1.L$3;
                        build = (coil.request.ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate2 = (coil.request.RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader = (coil.RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            obj2 = obj3;
                            imageResult = (coil.request.ImageResult) obj2;
                            if (!(imageResult instanceof coil.request.SuccessResult)) {
                                realImageLoader.onSuccess((coil.request.SuccessResult) imageResult, build.getTarget(), eventListener);
                            } else {
                                if (!(imageResult instanceof coil.request.ErrorResult)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                realImageLoader.onError((coil.request.ErrorResult) imageResult, build.getTarget(), eventListener);
                            }
                            return imageResult;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                if (th instanceof java.util.concurrent.CancellationException) {
                                }
                            } finally {
                                requestDelegate2.complete();
                            }
                        }
                    }
                    requestDelegate = requestDelegate3;
                    memoryCache = realImageLoader2.getMemoryCache();
                    if (memoryCache != null) {
                    }
                    bitmap = null;
                    if (bitmap == null) {
                    }
                    target = imageRequest2.getTarget();
                    if (target != null) {
                    }
                    eventListener2.onStart(imageRequest2);
                    listener = imageRequest2.getListener();
                    if (listener != null) {
                    }
                    eventListener2.resolveSizeStart(imageRequest2);
                    coil.size.SizeResolver sizeResolver22 = imageRequest2.getSizeResolver();
                    realImageLoader$executeMain$1.L$0 = realImageLoader2;
                    realImageLoader$executeMain$1.L$1 = requestDelegate;
                    realImageLoader$executeMain$1.L$2 = imageRequest2;
                    realImageLoader$executeMain$1.L$3 = eventListener2;
                    realImageLoader$executeMain$1.L$4 = bitmap;
                    realImageLoader$executeMain$1.label = 2;
                    size = sizeResolver22.size(realImageLoader$executeMain$1);
                    if (size != coroutine_suspended) {
                    }
                }
            }
            memoryCache = realImageLoader2.getMemoryCache();
            if (memoryCache != null) {
            }
            bitmap = null;
            if (bitmap == null) {
            }
            target = imageRequest2.getTarget();
            if (target != null) {
            }
            eventListener2.onStart(imageRequest2);
            listener = imageRequest2.getListener();
            if (listener != null) {
            }
            eventListener2.resolveSizeStart(imageRequest2);
            coil.size.SizeResolver sizeResolver222 = imageRequest2.getSizeResolver();
            realImageLoader$executeMain$1.L$0 = realImageLoader2;
            realImageLoader$executeMain$1.L$1 = requestDelegate;
            realImageLoader$executeMain$1.L$2 = imageRequest2;
            realImageLoader$executeMain$1.L$3 = eventListener2;
            realImageLoader$executeMain$1.L$4 = bitmap;
            realImageLoader$executeMain$1.label = 2;
            size = sizeResolver222.size(realImageLoader$executeMain$1);
            if (size != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            requestDelegate2 = requestDelegate;
            eventListener = eventListener2;
            build = imageRequest2;
            realImageLoader = realImageLoader2;
            if (th instanceof java.util.concurrent.CancellationException) {
            }
        }
        realImageLoader$executeMain$1 = new coil.RealImageLoader$executeMain$1(this, continuation);
        java.lang.Object obj32 = realImageLoader$executeMain$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = realImageLoader$executeMain$1.label;
        if (i2 != 0) {
        }
        requestDelegate = requestDelegate3;
    }

    public final void onTrimMemory$coil_base_release(int level) {
        coil.memory.MemoryCache value;
        kotlin.Lazy<coil.memory.MemoryCache> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.shutdown.getAndSet(true)) {
            return;
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        coil.memory.MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil.ImageLoader
    public coil.ImageLoader.Builder newBuilder() {
        return new coil.ImageLoader.Builder(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(coil.request.SuccessResult result, coil.target.Target target, coil.EventListener eventListener) {
        coil.request.ImageRequest request = result.getRequest();
        coil.decode.DataSource dataSource = result.getDataSource();
        coil.util.Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, coil.util.Utils.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
        }
        if (target instanceof coil.transition.TransitionTarget) {
            coil.request.SuccessResult successResult = result;
            coil.transition.Transition create = successResult.getRequest().getTransitionFactory().create((coil.transition.TransitionTarget) target, successResult);
            if (!(create instanceof coil.transition.NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(successResult.getRequest(), create);
            }
            target.onSuccess(result.getDrawable());
        }
        eventListener.onSuccess(request, result);
        coil.request.ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(coil.request.ErrorResult result, coil.target.Target target, coil.EventListener eventListener) {
        coil.request.ImageRequest request = result.getRequest();
        coil.util.Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🚨 Failed - " + request.getData() + " - " + result.getThrowable(), null);
        }
        if (target instanceof coil.transition.TransitionTarget) {
            coil.request.ErrorResult errorResult = result;
            coil.transition.Transition create = errorResult.getRequest().getTransitionFactory().create((coil.transition.TransitionTarget) target, errorResult);
            if (!(create instanceof coil.transition.NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(errorResult.getRequest(), create);
            }
            target.onError(result.getDrawable());
        }
        eventListener.onError(request, result);
        coil.request.ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    private final void onCancel(coil.request.ImageRequest request, coil.EventListener eventListener) {
        coil.util.Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.onCancel(request);
        coil.request.ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    private final void transition(coil.request.ImageResult result, coil.target.Target target, coil.EventListener eventListener, kotlin.jvm.functions.Function0<kotlin.Unit> setDrawable) {
        if (!(target instanceof coil.transition.TransitionTarget)) {
            setDrawable.invoke();
            return;
        }
        coil.transition.Transition create = result.getRequest().getTransitionFactory().create((coil.transition.TransitionTarget) target, result);
        if (create instanceof coil.transition.NoneTransition) {
            setDrawable.invoke();
            return;
        }
        eventListener.transitionStart(result.getRequest(), create);
        create.transition();
        eventListener.transitionEnd(result.getRequest(), create);
    }
}
