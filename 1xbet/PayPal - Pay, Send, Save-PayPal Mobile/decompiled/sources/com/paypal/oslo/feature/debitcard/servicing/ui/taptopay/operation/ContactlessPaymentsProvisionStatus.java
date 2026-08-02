package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PROVISIONED", "NOT_PROVISIONED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactlessPaymentsProvisionStatus {
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus NOT_PROVISIONED;
    public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus PROVISIONED;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ContactlessPaymentsProvisionStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus("PROVISIONED", 0);
        PROVISIONED = contactlessPaymentsProvisionStatus;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus2 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus("NOT_PROVISIONED", 1);
        NOT_PROVISIONED = contactlessPaymentsProvisionStatus2;
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus[] contactlessPaymentsProvisionStatusArr = {contactlessPaymentsProvisionStatus, contactlessPaymentsProvisionStatus2};
        getHighResolutionOutputSizeshNQ4ISI = contactlessPaymentsProvisionStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contactlessPaymentsProvisionStatusArr);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus[] values() {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
