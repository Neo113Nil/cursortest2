package androidx.room;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"invalidatedTablesSet"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String[] getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.room.MultiInstanceInvalidationClient getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.util.Set<java.lang.String> set;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String[] strArr = this.getHighSpeedVideoFpsRangesFor;
            java.util.Set<java.lang.String> of = kotlin.collections.SetsKt.setOf(java.util.Arrays.copyOf(strArr, strArr.length));
            mutableSharedFlow = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = of;
            this.getHighSpeedVideoFpsRanges = 1;
            if (mutableSharedFlow.emit(of, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            set = of;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.getInvalidationTracker().notifyObserversByTableNames$room_runtime(set);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1(java.lang.String[] strArr, androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient, kotlin.coroutines.Continuation<? super androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = strArr;
        this.getHighSpeedVideoSizes = multiInstanceInvalidationClient;
    }
}
