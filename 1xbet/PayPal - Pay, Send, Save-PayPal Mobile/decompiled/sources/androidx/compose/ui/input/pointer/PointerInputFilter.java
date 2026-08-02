package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00198\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0014\u0010#\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates$ui", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates$ui", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getSize-YbymL2g", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "", "isAttached", "Z", "isAttached$ui", "()Z", "setAttached$ui", "(Z)V", "getInterceptOutOfBoundsChildEvents", "interceptOutOfBoundsChildEvents", "getShareWithSiblings", "shareWithSiblings"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PointerInputFilter {
    public static final int $stable = 8;
    private boolean isAttached;
    private androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public abstract void mo7253onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds);

    /* renamed from: getLayoutCoordinates$ui, reason: from getter */
    public final androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final void setLayoutCoordinates$ui(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7252getSizeYbymL2g() {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return layoutCoordinates != null ? layoutCoordinates.mo7361getSizeYbymL2g() : androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    }

    /* renamed from: isAttached$ui, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public final void setAttached$ui(boolean z) {
        this.isAttached = z;
    }
}
