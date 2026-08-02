package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "VERIFIED", "UNVERIFIED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CIPStatus {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus PENDING;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus UNVERIFIED;
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus VERIFIED;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String rawValue;

    private CIPStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus("VERIFIED", 0, "VERIFIED");
        VERIFIED = cIPStatus;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus2 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus("UNVERIFIED", 1, "UNVERIFIED");
        UNVERIFIED = cIPStatus2;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus3 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = cIPStatus3;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus cIPStatus4 = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = cIPStatus4;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus[] cIPStatusArr = {cIPStatus, cIPStatus2, cIPStatus3, cIPStatus4};
        getHighResolutionOutputSizeshNQ4ISI = cIPStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cIPStatusArr);
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus[] values() {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
