package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "INTERAPP_SINGLE_SIGN_ON", "WEB_SINGLE_SIGN_ON", "WEB_CHECKOUT_SINGLE_SIGN_ON", "CONNECT_SINGLE_SIGN_ON", "APP_CLIP_SINGLE_SIGN_ON", "XOOM_SINGLE_SIGN_ON", "ZETTLE_SINGLE_SIGN_ON", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessTokenExchangeIntent {
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent APP_CLIP_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent CONNECT_SINGLE_SIGN_ON;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent INTERAPP_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent WEB_CHECKOUT_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent WEB_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent XOOM_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent ZETTLE_SINGLE_SIGN_ON;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private AccessTokenExchangeIntent(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("INTERAPP_SINGLE_SIGN_ON", 0, "INTERAPP_SINGLE_SIGN_ON");
        INTERAPP_SINGLE_SIGN_ON = accessTokenExchangeIntent;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent2 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("WEB_SINGLE_SIGN_ON", 1, "WEB_SINGLE_SIGN_ON");
        WEB_SINGLE_SIGN_ON = accessTokenExchangeIntent2;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent3 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("WEB_CHECKOUT_SINGLE_SIGN_ON", 2, "WEB_CHECKOUT_SINGLE_SIGN_ON");
        WEB_CHECKOUT_SINGLE_SIGN_ON = accessTokenExchangeIntent3;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent4 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("CONNECT_SINGLE_SIGN_ON", 3, "CONNECT_SINGLE_SIGN_ON");
        CONNECT_SINGLE_SIGN_ON = accessTokenExchangeIntent4;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent5 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("APP_CLIP_SINGLE_SIGN_ON", 4, "APP_CLIP_SINGLE_SIGN_ON");
        APP_CLIP_SINGLE_SIGN_ON = accessTokenExchangeIntent5;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent6 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("XOOM_SINGLE_SIGN_ON", 5, "XOOM_SINGLE_SIGN_ON");
        XOOM_SINGLE_SIGN_ON = accessTokenExchangeIntent6;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent7 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("ZETTLE_SINGLE_SIGN_ON", 6, "ZETTLE_SINGLE_SIGN_ON");
        ZETTLE_SINGLE_SIGN_ON = accessTokenExchangeIntent7;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent8 = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent("UNKNOWN__", 7, "UNKNOWN__");
        UNKNOWN__ = accessTokenExchangeIntent8;
        com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[] accessTokenExchangeIntentArr = {accessTokenExchangeIntent, accessTokenExchangeIntent2, accessTokenExchangeIntent3, accessTokenExchangeIntent4, accessTokenExchangeIntent5, accessTokenExchangeIntent6, accessTokenExchangeIntent7, accessTokenExchangeIntent8};
        getHighSpeedVideoFpsRanges = accessTokenExchangeIntentArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(accessTokenExchangeIntentArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("AccessTokenExchangeIntent", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INTERAPP_SINGLE_SIGN_ON", "WEB_SINGLE_SIGN_ON", "WEB_CHECKOUT_SINGLE_SIGN_ON", "CONNECT_SINGLE_SIGN_ON", "APP_CLIP_SINGLE_SIGN_ON", "XOOM_SINGLE_SIGN_ON", "ZETTLE_SINGLE_SIGN_ON"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/AccessTokenExchangeIntent;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[]{com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.INTERAPP_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.WEB_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.WEB_CHECKOUT_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.CONNECT_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.APP_CLIP_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.XOOM_SINGLE_SIGN_ON, com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.ZETTLE_SINGLE_SIGN_ON});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent accessTokenExchangeIntent = (com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent) obj;
            return accessTokenExchangeIntent == null ? com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.UNKNOWN__ : accessTokenExchangeIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.AccessTokenExchangeIntent> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
