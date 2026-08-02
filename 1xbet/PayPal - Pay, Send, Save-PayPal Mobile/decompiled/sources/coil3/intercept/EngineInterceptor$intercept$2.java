package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class EngineInterceptor$intercept$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.view.SuccessResult>, java.lang.Object> {
    final /* synthetic */ coil3.memory.MemoryCache.Key Camera2StreamConfigurationMap;
    final /* synthetic */ coil3.EventListener getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.intercept.Interceptor.Chain getHighSpeedVideoFpsRanges;
    final /* synthetic */ coil3.view.Options getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ coil3.view.ImageRequest getHighSpeedVideoSizesFor;
    final /* synthetic */ coil3.intercept.EngineInterceptor getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        coil3.content.SystemCallbacks systemCallbacks;
        coil3.memory.MemoryCacheService memoryCacheService;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            obj = this.getOutputFormats.getHighSpeedVideoSizes(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        coil3.intercept.EngineInterceptor.ExecuteResult executeResult = (coil3.intercept.EngineInterceptor.ExecuteResult) obj;
        systemCallbacks = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
        systemCallbacks.registerMemoryPressureCallbacks();
        memoryCacheService = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
        return new coil3.view.SuccessResult(executeResult.getImage(), this.getHighSpeedVideoSizesFor, executeResult.getDataSource(), !memoryCacheService.setCacheValue(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, executeResult) ? null : this.Camera2StreamConfigurationMap, executeResult.getDiskCacheKey(), executeResult.isSampled(), coil3.content.UtilsKt.isPlaceholderCached(this.getHighSpeedVideoFpsRanges));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.view.SuccessResult> continuation) {
        return ((coil3.intercept.EngineInterceptor$intercept$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.intercept.EngineInterceptor$intercept$2(this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$2(coil3.intercept.EngineInterceptor engineInterceptor, coil3.view.ImageRequest imageRequest, java.lang.Object obj, coil3.view.Options options, coil3.EventListener eventListener, coil3.memory.MemoryCache.Key key, coil3.intercept.Interceptor.Chain chain, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor$intercept$2> continuation) {
        super(2, continuation);
        this.getOutputFormats = engineInterceptor;
        this.getHighSpeedVideoSizesFor = imageRequest;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor = options;
        this.getHighResolutionOutputSizeshNQ4ISI = eventListener;
        this.Camera2StreamConfigurationMap = key;
        this.getHighSpeedVideoFpsRanges = chain;
    }
}
