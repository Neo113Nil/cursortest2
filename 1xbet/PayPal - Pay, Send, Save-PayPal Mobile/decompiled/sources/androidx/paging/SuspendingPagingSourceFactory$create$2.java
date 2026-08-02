package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PagingSource;", "Key", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.jvmAndAndroid.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SuspendingPagingSourceFactory$create$2<Key, Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>>, java.lang.Object> {
    final /* synthetic */ androidx.paging.SuspendingPagingSourceFactory<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function0 function0;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        function0 = ((androidx.paging.SuspendingPagingSourceFactory) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
        return function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.paging.SuspendingPagingSourceFactory$create$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.SuspendingPagingSourceFactory$create$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPagingSourceFactory$create$2(androidx.paging.SuspendingPagingSourceFactory<Key, Value> suspendingPagingSourceFactory, kotlin.coroutines.Continuation<? super androidx.paging.SuspendingPagingSourceFactory$create$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = suspendingPagingSourceFactory;
    }
}
