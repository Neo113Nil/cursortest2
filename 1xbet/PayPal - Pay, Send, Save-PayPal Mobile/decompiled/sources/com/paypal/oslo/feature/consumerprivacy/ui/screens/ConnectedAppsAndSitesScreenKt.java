package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a®\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e28\b\u0002\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00030\u00182\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00102\u001a\b\u0002\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00182#\b\u0002\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010#\u001ac\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020 2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0003¢\u0006\u0002\u0010+\u001a#\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0003¢\u0006\u0002\u0010.\u001a\r\u0010/\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00101\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00102\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00103\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00104\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00105\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00106\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00107\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\u001a\r\u00108\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00100\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00069²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020;X\u008a\u008e\u0002²\u0006\f\u0010<\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\f\u0010=\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020 X\u008a\u008e\u0002"}, d2 = {"ContactUsUrl", "", "ConnectedAppsAndSitesScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ConnectedAppsAndSitesViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ConnectedAppsAndSitesViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "uiState", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;", "onBackClick", "Lkotlin/Function0;", "onDetailsClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppItem;", "onRemoveClick", "onSharingInfoDetailsClick", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;", "onRetryClick", "onDismissBanner", "onBannerLinkClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "text", "tag", "onConfirmRemoveApp", "onRemoveConnection", "onUnlinkEmail", "", "onOpenConsentAgreement", "consentId", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsAndSitesUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "SharingActionBottomSheet", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "sheetController", "Lcom/paypal/pds/components/BottomSheetController;", "deleteDataChecked", "onDeleteDataCheckedChange", "onDismiss", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoAppItem;Lcom/paypal/pds/components/BottomSheetController;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConsentAgreementWebView", "url", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConnectedAppsAndSitesScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "ConnectedAppsAndSitesScreenLoadingPreview", "ConnectedAppsAndSitesScreenErrorPreview", "ConnectedAppsAndSitesScreenEmptyPreview", "ConnectedAppsErrorBannerPreview", "ConnectedAppsUnlinkDeleteSuccessBannerPreview", "ConnectedAppsUnlinkSuccessBannerPreview", "ConnectedAppsUnlinkDeleteFailedBannerPreview", "ConnectedAppsUnlinkFailedBannerPreview", "consumer-privacy_prodRelease", "detailState", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppsDetailState;", "appForRemoveSheet", "appForSharingActionSheet", "actionSheetDeleteDataChecked", "showDetailRemoveSheet", "showUnlinkSheet"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectedAppsAndSitesScreenKt {
    public static /* synthetic */ java.lang.String $r8$lambda$EezrSPQjIlVoo7XOCzy_aAs_WuU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConnectedAppsAndSitesScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsAndSitesViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-475083059);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(connectedAppsAndSitesViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-475083059, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreen (ConnectedAppsAndSitesScreen.kt:78)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(connectedAppsAndSitesViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState connectedAppsAndSitesUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState) collectAsStateWithLifecycle.getValue();
                int i6 = i4 & 14;
                boolean z = i6 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda45
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$a4Uuq0mdlJi0_TCzwoBu1n9K680(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda49
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$DdGI0x4f32UcVFCLRqJSFnsMi1Q((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$5qZIelAasj3tTh_sRdonTcgUQxI((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda51
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$M9PY3uPkF6PGjMkNhoJnQzziodM((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                boolean changedInstance = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13609$r8$lambda$kWkm2ybOdSxfSGDcumiDT_hjI8(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
                boolean changedInstance2 = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda53
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$gklaVNWqR284gTmZHYusnRmUAFA(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean z2 = i6 == 4;
                boolean changedInstance3 = startRestartGroup.changedInstance(uriHandler);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((z2 | changedInstance3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$Bx7Z3eJUdbEUsXrDn3iclJjh1x8(com.paypal.oslo.core.navigation.AppNavigator.this, uriHandler, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue7;
                boolean changedInstance4 = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda55
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$bw5YjQl4qx8jL9eNQNnvYehWC7g(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this, (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue8;
                boolean changedInstance5 = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda56
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$yn0PGcU0LfH3xXQ0WO55nrayBgE(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this, (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue9;
                boolean changedInstance6 = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda58
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$jV9BdYYI0snSekEx5zmckctdLds(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this, (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj, ((java.lang.Boolean) obj2).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue10;
                boolean changedInstance7 = startRestartGroup.changedInstance(connectedAppsAndSitesViewModel);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13613$r8$lambda$oCC3RQxaK3FJXyvGmIIQlVZadM(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                ConnectedAppsAndSitesScreen(connectedAppsAndSitesUiState, function0, function1, function12, function13, function02, modifier3, function03, function2, function14, function15, function22, (kotlin.jvm.functions.Function1) rememberedValue11, startRestartGroup, ((i4 << 12) & 3670016) | 28032, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13593$r8$lambda$BebDems5fY3gSokmHzwmjkKAN4(com.paypal.oslo.core.navigation.AppNavigator.this, connectedAppsAndSitesViewModel, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void ConnectedAppsAndSitesScreen(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem, kotlin.Unit> r39, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem, kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.ui.Modifier r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r45, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem, kotlin.Unit> r47, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem, ? super java.lang.Boolean, kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 2725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.ConnectedAppsAndSitesScreen(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, final com.paypal.pds.components.BottomSheetController bottomSheetController, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2012807315);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(sharingInfoAppItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        boolean z2 = true;
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2012807315, i2, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.SharingActionBottomSheet (ConnectedAppsAndSitesScreen.kt:376)");
            }
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !startRestartGroup.changedInstance(bottomSheetController))) {
                z2 = false;
            }
            com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$SharingActionBottomSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$SharingActionBottomSheet$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(sharingInfoAppItem, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            if (sharingInfoAppItem.isEmailType()) {
                startRestartGroup.startReplaceGroup(-1503930265);
                java.lang.String emailProvider = sharingInfoAppItem.getEmailProvider();
                if (emailProvider == null) {
                    emailProvider = "";
                }
                int i3 = i2 >> 3;
                com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsBottomSheetsKt.UnlinkEmailConfirmationBottomSheet(bottomSheetController, emailProvider, z, function1, function0, function03, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i3 & 14) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i3));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1503561520);
                int i4 = i2 >> 9;
                com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsDetailScreensKt.RemoveConnectionConfirmationSheet(bottomSheetController, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_connected_apps_remove_confirmation_message, startRestartGroup, 0), function02, function03, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | ((i2 >> 3) & 14) | (i4 & 896) | (i4 & 7168));
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13597$r8$lambda$FFwAsyVGSw8gmtYUQqpdSQqkU(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem.this, bottomSheetController, z, function1, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-330491452);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-330491452, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConsentAgreementWebView (ConnectedAppsAndSitesScreen.kt:403)");
            }
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, "consumer-privacy", false, false, null, 28, null), null, null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 110, null);
                startRestartGroup.updateRememberedValue(secureWebViewConfiguration);
                rememberedValue = secureWebViewConfiguration;
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue, function0, null, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | (i3 & 112), 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13592$r8$lambda$AjlGLVJcLW7NdwipTOEu_9DE7o(str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-2AUxOeeXrMXksbkbBWqrz_KIdA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13586$r8$lambda$2AUxOeeXrMXksbkbBWqrz_KIdA(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(304981396);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(304981396, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenErrorPreview (ConnectedAppsAndSitesScreen.kt:459)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error error = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda23
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$tQT1qRxIFNekHiEF1pTaaaSuGb0((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13610$r8$lambda$mOXH5zzTKNhYSXBujYf0s4WW38((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$BzwMsOP6oFMGKR3CBnS3xQ9ZNWk((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(error, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13586$r8$lambda$2AUxOeeXrMXksbkbBWqrz_KIdA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-Is6D9JD27Q5NDjpNggtt_FzdR0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13587$r8$lambda$Is6D9JD27Q5NDjpNggtt_FzdR0(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1826884703);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1826884703, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsErrorBannerPreview (ConnectedAppsAndSitesScreen.kt:493)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError.INSTANCE, 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda17
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13616$r8$lambda$vXSE8w2XTcFlragxLkPI640I0s((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$YeHgcAPwcJJoBqPXC3bK9VwM5as((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13602$r8$lambda$QV8IBTEVu0Wla55HMZEf2eZfvI((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13587$r8$lambda$Is6D9JD27Q5NDjpNggtt_FzdR0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0njycyiMhr4XZXjKD__-75f1LkI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13588$r8$lambda$0njycyiMhr4XZXjKD__75f1LkI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0ucONhuXrbWgCn6niW_pkMXBUr4(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$17rIiEn1CoLOgpa0RbuD0txt_wI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1065447966);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1065447966, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsUnlinkDeleteSuccessBannerPreview (ConnectedAppsAndSitesScreen.kt:512)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkAndDeleteSuccess.INSTANCE, 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$0ucONhuXrbWgCn6niW_pkMXBUr4((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$2pVL5Ja7LdOGXphMwf4m1iVttdI((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$9e450jOgvf_RyH9QDaLrnYW8_O8((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$17rIiEn1CoLOgpa0RbuD0txt_wI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1xBNNrJEqKIs3l1MMe6YQRtfMeA(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2pVL5Ja7LdOGXphMwf4m1iVttdI(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5qZIelAasj3tTh_sRdonTcgUQxI(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6ZJBGaoh-GBMN0x_9FvkLd13U1s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13590$r8$lambda$6ZJBGaohGBMN0x_9FvkLd13U1s(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7nfBtR0V5fiZ_BVVj5HDLq0EEfU(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        mutableState.setValue(sharingInfoAppItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9FgdQIPAS75L6N95lPipLQuvxvo(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9e450jOgvf_RyH9QDaLrnYW8_O8(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ABFyBmvTCFn6fo8cYZr_WhfkI0o(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ABWGjMXFkknOM_DgIK9THBdjyKs(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AQQGXO9pcDoTVW19e9-1X0JoOrU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13591$r8$lambda$AQQGXO9pcDoTVW19e91X0JoOrU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, androidx.compose.runtime.MutableState mutableState) {
        function1.invoke(connectedAppItem);
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AjlGLV-JcLW7NdwipTOEu_9DE7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13592$r8$lambda$AjlGLVJcLW7NdwipTOEu_9DE7o(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BTmANwvgGbNnyncixisgtqrp_lY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState connectedAppsDetailState, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        function1.invoke(((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions) connectedAppsDetailState).getApp());
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableState2.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BebDems5fY3gS-okmHzwmjkKAN4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13593$r8$lambda$BebDems5fY3gSokmHzwmjkKAN4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConnectedAppsAndSitesScreen(appNavigator, connectedAppsAndSitesViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bx7Z3eJUdbEUsXrDn3iclJjh1x8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsBannerKt.PackageTrackingSettingsTag)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13594$r8$lambda$CCLDw0oQIokResKwNHRl7YluVQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            uriHandler.openUri(com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.CONTACT_US);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BzwMsOP6oFMGKR3CBnS3xQ9ZNWk(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CC-LDw0oQIokResKwNHRl7YluVQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13594$r8$lambda$CCLDw0oQIokResKwNHRl7YluVQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination("security_settings", (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cuilffa6SkxlrXvhf97H6VDDz3E(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D3qLSokypU_o7w16XbfscYi3wY4(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState connectedAppsDetailState, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions appPermissions = (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions) connectedAppsDetailState;
        if (appPermissions.getApp().getActionType() == com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.MANAGE) {
            mutableState.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement((java.lang.String) function1.invoke(appPermissions.getApp().getId())));
        } else {
            mutableState2.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D7OWrrByZl9QuY7nBZJH-Ba0E4w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13595$r8$lambda$D7OWrrByZl9QuY7nBZJHBa0E4w(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DdGI0x4f32UcVFCLRqJSFnsMi1Q(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EbhTMzDrAnf79o0OdGnC00HfPhg(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FF-wAsy-VGSw8gmtYUQqpdSQqkU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13597$r8$lambda$FFwAsyVGSw8gmtYUQqpdSQqkU(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, com.paypal.pds.components.BottomSheetController bottomSheetController, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(sharingInfoAppItem, bottomSheetController, z, function1, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gvf7ExrasvmVJtNE84QGX6GD1lQ(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$I4AZnk6Jr4dd4i31OHPLUBARLio(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IBEHX3p6BWmOrasAKUimL4SVhys(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KKTXwgpkvPbpB6tqT3qKsVBy6_Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1352971511);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1352971511, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsUnlinkSuccessBannerPreview (ConnectedAppsAndSitesScreen.kt:531)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkSuccess.INSTANCE, 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda9
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$9FgdQIPAS75L6N95lPipLQuvxvo((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$ABFyBmvTCFn6fo8cYZr_WhfkI0o((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$ppbmF3609b2Xr8Ly2Yc2XZYmALU((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$KKTXwgpkvPbpB6tqT3qKsVBy6_Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KhPUjk0sxxGoEH85HiQQhvQJyww(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1862209157);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1862209157, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenContentPreview (ConnectedAppsAndSitesScreen.kt:424)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, null, 12, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda31
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13595$r8$lambda$D7OWrrByZl9QuY7nBZJHBa0E4w((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$EbhTMzDrAnf79o0OdGnC00HfPhg((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$xijRgIBJNqumpd4kiiwd7qPQc74((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$KhPUjk0sxxGoEH85HiQQhvQJyww(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M4CngrCD1c-Br1eQ7DCpiZ2L1LQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13599$r8$lambda$M4CngrCD1cBr1eQ7DCpiZ2L1LQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1912479043);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1912479043, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsUnlinkFailedBannerPreview (ConnectedAppsAndSitesScreen.kt:569)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed.INSTANCE, 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda68
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$n5LxBqhnqe9DZzfQw2sxtFoDCTs((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda90
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13598$r8$lambda$KnzGCJyjjY9Hkpd4dARSfGQ9s((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda101
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13615$r8$lambda$toOPx6dUj4IrvCyFuaAtN6ZE8((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13599$r8$lambda$M4CngrCD1cBr1eQ7DCpiZ2L1LQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U7hi9u2ov3nWhol7fCBcT9xrZPw(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-953293752);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-953293752, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenLoadingPreview (ConnectedAppsAndSitesScreen.kt:443)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading loading = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda38
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$Cuilffa6SkxlrXvhf97H6VDDz3E((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13605$r8$lambda$TM9oQ1yaP9TxJfGHt9bpjejEM((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$I4AZnk6Jr4dd4i31OHPLUBARLio((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(loading, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224694, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$U7hi9u2ov3nWhol7fCBcT9xrZPw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vu2_n2GNnL7ABWXvZtU6nTnDhX8(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState connectedAppsAndSitesUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function1 function16, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        ConnectedAppsAndSitesScreen(connectedAppsAndSitesUiState, function0, function1, function12, function13, function02, modifier, function03, function2, function14, function15, function22, function16, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eyIj9RXdUywgSa9ltJ5xnCOU2qc(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1436303246);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1436303246, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsUnlinkDeleteFailedBannerPreview (ConnectedAppsAndSitesScreen.kt:550)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleUsingPayPalInfoApps(), com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsPreviewData.INSTANCE.getSampleSharingInfoApps(), false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkDeleteFailed.INSTANCE, 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda96
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda97
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$IBEHX3p6BWmOrasAKUimL4SVhys((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda98
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13601$r8$lambda$QASErTmvTozYStNa7pfYTUNWxI((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda99
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13590$r8$lambda$6ZJBGaohGBMN0x_9FvkLd13U1s((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda100
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$eyIj9RXdUywgSa9ltJ5xnCOU2qc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nkxWAFyLRWhrP1SxlAm0-h29i8w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13612$r8$lambda$nkxWAFyLRWhrP1SxlAm0h29i8w(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-206354471);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-206354471, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenEmptyPreview (ConnectedAppsAndSitesScreen.kt:475)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), false, null, 12, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda59
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$saon_F4wv6GtZ6pUGbPmHytPHOs((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13607$r8$lambda$XD8TocmIXJNe1l28qNQv7wGRgg((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$1xBNNrJEqKIs3l1MMe6YQRtfMeA((com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue5;
            composer2 = startRestartGroup;
            ConnectedAppsAndSitesScreen(content, function0, function1, function12, function13, function02, null, null, null, null, null, null, null, composer2, 224688, 0, 8128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13612$r8$lambda$nkxWAFyLRWhrP1SxlAm0h29i8w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KG7W4lBzLrbz4zJq1OdOiRIDhhc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M9PY3uPkF6PGjMkNhoJnQzziodM(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L04hJAv2xA1QjSuUDiwcyHP7MrM(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OtyLQhuX60xQFifinymcZp0seWE(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a4Uuq0mdlJi0_TCzwoBu1n9K680(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$KG7W4lBzLrbz4zJq1OdOiRIDhhc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O7kqOpw_83Yc_4hHLulfHJ6CiPk(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gklaVNWqR284gTmZHYusnRmUAFA(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel) {
        connectedAppsAndSitesViewModel.dismissBanner();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kWkm2ybOdSxfSGDcumiDT_-hjI8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13609$r8$lambda$kWkm2ybOdSxfSGDcumiDT_hjI8(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel) {
        connectedAppsAndSitesViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bw5YjQl4qx8jL9eNQNnvYehWC7g(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        connectedAppsAndSitesViewModel.removeApp(connectedAppItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jV9BdYYI0snSekEx5zmckctdLds(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        connectedAppsAndSitesViewModel.unlinkEmail(sharingInfoAppItem, z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$YAcK9rPCvwqt1l04vaKt__K-Pd4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13608$r8$lambda$YAcK9rPCvwqt1l04vaKt__KPd4(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        function2.invoke(sharingInfoAppItem, java.lang.Boolean.valueOf(((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        mutableState2.setValue(null);
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oCC3RQxaK3FJXyvGmIIQlVZ-adM, reason: not valid java name */
    public static /* synthetic */ java.lang.String m13613$r8$lambda$oCC3RQxaK3FJXyvGmIIQlVZadM(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return connectedAppsAndSitesViewModel.getConsentAgreementUrl(str);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yn0PGcU0LfH3xXQ0WO55nrayBgE(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        connectedAppsAndSitesViewModel.removeConnection(sharingInfoAppItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r6P1oaj_ezFSItlJDH6ZbPRxync(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wJybSPnUxWNl9HltD2kwdL1W7vw(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_ZUW0C9kVGvqx_u8M3AvZ1iH4ek(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UijloHuiEpI7RlrhpYky3B1AKnI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState connectedAppsDetailState, androidx.compose.runtime.MutableState mutableState) {
        function1.invoke(((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail) connectedAppsDetailState).getApp());
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rlspda8IliL4si6-K18Pdb0lwlw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13603$r8$lambda$Rlspda8IliL4si6K18Pdb0lwlw(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S5CaMs689WhE5V_uFHGEYEuk2lg(final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState connectedAppsAndSitesUiState, final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function1 function13, final kotlin.jvm.functions.Function1 function14, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function2 function2, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, final androidx.compose.runtime.MutableState mutableState3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1352440434, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreen.<anonymous>.<anonymous> (ConnectedAppsAndSitesScreen.kt:279)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.LoadingOverlayKt.LoadingOverlay(((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) connectedAppsAndSitesUiState).isRemoving(), null, "connected_apps_mutation_loader", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(437319158, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda95
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$yXNlmOT0yJ8aL5vG0ydSk9hJ8Tk(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.this, connectedAppsAndSitesUiState, function1, function12, function13, function14, function0, function2, mutableState, mutableState2, mutableState3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3456, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QHG1oGETSmWkQSWhABkRtScbMoU(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        if (connectedAppItem.getActionType() == com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.MANAGE) {
            mutableState.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConsentAgreement((java.lang.String) function1.invoke(connectedAppItem.getId())));
        } else {
            mutableState2.setValue(connectedAppItem);
        }
        function12.invoke(connectedAppItem);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UTBhO-Ag08rngFlRwQsoePicz98, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13606$r8$lambda$UTBhOAg08rngFlRwQsoePicz98(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        mutableState.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.AppPermissions(connectedAppItem));
        function1.invoke(connectedAppItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RkUVoHzkzpZ_93Q1zb3PIEPHgAE(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        if (sharingInfoAppItem.isEmailType()) {
            mutableState.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions(sharingInfoAppItem));
        } else {
            mutableState.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.ConnectionDetail(sharingInfoAppItem));
        }
        function1.invoke(sharingInfoAppItem);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yXNlmOT0yJ8aL5vG0ydSk9hJ8Tk(com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState privacyBannerState, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState connectedAppsAndSitesUiState, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function1 function13, final kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, final androidx.compose.runtime.MutableState mutableState3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(437319158, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreen.<anonymous>.<anonymous>.<anonymous> (ConnectedAppsAndSitesScreen.kt:283)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default = privacyBannerState != null ? com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) connectedAppsAndSitesUiState, null, null, false, null, 7, null) : (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) connectedAppsAndSitesUiState;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.m13606$r8$lambda$UTBhOAg08rngFlRwQsoePicz98(kotlin.jvm.functions.Function1.this, mutableState, (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changed2 = composer.changed(function12);
            boolean changed3 = composer.changed(function13);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$QHG1oGETSmWkQSWhABkRtScbMoU(kotlin.jvm.functions.Function1.this, function13, mutableState, mutableState2, (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue2;
            boolean changed4 = composer.changed(function14);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$RkUVoHzkzpZ_93Q1zb3PIEPHgAE(kotlin.jvm.functions.Function1.this, mutableState, (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function17 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.ConnectedAppsAndSitesScreenKt.$r8$lambda$7nfBtR0V5fiZ_BVVj5HDLq0EEfU(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.consumerprivacy.ui.compose.connectedApps.ConnectedAppsAndSitesContentKt.ConnectedAppsAndSitesContent(copy$default, function15, function16, function17, (kotlin.jvm.functions.Function1) rememberedValue4, function0, function2, composer, 24576, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ejQRQUWj8OY9i7jumB29ZZ0z7zE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, androidx.compose.runtime.MutableState mutableState) {
        function1.invoke(sharingInfoAppItem);
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TM9oQ1yaP9TxJf-GHt9bpjejE-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13605$r8$lambda$TM9oQ1yaP9TxJfGHt9bpjejEM(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xijRgIBJNqumpd4kiiwd7qPQc74(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XD8TocmIXJN-e1l28qNQv7wGRgg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13607$r8$lambda$XD8TocmIXJNe1l28qNQv7wGRgg(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QV8IBTEVu0Wla55HMZEf2-eZfvI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13602$r8$lambda$QV8IBTEVu0Wla55HMZEf2eZfvI(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mOXH5zzT-KNhYSXBujYf0s4WW38, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13610$r8$lambda$mOXH5zzTKNhYSXBujYf0s4WW38(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tQT1qRxIFNekHiEF1pTaaaSuGb0(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YeHgcAPwcJJoBqPXC3bK9VwM5as(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$saon_F4wv6GtZ6pUGbPmHytPHOs(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QASErTmvTozYS-tNa7pfYTUNWxI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13601$r8$lambda$QASErTmvTozYStNa7pfYTUNWxI(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vXSE8w2XTc-FlragxLkPI640I0s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13616$r8$lambda$vXSE8w2XTcFlragxLkPI640I0s(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KnzGCJ-yjjY9Hkpd4dARSf-GQ9s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13598$r8$lambda$KnzGCJyjjY9Hkpd4dARSfGQ9s(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ppbmF3609b2Xr8Ly2Yc2XZYmALU(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n5LxBqhnqe9DZzfQw2sxtFoDCTs(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$toOPx6-dU-j4IrvCyFuaAtN6ZE8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13615$r8$lambda$toOPx6dUj4IrvCyFuaAtN6ZE8(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharingInfoAppItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JkuHHrOLx0AWXWfqUFJUiKYaRGE(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XI9SzE5Cj_Vu5OLrmI2A8KW2ero(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZauRqQHhEme62LspMD6Fvo3hXHI(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(null);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XT2MSIFAA42Pce11LRQqK3lvQtY(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mXKTbQ0pStiQdpfMi-XYvOFjSrU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13611$r8$lambda$mXKTbQ0pStiQdpfMiXYvOFjSrU(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableState2.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sMMa69nf-iZhuTqjD8pCqIvK-zs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13614$r8$lambda$sMMa69nfiZhuTqjD8pCqIvKzs(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$zDXeK5Z39STbO1K81IBGpWKbFDE(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState connectedAppsDetailState, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        function2.invoke(((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.EmailPermissions) connectedAppsDetailState).getApp(), java.lang.Boolean.valueOf(((java.lang.Boolean) mutableState2.getValue()).booleanValue()));
        mutableState3.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsDetailState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
