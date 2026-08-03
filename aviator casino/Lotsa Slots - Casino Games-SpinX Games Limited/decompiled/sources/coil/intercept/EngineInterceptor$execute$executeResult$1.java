package coil.intercept;

/* compiled from: EngineInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class EngineInterceptor$execute$executeResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil.ComponentRegistry> $components;
    final /* synthetic */ coil.EventListener $eventListener;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil.fetch.FetchResult> $fetchResult;
    final /* synthetic */ java.lang.Object $mappedData;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<coil.request.Options> $options;
    final /* synthetic */ coil.request.ImageRequest $request;
    int label;
    final /* synthetic */ coil.intercept.EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$executeResult$1(coil.intercept.EngineInterceptor engineInterceptor, kotlin.jvm.internal.Ref.ObjectRef<coil.fetch.FetchResult> objectRef, kotlin.jvm.internal.Ref.ObjectRef<coil.ComponentRegistry> objectRef2, coil.request.ImageRequest imageRequest, java.lang.Object obj, kotlin.jvm.internal.Ref.ObjectRef<coil.request.Options> objectRef3, coil.EventListener eventListener, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor$execute$executeResult$1> continuation) {
        super(2, continuation);
        this.this$0 = engineInterceptor;
        this.$fetchResult = objectRef;
        this.$components = objectRef2;
        this.$request = imageRequest;
        this.$mappedData = obj;
        this.$options = objectRef3;
        this.$eventListener = eventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new coil.intercept.EngineInterceptor$execute$executeResult$1(this.this$0, this.$fetchResult, this.$components, this.$request, this.$mappedData, this.$options, this.$eventListener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super coil.intercept.EngineInterceptor.ExecuteResult> continuation) {
        return ((coil.intercept.EngineInterceptor$execute$executeResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.decode((coil.fetch.SourceResult) this.$fetchResult.element, this.$components.element, this.$request, this.$mappedData, this.$options.element, this.$eventListener, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
