package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedSpringSpec;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDampingRatio", "()F", "getStiffness", "Ljava/lang/Object;", "getVisibilityThreshold", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringSpec<T> implements androidx.compose.animation.core.FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    public SpringSpec(float f, float f2, T t) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = t;
    }

    public /* synthetic */ SpringSpec(float f, float f2, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final <V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.VectorizedSpringSpec<V> vectorize(androidx.compose.animation.core.TwoWayConverter<T, V> converter) {
        androidx.compose.animation.core.AnimationVector Camera2StreamConfigurationMap;
        float f = this.dampingRatio;
        float f2 = this.stiffness;
        Camera2StreamConfigurationMap = androidx.compose.animation.core.AnimationSpecKt.Camera2StreamConfigurationMap(converter, this.visibilityThreshold);
        return new androidx.compose.animation.core.VectorizedSpringSpec<>(f, f2, Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.SpringSpec)) {
            return false;
        }
        androidx.compose.animation.core.SpringSpec springSpec = (androidx.compose.animation.core.SpringSpec) other;
        return springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && kotlin.jvm.internal.Intrinsics.areEqual(springSpec.visibilityThreshold, this.visibilityThreshold);
    }

    public final int hashCode() {
        T t = this.visibilityThreshold;
        return ((((t != null ? t.hashCode() : 0) * 31) + java.lang.Float.hashCode(this.dampingRatio)) * 31) + java.lang.Float.hashCode(this.stiffness);
    }

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }
}
