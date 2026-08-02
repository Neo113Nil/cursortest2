package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u001a/\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0015\u001a\u00020\u0002*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "constraints", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxIntrinsicWidth", "finalConstraints-tfFHcEY", "(JZIF)J", "finalConstraints", "", "finalMaxWidth-tfFHcEY", "(JZIF)I", "finalMaxWidth", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxLines", "isEllipsis-MW5-ApA", "(I)Z", "isEllipsis"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m2341finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return androidx.compose.ui.unit.Constraints.INSTANCE.m8563fitPrioritizingWidthZbe2FdA(0, m2343finalMaxWidthtfFHcEY(j, z, i, f), 0, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j));
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m2343finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m8554getMaxWidthimpl = ((z || m2344isEllipsisMW5ApA(i)) && androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(j)) ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) : Integer.MAX_VALUE;
        return androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) == m8554getMaxWidthimpl ? m8554getMaxWidthimpl : kotlin.ranges.RangesKt.coerceIn(androidx.compose.foundation.text.TextDelegateKt.ceilToIntPx(f), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j), m8554getMaxWidthimpl);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m2342finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (z || !m2344isEllipsisMW5ApA(i)) {
            return kotlin.ranges.RangesKt.coerceAtLeast(i2, 1);
        }
        return 1;
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m2344isEllipsisMW5ApA(int i) {
        return androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8503getStartEllipsisgIe3tQ8()) || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8502getMiddleEllipsisgIe3tQ8());
    }
}
