package com.paypal.oslo.feature.qrc.domain.model.enrollment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "", "<init>", "(Ljava/lang/String;I)V", "ONLINE", "OFFLINE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcCapability {
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability OFFLINE;
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability ONLINE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private QrcCapability(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability("ONLINE", 0);
        ONLINE = qrcCapability;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability2 = new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability("OFFLINE", 1);
        OFFLINE = qrcCapability2;
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability[] qrcCapabilityArr = {qrcCapability, qrcCapability2};
        Camera2StreamConfigurationMap = qrcCapabilityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(qrcCapabilityArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
