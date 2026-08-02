package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "SUCCESS", "INVALID_CURRENT_PASSWORD", "CURRENT_NEW_PASSWORD_SAME", "NEW_CONFIRM_PASSWORD_DIFFERENT", "ERROR", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangePasswordResultStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus CURRENT_NEW_PASSWORD_SAME;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus ERROR;
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus INVALID_CURRENT_PASSWORD;
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus NEW_CONFIRM_PASSWORD_DIFFERENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus SUCCESS;
    public static final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ChangePasswordResultStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("SUCCESS", 0, "SUCCESS");
        SUCCESS = changePasswordResultStatus;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus2 = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("INVALID_CURRENT_PASSWORD", 1, "INVALID_CURRENT_PASSWORD");
        INVALID_CURRENT_PASSWORD = changePasswordResultStatus2;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus3 = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("CURRENT_NEW_PASSWORD_SAME", 2, "CURRENT_NEW_PASSWORD_SAME");
        CURRENT_NEW_PASSWORD_SAME = changePasswordResultStatus3;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus4 = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("NEW_CONFIRM_PASSWORD_DIFFERENT", 3, "NEW_CONFIRM_PASSWORD_DIFFERENT");
        NEW_CONFIRM_PASSWORD_DIFFERENT = changePasswordResultStatus4;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus5 = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("ERROR", 4, "ERROR");
        ERROR = changePasswordResultStatus5;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus6 = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = changePasswordResultStatus6;
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[] changePasswordResultStatusArr = {changePasswordResultStatus, changePasswordResultStatus2, changePasswordResultStatus3, changePasswordResultStatus4, changePasswordResultStatus5, changePasswordResultStatus6};
        getHighSpeedVideoSizes = changePasswordResultStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(changePasswordResultStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ChangePasswordResultStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"SUCCESS", "INVALID_CURRENT_PASSWORD", "CURRENT_NEW_PASSWORD_SAME", "NEW_CONFIRM_PASSWORD_DIFFERENT", "ERROR"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordResultStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[]{com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.SUCCESS, com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.INVALID_CURRENT_PASSWORD, com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.CURRENT_NEW_PASSWORD_SAME, com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.NEW_CONFIRM_PASSWORD_DIFFERENT, com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.ERROR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus changePasswordResultStatus = (com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus) obj;
            return changePasswordResultStatus == null ? com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.UNKNOWN__ : changePasswordResultStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ChangePasswordResultStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
