package com.paypal.oslo.core.navigation.scene.effect;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00130\u0015H\u0001¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"SheetNearBottomOpacityThreshold", "", "TopBarHeightDp", "L1ContentFadeThresholdFraction", "L1ContentTargetOpacity", "L1ContentOpacityFadeRate", "rememberGlowState", "Lcom/paypal/oslo/core/navigation/scene/effect/GlowState;", "initialSheetValue", "Landroidx/compose/material3/SheetValue;", "l1Expanded", "", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "estimatedFullDragRange", "statusBarHeightPx", "", "(Landroidx/compose/material3/SheetValue;ZLandroidx/compose/material3/BottomSheetScaffoldState;FILandroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/scene/effect/GlowState;", "MonitorL1ContentAlpha", "", "onAlphaUpdate", "Lkotlin/Function1;", "(Landroidx/compose/material3/BottomSheetScaffoldState;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "navigation_release", "targetOpacity", "isSheetHidden", "currentSheetOffset"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GlowStateManagerKt {
    public static final float SheetNearBottomOpacityThreshold = 0.98f;
    public static final float TopBarHeightDp = 56.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.paypal.oslo.core.navigation.scene.effect.GlowState rememberGlowState(androidx.compose.material3.SheetValue sheetValue, boolean z, androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, float f, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sheetValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetScaffoldState, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(238489081, i2, -1, "com.paypal.oslo.core.navigation.scene.effect.rememberGlowState (GlowStateManager.kt:105)");
        }
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        float f2 = sheetValue == androidx.compose.material3.SheetValue.Hidden ? 0.0f : 1.0f;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        boolean z2 = true;
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(sheetValue == androidx.compose.material3.SheetValue.Hidden), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        float getHighResolutionOutputSizeshNQ4ISI = sheetValue == androidx.compose.material3.SheetValue.Expanded ? i + (density.getGetHighResolutionOutputSizeshNQ4ISI() * 56.0f) : 0.0f;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(getHighResolutionOutputSizeshNQ4ISI);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.MutableFloatState mutableFloatState2 = (androidx.compose.runtime.MutableFloatState) rememberedValue3;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(z)) || (i2 & 48) == 32;
        com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$1$1 rememberedValue4 = composer.rememberedValue();
        if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$1$1(z, mutableState, mutableFloatState, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, (i2 >> 3) & 14);
        androidx.compose.material3.SheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
        boolean z4 = (((i2 & 896) ^ 384) > 256 && composer.changed(bottomSheetScaffoldState)) || (i2 & 384) == 256;
        if ((((i2 & 7168) ^ 3072) <= 2048 || !composer.changed(f)) && (i2 & 3072) != 2048) {
            z2 = false;
        }
        com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1 rememberedValue5 = composer.rememberedValue();
        if ((z4 | z2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$rememberGlowState$2$1(bottomSheetScaffoldState, f, mutableState, mutableFloatState, mutableFloatState2, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(bottomSheetState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer, 0);
        com.paypal.oslo.core.navigation.scene.effect.GlowState glowState = new com.paypal.oslo.core.navigation.scene.effect.GlowState(((java.lang.Boolean) mutableState.getValue()).booleanValue() ? 0.0f : mutableFloatState.getFloatValue(), mutableFloatState2.getFloatValue());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return glowState;
    }

    public static final void MonitorL1ContentAlpha(final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, final float f, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetScaffoldState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(82202524);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(bottomSheetScaffoldState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(82202524, i2, -1, "com.paypal.oslo.core.navigation.scene.effect.MonitorL1ContentAlpha (GlowStateManager.kt:199)");
            }
            androidx.compose.material3.SheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$MonitorL1ContentAlpha$1$1(bottomSheetScaffoldState, function1, f, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(bottomSheetState, java.lang.Float.valueOf(f), (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.effect.GlowStateManagerKt.$r8$lambda$1eZRjR0QshfBs1cKCUC1fLJAz7Y(androidx.compose.material3.BottomSheetScaffoldState.this, f, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1eZRjR0QshfBs1cKCUC1fLJAz7Y(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, float f, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        MonitorL1ContentAlpha(bottomSheetScaffoldState, f, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
