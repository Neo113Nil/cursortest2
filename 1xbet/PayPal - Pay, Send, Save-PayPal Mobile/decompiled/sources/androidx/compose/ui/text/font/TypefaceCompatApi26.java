package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "<init>", "()V", "Landroid/graphics/Typeface;", "p0", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p1", "Landroid/content/Context;", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "getHighSpeedVideoFpsRanges", "Ljava/lang/ThreadLocal;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TypefaceCompatApi26 {
    public static final androidx.compose.ui.text.font.TypefaceCompatApi26 INSTANCE = new androidx.compose.ui.text.font.TypefaceCompatApi26();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static java.lang.ThreadLocal<android.graphics.Paint> Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    public final android.graphics.Typeface getHighSpeedVideoFpsRangesFor(android.graphics.Typeface p0, androidx.compose.ui.text.font.FontVariation.Settings p1, android.content.Context p2) {
        if (p0 == null) {
            return null;
        }
        if (p1.getSettings().isEmpty()) {
            return p0;
        }
        android.graphics.Paint paint = Camera2StreamConfigurationMap.get();
        if (paint == null) {
            paint = new android.graphics.Paint();
            Camera2StreamConfigurationMap.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(p0);
        paint.setFontVariationSettings(androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt.toAndroidString(p1, p2));
        return paint.getTypeface();
    }
}
