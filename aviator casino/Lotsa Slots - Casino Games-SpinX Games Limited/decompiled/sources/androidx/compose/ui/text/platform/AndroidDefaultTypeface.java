package androidx.compose.ui.text.platform;

/* compiled from: AndroidDefaultTypeface.android.kt */
@kotlin.Deprecated(message = "This path for preloading fonts is not supported")
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "()V", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getNativeTypeface", "Landroid/graphics/Typeface;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDefaultTypeface implements androidx.compose.ui.text.platform.AndroidTypeface {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.font.FontFamily fontFamily = androidx.compose.ui.text.font.FontFamily.INSTANCE.getDefault();

    @Override // androidx.compose.ui.text.font.Typeface
    public androidx.compose.ui.text.font.FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U, reason: not valid java name */
    public android.graphics.Typeface mo4210getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int synthesis) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return android.graphics.Typeface.defaultFromStyle(androidx.compose.ui.text.font.AndroidFontUtils_androidKt.m4029getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle));
        }
        return androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE.create(android.graphics.Typeface.DEFAULT, fontWeight.getWeight(), androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(fontStyle, androidx.compose.ui.text.font.FontStyle.INSTANCE.m4082getItalic_LCdwA()));
    }
}
