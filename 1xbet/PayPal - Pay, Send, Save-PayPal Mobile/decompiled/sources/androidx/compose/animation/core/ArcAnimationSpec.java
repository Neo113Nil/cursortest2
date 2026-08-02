package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/animation/core/ArcAnimationSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/ArcMode;", "mode", "", "durationMillis", "delayMillis", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IIILandroidx/compose/animation/core/Easing;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getMode--9T-Mq4", "getDurationMillis", "getDelayMillis", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArcAnimationSpec<T> implements androidx.compose.animation.core.DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final androidx.compose.animation.core.Easing easing;
    private final int mode;

    private ArcAnimationSpec(int i, int i2, int i3, androidx.compose.animation.core.Easing easing) {
        this.mode = i;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.easing = easing;
    }

    public /* synthetic */ ArcAnimationSpec(int i, int i2, int i3, androidx.compose.animation.core.Easing easing, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? androidx.compose.animation.core.ArcMode.INSTANCE.m1196getArcBelow9TMq4() : i, (i4 & 2) != 0 ? 300 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing() : easing, null);
    }

    /* renamed from: getMode--9T-Mq4, reason: not valid java name and from getter */
    public final int getMode() {
        return this.mode;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        return new androidx.compose.animation.core.VectorizedKeyframesSpec(androidx.collection.IntListKt.intListOf(0, this.durationMillis), androidx.collection.IntObjectMapKt.emptyIntObjectMap(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.core.ArcAnimationSpec)) {
            return false;
        }
        androidx.compose.animation.core.ArcAnimationSpec arcAnimationSpec = (androidx.compose.animation.core.ArcAnimationSpec) other;
        if (androidx.compose.animation.core.ArcMode.m1191equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public final int hashCode() {
        int m1192hashCodeimpl = androidx.compose.animation.core.ArcMode.m1192hashCodeimpl(this.mode);
        return (((((m1192hashCodeimpl * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }

    public /* synthetic */ ArcAnimationSpec(int i, int i2, int i3, androidx.compose.animation.core.Easing easing, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, easing);
    }
}
