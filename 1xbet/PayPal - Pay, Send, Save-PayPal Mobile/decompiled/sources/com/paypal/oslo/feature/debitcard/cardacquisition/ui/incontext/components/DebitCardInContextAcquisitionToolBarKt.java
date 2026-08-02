package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;", "toolBarConfig", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "", "onEvent", "DebitCardInContextAcquisitionToolBar", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardToolBarConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardInContextAcquisitionToolBarKt {
    public static final void DebitCardInContextAcquisitionToolBar(final com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig debitCardToolBarConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2044071976);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(debitCardToolBarConfig) : startRestartGroup.changedInstance(debitCardToolBarConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2044071976, i2, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBar (DebitCardInContextAcquisitionToolBar.kt:23)");
            }
            if (debitCardToolBarConfig == null || (trailingButtonType = debitCardToolBarConfig.getTrailingButtonType()) == null) {
                trailingButtonType = com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE;
            }
            boolean showBackButton = debitCardToolBarConfig != null ? debitCardToolBarConfig.getShowBackButton() : false;
            java.lang.String title = debitCardToolBarConfig != null ? debitCardToolBarConfig.getTitle() : null;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig progressBarConfig = debitCardToolBarConfig != null ? debitCardToolBarConfig.getProgressBarConfig() : null;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt.$r8$lambda$7Yb6U1G86Ym4RKEwrsw8RTGb4ck(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed = startRestartGroup.changed(trailingButtonType.ordinal());
            boolean z2 = i3 == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt.m14241$r8$lambda$kNcwO0TW3GwBw8vZ4u1K954up0(com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.this, function1, (com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(null, title, showBackButton, trailingButtonType, function0, (kotlin.jvm.functions.Function1) rememberedValue2, progressBarConfig, startRestartGroup, com.paypal.oslo.feature.debitcard.api.model.DebitCardProgressBarConfig.$stable << 18, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt.$r8$lambda$n7IcA9QcYZ_wNPMaFvLFTmIKhLE(com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7Yb6U1G86Ym4RKEwrsw8RTGb4ck(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kNcwO0TW3-GwBw8vZ4u1K954up0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14241$r8$lambda$kNcwO0TW3GwBw8vZ4u1K954up0(com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType trailingButtonType2) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent debitCardInContextAcquisitionEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trailingButtonType2, "");
        int i = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.components.DebitCardInContextAcquisitionToolBarKt.WhenMappings.$EnumSwitchMapping$0[trailingButtonType.ordinal()];
        if (i == 1) {
            debitCardInContextAcquisitionEvent = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked.INSTANCE;
        } else if (i == 2) {
            debitCardInContextAcquisitionEvent = com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked.INSTANCE;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            debitCardInContextAcquisitionEvent = null;
        }
        if (debitCardInContextAcquisitionEvent != null) {
            function1.invoke(debitCardInContextAcquisitionEvent);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n7IcA9QcYZ_wNPMaFvLFTmIKhLE(com.paypal.oslo.feature.debitcard.api.model.DebitCardToolBarConfig debitCardToolBarConfig, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardInContextAcquisitionToolBar(debitCardToolBarConfig, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.SKIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.TrailingButtonType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
