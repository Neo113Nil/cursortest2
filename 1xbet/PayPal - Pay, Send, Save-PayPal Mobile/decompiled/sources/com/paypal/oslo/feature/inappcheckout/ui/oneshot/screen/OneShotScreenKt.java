package com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"OneShotScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "authenticationXOResponse", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/viewmodel/OneShotViewModel;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/viewmodel/OneShotViewModel;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotScreenKt {
    public static final void OneShotScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, final com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        androidx.compose.runtime.Composer composer3;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1126620757);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(authenticationXOResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(oneShotViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(checkoutLogger) : startRestartGroup.changedInstance(checkoutLogger) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1126620757, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreen (OneShotScreen.kt:52)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(oneShotViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(oneShotViewModel);
            boolean changedInstance2 = startRestartGroup.changedInstance(authenticationXOResponse);
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1(oneShotViewModel, authenticationXOResponse, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m15542invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m15542invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(oneShotViewModel);
            boolean z = (i2 & 14) == 4;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean z2 = (i2 & 7168) == 2048 || ((i2 & 4096) != 0 && startRestartGroup.changedInstance(checkoutLogger));
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z2 || (changed | changedInstance3 | z)) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i3 = 1;
                composer3 = startRestartGroup;
                rememberedValue3 = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$2$1(oneShotViewModel, inAppCheckoutCoordinator, rememberNavResultRequestId, checkoutLogger, null);
                composer3.updateRememberedValue(rememberedValue3);
            } else {
                composer3 = startRestartGroup;
                i3 = 1;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer3, 6);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance4 = composer3.changedInstance(oneShotViewModel);
            boolean changedInstance5 = composer3.changedInstance(authenticationXOResponse);
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$3$1 rememberedValue4 = composer3.rememberedValue();
            if ((changedInstance4 || changedInstance5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                obj = null;
                rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$3$1(oneShotViewModel, authenticationXOResponse, null);
                composer3.updateRememberedValue(rememberedValue4);
            } else {
                obj = null;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer3, 6);
            android.content.Context context = (android.content.Context) composer3.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            composer2 = composer3;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, obj), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 54, 2), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.ONESHOT_SCREEN_ROOT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State) collectAsStateWithLifecycle.getValue()).isAuthenticating() || ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State) collectAsStateWithLifecycle.getValue()).isRetrying()) {
                composer2.startReplaceGroup(-1159723872);
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(java.lang.Integer.valueOf(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_paypal_loading), null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.PAYPAL_LOADING_GIF), null, null, null, composer2, 432, 56);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_loading_setting_things_up, new java.lang.Object[0], composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.SETTING_THINGS_UP_TEXT), com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer2, 384, 6, 1016);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1159065587);
                composer2.endReplaceGroup();
            }
            if (((com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State) collectAsStateWithLifecycle.getValue()).getError() == null) {
                composer2.startReplaceGroup(-1159033503);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1159033502);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_oneshot_landing_error_message, new java.lang.Object[0], composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.ERROR_TEXT), null, null, null, null, false, 0, 0, null, null, composer2, 48, 0, 2044);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt.$r8$lambda$Di8iG94UDQ_VkV2c7WMRslkk5yc(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, authenticationXOResponse, oneShotViewModel, checkoutLogger, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Di8iG94UDQ_VkV2c7WMRslkk5yc(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, int i, androidx.compose.runtime.Composer composer, int i2) {
        OneShotScreen(inAppCheckoutCoordinator, authenticationXOResponse, oneShotViewModel, checkoutLogger, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
