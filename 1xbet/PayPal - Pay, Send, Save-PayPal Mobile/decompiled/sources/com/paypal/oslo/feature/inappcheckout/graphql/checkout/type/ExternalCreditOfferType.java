package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCreditOfferType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "NI", "NO_INTEREST", "CORE", "INST", "INSTALLMENT", "AGGREGATED", "DYNAMIC_RATE_INSTALLMENTS", "DYNAMIC_RATE_INSTALLMENT", "PROMOTIONAL_APR", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalCreditOfferType {
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType AGGREGATED;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType CORE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType DYNAMIC_RATE_INSTALLMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType DYNAMIC_RATE_INSTALLMENTS;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType INST;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType INSTALLMENT;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType NI;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType NO_INTEREST;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType PROMOTIONAL_APR;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ExternalCreditOfferType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("NI", 0, "NI");
        NI = externalCreditOfferType;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType2 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("NO_INTEREST", 1, "NO_INTEREST");
        NO_INTEREST = externalCreditOfferType2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType3 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("CORE", 2, "CORE");
        CORE = externalCreditOfferType3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType4 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("INST", 3, "INST");
        INST = externalCreditOfferType4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType5 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("INSTALLMENT", 4, "INSTALLMENT");
        INSTALLMENT = externalCreditOfferType5;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType6 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("AGGREGATED", 5, "AGGREGATED");
        AGGREGATED = externalCreditOfferType6;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType7 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("DYNAMIC_RATE_INSTALLMENTS", 6, "DYNAMIC_RATE_INSTALLMENTS");
        DYNAMIC_RATE_INSTALLMENTS = externalCreditOfferType7;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType8 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("DYNAMIC_RATE_INSTALLMENT", 7, "DYNAMIC_RATE_INSTALLMENT");
        DYNAMIC_RATE_INSTALLMENT = externalCreditOfferType8;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType9 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("PROMOTIONAL_APR", 8, "PROMOTIONAL_APR");
        PROMOTIONAL_APR = externalCreditOfferType9;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType10 = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = externalCreditOfferType10;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[] externalCreditOfferTypeArr = {externalCreditOfferType, externalCreditOfferType2, externalCreditOfferType3, externalCreditOfferType4, externalCreditOfferType5, externalCreditOfferType6, externalCreditOfferType7, externalCreditOfferType8, externalCreditOfferType9, externalCreditOfferType10};
        getHighSpeedVideoFpsRangesFor = externalCreditOfferTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(externalCreditOfferTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("externalCreditOfferType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"NI", "NO_INTEREST", "CORE", "INST", "INSTALLMENT", "AGGREGATED", "DYNAMIC_RATE_INSTALLMENTS", "DYNAMIC_RATE_INSTALLMENT", "PROMOTIONAL_APR"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCreditOfferType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCreditOfferType;", "knownValues", "()[Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCreditOfferType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalCreditOfferType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.type;
        }

        public final java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[]{com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.NI, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.NO_INTEREST, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.CORE, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.INST, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.INSTALLMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.AGGREGATED, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.DYNAMIC_RATE_INSTALLMENTS, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.DYNAMIC_RATE_INSTALLMENT, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.PROMOTIONAL_APR});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[] knownValues() {
            return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[]) getKnownEntries().toArray(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[0]);
        }

        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType) obj;
            return externalCreditOfferType == null ? com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.UNKNOWN__ : externalCreditOfferType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
