package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/animation/core/TweenSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "", "durationMillis", "delay", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedTweenSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedTweenSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "getDelay", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TweenSpec<T> implements androidx.compose.animation.core.DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;
    private final int durationMillis;
    private final androidx.compose.animation.core.Easing easing;

    public TweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing) {
        this.durationMillis = i;
        this.delay = i2;
        this.easing = easing;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final int getDelay() {
        return this.delay;
    }

    public /* synthetic */ TweenSpec(int i, int i2, androidx.compose.animation.core.Easing easing, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing() : easing);
    }

    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedTweenSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        return new androidx.compose.animation.core.VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.TweenSpec)) {
            return false;
        }
        androidx.compose.animation.core.TweenSpec tweenSpec = (androidx.compose.animation.core.TweenSpec) other;
        return tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && kotlin.jvm.internal.Intrinsics.areEqual(tweenSpec.easing, this.easing);
    }

    public final int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }
}
