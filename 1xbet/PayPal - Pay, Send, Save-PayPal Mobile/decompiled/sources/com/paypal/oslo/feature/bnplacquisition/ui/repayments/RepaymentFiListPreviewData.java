package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentFiListPreviewData;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "Ljava/util/List;", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RepaymentFiListPreviewData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentFiListPreviewData INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentFiListPreviewData();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank Camera2StreamConfigurationMap;

    private RepaymentFiListPreviewData() {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank fundingInstrumentBank = new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("1", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "9012", null, "Bank of America");
        Camera2StreamConfigurationMap = fundingInstrumentBank;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard fundingInstrumentCard = new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentCard(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.CARD, null, "Visa Debit", "1234", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.CardType.DEBIT);
        getHighSpeedVideoSizes = fundingInstrumentCard;
        getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument[]{fundingInstrumentBank, fundingInstrumentCard});
    }

    public static java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument> getHighResolutionOutputSizeshNQ4ISI() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
