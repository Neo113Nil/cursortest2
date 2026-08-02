package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/alerts/OnClickActionType;", "", "<init>", "(Ljava/lang/String;I)V", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "NATIVE_COMPONENT_DRIVEN", "REDIRECT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnClickActionType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType CLOSE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType NATIVE_COMPONENT_DRIVEN;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType REDIRECT;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType[] getHighSpeedVideoFpsRangesFor;

    private OnClickActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType onClickActionType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 0);
        CLOSE = onClickActionType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType onClickActionType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType("NATIVE_COMPONENT_DRIVEN", 1);
        NATIVE_COMPONENT_DRIVEN = onClickActionType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType onClickActionType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType("REDIRECT", 2);
        REDIRECT = onClickActionType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType[] onClickActionTypeArr = {onClickActionType, onClickActionType2, onClickActionType3};
        getHighSpeedVideoFpsRangesFor = onClickActionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(onClickActionTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.alerts.OnClickActionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
