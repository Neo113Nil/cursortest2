package com.paypal.oslo.feature.debitcard.cardacquisition.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/model/DebitCardAcquisitionWidgetType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_WITH_INFO", "INFO_WITH_IMAGE", "TEXT_ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardAcquisitionWidgetType {
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType IMAGE_WITH_INFO;
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType INFO_WITH_IMAGE;
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType TEXT_ONLY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType[] getHighSpeedVideoFpsRangesFor;

    private DebitCardAcquisitionWidgetType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType = new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType("IMAGE_WITH_INFO", 0);
        IMAGE_WITH_INFO = debitCardAcquisitionWidgetType;
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType2 = new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType("INFO_WITH_IMAGE", 1);
        INFO_WITH_IMAGE = debitCardAcquisitionWidgetType2;
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType debitCardAcquisitionWidgetType3 = new com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType("TEXT_ONLY", 2);
        TEXT_ONLY = debitCardAcquisitionWidgetType3;
        com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType[] debitCardAcquisitionWidgetTypeArr = {debitCardAcquisitionWidgetType, debitCardAcquisitionWidgetType2, debitCardAcquisitionWidgetType3};
        getHighSpeedVideoFpsRangesFor = debitCardAcquisitionWidgetTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitCardAcquisitionWidgetTypeArr);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType[] values() {
        return (com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.cardacquisition.model.DebitCardAcquisitionWidgetType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
