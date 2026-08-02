package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0012"}, d2 = {"PaymentReviewFooter", "", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewEvent;", "Lkotlin/ParameterName;", "name", "event", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/qrc/ui/review/PaymentReviewUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PaymentReviewFooterPreview", "(Landroidx/compose/runtime/Composer;I)V", "PaymentReviewFooterWithNoSelectionErrorPreview", "PaymentReviewFooterWithTopUpButtonPreview", "PaymentReviewFooterPayPalWorldPreview", "qrc_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewFooterKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentReviewFooter(final com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        int i5;
        int i6;
        java.lang.String str;
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1561661388);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(paymentReviewUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1561661388, i4, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooter (PaymentReviewFooter.kt:47)");
                }
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                if (paymentReviewUiModel.getShowCurrencyConversion()) {
                    startRestartGroup.startReplaceGroup(-603291803);
                    com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData = paymentReviewUiModel.getCurrencyConversionData();
                    if (currencyConversionData != null) {
                        startRestartGroup.startReplaceGroup(-1522176707);
                        if (!paymentReviewUiModel.getShowCurrencyOptions()) {
                            startRestartGroup.startReplaceGroup(96255347);
                            startRestartGroup.endReplaceGroup();
                            function0 = null;
                        } else {
                            startRestartGroup.startReplaceGroup(96150722);
                            boolean z = (i4 & 112) == 32;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$pl8m9lLJkDpM9INEWPBxg_GCua4(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                        }
                        obj = null;
                        com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsKt.ConversionOptions(currencyConversionData, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), function0, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1522176708);
                        startRestartGroup.endReplaceGroup();
                        obj = null;
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    obj = null;
                    startRestartGroup.startReplaceGroup(-1521741064);
                    startRestartGroup.endReplaceGroup();
                }
                if (paymentReviewUiModel.isPayPalWorld()) {
                    startRestartGroup.startReplaceGroup(-1521702345);
                    com.paypal.oslo.feature.qrc.ui.review.components.PayPalWorldDescriptionKt.PayPalWorldDescription(paymentReviewUiModel, startRestartGroup, i4 & 14);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1521639880);
                    startRestartGroup.endReplaceGroup();
                }
                if (paymentReviewUiModel.getShowNoSelectionError()) {
                    startRestartGroup.startReplaceGroup(-1521487639);
                    i5 = 0;
                    i6 = i4;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 1, obj), com.paypal.pds.components.BannerStyle.Neutral.INSTANCE.invoke(com.paypal.pds.core.Icon.Alert.INSTANCE), (java.lang.String) null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_no_selection, startRestartGroup, 0), (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 116);
                    startRestartGroup.endReplaceGroup();
                } else {
                    i5 = 0;
                    i6 = i4;
                    startRestartGroup.startReplaceGroup(-1521248040);
                    startRestartGroup.endReplaceGroup();
                }
                boolean isPaymentInProgress = paymentReviewUiModel.isPaymentInProgress();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_pay, startRestartGroup, i5);
                java.lang.String totalAmount = paymentReviewUiModel.getTotalAmount();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(stringResource);
                sb.append(" ");
                sb.append(totalAmount);
                java.lang.String obj2 = sb.toString();
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                if (paymentReviewUiModel.isPaymentInProgress()) {
                    str = com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.PAY_NOW_BUTTON_LOADING;
                } else {
                    str = com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.PAY_NOW_BUTTON;
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(fillMaxWidth$default, str);
                int i8 = i6 & 112;
                int i9 = i8 == 32 ? 1 : i5;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (i9 != 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$gFer_7Cefj1HGXXkxsgjHRIOTzg(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, obj2, testTag, null, null, primary, large, false, isPaymentInProgress, startRestartGroup, 1769472, 152);
                if (paymentReviewUiModel.getShowTopUpSecondaryButton()) {
                    startRestartGroup.startReplaceGroup(-1520426044);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i5);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_button_top_up_balance, startRestartGroup, i5);
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.TOP_UP_SECONDARY_BUTTON);
                    int i10 = i8 == 32 ? 1 : i5;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (i10 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.m17847$r8$lambda$Onlr_HAp0nYr3S1aeW3LVtvArg(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource2, testTag2, null, null, secondary, large2, false, false, startRestartGroup, 1769856, 408);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1519945544);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.m17849$r8$lambda$VWI9s7Gz7Q4hmKnlRQL3EY6Nu4(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel.this, function1, modifier4, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
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

    /* renamed from: $r8$lambda$-Onlr_HAp0nYr3S1aeW3LVtvArg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17847$r8$lambda$Onlr_HAp0nYr3S1aeW3LVtvArg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.TopUpBalanceClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5UkxeHQjHNxZHSwifLcsdd74XQs(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$94_BRHQ1BXMkPkdYcAJaSsn3OKM(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(384747200);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(384747200, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterWithNoSelectionErrorPreview (PaymentReviewFooter.kt:128)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            copy = r10.copy((r47 & 1) != 0 ? r10.merchantName : null, (r47 & 2) != 0 ? r10.merchantNameDisplayInitials : null, (r47 & 4) != 0 ? r10.amount : null, (r47 & 8) != 0 ? r10.amountCurrencyCode : null, (r47 & 16) != 0 ? r10.rawAmount : null, (r47 & 32) != 0 ? r10.domainPaymentOptions : null, (r47 & 64) != 0 ? r10.selectedPlanId : null, (r47 & 128) != 0 ? r10.paymentOptionsUiModel : null, (r47 & 256) != 0 ? r10.showPaymentCancellationDialog : false, (r47 & 512) != 0 ? r10.showCurrencyConversion : false, (r47 & 1024) != 0 ? r10.showCurrencyOptions : false, (r47 & 2048) != 0 ? r10.showConversionOptionsSheet : false, (r47 & 4096) != 0 ? r10.isPayPalWorld : false, (r47 & 8192) != 0 ? r10.subtotal : null, (r47 & 16384) != 0 ? r10.feeAmount : null, (r47 & 32768) != 0 ? r10.totalAmount : null, (r47 & 65536) != 0 ? r10.currencyConversionData : null, (r47 & 131072) != 0 ? r10.errorType : null, (r47 & 262144) != 0 ? r10.isCancellationInProgress : false, (r47 & 524288) != 0 ? r10.isPaymentInProgress : false, (r47 & 1048576) != 0 ? r10.isPaymentOptionsLoading : false, (r47 & 2097152) != 0 ? r10.showLowBalanceBottomSheet : false, (r47 & 4194304) != 0 ? r10.showNoFiBottomSheet : false, (r47 & 8388608) != 0 ? r10.pendingBottomSheet : null, (r47 & 16777216) != 0 ? r10.showTopUpSecondaryButton : false, (r47 & 33554432) != 0 ? r10.showNoSelectionError : true, (r47 & 67108864) != 0 ? r10.isTipEnabled : false, (r47 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r10.tip : null, (r47 & 268435456) != 0 ? com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_ONLY_FI().tipAmount : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$5UkxeHQjHNxZHSwifLcsdd74XQs((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentReviewFooter(copy, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$94_BRHQ1BXMkPkdYcAJaSsn3OKM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G90U1qvYXkFcWt1IUETT4N-ZOak, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17848$r8$lambda$G90U1qvYXkFcWt1IUETT4NZOak(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KMTS4v7cbUqw8INL2ow1fo3VVAA(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VWI9s7Gz7Q4hmKnlRQL-3EY6Nu4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17849$r8$lambda$VWI9s7Gz7Q4hmKnlRQL3EY6Nu4(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel paymentReviewUiModel, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentReviewFooter(paymentReviewUiModel, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gFer_7Cefj1HGXXkxsgjHRIOTzg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PayNowPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gPWLLr-EwzIih-fuU2IyOab5s6E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17850$r8$lambda$gPWLLrEwzIihfuU2IyOab5s6E(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kQbOGsdgoU5lXC4xHt0ujv-PprY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17851$r8$lambda$kQbOGsdgoU5lXC4xHt0ujvPprY(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2049745309);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2049745309, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterWithTopUpButtonPreview (PaymentReviewFooter.kt:141)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            copy = r10.copy((r47 & 1) != 0 ? r10.merchantName : null, (r47 & 2) != 0 ? r10.merchantNameDisplayInitials : null, (r47 & 4) != 0 ? r10.amount : null, (r47 & 8) != 0 ? r10.amountCurrencyCode : null, (r47 & 16) != 0 ? r10.rawAmount : null, (r47 & 32) != 0 ? r10.domainPaymentOptions : null, (r47 & 64) != 0 ? r10.selectedPlanId : null, (r47 & 128) != 0 ? r10.paymentOptionsUiModel : null, (r47 & 256) != 0 ? r10.showPaymentCancellationDialog : false, (r47 & 512) != 0 ? r10.showCurrencyConversion : false, (r47 & 1024) != 0 ? r10.showCurrencyOptions : false, (r47 & 2048) != 0 ? r10.showConversionOptionsSheet : false, (r47 & 4096) != 0 ? r10.isPayPalWorld : false, (r47 & 8192) != 0 ? r10.subtotal : null, (r47 & 16384) != 0 ? r10.feeAmount : null, (r47 & 32768) != 0 ? r10.totalAmount : null, (r47 & 65536) != 0 ? r10.currencyConversionData : null, (r47 & 131072) != 0 ? r10.errorType : null, (r47 & 262144) != 0 ? r10.isCancellationInProgress : false, (r47 & 524288) != 0 ? r10.isPaymentInProgress : false, (r47 & 1048576) != 0 ? r10.isPaymentOptionsLoading : false, (r47 & 2097152) != 0 ? r10.showLowBalanceBottomSheet : false, (r47 & 4194304) != 0 ? r10.showNoFiBottomSheet : false, (r47 & 8388608) != 0 ? r10.pendingBottomSheet : null, (r47 & 16777216) != 0 ? r10.showTopUpSecondaryButton : true, (r47 & 33554432) != 0 ? r10.showNoSelectionError : false, (r47 & 67108864) != 0 ? r10.isTipEnabled : false, (r47 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r10.tip : null, (r47 & 268435456) != 0 ? com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PP_BALANCE().tipAmount : null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.m17848$r8$lambda$G90U1qvYXkFcWt1IUETT4NZOak((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentReviewFooter(copy, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.m17851$r8$lambda$kQbOGsdgoU5lXC4xHt0ujvPprY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nHsOVu7DAyGXAu5rUOY3Ruv5Ihg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(606195878);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(606195878, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterPayPalWorldPreview (PaymentReviewFooter.kt:154)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel payment_review_ppw = com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PPW();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$KMTS4v7cbUqw8INL2ow1fo3VVAA((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentReviewFooter(payment_review_ppw, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$nHsOVu7DAyGXAu5rUOY3Ruv5Ihg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pHxuQdgziojLf7kgjs69NEwKdZc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2046533507);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2046533507, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterPreview (PaymentReviewFooter.kt:115)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiModel payment_review_only_fi = com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_ONLY_FI();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.m17850$r8$lambda$gPWLLrEwzIihfuU2IyOab5s6E((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentReviewFooter(payment_review_only_fi, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 48, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewFooterKt.$r8$lambda$pHxuQdgziojLf7kgjs69NEwKdZc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pl8m9lLJkDpM9INEWPBxg_GCua4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.ShowConversionOptions.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
