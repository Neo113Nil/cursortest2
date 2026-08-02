package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent;", "", "<init>", "()V", "TransformStarted", "TransformStopped", "TransformDelta", "Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class TransformEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransformStarted extends androidx.compose.foundation.gestures.TransformEvent {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.TransformEvent.TransformStarted INSTANCE = new androidx.compose.foundation.gestures.TransformEvent.TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransformStopped extends androidx.compose.foundation.gestures.TransformEvent {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.TransformEvent.TransformStopped INSTANCE = new androidx.compose.foundation.gestures.TransformEvent.TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "<init>", "(FJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getZoomChange", "()F", "J", "getPanChange-F1C5BW0", "()J", "getRotationChange"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransformDelta extends androidx.compose.foundation.gestures.TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        private TransformDelta(float f, long j, float f2) {
            super(null);
            this.zoomChange = f;
            this.panChange = j;
            this.rotationChange = f2;
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name and from getter */
        public final long getPanChange() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        public /* synthetic */ TransformDelta(float f, long j, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, f2);
        }
    }

    public /* synthetic */ TransformEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
