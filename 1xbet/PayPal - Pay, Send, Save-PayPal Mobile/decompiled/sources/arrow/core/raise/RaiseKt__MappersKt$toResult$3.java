package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, Error] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "A", "Error", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt$toResult$3", f = "Mappers.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$toResult$3<A, Error> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<Error, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<Error, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function2<Error, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object invoke = function2.invoke(obj2, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((arrow.core.raise.RaiseKt__MappersKt$toResult$3) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toResult$3 raiseKt__MappersKt$toResult$3 = new arrow.core.raise.RaiseKt__MappersKt$toResult$3(this.getHighSpeedVideoFpsRangesFor, continuation);
        raiseKt__MappersKt$toResult$3.Camera2StreamConfigurationMap = obj;
        return raiseKt__MappersKt$toResult$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RaiseKt__MappersKt$toResult$3(kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$toResult$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
