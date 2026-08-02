package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B.\u0012\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u000f\u001a\u00020\u00002\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Landroidx/compose/animation/Slide;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/unit/IntOffset;", "slideOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "component1", "()Lkotlin/jvm/functions/Function1;", "component2", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "copy", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Slide;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getSlideOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Slide {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> function1, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec) {
        this.slideOffset = function1;
        this.animationSpec = finiteAnimationSpec;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Slide(slideOffset=");
        sb.append(this.slideOffset);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.Slide)) {
            return false;
        }
        androidx.compose.animation.Slide slide = (androidx.compose.animation.Slide) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.slideOffset, slide.slideOffset) && kotlin.jvm.internal.Intrinsics.areEqual(this.animationSpec, slide.animationSpec);
    }

    public final androidx.compose.animation.Slide copy(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> slideOffset, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> animationSpec) {
        return new androidx.compose.animation.Slide(slideOffset, animationSpec);
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> component2() {
        return this.animationSpec;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntOffset> component1() {
        return this.slideOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ androidx.compose.animation.Slide copy$default(androidx.compose.animation.Slide slide, kotlin.jvm.functions.Function1 function1, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = slide.slideOffset;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(function1, finiteAnimationSpec);
    }
}
