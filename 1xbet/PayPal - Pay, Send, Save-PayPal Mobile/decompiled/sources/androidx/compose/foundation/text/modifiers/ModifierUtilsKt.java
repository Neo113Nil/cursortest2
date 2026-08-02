package androidx.compose.foundation.text.modifiers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "maxWidthForTextLayout-R2G3SPE", "(JZI)I", "maxWidthForTextLayout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModifierUtilsKt {
    /* renamed from: maxWidthForTextLayout-R2G3SPE, reason: not valid java name */
    public static final int m2346maxWidthForTextLayoutR2G3SPE(long j, boolean z, int i) {
        if ((z || androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(i, androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8())) && androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(j)) {
            return androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        }
        return Integer.MAX_VALUE;
    }
}
