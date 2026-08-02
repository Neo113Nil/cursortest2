package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$sample$2$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.getHighSpeedVideoSizes.element;
            if (obj2 == null) {
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoSizes.element = null;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.getHighSpeedVideoFpsRanges;
            if (obj2 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                obj2 = null;
            }
            this.Camera2StreamConfigurationMap = 1;
            if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2) create(unit, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2$1$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = objectRef;
        this.getHighSpeedVideoFpsRanges = flowCollector;
    }
}
