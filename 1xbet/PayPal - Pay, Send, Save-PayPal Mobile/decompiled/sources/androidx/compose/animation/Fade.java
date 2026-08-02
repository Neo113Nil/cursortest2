package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/compose/animation/Fade;", "", "", "alpha", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(FLandroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()F", "component2", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy", "(FLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Fade;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getAlpha", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Fade {
    public static final int $stable = 0;
    private final float alpha;
    private final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec;

    public Fade(float f, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec) {
        this.alpha = f;
        this.animationSpec = finiteAnimationSpec;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Fade(alpha=");
        sb.append(this.alpha);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.Fade)) {
            return false;
        }
        androidx.compose.animation.Fade fade = (androidx.compose.animation.Fade) other;
        return java.lang.Float.compare(this.alpha, fade.alpha) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.animationSpec, fade.animationSpec);
    }

    public final androidx.compose.animation.Fade copy(float alpha, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> animationSpec) {
        return new androidx.compose.animation.Fade(alpha, animationSpec);
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> component2() {
        return this.animationSpec;
    }

    /* renamed from: component1, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.animation.Fade copy$default(androidx.compose.animation.Fade fade, float f, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fade.alpha;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f, finiteAnimationSpec);
    }
}
