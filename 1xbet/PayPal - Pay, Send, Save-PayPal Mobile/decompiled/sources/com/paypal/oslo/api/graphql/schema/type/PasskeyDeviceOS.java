package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "IOS", "ANDROID", "WEB", "MACOS", "WINDOWS", "LINUX", "CHROMEOS", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasskeyDeviceOS {
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS ANDROID;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS CHROMEOS;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS IOS;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS LINUX;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS MACOS;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS WEB;
    public static final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS WINDOWS;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PasskeyDeviceOS(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("IOS", 0, "IOS");
        IOS = passkeyDeviceOS;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS2 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("ANDROID", 1, "ANDROID");
        ANDROID = passkeyDeviceOS2;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS3 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("WEB", 2, "WEB");
        WEB = passkeyDeviceOS3;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS4 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("MACOS", 3, "MACOS");
        MACOS = passkeyDeviceOS4;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS5 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("WINDOWS", 4, "WINDOWS");
        WINDOWS = passkeyDeviceOS5;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS6 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("LINUX", 5, "LINUX");
        LINUX = passkeyDeviceOS6;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS7 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("CHROMEOS", 6, "CHROMEOS");
        CHROMEOS = passkeyDeviceOS7;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS8 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("UNKNOWN", 7, "UNKNOWN");
        UNKNOWN = passkeyDeviceOS8;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS9 = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = passkeyDeviceOS9;
        com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[] passkeyDeviceOSArr = {passkeyDeviceOS, passkeyDeviceOS2, passkeyDeviceOS3, passkeyDeviceOS4, passkeyDeviceOS5, passkeyDeviceOS6, passkeyDeviceOS7, passkeyDeviceOS8, passkeyDeviceOS9};
        getHighResolutionOutputSizeshNQ4ISI = passkeyDeviceOSArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(passkeyDeviceOSArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PasskeyDeviceOS", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"IOS", "ANDROID", "WEB", "MACOS", "WINDOWS", "LINUX", "CHROMEOS", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PasskeyDeviceOS;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[]{com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.IOS, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.ANDROID, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.WEB, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.MACOS, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.WINDOWS, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.LINUX, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.CHROMEOS, com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS passkeyDeviceOS = (com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS) obj;
            return passkeyDeviceOS == null ? com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.UNKNOWN__ : passkeyDeviceOS;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PasskeyDeviceOS> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
