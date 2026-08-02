package com.paypal.oslo.feature.p2p.ui.review.composables.accordions;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"PaymentTypeAccordion", "", "transferScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "autoCollapseOnSelection", "", "preventCollapse", "showCollapseChevron", "hardDefault", "onTypeSelect", "Lkotlin/Function1;", "", "onInfoLinkClick", "onExpandAccordion", "Lkotlin/Function0;", "onCollapseAccordion", "(Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeAccordionViewModel;Landroidx/compose/ui/Modifier;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "addPurchaseProtectionLink", "Lcom/paypal/oslo/feature/moneymovement/api/ui/paymenttype/PaymentTypeAccordionData;", "mmpData", "purchaseProtectionLinkText", "locale", "Ljava/util/Locale;", "p2p_prodRelease", "selectedTypeId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "isEnabled", "isLoading"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentTypeAccordionKt {
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0299, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentTypeAccordion(final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final androidx.compose.ui.Modifier modifier2;
        boolean z5;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function17;
        boolean z9;
        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData createPaymentTypeData$default;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final boolean z10;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function19;
        java.lang.Object invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypeAccordionViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1372257036);
        int i14 = (i & 6) == 0 ? (startRestartGroup.changedInstance(transferScreenComponents) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i14 |= startRestartGroup.changedInstance(paymentTypeAccordionViewModel) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i & 384) == 0) {
            i14 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i14 |= 3072;
            } else if ((i & 3072) == 0) {
                i14 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i5 = i3 & 16;
                if (i5 != 0) {
                    i14 |= 24576;
                } else if ((i & 24576) == 0) {
                    i14 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i6 = i3 & 32;
                    if (i6 == 0) {
                        i14 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i14 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i14 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i14 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i14 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i14 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i14 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i14 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i14 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i14 |= startRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
                    }
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                    } else {
                        if ((i2 & 6) != 0) {
                            i12 = i2;
                            if (!startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i12 & 3) != 2, i14 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z5 = z;
                                z6 = z2;
                                z7 = z3;
                                z8 = z4;
                                function13 = function1;
                                function14 = function12;
                                function03 = function0;
                                function04 = function02;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                z5 = i4 != 0 ? true : z;
                                boolean z11 = i5 != 0 ? false : z2;
                                boolean z12 = i6 != 0 ? true : z3;
                                boolean z13 = i7 != 0 ? false : z4;
                                if (i8 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.m17406$r8$lambda$3zJq9GfxlbO0ZFUozV4jQy064g((java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function15 = (kotlin.jvm.functions.Function1) rememberedValue;
                                } else {
                                    function15 = function1;
                                }
                                if (i9 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.$r8$lambda$nMSKjyPX49aUon7VAUvpZj9a0zo((java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function16 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                } else {
                                    function16 = function12;
                                }
                                if (i10 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function05 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                } else {
                                    function05 = function0;
                                }
                                if (i11 != 0) {
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    function06 = (kotlin.jvm.functions.Function0) rememberedValue4;
                                } else {
                                    function06 = function02;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1372257036, i14, i12, "com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordion (PaymentTypeAccordion.kt:64)");
                                }
                                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentTypeAccordionViewModel.getSelectedTypeId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentTypeAccordionViewModel.isExpanded(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                                androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentTypeAccordionViewModel.isEnabled(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                                androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentTypeAccordionViewModel.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                                androidx.compose.ui.Modifier modifier3 = companion;
                                final com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker = (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) startRestartGroup.consume(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.getLocalAnalyticsTracker());
                                boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
                                boolean changedInstance = startRestartGroup.changedInstance(analyticsTracker);
                                kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function110 = function16;
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (changed || changedInstance) {
                                    function17 = function15;
                                } else {
                                    function17 = function15;
                                }
                                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$PaymentTypeAccordion$5$1(analyticsTracker, collectAsStateWithLifecycle2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_payment_type_accordion_header_label, startRestartGroup, 0);
                                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_payment_type_accordion_purchase_protection_link, startRestartGroup, 0);
                                kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
                                java.util.Locale locale = com.paypal.oslo.feature.p2p.ui.common.util.LocaleUtilsKt.getLocale(startRestartGroup, 0);
                                if (((java.lang.Boolean) collectAsStateWithLifecycle4.getValue()).booleanValue()) {
                                    startRestartGroup.startReplaceGroup(-1409093028);
                                    startRestartGroup.endReplaceGroup();
                                    z9 = z11;
                                    createPaymentTypeData$default = com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.Companion.loading$default(com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.INSTANCE, false, 1, null);
                                } else {
                                    z9 = z11;
                                    startRestartGroup.startReplaceGroup(-1409033229);
                                    createPaymentTypeData$default = com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.ComposeDefaultImpls.createPaymentTypeData$default((java.lang.String) collectAsStateWithLifecycle.getValue(), ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue(), ((java.lang.Boolean) collectAsStateWithLifecycle3.getValue()).booleanValue(), transferScreenComponents, startRestartGroup, (i14 << 9) & 7168, 0);
                                    startRestartGroup.endReplaceGroup();
                                }
                                boolean changed2 = startRestartGroup.changed(createPaymentTypeData$default);
                                boolean changed3 = startRestartGroup.changed(stringResource2);
                                boolean changed4 = startRestartGroup.changed(locale);
                                function03 = function05;
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if ((changed2 | changed3 | changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    if (createPaymentTypeData$default.getState() instanceof com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) {
                                        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State state = createPaymentTypeData$default.getState();
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(state, "");
                                        com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready ready = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.State.Ready) state;
                                        java.lang.String buildPurchaseProtectionUrl = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewDisclaimerHelper.INSTANCE.buildPurchaseProtectionUrl(locale);
                                        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.PaymentType> types = ready.getTypes();
                                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(types, 10));
                                        for (com.paypal.oslo.feature.moneymovement.api.domain.PaymentType paymentType : types) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(paymentType.getId(), com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTypeDomainMapper.MmpPaymentTypeIds.GOODS_SERVICES)) {
                                                paymentType = com.paypal.oslo.feature.moneymovement.api.domain.PaymentType.copy$default(paymentType, null, null, null, null, null, new com.paypal.oslo.feature.moneymovement.api.domain.PaymentType.InfoLink(stringResource2, buildPurchaseProtectionUrl), 31, null);
                                            }
                                            arrayList.add(paymentType);
                                        }
                                        createPaymentTypeData$default = com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData.INSTANCE.fromDomainModels(arrayList, ready.getSelectedTypeId(), ready.isExpanded(), ready.getEnabled());
                                    }
                                    startRestartGroup.updateRememberedValue(createPaymentTypeData$default);
                                    rememberedValue6 = createPaymentTypeData$default;
                                }
                                com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData paymentTypeAccordionData = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionData) rememberedValue6;
                                boolean changed5 = startRestartGroup.changed(stringResource);
                                boolean z14 = (i14 & 7168) == 2048;
                                boolean z15 = (458752 & i14) == 131072;
                                boolean z16 = (3670016 & i14) == 1048576;
                                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                                if ((changed5 | z14 | z15 | z16) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue7 = new com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig(stringResource, true, z5, z13, z12);
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                final com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig) rememberedValue7;
                                boolean changed6 = startRestartGroup.changed(paymentTypeAccordionViewModel);
                                boolean z17 = (29360128 & i14) == 8388608;
                                boolean z18 = (234881024 & i14) == 67108864;
                                boolean changed7 = startRestartGroup.changed(paymentTypeAccordionConfig);
                                boolean z19 = (57344 & i14) == 16384;
                                boolean z20 = (1879048192 & i14) == 536870912;
                                boolean z21 = (i12 & 14) == 4;
                                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                                if ((((changed6 | z17 | z18 | changed7 | z19) || z20) || z21) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    function07 = function08;
                                    z10 = z9;
                                    function18 = function17;
                                    function19 = function110;
                                    invoke = com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks.INSTANCE.invoke(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.$r8$lambda$RqIsklmTsV04x53s3CO2zWht9Bg(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel.this, function03);
                                        }
                                    }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.$r8$lambda$dgMJocmSq2DLLcDdej2jGcdUEa4(z10, paymentTypeAccordionViewModel, function07);
                                        }
                                    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.$r8$lambda$liP2cc3OKmPehXkr81nm7WhbHsw(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker.this, paymentTypeAccordionViewModel, paymentTypeAccordionConfig, function18, (java.lang.String) obj);
                                        }
                                    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.m17408$r8$lambda$RwCFYUVbEpgo9FU_gmOmXxav2g(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                        }
                                    });
                                    startRestartGroup.updateRememberedValue(invoke);
                                } else {
                                    invoke = rememberedValue8;
                                    function07 = function08;
                                    z10 = z9;
                                    function18 = function17;
                                    function19 = function110;
                                }
                                com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.ComposeDefaultImpls.PaymentTypeAccordion$default(paymentTypeAccordionConfig, paymentTypeAccordionData, (com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionCallbacks) invoke, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(modifier3, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing40(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 5, null), transferScreenComponents, startRestartGroup, (i14 << 12) & 57344, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function13 = function18;
                                function04 = function07;
                                z7 = z12;
                                z6 = z10;
                                z8 = z13;
                                modifier2 = modifier3;
                                function14 = function19;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final boolean z22 = z5;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function03;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PaymentTypeAccordionKt.m17409$r8$lambda$hf_lZETVvXStwrQg5elwlJWlKg(com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.this, paymentTypeAccordionViewModel, modifier2, z22, z6, z7, z8, function13, function14, function09, function04, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i13 = i2 | (startRestartGroup.changedInstance(function02) ? 4 : 2);
                    }
                    i12 = i13;
                    if (!startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i12 & 3) != 2, i14 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i12 = i13;
                if (!startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i12 & 3) != 2, i14 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i12 = i13;
            if (!startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i12 & 3) != 2, i14 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i12 = i13;
        if (!startRestartGroup.shouldExecute((i14 & 306783379) == 306783378 || (i12 & 3) != 2, i14 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$3-zJq9GfxlbO0ZFUozV4jQy064g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17406$r8$lambda$3zJq9GfxlbO0ZFUozV4jQy064g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RqIsklmTsV04x53s3CO2zWht9Bg(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, kotlin.jvm.functions.Function0 function0) {
        paymentTypeAccordionViewModel.onExpanded();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RwCFYUVbEpgo9FU_gm-OmXxav2g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17408$r8$lambda$RwCFYUVbEpgo9FU_gmOmXxav2g(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dgMJocmSq2DLLcDdej2jGcdUEa4(boolean z, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, kotlin.jvm.functions.Function0 function0) {
        if (z) {
            return kotlin.Unit.INSTANCE;
        }
        paymentTypeAccordionViewModel.onCollapsed();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hf_lZE-TVvXStwrQg5elwlJWlKg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17409$r8$lambda$hf_lZETVvXStwrQg5elwlJWlKg(com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PaymentTypeAccordion(transferScreenComponents, paymentTypeAccordionViewModel, modifier, z, z2, z3, z4, function1, function12, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$liP2cc3OKmPehXkr81nm7WhbHsw(com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeAccordionViewModel paymentTypeAccordionViewModel, com.paypal.oslo.feature.moneymovement.api.ui.paymenttype.PaymentTypeAccordionConfig paymentTypeAccordionConfig, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.INSTANCE.createItemPressedEvent(com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.MODULE_PAYMENT_TYPE, 1, str, 0).track(analyticsTracker);
        paymentTypeAccordionViewModel.onTypeSelected(str, paymentTypeAccordionConfig.getAutoCollapseOnSelection());
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nMSKjyPX49aUon7VAUvpZj9a0zo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
