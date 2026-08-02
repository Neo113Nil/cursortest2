package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "noTransition", "()Landroidx/compose/animation/ContentTransform;", "", "durationMillis", "fadeTransition", "(I)Landroidx/compose/animation/ContentTransform;", "verticalSlideUpTransition", "verticalSlideDownTransition", "horizontalSlideInTransition", "horizontalSlideOutTransition"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppNavigationTransitionHelpersKt {
    public static /* synthetic */ int $r8$lambda$VjQFHi9YSFKbomrByApqwfpWKhI(int i) {
        return i;
    }

    public static /* synthetic */ int $r8$lambda$ZKHpldhhAPzbI3PVm38K_CH39Pg(int i) {
        return i;
    }

    /* renamed from: $r8$lambda$q7AhUw6_gomvbLVaWa6bMQ-x4lQ, reason: not valid java name */
    public static /* synthetic */ int m11627$r8$lambda$q7AhUw6_gomvbLVaWa6bMQx4lQ(int i) {
        return i;
    }

    public static /* synthetic */ int $r8$lambda$y2vMehRrccOszIkxqShCPA0kTnA(int i) {
        return i;
    }

    public static final androidx.compose.animation.ContentTransform noTransition() {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterTransition.INSTANCE.getNone(), androidx.compose.animation.ExitTransition.INSTANCE.getNone(), 0.0f, null, 12, null);
    }

    public static final androidx.compose.animation.ContentTransform fadeTransition(int i) {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), 0.0f, 2, null), 0.0f, null, 12, null);
    }

    public static final androidx.compose.animation.ContentTransform verticalSlideUpTransition(int i) {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.slideInVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt.m11627$r8$lambda$q7AhUw6_gomvbLVaWa6bMQx4lQ(((java.lang.Integer) obj).intValue()));
            }
        }).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), 0.0f, 2, null)), androidx.compose.animation.ExitTransition.INSTANCE.getNone(), 0.0f, null, 12, null);
    }

    public static final androidx.compose.animation.ContentTransform verticalSlideDownTransition(int i) {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterTransition.INSTANCE.getNone(), androidx.compose.animation.EnterExitTransitionKt.slideOutVertically(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt.$r8$lambda$y2vMehRrccOszIkxqShCPA0kTnA(((java.lang.Integer) obj).intValue()));
            }
        }).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), 0.0f, 2, null)), 0.0f, null, 12, null);
    }

    public static final androidx.compose.animation.ContentTransform horizontalSlideInTransition(int i) {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt.$r8$lambda$ZKHpldhhAPzbI3PVm38K_CH39Pg(((java.lang.Integer) obj).intValue()));
            }
        }), androidx.compose.animation.ExitTransition.INSTANCE.getNone(), 0.0f, null, 12, null);
    }

    public static final androidx.compose.animation.ContentTransform horizontalSlideOutTransition(int i) {
        return new androidx.compose.animation.ContentTransform(androidx.compose.animation.EnterTransition.INSTANCE.getNone(), androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, null, 6, null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(com.paypal.oslo.core.navigation.ui.AppNavigationTransitionHelpersKt.$r8$lambda$VjQFHi9YSFKbomrByApqwfpWKhI(((java.lang.Integer) obj).intValue()));
            }
        }), 0.0f, null, 12, null);
    }
}
