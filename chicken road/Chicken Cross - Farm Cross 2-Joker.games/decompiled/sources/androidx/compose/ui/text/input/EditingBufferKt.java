package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3609updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m3482getLengthimpl;
        int m3484getMinimpl = TextRange.m3484getMinimpl(j);
        int m3483getMaximpl = TextRange.m3483getMaximpl(j);
        if (TextRange.m3488intersects5zctL8(j2, j)) {
            if (TextRange.m3476contains5zctL8(j2, j)) {
                m3484getMinimpl = TextRange.m3484getMinimpl(j2);
                m3483getMaximpl = m3484getMinimpl;
            } else {
                if (TextRange.m3476contains5zctL8(j, j2)) {
                    m3482getLengthimpl = TextRange.m3482getLengthimpl(j2);
                } else if (TextRange.m3477containsimpl(j2, m3484getMinimpl)) {
                    m3484getMinimpl = TextRange.m3484getMinimpl(j2);
                    m3482getLengthimpl = TextRange.m3482getLengthimpl(j2);
                } else {
                    m3483getMaximpl = TextRange.m3484getMinimpl(j2);
                }
                m3483getMaximpl -= m3482getLengthimpl;
            }
        } else if (m3483getMaximpl > TextRange.m3484getMinimpl(j2)) {
            m3484getMinimpl -= TextRange.m3482getLengthimpl(j2);
            m3482getLengthimpl = TextRange.m3482getLengthimpl(j2);
            m3483getMaximpl -= m3482getLengthimpl;
        }
        return TextRangeKt.TextRange(m3484getMinimpl, m3483getMaximpl);
    }
}
