package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/compose/material3/DragHandleSizes;", "", "Landroidx/compose/ui/unit/DpSize;", io.ktor.http.ContentDisposition.Parameters.Size, "pressedSize", "draggedSize", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSize-MYxV2XQ", "()J", "getPressedSize-MYxV2XQ", "getDraggedSize-MYxV2XQ"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragHandleSizes {
    public static final int $stable = 0;
    private final long draggedSize;
    private final long pressedSize;
    private final long size;

    private DragHandleSizes(long j, long j2, long j3) {
        this.size = j;
        this.pressedSize = j2;
        this.draggedSize = j3;
    }

    /* renamed from: getDraggedSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getDraggedSize() {
        return this.draggedSize;
    }

    /* renamed from: getPressedSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getPressedSize() {
        return this.pressedSize;
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.DragHandleSizes)) {
            return false;
        }
        androidx.compose.material3.DragHandleSizes dragHandleSizes = (androidx.compose.material3.DragHandleSizes) other;
        return androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.size, dragHandleSizes.size) && androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.pressedSize, dragHandleSizes.pressedSize) && androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.draggedSize, dragHandleSizes.draggedSize);
    }

    public final int hashCode() {
        return (((androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.size) * 31) + androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.pressedSize)) * 31) + androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.draggedSize);
    }

    public /* synthetic */ DragHandleSizes(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
