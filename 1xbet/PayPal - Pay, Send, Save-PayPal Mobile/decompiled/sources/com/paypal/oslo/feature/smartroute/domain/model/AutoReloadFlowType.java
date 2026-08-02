package com.paypal.oslo.feature.smartroute.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadFlowType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP, "DEACTIVATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadFlowType {
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType DEACTIVATE;
    public static final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType SETUP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType[] getHighSpeedVideoFpsRanges;

    private AutoReloadFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.SETUP, 0);
        SETUP = autoReloadFlowType;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType2 = new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType("DEACTIVATE", 1);
        DEACTIVATE = autoReloadFlowType2;
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType[] autoReloadFlowTypeArr = {autoReloadFlowType, autoReloadFlowType2};
        getHighSpeedVideoFpsRanges = autoReloadFlowTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(autoReloadFlowTypeArr);
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType[] values() {
        return (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
