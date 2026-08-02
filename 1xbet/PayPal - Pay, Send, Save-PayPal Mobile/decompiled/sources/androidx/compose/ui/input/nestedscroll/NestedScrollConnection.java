package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m7106onPreScrollOzD1aCk(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.super.mo1754onPreScrollOzD1aCk(j, i);
        }

        @java.lang.Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m7104onPostScrollDzOQY0M(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.super.mo1529onPostScrollDzOQY0M(j, j2, i);
        }

        @java.lang.Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static java.lang.Object m7105onPreFlingQWom1Mo(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.super.mo1753onPreFlingQWom1Mo(j, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static java.lang.Object m7103onPostFlingRZ2iAVY(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.super.mo1528onPostFlingRZ2iAVY(j, j2, continuation);
        }
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo1754onPreScrollOzD1aCk(long available, int source) {
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m7102onPreFlingQWom1Mo$suspendImpl(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ java.lang.Object m7101onPostFlingRZ2iAVY$suspendImpl(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo */
    default java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return m7102onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return m7101onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
    }
}
