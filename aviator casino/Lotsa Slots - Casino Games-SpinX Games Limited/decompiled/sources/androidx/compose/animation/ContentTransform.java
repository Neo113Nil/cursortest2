package androidx.compose.animation;

/* compiled from: AnimatedContent.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "targetContentEnter", "Landroidx/compose/animation/EnterTransition;", "initialContentExit", "Landroidx/compose/animation/ExitTransition;", "targetContentZIndex", "", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", "getInitialContentExit", "()Landroidx/compose/animation/ExitTransition;", "<set-?>", "getSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "setSizeTransform$animation_release", "(Landroidx/compose/animation/SizeTransform;)V", "getTargetContentEnter", "()Landroidx/compose/animation/EnterTransition;", "getTargetContentZIndex", "()F", "setTargetContentZIndex", "(F)V", "targetContentZIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentTransform {
    public static final int $stable = 8;
    private final androidx.compose.animation.ExitTransition initialContentExit;
    private androidx.compose.animation.SizeTransform sizeTransform;
    private final androidx.compose.animation.EnterTransition targetContentEnter;

    /* renamed from: targetContentZIndex$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState targetContentZIndex;

    public ContentTransform(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, float f, androidx.compose.animation.SizeTransform sizeTransform) {
        this.targetContentEnter = enterTransition;
        this.initialContentExit = exitTransition;
        this.targetContentZIndex = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.sizeTransform = sizeTransform;
    }

    public final androidx.compose.animation.EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final androidx.compose.animation.ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    public /* synthetic */ ContentTransform(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, float f, androidx.compose.animation.SizeTransform sizeTransform, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransition, exitTransition, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? androidx.compose.animation.AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex.getFloatValue();
    }

    public final void setTargetContentZIndex(float f) {
        this.targetContentZIndex.setFloatValue(f);
    }

    public final androidx.compose.animation.SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    public final void setSizeTransform$animation_release(androidx.compose.animation.SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }
}
