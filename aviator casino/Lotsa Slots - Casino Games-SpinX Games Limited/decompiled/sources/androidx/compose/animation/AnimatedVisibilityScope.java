package androidx.compose.animation;

/* compiled from: AnimatedVisibility.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition$annotations", "()V", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "label", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    androidx.compose.ui.Modifier animateEnterExit(androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str);

    androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> getTransition();

    /* compiled from: AnimatedVisibility.kt */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ androidx.compose.ui.Modifier animateEnterExit$default(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
            }
            if ((i & 1) != 0) {
                enterTransition = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if ((i & 2) != 0) {
                exitTransition = androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            }
            if ((i & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }

        public static androidx.compose.ui.Modifier $default$animateEnterExit(final androidx.compose.animation.AnimatedVisibilityScope _this, androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final java.lang.String str) {
            return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("animateEnterExit");
                    inspectorInfo.getProperties().set("enter", androidx.compose.animation.EnterTransition.this);
                    inspectorInfo.getProperties().set("exit", exitTransition);
                    inspectorInfo.getProperties().set("label", str);
                }
            } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    return invoke(modifier2, composer, num.intValue());
                }

                public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                    composer.startReplaceableGroup(1840112047);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C678@37783L34:AnimatedVisibility.kt#xbi5r1");
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1840112047, i, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:678)");
                    }
                    androidx.compose.ui.Modifier then = modifier2.then(androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.AnimatedVisibilityScope.this.getTransition(), enterTransition, exitTransition, str, composer, 0));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return then;
                }
            });
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getTransition$annotations() {
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.Modifier animateEnterExit(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str) {
            return androidx.compose.animation.AnimatedVisibilityScope.CC.$default$animateEnterExit(animatedVisibilityScope, modifier, enterTransition, exitTransition, str);
        }
    }
}
