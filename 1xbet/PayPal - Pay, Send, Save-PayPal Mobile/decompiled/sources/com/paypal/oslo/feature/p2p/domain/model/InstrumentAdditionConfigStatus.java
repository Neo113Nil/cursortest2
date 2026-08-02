package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;", "", "<init>", "(Ljava/lang/String;I)V", "MANDATORY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentAdditionConfigStatus {
    public static final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus MANDATORY;
    public static final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private InstrumentAdditionConfigStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus = new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus("MANDATORY", 0);
        MANDATORY = instrumentAdditionConfigStatus;
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus2 = new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus("UNKNOWN", 1);
        UNKNOWN = instrumentAdditionConfigStatus2;
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus[] instrumentAdditionConfigStatusArr = {instrumentAdditionConfigStatus, instrumentAdditionConfigStatus2};
        getHighResolutionOutputSizeshNQ4ISI = instrumentAdditionConfigStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(instrumentAdditionConfigStatusArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
