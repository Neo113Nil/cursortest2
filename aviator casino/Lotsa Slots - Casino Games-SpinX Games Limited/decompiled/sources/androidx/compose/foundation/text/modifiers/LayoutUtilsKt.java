package androidx.compose.foundation.text.modifiers;

/* compiled from: LayoutUtils.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a*\u0010\u0010\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0017\u001a\u00020\u0006*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"BigConstraintValue", "", "MediumConstraintValue", "SmallConstraintValue", "TinyConstraintValue", "finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "fixedCoerceHeightAndWidthForBits", "Landroidx/compose/ui/unit/Constraints$Companion;", "width", "height", "(Landroidx/compose/ui/unit/Constraints$Companion;II)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    private static final int BigConstraintValue = 262143;
    private static final int MediumConstraintValue = 65535;
    private static final int SmallConstraintValue = 32767;
    private static final int TinyConstraintValue = 8191;

    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m970finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, m972finalMaxWidthtfFHcEY(j, z, i, f), 0, androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m972finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m4424getMaxWidthimpl = ((z || androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8())) && androidx.compose.ui.unit.Constraints.m4420getHasBoundedWidthimpl(j)) ? androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j) == m4424getMaxWidthimpl ? m4424getMaxWidthimpl : kotlin.ranges.RangesKt.coerceIn(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(f), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(j), m4424getMaxWidthimpl);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m971finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !androidx.compose.ui.text.style.TextOverflow.m4402equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4410getEllipsisgIe3tQ8())) {
            return kotlin.ranges.RangesKt.coerceAtLeast(i2, 1);
        }
        return 1;
    }

    public static final long fixedCoerceHeightAndWidthForBits(androidx.compose.ui.unit.Constraints.Companion companion, int i, int i2) {
        int min;
        int min2 = java.lang.Math.min(i, 262142);
        if (min2 < TinyConstraintValue) {
            min = java.lang.Math.min(i2, 262142);
        } else if (min2 < 32767) {
            min = java.lang.Math.min(i2, 65534);
        } else if (min2 < 65535) {
            min = java.lang.Math.min(i2, 32766);
        } else {
            min = java.lang.Math.min(i2, 8190);
        }
        return companion.m4432fixedJhjzzOo(min2, min);
    }
}
