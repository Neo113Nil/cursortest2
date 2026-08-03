package kotlinx.coroutines.selects;

/* compiled from: SelectOld.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class UnbiasedSelectBuilderImpl$initSelectResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbiasedSelectBuilderImpl$initSelectResult$1(kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl<R> unbiasedSelectBuilderImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1> continuation) {
        super(2, continuation);
        this.this$0 = unbiasedSelectBuilderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.this$0.doSelect(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            cancellableContinuationImpl2 = ((kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl) this.this$0).cont;
            kotlinx.coroutines.selects.SelectOldKt.resumeUndispatched(cancellableContinuationImpl2, obj);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            cancellableContinuationImpl = ((kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl) this.this$0).cont;
            kotlinx.coroutines.selects.SelectOldKt.resumeUndispatchedWithException(cancellableContinuationImpl, th);
            return kotlin.Unit.INSTANCE;
        }
    }
}
