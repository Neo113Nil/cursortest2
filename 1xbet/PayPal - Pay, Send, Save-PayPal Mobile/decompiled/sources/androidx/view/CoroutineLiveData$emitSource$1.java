package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "emitSource$lifecycle_livedata", n = {"source"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class CoroutineLiveData$emitSource$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.CoroutineLiveData<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emitSource$lifecycle_livedata(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$emitSource$1(androidx.view.CoroutineLiveData<T> coroutineLiveData, kotlin.coroutines.Continuation<? super androidx.view.CoroutineLiveData$emitSource$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineLiveData;
    }
}
