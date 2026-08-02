package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/TextRange;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.DELETED, "updateRangeAfterDelete-pWDy79M", "(JJ)J", "updateRangeAfterDelete"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m8197updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m8035getLengthimpl;
        int m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j);
        int m8036getMaximpl = androidx.compose.ui.text.TextRange.m8036getMaximpl(j);
        if (androidx.compose.ui.text.TextRange.m8041intersects5zctL8(j2, j)) {
            if (androidx.compose.ui.text.TextRange.m8029contains5zctL8(j2, j)) {
                m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j2);
                m8036getMaximpl = m8037getMinimpl;
            } else {
                if (androidx.compose.ui.text.TextRange.m8029contains5zctL8(j, j2)) {
                    m8035getLengthimpl = androidx.compose.ui.text.TextRange.m8035getLengthimpl(j2);
                } else if (androidx.compose.ui.text.TextRange.m8030containsimpl(j2, m8037getMinimpl)) {
                    m8037getMinimpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j2);
                    m8035getLengthimpl = androidx.compose.ui.text.TextRange.m8035getLengthimpl(j2);
                } else {
                    m8036getMaximpl = androidx.compose.ui.text.TextRange.m8037getMinimpl(j2);
                }
                m8036getMaximpl -= m8035getLengthimpl;
            }
        } else if (m8036getMaximpl > androidx.compose.ui.text.TextRange.m8037getMinimpl(j2)) {
            m8037getMinimpl -= androidx.compose.ui.text.TextRange.m8035getLengthimpl(j2);
            m8035getLengthimpl = androidx.compose.ui.text.TextRange.m8035getLengthimpl(j2);
            m8036getMaximpl -= m8035getLengthimpl;
        }
        return androidx.compose.ui.text.TextRangeKt.TextRange(m8037getMinimpl, m8036getMaximpl);
    }
}
