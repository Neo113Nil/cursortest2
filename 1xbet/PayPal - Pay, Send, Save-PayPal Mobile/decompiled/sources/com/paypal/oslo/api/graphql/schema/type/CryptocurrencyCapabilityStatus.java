package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "SUSPENDED", "REVOKED", "APPROVED", "IN_REVIEW", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "NEED_DATA", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyCapabilityStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus APPROVED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus DENY;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus IN_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus NEED_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus PENDING;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus REVOKED;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus SUSPENDED;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyCapabilityStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = cryptocurrencyCapabilityStatus;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("SUSPENDED", 1, "SUSPENDED");
        SUSPENDED = cryptocurrencyCapabilityStatus2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("REVOKED", 2, "REVOKED");
        REVOKED = cryptocurrencyCapabilityStatus3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("APPROVED", 3, "APPROVED");
        APPROVED = cryptocurrencyCapabilityStatus4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("IN_REVIEW", 4, "IN_REVIEW");
        IN_REVIEW = cryptocurrencyCapabilityStatus5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, 5, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY);
        DENY = cryptocurrencyCapabilityStatus6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 6, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = cryptocurrencyCapabilityStatus7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus8 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("NEED_DATA", 7, "NEED_DATA");
        NEED_DATA = cryptocurrencyCapabilityStatus8;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus9 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 8, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS);
        PENDING = cryptocurrencyCapabilityStatus9;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus10 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyCapabilityStatus10;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[] cryptocurrencyCapabilityStatusArr = {cryptocurrencyCapabilityStatus, cryptocurrencyCapabilityStatus2, cryptocurrencyCapabilityStatus3, cryptocurrencyCapabilityStatus4, cryptocurrencyCapabilityStatus5, cryptocurrencyCapabilityStatus6, cryptocurrencyCapabilityStatus7, cryptocurrencyCapabilityStatus8, cryptocurrencyCapabilityStatus9, cryptocurrencyCapabilityStatus10};
        getHighResolutionOutputSizeshNQ4ISI = cryptocurrencyCapabilityStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyCapabilityStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyCapabilityStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "SUSPENDED", "REVOKED", "APPROVED", "IN_REVIEW", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.DENY, com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "NEED_DATA", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.ACTIVE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.SUSPENDED, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.REVOKED, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.APPROVED, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.IN_REVIEW, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.DENY, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.INACTIVE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.NEED_DATA, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.PENDING});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus cryptocurrencyCapabilityStatus = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus) obj;
            return cryptocurrencyCapabilityStatus == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.UNKNOWN__ : cryptocurrencyCapabilityStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
