package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/AlertType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "WARNING", "ERROR", "INFORMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlertType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType ERROR;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType INFORMATION;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType SUCCESS;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private AlertType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType("SUCCESS", 0);
        SUCCESS = alertType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType("WARNING", 1);
        WARNING = alertType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType("ERROR", 2);
        ERROR = alertType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType alertType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType("INFORMATION", 3);
        INFORMATION = alertType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType[] alertTypeArr = {alertType, alertType2, alertType3, alertType4};
        getHighResolutionOutputSizeshNQ4ISI = alertTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(alertTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.AlertType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
