package androidx.core.graphics;

/* loaded from: classes3.dex */
public class TypefaceCompatApi31Impl extends androidx.core.graphics.TypefaceCompatApi29Impl {
    private static android.graphics.Typeface getHighSpeedVideoSizes(java.lang.String str) {
        android.graphics.Typeface create = android.graphics.Typeface.create(str, 0);
        android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi29Impl
    protected android.graphics.fonts.Font getFontFromSystemFont(androidx.core.provider.FontsContractCompat.FontInfo fontInfo) {
        android.graphics.Typeface highSpeedVideoSizes;
        android.graphics.fonts.Font guessPrimaryFont;
        java.lang.String systemFont = fontInfo.getSystemFont();
        if (systemFont == null || (highSpeedVideoSizes = getHighSpeedVideoSizes(systemFont)) == null || (guessPrimaryFont = androidx.core.graphics.TypefaceCompat.guessPrimaryFont(highSpeedVideoSizes)) == null) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(fontInfo.getVariationSettings())) {
            return guessPrimaryFont;
        }
        try {
            return new android.graphics.fonts.Font.Builder(guessPrimaryFont).setFontVariationSettings(fontInfo.getVariationSettings()).build();
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
