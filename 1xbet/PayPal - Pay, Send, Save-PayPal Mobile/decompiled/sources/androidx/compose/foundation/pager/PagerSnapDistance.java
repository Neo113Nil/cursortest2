package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "calculateTargetPage", "(IIFII)I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PagerSnapDistance {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.pager.PagerSnapDistance.Companion INSTANCE = androidx.compose.foundation.pager.PagerSnapDistance.Companion.getHighSpeedVideoFpsRangesFor;

    int calculateTargetPage(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance$Companion;", "", "<init>", "()V", "", "pages", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "atMost", "(I)Landroidx/compose/foundation/pager/PagerSnapDistance;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.pager.PagerSnapDistance.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.pager.PagerSnapDistance.Companion();

        private Companion() {
        }

        public final androidx.compose.foundation.pager.PagerSnapDistance atMost(int pages) {
            if (pages < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("pages should be greater than or equal to 0. You have used ");
                sb.append(pages);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return new androidx.compose.foundation.pager.PagerSnapDistanceMaxPages(pages);
        }
    }
}
