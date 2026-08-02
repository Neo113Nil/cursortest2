package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"FundingInstrumentSelectionSection", "", "uiState", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Content;", "onUiAction", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "addFIConfig", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Content;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentSelectionSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundingInstrumentSelectionSection(final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction, kotlin.Unit> function1, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig2;
        final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig3;
        final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig4;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-286171065);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                addFIConfig2 = addFIConfig;
                if (startRestartGroup.changed(addFIConfig2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                addFIConfig2 = addFIConfig;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            addFIConfig2 = addFIConfig;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                addFIConfig3 = new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig(null, null, null, null, null, 31, null);
                i3 &= -897;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-286171065, i3, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSection (FundingInstrumentSelectionSection.kt:38)");
                }
                if (content.getFundingSourceSection().getSelectedFundingSource() == null) {
                    startRestartGroup.startReplaceGroup(188181476);
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(content.getFundingSourceSection());
                    boolean z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.m21287$r8$lambda$TZnOKjDQv3_QjiUlzXfze0T14(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content.this, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection) obj));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                    boolean z2 = (i3 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$z3acUjuaSK1NxemHkdXTrgbDfBU(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    addFIConfig4 = addFIConfig3;
                    com.paypal.pds.components.AccordionKt.Accordion(listOf, function12, m1708paddingVpY3zN4$default, (kotlin.jvm.functions.Function2) rememberedValue2, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1242665786, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$e3_pE_MGQv687pLffBDCLCWybfk(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content.this, (com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1294068398, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.m21286$r8$lambda$JdTaHf44K1uqBkiPfuT6ZRn3s4(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content.this, function1, addFIConfig3, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 1794048, 128);
                    startRestartGroup.endReplaceGroup();
                } else {
                    addFIConfig4 = addFIConfig3;
                    startRestartGroup.startReplaceGroup(189693129);
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
                    com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection = content.getFundingSourceSection();
                    java.lang.Integer addFIButtonTextRes = content.getAddFIButtonTextRes();
                    int i5 = i3 & 112;
                    boolean z3 = i5 == 32;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$FQCyKNhevpX6aImOOD87zO9tK_I(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue3;
                    boolean z4 = i5 == 32;
                    boolean z5 = (((i3 & 896) ^ 384) > 256 && startRestartGroup.changed(addFIConfig4)) || (i3 & 384) == 256;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z5 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$G2RQMNmpmTpTYEVffGlaM6mzcb8(kotlin.jvm.functions.Function1.this, addFIConfig4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    boolean z6 = i5 == 32;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$0F0UnbECeLyNPodVRO0Cy7v8rbc(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.FundingInstrumentSelectionUI(fundingSourceSection, function13, function0, (kotlin.jvm.functions.Function0) rememberedValue5, m1706padding3ABfNKs, addFIButtonTextRes, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                addFIConfig2 = addFIConfig4;
            }
            addFIConfig3 = addFIConfig2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (content.getFundingSourceSection().getSelectedFundingSource() == null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            addFIConfig2 = addFIConfig4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig5 = addFIConfig2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.m21288$r8$lambda$dWretTCeZgsyTJkBb8pPtS2EA(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content.this, function1, addFIConfig5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0F0UnbECeLyNPodVRO0Cy7v8rbc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ViewIneligibleFundingSources.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9tXQbKhDgp1ALfCpj0Vj0JAI66k(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ViewIneligibleFundingSources.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FQCyKNhevpX6aImOOD87zO9tK_I(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G2RQMNmpmTpTYEVffGlaM6mzcb8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig) {
        function1.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource(addFIConfig));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JdTaHf44K1uqBkiPfuT6ZR-n3s4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21286$r8$lambda$JdTaHf44K1uqBkiPfuT6ZRn3s4(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1294068398, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSection.<anonymous> (FundingInstrumentSelectionSection.kt:55)");
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection2 = content.getFundingSourceSection();
        java.lang.Integer addFIButtonTextRes = content.getAddFIButtonTextRes();
        boolean changed = composer.changed(function1);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$bITlWnMdEzjUraboCUC7TffZBak(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
        boolean changed2 = composer.changed(function1);
        boolean changed3 = composer.changed(addFIConfig);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed2 | changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$w2dN8XSKW25p9ALvjJmVI1ivZN0(kotlin.jvm.functions.Function1.this, addFIConfig);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed4 = composer.changed(function1);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSectionKt.$r8$lambda$9tXQbKhDgp1ALfCpj0Vj0JAI66k(kotlin.jvm.functions.Function1.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.wallet.fifo.common.ui.FundingInstrumentSelectionUIKt.FundingInstrumentSelectionUI(fundingSourceSection2, function12, function0, (kotlin.jvm.functions.Function0) rememberedValue3, null, addFIButtonTextRes, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TZnO-KjDQv3_QjiUlzXfz-e0T14, reason: not valid java name */
    public static /* synthetic */ boolean m21287$r8$lambda$TZnOKjDQv3_QjiUlzXfze0T14(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
        return content.getFundingSourceSection().isExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bITlWnMdEzjUraboCUC7TffZBak(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$d-WretTCeZgsyTJ-kBb8pPtS2EA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21288$r8$lambda$dWretTCeZgsyTJkBb8pPtS2EA(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentSelectionSection(content, function1, addFIConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3_pE_MGQv687pLffBDCLCWybfk(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1242665786, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingInstrumentSelectionSection.<anonymous> (FundingInstrumentSelectionSection.kt:49)");
        }
        com.paypal.oslo.feature.wallet.common.accordions.SelectedFundingInstrumentUiKt.SelectedFundingInstrumentUi(content.getFundingSourceSection().isExpanded(), content.getFundingSourceSection().getSelectedFundingSource(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w2dN8XSKW25p9ALvjJmVI1ivZN0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig) {
        function1.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource(addFIConfig));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z3acUjuaSK1NxemHkdXTrgbDfBU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
        function1.invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ToggleFundingSourceSection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
