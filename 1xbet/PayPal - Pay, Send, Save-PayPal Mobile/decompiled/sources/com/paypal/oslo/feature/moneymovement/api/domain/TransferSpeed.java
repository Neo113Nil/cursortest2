package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/TransferSpeed;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANT", "STANDARD", "DEFERRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferSpeed {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed DEFERRED;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed INSTANT;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed STANDARD;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private TransferSpeed(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed transferSpeed = new com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed("INSTANT", 0);
        INSTANT = transferSpeed;
        com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed transferSpeed2 = new com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed("STANDARD", 1);
        STANDARD = transferSpeed2;
        com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed transferSpeed3 = new com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed("DEFERRED", 2);
        DEFERRED = transferSpeed3;
        com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed[] transferSpeedArr = {transferSpeed, transferSpeed2, transferSpeed3};
        getHighResolutionOutputSizeshNQ4ISI = transferSpeedArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(transferSpeedArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.TransferSpeed> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
