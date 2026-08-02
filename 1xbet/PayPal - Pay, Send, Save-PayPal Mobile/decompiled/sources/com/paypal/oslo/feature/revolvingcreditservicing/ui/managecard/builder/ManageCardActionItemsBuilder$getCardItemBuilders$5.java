package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/builder/ManageCardActionItemsBuilder$getCardItemBuilders$5;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/CardItemBuilder;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;", "details", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "build", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/ManageCardDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardActionItemsBuilder$getCardItemBuilders$5 implements com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder Camera2StreamConfigurationMap;

    ManageCardActionItemsBuilder$getCardItemBuilders$5(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder) {
        this.Camera2StreamConfigurationMap = manageCardActionItemsBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.utils.CardItemBuilder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object build(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1 manageCardActionItemsBuilder$getCardItemBuilders$5$build$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object obj;
        int i2;
        java.lang.Object autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        int i3;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1) {
            manageCardActionItemsBuilder$getCardItemBuilders$5$build$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1) continuation;
            if ((manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj2 = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRanges;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (manageCardDetails.getIsAutopayErrorState()) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay(false, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_actions_generic_error, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE), 6, null);
                    }
                    if (manageCardDetails.getIsDayZeroForAutopay()) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay(false, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_autopay_first_day_description, com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE), 6, null);
                    }
                    if (manageCardDetails.getIsAutopayNotSetup()) {
                        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay(false, null, null, null, 14, null);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder = this.Camera2StreamConfigurationMap;
                    manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRangesFor = manageCardDetails;
                    manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.Camera2StreamConfigurationMap = 1;
                    manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes = 1;
                    java.lang.Object autopayDescription$revolvingcredit_servicing_prodRelease = manageCardActionItemsBuilder.getAutopayDescription$revolvingcredit_servicing_prodRelease(manageCardDetails, manageCardActionItemsBuilder$getCardItemBuilders$5$build$1);
                    if (autopayDescription$revolvingcredit_servicing_prodRelease != coroutine_suspended) {
                        obj = autopayDescription$revolvingcredit_servicing_prodRelease;
                        i2 = 1;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    uiString = uiString2;
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay(i3 != 0, uiString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2, null, 8, null);
                }
                int i4 = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails manageCardDetails2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.ManageCardDetails) manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj2);
                i2 = i4;
                manageCardDetails = manageCardDetails2;
                obj = obj2;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder2 = this.Camera2StreamConfigurationMap;
                manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageCardDetails);
                manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighResolutionOutputSizeshNQ4ISI = uiString3;
                manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.Camera2StreamConfigurationMap = i2;
                manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes = 2;
                autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease = manageCardActionItemsBuilder2.getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease(manageCardDetails, manageCardActionItemsBuilder$getCardItemBuilders$5$build$1);
                if (autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease != coroutine_suspended) {
                    uiString = uiString3;
                    int i5 = i2;
                    obj2 = autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease;
                    i3 = i5;
                    return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay(i3 != 0, uiString, (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2, null, 8, null);
                }
                return coroutine_suspended;
            }
        }
        manageCardActionItemsBuilder$getCardItemBuilders$5$build$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1(this, continuation);
        java.lang.Object obj22 = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRanges;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString32 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder22 = this.Camera2StreamConfigurationMap;
        manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(manageCardDetails);
        manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighResolutionOutputSizeshNQ4ISI = uiString32;
        manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.Camera2StreamConfigurationMap = i2;
        manageCardActionItemsBuilder$getCardItemBuilders$5$build$1.getHighSpeedVideoSizes = 2;
        autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease = manageCardActionItemsBuilder22.getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease(manageCardDetails, manageCardActionItemsBuilder$getCardItemBuilders$5$build$1);
        if (autopayAccessibilityDescription$revolvingcredit_servicing_prodRelease != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
