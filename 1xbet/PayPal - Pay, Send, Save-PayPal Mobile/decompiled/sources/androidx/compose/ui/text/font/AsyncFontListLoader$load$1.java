package androidx.compose.ui.text.font;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m = "load", n = {"$this$fastForEach$iv", io.ktor.http.ContentType.Font.TYPE, "index$iv", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0"}, v = 1)
/* loaded from: classes6.dex */
final class AsyncFontListLoader$load$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.ui.text.font.AsyncFontListLoader getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.load(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$1(androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AsyncFontListLoader$load$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = asyncFontListLoader;
    }
}
