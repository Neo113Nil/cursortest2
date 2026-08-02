package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", "", "locked"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {324, 328}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataAndUpdateCache$4<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.content.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        boolean z;
        java.lang.Throwable th;
        androidx.content.core.ReadException readException;
        boolean z2;
        boolean z3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z4 = this.getHighSpeedVideoFpsRanges;
        try {
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (z4 != 0) {
                this.Camera2StreamConfigurationMap = th;
                this.getHighResolutionOutputSizeshNQ4ISI = z4;
                this.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object version = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().getVersion(this);
                if (version != coroutine_suspended) {
                    z = z4 ? 1 : 0;
                    th = th;
                    obj = version;
                }
                return coroutine_suspended;
            }
            i = this.getHighSpeedVideoSizes;
            z3 = z4;
        }
        if (z4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z5 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = z5;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(z5, this);
            z4 = z5;
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.getHighResolutionOutputSizeshNQ4ISI;
                th = (java.lang.Throwable) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                boolean z6 = z;
                i = ((java.lang.Number) obj).intValue();
                th = th;
                z3 = z6;
                readException = new androidx.content.core.ReadException(th, i);
                z2 = z3;
                return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
            }
            boolean z7 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            z4 = z7;
        }
        readException = (androidx.content.core.State) obj;
        z2 = z4;
        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4) create(java.lang.Boolean.valueOf(bool.booleanValue()), (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$4(androidx.content.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataAndUpdateCache$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = dataStoreImpl;
        this.getHighSpeedVideoSizes = i;
    }
}
