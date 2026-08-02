package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/virtualcardoverview/InStoreVCCDetailsMXLType;", "", "<init>", "(Ljava/lang/String;I)V", "EVALUATE_ELIGIBILITY_AND_REPLACE_CARD", "PROVISIONED_CARD_OVERVIEW"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InStoreVCCDetailsMXLType {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType EVALUATE_ELIGIBILITY_AND_REPLACE_CARD;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType PROVISIONED_CARD_OVERVIEW;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType[] getHighSpeedVideoFpsRangesFor;

    private InStoreVCCDetailsMXLType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType inStoreVCCDetailsMXLType = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType("EVALUATE_ELIGIBILITY_AND_REPLACE_CARD", 0);
        EVALUATE_ELIGIBILITY_AND_REPLACE_CARD = inStoreVCCDetailsMXLType;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType inStoreVCCDetailsMXLType2 = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType("PROVISIONED_CARD_OVERVIEW", 1);
        PROVISIONED_CARD_OVERVIEW = inStoreVCCDetailsMXLType2;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType[] inStoreVCCDetailsMXLTypeArr = {inStoreVCCDetailsMXLType, inStoreVCCDetailsMXLType2};
        getHighSpeedVideoFpsRangesFor = inStoreVCCDetailsMXLTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(inStoreVCCDetailsMXLTypeArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.InStoreVCCDetailsMXLType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
