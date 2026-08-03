package androidx.compose.ui.text.font;

/* compiled from: AndroidPreloadedFont.android.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J$\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceBuilderCompat;", "", "()V", "createFromAssets", "Landroid/graphics/Typeface;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", "context", "Landroid/content/Context;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "createFromFile", "file", "Ljava/io/File;", "createFromFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "toVariationSettings", "", "Landroid/graphics/fonts/FontVariationAxis;", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)[Landroid/graphics/fonts/FontVariationAxis;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TypefaceBuilderCompat {
    public static final androidx.compose.ui.text.font.TypefaceBuilderCompat INSTANCE = new androidx.compose.ui.text.font.TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    public final android.graphics.Typeface createFromAssets(android.content.res.AssetManager assetManager, java.lang.String path, android.content.Context context, androidx.compose.ui.text.font.FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(assetManager, path).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    public final android.graphics.Typeface createFromFile(java.io.File file, android.content.Context context, androidx.compose.ui.text.font.FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(file).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    public final android.graphics.Typeface createFromFileDescriptor(android.os.ParcelFileDescriptor fileDescriptor, android.content.Context context, androidx.compose.ui.text.font.FontVariation.Settings variationSettings) {
        if (context == null) {
            return null;
        }
        return new android.graphics.Typeface.Builder(fileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(variationSettings, context)).build();
    }

    private final android.graphics.fonts.FontVariationAxis[] toVariationSettings(androidx.compose.ui.text.font.FontVariation.Settings settings, android.content.Context context) {
        androidx.compose.ui.unit.Density Density;
        if (context != null) {
            Density = androidx.compose.ui.unit.AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity()) {
            Density = androidx.compose.ui.unit.DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new java.lang.IllegalStateException("Required density, but not provided");
        }
        java.util.List<androidx.compose.ui.text.font.FontVariation.Setting> settings2 = settings.getSettings();
        java.util.ArrayList arrayList = new java.util.ArrayList(settings2.size());
        int size = settings2.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.FontVariation.Setting setting = settings2.get(i);
            arrayList.add(new android.graphics.fonts.FontVariationAxis(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (android.graphics.fonts.FontVariationAxis[]) arrayList.toArray(new android.graphics.fonts.FontVariationAxis[0]);
    }
}
