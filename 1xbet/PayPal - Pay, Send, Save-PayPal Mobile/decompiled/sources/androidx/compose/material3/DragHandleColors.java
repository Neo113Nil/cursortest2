package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/compose/material3/DragHandleColors;", "", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "pressedColor", "draggedColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getColor-0d7_KjU", "()J", "getPressedColor-0d7_KjU", "getDraggedColor-0d7_KjU"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragHandleColors {
    public static final int $stable = 0;
    private final long color;
    private final long draggedColor;
    private final long pressedColor;

    private DragHandleColors(long j, long j2, long j3) {
        this.color = j;
        this.pressedColor = j2;
        this.draggedColor = j3;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: getDraggedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDraggedColor() {
        return this.draggedColor;
    }

    /* renamed from: getPressedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPressedColor() {
        return this.pressedColor;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.DragHandleColors)) {
            return false;
        }
        androidx.compose.material3.DragHandleColors dragHandleColors = (androidx.compose.material3.DragHandleColors) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.color, dragHandleColors.color) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.pressedColor, dragHandleColors.pressedColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.draggedColor, dragHandleColors.draggedColor);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.color) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.pressedColor)) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.draggedColor);
    }

    public /* synthetic */ DragHandleColors(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
