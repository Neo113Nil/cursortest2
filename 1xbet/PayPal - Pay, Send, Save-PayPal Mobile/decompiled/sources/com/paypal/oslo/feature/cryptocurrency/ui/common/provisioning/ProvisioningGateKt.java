package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"ProvisioningGateContent", "", "viewModel", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "cryptocurrency_prodRelease", "state", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/provisioning/ProvisioningGateState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisioningGateKt {
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProvisioningGateContent(final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        boolean z;
        int i3;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningGateViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2056923209);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(provisioningGateViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2056923209, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateContent (ProvisioningGate.kt:52)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(provisioningGateViewModel.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(provisioningGateViewModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$1$1(provisioningGateViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m13866invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m13866invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function22, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState provisioningGateState = (com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState) collectAsStateWithLifecycle.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(provisioningGateState, com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1501572425);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(provisioningGateState, com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1501665208);
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i2 >> 6) & 14));
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(provisioningGateState instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning)) {
                    composer2 = startRestartGroup;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(provisioningGateState, com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Error.INSTANCE)) {
                        composer2.startReplaceGroup(1502258641);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        z = (i2 & 112) == 32;
                        java.lang.Object rememberedValue3 = composer2.rememberedValue();
                        if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$3$1(appNavigator, null);
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
                        composer2.endReplaceGroup();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(provisioningGateState, com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Canceled.INSTANCE)) {
                        composer2.startReplaceGroup(1502435341);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        z = (i2 & 112) == 32;
                        java.lang.Object rememberedValue4 = composer2.rememberedValue();
                        if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$4$1(appNavigator, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1018267754);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    startRestartGroup.startReplaceGroup(1501765958);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                androidx.compose.runtime.MutableState mutableStateOf$default;
                                mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                                return mutableStateOf$default;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 48);
                    java.lang.String intent = ((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning) provisioningGateState).getIntent();
                    boolean changed = startRestartGroup.changed(mutableState);
                    z = (i2 & 112) == 32;
                    boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                    boolean changedInstance2 = startRestartGroup.changedInstance(provisioningGateState);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (((changed | z | changed2) || changedInstance2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i3 = 0;
                        composer3 = startRestartGroup;
                        rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1(mutableState, appNavigator, rememberNavResultRequestId, provisioningGateState, null);
                        composer3.updateRememberedValue(rememberedValue6);
                    } else {
                        i3 = 0;
                        composer3 = startRestartGroup;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(intent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer3, i3);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt.$r8$lambda$gLE3Gx_f41oHcQwdHqApl2O9kC4(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.this, appNavigator, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gLE3Gx_f41oHcQwdHqApl2O9kC4(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvisioningGateContent(provisioningGateViewModel, appNavigator, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
