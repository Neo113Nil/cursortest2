package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState;", "", "<init>", "()V", "ConstraintsMet", "ConstraintsNotMet", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ConstraintsState {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConstraintsMet extends androidx.work.impl.constraints.ConstraintsState {
        public static final androidx.work.impl.constraints.ConstraintsState.ConstraintsMet INSTANCE = new androidx.work.impl.constraints.ConstraintsState.ConstraintsMet();

        private ConstraintsMet() {
            super(null);
        }
    }

    private ConstraintsState() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "reason", "<init>", "(I)V", "component1", "()I", "copy", "(I)Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getReason"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConstraintsNotMet extends androidx.work.impl.constraints.ConstraintsState {
        private final int reason;

        public ConstraintsNotMet(int i) {
            super(null);
            this.reason = i;
        }

        public final int getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstraintsNotMet(reason=");
            sb.append(this.reason);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.reason);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) && this.reason == ((androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet) other).reason;
        }

        public final androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet copy(int reason) {
            return new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final int getReason() {
            return this.reason;
        }

        public static /* synthetic */ androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet copy$default(androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet constraintsNotMet, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = constraintsNotMet.reason;
            }
            return constraintsNotMet.copy(i);
        }
    }

    public /* synthetic */ ConstraintsState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
