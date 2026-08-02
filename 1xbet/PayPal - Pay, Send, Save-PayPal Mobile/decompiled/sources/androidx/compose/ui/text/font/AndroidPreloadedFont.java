package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u0082\u0001\u0003%&'"}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/FontWeight;", "p0", "Landroidx/compose/ui/text/font/FontStyle;", "p1", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p2", "<init>", "(Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)V", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "loadCached$ui_text", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, com.visa.cbp.getEncExpo.warmup, "getStyle-_-LCdwA", "()I", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "", "Camera2StreamConfigurationMap", "Z", "typeface", "Landroid/graphics/Typeface;", "getTypeface$ui_text", "()Landroid/graphics/Typeface;", "setTypeface$ui_text", "(Landroid/graphics/Typeface;)V", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AndroidPreloadedFont extends androidx.compose.ui.text.font.AndroidFont {
    public static final int $stable = 0;
    private boolean Camera2StreamConfigurationMap;
    private final int style;
    private android.graphics.Typeface typeface;
    private final androidx.compose.ui.text.font.FontWeight weight;

    public abstract android.graphics.Typeface doLoad$ui_text(android.content.Context context);

    public abstract java.lang.String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    public final androidx.compose.ui.text.font.FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name and from getter */
    public final int getStyle() {
        return this.style;
    }

    private AndroidPreloadedFont(androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        super(androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ(), androidx.compose.ui.text.font.AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i;
    }

    /* renamed from: getTypeface$ui_text, reason: from getter */
    public final android.graphics.Typeface getTypeface() {
        return this.typeface;
    }

    public final void setTypeface$ui_text(android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    public final android.graphics.Typeface loadCached$ui_text(android.content.Context context) {
        if (!this.Camera2StreamConfigurationMap && this.typeface == null) {
            this.typeface = doLoad$ui_text(context);
        }
        this.Camera2StreamConfigurationMap = true;
        return this.typeface;
    }

    public /* synthetic */ AndroidPreloadedFont(androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fontWeight, i, settings);
    }
}
