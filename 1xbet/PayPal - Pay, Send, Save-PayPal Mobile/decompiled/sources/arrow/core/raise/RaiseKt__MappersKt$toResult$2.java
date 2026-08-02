package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "A", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__MappersKt$toResult$2", f = "Mappers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__MappersKt$toResult$2<A> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoFpsRangesFor;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Throwable th, java.lang.Object obj) {
        return ((arrow.core.raise.RaiseKt__MappersKt$toResult$2) create(th, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__MappersKt$toResult$2 raiseKt__MappersKt$toResult$2 = new arrow.core.raise.RaiseKt__MappersKt$toResult$2(continuation);
        raiseKt__MappersKt$toResult$2.getHighSpeedVideoFpsRangesFor = obj;
        return raiseKt__MappersKt$toResult$2;
    }

    RaiseKt__MappersKt$toResult$2(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__MappersKt$toResult$2> continuation) {
        super(2, continuation);
    }
}
