package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SeparatorState", f = "Separators.kt", i = {0, 0, 0, 0}, l = {575}, m = "onStaticList", n = {"event", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "item", "i"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
/* loaded from: classes7.dex */
final class SeparatorState$onStaticList$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.SeparatorState<R, T> getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.Camera2StreamConfigurationMap((androidx.paging.PageEvent.StaticList<T>) null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeparatorState$onStaticList$1(androidx.paging.SeparatorState<R, T> separatorState, kotlin.coroutines.Continuation<? super androidx.paging.SeparatorState$onStaticList$1> continuation) {
        super(continuation);
        this.getOutputFormats = separatorState;
    }
}
