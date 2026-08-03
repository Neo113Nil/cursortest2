package androidx.compose.ui.text.input;

/* compiled from: EditingBuffer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4127updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m3960getLengthimpl;
        int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(j);
        int m3961getMaximpl = androidx.compose.ui.text.TextRange.m3961getMaximpl(j);
        if (androidx.compose.ui.text.TextRange.m3966intersects5zctL8(j2, j)) {
            if (androidx.compose.ui.text.TextRange.m3954contains5zctL8(j2, j)) {
                m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(j2);
                m3961getMaximpl = m3962getMinimpl;
            } else {
                if (androidx.compose.ui.text.TextRange.m3954contains5zctL8(j, j2)) {
                    m3960getLengthimpl = androidx.compose.ui.text.TextRange.m3960getLengthimpl(j2);
                } else if (androidx.compose.ui.text.TextRange.m3955containsimpl(j2, m3962getMinimpl)) {
                    m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(j2);
                    m3960getLengthimpl = androidx.compose.ui.text.TextRange.m3960getLengthimpl(j2);
                } else {
                    m3961getMaximpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(j2);
                }
                m3961getMaximpl -= m3960getLengthimpl;
            }
        } else if (m3961getMaximpl > androidx.compose.ui.text.TextRange.m3962getMinimpl(j2)) {
            m3962getMinimpl -= androidx.compose.ui.text.TextRange.m3960getLengthimpl(j2);
            m3960getLengthimpl = androidx.compose.ui.text.TextRange.m3960getLengthimpl(j2);
            m3961getMaximpl -= m3960getLengthimpl;
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(m3962getMinimpl, m3961getMaximpl);
    }
}
