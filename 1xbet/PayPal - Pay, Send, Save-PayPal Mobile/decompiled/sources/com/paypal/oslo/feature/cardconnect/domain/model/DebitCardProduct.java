package com.paypal.oslo.feature.cardconnect.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CONSUMER_DEBIT_CARD", "BUSINESS_DEBIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebitCardProduct {
    public static final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct CONSUMER_DEBIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.Companion INSTANCE;
    public static final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardProduct(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct = new com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct("CONSUMER_DEBIT_CARD", 0);
        CONSUMER_DEBIT_CARD = debitCardProduct;
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct2 = new com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct("BUSINESS_DEBIT_CARD", 1);
        BUSINESS_DEBIT_CARD = debitCardProduct2;
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct3 = new com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct("UNKNOWN", 2);
        UNKNOWN = debitCardProduct3;
        com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct[] debitCardProductArr = {debitCardProduct, debitCardProduct2, debitCardProduct3};
        Camera2StreamConfigurationMap = debitCardProductArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitCardProductArr);
        INSTANCE = new com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/domain/model/DebitCardProduct;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct fromValue(java.lang.String value) {
            java.lang.Object obj;
            if (value == null) {
                return com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.UNKNOWN;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct debitCardProduct = (com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct) obj;
            return debitCardProduct == null ? com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.UNKNOWN : debitCardProduct;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct[] values() {
        return (com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct) java.lang.Enum.valueOf(com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cardconnect.domain.model.DebitCardProduct> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
