package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UNIFIED_ONBOARDING", "UNIFIED_RETURNING", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, "CRYPTO_REEVALUATE", "CRYPTO_PRO_REEVALUATION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyCapabilityIntent {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent CRYPTO;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent CRYPTO_PRO;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent CRYPTO_PRO_REEVALUATION;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent CRYPTO_REEVALUATE;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent UNIFIED_ONBOARDING;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent UNIFIED_RETURNING;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyCapabilityIntent(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent("UNIFIED_ONBOARDING", 0, "UNIFIED_ONBOARDING");
        UNIFIED_ONBOARDING = cryptocurrencyCapabilityIntent;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent("UNIFIED_RETURNING", 1, "UNIFIED_RETURNING");
        UNIFIED_RETURNING = cryptocurrencyCapabilityIntent2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 2, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO);
        CRYPTO = cryptocurrencyCapabilityIntent3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, 3, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO);
        CRYPTO_PRO = cryptocurrencyCapabilityIntent4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent("CRYPTO_REEVALUATE", 4, "CRYPTO_REEVALUATE");
        CRYPTO_REEVALUATE = cryptocurrencyCapabilityIntent5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent("CRYPTO_PRO_REEVALUATION", 5, "CRYPTO_PRO_REEVALUATION");
        CRYPTO_PRO_REEVALUATION = cryptocurrencyCapabilityIntent6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyCapabilityIntent7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[] cryptocurrencyCapabilityIntentArr = {cryptocurrencyCapabilityIntent, cryptocurrencyCapabilityIntent2, cryptocurrencyCapabilityIntent3, cryptocurrencyCapabilityIntent4, cryptocurrencyCapabilityIntent5, cryptocurrencyCapabilityIntent6, cryptocurrencyCapabilityIntent7};
        Camera2StreamConfigurationMap = cryptocurrencyCapabilityIntentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyCapabilityIntentArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyCapabilityIntent", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UNIFIED_ONBOARDING", "UNIFIED_RETURNING", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO, "CRYPTO_REEVALUATE", "CRYPTO_PRO_REEVALUATION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.UNIFIED_ONBOARDING, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.UNIFIED_RETURNING, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.CRYPTO, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.CRYPTO_PRO, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.CRYPTO_REEVALUATE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.CRYPTO_PRO_REEVALUATION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent) obj;
            return cryptocurrencyCapabilityIntent == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.UNKNOWN__ : cryptocurrencyCapabilityIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
