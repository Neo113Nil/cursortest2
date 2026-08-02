package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [B] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0010\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "B", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__FoldKt$fold$7", f = "Fold.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__FoldKt$fold$7<B> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super B>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        throw ((java.lang.Throwable) this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Throwable th, java.lang.Object obj) {
        return ((arrow.core.raise.RaiseKt__FoldKt$fold$7) create(th, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__FoldKt$fold$7 raiseKt__FoldKt$fold$7 = new arrow.core.raise.RaiseKt__FoldKt$fold$7(continuation);
        raiseKt__FoldKt$fold$7.getHighSpeedVideoSizes = obj;
        return raiseKt__FoldKt$fold$7;
    }

    RaiseKt__FoldKt$fold$7(kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__FoldKt$fold$7> continuation) {
        super(2, continuation);
    }
}
