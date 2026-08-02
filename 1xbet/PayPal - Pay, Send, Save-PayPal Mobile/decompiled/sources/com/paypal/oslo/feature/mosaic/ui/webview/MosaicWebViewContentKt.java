package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n28\u0010\u0014\u001a4\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0010\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;", "state", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "destination", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;", "configurer", "Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;", "mosaicWebViewBuildUrl", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiEvent;", "", "onEvent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "Lkotlin/Function0;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "webViewContent", "MosaicWebViewContent", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUiState;Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewConfigurer;Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;", "uiModel", "createComplianceWebViewConfiguration", "(Lcom/paypal/oslo/feature/mosaic/ui/webview/mvi/ComplianceWebViewUIModel;Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicWebViewContentKt {
    public static final void MosaicWebViewContent(final com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState complianceWebViewUiState, final com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, final com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureWebViewConfigurer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicWebViewBuildUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(264382577);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(complianceWebViewUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(mosaicLegacyDestination) : startRestartGroup.changedInstance(mosaicLegacyDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(verificationCaptureWebViewConfigurer) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(mosaicWebViewBuildUrl) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function5) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(264382577, i2, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContent (MosaicWebViewContent.kt:64)");
            }
            if (complianceWebViewUiState instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Initial) {
                startRestartGroup.startReplaceGroup(668602325);
                startRestartGroup.endReplaceGroup();
            } else if (complianceWebViewUiState instanceof com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success) {
                startRestartGroup.startReplaceGroup(-748050819);
                com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success success = (com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.Success) complianceWebViewUiState;
                boolean changed = startRestartGroup.changed(success.getUiModel());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = verificationCaptureWebViewConfigurer.configure(createComplianceWebViewConfiguration(success.getUiModel(), mosaicWebViewBuildUrl, mosaicLegacyDestination, function1), appNavigator);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic web flow url request: ".concat(java.lang.String.valueOf(secureWebViewConfiguration.getUrlRequest())), null, null, 6, null);
                boolean z = (458752 & i2) == 131072;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt.$r8$lambda$us899PLkP1ON6YJcL5VPnSYyGsI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                function5.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i2 >> 9) & 7168)));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(668601314);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt.m15816$r8$lambda$wVlrJMBbBb_MOL74KZUPjdMs20(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState.this, mosaicLegacyDestination, appNavigator, verificationCaptureWebViewConfigurer, mosaicWebViewBuildUrl, function1, function5, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createComplianceWebViewConfiguration(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUIModel complianceWebViewUIModel, com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl, com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(complianceWebViewUIModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicWebViewBuildUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(mosaicWebViewBuildUrl.buildCipUrl(mosaicLegacyDestination), "mosaic-global-compliance", complianceWebViewUIModel.getRequiresAuth(), complianceWebViewUIModel.getBypassUrlValidation(), mosaicWebViewBuildUrl.additionalHttpHeaders(mosaicLegacyDestination)), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, complianceWebViewUIModel.getShowProgress(), complianceWebViewUIModel.getShowBackButton(), true, 3, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings("PayPalMobile", true), new com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("PayPalMobile", new com.paypal.oslo.feature.mosaic.ui.webview.jsInterface.MosaicJsInterface(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewContentKt.$r8$lambda$m6uWhoZrLf8hmHE13hNGhlAAwc4(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult) obj);
            }
        }))), null, 2, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(null, null, 3, null), 5, null);
    }

    /* renamed from: $r8$lambda$-wVlrJMBbBb_MOL74KZUPjdMs20, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15816$r8$lambda$wVlrJMBbBb_MOL74KZUPjdMs20(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiState complianceWebViewUiState, com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination mosaicLegacyDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewConfigurer verificationCaptureWebViewConfigurer, com.paypal.oslo.feature.mosaic.ui.webview.MosaicWebViewBuildUrl mosaicWebViewBuildUrl, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function5 function5, int i, androidx.compose.runtime.Composer composer, int i2) {
        MosaicWebViewContent(complianceWebViewUiState, mosaicLegacyDestination, appNavigator, verificationCaptureWebViewConfigurer, mosaicWebViewBuildUrl, function1, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m6uWhoZrLf8hmHE13hNGhlAAwc4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicLegacyNavResult, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic web flow completed", null, null, 6, null);
        function1.invoke(new com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.ProcessCompleted(mosaicLegacyNavResult));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$us899PLkP1ON6YJcL5VPnSYyGsI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.mosaic.ui.webview.mvi.ComplianceWebViewUiEvent.BackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
