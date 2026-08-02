package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy;", "", "Landroidx/compose/ui/geometry/Rect;", "textBounds", "rect", "", "isIncluded", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextInclusionStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.TextInclusionStrategy.Companion INSTANCE = androidx.compose.ui.text.TextInclusionStrategy.Companion.Camera2StreamConfigurationMap;

    boolean isIncluded(androidx.compose.ui.geometry.Rect textBounds, androidx.compose.ui.geometry.Rect rect);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextInclusionStrategy;", "AnyOverlap", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getAnyOverlap", "()Landroidx/compose/ui/text/TextInclusionStrategy;", "ContainsAll", "getContainsAll", "ContainsCenter", "getContainsCenter"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.TextInclusionStrategy.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.text.TextInclusionStrategy.Companion();
        private static final androidx.compose.ui.text.TextInclusionStrategy AnyOverlap = new androidx.compose.ui.text.TextInclusionStrategy() { // from class: androidx.compose.ui.text.TextInclusionStrategy$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
                boolean overlaps;
                overlaps = rect.overlaps(rect2);
                return overlaps;
            }
        };
        private static final androidx.compose.ui.text.TextInclusionStrategy ContainsAll = new androidx.compose.ui.text.TextInclusionStrategy() { // from class: androidx.compose.ui.text.TextInclusionStrategy$Companion$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
                return androidx.compose.ui.text.TextInclusionStrategy.Companion.$r8$lambda$KLUglSIfRlmIAl3gbMulFwcpk84(rect, rect2);
            }
        };
        private static final androidx.compose.ui.text.TextInclusionStrategy ContainsCenter = new androidx.compose.ui.text.TextInclusionStrategy() { // from class: androidx.compose.ui.text.TextInclusionStrategy$Companion$$ExternalSyntheticLambda2
            @Override // androidx.compose.ui.text.TextInclusionStrategy
            public final boolean isIncluded(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
                boolean m5778containsk4lQ0M;
                m5778containsk4lQ0M = rect2.m5778containsk4lQ0M(rect.m5782getCenterF1C5BW0());
                return m5778containsk4lQ0M;
            }
        };

        private Companion() {
        }

        public final androidx.compose.ui.text.TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final androidx.compose.ui.text.TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        public final androidx.compose.ui.text.TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }

        public static /* synthetic */ boolean $r8$lambda$KLUglSIfRlmIAl3gbMulFwcpk84(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }
    }
}
