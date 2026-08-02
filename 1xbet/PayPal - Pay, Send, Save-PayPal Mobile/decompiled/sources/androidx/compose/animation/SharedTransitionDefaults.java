package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/animation/SharedTransitionDefaults;", "", "<init>", "()V", "Landroidx/compose/animation/BoundsTransform;", "BoundsTransform", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "SharedContentConfig"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedTransitionDefaults {
    public static final androidx.compose.animation.SharedTransitionDefaults INSTANCE = new androidx.compose.animation.SharedTransitionDefaults();
    private static final androidx.compose.animation.BoundsTransform BoundsTransform = new androidx.compose.animation.BoundsTransform() { // from class: androidx.compose.animation.SharedTransitionDefaults$$ExternalSyntheticLambda0
        @Override // androidx.compose.animation.BoundsTransform
        public final androidx.compose.animation.core.FiniteAnimationSpec createAnimationSpec(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
            return androidx.compose.animation.SharedTransitionDefaults.$r8$lambda$60K5NsVd9Wz7hdBJuml6wF5wr2k(rect, rect2);
        }
    };
    public static final int $stable = 8;

    private SharedTransitionDefaults() {
    }

    public final androidx.compose.animation.BoundsTransform getBoundsTransform() {
        return BoundsTransform;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/SharedTransitionDefaults$SharedContentConfig;", "Landroidx/compose/animation/SharedTransitionScope$SharedContentConfig;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SharedContentConfig implements androidx.compose.animation.SharedTransitionScope.SharedContentConfig {
        public static final int $stable = 0;
        public static final androidx.compose.animation.SharedTransitionDefaults.SharedContentConfig INSTANCE = new androidx.compose.animation.SharedTransitionDefaults.SharedContentConfig();

        private SharedContentConfig() {
        }
    }

    public static /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec $r8$lambda$60K5NsVd9Wz7hdBJuml6wF5wr2k(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        androidx.compose.animation.core.SpringSpec springSpec;
        springSpec = androidx.compose.animation.SharedTransitionScopeKt.getHighSpeedVideoFpsRangesFor;
        return springSpec;
    }
}
