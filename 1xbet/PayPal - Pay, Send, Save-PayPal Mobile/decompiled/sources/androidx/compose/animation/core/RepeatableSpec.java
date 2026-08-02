package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\b\b\u0001\u0010\u000f*\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "<init>", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getIterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "J", "getInitialStartOffset-Rmkjzm4", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RepeatableSpec<T> implements androidx.compose.animation.core.FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final int iterations;
    private final androidx.compose.animation.core.RepeatMode repeatMode;

    private RepeatableSpec(int i, androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
        this.iterations = i;
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j;
    }

    public final int getIterations() {
        return this.iterations;
    }

    public final androidx.compose.animation.core.DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public /* synthetic */ RepeatableSpec(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, durationBasedAnimationSpec, (i2 & 4) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode, (i2 & 8) != 0 ? androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null) : j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final androidx.compose.animation.core.RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name and from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    public /* synthetic */ RepeatableSpec(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, durationBasedAnimationSpec, (i2 & 4) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ RepeatableSpec(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode) {
        this(i, durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedFiniteAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        return new androidx.compose.animation.core.VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((androidx.compose.animation.core.TwoWayConverter) converter), this.repeatMode, this.initialStartOffset, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.RepeatableSpec)) {
            return false;
        }
        androidx.compose.animation.core.RepeatableSpec repeatableSpec = (androidx.compose.animation.core.RepeatableSpec) other;
        return repeatableSpec.iterations == this.iterations && kotlin.jvm.internal.Intrinsics.areEqual(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && androidx.compose.animation.core.StartOffset.m1221equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public final int hashCode() {
        int i = this.iterations;
        return (((((i * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + androidx.compose.animation.core.StartOffset.m1224hashCodeimpl(this.initialStartOffset);
    }

    public /* synthetic */ RepeatableSpec(int i, androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, durationBasedAnimationSpec, repeatMode, j);
    }
}
