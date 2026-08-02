package com.paypal.oslo.feature.savings.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/DepositType;", "", "", "p0", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADD_FUNDS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DepositType {
    public static final com.paypal.oslo.feature.savings.domain.model.DepositType ADD_FUNDS;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.DepositType[] Camera2StreamConfigurationMap;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private DepositType(java.lang.String str, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.DepositType depositType = new com.paypal.oslo.feature.savings.domain.model.DepositType("ADD_FUNDS", "ADD_FUNDS");
        ADD_FUNDS = depositType;
        com.paypal.oslo.feature.savings.domain.model.DepositType[] depositTypeArr = {depositType};
        Camera2StreamConfigurationMap = depositTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(depositTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.DepositType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.DepositType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.DepositType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.DepositType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.DepositType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.DepositType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
