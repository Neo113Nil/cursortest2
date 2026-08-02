package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", i = {}, l = {256, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$handleUpdate$2$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.datastore.core.Message.Update<T> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r6 != r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object lock;
        java.lang.Object lock2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.content.core.State<T> currentState = ((androidx.content.core.DataStoreImpl) this.getHighResolutionOutputSizeshNQ4ISI).getInputFormats.getCurrentState();
            if (currentState instanceof androidx.content.core.Data) {
                androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform = this.getHighSpeedVideoSizes.getTransform();
                kotlin.coroutines.CoroutineContext callerContext = this.getHighSpeedVideoSizes.getCallerContext();
                this.getHighSpeedVideoFpsRanges = 1;
                lock = dataStoreImpl.getHighSpeedVideoSizes().lock(new androidx.content.core.DataStoreImpl$transformAndWrite$2(dataStoreImpl, callerContext, transform, null), this);
                if (lock != coroutine_suspended) {
                    return lock;
                }
            } else if ((currentState instanceof androidx.content.core.ReadException) || (currentState instanceof androidx.content.core.UnInitialized)) {
                if (currentState == this.getHighSpeedVideoSizes.getLastState()) {
                    this.getHighSpeedVideoFpsRanges = 2;
                    highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this);
                } else {
                    throw ((androidx.content.core.ReadException) currentState).getReadException();
                }
            } else {
                if (currentState instanceof androidx.content.core.Final) {
                    throw ((androidx.content.core.Final) currentState).getFinalException();
                }
                if (currentState instanceof androidx.content.core.NoValueDataState) {
                    throw new java.lang.IllegalStateException(androidx.content.core.DataStoreImpl.BUG_MESSAGE.toString());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i != 2) {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.content.core.DataStoreImpl<T> dataStoreImpl2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform2 = this.getHighSpeedVideoSizes.getTransform();
        kotlin.coroutines.CoroutineContext callerContext2 = this.getHighSpeedVideoSizes.getCallerContext();
        this.getHighSpeedVideoFpsRanges = 3;
        lock2 = dataStoreImpl2.getHighSpeedVideoSizes().lock(new androidx.content.core.DataStoreImpl$transformAndWrite$2(dataStoreImpl2, callerContext2, transform2, null), this);
        return lock2 == coroutine_suspended ? coroutine_suspended : lock2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$handleUpdate$2$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$handleUpdate$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$handleUpdate$2$1(androidx.content.core.DataStoreImpl<T> dataStoreImpl, androidx.datastore.core.Message.Update<T> update, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$handleUpdate$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl;
        this.getHighSpeedVideoSizes = update;
    }
}
