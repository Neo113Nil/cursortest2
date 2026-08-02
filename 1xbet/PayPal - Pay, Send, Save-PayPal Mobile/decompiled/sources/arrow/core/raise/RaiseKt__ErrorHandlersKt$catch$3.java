package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, Error] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "A", "Error", "Larrow/core/raise/Raise;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$3", f = "ErrorHandlers.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__ErrorHandlersKt$catch$3<A, Error> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super kotlin.Result<? extends A>>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.raise.Raise raise = (arrow.core.raise.Raise) this.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                this.getHighSpeedVideoSizes = companion;
                this.getHighSpeedVideoFpsRanges = 1;
                obj = raise.invoke(function2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(obj));
        } catch (java.lang.Throwable th) {
            return kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th))));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$3) create((arrow.core.raise.Raise) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$3 raiseKt__ErrorHandlersKt$catch$3 = new arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$3(this.getHighSpeedVideoFpsRangesFor, continuation);
        raiseKt__ErrorHandlersKt$catch$3.getHighSpeedVideoSizes = obj;
        return raiseKt__ErrorHandlersKt$catch$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RaiseKt__ErrorHandlersKt$catch$3(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
