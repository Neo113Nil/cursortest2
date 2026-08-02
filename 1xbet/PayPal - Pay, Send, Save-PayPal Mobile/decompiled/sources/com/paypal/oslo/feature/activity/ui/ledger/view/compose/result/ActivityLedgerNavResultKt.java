package com.paypal.oslo.feature.activity.ui.ledger.view.compose.result;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "activityLedgerViewModel", "", "SetActivityLedgerResultEffect", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;I)V", "viewModel", "reloadActivityLedgerBasedOnState", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerNavResultKt {
    public static final void SetActivityLedgerResultEffect(final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(664901051);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityLedgerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(664901051, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.SetActivityLedgerResultEffect (ActivityLedgerNavResult.kt:25)");
            }
            java.lang.String navActivityDetailRequestId = activityLedgerViewModel.getNavActivityDetailRequestId();
            boolean changedInstance = startRestartGroup.changedInstance(activityLedgerViewModel);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$1$1(activityLedgerViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m11891invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m11891invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(navActivityDetailRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            java.lang.String navActivitySearchRequestId = activityLedgerViewModel.getNavActivitySearchRequestId();
            boolean changedInstance2 = startRestartGroup.changedInstance(activityLedgerViewModel);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$2$1(activityLedgerViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffectrtGRyWw$2 rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffect-rtGRyWw$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m11892invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m11892invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(navActivitySearchRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
            java.lang.String navPackageTrackingRequestId = activityLedgerViewModel.getNavPackageTrackingRequestId();
            boolean changedInstance3 = startRestartGroup.changedInstance(activityLedgerViewModel);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1(activityLedgerViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffectrtGRyWw$3 rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$$inlined$NavResultEffect-rtGRyWw$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m11893invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m11893invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(navPackageTrackingRequestId, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt.m11890$r8$lambda$4lDfTDykKbBTKWOPDimOWNx3ns(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void reloadActivityLedgerBasedOnState(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        activityLedgerViewModel.processEvent$activity_prodRelease(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent(com.paypal.oslo.feature.activity.ui.ledger.model.extensions.ActivityLedgerViewModelExtensionsKt.getCurrentFilterTypeFromState(activityLedgerViewModel)));
    }

    /* renamed from: $r8$lambda$4lDfTDykKbBTKWOPDimO-WNx3ns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11890$r8$lambda$4lDfTDykKbBTKWOPDimOWNx3ns(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        SetActivityLedgerResultEffect(activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleActivityNavResult(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult activityNavResult, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult navResults = activityNavResult.getNavResults();
        if (navResults.getNavResultOptions().getActions() == -1 && navResults.getNavResultOptions().isRefreshRequired()) {
            reloadActivityLedgerBasedOnState(activityLedgerViewModel);
        }
    }
}
