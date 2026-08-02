package com.paypal.oslo.feature.debitcard.shared.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "RECOVERABLE", com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, "FATAL", "CONTACT_CUSTOMER_SERVICE", com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitErrorType {
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType CONTACT_CUSTOMER_SERVICE;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType FATAL;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType INELIGIBLE;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType NO_NETWORK;
    public static final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType RECOVERABLE;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DebitErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType("RECOVERABLE", 0);
        RECOVERABLE = debitErrorType;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType2 = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType(com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, 1);
        NO_NETWORK = debitErrorType2;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType3 = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType("FATAL", 2);
        FATAL = debitErrorType3;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType4 = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType("CONTACT_CUSTOMER_SERVICE", 3);
        CONTACT_CUSTOMER_SERVICE = debitErrorType4;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType5 = new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE, 4);
        INELIGIBLE = debitErrorType5;
        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType[] debitErrorTypeArr = {debitErrorType, debitErrorType2, debitErrorType3, debitErrorType4, debitErrorType5};
        getHighSpeedVideoFpsRanges = debitErrorTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(debitErrorTypeArr);
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType[] values() {
        return (com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
