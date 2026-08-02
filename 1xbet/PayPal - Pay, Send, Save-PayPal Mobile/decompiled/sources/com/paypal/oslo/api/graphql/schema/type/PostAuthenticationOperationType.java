package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BIOMETRIC_DEVICE_AUTH_BIND", "BIOMETRIC_FACE_ID_BIND", "BIOMETRIC_FINGERPRINT_BIND", "CONFIRM_ANY_PHONE", "CONFIRM_EXISTING_PHONE", "PASSKEY_BIND", "MANDATORY_PHONE_CONFIRMATION", "USER_PREVIEW_BIND", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PostAuthenticationOperationType {
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType BIOMETRIC_DEVICE_AUTH_BIND;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType BIOMETRIC_FACE_ID_BIND;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType BIOMETRIC_FINGERPRINT_BIND;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType CONFIRM_ANY_PHONE;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType CONFIRM_EXISTING_PHONE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType MANDATORY_PHONE_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType PASSKEY_BIND;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType USER_PREVIEW_BIND;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PostAuthenticationOperationType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("BIOMETRIC_DEVICE_AUTH_BIND", 0, "BIOMETRIC_DEVICE_AUTH_BIND");
        BIOMETRIC_DEVICE_AUTH_BIND = postAuthenticationOperationType;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType2 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("BIOMETRIC_FACE_ID_BIND", 1, "BIOMETRIC_FACE_ID_BIND");
        BIOMETRIC_FACE_ID_BIND = postAuthenticationOperationType2;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType3 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("BIOMETRIC_FINGERPRINT_BIND", 2, "BIOMETRIC_FINGERPRINT_BIND");
        BIOMETRIC_FINGERPRINT_BIND = postAuthenticationOperationType3;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType4 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("CONFIRM_ANY_PHONE", 3, "CONFIRM_ANY_PHONE");
        CONFIRM_ANY_PHONE = postAuthenticationOperationType4;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType5 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("CONFIRM_EXISTING_PHONE", 4, "CONFIRM_EXISTING_PHONE");
        CONFIRM_EXISTING_PHONE = postAuthenticationOperationType5;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType6 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("PASSKEY_BIND", 5, "PASSKEY_BIND");
        PASSKEY_BIND = postAuthenticationOperationType6;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType7 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("MANDATORY_PHONE_CONFIRMATION", 6, "MANDATORY_PHONE_CONFIRMATION");
        MANDATORY_PHONE_CONFIRMATION = postAuthenticationOperationType7;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType8 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("USER_PREVIEW_BIND", 7, "USER_PREVIEW_BIND");
        USER_PREVIEW_BIND = postAuthenticationOperationType8;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType9 = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = postAuthenticationOperationType9;
        com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[] postAuthenticationOperationTypeArr = {postAuthenticationOperationType, postAuthenticationOperationType2, postAuthenticationOperationType3, postAuthenticationOperationType4, postAuthenticationOperationType5, postAuthenticationOperationType6, postAuthenticationOperationType7, postAuthenticationOperationType8, postAuthenticationOperationType9};
        getHighSpeedVideoFpsRanges = postAuthenticationOperationTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(postAuthenticationOperationTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PostAuthenticationOperationType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BIOMETRIC_DEVICE_AUTH_BIND", "BIOMETRIC_FACE_ID_BIND", "BIOMETRIC_FINGERPRINT_BIND", "CONFIRM_ANY_PHONE", "CONFIRM_EXISTING_PHONE", "PASSKEY_BIND", "MANDATORY_PHONE_CONFIRMATION", "USER_PREVIEW_BIND"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PostAuthenticationOperationType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[]{com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.BIOMETRIC_DEVICE_AUTH_BIND, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.BIOMETRIC_FACE_ID_BIND, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.BIOMETRIC_FINGERPRINT_BIND, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.CONFIRM_ANY_PHONE, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.CONFIRM_EXISTING_PHONE, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.PASSKEY_BIND, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.MANDATORY_PHONE_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.USER_PREVIEW_BIND});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType postAuthenticationOperationType = (com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType) obj;
            return postAuthenticationOperationType == null ? com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.UNKNOWN__ : postAuthenticationOperationType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PostAuthenticationOperationType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
