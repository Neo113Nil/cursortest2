package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/AutoReloadScheduleType;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO_RELOAD_THRESHOLD", "AUTO_RELOAD_FREQUENCY", "SMART_ROUTE_AUTO_RELOAD_THRESHOLD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoReloadScheduleType {
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType AUTO_RELOAD_FREQUENCY;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType AUTO_RELOAD_THRESHOLD;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType SMART_ROUTE_AUTO_RELOAD_THRESHOLD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private AutoReloadScheduleType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType autoReloadScheduleType = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType("AUTO_RELOAD_THRESHOLD", 0);
        AUTO_RELOAD_THRESHOLD = autoReloadScheduleType;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType autoReloadScheduleType2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType("AUTO_RELOAD_FREQUENCY", 1);
        AUTO_RELOAD_FREQUENCY = autoReloadScheduleType2;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType autoReloadScheduleType3 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType("SMART_ROUTE_AUTO_RELOAD_THRESHOLD", 2);
        SMART_ROUTE_AUTO_RELOAD_THRESHOLD = autoReloadScheduleType3;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType[] autoReloadScheduleTypeArr = {autoReloadScheduleType, autoReloadScheduleType2, autoReloadScheduleType3};
        Camera2StreamConfigurationMap = autoReloadScheduleTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(autoReloadScheduleTypeArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.AutoReloadScheduleType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
