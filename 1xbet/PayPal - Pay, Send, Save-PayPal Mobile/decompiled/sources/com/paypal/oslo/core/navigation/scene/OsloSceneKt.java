package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"L1SheetFallbackHeightFraction", "", "AnimationEffectSpacing", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "insetsAwareMaxHeight", "Landroidx/compose/ui/Modifier;", "fraction", "statusBarHeightPx", "", "isFullscreen", "", "navigation_release", "animatedInsetOffset"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OsloSceneKt {
    private static final float getHighSpeedVideoSizes = com.paypal.pds.core.ConstantsKt.getSpacing12();

    public static /* synthetic */ androidx.compose.ui.Modifier insetsAwareMaxHeight$default(androidx.compose.ui.Modifier modifier, float f, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return insetsAwareMaxHeight(modifier, f, i, z);
    }

    public static final androidx.compose.ui.Modifier insetsAwareMaxHeight(androidx.compose.ui.Modifier modifier, final float f, final int i, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.navigation.scene.OsloSceneKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.core.navigation.scene.OsloSceneKt.$r8$lambda$Bj3kJX9R_yvLl8xhl2hqb6JC_9A(z, i, f, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$Bj3kJX9R_yvLl8xhl2hqb6JC_9A(final boolean z, final int i, final float f, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-1043003915);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1043003915, i2, -1, "com.paypal.oslo.core.navigation.scene.insetsAwareMaxHeight.<anonymous> (OsloScene.kt:936)");
        }
        final androidx.compose.runtime.State<java.lang.Integer> animateIntAsState = androidx.compose.animation.core.AnimateAsStateKt.animateIntAsState(z ? 0 : ((int) ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(getHighSpeedVideoSizes)) + i, androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), "Inset offset", null, composer, 384, 8);
        boolean changed = composer.changed(animateIntAsState);
        boolean changed2 = composer.changed(z);
        boolean changed3 = composer.changed(f);
        boolean changed4 = composer.changed(i);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | changed3 | changed4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.core.navigation.scene.OsloSceneKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.core.navigation.scene.OsloSceneKt.$r8$lambda$qSH14DdwrXMCnXffrMmJeUY2jNo(z, f, i, animateIntAsState, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, (kotlin.jvm.functions.Function3) rememberedValue);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return layout;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pA7o31z72LC0bRtp3g65IrDbFJg(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementScope, "");
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$qSH14DdwrXMCnXffrMmJeUY2jNo(boolean z, float f, int i, androidx.compose.runtime.State state, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        long getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurable, "");
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        int intValue = ((java.lang.Number) state.getValue()).intValue();
        if (!z && i <= 0) {
            f = 0.9f;
        }
        int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast((int) ((m8553getMaxHeightimpl - intValue) * f), 0);
        if (!androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) || coerceAtLeast <= 0) {
            getHighSpeedVideoFpsRangesFor = constraints.getGetHighSpeedVideoFpsRangesFor();
        } else {
            getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), 0, 0, 0, kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceAtMost(coerceAtLeast, androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())), 7, null);
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(getHighSpeedVideoFpsRangesFor);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.scene.OsloSceneKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.scene.OsloSceneKt.$r8$lambda$pA7o31z72LC0bRtp3g65IrDbFJg(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }
}
