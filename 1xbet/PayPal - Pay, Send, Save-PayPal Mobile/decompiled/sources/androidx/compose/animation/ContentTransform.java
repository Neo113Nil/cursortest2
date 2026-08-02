package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "Landroidx/compose/animation/EnterTransition;", "targetContentEnter", "Landroidx/compose/animation/ExitTransition;", "initialContentExit", "", "targetContentZIndex", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "<init>", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", "Landroidx/compose/animation/EnterTransition;", "getTargetContentEnter", "()Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "getInitialContentExit", "()Landroidx/compose/animation/ExitTransition;", "<set-?>", "targetContentZIndex$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getTargetContentZIndex", "()F", "setTargetContentZIndex", "(F)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/animation/SizeTransform;", "getSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "setSizeTransform$animation", "(Landroidx/compose/animation/SizeTransform;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public final void setSizeTransform$animation(androidx.compose.animation.SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }
}
