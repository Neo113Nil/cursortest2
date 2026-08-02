package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, Error] */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Error", "A", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt$toIor$3", f = "Mappers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$toIor$3<A, Error> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<A, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends Error, ? extends A>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return new arrow.core.Ior.Right(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((arrow.core.raise.RaiseKt__MappersKt$toIor$3) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toIor$3 raiseKt__MappersKt$toIor$3 = new arrow.core.raise.RaiseKt__MappersKt$toIor$3(continuation);
        raiseKt__MappersKt$toIor$3.getHighSpeedVideoFpsRangesFor = obj;
        return raiseKt__MappersKt$toIor$3;
    }

    RaiseKt__MappersKt$toIor$3(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$toIor$3> continuation) {
        super(2, continuation);
    }
}
