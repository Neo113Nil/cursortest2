package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", "CLOSED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "NOT_CREATED", "REMOVED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus ACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus CLOSED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus INACTIVE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus NOT_CREATED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus ON_HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus REMOVED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0, com.payair.model.TokenStatusKt.TOKEN_ACTIVE);
        ACTIVE = bankAccountStatus;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("BLOCKED", 1, "BLOCKED");
        BLOCKED = bankAccountStatus2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("CLOSED", 2, "CLOSED");
        CLOSED = bankAccountStatus3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 3, com.payair.model.TokenStatusKt.TOKEN_INACTIVE);
        INACTIVE = bankAccountStatus4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("ON_HOLD", 4, "ON_HOLD");
        ON_HOLD = bankAccountStatus5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus6 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("NOT_CREATED", 5, "NOT_CREATED");
        NOT_CREATED = bankAccountStatus6;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus7 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("REMOVED", 6, "REMOVED");
        REMOVED = bankAccountStatus7;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus8 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("UNKNOWN", 7, "UNKNOWN");
        UNKNOWN = bankAccountStatus8;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus9 = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = bankAccountStatus9;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[] bankAccountStatusArr = {bankAccountStatus, bankAccountStatus2, bankAccountStatus3, bankAccountStatus4, bankAccountStatus5, bankAccountStatus6, bankAccountStatus7, bankAccountStatus8, bankAccountStatus9};
        Camera2StreamConfigurationMap = bankAccountStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "BLOCKED", "CLOSED", com.payair.model.TokenStatusKt.TOKEN_INACTIVE, "ON_HOLD", "NOT_CREATED", "REMOVED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[]{com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.ACTIVE, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.BLOCKED, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.CLOSED, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.INACTIVE, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.ON_HOLD, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.NOT_CREATED, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.REMOVED, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus = (com.paypal.oslo.api.graphql.schema.type.BankAccountStatus) obj;
            return bankAccountStatus == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.UNKNOWN__ : bankAccountStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
