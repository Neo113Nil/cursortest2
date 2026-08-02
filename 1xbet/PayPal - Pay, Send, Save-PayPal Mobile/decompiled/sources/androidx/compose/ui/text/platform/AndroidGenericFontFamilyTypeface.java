package androidx.compose.ui.text.platform;

@kotlin.Deprecated(message = "This path for preloading loading fonts is not supported.")
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/GenericFontFamily;", "fontFamily", "<init>", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Typeface;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidGenericFontFamilyTypeface implements androidx.compose.ui.text.platform.AndroidTypeface {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.font.FontFamily fontFamily;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.Typeface getHighSpeedVideoFpsRanges;

    public AndroidGenericFontFamilyTypeface(androidx.compose.ui.text.font.GenericFontFamily genericFontFamily) {
        this.fontFamily = genericFontFamily;
        android.graphics.Typeface create = android.graphics.Typeface.create(genericFontFamily.getName(), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(create);
        this.getHighSpeedVideoFpsRanges = create;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public final androidx.compose.ui.text.font.FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public final android.graphics.Typeface mo8282getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int synthesis) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return android.graphics.Typeface.create(this.getHighSpeedVideoFpsRanges, androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m8104getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle));
        }
        return androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE.create(this.getHighSpeedVideoFpsRanges, fontWeight.getWeight(), androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(fontStyle, androidx.compose.ui.text.font.FontStyle.INSTANCE.m8158getItalic_LCdwA()));
    }
}
