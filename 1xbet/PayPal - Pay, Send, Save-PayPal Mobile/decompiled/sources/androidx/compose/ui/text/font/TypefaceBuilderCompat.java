package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0017"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "<init>", "()V", "Landroid/content/res/AssetManager;", "p0", "", "p1", "Landroid/content/Context;", "p2", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "Landroid/graphics/Typeface;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Ljava/io/File;", "Camera2StreamConfigurationMap", "(Ljava/io/File;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "Landroid/os/ParcelFileDescriptor;", "getHighSpeedVideoFpsRanges", "(Landroid/os/ParcelFileDescriptor;Landroid/content/Context;Landroidx/compose/ui/text/font/FontVariation$Settings;)Landroid/graphics/Typeface;", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TypefaceBuilderCompat {
    public static final androidx.compose.ui.text.font.TypefaceBuilderCompat INSTANCE = new androidx.compose.ui.text.font.TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    public final android.graphics.Typeface getHighResolutionOutputSizeshNQ4ISI(android.content.res.AssetManager p0, java.lang.String p1, android.content.Context p2, androidx.compose.ui.text.font.FontVariation.Settings p3) {
        if (p2 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0, p1).setFontVariationSettings(getHighSpeedVideoFpsRanges(p3, p2)).build();
    }

    public final android.graphics.Typeface Camera2StreamConfigurationMap(java.io.File p0, android.content.Context p1, androidx.compose.ui.text.font.FontVariation.Settings p2) {
        if (p1 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0).setFontVariationSettings(getHighSpeedVideoFpsRanges(p2, p1)).build();
    }

    public final android.graphics.Typeface getHighSpeedVideoFpsRanges(android.os.ParcelFileDescriptor p0, android.content.Context p1, androidx.compose.ui.text.font.FontVariation.Settings p2) {
        if (p1 == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(p0.getFileDescriptor()).setFontVariationSettings(getHighSpeedVideoFpsRanges(p2, p1)).build();
    }

    private final android.graphics.fonts.FontVariationAxis[] getHighSpeedVideoFpsRanges(androidx.compose.ui.text.font.FontVariation.Settings settings, android.content.Context context) {
        androidx.compose.ui.unit.Density Density;
        if (context != null) {
            Density = androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity()) {
            Density = androidx.compose.ui.unit.DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new java.lang.IllegalStateException("Required density, but not provided");
        }
        return androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt.toAndroidArray(settings, Density, androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt.getFontWeightAdjustment(context));
    }
}
