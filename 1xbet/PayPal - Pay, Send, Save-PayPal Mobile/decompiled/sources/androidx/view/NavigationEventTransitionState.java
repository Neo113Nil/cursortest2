package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState;", "", "<init>", "()V", "Companion", "Idle", "InProgress", "Direction", "Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState$InProgress;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NavigationEventTransitionState {
    public static final int TRANSITIONING_BACK = -1;
    public static final int TRANSITIONING_FORWARD = 1;
    public static final int TRANSITIONING_UNKNOWN = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$Direction;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Direction {
    }

    private NavigationEventTransitionState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends androidx.view.NavigationEventTransitionState {
        public static final androidx.navigationevent.NavigationEventTransitionState.Idle INSTANCE = new androidx.navigationevent.NavigationEventTransitionState.Idle();

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle()";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000e"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$InProgress;", "Landroidx/navigationevent/NavigationEventTransitionState;", "Landroidx/navigationevent/NavigationEvent;", "latestEvent", "", "direction", "<init>", "(Landroidx/navigationevent/NavigationEvent;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigationevent/NavigationEvent;", "getLatestEvent", "()Landroidx/navigationevent/NavigationEvent;", com.visa.cbp.getEncExpo.warmup, "getDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InProgress extends androidx.view.NavigationEventTransitionState {
        private final int direction;
        private final androidx.view.NavigationEvent latestEvent;

        public final androidx.view.NavigationEvent getLatestEvent() {
            return this.latestEvent;
        }

        public final int getDirection() {
            return this.direction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(androidx.view.NavigationEvent navigationEvent, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationEvent, "");
            this.latestEvent = navigationEvent;
            this.direction = i;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || getClass() != other.getClass()) {
                return false;
            }
            androidx.navigationevent.NavigationEventTransitionState.InProgress inProgress = (androidx.navigationevent.NavigationEventTransitionState.InProgress) other;
            return this.direction == inProgress.direction && kotlin.jvm.internal.Intrinsics.areEqual(this.latestEvent, inProgress.latestEvent);
        }

        public final int hashCode() {
            return (this.direction * 31) + this.latestEvent.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InProgress(latestEvent=");
            sb.append(this.latestEvent);
            sb.append(", direction=");
            sb.append(this.direction);
            sb.append(')');
            return sb.toString();
        }
    }

    public /* synthetic */ NavigationEventTransitionState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
