package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "APP_CLIP", "LOGIN", "PASSIVE_LOGIN", "LINK_ACCOUNT", "SWITCH_ACCOUNT", "NATIVE_CHECKOUT", "NATIVE_WEB_CHECKOUT", "ONE_SHOT_CHECKOUT", "ONE_SHOT_WEB_CHECKOUT", "PASSWORD_RECOVERY", "THIRD_PARTY_CONNECT", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationIntent {
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent APP_CLIP;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent LINK_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent LOGIN;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent NATIVE_CHECKOUT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent NATIVE_WEB_CHECKOUT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent ONE_SHOT_CHECKOUT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent ONE_SHOT_WEB_CHECKOUT;

    @kotlin.Deprecated(message = "Passive login is no longer supported.")
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent PASSIVE_LOGIN;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent PASSWORD_RECOVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent SWITCH_ACCOUNT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent THIRD_PARTY_CONNECT;
    public static final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AuthenticationIntent(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("APP_CLIP", 0, "APP_CLIP");
        APP_CLIP = authenticationIntent;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent2 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("LOGIN", 1, "LOGIN");
        LOGIN = authenticationIntent2;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent3 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("PASSIVE_LOGIN", 2, "PASSIVE_LOGIN");
        PASSIVE_LOGIN = authenticationIntent3;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent4 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("LINK_ACCOUNT", 3, "LINK_ACCOUNT");
        LINK_ACCOUNT = authenticationIntent4;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent5 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("SWITCH_ACCOUNT", 4, "SWITCH_ACCOUNT");
        SWITCH_ACCOUNT = authenticationIntent5;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent6 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("NATIVE_CHECKOUT", 5, "NATIVE_CHECKOUT");
        NATIVE_CHECKOUT = authenticationIntent6;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent7 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("NATIVE_WEB_CHECKOUT", 6, "NATIVE_WEB_CHECKOUT");
        NATIVE_WEB_CHECKOUT = authenticationIntent7;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent8 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("ONE_SHOT_CHECKOUT", 7, "ONE_SHOT_CHECKOUT");
        ONE_SHOT_CHECKOUT = authenticationIntent8;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent9 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("ONE_SHOT_WEB_CHECKOUT", 8, "ONE_SHOT_WEB_CHECKOUT");
        ONE_SHOT_WEB_CHECKOUT = authenticationIntent9;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent10 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("PASSWORD_RECOVERY", 9, "PASSWORD_RECOVERY");
        PASSWORD_RECOVERY = authenticationIntent10;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent11 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("THIRD_PARTY_CONNECT", 10, "THIRD_PARTY_CONNECT");
        THIRD_PARTY_CONNECT = authenticationIntent11;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent12 = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent("UNKNOWN__", 11, "UNKNOWN__");
        UNKNOWN__ = authenticationIntent12;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[] authenticationIntentArr = {authenticationIntent, authenticationIntent2, authenticationIntent3, authenticationIntent4, authenticationIntent5, authenticationIntent6, authenticationIntent7, authenticationIntent8, authenticationIntent9, authenticationIntent10, authenticationIntent11, authenticationIntent12};
        getHighSpeedVideoSizes = authenticationIntentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(authenticationIntentArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AuthenticationIntent", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"APP_CLIP", "LOGIN", "PASSIVE_LOGIN", "LINK_ACCOUNT", "SWITCH_ACCOUNT", "NATIVE_CHECKOUT", "NATIVE_WEB_CHECKOUT", "ONE_SHOT_CHECKOUT", "ONE_SHOT_WEB_CHECKOUT", "PASSWORD_RECOVERY", "THIRD_PARTY_CONNECT"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationIntent;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "getKnownEntries$annotations", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKnownEntries$annotations() {
        }

        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[]{com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.APP_CLIP, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LOGIN, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.PASSIVE_LOGIN, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.LINK_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.SWITCH_ACCOUNT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.NATIVE_CHECKOUT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.NATIVE_WEB_CHECKOUT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.ONE_SHOT_CHECKOUT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.ONE_SHOT_WEB_CHECKOUT, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.PASSWORD_RECOVERY, com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.THIRD_PARTY_CONNECT});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent authenticationIntent = (com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent) obj;
            return authenticationIntent == null ? com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.UNKNOWN__ : authenticationIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AuthenticationIntent> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
