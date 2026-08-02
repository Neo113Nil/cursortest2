package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u000f\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0002\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"", "AllTransactionsContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "AllTransactionsLoadingPreview", "AllTransactionsErrorPreview", "AllTransactionsNoStatementsYetPreview", "AllTransactionsAccountCreationUnavailablePreview", "AllTransactionsDownloadingPreview", "AllTransactionsDownloadErrorPreview", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/MonthItem;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/alltransactions/YearAccordionItem;", "previewYears", "getPreviewYears", "()Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllTransactionsScreenPreviewKt {
    private static final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem> getHighSpeedVideoSizes;
    private static final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem> previewYears;

    public static final void AllTransactionsContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1154126805);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1154126805, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsContentPreview (AllTransactionsScreenPreview.kt:35)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content content = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content(previewYears);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle = com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20316$r8$lambda$cveohJ44JwoWBsRA2EW_RH7wNc(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(content, idle, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349744, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$z5uR48Lk71iGECc1ebSFCIoWisc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsLoadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(279057544);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(279057544, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsLoadingPreview (AllTransactionsScreenPreview.kt:63)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading loading = com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Loading.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle = com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$rVXbwWJf6mUf0TojqVukjdlcvJE(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(loading, idle, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349750, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$cDF485YHcPQfifH9WWuxHOCChpU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsErrorPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2093690308);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2093690308, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsErrorPreview (AllTransactionsScreenPreview.kt:91)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error error = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Error("Something went wrong");
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle = com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20315$r8$lambda$R88JIGSAzaLV1P6oyYbKOQCkv0(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(error, idle, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349744, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$j1ZPzGZ_ddAb1lefCexLKAii3i8(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsNoStatementsYetPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1914650303);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1914650303, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsNoStatementsYetPreview (AllTransactionsScreenPreview.kt:119)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet noStatementsYet = com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.NoStatementsYet.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle = com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda54
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20319$r8$lambda$pvHYgsSfNWhIXraff_G2eaM4tE(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(noStatementsYet, idle, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349750, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$OuhYM1X8eyAViiW_OALY_iZgQiY(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsAccountCreationUnavailablePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1577946960);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1577946960, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsAccountCreationUnavailablePreview (AllTransactionsScreenPreview.kt:147)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable accountCreationUnavailable = com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.AccountCreationUnavailable.INSTANCE;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle idle = com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20306$r8$lambda$6_d8xuQnWmGSxLHkMytvQM6KB8(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(accountCreationUnavailable, idle, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349750, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$lsMmJUCjkKKufXLTjJmaAKIF6SA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsDownloadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(618156714);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(618156714, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsDownloadingPreview (AllTransactionsScreenPreview.kt:175)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content content = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content(previewYears);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading downloading = new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Downloading("https://example.com/download");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20307$r8$lambda$6f_97ItyCkWHyVxhqsXevWy1ZY(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(content, downloading, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20310$r8$lambda$J42cvpyKSlRseS4ncABBbb_z_A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AllTransactionsDownloadErrorPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1164488420);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1164488420, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsDownloadErrorPreview (AllTransactionsScreenPreview.kt:203)");
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content content = new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsUiState.Content(previewYears);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error error = new com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.DownloadUiState.Error("https://example.com/download", "Download failed. Please try again.");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.m20318$r8$lambda$p6lAaRnG325ZXlcp0B2CtyI6lU(((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt.AllTransactionsContent(content, error, null, function0, function02, function1, function12, function2, function03, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 920349696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.preview.AllTransactionsScreenPreviewKt.$r8$lambda$VyA8ohZRKKPRjf2n78tsYTXrPOI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    static {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"December", "November", "October", "September", "August"});
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.MonthItem((java.lang.String) it.next(), "preview://url"));
        }
        java.util.ArrayList arrayList2 = arrayList;
        getHighSpeedVideoSizes = arrayList2;
        previewYears = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem[]{new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem(2023, arrayList2, true, null, 8, null), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem(2022, arrayList2, false, null, 8, null), new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem(2021, arrayList2, false, null, 8, null)});
    }

    public static final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.YearAccordionItem> getPreviewYears() {
        return previewYears;
    }

    /* renamed from: $r8$lambda$6_d8xuQnWmGSxLHkMytvQM-6KB8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20306$r8$lambda$6_d8xuQnWmGSxLHkMytvQM6KB8(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6f_97ItyCkWHyVxhqsXevWy1Z-Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20307$r8$lambda$6f_97ItyCkWHyVxhqsXevWy1ZY(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$J42cvpyKSlRseS4ncA-BBbb_z_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20310$r8$lambda$J42cvpyKSlRseS4ncABBbb_z_A(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsDownloadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OuhYM1X8eyAViiW_OALY_iZgQiY(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsNoStatementsYetPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R88JIGSAzaLV1P6oyY-bKOQCkv0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20315$r8$lambda$R88JIGSAzaLV1P6oyYbKOQCkv0(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VyA8ohZRKKPRjf2n78tsYTXrPOI(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsDownloadErrorPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cDF485YHcPQfifH9WWuxHOCChpU(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsLoadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cveohJ44JwoWBsRA2EW_RH-7wNc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20316$r8$lambda$cveohJ44JwoWBsRA2EW_RH7wNc(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j1ZPzGZ_ddAb1lefCexLKAii3i8(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsErrorPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lsMmJUCjkKKufXLTjJmaAKIF6SA(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsAccountCreationUnavailablePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p6lAaRnG325ZXlcp-0B2CtyI6lU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20318$r8$lambda$p6lAaRnG325ZXlcp0B2CtyI6lU(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pvHYgsSfNWhIXraff_G2e-aM4tE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20319$r8$lambda$pvHYgsSfNWhIXraff_G2eaM4tE(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rVXbwWJf6mUf0TojqVukjdlcvJE(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z5uR48Lk71iGECc1ebSFCIoWisc(int i, androidx.compose.runtime.Composer composer, int i2) {
        AllTransactionsContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
