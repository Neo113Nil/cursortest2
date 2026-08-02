package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/compose/ui/geometry/Size;", "it", "Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.RealDrawScopeSizeResolver$size$2", f = "DrawScopeSizeResolver.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class RealDrawScopeSizeResolver$size$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.compose.ui.geometry.Size>, kotlinx.coroutines.flow.Flow<? extends androidx.compose.ui.geometry.Size>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll((kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor, (kotlinx.coroutines.flow.Flow) this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.compose.ui.geometry.Size> flowCollector, kotlinx.coroutines.flow.Flow<? extends androidx.compose.ui.geometry.Size> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        coil3.compose.RealDrawScopeSizeResolver$size$2 realDrawScopeSizeResolver$size$2 = new coil3.compose.RealDrawScopeSizeResolver$size$2(continuation);
        realDrawScopeSizeResolver$size$2.getHighSpeedVideoFpsRangesFor = flowCollector;
        realDrawScopeSizeResolver$size$2.getHighSpeedVideoFpsRanges = flow;
        return realDrawScopeSizeResolver$size$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    RealDrawScopeSizeResolver$size$2(kotlin.coroutines.Continuation<? super coil3.compose.RealDrawScopeSizeResolver$size$2> continuation) {
        super(3, continuation);
    }
}
