package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentProcessor;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "XOOM", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentProcessor {
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor PAYPAL;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor UNKNOWN;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor XOOM;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private PaymentProcessor(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor paymentProcessor = new com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor("PAYPAL", 0);
        PAYPAL = paymentProcessor;
        com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor paymentProcessor2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor("XOOM", 1);
        XOOM = paymentProcessor2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor paymentProcessor3 = new com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor("UNKNOWN", 2);
        UNKNOWN = paymentProcessor3;
        com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor[] paymentProcessorArr = {paymentProcessor, paymentProcessor2, paymentProcessor3};
        Camera2StreamConfigurationMap = paymentProcessorArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(paymentProcessorArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PaymentProcessor> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
