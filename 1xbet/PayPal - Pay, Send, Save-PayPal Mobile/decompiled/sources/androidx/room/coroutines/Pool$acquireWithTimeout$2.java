package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Pool$acquireWithTimeout$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.ConnectionWithLock> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.room.coroutines.Pool getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.ConnectionWithLock> objectRef;
        T t;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.ConnectionWithLock> objectRef2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = objectRef2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this);
            if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t = highResolutionOutputSizeshNQ4ISI;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.coroutines.Pool$acquireWithTimeout$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.coroutines.Pool$acquireWithTimeout$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$2(kotlin.jvm.internal.Ref.ObjectRef<androidx.room.coroutines.ConnectionWithLock> objectRef, androidx.room.coroutines.Pool pool, kotlin.coroutines.Continuation<? super androidx.room.coroutines.Pool$acquireWithTimeout$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighSpeedVideoFpsRanges = pool;
    }
}
