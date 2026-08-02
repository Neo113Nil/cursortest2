package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R\u001a\u0010\"\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/res/AssetManager;", "assetManager", "", "path", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "Ljava/lang/String;", "getPath", "cacheKey", "getCacheKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAssetFont extends androidx.compose.ui.text.font.AndroidPreloadedFont {
    public static final int $stable = 0;
    private final android.content.res.AssetManager assetManager;
    private final java.lang.String cacheKey;
    private final java.lang.String path;

    private AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text(doLoad$ui_text(null));
        this.cacheKey = "asset:".concat(java.lang.String.valueOf(str));
    }

    public final android.content.res.AssetManager getAssetManager() {
        return this.assetManager;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public /* synthetic */ AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i2 & 4) != 0 ? androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal() : fontWeight, (i2 & 8) != 0 ? androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA() : i, settings, null);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public final android.graphics.Typeface doLoad$ui_text(android.content.Context context) {
        return androidx.compose.ui.text.font.TypefaceBuilderCompat.INSTANCE.getHighResolutionOutputSizeshNQ4ISI(this.assetManager, this.path, context, getVariationSettings());
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public final java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Font(assetManager, path=");
        sb.append(this.path);
        sb.append(", weight=");
        sb.append(getGetHighSpeedVideoFpsRanges());
        sb.append(", style=");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m8154toStringimpl(getGetHighResolutionOutputSizeshNQ4ISI()));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.font.AndroidAssetFont)) {
            return false;
        }
        androidx.compose.ui.text.font.AndroidAssetFont androidAssetFont = (androidx.compose.ui.text.font.AndroidAssetFont) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, androidAssetFont.path) && kotlin.jvm.internal.Intrinsics.areEqual(getVariationSettings(), androidAssetFont.getVariationSettings());
    }

    public final int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    public /* synthetic */ AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i, settings);
    }
}
