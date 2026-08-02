package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", i = {}, l = {449, 453}, m = "doRun", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataStoreImpl$InitDataStore$doRun$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.content.core.DataStoreImpl<T>.InitDataStore getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.doRun(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$1(androidx.content.core.DataStoreImpl<T>.InitDataStore initDataStore, kotlin.coroutines.Continuation<? super androidx.content.core.DataStoreImpl$InitDataStore$doRun$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = initDataStore;
    }
}
