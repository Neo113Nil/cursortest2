package com.paypal.oslo.feature.wallet.api.analytics.fifo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "WALLET", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "POOLS", "QRC"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class TransferFlow {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow BALANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow POOLS;
    public static final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow QRC;
    public static final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow WALLET;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private TransferFlow(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow = new com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow("WALLET", 0, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET);
        WALLET = transferFlow;
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow2 = new com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 1, "balance");
        BALANCE = transferFlow2;
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow3 = new com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow("POOLS", 2, "pools");
        POOLS = transferFlow3;
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow4 = new com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow("QRC", 3, "qrc");
        QRC = transferFlow4;
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow[] transferFlowArr = {transferFlow, transferFlow2, transferFlow3, transferFlow4};
        $VALUES = transferFlowArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(transferFlowArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow", com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow[] values() {
        return (com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow> getEntries() {
        return $ENTRIES;
    }
}
