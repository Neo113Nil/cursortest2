package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationViewModel;", "viewModel", "", "CheckoutAuthenticationScreen", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationViewModel;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutAuthenticationScreenKt {
    public static final void CheckoutAuthenticationScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, final com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.coroutines.Continuation continuation;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-749012351);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(checkoutAuthenticationContext) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(checkoutAuthenticationViewModel) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-749012351, i2, -1, "com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreen (CheckoutAuthenticationScreen.kt:42)");
            }
            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            boolean changedInstance = startRestartGroup.changedInstance(checkoutAuthenticationViewModel);
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$1$1(checkoutAuthenticationViewModel, rememberNavResultRequestId, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m15117invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m15117invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(checkoutAuthenticationViewModel);
            boolean z = (i2 & 14) == 4;
            boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
            boolean changedInstance3 = startRestartGroup.changedInstance(checkoutAuthenticationContext);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | z | changed2) || changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                continuation = null;
                str = rememberNavResultRequestId;
                composer2 = startRestartGroup;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$2$1(checkoutAuthenticationViewModel, appNavigator, rememberNavResultRequestId, checkoutAuthenticationContext, null);
                composer2.updateRememberedValue(rememberedValue3);
            } else {
                continuation = null;
                str = rememberNavResultRequestId;
                composer2 = startRestartGroup;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
            com.paypal.oslo.core.navigation.result.NavResultRequestId m11587boximpl = com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str);
            boolean changedInstance4 = composer2.changedInstance(checkoutAuthenticationViewModel);
            boolean changedInstance5 = composer2.changedInstance(checkoutAuthenticationContext);
            boolean changed3 = composer2.changed(str);
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if ((changedInstance4 | changedInstance5 | changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$CheckoutAuthenticationScreen$3$1(checkoutAuthenticationViewModel, checkoutAuthenticationContext, str, continuation);
                composer2.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(m11587boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationScreenKt.m15116$r8$lambda$R1gTZVo5otPPva5kj4BNoGlzjg(com.paypal.oslo.core.navigation.AppNavigator.this, checkoutAuthenticationContext, checkoutAuthenticationViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$R1gTZVo5ot-PPva5kj4BNoGlzjg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15116$r8$lambda$R1gTZVo5otPPva5kj4BNoGlzjg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        CheckoutAuthenticationScreen(appNavigator, checkoutAuthenticationContext, checkoutAuthenticationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
