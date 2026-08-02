package androidx.compose.ui.text.font;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {314}, m = "loadWithTimeoutOrNull$ui_text", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.font.AsyncFontListLoader getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.loadWithTimeoutOrNull$ui_text(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = asyncFontListLoader;
    }
}
