package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a:\u0010\f\u001a%\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation3/scene/Scene;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "defaultTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "defaultPopTransitionSpec", "Lkotlin/Function2;", "", "defaultPredictivePopTransitionSpec", "()Lkotlin/jvm/functions/Function2;", "DEFAULT_TRANSITION_DURATION_MILLISECOND", com.visa.cbp.getEncExpo.warmup}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/navigation3/ui/NavDisplayKt")
/* loaded from: classes.dex */
final /* synthetic */ class NavDisplayKt__NavDisplay_androidKt {
    public static /* synthetic */ androidx.compose.animation.ContentTransform getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null), 0.0f, null, 12, null);
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform getHighSpeedVideoSizes() {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.spring$default(1.0f, 1600.0f, null, 4, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.m1129scaleOutL8ZKhE$default(null, 0.7f, 0L, 5, null), 0.0f, null, 12, null);
    }

    public static /* synthetic */ androidx.compose.animation.ContentTransform getHighSpeedVideoFpsRanges() {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null), 0.0f, null, 12, null);
    }

    public static final <T> kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> defaultTransitionSpec() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
    }

    public static final <T> kotlin.jvm.functions.Function2<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, java.lang.Integer, androidx.compose.animation.ContentTransform> defaultPredictivePopTransitionSpec() {
        return new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.getHighSpeedVideoSizes();
            }
        };
    }

    public static final <T> kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<T>>, androidx.compose.animation.ContentTransform> defaultPopTransitionSpec() {
        return new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.navigation3.ui.NavDisplayKt__NavDisplay_androidKt.getHighSpeedVideoFpsRanges();
            }
        };
    }
}
