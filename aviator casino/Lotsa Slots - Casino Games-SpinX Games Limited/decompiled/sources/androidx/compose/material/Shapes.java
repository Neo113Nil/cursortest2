package androidx.compose.material;

/* compiled from: Shapes.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/Shapes;", "", com.adjust.sdk.Constants.SMALL, "Landroidx/compose/foundation/shape/CornerBasedShape;", "medium", com.adjust.sdk.Constants.LARGE, "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V", "getLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "getMedium", "getSmall", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Shapes {
    private final androidx.compose.foundation.shape.CornerBasedShape large;
    private final androidx.compose.foundation.shape.CornerBasedShape medium;
    private final androidx.compose.foundation.shape.CornerBasedShape small;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public Shapes(androidx.compose.foundation.shape.CornerBasedShape small, androidx.compose.foundation.shape.CornerBasedShape medium, androidx.compose.foundation.shape.CornerBasedShape large) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(small, "small");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(medium, "medium");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(large, "large");
        this.small = small;
        this.medium = medium;
        this.large = large;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(small, "small");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(medium, "medium");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(large, "large");
        return new androidx.compose.material.Shapes(small, medium, large);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.Shapes)) {
            return false;
        }
        androidx.compose.material.Shapes shapes = (androidx.compose.material.Shapes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.small, shapes.small) && kotlin.jvm.internal.Intrinsics.areEqual(this.medium, shapes.medium) && kotlin.jvm.internal.Intrinsics.areEqual(this.large, shapes.large);
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    public java.lang.String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public /* synthetic */ Shapes(androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape2, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(4)) : roundedCornerShape, (i & 2) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(4)) : roundedCornerShape2, (i & 4) != 0 ? androidx.compose.foundation.shape.RoundedCornerShapeKt.m846RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : roundedCornerShape3);
    }
}
