package com.paypal.oslo.feature.wallet.fifo.common.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"TestTagAddFundingInstrumentInList", "", "TestTagAddFundingInstrument", "TestTagViewIneligibleFI", "TestTagFundingInstrumentError", "TestTagFundingInstrumentExpandedTitle", "FundingInstrumentSelectionUI", "", "fundingSourceState", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "onSelectFI", "Lkotlin/Function1;", "onAddFI", "Lkotlin/Function0;", "onClickIneligibleFI", "modifier", "Landroidx/compose/ui/Modifier;", "addFIButtonTextRes", "", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "getIneligibleFIAddedErrorText", "fundingInstrumentUiModel", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "(Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "FundingSourceAccordionExpandedPreview", "(Landroidx/compose/runtime/Composer;I)V", "FundingSourceAccordionExpandedWithNoFIPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentSelectionUIKt {
    public static final java.lang.String TestTagAddFundingInstrument = "add_funding_instrument";
    public static final java.lang.String TestTagAddFundingInstrumentInList = "add_funding_instrument_in_list";
    public static final java.lang.String TestTagFundingInstrumentError = "funding_instrument_error";
    public static final java.lang.String TestTagFundingInstrumentExpandedTitle = "funding_instrument_expanded_title";
    public static final java.lang.String TestTagViewIneligibleFI = "view_ineligible_funding_instruments";

    /* JADX WARN: Removed duplicated region for block: B:109:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingInstrumentSelectionUI(final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, java.lang.Integer num, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.Integer num2;
        final java.lang.Integer num3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1527487495);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(fundingSourceSection) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                num2 = num;
                i4 |= startRestartGroup.changed(num2) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    num3 = num2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.Integer num4 = i3 != 0 ? null : num2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1527487495, i4, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUI (FundingInstrumentSelectionUI.kt:74)");
                    }
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num4 != null ? num4.intValue() : com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_bank_or_debit_card, startRestartGroup, 0);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_add_money_review_from_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "funding_instrument_expanded_title"), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, null, startRestartGroup, 12779568, 0, 1884);
                    java.lang.String fundingSourceError = fundingSourceSection.getFundingSourceError();
                    if (fundingSourceError != null) {
                        startRestartGroup.startReplaceGroup(-1678711825);
                        com.paypal.pds.components.BannerStyle.Warning warning = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
                        str = TestTagFundingInstrumentError;
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null), TestTagFundingInstrumentError), warning, fundingSourceError, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } else {
                        startRestartGroup.startReplaceGroup(-1678711826);
                        startRestartGroup.endReplaceGroup();
                        str = TestTagFundingInstrumentError;
                    }
                    com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel ineligibleFiAdded = fundingSourceSection.getIneligibleFiAdded();
                    if (ineligibleFiAdded != null) {
                        startRestartGroup.startReplaceGroup(-1678362672);
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null), str), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, getIneligibleFIAddedErrorText(ineligibleFiAdded, startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    } else {
                        startRestartGroup.startReplaceGroup(-1678362673);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.startReplaceGroup(1469892303);
                    for (final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel : fundingSourceSection.getFundingSources()) {
                        java.lang.String id = fundingInstrumentUiModel.getId();
                        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel selectedFundingSource = fundingSourceSection.getSelectedFundingSource();
                        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(id, selectedFundingSource != null ? selectedFundingSource.getId() : null);
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                        boolean z = (i4 & 112) == 32;
                        boolean changed = startRestartGroup.changed(fundingInstrumentUiModel);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$MqLJUO3tp8s3GlcvkYjV9EczN4o(kotlin.jvm.functions.Function1.this, fundingInstrumentUiModel);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
                        com.paypal.oslo.feature.wallet.common.ui.RadioItemRowKt.RadioItemRow(areEqual, (kotlin.jvm.functions.Function0) rememberedValue, m1706padding3ABfNKs, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(438967376, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$e9B4pZgmcn3xkkWNiqRSM2tYEUw(androidx.compose.foundation.layout.ColumnScope.this, fundingInstrumentUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 24576, 8);
                        columnScopeInstance = columnScopeInstance2;
                    }
                    startRestartGroup.endReplaceGroup();
                    if (!fundingSourceSection.getIneligibleFundingSources().isEmpty()) {
                        startRestartGroup.startReplaceGroup(-1677285236);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagViewIneligibleFI);
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_see_other_payment_methods, startRestartGroup, 0);
                        com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                        com.paypal.pds.core.Icon.QuestionCircle questionCircle = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
                        boolean z2 = (i4 & 7168) == 2048;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$Fv4WolaxDyj5pQrXWcKCMg9emVk(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource2, testTag, questionCircle, null, tertiary, null, false, false, startRestartGroup, 200064, 464);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1676857281);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (fundingSourceSection.getFundingSources().isEmpty()) {
                        startRestartGroup.startReplaceGroup(-1676775813);
                        com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), 0.0f, 1, null), TestTagAddFundingInstrument);
                        boolean z3 = (i4 & 896) == 256;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.m21297$r8$lambda$sfyF2WgCPpbrF6YEVMflcvwUnQ(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource, testTag2, plus, null, null, null, false, false, startRestartGroup, 3072, 496);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1676434069);
                        com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                        com.paypal.pds.core.Icon.Plus plus2 = com.paypal.pds.core.Icon.Plus.INSTANCE;
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAddFundingInstrumentInList), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                        boolean z4 = (i4 & 896) == 256;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$ObDtb9QsRPG5t1n5n2sd3AnotzQ(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource, m1708paddingVpY3zN4$default, plus2, null, secondary, null, false, false, startRestartGroup, 199680, 464);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    num3 = num4;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.m21294$r8$lambda$N7lwM_J_5VtJi6YeiIBUKhgqkE(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection.this, function1, function0, function02, modifier5, num3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            num2 = num;
            if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        num2 = num;
        if (!startRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final java.lang.String getIneligibleFIAddedErrorText(com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1393763533, i, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.getIneligibleFIAddedErrorText (FundingInstrumentSelectionUI.kt:162)");
        }
        if (com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentUiModel.getType().ordinal()] == 1) {
            composer.startReplaceGroup(2134598017);
            java.lang.String lastNChars = fundingInstrumentUiModel.getLastNChars().length() == 0 ? "XXXX" : fundingInstrumentUiModel.getLastNChars();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            stringResource = java.lang.String.format(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_added_ineligible_card, composer, 0), java.util.Arrays.copyOf(new java.lang.Object[]{lastNChars}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringResource, "");
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(623057690);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_added_ineligible_bank, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* renamed from: $r8$lambda$BArIFZpH3u0p6SRcbDxJrvUe-jo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21293$r8$lambda$BArIFZpH3u0p6SRcbDxJrvUejo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fv4WolaxDyj5pQrXWcKCMg9emVk(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MqLJUO3tp8s3GlcvkYjV9EczN4o(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
        function1.invoke(fundingInstrumentUiModel.getId());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N7lwM_J_5V-tJi6YeiIBUKhgqkE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21294$r8$lambda$N7lwM_J_5VtJi6YeiIBUKhgqkE(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, java.lang.Integer num, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentSelectionUI(fundingSourceSection, function1, function0, function02, modifier, num, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ObDtb9QsRPG5t1n5n2sd3AnotzQ(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SnViDblJsTkmrf0WOf6wiLGXNvw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1154768508);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1154768508, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.FundingSourceAccordionExpandedWithNoFIPreview (FundingInstrumentSelectionUI.kt:204)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.oslo.feature.wallet.common.accordions.SelectedFundingInstrumentUiKt.SelectedFundingInstrumentUi(true, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleSelectedFundingInstrument(), null, startRestartGroup, 6, 4);
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection(false, null, kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$nwUY1ND2bU0q1ACliQH0IzhAqAg((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda2
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentSelectionUI(fundingSourceSection, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, 3504, 48);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$SnViDblJsTkmrf0WOf6wiLGXNvw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e9B4pZgmcn3xkkWNiqRSM2tYEUw(androidx.compose.foundation.layout.ColumnScope columnScope, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(438967376, i, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUI.<anonymous>.<anonymous>.<anonymous> (FundingInstrumentSelectionUI.kt:110)");
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$nwUY1ND2bU0q1ACliQH0IzhAqAg(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qEvgA7eykQ7vXOXFr1bmJtxmj7Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1186949830);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1186949830, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.common.ui.FundingSourceAccordionExpandedPreview (FundingInstrumentSelectionUI.kt:178)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            com.paypal.oslo.feature.wallet.common.accordions.SelectedFundingInstrumentUiKt.SelectedFundingInstrumentUi(true, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleSelectedFundingInstrument(), null, startRestartGroup, 6, 4);
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection(true, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleSelectedFundingInstrument(), com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleFundingInstruments(), com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleIneligibleFundingInstruments(), "This funding source is not eligible for this transaction.", null, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleIneligibleFundingInstrument(), 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.m21293$r8$lambda$BArIFZpH3u0p6SRcbDxJrvUejo((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda11
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            FundingInstrumentSelectionUI(fundingSourceSection, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, 3504, 48);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.$r8$lambda$qEvgA7eykQ7vXOXFr1bmJtxmj7Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sfyF2W-gCPpbrF6YEVMflcvwUnQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21297$r8$lambda$sfyF2WgCPpbrF6YEVMflcvwUnQ(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
