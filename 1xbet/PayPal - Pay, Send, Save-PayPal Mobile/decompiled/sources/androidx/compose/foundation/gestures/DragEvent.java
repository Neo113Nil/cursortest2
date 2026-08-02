package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "<init>", "()V", "DragStarted", "DragStopped", "DragCancelled", "DragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getStartPoint-F1C5BW0", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DragStarted extends androidx.compose.foundation.gestures.DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        private DragStarted(long j) {
            super(null);
            this.startPoint = j;
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name and from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }

        public /* synthetic */ DragStarted(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    private DragEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\f"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "", "isIndirectPointerEvent", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getVelocity-9UxMQ8M", "()J", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DragStopped extends androidx.compose.foundation.gestures.DragEvent {
        public static final int $stable = 0;
        private final boolean isIndirectPointerEvent;
        private final long velocity;

        private DragStopped(long j, boolean z) {
            super(null);
            this.velocity = j;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name and from getter */
        public final long getVelocity() {
            return this.velocity;
        }

        /* renamed from: isIndirectPointerEvent, reason: from getter */
        public final boolean getIsIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragStopped(long j, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DragCancelled extends androidx.compose.foundation.gestures.DragEvent {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.DragEvent.DragCancelled INSTANCE = new androidx.compose.foundation.gestures.DragEvent.DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\f"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "delta", "", "isIndirectPointerEvent", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getDelta-F1C5BW0", "()J", "Z", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DragDelta extends androidx.compose.foundation.gestures.DragEvent {
        public static final int $stable = 0;
        private final long delta;
        private final boolean isIndirectPointerEvent;

        private DragDelta(long j, boolean z) {
            super(null);
            this.delta = j;
            this.isIndirectPointerEvent = z;
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name and from getter */
        public final long getDelta() {
            return this.delta;
        }

        /* renamed from: isIndirectPointerEvent, reason: from getter */
        public final boolean getIsIndirectPointerEvent() {
            return this.isIndirectPointerEvent;
        }

        public /* synthetic */ DragDelta(long j, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, z);
        }
    }

    public /* synthetic */ DragEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
