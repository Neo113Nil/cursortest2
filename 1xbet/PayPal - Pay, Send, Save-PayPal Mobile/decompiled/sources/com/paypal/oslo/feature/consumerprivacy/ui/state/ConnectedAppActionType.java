package com.paypal.oslo.feature.consumerprivacy.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ConnectedAppActionType;", "", "<init>", "(Ljava/lang/String;I)V", "MANAGE", "REMOVE", "DETAILS_ONLY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConnectedAppActionType {
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType DETAILS_ONLY;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType MANAGE;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType REMOVE;
    private static final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ConnectedAppActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType("MANAGE", 0);
        MANAGE = connectedAppActionType;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType2 = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType("REMOVE", 1);
        REMOVE = connectedAppActionType2;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType connectedAppActionType3 = new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType("DETAILS_ONLY", 2);
        DETAILS_ONLY = connectedAppActionType3;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType[] connectedAppActionTypeArr = {connectedAppActionType, connectedAppActionType2, connectedAppActionType3};
        getHighSpeedVideoFpsRangesFor = connectedAppActionTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(connectedAppActionTypeArr);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType[] values() {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppActionType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
