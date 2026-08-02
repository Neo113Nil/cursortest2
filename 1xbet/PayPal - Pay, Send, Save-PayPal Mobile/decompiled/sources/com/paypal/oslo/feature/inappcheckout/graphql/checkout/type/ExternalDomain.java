package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "FUNDING_SELECTION", "PROFILE", "OFFERS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "MERCHANT_INTEGRATION_CONTEXT", "ORDER_PAYMENT_SUMMARY", "SHIPPING_METHOD", "SHIPPING_ADDRESS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalDomain {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain FUNDING_SELECTION;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain MERCHANT_INTEGRATION_CONTEXT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain OFFERS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain ORDER;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain ORDER_PAYMENT_SUMMARY;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain PROFILE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain SHIPPING_ADDRESS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain SHIPPING_METHOD;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalDomain(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("FUNDING_SELECTION", 0, "FUNDING_SELECTION");
        FUNDING_SELECTION = externalDomain;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("PROFILE", 1, "PROFILE");
        PROFILE = externalDomain2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("OFFERS", 2, "OFFERS");
        OFFERS = externalDomain3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, 3, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER);
        ORDER = externalDomain4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("MERCHANT_INTEGRATION_CONTEXT", 4, "MERCHANT_INTEGRATION_CONTEXT");
        MERCHANT_INTEGRATION_CONTEXT = externalDomain5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("ORDER_PAYMENT_SUMMARY", 5, "ORDER_PAYMENT_SUMMARY");
        ORDER_PAYMENT_SUMMARY = externalDomain6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("SHIPPING_METHOD", 6, "SHIPPING_METHOD");
        SHIPPING_METHOD = externalDomain7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("SHIPPING_ADDRESS", 7, "SHIPPING_ADDRESS");
        SHIPPING_ADDRESS = externalDomain8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = externalDomain9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[] externalDomainArr = {externalDomain, externalDomain2, externalDomain3, externalDomain4, externalDomain5, externalDomain6, externalDomain7, externalDomain8, externalDomain9};
        getHighSpeedVideoFpsRanges = externalDomainArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(externalDomainArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalDomain", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"FUNDING_SELECTION", "PROFILE", "OFFERS", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "MERCHANT_INTEGRATION_CONTEXT", "ORDER_PAYMENT_SUMMARY", "SHIPPING_METHOD", "SHIPPING_ADDRESS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalDomain;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.FUNDING_SELECTION, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.PROFILE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.OFFERS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.ORDER, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.MERCHANT_INTEGRATION_CONTEXT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.ORDER_PAYMENT_SUMMARY, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.SHIPPING_METHOD, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.SHIPPING_ADDRESS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain) obj;
            return externalDomain == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.UNKNOWN__ : externalDomain;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
