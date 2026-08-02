package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "CHALLENGE_NOT_ELIGIBLE", "DELIVERY_LIMIT_EXCEEDED", "DELIVERY_FAILED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "INTERNAL_ERROR", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotifyStepUpIdentityChallengeResultStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus CHALLENGE_NOT_ELIGIBLE;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus CHALLENGE_NOT_FOUND;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus CONTEXT_EXPIRED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus DELIVERY_FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus DELIVERY_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus INTERNAL_ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus INVALID_CONTEXT;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus INVALID_INPUT;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus SUCCESS;
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private NotifyStepUpIdentityChallengeResultStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("SUCCESS", 0, "SUCCESS");
        SUCCESS = notifyStepUpIdentityChallengeResultStatus;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus2 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("INVALID_CONTEXT", 1, "INVALID_CONTEXT");
        INVALID_CONTEXT = notifyStepUpIdentityChallengeResultStatus2;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus3 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("CONTEXT_EXPIRED", 2, "CONTEXT_EXPIRED");
        CONTEXT_EXPIRED = notifyStepUpIdentityChallengeResultStatus3;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus4 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("CHALLENGE_NOT_FOUND", 3, "CHALLENGE_NOT_FOUND");
        CHALLENGE_NOT_FOUND = notifyStepUpIdentityChallengeResultStatus4;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus5 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("CHALLENGE_NOT_ELIGIBLE", 4, "CHALLENGE_NOT_ELIGIBLE");
        CHALLENGE_NOT_ELIGIBLE = notifyStepUpIdentityChallengeResultStatus5;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus6 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("DELIVERY_LIMIT_EXCEEDED", 5, "DELIVERY_LIMIT_EXCEEDED");
        DELIVERY_LIMIT_EXCEEDED = notifyStepUpIdentityChallengeResultStatus6;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus7 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("DELIVERY_FAILED", 6, "DELIVERY_FAILED");
        DELIVERY_FAILED = notifyStepUpIdentityChallengeResultStatus7;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus8 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, 7, com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT);
        INVALID_INPUT = notifyStepUpIdentityChallengeResultStatus8;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus9 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("INTERNAL_ERROR", 8, "INTERNAL_ERROR");
        INTERNAL_ERROR = notifyStepUpIdentityChallengeResultStatus9;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus10 = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = notifyStepUpIdentityChallengeResultStatus10;
        com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[] notifyStepUpIdentityChallengeResultStatusArr = {notifyStepUpIdentityChallengeResultStatus, notifyStepUpIdentityChallengeResultStatus2, notifyStepUpIdentityChallengeResultStatus3, notifyStepUpIdentityChallengeResultStatus4, notifyStepUpIdentityChallengeResultStatus5, notifyStepUpIdentityChallengeResultStatus6, notifyStepUpIdentityChallengeResultStatus7, notifyStepUpIdentityChallengeResultStatus8, notifyStepUpIdentityChallengeResultStatus9, notifyStepUpIdentityChallengeResultStatus10};
        getHighResolutionOutputSizeshNQ4ISI = notifyStepUpIdentityChallengeResultStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(notifyStepUpIdentityChallengeResultStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("NotifyStepUpIdentityChallengeResultStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SUCCESS", "INVALID_CONTEXT", "CONTEXT_EXPIRED", "CHALLENGE_NOT_FOUND", "CHALLENGE_NOT_ELIGIBLE", "DELIVERY_LIMIT_EXCEEDED", "DELIVERY_FAILED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "INTERNAL_ERROR"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeResultStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[]{com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.SUCCESS, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INVALID_CONTEXT, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CONTEXT_EXPIRED, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_FOUND, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.CHALLENGE_NOT_ELIGIBLE, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.DELIVERY_LIMIT_EXCEEDED, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.DELIVERY_FAILED, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INVALID_INPUT, com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.INTERNAL_ERROR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus notifyStepUpIdentityChallengeResultStatus = (com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus) obj;
            return notifyStepUpIdentityChallengeResultStatus == null ? com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.UNKNOWN__ : notifyStepUpIdentityChallengeResultStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeResultStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
