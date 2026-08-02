package com.paypal.oslo.feature.wallet.common.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/PreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "sampleDepositOption", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "getSampleDepositOption", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "sampleInstantDepositOption", "getSampleInstantDepositOption", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "sampleFundingInstrumentUiModel", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "getSampleFundingInstrumentUiModel", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreviewData {
    public static final int $stable;
    public static final com.paypal.oslo.feature.wallet.common.model.PreviewData INSTANCE = new com.paypal.oslo.feature.wallet.common.model.PreviewData();
    private static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption sampleDepositOption;
    private static final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel sampleFundingInstrumentUiModel;
    private static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption sampleInstantDepositOption;

    private PreviewData() {
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption getSampleDepositOption() {
        return sampleDepositOption;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption depositOption = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption("preview-plan-id", true, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource("BANK_ACCOUNT", new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument.BankAccount("preview-bank-id", com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING, "1234", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "Preview Bank", null, null))), com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.STANDARD, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), null, 64, null);
        sampleDepositOption = depositOption;
        sampleInstantDepositOption = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption.copy$default(depositOption, "preview-instant-plan-id", false, null, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed.INSTANT, null, null, null, 118, null);
        sampleFundingInstrumentUiModel = new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel("plan-1", "preview-fi-1", com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewDataKt.THUMBNAIL, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentSubType.BANK, "Chase Visa", null, "in 3 to 5 days", new com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage(new com.paypal.oslo.feature.wallet.common.ui.UiText.DynamicString("This is a warning message for the funding instrument."), com.paypal.oslo.feature.wallet.common.model.FundingInstrumentMessage.Type.WARNING), "1234", null, null, new com.paypal.oslo.feature.wallet.common.domain.model.Money("USD", "100.0"), null, 11328, null);
        $stable = 8;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption getSampleInstantDepositOption() {
        return sampleInstantDepositOption;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel getSampleFundingInstrumentUiModel() {
        return sampleFundingInstrumentUiModel;
    }
}
