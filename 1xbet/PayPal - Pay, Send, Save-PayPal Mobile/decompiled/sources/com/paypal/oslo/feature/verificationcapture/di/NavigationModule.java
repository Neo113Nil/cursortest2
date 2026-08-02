package com.paypal.oslo.feature.verificationcapture.di;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;", "widgetFactoryProvider", "Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;", "webViewDelegate", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideIdScanEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetFactory$Provider;Lcom/paypal/oslo/feature/verificationcapture/api/webview/VerificationCaptureWebViewDelegate;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.verificationcapture.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideIdScanEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetFactory.Provider widgetFactoryProvider, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate webViewDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetFactoryProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDelegate, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$WuSgR6gjcwzmp2nSawibGCtSL4w(com.paypal.oslo.core.navigation.AppNavigator.this, webViewDelegate, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentCaptureDestination, "");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(documentCaptureDestination) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-786206905, i2, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:103)");
            }
            java.lang.String documentType = documentCaptureDestination.getDocumentType();
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN;
            try {
                documentType2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.valueOf(documentType);
            } catch (java.lang.IllegalArgumentException e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                java.lang.String concat = "[NavigationModule] Unknown document type, using ".concat(java.lang.String.valueOf(documentType2.name()));
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("provided_value", documentType);
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                pairArr[1] = kotlin.TuplesKt.to("error", message);
                com.paypal.android.logger.Logger.w$default(logger, concat, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType3 = documentType2;
            java.lang.String documentSide = documentCaptureDestination.getDocumentSide();
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
            try {
                documentSide2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.valueOf(documentSide);
                z = true;
            } catch (java.lang.IllegalArgumentException e2) {
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                java.lang.String concat2 = "[NavigationModule] Unknown document side, using ".concat(java.lang.String.valueOf(documentSide2.name()));
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("provided_value", documentSide);
                java.lang.String message2 = e2.getMessage();
                z = true;
                pairArr2[1] = kotlin.TuplesKt.to("error", message2 != null ? message2 : "unknown");
                com.paypal.android.logger.Logger.w$default(logger2, concat2, kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide3 = documentSide2;
            com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale = documentCaptureDestination.getLocale();
            boolean z2 = (i2 & 14) == 4 ? z : false;
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$RF6pskeW5J5TWPcWtBp0TARsW1c(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination.this, appNavigator, (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20612$r8$lambda$pHTXUqyu3W2G9555r1KzfAc6M(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.screen.DocumentCaptureScreenKt.DocumentCaptureScreen(documentType3, documentSide3, locale, null, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 72);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-s12KCZzwsqGwEjY_oTeGNYoFJY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20606$r8$lambda$s12KCZzwsqGwEjY_oTeGNYoFJY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$hXMzpCVwvLyzpMlx5AFs2mumoQY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$26Y38MVxJek7qeMFZPZPmITjE3E(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2dJdOgTKXswh7DerZSoz3hnBSMM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$Ma3Ov_qKVz2z3cmxU3_s8KV8meI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$30jkPcrzKrllaVDhmSYUAiDEJ6s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$jzx9So4iK00NDohIzgeZ0bJIpQY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5qVtAj5_ICxwFFPrj4XDhvpUbeM(byte[] bArr, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success(bArr, documentCaptureDestination.getDocumentType(), documentCaptureDestination.getDocumentSide(), ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) captureResult).getCaptureData().getDocumentDetectionScore(), 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, 4064, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$6Sydnp_SJ5hhDU6OZhLEn1bWx8c(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate, androidx.navigation3.runtime.EntryProviderScope entryProviderScope, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination verificationCaptureOrchestratorDestination, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext;
        com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureOrchestratorDestination, "");
        int i2 = (i & 6) == 0 ? i | ((i & 8) == 0 ? composer.changed(verificationCaptureOrchestratorDestination) : composer.changedInstance(verificationCaptureOrchestratorDestination) ? 4 : 2) : i;
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-708570726, i2, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:218)");
            }
            if (verificationCaptureOrchestratorDestination.isWebFlow()) {
                java.lang.Object workflowContext3 = verificationCaptureWebViewDelegate.getWorkflowContext();
                if (workflowContext3 instanceof com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) {
                    workflowContext = (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) workflowContext3;
                    if (workflowContext != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[NavigationModule] Creating WorkflowContext from destination", null, null, 6, null);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.paypal.oslo.feature.verificationcapture.api.models.DocumentCaptureConfig documentCaptureConfig = verificationCaptureOrchestratorDestination.getDocumentCaptureConfig();
                        java.lang.Integer maxDocuments = documentCaptureConfig.getMaxDocuments();
                        int intValue = maxDocuments != null ? maxDocuments.intValue() : 1;
                        if (documentCaptureConfig.isTwoSided()) {
                            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD;
                            java.lang.String documentType = documentCaptureConfig.getDocumentType();
                            arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType, documentCaptureConfig.getRetryLimit(), documentCaptureConfig.getAllowManualUpload(), documentCaptureConfig.isHandleManualCapture(), documentCaptureConfig.getTimeout(), documentType == null ? "DRIVERS_LICENSE" : documentType, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, documentCaptureConfig.getCaptureMode(), documentCaptureConfig.getOptions(), 0, null, null, null, null, null, 32256, null));
                            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType2 = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD;
                            java.lang.String documentType2 = documentCaptureConfig.getDocumentType();
                            arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType2, documentCaptureConfig.getRetryLimit(), documentCaptureConfig.getAllowManualUpload(), documentCaptureConfig.isHandleManualCapture(), documentCaptureConfig.getTimeout(), documentType2 == null ? "DRIVERS_LICENSE" : documentType2, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, documentCaptureConfig.getCaptureMode(), documentCaptureConfig.getOptions(), 0, null, null, null, null, null, 32256, null));
                        } else if (intValue > 0) {
                            for (int i3 = 0; i3 < intValue; i3++) {
                                com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType3 = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.DOCUMENT_UPLOAD;
                                java.lang.String documentType3 = documentCaptureConfig.getDocumentType();
                                arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType3, documentCaptureConfig.getRetryLimit(), documentCaptureConfig.getAllowManualUpload(), documentCaptureConfig.isHandleManualCapture(), documentCaptureConfig.getTimeout(), documentType3 == null ? "DRIVERS_LICENSE" : documentType3, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, documentCaptureConfig.getCaptureMode(), documentCaptureConfig.getOptions(), 0, null, null, null, null, null, 32256, null));
                            }
                        }
                        com.paypal.oslo.feature.verificationcapture.api.models.LivenessConfig livenessConfig = verificationCaptureOrchestratorDestination.getLivenessConfig();
                        if (livenessConfig != null) {
                            java.lang.String name2 = livenessConfig.getVendor().name();
                            int i4 = com.paypal.oslo.feature.verificationcapture.di.NavigationModule.WhenMappings.$EnumSwitchMapping$0[livenessConfig.getVendor().ordinal()];
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "DAON liveness vendor is not supported", null, null, null, 14, null);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType workflowType4 = com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowType.SELFIE;
                            java.lang.String sessionToken = livenessConfig.getSessionToken();
                            com.paypal.oslo.feature.verificationcapture.api.models.FaceTecCredentials facetecCredentials = livenessConfig.getFacetecCredentials();
                            java.lang.String productionKey = facetecCredentials != null ? facetecCredentials.getProductionKey() : null;
                            com.paypal.oslo.feature.verificationcapture.api.models.FaceTecCredentials facetecCredentials2 = livenessConfig.getFacetecCredentials();
                            java.lang.String licenseExpirationDate = facetecCredentials2 != null ? facetecCredentials2.getLicenseExpirationDate() : null;
                            com.paypal.oslo.feature.verificationcapture.api.models.FaceTecCredentials facetecCredentials3 = livenessConfig.getFacetecCredentials();
                            arrayList.add(new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowConfig(workflowType4, 0, false, false, livenessConfig.getSessionTimeout(), "FACE", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT, null, null, 0, name2, sessionToken, productionKey, facetecCredentials3 != null ? facetecCredentials3.getDeviceKeyIdentifier() : null, licenseExpirationDate, 910, null));
                        }
                        java.lang.String flowName = verificationCaptureOrchestratorDestination.getFlowConfig().getFlowName();
                        java.lang.String partyId = verificationCaptureOrchestratorDestination.getFlowConfig().getPartyId();
                        if (partyId == null) {
                            partyId = "unknown";
                        }
                        workflowContext2 = new com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext(arrayList, 0, flowName, null, null, null, partyId, verificationCaptureOrchestratorDestination.isWebFlow() ? com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.WEB : com.paypal.oslo.feature.verificationcapture.domain.model.ResultType.FILE, null, false, false, null, null, null, verificationCaptureOrchestratorDestination.isWebFlow(), verificationCaptureOrchestratorDestination.getDocumentCaptureConfig().getLocale(), 0, null, 212794, null);
                    } else {
                        workflowContext2 = workflowContext;
                    }
                    com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.VerificationCaptureOrchestratorScreen(workflowContext2, new com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1(appNavigator), null, composer, 0, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }
            workflowContext = null;
            if (workflowContext != null) {
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.VerificationCaptureOrchestratorScreen(workflowContext2, new com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$1$2$navigatorAdapter$1(appNavigator), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7e7y6hhKAUaqT2hgd0rk0eH0zOk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$rtPdo9fG5h7dlVkQfl1nsp6r2RE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dy1moocjZcvSOTleM7qACVpFIaE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination verificationCaptureConfirmIdentityDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureConfirmIdentityDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1876102379, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:397)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator().provides(new com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter(appNavigator)), com.paypal.oslo.feature.verificationcapture.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$767631403$verification_capture_prodRelease(), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IZnLGwLIbZbknSroQ_d6cKWoizA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination verificationCaptureTutorialDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureTutorialDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1489626924, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:386)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator().provides(new com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter(appNavigator)), com.paypal.oslo.feature.verificationcapture.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1906244588$verification_capture_prodRelease(), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K-ufXMFWuLfj-4Y94bWiC-BftDo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20608$r8$lambda$KufXMFWuLfj4Y94bWiCBftDo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kl_LHWm3mM976Y6N9zPlxUL2Am0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled.INSTANCE);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MSkT9_C_BFZqO7f2Pz_hSFQLHlQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20608$r8$lambda$KufXMFWuLfj4Y94bWiCBftDo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ma3Ov_qKVz2z3cmxU3_s8KV8meI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RF6pskeW5J5TWPcWtBp0TARsW1c(final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResult, "");
        if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) captureResult;
            final byte[] compressForBinder$default = com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil.compressForBinder$default(com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil.INSTANCE, success.getImage(), new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success(new byte[0], documentCaptureDestination.getDocumentType(), documentCaptureDestination.getDocumentSide(), success.getCaptureData().getDocumentDetectionScore(), 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, 4064, (kotlin.jvm.internal.DefaultConstructorMarker) null), 0, 4, null);
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$5qVtAj5_ICxwFFPrj4XDhvpUbeM(compressForBinder$default, documentCaptureDestination, captureResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$oVIsmaeJyBQtPxjhQAgm9LbqGJI(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$XrBnb18de1nFe5e_SmcrnQmqsWc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$d70L4UBVADWRRVqGIATUfBYkjvw(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$f00rbUXPTR0MEGCyAtmCDy_QEeM(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WuSgR6gjcwzmp2nSawibGCtSL4w(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate verificationCaptureWebViewDelegate, final androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-786206905, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.verificationcapture.di.NavigationModule.getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                return highSpeedVideoSizes;
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(documentCaptureDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-708570726, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$6Sydnp_SJ5hhDU6OZhLEn1bWx8c(com.paypal.oslo.feature.verificationcapture.api.webview.VerificationCaptureWebViewDelegate.this, entryProviderScope, appNavigator, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination verificationCaptureOrchestratorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureOrchestratorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureOrchestratorDestination verificationCaptureOrchestratorDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1569869694, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20609$r8$lambda$e8Q3PpNS3aYJscyOTt6uxn3JdM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$5 navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$5 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination verificationCaptureCancelConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureCancelConfirmationDestination);
            }
        };
        final java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination.class), (kotlin.jvm.functions.Function1) navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$5, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination verificationCaptureCancelConfirmationDestination) {
                return emptyMap;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1489626924, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$IZnLGwLIbZbknSroQ_d6cKWoizA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$7 navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$7 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination verificationCaptureTutorialDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureTutorialDestination);
            }
        };
        final java.util.Map emptyMap2 = kotlin.collections.MapsKt.emptyMap();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination.class), (kotlin.jvm.functions.Function1) navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$7, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureTutorialDestination verificationCaptureTutorialDestination) {
                return emptyMap2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1876102379, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$Dy1moocjZcvSOTleM7qACVpFIaE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$9 navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$9 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination verificationCaptureConfirmIdentityDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureConfirmIdentityDestination);
            }
        };
        final java.util.Map emptyMap3 = kotlin.collections.MapsKt.emptyMap();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination.class), (kotlin.jvm.functions.Function1) navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$9, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureConfirmIdentityDestination verificationCaptureConfirmIdentityDestination) {
                return emptyMap3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, true, 255, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1739423857, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$p_HziOFKGUNE5IIFsO6Qnyxi1h8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination verificationCaptureLivenessDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureLivenessDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination verificationCaptureLivenessDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-153278801, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$bTSkMJj8cXLM6uaw97WbhzqnehI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$13 navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$13 = new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination verificationCaptureFacialReviewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureFacialReviewDestination);
            }
        };
        final java.util.Map emptyMap4 = kotlin.collections.MapsKt.emptyMap();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination.class), (kotlin.jvm.functions.Function1) navigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$13, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination verificationCaptureFacialReviewDestination) {
                return emptyMap4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-4808656, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20611$r8$lambda$kqottG94Yif4drxYhKPigPJ61g(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination verificationCaptureDeeplinkDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(verificationCaptureDeeplinkDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination verificationCaptureDeeplinkDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(158640056, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$exjp7hAnGxZdlLyLgIEeyeyHfn8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination deeplinkSuccessInternalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(deeplinkSuccessInternalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination deeplinkSuccessInternalDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(877558878, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20613$r8$lambda$zd3TsCP7ZPpmYlQWP43X5hxfR8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination deeplinkFailureInternalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(deeplinkFailureInternalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$provideIdScanEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination deeplinkFailureInternalDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XrBnb18de1nFe5e_SmcrnQmqsWc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled.INSTANCE);
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bTSkMJj8cXLM6uaw97WbhzqnehI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureFacialReviewDestination verificationCaptureFacialReviewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureFacialReviewDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-153278801, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:428)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator().provides(new com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter(appNavigator)), com.paypal.oslo.feature.verificationcapture.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m20605getLambda$1046881425$verification_capture_prodRelease(), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d70L4UBVADWRRVqGIATUfBYkjvw(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout((int) (((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) captureResult).getDurationMs() / 1000)));
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e8Q3P-pNS3aYJscyOTt6uxn3JdM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20609$r8$lambda$e8Q3PpNS3aYJscyOTt6uxn3JdM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.navigation.VerificationCaptureCancelConfirmationDestination verificationCaptureCancelConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureCancelConfirmationDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(verificationCaptureCancelConfirmationDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1569869694, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:369)");
            }
            int reviewHours = verificationCaptureCancelConfirmationDestination.getReviewHours();
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$30jkPcrzKrllaVDhmSYUAiDEJ6s(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$MSkT9_C_BFZqO7f2Pz_hSFQLHlQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.cancelconfirmation.CancelConfirmationScreenKt.CancelConfirmationScreen(reviewHours, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$exjp7hAnGxZdlLyLgIEeyeyHfn8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination deeplinkSuccessInternalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkSuccessInternalDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(158640056, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:451)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20606$r8$lambda$s12KCZzwsqGwEjY_oTeGNYoFJY(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkSuccessScreenKt.DeeplinkSuccessScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f00rbUXPTR0MEGCyAtmCDy_QEeM(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult;
        navigationScope.setResult(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error(failure.getErrorCode(), failure.getErrorMessage()));
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gssB1xGfQvvm_aY3Q-lZNvfUYow, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20610$r8$lambda$gssB1xGfQvvm_aY3QlZNvfUYow(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$26Y38MVxJek7qeMFZPZPmITjE3E((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hXMzpCVwvLyzpMlx5AFs2mumoQY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jzx9So4iK00NDohIzgeZ0bJIpQY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kqottG94Yif4drxYhKPig-PJ61g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20611$r8$lambda$kqottG94Yif4drxYhKPigPJ61g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination verificationCaptureDeeplinkDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureDeeplinkDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(verificationCaptureDeeplinkDestination) : composer.changedInstance(verificationCaptureDeeplinkDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-4808656, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:439)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$7e7y6hhKAUaqT2hgd0rk0eH0zOk(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.m20610$r8$lambda$gssB1xGfQvvm_aY3QlZNvfUYow(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.verificationcapture.ui.webflow.DeeplinkWebViewScreenKt.DeeplinkWebViewScreen(verificationCaptureDeeplinkDestination, appNavigator, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, composer, com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination.$stable | (i & 14), 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oVIsmaeJyBQtPxjhQAgm9LbqGJI(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureDestination documentCaptureDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success(new byte[0], documentCaptureDestination.getDocumentType(), documentCaptureDestination.getDocumentSide(), 1.0f, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, 4064, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pHTXU-qyu3W2G9555r1KzfAc-6M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20612$r8$lambda$pHTXUqyu3W2G9555r1KzfAc6M(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$Kl_LHWm3mM976Y6N9zPlxUL2Am0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p_HziOFKGUNE5IIFsO6Qnyxi1h8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination verificationCaptureLivenessDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureLivenessDestination, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(verificationCaptureLivenessDestination) : composer.changedInstance(verificationCaptureLivenessDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1739423857, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:409)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLocalNavigator().provides(new com.paypal.oslo.feature.verificationcapture.ui.util.AppNavigatorAdapter(appNavigator)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1322806193, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$srtOzRN7KSrPKmwxxAZLp2eHTQY(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rtPdo9fG5h7dlVkQfl1nsp6r2RE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkSuccessInternalDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$srtOzRN7KSrPKmwxxAZLp2eHTQY(com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureLivenessDestination verificationCaptureLivenessDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1322806193, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:414)");
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.screen.FaceTecLivenessCaptureScreenKt.FaceTecLivenessCaptureScreen(verificationCaptureLivenessDestination.getSessionToken(), verificationCaptureLivenessDestination.getDeviceKeyIdentifier(), verificationCaptureLivenessDestination.getProductionKey(), verificationCaptureLivenessDestination.getLicenseExpirationDate(), verificationCaptureLivenessDestination.isWebFlow(), verificationCaptureLivenessDestination.getFlowName(), verificationCaptureLivenessDestination.getEntityId(), null, composer, 0, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zd3T-sCP7ZPpmYlQWP43X5hxfR8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20613$r8$lambda$zd3TsCP7ZPpmYlQWP43X5hxfR8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.navigation.DeeplinkFailureInternalDestination deeplinkFailureInternalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkFailureInternalDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(877558878, i, -1, "com.paypal.oslo.feature.verificationcapture.di.NavigationModule.provideIdScanEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:466)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.di.NavigationModule$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.verificationcapture.di.NavigationModule.$r8$lambda$2dJdOgTKXswh7DerZSoz3hnBSMM(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.deeplinkresult.DeeplinkFailureScreenKt.DeeplinkFailureScreen((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.api.models.LivenessVendor.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.api.models.LivenessVendor.FACETEC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.api.models.LivenessVendor.DAON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
