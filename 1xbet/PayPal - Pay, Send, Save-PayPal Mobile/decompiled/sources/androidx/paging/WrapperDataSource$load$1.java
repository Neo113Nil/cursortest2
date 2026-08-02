package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.jvmAndAndroid.kt", i = {0}, l = {72}, m = "load$suspendImpl", n = {"$this"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.paging.WrapperDataSource<Key, ValueFrom, ValueTo> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.paging.WrapperDataSource.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WrapperDataSource$load$1(androidx.paging.WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, kotlin.coroutines.Continuation<? super androidx.paging.WrapperDataSource$load$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = wrapperDataSource;
    }
}
