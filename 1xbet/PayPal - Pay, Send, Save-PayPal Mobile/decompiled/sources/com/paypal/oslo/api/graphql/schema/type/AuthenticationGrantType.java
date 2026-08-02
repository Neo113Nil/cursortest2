package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BIOMETRIC_DEVICE_AUTH", "BIOMETRIC_FACE_ID", "BIOMETRIC_FINGERPRINT", "ONE_TIME_PASSWORD", "PASSKEY", "PASSWORD", "TOKEN_EXCHANGE", "PUBLIC_CREDENTIAL", "SILENT_NETWORK_AUTH", "USER_PREVIEW", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationGrantType {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType BIOMETRIC_DEVICE_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType BIOMETRIC_FACE_ID;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType BIOMETRIC_FINGERPRINT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType ONE_TIME_PASSWORD;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType PASSKEY;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType PASSWORD;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType PUBLIC_CREDENTIAL;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType SILENT_NETWORK_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType TOKEN_EXCHANGE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType USER_PREVIEW;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AuthenticationGrantType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("BIOMETRIC_DEVICE_AUTH", 0, "BIOMETRIC_DEVICE_AUTH");
        BIOMETRIC_DEVICE_AUTH = authenticationGrantType;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType2 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("BIOMETRIC_FACE_ID", 1, "BIOMETRIC_FACE_ID");
        BIOMETRIC_FACE_ID = authenticationGrantType2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType3 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("BIOMETRIC_FINGERPRINT", 2, "BIOMETRIC_FINGERPRINT");
        BIOMETRIC_FINGERPRINT = authenticationGrantType3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType4 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("ONE_TIME_PASSWORD", 3, "ONE_TIME_PASSWORD");
        ONE_TIME_PASSWORD = authenticationGrantType4;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType5 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("PASSKEY", 4, "PASSKEY");
        PASSKEY = authenticationGrantType5;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType6 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("PASSWORD", 5, "PASSWORD");
        PASSWORD = authenticationGrantType6;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType7 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("TOKEN_EXCHANGE", 6, "TOKEN_EXCHANGE");
        TOKEN_EXCHANGE = authenticationGrantType7;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType8 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("PUBLIC_CREDENTIAL", 7, "PUBLIC_CREDENTIAL");
        PUBLIC_CREDENTIAL = authenticationGrantType8;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType9 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("SILENT_NETWORK_AUTH", 8, "SILENT_NETWORK_AUTH");
        SILENT_NETWORK_AUTH = authenticationGrantType9;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType10 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("USER_PREVIEW", 9, "USER_PREVIEW");
        USER_PREVIEW = authenticationGrantType10;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType11 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType("UNKNOWN__", 10, "UNKNOWN__");
        UNKNOWN__ = authenticationGrantType11;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[] authenticationGrantTypeArr = {authenticationGrantType, authenticationGrantType2, authenticationGrantType3, authenticationGrantType4, authenticationGrantType5, authenticationGrantType6, authenticationGrantType7, authenticationGrantType8, authenticationGrantType9, authenticationGrantType10, authenticationGrantType11};
        getHighSpeedVideoFpsRangesFor = authenticationGrantTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(authenticationGrantTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AuthenticationGrantType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BIOMETRIC_DEVICE_AUTH", "BIOMETRIC_FACE_ID", "BIOMETRIC_FINGERPRINT", "ONE_TIME_PASSWORD", "PASSKEY", "PASSWORD", "TOKEN_EXCHANGE", "PUBLIC_CREDENTIAL", "SILENT_NETWORK_AUTH", "USER_PREVIEW"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[]{com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.BIOMETRIC_DEVICE_AUTH, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.BIOMETRIC_FACE_ID, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.BIOMETRIC_FINGERPRINT, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.ONE_TIME_PASSWORD, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PASSKEY, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PASSWORD, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.TOKEN_EXCHANGE, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.PUBLIC_CREDENTIAL, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.SILENT_NETWORK_AUTH, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.USER_PREVIEW});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType = (com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType) obj;
            return authenticationGrantType == null ? com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.UNKNOWN__ : authenticationGrantType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
