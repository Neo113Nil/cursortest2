package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e"}, d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Path;", "path", "", "tolerance", "", "updatePath", "(Landroidx/compose/ui/graphics/Path;F)V", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "contains-k-4lQ0M", "(J)Z", "contains", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/Path;", "getHighSpeedVideoSizes", "getInputFormats", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Rect;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/IntervalTree;", "", "[F", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PathHitTester {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float[] getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Path getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private float getHighResolutionOutputSizeshNQ4ISI;

    public PathHitTester() {
        androidx.compose.ui.graphics.Path path;
        path = androidx.compose.ui.graphics.PathHitTesterKt.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = path;
        this.getHighResolutionOutputSizeshNQ4ISI = 0.5f;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        this.getHighSpeedVideoFpsRanges = new androidx.compose.ui.graphics.IntervalTree<>();
        this.Camera2StreamConfigurationMap = new float[20];
        this.getOutputMinFrameDuration = new float[2];
    }

    public static /* synthetic */ void updatePath$default(androidx.compose.ui.graphics.PathHitTester pathHitTester, androidx.compose.ui.graphics.Path path, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        pathHitTester.updatePath(path, f);
    }

    public final void updatePath(androidx.compose.ui.graphics.Path path, float tolerance) {
        this.getHighSpeedVideoSizes = path;
        this.getHighResolutionOutputSizeshNQ4ISI = tolerance;
        this.getHighSpeedVideoFpsRangesFor = path.getBounds();
        this.getHighSpeedVideoFpsRanges.clear();
        androidx.compose.ui.graphics.PathIterator it = path.iterator(androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsQuadratics, tolerance);
        while (it.hasNext()) {
            androidx.compose.ui.graphics.PathSegment next = it.next();
            int i = androidx.compose.ui.graphics.PathHitTester.WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                long computeVerticalBounds$default = androidx.compose.ui.graphics.BezierKt.computeVerticalBounds$default(next, this.Camera2StreamConfigurationMap, 0, 4, null);
                this.getHighSpeedVideoFpsRanges.addInterval(java.lang.Float.intBitsToFloat((int) (computeVerticalBounds$default >> 32)), java.lang.Float.intBitsToFloat((int) (computeVerticalBounds$default & 4294967295L)), next);
            } else if (i == 4) {
                return;
            }
        }
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m6276containsk4lQ0M(long position) {
        int i;
        int lineWinding;
        if (!this.getHighSpeedVideoSizes.isEmpty() && this.getHighSpeedVideoFpsRangesFor.m5778containsk4lQ0M(position)) {
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (position >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (position & 4294967295L));
            float[] fArr = this.Camera2StreamConfigurationMap;
            float[] fArr2 = this.getOutputMinFrameDuration;
            androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment> intervalTree = this.getHighSpeedVideoFpsRanges;
            if (intervalTree.root != intervalTree.terminator) {
                java.util.ArrayList<androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(intervalTree.root);
                i = 0;
                while (arrayList.size() > 0) {
                    androidx.compose.ui.graphics.IntervalTree<androidx.compose.ui.graphics.PathSegment>.Node remove = arrayList.remove(arrayList.size() - 1);
                    if (remove.overlaps(intBitsToFloat2, intBitsToFloat2)) {
                        androidx.compose.ui.graphics.PathSegment data = remove.getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(data);
                        androidx.compose.ui.graphics.PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i2 = androidx.compose.ui.graphics.PathHitTester.WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i2 == 1) {
                            lineWinding = androidx.compose.ui.graphics.BezierKt.lineWinding(points, intBitsToFloat, intBitsToFloat2);
                        } else if (i2 == 2) {
                            lineWinding = androidx.compose.ui.graphics.BezierKt.quadraticWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        } else if (i2 == 3) {
                            lineWinding = androidx.compose.ui.graphics.BezierKt.cubicWinding(points, intBitsToFloat, intBitsToFloat2, fArr, fArr2);
                        }
                        i += lineWinding;
                    }
                    if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= intBitsToFloat2) {
                        arrayList.add(remove.getLeft());
                    }
                    if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= intBitsToFloat2) {
                        arrayList.add(remove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i = 0;
            }
            if (androidx.compose.ui.graphics.PathFillType.m6270equalsimpl0(this.getHighSpeedVideoSizes.mo5885getFillTypeRgk1Os(), androidx.compose.ui.graphics.PathFillType.INSTANCE.m6274getEvenOddRgk1Os())) {
                i &= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.graphics.PathSegment.Type.values().length];
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Line.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathSegment.Type.Done.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
