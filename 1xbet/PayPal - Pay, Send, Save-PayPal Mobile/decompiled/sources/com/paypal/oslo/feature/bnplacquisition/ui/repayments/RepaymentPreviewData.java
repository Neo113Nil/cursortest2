package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentPreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "getHighSpeedVideoFpsRangesFor", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;", "getHighSpeedVideoSizes", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "Ljava/util/List;", "()Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RepaymentPreviewData {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentPreviewData();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard getHighSpeedVideoSizes;

    private RepaymentPreviewData() {
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank getHighSpeedVideoFpsRangesFor() {
        return getHighSpeedVideoFpsRanges;
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank = new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("1", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "9012", null, "Bank of America");
        getHighSpeedVideoFpsRanges = fundingInstrumentBank;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.CARD, null, "Visa Debit", "1234", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.DEBIT);
        getHighSpeedVideoSizes = fundingInstrumentCard;
        Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument[]{fundingInstrumentBank, fundingInstrumentCard});
    }

    public static java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> getHighSpeedVideoSizes() {
        return Camera2StreamConfigurationMap;
    }
}
