package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {350, 351, 357}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$transformAndWrite$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r9 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.Data data;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                data = (androidx.content.core.Data) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                data.checkHashCode();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getValue(), obj)) {
                    this.getHighSpeedVideoFpsRanges = obj;
                    this.getHighSpeedVideoSizes = 3;
                    if (((androidx.content.core.DataStoreImpl<T>) this.getHighResolutionOutputSizeshNQ4ISI).writeData$datastore_core(obj, true, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        data = (androidx.content.core.Data) obj;
        this.getHighSpeedVideoFpsRanges = data;
        this.getHighSpeedVideoSizes = 2;
        obj = kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new androidx.content.core.DataStoreImpl$transformAndWrite$2$newData$1(this.getHighSpeedVideoFpsRangesFor, data, null), this);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$transformAndWrite$2) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$transformAndWrite$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$transformAndWrite$2(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$transformAndWrite$2> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl;
        this.Camera2StreamConfigurationMap = coroutineContext;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
