package com.paypal.oslo.feature.consumerprivacy.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/SharingInfoActionType;", "", "<init>", "(Ljava/lang/String;I)V", "MANAGE", "REMOVE", "UNLINK_EMAIL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SharingInfoActionType {
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType MANAGE;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType REMOVE;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType UNLINK_EMAIL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType[] getHighSpeedVideoSizes;

    private SharingInfoActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType sharingInfoActionType = new com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType("MANAGE", 0);
        MANAGE = sharingInfoActionType;
        com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType sharingInfoActionType2 = new com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType("REMOVE", 1);
        REMOVE = sharingInfoActionType2;
        com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType sharingInfoActionType3 = new com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType("UNLINK_EMAIL", 2);
        UNLINK_EMAIL = sharingInfoActionType3;
        com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType[] sharingInfoActionTypeArr = {sharingInfoActionType, sharingInfoActionType2, sharingInfoActionType3};
        getHighSpeedVideoSizes = sharingInfoActionTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(sharingInfoActionTypeArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoActionType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
