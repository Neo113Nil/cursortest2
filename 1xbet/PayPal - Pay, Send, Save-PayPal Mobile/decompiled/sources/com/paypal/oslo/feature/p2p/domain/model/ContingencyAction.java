package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "", "<init>", "(Ljava/lang/String;I)V", "USER_DATA_COLLECTION_REQUIRED", "DISPLAY_SCAM_WARNING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContingencyAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction DISPLAY_SCAM_WARNING;
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction UNKNOWN;
    public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction USER_DATA_COLLECTION_REQUIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyAction[] getHighSpeedVideoFpsRangesFor;

    private ContingencyAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction contingencyAction = new com.paypal.oslo.feature.p2p.domain.model.ContingencyAction("USER_DATA_COLLECTION_REQUIRED", 0);
        USER_DATA_COLLECTION_REQUIRED = contingencyAction;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction contingencyAction2 = new com.paypal.oslo.feature.p2p.domain.model.ContingencyAction("DISPLAY_SCAM_WARNING", 1);
        DISPLAY_SCAM_WARNING = contingencyAction2;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction contingencyAction3 = new com.paypal.oslo.feature.p2p.domain.model.ContingencyAction("UNKNOWN", 2);
        UNKNOWN = contingencyAction3;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyAction[] contingencyActionArr = {contingencyAction, contingencyAction2, contingencyAction3};
        getHighSpeedVideoFpsRangesFor = contingencyActionArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(contingencyActionArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ContingencyAction[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.ContingencyAction[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.ContingencyAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.ContingencyAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.ContingencyAction> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
