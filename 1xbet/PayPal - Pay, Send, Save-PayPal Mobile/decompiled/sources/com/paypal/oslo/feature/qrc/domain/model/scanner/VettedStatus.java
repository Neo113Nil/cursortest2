package com.paypal.oslo.feature.qrc.domain.model.scanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "VETTED", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VettedStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus VETTED;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus[] getHighResolutionOutputSizeshNQ4ISI;

    private VettedStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus = new com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus("VETTED", 0);
        VETTED = vettedStatus;
        com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus2 = new com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus("UNKNOWN", 1);
        UNKNOWN = vettedStatus2;
        com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus[] vettedStatusArr = {vettedStatus, vettedStatus2};
        getHighResolutionOutputSizeshNQ4ISI = vettedStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(vettedStatusArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
