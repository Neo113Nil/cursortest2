package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/text/selection/ClicksCounter;", "", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "event", "", "update", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "prevClick", "newClick", "", "timeIsTolerable", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;)Z", "positionIsTolerable", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/platform/ViewConfiguration;", "getHighResolutionOutputSizeshNQ4ISI", "", "clicks", com.visa.cbp.getEncExpo.warmup, "getClicks", "()I", "setClicks", "(I)V", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "getPrevClick", "()Landroidx/compose/ui/input/pointer/PointerInputChange;", "setPrevClick", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClicksCounter {
    public static final int $stable = 8;
    private int clicks;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.ViewConfiguration getHighResolutionOutputSizeshNQ4ISI;
    private androidx.compose.ui.input.pointer.PointerInputChange prevClick;

    public ClicksCounter(androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        this.getHighResolutionOutputSizeshNQ4ISI = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    public final void setClicks(int i) {
        this.clicks = i;
    }

    public final androidx.compose.ui.input.pointer.PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final void setPrevClick(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final void update(androidx.compose.ui.input.pointer.PointerEvent event) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = this.prevClick;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = event.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }

    public final boolean timeIsTolerable(androidx.compose.ui.input.pointer.PointerInputChange prevClick, androidx.compose.ui.input.pointer.PointerInputChange newClick) {
        return newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.getHighResolutionOutputSizeshNQ4ISI.getDoubleTapTimeoutMillis();
    }

    public final boolean positionIsTolerable(androidx.compose.ui.input.pointer.PointerInputChange prevClick, androidx.compose.ui.input.pointer.PointerInputChange newClick) {
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.access$distanceIsTolerable(this.getHighResolutionOutputSizeshNQ4ISI, prevClick, newClick);
    }
}
