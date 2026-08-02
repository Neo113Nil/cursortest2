package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TestTagWithdrawMoneySpeedError", "", "TestTagSpeedSelectionExpandedTitle", "WithdrawMoneyReviewSpeedSelectionUI", "", "withdrawSpeedSection", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "modifier", "Landroidx/compose/ui/Modifier;", "onWithdrawSpeedSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "WithdrawMoneyReviewSpeedSelectionUIPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawMoneyReviewSpeedSelectionUIKt {
    public static final java.lang.String TestTagSpeedSelectionExpandedTitle = "speed_selection_expanded_title";
    public static final java.lang.String TestTagWithdrawMoneySpeedError = "withdraw_money_speed_error";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawMoneyReviewSpeedSelectionUI(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function12;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function14;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;
        boolean z;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(140317787);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(withdrawSpeedSection) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i3 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.m21356$r8$lambda$NNpDEhU9R2qItZ1tkUUI74BLhs((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(140317787, i4, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUI (WithdrawMoneyReviewSpeedSelectionUI.kt:49)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_speed, startRestartGroup, 0);
                    final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_header_content_description, new java.lang.Object[]{stringResource}, startRestartGroup, 0);
                    int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagSpeedSelectionExpandedTitle);
                    boolean changed = startRestartGroup.changed(stringResource2);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.m21357$r8$lambda$oxvEaaBNZvM5OaEVrDk22AGpwM(stringResource2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
                    modifier3 = modifier4;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function16 = function14;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag, (kotlin.jvm.functions.Function1) rememberedValue2), null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 1, 0, null, null, startRestartGroup, 12779520, 0, 1884);
                    java.lang.String withdrawSpeedError = withdrawSpeedSection.getWithdrawSpeedError();
                    if (withdrawSpeedError != null) {
                        startRestartGroup.startReplaceGroup(1711135008);
                        transferSpeed = null;
                        z = true;
                        com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), 0.0f, 1, null), TestTagWithdrawMoneySpeedError), com.paypal.pds.components.BannerStyle.Warning.INSTANCE, withdrawSpeedError, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 120);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1711135007);
                        startRestartGroup.endReplaceGroup();
                        z = true;
                        transferSpeed = null;
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel> withdrawSpeedItems = withdrawSpeedSection.getWithdrawSpeedItems();
                    if (withdrawSpeedItems == null) {
                        startRestartGroup.startReplaceGroup(1711542440);
                    } else {
                        startRestartGroup.startReplaceGroup(1711542441);
                        for (final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel : withdrawSpeedItems) {
                            com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed speedType = withdrawSpeedUIModel.getSpeedType();
                            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel selectedWithdrawSpeed = withdrawSpeedSection.getSelectedWithdrawSpeed();
                            boolean z2 = speedType == (selectedWithdrawSpeed != null ? selectedWithdrawSpeed.getSpeedType() : transferSpeed) ? z : false;
                            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                            boolean z3 = (i4 & 896) == 256 ? z : false;
                            boolean changed2 = startRestartGroup.changed(withdrawSpeedUIModel);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if ((z3 || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function15 = function16;
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.$r8$lambda$jEutpKda7MTonEPnbt7fwIG1oTg(kotlin.jvm.functions.Function1.this, withdrawSpeedUIModel);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            } else {
                                function15 = function16;
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            final androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = columnScopeInstance2;
                            com.paypal.oslo.feature.wallet.common.ui.RadioItemRowKt.RadioItemRow(z2, function0, m1706padding3ABfNKs, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1119903491, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.$r8$lambda$l2Qa7_jRHORhHoWVfVqkMFXA7nQ(androidx.compose.foundation.layout.ColumnScope.this, withdrawSpeedUIModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 27648, 0);
                            columnScopeInstance2 = columnScopeInstance3;
                            function16 = function15;
                        }
                    }
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function17 = function16;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function17;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.$r8$lambda$5fwkZOcm3jLL_mIyvkn3nIWF06c(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, modifier5, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
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
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5fwkZOcm3jLL_mIyvkn3nIWF06c(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawMoneyReviewSpeedSelectionUI(withdrawSpeedSection, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CC5sBFo3a1mUVGbZ16-z4s_vBL4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21355$r8$lambda$CC5sBFo3a1mUVGbZ16z4s_vBL4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-481431301);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-481431301, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIPreview (WithdrawMoneyReviewSpeedSelectionUI.kt:101)");
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
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.SelectedWithdrawSpeedUIKt.SelectedWithdrawSpeedUI(true, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleSelectedWithdrawSpeed(), null, startRestartGroup, 6, 4);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection sampleWithdrawSpeedSection = com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleWithdrawSpeedSection();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.$r8$lambda$TmcakuqtnihuIy9iKw7ZQT47oKE((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WithdrawMoneyReviewSpeedSelectionUI(sampleWithdrawSpeedSection, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 384, 2);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.m21355$r8$lambda$CC5sBFo3a1mUVGbZ16z4s_vBL4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NNpDEhU9R2qItZ1t-kUUI74BLhs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21356$r8$lambda$NNpDEhU9R2qItZ1tkUUI74BLhs(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TmcakuqtnihuIy9iKw7ZQT47oKE(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jEutpKda7MTonEPnbt7fwIG1oTg(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel) {
        function1.invoke(withdrawSpeedUIModel.getSpeedType());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l2Qa7_jRHORhHoWVfVqkMFXA7nQ(androidx.compose.foundation.layout.ColumnScope columnScope, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel withdrawSpeedUIModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1119903491, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUI.<anonymous>.<anonymous>.<anonymous> (WithdrawMoneyReviewSpeedSelectionUI.kt:88)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.WithdrawSpeedRowKt.WithdrawSpeedRow(withdrawSpeedUIModel, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScope, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 11, null), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oxvEaaBNZvM5OaEVrD-k22AGpwM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21357$r8$lambda$oxvEaaBNZvM5OaEVrDk22AGpwM(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
