package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRES_CONFIRMATION", "REQUIRES_SELECTION", "PREDETERMINED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferSelectionRequirement {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement PREDETERMINED;
    public static final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement REQUIRES_CONFIRMATION;
    public static final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement REQUIRES_SELECTION;
    public static final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement[] getHighSpeedVideoFpsRangesFor;

    private TransferSelectionRequirement(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement = new com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement("REQUIRES_CONFIRMATION", 0);
        REQUIRES_CONFIRMATION = transferSelectionRequirement;
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement2 = new com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement("REQUIRES_SELECTION", 1);
        REQUIRES_SELECTION = transferSelectionRequirement2;
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement3 = new com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement("PREDETERMINED", 2);
        PREDETERMINED = transferSelectionRequirement3;
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement4 = new com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement("UNKNOWN", 3);
        UNKNOWN = transferSelectionRequirement4;
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement[] transferSelectionRequirementArr = {transferSelectionRequirement, transferSelectionRequirement2, transferSelectionRequirement3, transferSelectionRequirement4};
        getHighSpeedVideoFpsRangesFor = transferSelectionRequirementArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(transferSelectionRequirementArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
