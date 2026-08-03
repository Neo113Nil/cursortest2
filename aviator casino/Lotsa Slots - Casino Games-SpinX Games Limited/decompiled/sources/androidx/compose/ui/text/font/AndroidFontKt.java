package androidx.compose.ui.text.font;

/* compiled from: AndroidFont.android.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\b\u0010\u0015\u001a\u00020\u0016H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", com.helpshift.proactive.InAppViewConstants.WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-Ej4NQ78", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "file", "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "path", "", "assetManager", "Landroid/content/res/AssetManager;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "generateAndroidFontKtForApiCompatibility", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontKt {
    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4026FontMuC2MFs$default(java.lang.String str, android.content.res.AssetManager assetManager, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m4098Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m4025FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4025FontMuC2MFs(java.lang.String str, android.content.res.AssetManager assetManager, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidAssetFont(assetManager, str, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4024FontEj4NQ78$default(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m4098Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m4022FontEj4NQ78(file, fontWeight, i, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4022FontEj4NQ78(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidFileFont(file, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m4023FontEj4NQ78$default(android.os.ParcelFileDescriptor parcelFileDescriptor, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m4098Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m4021FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m4021FontEj4NQ78(android.os.ParcelFileDescriptor parcelFileDescriptor, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, null);
    }
}
