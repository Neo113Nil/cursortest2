package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil3/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class EngineInterceptor$execute$executeResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor.ExecuteResult>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil3.fetch.FetchResult> Camera2StreamConfigurationMap;
    final /* synthetic */ coil3.EventListener getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil3.ComponentRegistry> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil3.view.Options> getHighSpeedVideoSizes;
    final /* synthetic */ coil3.view.ImageRequest getHighSpeedVideoSizesFor;
    final /* synthetic */ coil3.intercept.EngineInterceptor getInputFormats;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getOutputFormats = 1;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI((coil3.fetch.SourceFetchResult) this.Camera2StreamConfigurationMap.element, this.getHighSpeedVideoFpsRangesFor.element, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.element, this.getHighResolutionOutputSizeshNQ4ISI, this);
        return highResolutionOutputSizeshNQ4ISI == coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor.ExecuteResult> continuation) {
        return ((coil3.intercept.EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil3.intercept.EngineInterceptor$execute$executeResult$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$executeResult$1(coil3.intercept.EngineInterceptor engineInterceptor, kotlin.jvm.internal.Ref.ObjectRef<coil3.fetch.FetchResult> objectRef, kotlin.jvm.internal.Ref.ObjectRef<coil3.ComponentRegistry> objectRef2, coil3.view.ImageRequest imageRequest, java.lang.Object obj, kotlin.jvm.internal.Ref.ObjectRef<coil3.view.Options> objectRef3, coil3.EventListener eventListener, kotlin.coroutines.Continuation<? super coil3.intercept.EngineInterceptor$execute$executeResult$1> continuation) {
        super(2, continuation);
        this.getInputFormats = engineInterceptor;
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighSpeedVideoFpsRangesFor = objectRef2;
        this.getHighSpeedVideoSizesFor = imageRequest;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes = objectRef3;
        this.getHighResolutionOutputSizeshNQ4ISI = eventListener;
    }
}
