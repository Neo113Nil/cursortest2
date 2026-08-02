package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BIOMETRIC_FINGERPRINT", "BIOMETRIC_FACEID", "BIOMETRIC_DEVICEAUTH", "USER_PREVIEW", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceBindAuthenticationMethod {
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod BIOMETRIC_DEVICEAUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod BIOMETRIC_FACEID;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod BIOMETRIC_FINGERPRINT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod USER_PREVIEW;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DeviceBindAuthenticationMethod(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod("BIOMETRIC_FINGERPRINT", 0, "BIOMETRIC_FINGERPRINT");
        BIOMETRIC_FINGERPRINT = deviceBindAuthenticationMethod;
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod2 = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod("BIOMETRIC_FACEID", 1, "BIOMETRIC_FACEID");
        BIOMETRIC_FACEID = deviceBindAuthenticationMethod2;
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod3 = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod("BIOMETRIC_DEVICEAUTH", 2, "BIOMETRIC_DEVICEAUTH");
        BIOMETRIC_DEVICEAUTH = deviceBindAuthenticationMethod3;
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod4 = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod("USER_PREVIEW", 3, "USER_PREVIEW");
        USER_PREVIEW = deviceBindAuthenticationMethod4;
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod5 = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod("UNKNOWN__", 4, "UNKNOWN__");
        UNKNOWN__ = deviceBindAuthenticationMethod5;
        com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[] deviceBindAuthenticationMethodArr = {deviceBindAuthenticationMethod, deviceBindAuthenticationMethod2, deviceBindAuthenticationMethod3, deviceBindAuthenticationMethod4, deviceBindAuthenticationMethod5};
        getHighResolutionOutputSizeshNQ4ISI = deviceBindAuthenticationMethodArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(deviceBindAuthenticationMethodArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DeviceBindAuthenticationMethod", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BIOMETRIC_FINGERPRINT", "BIOMETRIC_FACEID", "BIOMETRIC_DEVICEAUTH", "USER_PREVIEW"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceBindAuthenticationMethod;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[]{com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.BIOMETRIC_FINGERPRINT, com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.BIOMETRIC_FACEID, com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.BIOMETRIC_DEVICEAUTH, com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.USER_PREVIEW});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod deviceBindAuthenticationMethod = (com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod) obj;
            return deviceBindAuthenticationMethod == null ? com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.UNKNOWN__ : deviceBindAuthenticationMethod;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DeviceBindAuthenticationMethod> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
