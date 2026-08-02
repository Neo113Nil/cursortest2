package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", i = {0, 0}, l = {50}, m = "map", n = {"transform", "destination$iv$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageEvent$StaticList$map$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.PageEvent.StaticList<T> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.map(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$StaticList$map$1(androidx.paging.PageEvent.StaticList<T> staticList, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent$StaticList$map$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = staticList;
    }
}
