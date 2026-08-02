package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {644}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedPreFling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.viewinterop.AndroidViewHolder getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nestedScrollDispatcher = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (nestedScrollDispatcher.m7109dispatchPreFlingQWom1Mo(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedPreFling$1(androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = androidViewHolder;
        this.Camera2StreamConfigurationMap = j;
    }
}
