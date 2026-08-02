package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class Recomposer$join$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Recomposer.State, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((androidx.compose.runtime.Recomposer.State) this.getHighSpeedVideoFpsRangesFor) == androidx.compose.runtime.Recomposer.State.ShutDown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.runtime.Recomposer.State state, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.compose.runtime.Recomposer$join$2) create(state, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.Recomposer$join$2 recomposer$join$2 = new androidx.compose.runtime.Recomposer$join$2(continuation);
        recomposer$join$2.getHighSpeedVideoFpsRangesFor = obj;
        return recomposer$join$2;
    }

    Recomposer$join$2(kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$join$2> continuation) {
        super(2, continuation);
    }
}
