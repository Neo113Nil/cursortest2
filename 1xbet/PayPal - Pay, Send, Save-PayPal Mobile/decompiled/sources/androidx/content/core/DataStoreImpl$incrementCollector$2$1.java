package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", i = {}, l = {145, 146}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$incrementCollector$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r5.collect(new androidx.content.core.DataStoreImpl$incrementCollector$2$1.AnonymousClass1(), r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r5.awaitComplete(r4) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.core.DataStoreImpl.InitDataStore initDataStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            initDataStore = ((androidx.content.core.DataStoreImpl) this.getHighSpeedVideoSizes).getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.Flow conflate = kotlinx.coroutines.flow.FlowKt.conflate(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes().getUpdateNotifications());
        final androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.DataStoreImpl$incrementCollector$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$incrementCollector$2$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$incrementCollector$2$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$incrementCollector$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = dataStoreImpl;
    }
}
