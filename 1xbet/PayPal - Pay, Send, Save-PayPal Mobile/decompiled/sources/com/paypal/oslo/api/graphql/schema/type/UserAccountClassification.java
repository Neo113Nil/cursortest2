package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UserAccountClassification;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BUSINESS", "BUSINESS_MERCHANT", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "PERSONAL_CONSUMER", "PREMIER", "PREMIUM_ELITE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAccountClassification {
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification BUSINESS;

    @kotlin.Deprecated(message = "Use BUSINESS instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification BUSINESS_MERCHANT;
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification CONSUMER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.Companion INSTANCE;

    @kotlin.Deprecated(message = "Use CONSUMER instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification PERSONAL_CONSUMER;
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification PREMIER;

    @kotlin.Deprecated(message = "Use PREMIER instead.")
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification PREMIUM_ELITE;
    public static final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private UserAccountClassification(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("BUSINESS", 0, "BUSINESS");
        BUSINESS = userAccountClassification;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification2 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("BUSINESS_MERCHANT", 1, "BUSINESS_MERCHANT");
        BUSINESS_MERCHANT = userAccountClassification2;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification3 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, 2, com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER);
        CONSUMER = userAccountClassification3;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification4 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("PERSONAL_CONSUMER", 3, "PERSONAL_CONSUMER");
        PERSONAL_CONSUMER = userAccountClassification4;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification5 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("PREMIER", 4, "PREMIER");
        PREMIER = userAccountClassification5;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification6 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("PREMIUM_ELITE", 5, "PREMIUM_ELITE");
        PREMIUM_ELITE = userAccountClassification6;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification7 = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = userAccountClassification7;
        com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[] userAccountClassificationArr = {userAccountClassification, userAccountClassification2, userAccountClassification3, userAccountClassification4, userAccountClassification5, userAccountClassification6, userAccountClassification7};
        getHighResolutionOutputSizeshNQ4ISI = userAccountClassificationArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(userAccountClassificationArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("UserAccountClassification", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BUSINESS", "BUSINESS_MERCHANT", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "PERSONAL_CONSUMER", "PREMIER", "PREMIUM_ELITE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UserAccountClassification$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/UserAccountClassification;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/UserAccountClassification;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/UserAccountClassification;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "getKnownEntries$annotations", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKnownEntries$annotations() {
        }

        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.UserAccountClassification> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[]{com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.BUSINESS, com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.BUSINESS_MERCHANT, com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.CONSUMER, com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.PERSONAL_CONSUMER, com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.PREMIER, com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.PREMIUM_ELITE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.UserAccountClassification safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.UserAccountClassification) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.UserAccountClassification userAccountClassification = (com.paypal.oslo.api.graphql.schema.type.UserAccountClassification) obj;
            return userAccountClassification == null ? com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.UNKNOWN__ : userAccountClassification;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.UserAccountClassification[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.UserAccountClassification valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.UserAccountClassification) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.UserAccountClassification.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.UserAccountClassification> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
