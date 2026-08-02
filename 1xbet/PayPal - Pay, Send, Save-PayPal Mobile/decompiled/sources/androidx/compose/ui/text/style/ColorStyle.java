package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/style/ColorStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "p0", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "getColor-0d7_KjU", "()J", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "Camera2StreamConfigurationMap", "", "getAlpha", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ColorStyle implements androidx.compose.ui.text.style.TextForegroundStyle {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final androidx.compose.ui.graphics.Brush getBrush() {
        return null;
    }

    private ColorStyle(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        if (j != 16) {
            return;
        }
        androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: from getter */
    public final long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float getAlpha() {
        return androidx.compose.ui.graphics.Color.m5998getAlphaimpl(getGetHighResolutionOutputSizeshNQ4ISI());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorStyle(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof androidx.compose.ui.text.style.ColorStyle) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.ui.text.style.ColorStyle) p0).getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ ColorStyle(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }
}
