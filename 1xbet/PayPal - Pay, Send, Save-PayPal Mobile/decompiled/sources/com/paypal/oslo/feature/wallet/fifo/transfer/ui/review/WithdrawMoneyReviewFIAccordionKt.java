package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aU\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "withdrawFISection", "Lkotlin/Function0;", "", "onToggleFIClick", "Lkotlin/Function1;", "", "onSelectFI", "onAddNewFI", "onIneligibleFIClick", "WithdrawMoneyReviewFIAccordion", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithdrawMoneyReviewFIAccordionKt {
    public static final void WithdrawMoneyReviewFIAccordion(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2005365656);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(withdrawFISection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2005365656, i2, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordion (WithdrawMoneyReviewFIAccordion.kt:32)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(withdrawFISection);
            boolean changedInstance = startRestartGroup.changedInstance(withdrawFISection);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.$r8$lambda$TJyCtBc9dWjTgIuadg54uB4w4v8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(withdrawFISection);
            boolean z = (i2 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.$r8$lambda$UEMctptHMFLxte2FzwnQNt9668I(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, function0, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.AccordionKt.Accordion(listOf, function12, m1706padding3ABfNKs, (kotlin.jvm.functions.Function2) rememberedValue2, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1139143121, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.$r8$lambda$lKiwdsoxyNar7u259Q_if7dgB1Q(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, (com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1894056345, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.$r8$lambda$pmtQOsg2dOxz9__YFTP5ULRSx2k(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, function1, function03, function02, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, 1794048, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.m21326$r8$lambda$UibXsGX9BYCHuydo66B3AAbEtg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection.this, function0, function1, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0qDgXfnYb0rfpt9i2qpSuBLODU4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$TJyCtBc9dWjTgIuadg54uB4w4v8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection2, "");
        return withdrawFISection.isExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UEMctptHMFLxte2FzwnQNt9668I(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection2, "");
        if (withdrawFISection.getSelectedFundingInstrument() != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UibXsGX9BYCHuydo66B3-AAbEtg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21326$r8$lambda$UibXsGX9BYCHuydo66B3AAbEtg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        WithdrawMoneyReviewFIAccordion(withdrawFISection, function0, function1, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aA9P1-sxH89wQjaT4uQ9eBvle94, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21327$r8$lambda$aA9P1sxH89wQjaT4uQ9eBvle94(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1427310089);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1427310089, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionPreview (WithdrawMoneyReviewFIAccordion.kt:63)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection sampleWithdrawFISection = com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewData.INSTANCE.getSampleWithdrawFISection();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda0
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.$r8$lambda$0qDgXfnYb0rfpt9i2qpSuBLODU4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            WithdrawMoneyReviewFIAccordion(sampleWithdrawFISection, function0, function1, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 28080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordionKt.m21327$r8$lambda$aA9P1sxH89wQjaT4uQ9eBvle94(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lKiwdsoxyNar7u259Q_if7dgB1Q(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1139143121, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordion.<anonymous> (WithdrawMoneyReviewFIAccordion.kt:45)");
        }
        com.paypal.oslo.feature.wallet.common.accordions.SelectedFundingInstrumentUiKt.SelectedFundingInstrumentUi(withdrawFISection.isExpanded(), withdrawFISection.getSelectedFundingInstrument(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pmtQOsg2dOxz9__YFTP5ULRSx2k(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1894056345, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFIAccordion.<anonymous> (WithdrawMoneyReviewFIAccordion.kt:51)");
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewFISelectionUIKt.WithdrawMoneyReviewFISelectionUI(withdrawFISection, null, function1, function0, function02, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
