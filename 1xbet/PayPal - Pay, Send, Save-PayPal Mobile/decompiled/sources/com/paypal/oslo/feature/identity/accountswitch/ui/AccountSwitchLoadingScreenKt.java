package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "targetId", "", "targetType", "targetName", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/AccountSwitchLoadingViewModel;", "viewModel", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "AccountSwitchLoadingScreen", "(Ljava/lang/String;ILjava/lang/String;Lcom/paypal/oslo/feature/identity/accountswitch/ui/AccountSwitchLoadingViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onAccountSwitch", "AccountSwitchLoadingScreenContent", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AccountSwitchLoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSwitchLoadingScreenKt {
    public static final void AccountSwitchLoadingScreen(final java.lang.String str, final int i, final java.lang.String str2, final com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSwitchLoadingViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(185355072);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(accountSwitchLoadingViewModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 16384 : 8192;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(185355072, i5, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreen (AccountSwitchLoadingScreen.kt:45)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            com.paypal.oslo.core.navigation.result.NavResultManager navResultManager = appNavigator.getNavResultManager();
            boolean changedInstance = startRestartGroup.changedInstance(accountSwitchLoadingViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$AccountSwitchLoadingScreen$1$1(accountSwitchLoadingViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            int i6 = com.paypal.oslo.core.navigation.result.NavResultManager.$stable << 3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, (i6 >> 3) & 14);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$AccountSwitchLoadingScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14996invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14996invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str3) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                        return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i6 & 896) | (i6 & 14) | 3072);
            boolean changedInstance2 = startRestartGroup.changedInstance(accountSwitchLoadingViewModel);
            boolean z = (i5 & 14) == 4;
            boolean z2 = (i5 & 112) == 32;
            boolean z3 = (i5 & 896) == 256;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | z | z2 | z3) || changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i4 = i5;
                composer2 = startRestartGroup;
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt.$r8$lambda$PFagICQEd_IDjMRXUJjveHfwml4(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.this, str, i, str2, rememberNavResultRequestId);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            } else {
                i4 = i5;
                composer2 = startRestartGroup;
            }
            AccountSwitchLoadingScreenContent(i, str2, (kotlin.jvm.functions.Function0) rememberedValue3, composer2, (i4 >> 3) & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt.m14995$r8$lambda$tcrG8lUvEFC3rIqJzLZXaEdu6c(str, i, str2, accountSwitchLoadingViewModel, appNavigator, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccountSwitchLoadingScreenContent(final int i, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1186029937);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1186029937, i4, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenContent (AccountSwitchLoadingScreen.kt:68)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean z = (i4 & 896) == 256;
            com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$AccountSwitchLoadingScreenContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$AccountSwitchLoadingScreenContent$1$1(function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit2;
                        unit2 = kotlin.Unit.INSTANCE;
                        return unit2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 54, 0);
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "loader"), null, null, null, startRestartGroup, 6, 14);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_switching_to, new java.lang.Object[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(i, startRestartGroup, i4 & 14)}, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i4 >> 3) & 14) | 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt.m14993$r8$lambda$9Dj7SRtCiMk9tUWSQhGbPGYxlA(i, str, function0, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AccountSwitchLoadingScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-198628058);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-198628058, i, -1, "com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenPreview (AccountSwitchLoadingScreen.kt:105)");
            }
            int i2 = com.paypal.oslo.feature.identity.R.string.feature_identity_account_switch_type_business;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AccountSwitchLoadingScreenContent(i2, "Max Gold Test SMB", (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingScreenKt.$r8$lambda$kBBblAoUYnLxamcCQaajDCd_7uI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$9Dj7SRt-CiMk9tUWSQhGbPGYxlA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14993$r8$lambda$9Dj7SRtCiMk9tUWSQhGbPGYxlA(int i, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSwitchLoadingScreenContent(i, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PFagICQEd_IDjMRXUJjveHfwml4(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        accountSwitchLoadingViewModel.m15000switchAccount1z4cvM0(str, i, str2, str3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kBBblAoUYnLxamcCQaajDCd_7uI(int i, androidx.compose.runtime.Composer composer, int i2) {
        AccountSwitchLoadingScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tcrG8lUvEFC3rIqJzL-ZXaEdu6c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14995$r8$lambda$tcrG8lUvEFC3rIqJzLZXaEdu6c(java.lang.String str, int i, java.lang.String str2, com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountSwitchLoadingScreen(str, i, str2, accountSwitchLoadingViewModel, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
