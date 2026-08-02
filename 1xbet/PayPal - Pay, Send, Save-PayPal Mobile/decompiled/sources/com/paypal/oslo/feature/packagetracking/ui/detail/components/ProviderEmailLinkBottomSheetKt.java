package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"ProviderEmailLinkBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "image", "Landroidx/compose/ui/graphics/painter/Painter;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "onSecondary", "(Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ProviderEmailLinkBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease", "isLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProviderEmailLinkBottomSheetKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProviderEmailLinkBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final androidx.compose.ui.graphics.painter.Painter painter, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1141924032);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1141924032, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheet (ProviderEmailLinkBottomSheet.kt:42)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_settings_no_linked_accounts_label, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_settings_no_linked_accounts_sub_label, startRestartGroup, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_relinking_landing_page_privacy_text, startRestartGroup, 0);
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_action_link, startRestartGroup, 0);
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_bottom_sheet_more_options_button, startRestartGroup, 0);
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean z = (i2 & 896) == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt.m17559$r8$lambda$0QhnnrVdfR55qYA8XbEc92Mes(kotlin.jvm.functions.Function0.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean z2 = (i2 & 7168) == 2048;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt.m17561$r8$lambda$cy4weRUjb5rC3QMpnwjwMJA0U(kotlin.jvm.functions.Function0.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean z3 = (57344 & i2) == 16384;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt.$r8$lambda$VqziKB07nEEFwkhpvOXc9ftznnw(kotlin.jvm.functions.Function0.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt.PackageTrackingActionBottomSheet(bottomSheetController, stringResource, stringResource2, stringResource4, stringResource5, function04, function05, (kotlin.jvm.functions.Function0) rememberedValue4, painter, stringResource3, booleanValue, composer2, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14) | (androidx.compose.ui.graphics.painter.Painter.$stable << 24) | ((i2 << 21) & 234881024), 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt.$r8$lambda$CQpRtbkcWGjVLGE5w98xu486Jv8(com.paypal.pds.components.BottomSheetController.this, painter, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0Qhnn-rVdfR55qYA8XbEc92M-es, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17559$r8$lambda$0QhnnrVdfR55qYA8XbEc92Mes(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CQpRtbkcWGjVLGE5w98xu486Jv8(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProviderEmailLinkBottomSheet(bottomSheetController, painter, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Hc5zH8S91U9cPPGBQmMhM665j-o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17560$r8$lambda$Hc5zH8S91U9cPPGBQmMhM665jo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1414547029);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1414547029, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetPreview (ProviderEmailLinkBottomSheet.kt:76)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_gmail, startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ProviderEmailLinkBottomSheet(bottomSheetController, painterResource, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28032 | (androidx.compose.ui.graphics.painter.Painter.$stable << 3));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.ProviderEmailLinkBottomSheetKt.m17560$r8$lambda$Hc5zH8S91U9cPPGBQmMhM665jo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VqziKB07nEEFwkhpvOXc9ftznnw(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cy4weRUjb5-rC3QMpnw-jwMJA0U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17561$r8$lambda$cy4weRUjb5rC3QMpnwjwMJA0U(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
