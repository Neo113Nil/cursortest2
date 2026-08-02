package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "getParentData", "()Ljava/lang/Object;", "parentData"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIntrinsicMeasurable implements androidx.compose.ui.layout.Measurable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.layout.IntrinsicMinMax getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.layout.IntrinsicWidthHeight getHighSpeedVideoSizes;
    private final androidx.compose.ui.layout.IntrinsicMeasurable measurable;

    public DefaultIntrinsicMeasurable(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, androidx.compose.ui.layout.IntrinsicMinMax intrinsicMinMax, androidx.compose.ui.layout.IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.getHighSpeedVideoFpsRangesFor = intrinsicMinMax;
        this.getHighSpeedVideoSizes = intrinsicWidthHeight;
    }

    public final androidx.compose.ui.layout.IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final java.lang.Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long constraints) {
        int minIntrinsicHeight;
        int minIntrinsicWidth;
        if (this.getHighSpeedVideoSizes == androidx.compose.ui.layout.IntrinsicWidthHeight.Width) {
            if (this.getHighSpeedVideoFpsRangesFor == androidx.compose.ui.layout.IntrinsicMinMax.Max) {
                minIntrinsicWidth = this.measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints));
            } else {
                minIntrinsicWidth = this.measurable.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints));
            }
            return new androidx.compose.ui.layout.FixedSizeIntrinsicsPlaceable(minIntrinsicWidth, androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(constraints) ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints) : 32767);
        }
        if (this.getHighSpeedVideoFpsRangesFor == androidx.compose.ui.layout.IntrinsicMinMax.Max) {
            minIntrinsicHeight = this.measurable.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints));
        } else {
            minIntrinsicHeight = this.measurable.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints));
        }
        return new androidx.compose.ui.layout.FixedSizeIntrinsicsPlaceable(androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(constraints) ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints) : 32767, minIntrinsicHeight);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int height) {
        return this.measurable.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int height) {
        return this.measurable.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int width) {
        return this.measurable.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int width) {
        return this.measurable.maxIntrinsicHeight(width);
    }
}
