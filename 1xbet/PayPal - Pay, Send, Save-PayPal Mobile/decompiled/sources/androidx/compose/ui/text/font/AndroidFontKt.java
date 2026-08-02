package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0014"}, d2 = {"", "path", "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font", "Ljava/io/File;", "file", "Font-Ej4NQ78", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFontKt {
    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8103FontMuC2MFs$default(java.lang.String str, android.content.res.AssetManager assetManager, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m8175Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m8102FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8102FontMuC2MFs(java.lang.String str, android.content.res.AssetManager assetManager, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidAssetFont(assetManager, str, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8101FontEj4NQ78$default(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m8175Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m8099FontEj4NQ78(file, fontWeight, i, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8099FontEj4NQ78(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidFileFont(file, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.Font m8100FontEj4NQ78$default(android.os.ParcelFileDescriptor parcelFileDescriptor, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = androidx.compose.ui.text.font.FontVariation.INSTANCE.m8175Settings6EWAqTQ(fontWeight, i, new androidx.compose.ui.text.font.FontVariation.Setting[0]);
        }
        return m8098FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final androidx.compose.ui.text.font.Font m8098FontEj4NQ78(android.os.ParcelFileDescriptor parcelFileDescriptor, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        return new androidx.compose.ui.text.font.AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, null);
    }
}
