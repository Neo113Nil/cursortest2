package androidx.compose.ui.text.font;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0}, l = {412}, m = "runCached", n = {"key", "forever"}, s = {"L$0", "Z$0"}, v = 1)
/* loaded from: classes6.dex */
final class AsyncTypefaceCache$runCached$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.font.AsyncTypefaceCache getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.runCached(null, null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncTypefaceCache$runCached$1(androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = asyncTypefaceCache;
    }
}
