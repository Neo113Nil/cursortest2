package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Constraints;", "oldConstraints", "newConstraints", "", "skipCount", "threshold", "", "shouldInvalidateOnFixedHeight-SulIKG4", "(JJII)Z", "shouldInvalidateOnFixedHeight", "shouldInvalidateOnFixedWidth-SulIKG4", "shouldInvalidateOnFixedWidth", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InvalidationStrategySpecification {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: shouldInvalidateOnFixedWidth-SulIKG4, reason: not valid java name */
    public final boolean m8969shouldInvalidateOnFixedWidthSulIKG4(long oldConstraints, long newConstraints, int skipCount, int threshold) {
        if (androidx.compose.ui.unit.Constraints.m8552getHasFixedWidthimpl(oldConstraints) && androidx.compose.ui.unit.Constraints.m8552getHasFixedWidthimpl(newConstraints)) {
            int abs = java.lang.Math.abs(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(newConstraints) - androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(oldConstraints));
            if (abs >= threshold) {
                this.getHighSpeedVideoFpsRangesFor = 0;
                return true;
            }
            if (abs != 0) {
                int i = this.getHighSpeedVideoFpsRangesFor + 1;
                this.getHighSpeedVideoFpsRangesFor = i;
                if (i > skipCount) {
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    return true;
                }
            }
        } else {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        return false;
    }

    /* renamed from: shouldInvalidateOnFixedHeight-SulIKG4, reason: not valid java name */
    public final boolean m8968shouldInvalidateOnFixedHeightSulIKG4(long oldConstraints, long newConstraints, int skipCount, int threshold) {
        if (androidx.compose.ui.unit.Constraints.m8551getHasFixedHeightimpl(oldConstraints) && androidx.compose.ui.unit.Constraints.m8551getHasFixedHeightimpl(newConstraints)) {
            int abs = java.lang.Math.abs(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(newConstraints) - androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(oldConstraints));
            if (abs >= threshold) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                return true;
            }
            if (abs != 0) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                if (i > skipCount) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    return true;
                }
            }
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
        return false;
    }
}
