package com.paypal.oslo.feature.bnplservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/BadgeStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "ALMOST_COMPLETE", "DELINQUENT", "HARDSHIP", "PAST_DUE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "PENDING_FRAUD", "SNOOZE_PENDING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BadgeStatus {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus ALMOST_COMPLETE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus DELINQUENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus HARDSHIP;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus PAST_DUE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus PENDING_FRAUD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus SNOOZE_PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus[] getHighSpeedVideoSizes;
    private final java.lang.String rawValue;

    private BadgeStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("ALMOST_COMPLETE", 0, "ALMOST_COMPLETE");
        ALMOST_COMPLETE = badgeStatus;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus2 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("DELINQUENT", 1, "DELINQUENT");
        DELINQUENT = badgeStatus2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus3 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("HARDSHIP", 2, "HARDSHIP");
        HARDSHIP = badgeStatus3;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus4 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("PAST_DUE", 3, "PAST_DUE");
        PAST_DUE = badgeStatus4;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus5 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 4, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = badgeStatus5;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus6 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("PENDING_FRAUD", 5, "PENDING_FRAUD");
        PENDING_FRAUD = badgeStatus6;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus7 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("SNOOZE_PENDING", 6, "SNOOZE_PENDING");
        SNOOZE_PENDING = badgeStatus7;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus badgeStatus8 = new com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus("UNKNOWN", 7, "UNKNOWN__");
        UNKNOWN = badgeStatus8;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus[] badgeStatusArr = {badgeStatus, badgeStatus2, badgeStatus3, badgeStatus4, badgeStatus5, badgeStatus6, badgeStatus7, badgeStatus8};
        getHighSpeedVideoSizes = badgeStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(badgeStatusArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.common.BadgeStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
