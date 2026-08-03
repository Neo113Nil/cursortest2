package androidx.compose.ui.text.font;

/* compiled from: AndroidPreloadedFont.android.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", com.helpshift.proactive.InAppViewConstants.WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAssetManager", "()Landroid/content/res/AssetManager;", "cacheKey", "getCacheKey", "()Ljava/lang/String;", "getPath", "doLoad", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "doLoad$ui_text_release", "equals", "", "other", "", "hashCode", "", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAssetFont extends androidx.compose.ui.text.font.AndroidPreloadedFont {
    public static final int $stable = 0;
    private final android.content.res.AssetManager assetManager;
    private final java.lang.String cacheKey;
    private final java.lang.String path;

    public /* synthetic */ AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, fontWeight, i, settings);
    }

    public final android.content.res.AssetManager getAssetManager() {
        return this.assetManager;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public /* synthetic */ AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i2 & 4) != 0 ? androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal() : fontWeight, (i2 & 8) != 0 ? androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA() : i, settings, null);
    }

    private AndroidAssetFont(android.content.res.AssetManager assetManager, java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        super(fontWeight, i, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + str;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text_release(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.compose.ui.text.font.TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromAsset(this.assetManager, this.path);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    public java.lang.String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m4078toStringimpl(getStyle())) + ')';
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.font.AndroidAssetFont)) {
            return false;
        }
        androidx.compose.ui.text.font.AndroidAssetFont androidAssetFont = (androidx.compose.ui.text.font.AndroidAssetFont) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.path, androidAssetFont.path) && kotlin.jvm.internal.Intrinsics.areEqual(getVariationSettings(), androidAssetFont.getVariationSettings());
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }
}
