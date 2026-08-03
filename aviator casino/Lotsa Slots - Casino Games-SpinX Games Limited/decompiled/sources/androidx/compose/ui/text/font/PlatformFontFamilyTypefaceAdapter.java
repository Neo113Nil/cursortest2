package androidx.compose.ui.text.font;

/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "()V", "platformTypefaceResolver", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "createDefaultTypeface", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformFontFamilyTypefaceAdapter implements androidx.compose.ui.text.font.FontFamilyTypefaceAdapter {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.font.PlatformTypefaces platformTypefaceResolver = androidx.compose.ui.text.font.PlatformTypefaces_androidKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public androidx.compose.ui.text.font.TypefaceResult resolve(androidx.compose.ui.text.font.TypefaceRequest typefaceRequest, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceResult.Immutable, kotlin.Unit> onAsyncCompletion, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.font.TypefaceRequest, ? extends java.lang.Object> createDefaultTypeface) {
        android.graphics.Typeface mo4103createDefaultFO1MlWM;
        androidx.compose.ui.text.font.FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null || (fontFamily instanceof androidx.compose.ui.text.font.DefaultFontFamily)) {
            mo4103createDefaultFO1MlWM = this.platformTypefaceResolver.mo4103createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA());
        } else if (fontFamily instanceof androidx.compose.ui.text.font.GenericFontFamily) {
            mo4103createDefaultFO1MlWM = this.platformTypefaceResolver.mo4104createNamedRetOiIg((androidx.compose.ui.text.font.GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof androidx.compose.ui.text.font.LoadedFontFamily)) {
                return null;
            }
            androidx.compose.ui.text.font.Typeface typeface = ((androidx.compose.ui.text.font.LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            mo4103createDefaultFO1MlWM = ((androidx.compose.ui.text.platform.AndroidTypeface) typeface).mo4210getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m4121getFontStyle_LCdwA(), typefaceRequest.m4122getFontSynthesisGVVA2EU());
        }
        return new androidx.compose.ui.text.font.TypefaceResult.Immutable(mo4103createDefaultFO1MlWM, false, 2, null);
    }
}
