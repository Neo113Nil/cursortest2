package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Landroidx/compose/animation/Veil;", "", "Landroidx/compose/ui/graphics/Color;", "initialColor", "targetColor", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "", "matchParentSize", "<init>", "(JJLandroidx/compose/animation/core/FiniteAnimationSpec;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component4", "()Z", "copy-RFnl5yQ", "(JJLandroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/Veil;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getInitialColor-0d7_KjU", "getTargetColor-0d7_KjU", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "Z", "getMatchParentSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Veil {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> animationSpec;
    private final long initialColor;
    private final boolean matchParentSize;
    private final long targetColor;

    private Veil(long j, long j2, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> finiteAnimationSpec, boolean z) {
        this.initialColor = j;
        this.targetColor = j2;
        this.animationSpec = finiteAnimationSpec;
        this.matchParentSize = z;
    }

    /* renamed from: getInitialColor-0d7_KjU, reason: not valid java name */
    public final long m1171getInitialColor0d7_KjU() {
        return this.initialColor;
    }

    /* renamed from: getTargetColor-0d7_KjU, reason: not valid java name */
    public final long m1172getTargetColor0d7_KjU() {
        return this.targetColor;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Veil(initialColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.initialColor));
        sb.append(", targetColor=");
        sb.append((java.lang.Object) androidx.compose.ui.graphics.Color.m6004toStringimpl(this.targetColor));
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", matchParentSize=");
        sb.append(this.matchParentSize);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.initialColor) * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.targetColor)) * 31) + this.animationSpec.hashCode()) * 31) + java.lang.Boolean.hashCode(this.matchParentSize);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.Veil)) {
            return false;
        }
        androidx.compose.animation.Veil veil = (androidx.compose.animation.Veil) other;
        return androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.initialColor, veil.initialColor) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.targetColor, veil.targetColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.animationSpec, veil.animationSpec) && this.matchParentSize == veil.matchParentSize;
    }

    /* renamed from: copy-RFnl5yQ, reason: not valid java name */
    public final androidx.compose.animation.Veil m1170copyRFnl5yQ(long initialColor, long targetColor, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> animationSpec, boolean matchParentSize) {
        return new androidx.compose.animation.Veil(initialColor, targetColor, animationSpec, matchParentSize, null);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.graphics.Color> component3() {
        return this.animationSpec;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTargetColor() {
        return this.targetColor;
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getInitialColor() {
        return this.initialColor;
    }

    /* renamed from: copy-RFnl5yQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.Veil m1167copyRFnl5yQ$default(androidx.compose.animation.Veil veil, long j, long j2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = veil.initialColor;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = veil.targetColor;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            finiteAnimationSpec = veil.animationSpec;
        }
        androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        if ((i & 8) != 0) {
            z = veil.matchParentSize;
        }
        return veil.m1170copyRFnl5yQ(j3, j4, finiteAnimationSpec2, z);
    }

    public /* synthetic */ Veil(long j, long j2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, finiteAnimationSpec, z);
    }
}
