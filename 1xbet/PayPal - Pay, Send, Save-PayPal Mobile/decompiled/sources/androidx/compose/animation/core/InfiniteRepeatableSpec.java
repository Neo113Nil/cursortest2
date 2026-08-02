package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "<init>", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "J", "getInitialStartOffset-Rmkjzm4", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements androidx.compose.animation.core.AnimationSpec<T> {
    public static final int $stable = 8;
    private final androidx.compose.animation.core.DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final androidx.compose.animation.core.RepeatMode repeatMode;

    private InfiniteRepeatableSpec(androidx.compose.animation.core.DurationBasedAnimationSpec<T> durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j;
    }

    public final androidx.compose.animation.core.DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    public /* synthetic */ InfiniteRepeatableSpec(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i & 2) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode, (i & 4) != 0 ? androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null) : j, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final androidx.compose.animation.core.RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name and from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    public /* synthetic */ InfiniteRepeatableSpec(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, (i & 2) != 0 ? androidx.compose.animation.core.RepeatMode.Restart : repeatMode);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ InfiniteRepeatableSpec(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, androidx.compose.animation.core.StartOffset.m1219constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        return new androidx.compose.animation.core.VectorizedInfiniteRepeatableSpec(this.animation.vectorize((androidx.compose.animation.core.TwoWayConverter) converter), this.repeatMode, this.initialStartOffset, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.InfiniteRepeatableSpec)) {
            return false;
        }
        androidx.compose.animation.core.InfiniteRepeatableSpec infiniteRepeatableSpec = (androidx.compose.animation.core.InfiniteRepeatableSpec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && androidx.compose.animation.core.StartOffset.m1221equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    public final int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + androidx.compose.animation.core.StartOffset.m1224hashCodeimpl(this.initialStartOffset);
    }

    public /* synthetic */ InfiniteRepeatableSpec(androidx.compose.animation.core.DurationBasedAnimationSpec durationBasedAnimationSpec, androidx.compose.animation.core.RepeatMode repeatMode, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(durationBasedAnimationSpec, repeatMode, j);
    }
}
