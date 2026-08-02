package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationPlatform;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "WEB", "APP", "SDK", "IN_APP_BROWSER", com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationPlatform {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform API;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform APP;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform IN_APP_BROWSER;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform SDK;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform WEB;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AuthenticationPlatform(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform("WEB", 0, "WEB");
        WEB = authenticationPlatform;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform2 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform("APP", 1, "APP");
        APP = authenticationPlatform2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform3 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform("SDK", 2, "SDK");
        SDK = authenticationPlatform3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform4 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform("IN_APP_BROWSER", 3, "IN_APP_BROWSER");
        IN_APP_BROWSER = authenticationPlatform4;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform5 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform(com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY, 4, com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY);
        API = authenticationPlatform5;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform6 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = authenticationPlatform6;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[] authenticationPlatformArr = {authenticationPlatform, authenticationPlatform2, authenticationPlatform3, authenticationPlatform4, authenticationPlatform5, authenticationPlatform6};
        getHighSpeedVideoSizes = authenticationPlatformArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(authenticationPlatformArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AuthenticationPlatform", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"WEB", "APP", "SDK", "IN_APP_BROWSER", com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationPlatform$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationPlatform;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationPlatform;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationPlatform;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[]{com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.WEB, com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.APP, com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.SDK, com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.IN_APP_BROWSER, com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.API});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform authenticationPlatform = (com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform) obj;
            return authenticationPlatform == null ? com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.UNKNOWN__ : authenticationPlatform;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AuthenticationPlatform> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
