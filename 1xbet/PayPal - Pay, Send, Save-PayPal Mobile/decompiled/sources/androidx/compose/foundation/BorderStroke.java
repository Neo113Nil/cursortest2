package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "copy", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWidth-D9Ej5fM", "()F", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.Brush brush;
    private final float width;

    private BorderStroke(float f, androidx.compose.ui.graphics.Brush brush) {
        this.width = f;
        this.brush = brush;
    }

    public final androidx.compose.ui.graphics.Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.BorderStroke)) {
            return false;
        }
        androidx.compose.foundation.BorderStroke borderStroke = (androidx.compose.foundation.BorderStroke) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.width, borderStroke.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.brush, borderStroke.brush);
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BorderStroke(width=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.width));
        sb.append(", brush=");
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.BorderStroke m1309copyD5KLDUw$default(androidx.compose.foundation.BorderStroke borderStroke, float f, androidx.compose.ui.graphics.Brush brush, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = borderStroke.width;
        }
        if ((i & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m1310copyD5KLDUw(f, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final androidx.compose.foundation.BorderStroke m1310copyD5KLDUw(float width, androidx.compose.ui.graphics.Brush brush) {
        return new androidx.compose.foundation.BorderStroke(width, brush, null);
    }

    public /* synthetic */ BorderStroke(float f, androidx.compose.ui.graphics.Brush brush, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush);
    }
}
