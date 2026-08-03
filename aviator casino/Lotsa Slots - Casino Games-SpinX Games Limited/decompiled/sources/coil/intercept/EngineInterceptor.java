package coil.intercept;

/* compiled from: EngineInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 42\u00020\u0001:\u000234B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J.\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ6\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010#J>\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010'J0\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0081@¢\u0006\u0004\b*\u0010+J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "imageLoader", "Lcoil/ImageLoader;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "<init>", "(Lcoil/ImageLoader;Lcoil/util/SystemCallbacks;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "request", "Lcoil/request/ImageRequest;", "mappedData", "", "_options", "Lcoil/request/Options;", "eventListener", "Lcoil/EventListener;", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "components", "Lcoil/ComponentRegistry;", "options", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decode", "fetchResult", "Lcoil/fetch/SourceResult;", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "transformations", "", "Lcoil/transform/Transformation;", "ExecuteResult", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EngineInterceptor implements coil.intercept.Interceptor {
    private static final java.lang.String TAG = "EngineInterceptor";
    private final coil.ImageLoader imageLoader;
    private final coil.util.Logger logger;
    private final coil.memory.MemoryCacheService memoryCacheService;
    private final coil.request.RequestService requestService;
    private final coil.util.SystemCallbacks systemCallbacks;

    public EngineInterceptor(coil.ImageLoader imageLoader, coil.util.SystemCallbacks systemCallbacks, coil.request.RequestService requestService, coil.util.Logger logger) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = systemCallbacks;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new coil.memory.MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil.intercept.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object intercept(coil.intercept.Interceptor.Chain chain, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        coil.intercept.EngineInterceptor$intercept$1 engineInterceptor$intercept$1;
        int i;
        coil.intercept.EngineInterceptor engineInterceptor;
        if (continuation instanceof coil.intercept.EngineInterceptor$intercept$1) {
            engineInterceptor$intercept$1 = (coil.intercept.EngineInterceptor$intercept$1) continuation;
            if ((engineInterceptor$intercept$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$intercept$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = engineInterceptor$intercept$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$intercept$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        coil.request.ImageRequest request = chain.getRequest();
                        java.lang.Object data = request.getData();
                        coil.size.Size size = chain.getSize();
                        coil.EventListener eventListener = coil.util.Utils.getEventListener(chain);
                        coil.request.Options options = this.requestService.options(request, size);
                        coil.size.Scale scale = options.getScale();
                        eventListener.mapStart(request, data);
                        java.lang.Object map = this.imageLoader.getComponents().map(data, options);
                        eventListener.mapEnd(request, map);
                        coil.memory.MemoryCache.Key newCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
                        coil.memory.MemoryCache.Value cacheValue = newCacheKey != null ? this.memoryCacheService.getCacheValue(request, newCacheKey, size, scale) : null;
                        if (cacheValue != null) {
                            return this.memoryCacheService.newResult(chain, request, newCacheKey, cacheValue);
                        }
                        kotlinx.coroutines.CoroutineDispatcher fetcherDispatcher = request.getFetcherDispatcher();
                        coil.intercept.EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new coil.intercept.EngineInterceptor$intercept$2(this, request, map, options, eventListener, newCacheKey, chain, null);
                        engineInterceptor$intercept$1.L$0 = this;
                        engineInterceptor$intercept$1.L$1 = chain;
                        engineInterceptor$intercept$1.label = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(fetcherDispatcher, engineInterceptor$intercept$2, engineInterceptor$intercept$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        engineInterceptor = this;
                        if (!(th instanceof java.util.concurrent.CancellationException)) {
                            throw th;
                        }
                        return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chain = (coil.intercept.Interceptor.Chain) engineInterceptor$intercept$1.L$1;
                    engineInterceptor = (coil.intercept.EngineInterceptor) engineInterceptor$intercept$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (!(th instanceof java.util.concurrent.CancellationException)) {
                        }
                    }
                }
                return obj;
            }
        }
        engineInterceptor$intercept$1 = new coil.intercept.EngineInterceptor$intercept$1(this, continuation);
        java.lang.Object obj2 = engineInterceptor$intercept$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$intercept$1.label;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #2 {all -> 0x01eb, blocks: (B:54:0x0124, B:56:0x012e, B:60:0x0172, B:62:0x0176, B:64:0x01e5, B:65:0x01ea, B:71:0x00a6, B:73:0x00b8, B:75:0x00e7, B:79:0x00be, B:81:0x00cd, B:82:0x00d4, B:84:0x00da, B:85:0x00e1), top: B:70:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172 A[Catch: all -> 0x01eb, TRY_ENTER, TryCatch #2 {all -> 0x01eb, blocks: (B:54:0x0124, B:56:0x012e, B:60:0x0172, B:62:0x0176, B:64:0x01e5, B:65:0x01ea, B:71:0x00a6, B:73:0x00b8, B:75:0x00e7, B:79:0x00be, B:81:0x00cd, B:82:0x00d4, B:84:0x00da, B:85:0x00e1), top: B:70:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, coil.request.Options] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(coil.request.ImageRequest imageRequest, java.lang.Object obj, coil.request.Options options, coil.EventListener eventListener, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> continuation) {
        coil.intercept.EngineInterceptor$execute$1 engineInterceptor$execute$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.Object obj2;
        coil.EventListener eventListener2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        coil.request.ImageRequest imageRequest2;
        coil.intercept.EngineInterceptor engineInterceptor;
        T t;
        coil.fetch.FetchResult fetchResult;
        coil.intercept.EngineInterceptor.ExecuteResult executeResult;
        coil.request.ImageRequest imageRequest3;
        coil.intercept.EngineInterceptor engineInterceptor2;
        coil.EventListener eventListener3;
        coil.request.ImageRequest imageRequest4;
        coil.intercept.EngineInterceptor engineInterceptor3;
        coil.fetch.SourceResult sourceResult;
        coil.decode.ImageSource source;
        coil.fetch.SourceResult sourceResult2;
        java.lang.Object transform$coil_base_release;
        coil.decode.ImageSource source2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.Bitmap bitmap;
        if (continuation instanceof coil.intercept.EngineInterceptor$execute$1) {
            engineInterceptor$execute$1 = (coil.intercept.EngineInterceptor$execute$1) continuation;
            if ((engineInterceptor$execute$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$execute$1.label -= Integer.MIN_VALUE;
                coil.intercept.EngineInterceptor$execute$1 engineInterceptor$execute$12 = engineInterceptor$execute$1;
                java.lang.Object obj5 = engineInterceptor$execute$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$execute$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj5);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef6.element = options;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef7.element = this.imageLoader.getComponents();
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        objectRef6.element = this.requestService.updateOptionsOnWorkerThread((coil.request.Options) objectRef6.element);
                        if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                            coil.ComponentRegistry.Builder newBuilder = ((coil.ComponentRegistry) objectRef7.element).newBuilder();
                            kotlin.Pair<coil.fetch.Fetcher.Factory<?>, java.lang.Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                            if (fetcherFactory != null) {
                                newBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                            }
                            coil.decode.Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                            if (decoderFactory != null) {
                                newBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                            }
                            objectRef7.element = newBuilder.build();
                        }
                        coil.ComponentRegistry componentRegistry = (coil.ComponentRegistry) objectRef7.element;
                        coil.request.Options options2 = (coil.request.Options) objectRef6.element;
                        engineInterceptor$execute$12.L$0 = this;
                        engineInterceptor$execute$12.L$1 = imageRequest;
                        engineInterceptor$execute$12.L$2 = obj;
                        engineInterceptor$execute$12.L$3 = eventListener;
                        engineInterceptor$execute$12.L$4 = objectRef6;
                        engineInterceptor$execute$12.L$5 = objectRef7;
                        engineInterceptor$execute$12.L$6 = objectRef;
                        engineInterceptor$execute$12.L$7 = objectRef;
                        engineInterceptor$execute$12.label = 1;
                        java.lang.Object fetch = fetch(componentRegistry, imageRequest, obj, options2, eventListener, engineInterceptor$execute$12);
                        if (fetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        eventListener2 = eventListener;
                        objectRef3 = objectRef6;
                        objectRef4 = objectRef7;
                        objectRef5 = objectRef;
                        imageRequest2 = imageRequest;
                        engineInterceptor = this;
                        t = fetch;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        objectRef2 = objectRef;
                        T t2 = objectRef2.element;
                        if (t2 instanceof coil.fetch.SourceResult) {
                        }
                        if (sourceResult != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj5);
                            obj4 = obj5;
                            coil.intercept.EngineInterceptor.ExecuteResult executeResult2 = (coil.intercept.EngineInterceptor.ExecuteResult) obj4;
                            android.graphics.drawable.Drawable drawable = executeResult2.getDrawable();
                            bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
                            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                bitmap.prepareToDraw();
                            }
                            return executeResult2;
                        }
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$3;
                        eventListener3 = (coil.EventListener) engineInterceptor$execute$12.L$2;
                        imageRequest4 = (coil.request.ImageRequest) engineInterceptor$execute$12.L$1;
                        engineInterceptor3 = (coil.intercept.EngineInterceptor) engineInterceptor$execute$12.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj5);
                            obj3 = obj5;
                            executeResult = (coil.intercept.EngineInterceptor.ExecuteResult) obj3;
                            objectRef = objectRef2;
                            engineInterceptor2 = engineInterceptor3;
                            eventListener2 = eventListener3;
                            imageRequest3 = imageRequest4;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef8 = objectRef3;
                            coil.intercept.EngineInterceptor.ExecuteResult executeResult3 = executeResult;
                            T t3 = objectRef.element;
                            sourceResult2 = t3 instanceof coil.fetch.SourceResult ? (coil.fetch.SourceResult) t3 : null;
                            if (sourceResult2 != null && (source2 = sourceResult2.getSource()) != null) {
                                coil.util.Utils.closeQuietly(source2);
                            }
                            coil.request.Options options3 = (coil.request.Options) objectRef8.element;
                            engineInterceptor$execute$12.L$0 = null;
                            engineInterceptor$execute$12.L$1 = null;
                            engineInterceptor$execute$12.L$2 = null;
                            engineInterceptor$execute$12.L$3 = null;
                            engineInterceptor$execute$12.L$4 = null;
                            engineInterceptor$execute$12.L$5 = null;
                            engineInterceptor$execute$12.L$6 = null;
                            engineInterceptor$execute$12.L$7 = null;
                            engineInterceptor$execute$12.label = 3;
                            transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult3, imageRequest3, options3, eventListener2, engineInterceptor$execute$12);
                            obj4 = transform$coil_base_release;
                            if (transform$coil_base_release == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coil.intercept.EngineInterceptor.ExecuteResult executeResult22 = (coil.intercept.EngineInterceptor.ExecuteResult) obj4;
                            android.graphics.drawable.Drawable drawable2 = executeResult22.getDrawable();
                            if (drawable2 instanceof android.graphics.drawable.BitmapDrawable) {
                            }
                            if (bitmapDrawable != null) {
                                bitmap.prepareToDraw();
                            }
                            return executeResult22;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            T t22 = objectRef2.element;
                            if (t22 instanceof coil.fetch.SourceResult) {
                            }
                            if (sourceResult != null) {
                                coil.util.Utils.closeQuietly(source);
                            }
                            throw th;
                        }
                    }
                    objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$7;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$6;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$5;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = (kotlin.jvm.internal.Ref.ObjectRef) engineInterceptor$execute$12.L$4;
                    eventListener2 = (coil.EventListener) engineInterceptor$execute$12.L$3;
                    java.lang.Object obj6 = engineInterceptor$execute$12.L$2;
                    imageRequest2 = (coil.request.ImageRequest) engineInterceptor$execute$12.L$1;
                    engineInterceptor = (coil.intercept.EngineInterceptor) engineInterceptor$execute$12.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj5);
                        objectRef = objectRef9;
                        objectRef4 = objectRef10;
                        objectRef3 = objectRef11;
                        obj2 = obj6;
                        t = obj5;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        objectRef2 = objectRef9;
                        T t222 = objectRef2.element;
                        sourceResult = t222 instanceof coil.fetch.SourceResult ? (coil.fetch.SourceResult) t222 : null;
                        if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                            coil.util.Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                }
                objectRef5.element = t;
                fetchResult = (coil.fetch.FetchResult) objectRef.element;
                if (fetchResult instanceof coil.fetch.SourceResult) {
                    if (!(fetchResult instanceof coil.fetch.DrawableResult)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    executeResult = new coil.intercept.EngineInterceptor.ExecuteResult(((coil.fetch.DrawableResult) objectRef.element).getDrawable(), ((coil.fetch.DrawableResult) objectRef.element).getIsSampled(), ((coil.fetch.DrawableResult) objectRef.element).getDataSource(), null);
                    imageRequest3 = imageRequest2;
                    engineInterceptor2 = engineInterceptor;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef82 = objectRef3;
                    coil.intercept.EngineInterceptor.ExecuteResult executeResult32 = executeResult;
                    T t32 = objectRef.element;
                    if (t32 instanceof coil.fetch.SourceResult) {
                    }
                    if (sourceResult2 != null) {
                    }
                    coil.request.Options options32 = (coil.request.Options) objectRef82.element;
                    engineInterceptor$execute$12.L$0 = null;
                    engineInterceptor$execute$12.L$1 = null;
                    engineInterceptor$execute$12.L$2 = null;
                    engineInterceptor$execute$12.L$3 = null;
                    engineInterceptor$execute$12.L$4 = null;
                    engineInterceptor$execute$12.L$5 = null;
                    engineInterceptor$execute$12.L$6 = null;
                    engineInterceptor$execute$12.L$7 = null;
                    engineInterceptor$execute$12.label = 3;
                    transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult32, imageRequest3, options32, eventListener2, engineInterceptor$execute$12);
                    obj4 = transform$coil_base_release;
                    if (transform$coil_base_release == coroutine_suspended) {
                    }
                    coil.intercept.EngineInterceptor.ExecuteResult executeResult222 = (coil.intercept.EngineInterceptor.ExecuteResult) obj4;
                    android.graphics.drawable.Drawable drawable22 = executeResult222.getDrawable();
                    if (drawable22 instanceof android.graphics.drawable.BitmapDrawable) {
                    }
                    if (bitmapDrawable != null) {
                    }
                    return executeResult222;
                }
                kotlinx.coroutines.CoroutineDispatcher decoderDispatcher = imageRequest2.getDecoderDispatcher();
                coil.intercept.EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new coil.intercept.EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef, objectRef4, imageRequest2, obj2, objectRef3, eventListener2, null);
                engineInterceptor$execute$12.L$0 = engineInterceptor;
                engineInterceptor$execute$12.L$1 = imageRequest2;
                engineInterceptor$execute$12.L$2 = eventListener2;
                engineInterceptor$execute$12.L$3 = objectRef3;
                engineInterceptor$execute$12.L$4 = objectRef;
                engineInterceptor$execute$12.L$5 = null;
                engineInterceptor$execute$12.L$6 = null;
                engineInterceptor$execute$12.L$7 = null;
                engineInterceptor$execute$12.label = 2;
                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(decoderDispatcher, engineInterceptor$execute$executeResult$1, engineInterceptor$execute$12);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eventListener3 = eventListener2;
                imageRequest4 = imageRequest2;
                engineInterceptor3 = engineInterceptor;
                objectRef2 = objectRef;
                obj3 = withContext;
                executeResult = (coil.intercept.EngineInterceptor.ExecuteResult) obj3;
                objectRef = objectRef2;
                engineInterceptor2 = engineInterceptor3;
                eventListener2 = eventListener3;
                imageRequest3 = imageRequest4;
                kotlin.jvm.internal.Ref.ObjectRef objectRef822 = objectRef3;
                coil.intercept.EngineInterceptor.ExecuteResult executeResult322 = executeResult;
                T t322 = objectRef.element;
                if (t322 instanceof coil.fetch.SourceResult) {
                }
                if (sourceResult2 != null) {
                    coil.util.Utils.closeQuietly(source2);
                }
                coil.request.Options options322 = (coil.request.Options) objectRef822.element;
                engineInterceptor$execute$12.L$0 = null;
                engineInterceptor$execute$12.L$1 = null;
                engineInterceptor$execute$12.L$2 = null;
                engineInterceptor$execute$12.L$3 = null;
                engineInterceptor$execute$12.L$4 = null;
                engineInterceptor$execute$12.L$5 = null;
                engineInterceptor$execute$12.L$6 = null;
                engineInterceptor$execute$12.L$7 = null;
                engineInterceptor$execute$12.label = 3;
                transform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult322, imageRequest3, options322, eventListener2, engineInterceptor$execute$12);
                obj4 = transform$coil_base_release;
                if (transform$coil_base_release == coroutine_suspended) {
                }
                coil.intercept.EngineInterceptor.ExecuteResult executeResult2222 = (coil.intercept.EngineInterceptor.ExecuteResult) obj4;
                android.graphics.drawable.Drawable drawable222 = executeResult2222.getDrawable();
                if (drawable222 instanceof android.graphics.drawable.BitmapDrawable) {
                }
                if (bitmapDrawable != null) {
                }
                return executeResult2222;
            }
        }
        engineInterceptor$execute$1 = new coil.intercept.EngineInterceptor$execute$1(this, continuation);
        coil.intercept.EngineInterceptor$execute$1 engineInterceptor$execute$122 = engineInterceptor$execute$1;
        java.lang.Object obj52 = engineInterceptor$execute$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$execute$122.label;
        if (i != 0) {
        }
        objectRef5.element = t;
        fetchResult = (coil.fetch.FetchResult) objectRef.element;
        if (fetchResult instanceof coil.fetch.SourceResult) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0092 -> B:10:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetch(coil.ComponentRegistry componentRegistry, coil.request.ImageRequest imageRequest, java.lang.Object obj, coil.request.Options options, coil.EventListener eventListener, kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> continuation) {
        coil.intercept.EngineInterceptor$fetch$1 engineInterceptor$fetch$1;
        int i;
        int i2;
        coil.intercept.EngineInterceptor engineInterceptor;
        kotlin.Pair<coil.fetch.Fetcher, java.lang.Integer> newFetcher;
        coil.decode.ImageSource source;
        if (continuation instanceof coil.intercept.EngineInterceptor$fetch$1) {
            engineInterceptor$fetch$1 = (coil.intercept.EngineInterceptor$fetch$1) continuation;
            if ((engineInterceptor$fetch$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$fetch$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj2 = engineInterceptor$fetch$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$fetch$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    i2 = 0;
                    engineInterceptor = this;
                    newFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i2);
                    if (newFetcher != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = engineInterceptor$fetch$1.I$0;
                    coil.fetch.Fetcher fetcher = (coil.fetch.Fetcher) engineInterceptor$fetch$1.L$6;
                    coil.EventListener eventListener2 = (coil.EventListener) engineInterceptor$fetch$1.L$5;
                    options = (coil.request.Options) engineInterceptor$fetch$1.L$4;
                    java.lang.Object obj3 = engineInterceptor$fetch$1.L$3;
                    coil.request.ImageRequest imageRequest2 = (coil.request.ImageRequest) engineInterceptor$fetch$1.L$2;
                    coil.ComponentRegistry componentRegistry2 = (coil.ComponentRegistry) engineInterceptor$fetch$1.L$1;
                    engineInterceptor = (coil.intercept.EngineInterceptor) engineInterceptor$fetch$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    coil.intercept.EngineInterceptor$fetch$1 engineInterceptor$fetch$12 = engineInterceptor$fetch$1;
                    int i4 = i3;
                    componentRegistry = componentRegistry2;
                    coil.intercept.EngineInterceptor$fetch$1 engineInterceptor$fetch$13 = engineInterceptor$fetch$12;
                    coil.fetch.Fetcher first = fetcher;
                    imageRequest = imageRequest2;
                    eventListener = eventListener2;
                    obj = obj3;
                    coil.fetch.FetchResult fetchResult = (coil.fetch.FetchResult) obj2;
                    try {
                        eventListener.fetchEnd(imageRequest, first, options, fetchResult);
                        if (fetchResult == null) {
                            return fetchResult;
                        }
                        i2 = i4;
                        engineInterceptor$fetch$1 = engineInterceptor$fetch$13;
                        newFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i2);
                        if (newFetcher != null) {
                            throw new java.lang.IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                        }
                        first = newFetcher.getFirst();
                        int intValue = newFetcher.getSecond().intValue() + 1;
                        eventListener.fetchStart(imageRequest, first, options);
                        engineInterceptor$fetch$1.L$0 = engineInterceptor;
                        engineInterceptor$fetch$1.L$1 = componentRegistry;
                        engineInterceptor$fetch$1.L$2 = imageRequest;
                        engineInterceptor$fetch$1.L$3 = obj;
                        engineInterceptor$fetch$1.L$4 = options;
                        engineInterceptor$fetch$1.L$5 = eventListener;
                        engineInterceptor$fetch$1.L$6 = first;
                        engineInterceptor$fetch$1.I$0 = intValue;
                        engineInterceptor$fetch$1.label = 1;
                        java.lang.Object fetch = first.fetch(engineInterceptor$fetch$1);
                        if (fetch == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coil.intercept.EngineInterceptor$fetch$1 engineInterceptor$fetch$14 = engineInterceptor$fetch$1;
                        i4 = intValue;
                        obj2 = fetch;
                        engineInterceptor$fetch$13 = engineInterceptor$fetch$14;
                        coil.fetch.FetchResult fetchResult2 = (coil.fetch.FetchResult) obj2;
                        eventListener.fetchEnd(imageRequest, first, options, fetchResult2);
                        if (fetchResult2 == null) {
                        }
                    } catch (java.lang.Throwable th) {
                        coil.fetch.SourceResult sourceResult = fetchResult2 instanceof coil.fetch.SourceResult ? (coil.fetch.SourceResult) fetchResult2 : null;
                        if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                            coil.util.Utils.closeQuietly(source);
                        }
                        throw th;
                    }
                }
            }
        }
        engineInterceptor$fetch$1 = new coil.intercept.EngineInterceptor$fetch$1(this, continuation);
        java.lang.Object obj22 = engineInterceptor$fetch$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$fetch$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:10:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object decode(coil.fetch.SourceResult sourceResult, coil.ComponentRegistry componentRegistry, coil.request.ImageRequest imageRequest, java.lang.Object obj, coil.request.Options options, coil.EventListener eventListener, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> continuation) {
        coil.intercept.EngineInterceptor$decode$1 engineInterceptor$decode$1;
        coil.intercept.EngineInterceptor engineInterceptor;
        int i;
        coil.fetch.SourceResult sourceResult2;
        coil.request.ImageRequest imageRequest2;
        java.lang.Object obj2;
        coil.request.Options options2;
        coil.EventListener eventListener2;
        coil.intercept.EngineInterceptor$decode$1 engineInterceptor$decode$12;
        coil.intercept.EngineInterceptor engineInterceptor2;
        int i2;
        coil.ComponentRegistry componentRegistry2;
        kotlin.Pair<coil.decode.Decoder, java.lang.Integer> newDecoder;
        if (continuation instanceof coil.intercept.EngineInterceptor$decode$1) {
            engineInterceptor$decode$1 = (coil.intercept.EngineInterceptor$decode$1) continuation;
            if ((engineInterceptor$decode$1.label & Integer.MIN_VALUE) != 0) {
                engineInterceptor$decode$1.label -= Integer.MIN_VALUE;
                engineInterceptor = this;
                java.lang.Object obj3 = engineInterceptor$decode$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = engineInterceptor$decode$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    sourceResult2 = sourceResult;
                    imageRequest2 = imageRequest;
                    obj2 = obj;
                    options2 = options;
                    eventListener2 = eventListener;
                    engineInterceptor$decode$12 = engineInterceptor$decode$1;
                    engineInterceptor2 = engineInterceptor;
                    i2 = 0;
                    componentRegistry2 = componentRegistry;
                    newDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i2);
                    if (newDecoder != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = engineInterceptor$decode$1.I$0;
                    coil.decode.Decoder decoder = (coil.decode.Decoder) engineInterceptor$decode$1.L$7;
                    coil.EventListener eventListener3 = (coil.EventListener) engineInterceptor$decode$1.L$6;
                    coil.request.Options options3 = (coil.request.Options) engineInterceptor$decode$1.L$5;
                    java.lang.Object obj4 = engineInterceptor$decode$1.L$4;
                    coil.request.ImageRequest imageRequest3 = (coil.request.ImageRequest) engineInterceptor$decode$1.L$3;
                    coil.ComponentRegistry componentRegistry3 = (coil.ComponentRegistry) engineInterceptor$decode$1.L$2;
                    coil.fetch.SourceResult sourceResult3 = (coil.fetch.SourceResult) engineInterceptor$decode$1.L$1;
                    engineInterceptor2 = (coil.intercept.EngineInterceptor) engineInterceptor$decode$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj3);
                    coil.intercept.EngineInterceptor$decode$1 engineInterceptor$decode$13 = engineInterceptor$decode$1;
                    componentRegistry2 = componentRegistry3;
                    int i4 = i3;
                    imageRequest2 = imageRequest3;
                    eventListener2 = eventListener3;
                    options2 = options3;
                    coil.decode.DecodeResult decodeResult = (coil.decode.DecodeResult) obj3;
                    eventListener2.decodeEnd(imageRequest2, decoder, options2, decodeResult);
                    if (decodeResult != null) {
                        obj2 = obj4;
                        i2 = i4;
                        engineInterceptor$decode$12 = engineInterceptor$decode$13;
                        sourceResult2 = sourceResult3;
                        newDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i2);
                        if (newDecoder != null) {
                            throw new java.lang.IllegalStateException(("Unable to create a decoder that supports: " + obj2).toString());
                        }
                        coil.decode.Decoder first = newDecoder.getFirst();
                        int intValue = newDecoder.getSecond().intValue() + 1;
                        eventListener2.decodeStart(imageRequest2, first, options2);
                        engineInterceptor$decode$12.L$0 = engineInterceptor2;
                        engineInterceptor$decode$12.L$1 = sourceResult2;
                        engineInterceptor$decode$12.L$2 = componentRegistry2;
                        engineInterceptor$decode$12.L$3 = imageRequest2;
                        engineInterceptor$decode$12.L$4 = obj2;
                        engineInterceptor$decode$12.L$5 = options2;
                        engineInterceptor$decode$12.L$6 = eventListener2;
                        engineInterceptor$decode$12.L$7 = first;
                        engineInterceptor$decode$12.I$0 = intValue;
                        engineInterceptor$decode$12.label = 1;
                        java.lang.Object decode = first.decode(engineInterceptor$decode$12);
                        if (decode == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sourceResult3 = sourceResult2;
                        obj3 = decode;
                        obj4 = obj2;
                        decoder = first;
                        engineInterceptor$decode$13 = engineInterceptor$decode$12;
                        i4 = intValue;
                        coil.decode.DecodeResult decodeResult2 = (coil.decode.DecodeResult) obj3;
                        eventListener2.decodeEnd(imageRequest2, decoder, options2, decodeResult2);
                        if (decodeResult2 != null) {
                        }
                    } else {
                        android.graphics.drawable.Drawable drawable = decodeResult2.getDrawable();
                        boolean isSampled = decodeResult2.getIsSampled();
                        coil.decode.DataSource dataSource = sourceResult3.getDataSource();
                        coil.decode.ImageSource source = sourceResult3.getSource();
                        coil.decode.FileImageSource fileImageSource = source instanceof coil.decode.FileImageSource ? (coil.decode.FileImageSource) source : null;
                        return new coil.intercept.EngineInterceptor.ExecuteResult(drawable, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey() : null);
                    }
                }
            }
        }
        engineInterceptor = this;
        engineInterceptor$decode$1 = new coil.intercept.EngineInterceptor$decode$1(engineInterceptor, continuation);
        java.lang.Object obj32 = engineInterceptor$decode$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = engineInterceptor$decode$1.label;
        if (i != 0) {
        }
    }

    public final java.lang.Object transform$coil_base_release(coil.intercept.EngineInterceptor.ExecuteResult executeResult, coil.request.ImageRequest imageRequest, coil.request.Options options, coil.EventListener eventListener, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> continuation) {
        java.util.List<coil.transform.Transformation> transformations = imageRequest.getTransformations();
        if (transformations.isEmpty()) {
            return executeResult;
        }
        if (!(executeResult.getDrawable() instanceof android.graphics.drawable.BitmapDrawable) && !imageRequest.getAllowConversionToBitmap()) {
            coil.util.Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "allowConversionToBitmap=false, skipping transformations for type " + executeResult.getDrawable().getClass().getCanonicalName() + '.', null);
            }
            return executeResult;
        }
        return kotlinx.coroutines.BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new coil.intercept.EngineInterceptor$transform$3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Bitmap convertDrawableToBitmap(android.graphics.drawable.Drawable drawable, coil.request.Options options, java.util.List<? extends coil.transform.Transformation> transformations) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            android.graphics.Bitmap.Config safeConfig = coil.util.Bitmaps.getSafeConfig(bitmap);
            if (kotlin.collections.ArraysKt.contains(coil.util.Utils.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            coil.util.Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "Converting bitmap with config " + safeConfig + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            coil.util.Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 4) {
                logger2.log(TAG, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return coil.util.DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* compiled from: EngineInterceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "copy", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExecuteResult {
        private final coil.decode.DataSource dataSource;
        private final java.lang.String diskCacheKey;
        private final android.graphics.drawable.Drawable drawable;
        private final boolean isSampled;

        public ExecuteResult(android.graphics.drawable.Drawable drawable, boolean z, coil.decode.DataSource dataSource, java.lang.String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        public final android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: isSampled, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public final coil.decode.DataSource getDataSource() {
            return this.dataSource;
        }

        public final java.lang.String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public static /* synthetic */ coil.intercept.EngineInterceptor.ExecuteResult copy$default(coil.intercept.EngineInterceptor.ExecuteResult executeResult, android.graphics.drawable.Drawable drawable, boolean z, coil.decode.DataSource dataSource, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        public final coil.intercept.EngineInterceptor.ExecuteResult copy(android.graphics.drawable.Drawable drawable, boolean isSampled, coil.decode.DataSource dataSource, java.lang.String diskCacheKey) {
            return new coil.intercept.EngineInterceptor.ExecuteResult(drawable, isSampled, dataSource, diskCacheKey);
        }
    }
}
