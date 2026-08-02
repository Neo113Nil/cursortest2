package com.paypal.oslo.feature.savings.domain.usecase;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "START_SAVINGS_LANDING", "START_SAVINGS_CLICK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsClientSource {
    public static final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource START_SAVINGS_CLICK;
    public static final com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource START_SAVINGS_LANDING;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private SavingsClientSource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource = new com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource("START_SAVINGS_LANDING", 0, "start_savings_landing");
        START_SAVINGS_LANDING = savingsClientSource;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource2 = new com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource("START_SAVINGS_CLICK", 1, "start_savings_click");
        START_SAVINGS_CLICK = savingsClientSource2;
        com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource[] savingsClientSourceArr = {savingsClientSource, savingsClientSource2};
        getHighSpeedVideoFpsRangesFor = savingsClientSourceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(savingsClientSourceArr);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource[] values() {
        return (com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
