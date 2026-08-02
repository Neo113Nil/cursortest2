package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/carousel/SwipeableDefaults;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "resistanceConfig", "(Ljava/util/Set;FF)Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "StandardResistanceFactor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "StiffResistanceFactor", "Landroidx/compose/ui/unit/Dp;", "VelocityThreshold", "getVelocityThreshold-D9Ej5fM", "()F"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    public static final androidx.constraintlayout.compose.carousel.SwipeableDefaults INSTANCE = new androidx.constraintlayout.compose.carousel.SwipeableDefaults();
    private static final androidx.compose.animation.core.SpringSpec<java.lang.Float> AnimationSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = androidx.compose.ui.unit.Dp.m8601constructorimpl(125.0f);

    private SwipeableDefaults() {
    }

    public final androidx.compose.animation.core.SpringSpec<java.lang.Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m9051getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public static /* synthetic */ androidx.constraintlayout.compose.carousel.ResistanceConfig resistanceConfig$default(androidx.constraintlayout.compose.carousel.SwipeableDefaults swipeableDefaults, java.util.Set set, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f, f2);
    }

    public final androidx.constraintlayout.compose.carousel.ResistanceConfig resistanceConfig(java.util.Set<java.lang.Float> anchors, float factorAtMin, float factorAtMax) {
        if (anchors.size() <= 1) {
            return null;
        }
        java.util.Set<java.lang.Float> set = anchors;
        java.lang.Float maxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) set);
        kotlin.jvm.internal.Intrinsics.checkNotNull(maxOrNull);
        float floatValue = maxOrNull.floatValue();
        java.lang.Float minOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) set);
        kotlin.jvm.internal.Intrinsics.checkNotNull(minOrNull);
        return new androidx.constraintlayout.compose.carousel.ResistanceConfig(floatValue - minOrNull.floatValue(), factorAtMin, factorAtMax);
    }
}
