package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeft-D9Ej5fM", "()F", "getWidth-D9Ej5fM", "getRight-D9Ej5fM", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float left;
    private final float width;

    private TabPosition(float f, float f2) {
        this.left = f;
        this.width = f2;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m2788getRightD9Ej5fM() {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(this.left + this.width);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.TabPosition)) {
            return false;
        }
        androidx.compose.material.TabPosition tabPosition = (androidx.compose.material.TabPosition) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.left, tabPosition.left) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.width, tabPosition.width);
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.left) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.width);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TabPosition(left=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.left));
        sb.append(", right=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(m2788getRightD9Ej5fM()));
        sb.append(", width=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.width));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TabPosition(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
