package coil3;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/ImageLoader;", "", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/request/Disposable;", "enqueue", "(Lcoil3/request/ImageRequest;)Lcoil3/request/Disposable;", "Lcoil3/request/ImageResult;", "execute", "(Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shutdown", "()V", "Lcoil3/ImageLoader$Builder;", "newBuilder", "()Lcoil3/ImageLoader$Builder;", "Lcoil3/request/ImageRequest$Defaults;", "getDefaults", "()Lcoil3/request/ImageRequest$Defaults;", "defaults", "Lcoil3/ComponentRegistry;", "getComponents", "()Lcoil3/ComponentRegistry;", "components", "Lcoil3/memory/MemoryCache;", "getMemoryCache", "()Lcoil3/memory/MemoryCache;", "memoryCache", "Lcoil3/disk/DiskCache;", "getDiskCache", "()Lcoil3/disk/DiskCache;", "diskCache", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImageLoader {
    coil3.view.Disposable enqueue(coil3.view.ImageRequest request);

    java.lang.Object execute(coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation);

    /* renamed from: getComponents */
    coil3.ComponentRegistry getCamera2StreamConfigurationMap();

    coil3.request.ImageRequest.Defaults getDefaults();

    coil3.disk.DiskCache getDiskCache();

    coil3.memory.MemoryCache getMemoryCache();

    coil3.ImageLoader.Builder newBuilder();

    void shutdown();

    @kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ)\u0010\u000f\u001a\u00020\u00002\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\u00020\u00002\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b-\u0010,J\u001b\u0010-\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020*0\u0016¢\u0006\u0004\b-\u0010\u0018J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b.\u0010,J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b/\u0010,J\u0015\u00100\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020*¢\u0006\u0004\b0\u0010,J\u0017\u00103\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J#\u00103\u001a\u00020\u00002\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u0001010\n¢\u0006\u0004\b3\u0010\u0010J\u0017\u00106\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b6\u00104J#\u00106\u001a\u00020\u00002\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u0001010\n¢\u0006\u0004\b6\u0010\u0010J\u0017\u00107\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b7\u00104J#\u00107\u001a\u00020\u00002\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u0001010\n¢\u0006\u0004\b7\u0010\u0010J\u0015\u0010:\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b<\u0010;J\u0015\u0010=\u001a\u00020\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b=\u0010;J\u0017\u0010?\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b?\u0010@J\r\u0010B\u001a\u00020A¢\u0006\u0004\bB\u0010CR\u0018\u0010F\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR \u0010D\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR \u0010H\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010RR\u0018\u0010L\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010TR\u0017\u0010V\u001a\u00020U8\u0007¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y"}, d2 = {"Lcoil3/ImageLoader$Builder;", "", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil3/RealImageLoader$Options;", "options", "(Lcoil3/RealImageLoader$Options;)V", "Lkotlin/Function1;", "Lcoil3/ComponentRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "components", "(Lkotlin/jvm/functions/Function1;)Lcoil3/ImageLoader$Builder;", "Lcoil3/ComponentRegistry;", "(Lcoil3/ComponentRegistry;)Lcoil3/ImageLoader$Builder;", "Lcoil3/memory/MemoryCache;", "memoryCache", "(Lcoil3/memory/MemoryCache;)Lcoil3/ImageLoader$Builder;", "Lkotlin/Function0;", "initializer", "(Lkotlin/jvm/functions/Function0;)Lcoil3/ImageLoader$Builder;", "Lcoil3/disk/DiskCache;", "diskCache", "(Lcoil3/disk/DiskCache;)Lcoil3/ImageLoader$Builder;", "Lokio/FileSystem;", "fileSystem", "(Lokio/FileSystem;)Lcoil3/ImageLoader$Builder;", "Lcoil3/EventListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "eventListener", "(Lcoil3/EventListener;)Lcoil3/ImageLoader$Builder;", "Lcoil3/EventListener$Factory;", "factory", "eventListenerFactory", "(Lcoil3/EventListener$Factory;)Lcoil3/ImageLoader$Builder;", "Lcoil3/size/Precision;", "precision", "(Lcoil3/size/Precision;)Lcoil3/ImageLoader$Builder;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Lcoil3/ImageLoader$Builder;", "mainCoroutineContext", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lcoil3/Image;", "image", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "(Lcoil3/Image;)Lcoil3/ImageLoader$Builder;", "Lcoil3/request/ImageRequest;", "error", "fallback", "Lcoil3/request/CachePolicy;", "policy", "memoryCachePolicy", "(Lcoil3/request/CachePolicy;)Lcoil3/ImageLoader$Builder;", "diskCachePolicy", "networkCachePolicy", "Lcoil3/util/Logger;", "logger", "(Lcoil3/util/Logger;)Lcoil3/ImageLoader$Builder;", "Lcoil3/ImageLoader;", "build", "()Lcoil3/ImageLoader;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/request/ImageRequest$Defaults;", "getHighSpeedVideoSizes", "Lcoil3/request/ImageRequest$Defaults;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getOutputMinFrameDuration", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcoil3/EventListener$Factory;", "getOutputFormats", "Lcoil3/ComponentRegistry;", "getInputFormats", "Lcoil3/util/Logger;", "Lcoil3/Extras$Builder;", "extras", "Lcoil3/Extras$Builder;", "getExtras", "()Lcoil3/Extras$Builder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        private final coil3.Extras.Builder extras;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.Lazy<? extends coil3.disk.DiskCache> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private coil3.ComponentRegistry getInputFormats;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private coil3.EventListener.Factory getOutputFormats;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private coil3.request.ImageRequest.Defaults getHighSpeedVideoFpsRangesFor;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        private kotlin.Lazy<? extends coil3.memory.MemoryCache> Camera2StreamConfigurationMap;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private coil3.content.Logger getOutputMinFrameDuration;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private kotlin.Lazy<? extends kotlin.coroutines.CoroutineContext> getHighSpeedVideoFpsRanges;

        public static /* synthetic */ coil3.EventListener $r8$lambda$8lNbUVi4LJ993sP2805tjtBDpuE(coil3.EventListener eventListener, coil3.view.ImageRequest imageRequest) {
            return eventListener;
        }

        public static /* synthetic */ kotlin.coroutines.CoroutineContext $r8$lambda$9sV9xdELP0jRY4FSQRSR08pAaNI(kotlin.coroutines.CoroutineContext coroutineContext) {
            return coroutineContext;
        }

        /* renamed from: $r8$lambda$Gr2iTwcgyX5drYL6BzM--SQW6GQ, reason: not valid java name */
        public static /* synthetic */ coil3.Image m9730$r8$lambda$Gr2iTwcgyX5drYL6BzMSQW6GQ(coil3.Image image, coil3.view.ImageRequest imageRequest) {
            return image;
        }

        public static /* synthetic */ coil3.Image $r8$lambda$KASJO5MKVQk0gYPI_x3ujkw16f8(coil3.Image image, coil3.view.ImageRequest imageRequest) {
            return image;
        }

        public static /* synthetic */ coil3.Image $r8$lambda$oofYcQ9ohrocYPssOvSqTomb3gw(coil3.Image image, coil3.view.ImageRequest imageRequest) {
            return image;
        }

        public final coil3.Extras.Builder getExtras() {
            return this.extras;
        }

        public Builder(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = coil3.content.C0302ContextsKt.getApplication(context);
            this.getHighSpeedVideoFpsRangesFor = coil3.request.ImageRequest.Defaults.DEFAULT;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = null;
            this.getOutputFormats = null;
            this.getInputFormats = null;
            this.getOutputMinFrameDuration = null;
            this.extras = new coil3.Extras.Builder();
        }

        public Builder(coil3.RealImageLoader.Options options) {
            this.getHighResolutionOutputSizeshNQ4ISI = options.getApplication();
            this.getHighSpeedVideoFpsRangesFor = options.getDefaults();
            this.getHighSpeedVideoFpsRanges = options.getMainCoroutineContextLazy();
            this.Camera2StreamConfigurationMap = options.getMemoryCacheLazy();
            this.getHighSpeedVideoSizes = options.getDiskCacheLazy();
            this.getOutputFormats = options.getEventListenerFactory();
            this.getInputFormats = options.getComponentRegistry();
            this.getOutputMinFrameDuration = options.getLogger();
            this.extras = options.getDefaults().getExtras().newBuilder();
        }

        public final /* synthetic */ coil3.ImageLoader.Builder components(kotlin.jvm.functions.Function1<? super coil3.ComponentRegistry.Builder, kotlin.Unit> builder) {
            coil3.ComponentRegistry.Builder builder2 = new coil3.ComponentRegistry.Builder();
            builder.invoke(builder2);
            return components(builder2.build());
        }

        public final coil3.ImageLoader.Builder components(coil3.ComponentRegistry components) {
            this.getInputFormats = components;
            return this;
        }

        public final coil3.ImageLoader.Builder memoryCache(coil3.memory.MemoryCache memoryCache) {
            this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazyOf(memoryCache);
            return this;
        }

        public final coil3.ImageLoader.Builder memoryCache(kotlin.jvm.functions.Function0<? extends coil3.memory.MemoryCache> initializer) {
            this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final coil3.ImageLoader.Builder diskCache(coil3.disk.DiskCache diskCache) {
            this.getHighSpeedVideoSizes = kotlin.LazyKt.lazyOf(diskCache);
            return this;
        }

        public final coil3.ImageLoader.Builder diskCache(kotlin.jvm.functions.Function0<? extends coil3.disk.DiskCache> initializer) {
            this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final coil3.ImageLoader.Builder fileSystem(okio.FileSystem fileSystem) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : fileSystem, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder eventListener(final coil3.EventListener listener) {
            return eventListenerFactory(new coil3.EventListener.Factory() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda6
                @Override // coil3.EventListener.Factory
                public final coil3.EventListener create(coil3.view.ImageRequest imageRequest) {
                    return coil3.ImageLoader.Builder.$r8$lambda$8lNbUVi4LJ993sP2805tjtBDpuE(coil3.EventListener.this, imageRequest);
                }
            });
        }

        public final coil3.ImageLoader.Builder eventListenerFactory(coil3.EventListener.Factory factory) {
            this.getOutputFormats = factory;
            return this;
        }

        public final coil3.ImageLoader.Builder precision(coil3.view.Precision precision) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : precision, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder coroutineContext(kotlin.coroutines.CoroutineContext context) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : context, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : context, (r30 & 8) != 0 ? r1.decoderCoroutineContext : context, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder mainCoroutineContext(final kotlin.coroutines.CoroutineContext context) {
            return mainCoroutineContext(new kotlin.jvm.functions.Function0() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return coil3.ImageLoader.Builder.$r8$lambda$9sV9xdELP0jRY4FSQRSR08pAaNI(kotlin.coroutines.CoroutineContext.this);
                }
            });
        }

        public final coil3.ImageLoader.Builder mainCoroutineContext(kotlin.jvm.functions.Function0<? extends kotlin.coroutines.CoroutineContext> initializer) {
            this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(initializer);
            return this;
        }

        public final coil3.ImageLoader.Builder interceptorCoroutineContext(kotlin.coroutines.CoroutineContext context) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : context, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder fetcherCoroutineContext(kotlin.coroutines.CoroutineContext context) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : context, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder decoderCoroutineContext(kotlin.coroutines.CoroutineContext context) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : context, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder placeholder(final coil3.Image image) {
            return placeholder(new kotlin.jvm.functions.Function1() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return coil3.ImageLoader.Builder.m9730$r8$lambda$Gr2iTwcgyX5drYL6BzMSQW6GQ(coil3.Image.this, (coil3.view.ImageRequest) obj);
                }
            });
        }

        public final coil3.ImageLoader.Builder placeholder(kotlin.jvm.functions.Function1<? super coil3.view.ImageRequest, ? extends coil3.Image> factory) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : factory, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder error(final coil3.Image image) {
            return error(new kotlin.jvm.functions.Function1() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return coil3.ImageLoader.Builder.$r8$lambda$KASJO5MKVQk0gYPI_x3ujkw16f8(coil3.Image.this, (coil3.view.ImageRequest) obj);
                }
            });
        }

        public final coil3.ImageLoader.Builder error(kotlin.jvm.functions.Function1<? super coil3.view.ImageRequest, ? extends coil3.Image> factory) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : factory, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder fallback(final coil3.Image image) {
            return fallback(new kotlin.jvm.functions.Function1() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return coil3.ImageLoader.Builder.$r8$lambda$oofYcQ9ohrocYPssOvSqTomb3gw(coil3.Image.this, (coil3.view.ImageRequest) obj);
                }
            });
        }

        public final coil3.ImageLoader.Builder fallback(kotlin.jvm.functions.Function1<? super coil3.view.ImageRequest, ? extends coil3.Image> factory) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : factory, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder memoryCachePolicy(coil3.view.CachePolicy policy) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : policy, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder diskCachePolicy(coil3.view.CachePolicy policy) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : policy, (r30 & 64) != 0 ? r1.networkCachePolicy : null, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder networkCachePolicy(coil3.view.CachePolicy policy) {
            coil3.request.ImageRequest.Defaults copy;
            copy = r1.copy((r30 & 1) != 0 ? r1.fileSystem : null, (r30 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r1.decoderCoroutineContext : null, (r30 & 16) != 0 ? r1.memoryCachePolicy : null, (r30 & 32) != 0 ? r1.diskCachePolicy : null, (r30 & 64) != 0 ? r1.networkCachePolicy : policy, (r30 & 128) != 0 ? r1.placeholderFactory : null, (r30 & 256) != 0 ? r1.errorFactory : null, (r30 & 512) != 0 ? r1.fallbackFactory : null, (r30 & 1024) != 0 ? r1.sizeResolver : null, (r30 & 2048) != 0 ? r1.scale : null, (r30 & 4096) != 0 ? r1.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : null);
            this.getHighSpeedVideoFpsRangesFor = copy;
            return this;
        }

        public final coil3.ImageLoader.Builder logger(coil3.content.Logger logger) {
            this.getOutputMinFrameDuration = logger;
            return this;
        }

        public final coil3.ImageLoader build() {
            coil3.request.ImageRequest.Defaults copy;
            android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
            copy = r3.copy((r30 & 1) != 0 ? r3.fileSystem : null, (r30 & 2) != 0 ? r3.interceptorCoroutineContext : null, (r30 & 4) != 0 ? r3.fetcherCoroutineContext : null, (r30 & 8) != 0 ? r3.decoderCoroutineContext : null, (r30 & 16) != 0 ? r3.memoryCachePolicy : null, (r30 & 32) != 0 ? r3.diskCachePolicy : null, (r30 & 64) != 0 ? r3.networkCachePolicy : null, (r30 & 128) != 0 ? r3.placeholderFactory : null, (r30 & 256) != 0 ? r3.errorFactory : null, (r30 & 512) != 0 ? r3.fallbackFactory : null, (r30 & 1024) != 0 ? r3.sizeResolver : null, (r30 & 2048) != 0 ? r3.scale : null, (r30 & 4096) != 0 ? r3.precision : null, (r30 & 8192) != 0 ? this.getHighSpeedVideoFpsRangesFor.extras : this.extras.build());
            kotlin.Lazy<? extends kotlin.coroutines.CoroutineContext> lazy = this.getHighSpeedVideoFpsRanges;
            if (lazy == null) {
                lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlinx.coroutines.MainCoroutineDispatcher immediate;
                        immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
                        return immediate;
                    }
                });
            }
            kotlin.Lazy<? extends kotlin.coroutines.CoroutineContext> lazy2 = lazy;
            kotlin.Lazy<? extends coil3.memory.MemoryCache> lazy3 = this.Camera2StreamConfigurationMap;
            if (lazy3 == null) {
                lazy3 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        coil3.memory.MemoryCache build;
                        build = coil3.memory.MemoryCache.Builder.maxSizePercent$default(new coil3.memory.MemoryCache.Builder(), coil3.ImageLoader.Builder.this.getHighResolutionOutputSizeshNQ4ISI, 0.0d, 2, null).build();
                        return build;
                    }
                });
            }
            kotlin.Lazy<? extends coil3.memory.MemoryCache> lazy4 = lazy3;
            kotlin.Lazy<? extends coil3.disk.DiskCache> lazy5 = this.getHighSpeedVideoSizes;
            if (lazy5 == null) {
                lazy5 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: coil3.ImageLoader$Builder$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        coil3.disk.DiskCache singletonDiskCache;
                        singletonDiskCache = coil3.disk.UtilsKt.singletonDiskCache();
                        return singletonDiskCache;
                    }
                });
            }
            kotlin.Lazy<? extends coil3.disk.DiskCache> lazy6 = lazy5;
            coil3.EventListener.Factory factory = this.getOutputFormats;
            if (factory == null) {
                factory = coil3.EventListener.Factory.NONE;
            }
            coil3.EventListener.Factory factory2 = factory;
            coil3.ComponentRegistry componentRegistry = this.getInputFormats;
            if (componentRegistry == null) {
                componentRegistry = new coil3.ComponentRegistry();
            }
            return new coil3.RealImageLoader(new coil3.RealImageLoader.Options(context, copy, lazy2, lazy4, lazy6, factory2, componentRegistry, this.getOutputMinFrameDuration));
        }
    }
}
