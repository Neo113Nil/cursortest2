package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Landroidx/compose/animation/Scale;", "", "", "scale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2-SzJe1aQ", "()J", "component2", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy-bnNdC4k", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Scale;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getScale", "J", "getTransformOrigin-SzJe1aQ", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Scale {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;
    private final float scale;
    private final long transformOrigin;

    private Scale(float f, long j, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.scale = f;
        this.transformOrigin = j;
        this.animationSpec = finiteAnimationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m1139getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scale(scale=");
        sb.append(this.scale);
        sb.append(", transformOrigin=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.TransformOrigin.m6376toStringimpl(this.transformOrigin));
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.scale) * 31) + androidx.compose.ui.graphics.TransformOrigin.m6375hashCodeimpl(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.Scale)) {
            return false;
        }
        androidx.compose.animation.Scale scale = (androidx.compose.animation.Scale) other;
        return java.lang.Float.compare(this.scale, scale.scale) == 0 && androidx.compose.ui.graphics.TransformOrigin.m6372equalsimpl0(this.transformOrigin, scale.transformOrigin) && kotlin.jvm.internal.Intrinsics.areEqual(this.animationSpec, scale.animationSpec);
    }

    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final androidx.compose.animation.Scale m1138copybnNdC4k(float scale, long transformOrigin, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec) {
        return new androidx.compose.animation.Scale(scale, transformOrigin, animationSpec, null);
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> component3() {
        return this.animationSpec;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    /* renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.Scale m1136copybnNdC4k$default(androidx.compose.animation.Scale scale, float f, long j, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = scale.scale;
        }
        if ((i & 2) != 0) {
            j = scale.transformOrigin;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m1138copybnNdC4k(f, j, finiteAnimationSpec);
    }

    public /* synthetic */ Scale(float f, long j, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, finiteAnimationSpec);
    }
}
