package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/SwipeDirection;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeDirection {
    public static final int $stable = 0;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.SwipeDirection.Companion INSTANCE = new androidx.constraintlayout.compose.SwipeDirection.Companion(null);
    private static final androidx.constraintlayout.compose.SwipeDirection Up = new androidx.constraintlayout.compose.SwipeDirection(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP);
    private static final androidx.constraintlayout.compose.SwipeDirection Down = new androidx.constraintlayout.compose.SwipeDirection(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN);
    private static final androidx.constraintlayout.compose.SwipeDirection Left = new androidx.constraintlayout.compose.SwipeDirection(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT);
    private static final androidx.constraintlayout.compose.SwipeDirection Right = new androidx.constraintlayout.compose.SwipeDirection(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT);
    private static final androidx.constraintlayout.compose.SwipeDirection Start = new androidx.constraintlayout.compose.SwipeDirection(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
    private static final androidx.constraintlayout.compose.SwipeDirection End = new androidx.constraintlayout.compose.SwipeDirection("end");
    private static final androidx.constraintlayout.compose.SwipeDirection Clockwise = new androidx.constraintlayout.compose.SwipeDirection("clockwise");
    private static final androidx.constraintlayout.compose.SwipeDirection Counterclockwise = new androidx.constraintlayout.compose.SwipeDirection("anticlockwise");

    public SwipeDirection(java.lang.String str) {
        this.name = str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Landroidx/constraintlayout/compose/SwipeDirection$Companion;", "", "<init>", "()V", "Landroidx/constraintlayout/compose/SwipeDirection;", "Clockwise", "Landroidx/constraintlayout/compose/SwipeDirection;", "getClockwise", "()Landroidx/constraintlayout/compose/SwipeDirection;", "Counterclockwise", "getCounterclockwise", "Down", "getDown", "End", "getEnd", "Left", "getLeft", "Right", "getRight", "Start", "getStart", "Up", "getUp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.constraintlayout.compose.SwipeDirection getUp() {
            return androidx.constraintlayout.compose.SwipeDirection.Up;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getDown() {
            return androidx.constraintlayout.compose.SwipeDirection.Down;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getLeft() {
            return androidx.constraintlayout.compose.SwipeDirection.Left;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getRight() {
            return androidx.constraintlayout.compose.SwipeDirection.Right;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getStart() {
            return androidx.constraintlayout.compose.SwipeDirection.Start;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getEnd() {
            return androidx.constraintlayout.compose.SwipeDirection.End;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getClockwise() {
            return androidx.constraintlayout.compose.SwipeDirection.Clockwise;
        }

        public final androidx.constraintlayout.compose.SwipeDirection getCounterclockwise() {
            return androidx.constraintlayout.compose.SwipeDirection.Counterclockwise;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String getName() {
        return this.name;
    }
}
