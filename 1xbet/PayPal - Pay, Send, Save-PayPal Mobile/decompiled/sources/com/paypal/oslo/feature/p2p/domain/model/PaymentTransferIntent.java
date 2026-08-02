package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentTransferIntent {
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.Companion INSTANCE;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent REQUEST;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent SEND;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private PaymentTransferIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, 0);
        SEND = paymentTransferIntent;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, 1);
        REQUEST = paymentTransferIntent2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent3 = new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent("UNKNOWN", 2);
        UNKNOWN = paymentTransferIntent3;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent[] paymentTransferIntentArr = {paymentTransferIntent, paymentTransferIntent2, paymentTransferIntent3};
        Camera2StreamConfigurationMap = paymentTransferIntentArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(paymentTransferIntentArr);
        INSTANCE = new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent safeValueOf(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) obj;
            return paymentTransferIntent == null ? com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.UNKNOWN : paymentTransferIntent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
