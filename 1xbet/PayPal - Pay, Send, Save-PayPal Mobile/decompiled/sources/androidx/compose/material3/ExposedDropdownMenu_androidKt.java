package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0002\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0012H\u0002¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"platformWindowBoundsCalculator", "Landroidx/compose/material3/WindowBoundsCalculator;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/WindowBoundsCalculator;", "OnPlatformWindowBoundsChange", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "popupPropertiesForAnchorType", "Landroidx/compose/ui/window/PopupProperties;", "anchorType", "Landroidx/compose/material3/ExposedDropdownMenuAnchorType;", "alwaysFocusable", "", "popupPropertiesForAnchorType-BTG8-q0", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupProperties;", "SoftKeyboardListener", "view", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "onKeyboardVisibilityChange", "(Landroid/view/View;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getWindowBounds", "Landroidx/compose/ui/unit/IntRect;", "material3", "a11yServicesEnabled"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    public static final androidx.compose.material3.WindowBoundsCalculator platformWindowBoundsCalculator(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(703324275, i, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        java.lang.Object obj = (android.content.res.Configuration) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
        android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(view);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.material3.WindowBoundsCalculator(view);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.WindowBoundsCalculator windowBoundsCalculator = (androidx.compose.material3.WindowBoundsCalculator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return windowBoundsCalculator;
    }

    public static final void OnPlatformWindowBoundsChange(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1646555525);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1646555525, i2, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            getHighSpeedVideoFpsRangesFor((android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()), (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity()), function0, startRestartGroup, (i2 << 6) & 896);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ExposedDropdownMenu_androidKt.$r8$lambda$rDP9NO5nMqeMU3Kuj5tgydlTeUA(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: popupPropertiesForAnchorType-BTG8-q0, reason: not valid java name */
    public static final androidx.compose.ui.window.PopupProperties m3293popupPropertiesForAnchorTypeBTG8q0(java.lang.String str, boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(895018515, i, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        androidx.compose.runtime.State<java.lang.Boolean> rememberAccessibilityServiceState = androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, composer, 0, 7);
        int i2 = !rememberAccessibilityServiceState.getValue().booleanValue() ? 393248 : 393216;
        if ((androidx.compose.material3.ExposedDropdownMenuAnchorType.m3266equalsimpl0(str, androidx.compose.material3.ExposedDropdownMenuAnchorType.INSTANCE.m3270getPrimaryEditableoYjWRB4()) || (androidx.compose.material3.ExposedDropdownMenuAnchorType.m3266equalsimpl0(str, androidx.compose.material3.ExposedDropdownMenuAnchorType.INSTANCE.m3272getSecondaryEditableoYjWRB4()) && !rememberAccessibilityServiceState.getValue().booleanValue())) && !z) {
            i2 |= 8;
        }
        androidx.compose.ui.window.PopupProperties popupProperties = new androidx.compose.ui.window.PopupProperties(i2, false, false, false, false, false, 62, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    private static final void getHighSpeedVideoFpsRangesFor(final android.view.View view, final androidx.compose.ui.unit.Density density, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1319522472, i2, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(view);
            boolean z = (i2 & 896) == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.ExposedDropdownMenu_androidKt.$r8$lambda$OAUiwD0xMakid_BGtQYJivcOliI(view, function0, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(view, density, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i2 & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.ExposedDropdownMenu_androidKt.$r8$lambda$FNwlpPlEDQBiNENpkI0y5p3iumE(view, density, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FNwlpPlEDQBiNENpkI0y5p3iumE(android.view.View view, androidx.compose.ui.unit.Density density, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(view, density, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$OAUiwD0xMakid_BGtQYJivcOliI(android.view.View view, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, function0);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this.dispose();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rDP9NO5nMqeMU3Kuj5tgydlTeUA(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        OnPlatformWindowBoundsChange(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ androidx.compose.ui.unit.IntRect access$getWindowBounds(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return androidx.compose.ui.graphics.RectHelper_androidKt.toComposeIntRect(rect);
    }
}
