package androidx.compose.ui.text.font;

/* compiled from: Font.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0016R$\u0010\n\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", com.helpshift.proactive.InAppViewConstants.WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getResId", "getStyle-_-LCdwA", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceFont implements androidx.compose.ui.text.font.Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final androidx.compose.ui.text.font.FontVariation.Settings variationSettings;
    private final androidx.compose.ui.text.font.FontWeight weight;

    public /* synthetic */ ResourceFont(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, androidx.compose.ui.text.font.FontVariation.Settings settings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, settings, i3);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m4114getLoadingStrategyPKNRLFQ$annotations() {
    }

    private ResourceFont(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, androidx.compose.ui.text.font.FontVariation.Settings settings, int i3) {
        this.resId = i;
        this.weight = fontWeight;
        this.style = i2;
        this.variationSettings = settings;
        this.loadingStrategy = i3;
    }

    public final int getResId() {
        return this.resId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ResourceFont(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, androidx.compose.ui.text.font.FontVariation.Settings settings, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, r2, r3, (i4 & 8) != 0 ? androidx.compose.ui.text.font.FontVariation.INSTANCE.m4098Settings6EWAqTQ(r2, r3, new androidx.compose.ui.text.font.FontVariation.Setting[0]) : settings, (i4 & 16) != 0 ? androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4067getAsyncPKNRLFQ() : i3, null);
        androidx.compose.ui.text.font.FontWeight normal = (i4 & 2) != 0 ? androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal() : fontWeight;
        int m4083getNormal_LCdwA = (i4 & 4) != 0 ? androidx.compose.ui.text.font.FontStyle.INSTANCE.m4083getNormal_LCdwA() : i2;
    }

    @Override // androidx.compose.ui.text.font.Font
    public androidx.compose.ui.text.font.FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public final androidx.compose.ui.text.font.FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.ResourceFont m4113copyRetOiIg$default(androidx.compose.ui.text.font.ResourceFont resourceFont, int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.getStyle();
        }
        return resourceFont.m4116copyRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final androidx.compose.ui.text.font.ResourceFont m4116copyRetOiIg(int resId, androidx.compose.ui.text.font.FontWeight weight, int style) {
        return m4112copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.ResourceFont m4112copyF3nL8kk$default(androidx.compose.ui.text.font.ResourceFont resourceFont, int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        androidx.compose.ui.text.font.FontWeight fontWeight2 = fontWeight;
        if ((i4 & 4) != 0) {
            i2 = resourceFont.getStyle();
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = resourceFont.getLoadingStrategy();
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m4115copyF3nL8kk(i, fontWeight2, i5, i6, settings);
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final androidx.compose.ui.text.font.ResourceFont m4115copyF3nL8kk(int resId, androidx.compose.ui.text.font.FontWeight weight, int style, int loadingStrategy, androidx.compose.ui.text.font.FontVariation.Settings variationSettings) {
        return new androidx.compose.ui.text.font.ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.font.ResourceFont)) {
            return false;
        }
        androidx.compose.ui.text.font.ResourceFont resourceFont = (androidx.compose.ui.text.font.ResourceFont) other;
        return this.resId == resourceFont.resId && kotlin.jvm.internal.Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(getStyle(), resourceFont.getStyle()) && kotlin.jvm.internal.Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public int hashCode() {
        return (((((((this.resId * 31) + getWeight().hashCode()) * 31) + androidx.compose.ui.text.font.FontStyle.m4077hashCodeimpl(getStyle())) * 31) + androidx.compose.ui.text.font.FontLoadingStrategy.m4064hashCodeimpl(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    public java.lang.String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m4078toStringimpl(getStyle())) + ", loadingStrategy=" + ((java.lang.Object) androidx.compose.ui.text.font.FontLoadingStrategy.m4065toStringimpl(getLoadingStrategy())) + ')';
    }
}
