package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R \u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getStyle-_-LCdwA", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceFont implements androidx.compose.ui.text.font.Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final androidx.compose.ui.text.font.FontVariation.Settings variationSettings;
    private final androidx.compose.ui.text.font.FontWeight weight;

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m8185getLoadingStrategyPKNRLFQ$annotations() {
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
        this(i, r2, r3, (i4 & 8) != 0 ? androidx.compose.ui.text.font.FontVariation.INSTANCE.m8175Settings6EWAqTQ(r2, r3, new androidx.compose.ui.text.font.FontVariation.Setting[0]) : settings, (i4 & 16) != 0 ? androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8143getAsyncPKNRLFQ() : i3, null);
        androidx.compose.ui.text.font.FontWeight normal = (i4 & 2) != 0 ? androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal() : fontWeight;
        int m8159getNormal_LCdwA = (i4 & 4) != 0 ? androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA() : i2;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final androidx.compose.ui.text.font.FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public final int getStyle() {
        return this.style;
    }

    public final androidx.compose.ui.text.font.FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.ResourceFont m8184copyRetOiIg$default(androidx.compose.ui.text.font.ResourceFont resourceFont, int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = resourceFont.resId;
        }
        if ((i3 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i3 & 4) != 0) {
            i2 = resourceFont.getStyle();
        }
        return resourceFont.m8187copyRetOiIg(i, fontWeight, i2);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final androidx.compose.ui.text.font.ResourceFont m8187copyRetOiIg(int resId, androidx.compose.ui.text.font.FontWeight weight, int style) {
        return m8183copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.font.ResourceFont m8183copyF3nL8kk$default(androidx.compose.ui.text.font.ResourceFont resourceFont, int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, int i3, androidx.compose.ui.text.font.FontVariation.Settings settings, int i4, java.lang.Object obj) {
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
        return resourceFont.m8186copyF3nL8kk(i, fontWeight2, i5, i6, settings);
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final androidx.compose.ui.text.font.ResourceFont m8186copyF3nL8kk(int resId, androidx.compose.ui.text.font.FontWeight weight, int style, int loadingStrategy, androidx.compose.ui.text.font.FontVariation.Settings variationSettings) {
        return new androidx.compose.ui.text.font.ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.font.ResourceFont)) {
            return false;
        }
        androidx.compose.ui.text.font.ResourceFont resourceFont = (androidx.compose.ui.text.font.ResourceFont) other;
        return this.resId == resourceFont.resId && kotlin.jvm.internal.Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(getStyle(), resourceFont.getStyle()) && kotlin.jvm.internal.Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public final int hashCode() {
        int i = this.resId;
        int hashCode = getWeight().hashCode();
        return (((((((i * 31) + hashCode) * 31) + androidx.compose.ui.text.font.FontStyle.m8153hashCodeimpl(getStyle())) * 31) + androidx.compose.ui.text.font.FontLoadingStrategy.m8140hashCodeimpl(getLoadingStrategy())) * 31) + this.variationSettings.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceFont(resId=");
        sb.append(this.resId);
        sb.append(", weight=");
        sb.append(getWeight());
        sb.append(", style=");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m8154toStringimpl(getStyle()));
        sb.append(", loadingStrategy=");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.FontLoadingStrategy.m8141toStringimpl(getLoadingStrategy()));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ResourceFont(int i, androidx.compose.ui.text.font.FontWeight fontWeight, int i2, androidx.compose.ui.text.font.FontVariation.Settings settings, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, fontWeight, i2, settings, i3);
    }
}
