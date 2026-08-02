package androidx.compose.ui.input.pointer;

@kotlin.Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR0\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00028G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\r\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "change", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/input/pointer/PointerInputChange;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Z", "getPositionChange", "()Z", "setPositionChange", "(Z)V", "getPositionChange$annotations", "()V", "getDownChange", "setDownChange", "getDownChange$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private boolean downChange;
    private androidx.compose.ui.input.pointer.PointerInputChange getHighSpeedVideoFpsRanges;
    private boolean positionChange;

    @kotlin.Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @kotlin.Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public ConsumedData(boolean z, boolean z2) {
        this.positionChange = z;
        this.downChange = z2;
    }

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public ConsumedData(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        this(pointerInputChange.getPositionChange(), pointerInputChange.getDownChange());
        this.getHighSpeedVideoFpsRanges = pointerInputChange;
    }

    public final boolean getPositionChange() {
        androidx.compose.ui.input.pointer.PointerInputChange consumedDelegate;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            return consumedDelegate.getPositionChange();
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.getHighSpeedVideoFpsRanges;
        return pointerInputChange2 != null ? pointerInputChange2.getPositionChange() : this.positionChange;
    }

    public final void setPositionChange(boolean z) {
        androidx.compose.ui.input.pointer.PointerInputChange consumedDelegate;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            consumedDelegate.setPositionChange$ui(z);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setPositionChange$ui(z);
        }
        this.positionChange = z;
    }

    public final boolean getDownChange() {
        androidx.compose.ui.input.pointer.PointerInputChange consumedDelegate;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            return consumedDelegate.getDownChange();
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.getHighSpeedVideoFpsRanges;
        return pointerInputChange2 != null ? pointerInputChange2.getDownChange() : this.downChange;
    }

    public final void setDownChange(boolean z) {
        androidx.compose.ui.input.pointer.PointerInputChange consumedDelegate;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange != null && (consumedDelegate = pointerInputChange.getConsumedDelegate()) != null) {
            consumedDelegate.setDownChange$ui(z);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = this.getHighSpeedVideoFpsRanges;
        if (pointerInputChange2 != null) {
            pointerInputChange2.setDownChange$ui(z);
        }
        this.downChange = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConsumedData() {
        this(r2, r2, 3, null);
        boolean z = false;
    }
}
