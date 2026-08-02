package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "withdrawSpeedSection", "Lkotlin/Function0;", "", "onToggleSpeedClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "onWithdrawSpeedSelect", "WithdrawMoneyReviewSpeedAccordion", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "TestTagWithdrawSpeedRowHeader", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithdrawMoneyReviewSpeedAccordionKt {
    public static final java.lang.String TestTagWithdrawSpeedRowHeader = "withdraw_speed_row_header";

    public static final void WithdrawMoneyReviewSpeedAccordion(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1899469762);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(withdrawSpeedSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1899469762, i3, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordion (WithdrawMoneyReviewSpeedAccordion.kt:37)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(withdrawSpeedSection);
            boolean changedInstance = startRestartGroup.changedInstance(withdrawSpeedSection);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$9lVCWwd6p1iU92Bmpr3Fn8TcYgk(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(withdrawSpeedSection);
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$nCVAk6QTApuh4Fx4pyxQ89FiDNs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, function0, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.AccordionKt.Accordion(listOf, function12, background, (kotlin.jvm.functions.Function2) rememberedValue2, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1538774833, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$3zA9h4o9GWjaEnGOZEiUOM7g0t8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, (com.paypal.pds.components.AccordionHeaderScope) obj, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(54706139, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$qDVKfH9gL2YF0tlmxHqiCOczlBE(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, function1, (com.paypal.pds.components.AccordionBodyScope) obj, (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, 1794048, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.m21353$r8$lambda$DaeVmMgbpkufmjWXjKjWklfRPg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection.this, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3zA9h4o9GWjaEnGOZEiUOM7g0t8(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1538774833, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordion.<anonymous> (WithdrawMoneyReviewSpeedAccordion.kt:51)");
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.SelectedWithdrawSpeedUIKt.SelectedWithdrawSpeedUI(withdrawSpeedSection.isExpanded(), withdrawSpeedSection.getSelectedWithdrawSpeed(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagWithdrawSpeedRowHeader), composer, 384, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$9lVCWwd6p1iU92Bmpr3Fn8TcYgk(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection2, "");
        return withdrawSpeedSection.isExpanded();
    }

    /* renamed from: $r8$lambda$Dae-VmMgbpkufmjWXjKjWklfRPg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21353$r8$lambda$DaeVmMgbpkufmjWXjKjWklfRPg(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        WithdrawMoneyReviewSpeedAccordion(withdrawSpeedSection, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y2D5zAcmiJoD0vq_pPupYZk1WEA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-669417157);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-669417157, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionPreview (WithdrawMoneyReviewSpeedAccordion.kt:68)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection(true, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT, com.paypal.pds.core.Icon.Clock.INSTANCE, "1.50", "USD", 0, 0, 48, null), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel[]{new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT, com.paypal.pds.core.Icon.Clock.INSTANCE, "1.50", "USD", 0, 0, 48, null), new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawSpeedUIModel(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD, com.paypal.pds.core.Icon.Calendar.INSTANCE, "0.00", "USD", 1, 3)}), null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda1
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$vNU4qmu3f4M7DWk7tqPUFmNOVZE((com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            WithdrawMoneyReviewSpeedAccordion(withdrawSpeedSection, function0, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.$r8$lambda$Y2D5zAcmiJoD0vq_pPupYZk1WEA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mpOScclR3DRPfuyJO0zPuAfG-Go, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21354$r8$lambda$mpOScclR3DRPfuyJO0zPuAfGGo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        function1.invoke(transferSpeed);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nCVAk6QTApuh4Fx4pyxQ89FiDNs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection2, "");
        if (withdrawSpeedSection.getSelectedWithdrawSpeed() != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qDVKfH9gL2YF0tlmxHqiCOczlBE(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, final kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection2, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(54706139, i, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordion.<anonymous> (WithdrawMoneyReviewSpeedAccordion.kt:58)");
        }
        boolean changed = composer.changed(function1);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedAccordionKt.m21354$r8$lambda$mpOScclR3DRPfuyJO0zPuAfGGo(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewSpeedSelectionUIKt.WithdrawMoneyReviewSpeedSelectionUI(withdrawSpeedSection, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vNU4qmu3f4M7DWk7tqPUFmNOVZE(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        return kotlin.Unit.INSTANCE;
    }
}
