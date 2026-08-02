package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;", "request", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "PartnerInitiatedProvisionFlowUi", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PartnerInitiatedProvisionFlowUiKt {
    public static final void PartnerInitiatedProvisionFlowUi(final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated partnerInitiated, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerInitiated, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2057977552);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(partnerInitiated) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2057977552, i2, -1, "com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUi (PartnerInitiatedProvisionFlowUi.kt:35)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(rememberNavResultRequestId);
            boolean z = (i2 & 112) == 32;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changedInstance = startRestartGroup.changedInstance(partnerInitiated);
            com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$1$1(appNavigator, rememberNavResultRequestId, partnerInitiated, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(m11587boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$2$1(null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$PartnerInitiatedProvisionFlowUi$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m20714invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20714invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.amexandp3.ui.PartnerInitiatedProvisionFlowUiKt.m20713$r8$lambda$h4QumCZNcI4gV0OKVE7lJchZfI(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$h4QumCZNcI4gV0OKVE7lJchZ-fI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20713$r8$lambda$h4QumCZNcI4gV0OKVE7lJchZfI(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated partnerInitiated, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        PartnerInitiatedProvisionFlowUi(partnerInitiated, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
