package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class TypeParameterErasureOptions {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    public TypeParameterErasureOptions(boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean getIntersectUpperBounds() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
