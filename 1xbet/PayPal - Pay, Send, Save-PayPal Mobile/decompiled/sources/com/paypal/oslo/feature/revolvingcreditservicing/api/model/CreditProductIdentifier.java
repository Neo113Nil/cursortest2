package com.paypal.oslo.feature.revolvingcreditservicing.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US", "PAYPAL_CREDIT_CARD_US", "PP_UK_PPC", "PPC_US_V2", "SYF_US_EBAYMC", "SYF_US_PPMC", "SYF_US_SMTCNCT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class CreditProductIdentifier {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier PAYPAL_CREDIT_CARD_US;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier PPC_US_V2;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier PP_UK_PPC;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier SYF_US_EBAYMC;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier SYF_US_PPMC;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier SYF_US_SMTCNCT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier UNKNOWN;
    private final java.lang.String rawValue;

    private CreditProductIdentifier(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US", 0, "CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US");
        CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US = creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("PAYPAL_CREDIT_CARD_US", 1, "PAYPAL_CREDIT_CARD_US");
        PAYPAL_CREDIT_CARD_US = creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("PP_UK_PPC", 2, "PP_UK_PPC");
        PP_UK_PPC = creditProductIdentifier3;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("PPC_US_V2", 3, "PPC_US_V2");
        PPC_US_V2 = creditProductIdentifier4;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("SYF_US_EBAYMC", 4, "SYF_US_EBAYMC");
        SYF_US_EBAYMC = creditProductIdentifier5;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("SYF_US_PPMC", 5, "SYF_US_PPMC");
        SYF_US_PPMC = creditProductIdentifier6;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("SYF_US_SMTCNCT", 6, "SYF_US_SMTCNCT");
        SYF_US_SMTCNCT = creditProductIdentifier7;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8 = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier("UNKNOWN", 7, "UNKNOWN");
        UNKNOWN = creditProductIdentifier8;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier[] creditProductIdentifierArr = {creditProductIdentifier, creditProductIdentifier2, creditProductIdentifier3, creditProductIdentifier4, creditProductIdentifier5, creditProductIdentifier6, creditProductIdentifier7, creditProductIdentifier8};
        $VALUES = creditProductIdentifierArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(creditProductIdentifierArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createSimpleEnumSerializer;
                createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values());
                return createSimpleEnumSerializer;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier fromString(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) obj).getRawValue(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) obj;
            return creditProductIdentifier == null ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : creditProductIdentifier;
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> getEntries() {
        return $ENTRIES;
    }
}
