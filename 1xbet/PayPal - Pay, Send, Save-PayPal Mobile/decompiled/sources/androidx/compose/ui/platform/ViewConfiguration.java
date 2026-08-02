package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0018\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/ViewConfiguration;", "", "", "getLongPressTimeoutMillis", "()J", "longPressTimeoutMillis", "getDoubleTapTimeoutMillis", "doubleTapTimeoutMillis", "getDoubleTapMinTimeMillis", "doubleTapMinTimeMillis", "", "getTouchSlop", "()F", "touchSlop", "getHandwritingSlop", "handwritingSlop", "Landroidx/compose/ui/unit/DpSize;", "getMinimumTouchTargetSize-MYxV2XQ", "minimumTouchTargetSize", "getMaximumFlingVelocity", "maximumFlingVelocity", "getMinimumFlingVelocity", "minimumFlingVelocity", "getHandwritingGestureLineMargin", "handwritingGestureLineMargin"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewConfiguration {
    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    default float getMinimumFlingVelocity() {
        return 0.0f;
    }

    float getTouchSlop();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static float getHandwritingSlop(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
            return androidx.compose.ui.platform.ViewConfiguration.super.getHandwritingSlop();
        }

        @java.lang.Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m7780getMinimumTouchTargetSizeMYxV2XQ(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
            return androidx.compose.ui.platform.ViewConfiguration.super.mo7564getMinimumTouchTargetSizeMYxV2XQ();
        }

        @java.lang.Deprecated
        public static float getMaximumFlingVelocity(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
            return androidx.compose.ui.platform.ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @java.lang.Deprecated
        public static float getMinimumFlingVelocity(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
            return androidx.compose.ui.platform.ViewConfiguration.super.getMinimumFlingVelocity();
        }

        @java.lang.Deprecated
        public static float getHandwritingGestureLineMargin(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
            return androidx.compose.ui.platform.ViewConfiguration.super.getHandwritingGestureLineMargin();
        }
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo7564getMinimumTouchTargetSizeMYxV2XQ() {
        return androidx.compose.ui.unit.DpKt.m8623DpSizeYgX7TsA(androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f));
    }
}
