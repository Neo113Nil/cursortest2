package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {403, 404, 406}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataOrHandleCorruption$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r7 != r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object readData;
        T t;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object obj3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (androidx.content.core.CorruptionException unused) {
            kotlin.jvm.internal.Ref.IntRef intRef3 = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = intRef3;
            this.getHighSpeedVideoFpsRanges = 3;
            java.lang.Object writeData$datastore_core = this.getHighResolutionOutputSizeshNQ4ISI.writeData$datastore_core(this.getHighSpeedVideoFpsRangesFor.element, true, this);
            if (writeData$datastore_core != coroutine_suspended) {
                intRef = intRef3;
                obj2 = writeData$datastore_core;
            }
            return coroutine_suspended;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef = this.getHighSpeedVideoFpsRangesFor;
            androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = objectRef;
            this.getHighSpeedVideoFpsRanges = 1;
            readData = androidx.content.core.StorageConnectionKt.readData(dataStoreImpl.getStorageConnection$datastore_core(), this);
            t = readData;
        } else {
            if (i != 1) {
                if (i == 2) {
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    intRef2.element = ((java.lang.Number) obj3).intValue();
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (kotlin.jvm.internal.Ref.IntRef) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                intRef.element = ((java.lang.Number) obj2).intValue();
                return kotlin.Unit.INSTANCE;
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        intRef2 = this.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = intRef2;
        this.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object version = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes().getVersion(this);
        obj3 = version;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$3(kotlin.jvm.internal.Ref.ObjectRef<T> objectRef, androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$3> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = objectRef;
        this.getHighResolutionOutputSizeshNQ4ISI = dataStoreImpl;
        this.getHighSpeedVideoSizes = intRef;
    }
}
