package com.paypal.oslo.feature.identity.challenges.shared.domain.model.response;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "INVALID_CHALLENGE_ID", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "CHALLENGE_NOT_ELIGIBLE", "DELIVERY_FAILED", "INTERNAL_ERROR", "RATE_LIMIT_EXCEEDED", "DELIVERY_LIMIT_EXCEEDED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotifyChallengeResultStatus {
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus CHALLENGE_NOT_ELIGIBLE;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus CHALLENGE_NOT_FOUND;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus CONTEXT_EXPIRED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus DELIVERY_FAILED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus DELIVERY_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus INVALID_CHALLENGE_ID;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus INVALID_CONTEXT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus INVALID_INPUT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus RATE_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus SUCCESS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus[] getHighSpeedVideoFpsRangesFor;

    private NotifyChallengeResultStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("SUCCESS", 0);
        SUCCESS = notifyChallengeResultStatus;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus2 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("INVALID_CONTEXT", 1);
        INVALID_CONTEXT = notifyChallengeResultStatus2;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus3 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("CONTEXT_EXPIRED", 2);
        CONTEXT_EXPIRED = notifyChallengeResultStatus3;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus4 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("CHALLENGE_NOT_FOUND", 3);
        CHALLENGE_NOT_FOUND = notifyChallengeResultStatus4;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus5 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("INVALID_CHALLENGE_ID", 4);
        INVALID_CHALLENGE_ID = notifyChallengeResultStatus5;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus6 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, 5);
        INVALID_INPUT = notifyChallengeResultStatus6;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus7 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("CHALLENGE_NOT_ELIGIBLE", 6);
        CHALLENGE_NOT_ELIGIBLE = notifyChallengeResultStatus7;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus8 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("DELIVERY_FAILED", 7);
        DELIVERY_FAILED = notifyChallengeResultStatus8;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus9 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("INTERNAL_ERROR", 8);
        INTERNAL_ERROR = notifyChallengeResultStatus9;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus10 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("RATE_LIMIT_EXCEEDED", 9);
        RATE_LIMIT_EXCEEDED = notifyChallengeResultStatus10;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus notifyChallengeResultStatus11 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus("DELIVERY_LIMIT_EXCEEDED", 10);
        DELIVERY_LIMIT_EXCEEDED = notifyChallengeResultStatus11;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus[] notifyChallengeResultStatusArr = {notifyChallengeResultStatus, notifyChallengeResultStatus2, notifyChallengeResultStatus3, notifyChallengeResultStatus4, notifyChallengeResultStatus5, notifyChallengeResultStatus6, notifyChallengeResultStatus7, notifyChallengeResultStatus8, notifyChallengeResultStatus9, notifyChallengeResultStatus10, notifyChallengeResultStatus11};
        getHighSpeedVideoFpsRangesFor = notifyChallengeResultStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(notifyChallengeResultStatusArr);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus[] values() {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
