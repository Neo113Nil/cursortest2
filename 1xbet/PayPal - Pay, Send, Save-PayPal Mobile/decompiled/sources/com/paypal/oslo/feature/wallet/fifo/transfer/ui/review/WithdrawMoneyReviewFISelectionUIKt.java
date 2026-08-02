package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"TestTagIneligibleFundsSection", "", "TestTagAddPaymentMethodsButton", "TestTagSelectedFIRow", "TestTagWithdrawMoneyFIError", "TestTagFundingInstrumentExpandedTitle", "WithdrawMoneyReviewFISelectionUI", "", "withdrawFISection", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "modifier", "Landroidx/compose/ui/Modifier;", "onSelectFI", "Lkotlin/Function1;", "onIneligibleFIClick", "Lkotlin/Function0;", "onAddFI", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "WithdrawMoneyReviewFISelectionUIPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawMoneyReviewFISelectionUIKt {
    public static final java.lang.String TestTagAddPaymentMethodsButton = "add_payment_methods_button";
    public static final java.lang.String TestTagFundingInstrumentExpandedTitle = "funding_instrument_expanded_title";
    public static final java.lang.String TestTagIneligibleFundsSection = "ineligible_funds_row_section";
    public static final java.lang.String TestTagSelectedFIRow = "selected_funding_instrument_row";
    public static final java.lang.String TestTagWithdrawMoneyFIError = "withdraw_money_fi_error";

    /* JADX WARN: Removed duplicated region for block: B:120:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawMoneyReviewFISelectionUI(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        java.lang.String str;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1672285755);
        int i7 = (i & 6) == 0 ? (startRestartGroup.changedInstance(withdrawFISection) ? 4 : 2) | i : i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i7 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i7 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i7 |= 3072;
                } else if ((i & 3072) == 0) {
                    function03 = function0;
                    i7 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                    i5 = i2 & 16;
                    if (i5 == 0) {
                        i7 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i7 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            function13 = function12;
                            function04 = function03;
                            function05 = function02;
                        } else {
                            companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i3 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.$r8$lambda$rl9_j6qhiFfsjEma0Nv3zPY5GuA((java.lang.String) obj);
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
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function06 = function03;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            } else {
                                function07 = function02;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1672285755, i7, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUI (WithdrawMoneyReviewFISelectionUI.kt:60)");
                            }
                            kotlin.jvm.functions.Function0<kotlin.Unit> function011 = function07;
                            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_to, startRestartGroup, 0);
                            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_header_content_description, new java.lang.Object[]{stringResource}, startRestartGroup, 0);
                            int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "funding_instrument_expanded_title");
                            boolean changed = startRestartGroup.changed(stringResource2);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.m21332$r8$lambda$qWoGHLKVEHIHt4flAk_aemcNIs(stringResource2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function012 = function06;
                            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16 = function14;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue4), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 1, 0, null, null, startRestartGroup, 12779520, 0, 1884);
                            java.lang.String fundingInstrumentError = withdrawFISection.getFundingInstrumentError();
                            if (fundingInstrumentError != null) {
                                startRestartGroup.startReplaceGroup(-586039889);
                                com.paypal.pds.components.BannerStyle.Warning warning = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
                                str = TestTagWithdrawMoneyFIError;
                                com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null), TestTagWithdrawMoneyFIError), warning, fundingInstrumentError, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            } else {
                                startRestartGroup.startReplaceGroup(-586039890);
                                startRestartGroup.endReplaceGroup();
                                str = TestTagWithdrawMoneyFIError;
                            }
                            com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded = withdrawFISection.getIneligibleFiAdded();
                            if (ineligibleFiAdded != null) {
                                startRestartGroup.startReplaceGroup(-585691914);
                                com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null), str), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.getIneligibleFIAddedErrorText(ineligibleFiAdded, startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            } else {
                                startRestartGroup.startReplaceGroup(-585691915);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.startReplaceGroup(-434521974);
                            for (final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel : withdrawFISection.getFundingInstruments()) {
                                java.lang.String id = fundingInstrumentUiModel.getId();
                                com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingInstrument = withdrawFISection.getSelectedFundingInstrument();
                                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(id, selectedFundingInstrument != null ? selectedFundingInstrument.getId() : null);
                                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), TestTagSelectedFIRow);
                                boolean z = (i7 & 896) == 256;
                                boolean changed2 = startRestartGroup.changed(fundingInstrumentUiModel);
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if ((changed2 || z) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    function15 = function16;
                                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.$r8$lambda$IYbLbd61H7ZBY78VSDk4RjbUlHo(kotlin.jvm.functions.Function1.this, fundingInstrumentUiModel);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                } else {
                                    function15 = function16;
                                }
                                final androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = columnScopeInstance2;
                                com.paypal.oslo.feature.wallet.common.ui.RadioItemRowKt.RadioItemRow(areEqual, (kotlin.jvm.functions.Function0) rememberedValue5, testTag2, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1797945902, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.m21331$r8$lambda$diSpVvmfKHY0rb3YwWjmHtN65o(androidx.compose.foundation.layout.ColumnScope.this, fundingInstrumentUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 27648, 0);
                                columnScopeInstance2 = columnScopeInstance3;
                                function16 = function15;
                            }
                            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function17 = function16;
                            startRestartGroup.endReplaceGroup();
                            if (!withdrawFISection.getIneligibleFundingInstruments().isEmpty()) {
                                startRestartGroup.startReplaceGroup(-584535955);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagIneligibleFundsSection), 0.0f, com.paypal.pds.core.ConstantsKt.getSize48(), 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), 0.0f, 1, null);
                                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                                com.paypal.pds.core.Icon.QuestionCircle questionCircle = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
                                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_see_other_payment_methods, startRestartGroup, 0);
                                boolean z2 = (i7 & 7168) == 2048;
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (z2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    function010 = function012;
                                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.$r8$lambda$lk595qMHDMHE4WTsf0vQBRxPLnM(kotlin.jvm.functions.Function0.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                } else {
                                    function010 = function012;
                                }
                                function08 = function010;
                                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue6, stringResource3, fillMaxWidth$default, questionCircle, null, tertiary, null, false, false, startRestartGroup, 199680, 464);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function08 = function012;
                                startRestartGroup.startReplaceGroup(-583967043);
                                startRestartGroup.endReplaceGroup();
                            }
                            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), 0.0f, 1, null), TestTagAddPaymentMethodsButton);
                            com.paypal.pds.components.ButtonStyle buttonStyle = withdrawFISection.getFundingInstruments().isEmpty() ? com.paypal.pds.components.ButtonStyle.Primary.INSTANCE : com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                            com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
                            int i9 = com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.WhenMappings.$EnumSwitchMapping$0[withdrawFISection.getAddFIAvailability().ordinal()];
                            if (i9 == 1) {
                                i6 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_review_add_bank;
                            } else if (i9 == 2) {
                                i6 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_review_add_debit_card;
                            } else {
                                if (i9 != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                i6 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_bank_or_debit_card;
                            }
                            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i6, startRestartGroup, 0);
                            boolean z3 = (i7 & 57344) == 16384;
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function09 = function011;
                                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.$r8$lambda$18cyGItRwBf13NOzJiGPyEMi7EY(kotlin.jvm.functions.Function0.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            } else {
                                function09 = function011;
                            }
                            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue7, stringResource4, testTag3, plus, null, buttonStyle, null, false, false, startRestartGroup, 3072, 464);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function05 = function09;
                            function13 = function17;
                            function04 = function08;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function013 = function05;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.$r8$lambda$h2iyI4EA3__xA7xMXgfTG5Bkuho(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, modifier3, function13, function04, function013, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function03 = function0;
                i5 = i2 & 16;
                if (i5 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            function03 = function0;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        function12 = function1;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function03 = function0;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$18cyGItRwBf13NOzJiGPyEMi7EY(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7SFUMJTu-HHFSbpaaztGxJXC0N4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21329$r8$lambda$7SFUMJTuHHFSbpaaztGxJXC0N4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IYbLbd61H7ZBY78VSDk4RjbUlHo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
        function1.invoke(fundingInstrumentUiModel.getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_qPS-3Lit-It_rhXBRLnX_ZQhIc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21330$r8$lambda$_qPS3LitIt_rhXBRLnX_ZQhIc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(914349849);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(914349849, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIPreview (WithdrawMoneyReviewFISelectionUI.kt:157)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection sampleWithdrawFISection = com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleWithdrawFISection();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.m21329$r8$lambda$7SFUMJTuHHFSbpaaztGxJXC0N4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            WithdrawMoneyReviewFISelectionUI(sampleWithdrawFISection, null, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 28032, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.m21330$r8$lambda$_qPS3LitIt_rhXBRLnX_ZQhIc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$diS-pVvmfKHY0rb3YwWjmHtN65o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21331$r8$lambda$diSpVvmfKHY0rb3YwWjmHtN65o(androidx.compose.foundation.layout.ColumnScope columnScope, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1797945902, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUI.<anonymous>.<anonymous>.<anonymous> (WithdrawMoneyReviewFISelectionUI.kt:108)");
            }
            com.paypal.oslo.feature.wallet.common.ui.FundingInstrumentRowKt.FundingInstrumentRow(fundingInstrumentUiModel, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 11, null), false, null, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h2iyI4EA3__xA7xMXgfTG5Bkuho(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawMoneyReviewFISelectionUI(withdrawFISection, modifier, function1, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lk595qMHDMHE4WTsf0vQBRxPLnM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qWoGHLKVEHIHt4f-lAk_aemcNIs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21332$r8$lambda$qWoGHLKVEHIHt4flAk_aemcNIs(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rl9_j6qhiFfsjEma0Nv3zPY5GuA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.BANK_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.CARD_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.AddFIAvailability.BANK_AND_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
