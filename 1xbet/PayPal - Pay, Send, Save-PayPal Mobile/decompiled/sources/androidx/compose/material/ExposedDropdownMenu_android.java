package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/material/WindowBoundsCalculator;", "platformWindowBoundsCalculator", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/WindowBoundsCalculator;", "Lkotlin/Function0;", "", "block", "OnPlatformWindowBoundsChange", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExposedDropdownMenu_android {
    public static final androidx.compose.material.WindowBoundsCalculator platformWindowBoundsCalculator(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1216067952, i, -1, "androidx.compose.material.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:35)");
        }
        android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(view);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material.WindowBoundsCalculator(view);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material.WindowBoundsCalculator windowBoundsCalculator = (androidx.compose.material.WindowBoundsCalculator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return windowBoundsCalculator;
    }

    public static final void OnPlatformWindowBoundsChange(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1063434120);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1063434120, i2, -1, "androidx.compose.material.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:41)");
            }
            final android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            boolean changedInstance = startRestartGroup.changedInstance(view);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_android$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.ExposedDropdownMenu_android.$r8$lambda$yi8cNgybtZQSrXMV3kwBX1FusLA(view, function0, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(view, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenu_android$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.ExposedDropdownMenu_android.$r8$lambda$JHL7m63ShoOkL6QwUEAl3TNJpCM(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JHL7m63ShoOkL6QwUEAl3TNJpCM(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnPlatformWindowBoundsChange(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$yi8cNgybtZQSrXMV3kwBX1FusLA(android.view.View view, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.compose.material.OnGlobalLayoutListener onGlobalLayoutListener = new androidx.compose.material.OnGlobalLayoutListener(view, function0);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenu_android$OnPlatformWindowBoundsChange$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material.OnGlobalLayoutListener onGlobalLayoutListener2 = androidx.compose.material.OnGlobalLayoutListener.this;
                if (onGlobalLayoutListener2.getHighResolutionOutputSizeshNQ4ISI) {
                    onGlobalLayoutListener2.getHighSpeedVideoFpsRanges.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                    onGlobalLayoutListener2.getHighResolutionOutputSizeshNQ4ISI = false;
                }
                onGlobalLayoutListener2.getHighSpeedVideoFpsRanges.removeOnAttachStateChangeListener(onGlobalLayoutListener2);
            }
        };
    }

    public static final /* synthetic */ androidx.compose.ui.unit.IntRect access$getWindowBounds(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return androidx.compose.ui.graphics.RectHelper_androidKt.toComposeIntRect(rect);
    }
}
