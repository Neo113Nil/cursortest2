package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0012\u001ax\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00142\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u0007H\u0000\u001a;\u0010#\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010&\u001aB\u0010(\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0002¨\u0006-²\u0006\f\u0010.\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010:\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010/X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u000207X\u008a\u0084\u0002"}, d2 = {"ReviewAccordions", "", "uiState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ReviewUiState;", "viewModels", "Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;", "isContactSectionVisible", "", "onContactListDismiss", "Lkotlin/Function0;", "onNavigateToScamAlert", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "onNavigateToHighRiskScamDecline", "onPaymentLinkInfoClick", "onQrcClick", "onContactInfoIconClick", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/ReviewUiState;Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "filterAccordions", "", "Lcom/paypal/oslo/feature/p2p/ui/review/state/AccordionType;", "visibleAccordions", "isContactSelected", "selectedPaymentType", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "isFirstContactSelection", "isContactLoading", "intent", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "shippingAddresses", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "isShippingLoading", "isAwaitingTransferTypeConfirmation", "hasFundingOptionsError", "RenderPaymentTypeAccordion", "(Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RenderPaymentMethodAccordion", "(Lcom/paypal/oslo/feature/p2p/ui/review/composables/ReviewScreenViewModels;Landroidx/compose/runtime/Composer;I)V", "RenderShippingAccordion", "handlePaymentTypeUpdateResult", "result", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "onScamAlert", "onHighRiskDecline", "p2p_prodRelease", "selectedPaymentTypeId", "", "contactSectionState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "shippingSelectedAddressId", "noShippingSelected", "shippingBackendSyncCount", "", "paymentMethodState", "Lcom/paypal/oslo/feature/p2p/ui/review/state/PaymentMethodAccordionUiState;", "selectedShippingAddressId", "isAwaitingConfirmation", "isEnabled", "selectedTypeId", "planUiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReviewAccordionHelpersKt {
    /* JADX WARN: Removed duplicated region for block: B:130:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewAccordions(final com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState reviewUiState, final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i4;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i6;
        int i7;
        int i8;
        boolean z2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function14;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function15;
        kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function16;
        int i9;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewScreenViewModels, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1296407457);
        int i11 = (i & 6) == 0 ? (startRestartGroup.changed(reviewUiState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i11 |= startRestartGroup.changedInstance(reviewScreenViewModels) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i11 |= 384;
        } else if ((i & 384) == 0) {
            i11 |= startRestartGroup.changed(z) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i11 |= 3072;
            } else if ((i & 3072) == 0) {
                function05 = function0;
                i11 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i11 |= 24576;
                } else if ((i & 24576) == 0) {
                    i11 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i11 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function06 = function02;
                        i11 |= startRestartGroup.changedInstance(function06) ? 131072 : 65536;
                        i6 = i2 & 64;
                        if (i6 != 0) {
                            i11 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i11 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i11 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i11 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i11 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i11 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                        }
                        if (!startRestartGroup.shouldExecute((i11 & 38347923) != 38347922, i11 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            z2 = z;
                            function13 = function1;
                            function07 = function03;
                            function08 = function04;
                            function09 = function05;
                            function010 = function06;
                            function14 = function12;
                        } else {
                            z2 = i12 != 0 ? false : z;
                            if (i3 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function011 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function011 = function05;
                            }
                            if (i4 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.m17343$r8$lambda$ip8vzD_DzpQrY5FvNl52XUyKns((com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function15 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            } else {
                                function15 = function1;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function012 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            } else {
                                function012 = function06;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function013 = (kotlin.jvm.functions.Function0) rememberedValue4;
                            } else {
                                function013 = function03;
                            }
                            if (i7 != 0) {
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                function014 = (kotlin.jvm.functions.Function0) rememberedValue5;
                            } else {
                                function014 = function04;
                            }
                            if (i8 != 0) {
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda22
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$_zpgxmRZEFT5tjG68zICvdXk1TM((com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                function16 = (kotlin.jvm.functions.Function1) rememberedValue6;
                            } else {
                                function16 = function12;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1296407457, i11, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordions (ReviewAccordionHelpers.kt:80)");
                            }
                            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentTypeAccordionViewModel().getSelectedTypeId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getContactSectionViewModel().getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            boolean isContactSelected = ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isContactSelected();
                            androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().getAddresses(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.compose.runtime.State collectAsStateWithLifecycle5 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().getSelectedAddressId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.compose.runtime.State collectAsStateWithLifecycle6 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().getNoShippingSelected(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.compose.runtime.State collectAsStateWithLifecycle7 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().getBackendSyncCount(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            java.lang.String str = (java.lang.String) collectAsStateWithLifecycle5.getValue();
                            boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle6.getValue()).booleanValue();
                            boolean isExpanded = reviewUiState.getShippingSection().isExpanded();
                            int intValue = ((java.lang.Number) collectAsStateWithLifecycle7.getValue()).intValue();
                            java.util.List list = (java.util.List) collectAsStateWithLifecycle4.getValue();
                            boolean changedInstance = startRestartGroup.changedInstance(reviewScreenViewModels);
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda23
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$rfDXRMm0JwsyMyDKsJb4hGkpRpc(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionAutoToggleKt.HandleShippingAccordionAutoToggle(str, booleanValue, isExpanded, intValue, list, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 0);
                            androidx.compose.runtime.State collectAsStateWithLifecycle8 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentTypeAccordionViewModel().isAwaitingTransferTypeConfirmation(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            boolean hasFundingOptionsError = ((com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentMethodAccordionViewModel().getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).getHasFundingOptionsError();
                            java.util.List<com.paypal.oslo.feature.p2p.ui.review.state.AccordionType> visibleAccordions = reviewUiState.getVisibleAccordions();
                            java.lang.String str2 = (java.lang.String) collectAsStateWithLifecycle.getValue();
                            kotlin.jvm.functions.Function0<kotlin.Unit> function015 = function012;
                            boolean isFirstSelection = ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isFirstSelection();
                            function13 = function15;
                            boolean isLoading = ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isLoading();
                            kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function17 = function16;
                            java.util.List list2 = (java.util.List) collectAsStateWithLifecycle4.getValue();
                            kotlin.jvm.functions.Function0<kotlin.Unit> function016 = function014;
                            boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue();
                            kotlin.jvm.functions.Function0<kotlin.Unit> function017 = function013;
                            boolean booleanValue3 = ((java.lang.Boolean) collectAsStateWithLifecycle8.getValue()).booleanValue();
                            boolean changed = startRestartGroup.changed(visibleAccordions);
                            boolean changed2 = startRestartGroup.changed(isContactSelected);
                            boolean changed3 = startRestartGroup.changed(str2);
                            boolean changed4 = startRestartGroup.changed(isFirstSelection);
                            boolean changed5 = startRestartGroup.changed(isLoading);
                            boolean changed6 = startRestartGroup.changed(list2);
                            boolean changed7 = startRestartGroup.changed(booleanValue2);
                            boolean changed8 = startRestartGroup.changed(booleanValue3);
                            boolean changed9 = startRestartGroup.changed(hasFundingOptionsError);
                            kotlin.jvm.functions.Function0<kotlin.Unit> function018 = function011;
                            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if ((changed7 | changed6 | changed5 | changed4 | changed | changed2 | changed3 | changed8 | changed9) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = filterAccordions(reviewUiState.getVisibleAccordions(), isContactSelected, reviewScreenViewModels.getPaymentTypeAccordionViewModel().getSelectedPaymentType(), ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isFirstSelection(), ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isLoading(), reviewUiState.getIntent(), (java.util.List) collectAsStateWithLifecycle4.getValue(), ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue(), ((java.lang.Boolean) collectAsStateWithLifecycle8.getValue()).booleanValue(), hasFundingOptionsError);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            java.util.List list3 = (java.util.List) rememberedValue8;
                            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (isContactSelected && ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle2.getValue()).isLoading()) {
                                startRestartGroup.startReplaceGroup(-2080281839);
                                com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemShimmerKt.P2pEntityRowItemShimmer(com.paypal.oslo.feature.p2p.ui.components.P2pEntityRowItemStyle.Rounded.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing40(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), startRestartGroup, 6, 0);
                                startRestartGroup.endReplaceGroup();
                                i9 = 0;
                                i10 = 1;
                            } else if (z2) {
                                startRestartGroup.startReplaceGroup(-2079997507);
                                com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel = reviewScreenViewModels.getContactSectionViewModel();
                                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent = reviewUiState.getIntent();
                                boolean changedInstance2 = startRestartGroup.changedInstance(reviewScreenViewModels);
                                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                                if (changedInstance2 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda24
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$h_jjZVjX0TbQ56gmcgPA4TYgFj4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                }
                                kotlin.jvm.functions.Function0 function019 = (kotlin.jvm.functions.Function0) rememberedValue9;
                                int i13 = i11 >> 3;
                                int i14 = ((i11 << 3) & 57344) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128);
                                i9 = 0;
                                i10 = 1;
                                com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.ContactSection(intent, false, contactSectionViewModel, function019, function018, function017, function016, function17, startRestartGroup, i14, 2);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                i9 = 0;
                                i10 = 1;
                                startRestartGroup.startReplaceGroup(-2079437461);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (!z2) {
                                startRestartGroup.startReplaceGroup(-2079370656);
                                int i15 = i9;
                                for (java.lang.Object obj : list3) {
                                    if (i15 < 0) {
                                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                                    }
                                    int i16 = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.p2p.ui.review.state.AccordionType) obj).ordinal()];
                                    if (i16 == i10) {
                                        startRestartGroup.startReplaceGroup(1055450312);
                                        int i17 = i11 >> 9;
                                        RenderPaymentTypeAccordion(reviewScreenViewModels, function13, function015, startRestartGroup, (i17 & 896) | ((i11 >> 3) & 14) | (i17 & 112), 0);
                                        startRestartGroup.endReplaceGroup();
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    } else if (i16 == 2) {
                                        startRestartGroup.startReplaceGroup(1055819088);
                                        RenderPaymentMethodAccordion(reviewScreenViewModels, startRestartGroup, (i11 >> 3) & 14);
                                        startRestartGroup.endReplaceGroup();
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                    } else {
                                        if (i16 != 3) {
                                            startRestartGroup.startReplaceGroup(1973707542);
                                            startRestartGroup.endReplaceGroup();
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        startRestartGroup.startReplaceGroup(1056018635);
                                        RenderShippingAccordion(reviewScreenViewModels, startRestartGroup, (i11 >> 3) & 14);
                                        startRestartGroup.endReplaceGroup();
                                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                    }
                                    i15++;
                                }
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-2078529781);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function14 = function17;
                            function010 = function015;
                            function08 = function016;
                            function07 = function017;
                            function09 = function018;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z3 = z2;
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function18 = function13;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$lPjZh3oi36r5rS_XNZQM8q3yyT0(com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState.this, reviewScreenViewModels, z3, function09, function18, function010, function07, function08, function14, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function06 = function02;
                    i6 = i2 & 64;
                    if (i6 != 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i11 & 38347923) != 38347922, i11 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                function06 = function02;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i11 & 38347923) != 38347922, i11 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function05 = function0;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function06 = function02;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i11 & 38347923) != 38347922, i11 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        function05 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function06 = function02;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i11 & 38347923) != 38347922, i11 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final java.util.List<com.paypal.oslo.feature.p2p.ui.review.state.AccordionType> filterAccordions(java.util.List<? extends com.paypal.oslo.feature.p2p.ui.review.state.AccordionType> list, boolean z, com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType, boolean z2, boolean z3, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list2, boolean z4, boolean z5, boolean z6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int i = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.p2p.ui.review.state.AccordionType) obj).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (z && !z2 && (list2 != null || z4)) {
                        if (!z5 && !z6) {
                            arrayList.add(obj);
                        }
                    }
                } else if (z && !z2 && paymentType != null && !z3 && !z5 && !z6) {
                    arrayList.add(obj);
                }
            } else if (z && !z2 && !z3 && paymentTransferIntent == com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.SEND) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderPaymentTypeAccordion(final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function12;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewScreenViewModels, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1871487918);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(reviewScreenViewModels) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function13 = function12;
                    function03 = function02;
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$jjeQkKziKBzhFMVlZY_Ezbrsc4Y((com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1871487918, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.RenderPaymentTypeAccordion (ReviewAccordionHelpers.kt:269)");
                    }
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue3;
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getShippingAccordionViewModel().getSelectedAddressId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentTypeAccordionViewModel().isAwaitingTransferTypeConfirmation(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentTypeAccordionViewModel().isEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentTypeAccordionViewModel().getSelectedTypeId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents = reviewScreenViewModels.getTransferScreenComponents();
                    com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel = reviewScreenViewModels.getPaymentTypeAccordionViewModel();
                    boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                    boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                    boolean z = (((java.lang.String) collectAsStateWithLifecycle4.getValue()) == null || ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue()) ? false : true;
                    boolean booleanValue3 = ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue();
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                    boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
                    boolean changedInstance2 = startRestartGroup.changedInstance(reviewScreenViewModels);
                    boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                    boolean z2 = (i3 & 112) == 32;
                    boolean z3 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (((z2 | changed | changedInstance | changedInstance2 | changed2) || z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function15 = function14;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                        composer2 = startRestartGroup;
                        kotlin.jvm.functions.Function1 function16 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$Jf9VIpqQWT0VtjPH7eCObNYWG1M(kotlinx.coroutines.CoroutineScope.this, collectAsStateWithLifecycle2, reviewScreenViewModels, function15, function05, collectAsStateWithLifecycle, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(function16);
                        rememberedValue4 = function16;
                    } else {
                        composer2 = startRestartGroup;
                    }
                    kotlin.jvm.functions.Function1 function17 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    boolean changedInstance3 = composer2.changedInstance(reviewScreenViewModels);
                    java.lang.Object rememberedValue5 = composer2.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$Idx861fRpxErTDWwuVaNv2SIGag(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, (java.lang.String) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.jvm.functions.Function1 function18 = (kotlin.jvm.functions.Function1) rememberedValue5;
                    boolean changedInstance4 = composer2.changedInstance(reviewScreenViewModels);
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.m17341$r8$lambda$HPw0quVb1vniO7c7xvp3ZljL8g(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    boolean changedInstance5 = composer2.changedInstance(reviewScreenViewModels);
                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$Tm8CudQxGM2YSQfjRkmRQQZz6k4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.PaymentTypeAccordion(transferScreenComponents, paymentTypeAccordionViewModel, null, !booleanValue, booleanValue2, z, !booleanValue3, function17, function18, function06, (kotlin.jvm.functions.Function0) rememberedValue7, composer2, 0, 0, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    function03 = function04;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$N0sdtW5NwfPn9vBi7t0olL_T05I(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, function13, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void RenderPaymentMethodAccordion(final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewScreenViewModels, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-505439072);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(reviewScreenViewModels) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-505439072, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.RenderPaymentMethodAccordion (ReviewAccordionHelpers.kt:339)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(reviewScreenViewModels.getPaymentMethodAccordionViewModel().getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker = (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) startRestartGroup.consume(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.getLocalAnalyticsTracker());
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_payment_method_accordion_header_label, startRestartGroup, 0);
            boolean hasUnresolvedCvvContingency = ((com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState) collectAsStateWithLifecycle.getValue()).getHasUnresolvedCvvContingency();
            boolean isAddPaymentMethodEnabled = ((com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState) collectAsStateWithLifecycle.getValue()).isAddPaymentMethodEnabled();
            boolean changed = startRestartGroup.changed(stringResource);
            boolean changed2 = startRestartGroup.changed(hasUnresolvedCvvContingency);
            boolean changed3 = startRestartGroup.changed(isAddPaymentMethodEnabled);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig(stringResource, isAddPaymentMethodEnabled, !hasUnresolvedCvvContingency, false, false, false, false, false, false, null, 1016, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig planAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionConfig) rememberedValue;
            boolean changed4 = startRestartGroup.changed(reviewScreenViewModels);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.INSTANCE.invoke((r21 & 1) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                } : new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.m17344$r8$lambda$z_iMAO8PXXdmivPbSCCzaACNyo(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker.this, reviewScreenViewModels);
                    }
                }, (r21 & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                } : new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$4Oxw61mE3NPtq42zDyNhiBXJojs(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                    }
                }, (r21 & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.$r8$lambda$knMh_9CSmIBinwOiZC7pfOhQAUE((java.lang.String) obj);
                    }
                } : new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$WExUJh9ivKxX_skXOGdIz2Oogj0(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker.this, reviewScreenViewModels, (java.lang.String) obj);
                    }
                }, (r21 & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                } : new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$C0Mamm6PCypXoIUPvIXbBKkzThc(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                    }
                }, (r21 & 16) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                } : null, (r21 & 32) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.$r8$lambda$g2adtQY_j4GG8dly2ErUscijucc((java.lang.String) obj, (java.lang.String) obj2);
                    }
                } : null, (r21 & 64) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.$r8$lambda$qb3V3MKibja2IMQYYb720txqjxs((java.lang.String) obj, (java.lang.String) obj2);
                    }
                } : new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$AoIkSlHlJAX1inS7zApHl9SQLCg(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                }, (r21 & 128) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.$r8$lambda$cVRzragHusDqTHFdD6KIEZQzV6Y((java.lang.String) obj, (java.lang.String) obj2);
                    }
                } : new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$XVG4dlXKG2tk9CapRgOfAi6nKF4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                }, (r21 & 256) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                } : null, (r21 & 512) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks$Companion$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks.Companion.$r8$lambda$2PTMKqcOIiM2EJRmAag1jwtoxLE((java.lang.String) obj);
                    }
                } : null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.ComposeDefaultImpls.PlanAccordion$default(planAccordionConfig, ((com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState) collectAsStateWithLifecycle.getValue()).getPlanData(), (com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionCallbacks) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing40(), 5, null), reviewScreenViewModels.getTransferScreenComponents(), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$JrMd75FY7ZdMLIQYfSRp2thGOJg(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RenderShippingAccordion(final com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewScreenViewModels, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1025999951);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(reviewScreenViewModels) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1025999951, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.RenderShippingAccordion (ReviewAccordionHelpers.kt:421)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue;
            com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents = reviewScreenViewModels.getTransferScreenComponents();
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel = reviewScreenViewModels.getShippingAccordionViewModel();
            boolean changedInstance = startRestartGroup.changedInstance(reviewScreenViewModels);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$WMW3xY4CPFKpHjenCED3FouRyYw(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance2 = startRestartGroup.changedInstance(reviewScreenViewModels);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$n9Ktz4GwQ481AVsAHXKaj5LC4MI(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance3 = startRestartGroup.changedInstance(reviewScreenViewModels);
            boolean changedInstance4 = startRestartGroup.changedInstance(coroutineScope);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.m17342$r8$lambda$iO1Me2c4DC34AeM_vV1KZ4TG1o(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, coroutineScope, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.ShippingAccordion(transferScreenComponents, shippingAccordionViewModel, null, function0, function02, (kotlin.jvm.functions.Function1) rememberedValue4, null, startRestartGroup, 0, 68);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.$r8$lambda$hW2lGcLxsU06TEEYR7eUtStJhJQ(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult paymentTypeUpdateResult, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult = paymentTypeUpdateResult.getTransferResult();
        if (transferResult != null) {
            reviewScreenViewModels.getPaymentMethodAccordionViewModel().updateInstrumentAdditionConfig(transferResult.getInstrumentAdditionConfig());
            reviewScreenViewModels.getPaymentMethodAccordionViewModel().updateFundingOptions(transferResult.getFundingOptions());
            reviewScreenViewModels.getShippingAccordionViewModel().syncFromBackend(transferResult.getShippingAddresses(), transferResult.getSelectedShippingAddressId());
        }
        if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected) {
            if (function1 != null) {
                function1.invoke(((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected) paymentTypeUpdateResult).getScamAlertType());
            }
        } else if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined) {
            if (function0 != null) {
                function0.invoke();
            }
        } else if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed) {
            reviewScreenViewModels.getPaymentMethodAccordionViewModel().restoreFromCache();
            reviewScreenViewModels.getShippingAccordionViewModel().clearLoading();
            reviewScreenViewModels.getReviewViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ShowErrorScreen(com.paypal.oslo.feature.p2p.ui.review.state.ErrorSource.REVIEW));
        } else if (!(paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4Oxw61mE3NPtq42zDyNhiBXJojs(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onCollapse();
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AoIkSlHlJAX1inS7zApHl9SQLCg(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onCvvSubmit(str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C0Mamm6PCypXoIUPvIXbBKkzThc(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onAddPaymentMethod();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HPw0quVb1vniO7c7xvp3-ZljL8g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17341$r8$lambda$HPw0quVb1vniO7c7xvp3ZljL8g(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onCollapse();
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Idx861fRpxErTDWwuVaNv2SIGag(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        reviewScreenViewModels.getReviewViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jf9VIpqQWT0VtjPH7eCObNYWG1M(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State state, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderPaymentTypeAccordion$3$1$1(reviewScreenViewModels, str, function1, function0, state2, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JrMd75FY7ZdMLIQYfSRp2thGOJg(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderPaymentMethodAccordion(reviewScreenViewModels, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N0sdtW5NwfPn9vBi7t0olL_T05I(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderPaymentTypeAccordion(reviewScreenViewModels, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Tm8CudQxGM2YSQfjRkmRQQZz6k4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentTypeSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WExUJh9ivKxX_skXOGdIz2Oogj0(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.INSTANCE.createItemPressedEvent(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.MODULE_PAYMENT_METHOD, 2, str, 0).track(analyticsTracker);
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onPlanSelected(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WMW3xY4CPFKpHjenCED3FouRyYw(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XVG4dlXKG2tk9CapRgOfAi6nKF4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        reviewScreenViewModels.getReviewViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.DisclosureLinkClicked(str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_zpgxmRZEFT5tjG68zICvdXk1TM(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hW2lGcLxsU06TEEYR7eUtStJhJQ(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderShippingAccordion(reviewScreenViewModels, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h_jjZVjX0TbQ56gmcgPA4TYgFj4(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.SearchContactsClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iO1Me2c4DC34AeM_-vV1KZ4TG1o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17342$r8$lambda$iO1Me2c4DC34AeM_vV1KZ4TG1o(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String value = reviewScreenViewModels.getPaymentTypeAccordionViewModel().getSelectedTypeId().getValue();
        if (value == null) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1(reviewScreenViewModels, value, str, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ip8vzD_DzpQrY5FvNl52X-UyKns, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17343$r8$lambda$ip8vzD_DzpQrY5FvNl52XUyKns(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jjeQkKziKBzhFMVlZY_Ezbrsc4Y(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lPjZh3oi36r5rS_XNZQM8q3yyT0(com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState reviewUiState, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ReviewAccordions(reviewUiState, reviewScreenViewModels, z, function0, function1, function02, function03, function04, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n9Ktz4GwQ481AVsAHXKaj5LC4MI(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rfDXRMm0JwsyMyDKsJb4hGkpRpc(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.ToggleShippingSection.INSTANCE);
        reviewScreenViewModels.getShippingAccordionViewModel().onExpanded();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z_iMAO8PXXdmivPbSCCz-aACNyo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17344$r8$lambda$z_iMAO8PXXdmivPbSCCzaACNyo(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels) {
        com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.INSTANCE.paymentMethodModuleAppeared().track(analyticsTracker);
        reviewScreenViewModels.getPaymentTypeAccordionViewModel().onCollapsed();
        reviewScreenViewModels.getPaymentMethodAccordionViewModel().onExpand();
        reviewScreenViewModels.getReviewViewModel().processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.TogglePaymentMethodSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$RenderPaymentTypeAccordion$lambda$2(androidx.compose.runtime.State state) {
        return (java.lang.String) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.PAYMENT_METHOD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.ui.review.state.AccordionType.SHIPPING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
