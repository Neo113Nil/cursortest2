package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B6\u0012-\u0010\t\u001a)\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR;\u0010\u001c\u001a)\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/LayoutDirection;", "", "Lkotlin/ExtensionFunctionType;", "builder", "<init>", "(Lkotlin/jvm/functions/Function3;)V", io.ktor.http.ContentDisposition.Parameters.Size, "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GenericShape implements androidx.compose.ui.graphics.Shape {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.graphics.Path, androidx.compose.ui.geometry.Size, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.Path, ? super androidx.compose.ui.geometry.Size, ? super androidx.compose.ui.unit.LayoutDirection, kotlin.Unit> function3) {
        this.getHighSpeedVideoFpsRangesFor = function3;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        this.getHighSpeedVideoFpsRangesFor.invoke(Path, androidx.compose.ui.geometry.Size.m5809boximpl(size), layoutDirection);
        Path.close();
        return new androidx.compose.ui.graphics.Outline.Generic(Path);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        androidx.compose.foundation.shape.GenericShape genericShape = other instanceof androidx.compose.foundation.shape.GenericShape ? (androidx.compose.foundation.shape.GenericShape) other : null;
        return (genericShape != null ? genericShape.getHighSpeedVideoFpsRangesFor : null) == this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
