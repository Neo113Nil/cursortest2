package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "", "fraction", "transform", "(F)F", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/Path;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/IntervalTree;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathEasing implements androidx.compose.animation.core.Easing {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path Camera2StreamConfigurationMap;

    public PathEasing(androidx.compose.ui.graphics.Path path) {
        this.Camera2StreamConfigurationMap = path;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float fraction) {
        if (fraction <= 0.0f) {
            return 0.0f;
        }
        if (fraction >= 1.0f) {
            return 1.0f;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment> intervalTree = this.getHighSpeedVideoFpsRangesFor;
        if (intervalTree == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            intervalTree = null;
        }
        java.lang.Object data = androidx.compose.ui.graphics.IntervalTree.findFirstOverlap$default(intervalTree, fraction, 0.0f, 2, null).getData();
        if (data != null) {
            androidx.compose.ui.graphics.PathSegment pathSegment = (androidx.compose.ui.graphics.PathSegment) data;
            float findFirstRoot = androidx.compose.ui.graphics.BezierKt.findFirstRoot(pathSegment, fraction);
            if (java.lang.Float.isNaN(findFirstRoot)) {
                androidx.compose.animation.core.PreconditionsKt.throwIllegalStateException("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
            }
            return androidx.compose.ui.graphics.BezierKt.evaluateY(pathSegment, findFirstRoot);
        }
        androidx.compose.animation.core.PreconditionsKt.throwIllegalStateExceptionForNullCheck("The easing path is invalid. Make sure it is continuous on the x axis.");
        throw new kotlin.KotlinNothingValueException();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        float[] fArr = new float[5];
        androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment> intervalTree = new androidx.compose.ui.graphics.IntervalTree<>();
        androidx.compose.ui.graphics.PathIterator it = this.Camera2StreamConfigurationMap.iterator(androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsQuadratics, 2.0E-4f);
        while (it.hasNext()) {
            androidx.compose.ui.graphics.PathSegment next = it.next();
            if (next.getType() == androidx.compose.ui.graphics.PathSegment.Type.Close) {
                androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException("The path cannot contain a close() command.");
            }
            if (next.getType() != androidx.compose.ui.graphics.PathSegment.Type.Move && next.getType() != androidx.compose.ui.graphics.PathSegment.Type.Done) {
                long computeHorizontalBounds$default = androidx.compose.ui.graphics.BezierKt.computeHorizontalBounds$default(next, fArr, 0, 4, null);
                intervalTree.addInterval(java.lang.Float.intBitsToFloat((int) (computeHorizontalBounds$default >> 32)), java.lang.Float.intBitsToFloat((int) (computeHorizontalBounds$default & 4294967295L)), next);
            }
        }
        if (!intervalTree.contains(0.0f) || !intervalTree.contains(1.0f)) {
            androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.getHighSpeedVideoFpsRangesFor = intervalTree;
    }
}
