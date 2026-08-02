package com.paypal.oslo.feature.taxfiling.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ap\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072C\b\u0002\u0010\b\u001a=\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000fH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u008a\u0084\u0002"}, d2 = {"TaxFilingScreen", "", "source", "", "onNavigateBack", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/taxfiling/ui/TaxFilingViewModel;", "secureWebViewContent", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "onBackClick", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/taxfiling/ui/TaxFilingViewModel;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "tax-filing_prodRelease", "currentOnNavigateBack"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TaxFilingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxFilingScreen(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel taxFilingViewModel, kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function42;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxFilingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(611964421);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(taxFilingViewModel) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function42 = function4;
            i3 |= startRestartGroup.changedInstance(function42) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    function42 = com.paypal.oslo.feature.taxfiling.ui.ComposableSingletons$TaxFilingScreenKt.INSTANCE.getLambda$1060504490$tax_filing_prodRelease();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(611964421, i3, -1, "com.paypal.oslo.feature.taxfiling.ui.TaxFilingScreen (TaxFilingScreen.kt:41)");
                }
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = taxFilingViewModel.getTaxFilingUrl(str);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.lang.String str2 = (java.lang.String) rememberedValue;
                boolean changed = startRestartGroup.changed(str2);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str2, "tax_filing", true, false, null, 24, null), null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, true, false, false, 11, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 102, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
                int i5 = i3 >> 3;
                final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, i5 & 14);
                boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxfiling.ui.TaxFilingScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taxfiling.ui.TaxFilingScreenKt.$r8$lambda$fHe4mtfv7Ptvs6CUfIFrvOgRL8M(androidx.compose.runtime.State.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                function42.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, java.lang.Integer.valueOf((i5 & 896) | com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function43 = function42;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxfiling.ui.TaxFilingScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxfiling.ui.TaxFilingScreenKt.$r8$lambda$R1AKhnNa0nRCaI2JSOnBdtw91SU(str, function0, taxFilingViewModel, function43, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function42 = function4;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R1AKhnNa0nRCaI2JSOnBdtw91SU(java.lang.String str, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.taxfiling.ui.TaxFilingViewModel taxFilingViewModel, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxFilingScreen(str, function0, taxFilingViewModel, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fHe4mtfv7Ptvs6CUfIFrvOgRL8M(androidx.compose.runtime.State state) {
        ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }
}
