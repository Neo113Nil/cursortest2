package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u00178\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Landroidx/compose/material3/TooltipCaretShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/Matrix;", "p0", "p1", "p2", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "getOutputMinFrameDuration", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Shape;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TooltipCaretShape implements androidx.compose.ui.graphics.Shape {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Shape getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Shape getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.Matrix> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path Camera2StreamConfigurationMap = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path getHighSpeedVideoSizes = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path getHighSpeedVideoSizesFor = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();

    public TooltipCaretShape(androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.Matrix> mutableState, androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.Shape shape2) {
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = shape;
        this.getHighSpeedVideoFpsRangesFor = shape2;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long p0, androidx.compose.ui.unit.LayoutDirection p1, androidx.compose.ui.unit.Density p2) {
        this.Camera2StreamConfigurationMap.reset();
        this.getHighSpeedVideoSizes.reset();
        this.getHighSpeedVideoSizesFor.reset();
        androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI = this.getHighResolutionOutputSizeshNQ4ISI.mo1334createOutlinePq9zytI(p0, p1, p2);
        androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI2 = this.getHighSpeedVideoFpsRangesFor.mo1334createOutlinePq9zytI(p0, p1, p2);
        if (mo1334createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Generic) {
            androidx.compose.ui.graphics.Path.m6262addPathUv8p0NA$default(this.Camera2StreamConfigurationMap, ((androidx.compose.ui.graphics.Outline.Generic) mo1334createOutlinePq9zytI).getPath(), 0L, 2, null);
        } else if (mo1334createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Path.addRoundRect$default(this.Camera2StreamConfigurationMap, ((androidx.compose.ui.graphics.Outline.Rounded) mo1334createOutlinePq9zytI).getRoundRect(), null, 2, null);
        } else {
            if (!(mo1334createOutlinePq9zytI instanceof androidx.compose.ui.graphics.Outline.Rectangle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.Path.addRect$default(this.Camera2StreamConfigurationMap, ((androidx.compose.ui.graphics.Outline.Rectangle) mo1334createOutlinePq9zytI).getRect(), null, 2, null);
        }
        if (mo1334createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.Outline.Generic) {
            androidx.compose.ui.graphics.Path.m6262addPathUv8p0NA$default(this.getHighSpeedVideoSizesFor, ((androidx.compose.ui.graphics.Outline.Generic) mo1334createOutlinePq9zytI2).getPath(), 0L, 2, null);
        } else if (mo1334createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.Outline.Rounded) {
            androidx.compose.ui.graphics.Path.addRoundRect$default(this.getHighSpeedVideoSizesFor, ((androidx.compose.ui.graphics.Outline.Rounded) mo1334createOutlinePq9zytI2).getRoundRect(), null, 2, null);
        } else {
            if (!(mo1334createOutlinePq9zytI2 instanceof androidx.compose.ui.graphics.Outline.Rectangle)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.graphics.Path.addRect$default(this.getHighSpeedVideoSizesFor, ((androidx.compose.ui.graphics.Outline.Rectangle) mo1334createOutlinePq9zytI2).getRect(), null, 2, null);
        }
        this.getHighSpeedVideoSizesFor.mo5888transform58bKbWc(this.getHighSpeedVideoFpsRanges.getValue().m6246unboximpl());
        this.getHighSpeedVideoSizes.mo5886opN5in7k0(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, androidx.compose.ui.graphics.PathOperation.INSTANCE.m6287getUnionb3I0S0c());
        return new androidx.compose.ui.graphics.Outline.Generic(this.getHighSpeedVideoSizes);
    }
}
