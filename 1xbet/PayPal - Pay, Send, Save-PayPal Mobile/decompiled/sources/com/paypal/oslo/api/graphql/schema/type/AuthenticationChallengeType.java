package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BIOMETRIC", "ONE_TIME_PASSWORD", "ONE_TIME_PASSWORD_GENERATE_CODE", "PASSKEY_REQUEST_OPTION", "PASSKEY", "PASSWORD", "USER_PREVIEW", "SWITCH_PROFILE", "VERIFY_CREDENTIAL", "NOTIFY_STEP_UP", "VALIDATE_STEP_UP", "CHANGE_PASSWORD", "SKIP_CHANGE_PASSWORD_AND_LOGIN", "PASSWORD_RECOVERY", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationChallengeType {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType BIOMETRIC;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType CHANGE_PASSWORD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType NOTIFY_STEP_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType ONE_TIME_PASSWORD;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType ONE_TIME_PASSWORD_GENERATE_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType PASSKEY;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType PASSKEY_REQUEST_OPTION;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType PASSWORD;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType PASSWORD_RECOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType SKIP_CHANGE_PASSWORD_AND_LOGIN;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType SWITCH_PROFILE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType USER_PREVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType VALIDATE_STEP_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType VERIFY_CREDENTIAL;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AuthenticationChallengeType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("BIOMETRIC", 0, "BIOMETRIC");
        BIOMETRIC = authenticationChallengeType;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType2 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("ONE_TIME_PASSWORD", 1, "ONE_TIME_PASSWORD");
        ONE_TIME_PASSWORD = authenticationChallengeType2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType3 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("ONE_TIME_PASSWORD_GENERATE_CODE", 2, "ONE_TIME_PASSWORD_GENERATE_CODE");
        ONE_TIME_PASSWORD_GENERATE_CODE = authenticationChallengeType3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType4 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("PASSKEY_REQUEST_OPTION", 3, "PASSKEY_REQUEST_OPTION");
        PASSKEY_REQUEST_OPTION = authenticationChallengeType4;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType5 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("PASSKEY", 4, "PASSKEY");
        PASSKEY = authenticationChallengeType5;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType6 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("PASSWORD", 5, "PASSWORD");
        PASSWORD = authenticationChallengeType6;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType7 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("USER_PREVIEW", 6, "USER_PREVIEW");
        USER_PREVIEW = authenticationChallengeType7;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType8 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("SWITCH_PROFILE", 7, "SWITCH_PROFILE");
        SWITCH_PROFILE = authenticationChallengeType8;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType9 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("VERIFY_CREDENTIAL", 8, "VERIFY_CREDENTIAL");
        VERIFY_CREDENTIAL = authenticationChallengeType9;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType10 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("NOTIFY_STEP_UP", 9, "NOTIFY_STEP_UP");
        NOTIFY_STEP_UP = authenticationChallengeType10;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType11 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("VALIDATE_STEP_UP", 10, "VALIDATE_STEP_UP");
        VALIDATE_STEP_UP = authenticationChallengeType11;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType12 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("CHANGE_PASSWORD", 11, "CHANGE_PASSWORD");
        CHANGE_PASSWORD = authenticationChallengeType12;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType13 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("SKIP_CHANGE_PASSWORD_AND_LOGIN", 12, "SKIP_CHANGE_PASSWORD_AND_LOGIN");
        SKIP_CHANGE_PASSWORD_AND_LOGIN = authenticationChallengeType13;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType14 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("PASSWORD_RECOVERY", 13, "PASSWORD_RECOVERY");
        PASSWORD_RECOVERY = authenticationChallengeType14;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType15 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType("UNKNOWN__", 14, "UNKNOWN__");
        UNKNOWN__ = authenticationChallengeType15;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[] authenticationChallengeTypeArr = {authenticationChallengeType, authenticationChallengeType2, authenticationChallengeType3, authenticationChallengeType4, authenticationChallengeType5, authenticationChallengeType6, authenticationChallengeType7, authenticationChallengeType8, authenticationChallengeType9, authenticationChallengeType10, authenticationChallengeType11, authenticationChallengeType12, authenticationChallengeType13, authenticationChallengeType14, authenticationChallengeType15};
        getHighSpeedVideoFpsRangesFor = authenticationChallengeTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(authenticationChallengeTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AuthenticationChallengeType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BIOMETRIC", "ONE_TIME_PASSWORD", "ONE_TIME_PASSWORD_GENERATE_CODE", "PASSKEY_REQUEST_OPTION", "PASSKEY", "PASSWORD", "USER_PREVIEW", "SWITCH_PROFILE", "VERIFY_CREDENTIAL", "NOTIFY_STEP_UP", "VALIDATE_STEP_UP", "CHANGE_PASSWORD", "SKIP_CHANGE_PASSWORD_AND_LOGIN", "PASSWORD_RECOVERY"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[]{com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.BIOMETRIC, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.ONE_TIME_PASSWORD, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.ONE_TIME_PASSWORD_GENERATE_CODE, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY_REQUEST_OPTION, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.USER_PREVIEW, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.SWITCH_PROFILE, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VERIFY_CREDENTIAL, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.NOTIFY_STEP_UP, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VALIDATE_STEP_UP, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.CHANGE_PASSWORD, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.SKIP_CHANGE_PASSWORD_AND_LOGIN, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD_RECOVERY});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType authenticationChallengeType = (com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType) obj;
            return authenticationChallengeType == null ? com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.UNKNOWN__ : authenticationChallengeType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
