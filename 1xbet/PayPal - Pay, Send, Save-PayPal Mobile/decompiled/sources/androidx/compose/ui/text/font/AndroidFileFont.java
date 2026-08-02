package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Ljava/io/File;", "file", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "cacheKey", "Ljava/lang/String;", "getCacheKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidFileFont extends androidx.compose.ui.text.font.AndroidPreloadedFont {
    public static final int $stable = 0;
    private final java.lang.String cacheKey;
    private final java.io.File file;

    private AndroidFileFont(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.file = file;
        setTypeface$ui_text(doLoad$ui_text(null));
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public /* synthetic */ AndroidFileFont(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal() : fontWeight, (i2 & 4) != 0 ? androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA() : i, settings, null);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public final android.graphics.Typeface doLoad$ui_text(android.content.Context context) {
        return androidx.compose.ui.text.font.TypefaceBuilderCompat.INSTANCE.Camera2StreamConfigurationMap(this.file, context, getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public final java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Font(file=");
        sb.append(this.file);
        sb.append(", weight=");
        sb.append(getGetHighSpeedVideoFpsRanges());
        sb.append(", style=");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m8154toStringimpl(getGetHighResolutionOutputSizeshNQ4ISI()));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ AndroidFileFont(java.io.File file, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i, settings);
    }
}
