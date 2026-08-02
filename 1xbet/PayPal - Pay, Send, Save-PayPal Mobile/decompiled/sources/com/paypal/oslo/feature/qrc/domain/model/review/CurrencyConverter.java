package com.paypal.oslo.feature.qrc.domain.model.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "PAYPAL", "ISSUER"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class CurrencyConverter {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter ISSUER;
    public static final com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter PAYPAL;
    private final java.lang.String rawValue;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/CurrencyConverter;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CurrencyConverter(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter = new com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter("PAYPAL", 0, "PayPal");
        PAYPAL = currencyConverter;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter currencyConverter2 = new com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter("ISSUER", 1, "Card Issuer");
        ISSUER = currencyConverter2;
        com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter[] currencyConverterArr = {currencyConverter, currencyConverter2};
        $VALUES = currencyConverterArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(currencyConverterArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter", com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.review.CurrencyConverter> getEntries() {
        return $ENTRIES;
    }
}
