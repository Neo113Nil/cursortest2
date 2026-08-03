package androidx.compose.material;

/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "()V", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "StandardResistanceFactor", "StiffResistanceFactor", "VelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "getVelocityThreshold-D9Ej5fM", "()F", "F", "resistanceConfig", "Landroidx/compose/material/ResistanceConfig;", "anchors", "", "factorAtMin", "factorAtMax", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    public static final androidx.compose.material.SwipeableDefaults INSTANCE = new androidx.compose.material.SwipeableDefaults();
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> AnimationSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = androidx.compose.ui.unit.Dp.m4478constructorimpl(125);

    private SwipeableDefaults() {
    }

    public final androidx.compose.animation.core.SpringSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1520getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public static /* synthetic */ androidx.compose.material.ResistanceConfig resistanceConfig$default(androidx.compose.material.SwipeableDefaults swipeableDefaults, java.util.Set set, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f, f2);
    }

    public final androidx.compose.material.ResistanceConfig resistanceConfig(java.util.Set<java.lang.Float> anchors, float factorAtMin, float factorAtMax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        java.util.Set<java.lang.Float> set = anchors;
        java.lang.Float maxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) set);
        kotlin.jvm.internal.Intrinsics.checkNotNull(maxOrNull);
        float floatValue = maxOrNull.floatValue();
        java.lang.Float minOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) set);
        kotlin.jvm.internal.Intrinsics.checkNotNull(minOrNull);
        return new androidx.compose.material.ResistanceConfig(floatValue - minOrNull.floatValue(), factorAtMin, factorAtMax);
    }
}
