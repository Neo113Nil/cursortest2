package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Landroidx/compose/material/Shapes;", "", "Landroidx/compose/foundation/shape/CornerBasedShape;", com.adjust.sdk.Constants.SMALL, "medium", com.adjust.sdk.Constants.LARGE, "<init>", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "copy", "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/material/Shapes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getSmall", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "getMedium", "getLarge"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;
    private final androidx.compose.foundation.shape.CornerBasedShape large;
    private final androidx.compose.foundation.shape.CornerBasedShape medium;
    private final androidx.compose.foundation.shape.CornerBasedShape small;

    public Shapes(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape2, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape3) {
        this.small = cornerBasedShape;
        this.medium = cornerBasedShape2;
        this.large = cornerBasedShape3;
    }

    public final androidx.compose.foundation.shape.CornerBasedShape getSmall() {
        return this.small;
    }

    public final androidx.compose.foundation.shape.CornerBasedShape getMedium() {
        return this.medium;
    }

    public final androidx.compose.foundation.shape.CornerBasedShape getLarge() {
        return this.large;
    }

    public static /* synthetic */ androidx.compose.material.Shapes copy$default(androidx.compose.material.Shapes shapes, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape2, androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerBasedShape = shapes.small;
        }
        if ((i & 2) != 0) {
            cornerBasedShape2 = shapes.medium;
        }
        if ((i & 4) != 0) {
            cornerBasedShape3 = shapes.large;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    public final androidx.compose.material.Shapes copy(androidx.compose.foundation.shape.CornerBasedShape small, androidx.compose.foundation.shape.CornerBasedShape medium, androidx.compose.foundation.shape.CornerBasedShape large) {
        return new androidx.compose.material.Shapes(small, medium, large);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.Shapes)) {
            return false;
        }
        androidx.compose.material.Shapes shapes = (androidx.compose.material.Shapes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.small, shapes.small) && kotlin.jvm.internal.Intrinsics.areEqual(this.medium, shapes.medium) && kotlin.jvm.internal.Intrinsics.areEqual(this.large, shapes.large);
    }

    public final int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shapes(small=");
        sb.append(this.small);
        sb.append(", medium=");
        sb.append(this.medium);
        sb.append(", large=");
        sb.append(this.large);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ Shapes(androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape2, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)) : roundedCornerShape, (i & 2) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)) : roundedCornerShape2, (i & 4) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : roundedCornerShape3);
    }

    public Shapes() {
        this(null, null, null, 7, null);
    }
}
