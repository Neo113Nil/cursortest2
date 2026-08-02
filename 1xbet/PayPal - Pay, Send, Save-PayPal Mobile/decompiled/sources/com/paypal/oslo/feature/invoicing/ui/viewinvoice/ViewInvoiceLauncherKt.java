package com.paypal.oslo.feature.invoicing.ui.viewinvoice;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;", "viewModel", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "webViewContent", "ViewInvoiceLauncher", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewInvoiceLauncherKt {
    public static final void ViewInvoiceLauncher(final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, final kotlin.jvm.functions.Function4<? super com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewInvoiceViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1071621649);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(featureGate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(viewInvoiceViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1071621649, i2, -1, "com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncher (ViewInvoiceLauncher.kt:46)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = java.lang.Boolean.valueOf(com.paypal.oslo.feature.invoicing.domain.extensions.InvoicingExtensionsKt.shouldUseViewInvoiceWebView(featureGate));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            if (((java.lang.Boolean) rememberedValue).booleanValue()) {
                startRestartGroup.startReplaceGroup(189086762);
                z = (i2 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt.m15581$r8$lambda$2iOfsNPpx94_6sLXc8SaAWyTYs(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function4.invoke(viewInvoiceViewModel, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, java.lang.Integer.valueOf(((i2 >> 6) & 14) | ((i2 >> 3) & 896)));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(189243684);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(viewInvoiceViewModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(context);
                z = (i2 & 112) == 32;
                com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt$ViewInvoiceLauncher$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt$ViewInvoiceLauncher$2$1(viewInvoiceViewModel, context, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt.$r8$lambda$AF7XR9Mle8EV7EjI6uZUkaE_ybc(com.paypal.oslo.core.remoteconfig.contract.FeatureGate.this, appNavigator, viewInvoiceViewModel, function4, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$2iOf-sNPpx94_6sLXc8SaAWyTYs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15581$r8$lambda$2iOfsNPpx94_6sLXc8SaAWyTYs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.invoicing.ui.viewinvoice.ViewInvoiceLauncherKt.$r8$lambda$a0BkEMs1_jB0IwTx2kHmLARqbfA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AF7XR9Mle8EV7EjI6uZUkaE_ybc(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, kotlin.jvm.functions.Function4 function4, int i, androidx.compose.runtime.Composer composer, int i2) {
        ViewInvoiceLauncher(featureGate, appNavigator, viewInvoiceViewModel, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a0BkEMs1_jB0IwTx2kHmLARqbfA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
