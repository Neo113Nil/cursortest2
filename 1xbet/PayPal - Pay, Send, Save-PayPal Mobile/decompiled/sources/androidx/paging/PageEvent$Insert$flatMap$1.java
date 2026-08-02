package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {152}, m = "flatMap", n = {"transform", "this_$iv$iv", "destination$iv$iv$iv", "it", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "originalIndices", "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageEvent$Insert$flatMap$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ androidx.paging.PageEvent.Insert<T> unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.unwrapAs.flatMap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$flatMap$1(androidx.paging.PageEvent.Insert<T> insert, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent$Insert$flatMap$1> continuation) {
        super(continuation);
        this.unwrapAs = insert;
    }
}
