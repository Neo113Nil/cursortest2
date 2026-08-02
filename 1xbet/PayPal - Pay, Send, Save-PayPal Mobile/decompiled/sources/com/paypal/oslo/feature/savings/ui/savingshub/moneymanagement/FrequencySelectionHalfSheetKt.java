package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"FrequencySelectionHalfSheet", "", "controller", "Lcom/paypal/pds/components/BottomSheetController;", "onSelectFrequency", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "onDismiss", "Lkotlin/Function0;", "allowOneTime", "", "initialFrequencyState", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FrequencySelectionHalfSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrequencySelectionHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(331249183);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                frequencySelectionState2 = frequencySelectionState;
                i3 |= startRestartGroup.changedInstance(frequencySelectionState2) ? 16384 : 8192;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z3 = z2;
                    frequencySelectionState3 = frequencySelectionState2;
                } else {
                    boolean z4 = i6 != 0 ? true : z2;
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState4 = i4 != 0 ? null : frequencySelectionState2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(331249183, i5, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheet (FrequencySelectionHalfSheet.kt:39)");
                    }
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyPreSelection frequencyPreSelection = frequencySelectionState4 != null ? new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyPreSelection(frequencySelectionState4.getSelectedFrequency(), frequencySelectionState4.getSelectedDayOfWeek(), frequencySelectionState4.getSelectedDate()) : null;
                    com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType savingsHalfSheetType = com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType.FrequencySelection;
                    boolean z5 = (i5 & 112) == 32;
                    boolean z6 = (i5 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z5 | z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt.m19003$r8$lambda$BCneSBObGPB7Nzvk9s5Nit81js(kotlin.jvm.functions.Function1.this, function0, (com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetManagerKt.SavingsHalfSheetManager(savingsHalfSheetType, bottomSheetController, null, (kotlin.jvm.functions.Function1) rememberedValue, null, null, z4, false, frequencyPreSelection, null, null, null, false, null, null, composer2, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 6 | ((i5 << 3) & 112) | ((i5 << 9) & 3670016), 0, 32436);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    frequencySelectionState3 = frequencySelectionState4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt.m19004$r8$lambda$EzPc6cJGrZrBubTYKSXSA0QKKw(com.paypal.pds.components.BottomSheetController.this, function1, function0, z3, frequencySelectionState3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            frequencySelectionState2 = frequencySelectionState;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        frequencySelectionState2 = frequencySelectionState;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$BCneSBObGPB7Nz-vk9s5Nit81js, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19003$r8$lambda$BCneSBObGPB7Nzvk9s5Nit81js(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction savingsHalfSheetAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHalfSheetAction, "");
        if (savingsHalfSheetAction instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected) {
            function1.invoke(((com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.FrequencySelected) savingsHalfSheetAction).getFrequencyState());
        } else if (savingsHalfSheetAction instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction.Dismiss) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EzPc6cJGrZrBubTYK-SXSA0QKKw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19004$r8$lambda$EzPc6cJGrZrBubTYKSXSA0QKKw(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, boolean z, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FrequencySelectionHalfSheet(bottomSheetController, function1, function0, z, frequencySelectionState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
