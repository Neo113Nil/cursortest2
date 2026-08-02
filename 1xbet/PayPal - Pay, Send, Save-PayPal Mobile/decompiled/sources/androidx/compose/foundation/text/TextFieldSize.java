package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00018\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R$\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/text/TextFieldSize;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "p0", "Landroidx/compose/ui/unit/Density;", "p1", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p2", "Landroidx/compose/ui/text/TextStyle;", "p3", "p4", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/TextStyle;Ljava/lang/Object;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/IntSize;", "()J", "Landroidx/compose/ui/unit/LayoutDirection;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/text/TextStyle;", "Ljava/lang/Object;", "getOutputFormats", "J", "getInputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextFieldSize {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public androidx.compose.ui.unit.LayoutDirection Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public androidx.compose.ui.text.font.FontFamily.Resolver getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public androidx.compose.ui.text.TextStyle getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private long getInputFormats = getHighResolutionOutputSizeshNQ4ISI();

    public TextFieldSize(androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.TextStyle textStyle, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = layoutDirection;
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getHighSpeedVideoFpsRangesFor = resolver;
        this.getHighSpeedVideoSizes = textStyle;
        this.getHighSpeedVideoFpsRanges = obj;
    }

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
    public final long getGetInputFormats() {
        return this.getInputFormats;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.LayoutDirection p0, androidx.compose.ui.unit.Density p1, androidx.compose.ui.text.font.FontFamily.Resolver p2, androidx.compose.ui.text.TextStyle p3, java.lang.Object p4) {
        if (p0 == this.Camera2StreamConfigurationMap && kotlin.jvm.internal.Intrinsics.areEqual(p1, this.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(p2, this.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(p3, this.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(p4, this.getHighSpeedVideoFpsRanges)) {
            return;
        }
        this.Camera2StreamConfigurationMap = p0;
        this.getHighResolutionOutputSizeshNQ4ISI = p1;
        this.getHighSpeedVideoFpsRangesFor = p2;
        this.getHighSpeedVideoSizes = p3;
        this.getHighSpeedVideoFpsRanges = p4;
        this.getInputFormats = getHighResolutionOutputSizeshNQ4ISI();
    }

    private final long getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.foundation.text.TextFieldDelegateKt.computeSizeForDefaultText$default(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null, 0, 24, null);
    }
}
