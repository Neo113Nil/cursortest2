package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "p0", "Landroidx/compose/ui/text/font/FontWeight;", "p1", "Landroidx/compose/ui/text/font/FontStyle;", "p2", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "p3", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/content/Context;", "Landroid/graphics/Typeface;", "getHighSpeedVideoFpsRanges", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getStyle-_-LCdwA", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeviceFontFamilyNameFont extends androidx.compose.ui.text.font.AndroidFont {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getWeight, reason: from getter */
    public final androidx.compose.ui.text.font.FontWeight getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private DeviceFontFamilyNameFont(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        super(androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8145getOptionalLocalPKNRLFQ(), androidx.compose.ui.text.font.NamedFontLoader.INSTANCE, settings, null);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = fontWeight;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final android.graphics.Typeface getHighSpeedVideoFpsRanges(android.content.Context p0) {
        return androidx.compose.ui.text.font.PlatformTypefaces_androidKt.PlatformTypefaces().mo8182optionalOnDeviceFontFamilyByName78DK7lM(this.getHighSpeedVideoFpsRangesFor, getGetHighSpeedVideoFpsRanges(), getGetHighResolutionOutputSizeshNQ4ISI(), getVariationSettings(), p0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.text.font.DeviceFontFamilyNameFont)) {
            return false;
        }
        androidx.compose.ui.text.font.DeviceFontFamilyNameFont deviceFontFamilyNameFont = (androidx.compose.ui.text.font.DeviceFontFamilyNameFont) p0;
        return androidx.compose.ui.text.font.DeviceFontFamilyName.m8118equalsimpl0(this.getHighSpeedVideoFpsRangesFor, deviceFontFamilyNameFont.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), deviceFontFamilyNameFont.getGetHighSpeedVideoFpsRanges()) && androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(getGetHighResolutionOutputSizeshNQ4ISI(), deviceFontFamilyNameFont.getGetHighResolutionOutputSizeshNQ4ISI()) && kotlin.jvm.internal.Intrinsics.areEqual(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings());
    }

    public final int hashCode() {
        int m8119hashCodeimpl = androidx.compose.ui.text.font.DeviceFontFamilyName.m8119hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        return (((((m8119hashCodeimpl * 31) + getGetHighSpeedVideoFpsRanges().hashCode()) * 31) + androidx.compose.ui.text.font.FontStyle.m8153hashCodeimpl(getGetHighResolutionOutputSizeshNQ4ISI())) * 31) + getVariationSettings().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Font(familyName=\"");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.DeviceFontFamilyName.m8120toStringimpl(this.getHighSpeedVideoFpsRangesFor));
        sb.append("\", weight=");
        sb.append(getGetHighSpeedVideoFpsRanges());
        sb.append(", style=");
        sb.append((java.lang.Object) androidx.compose.ui.text.font.FontStyle.m8154toStringimpl(getGetHighResolutionOutputSizeshNQ4ISI()));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ DeviceFontFamilyNameFont(java.lang.String str, androidx.compose.ui.text.font.FontWeight fontWeight, int i, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fontWeight, i, settings);
    }
}
