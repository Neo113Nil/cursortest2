package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {390, 391}, m = "invokeSuspend", n = {"locked", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, s = {"Z$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataOrHandleCorruption$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super androidx.content.core.Data<T>>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r7 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        int i;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z = this.getHighSpeedVideoSizes;
            androidx.content.core.DataStoreImpl<T> dataStoreImpl = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = androidx.content.core.StorageConnectionKt.readData(dataStoreImpl.getStorageConnection$datastore_core(), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object obj3 = obj2;
                i = ((java.lang.Number) obj).intValue();
                obj = obj3;
                return new androidx.content.core.Data(obj, obj != null ? obj.hashCode() : 0, i);
            }
            z = this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!z) {
            i = this.Camera2StreamConfigurationMap;
            return new androidx.content.core.Data(obj, obj != null ? obj.hashCode() : 0, i);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object version = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().getVersion(this);
        if (version != coroutine_suspended) {
            obj2 = obj;
            obj = version;
            java.lang.Object obj32 = obj2;
            i = ((java.lang.Number) obj).intValue();
            obj = obj32;
            return new androidx.content.core.Data(obj, obj != null ? obj.hashCode() : 0, i);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2) create(java.lang.Boolean.valueOf(bool.booleanValue()), (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.getHighSpeedVideoSizes = ((java.lang.Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$2(androidx.content.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataOrHandleCorruption$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = dataStoreImpl;
        this.Camera2StreamConfigurationMap = i;
    }
}
