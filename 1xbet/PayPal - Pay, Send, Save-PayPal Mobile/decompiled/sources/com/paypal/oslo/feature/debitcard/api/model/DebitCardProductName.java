package com.paypal.oslo.feature.debitcard.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "CONSUMER_DEBIT_CARD", "BUSINESS_DEBIT_CARD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class DebitCardProductName {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    private static final java.util.Map<java.lang.String, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName> ALIASES;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName BUSINESS_DEBIT_CARD;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName CONSUMER_DEBIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName UNKNOWN;

    private DebitCardProductName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName("CONSUMER_DEBIT_CARD", 0);
        CONSUMER_DEBIT_CARD = debitCardProductName;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName("BUSINESS_DEBIT_CARD", 1);
        BUSINESS_DEBIT_CARD = debitCardProductName2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName3 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName("UNKNOWN", 2);
        UNKNOWN = debitCardProductName3;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName[] debitCardProductNameArr = {debitCardProductName, debitCardProductName2, debitCardProductName3};
        $VALUES = debitCardProductNameArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(debitCardProductNameArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.Companion(null);
        ALIASES = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("ConsumerDebitCard", debitCardProductName), kotlin.TuplesKt.to("BusinessDebitCard", debitCardProductName2));
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName", com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "ALIASES", "Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) obj;
            if (debitCardProductName != null) {
                return debitCardProductName;
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.ALIASES.get(value);
            return debitCardProductName2 == null ? com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN : debitCardProductName2;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName[] values() {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName> getEntries() {
        return $ENTRIES;
    }
}
