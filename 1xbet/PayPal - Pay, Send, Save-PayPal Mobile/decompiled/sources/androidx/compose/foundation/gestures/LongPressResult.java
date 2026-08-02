package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult;", "", "<init>", "()V", "Success", "Released", "Canceled", "Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult$Success;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LongPressResult {
    public static final int $stable = 0;

    private LongPressResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Success;", "Landroidx/compose/foundation/gestures/LongPressResult;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends androidx.compose.foundation.gestures.LongPressResult {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.LongPressResult.Success INSTANCE = new androidx.compose.foundation.gestures.LongPressResult.Success();

        private Success() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "finalUpChange", "<init>", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getFinalUpChange", "()Landroidx/compose/ui/input/pointer/PointerInputChange;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Released extends androidx.compose.foundation.gestures.LongPressResult {
        public static final int $stable = 0;
        private final androidx.compose.ui.input.pointer.PointerInputChange finalUpChange;

        public Released(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
            super(null);
            this.finalUpChange = pointerInputChange;
        }

        public final androidx.compose.ui.input.pointer.PointerInputChange getFinalUpChange() {
            return this.finalUpChange;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Canceled extends androidx.compose.foundation.gestures.LongPressResult {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.LongPressResult.Canceled INSTANCE = new androidx.compose.foundation.gestures.LongPressResult.Canceled();

        private Canceled() {
            super(null);
        }
    }

    public /* synthetic */ LongPressResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
