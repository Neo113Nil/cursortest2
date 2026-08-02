package com.paypal.oslo.feature.wallet.api.analytics.addfi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "WALLET", "ONBOARDING", "AUTO_RELOAD", "SUBSCRIPTIONS", "BNPL_SERVICING", "BNPL_ACQUISITION", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "P2P", "QRC", "DEBIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class AddFIFlow {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow AUTO_RELOAD;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow BNPL_ACQUISITION;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow BNPL_SERVICING;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow CRYPTO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow DEBIT_CARD;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow ONBOARDING;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow P2P;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow QRC;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow SUBSCRIPTIONS;
    public static final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow WALLET;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AddFIFlow(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("WALLET", 0, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET);
        WALLET = addFIFlow;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow2 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("ONBOARDING", 1, com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT);
        ONBOARDING = addFIFlow2;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow3 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("AUTO_RELOAD", 2, "Auto Reload");
        AUTO_RELOAD = addFIFlow3;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow4 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("SUBSCRIPTIONS", 3, "subscriptions");
        SUBSCRIPTIONS = addFIFlow4;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow5 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("BNPL_SERVICING", 4, "BNPL Servicing");
        BNPL_SERVICING = addFIFlow5;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow6 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("BNPL_ACQUISITION", 5, "BNPL Acquisition");
        BNPL_ACQUISITION = addFIFlow6;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow7 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 6, "crypto");
        CRYPTO = addFIFlow7;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow8 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("P2P", 7, com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P);
        P2P = addFIFlow8;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow9 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("QRC", 8, "qrc");
        QRC = addFIFlow9;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow10 = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow("DEBIT_CARD", 9, "debit card");
        DEBIT_CARD = addFIFlow10;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow[] addFIFlowArr = {addFIFlow, addFIFlow2, addFIFlow3, addFIFlow4, addFIFlow5, addFIFlow6, addFIFlow7, addFIFlow8, addFIFlow9, addFIFlow10};
        $VALUES = addFIFlowArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(addFIFlowArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow", com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow[] values() {
        return (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow> getEntries() {
        return $ENTRIES;
    }
}
