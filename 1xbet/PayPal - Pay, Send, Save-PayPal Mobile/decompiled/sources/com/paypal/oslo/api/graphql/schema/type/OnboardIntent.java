package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, "ACCOUNT_CREATION", "ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_SHARED_AUTH", "ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_META_P2P", "ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_PAYMENT_LINKS", "ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE", "BANKING_BUNDLE", "SAVINGS", "ADD_FUNDS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardIntent {
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_META_P2P;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_PAYMENT_LINKS;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_SHARED_AUTH;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent ADD_FUNDS;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent BANKING_BUNDLE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent CRYPTO;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent CRYPTO_PRO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent SAVINGS;
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardIntent UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardIntent[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private OnboardIntent(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 0, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = onboardIntent;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent2 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, 1, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO);
        CRYPTO_PRO = onboardIntent2;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent3 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION", 2, "ACCOUNT_CREATION");
        ACCOUNT_CREATION = onboardIntent3;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent4 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE", 3, "ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE");
        ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE = onboardIntent4;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent5 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_SHARED_AUTH", 4, "ACCOUNT_CREATION_SHARED_AUTH");
        ACCOUNT_CREATION_SHARED_AUTH = onboardIntent5;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent6 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE", 5, "ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE");
        ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE = onboardIntent6;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent7 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_META_P2P", 6, "ACCOUNT_CREATION_META_P2P");
        ACCOUNT_CREATION_META_P2P = onboardIntent7;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent8 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE", 7, "ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE");
        ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE = onboardIntent8;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent9 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_PAYMENT_LINKS", 8, "ACCOUNT_CREATION_PAYMENT_LINKS");
        ACCOUNT_CREATION_PAYMENT_LINKS = onboardIntent9;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent10 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE", 9, "ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE");
        ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE = onboardIntent10;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent11 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("BANKING_BUNDLE", 10, "BANKING_BUNDLE");
        BANKING_BUNDLE = onboardIntent11;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent12 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("SAVINGS", 11, "SAVINGS");
        SAVINGS = onboardIntent12;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent13 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("ADD_FUNDS", 12, "ADD_FUNDS");
        ADD_FUNDS = onboardIntent13;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent14 = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = onboardIntent14;
        com.paypal.oslo.api.graphql.schema.type.OnboardIntent[] onboardIntentArr = {onboardIntent, onboardIntent2, onboardIntent3, onboardIntent4, onboardIntent5, onboardIntent6, onboardIntent7, onboardIntent8, onboardIntent9, onboardIntent10, onboardIntent11, onboardIntent12, onboardIntent13, onboardIntent14};
        getHighSpeedVideoFpsRangesFor = onboardIntentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(onboardIntentArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.OnboardIntent.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("OnboardIntent", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, "ACCOUNT_CREATION", "ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_SHARED_AUTH", "ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_META_P2P", "ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE", "ACCOUNT_CREATION_PAYMENT_LINKS", "ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE", "BANKING_BUNDLE", "SAVINGS", "ADD_FUNDS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardIntent;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.OnboardIntent.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.OnboardIntent> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.OnboardIntent[]{com.paypal.oslo.api.graphql.schema.type.OnboardIntent.CRYPTO, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.CRYPTO_PRO, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_SIGNUP_WITH_GOOGLE, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_SHARED_AUTH, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_SHARED_AUTH_SIGNUP_WITH_GOOGLE, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_META_P2P, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_META_P2P_SIGNUP_WITH_GOOGLE, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_PAYMENT_LINKS, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ACCOUNT_CREATION_PAYMENT_LINKS_SIGNUP_WITH_GOOGLE, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.BANKING_BUNDLE, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.SAVINGS, com.paypal.oslo.api.graphql.schema.type.OnboardIntent.ADD_FUNDS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.OnboardIntent[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.OnboardIntent[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.OnboardIntent[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.OnboardIntent safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.OnboardIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.OnboardIntent) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.OnboardIntent onboardIntent = (com.paypal.oslo.api.graphql.schema.type.OnboardIntent) obj;
            return onboardIntent == null ? com.paypal.oslo.api.graphql.schema.type.OnboardIntent.UNKNOWN__ : onboardIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.OnboardIntent[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.OnboardIntent[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.OnboardIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.OnboardIntent) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.OnboardIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.OnboardIntent> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
