package com.paypal.oslo.feature.businessinventory.ui.edititem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;", "", "<init>", "(Ljava/lang/String;I)V", "DiscardAddProduct", "DiscardAddService", "DiscardEditProduct", "DiscardEditService", "DeleteItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConfirmationModalType {
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType DeleteItem;
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType DiscardAddProduct;
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType DiscardAddService;
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType DiscardEditProduct;
    public static final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType DiscardEditService;
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ConfirmationModalType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType = new com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType("DiscardAddProduct", 0);
        DiscardAddProduct = confirmationModalType;
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType2 = new com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType("DiscardAddService", 1);
        DiscardAddService = confirmationModalType2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType3 = new com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType("DiscardEditProduct", 2);
        DiscardEditProduct = confirmationModalType3;
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType4 = new com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType("DiscardEditService", 3);
        DiscardEditService = confirmationModalType4;
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType5 = new com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType("DeleteItem", 4);
        DeleteItem = confirmationModalType5;
        com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType[] confirmationModalTypeArr = {confirmationModalType, confirmationModalType2, confirmationModalType3, confirmationModalType4, confirmationModalType5};
        getHighResolutionOutputSizeshNQ4ISI = confirmationModalTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(confirmationModalTypeArr);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType[] values() {
        return (com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
