package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {316, 318}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$readDataAndUpdateCache$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.content.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r6 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        androidx.content.core.ReadException readException;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
        } catch (java.lang.Throwable th2) {
            this.getHighSpeedVideoSizes = th2;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object version = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes().getVersion(this);
            if (version != coroutine_suspended) {
                th = th2;
                obj = version;
            }
            return coroutine_suspended;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (java.lang.Throwable) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                readException = new androidx.content.core.ReadException(th, ((java.lang.Number) obj).intValue());
                return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        readException = (androidx.content.core.State) obj;
        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.content.core.DataStoreImpl$readDataAndUpdateCache$3) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.DataStoreImpl$readDataAndUpdateCache$3(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$3(androidx.content.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$readDataAndUpdateCache$3> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = dataStoreImpl;
    }
}
