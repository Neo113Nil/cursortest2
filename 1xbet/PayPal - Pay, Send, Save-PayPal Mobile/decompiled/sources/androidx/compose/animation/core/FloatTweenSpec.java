package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "duration", "delay", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JFFF)F", "getDurationNanos", "(FFF)J", "getVelocityFromNanos", com.visa.cbp.getEncExpo.warmup, "getDuration", "()I", "getDelay", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/Easing;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatTweenSpec implements androidx.compose.animation.core.FloatAnimationSpec {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.animation.core.Easing getHighResolutionOutputSizeshNQ4ISI;
    private final int delay;
    private final int duration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    public FloatTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing) {
        this.duration = i;
        this.delay = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = easing;
        this.getHighSpeedVideoFpsRangesFor = i * 1000000;
        this.Camera2StreamConfigurationMap = i2 * 1000000;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDelay() {
        return this.delay;
    }

    public /* synthetic */ FloatTweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        return this.Camera2StreamConfigurationMap + this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j = playTimeNanos - this.Camera2StreamConfigurationMap;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        if (j < 0) {
            j = 0;
        }
        if (j > j2) {
            j = j2;
        }
        float transform = this.getHighResolutionOutputSizeshNQ4ISI.transform(this.duration == 0 ? 1.0f : j / j2);
        return (initialValue * (1.0f - transform)) + (targetValue * transform);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j = playTimeNanos - this.Camera2StreamConfigurationMap;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        if (j < 0) {
            j = 0;
        }
        long j3 = j > j2 ? j2 : j;
        if (j3 == 0) {
            return initialVelocity;
        }
        return (getValueFromNanos(j3, initialValue, targetValue, initialVelocity) - getValueFromNanos(j3 - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }
}
