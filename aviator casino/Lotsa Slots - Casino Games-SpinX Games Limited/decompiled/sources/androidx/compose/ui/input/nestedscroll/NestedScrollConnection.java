package androidx.compose.ui.input.nestedscroll;

/* compiled from: NestedScrollModifier.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NestedScrollConnection {
    /* renamed from: onPostFling-RZ2iAVY */
    java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo402onPostScrollDzOQY0M(long consumed, long available, int source);

    /* renamed from: onPreFling-QWom1Mo */
    java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo404onPreScrollOzD1aCk(long available, int source);

    /* compiled from: NestedScrollModifier.kt */
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m3145$default$onPreScrollOzD1aCk(androidx.compose.ui.input.nestedscroll.NestedScrollConnection _this, long j, int i) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }

        /* renamed from: $default$onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m3143$default$onPostScrollDzOQY0M(androidx.compose.ui.input.nestedscroll.NestedScrollConnection _this, long j, long j2, int i) {
            return androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        }

        /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m3151onPreFlingQWom1Mo$suspendImpl(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
        }

        /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m3150onPostFlingRZ2iAVY$suspendImpl(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
        }
    }

    /* compiled from: NestedScrollModifier.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m3155onPreScrollOzD1aCk(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3145$default$onPreScrollOzD1aCk(nestedScrollConnection, j, i);
        }

        @java.lang.Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m3153onPostScrollDzOQY0M(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3143$default$onPostScrollDzOQY0M(nestedScrollConnection, j, j2, i);
        }

        @java.lang.Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static java.lang.Object m3154onPreFlingQWom1Mo(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3151onPreFlingQWom1Mo$suspendImpl(nestedScrollConnection, j, continuation);
        }

        @java.lang.Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static java.lang.Object m3152onPostFlingRZ2iAVY(androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3150onPostFlingRZ2iAVY$suspendImpl(nestedScrollConnection, j, j2, continuation);
        }
    }
}
