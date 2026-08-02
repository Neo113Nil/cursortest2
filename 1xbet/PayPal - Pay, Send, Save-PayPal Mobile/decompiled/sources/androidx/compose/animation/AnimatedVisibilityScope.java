package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "", "label", "animateEnterExit", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "transition"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AnimatedVisibilityScope {
    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier animateEnterExit(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str) {
            return androidx.compose.animation.AnimatedVisibilityScope.super.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
    }

    static /* synthetic */ androidx.compose.ui.Modifier animateEnterExit$default(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }
        if ((i & 1) != 0) {
            enterTransition = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        }
        if ((i & 2) != 0) {
            exitTransition = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        }
        if ((i & 4) != 0) {
            str = "animateEnterExit";
        }
        return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
    }

    default androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final java.lang.String str) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("animateEnterExit");
                inspectorInfo.getProperties().set("enter", androidx.compose.animation.EnterTransition.this);
                inspectorInfo.getProperties().set(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, exitTransition);
                inspectorInfo.getProperties().set("label", str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return getHighSpeedVideoFpsRangesFor(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceGroup(1840112047);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
                }
                androidx.compose.ui.Modifier then = modifier2.then(androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.AnimatedVisibilityScope.this.getTransition(), enterTransition, exitTransition, null, str, composer, 0, 4));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        });
    }
}
