package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "amazonTrackingEnabled", "isLoading", "Lkotlin/Function1;", "", "onToggle", "Lkotlin/Function0;", "onDismiss", "AmazonTrackingPreferencesDetailBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmazonTrackingPreferencesDetailBottomSheetKt {
    public static final void AmazonTrackingPreferencesDetailBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.Boolean bool, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1825591140);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1825591140, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheet (AmazonTrackingPreferencesDetailBottomSheet.kt:40)");
            }
            final boolean booleanValue = bool != null ? bool.booleanValue() : true;
            if (booleanValue) {
                startRestartGroup.startReplaceGroup(-984902050);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_turn_off_tracking_label, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-984800897);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_turn_on_tracking_label, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str = stringResource;
            if (booleanValue) {
                startRestartGroup.startReplaceGroup(-984669023);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_turn_off_description, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-984570846);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_turn_on_description, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_tracking_preferences_title, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_action_cancel, startRestartGroup, 0);
            boolean z2 = (i2 & 7168) == 2048;
            boolean changed = startRestartGroup.changed(booleanValue);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt.$r8$lambda$VTeZSyexPuk7GRKGKtbX15dbU2E(kotlin.jvm.functions.Function1.this, booleanValue);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z3 = (57344 & i2) == 16384;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt.m17535$r8$lambda$4HjlNpPlXnwskc7R_JmFXwT_sY(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingConfirmationBottomSheetKt.PackageTrackingConfirmationBottomSheet(bottomSheetController, stringResource3, stringResource2, str, stringResource4, function02, (kotlin.jvm.functions.Function0) rememberedValue2, null, z, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14) | ((i2 << 18) & 234881024), 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt.$r8$lambda$8MJGTECKtmK1XXuI8GUlI4Rm1YA(com.paypal.pds.components.BottomSheetController.this, bool, z, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4HjlNpPl-Xnwskc7R_JmFXwT_sY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17535$r8$lambda$4HjlNpPlXnwskc7R_JmFXwT_sY(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6UYNRvJf1p86920rx8oAIeGSHZc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1366419298);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1366419298, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetOnPreview (AmazonTrackingPreferencesDetailBottomSheet.kt:71)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AmazonTrackingPreferencesDetailBottomSheet(bottomSheetController, java.lang.Boolean.TRUE, false, function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt.$r8$lambda$6UYNRvJf1p86920rx8oAIeGSHZc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8MJGTECKtmK1XXuI8GUlI4Rm1YA(com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.Boolean bool, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AmazonTrackingPreferencesDetailBottomSheet(bottomSheetController, bool, z, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CedR1-jxydb3w-9bTbGqHwtu2Nc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17536$r8$lambda$CedR1jxydb3w9bTbGqHwtu2Nc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(166154934);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(166154934, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetOffPreview (AmazonTrackingPreferencesDetailBottomSheet.kt:85)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AmazonTrackingPreferencesDetailBottomSheet(bottomSheetController, java.lang.Boolean.FALSE, false, function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.AmazonTrackingPreferencesDetailBottomSheetKt.m17536$r8$lambda$CedR1jxydb3w9bTbGqHwtu2Nc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VTeZSyexPuk7GRKGKtbX15dbU2E(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }
}
