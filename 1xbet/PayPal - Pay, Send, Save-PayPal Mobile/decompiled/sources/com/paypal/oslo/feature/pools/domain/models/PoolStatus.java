package com.paypal.oslo.feature.pools.domain.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "CLOSED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolStatus {
    public static final com.paypal.oslo.feature.pools.domain.models.PoolStatus ACTIVE;
    public static final com.paypal.oslo.feature.pools.domain.models.PoolStatus CLOSED;
    public static final com.paypal.oslo.feature.pools.domain.models.PoolStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.pools.domain.models.PoolStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String rawValue;

    private PoolStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus = new com.paypal.oslo.feature.pools.domain.models.PoolStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = poolStatus;
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus2 = new com.paypal.oslo.feature.pools.domain.models.PoolStatus("CLOSED", 1, "CLOSED");
        CLOSED = poolStatus2;
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus3 = new com.paypal.oslo.feature.pools.domain.models.PoolStatus("UNKNOWN__", 2, "UNKNOWN__");
        UNKNOWN__ = poolStatus3;
        com.paypal.oslo.feature.pools.domain.models.PoolStatus[] poolStatusArr = {poolStatus, poolStatus2, poolStatus3};
        getHighResolutionOutputSizeshNQ4ISI = poolStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(poolStatusArr);
    }

    public static com.paypal.oslo.feature.pools.domain.models.PoolStatus[] values() {
        return (com.paypal.oslo.feature.pools.domain.models.PoolStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.pools.domain.models.PoolStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.pools.domain.models.PoolStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.pools.domain.models.PoolStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.pools.domain.models.PoolStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
