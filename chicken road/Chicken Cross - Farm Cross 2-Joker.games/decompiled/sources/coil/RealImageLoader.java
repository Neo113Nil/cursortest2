package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.BitmapFactoryDecoder;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.OneShotDisposable;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Lifecycles;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* compiled from: RealImageLoader.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001\\Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0019\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010BJ!\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020FH\u0083@ø\u0001\u0000¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020K2\u0006\u0010>\u001a\u00020?2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010S\u001a\u00020K2\u0006\u0010O\u001a\u00020T2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\u0015\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u00020FH\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020KH\u0016J1\u0010Y\u001a\u00020K2\u0006\u0010O\u001a\u00020A2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020M2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020K0[H\u0082\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u0004\u0018\u00010\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001d\u0010/\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b0\u00101R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "diskCacheLazy", "Lcoil/disk/DiskCache;", "callFactoryLazy", "Lokhttp3/Call$Factory;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcoil/util/ImageLoaderOptions;", "logger", "Lcoil/util/Logger;", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "getCallFactoryLazy", "()Lkotlin/Lazy;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "components", "getComponents", "getContext", "()Landroid/content/Context;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "getDiskCache", "()Lcoil/disk/DiskCache;", "diskCache$delegate", "Lkotlin/Lazy;", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "interceptors", "", "Lcoil/intercept/Interceptor;", "isShutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getLogger", "()Lcoil/util/Logger;", "memoryCache", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "memoryCache$delegate", "getMemoryCacheLazy", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "requestService", "Lcoil/request/RequestService;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeMain", "initialRequest", "type", "", "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "onCancel", "", "eventListener", "Lcoil/EventListener;", "onError", "result", "Lcoil/request/ErrorResult;", "target", "Lcoil/target/Target;", "onSuccess", "Lcoil/request/SuccessResult;", "onTrimMemory", "level", "onTrimMemory$coil_base_release", "shutdown", "transition", "setDrawable", "Lkotlin/Function0;", k.M, "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class RealImageLoader implements ImageLoader {
    private static final int REQUEST_TYPE_ENQUEUE = 0;
    private static final int REQUEST_TYPE_EXECUTE = 1;
    private static final String TAG = "RealImageLoader";
    private final Lazy<Call.Factory> callFactoryLazy;
    private final ComponentRegistry componentRegistry;
    private final ComponentRegistry components;
    private final Context context;
    private final DefaultRequestOptions defaults;

    /* renamed from: diskCache$delegate, reason: from kotlin metadata */
    private final Lazy diskCache;
    private final Lazy<DiskCache> diskCacheLazy;
    private final EventListener.Factory eventListenerFactory;
    private final List<Interceptor> interceptors;
    private final AtomicBoolean isShutdown;
    private final Logger logger;

    /* renamed from: memoryCache$delegate, reason: from kotlin metadata */
    private final Lazy memoryCache;
    private final Lazy<MemoryCache> memoryCacheLazy;
    private final ImageLoaderOptions options;
    private final RequestService requestService;
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)));
    private final SystemCallbacks systemCallbacks;

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(Context context, DefaultRequestOptions defaultRequestOptions, Lazy<? extends MemoryCache> lazy, Lazy<? extends DiskCache> lazy2, Lazy<? extends Call.Factory> lazy3, EventListener.Factory factory, ComponentRegistry componentRegistry, ImageLoaderOptions imageLoaderOptions, Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        this.logger = logger;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.getNetworkObserverEnabled());
        this.systemCallbacks = systemCallbacks;
        RealImageLoader realImageLoader = this;
        RequestService requestService = new RequestService(realImageLoader, systemCallbacks, logger);
        this.requestService = requestService;
        this.memoryCache = lazy;
        this.diskCache = lazy2;
        this.components = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = CollectionsKt.plus((Collection<? extends EngineInterceptor>) getComponents().getInterceptors(), new EngineInterceptor(realImageLoader, requestService, logger));
        this.isShutdown = new AtomicBoolean(false);
        systemCallbacks.register();
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // coil.ImageLoader
    public DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    public final Lazy<MemoryCache> getMemoryCacheLazy() {
        return this.memoryCacheLazy;
    }

    public final Lazy<DiskCache> getDiskCacheLazy() {
        return this.diskCacheLazy;
    }

    public final Lazy<Call.Factory> getCallFactoryLazy() {
        return this.callFactoryLazy;
    }

    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final ComponentRegistry getComponentRegistry() {
        return this.componentRegistry;
    }

    public final ImageLoaderOptions getOptions() {
        return this.options;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    @Override // coil.ImageLoader
    public MemoryCache getMemoryCache() {
        return (MemoryCache) this.memoryCache.getValue();
    }

    @Override // coil.ImageLoader
    public DiskCache getDiskCache() {
        return (DiskCache) this.diskCache.getValue();
    }

    @Override // coil.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    public Disposable enqueue(ImageRequest request) {
        Deferred<? extends ImageResult> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        if (request.getTarget() instanceof ViewTarget) {
            return Utils.getRequestManager(((ViewTarget) request.getTarget()).getView()).getDisposable(async$default);
        }
        return new OneShotDisposable(async$default);
    }

    @Override // coil.ImageLoader
    public Object execute(ImageRequest imageRequest, Continuation<? super ImageResult> continuation) {
        return CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(imageRequest, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0190 A[Catch: all -> 0x004c, TryCatch #4 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x018a, B:16:0x0190, B:20:0x019b, B:22:0x019f), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019b A[Catch: all -> 0x004c, TryCatch #4 {all -> 0x004c, blocks: (B:13:0x0047, B:14:0x018a, B:16:0x0190, B:20:0x019b, B:22:0x019f), top: B:12:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c1 A[Catch: all -> 0x01d6, TRY_LEAVE, TryCatch #2 {all -> 0x01d6, blocks: (B:25:0x01bd, B:27:0x01c1, B:30:0x01d2, B:31:0x01d5), top: B:24:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d2 A[Catch: all -> 0x01d6, TRY_ENTER, TryCatch #2 {all -> 0x01d6, blocks: (B:25:0x01bd, B:27:0x01c1, B:30:0x01d2, B:31:0x01d5), top: B:24:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: all -> 0x01ad, TryCatch #5 {all -> 0x01ad, blocks: (B:53:0x00f1, B:55:0x00f7, B:57:0x00fd, B:59:0x0105, B:61:0x010d, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0133, B:68:0x0136, B:73:0x011d), top: B:52:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d A[Catch: all -> 0x01ad, TryCatch #5 {all -> 0x01ad, blocks: (B:53:0x00f1, B:55:0x00f7, B:57:0x00fd, B:59:0x0105, B:61:0x010d, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0133, B:68:0x0136, B:73:0x011d), top: B:52:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127 A[Catch: all -> 0x01ad, TryCatch #5 {all -> 0x01ad, blocks: (B:53:0x00f1, B:55:0x00f7, B:57:0x00fd, B:59:0x0105, B:61:0x010d, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0133, B:68:0x0136, B:73:0x011d), top: B:52:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133 A[Catch: all -> 0x01ad, TryCatch #5 {all -> 0x01ad, blocks: (B:53:0x00f1, B:55:0x00f7, B:57:0x00fd, B:59:0x0105, B:61:0x010d, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0133, B:68:0x0136, B:73:0x011d), top: B:52:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d A[Catch: all -> 0x01ad, TryCatch #5 {all -> 0x01ad, blocks: (B:53:0x00f1, B:55:0x00f7, B:57:0x00fd, B:59:0x0105, B:61:0x010d, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0133, B:68:0x0136, B:73:0x011d), top: B:52:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeMain(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) {
        RealImageLoader$executeMain$1 realImageLoader$executeMain$1;
        Object coroutine_suspended;
        int i2;
        RequestDelegate requestDelegate;
        ImageRequest build;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        MemoryCache memoryCache;
        Bitmap bitmap;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        Bitmap bitmap2;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        Object obj;
        ImageRequest imageRequest3;
        Object withContext;
        Object obj2;
        ImageResult imageResult;
        try {
            if (continuation instanceof RealImageLoader$executeMain$1) {
                realImageLoader$executeMain$1 = (RealImageLoader$executeMain$1) continuation;
                if ((realImageLoader$executeMain$1.label & Integer.MIN_VALUE) != 0) {
                    realImageLoader$executeMain$1.label -= Integer.MIN_VALUE;
                    Object obj3 = realImageLoader$executeMain$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = realImageLoader$executeMain$1.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj3);
                        requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(realImageLoader$executeMain$1.getContext()));
                        requestDelegate.assertActive();
                        build = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
                        EventListener create = this.eventListenerFactory.create(build);
                        try {
                            if (Intrinsics.areEqual(build.getData(), NullRequestData.INSTANCE)) {
                                throw new NullRequestDataException();
                            }
                            requestDelegate.start();
                            if (i == 0) {
                                Lifecycle lifecycle = build.getLifecycle();
                                realImageLoader$executeMain$1.L$0 = this;
                                realImageLoader$executeMain$1.L$1 = requestDelegate;
                                realImageLoader$executeMain$1.L$2 = build;
                                realImageLoader$executeMain$1.L$3 = create;
                                realImageLoader$executeMain$1.label = 1;
                                if (Lifecycles.awaitStarted(lifecycle, realImageLoader$executeMain$1) == coroutine_suspended) {
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
                                    MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                                    MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
                                    if (value != null) {
                                        bitmap = value.getBitmap();
                                        BitmapDrawable bitmapDrawable = bitmap == null ? new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap) : imageRequest2.getPlaceholder();
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
                                        SizeResolver sizeResolver = imageRequest2.getSizeResolver();
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
                                        ImageRequest imageRequest4 = imageRequest2;
                                        requestDelegate4 = requestDelegate;
                                        obj = size;
                                        imageRequest3 = imageRequest4;
                                        Size size2 = (Size) obj;
                                        eventListener2.resolveSizeEnd(imageRequest3, size2);
                                        CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                                        RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size2, eventListener2, bitmap2, null);
                                        realImageLoader$executeMain$1.L$0 = realImageLoader3;
                                        realImageLoader$executeMain$1.L$1 = requestDelegate4;
                                        realImageLoader$executeMain$1.L$2 = imageRequest3;
                                        realImageLoader$executeMain$1.L$3 = eventListener2;
                                        realImageLoader$executeMain$1.L$4 = null;
                                        realImageLoader$executeMain$1.label = 3;
                                        withContext = BuildersKt.withContext(interceptorDispatcher, realImageLoader$executeMain$result$1, realImageLoader$executeMain$1);
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
                                SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
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
                        } catch (Throwable th) {
                            th = th;
                            realImageLoader = this;
                            requestDelegate2 = requestDelegate;
                            eventListener = create;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else if (i2 == 1) {
                        eventListener2 = (EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest2 = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate3 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader2 = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                        } catch (Throwable th2) {
                            th = th2;
                            eventListener = eventListener2;
                            build = imageRequest2;
                            requestDelegate2 = requestDelegate3;
                            realImageLoader = realImageLoader2;
                            if (th instanceof CancellationException) {
                                realImageLoader.onCancel(build, eventListener);
                                throw th;
                            }
                            ErrorResult errorResult = realImageLoader.requestService.errorResult(build, th);
                            realImageLoader.onError(errorResult, build.getTarget(), eventListener);
                            return errorResult;
                        }
                    } else if (i2 == 2) {
                        Bitmap bitmap3 = (Bitmap) realImageLoader$executeMain$1.L$4;
                        eventListener2 = (EventListener) realImageLoader$executeMain$1.L$3;
                        imageRequest3 = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate4 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader3 = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            bitmap2 = bitmap3;
                            obj = obj3;
                            Size size22 = (Size) obj;
                            eventListener2.resolveSizeEnd(imageRequest3, size22);
                            CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
                            RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$12 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size22, eventListener2, bitmap2, null);
                            realImageLoader$executeMain$1.L$0 = realImageLoader3;
                            realImageLoader$executeMain$1.L$1 = requestDelegate4;
                            realImageLoader$executeMain$1.L$2 = imageRequest3;
                            realImageLoader$executeMain$1.L$3 = eventListener2;
                            realImageLoader$executeMain$1.L$4 = null;
                            realImageLoader$executeMain$1.label = 3;
                            withContext = BuildersKt.withContext(interceptorDispatcher2, realImageLoader$executeMain$result$12, realImageLoader$executeMain$1);
                            if (withContext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            obj2 = withContext;
                            imageResult = (ImageResult) obj2;
                            if (!(imageResult instanceof SuccessResult)) {
                            }
                            return imageResult;
                        } catch (Throwable th3) {
                            th = th3;
                            eventListener = eventListener2;
                            build = imageRequest3;
                            requestDelegate2 = requestDelegate4;
                            realImageLoader = realImageLoader3;
                            if (th instanceof CancellationException) {
                            }
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eventListener = (EventListener) realImageLoader$executeMain$1.L$3;
                        build = (ImageRequest) realImageLoader$executeMain$1.L$2;
                        requestDelegate2 = (RequestDelegate) realImageLoader$executeMain$1.L$1;
                        realImageLoader = (RealImageLoader) realImageLoader$executeMain$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            obj2 = obj3;
                            imageResult = (ImageResult) obj2;
                            if (!(imageResult instanceof SuccessResult)) {
                                realImageLoader.onSuccess((SuccessResult) imageResult, build.getTarget(), eventListener);
                            } else if (imageResult instanceof ErrorResult) {
                                realImageLoader.onError((ErrorResult) imageResult, build.getTarget(), eventListener);
                            }
                            return imageResult;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                if (th instanceof CancellationException) {
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
                    SizeResolver sizeResolver22 = imageRequest2.getSizeResolver();
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
            SizeResolver sizeResolver222 = imageRequest2.getSizeResolver();
            realImageLoader$executeMain$1.L$0 = realImageLoader2;
            realImageLoader$executeMain$1.L$1 = requestDelegate;
            realImageLoader$executeMain$1.L$2 = imageRequest2;
            realImageLoader$executeMain$1.L$3 = eventListener2;
            realImageLoader$executeMain$1.L$4 = bitmap;
            realImageLoader$executeMain$1.label = 2;
            size = sizeResolver222.size(realImageLoader$executeMain$1);
            if (size != coroutine_suspended) {
            }
        } catch (Throwable th5) {
            th = th5;
            requestDelegate2 = requestDelegate;
            eventListener = eventListener2;
            build = imageRequest2;
            realImageLoader = realImageLoader2;
            if (th instanceof CancellationException) {
            }
        }
        realImageLoader$executeMain$1 = new RealImageLoader$executeMain$1(this, continuation);
        Object obj32 = realImageLoader$executeMain$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = realImageLoader$executeMain$1.label;
        if (i2 != 0) {
        }
        requestDelegate = requestDelegate3;
    }

    public final void onTrimMemory$coil_base_release(int level) {
        MemoryCache value;
        Lazy<MemoryCache> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.isShutdown.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil.ImageLoader
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onSuccess(SuccessResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        DataSource dataSource = result.getDataSource();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, Utils.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
        }
        if (target instanceof TransitionTarget) {
            SuccessResult successResult = result;
            Transition create = successResult.getRequest().getTransitionFactory().create((TransitionTarget) target, successResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(successResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(successResult.getRequest(), create);
            }
            target.onSuccess(result.getDrawable());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onError(ErrorResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🚨 Failed - " + request.getData() + " - " + result.getThrowable(), null);
        }
        if (target instanceof TransitionTarget) {
            ErrorResult errorResult = result;
            Transition create = errorResult.getRequest().getTransitionFactory().create((TransitionTarget) target, errorResult);
            if (!(create instanceof NoneTransition)) {
                eventListener.transitionStart(errorResult.getRequest(), create);
                create.transition();
                eventListener.transitionEnd(errorResult.getRequest(), create);
            }
            target.onError(result.getDrawable());
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    private final void onCancel(ImageRequest request, EventListener eventListener) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    private final void transition(ImageResult result, Target target, EventListener eventListener, Function0<Unit> setDrawable) {
        if (!(target instanceof TransitionTarget)) {
            setDrawable.invoke();
            return;
        }
        Transition create = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
        if (create instanceof NoneTransition) {
            setDrawable.invoke();
            return;
        }
        eventListener.transitionStart(result.getRequest(), create);
        create.transition();
        eventListener.transitionEnd(result.getRequest(), create);
    }
}
