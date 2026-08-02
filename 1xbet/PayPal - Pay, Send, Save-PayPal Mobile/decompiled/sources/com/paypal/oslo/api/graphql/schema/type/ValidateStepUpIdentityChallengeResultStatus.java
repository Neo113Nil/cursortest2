package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "CHALLENGE_NOT_ELIGIBLE", "VERIFICATION_LIMIT_EXCEEDED", "INVALID_ONE_TIME_PASSCODE", "ONE_TIME_PASSCODE_EXPIRED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "SECURITY_ANSWERS_NOT_CORRECT", "CARD_VALIDATION_FAILED", "INTERNAL_ERROR", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ValidateStepUpIdentityChallengeResultStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus CARD_VALIDATION_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus CHALLENGE_NOT_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus CHALLENGE_NOT_FOUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus CONTEXT_EXPIRED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus INTERNAL_ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus INVALID_CONTEXT;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus INVALID_INPUT;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus INVALID_ONE_TIME_PASSCODE;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus ONE_TIME_PASSCODE_EXPIRED;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus SECURITY_ANSWERS_NOT_CORRECT;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus SUCCESS;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus VERIFICATION_LIMIT_EXCEEDED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ValidateStepUpIdentityChallengeResultStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("SUCCESS", 0, "SUCCESS");
        SUCCESS = validateStepUpIdentityChallengeResultStatus;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus2 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("INVALID_CONTEXT", 1, "INVALID_CONTEXT");
        INVALID_CONTEXT = validateStepUpIdentityChallengeResultStatus2;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus3 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("CONTEXT_EXPIRED", 2, "CONTEXT_EXPIRED");
        CONTEXT_EXPIRED = validateStepUpIdentityChallengeResultStatus3;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus4 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("CHALLENGE_NOT_FOUND", 3, "CHALLENGE_NOT_FOUND");
        CHALLENGE_NOT_FOUND = validateStepUpIdentityChallengeResultStatus4;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus5 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("CHALLENGE_NOT_ELIGIBLE", 4, "CHALLENGE_NOT_ELIGIBLE");
        CHALLENGE_NOT_ELIGIBLE = validateStepUpIdentityChallengeResultStatus5;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus6 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("VERIFICATION_LIMIT_EXCEEDED", 5, "VERIFICATION_LIMIT_EXCEEDED");
        VERIFICATION_LIMIT_EXCEEDED = validateStepUpIdentityChallengeResultStatus6;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus7 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("INVALID_ONE_TIME_PASSCODE", 6, "INVALID_ONE_TIME_PASSCODE");
        INVALID_ONE_TIME_PASSCODE = validateStepUpIdentityChallengeResultStatus7;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus8 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("ONE_TIME_PASSCODE_EXPIRED", 7, "ONE_TIME_PASSCODE_EXPIRED");
        ONE_TIME_PASSCODE_EXPIRED = validateStepUpIdentityChallengeResultStatus8;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus9 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, 8, com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT);
        INVALID_INPUT = validateStepUpIdentityChallengeResultStatus9;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus10 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 9, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = validateStepUpIdentityChallengeResultStatus10;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus11 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("SECURITY_ANSWERS_NOT_CORRECT", 10, "SECURITY_ANSWERS_NOT_CORRECT");
        SECURITY_ANSWERS_NOT_CORRECT = validateStepUpIdentityChallengeResultStatus11;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus12 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("CARD_VALIDATION_FAILED", 11, "CARD_VALIDATION_FAILED");
        CARD_VALIDATION_FAILED = validateStepUpIdentityChallengeResultStatus12;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus13 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("INTERNAL_ERROR", 12, "INTERNAL_ERROR");
        INTERNAL_ERROR = validateStepUpIdentityChallengeResultStatus13;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus14 = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = validateStepUpIdentityChallengeResultStatus14;
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[] validateStepUpIdentityChallengeResultStatusArr = {validateStepUpIdentityChallengeResultStatus, validateStepUpIdentityChallengeResultStatus2, validateStepUpIdentityChallengeResultStatus3, validateStepUpIdentityChallengeResultStatus4, validateStepUpIdentityChallengeResultStatus5, validateStepUpIdentityChallengeResultStatus6, validateStepUpIdentityChallengeResultStatus7, validateStepUpIdentityChallengeResultStatus8, validateStepUpIdentityChallengeResultStatus9, validateStepUpIdentityChallengeResultStatus10, validateStepUpIdentityChallengeResultStatus11, validateStepUpIdentityChallengeResultStatus12, validateStepUpIdentityChallengeResultStatus13, validateStepUpIdentityChallengeResultStatus14};
        getHighSpeedVideoSizes = validateStepUpIdentityChallengeResultStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(validateStepUpIdentityChallengeResultStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ValidateStepUpIdentityChallengeResultStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "CHALLENGE_NOT_ELIGIBLE", "VERIFICATION_LIMIT_EXCEEDED", "INVALID_ONE_TIME_PASSCODE", "ONE_TIME_PASSCODE_EXPIRED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "SECURITY_ANSWERS_NOT_CORRECT", "CARD_VALIDATION_FAILED", "INTERNAL_ERROR"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeResultStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[]{com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.SUCCESS, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_CONTEXT, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CONTEXT_EXPIRED, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_FOUND, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.VERIFICATION_LIMIT_EXCEEDED, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_ONE_TIME_PASSCODE, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.ONE_TIME_PASSCODE_EXPIRED, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INVALID_INPUT, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.SECURITY_ANSWERS_NOT_CORRECT, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.CARD_VALIDATION_FAILED, com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.INTERNAL_ERROR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validateStepUpIdentityChallengeResultStatus = (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus) obj;
            return validateStepUpIdentityChallengeResultStatus == null ? com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.UNKNOWN__ : validateStepUpIdentityChallengeResultStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
