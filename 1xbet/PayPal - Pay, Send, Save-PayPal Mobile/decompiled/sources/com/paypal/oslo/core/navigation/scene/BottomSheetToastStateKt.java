package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"LocalBottomSheetToast", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/paypal/oslo/core/navigation/scene/BottomSheetToastState;", "getLocalBottomSheetToast", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "BottomSheetToastOverlay", "", "toastState", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/scene/BottomSheetToastState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BottomSheetToastStateKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.navigation.scene.BottomSheetToastState> getHighSpeedVideoFpsRanges = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.$r8$lambda$QkRMxOvc5eU1MGron34dIuzYNxE();
        }
    });

    public static /* synthetic */ com.paypal.oslo.core.navigation.scene.BottomSheetToastState $r8$lambda$QkRMxOvc5eU1MGron34dIuzYNxE() {
        return null;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<com.paypal.oslo.core.navigation.scene.BottomSheetToastState> getLocalBottomSheetToast() {
        return getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetToastOverlay(final com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetToastState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1386875678);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(bottomSheetToastState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1386875678, i3, -1, "com.paypal.oslo.core.navigation.scene.BottomSheetToastOverlay (BottomSheetToastState.kt:132)");
                }
                if (bottomSheetToastState.isVisible()) {
                    startRestartGroup.startReplaceGroup(1172219348);
                    java.lang.String message = bottomSheetToastState.getMessage();
                    com.paypal.pds.core.Icon leadingIcon = bottomSheetToastState.getLeadingIcon();
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(modifier3), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null);
                    boolean z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.$r8$lambda$KzF973zc1tj6DW9Kz911RN1SMcg(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.ToastKt.Toast(message, m1710paddingqDBjuR0$default, leadingIcon, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1172544352);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.$r8$lambda$N6_jQoVsDLMmt1Zv6sN8DjhltEE(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KzF973zc1tj6DW9Kz911RN1SMcg(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, boolean z) {
        if (!z) {
            bottomSheetToastState.dismiss();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N6_jQoVsDLMmt1Zv6sN8DjhltEE(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BottomSheetToastOverlay(bottomSheetToastState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
