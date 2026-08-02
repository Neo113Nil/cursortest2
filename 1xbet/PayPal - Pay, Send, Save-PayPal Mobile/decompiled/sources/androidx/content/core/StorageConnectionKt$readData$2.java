package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "T", "Landroidx/datastore/core/ReadScope;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class StorageConnectionKt$readData$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.content.core.ReadScope<T>, java.lang.Boolean, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object readData = ((androidx.content.core.ReadScope) this.getHighSpeedVideoFpsRangesFor).readData(this);
        return readData == coroutine_suspended ? coroutine_suspended : readData;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Boolean bool, java.lang.Object obj2) {
        androidx.content.core.StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new androidx.content.core.StorageConnectionKt$readData$2((kotlin.coroutines.Continuation) obj2);
        storageConnectionKt$readData$2.getHighSpeedVideoFpsRangesFor = (androidx.content.core.ReadScope) obj;
        return storageConnectionKt$readData$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    StorageConnectionKt$readData$2(kotlin.coroutines.Continuation<? super androidx.content.core.StorageConnectionKt$readData$2> continuation) {
        super(3, continuation);
    }
}
