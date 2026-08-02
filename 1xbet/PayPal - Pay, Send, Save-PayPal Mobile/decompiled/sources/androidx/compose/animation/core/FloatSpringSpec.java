package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getVelocityFromNanos", "getEndVelocity", "(FFF)F", "getDurationNanos", "(FFF)J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDampingRatio", "()F", "getStiffness", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/SpringSimulation;", "getHighSpeedVideoSizes", "Landroidx/compose/animation/core/SpringSimulation;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatSpringSpec implements androidx.compose.animation.core.FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final androidx.compose.animation.core.SpringSimulation getHighSpeedVideoSizes;
    private final float stiffness;

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    public FloatSpringSpec(float f, float f2, float f3) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.getHighSpeedVideoFpsRanges = f3;
        androidx.compose.animation.core.SpringSimulation springSimulation = new androidx.compose.animation.core.SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f);
        springSimulation.setStiffness(f2);
        this.getHighSpeedVideoSizes = springSimulation;
    }

    public /* synthetic */ FloatSpringSpec(float f, float f2, float f3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? 0.01f : f3);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.getHighSpeedVideoSizes.setFinalPosition(targetValue);
        return java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes.m1216updateValuesIJZedt4$animation_core(initialValue, initialVelocity, playTimeNanos / 1000000) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        this.getHighSpeedVideoSizes.setFinalPosition(targetValue);
        return java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes.m1216updateValuesIJZedt4$animation_core(initialValue, initialVelocity, playTimeNanos / 1000000) & 4294967295L));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        float stiffness = this.getHighSpeedVideoSizes.getStiffness();
        float dampingRatio = this.getHighSpeedVideoSizes.getDampingRatio();
        float f = this.getHighSpeedVideoFpsRanges;
        return androidx.compose.animation.core.SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, initialVelocity / f, (initialValue - targetValue) / f, 1.0f) * 1000000;
    }

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }
}
