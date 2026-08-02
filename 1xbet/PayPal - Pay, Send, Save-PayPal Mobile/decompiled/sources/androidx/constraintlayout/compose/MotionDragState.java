package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0007ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010\u000bR\u001d\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState;", "", "", "isDragging", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Landroidx/compose/ui/unit/Velocity;", "velocity", "<init>", "(ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2-F1C5BW0", "()J", "component2", "component3-9UxMQ8M", "component3", "copy-dhPbTwU", "(ZJJ)Landroidx/constraintlayout/compose/MotionDragState;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDragAmount-F1C5BW0", "Z", "getVelocity-9UxMQ8M", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MotionDragState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.constraintlayout.compose.MotionDragState.Companion INSTANCE = new androidx.constraintlayout.compose.MotionDragState.Companion(null);
    private final long dragAmount;
    private final boolean isDragging;
    private final long velocity;

    private MotionDragState(boolean z, long j, long j2) {
        this.isDragging = z;
        this.dragAmount = j;
        this.velocity = j2;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    /* renamed from: getDragAmount-F1C5BW0, reason: not valid java name */
    public final long m8990getDragAmountF1C5BW0() {
        return this.dragAmount;
    }

    /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
    public final long m8991getVelocity9UxMQ8M() {
        return this.velocity;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/MotionDragState$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Landroidx/constraintlayout/compose/MotionDragState;", "onDrag-k-4lQ0M", "(J)Landroidx/constraintlayout/compose/MotionDragState;", "onDrag", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragEnd-TH1AsA0", "onDragEnd"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
        public final androidx.constraintlayout.compose.MotionDragState m8992onDragk4lQ0M(long dragAmount) {
            return new androidx.constraintlayout.compose.MotionDragState(true, dragAmount, androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), null);
        }

        /* renamed from: onDragEnd-TH1AsA0, reason: not valid java name */
        public final androidx.constraintlayout.compose.MotionDragState m8993onDragEndTH1AsA0(long velocity) {
            return new androidx.constraintlayout.compose.MotionDragState(false, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0(), velocity, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MotionDragState(isDragging=");
        sb.append(this.isDragging);
        sb.append(", dragAmount=");
        sb.append((java.lang.Object) androidx.compose.ui.geometry.Offset.m5760toStringimpl(this.dragAmount));
        sb.append(", velocity=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Velocity.m8846toStringimpl(this.velocity));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isDragging) * 31) + androidx.compose.ui.geometry.Offset.m5754hashCodeimpl(this.dragAmount)) * 31) + androidx.compose.ui.unit.Velocity.m8841hashCodeimpl(this.velocity);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.constraintlayout.compose.MotionDragState)) {
            return false;
        }
        androidx.constraintlayout.compose.MotionDragState motionDragState = (androidx.constraintlayout.compose.MotionDragState) other;
        return this.isDragging == motionDragState.isDragging && androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.dragAmount, motionDragState.dragAmount) && androidx.compose.ui.unit.Velocity.m8838equalsimpl0(this.velocity, motionDragState.velocity);
    }

    /* renamed from: copy-dhPbTwU, reason: not valid java name */
    public final androidx.constraintlayout.compose.MotionDragState m8989copydhPbTwU(boolean isDragging, long dragAmount, long velocity) {
        return new androidx.constraintlayout.compose.MotionDragState(isDragging, dragAmount, velocity, null);
    }

    /* renamed from: component3-9UxMQ8M, reason: not valid java name and from getter */
    public final long getVelocity() {
        return this.velocity;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name and from getter */
    public final long getDragAmount() {
        return this.dragAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    /* renamed from: copy-dhPbTwU$default, reason: not valid java name */
    public static /* synthetic */ androidx.constraintlayout.compose.MotionDragState m8986copydhPbTwU$default(androidx.constraintlayout.compose.MotionDragState motionDragState, boolean z, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = motionDragState.isDragging;
        }
        if ((i & 2) != 0) {
            j = motionDragState.dragAmount;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = motionDragState.velocity;
        }
        return motionDragState.m8989copydhPbTwU(z, j3, j2);
    }

    public /* synthetic */ MotionDragState(boolean z, long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2);
    }
}
