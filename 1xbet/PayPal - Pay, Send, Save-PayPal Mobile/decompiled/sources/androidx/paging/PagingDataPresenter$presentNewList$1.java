package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {468}, m = "presentNewList", n = {"pages", "sourceLoadStates", "mediatorLoadStates", "newHintReceiver", "currentPageStore", "currentHintReceiver", "newPageStore", "placeholdersBefore", "placeholdersAfter", "dispatchLoadStates"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "Z$0"}, v = 1)
/* loaded from: classes.dex */
final class PagingDataPresenter$presentNewList$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    boolean getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.paging.PagingDataPresenter<T> getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(null, 0, 0, false, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataPresenter$presentNewList$1(androidx.paging.PagingDataPresenter<T> pagingDataPresenter, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataPresenter$presentNewList$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = pagingDataPresenter;
    }
}
