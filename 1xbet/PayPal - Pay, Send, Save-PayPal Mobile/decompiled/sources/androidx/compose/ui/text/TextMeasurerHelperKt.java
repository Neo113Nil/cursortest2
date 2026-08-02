package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DefaultCacheSize", "", "rememberTextMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "cacheSize", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextMeasurer;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextMeasurerHelperKt {
    private static final int Camera2StreamConfigurationMap = 8;

    public static final androidx.compose.ui.text.TextMeasurer rememberTextMeasurer(int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = Camera2StreamConfigurationMap;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1538166871, i2, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        androidx.compose.ui.text.font.FontFamily.Resolver resolver = (androidx.compose.ui.text.font.FontFamily.Resolver) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver());
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = composer.changed(resolver);
        boolean changed2 = composer.changed(density);
        boolean changed3 = composer.changed(layoutDirection.ordinal());
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(i)) && (i2 & 6) != 4) {
            z = false;
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.ui.text.TextMeasurer(resolver, density, layoutDirection, i);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.text.TextMeasurer textMeasurer = (androidx.compose.ui.text.TextMeasurer) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return textMeasurer;
    }
}
