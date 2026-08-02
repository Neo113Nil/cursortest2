package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/text/style/BrushStyle;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/ShaderBrush;", "p0", "", "p1", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/ShaderBrush;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/graphics/ShaderBrush;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "()F", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BrushStyle implements androidx.compose.ui.text.style.TextForegroundStyle {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.ShaderBrush getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    public BrushStyle(androidx.compose.ui.graphics.ShaderBrush shaderBrush, float f) {
        this.getHighSpeedVideoFpsRangesFor = shaderBrush;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getAlpha, reason: from getter */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.compose.ui.graphics.ShaderBrush getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long getGetHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BrushStyle(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.ui.text.style.BrushStyle)) {
            return false;
        }
        androidx.compose.ui.text.style.BrushStyle brushStyle = (androidx.compose.ui.text.style.BrushStyle) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, brushStyle.getHighSpeedVideoFpsRangesFor) && java.lang.Float.compare(this.getHighResolutionOutputSizeshNQ4ISI, brushStyle.getHighResolutionOutputSizeshNQ4ISI) == 0;
    }
}
