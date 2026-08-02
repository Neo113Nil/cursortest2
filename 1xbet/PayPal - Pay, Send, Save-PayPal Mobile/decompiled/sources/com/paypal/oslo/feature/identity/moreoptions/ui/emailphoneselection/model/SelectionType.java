package com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/emailphoneselection/model/SelectionType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "EMAIL", "CREDIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectionType {
    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType CREDIT_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType EMAIL;
    public static final com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType PHONE;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType[] getHighSpeedVideoSizes;

    private SelectionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType("PHONE", 0);
        PHONE = selectionType;
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType2 = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType("EMAIL", 1);
        EMAIL = selectionType2;
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType selectionType3 = new com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType("CREDIT_CARD", 2);
        CREDIT_CARD = selectionType3;
        com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType[] selectionTypeArr = {selectionType, selectionType2, selectionType3};
        getHighSpeedVideoSizes = selectionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(selectionTypeArr);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType[] values() {
        return (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.moreoptions.ui.emailphoneselection.model.SelectionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
