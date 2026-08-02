package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "RemainingStatementBalanceBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RemainingStatementBalanceBottomSheetKt {
    public static final void RemainingStatementBalanceBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(247098043);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(247098043, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheet (RemainingStatementBalanceBottomSheet.kt:27)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetKt.BottomSheet(bottomSheetController, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_sheet_remaining_statement_balance_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_sheet_remaining_statement_balance_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, false, null, null, 8188, null)), null, null, null, null, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt.$r8$lambda$F623LhWUJVQ_2xINs4c5JqcC5dY(com.paypal.pds.components.BottomSheetController.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F623LhWUJVQ_2xINs4c5JqcC5dY(com.paypal.pds.components.BottomSheetController bottomSheetController, int i, androidx.compose.runtime.Composer composer, int i2) {
        RemainingStatementBalanceBottomSheet(bottomSheetController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M6ohD3Eq9pSbTxB-QCFg1veyPiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18454$r8$lambda$M6ohD3Eq9pSbTxBQCFg1veyPiQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(214311267);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(214311267, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetPreview (RemainingStatementBalanceBottomSheet.kt:45)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt$RemainingStatementBalanceBottomSheetPreview$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt$RemainingStatementBalanceBottomSheetPreview$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            RemainingStatementBalanceBottomSheet(bottomSheetController, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.components.RemainingStatementBalanceBottomSheetKt.m18454$r8$lambda$M6ohD3Eq9pSbTxBQCFg1veyPiQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
