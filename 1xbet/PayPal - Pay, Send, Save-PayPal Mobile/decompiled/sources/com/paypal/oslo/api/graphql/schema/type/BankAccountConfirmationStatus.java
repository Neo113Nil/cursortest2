package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BLOCKED", "CONFIRMED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "NOT_SUPPORTED", "UNCONFIRMED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BankAccountConfirmationStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus BLOCKED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus CONFIRMED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus FAILED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus NOT_APPLICABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus NOT_SUPPORTED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus UNCONFIRMED;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BankAccountConfirmationStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("BLOCKED", 0, "BLOCKED");
        BLOCKED = bankAccountConfirmationStatus;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus2 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("CONFIRMED", 1, "CONFIRMED");
        CONFIRMED = bankAccountConfirmationStatus2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus3 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, 2, com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED);
        FAILED = bankAccountConfirmationStatus3;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus4 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("NOT_APPLICABLE", 3, "NOT_APPLICABLE");
        NOT_APPLICABLE = bankAccountConfirmationStatus4;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus5 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("NOT_SUPPORTED", 4, "NOT_SUPPORTED");
        NOT_SUPPORTED = bankAccountConfirmationStatus5;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus6 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("UNCONFIRMED", 5, "UNCONFIRMED");
        UNCONFIRMED = bankAccountConfirmationStatus6;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus7 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("UNKNOWN", 6, "UNKNOWN");
        UNKNOWN = bankAccountConfirmationStatus7;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus8 = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = bankAccountConfirmationStatus8;
        com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[] bankAccountConfirmationStatusArr = {bankAccountConfirmationStatus, bankAccountConfirmationStatus2, bankAccountConfirmationStatus3, bankAccountConfirmationStatus4, bankAccountConfirmationStatus5, bankAccountConfirmationStatus6, bankAccountConfirmationStatus7, bankAccountConfirmationStatus8};
        getHighSpeedVideoFpsRangesFor = bankAccountConfirmationStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountConfirmationStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BankAccountConfirmationStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BLOCKED", "CONFIRMED", com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, "NOT_APPLICABLE", "NOT_SUPPORTED", "UNCONFIRMED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[]{com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.BLOCKED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.CONFIRMED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.NOT_APPLICABLE, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.NOT_SUPPORTED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.UNCONFIRMED, com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus = (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus) obj;
            return bankAccountConfirmationStatus == null ? com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.UNKNOWN__ : bankAccountConfirmationStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
