package androidx.compose.material;

/* compiled from: AppBar.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J4\u0010\"\u001a\u00020 *\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "fabPlacement", "Landroidx/compose/material/FabPlacement;", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "component1", "component2", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "addCutoutShape", "", "Landroidx/compose/ui/graphics/Path;", "addRoundedEdges", "cutoutStartPosition", "", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class BottomAppBarCutoutShape implements androidx.compose.ui.graphics.Shape {
    private final androidx.compose.ui.graphics.Shape cutoutShape;
    private final androidx.compose.material.FabPlacement fabPlacement;

    public static /* synthetic */ androidx.compose.material.BottomAppBarCutoutShape copy$default(androidx.compose.material.BottomAppBarCutoutShape bottomAppBarCutoutShape, androidx.compose.ui.graphics.Shape shape, androidx.compose.material.FabPlacement fabPlacement, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getCutoutShape() {
        return this.cutoutShape;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.material.FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public final androidx.compose.material.BottomAppBarCutoutShape copy(androidx.compose.ui.graphics.Shape cutoutShape, androidx.compose.material.FabPlacement fabPlacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        return new androidx.compose.material.BottomAppBarCutoutShape(cutoutShape, fabPlacement);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material.BottomAppBarCutoutShape)) {
            return false;
        }
        androidx.compose.material.BottomAppBarCutoutShape bottomAppBarCutoutShape = (androidx.compose.material.BottomAppBarCutoutShape) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && kotlin.jvm.internal.Intrinsics.areEqual(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public java.lang.String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }

    public BottomAppBarCutoutShape(androidx.compose.ui.graphics.Shape cutoutShape, androidx.compose.material.FabPlacement fabPlacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        this.cutoutShape = cutoutShape;
        this.fabPlacement = fabPlacement;
    }

    public final androidx.compose.ui.graphics.Shape getCutoutShape() {
        return this.cutoutShape;
    }

    public final androidx.compose.material.FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "density");
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.addRect(new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Size.m1937getHeightimpl(size)));
        androidx.compose.ui.graphics.Path Path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo2005opN5in7k0(Path, Path2, androidx.compose.ui.graphics.PathOperation.INSTANCE.m2413getDifferenceb3I0S0c());
        return new androidx.compose.ui.graphics.Outline.Generic(Path2);
    }

    private final void addCutoutShape(androidx.compose.ui.graphics.Path path, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        float f;
        float f2;
        f = androidx.compose.material.AppBarKt.BottomAppBarCutoutOffset;
        float mo315toPx0680j_4 = density.mo315toPx0680j_4(f);
        float f3 = 2 * mo315toPx0680j_4;
        long Size = androidx.compose.ui.geometry.SizeKt.Size(this.fabPlacement.getWidth() + f3, this.fabPlacement.getHeight() + f3);
        float left = this.fabPlacement.getLeft() - mo315toPx0680j_4;
        float m1940getWidthimpl = left + androidx.compose.ui.geometry.Size.m1940getWidthimpl(Size);
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(Size) / 2.0f;
        androidx.compose.ui.graphics.OutlineKt.addOutline(path, this.cutoutShape.mo262createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo2008translatek4lQ0M(androidx.compose.ui.geometry.OffsetKt.Offset(left, -m1937getHeightimpl));
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.cutoutShape, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape())) {
            f2 = androidx.compose.material.AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, m1940getWidthimpl, m1937getHeightimpl, density.mo315toPx0680j_4(f2), 0.0f);
        }
    }

    private final void addRoundedEdges(androidx.compose.ui.graphics.Path path, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) java.lang.Math.sqrt((f3 * f3) - (f5 * f5)));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        kotlin.Pair<java.lang.Float, java.lang.Float> calculateRoundedEdgeIntercept = androidx.compose.material.AppBarKt.calculateRoundedEdgeIntercept(f6 - 1.0f, f5, f3);
        float floatValue = calculateRoundedEdgeIntercept.component1().floatValue() + f3;
        float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue() - f5;
        path.moveTo(f8 - f4, 0.0f);
        path.quadraticBezierTo(f8 - 1.0f, 0.0f, f + floatValue, floatValue2);
        path.lineTo(f2 - floatValue, floatValue2);
        path.quadraticBezierTo(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        path.close();
    }
}
