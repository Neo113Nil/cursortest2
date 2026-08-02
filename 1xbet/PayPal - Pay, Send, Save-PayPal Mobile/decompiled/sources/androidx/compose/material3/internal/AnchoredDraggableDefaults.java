package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/core/SpringSpec;", "", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.AnchoredDraggableDefaults INSTANCE = new androidx.compose.material3.internal.AnchoredDraggableDefaults();
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> AnimationSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, null, 7, null);

    private AnchoredDraggableDefaults() {
    }

    public final androidx.compose.animation.core.SpringSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }
}
