package com.paypal.oslo.feature.identity.challenges.shared.domain.model.response;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "INVALID_CHALLENGE_ID", "CHALLENGE_NOT_ELIGIBLE", "VALIDATION_FAILED", "RATE_LIMIT_EXCEEDED", "VERIFICATION_LIMIT_EXCEEDED", "ONE_TIME_PASSCODE_EXPIRED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "INVALID_ONE_TIME_PASSCODE", "INTERNAL_ERROR", "CARD_VALIDATION_FAILED", "SECURITY_ANSWERS_NOT_CORRECT", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValidateChallengeResultStatus {
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus CARD_VALIDATION_FAILED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus CHALLENGE_NOT_ELIGIBLE;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus CHALLENGE_NOT_FOUND;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus CONTEXT_EXPIRED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus FAILED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus INVALID_CHALLENGE_ID;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus INVALID_CONTEXT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus INVALID_INPUT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus INVALID_ONE_TIME_PASSCODE;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus ONE_TIME_PASSCODE_EXPIRED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus RATE_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus SECURITY_ANSWERS_NOT_CORRECT;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus SUCCESS;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus VALIDATION_FAILED;
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus VERIFICATION_LIMIT_EXCEEDED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus[] getHighSpeedVideoSizes;

    private ValidateChallengeResultStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("SUCCESS", 0);
        SUCCESS = validateChallengeResultStatus;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus2 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("INVALID_CONTEXT", 1);
        INVALID_CONTEXT = validateChallengeResultStatus2;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus3 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("CONTEXT_EXPIRED", 2);
        CONTEXT_EXPIRED = validateChallengeResultStatus3;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus4 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("CHALLENGE_NOT_FOUND", 3);
        CHALLENGE_NOT_FOUND = validateChallengeResultStatus4;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus5 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("INVALID_CHALLENGE_ID", 4);
        INVALID_CHALLENGE_ID = validateChallengeResultStatus5;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus6 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("CHALLENGE_NOT_ELIGIBLE", 5);
        CHALLENGE_NOT_ELIGIBLE = validateChallengeResultStatus6;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus7 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("VALIDATION_FAILED", 6);
        VALIDATION_FAILED = validateChallengeResultStatus7;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus8 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("RATE_LIMIT_EXCEEDED", 7);
        RATE_LIMIT_EXCEEDED = validateChallengeResultStatus8;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus9 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("VERIFICATION_LIMIT_EXCEEDED", 8);
        VERIFICATION_LIMIT_EXCEEDED = validateChallengeResultStatus9;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus10 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("ONE_TIME_PASSCODE_EXPIRED", 9);
        ONE_TIME_PASSCODE_EXPIRED = validateChallengeResultStatus10;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus11 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, 10);
        INVALID_INPUT = validateChallengeResultStatus11;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus12 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("INVALID_ONE_TIME_PASSCODE", 11);
        INVALID_ONE_TIME_PASSCODE = validateChallengeResultStatus12;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus13 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("INTERNAL_ERROR", 12);
        INTERNAL_ERROR = validateChallengeResultStatus13;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus14 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("CARD_VALIDATION_FAILED", 13);
        CARD_VALIDATION_FAILED = validateChallengeResultStatus14;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus15 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus("SECURITY_ANSWERS_NOT_CORRECT", 14);
        SECURITY_ANSWERS_NOT_CORRECT = validateChallengeResultStatus15;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus validateChallengeResultStatus16 = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 15);
        FAILED = validateChallengeResultStatus16;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus[] validateChallengeResultStatusArr = {validateChallengeResultStatus, validateChallengeResultStatus2, validateChallengeResultStatus3, validateChallengeResultStatus4, validateChallengeResultStatus5, validateChallengeResultStatus6, validateChallengeResultStatus7, validateChallengeResultStatus8, validateChallengeResultStatus9, validateChallengeResultStatus10, validateChallengeResultStatus11, validateChallengeResultStatus12, validateChallengeResultStatus13, validateChallengeResultStatus14, validateChallengeResultStatus15, validateChallengeResultStatus16};
        getHighSpeedVideoSizes = validateChallengeResultStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(validateChallengeResultStatusArr);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus[] values() {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
