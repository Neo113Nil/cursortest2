package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TopUpProviderResponseStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SUCCESS", com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, "INSUFFICIENT_LOAD", "BUSINESS_DECLINE", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopUpProviderResponseStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus BUSINESS_DECLINE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus GENERIC_ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus INSUFFICIENT_LOAD;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus INTERNAL_SERVER_ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus SUCCESS;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus USER_CANCELLED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private TopUpProviderResponseStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus("SUCCESS", 0, "SUCCESS");
        SUCCESS = topUpProviderResponseStatus;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus2 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, 1, com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED);
        USER_CANCELLED = topUpProviderResponseStatus2;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus3 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus("INSUFFICIENT_LOAD", 2, "INSUFFICIENT_LOAD");
        INSUFFICIENT_LOAD = topUpProviderResponseStatus3;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus4 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus("BUSINESS_DECLINE", 3, "BUSINESS_DECLINE");
        BUSINESS_DECLINE = topUpProviderResponseStatus4;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus5 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 4, com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR);
        GENERIC_ERROR = topUpProviderResponseStatus5;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus6 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR, 5, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR);
        INTERNAL_SERVER_ERROR = topUpProviderResponseStatus6;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus7 = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = topUpProviderResponseStatus7;
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[] topUpProviderResponseStatusArr = {topUpProviderResponseStatus, topUpProviderResponseStatus2, topUpProviderResponseStatus3, topUpProviderResponseStatus4, topUpProviderResponseStatus5, topUpProviderResponseStatus6, topUpProviderResponseStatus7};
        getHighResolutionOutputSizeshNQ4ISI = topUpProviderResponseStatusArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(topUpProviderResponseStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("TopUpProviderResponseStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SUCCESS", com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_USER_CANCELLED, "INSUFFICIENT_LOAD", "BUSINESS_DECLINE", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.INTERNAL_SERVER_ERROR}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TopUpProviderResponseStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/TopUpProviderResponseStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/TopUpProviderResponseStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TopUpProviderResponseStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[]{com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.SUCCESS, com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.USER_CANCELLED, com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.INSUFFICIENT_LOAD, com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.BUSINESS_DECLINE, com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.GENERIC_ERROR, com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.INTERNAL_SERVER_ERROR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus = (com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus) obj;
            return topUpProviderResponseStatus == null ? com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.UNKNOWN__ : topUpProviderResponseStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
