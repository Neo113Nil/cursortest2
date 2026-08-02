package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Landroidx/datastore/core/WriteScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", i = {0}, l = {372, 373}, m = "invokeSuspend", n = {"$this$writeScope"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$writeData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.core.WriteScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ T getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r3.writeData(r7.getHighResolutionOutputSizeshNQ4ISI, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.IntRef intRef;
        androidx.content.core.WriteScope writeScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.content.core.WriteScope writeScope2 = (androidx.content.core.WriteScope) this.getOutputMinFrameDuration;
            intRef = this.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = writeScope2;
            this.getHighSpeedVideoFpsRanges = intRef;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object incrementAndGetVersion = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes().incrementAndGetVersion(this);
            if (incrementAndGetVersion != coroutine_suspended) {
                writeScope = writeScope2;
                obj = incrementAndGetVersion;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap) {
                androidx.content.core.DataStoreInMemoryCache dataStoreInMemoryCache = ((androidx.content.core.DataStoreImpl) this.getInputSizeshNQ4ISI).getInputFormats;
                T t = this.getHighResolutionOutputSizeshNQ4ISI;
                dataStoreInMemoryCache.tryUpdate(new androidx.content.core.Data(t, t != null ? t.hashCode() : 0, this.getHighSpeedVideoSizes.element));
            }
            return kotlin.Unit.INSTANCE;
        }
        intRef = (kotlin.jvm.internal.Ref.IntRef) this.getHighSpeedVideoFpsRanges;
        writeScope = (androidx.content.core.WriteScope) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
        intRef.element = ((java.lang.Number) obj).intValue();
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.DataStoreImpl$writeData$2) create((androidx.content.core.WriteScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new androidx.content.core.DataStoreImpl$writeData$2(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        dataStoreImpl$writeData$2.getOutputMinFrameDuration = obj;
        return dataStoreImpl$writeData$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$2(kotlin.jvm.internal.Ref.IntRef intRef, androidx.content.core.DataStoreImpl<T> dataStoreImpl, T t, boolean z, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$writeData$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = intRef;
        this.getInputSizeshNQ4ISI = dataStoreImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.Camera2StreamConfigurationMap = z;
    }
}
