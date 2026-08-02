package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "(Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformFontFamilyTypefaceAdapter implements androidx.compose.ui.text.font.FontFamilyTypefaceAdapter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.PlatformTypefaces getHighSpeedVideoSizes = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public final androidx.compose.ui.text.font.TypefaceResult resolve(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> onAsyncCompletion, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> createDefaultTypeface) {
        android.graphics.Typeface mo8180createDefaultFO1MlWM;
        androidx.compose.ui.text.font.FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof androidx.compose.ui.text.font.DefaultFontFamily)) {
            mo8180createDefaultFO1MlWM = this.getHighSpeedVideoSizes.mo8180createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA());
        } else if (fontFamily instanceof androidx.compose.ui.text.font.GenericFontFamily) {
            mo8180createDefaultFO1MlWM = this.getHighSpeedVideoSizes.mo8181createNamedRetOiIg((androidx.compose.ui.text.font.GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof androidx.compose.ui.text.font.LoadedFontFamily)) {
                return null;
            }
            androidx.compose.ui.text.font.Typeface typeface = ((androidx.compose.ui.text.font.LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeface, "");
            mo8180createDefaultFO1MlWM = ((androidx.compose.ui.text.platform.AndroidTypeface) typeface).mo8282getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m8192getFontStyle_LCdwA(), typefaceRequest.m8193getFontSynthesisGVVA2EU());
        }
        return new androidx.compose.ui.text.font.TypefaceResult.Immutable(mo8180createDefaultFO1MlWM, false, 2, null);
    }
}
