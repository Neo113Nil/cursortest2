package coil.intercept;

/* compiled from: EngineInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class EngineInterceptor$intercept$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil.request.SuccessResult>, java.lang.Object> {
    final /* synthetic */ coil.memory.MemoryCache.Key $cacheKey;
    final /* synthetic */ coil.intercept.Interceptor.Chain $chain;
    final /* synthetic */ coil.EventListener $eventListener;
    final /* synthetic */ java.lang.Object $mappedData;
    final /* synthetic */ coil.request.Options $options;
    final /* synthetic */ coil.request.ImageRequest $request;
    int label;
    final /* synthetic */ coil.intercept.EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$2(coil.intercept.EngineInterceptor engineInterceptor, coil.request.ImageRequest imageRequest, java.lang.Object obj, coil.request.Options options, coil.EventListener eventListener, coil.memory.MemoryCache.Key key, coil.intercept.Interceptor.Chain chain, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor$intercept$2> continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$options = options;
        this.$eventListener = eventListener;
        this.$cacheKey = key;
        this.$chain = chain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil.intercept.EngineInterceptor$intercept$2(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil.request.SuccessResult> continuation) {
        return ((coil.intercept.EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        coil.util.SystemCallbacks systemCallbacks;
        coil.memory.MemoryCacheService memoryCacheService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.execute(this.$request, this.$mappedData, this.$options, this.$eventListener, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        coil.intercept.EngineInterceptor.ExecuteResult executeResult = (coil.intercept.EngineInterceptor.ExecuteResult) obj;
        systemCallbacks = this.this$0.systemCallbacks;
        systemCallbacks.registerMemoryPressureCallbacks();
        memoryCacheService = this.this$0.memoryCacheService;
        return new coil.request.SuccessResult(executeResult.getDrawable(), this.$request, executeResult.getDataSource(), memoryCacheService.setCacheValue(this.$cacheKey, this.$request, executeResult) ? this.$cacheKey : null, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), coil.util.Utils.isPlaceholderCached(this.$chain));
    }
}
