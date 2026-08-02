package androidx.compose.ui.text.font;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0}, l = {43}, m = io.ktor.http.LinkHeader.Rel.PreLoad, n = {"fontFamily"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class FontFamilyResolverImpl$preload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.text.font.FontFamilyResolverImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.preload(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$preload$1(androidx.compose.ui.text.font.FontFamilyResolverImpl fontFamilyResolverImpl, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = fontFamilyResolverImpl;
    }
}
