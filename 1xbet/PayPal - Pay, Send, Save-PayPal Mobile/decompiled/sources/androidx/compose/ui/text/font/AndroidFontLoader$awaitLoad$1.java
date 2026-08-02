package androidx.compose.ui.text.font;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1}, l = {55, 57}, m = "awaitLoad", n = {io.ktor.http.ContentType.Font.TYPE}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AndroidFontLoader$awaitLoad$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.font.AndroidFontLoader getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitLoad(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFontLoader$awaitLoad$1(androidx.compose.ui.text.font.AndroidFontLoader androidFontLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = androidFontLoader;
    }
}
