package androidx.view;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m = "clearSource$lifecycle_livedata", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class CoroutineLiveData$clearSource$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.view.CoroutineLiveData<T> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.clearSource$lifecycle_livedata(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineLiveData$clearSource$1(androidx.view.CoroutineLiveData<T> coroutineLiveData, kotlin.coroutines.Continuation<? super androidx.view.CoroutineLiveData$clearSource$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = coroutineLiveData;
    }
}
