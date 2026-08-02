package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "p0", "Landroidx/compose/material/FabPlacement;", "p1", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Shape;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/material/FabPlacement;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class BottomAppBarCutoutShape implements androidx.compose.ui.graphics.Shape {
    private final androidx.compose.material.FabPlacement Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Shape getHighResolutionOutputSizeshNQ4ISI;

    public BottomAppBarCutoutShape(androidx.compose.ui.graphics.Shape shape, androidx.compose.material.FabPlacement fabPlacement) {
        this.getHighResolutionOutputSizeshNQ4ISI = shape;
        this.Camera2StreamConfigurationMap = fabPlacement;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long p0, androidx.compose.ui.unit.LayoutDirection p1, androidx.compose.ui.unit.Density p2) {
        float f;
        float f2;
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        androidx.compose.ui.graphics.Path.addRect$default(Path, new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (p0 >> 32)), java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L))), null, 2, null);
        androidx.compose.ui.graphics.Path Path2 = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        f = androidx.compose.material.AppBarKt.getHighSpeedVideoSizes;
        float mo1418toPx0680j_4 = p2.mo1418toPx0680j_4(f);
        float height = this.Camera2StreamConfigurationMap.getHeight();
        long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(height + r11) & 4294967295L) | (java.lang.Float.floatToRawIntBits(this.Camera2StreamConfigurationMap.getWidth() + (mo1418toPx0680j_4 * 2.0f)) << 32));
        float left = this.Camera2StreamConfigurationMap.getLeft() - mo1418toPx0680j_4;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5812constructorimpl >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5812constructorimpl & 4294967295L)) / 2.0f;
        androidx.compose.ui.graphics.OutlineKt.addOutline(Path2, this.getHighResolutionOutputSizeshNQ4ISI.mo1334createOutlinePq9zytI(m5812constructorimpl, p1, p2));
        Path2.mo5889translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((4294967295L & java.lang.Float.floatToRawIntBits(-intBitsToFloat2)) | (java.lang.Float.floatToRawIntBits(left) << 32)));
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape())) {
            f2 = androidx.compose.material.AppBarKt.getHighResolutionOutputSizeshNQ4ISI;
            float mo1418toPx0680j_42 = p2.mo1418toPx0680j_4(f2);
            float f3 = intBitsToFloat + left;
            float f4 = -((float) java.lang.Math.sqrt((intBitsToFloat2 * intBitsToFloat2) - 0.0f));
            float f5 = intBitsToFloat2 + f4;
            float f6 = left + f5;
            float f7 = f3 - f5;
            kotlin.Pair<java.lang.Float, java.lang.Float> calculateRoundedEdgeIntercept = androidx.compose.material.AppBarKt.calculateRoundedEdgeIntercept(f4 - 1.0f, 0.0f, intBitsToFloat2);
            float floatValue = calculateRoundedEdgeIntercept.component1().floatValue() + intBitsToFloat2;
            float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue() - 0.0f;
            Path2.moveTo(f6 - mo1418toPx0680j_42, 0.0f);
            Path2.quadraticTo(f6 - 1.0f, 0.0f, left + floatValue, floatValue2);
            Path2.lineTo(f3 - floatValue, floatValue2);
            Path2.quadraticTo(1.0f + f7, 0.0f, mo1418toPx0680j_42 + f7, 0.0f);
            Path2.close();
        }
        Path2.mo5886opN5in7k0(Path, Path2, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6284getDifferenceb3I0S0c());
        return new androidx.compose.ui.graphics.Outline.Generic(Path2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomAppBarCutoutShape(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.compose.material.BottomAppBarCutoutShape)) {
            return false;
        }
        androidx.compose.material.BottomAppBarCutoutShape bottomAppBarCutoutShape = (androidx.compose.material.BottomAppBarCutoutShape) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, bottomAppBarCutoutShape.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, bottomAppBarCutoutShape.Camera2StreamConfigurationMap);
    }
}
