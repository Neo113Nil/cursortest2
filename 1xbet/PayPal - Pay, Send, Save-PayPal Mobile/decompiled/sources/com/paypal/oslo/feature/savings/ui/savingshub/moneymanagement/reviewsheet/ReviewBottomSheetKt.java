package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionSuccess;", "effect", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DestinationFiDTO;", "buildDestinationFiDTO", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/reviewscreen/ReviewScreenEffect$SubmissionSuccess;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/DestinationFiDTO;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewBottomSheetKt {
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO buildDestinationFiDTO(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenEffect.SubmissionSuccess submissionSuccess) {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum destinationTypeEnum;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.SourceDTO source;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submissionSuccess, "");
        int i = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewBottomSheetKt.WhenMappings.$EnumSwitchMapping$1[submissionSuccess.getFlowType().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO(submissionSuccess.getAmount(), com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.GOAL, submissionSuccess.getGoal(), null);
        }
        if (i != 4 && i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (submissionSuccess.getSelectedGoal() != null) {
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO(submissionSuccess.getAmount(), com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.GOAL, submissionSuccess.getSelectedGoal(), null);
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi = submissionSuccess.getSelectedFi();
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType instrumentType = (selectedFi == null || (source = selectedFi.getSource()) == null) ? null : source.getInstrumentType();
        int i2 = instrumentType == null ? -1 : com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                destinationTypeEnum = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.BANK;
            } else if (i2 == 2) {
                destinationTypeEnum = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.DEBIT_CARD;
            } else if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO(submissionSuccess.getAmount(), destinationTypeEnum, null, submissionSuccess.getSelectedFi());
        }
        destinationTypeEnum = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationTypeEnum.BANK;
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.DestinationFiDTO(submissionSuccess.getAmount(), destinationTypeEnum, null, submissionSuccess.getSelectedFi());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.BANK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.InstrumentType.PAYPAL_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
