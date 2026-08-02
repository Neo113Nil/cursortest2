package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/afterduedate/uimodel/AfterDueDateBottomSheetUiModel;", "uiModel", "Lkotlin/Function0;", "", "onClickPay", "AfterDueDateBottomSheet", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/afterduedate/uimodel/AfterDueDateBottomSheetUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AfterDueDateBottomSheetKt {
    public static final void AfterDueDateBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.uimodel.AfterDueDateBottomSheetUiModel afterDueDateBottomSheetUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterDueDateBottomSheetUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1436104914);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(afterDueDateBottomSheetUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1436104914, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheet (AfterDueDateBottomSheet.kt:28)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetKt.BottomSheet(bottomSheetController, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.BottomSheetInfoUiModel.Content(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.bottomsheet.ContentUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_repayment_past_due_date_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_repayment_past_due_date_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_button_scheduled, new java.lang.Object[]{afterDueDateBottomSheetUiModel.getAmount(), afterDueDateBottomSheetUiModel.getPaymentDate()}, null, false, 12, null), null, null, null, null, null, null, false, null, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetTestTags.PAY_BUTTON, 4084, null)), null, function0, null, null, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (i2 & 14) | ((i2 << 3) & 7168), 116);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetKt.$r8$lambda$WIDYeHCZqaS_tlofK_EvWYjinGc(com.paypal.pds.components.BottomSheetController.this, afterDueDateBottomSheetUiModel, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4TWyG8RfvB9DQuJWwYVDnqWwxmU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1821870619);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1821870619, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetPreview (AfterDueDateBottomSheet.kt:57)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.uimodel.AfterDueDateBottomSheetUiModel afterDueDateBottomSheetUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.uimodel.AfterDueDateBottomSheetUiModel("$66.18", "Jun 15");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AfterDueDateBottomSheet(bottomSheetController, afterDueDateBottomSheetUiModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.components.AfterDueDateBottomSheetKt.$r8$lambda$4TWyG8RfvB9DQuJWwYVDnqWwxmU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WIDYeHCZqaS_tlofK_EvWYjinGc(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.afterduedate.uimodel.AfterDueDateBottomSheetUiModel afterDueDateBottomSheetUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AfterDueDateBottomSheet(bottomSheetController, afterDueDateBottomSheetUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
